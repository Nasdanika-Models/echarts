package org.nasdanika.models.echarts.generator.tests;

import java.io.File;
import java.io.IOException;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleDescriptor.Requires;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Map.Entry;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.DiagramGenerator;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NasdanikaException;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.Transformer;
import org.nasdanika.diagramgenerator.plantuml.PlantUMLDiagramGenerator;
import org.nasdanika.graph.Connection;
import org.nasdanika.graph.Element;
import org.nasdanika.graph.emf.EObjectNode;
import org.nasdanika.graph.processor.NopEndpointProcessorConfigFactory;
import org.nasdanika.graph.processor.ProcessorConfig;
import org.nasdanika.graph.processor.ProcessorInfo;
import org.nasdanika.graph.processor.emf.EObjectNodeProcessorReflectiveFactory;
import org.nasdanika.html.model.app.Action;
import org.nasdanika.html.model.app.Label;
import org.nasdanika.html.model.app.Link;
import org.nasdanika.html.model.app.gen.ActionSiteGenerator;
import org.nasdanika.html.model.app.graph.WidgetFactory;
import org.nasdanika.html.model.app.graph.emf.EObjectReflectiveProcessorFactoryProvider;
import org.nasdanika.models.echarts.graph.Graph;
import org.nasdanika.models.echarts.graph.GraphFactory;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Node;
import org.nasdanika.models.echarts.graph.processors.EcoreGenEchartsGraphProcessorsFactory;
import org.nasdanika.models.ecore.graph.EcoreGraphFactory;
import org.nasdanika.models.ecore.graph.processors.EcoreNodeProcessorFactory;

/**
 * Tests Ecore -> Graph -> Processor -> actions generation
 * @author Pavel
 *
 */
public class TestEchartsModelDocGen {
	
	@Test
	public void testGenerateTogafModelDoc() throws IOException, DiagnosticException {
		List<EPackage> ePackages = Arrays.asList(EcorePackage.eINSTANCE, GraphPackage.eINSTANCE);
		ProgressMonitor progressMonitor = new NullProgressMonitor(); // new PrintStreamProgressMonitor();
		Transformer<EObject,Element> graphFactory = new Transformer<>(new EcoreGraphFactory());
		Map<EObject, Element> graph = graphFactory.transform(ePackages, false, progressMonitor);

		NopEndpointProcessorConfigFactory<WidgetFactory> configFactory = new NopEndpointProcessorConfigFactory<>() {
			
			@Override
			protected boolean isPassThrough(Connection connection) {
				return false;
			}
			
		};
		
		Transformer<Element,ProcessorConfig> processorConfigTransformer = new Transformer<>(configFactory);				
		Map<Element, ProcessorConfig> configs = processorConfigTransformer.transform(graph.values(), false, progressMonitor);
		
		MutableContext context = Context.EMPTY_CONTEXT.fork();
		context.register(DiagramGenerator.class, new PlantUMLDiagramGenerator());
		Consumer<Diagnostic> diagnosticConsumer = d -> d.dump(System.out, 0);
		List<Function<URI,Action>> actionProviders = new ArrayList<>();		
		EcoreGenEchartsGraphProcessorsFactory ecoreGenEchartsGraphProcessorFactory = new EcoreGenEchartsGraphProcessorsFactory(context);		
		EcoreNodeProcessorFactory ecoreNodeProcessorFactory = new EcoreNodeProcessorFactory(
				context, 
				(uri, pm) -> {
					for (Function<URI, Action> ap: actionProviders) {
						Action prototype = ap.apply(uri);
						if (prototype != null) {
							return prototype;
						}
					}
					return null;
				},
				diagnosticConsumer,
				ecoreGenEchartsGraphProcessorFactory);
		
		EObjectNodeProcessorReflectiveFactory<WidgetFactory, WidgetFactory> eObjectNodeProcessorReflectiveFactory = new EObjectNodeProcessorReflectiveFactory<>(ecoreNodeProcessorFactory);
		EObjectReflectiveProcessorFactoryProvider eObjectReflectiveProcessorFactoryProvider = new EObjectReflectiveProcessorFactoryProvider(eObjectNodeProcessorReflectiveFactory);
		Map<Element, ProcessorInfo<Object>> registry = eObjectReflectiveProcessorFactoryProvider.getFactory().createProcessors(configs.values(), false, progressMonitor);
		
		WidgetFactory testProcessor = null;
		Collection<Throwable> resolveFailures = new ArrayList<>();		
		URI baseActionURI = URI.createURI("https://echarts.models.nasdanika.org/");
		
		Map<EPackage, URI> packageURIMap = Map.ofEntries(
			Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.nasdanika.org/")),			
			Map.entry(GraphPackage.eINSTANCE, URI.createURI("graph/").resolve(baseActionURI))	
		);
		
		for (EPackage topLevelPackage: ePackages) {
			for (Entry<Element, ProcessorInfo<Object>> re: registry.entrySet()) {
				Element element = re.getKey();
				if (element instanceof EObjectNode) {
					EObjectNode eObjNode = (EObjectNode) element;
					EObject target = eObjNode.get();
					if (target == topLevelPackage) {
						ProcessorInfo<Object> info = re.getValue();
						Object processor = info.getProcessor();
						if (processor instanceof WidgetFactory) {
							WidgetFactory widgetFactoryNodeProcessor = (WidgetFactory) processor;
							widgetFactoryNodeProcessor.resolve(packageURIMap.get(topLevelPackage), progressMonitor);
							
							if (topLevelPackage == GraphPackage.eINSTANCE) { 							
								testProcessor = widgetFactoryNodeProcessor;
							}
						}
					}
				}
			}			
		}
		
		if (!resolveFailures.isEmpty()) {
			NasdanikaException ne = new NasdanikaException("Theres's been " + resolveFailures.size() +  " failures during URI resolution: " + resolveFailures);
			for (Throwable failure: resolveFailures) {
				ne.addSuppressed(failure);
			}
			throw ne;
		}								
		
		ResourceSet actionModelsResourceSet = new ResourceSetImpl();
		actionModelsResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(Resource.Factory.Registry.DEFAULT_EXTENSION, new XMIResourceFactoryImpl());
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();
		
		File output = new File(actionModelsDir, "graph.xmi");
		Resource actionModelResource = actionModelsResourceSet.createResource(URI.createFileURI(output.getAbsolutePath()));
		Collection<Label> labels = testProcessor.createLabelsSupplier().call(progressMonitor, diagnosticConsumer);
		for (Label label: labels) {
			if (label instanceof Link) {
				Link link = (Link) label;
				String location = link.getLocation();
				if (!org.nasdanika.common.Util.isBlank(location)) {
					URI uri = URI.createURI(location);
					if (!uri.isRelative()) {
						link.setLocation("${base-uri}" + uri.deresolve(baseActionURI, true, true, true).toString());
					}
				}
			}
		}
						
		actionModelResource.getContents().addAll(labels);
		actionModelResource.save(null);
				
		String rootActionResource = "actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		String pageTemplateResource = "page-template.yml";
		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
		
		String siteMapDomain = "https://echarts.models.nasdanika.org";
		
		ActionSiteGenerator actionSiteGenerator = new ActionSiteGenerator() {
			
			protected boolean isDeleteOutputPath(String path) {
				return !"CNAME".equals(path);				
			};
			
		};
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(rootActionURI, pageTemplateURI, siteMapDomain, new File("../docs"), new File("target/doc-site-work-dir"), true);
				
		int errorCount = 0;
		for (Entry<String, Collection<String>> ee: errors.entrySet()) {
			System.err.println(ee.getKey());
			for (String error: ee.getValue()) {
				System.err.println("\t" + error);
				++errorCount;
			}
		}
		
		System.out.println("There are " + errorCount + " site errors");
		
		if (errors.size() != 0) {
			throw new ExecutionException("There are problems with pages: " + errorCount);
		}		
	}
	
	/**
	 * Generates Graph JSON from a model
	 */
	@Test
	public void testGraph() {
		Module thisModule = getClass().getModule();
		ModuleLayer moduleLayer = thisModule.getLayer();
		
		Graph graph = GraphFactory.eINSTANCE.createGraph();
		moduleToNode(thisModule, moduleLayer, graph);		
		JSONObject json = graph.toJSONObject(null);
		System.out.println(json.toString(2));		
	}
	
	private Node moduleToNode(Module module, ModuleLayer layer, Graph graph) {
		ModuleDescriptor moduleDescriptor = module.getDescriptor();		
		Node moduleNode = getModuleNode(module, layer, graph);
		for (Requires req: moduleDescriptor.requires()) {
			Optional<Module> rmo = layer.findModule(req.name());
			if (rmo.isPresent()) {
				Node reqNode = moduleToNode(rmo.get(), layer, graph);
				org.nasdanika.models.echarts.graph.Link reqLink = GraphFactory.eINSTANCE.createLink();
				reqLink.setTarget(reqNode);
				reqLink.setSource(moduleNode);
			}
		}		
		return moduleNode;
	}
	
	private Node getModuleNode(Module module, ModuleLayer layer, Graph graph) {
		for (Node n: graph.getNodes()) {
			if (n.getName().equals(module.getName())) {
				return n;
			}
		}
		Node ret = GraphFactory.eINSTANCE.createNode();
		ret.setName(module.getName());
		graph.getNodes().add(ret);
		return ret;
	}
	
	
}

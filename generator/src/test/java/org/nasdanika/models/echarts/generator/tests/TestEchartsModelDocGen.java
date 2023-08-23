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
import java.util.Map.Entry;
import java.util.Optional;
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
import org.icepear.echarts.Bar;
import org.icepear.echarts.Sunburst;
import org.icepear.echarts.charts.graph.GraphCategoryItem;
import org.icepear.echarts.charts.graph.GraphEdgeItem;
import org.icepear.echarts.charts.graph.GraphEdgeLineStyle;
import org.icepear.echarts.charts.graph.GraphForce;
import org.icepear.echarts.charts.graph.GraphNodeItem;
import org.icepear.echarts.charts.graph.GraphSeries;
import org.icepear.echarts.charts.sunburst.SunburstLabel;
import org.icepear.echarts.charts.sunburst.SunburstNodeItem;
import org.icepear.echarts.charts.sunburst.SunburstSeries;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.origin.chart.graph.GraphCategoryItemOption;
import org.icepear.echarts.render.Engine;
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
import org.nasdanika.models.echarts.graph.Item;
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
	public void testGenerateEchartsModelDoc() throws IOException, DiagnosticException {
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
			Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),			
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
	public void testModuleGraph() {
		Module thisModule = getClass().getModule();
		ModuleLayer moduleLayer = thisModule.getLayer();
		
		Graph graph = GraphFactory.eINSTANCE.createGraph();
		
		Item nsdCategory = GraphFactory.eINSTANCE.createItem();
		nsdCategory.setName("Nasdanika");
		graph.getCategories().add(nsdCategory);
		
		Item eclipseCategory = GraphFactory.eINSTANCE.createItem();
		eclipseCategory.setName("Eclipse");
		graph.getCategories().add(eclipseCategory);
		
		Item javaCategory = GraphFactory.eINSTANCE.createItem();
		javaCategory.setName("Java");
		graph.getCategories().add(javaCategory);
		
		Item otherCategory = GraphFactory.eINSTANCE.createItem();
		otherCategory.setName("Other");
		graph.getCategories().add(otherCategory);
		
		moduleToNode(thisModule, moduleLayer, graph, nsdCategory, eclipseCategory, javaCategory, otherCategory);
		
		GraphSeries graphSeries = new org.icepear.echarts.charts.graph.GraphSeries().setSymbolSize(50)
				.setLayout("force")
				.setForce(new GraphForce().setRepulsion(2000).setGravity(0.01))
                .setLabel(new SeriesLabel().setShow(true))
                .setDraggable(true)
                .setEdgeSymbol(new String[] { "none", "arrow" });
//                .setLineStyle(new GraphEdgeLineStyle().setOpacity(0.9).setWidth(2).setCurveness(0));
		
		graph.configureGraphSeries(graphSeries);
		
    	org.icepear.echarts.Graph echartsGraph = new org.icepear.echarts.Graph()
                .setTitle("Module Dependencies")
//                .setTooltip("item")
                .setLegend()
                .addSeries(graphSeries);
    	
	    Engine engine = new Engine();
	    new File("target/charts").mkdirs();
	    engine.render("target/charts/module-graph.html", echartsGraph, "90%", "2000px", false);		
	}
	
	private Node moduleToNode(
			Module module, 
			ModuleLayer layer, 
			Graph graph,
			Item nsdCategory,
			Item eclipseCategory,
			Item javaCategory,
			Item otherCategory) {
		ModuleDescriptor moduleDescriptor = module.getDescriptor();		
		Node moduleNode = getModuleNode(module, layer, graph, nsdCategory, eclipseCategory, javaCategory, otherCategory);
		for (Requires req: moduleDescriptor.requires()) {
			Optional<Module> rmo = layer.findModule(req.name());
			if (rmo.isPresent()) {
				Node reqNode = moduleToNode(rmo.get(), layer, graph, nsdCategory, eclipseCategory, javaCategory, otherCategory);
				org.nasdanika.models.echarts.graph.Link reqLink = GraphFactory.eINSTANCE.createLink();				
				reqLink.setTarget(reqNode);
				moduleNode.getOutgoingLinks().add(reqLink);
			}
		}		
		return moduleNode;
	}
	
	private Node getModuleNode(
			Module module, 
			ModuleLayer layer, 
			Graph graph, 
			Item nsdCategory,
			Item eclipseCategory,
			Item javaCategory,
			Item otherCategory) {
		for (Node n: graph.getNodes()) {
			if (n.getName().equals(module.getName())) {
				return n;
			}
		}
		Node ret = GraphFactory.eINSTANCE.createNode();
		ret.setName(module.getName());
		
		if (ret.getName().startsWith("org.nasdanika.")) {
			ret.setCategory(nsdCategory);
		} else if (ret.getName().startsWith("org.eclipse.")) {
			ret.setCategory(eclipseCategory);
		} else if (ret.getName().startsWith("java.")) {
			ret.setCategory(javaCategory);
		} else {
			ret.setCategory(otherCategory);
		}
		
		ret.getSymbolSize().add(10.0 + module.getDescriptor().exports().size());
		
		graph.getNodes().add(ret);
		return ret;
	}
	
	@Test
	public void testBarChart() {
	    Bar bar = new Bar()
	              .setLegend()
	              .setTooltip("item")
	              .addXAxis(new String[] { "Matcha Latte", "Milk Tea", "Cheese Cocoa", "Walnut Brownie" })
	              .addYAxis()
	              .addSeries("2015", new Number[] { 43.3, 83.1, 86.4, 72.4 })
	              .addSeries("2016", new Number[] { 85.8, 73.4, 65.2, 53.9 })
	              .addSeries("2017", new Number[] { 93.7, 55.1, 82.5, 39.1 });
	    Engine engine = new Engine();
	    new File("target/charts").mkdirs();
	    engine.render("target/charts/bar.html", bar);		
	}
	
	@Test
	public void testGraphChart() {
    	org.icepear.echarts.Graph graph = new org.icepear.echarts.Graph()
                .addSeries(new org.icepear.echarts.charts.graph.GraphSeries().setSymbolSize(50)
                        .setLabel(new SeriesLabel().setShow(true))
                        .setEdgeSymbol(new String[] { "circle", "arrow" })
                        .setData(new GraphNodeItem[] {
                                new GraphNodeItem().setName("Node 1").setX(300).setY(300).setCategory(0),
                                new GraphNodeItem().setName("Node 2").setX(800).setY(300).setCategory("Cat 1"),
                                new GraphNodeItem().setName("Node 3").setX(550).setY(100).setCategory("Cat 1"),
                                new GraphNodeItem().setName("Node 4").setX(550).setY(500).setCategory(1)
                        })
                        .setLinks(new GraphEdgeItem[] {
                                new GraphEdgeItem().setSource("Node 1").setTarget("Node 2")
                                        .setLineStyle(new GraphEdgeLineStyle().setCurveness(0.2)),
                                new GraphEdgeItem().setSource("Node 2").setTarget("Node 1")
                                        .setLineStyle(new GraphEdgeLineStyle().setCurveness(0.2)),
                                new GraphEdgeItem().setSource("Node 1").setTarget("Node 3"),
                                new GraphEdgeItem().setSource("Node 2").setTarget("Node 3"),
                                new GraphEdgeItem().setSource("Node 2").setTarget("Node 4"),
                                new GraphEdgeItem().setSource("Node 1").setTarget("Node 4")
                        })
                        .setCategories(new GraphCategoryItemOption[] {
                        		new GraphCategoryItem().setName("Cat 1"),
                        		new GraphCategoryItem().setName("Cat 2"),                        		
                        })
                        .setLineStyle(new GraphEdgeLineStyle().setOpacity(0.9).setWidth(2).setCurveness(0)));
	    Engine engine = new Engine();
	    new File("target/charts").mkdirs();
	    engine.render("target/charts/graph.html", graph);		
	}
	
    @Test
    public void testBasicSunburst() {
        Sunburst sunburst = new Sunburst()
                .addSeries(new SunburstSeries()
                        .setRadius(new String[] { "0", "90%" })
                        .setLabel(new SunburstLabel().setRotate("radial"))
                        .setData(new SunburstNodeItem[] {
                                new SunburstNodeItem().setName("Grandpa")
                                        .setChildren(new SunburstNodeItem[] {
                                                new SunburstNodeItem().setName("Uncle Leo").setValue(15)
                                                        .setChildren(new SunburstNodeItem[] {
                                                                new SunburstNodeItem().setName("Cousin Jack")
                                                                        .setValue(2),
                                                                new SunburstNodeItem().setName("Cousin Mary")
                                                                        .setValue(5)
                                                                        .setChildren(new SunburstNodeItem[] {
                                                                                new SunburstNodeItem()
                                                                                        .setName("Jackson").setValue(2)
                                                                        }),
                                                                new SunburstNodeItem().setName("Cousin Ben")
                                                                        .setValue(4)
                                                        }),
                                                new SunburstNodeItem().setName("Father").setValue(10)
                                                        .setChildren(new SunburstNodeItem[] {
                                                                new SunburstNodeItem().setName("Me").setValue(5),
                                                                new SunburstNodeItem().setName("Brother Peter")
                                                                        .setValue(1)
                                                        })
                                        }),
                                new SunburstNodeItem().setName("Nancy")
                                        .setChildren(new SunburstNodeItem[] {
                                                new SunburstNodeItem().setName("Uncle Nike")
                                                        .setChildren(new SunburstNodeItem[] {
                                                                new SunburstNodeItem().setName("Cousin Betty")
                                                                        .setValue(1),
                                                                new SunburstNodeItem().setName("Cousin Jenny")
                                                                        .setValue(2)
                                                        })
                                        })

                        }));
	    Engine engine = new Engine();
	    new File("target/charts").mkdirs();
	    engine.render("target/charts/sunburst.html", sunburst);		
    }	
	
}

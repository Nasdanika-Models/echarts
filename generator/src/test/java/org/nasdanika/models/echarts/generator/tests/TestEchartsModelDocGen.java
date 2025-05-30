package org.nasdanika.models.echarts.generator.tests;

import java.io.File;
import java.io.IOException;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleDescriptor.Requires;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;

import org.eclipse.emf.common.util.DiagnosticException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
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
import org.jgrapht.alg.drawing.FRLayoutAlgorithm2D;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.MapLayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.junit.jupiter.api.Test;
import org.nasdanika.common.Context;
import org.nasdanika.common.Diagnostic;
import org.nasdanika.common.ExecutionException;
import org.nasdanika.common.MutableContext;
import org.nasdanika.common.NullProgressMonitor;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.gen.AppSiteGenerator;
import org.nasdanika.models.echarts.graph.Graph;
import org.nasdanika.models.echarts.graph.GraphFactory;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Item;
import org.nasdanika.models.echarts.graph.Node;
import org.nasdanika.models.echarts.graph.processors.EcoreGenEchartsGraphProcessorsFactory;
import org.nasdanika.models.ecore.graph.processors.EcoreHtmlAppGenerator;
import org.nasdanika.models.ecore.graph.processors.EcoreNodeProcessorFactory;
import org.nasdanika.ncore.NcorePackage;

/**
 * Tests Ecore -> Graph -> Processor -> actions generation
 * @author Pavel
 *
 */
public class TestEchartsModelDocGen {
	
	@Test
	public void testGenerateEchartsModelDoc() throws IOException, DiagnosticException {
		ProgressMonitor progressMonitor = new NullProgressMonitor(); // new PrintStreamProgressMonitor();		
		MutableContext context = Context.EMPTY_CONTEXT.fork();
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
		
		File actionModelsDir = new File("target\\action-models\\");
		actionModelsDir.mkdirs();		
		File output = new File(actionModelsDir, "graph.xmi");
		
		Map<EPackage, URI> packageURIMap = Map.ofEntries(
				Map.entry(EcorePackage.eINSTANCE, URI.createURI("https://ecore.models.nasdanika.org/")),			
				Map.entry(NcorePackage.eINSTANCE, URI.createURI("https://ncore.models.nasdanika.org/"))
			);		
		
		EcoreHtmlAppGenerator eCoreHtmlAppGenerator = new EcoreHtmlAppGenerator(
				GraphPackage.eINSTANCE, 
				packageURIMap, 
				ecoreNodeProcessorFactory);
		
		eCoreHtmlAppGenerator.generateHtmlAppModel(diagnosticConsumer, output, progressMonitor);
				
		String rootActionResource = "actions.yml";
		URI rootActionURI = URI.createFileURI(new File(rootActionResource).getAbsolutePath());//.appendFragment("/");
		
		String pageTemplateResource = "page-template.yml";
		URI pageTemplateURI = URI.createFileURI(new File(pageTemplateResource).getAbsolutePath());//.appendFragment("/");
		
		String siteMapDomain = "https://echarts.models.nasdanika.org";
		
		AppSiteGenerator actionSiteGenerator = new AppSiteGenerator() {
			
			protected boolean isDeleteOutputPath(String path) {
				return !"CNAME".equals(path);				
			};
			
		};
		
		Map<String, Collection<String>> errors = actionSiteGenerator.generate(
				rootActionURI, 
				pageTemplateURI, 
				siteMapDomain, 
				new File("../docs/graph"), 
				new File("target/doc-site-work-dir"), true);
				
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
	public void testModuleGraphForce() {
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
	    engine.render("target/charts/module-graph-force.html", echartsGraph, "90%", "2000px", false);		
	}
	
	/**
	 * Generates Graph JSON from a model
	 */
	@Test
	public void testModuleGraphNone() {
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
		
		// Using JGraphT for force layout
		DefaultDirectedGraph<Node, org.nasdanika.models.echarts.graph.Link> dGraph = new DefaultDirectedGraph<>(org.nasdanika.models.echarts.graph.Link.class);
		
		// Populating
		for (Node node: graph.getNodes()) {
			dGraph.addVertex(node);
		}		
		for (Node node: graph.getNodes()) {
			for (org.nasdanika.models.echarts.graph.Link link: node.getOutgoingLinks()) {
				dGraph.addEdge(node, link.getTarget(), link);
			}
		}		
		
		FRLayoutAlgorithm2D<Node, org.nasdanika.models.echarts.graph.Link> forceLayout = new FRLayoutAlgorithm2D<>();
		MapLayoutModel2D<Node> model = new MapLayoutModel2D<>(new Box2D(1000.0, 800.0));
		forceLayout.layout(dGraph, model);
		model.forEach(ne -> {
			Node node = ne.getKey();
			Point2D point = ne.getValue();
			node.setX(point.getX());
			node.setY(point.getY());
		});
		
		GraphSeries graphSeries = new org.icepear.echarts.charts.graph.GraphSeries().setSymbolSize(50)
				.setLayout("none")
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
	    engine.render("target/charts/module-graph-none.html", echartsGraph, "90%", "2000px", false);		
	}
		
	/**
	 * Generates Graph JSON from a model
	 */
	@Test
	public void testModuleGraphCircular() {
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
				.setLayout("circular")
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
	    engine.render("target/charts/module-graph-circular.html", echartsGraph, "90%", "2000px", false);		
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
		
		ret.getSymbolSize().add(10.0 + Math.log(1 + module.getDescriptor().exports().size()));
		
//		org.nasdanika.models.echarts.graph.Label label = GraphFactory.eINSTANCE.createLabel();
//		label.setColor("red");
//		ret.setLabel(label);
		
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

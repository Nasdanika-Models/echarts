package org.nasdanika.models.echarts.graph.processors;

import java.util.function.BiConsumer;

import org.eclipse.emf.ecore.EObject;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.graph.processor.NodeProcessorConfig;
import org.nasdanika.models.app.Action;
import org.nasdanika.models.app.Label;
import org.nasdanika.models.app.graph.WidgetFactory;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessor;
import org.nasdanika.models.ecore.graph.processors.EPackageNodeProcessorFactory;

@EPackageNodeProcessorFactory(nsURI = GraphPackage.eNS_URI)
public class EcoreGenEchartsGraphProcessorsFactory {

	private Context context; 	

	public EcoreGenEchartsGraphProcessorsFactory(Context context) {
		this.context = context;
	}
	
	@EPackageNodeProcessorFactory(
			label = "ECharts Graph Model",
			description = "A model for generating ECharts graphs",
			documentation =  
					"""
					
					Nasdanika ECharts Graph model can be used to generate [ECharts graphs](https://echarts.apache.org/examples/en/index.html#chart-type-graph) such as this [Maven dependency graph](https://nasdanika-demos.github.io/maven-graph/).
					The below snippet shows how to use the model.
				
					```java 
					Graph graph = GraphFactory.eINSTANCE.createGraph();
					
					Item coreCategory = GraphFactory.eINSTANCE.createItem();
					coreCategory.setName("Core");
					graph.getCategories().add(coreCategory);
					
					// More categories...
					
					// Add nodes and links
					
					GraphUtil.forceLayout(graph, 2000, 1600);
					GraphSeries graphSeries = new org.icepear.echarts.charts.graph.GraphSeries()
						.setSymbolSize(24)
						.setDraggable(true)				
						.setLayout("none")
					    .setLabel(new SeriesLabel().setShow(true).setPosition("right"))
					    .setLineStyle(new GraphEdgeLineStyle().setColor("source").setCurveness(0))
					    .setRoam(true)
					    .setEdgeSymbol(new String[] { "none", "arrow" })
					    .setEmphasis(new GraphEmphasis().setFocus("adjacency")); // Line style width 10?
							
					graph.configureGraphSeries(graphSeries);
					
					org.icepear.echarts.Graph echartsGraph = new org.icepear.echarts.Graph()
					        .setTitle("Maven Dependencies")
					        .setLegend()
					        .addSeries(graphSeries);
					
					Engine engine = new Engine();
					String chartJSON = engine.renderJsonOption(echartsGraph);
					
					System.out.println(chartJSON);
					
					String chartHTML = Context
							.singleton("chart", chartJSON)
							.compose(Context.singleton("graphContainerId", "graph-container"))
							.interpolateToString(GRAPH_TEMPLATE);
					
					Files.writeString(new File("docs/index.html").toPath(), chartHTML);
					```
					
					Graph template:
					
					```html
					<html>
						<head>
						    <title>Module dependency</title>
						    <script src="https://cdnjs.cloudflare.com/ajax/libs/echarts/5.4.3/echarts.min.js"></script>
						</head>			
						<body>
							<div class="container-fluid">
								<div id="graph-container-${graphContainerId}" class="row" style="height:80vh;width:100%">
								</div>
							</div>
							<script type="text/javascript">
								$(document).ready(function() {
									var dom = document.getElementById("graph-container-${graphContainerId}");
									var myChart = echarts.init(dom, null, {
										render: "canvas",
										useDirtyRect: false
									});		
									var option = ${chart};
									option.tooltip = {};
									option.series[0].tooltip = {
										formatter: function(arg) { 
											return arg.value ? arg.value.description : null; 
										}
									};
									myChart.setOption(option);
									myChart.on("dblclick", function(params) {
										if (params.value) {
											if (params.value.link) {
												window.open(params.value.link, "_self");
											} else if (params.value.externalLink) {
												window.open(params.value.externalLink);
											}
										}
									});
									window.addEventListener("resize", myChart.resize);
								});		
							</script>
						</body>
					</html>					
					``` 
					
					## 3D force graphs
					
					You can also generate [3D Force Graphs](https://github.com/vasturiano/3d-force-graph?tab=readme-ov-file) from the graph model leveraging [Nasdanika 3D Force Graph Java Bindings](https://docs.nasdanika.org/html/3d-force-graph/index.html).
					
					The below code generated this [Maven dependency graph](https://nasdanika-demos.github.io/maven-graph/force-graph-3d-util.html):
					
					 ```java
					HTMLPage page = HTMLFactory.INSTANCE.page();
					ForceGraph3D forceGraph3D = GraphUtil.asForceGraph3D(graph);
					forceGraph3D.getFactory().cdn(page);
					String forceGraphContainerId = "force-graph";
					forceGraph3D
						.elementId(forceGraphContainerId)
						.nodeAutoColorBy("'group'")
						.nodeVal("'size'")
						.linkDirectionalArrowLength(3.5)
						.linkDirectionalArrowRelPos(1)
						.addExtraRederer("new CSS2DRenderer()")
						.nodeThreeObject(
								\"""
								node => {
								        const nodeEl = document.createElement('div');
								        nodeEl.textContent = node.name;
								        nodeEl.style.color = node.color;
								        nodeEl.className = 'node-label';
								        return new CSS2DObject(nodeEl);
								      }					
								\""")
						.nodeThreeObjectExtend(true)
						.onNodeDragEnd(
								\"""
								node => {
								          node.fx = node.x;
								          node.fy = node.y;
								          node.fz = node.z;
								        }					
								\""");
					
					page.body(HTMLFactory.INSTANCE.div().id(forceGraphContainerId));				
					Tag scriptTag = TagName.script.create(
							System.lineSeparator(),
							"import { CSS2DRenderer, CSS2DObject } from 'https://esm.sh/three/examples/jsm/renderers/CSS2DRenderer.js';",
							System.lineSeparator(),
							forceGraph3D).attribute("type", "module");
					page.body(scriptTag);
					page.head(TagName.style.create(
							\"""
							.node-label {
							      font-size: 12px;
							      padding: 1px 4px;
							      border-radius: 4px;
							      background-color: rgba(0,0,0,0.5);
							      user-select: none;
							    }				
							\"""));
					Files.writeString(new File("docs/force-graph-3d-util.html").toPath(), page.toString());		    	    		
					```
					
					Handling double-clicks:
					
					```javascript
					(node, event) => {
					    if (node.lastClick) {
					        if (event.timeStamp - node.lastClick < 500) {
								if (Array.isArray(node.value) && node.value.length > 0) {
									if (node.value[0].link) {
										window.open(node.value[0].link, "_self");
									} else if (node.value[0].externalLink) {
										window.open(node.value[0].externalLink);
									}
								}		
								delete node.lastClick;
							} else {
								node.lastClick = event.timeStamp;
							}
						} else {
							node.lastClick = event.timeStamp;
						}
					}								
					```        					    
					        
					"""
	)
	public EPackageNodeProcessor createEPackageProcessor(
			NodeProcessorConfig<WidgetFactory, WidgetFactory> config, 
			java.util.function.BiFunction<EObject, ProgressMonitor, Action> prototypeProvider,
			BiConsumer<Label, ProgressMonitor> labelConfigurator,
			ProgressMonitor progressMonitor) {		
		return new EPackageNodeProcessor(config, context, prototypeProvider) {
			
			@Override
			public void configureLabel(Object source, Label label, ProgressMonitor progressMonitor) {
				super.configureLabel(source, label, progressMonitor);
				if (labelConfigurator != null) {
					labelConfigurator.accept(label, progressMonitor);
				}
			}
			
		};
	}	

}

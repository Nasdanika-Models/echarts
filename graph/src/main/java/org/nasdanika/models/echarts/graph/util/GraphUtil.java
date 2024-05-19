package org.nasdanika.models.echarts.graph.util;

import org.jgrapht.alg.drawing.FRLayoutAlgorithm2D;
import org.jgrapht.alg.drawing.LayoutAlgorithm2D;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.LayoutModel2D;
import org.jgrapht.alg.drawing.model.MapLayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;
import org.jgrapht.graph.DefaultUndirectedGraph;
import org.nasdanika.models.echarts.graph.Graph;
import org.nasdanika.models.echarts.graph.Node;

public class GraphUtil {
	
	private GraphUtil() {
		// Utility
	}
	
	/**
	 * Uses JGraphT {@link FRLayoutAlgorithm2D} to force layout the graph.
	 * @param graph
	 */
	public static void layout(
			Graph graph, 
			LayoutAlgorithm2D<Node, org.nasdanika.models.echarts.graph.Link> layout,
			LayoutModel2D<Node> layoutModel) {
		// Using JGraphT for force layout
		DefaultUndirectedGraph<Node, org.nasdanika.models.echarts.graph.Link> dGraph = new DefaultUndirectedGraph<>(org.nasdanika.models.echarts.graph.Link.class);
		
		// Populating
		for (Node node: graph.getNodes()) {
			dGraph.addVertex(node);
		}	
		
		for (Node node: graph.getNodes()) {
			for (org.nasdanika.models.echarts.graph.Link link: node.getOutgoingLinks()) {
				if (dGraph.getEdge(link.getTarget(), node) == null) { // Not yet connected, connect
					dGraph.addEdge(node, link.getTarget(), link);
				}
			}
		}		
		
		layout.layout(dGraph, layoutModel);
		layoutModel.forEach(ne -> {
			Node node = ne.getKey();
			Point2D point = ne.getValue();
			node.setX(point.getX());
			node.setY(point.getY());
		});
		
	}	
	
	/**
	 * Uses JGraphT {@link FRLayoutAlgorithm2D} to force layout the graph.
	 * @param graph
	 */
	public static void forceLayout(
			Graph graph, 
			double layoutWidth, 
			double layoutHeight) {
		
		FRLayoutAlgorithm2D<Node, org.nasdanika.models.echarts.graph.Link> forceLayout = new FRLayoutAlgorithm2D<>();
		MapLayoutModel2D<Node> model = new MapLayoutModel2D<Node>(new Box2D(layoutWidth, layoutHeight));
		layout(graph, forceLayout, model);
	}	

}

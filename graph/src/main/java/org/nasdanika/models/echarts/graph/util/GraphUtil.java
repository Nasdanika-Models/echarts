package org.nasdanika.models.echarts.graph.util;

import java.util.Collection;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

import org.eclipse.emf.ecore.EObject;
import org.jgrapht.alg.drawing.FRLayoutAlgorithm2D;
import org.jgrapht.alg.drawing.LayoutAlgorithm2D;
import org.jgrapht.alg.drawing.model.Box2D;
import org.jgrapht.alg.drawing.model.LayoutModel2D;
import org.jgrapht.alg.drawing.model.MapLayoutModel2D;
import org.jgrapht.alg.drawing.model.Point2D;
import org.jgrapht.graph.DefaultUndirectedGraph;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.html.forcegraph3d.ForceGraph3D;
import org.nasdanika.html.forcegraph3d.ForceGraph3DFactory;
import org.nasdanika.models.echarts.graph.Graph;
import org.nasdanika.models.echarts.graph.Item;
import org.nasdanika.models.echarts.graph.Link;
import org.nasdanika.models.echarts.graph.Node;

public class GraphUtil {
	
	private static final String ROTATION_KEY = "rotation";
	private static final String CURVATURE_KEY = "curvature";
	private static final String TARGET_KEY = "target";
	private static final String SOURCE_KEY = "source";

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
	

	/**
	 * Default factory method
	 * @param node
	 * @return
	 */
	public static JSONObject createForceGraph3DNode(Node node) {
		JSONObject jNode = new JSONObject();
		jNode.put("id", node.getId());
		jNode.put("name", node.getName());		
		Item category = node.getCategory();
		if (category != null) {
			jNode.put("group", category.getName());
		}
		setValue(jNode, node.getValue());
		for (Double symbolSize: node.getSymbolSize()) {
			if (symbolSize != null) {
				jNode.put("size", symbolSize);
			}
		}
		if (node.isFixed()) {
	    	Double x = node.getX();
	    	if (x != null) {
	    		jNode.put("fx", x);
	    	}
	    	Double y = node.getY();
	    	if (y != null) {
	    		jNode.put("fy", y);
	    	}
	    	Double z = node.getZ();
	    	if (z != null) {
	    		jNode.put("fz", z);
	    	}
		}
		return jNode;
	}
	
	private static void setValue(JSONObject obj, Collection<EObject> value) {
		if (value != null && !value.isEmpty()) {
			JSONArray jVal = new JSONArray();
			obj.put("value", jVal);
			for (EObject e: value) {
				if (e instanceof org.nasdanika.ncore.Map) {
					jVal.put(((org.nasdanika.ncore.Map) e).toMap());
				} else if (e instanceof org.nasdanika.ncore.ValueObject) {
					jVal.put(((org.nasdanika.ncore.ValueObject<?>) e).getValue());
				} else if (e instanceof org.nasdanika.ncore.List) {
					jVal.put(((org.nasdanika.ncore.List) e).toList());
				}
			}
		}
	}

	/**
	 * Default factory method
	 * @param node
	 * @return
	 */
	public static JSONObject createForceGraph3DLink(Node node, Link link) {
		JSONObject jLink = new JSONObject();
		jLink.put(SOURCE_KEY, node.getId());
		jLink.put(TARGET_KEY, link.getTarget().getId());
		setValue(jLink, link.getValue());
		List<Link> targetOutgoingLinks = node
				.getOutgoingLinks()
				.stream()
				.filter(ol -> ol.getTarget() == link.getTarget())
				.toList();
		List<Link> sourceIncomingLinks = node
				.getIncomingLinks()
				.stream()
				.filter(il -> il.eContainer() == link.getTarget())
				.toList();
		if (targetOutgoingLinks.size() > 1 || sourceIncomingLinks.size() > 1) {
			// Curvature and rotation
			jLink.put(CURVATURE_KEY, 0.2);
			jLink.put(ROTATION_KEY, Math.PI * 2 * targetOutgoingLinks.indexOf(link) / (targetOutgoingLinks.size() + sourceIncomingLinks.size()));
		} else {
			jLink.put(CURVATURE_KEY, 0.0);
			jLink.put(ROTATION_KEY, 0.0);			
		}
		return jLink;
	}		
	
	/**
	 * Populates the second argument with links and nodes from the first 	
	 * @param graph
	 * @param forceGraph3D
	 */
	public static void toForceGraph3D(
			Graph graph, 
			ForceGraph3D forceGraph3D,
			Function<Node,?> nodeFactory,
			BiFunction<Node, Link,?> linkFactory) {
	    for (Node node: graph.getNodes()) {
	    	if (nodeFactory != null) {	    	
	    		Object jNode = nodeFactory.apply(node);
	    		if (jNode != null) {
	    			forceGraph3D.addNode(jNode);
	    		}
	    	}
	    	
	    	for (Link link: node.getOutgoingLinks()) {
	    		if (linkFactory != null) {
	    			Object jLink = linkFactory.apply(node, link);
	    			if (jLink != null) {
	    				forceGraph3D.addLink(jLink);
	    			}
	    		}
	    	}
	    }	    
	}
		
	/**
	 * Populates the second argument with links and nodes from the first 	
	 * @param graph
	 * @param forceGraph3D
	 */
	public static void toForceGraph3D(Graph graph, ForceGraph3D forceGraph3D) {
		toForceGraph3D(graph, forceGraph3D, GraphUtil::createForceGraph3DNode, GraphUtil::createForceGraph3DLink);
	}
		
	/**
	 * Creates a {@link ForceGraph3D} instance and populates it with nodes and links from the argument graph.
	 * @param graph
	 * @return
	 */
	public static ForceGraph3D asForceGraph3D(
			Graph graph,
			Function<Node,?> nodeFactory,
			BiFunction<Node, Link,?> linkFactory) {
		ForceGraph3D forceGraph3D = ForceGraph3DFactory.INSTANCE.create();
		toForceGraph3D(graph, forceGraph3D, nodeFactory, linkFactory);
		return forceGraph3D;
	}
		
	/**
	 * Creates a {@link ForceGraph3D} instance and populates it with nodes and links from the argument graph.
	 * @param graph
	 * @return
	 */
	public static ForceGraph3D asForceGraph3D(Graph graph) {
		ForceGraph3D forceGraph3D = ForceGraph3DFactory.INSTANCE.create();
		toForceGraph3D(graph, forceGraph3D);
		return forceGraph3D;		
	}	

}

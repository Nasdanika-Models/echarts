package org.nasdanika.models.echarts.graph.tests;

import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleDescriptor.Requires;
import java.util.Optional;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.nasdanika.models.echarts.graph.Graph;
import org.nasdanika.models.echarts.graph.GraphFactory;
import org.nasdanika.models.echarts.graph.Link;
import org.nasdanika.models.echarts.graph.Node;

public class GraphTests {
	
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
				Link reqLink = GraphFactory.eINSTANCE.createLink();
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

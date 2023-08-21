module org.nasdanika.models.echarts.graph.processors {
		
	requires transitive org.nasdanika.models.echarts.graph;
	requires transitive org.nasdanika.models.ecore.graph;
	
	exports org.nasdanika.models.echarts.graph.processors;
	opens org.nasdanika.models.echarts.graph.processors; // For loading resources
	
}

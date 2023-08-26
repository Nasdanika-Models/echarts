module org.nasdanika.models.echarts.graph {
	exports org.nasdanika.models.echarts.graph;
	exports org.nasdanika.models.echarts.graph.impl;
	exports org.nasdanika.models.echarts.graph.util;
	
	requires transitive org.eclipse.emf.ecore;
	requires transitive org.eclipse.emf.common;
	requires transitive echarts.java;
	requires transitive org.nasdanika.ncore;
	
}
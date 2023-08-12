/**
 */
package org.nasdanika.models.echarts.graph;

import java.util.function.BiFunction;

import org.eclipse.emf.ecore.EObject;

import org.json.JSONObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getGraphElement()
 * @model
 * @generated
 */
public interface GraphElement extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.models.echarts.graph.JSONObject" customizerDataType="org.nasdanika.models.echarts.graph.BiFunction&lt;org.nasdanika.models.echarts.graph.GraphElement, org.nasdanika.models.echarts.graph.JSONObject, org.nasdanika.models.echarts.graph.JSONObject&gt;"
	 * @generated
	 */
	JSONObject toJSONObject(BiFunction<GraphElement, JSONObject, JSONObject> customizer);

} // GraphElement

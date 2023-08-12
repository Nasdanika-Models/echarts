/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.function.BiFunction;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.json.JSONObject;

import org.nasdanika.models.echarts.graph.GraphElement;
import org.nasdanika.models.echarts.graph.GraphPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class GraphElementImpl extends MinimalEObjectImpl.Container implements GraphElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.GRAPH_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public JSONObject toJSONObject(BiFunction<GraphElement, JSONObject, JSONObject> customizer) {
		return new JSONObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphPackage.GRAPH_ELEMENT___TO_JSON_OBJECT__BIFUNCTION:
				return toJSONObject((BiFunction<GraphElement, JSONObject, JSONObject>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GraphElementImpl

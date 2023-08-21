/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.util.Collection;
import java.util.function.BiFunction;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.json.JSONArray;
import org.json.JSONObject;
import org.nasdanika.models.echarts.graph.Graph;
import org.nasdanika.models.echarts.graph.GraphElement;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Item;
import org.nasdanika.models.echarts.graph.Link;
import org.nasdanika.models.echarts.graph.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.GraphImpl#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.GraphImpl#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GraphImpl extends GraphElementImpl implements Graph {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GraphImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.GRAPH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Node> getNodes() {
		return (EList<Node>)eDynamicGet(GraphPackage.GRAPH__NODES, GraphPackage.Literals.GRAPH__NODES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Item> getCategories() {
		return (EList<Item>)eDynamicGet(GraphPackage.GRAPH__CATEGORIES, GraphPackage.Literals.GRAPH__CATEGORIES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.GRAPH__NODES:
				return ((InternalEList<?>)getNodes()).basicRemove(otherEnd, msgs);
			case GraphPackage.GRAPH__CATEGORIES:
				return ((InternalEList<?>)getCategories()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.GRAPH__NODES:
				return getNodes();
			case GraphPackage.GRAPH__CATEGORIES:
				return getCategories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphPackage.GRAPH__NODES:
				getNodes().clear();
				getNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case GraphPackage.GRAPH__CATEGORIES:
				getCategories().clear();
				getCategories().addAll((Collection<? extends Item>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphPackage.GRAPH__NODES:
				getNodes().clear();
				return;
			case GraphPackage.GRAPH__CATEGORIES:
				getCategories().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphPackage.GRAPH__NODES:
				return !getNodes().isEmpty();
			case GraphPackage.GRAPH__CATEGORIES:
				return !getCategories().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	@Override
	public JSONObject toJSONObject(BiFunction<GraphElement, JSONObject, JSONObject> customizer) {
		JSONObject ret = new JSONObject();
		JSONArray data = new JSONArray();
		JSONArray links = new JSONArray();
		JSONArray categories = new JSONArray();

		for (Node node: getNodes()) {
			data.put(node.toJSONObject(customizer));
			for (Link ol: node.getOutgoingLinks()) {
				links.put(ol.toJSONObject(customizer));
			}
		}
		
		if (data.length() > 0) {
			ret.put("data", data);
		}
		
		if (links.length() > 0) {
			ret.put("links", links);
		}
		
		for (Item category: getCategories()) {
			JSONObject cjo = category.toJSONObject(customizer);
			categories.put(customizer == null ? cjo : customizer.apply(category, cjo)); // Item class does not apply cutomizer because it is an intermediary class, a superclass of Node
		}
		
		if (categories.length() > 0) {
			ret.put("categories", categories);
		}		
		
		return customizer == null ? ret : customizer.apply(this, ret);				
	}

} //GraphImpl

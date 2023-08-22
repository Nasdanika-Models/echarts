/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.InternalEList;
import org.icepear.echarts.charts.graph.GraphEdgeItem;
import org.icepear.echarts.charts.graph.GraphNodeItem;
import org.icepear.echarts.charts.graph.GraphSeries;
import org.icepear.echarts.origin.chart.graph.GraphCategoryItemOption;
import org.nasdanika.models.echarts.graph.Graph;
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
public class GraphImpl extends MinimalEObjectImpl.Container implements Graph {
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
	@Override
	protected int eStaticFeatureCount() {
		return 0;
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
	 * @generated NOT
	 */
	@Override
	public void configureGraphSeries(GraphSeries graphSeries) {
		EList<Node> nodes = getNodes();
		List<GraphEdgeItem> links = new ArrayList<>();
		if (!nodes.isEmpty()) {
			GraphNodeItem[] nodeItems = new GraphNodeItem[nodes.size()];
			int idx = 0;
			for (Node node: nodes) {
				nodeItems[idx++] = node.createGraphNodeItem();
				for (Link link: node.getOutgoingLinks()) {
					links.add(link.createGraphEdgeItem());
				}				
			}
			graphSeries.setData(nodeItems);
		}
		if (!links.isEmpty()) {
			graphSeries.setLinks(links.toArray(new GraphEdgeItem[links.size()]));
		}
		EList<Item> categories = getCategories();
		if (!categories.isEmpty()) {
			GraphCategoryItemOption[] gcio = new GraphCategoryItemOption[categories.size()];
			int idx = 0;
			for (Item category: categories) {
				gcio[idx++] = category.createGraphCategoryItem();				
			}
			graphSeries.setCategories(gcio);
		}
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
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphPackage.GRAPH___CONFIGURE_GRAPH_SERIES__GRAPHSERIES:
				configureGraphSeries((GraphSeries)arguments.get(0));
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //GraphImpl

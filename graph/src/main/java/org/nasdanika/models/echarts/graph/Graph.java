/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.icepear.echarts.charts.graph.GraphSeries;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Graph#getNodes <em>Nodes</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Graph#getCategories <em>Categories</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getGraph()
 * @model
 * @generated
 */
public interface Graph extends EObject {
	/**
	 * Returns the value of the '<em><b>Nodes</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.echarts.graph.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodes</em>' containment reference list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getGraph_Nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getNodes();

	/**
	 * Returns the value of the '<em><b>Categories</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.echarts.graph.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Categories</em>' containment reference list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getGraph_Categories()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getCategories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Sets data, links, and categories
	 * <!-- end-model-doc -->
	 * @model graphSeriesDataType="org.nasdanika.models.echarts.graph.GraphSeries"
	 * @generated
	 */
	void configureGraphSeries(GraphSeries graphSeries);

} // Graph

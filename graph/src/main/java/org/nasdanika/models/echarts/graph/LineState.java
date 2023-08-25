/**
 */
package org.nasdanika.models.echarts.graph;

import org.icepear.echarts.origin.chart.graph.GraphEdgeStateOption;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.LineState#getLineStyle <em>Line Style</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLineState()
 * @model
 * @generated
 */
public interface LineState extends State {
	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' containment reference.
	 * @see #setLineStyle(LineStyle)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLineState_LineStyle()
	 * @model containment="true"
	 * @generated
	 */
	LineStyle getLineStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.LineState#getLineStyle <em>Line Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' containment reference.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyle value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.models.echarts.graph.GraphEdgeStateOption"
	 * @generated
	 */
	GraphEdgeStateOption createGraphEdgeStateOption();

} // LineState

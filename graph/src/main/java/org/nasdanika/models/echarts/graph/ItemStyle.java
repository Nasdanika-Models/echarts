/**
 */
package org.nasdanika.models.echarts.graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderStyle <em>Border Style</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle()
 * @model
 * @generated
 */
public interface ItemStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Style</em>' containment reference.
	 * @see #setBorderStyle(LineStyle)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_BorderStyle()
	 * @model containment="true"
	 * @generated
	 */
	LineStyle getBorderStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderStyle <em>Border Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Style</em>' containment reference.
	 * @see #getBorderStyle()
	 * @generated
	 */
	void setBorderStyle(LineStyle value);

} // ItemStyle

/**
 */
package org.nasdanika.models.echarts.graph;

import org.icepear.echarts.origin.util.ItemStyleOption;

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
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getDecal <em>Decal</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Decal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decal</em>' attribute.
	 * @see #setDecal(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_Decal()
	 * @model
	 * @generated
	 */
	String getDecal();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getDecal <em>Decal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decal</em>' attribute.
	 * @see #getDecal()
	 * @generated
	 */
	void setDecal(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.models.echarts.graph.ItemStyleOption"
	 * @generated
	 */
	ItemStyleOption createItemStyleOption();

} // ItemStyle

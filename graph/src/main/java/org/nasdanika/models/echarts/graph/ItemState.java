/**
 */
package org.nasdanika.models.echarts.graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemState#getItemStyle <em>Item Style</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemState()
 * @model
 * @generated
 */
public interface ItemState extends State {
	/**
	 * Returns the value of the '<em><b>Item Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Style</em>' containment reference.
	 * @see #setItemStyle(ItemStyle)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemState_ItemStyle()
	 * @model containment="true"
	 * @generated
	 */
	ItemStyle getItemStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemState#getItemStyle <em>Item Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Style</em>' containment reference.
	 * @see #getItemStyle()
	 * @generated
	 */
	void setItemStyle(ItemStyle value);

} // ItemState

/**
 */
package org.nasdanika.models.echarts.graph;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Style#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Style#getShadowBlur <em>Shadow Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Style#getShadowColor <em>Shadow Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Style#getShadowOffsetX <em>Shadow Offset X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Style#getShadowOffsetY <em>Shadow Offset Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Style#getOpacity <em>Opacity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getStyle()
 * @model
 * @generated
 */
public interface Style extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getStyle_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Style#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Blur</em>' attribute.
	 * @see #setShadowBlur(int)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getStyle_ShadowBlur()
	 * @model
	 * @generated
	 */
	int getShadowBlur();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Style#getShadowBlur <em>Shadow Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Blur</em>' attribute.
	 * @see #getShadowBlur()
	 * @generated
	 */
	void setShadowBlur(int value);

	/**
	 * Returns the value of the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Color</em>' attribute.
	 * @see #setShadowColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getStyle_ShadowColor()
	 * @model
	 * @generated
	 */
	String getShadowColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Style#getShadowColor <em>Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Color</em>' attribute.
	 * @see #getShadowColor()
	 * @generated
	 */
	void setShadowColor(String value);

	/**
	 * Returns the value of the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Offset X</em>' attribute.
	 * @see #setShadowOffsetX(Double)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getStyle_ShadowOffsetX()
	 * @model
	 * @generated
	 */
	Double getShadowOffsetX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Style#getShadowOffsetX <em>Shadow Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Offset X</em>' attribute.
	 * @see #getShadowOffsetX()
	 * @generated
	 */
	void setShadowOffsetX(Double value);

	/**
	 * Returns the value of the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Offset Y</em>' attribute.
	 * @see #setShadowOffsetY(Double)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getStyle_ShadowOffsetY()
	 * @model
	 * @generated
	 */
	Double getShadowOffsetY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Style#getShadowOffsetY <em>Shadow Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Offset Y</em>' attribute.
	 * @see #getShadowOffsetY()
	 * @generated
	 */
	void setShadowOffsetY(Double value);

	/**
	 * Returns the value of the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Opacity</em>' attribute.
	 * @see #setOpacity(double)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getStyle_Opacity()
	 * @model
	 * @generated
	 */
	double getOpacity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Style#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(double value);

} // Style

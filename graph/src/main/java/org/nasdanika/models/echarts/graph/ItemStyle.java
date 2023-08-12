/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderType <em>Border Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderDashOffset <em>Border Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderCap <em>Border Cap</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderJoin <em>Border Join</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderMiterLimit <em>Border Miter Limit</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowBlur <em>Shadow Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowColor <em>Shadow Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowOffsetX <em>Shadow Offset X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowOffsetY <em>Shadow Offset Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.ItemStyle#getOpacity <em>Opacity</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle()
 * @model
 * @generated
 */
public interface ItemStyle extends EObject {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see #setBorderColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_BorderColor()
	 * @model
	 * @generated
	 */
	String getBorderColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderColor <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Color</em>' attribute.
	 * @see #getBorderColor()
	 * @generated
	 */
	void setBorderColor(String value);

	/**
	 * Returns the value of the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Width</em>' attribute.
	 * @see #setBorderWidth(int)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_BorderWidth()
	 * @model
	 * @generated
	 */
	int getBorderWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderWidth <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Width</em>' attribute.
	 * @see #getBorderWidth()
	 * @generated
	 */
	void setBorderWidth(int value);

	/**
	 * Returns the value of the '<em><b>Border Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.BorderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Type</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderType
	 * @see #setBorderType(BorderType)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_BorderType()
	 * @model
	 * @generated
	 */
	BorderType getBorderType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderType <em>Border Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Type</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderType
	 * @see #getBorderType()
	 * @generated
	 */
	void setBorderType(BorderType value);

	/**
	 * Returns the value of the '<em><b>Border Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Dash Offset</em>' attribute.
	 * @see #setBorderDashOffset(int)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_BorderDashOffset()
	 * @model
	 * @generated
	 */
	int getBorderDashOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderDashOffset <em>Border Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Dash Offset</em>' attribute.
	 * @see #getBorderDashOffset()
	 * @generated
	 */
	void setBorderDashOffset(int value);

	/**
	 * Returns the value of the '<em><b>Border Cap</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.BorderCap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Cap</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderCap
	 * @see #setBorderCap(BorderCap)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_BorderCap()
	 * @model
	 * @generated
	 */
	BorderCap getBorderCap();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderCap <em>Border Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Cap</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderCap
	 * @see #getBorderCap()
	 * @generated
	 */
	void setBorderCap(BorderCap value);

	/**
	 * Returns the value of the '<em><b>Border Join</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.BorderJoin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Join</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderJoin
	 * @see #setBorderJoin(BorderJoin)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_BorderJoin()
	 * @model
	 * @generated
	 */
	BorderJoin getBorderJoin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderJoin <em>Border Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Join</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderJoin
	 * @see #getBorderJoin()
	 * @generated
	 */
	void setBorderJoin(BorderJoin value);

	/**
	 * Returns the value of the '<em><b>Border Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Border Miter Limit</em>' attribute.
	 * @see #setBorderMiterLimit(int)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_BorderMiterLimit()
	 * @model
	 * @generated
	 */
	int getBorderMiterLimit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderMiterLimit <em>Border Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Miter Limit</em>' attribute.
	 * @see #getBorderMiterLimit()
	 * @generated
	 */
	void setBorderMiterLimit(int value);

	/**
	 * Returns the value of the '<em><b>Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shadow Blur</em>' attribute.
	 * @see #setShadowBlur(int)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_ShadowBlur()
	 * @model
	 * @generated
	 */
	int getShadowBlur();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowBlur <em>Shadow Blur</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_ShadowColor()
	 * @model
	 * @generated
	 */
	String getShadowColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowColor <em>Shadow Color</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_ShadowOffsetX()
	 * @model
	 * @generated
	 */
	Double getShadowOffsetX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowOffsetX <em>Shadow Offset X</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_ShadowOffsetY()
	 * @model
	 * @generated
	 */
	Double getShadowOffsetY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowOffsetY <em>Shadow Offset Y</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItemStyle_Opacity()
	 * @model
	 * @generated
	 */
	double getOpacity();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.ItemStyle#getOpacity <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Opacity</em>' attribute.
	 * @see #getOpacity()
	 * @generated
	 */
	void setOpacity(double value);

} // ItemStyle

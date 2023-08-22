/**
 */
package org.nasdanika.models.echarts.graph;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#isShow <em>Show</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getAlign <em>Align</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getVerticalAlign <em>Vertical Align</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getBorderType <em>Border Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getBorderDashOffset <em>Border Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getBorderRadius <em>Border Radius</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getShadowColor <em>Shadow Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getShadowBlur <em>Shadow Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getShadowOffsetX <em>Shadow Offset X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getShadowOffsetY <em>Shadow Offset Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getRich <em>Rich</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends TextStyle {

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to show label
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see #setShow(boolean)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Show()
	 * @model default="true"
	 * @generated
	 */
	boolean isShow();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#isShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see #isShow()
	 * @generated
	 */
	void setShow(boolean value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.LabelPosition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Label position
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.LabelPosition
	 * @see #setPosition(LabelPosition)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Position()
	 * @model
	 * @generated
	 */
	LabelPosition getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.LabelPosition
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(LabelPosition value);

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Distance to the host praphic element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Distance()
	 * @model
	 * @generated
	 */
	Integer getDistance();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(Integer value);

	/**
	 * Returns the value of the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotate label, from -90 degree to 90, positive value represents rotate anti-clockwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rotate</em>' attribute.
	 * @see #setRotate(Double)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Rotate()
	 * @model
	 * @generated
	 */
	Double getRotate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getRotate <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rotate</em>' attribute.
	 * @see #getRotate()
	 * @generated
	 */
	void setRotate(Double value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to move text slightly. For example: [30, 40] means move 30 horizontally and move 40 vertically.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Offset()
	 * @model upper="2"
	 * @generated
	 */
	EList<Integer> getOffset();

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.Align}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Horizontal alignment of text, automatic by default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.Align
	 * @see #setAlign(Align)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Align()
	 * @model
	 * @generated
	 */
	Align getAlign();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.Align
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(Align value);

	/**
	 * Returns the value of the '<em><b>Vertical Align</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.VerticalAlign}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Vertical alignment of text, automatic by default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Vertical Align</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.VerticalAlign
	 * @see #setVerticalAlign(VerticalAlign)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_VerticalAlign()
	 * @model
	 * @generated
	 */
	VerticalAlign getVerticalAlign();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getVerticalAlign <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Align</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.VerticalAlign
	 * @see #getVerticalAlign()
	 * @generated
	 */
	void setVerticalAlign(VerticalAlign value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Background color of the text fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #setBackgroundColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_BackgroundColor()
	 * @model
	 * @generated
	 */
	String getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getBackgroundColor <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Background Color</em>' attribute.
	 * @see #getBackgroundColor()
	 * @generated
	 */
	void setBackgroundColor(String value);

	/**
	 * Returns the value of the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Border color of the text fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see #setBorderColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_BorderColor()
	 * @model
	 * @generated
	 */
	String getBorderColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getBorderColor <em>Border Color</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * Border width of the text fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border Width</em>' attribute.
	 * @see #setBorderWidth(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_BorderWidth()
	 * @model
	 * @generated
	 */
	Integer getBorderWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getBorderWidth <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Width</em>' attribute.
	 * @see #getBorderWidth()
	 * @generated
	 */
	void setBorderWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Border Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.BorderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text fragment border type.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border Type</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderType
	 * @see #setBorderType(BorderType)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_BorderType()
	 * @model
	 * @generated
	 */
	BorderType getBorderType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getBorderType <em>Border Type</em>}' attribute.
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
	 * <!-- begin-model-doc -->
	 * To set the line dash offset. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border Dash Offset</em>' attribute.
	 * @see #setBorderDashOffset(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_BorderDashOffset()
	 * @model
	 * @generated
	 */
	Integer getBorderDashOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getBorderDashOffset <em>Border Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Dash Offset</em>' attribute.
	 * @see #getBorderDashOffset()
	 * @generated
	 */
	void setBorderDashOffset(Integer value);

	/**
	 * Returns the value of the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Border radius of the text fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border Radius</em>' attribute.
	 * @see #setBorderRadius(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_BorderRadius()
	 * @model
	 * @generated
	 */
	Integer getBorderRadius();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getBorderRadius <em>Border Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Radius</em>' attribute.
	 * @see #getBorderRadius()
	 * @generated
	 */
	void setBorderRadius(Integer value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Padding of the text fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Padding</em>' attribute list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Padding()
	 * @model upper="4"
	 * @generated
	 */
	EList<Integer> getPadding();

	/**
	 * Returns the value of the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shadow color of the text block.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shadow Color</em>' attribute.
	 * @see #setShadowColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_ShadowColor()
	 * @model
	 * @generated
	 */
	String getShadowColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getShadowColor <em>Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Color</em>' attribute.
	 * @see #getShadowColor()
	 * @generated
	 */
	void setShadowColor(String value);

	/**
	 * Returns the value of the '<em><b>Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Show blur of the text block.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shadow Blur</em>' attribute.
	 * @see #setShadowBlur(BigDecimal)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_ShadowBlur()
	 * @model
	 * @generated
	 */
	BigDecimal getShadowBlur();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getShadowBlur <em>Shadow Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Blur</em>' attribute.
	 * @see #getShadowBlur()
	 * @generated
	 */
	void setShadowBlur(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shadow X offset of the text block.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shadow Offset X</em>' attribute.
	 * @see #setShadowOffsetX(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_ShadowOffsetX()
	 * @model
	 * @generated
	 */
	Integer getShadowOffsetX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getShadowOffsetX <em>Shadow Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Offset X</em>' attribute.
	 * @see #getShadowOffsetX()
	 * @generated
	 */
	void setShadowOffsetX(Integer value);

	/**
	 * Returns the value of the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shadow Y offset of the text block.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Shadow Offset Y</em>' attribute.
	 * @see #setShadowOffsetY(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_ShadowOffsetY()
	 * @model
	 * @generated
	 */
	Integer getShadowOffsetY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getShadowOffsetY <em>Shadow Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shadow Offset Y</em>' attribute.
	 * @see #getShadowOffsetY()
	 * @generated
	 */
	void setShadowOffsetY(Integer value);

	/**
	 * Returns the value of the '<em><b>Rich</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type list of {@link java.util.Map.Entry<java.lang.String, java.lang.String>},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to show label
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rich</em>' map.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Rich()
	 * @model mapType="org.nasdanika.models.echarts.graph.StyleEntry&lt;org.eclipse.emf.ecore.EString, org.nasdanika.models.echarts.graph.StringEntry&gt;"
	 * @generated
	 */
	EMap<String, EMap<String, String>> getRich();
} // Label

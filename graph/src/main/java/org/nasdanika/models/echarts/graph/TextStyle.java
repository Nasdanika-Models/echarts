/**
 */
package org.nasdanika.models.echarts.graph;

import java.math.BigDecimal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderColor <em>Text Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderWidth <em>Text Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderType <em>Text Border Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderDashOffset <em>Text Border Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowColor <em>Text Shadow Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowBlur <em>Text Shadow Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowOffsetX <em>Text Shadow Offset X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowOffsetY <em>Text Shadow Offset Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getOverflow <em>Overflow</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getEllipsis <em>Ellipsis</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle()
 * @model
 * @generated
 */
public interface TextStyle extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Text color. If set as 'inherit', the color will assigned as visual color, such as series color.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Color</em>' attribute.
	 * @see #setColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_Color()
	 * @model
	 * @generated
	 */
	String getColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getColor <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Color</em>' attribute.
	 * @see #getColor()
	 * @generated
	 */
	void setColor(String value);

	/**
	 * Returns the value of the '<em><b>Font Style</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.FontStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Font style
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Style</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.FontStyle
	 * @see #setFontStyle(FontStyle)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_FontStyle()
	 * @model
	 * @generated
	 */
	FontStyle getFontStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getFontStyle <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Style</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.FontStyle
	 * @see #getFontStyle()
	 * @generated
	 */
	void setFontStyle(FontStyle value);

	/**
	 * Returns the value of the '<em><b>Font Weight</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.FontWeight}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Font weight
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Weight</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.FontWeight
	 * @see #setFontWeight(FontWeight)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_FontWeight()
	 * @model
	 * @generated
	 */
	FontWeight getFontWeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getFontWeight <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Weight</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.FontWeight
	 * @see #getFontWeight()
	 * @generated
	 */
	void setFontWeight(FontWeight value);

	/**
	 * Returns the value of the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to show label
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Family</em>' attribute.
	 * @see #setFontFamily(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_FontFamily()
	 * @model
	 * @generated
	 */
	String getFontFamily();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getFontFamily <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Family</em>' attribute.
	 * @see #getFontFamily()
	 * @generated
	 */
	void setFontFamily(String value);

	/**
	 * Returns the value of the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Font size
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Font Size</em>' attribute.
	 * @see #setFontSize(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_FontSize()
	 * @model
	 * @generated
	 */
	Integer getFontSize();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getFontSize <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Font Size</em>' attribute.
	 * @see #getFontSize()
	 * @generated
	 */
	void setFontSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Line height of the text fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Line Height</em>' attribute.
	 * @see #setLineHeight(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_LineHeight()
	 * @model
	 * @generated
	 */
	Integer getLineHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getLineHeight <em>Line Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Height</em>' attribute.
	 * @see #getLineHeight()
	 * @generated
	 */
	void setLineHeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Width of text block.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_Width()
	 * @model
	 * @generated
	 */
	Integer getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Height of text block.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Height</em>' attribute.
	 * @see #setHeight(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_Height()
	 * @model
	 * @generated
	 */
	Integer getHeight();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getHeight <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Height</em>' attribute.
	 * @see #getHeight()
	 * @generated
	 */
	void setHeight(Integer value);

	/**
	 * Returns the value of the '<em><b>Text Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stroke color of the text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Border Color</em>' attribute.
	 * @see #setTextBorderColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_TextBorderColor()
	 * @model
	 * @generated
	 */
	String getTextBorderColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderColor <em>Text Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Border Color</em>' attribute.
	 * @see #getTextBorderColor()
	 * @generated
	 */
	void setTextBorderColor(String value);

	/**
	 * Returns the value of the '<em><b>Text Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stroke line width of the text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Border Width</em>' attribute.
	 * @see #setTextBorderWidth(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_TextBorderWidth()
	 * @model
	 * @generated
	 */
	Integer getTextBorderWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderWidth <em>Text Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Border Width</em>' attribute.
	 * @see #getTextBorderWidth()
	 * @generated
	 */
	void setTextBorderWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Text Border Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.BorderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Stroke line type of the text.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Border Type</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderType
	 * @see #setTextBorderType(BorderType)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_TextBorderType()
	 * @model
	 * @generated
	 */
	BorderType getTextBorderType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderType <em>Text Border Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Border Type</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderType
	 * @see #getTextBorderType()
	 * @generated
	 */
	void setTextBorderType(BorderType value);

	/**
	 * Returns the value of the '<em><b>Text Border Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * To set the line dash offset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Border Dash Offset</em>' attribute.
	 * @see #setTextBorderDashOffset(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_TextBorderDashOffset()
	 * @model
	 * @generated
	 */
	Integer getTextBorderDashOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderDashOffset <em>Text Border Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Border Dash Offset</em>' attribute.
	 * @see #getTextBorderDashOffset()
	 * @generated
	 */
	void setTextBorderDashOffset(Integer value);

	/**
	 * Returns the value of the '<em><b>Text Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shadow color of the text itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Shadow Color</em>' attribute.
	 * @see #setTextShadowColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_TextShadowColor()
	 * @model
	 * @generated
	 */
	String getTextShadowColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowColor <em>Text Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Shadow Color</em>' attribute.
	 * @see #getTextShadowColor()
	 * @generated
	 */
	void setTextShadowColor(String value);

	/**
	 * Returns the value of the '<em><b>Text Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shadow blue of the text itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Shadow Blur</em>' attribute.
	 * @see #setTextShadowBlur(BigDecimal)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_TextShadowBlur()
	 * @model
	 * @generated
	 */
	BigDecimal getTextShadowBlur();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowBlur <em>Text Shadow Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Shadow Blur</em>' attribute.
	 * @see #getTextShadowBlur()
	 * @generated
	 */
	void setTextShadowBlur(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Text Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shadow X offset of the text itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Shadow Offset X</em>' attribute.
	 * @see #setTextShadowOffsetX(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_TextShadowOffsetX()
	 * @model
	 * @generated
	 */
	Integer getTextShadowOffsetX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowOffsetX <em>Text Shadow Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Shadow Offset X</em>' attribute.
	 * @see #getTextShadowOffsetX()
	 * @generated
	 */
	void setTextShadowOffsetX(Integer value);

	/**
	 * Returns the value of the '<em><b>Text Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shadow Y offset of the text itself.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Shadow Offset Y</em>' attribute.
	 * @see #setTextShadowOffsetY(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_TextShadowOffsetY()
	 * @model
	 * @generated
	 */
	Integer getTextShadowOffsetY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowOffsetY <em>Text Shadow Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Shadow Offset Y</em>' attribute.
	 * @see #getTextShadowOffsetY()
	 * @generated
	 */
	void setTextShadowOffsetY(Integer value);

	/**
	 * Returns the value of the '<em><b>Overflow</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.Overflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Determine how to display the text when it's overflow. 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Overflow</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.Overflow
	 * @see #setOverflow(Overflow)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_Overflow()
	 * @model
	 * @generated
	 */
	Overflow getOverflow();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getOverflow <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overflow</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.Overflow
	 * @see #getOverflow()
	 * @generated
	 */
	void setOverflow(Overflow value);

	/**
	 * Returns the value of the '<em><b>Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ellipsis to be displayed when overflow is set to truncate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ellipsis</em>' attribute.
	 * @see #setEllipsis(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_Ellipsis()
	 * @model
	 * @generated
	 */
	String getEllipsis();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getEllipsis <em>Ellipsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ellipsis</em>' attribute.
	 * @see #getEllipsis()
	 * @generated
	 */
	void setEllipsis(String value);

} // TextStyle

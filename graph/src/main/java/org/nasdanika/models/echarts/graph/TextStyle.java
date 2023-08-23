/**
 */
package org.nasdanika.models.echarts.graph;

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getAlign <em>Align</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getVerticalAlign <em>Vertical Align</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderType <em>Border Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderDashOffset <em>Border Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderRadius <em>Border Radius</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getPadding <em>Padding</em>}</li>
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
 *   <li>{@link org.nasdanika.models.echarts.graph.TextStyle#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle()
 * @model
 * @generated
 */
public interface TextStyle extends Style {
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
	 * Returns the value of the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Ellipsis to be displayed when overflow is set to truncate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tag</em>' attribute.
	 * @see #setTag(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_Tag()
	 * @model
	 * @generated
	 */
	String getTag();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getTag <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tag</em>' attribute.
	 * @see #getTag()
	 * @generated
	 */
	void setTag(String value);

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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_Align()
	 * @model
	 * @generated
	 */
	Align getAlign();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getAlign <em>Align</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_VerticalAlign()
	 * @model
	 * @generated
	 */
	VerticalAlign getVerticalAlign();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getVerticalAlign <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vertical Align</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.VerticalAlign
	 * @see #getVerticalAlign()
	 * @generated
	 */
	void setVerticalAlign(VerticalAlign value);

	/**
	 * Returns the value of the '<em><b>Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Baseline</em>' attribute.
	 * @see #setBaseline(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_Baseline()
	 * @model
	 * @generated
	 */
	String getBaseline();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getBaseline <em>Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Baseline</em>' attribute.
	 * @see #getBaseline()
	 * @generated
	 */
	void setBaseline(String value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Background color of the text fragment.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #setBackgroundColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_BackgroundColor()
	 * @model
	 * @generated
	 */
	String getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getBackgroundColor <em>Background Color</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_BorderColor()
	 * @model
	 * @generated
	 */
	String getBorderColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderColor <em>Border Color</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_BorderWidth()
	 * @model
	 * @generated
	 */
	Integer getBorderWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderWidth <em>Border Width</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_BorderType()
	 * @model
	 * @generated
	 */
	BorderType getBorderType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderType <em>Border Type</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_BorderDashOffset()
	 * @model
	 * @generated
	 */
	Integer getBorderDashOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderDashOffset <em>Border Dash Offset</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_BorderRadius()
	 * @model
	 * @generated
	 */
	Integer getBorderRadius();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderRadius <em>Border Radius</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTextStyle_Padding()
	 * @model upper="4"
	 * @generated
	 */
	EList<Integer> getPadding();

} // TextStyle

/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tooltip</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Tooltip#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Tooltip#getFormatter <em>Formatter</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Tooltip#getValueFormatter <em>Value Formatter</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Tooltip#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Tooltip#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Tooltip#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Tooltip#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Tooltip#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Tooltip#getExtraCssText <em>Extra Css Text</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTooltip()
 * @model
 * @generated
 */
public interface Tooltip extends EObject {
	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The position of the tooltip's floating layer, which would follow the position of mouse by default.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTooltip_Position()
	 * @model
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Tooltip#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Formatter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The content formatter of tooltip's floating layer which supports string template and callback function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Formatter</em>' attribute.
	 * @see #setFormatter(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTooltip_Formatter()
	 * @model
	 * @generated
	 */
	String getFormatter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Tooltip#getFormatter <em>Formatter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formatter</em>' attribute.
	 * @see #getFormatter()
	 * @generated
	 */
	void setFormatter(String value);

	/**
	 * Returns the value of the '<em><b>Value Formatter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Callback function for formatting the value section in tooltip.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Formatter</em>' attribute.
	 * @see #setValueFormatter(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTooltip_ValueFormatter()
	 * @model
	 * @generated
	 */
	String getValueFormatter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Tooltip#getValueFormatter <em>Value Formatter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Formatter</em>' attribute.
	 * @see #getValueFormatter()
	 * @generated
	 */
	void setValueFormatter(String value);

	/**
	 * Returns the value of the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The background color of tooltip's floating layer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Background Color</em>' attribute.
	 * @see #setBackgroundColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTooltip_BackgroundColor()
	 * @model
	 * @generated
	 */
	String getBackgroundColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Tooltip#getBackgroundColor <em>Background Color</em>}' attribute.
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
	 * The border color of tooltip's floating layer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border Color</em>' attribute.
	 * @see #setBorderColor(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTooltip_BorderColor()
	 * @model
	 * @generated
	 */
	String getBorderColor();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Tooltip#getBorderColor <em>Border Color</em>}' attribute.
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
	 * The border width of tooltip's floating layer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Border Width</em>' attribute.
	 * @see #setBorderWidth(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTooltip_BorderWidth()
	 * @model
	 * @generated
	 */
	Integer getBorderWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Tooltip#getBorderWidth <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Border Width</em>' attribute.
	 * @see #getBorderWidth()
	 * @generated
	 */
	void setBorderWidth(Integer value);

	/**
	 * Returns the value of the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The floating layer of tooltip space around content. The unit is px. Default values for each position are 5. And they can be set to different values with left, right, top, and bottom.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Padding</em>' attribute.
	 * @see #setPadding(Integer)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTooltip_Padding()
	 * @model
	 * @generated
	 */
	Integer getPadding();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Tooltip#getPadding <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Padding</em>' attribute.
	 * @see #getPadding()
	 * @generated
	 */
	void setPadding(Integer value);

	/**
	 * Returns the value of the '<em><b>Text Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The text style of tooltip's floating layer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Text Style</em>' containment reference.
	 * @see #setTextStyle(TextStyle)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTooltip_TextStyle()
	 * @model containment="true"
	 * @generated
	 */
	TextStyle getTextStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Tooltip#getTextStyle <em>Text Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text Style</em>' containment reference.
	 * @see #getTextStyle()
	 * @generated
	 */
	void setTextStyle(TextStyle value);

	/**
	 * Returns the value of the '<em><b>Extra Css Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Extra CSS style for floating layer.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Extra Css Text</em>' attribute.
	 * @see #setExtraCssText(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getTooltip_ExtraCssText()
	 * @model
	 * @generated
	 */
	String getExtraCssText();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Tooltip#getExtraCssText <em>Extra Css Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extra Css Text</em>' attribute.
	 * @see #getExtraCssText()
	 * @generated
	 */
	void setExtraCssText(String value);

} // Tooltip

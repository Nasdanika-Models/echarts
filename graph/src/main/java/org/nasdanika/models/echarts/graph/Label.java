/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.icepear.echarts.origin.util.SeriesLabelOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getFormatter <em>Formatter</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getShow <em>Show</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getMinMargin <em>Min Margin</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getOverflow <em>Overflow</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getSilent <em>Silent</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getValueAnimation <em>Value Animation</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Label#getRich <em>Rich</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel()
 * @model
 * @generated
 */
public interface Label extends TextStyle {

	/**
	 * Returns the value of the '<em><b>Formatter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Formatter</em>' attribute.
	 * @see #setFormatter(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Formatter()
	 * @model
	 * @generated
	 */
	String getFormatter();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getFormatter <em>Formatter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Formatter</em>' attribute.
	 * @see #getFormatter()
	 * @generated
	 */
	void setFormatter(String value);

	/**
	 * Returns the value of the '<em><b>Show</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to show label
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Show</em>' attribute.
	 * @see #setShow(Boolean)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Show()
	 * @model default="true"
	 * @generated
	 */
	Boolean getShow();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getShow <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show</em>' attribute.
	 * @see #getShow()
	 * @generated
	 */
	void setShow(Boolean value);

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
	 * Returns the value of the '<em><b>Min Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotate label, from -90 degree to 90, positive value represents rotate anti-clockwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Min Margin</em>' attribute.
	 * @see #setMinMargin(Double)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_MinMargin()
	 * @model
	 * @generated
	 */
	Double getMinMargin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getMinMargin <em>Min Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Min Margin</em>' attribute.
	 * @see #getMinMargin()
	 * @generated
	 */
	void setMinMargin(Double value);

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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Overflow()
	 * @model
	 * @generated
	 */
	Overflow getOverflow();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getOverflow <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Overflow</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.Overflow
	 * @see #getOverflow()
	 * @generated
	 */
	void setOverflow(Overflow value);

	/**
	 * Returns the value of the '<em><b>Silent</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to show label
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Silent</em>' attribute.
	 * @see #setSilent(Boolean)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Silent()
	 * @model default="true"
	 * @generated
	 */
	Boolean getSilent();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getSilent <em>Silent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Silent</em>' attribute.
	 * @see #getSilent()
	 * @generated
	 */
	void setSilent(Boolean value);

	/**
	 * Returns the value of the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Rotate label, from -90 degree to 90, positive value represents rotate anti-clockwise.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Precision</em>' attribute.
	 * @see #setPrecision(Double)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Precision()
	 * @model
	 * @generated
	 */
	Double getPrecision();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getPrecision <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precision</em>' attribute.
	 * @see #getPrecision()
	 * @generated
	 */
	void setPrecision(Double value);

	/**
	 * Returns the value of the '<em><b>Value Animation</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to show label
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Value Animation</em>' attribute.
	 * @see #setValueAnimation(Boolean)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_ValueAnimation()
	 * @model default="true"
	 * @generated
	 */
	Boolean getValueAnimation();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Label#getValueAnimation <em>Value Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Animation</em>' attribute.
	 * @see #getValueAnimation()
	 * @generated
	 */
	void setValueAnimation(Boolean value);

	/**
	 * Returns the value of the '<em><b>Rich</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link org.nasdanika.models.echarts.graph.TextStyle},
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Whether to show label
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rich</em>' map.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLabel_Rich()
	 * @model mapType="org.nasdanika.models.echarts.graph.TextStyleEntry&lt;org.eclipse.emf.ecore.EString, org.nasdanika.models.echarts.graph.TextStyle&gt;"
	 * @generated
	 */
	EMap<String, TextStyle> getRich();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.models.echarts.graph.SeriesLabelOption"
	 * @generated
	 */
	SeriesLabelOption createSeriesLabelOption();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.models.echarts.graph.SeriesLineLabelOption"
	 * @generated
	 */
	SeriesLineLabelOption createSeriesLineLabelOption();
} // Label

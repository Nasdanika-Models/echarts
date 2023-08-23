/**
 */
package org.nasdanika.models.echarts.graph;

import org.icepear.echarts.origin.chart.graph.GraphEdgeLineStyleOption;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.LineStyle#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.LineStyle#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.LineStyle#getDashOffset <em>Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.LineStyle#getCap <em>Cap</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.LineStyle#getJoin <em>Join</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.LineStyle#getMiterLimit <em>Miter Limit</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.LineStyle#getCurveness <em>Curveness</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLineStyle()
 * @model
 * @generated
 */
public interface LineStyle extends Style {
	/**
	 * Returns the value of the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Width</em>' attribute.
	 * @see #setWidth(int)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLineStyle_Width()
	 * @model
	 * @generated
	 */
	int getWidth();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.LineStyle#getWidth <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Width</em>' attribute.
	 * @see #getWidth()
	 * @generated
	 */
	void setWidth(int value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.BorderType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderType
	 * @see #setType(BorderType)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLineStyle_Type()
	 * @model
	 * @generated
	 */
	BorderType getType();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.LineStyle#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderType
	 * @see #getType()
	 * @generated
	 */
	void setType(BorderType value);

	/**
	 * Returns the value of the '<em><b>Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dash Offset</em>' attribute.
	 * @see #setDashOffset(int)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLineStyle_DashOffset()
	 * @model
	 * @generated
	 */
	int getDashOffset();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.LineStyle#getDashOffset <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dash Offset</em>' attribute.
	 * @see #getDashOffset()
	 * @generated
	 */
	void setDashOffset(int value);

	/**
	 * Returns the value of the '<em><b>Cap</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.BorderCap}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cap</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderCap
	 * @see #setCap(BorderCap)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLineStyle_Cap()
	 * @model
	 * @generated
	 */
	BorderCap getCap();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.LineStyle#getCap <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cap</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderCap
	 * @see #getCap()
	 * @generated
	 */
	void setCap(BorderCap value);

	/**
	 * Returns the value of the '<em><b>Join</b></em>' attribute.
	 * The literals are from the enumeration {@link org.nasdanika.models.echarts.graph.BorderJoin}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderJoin
	 * @see #setJoin(BorderJoin)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLineStyle_Join()
	 * @model
	 * @generated
	 */
	BorderJoin getJoin();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.LineStyle#getJoin <em>Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join</em>' attribute.
	 * @see org.nasdanika.models.echarts.graph.BorderJoin
	 * @see #getJoin()
	 * @generated
	 */
	void setJoin(BorderJoin value);

	/**
	 * Returns the value of the '<em><b>Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Miter Limit</em>' attribute.
	 * @see #setMiterLimit(int)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLineStyle_MiterLimit()
	 * @model
	 * @generated
	 */
	int getMiterLimit();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.LineStyle#getMiterLimit <em>Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Miter Limit</em>' attribute.
	 * @see #getMiterLimit()
	 * @generated
	 */
	void setMiterLimit(int value);

	/**
	 * Returns the value of the '<em><b>Curveness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Curveness</em>' attribute.
	 * @see #setCurveness(Double)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLineStyle_Curveness()
	 * @model
	 * @generated
	 */
	Double getCurveness();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.LineStyle#getCurveness <em>Curveness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Curveness</em>' attribute.
	 * @see #getCurveness()
	 * @generated
	 */
	void setCurveness(Double value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.models.echarts.graph.GraphEdgeLineStyleOption"
	 * @generated
	 */
	GraphEdgeLineStyleOption createGraphEdgeLineStyleOption();

} // LineStyle

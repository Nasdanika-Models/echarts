/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.icepear.echarts.charts.graph.GraphEdgeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getBlur <em>Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getSelect <em>Select</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getSymbolSize <em>Symbol Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getIgnoreForceLayout <em>Ignore Force Layout</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.echarts.graph.Node#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Node)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_Target()
	 * @see org.nasdanika.models.echarts.graph.Node#getIncomingLinks
	 * @model opposite="incomingLinks"
	 * @generated
	 */
	Node getTarget();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Link#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Node value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' reference list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_Value()
	 * @model
	 * @generated
	 */
	EList<EObject> getValue();

	/**
	 * Returns the value of the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line Style</em>' containment reference.
	 * @see #setLineStyle(LineStyle)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_LineStyle()
	 * @model containment="true"
	 * @generated
	 */
	LineStyle getLineStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Link#getLineStyle <em>Line Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line Style</em>' containment reference.
	 * @see #getLineStyle()
	 * @generated
	 */
	void setLineStyle(LineStyle value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_Label()
	 * @model containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Link#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);

	/**
	 * Returns the value of the '<em><b>Emphasis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emphasis state of specified node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Emphasis</em>' containment reference.
	 * @see #setEmphasis(LineState)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_Emphasis()
	 * @model containment="true"
	 * @generated
	 */
	LineState getEmphasis();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Link#getEmphasis <em>Emphasis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emphasis</em>' containment reference.
	 * @see #getEmphasis()
	 * @generated
	 */
	void setEmphasis(LineState value);

	/**
	 * Returns the value of the '<em><b>Blur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Blur state of specified node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blur</em>' containment reference.
	 * @see #setBlur(LineState)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_Blur()
	 * @model containment="true"
	 * @generated
	 */
	LineState getBlur();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Link#getBlur <em>Blur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blur</em>' containment reference.
	 * @see #getBlur()
	 * @generated
	 */
	void setBlur(LineState value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Select state of specified node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(LineState)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_Select()
	 * @model containment="true"
	 * @generated
	 */
	LineState getSelect();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Link#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(LineState value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symbol of edge ends. Can be an array with two item to specify two ends, or a string specifies both ends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Link#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Symbol Size</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symbol size of edge ends. Can be an array with two item to specify two ends, or a string specifies both ends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol Size</em>' attribute list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_SymbolSize()
	 * @model upper="2"
	 * @generated
	 */
	EList<Double> getSymbolSize();

	/**
	 * Returns the value of the '<em><b>Ignore Force Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prevent this edge from force layout calculating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Force Layout</em>' attribute.
	 * @see #setIgnoreForceLayout(Boolean)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_IgnoreForceLayout()
	 * @model
	 * @generated
	 */
	Boolean getIgnoreForceLayout();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Link#getIgnoreForceLayout <em>Ignore Force Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Force Layout</em>' attribute.
	 * @see #getIgnoreForceLayout()
	 * @generated
	 */
	void setIgnoreForceLayout(Boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.models.echarts.graph.GraphEdgeItem"
	 * @generated
	 */
	GraphEdgeItem createGraphEdgeItem();

} // Link

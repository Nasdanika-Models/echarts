/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getSource <em>Source</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getBlur <em>Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getSelect <em>Select</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#getSymbolSize <em>Symbol Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Link#isIgnoreForceLayout <em>Ignore Force Layout</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends GraphElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.echarts.graph.Node#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' container reference.
	 * @see #setSource(Node)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_Source()
	 * @see org.nasdanika.models.echarts.graph.Node#getOutgoingLinks
	 * @model opposite="outgoingLinks" transient="false"
	 * @generated
	 */
	Node getSource();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Link#getSource <em>Source</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' container reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Node value);

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
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_Value()
	 * @model
	 * @generated
	 */
	EList<Double> getValue();

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
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Symbol of edge ends. Can be an array with two item to specify two ends, or a string specifies both ends.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_Symbol()
	 * @model upper="2"
	 * @generated
	 */
	EList<String> getSymbol();

	/**
	 * Returns the value of the '<em><b>Symbol Size</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
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
	EList<String> getSymbolSize();

	/**
	 * Returns the value of the '<em><b>Ignore Force Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Prevent this edge from force layout calculating.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ignore Force Layout</em>' attribute.
	 * @see #setIgnoreForceLayout(boolean)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink_IgnoreForceLayout()
	 * @model
	 * @generated
	 */
	boolean isIgnoreForceLayout();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Link#isIgnoreForceLayout <em>Ignore Force Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ignore Force Layout</em>' attribute.
	 * @see #isIgnoreForceLayout()
	 * @generated
	 */
	void setIgnoreForceLayout(boolean value);

} // Link

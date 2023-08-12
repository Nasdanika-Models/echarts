/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.ecore.EObject;

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
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getLink()
 * @model
 * @generated
 */
public interface Link extends EObject {
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

} // Link

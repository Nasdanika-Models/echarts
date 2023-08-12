/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#isFixed <em>Fixed</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getTooltip <em>Tooltip</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends Item {

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(Double)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_X()
	 * @model
	 * @generated
	 */
	Double getX();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(Double value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(Double)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Y()
	 * @model
	 * @generated
	 */
	Double getY();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(Double value);

	/**
	 * Returns the value of the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * The list contents are of type {@link org.nasdanika.models.echarts.graph.Link}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.echarts.graph.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' containment reference list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_OutgoingLinks()
	 * @see org.nasdanika.models.echarts.graph.Link#getSource
	 * @model opposite="source" containment="true"
	 * @generated
	 */
	EList<Link> getOutgoingLinks();

	/**
	 * Returns the value of the '<em><b>Incoming Links</b></em>' reference list.
	 * The list contents are of type {@link org.nasdanika.models.echarts.graph.Link}.
	 * It is bidirectional and its opposite is '{@link org.nasdanika.models.echarts.graph.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Links</em>' reference list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_IncomingLinks()
	 * @see org.nasdanika.models.echarts.graph.Link#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Link> getIncomingLinks();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(Item)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Category()
	 * @model
	 * @generated
	 */
	Item getCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Item value);

	/**
	 * Returns the value of the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fixed</em>' attribute.
	 * @see #setFixed(boolean)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Fixed()
	 * @model
	 * @generated
	 */
	boolean isFixed();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#isFixed <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed</em>' attribute.
	 * @see #isFixed()
	 * @generated
	 */
	void setFixed(boolean value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Value()
	 * @model
	 * @generated
	 */
	EList<Double> getValue();

	/**
	 * Returns the value of the '<em><b>Tooltip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Emphasis state of specified node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tooltip</em>' containment reference.
	 * @see #setTooltip(Tooltip)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Tooltip()
	 * @model containment="true"
	 * @generated
	 */
	Tooltip getTooltip();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getTooltip <em>Tooltip</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tooltip</em>' containment reference.
	 * @see #getTooltip()
	 * @generated
	 */
	void setTooltip(Tooltip value);
} // Node

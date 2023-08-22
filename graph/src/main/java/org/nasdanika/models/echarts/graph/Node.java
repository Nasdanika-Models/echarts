/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.common.util.EList;
import org.icepear.echarts.charts.graph.GraphNodeItem;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#isFixed <em>Fixed</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getDraggable <em>Draggable</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Links</em>' containment reference list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_OutgoingLinks()
	 * @model containment="true"
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
	 * Returns the value of the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draggable</em>' attribute.
	 * @see #setDraggable(Boolean)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Draggable()
	 * @model
	 * @generated
	 */
	Boolean getDraggable();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getDraggable <em>Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draggable</em>' attribute.
	 * @see #getDraggable()
	 * @generated
	 */
	void setDraggable(Boolean value);

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="org.nasdanika.models.echarts.graph.GraphNodeItem"
	 * @generated
	 */
	GraphNodeItem createGraphNodeItem();
} // Node

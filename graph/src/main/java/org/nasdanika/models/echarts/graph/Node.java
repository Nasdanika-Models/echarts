/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#isFixed <em>Fixed</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getSymbolSize <em>Symbol Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getSymbolRotate <em>Symbol Rotate</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getSymbolOffset <em>Symbol Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#isSymbolKeepAspect <em>Symbol Keep Aspect</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getItemStyle <em>Item Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Node#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see #setCategory(Category)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Category()
	 * @model
	 * @generated
	 */
	Category getCategory();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(Category value);

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
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getSymbol <em>Symbol</em>}' attribute.
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
	 * @return the value of the '<em>Symbol Size</em>' attribute list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_SymbolSize()
	 * @model upper="2"
	 * @generated
	 */
	EList<Double> getSymbolSize();

	/**
	 * Returns the value of the '<em><b>Symbol Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Rotate</em>' attribute.
	 * @see #setSymbolRotate(Double)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_SymbolRotate()
	 * @model
	 * @generated
	 */
	Double getSymbolRotate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getSymbolRotate <em>Symbol Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Rotate</em>' attribute.
	 * @see #getSymbolRotate()
	 * @generated
	 */
	void setSymbolRotate(Double value);

	/**
	 * Returns the value of the '<em><b>Symbol Offset</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Offset</em>' attribute list.
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_SymbolOffset()
	 * @model upper="2"
	 * @generated
	 */
	EList<String> getSymbolOffset();

	/**
	 * Returns the value of the '<em><b>Symbol Keep Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol Keep Aspect</em>' attribute.
	 * @see #setSymbolKeepAspect(boolean)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_SymbolKeepAspect()
	 * @model
	 * @generated
	 */
	boolean isSymbolKeepAspect();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#isSymbolKeepAspect <em>Symbol Keep Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol Keep Aspect</em>' attribute.
	 * @see #isSymbolKeepAspect()
	 * @generated
	 */
	void setSymbolKeepAspect(boolean value);

	/**
	 * Returns the value of the '<em><b>Item Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Style</em>' containment reference.
	 * @see #setItemStyle(ItemStyle)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_ItemStyle()
	 * @model containment="true"
	 * @generated
	 */
	ItemStyle getItemStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getItemStyle <em>Item Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Style</em>' containment reference.
	 * @see #getItemStyle()
	 * @generated
	 */
	void setItemStyle(ItemStyle value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' containment reference.
	 * @see #setLabel(Label)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getNode_Label()
	 * @model containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Node#getLabel <em>Label</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' containment reference.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(Label value);
} // Node

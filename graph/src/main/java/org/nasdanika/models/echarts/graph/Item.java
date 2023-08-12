/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#getSymbolSize <em>Symbol Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#getSymbolRotate <em>Symbol Rotate</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#getSymbolOffset <em>Symbol Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#isSymbolKeepAspect <em>Symbol Keep Aspect</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#getItemStyle <em>Item Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#getBlur <em>Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.Item#getSelect <em>Select</em>}</li>
 * </ul>
 *
 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Item#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Item#getSymbol <em>Symbol</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_SymbolSize()
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_SymbolRotate()
	 * @model
	 * @generated
	 */
	Double getSymbolRotate();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Item#getSymbolRotate <em>Symbol Rotate</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_SymbolOffset()
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_SymbolKeepAspect()
	 * @model
	 * @generated
	 */
	boolean isSymbolKeepAspect();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Item#isSymbolKeepAspect <em>Symbol Keep Aspect</em>}' attribute.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_ItemStyle()
	 * @model containment="true"
	 * @generated
	 */
	ItemStyle getItemStyle();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Item#getItemStyle <em>Item Style</em>}' containment reference.
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
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_Label()
	 * @model containment="true"
	 * @generated
	 */
	Label getLabel();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Item#getLabel <em>Label</em>}' containment reference.
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
	 * @see #setEmphasis(ItemState)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_Emphasis()
	 * @model containment="true"
	 * @generated
	 */
	ItemState getEmphasis();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Item#getEmphasis <em>Emphasis</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Emphasis</em>' containment reference.
	 * @see #getEmphasis()
	 * @generated
	 */
	void setEmphasis(ItemState value);

	/**
	 * Returns the value of the '<em><b>Blur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Blur state of specified node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Blur</em>' containment reference.
	 * @see #setBlur(ItemState)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_Blur()
	 * @model containment="true"
	 * @generated
	 */
	ItemState getBlur();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Item#getBlur <em>Blur</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blur</em>' containment reference.
	 * @see #getBlur()
	 * @generated
	 */
	void setBlur(ItemState value);

	/**
	 * Returns the value of the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Select state of specified node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Select</em>' containment reference.
	 * @see #setSelect(ItemState)
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#getItem_Select()
	 * @model containment="true"
	 * @generated
	 */
	ItemState getSelect();

	/**
	 * Sets the value of the '{@link org.nasdanika.models.echarts.graph.Item#getSelect <em>Select</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Select</em>' containment reference.
	 * @see #getSelect()
	 * @generated
	 */
	void setSelect(ItemState value);

} // Item

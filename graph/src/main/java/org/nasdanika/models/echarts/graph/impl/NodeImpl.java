/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.echarts.graph.Category;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.ItemStyle;
import org.nasdanika.models.echarts.graph.Label;
import org.nasdanika.models.echarts.graph.Link;
import org.nasdanika.models.echarts.graph.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#isFixed <em>Fixed</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getSymbolSize <em>Symbol Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getSymbolRotate <em>Symbol Rotate</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getSymbolOffset <em>Symbol Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#isSymbolKeepAspect <em>Symbol Keep Aspect</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getItemStyle <em>Item Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends MinimalEObjectImpl.Container implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Double X_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Double Y_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_EDEFAULT = false;
	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getSymbolRotate() <em>Symbol Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolRotate()
	 * @generated
	 * @ordered
	 */
	protected static final Double SYMBOL_ROTATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isSymbolKeepAspect() <em>Symbol Keep Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSymbolKeepAspect()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYMBOL_KEEP_ASPECT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return (String)eDynamicGet(GraphPackage.NODE__NAME, GraphPackage.Literals.NODE__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GraphPackage.NODE__NAME, GraphPackage.Literals.NODE__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getX() {
		return (Double)eDynamicGet(GraphPackage.NODE__X, GraphPackage.Literals.NODE__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(Double newX) {
		eDynamicSet(GraphPackage.NODE__X, GraphPackage.Literals.NODE__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getY() {
		return (Double)eDynamicGet(GraphPackage.NODE__Y, GraphPackage.Literals.NODE__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(Double newY) {
		eDynamicSet(GraphPackage.NODE__Y, GraphPackage.Literals.NODE__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Link> getOutgoingLinks() {
		return (EList<Link>)eDynamicGet(GraphPackage.NODE__OUTGOING_LINKS, GraphPackage.Literals.NODE__OUTGOING_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Link> getIncomingLinks() {
		return (EList<Link>)eDynamicGet(GraphPackage.NODE__INCOMING_LINKS, GraphPackage.Literals.NODE__INCOMING_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getCategory() {
		return (Category)eDynamicGet(GraphPackage.NODE__CATEGORY, GraphPackage.Literals.NODE__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetCategory() {
		return (Category)eDynamicGet(GraphPackage.NODE__CATEGORY, GraphPackage.Literals.NODE__CATEGORY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(Category newCategory) {
		eDynamicSet(GraphPackage.NODE__CATEGORY, GraphPackage.Literals.NODE__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFixed() {
		return (Boolean)eDynamicGet(GraphPackage.NODE__FIXED, GraphPackage.Literals.NODE__FIXED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixed(boolean newFixed) {
		eDynamicSet(GraphPackage.NODE__FIXED, GraphPackage.Literals.NODE__FIXED, newFixed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Double> getValue() {
		return (EList<Double>)eDynamicGet(GraphPackage.NODE__VALUE, GraphPackage.Literals.NODE__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol() {
		return (String)eDynamicGet(GraphPackage.NODE__SYMBOL, GraphPackage.Literals.NODE__SYMBOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol) {
		eDynamicSet(GraphPackage.NODE__SYMBOL, GraphPackage.Literals.NODE__SYMBOL, newSymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Double> getSymbolSize() {
		return (EList<Double>)eDynamicGet(GraphPackage.NODE__SYMBOL_SIZE, GraphPackage.Literals.NODE__SYMBOL_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSymbolRotate() {
		return (Double)eDynamicGet(GraphPackage.NODE__SYMBOL_ROTATE, GraphPackage.Literals.NODE__SYMBOL_ROTATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbolRotate(Double newSymbolRotate) {
		eDynamicSet(GraphPackage.NODE__SYMBOL_ROTATE, GraphPackage.Literals.NODE__SYMBOL_ROTATE, newSymbolRotate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getSymbolOffset() {
		return (EList<String>)eDynamicGet(GraphPackage.NODE__SYMBOL_OFFSET, GraphPackage.Literals.NODE__SYMBOL_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSymbolKeepAspect() {
		return (Boolean)eDynamicGet(GraphPackage.NODE__SYMBOL_KEEP_ASPECT, GraphPackage.Literals.NODE__SYMBOL_KEEP_ASPECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbolKeepAspect(boolean newSymbolKeepAspect) {
		eDynamicSet(GraphPackage.NODE__SYMBOL_KEEP_ASPECT, GraphPackage.Literals.NODE__SYMBOL_KEEP_ASPECT, newSymbolKeepAspect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemStyle getItemStyle() {
		return (ItemStyle)eDynamicGet(GraphPackage.NODE__ITEM_STYLE, GraphPackage.Literals.NODE__ITEM_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemStyle(ItemStyle newItemStyle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newItemStyle, GraphPackage.NODE__ITEM_STYLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemStyle(ItemStyle newItemStyle) {
		eDynamicSet(GraphPackage.NODE__ITEM_STYLE, GraphPackage.Literals.NODE__ITEM_STYLE, newItemStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getLabel() {
		return (Label)eDynamicGet(GraphPackage.NODE__LABEL, GraphPackage.Literals.NODE__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabel, GraphPackage.NODE__LABEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(Label newLabel) {
		eDynamicSet(GraphPackage.NODE__LABEL, GraphPackage.Literals.NODE__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.NODE__OUTGOING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingLinks()).basicAdd(otherEnd, msgs);
			case GraphPackage.NODE__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.NODE__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
			case GraphPackage.NODE__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
			case GraphPackage.NODE__ITEM_STYLE:
				return basicSetItemStyle(null, msgs);
			case GraphPackage.NODE__LABEL:
				return basicSetLabel(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.NODE__NAME:
				return getName();
			case GraphPackage.NODE__X:
				return getX();
			case GraphPackage.NODE__Y:
				return getY();
			case GraphPackage.NODE__OUTGOING_LINKS:
				return getOutgoingLinks();
			case GraphPackage.NODE__INCOMING_LINKS:
				return getIncomingLinks();
			case GraphPackage.NODE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case GraphPackage.NODE__FIXED:
				return isFixed();
			case GraphPackage.NODE__VALUE:
				return getValue();
			case GraphPackage.NODE__SYMBOL:
				return getSymbol();
			case GraphPackage.NODE__SYMBOL_SIZE:
				return getSymbolSize();
			case GraphPackage.NODE__SYMBOL_ROTATE:
				return getSymbolRotate();
			case GraphPackage.NODE__SYMBOL_OFFSET:
				return getSymbolOffset();
			case GraphPackage.NODE__SYMBOL_KEEP_ASPECT:
				return isSymbolKeepAspect();
			case GraphPackage.NODE__ITEM_STYLE:
				return getItemStyle();
			case GraphPackage.NODE__LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case GraphPackage.NODE__X:
				setX((Double)newValue);
				return;
			case GraphPackage.NODE__Y:
				setY((Double)newValue);
				return;
			case GraphPackage.NODE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case GraphPackage.NODE__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case GraphPackage.NODE__CATEGORY:
				setCategory((Category)newValue);
				return;
			case GraphPackage.NODE__FIXED:
				setFixed((Boolean)newValue);
				return;
			case GraphPackage.NODE__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Double>)newValue);
				return;
			case GraphPackage.NODE__SYMBOL:
				setSymbol((String)newValue);
				return;
			case GraphPackage.NODE__SYMBOL_SIZE:
				getSymbolSize().clear();
				getSymbolSize().addAll((Collection<? extends Double>)newValue);
				return;
			case GraphPackage.NODE__SYMBOL_ROTATE:
				setSymbolRotate((Double)newValue);
				return;
			case GraphPackage.NODE__SYMBOL_OFFSET:
				getSymbolOffset().clear();
				getSymbolOffset().addAll((Collection<? extends String>)newValue);
				return;
			case GraphPackage.NODE__SYMBOL_KEEP_ASPECT:
				setSymbolKeepAspect((Boolean)newValue);
				return;
			case GraphPackage.NODE__ITEM_STYLE:
				setItemStyle((ItemStyle)newValue);
				return;
			case GraphPackage.NODE__LABEL:
				setLabel((Label)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GraphPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphPackage.NODE__X:
				setX(X_EDEFAULT);
				return;
			case GraphPackage.NODE__Y:
				setY(Y_EDEFAULT);
				return;
			case GraphPackage.NODE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				return;
			case GraphPackage.NODE__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case GraphPackage.NODE__CATEGORY:
				setCategory((Category)null);
				return;
			case GraphPackage.NODE__FIXED:
				setFixed(FIXED_EDEFAULT);
				return;
			case GraphPackage.NODE__VALUE:
				getValue().clear();
				return;
			case GraphPackage.NODE__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case GraphPackage.NODE__SYMBOL_SIZE:
				getSymbolSize().clear();
				return;
			case GraphPackage.NODE__SYMBOL_ROTATE:
				setSymbolRotate(SYMBOL_ROTATE_EDEFAULT);
				return;
			case GraphPackage.NODE__SYMBOL_OFFSET:
				getSymbolOffset().clear();
				return;
			case GraphPackage.NODE__SYMBOL_KEEP_ASPECT:
				setSymbolKeepAspect(SYMBOL_KEEP_ASPECT_EDEFAULT);
				return;
			case GraphPackage.NODE__ITEM_STYLE:
				setItemStyle((ItemStyle)null);
				return;
			case GraphPackage.NODE__LABEL:
				setLabel((Label)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GraphPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GraphPackage.NODE__X:
				return X_EDEFAULT == null ? getX() != null : !X_EDEFAULT.equals(getX());
			case GraphPackage.NODE__Y:
				return Y_EDEFAULT == null ? getY() != null : !Y_EDEFAULT.equals(getY());
			case GraphPackage.NODE__OUTGOING_LINKS:
				return !getOutgoingLinks().isEmpty();
			case GraphPackage.NODE__INCOMING_LINKS:
				return !getIncomingLinks().isEmpty();
			case GraphPackage.NODE__CATEGORY:
				return basicGetCategory() != null;
			case GraphPackage.NODE__FIXED:
				return isFixed() != FIXED_EDEFAULT;
			case GraphPackage.NODE__VALUE:
				return !getValue().isEmpty();
			case GraphPackage.NODE__SYMBOL:
				return SYMBOL_EDEFAULT == null ? getSymbol() != null : !SYMBOL_EDEFAULT.equals(getSymbol());
			case GraphPackage.NODE__SYMBOL_SIZE:
				return !getSymbolSize().isEmpty();
			case GraphPackage.NODE__SYMBOL_ROTATE:
				return SYMBOL_ROTATE_EDEFAULT == null ? getSymbolRotate() != null : !SYMBOL_ROTATE_EDEFAULT.equals(getSymbolRotate());
			case GraphPackage.NODE__SYMBOL_OFFSET:
				return !getSymbolOffset().isEmpty();
			case GraphPackage.NODE__SYMBOL_KEEP_ASPECT:
				return isSymbolKeepAspect() != SYMBOL_KEEP_ASPECT_EDEFAULT;
			case GraphPackage.NODE__ITEM_STYLE:
				return getItemStyle() != null;
			case GraphPackage.NODE__LABEL:
				return getLabel() != null;
		}
		return super.eIsSet(featureID);
	}

} //NodeImpl

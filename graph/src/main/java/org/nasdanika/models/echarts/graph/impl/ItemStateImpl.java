/**
 */
package org.nasdanika.models.echarts.graph.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.ItemState;
import org.nasdanika.models.echarts.graph.ItemStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStateImpl#getItemStyle <em>Item Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemStateImpl extends StateImpl implements ItemState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.ITEM_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemStyle getItemStyle() {
		return (ItemStyle)eDynamicGet(GraphPackage.ITEM_STATE__ITEM_STYLE, GraphPackage.Literals.ITEM_STATE__ITEM_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemStyle(ItemStyle newItemStyle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newItemStyle, GraphPackage.ITEM_STATE__ITEM_STYLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemStyle(ItemStyle newItemStyle) {
		eDynamicSet(GraphPackage.ITEM_STATE__ITEM_STYLE, GraphPackage.Literals.ITEM_STATE__ITEM_STYLE, newItemStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.ITEM_STATE__ITEM_STYLE:
				return basicSetItemStyle(null, msgs);
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
			case GraphPackage.ITEM_STATE__ITEM_STYLE:
				return getItemStyle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GraphPackage.ITEM_STATE__ITEM_STYLE:
				setItemStyle((ItemStyle)newValue);
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
			case GraphPackage.ITEM_STATE__ITEM_STYLE:
				setItemStyle((ItemStyle)null);
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
			case GraphPackage.ITEM_STATE__ITEM_STYLE:
				return getItemStyle() != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemStateImpl

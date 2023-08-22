/**
 */
package org.nasdanika.models.echarts.graph.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.ItemStyle;
import org.nasdanika.models.echarts.graph.LineStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getBorderStyle <em>Border Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemStyleImpl extends StyleImpl implements ItemStyle {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.ITEM_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStyle getBorderStyle() {
		return (LineStyle)eDynamicGet(GraphPackage.ITEM_STYLE__BORDER_STYLE, GraphPackage.Literals.ITEM_STYLE__BORDER_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBorderStyle(LineStyle newBorderStyle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBorderStyle, GraphPackage.ITEM_STYLE__BORDER_STYLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderStyle(LineStyle newBorderStyle) {
		eDynamicSet(GraphPackage.ITEM_STYLE__BORDER_STYLE, GraphPackage.Literals.ITEM_STYLE__BORDER_STYLE, newBorderStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.ITEM_STYLE__BORDER_STYLE:
				return basicSetBorderStyle(null, msgs);
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
			case GraphPackage.ITEM_STYLE__BORDER_STYLE:
				return getBorderStyle();
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
			case GraphPackage.ITEM_STYLE__BORDER_STYLE:
				setBorderStyle((LineStyle)newValue);
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
			case GraphPackage.ITEM_STYLE__BORDER_STYLE:
				setBorderStyle((LineStyle)null);
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
			case GraphPackage.ITEM_STYLE__BORDER_STYLE:
				return getBorderStyle() != null;
		}
		return super.eIsSet(featureID);
	}

} //ItemStyleImpl

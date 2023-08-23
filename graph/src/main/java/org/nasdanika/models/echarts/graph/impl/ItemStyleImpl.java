/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.nasdanika.models.echarts.graph.BorderCap;
import org.nasdanika.models.echarts.graph.BorderJoin;
import org.nasdanika.models.echarts.graph.BorderType;
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
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getDecal <em>Decal</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemStyleImpl extends StyleImpl implements ItemStyle {
	/**
	 * The default value of the '{@link #getDecal() <em>Decal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecal()
	 * @generated
	 * @ordered
	 */
	protected static final String DECAL_EDEFAULT = null;

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
	public String getDecal() {
		return (String)eDynamicGet(GraphPackage.ITEM_STYLE__DECAL, GraphPackage.Literals.ITEM_STYLE__DECAL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDecal(String newDecal) {
		eDynamicSet(GraphPackage.ITEM_STYLE__DECAL, GraphPackage.Literals.ITEM_STYLE__DECAL, newDecal);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public ItemStyleOption createItemStyleOption() {
		ItemStyleOption itemStyleOption = new org.icepear.echarts.components.series.ItemStyle();
		
		itemStyleOption.setColor(getColor());
		itemStyleOption.setOpacity(getOpacity());
		itemStyleOption.setDecal(getDecal());

		itemStyleOption.setShadowBlur(getShadowBlur());
		itemStyleOption.setShadowColor(getShadowColor());
		itemStyleOption.setShadowOffsetX(getShadowOffsetX());
		itemStyleOption.setShadowOffsetY(getShadowOffsetY());
		
		LineStyle borderStyle = getBorderStyle();
		if (borderStyle != null) {
			itemStyleOption.setBorderColor(borderStyle.getColor());
			itemStyleOption.setBorderWidth(borderStyle.getWidth());
			BorderType borderType = borderStyle.getType();
			if (borderType != null) {
				itemStyleOption.setBorderType(borderType.getLiteral());
			}
			BorderCap cap = borderStyle.getCap();
			if (cap != null) {
				itemStyleOption.setBorderCap(cap.getLiteral());
			}
			BorderJoin join = borderStyle.getJoin();
			if (join != null) {
				itemStyleOption.setBorderJoin(join.getLiteral());
			}
			itemStyleOption.setBorderDashOffset(borderStyle.getDashOffset());
			itemStyleOption.setBorderMiterLimit(borderStyle.getMiterLimit());
		}		
		
		return itemStyleOption;
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
			case GraphPackage.ITEM_STYLE__DECAL:
				return getDecal();
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
			case GraphPackage.ITEM_STYLE__DECAL:
				setDecal((String)newValue);
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
			case GraphPackage.ITEM_STYLE__DECAL:
				setDecal(DECAL_EDEFAULT);
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
			case GraphPackage.ITEM_STYLE__DECAL:
				return DECAL_EDEFAULT == null ? getDecal() != null : !DECAL_EDEFAULT.equals(getDecal());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphPackage.ITEM_STYLE___CREATE_ITEM_STYLE_OPTION:
				return createItemStyleOption();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ItemStyleImpl

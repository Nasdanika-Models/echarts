/**
 */
package org.nasdanika.models.echarts.graph.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.echarts.graph.BorderCap;
import org.nasdanika.models.echarts.graph.BorderJoin;
import org.nasdanika.models.echarts.graph.BorderType;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.ItemStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getBorderType <em>Border Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getBorderDashOffset <em>Border Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getBorderCap <em>Border Cap</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getBorderJoin <em>Border Join</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getBorderMiterLimit <em>Border Miter Limit</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getShadowBlur <em>Shadow Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getShadowColor <em>Shadow Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getShadowOffsetX <em>Shadow Offset X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getShadowOffsetY <em>Shadow Offset Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl#getOpacity <em>Opacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemStyleImpl extends MinimalEObjectImpl.Container implements ItemStyle {
	/**
	 * The default value of the '{@link #getColor() <em>Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColor()
	 * @generated
	 * @ordered
	 */
	protected static final String COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBorderColor() <em>Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BORDER_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBorderWidth() <em>Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_WIDTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getBorderType() <em>Border Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderType()
	 * @generated
	 * @ordered
	 */
	protected static final BorderType BORDER_TYPE_EDEFAULT = BorderType.SOLID;

	/**
	 * The default value of the '{@link #getBorderDashOffset() <em>Border Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderDashOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_DASH_OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getBorderCap() <em>Border Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderCap()
	 * @generated
	 * @ordered
	 */
	protected static final BorderCap BORDER_CAP_EDEFAULT = BorderCap.BUTT;

	/**
	 * The default value of the '{@link #getBorderJoin() <em>Border Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderJoin()
	 * @generated
	 * @ordered
	 */
	protected static final BorderJoin BORDER_JOIN_EDEFAULT = BorderJoin.BEVEL;

	/**
	 * The default value of the '{@link #getBorderMiterLimit() <em>Border Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderMiterLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int BORDER_MITER_LIMIT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getShadowBlur() <em>Shadow Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowBlur()
	 * @generated
	 * @ordered
	 */
	protected static final int SHADOW_BLUR_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getShadowColor() <em>Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowColor()
	 * @generated
	 * @ordered
	 */
	protected static final String SHADOW_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getShadowOffsetX() <em>Shadow Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowOffsetX()
	 * @generated
	 * @ordered
	 */
	protected static final Double SHADOW_OFFSET_X_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getShadowOffsetY() <em>Shadow Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowOffsetY()
	 * @generated
	 * @ordered
	 */
	protected static final Double SHADOW_OFFSET_Y_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpacity()
	 * @generated
	 * @ordered
	 */
	protected static final double OPACITY_EDEFAULT = 0.0;

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
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return (String)eDynamicGet(GraphPackage.ITEM_STYLE__COLOR, GraphPackage.Literals.ITEM_STYLE__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		eDynamicSet(GraphPackage.ITEM_STYLE__COLOR, GraphPackage.Literals.ITEM_STYLE__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderColor() {
		return (String)eDynamicGet(GraphPackage.ITEM_STYLE__BORDER_COLOR, GraphPackage.Literals.ITEM_STYLE__BORDER_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderColor(String newBorderColor) {
		eDynamicSet(GraphPackage.ITEM_STYLE__BORDER_COLOR, GraphPackage.Literals.ITEM_STYLE__BORDER_COLOR, newBorderColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBorderWidth() {
		return (Integer)eDynamicGet(GraphPackage.ITEM_STYLE__BORDER_WIDTH, GraphPackage.Literals.ITEM_STYLE__BORDER_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderWidth(int newBorderWidth) {
		eDynamicSet(GraphPackage.ITEM_STYLE__BORDER_WIDTH, GraphPackage.Literals.ITEM_STYLE__BORDER_WIDTH, newBorderWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorderType getBorderType() {
		return (BorderType)eDynamicGet(GraphPackage.ITEM_STYLE__BORDER_TYPE, GraphPackage.Literals.ITEM_STYLE__BORDER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderType(BorderType newBorderType) {
		eDynamicSet(GraphPackage.ITEM_STYLE__BORDER_TYPE, GraphPackage.Literals.ITEM_STYLE__BORDER_TYPE, newBorderType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBorderDashOffset() {
		return (Integer)eDynamicGet(GraphPackage.ITEM_STYLE__BORDER_DASH_OFFSET, GraphPackage.Literals.ITEM_STYLE__BORDER_DASH_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderDashOffset(int newBorderDashOffset) {
		eDynamicSet(GraphPackage.ITEM_STYLE__BORDER_DASH_OFFSET, GraphPackage.Literals.ITEM_STYLE__BORDER_DASH_OFFSET, newBorderDashOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorderCap getBorderCap() {
		return (BorderCap)eDynamicGet(GraphPackage.ITEM_STYLE__BORDER_CAP, GraphPackage.Literals.ITEM_STYLE__BORDER_CAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderCap(BorderCap newBorderCap) {
		eDynamicSet(GraphPackage.ITEM_STYLE__BORDER_CAP, GraphPackage.Literals.ITEM_STYLE__BORDER_CAP, newBorderCap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorderJoin getBorderJoin() {
		return (BorderJoin)eDynamicGet(GraphPackage.ITEM_STYLE__BORDER_JOIN, GraphPackage.Literals.ITEM_STYLE__BORDER_JOIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderJoin(BorderJoin newBorderJoin) {
		eDynamicSet(GraphPackage.ITEM_STYLE__BORDER_JOIN, GraphPackage.Literals.ITEM_STYLE__BORDER_JOIN, newBorderJoin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getBorderMiterLimit() {
		return (Integer)eDynamicGet(GraphPackage.ITEM_STYLE__BORDER_MITER_LIMIT, GraphPackage.Literals.ITEM_STYLE__BORDER_MITER_LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderMiterLimit(int newBorderMiterLimit) {
		eDynamicSet(GraphPackage.ITEM_STYLE__BORDER_MITER_LIMIT, GraphPackage.Literals.ITEM_STYLE__BORDER_MITER_LIMIT, newBorderMiterLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getShadowBlur() {
		return (Integer)eDynamicGet(GraphPackage.ITEM_STYLE__SHADOW_BLUR, GraphPackage.Literals.ITEM_STYLE__SHADOW_BLUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowBlur(int newShadowBlur) {
		eDynamicSet(GraphPackage.ITEM_STYLE__SHADOW_BLUR, GraphPackage.Literals.ITEM_STYLE__SHADOW_BLUR, newShadowBlur);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShadowColor() {
		return (String)eDynamicGet(GraphPackage.ITEM_STYLE__SHADOW_COLOR, GraphPackage.Literals.ITEM_STYLE__SHADOW_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowColor(String newShadowColor) {
		eDynamicSet(GraphPackage.ITEM_STYLE__SHADOW_COLOR, GraphPackage.Literals.ITEM_STYLE__SHADOW_COLOR, newShadowColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getShadowOffsetX() {
		return (Double)eDynamicGet(GraphPackage.ITEM_STYLE__SHADOW_OFFSET_X, GraphPackage.Literals.ITEM_STYLE__SHADOW_OFFSET_X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowOffsetX(Double newShadowOffsetX) {
		eDynamicSet(GraphPackage.ITEM_STYLE__SHADOW_OFFSET_X, GraphPackage.Literals.ITEM_STYLE__SHADOW_OFFSET_X, newShadowOffsetX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getShadowOffsetY() {
		return (Double)eDynamicGet(GraphPackage.ITEM_STYLE__SHADOW_OFFSET_Y, GraphPackage.Literals.ITEM_STYLE__SHADOW_OFFSET_Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowOffsetY(Double newShadowOffsetY) {
		eDynamicSet(GraphPackage.ITEM_STYLE__SHADOW_OFFSET_Y, GraphPackage.Literals.ITEM_STYLE__SHADOW_OFFSET_Y, newShadowOffsetY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOpacity() {
		return (Double)eDynamicGet(GraphPackage.ITEM_STYLE__OPACITY, GraphPackage.Literals.ITEM_STYLE__OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpacity(double newOpacity) {
		eDynamicSet(GraphPackage.ITEM_STYLE__OPACITY, GraphPackage.Literals.ITEM_STYLE__OPACITY, newOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.ITEM_STYLE__COLOR:
				return getColor();
			case GraphPackage.ITEM_STYLE__BORDER_COLOR:
				return getBorderColor();
			case GraphPackage.ITEM_STYLE__BORDER_WIDTH:
				return getBorderWidth();
			case GraphPackage.ITEM_STYLE__BORDER_TYPE:
				return getBorderType();
			case GraphPackage.ITEM_STYLE__BORDER_DASH_OFFSET:
				return getBorderDashOffset();
			case GraphPackage.ITEM_STYLE__BORDER_CAP:
				return getBorderCap();
			case GraphPackage.ITEM_STYLE__BORDER_JOIN:
				return getBorderJoin();
			case GraphPackage.ITEM_STYLE__BORDER_MITER_LIMIT:
				return getBorderMiterLimit();
			case GraphPackage.ITEM_STYLE__SHADOW_BLUR:
				return getShadowBlur();
			case GraphPackage.ITEM_STYLE__SHADOW_COLOR:
				return getShadowColor();
			case GraphPackage.ITEM_STYLE__SHADOW_OFFSET_X:
				return getShadowOffsetX();
			case GraphPackage.ITEM_STYLE__SHADOW_OFFSET_Y:
				return getShadowOffsetY();
			case GraphPackage.ITEM_STYLE__OPACITY:
				return getOpacity();
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
			case GraphPackage.ITEM_STYLE__COLOR:
				setColor((String)newValue);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_COLOR:
				setBorderColor((String)newValue);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_WIDTH:
				setBorderWidth((Integer)newValue);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_TYPE:
				setBorderType((BorderType)newValue);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_DASH_OFFSET:
				setBorderDashOffset((Integer)newValue);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_CAP:
				setBorderCap((BorderCap)newValue);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_JOIN:
				setBorderJoin((BorderJoin)newValue);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_MITER_LIMIT:
				setBorderMiterLimit((Integer)newValue);
				return;
			case GraphPackage.ITEM_STYLE__SHADOW_BLUR:
				setShadowBlur((Integer)newValue);
				return;
			case GraphPackage.ITEM_STYLE__SHADOW_COLOR:
				setShadowColor((String)newValue);
				return;
			case GraphPackage.ITEM_STYLE__SHADOW_OFFSET_X:
				setShadowOffsetX((Double)newValue);
				return;
			case GraphPackage.ITEM_STYLE__SHADOW_OFFSET_Y:
				setShadowOffsetY((Double)newValue);
				return;
			case GraphPackage.ITEM_STYLE__OPACITY:
				setOpacity((Double)newValue);
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
			case GraphPackage.ITEM_STYLE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_TYPE:
				setBorderType(BORDER_TYPE_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_DASH_OFFSET:
				setBorderDashOffset(BORDER_DASH_OFFSET_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_CAP:
				setBorderCap(BORDER_CAP_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_JOIN:
				setBorderJoin(BORDER_JOIN_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__BORDER_MITER_LIMIT:
				setBorderMiterLimit(BORDER_MITER_LIMIT_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__SHADOW_BLUR:
				setShadowBlur(SHADOW_BLUR_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__SHADOW_COLOR:
				setShadowColor(SHADOW_COLOR_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__SHADOW_OFFSET_X:
				setShadowOffsetX(SHADOW_OFFSET_X_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__SHADOW_OFFSET_Y:
				setShadowOffsetY(SHADOW_OFFSET_Y_EDEFAULT);
				return;
			case GraphPackage.ITEM_STYLE__OPACITY:
				setOpacity(OPACITY_EDEFAULT);
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
			case GraphPackage.ITEM_STYLE__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case GraphPackage.ITEM_STYLE__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? getBorderColor() != null : !BORDER_COLOR_EDEFAULT.equals(getBorderColor());
			case GraphPackage.ITEM_STYLE__BORDER_WIDTH:
				return getBorderWidth() != BORDER_WIDTH_EDEFAULT;
			case GraphPackage.ITEM_STYLE__BORDER_TYPE:
				return getBorderType() != BORDER_TYPE_EDEFAULT;
			case GraphPackage.ITEM_STYLE__BORDER_DASH_OFFSET:
				return getBorderDashOffset() != BORDER_DASH_OFFSET_EDEFAULT;
			case GraphPackage.ITEM_STYLE__BORDER_CAP:
				return getBorderCap() != BORDER_CAP_EDEFAULT;
			case GraphPackage.ITEM_STYLE__BORDER_JOIN:
				return getBorderJoin() != BORDER_JOIN_EDEFAULT;
			case GraphPackage.ITEM_STYLE__BORDER_MITER_LIMIT:
				return getBorderMiterLimit() != BORDER_MITER_LIMIT_EDEFAULT;
			case GraphPackage.ITEM_STYLE__SHADOW_BLUR:
				return getShadowBlur() != SHADOW_BLUR_EDEFAULT;
			case GraphPackage.ITEM_STYLE__SHADOW_COLOR:
				return SHADOW_COLOR_EDEFAULT == null ? getShadowColor() != null : !SHADOW_COLOR_EDEFAULT.equals(getShadowColor());
			case GraphPackage.ITEM_STYLE__SHADOW_OFFSET_X:
				return SHADOW_OFFSET_X_EDEFAULT == null ? getShadowOffsetX() != null : !SHADOW_OFFSET_X_EDEFAULT.equals(getShadowOffsetX());
			case GraphPackage.ITEM_STYLE__SHADOW_OFFSET_Y:
				return SHADOW_OFFSET_Y_EDEFAULT == null ? getShadowOffsetY() != null : !SHADOW_OFFSET_Y_EDEFAULT.equals(getShadowOffsetY());
			case GraphPackage.ITEM_STYLE__OPACITY:
				return getOpacity() != OPACITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ItemStyleImpl

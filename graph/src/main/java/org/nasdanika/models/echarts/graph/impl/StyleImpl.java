/**
 */
package org.nasdanika.models.echarts.graph.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Style;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.StyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.StyleImpl#getShadowBlur <em>Shadow Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.StyleImpl#getShadowColor <em>Shadow Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.StyleImpl#getShadowOffsetX <em>Shadow Offset X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.StyleImpl#getShadowOffsetY <em>Shadow Offset Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.StyleImpl#getOpacity <em>Opacity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyleImpl extends GraphElementImpl implements Style {
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
	protected StyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getColor() {
		return (String)eDynamicGet(GraphPackage.STYLE__COLOR, GraphPackage.Literals.STYLE__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		eDynamicSet(GraphPackage.STYLE__COLOR, GraphPackage.Literals.STYLE__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getShadowBlur() {
		return (Integer)eDynamicGet(GraphPackage.STYLE__SHADOW_BLUR, GraphPackage.Literals.STYLE__SHADOW_BLUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowBlur(int newShadowBlur) {
		eDynamicSet(GraphPackage.STYLE__SHADOW_BLUR, GraphPackage.Literals.STYLE__SHADOW_BLUR, newShadowBlur);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShadowColor() {
		return (String)eDynamicGet(GraphPackage.STYLE__SHADOW_COLOR, GraphPackage.Literals.STYLE__SHADOW_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowColor(String newShadowColor) {
		eDynamicSet(GraphPackage.STYLE__SHADOW_COLOR, GraphPackage.Literals.STYLE__SHADOW_COLOR, newShadowColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getShadowOffsetX() {
		return (Double)eDynamicGet(GraphPackage.STYLE__SHADOW_OFFSET_X, GraphPackage.Literals.STYLE__SHADOW_OFFSET_X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowOffsetX(Double newShadowOffsetX) {
		eDynamicSet(GraphPackage.STYLE__SHADOW_OFFSET_X, GraphPackage.Literals.STYLE__SHADOW_OFFSET_X, newShadowOffsetX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getShadowOffsetY() {
		return (Double)eDynamicGet(GraphPackage.STYLE__SHADOW_OFFSET_Y, GraphPackage.Literals.STYLE__SHADOW_OFFSET_Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowOffsetY(Double newShadowOffsetY) {
		eDynamicSet(GraphPackage.STYLE__SHADOW_OFFSET_Y, GraphPackage.Literals.STYLE__SHADOW_OFFSET_Y, newShadowOffsetY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getOpacity() {
		return (Double)eDynamicGet(GraphPackage.STYLE__OPACITY, GraphPackage.Literals.STYLE__OPACITY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOpacity(double newOpacity) {
		eDynamicSet(GraphPackage.STYLE__OPACITY, GraphPackage.Literals.STYLE__OPACITY, newOpacity);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.STYLE__COLOR:
				return getColor();
			case GraphPackage.STYLE__SHADOW_BLUR:
				return getShadowBlur();
			case GraphPackage.STYLE__SHADOW_COLOR:
				return getShadowColor();
			case GraphPackage.STYLE__SHADOW_OFFSET_X:
				return getShadowOffsetX();
			case GraphPackage.STYLE__SHADOW_OFFSET_Y:
				return getShadowOffsetY();
			case GraphPackage.STYLE__OPACITY:
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
			case GraphPackage.STYLE__COLOR:
				setColor((String)newValue);
				return;
			case GraphPackage.STYLE__SHADOW_BLUR:
				setShadowBlur((Integer)newValue);
				return;
			case GraphPackage.STYLE__SHADOW_COLOR:
				setShadowColor((String)newValue);
				return;
			case GraphPackage.STYLE__SHADOW_OFFSET_X:
				setShadowOffsetX((Double)newValue);
				return;
			case GraphPackage.STYLE__SHADOW_OFFSET_Y:
				setShadowOffsetY((Double)newValue);
				return;
			case GraphPackage.STYLE__OPACITY:
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
			case GraphPackage.STYLE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case GraphPackage.STYLE__SHADOW_BLUR:
				setShadowBlur(SHADOW_BLUR_EDEFAULT);
				return;
			case GraphPackage.STYLE__SHADOW_COLOR:
				setShadowColor(SHADOW_COLOR_EDEFAULT);
				return;
			case GraphPackage.STYLE__SHADOW_OFFSET_X:
				setShadowOffsetX(SHADOW_OFFSET_X_EDEFAULT);
				return;
			case GraphPackage.STYLE__SHADOW_OFFSET_Y:
				setShadowOffsetY(SHADOW_OFFSET_Y_EDEFAULT);
				return;
			case GraphPackage.STYLE__OPACITY:
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
			case GraphPackage.STYLE__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case GraphPackage.STYLE__SHADOW_BLUR:
				return getShadowBlur() != SHADOW_BLUR_EDEFAULT;
			case GraphPackage.STYLE__SHADOW_COLOR:
				return SHADOW_COLOR_EDEFAULT == null ? getShadowColor() != null : !SHADOW_COLOR_EDEFAULT.equals(getShadowColor());
			case GraphPackage.STYLE__SHADOW_OFFSET_X:
				return SHADOW_OFFSET_X_EDEFAULT == null ? getShadowOffsetX() != null : !SHADOW_OFFSET_X_EDEFAULT.equals(getShadowOffsetX());
			case GraphPackage.STYLE__SHADOW_OFFSET_Y:
				return SHADOW_OFFSET_Y_EDEFAULT == null ? getShadowOffsetY() != null : !SHADOW_OFFSET_Y_EDEFAULT.equals(getShadowOffsetY());
			case GraphPackage.STYLE__OPACITY:
				return getOpacity() != OPACITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //StyleImpl

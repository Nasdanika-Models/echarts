/**
 */
package org.nasdanika.models.echarts.graph.impl;

import org.eclipse.emf.ecore.EClass;
import org.nasdanika.models.echarts.graph.BorderCap;
import org.nasdanika.models.echarts.graph.BorderJoin;
import org.nasdanika.models.echarts.graph.BorderType;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.LineStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LineStyleImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LineStyleImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LineStyleImpl#getDashOffset <em>Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LineStyleImpl#getCap <em>Cap</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LineStyleImpl#getJoin <em>Join</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LineStyleImpl#getMiterLimit <em>Miter Limit</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LineStyleImpl#getCurveness <em>Curveness</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineStyleImpl extends StyleImpl implements LineStyle {
	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final int WIDTH_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final BorderType TYPE_EDEFAULT = BorderType.SOLID;

	/**
	 * The default value of the '{@link #getDashOffset() <em>Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDashOffset()
	 * @generated
	 * @ordered
	 */
	protected static final int DASH_OFFSET_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getCap() <em>Cap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected static final BorderCap CAP_EDEFAULT = BorderCap.BUTT;

	/**
	 * The default value of the '{@link #getJoin() <em>Join</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoin()
	 * @generated
	 * @ordered
	 */
	protected static final BorderJoin JOIN_EDEFAULT = BorderJoin.BEVEL;

	/**
	 * The default value of the '{@link #getMiterLimit() <em>Miter Limit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiterLimit()
	 * @generated
	 * @ordered
	 */
	protected static final int MITER_LIMIT_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getCurveness() <em>Curveness</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurveness()
	 * @generated
	 * @ordered
	 */
	protected static final Double CURVENESS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.LINE_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getWidth() {
		return (Integer)eDynamicGet(GraphPackage.LINE_STYLE__WIDTH, GraphPackage.Literals.LINE_STYLE__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(int newWidth) {
		eDynamicSet(GraphPackage.LINE_STYLE__WIDTH, GraphPackage.Literals.LINE_STYLE__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorderType getType() {
		return (BorderType)eDynamicGet(GraphPackage.LINE_STYLE__TYPE, GraphPackage.Literals.LINE_STYLE__TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(BorderType newType) {
		eDynamicSet(GraphPackage.LINE_STYLE__TYPE, GraphPackage.Literals.LINE_STYLE__TYPE, newType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDashOffset() {
		return (Integer)eDynamicGet(GraphPackage.LINE_STYLE__DASH_OFFSET, GraphPackage.Literals.LINE_STYLE__DASH_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDashOffset(int newDashOffset) {
		eDynamicSet(GraphPackage.LINE_STYLE__DASH_OFFSET, GraphPackage.Literals.LINE_STYLE__DASH_OFFSET, newDashOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorderCap getCap() {
		return (BorderCap)eDynamicGet(GraphPackage.LINE_STYLE__CAP, GraphPackage.Literals.LINE_STYLE__CAP, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCap(BorderCap newCap) {
		eDynamicSet(GraphPackage.LINE_STYLE__CAP, GraphPackage.Literals.LINE_STYLE__CAP, newCap);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorderJoin getJoin() {
		return (BorderJoin)eDynamicGet(GraphPackage.LINE_STYLE__JOIN, GraphPackage.Literals.LINE_STYLE__JOIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJoin(BorderJoin newJoin) {
		eDynamicSet(GraphPackage.LINE_STYLE__JOIN, GraphPackage.Literals.LINE_STYLE__JOIN, newJoin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMiterLimit() {
		return (Integer)eDynamicGet(GraphPackage.LINE_STYLE__MITER_LIMIT, GraphPackage.Literals.LINE_STYLE__MITER_LIMIT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMiterLimit(int newMiterLimit) {
		eDynamicSet(GraphPackage.LINE_STYLE__MITER_LIMIT, GraphPackage.Literals.LINE_STYLE__MITER_LIMIT, newMiterLimit);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getCurveness() {
		return (Double)eDynamicGet(GraphPackage.LINE_STYLE__CURVENESS, GraphPackage.Literals.LINE_STYLE__CURVENESS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCurveness(Double newCurveness) {
		eDynamicSet(GraphPackage.LINE_STYLE__CURVENESS, GraphPackage.Literals.LINE_STYLE__CURVENESS, newCurveness);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.LINE_STYLE__WIDTH:
				return getWidth();
			case GraphPackage.LINE_STYLE__TYPE:
				return getType();
			case GraphPackage.LINE_STYLE__DASH_OFFSET:
				return getDashOffset();
			case GraphPackage.LINE_STYLE__CAP:
				return getCap();
			case GraphPackage.LINE_STYLE__JOIN:
				return getJoin();
			case GraphPackage.LINE_STYLE__MITER_LIMIT:
				return getMiterLimit();
			case GraphPackage.LINE_STYLE__CURVENESS:
				return getCurveness();
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
			case GraphPackage.LINE_STYLE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case GraphPackage.LINE_STYLE__TYPE:
				setType((BorderType)newValue);
				return;
			case GraphPackage.LINE_STYLE__DASH_OFFSET:
				setDashOffset((Integer)newValue);
				return;
			case GraphPackage.LINE_STYLE__CAP:
				setCap((BorderCap)newValue);
				return;
			case GraphPackage.LINE_STYLE__JOIN:
				setJoin((BorderJoin)newValue);
				return;
			case GraphPackage.LINE_STYLE__MITER_LIMIT:
				setMiterLimit((Integer)newValue);
				return;
			case GraphPackage.LINE_STYLE__CURVENESS:
				setCurveness((Double)newValue);
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
			case GraphPackage.LINE_STYLE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GraphPackage.LINE_STYLE__TYPE:
				setType(TYPE_EDEFAULT);
				return;
			case GraphPackage.LINE_STYLE__DASH_OFFSET:
				setDashOffset(DASH_OFFSET_EDEFAULT);
				return;
			case GraphPackage.LINE_STYLE__CAP:
				setCap(CAP_EDEFAULT);
				return;
			case GraphPackage.LINE_STYLE__JOIN:
				setJoin(JOIN_EDEFAULT);
				return;
			case GraphPackage.LINE_STYLE__MITER_LIMIT:
				setMiterLimit(MITER_LIMIT_EDEFAULT);
				return;
			case GraphPackage.LINE_STYLE__CURVENESS:
				setCurveness(CURVENESS_EDEFAULT);
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
			case GraphPackage.LINE_STYLE__WIDTH:
				return getWidth() != WIDTH_EDEFAULT;
			case GraphPackage.LINE_STYLE__TYPE:
				return getType() != TYPE_EDEFAULT;
			case GraphPackage.LINE_STYLE__DASH_OFFSET:
				return getDashOffset() != DASH_OFFSET_EDEFAULT;
			case GraphPackage.LINE_STYLE__CAP:
				return getCap() != CAP_EDEFAULT;
			case GraphPackage.LINE_STYLE__JOIN:
				return getJoin() != JOIN_EDEFAULT;
			case GraphPackage.LINE_STYLE__MITER_LIMIT:
				return getMiterLimit() != MITER_LIMIT_EDEFAULT;
			case GraphPackage.LINE_STYLE__CURVENESS:
				return CURVENESS_EDEFAULT == null ? getCurveness() != null : !CURVENESS_EDEFAULT.equals(getCurveness());
		}
		return super.eIsSet(featureID);
	}

} //LineStyleImpl

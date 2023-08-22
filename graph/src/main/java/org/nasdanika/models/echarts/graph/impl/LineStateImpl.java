/**
 */
package org.nasdanika.models.echarts.graph.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.LineState;
import org.nasdanika.models.echarts.graph.LineStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Line State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LineStateImpl#getLineStyle <em>Line Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LineStateImpl extends StateImpl implements LineState {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LineStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.LINE_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStyle getLineStyle() {
		return (LineStyle)eDynamicGet(GraphPackage.LINE_STATE__LINE_STYLE, GraphPackage.Literals.LINE_STATE__LINE_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStyle(LineStyle newLineStyle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLineStyle, GraphPackage.LINE_STATE__LINE_STYLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineStyle(LineStyle newLineStyle) {
		eDynamicSet(GraphPackage.LINE_STATE__LINE_STYLE, GraphPackage.Literals.LINE_STATE__LINE_STYLE, newLineStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.LINE_STATE__LINE_STYLE:
				return basicSetLineStyle(null, msgs);
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
			case GraphPackage.LINE_STATE__LINE_STYLE:
				return getLineStyle();
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
			case GraphPackage.LINE_STATE__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
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
			case GraphPackage.LINE_STATE__LINE_STYLE:
				setLineStyle((LineStyle)null);
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
			case GraphPackage.LINE_STATE__LINE_STYLE:
				return getLineStyle() != null;
		}
		return super.eIsSet(featureID);
	}

} //LineStateImpl

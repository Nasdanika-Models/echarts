/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.icepear.echarts.charts.graph.GraphCategoryItem;
import org.icepear.echarts.origin.chart.graph.GraphNodeStateOption;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.ItemState;
import org.nasdanika.models.echarts.graph.ItemStyle;
import org.nasdanika.models.echarts.graph.Label;

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
	 * @generated NOT
	 */
	@Override
	public GraphNodeStateOption createGraphNodeStateOption() {
		GraphNodeStateOption ret = new GraphCategoryItem(); // Closest implementation
		ItemStyle itemStyle = getItemStyle();
		if (itemStyle != null) {
			ret.setItemStyle(itemStyle.createItemStyleOption());
		}
		Label label = getLabel();
		if (label != null) {
			ret.setLabel(label.createSeriesLabelOption());
		}				
		return ret;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GraphPackage.ITEM_STATE___CREATE_GRAPH_NODE_STATE_OPTION:
				return createGraphNodeStateOption();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ItemStateImpl

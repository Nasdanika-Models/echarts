/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.icepear.echarts.charts.graph.GraphCategoryItem;
import org.icepear.echarts.origin.chart.graph.GraphNodeStateOption;
import org.icepear.echarts.origin.util.StatesOptionMixin;
import org.icepear.echarts.origin.util.SymbolOptionMixin;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Item;
import org.nasdanika.models.echarts.graph.ItemState;
import org.nasdanika.models.echarts.graph.ItemStyle;
import org.nasdanika.models.echarts.graph.Label;
import org.nasdanika.ncore.ValueObject;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getSymbolSize <em>Symbol Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getSymbolRotate <em>Symbol Rotate</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getSymbolOffset <em>Symbol Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getSymbolKeepAspect <em>Symbol Keep Aspect</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getItemStyle <em>Item Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getBlur <em>Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.ItemImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ItemImpl extends MinimalEObjectImpl.Container implements Item {
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
	 * The default value of the '{@link #getSymbolKeepAspect() <em>Symbol Keep Aspect</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbolKeepAspect()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SYMBOL_KEEP_ASPECT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.ITEM;
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
		return (String)eDynamicGet(GraphPackage.ITEM__NAME, GraphPackage.Literals.ITEM__NAME, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		eDynamicSet(GraphPackage.ITEM__NAME, GraphPackage.Literals.ITEM__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSymbol() {
		return (String)eDynamicGet(GraphPackage.ITEM__SYMBOL, GraphPackage.Literals.ITEM__SYMBOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbol(String newSymbol) {
		eDynamicSet(GraphPackage.ITEM__SYMBOL, GraphPackage.Literals.ITEM__SYMBOL, newSymbol);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Double> getSymbolSize() {
		return (EList<Double>)eDynamicGet(GraphPackage.ITEM__SYMBOL_SIZE, GraphPackage.Literals.ITEM__SYMBOL_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getSymbolRotate() {
		return (Double)eDynamicGet(GraphPackage.ITEM__SYMBOL_ROTATE, GraphPackage.Literals.ITEM__SYMBOL_ROTATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbolRotate(Double newSymbolRotate) {
		eDynamicSet(GraphPackage.ITEM__SYMBOL_ROTATE, GraphPackage.Literals.ITEM__SYMBOL_ROTATE, newSymbolRotate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getSymbolOffset() {
		return (EList<String>)eDynamicGet(GraphPackage.ITEM__SYMBOL_OFFSET, GraphPackage.Literals.ITEM__SYMBOL_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSymbolKeepAspect() {
		return (Boolean)eDynamicGet(GraphPackage.ITEM__SYMBOL_KEEP_ASPECT, GraphPackage.Literals.ITEM__SYMBOL_KEEP_ASPECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSymbolKeepAspect(Boolean newSymbolKeepAspect) {
		eDynamicSet(GraphPackage.ITEM__SYMBOL_KEEP_ASPECT, GraphPackage.Literals.ITEM__SYMBOL_KEEP_ASPECT, newSymbolKeepAspect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemStyle getItemStyle() {
		return (ItemStyle)eDynamicGet(GraphPackage.ITEM__ITEM_STYLE, GraphPackage.Literals.ITEM__ITEM_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItemStyle(ItemStyle newItemStyle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newItemStyle, GraphPackage.ITEM__ITEM_STYLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItemStyle(ItemStyle newItemStyle) {
		eDynamicSet(GraphPackage.ITEM__ITEM_STYLE, GraphPackage.Literals.ITEM__ITEM_STYLE, newItemStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getLabel() {
		return (Label)eDynamicGet(GraphPackage.ITEM__LABEL, GraphPackage.Literals.ITEM__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabel, GraphPackage.ITEM__LABEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(Label newLabel) {
		eDynamicSet(GraphPackage.ITEM__LABEL, GraphPackage.Literals.ITEM__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemState getEmphasis() {
		return (ItemState)eDynamicGet(GraphPackage.ITEM__EMPHASIS, GraphPackage.Literals.ITEM__EMPHASIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmphasis(ItemState newEmphasis, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEmphasis, GraphPackage.ITEM__EMPHASIS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmphasis(ItemState newEmphasis) {
		eDynamicSet(GraphPackage.ITEM__EMPHASIS, GraphPackage.Literals.ITEM__EMPHASIS, newEmphasis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemState getBlur() {
		return (ItemState)eDynamicGet(GraphPackage.ITEM__BLUR, GraphPackage.Literals.ITEM__BLUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlur(ItemState newBlur, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBlur, GraphPackage.ITEM__BLUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlur(ItemState newBlur) {
		eDynamicSet(GraphPackage.ITEM__BLUR, GraphPackage.Literals.ITEM__BLUR, newBlur);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemState getSelect() {
		return (ItemState)eDynamicGet(GraphPackage.ITEM__SELECT, GraphPackage.Literals.ITEM__SELECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(ItemState newSelect, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSelect, GraphPackage.ITEM__SELECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelect(ItemState newSelect) {
		eDynamicSet(GraphPackage.ITEM__SELECT, GraphPackage.Literals.ITEM__SELECT, newSelect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<EObject> getValue() {
		return (EList<EObject>)eDynamicGet(GraphPackage.ITEM__VALUE, GraphPackage.Literals.ITEM__VALUE, true, true);
	}
	
	static Object valueToObject(Collection<EObject> values) {
		if (values == null || values.isEmpty() ) {
			return null;
		}
		if (values.size() == 1) {
			for (EObject e: values) {
				if (e instanceof org.nasdanika.ncore.List) {
					return ((org.nasdanika.ncore.List) e).toList();
				} 
				if (e instanceof org.nasdanika.ncore.Map) {
					return (((org.nasdanika.ncore.Map) e).toMap());
				} 
				if (e instanceof ValueObject) {
					return ((ValueObject<?>) e).getValue();
				}
				return e;
			}
		}
		List<Object> ret = new ArrayList<>();
		for (EObject value: values) {
			ret.add(valueToObject(Collections.singleton(value)));
		}
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public GraphCategoryItem createGraphCategoryItem() {
		GraphCategoryItem ret = new GraphCategoryItem();
		if (getName() != null) {
			ret.setName(getName());
		}		
		
		EList<EObject> value = getValue();
		if (value.size() == 1) {
			ret.setValue(value.get(0));			
		} else if (!value.isEmpty()) {			
			ret.setValue(value.toArray(new Number[value.size()]));			
		}
		
		configureGraphNodeStateOption(ret);
		configureStatesOptionMixin(ret);
		configureSymbolOptionMixin(ret);
		return ret;
	}
	
	protected void configureSymbolOptionMixin(SymbolOptionMixin symbolOptionMixin) {
		if (getSymbol() != null) {
			symbolOptionMixin.setSymbol(getSymbol());
		}
		
		EList<Double> symbolSize = getSymbolSize();
		if (symbolSize.size() == 1) {
			symbolOptionMixin.setSymbolSize(symbolSize.get(0));			
		} else if (!symbolSize.isEmpty()) {			
			symbolOptionMixin.setSymbolSize(symbolSize.toArray(new Number[symbolSize.size()]));			
		}
		
		if (getSymbolRotate() != null) {
			symbolOptionMixin.setSymbolRotate(getSymbolRotate());			
		}
		
		EList<String> symbolOffset = getSymbolOffset();
		if (symbolOffset.size() == 1) {
			symbolOptionMixin.setSymbolOffset(symbolOffset.get(0));			
		} else if (!symbolOffset.isEmpty()) {			
			symbolOptionMixin.setSymbolOffset(symbolOffset.toArray(new Number[symbolSize.size()]));			
		}
		
		if (getSymbolKeepAspect() != null) {
			symbolOptionMixin.setSymbolKeepAspect(getSymbolKeepAspect());
		}		
	}
		
	protected void configureGraphNodeStateOption(GraphNodeStateOption graphNodeStateOption) {
		ItemStyle itemStyle = getItemStyle();
		if (itemStyle != null) {
			graphNodeStateOption.setItemStyle(itemStyle.createItemStyleOption());
		}
		
		Label label = getLabel();
		if (label != null) {
			graphNodeStateOption.setLabel(label.createSeriesLabelOption());
		}
	}
		
	protected void configureStatesOptionMixin(StatesOptionMixin statesOptionMixin) {
		ItemState emphasis = getEmphasis();
		if (emphasis != null) {
			statesOptionMixin.setEmphasis(emphasis.createGraphNodeStateOption());
		}
		
		ItemState select = getSelect();
		if (select != null) {
			statesOptionMixin.setSelect(select.createGraphNodeStateOption());
		}
		
		ItemState blur = getBlur();
		if (blur != null) {
			statesOptionMixin.setBlur(blur.createGraphNodeStateOption());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.ITEM__ITEM_STYLE:
				return basicSetItemStyle(null, msgs);
			case GraphPackage.ITEM__LABEL:
				return basicSetLabel(null, msgs);
			case GraphPackage.ITEM__EMPHASIS:
				return basicSetEmphasis(null, msgs);
			case GraphPackage.ITEM__BLUR:
				return basicSetBlur(null, msgs);
			case GraphPackage.ITEM__SELECT:
				return basicSetSelect(null, msgs);
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
			case GraphPackage.ITEM__NAME:
				return getName();
			case GraphPackage.ITEM__SYMBOL:
				return getSymbol();
			case GraphPackage.ITEM__SYMBOL_SIZE:
				return getSymbolSize();
			case GraphPackage.ITEM__SYMBOL_ROTATE:
				return getSymbolRotate();
			case GraphPackage.ITEM__SYMBOL_OFFSET:
				return getSymbolOffset();
			case GraphPackage.ITEM__SYMBOL_KEEP_ASPECT:
				return getSymbolKeepAspect();
			case GraphPackage.ITEM__ITEM_STYLE:
				return getItemStyle();
			case GraphPackage.ITEM__LABEL:
				return getLabel();
			case GraphPackage.ITEM__EMPHASIS:
				return getEmphasis();
			case GraphPackage.ITEM__BLUR:
				return getBlur();
			case GraphPackage.ITEM__SELECT:
				return getSelect();
			case GraphPackage.ITEM__VALUE:
				return getValue();
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
			case GraphPackage.ITEM__NAME:
				setName((String)newValue);
				return;
			case GraphPackage.ITEM__SYMBOL:
				setSymbol((String)newValue);
				return;
			case GraphPackage.ITEM__SYMBOL_SIZE:
				getSymbolSize().clear();
				getSymbolSize().addAll((Collection<? extends Double>)newValue);
				return;
			case GraphPackage.ITEM__SYMBOL_ROTATE:
				setSymbolRotate((Double)newValue);
				return;
			case GraphPackage.ITEM__SYMBOL_OFFSET:
				getSymbolOffset().clear();
				getSymbolOffset().addAll((Collection<? extends String>)newValue);
				return;
			case GraphPackage.ITEM__SYMBOL_KEEP_ASPECT:
				setSymbolKeepAspect((Boolean)newValue);
				return;
			case GraphPackage.ITEM__ITEM_STYLE:
				setItemStyle((ItemStyle)newValue);
				return;
			case GraphPackage.ITEM__LABEL:
				setLabel((Label)newValue);
				return;
			case GraphPackage.ITEM__EMPHASIS:
				setEmphasis((ItemState)newValue);
				return;
			case GraphPackage.ITEM__BLUR:
				setBlur((ItemState)newValue);
				return;
			case GraphPackage.ITEM__SELECT:
				setSelect((ItemState)newValue);
				return;
			case GraphPackage.ITEM__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends EObject>)newValue);
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
			case GraphPackage.ITEM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case GraphPackage.ITEM__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case GraphPackage.ITEM__SYMBOL_SIZE:
				getSymbolSize().clear();
				return;
			case GraphPackage.ITEM__SYMBOL_ROTATE:
				setSymbolRotate(SYMBOL_ROTATE_EDEFAULT);
				return;
			case GraphPackage.ITEM__SYMBOL_OFFSET:
				getSymbolOffset().clear();
				return;
			case GraphPackage.ITEM__SYMBOL_KEEP_ASPECT:
				setSymbolKeepAspect(SYMBOL_KEEP_ASPECT_EDEFAULT);
				return;
			case GraphPackage.ITEM__ITEM_STYLE:
				setItemStyle((ItemStyle)null);
				return;
			case GraphPackage.ITEM__LABEL:
				setLabel((Label)null);
				return;
			case GraphPackage.ITEM__EMPHASIS:
				setEmphasis((ItemState)null);
				return;
			case GraphPackage.ITEM__BLUR:
				setBlur((ItemState)null);
				return;
			case GraphPackage.ITEM__SELECT:
				setSelect((ItemState)null);
				return;
			case GraphPackage.ITEM__VALUE:
				getValue().clear();
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
			case GraphPackage.ITEM__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GraphPackage.ITEM__SYMBOL:
				return SYMBOL_EDEFAULT == null ? getSymbol() != null : !SYMBOL_EDEFAULT.equals(getSymbol());
			case GraphPackage.ITEM__SYMBOL_SIZE:
				return !getSymbolSize().isEmpty();
			case GraphPackage.ITEM__SYMBOL_ROTATE:
				return SYMBOL_ROTATE_EDEFAULT == null ? getSymbolRotate() != null : !SYMBOL_ROTATE_EDEFAULT.equals(getSymbolRotate());
			case GraphPackage.ITEM__SYMBOL_OFFSET:
				return !getSymbolOffset().isEmpty();
			case GraphPackage.ITEM__SYMBOL_KEEP_ASPECT:
				return SYMBOL_KEEP_ASPECT_EDEFAULT == null ? getSymbolKeepAspect() != null : !SYMBOL_KEEP_ASPECT_EDEFAULT.equals(getSymbolKeepAspect());
			case GraphPackage.ITEM__ITEM_STYLE:
				return getItemStyle() != null;
			case GraphPackage.ITEM__LABEL:
				return getLabel() != null;
			case GraphPackage.ITEM__EMPHASIS:
				return getEmphasis() != null;
			case GraphPackage.ITEM__BLUR:
				return getBlur() != null;
			case GraphPackage.ITEM__SELECT:
				return getSelect() != null;
			case GraphPackage.ITEM__VALUE:
				return !getValue().isEmpty();
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
			case GraphPackage.ITEM___CREATE_GRAPH_CATEGORY_ITEM:
				return createGraphCategoryItem();
		}
		return super.eInvoke(operationID, arguments);
	}

} //ItemImpl

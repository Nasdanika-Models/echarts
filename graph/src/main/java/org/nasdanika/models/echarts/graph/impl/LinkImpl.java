/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.icepear.echarts.charts.graph.GraphEdgeItem;
import org.nasdanika.models.echarts.graph.Graph;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Label;
import org.nasdanika.models.echarts.graph.LineState;
import org.nasdanika.models.echarts.graph.LineStyle;
import org.nasdanika.models.echarts.graph.Link;
import org.nasdanika.models.echarts.graph.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LinkImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LinkImpl#getValue <em>Value</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LinkImpl#getLineStyle <em>Line Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LinkImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LinkImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LinkImpl#getBlur <em>Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LinkImpl#getSelect <em>Select</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LinkImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LinkImpl#getSymbolSize <em>Symbol Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LinkImpl#isIgnoreForceLayout <em>Ignore Force Layout</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends MinimalEObjectImpl.Container implements Link {
	/**
	 * The default value of the '{@link #isIgnoreForceLayout() <em>Ignore Force Layout</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreForceLayout()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_FORCE_LAYOUT_EDEFAULT = false;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.LINK;
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
	public Node getTarget() {
		return (Node)eDynamicGet(GraphPackage.LINK__TARGET, GraphPackage.Literals.LINK__TARGET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetTarget() {
		return (Node)eDynamicGet(GraphPackage.LINK__TARGET, GraphPackage.Literals.LINK__TARGET, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTarget(Node newTarget, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTarget, GraphPackage.LINK__TARGET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTarget(Node newTarget) {
		eDynamicSet(GraphPackage.LINK__TARGET, GraphPackage.Literals.LINK__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Double> getValue() {
		return (EList<Double>)eDynamicGet(GraphPackage.LINK__VALUE, GraphPackage.Literals.LINK__VALUE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStyle getLineStyle() {
		return (LineStyle)eDynamicGet(GraphPackage.LINK__LINE_STYLE, GraphPackage.Literals.LINK__LINE_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLineStyle(LineStyle newLineStyle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLineStyle, GraphPackage.LINK__LINE_STYLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineStyle(LineStyle newLineStyle) {
		eDynamicSet(GraphPackage.LINK__LINE_STYLE, GraphPackage.Literals.LINK__LINE_STYLE, newLineStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label getLabel() {
		return (Label)eDynamicGet(GraphPackage.LINK__LABEL, GraphPackage.Literals.LINK__LABEL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLabel(Label newLabel, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newLabel, GraphPackage.LINK__LABEL, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLabel(Label newLabel) {
		eDynamicSet(GraphPackage.LINK__LABEL, GraphPackage.Literals.LINK__LABEL, newLabel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineState getEmphasis() {
		return (LineState)eDynamicGet(GraphPackage.LINK__EMPHASIS, GraphPackage.Literals.LINK__EMPHASIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEmphasis(LineState newEmphasis, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newEmphasis, GraphPackage.LINK__EMPHASIS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmphasis(LineState newEmphasis) {
		eDynamicSet(GraphPackage.LINK__EMPHASIS, GraphPackage.Literals.LINK__EMPHASIS, newEmphasis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineState getBlur() {
		return (LineState)eDynamicGet(GraphPackage.LINK__BLUR, GraphPackage.Literals.LINK__BLUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlur(LineState newBlur, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newBlur, GraphPackage.LINK__BLUR, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBlur(LineState newBlur) {
		eDynamicSet(GraphPackage.LINK__BLUR, GraphPackage.Literals.LINK__BLUR, newBlur);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineState getSelect() {
		return (LineState)eDynamicGet(GraphPackage.LINK__SELECT, GraphPackage.Literals.LINK__SELECT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelect(LineState newSelect, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newSelect, GraphPackage.LINK__SELECT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelect(LineState newSelect) {
		eDynamicSet(GraphPackage.LINK__SELECT, GraphPackage.Literals.LINK__SELECT, newSelect);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getSymbol() {
		return (EList<String>)eDynamicGet(GraphPackage.LINK__SYMBOL, GraphPackage.Literals.LINK__SYMBOL, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getSymbolSize() {
		return (EList<String>)eDynamicGet(GraphPackage.LINK__SYMBOL_SIZE, GraphPackage.Literals.LINK__SYMBOL_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIgnoreForceLayout() {
		return (Boolean)eDynamicGet(GraphPackage.LINK__IGNORE_FORCE_LAYOUT, GraphPackage.Literals.LINK__IGNORE_FORCE_LAYOUT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIgnoreForceLayout(boolean newIgnoreForceLayout) {
		eDynamicSet(GraphPackage.LINK__IGNORE_FORCE_LAYOUT, GraphPackage.Literals.LINK__IGNORE_FORCE_LAYOUT, newIgnoreForceLayout);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public GraphEdgeItem createGraphEdgeItem() {
		GraphEdgeItem ret = new GraphEdgeItem();
		

//	    GraphEdgeItemOption setValue(Number value);
//
//	    GraphEdgeItemOption setSymbol(String symbol);
//
//	    GraphEdgeItemOption setSymbol(String[] symbol);
//
//	    GraphEdgeItemOption setSymbolSize(Number symbolSize);
//
//	    GraphEdgeItemOption setSymbolSize(Number[] symbolSize);
//
//	    GraphEdgeItemOption setIgnoreForceLayout(Boolean ignoreForceLayout);
		

//	    GraphEdgeStateOption setLineStyle(GraphEdgeLineStyleOption lineStyle);
//
//	    GraphEdgeStateOption setLabel(SeriesLineLabelOption label);

		
//	    StatesOptionMixin setEmphasis(Object emphasis);
//
//	    StatesOptionMixin setSelect(Object select);
//
//	    StatesOptionMixin setBlur(Object blur);
		
		
		EList<Node> graphNodes = ((Graph) eContainer().eContainer()).getNodes();
		ret.setSource(graphNodes.indexOf(eContainer()));
		ret.setTarget(graphNodes.indexOf(getTarget()));
		return ret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.LINK__TARGET:
				Node target = basicGetTarget();
				if (target != null)
					msgs = ((InternalEObject)target).eInverseRemove(this, GraphPackage.NODE__INCOMING_LINKS, Node.class, msgs);
				return basicSetTarget((Node)otherEnd, msgs);
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
			case GraphPackage.LINK__TARGET:
				return basicSetTarget(null, msgs);
			case GraphPackage.LINK__LINE_STYLE:
				return basicSetLineStyle(null, msgs);
			case GraphPackage.LINK__LABEL:
				return basicSetLabel(null, msgs);
			case GraphPackage.LINK__EMPHASIS:
				return basicSetEmphasis(null, msgs);
			case GraphPackage.LINK__BLUR:
				return basicSetBlur(null, msgs);
			case GraphPackage.LINK__SELECT:
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
			case GraphPackage.LINK__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
			case GraphPackage.LINK__VALUE:
				return getValue();
			case GraphPackage.LINK__LINE_STYLE:
				return getLineStyle();
			case GraphPackage.LINK__LABEL:
				return getLabel();
			case GraphPackage.LINK__EMPHASIS:
				return getEmphasis();
			case GraphPackage.LINK__BLUR:
				return getBlur();
			case GraphPackage.LINK__SELECT:
				return getSelect();
			case GraphPackage.LINK__SYMBOL:
				return getSymbol();
			case GraphPackage.LINK__SYMBOL_SIZE:
				return getSymbolSize();
			case GraphPackage.LINK__IGNORE_FORCE_LAYOUT:
				return isIgnoreForceLayout();
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
			case GraphPackage.LINK__TARGET:
				setTarget((Node)newValue);
				return;
			case GraphPackage.LINK__VALUE:
				getValue().clear();
				getValue().addAll((Collection<? extends Double>)newValue);
				return;
			case GraphPackage.LINK__LINE_STYLE:
				setLineStyle((LineStyle)newValue);
				return;
			case GraphPackage.LINK__LABEL:
				setLabel((Label)newValue);
				return;
			case GraphPackage.LINK__EMPHASIS:
				setEmphasis((LineState)newValue);
				return;
			case GraphPackage.LINK__BLUR:
				setBlur((LineState)newValue);
				return;
			case GraphPackage.LINK__SELECT:
				setSelect((LineState)newValue);
				return;
			case GraphPackage.LINK__SYMBOL:
				getSymbol().clear();
				getSymbol().addAll((Collection<? extends String>)newValue);
				return;
			case GraphPackage.LINK__SYMBOL_SIZE:
				getSymbolSize().clear();
				getSymbolSize().addAll((Collection<? extends String>)newValue);
				return;
			case GraphPackage.LINK__IGNORE_FORCE_LAYOUT:
				setIgnoreForceLayout((Boolean)newValue);
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
			case GraphPackage.LINK__TARGET:
				setTarget((Node)null);
				return;
			case GraphPackage.LINK__VALUE:
				getValue().clear();
				return;
			case GraphPackage.LINK__LINE_STYLE:
				setLineStyle((LineStyle)null);
				return;
			case GraphPackage.LINK__LABEL:
				setLabel((Label)null);
				return;
			case GraphPackage.LINK__EMPHASIS:
				setEmphasis((LineState)null);
				return;
			case GraphPackage.LINK__BLUR:
				setBlur((LineState)null);
				return;
			case GraphPackage.LINK__SELECT:
				setSelect((LineState)null);
				return;
			case GraphPackage.LINK__SYMBOL:
				getSymbol().clear();
				return;
			case GraphPackage.LINK__SYMBOL_SIZE:
				getSymbolSize().clear();
				return;
			case GraphPackage.LINK__IGNORE_FORCE_LAYOUT:
				setIgnoreForceLayout(IGNORE_FORCE_LAYOUT_EDEFAULT);
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
			case GraphPackage.LINK__TARGET:
				return basicGetTarget() != null;
			case GraphPackage.LINK__VALUE:
				return !getValue().isEmpty();
			case GraphPackage.LINK__LINE_STYLE:
				return getLineStyle() != null;
			case GraphPackage.LINK__LABEL:
				return getLabel() != null;
			case GraphPackage.LINK__EMPHASIS:
				return getEmphasis() != null;
			case GraphPackage.LINK__BLUR:
				return getBlur() != null;
			case GraphPackage.LINK__SELECT:
				return getSelect() != null;
			case GraphPackage.LINK__SYMBOL:
				return !getSymbol().isEmpty();
			case GraphPackage.LINK__SYMBOL_SIZE:
				return !getSymbolSize().isEmpty();
			case GraphPackage.LINK__IGNORE_FORCE_LAYOUT:
				return isIgnoreForceLayout() != IGNORE_FORCE_LAYOUT_EDEFAULT;
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
			case GraphPackage.LINK___CREATE_GRAPH_EDGE_ITEM:
				return createGraphEdgeItem();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LinkImpl

/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.icepear.echarts.charts.graph.GraphNodeItem;
import org.nasdanika.models.echarts.graph.Graph;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Item;
import org.nasdanika.models.echarts.graph.Link;
import org.nasdanika.models.echarts.graph.Node;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getX <em>X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getY <em>Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getOutgoingLinks <em>Outgoing Links</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getIncomingLinks <em>Incoming Links</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#isFixed <em>Fixed</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.NodeImpl#getDraggable <em>Draggable</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeImpl extends ItemImpl implements Node {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final Double X_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final Double Y_EDEFAULT = null;
	/**
	 * The default value of the '{@link #isFixed() <em>Fixed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFixed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FIXED_EDEFAULT = false;
	/**
	 * The default value of the '{@link #getDraggable() <em>Draggable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDraggable()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean DRAGGABLE_EDEFAULT = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getX() {
		return (Double)eDynamicGet(GraphPackage.NODE__X, GraphPackage.Literals.NODE__X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(Double newX) {
		eDynamicSet(GraphPackage.NODE__X, GraphPackage.Literals.NODE__X, newX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getY() {
		return (Double)eDynamicGet(GraphPackage.NODE__Y, GraphPackage.Literals.NODE__Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(Double newY) {
		eDynamicSet(GraphPackage.NODE__Y, GraphPackage.Literals.NODE__Y, newY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Link> getOutgoingLinks() {
		return (EList<Link>)eDynamicGet(GraphPackage.NODE__OUTGOING_LINKS, GraphPackage.Literals.NODE__OUTGOING_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Link> getIncomingLinks() {
		return (EList<Link>)eDynamicGet(GraphPackage.NODE__INCOMING_LINKS, GraphPackage.Literals.NODE__INCOMING_LINKS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Item getCategory() {
		return (Item)eDynamicGet(GraphPackage.NODE__CATEGORY, GraphPackage.Literals.NODE__CATEGORY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Item basicGetCategory() {
		return (Item)eDynamicGet(GraphPackage.NODE__CATEGORY, GraphPackage.Literals.NODE__CATEGORY, false, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCategory(Item newCategory) {
		eDynamicSet(GraphPackage.NODE__CATEGORY, GraphPackage.Literals.NODE__CATEGORY, newCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFixed() {
		return (Boolean)eDynamicGet(GraphPackage.NODE__FIXED, GraphPackage.Literals.NODE__FIXED, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFixed(boolean newFixed) {
		eDynamicSet(GraphPackage.NODE__FIXED, GraphPackage.Literals.NODE__FIXED, newFixed);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getDraggable() {
		return (Boolean)eDynamicGet(GraphPackage.NODE__DRAGGABLE, GraphPackage.Literals.NODE__DRAGGABLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDraggable(Boolean newDraggable) {
		eDynamicSet(GraphPackage.NODE__DRAGGABLE, GraphPackage.Literals.NODE__DRAGGABLE, newDraggable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return (String)eDynamicGet(GraphPackage.NODE__ID, GraphPackage.Literals.NODE__ID, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(String newId) {
		eDynamicSet(GraphPackage.NODE__ID, GraphPackage.Literals.NODE__ID, newId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public GraphNodeItem createGraphNodeItem() {
		GraphNodeItem ret = new GraphNodeItem();
		if (getId() != null) {
			ret.setId(getId());
		}
		if (getName() != null) {
			ret.setName(getName());
		}		
		ret.setValue(valueToObject(getValue()));
		
		if (getX() != null) {
			ret.setX(getX());
		}
		if (getY() != null) {
			ret.setY(getY());
		}
		if (isFixed()) {
			ret.setFixed(true);
		}
		Item category = getCategory();
		if (category != null) {
			ret.setCategory(((Graph) category.eContainer()).getCategories().indexOf(category));
		}
		if (getDraggable() != null) {
			ret.setDraggable(getDraggable());
		}
		
		configureGraphNodeStateOption(ret);
		configureStatesOptionMixin(ret);
		configureSymbolOptionMixin(ret);
		
		return ret;		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.NODE__INCOMING_LINKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingLinks()).basicAdd(otherEnd, msgs);
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
			case GraphPackage.NODE__OUTGOING_LINKS:
				return ((InternalEList<?>)getOutgoingLinks()).basicRemove(otherEnd, msgs);
			case GraphPackage.NODE__INCOMING_LINKS:
				return ((InternalEList<?>)getIncomingLinks()).basicRemove(otherEnd, msgs);
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
			case GraphPackage.NODE__ID:
				return getId();
			case GraphPackage.NODE__X:
				return getX();
			case GraphPackage.NODE__Y:
				return getY();
			case GraphPackage.NODE__OUTGOING_LINKS:
				return getOutgoingLinks();
			case GraphPackage.NODE__INCOMING_LINKS:
				return getIncomingLinks();
			case GraphPackage.NODE__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case GraphPackage.NODE__FIXED:
				return isFixed();
			case GraphPackage.NODE__DRAGGABLE:
				return getDraggable();
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
			case GraphPackage.NODE__ID:
				setId((String)newValue);
				return;
			case GraphPackage.NODE__X:
				setX((Double)newValue);
				return;
			case GraphPackage.NODE__Y:
				setY((Double)newValue);
				return;
			case GraphPackage.NODE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				getOutgoingLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case GraphPackage.NODE__INCOMING_LINKS:
				getIncomingLinks().clear();
				getIncomingLinks().addAll((Collection<? extends Link>)newValue);
				return;
			case GraphPackage.NODE__CATEGORY:
				setCategory((Item)newValue);
				return;
			case GraphPackage.NODE__FIXED:
				setFixed((Boolean)newValue);
				return;
			case GraphPackage.NODE__DRAGGABLE:
				setDraggable((Boolean)newValue);
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
			case GraphPackage.NODE__ID:
				setId(ID_EDEFAULT);
				return;
			case GraphPackage.NODE__X:
				setX(X_EDEFAULT);
				return;
			case GraphPackage.NODE__Y:
				setY(Y_EDEFAULT);
				return;
			case GraphPackage.NODE__OUTGOING_LINKS:
				getOutgoingLinks().clear();
				return;
			case GraphPackage.NODE__INCOMING_LINKS:
				getIncomingLinks().clear();
				return;
			case GraphPackage.NODE__CATEGORY:
				setCategory((Item)null);
				return;
			case GraphPackage.NODE__FIXED:
				setFixed(FIXED_EDEFAULT);
				return;
			case GraphPackage.NODE__DRAGGABLE:
				setDraggable(DRAGGABLE_EDEFAULT);
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
			case GraphPackage.NODE__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GraphPackage.NODE__X:
				return X_EDEFAULT == null ? getX() != null : !X_EDEFAULT.equals(getX());
			case GraphPackage.NODE__Y:
				return Y_EDEFAULT == null ? getY() != null : !Y_EDEFAULT.equals(getY());
			case GraphPackage.NODE__OUTGOING_LINKS:
				return !getOutgoingLinks().isEmpty();
			case GraphPackage.NODE__INCOMING_LINKS:
				return !getIncomingLinks().isEmpty();
			case GraphPackage.NODE__CATEGORY:
				return basicGetCategory() != null;
			case GraphPackage.NODE__FIXED:
				return isFixed() != FIXED_EDEFAULT;
			case GraphPackage.NODE__DRAGGABLE:
				return DRAGGABLE_EDEFAULT == null ? getDraggable() != null : !DRAGGABLE_EDEFAULT.equals(getDraggable());
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
			case GraphPackage.NODE___CREATE_GRAPH_NODE_ITEM:
				return createGraphNodeItem();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NodeImpl

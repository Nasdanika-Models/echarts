/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.icepear.echarts.components.series.SeriesLabel;
import org.icepear.echarts.components.series.SeriesLineLabel;
import org.icepear.echarts.origin.util.LabelOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;
import org.icepear.echarts.origin.util.TextCommonOption;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Label;
import org.nasdanika.models.echarts.graph.LabelPosition;
import org.nasdanika.models.echarts.graph.Overflow;
import org.nasdanika.models.echarts.graph.TextStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getFormatter <em>Formatter</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getShow <em>Show</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getMinMargin <em>Min Margin</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getOverflow <em>Overflow</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getSilent <em>Silent</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getPrecision <em>Precision</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getValueAnimation <em>Value Animation</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getRich <em>Rich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends TextStyleImpl implements Label {
	/**
	 * The default value of the '{@link #getFormatter() <em>Formatter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormatter()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMATTER_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShow()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SHOW_EDEFAULT = Boolean.TRUE;
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final LabelPosition POSITION_EDEFAULT = LabelPosition.TOP;
	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DISTANCE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getRotate() <em>Rotate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRotate()
	 * @generated
	 * @ordered
	 */
	protected static final Double ROTATE_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getMinMargin() <em>Min Margin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinMargin()
	 * @generated
	 * @ordered
	 */
	protected static final Double MIN_MARGIN_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getOverflow() <em>Overflow</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOverflow()
	 * @generated
	 * @ordered
	 */
	protected static final Overflow OVERFLOW_EDEFAULT = Overflow.TRUNCATE;
	/**
	 * The default value of the '{@link #getSilent() <em>Silent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSilent()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SILENT_EDEFAULT = Boolean.TRUE;
	/**
	 * The default value of the '{@link #getPrecision() <em>Precision</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecision()
	 * @generated
	 * @ordered
	 */
	protected static final Double PRECISION_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getValueAnimation() <em>Value Animation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueAnimation()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean VALUE_ANIMATION_EDEFAULT = Boolean.TRUE;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LabelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.LABEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormatter() {
		return (String)eDynamicGet(GraphPackage.LABEL__FORMATTER, GraphPackage.Literals.LABEL__FORMATTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormatter(String newFormatter) {
		eDynamicSet(GraphPackage.LABEL__FORMATTER, GraphPackage.Literals.LABEL__FORMATTER, newFormatter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getShow() {
		return (Boolean)eDynamicGet(GraphPackage.LABEL__SHOW, GraphPackage.Literals.LABEL__SHOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShow(Boolean newShow) {
		eDynamicSet(GraphPackage.LABEL__SHOW, GraphPackage.Literals.LABEL__SHOW, newShow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LabelPosition getPosition() {
		return (LabelPosition)eDynamicGet(GraphPackage.LABEL__POSITION, GraphPackage.Literals.LABEL__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(LabelPosition newPosition) {
		eDynamicSet(GraphPackage.LABEL__POSITION, GraphPackage.Literals.LABEL__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getDistance() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__DISTANCE, GraphPackage.Literals.LABEL__DISTANCE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(Integer newDistance) {
		eDynamicSet(GraphPackage.LABEL__DISTANCE, GraphPackage.Literals.LABEL__DISTANCE, newDistance);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getRotate() {
		return (Double)eDynamicGet(GraphPackage.LABEL__ROTATE, GraphPackage.Literals.LABEL__ROTATE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRotate(Double newRotate) {
		eDynamicSet(GraphPackage.LABEL__ROTATE, GraphPackage.Literals.LABEL__ROTATE, newRotate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Integer> getOffset() {
		return (EList<Integer>)eDynamicGet(GraphPackage.LABEL__OFFSET, GraphPackage.Literals.LABEL__OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMinMargin() {
		return (Double)eDynamicGet(GraphPackage.LABEL__MIN_MARGIN, GraphPackage.Literals.LABEL__MIN_MARGIN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMinMargin(Double newMinMargin) {
		eDynamicSet(GraphPackage.LABEL__MIN_MARGIN, GraphPackage.Literals.LABEL__MIN_MARGIN, newMinMargin);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Overflow getOverflow() {
		return (Overflow)eDynamicGet(GraphPackage.LABEL__OVERFLOW, GraphPackage.Literals.LABEL__OVERFLOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverflow(Overflow newOverflow) {
		eDynamicSet(GraphPackage.LABEL__OVERFLOW, GraphPackage.Literals.LABEL__OVERFLOW, newOverflow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSilent() {
		return (Boolean)eDynamicGet(GraphPackage.LABEL__SILENT, GraphPackage.Literals.LABEL__SILENT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSilent(Boolean newSilent) {
		eDynamicSet(GraphPackage.LABEL__SILENT, GraphPackage.Literals.LABEL__SILENT, newSilent);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getPrecision() {
		return (Double)eDynamicGet(GraphPackage.LABEL__PRECISION, GraphPackage.Literals.LABEL__PRECISION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrecision(Double newPrecision) {
		eDynamicSet(GraphPackage.LABEL__PRECISION, GraphPackage.Literals.LABEL__PRECISION, newPrecision);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getValueAnimation() {
		return (Boolean)eDynamicGet(GraphPackage.LABEL__VALUE_ANIMATION, GraphPackage.Literals.LABEL__VALUE_ANIMATION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueAnimation(Boolean newValueAnimation) {
		eDynamicSet(GraphPackage.LABEL__VALUE_ANIMATION, GraphPackage.Literals.LABEL__VALUE_ANIMATION, newValueAnimation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, TextStyle> getRich() {
		return (EMap<String, TextStyle>)eDynamicGet(GraphPackage.LABEL__RICH, GraphPackage.Literals.LABEL__RICH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public SeriesLabelOption createSeriesLabelOption() {
		SeriesLabelOption label = new SeriesLabel();		
		label.setFormatter(getFormatter());
		configureLabelOption(label);		
		return label;
	}

	protected void configureLabelOption(LabelOption label) {
		label.setShow(getShow());
		
		LabelPosition position = getPosition();
		if (position != null) {
			label.setPosition(position.getLiteral());
		}
		
		label.setDistance(getDistance());
		label.setRotate(getRotate());
		
		EList<Integer> offset = getOffset();
		if (!offset.isEmpty()) {
			label.setOffset(offset.toArray(new Number[offset.size()]));
		}
		
		label.setMinMargin(getMinMargin());
		
		Overflow overflow = getOverflow();
		if (overflow != null) {
			label.setOverflow(overflow.getLiteral());
		}
		
		label.setSilent(getSilent());
		label.setPrecision(getPrecision());
		label.setValueAnimation(getValueAnimation());

		EMap<String, TextStyle> rich = getRich();
		if (!rich.isEmpty()) {
			Map<String, TextCommonOption> richMap = new LinkedHashMap<>();
			for (Entry<String, TextStyle> re: rich.entrySet()) {
				TextCommonOption text = new org.icepear.echarts.components.text.Text();
				((TextStyleImpl) re.getValue()).configureTextCommonOption(text);
				richMap.put(re.getKey(), text);
			}
			label.setRich(richMap);
		}
		
		configureTextCommonOption(label);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public SeriesLineLabelOption createSeriesLineLabelOption() {
		SeriesLineLabelOption label = new SeriesLineLabel();		
		label.setFormatter(getFormatter());
		configureLabelOption(label);		
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.LABEL__RICH:
				return ((InternalEList<?>)getRich()).basicRemove(otherEnd, msgs);
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
			case GraphPackage.LABEL__FORMATTER:
				return getFormatter();
			case GraphPackage.LABEL__SHOW:
				return getShow();
			case GraphPackage.LABEL__POSITION:
				return getPosition();
			case GraphPackage.LABEL__DISTANCE:
				return getDistance();
			case GraphPackage.LABEL__ROTATE:
				return getRotate();
			case GraphPackage.LABEL__OFFSET:
				return getOffset();
			case GraphPackage.LABEL__MIN_MARGIN:
				return getMinMargin();
			case GraphPackage.LABEL__OVERFLOW:
				return getOverflow();
			case GraphPackage.LABEL__SILENT:
				return getSilent();
			case GraphPackage.LABEL__PRECISION:
				return getPrecision();
			case GraphPackage.LABEL__VALUE_ANIMATION:
				return getValueAnimation();
			case GraphPackage.LABEL__RICH:
				if (coreType) return getRich();
				else return getRich().map();
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
			case GraphPackage.LABEL__FORMATTER:
				setFormatter((String)newValue);
				return;
			case GraphPackage.LABEL__SHOW:
				setShow((Boolean)newValue);
				return;
			case GraphPackage.LABEL__POSITION:
				setPosition((LabelPosition)newValue);
				return;
			case GraphPackage.LABEL__DISTANCE:
				setDistance((Integer)newValue);
				return;
			case GraphPackage.LABEL__ROTATE:
				setRotate((Double)newValue);
				return;
			case GraphPackage.LABEL__OFFSET:
				getOffset().clear();
				getOffset().addAll((Collection<? extends Integer>)newValue);
				return;
			case GraphPackage.LABEL__MIN_MARGIN:
				setMinMargin((Double)newValue);
				return;
			case GraphPackage.LABEL__OVERFLOW:
				setOverflow((Overflow)newValue);
				return;
			case GraphPackage.LABEL__SILENT:
				setSilent((Boolean)newValue);
				return;
			case GraphPackage.LABEL__PRECISION:
				setPrecision((Double)newValue);
				return;
			case GraphPackage.LABEL__VALUE_ANIMATION:
				setValueAnimation((Boolean)newValue);
				return;
			case GraphPackage.LABEL__RICH:
				((EStructuralFeature.Setting)getRich()).set(newValue);
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
			case GraphPackage.LABEL__FORMATTER:
				setFormatter(FORMATTER_EDEFAULT);
				return;
			case GraphPackage.LABEL__SHOW:
				setShow(SHOW_EDEFAULT);
				return;
			case GraphPackage.LABEL__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case GraphPackage.LABEL__DISTANCE:
				setDistance(DISTANCE_EDEFAULT);
				return;
			case GraphPackage.LABEL__ROTATE:
				setRotate(ROTATE_EDEFAULT);
				return;
			case GraphPackage.LABEL__OFFSET:
				getOffset().clear();
				return;
			case GraphPackage.LABEL__MIN_MARGIN:
				setMinMargin(MIN_MARGIN_EDEFAULT);
				return;
			case GraphPackage.LABEL__OVERFLOW:
				setOverflow(OVERFLOW_EDEFAULT);
				return;
			case GraphPackage.LABEL__SILENT:
				setSilent(SILENT_EDEFAULT);
				return;
			case GraphPackage.LABEL__PRECISION:
				setPrecision(PRECISION_EDEFAULT);
				return;
			case GraphPackage.LABEL__VALUE_ANIMATION:
				setValueAnimation(VALUE_ANIMATION_EDEFAULT);
				return;
			case GraphPackage.LABEL__RICH:
				getRich().clear();
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
			case GraphPackage.LABEL__FORMATTER:
				return FORMATTER_EDEFAULT == null ? getFormatter() != null : !FORMATTER_EDEFAULT.equals(getFormatter());
			case GraphPackage.LABEL__SHOW:
				return SHOW_EDEFAULT == null ? getShow() != null : !SHOW_EDEFAULT.equals(getShow());
			case GraphPackage.LABEL__POSITION:
				return getPosition() != POSITION_EDEFAULT;
			case GraphPackage.LABEL__DISTANCE:
				return DISTANCE_EDEFAULT == null ? getDistance() != null : !DISTANCE_EDEFAULT.equals(getDistance());
			case GraphPackage.LABEL__ROTATE:
				return ROTATE_EDEFAULT == null ? getRotate() != null : !ROTATE_EDEFAULT.equals(getRotate());
			case GraphPackage.LABEL__OFFSET:
				return !getOffset().isEmpty();
			case GraphPackage.LABEL__MIN_MARGIN:
				return MIN_MARGIN_EDEFAULT == null ? getMinMargin() != null : !MIN_MARGIN_EDEFAULT.equals(getMinMargin());
			case GraphPackage.LABEL__OVERFLOW:
				return getOverflow() != OVERFLOW_EDEFAULT;
			case GraphPackage.LABEL__SILENT:
				return SILENT_EDEFAULT == null ? getSilent() != null : !SILENT_EDEFAULT.equals(getSilent());
			case GraphPackage.LABEL__PRECISION:
				return PRECISION_EDEFAULT == null ? getPrecision() != null : !PRECISION_EDEFAULT.equals(getPrecision());
			case GraphPackage.LABEL__VALUE_ANIMATION:
				return VALUE_ANIMATION_EDEFAULT == null ? getValueAnimation() != null : !VALUE_ANIMATION_EDEFAULT.equals(getValueAnimation());
			case GraphPackage.LABEL__RICH:
				return !getRich().isEmpty();
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
			case GraphPackage.LABEL___CREATE_SERIES_LABEL_OPTION:
				return createSeriesLabelOption();
			case GraphPackage.LABEL___CREATE_SERIES_LINE_LABEL_OPTION:
				return createSeriesLineLabelOption();
		}
		return super.eInvoke(operationID, arguments);
	}

} //LabelImpl

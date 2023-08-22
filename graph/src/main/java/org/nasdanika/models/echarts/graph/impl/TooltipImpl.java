/**
 */
package org.nasdanika.models.echarts.graph.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.TextStyle;
import org.nasdanika.models.echarts.graph.Tooltip;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tooltip</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl#getFormatter <em>Formatter</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl#getValueFormatter <em>Value Formatter</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl#getTextStyle <em>Text Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl#getExtraCssText <em>Extra Css Text</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TooltipImpl extends MinimalEObjectImpl.Container implements Tooltip {
	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

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
	 * The default value of the '{@link #getValueFormatter() <em>Value Formatter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValueFormatter()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_FORMATTER_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBackgroundColor() <em>Background Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackgroundColor()
	 * @generated
	 * @ordered
	 */
	protected static final String BACKGROUND_COLOR_EDEFAULT = null;

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
	protected static final Integer BORDER_WIDTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPadding() <em>Padding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPadding()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PADDING_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getExtraCssText() <em>Extra Css Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraCssText()
	 * @generated
	 * @ordered
	 */
	protected static final String EXTRA_CSS_TEXT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TooltipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.TOOLTIP;
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
	public String getPosition() {
		return (String)eDynamicGet(GraphPackage.TOOLTIP__POSITION, GraphPackage.Literals.TOOLTIP__POSITION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPosition(String newPosition) {
		eDynamicSet(GraphPackage.TOOLTIP__POSITION, GraphPackage.Literals.TOOLTIP__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormatter() {
		return (String)eDynamicGet(GraphPackage.TOOLTIP__FORMATTER, GraphPackage.Literals.TOOLTIP__FORMATTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormatter(String newFormatter) {
		eDynamicSet(GraphPackage.TOOLTIP__FORMATTER, GraphPackage.Literals.TOOLTIP__FORMATTER, newFormatter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValueFormatter() {
		return (String)eDynamicGet(GraphPackage.TOOLTIP__VALUE_FORMATTER, GraphPackage.Literals.TOOLTIP__VALUE_FORMATTER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValueFormatter(String newValueFormatter) {
		eDynamicSet(GraphPackage.TOOLTIP__VALUE_FORMATTER, GraphPackage.Literals.TOOLTIP__VALUE_FORMATTER, newValueFormatter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackgroundColor() {
		return (String)eDynamicGet(GraphPackage.TOOLTIP__BACKGROUND_COLOR, GraphPackage.Literals.TOOLTIP__BACKGROUND_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackgroundColor(String newBackgroundColor) {
		eDynamicSet(GraphPackage.TOOLTIP__BACKGROUND_COLOR, GraphPackage.Literals.TOOLTIP__BACKGROUND_COLOR, newBackgroundColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderColor() {
		return (String)eDynamicGet(GraphPackage.TOOLTIP__BORDER_COLOR, GraphPackage.Literals.TOOLTIP__BORDER_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderColor(String newBorderColor) {
		eDynamicSet(GraphPackage.TOOLTIP__BORDER_COLOR, GraphPackage.Literals.TOOLTIP__BORDER_COLOR, newBorderColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBorderWidth() {
		return (Integer)eDynamicGet(GraphPackage.TOOLTIP__BORDER_WIDTH, GraphPackage.Literals.TOOLTIP__BORDER_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderWidth(Integer newBorderWidth) {
		eDynamicSet(GraphPackage.TOOLTIP__BORDER_WIDTH, GraphPackage.Literals.TOOLTIP__BORDER_WIDTH, newBorderWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getPadding() {
		return (Integer)eDynamicGet(GraphPackage.TOOLTIP__PADDING, GraphPackage.Literals.TOOLTIP__PADDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPadding(Integer newPadding) {
		eDynamicSet(GraphPackage.TOOLTIP__PADDING, GraphPackage.Literals.TOOLTIP__PADDING, newPadding);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextStyle getTextStyle() {
		return (TextStyle)eDynamicGet(GraphPackage.TOOLTIP__TEXT_STYLE, GraphPackage.Literals.TOOLTIP__TEXT_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTextStyle(TextStyle newTextStyle, NotificationChain msgs) {
		msgs = eDynamicInverseAdd((InternalEObject)newTextStyle, GraphPackage.TOOLTIP__TEXT_STYLE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextStyle(TextStyle newTextStyle) {
		eDynamicSet(GraphPackage.TOOLTIP__TEXT_STYLE, GraphPackage.Literals.TOOLTIP__TEXT_STYLE, newTextStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExtraCssText() {
		return (String)eDynamicGet(GraphPackage.TOOLTIP__EXTRA_CSS_TEXT, GraphPackage.Literals.TOOLTIP__EXTRA_CSS_TEXT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtraCssText(String newExtraCssText) {
		eDynamicSet(GraphPackage.TOOLTIP__EXTRA_CSS_TEXT, GraphPackage.Literals.TOOLTIP__EXTRA_CSS_TEXT, newExtraCssText);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GraphPackage.TOOLTIP__TEXT_STYLE:
				return basicSetTextStyle(null, msgs);
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
			case GraphPackage.TOOLTIP__POSITION:
				return getPosition();
			case GraphPackage.TOOLTIP__FORMATTER:
				return getFormatter();
			case GraphPackage.TOOLTIP__VALUE_FORMATTER:
				return getValueFormatter();
			case GraphPackage.TOOLTIP__BACKGROUND_COLOR:
				return getBackgroundColor();
			case GraphPackage.TOOLTIP__BORDER_COLOR:
				return getBorderColor();
			case GraphPackage.TOOLTIP__BORDER_WIDTH:
				return getBorderWidth();
			case GraphPackage.TOOLTIP__PADDING:
				return getPadding();
			case GraphPackage.TOOLTIP__TEXT_STYLE:
				return getTextStyle();
			case GraphPackage.TOOLTIP__EXTRA_CSS_TEXT:
				return getExtraCssText();
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
			case GraphPackage.TOOLTIP__POSITION:
				setPosition((String)newValue);
				return;
			case GraphPackage.TOOLTIP__FORMATTER:
				setFormatter((String)newValue);
				return;
			case GraphPackage.TOOLTIP__VALUE_FORMATTER:
				setValueFormatter((String)newValue);
				return;
			case GraphPackage.TOOLTIP__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case GraphPackage.TOOLTIP__BORDER_COLOR:
				setBorderColor((String)newValue);
				return;
			case GraphPackage.TOOLTIP__BORDER_WIDTH:
				setBorderWidth((Integer)newValue);
				return;
			case GraphPackage.TOOLTIP__PADDING:
				setPadding((Integer)newValue);
				return;
			case GraphPackage.TOOLTIP__TEXT_STYLE:
				setTextStyle((TextStyle)newValue);
				return;
			case GraphPackage.TOOLTIP__EXTRA_CSS_TEXT:
				setExtraCssText((String)newValue);
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
			case GraphPackage.TOOLTIP__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case GraphPackage.TOOLTIP__FORMATTER:
				setFormatter(FORMATTER_EDEFAULT);
				return;
			case GraphPackage.TOOLTIP__VALUE_FORMATTER:
				setValueFormatter(VALUE_FORMATTER_EDEFAULT);
				return;
			case GraphPackage.TOOLTIP__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case GraphPackage.TOOLTIP__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case GraphPackage.TOOLTIP__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case GraphPackage.TOOLTIP__PADDING:
				setPadding(PADDING_EDEFAULT);
				return;
			case GraphPackage.TOOLTIP__TEXT_STYLE:
				setTextStyle((TextStyle)null);
				return;
			case GraphPackage.TOOLTIP__EXTRA_CSS_TEXT:
				setExtraCssText(EXTRA_CSS_TEXT_EDEFAULT);
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
			case GraphPackage.TOOLTIP__POSITION:
				return POSITION_EDEFAULT == null ? getPosition() != null : !POSITION_EDEFAULT.equals(getPosition());
			case GraphPackage.TOOLTIP__FORMATTER:
				return FORMATTER_EDEFAULT == null ? getFormatter() != null : !FORMATTER_EDEFAULT.equals(getFormatter());
			case GraphPackage.TOOLTIP__VALUE_FORMATTER:
				return VALUE_FORMATTER_EDEFAULT == null ? getValueFormatter() != null : !VALUE_FORMATTER_EDEFAULT.equals(getValueFormatter());
			case GraphPackage.TOOLTIP__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? getBackgroundColor() != null : !BACKGROUND_COLOR_EDEFAULT.equals(getBackgroundColor());
			case GraphPackage.TOOLTIP__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? getBorderColor() != null : !BORDER_COLOR_EDEFAULT.equals(getBorderColor());
			case GraphPackage.TOOLTIP__BORDER_WIDTH:
				return BORDER_WIDTH_EDEFAULT == null ? getBorderWidth() != null : !BORDER_WIDTH_EDEFAULT.equals(getBorderWidth());
			case GraphPackage.TOOLTIP__PADDING:
				return PADDING_EDEFAULT == null ? getPadding() != null : !PADDING_EDEFAULT.equals(getPadding());
			case GraphPackage.TOOLTIP__TEXT_STYLE:
				return getTextStyle() != null;
			case GraphPackage.TOOLTIP__EXTRA_CSS_TEXT:
				return EXTRA_CSS_TEXT_EDEFAULT == null ? getExtraCssText() != null : !EXTRA_CSS_TEXT_EDEFAULT.equals(getExtraCssText());
		}
		return super.eIsSet(featureID);
	}

} //TooltipImpl

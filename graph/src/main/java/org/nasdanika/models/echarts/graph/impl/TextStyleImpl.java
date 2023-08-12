/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.nasdanika.models.echarts.graph.BorderType;
import org.nasdanika.models.echarts.graph.FontStyle;
import org.nasdanika.models.echarts.graph.FontWeight;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Overflow;
import org.nasdanika.models.echarts.graph.TextStyle;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getTextBorderColor <em>Text Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getTextBorderWidth <em>Text Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getTextBorderType <em>Text Border Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getTextBorderDashOffset <em>Text Border Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getTextShadowColor <em>Text Shadow Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getTextShadowBlur <em>Text Shadow Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getTextShadowOffsetX <em>Text Shadow Offset X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getTextShadowOffsetY <em>Text Shadow Offset Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getOverflow <em>Overflow</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getEllipsis <em>Ellipsis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextStyleImpl extends MinimalEObjectImpl.Container implements TextStyle {
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
	 * The default value of the '{@link #getFontStyle() <em>Font Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontStyle()
	 * @generated
	 * @ordered
	 */
	protected static final FontStyle FONT_STYLE_EDEFAULT = FontStyle.NORMAL;

	/**
	 * The default value of the '{@link #getFontWeight() <em>Font Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontWeight()
	 * @generated
	 * @ordered
	 */
	protected static final FontWeight FONT_WEIGHT_EDEFAULT = FontWeight.NORMAL;

	/**
	 * The default value of the '{@link #getFontFamily() <em>Font Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FONT_FAMILY_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFontSize() <em>Font Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFontSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FONT_SIZE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getLineHeight() <em>Line Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLineHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LINE_HEIGHT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEIGHT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextBorderColor() <em>Text Border Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextBorderColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_BORDER_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextBorderWidth() <em>Text Border Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextBorderWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TEXT_BORDER_WIDTH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextBorderType() <em>Text Border Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextBorderType()
	 * @generated
	 * @ordered
	 */
	protected static final BorderType TEXT_BORDER_TYPE_EDEFAULT = BorderType.SOLID;

	/**
	 * The default value of the '{@link #getTextBorderDashOffset() <em>Text Border Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextBorderDashOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TEXT_BORDER_DASH_OFFSET_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextShadowColor() <em>Text Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextShadowColor()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_SHADOW_COLOR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextShadowBlur() <em>Text Shadow Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextShadowBlur()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal TEXT_SHADOW_BLUR_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextShadowOffsetX() <em>Text Shadow Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextShadowOffsetX()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TEXT_SHADOW_OFFSET_X_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getTextShadowOffsetY() <em>Text Shadow Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTextShadowOffsetY()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TEXT_SHADOW_OFFSET_Y_EDEFAULT = null;

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
	 * The default value of the '{@link #getEllipsis() <em>Ellipsis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEllipsis()
	 * @generated
	 * @ordered
	 */
	protected static final String ELLIPSIS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GraphPackage.Literals.TEXT_STYLE;
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
		return (String)eDynamicGet(GraphPackage.TEXT_STYLE__COLOR, GraphPackage.Literals.TEXT_STYLE__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		eDynamicSet(GraphPackage.TEXT_STYLE__COLOR, GraphPackage.Literals.TEXT_STYLE__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontStyle getFontStyle() {
		return (FontStyle)eDynamicGet(GraphPackage.TEXT_STYLE__FONT_STYLE, GraphPackage.Literals.TEXT_STYLE__FONT_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontStyle(FontStyle newFontStyle) {
		eDynamicSet(GraphPackage.TEXT_STYLE__FONT_STYLE, GraphPackage.Literals.TEXT_STYLE__FONT_STYLE, newFontStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontWeight getFontWeight() {
		return (FontWeight)eDynamicGet(GraphPackage.TEXT_STYLE__FONT_WEIGHT, GraphPackage.Literals.TEXT_STYLE__FONT_WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontWeight(FontWeight newFontWeight) {
		eDynamicSet(GraphPackage.TEXT_STYLE__FONT_WEIGHT, GraphPackage.Literals.TEXT_STYLE__FONT_WEIGHT, newFontWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFontFamily() {
		return (String)eDynamicGet(GraphPackage.TEXT_STYLE__FONT_FAMILY, GraphPackage.Literals.TEXT_STYLE__FONT_FAMILY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontFamily(String newFontFamily) {
		eDynamicSet(GraphPackage.TEXT_STYLE__FONT_FAMILY, GraphPackage.Literals.TEXT_STYLE__FONT_FAMILY, newFontFamily);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFontSize() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__FONT_SIZE, GraphPackage.Literals.TEXT_STYLE__FONT_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontSize(Integer newFontSize) {
		eDynamicSet(GraphPackage.TEXT_STYLE__FONT_SIZE, GraphPackage.Literals.TEXT_STYLE__FONT_SIZE, newFontSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLineHeight() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__LINE_HEIGHT, GraphPackage.Literals.TEXT_STYLE__LINE_HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineHeight(Integer newLineHeight) {
		eDynamicSet(GraphPackage.TEXT_STYLE__LINE_HEIGHT, GraphPackage.Literals.TEXT_STYLE__LINE_HEIGHT, newLineHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWidth() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__WIDTH, GraphPackage.Literals.TEXT_STYLE__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(Integer newWidth) {
		eDynamicSet(GraphPackage.TEXT_STYLE__WIDTH, GraphPackage.Literals.TEXT_STYLE__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHeight() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__HEIGHT, GraphPackage.Literals.TEXT_STYLE__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(Integer newHeight) {
		eDynamicSet(GraphPackage.TEXT_STYLE__HEIGHT, GraphPackage.Literals.TEXT_STYLE__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextBorderColor() {
		return (String)eDynamicGet(GraphPackage.TEXT_STYLE__TEXT_BORDER_COLOR, GraphPackage.Literals.TEXT_STYLE__TEXT_BORDER_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextBorderColor(String newTextBorderColor) {
		eDynamicSet(GraphPackage.TEXT_STYLE__TEXT_BORDER_COLOR, GraphPackage.Literals.TEXT_STYLE__TEXT_BORDER_COLOR, newTextBorderColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTextBorderWidth() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__TEXT_BORDER_WIDTH, GraphPackage.Literals.TEXT_STYLE__TEXT_BORDER_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextBorderWidth(Integer newTextBorderWidth) {
		eDynamicSet(GraphPackage.TEXT_STYLE__TEXT_BORDER_WIDTH, GraphPackage.Literals.TEXT_STYLE__TEXT_BORDER_WIDTH, newTextBorderWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorderType getTextBorderType() {
		return (BorderType)eDynamicGet(GraphPackage.TEXT_STYLE__TEXT_BORDER_TYPE, GraphPackage.Literals.TEXT_STYLE__TEXT_BORDER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextBorderType(BorderType newTextBorderType) {
		eDynamicSet(GraphPackage.TEXT_STYLE__TEXT_BORDER_TYPE, GraphPackage.Literals.TEXT_STYLE__TEXT_BORDER_TYPE, newTextBorderType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTextBorderDashOffset() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__TEXT_BORDER_DASH_OFFSET, GraphPackage.Literals.TEXT_STYLE__TEXT_BORDER_DASH_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextBorderDashOffset(Integer newTextBorderDashOffset) {
		eDynamicSet(GraphPackage.TEXT_STYLE__TEXT_BORDER_DASH_OFFSET, GraphPackage.Literals.TEXT_STYLE__TEXT_BORDER_DASH_OFFSET, newTextBorderDashOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextShadowColor() {
		return (String)eDynamicGet(GraphPackage.TEXT_STYLE__TEXT_SHADOW_COLOR, GraphPackage.Literals.TEXT_STYLE__TEXT_SHADOW_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextShadowColor(String newTextShadowColor) {
		eDynamicSet(GraphPackage.TEXT_STYLE__TEXT_SHADOW_COLOR, GraphPackage.Literals.TEXT_STYLE__TEXT_SHADOW_COLOR, newTextShadowColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTextShadowBlur() {
		return (BigDecimal)eDynamicGet(GraphPackage.TEXT_STYLE__TEXT_SHADOW_BLUR, GraphPackage.Literals.TEXT_STYLE__TEXT_SHADOW_BLUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextShadowBlur(BigDecimal newTextShadowBlur) {
		eDynamicSet(GraphPackage.TEXT_STYLE__TEXT_SHADOW_BLUR, GraphPackage.Literals.TEXT_STYLE__TEXT_SHADOW_BLUR, newTextShadowBlur);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTextShadowOffsetX() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_X, GraphPackage.Literals.TEXT_STYLE__TEXT_SHADOW_OFFSET_X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextShadowOffsetX(Integer newTextShadowOffsetX) {
		eDynamicSet(GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_X, GraphPackage.Literals.TEXT_STYLE__TEXT_SHADOW_OFFSET_X, newTextShadowOffsetX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTextShadowOffsetY() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_Y, GraphPackage.Literals.TEXT_STYLE__TEXT_SHADOW_OFFSET_Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextShadowOffsetY(Integer newTextShadowOffsetY) {
		eDynamicSet(GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_Y, GraphPackage.Literals.TEXT_STYLE__TEXT_SHADOW_OFFSET_Y, newTextShadowOffsetY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Overflow getOverflow() {
		return (Overflow)eDynamicGet(GraphPackage.TEXT_STYLE__OVERFLOW, GraphPackage.Literals.TEXT_STYLE__OVERFLOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOverflow(Overflow newOverflow) {
		eDynamicSet(GraphPackage.TEXT_STYLE__OVERFLOW, GraphPackage.Literals.TEXT_STYLE__OVERFLOW, newOverflow);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEllipsis() {
		return (String)eDynamicGet(GraphPackage.TEXT_STYLE__ELLIPSIS, GraphPackage.Literals.TEXT_STYLE__ELLIPSIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsis(String newEllipsis) {
		eDynamicSet(GraphPackage.TEXT_STYLE__ELLIPSIS, GraphPackage.Literals.TEXT_STYLE__ELLIPSIS, newEllipsis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.TEXT_STYLE__COLOR:
				return getColor();
			case GraphPackage.TEXT_STYLE__FONT_STYLE:
				return getFontStyle();
			case GraphPackage.TEXT_STYLE__FONT_WEIGHT:
				return getFontWeight();
			case GraphPackage.TEXT_STYLE__FONT_FAMILY:
				return getFontFamily();
			case GraphPackage.TEXT_STYLE__FONT_SIZE:
				return getFontSize();
			case GraphPackage.TEXT_STYLE__LINE_HEIGHT:
				return getLineHeight();
			case GraphPackage.TEXT_STYLE__WIDTH:
				return getWidth();
			case GraphPackage.TEXT_STYLE__HEIGHT:
				return getHeight();
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_COLOR:
				return getTextBorderColor();
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_WIDTH:
				return getTextBorderWidth();
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_TYPE:
				return getTextBorderType();
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_DASH_OFFSET:
				return getTextBorderDashOffset();
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_COLOR:
				return getTextShadowColor();
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_BLUR:
				return getTextShadowBlur();
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_X:
				return getTextShadowOffsetX();
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_Y:
				return getTextShadowOffsetY();
			case GraphPackage.TEXT_STYLE__OVERFLOW:
				return getOverflow();
			case GraphPackage.TEXT_STYLE__ELLIPSIS:
				return getEllipsis();
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
			case GraphPackage.TEXT_STYLE__COLOR:
				setColor((String)newValue);
				return;
			case GraphPackage.TEXT_STYLE__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case GraphPackage.TEXT_STYLE__FONT_WEIGHT:
				setFontWeight((FontWeight)newValue);
				return;
			case GraphPackage.TEXT_STYLE__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case GraphPackage.TEXT_STYLE__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__LINE_HEIGHT:
				setLineHeight((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__WIDTH:
				setWidth((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_COLOR:
				setTextBorderColor((String)newValue);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_WIDTH:
				setTextBorderWidth((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_TYPE:
				setTextBorderType((BorderType)newValue);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_DASH_OFFSET:
				setTextBorderDashOffset((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_COLOR:
				setTextShadowColor((String)newValue);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_BLUR:
				setTextShadowBlur((BigDecimal)newValue);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_X:
				setTextShadowOffsetX((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_Y:
				setTextShadowOffsetY((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__OVERFLOW:
				setOverflow((Overflow)newValue);
				return;
			case GraphPackage.TEXT_STYLE__ELLIPSIS:
				setEllipsis((String)newValue);
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
			case GraphPackage.TEXT_STYLE__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__FONT_STYLE:
				setFontStyle(FONT_STYLE_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__FONT_WEIGHT:
				setFontWeight(FONT_WEIGHT_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__LINE_HEIGHT:
				setLineHeight(LINE_HEIGHT_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_COLOR:
				setTextBorderColor(TEXT_BORDER_COLOR_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_WIDTH:
				setTextBorderWidth(TEXT_BORDER_WIDTH_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_TYPE:
				setTextBorderType(TEXT_BORDER_TYPE_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_DASH_OFFSET:
				setTextBorderDashOffset(TEXT_BORDER_DASH_OFFSET_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_COLOR:
				setTextShadowColor(TEXT_SHADOW_COLOR_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_BLUR:
				setTextShadowBlur(TEXT_SHADOW_BLUR_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_X:
				setTextShadowOffsetX(TEXT_SHADOW_OFFSET_X_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_Y:
				setTextShadowOffsetY(TEXT_SHADOW_OFFSET_Y_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__OVERFLOW:
				setOverflow(OVERFLOW_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__ELLIPSIS:
				setEllipsis(ELLIPSIS_EDEFAULT);
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
			case GraphPackage.TEXT_STYLE__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case GraphPackage.TEXT_STYLE__FONT_STYLE:
				return getFontStyle() != FONT_STYLE_EDEFAULT;
			case GraphPackage.TEXT_STYLE__FONT_WEIGHT:
				return getFontWeight() != FONT_WEIGHT_EDEFAULT;
			case GraphPackage.TEXT_STYLE__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? getFontFamily() != null : !FONT_FAMILY_EDEFAULT.equals(getFontFamily());
			case GraphPackage.TEXT_STYLE__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? getFontSize() != null : !FONT_SIZE_EDEFAULT.equals(getFontSize());
			case GraphPackage.TEXT_STYLE__LINE_HEIGHT:
				return LINE_HEIGHT_EDEFAULT == null ? getLineHeight() != null : !LINE_HEIGHT_EDEFAULT.equals(getLineHeight());
			case GraphPackage.TEXT_STYLE__WIDTH:
				return WIDTH_EDEFAULT == null ? getWidth() != null : !WIDTH_EDEFAULT.equals(getWidth());
			case GraphPackage.TEXT_STYLE__HEIGHT:
				return HEIGHT_EDEFAULT == null ? getHeight() != null : !HEIGHT_EDEFAULT.equals(getHeight());
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_COLOR:
				return TEXT_BORDER_COLOR_EDEFAULT == null ? getTextBorderColor() != null : !TEXT_BORDER_COLOR_EDEFAULT.equals(getTextBorderColor());
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_WIDTH:
				return TEXT_BORDER_WIDTH_EDEFAULT == null ? getTextBorderWidth() != null : !TEXT_BORDER_WIDTH_EDEFAULT.equals(getTextBorderWidth());
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_TYPE:
				return getTextBorderType() != TEXT_BORDER_TYPE_EDEFAULT;
			case GraphPackage.TEXT_STYLE__TEXT_BORDER_DASH_OFFSET:
				return TEXT_BORDER_DASH_OFFSET_EDEFAULT == null ? getTextBorderDashOffset() != null : !TEXT_BORDER_DASH_OFFSET_EDEFAULT.equals(getTextBorderDashOffset());
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_COLOR:
				return TEXT_SHADOW_COLOR_EDEFAULT == null ? getTextShadowColor() != null : !TEXT_SHADOW_COLOR_EDEFAULT.equals(getTextShadowColor());
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_BLUR:
				return TEXT_SHADOW_BLUR_EDEFAULT == null ? getTextShadowBlur() != null : !TEXT_SHADOW_BLUR_EDEFAULT.equals(getTextShadowBlur());
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_X:
				return TEXT_SHADOW_OFFSET_X_EDEFAULT == null ? getTextShadowOffsetX() != null : !TEXT_SHADOW_OFFSET_X_EDEFAULT.equals(getTextShadowOffsetX());
			case GraphPackage.TEXT_STYLE__TEXT_SHADOW_OFFSET_Y:
				return TEXT_SHADOW_OFFSET_Y_EDEFAULT == null ? getTextShadowOffsetY() != null : !TEXT_SHADOW_OFFSET_Y_EDEFAULT.equals(getTextShadowOffsetY());
			case GraphPackage.TEXT_STYLE__OVERFLOW:
				return getOverflow() != OVERFLOW_EDEFAULT;
			case GraphPackage.TEXT_STYLE__ELLIPSIS:
				return ELLIPSIS_EDEFAULT == null ? getEllipsis() != null : !ELLIPSIS_EDEFAULT.equals(getEllipsis());
		}
		return super.eIsSet(featureID);
	}

} //TextStyleImpl

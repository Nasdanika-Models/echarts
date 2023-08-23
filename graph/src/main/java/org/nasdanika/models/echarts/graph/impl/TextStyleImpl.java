/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.math.BigDecimal;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.icepear.echarts.origin.util.TextCommonOption;
import org.nasdanika.models.echarts.graph.Align;
import org.nasdanika.models.echarts.graph.BorderType;
import org.nasdanika.models.echarts.graph.FontStyle;
import org.nasdanika.models.echarts.graph.FontWeight;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.TextStyle;
import org.nasdanika.models.echarts.graph.VerticalAlign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getVerticalAlign <em>Vertical Align</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getBaseline <em>Baseline</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getBorderType <em>Border Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getBorderDashOffset <em>Border Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getBorderRadius <em>Border Radius</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getPadding <em>Padding</em>}</li>
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
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl#getTag <em>Tag</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextStyleImpl extends StyleImpl implements TextStyle {
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
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Align ALIGN_EDEFAULT = Align.LEFT;

	/**
	 * The default value of the '{@link #getVerticalAlign() <em>Vertical Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVerticalAlign()
	 * @generated
	 * @ordered
	 */
	protected static final VerticalAlign VERTICAL_ALIGN_EDEFAULT = VerticalAlign.TOP;

	/**
	 * The default value of the '{@link #getBaseline() <em>Baseline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseline()
	 * @generated
	 * @ordered
	 */
	protected static final String BASELINE_EDEFAULT = null;

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
	 * The default value of the '{@link #getBorderType() <em>Border Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderType()
	 * @generated
	 * @ordered
	 */
	protected static final BorderType BORDER_TYPE_EDEFAULT = BorderType.SOLID;

	/**
	 * The default value of the '{@link #getBorderDashOffset() <em>Border Dash Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderDashOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BORDER_DASH_OFFSET_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getBorderRadius() <em>Border Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBorderRadius()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BORDER_RADIUS_EDEFAULT = null;

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
	 * The default value of the '{@link #getTag() <em>Tag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTag()
	 * @generated
	 * @ordered
	 */
	protected static final String TAG_EDEFAULT = null;

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
	public String getTag() {
		return (String)eDynamicGet(GraphPackage.TEXT_STYLE__TAG, GraphPackage.Literals.TEXT_STYLE__TAG, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTag(String newTag) {
		eDynamicSet(GraphPackage.TEXT_STYLE__TAG, GraphPackage.Literals.TEXT_STYLE__TAG, newTag);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Align getAlign() {
		return (Align)eDynamicGet(GraphPackage.TEXT_STYLE__ALIGN, GraphPackage.Literals.TEXT_STYLE__ALIGN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign(Align newAlign) {
		eDynamicSet(GraphPackage.TEXT_STYLE__ALIGN, GraphPackage.Literals.TEXT_STYLE__ALIGN, newAlign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalAlign getVerticalAlign() {
		return (VerticalAlign)eDynamicGet(GraphPackage.TEXT_STYLE__VERTICAL_ALIGN, GraphPackage.Literals.TEXT_STYLE__VERTICAL_ALIGN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalAlign(VerticalAlign newVerticalAlign) {
		eDynamicSet(GraphPackage.TEXT_STYLE__VERTICAL_ALIGN, GraphPackage.Literals.TEXT_STYLE__VERTICAL_ALIGN, newVerticalAlign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBaseline() {
		return (String)eDynamicGet(GraphPackage.TEXT_STYLE__BASELINE, GraphPackage.Literals.TEXT_STYLE__BASELINE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBaseline(String newBaseline) {
		eDynamicSet(GraphPackage.TEXT_STYLE__BASELINE, GraphPackage.Literals.TEXT_STYLE__BASELINE, newBaseline);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackgroundColor() {
		return (String)eDynamicGet(GraphPackage.TEXT_STYLE__BACKGROUND_COLOR, GraphPackage.Literals.TEXT_STYLE__BACKGROUND_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackgroundColor(String newBackgroundColor) {
		eDynamicSet(GraphPackage.TEXT_STYLE__BACKGROUND_COLOR, GraphPackage.Literals.TEXT_STYLE__BACKGROUND_COLOR, newBackgroundColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderColor() {
		return (String)eDynamicGet(GraphPackage.TEXT_STYLE__BORDER_COLOR, GraphPackage.Literals.TEXT_STYLE__BORDER_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderColor(String newBorderColor) {
		eDynamicSet(GraphPackage.TEXT_STYLE__BORDER_COLOR, GraphPackage.Literals.TEXT_STYLE__BORDER_COLOR, newBorderColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBorderWidth() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__BORDER_WIDTH, GraphPackage.Literals.TEXT_STYLE__BORDER_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderWidth(Integer newBorderWidth) {
		eDynamicSet(GraphPackage.TEXT_STYLE__BORDER_WIDTH, GraphPackage.Literals.TEXT_STYLE__BORDER_WIDTH, newBorderWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorderType getBorderType() {
		return (BorderType)eDynamicGet(GraphPackage.TEXT_STYLE__BORDER_TYPE, GraphPackage.Literals.TEXT_STYLE__BORDER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderType(BorderType newBorderType) {
		eDynamicSet(GraphPackage.TEXT_STYLE__BORDER_TYPE, GraphPackage.Literals.TEXT_STYLE__BORDER_TYPE, newBorderType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBorderDashOffset() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__BORDER_DASH_OFFSET, GraphPackage.Literals.TEXT_STYLE__BORDER_DASH_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderDashOffset(Integer newBorderDashOffset) {
		eDynamicSet(GraphPackage.TEXT_STYLE__BORDER_DASH_OFFSET, GraphPackage.Literals.TEXT_STYLE__BORDER_DASH_OFFSET, newBorderDashOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBorderRadius() {
		return (Integer)eDynamicGet(GraphPackage.TEXT_STYLE__BORDER_RADIUS, GraphPackage.Literals.TEXT_STYLE__BORDER_RADIUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderRadius(Integer newBorderRadius) {
		eDynamicSet(GraphPackage.TEXT_STYLE__BORDER_RADIUS, GraphPackage.Literals.TEXT_STYLE__BORDER_RADIUS, newBorderRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Integer> getPadding() {
		return (EList<Integer>)eDynamicGet(GraphPackage.TEXT_STYLE__PADDING, GraphPackage.Literals.TEXT_STYLE__PADDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GraphPackage.TEXT_STYLE__FONT_STYLE:
				return getFontStyle();
			case GraphPackage.TEXT_STYLE__FONT_WEIGHT:
				return getFontWeight();
			case GraphPackage.TEXT_STYLE__FONT_FAMILY:
				return getFontFamily();
			case GraphPackage.TEXT_STYLE__FONT_SIZE:
				return getFontSize();
			case GraphPackage.TEXT_STYLE__ALIGN:
				return getAlign();
			case GraphPackage.TEXT_STYLE__VERTICAL_ALIGN:
				return getVerticalAlign();
			case GraphPackage.TEXT_STYLE__BASELINE:
				return getBaseline();
			case GraphPackage.TEXT_STYLE__LINE_HEIGHT:
				return getLineHeight();
			case GraphPackage.TEXT_STYLE__BACKGROUND_COLOR:
				return getBackgroundColor();
			case GraphPackage.TEXT_STYLE__BORDER_COLOR:
				return getBorderColor();
			case GraphPackage.TEXT_STYLE__BORDER_WIDTH:
				return getBorderWidth();
			case GraphPackage.TEXT_STYLE__BORDER_TYPE:
				return getBorderType();
			case GraphPackage.TEXT_STYLE__BORDER_DASH_OFFSET:
				return getBorderDashOffset();
			case GraphPackage.TEXT_STYLE__BORDER_RADIUS:
				return getBorderRadius();
			case GraphPackage.TEXT_STYLE__PADDING:
				return getPadding();
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
			case GraphPackage.TEXT_STYLE__TAG:
				return getTag();
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
			case GraphPackage.TEXT_STYLE__ALIGN:
				setAlign((Align)newValue);
				return;
			case GraphPackage.TEXT_STYLE__VERTICAL_ALIGN:
				setVerticalAlign((VerticalAlign)newValue);
				return;
			case GraphPackage.TEXT_STYLE__BASELINE:
				setBaseline((String)newValue);
				return;
			case GraphPackage.TEXT_STYLE__LINE_HEIGHT:
				setLineHeight((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case GraphPackage.TEXT_STYLE__BORDER_COLOR:
				setBorderColor((String)newValue);
				return;
			case GraphPackage.TEXT_STYLE__BORDER_WIDTH:
				setBorderWidth((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__BORDER_TYPE:
				setBorderType((BorderType)newValue);
				return;
			case GraphPackage.TEXT_STYLE__BORDER_DASH_OFFSET:
				setBorderDashOffset((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__BORDER_RADIUS:
				setBorderRadius((Integer)newValue);
				return;
			case GraphPackage.TEXT_STYLE__PADDING:
				getPadding().clear();
				getPadding().addAll((Collection<? extends Integer>)newValue);
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
			case GraphPackage.TEXT_STYLE__TAG:
				setTag((String)newValue);
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
			case GraphPackage.TEXT_STYLE__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__VERTICAL_ALIGN:
				setVerticalAlign(VERTICAL_ALIGN_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__BASELINE:
				setBaseline(BASELINE_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__LINE_HEIGHT:
				setLineHeight(LINE_HEIGHT_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__BORDER_TYPE:
				setBorderType(BORDER_TYPE_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__BORDER_DASH_OFFSET:
				setBorderDashOffset(BORDER_DASH_OFFSET_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__BORDER_RADIUS:
				setBorderRadius(BORDER_RADIUS_EDEFAULT);
				return;
			case GraphPackage.TEXT_STYLE__PADDING:
				getPadding().clear();
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
			case GraphPackage.TEXT_STYLE__TAG:
				setTag(TAG_EDEFAULT);
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
			case GraphPackage.TEXT_STYLE__FONT_STYLE:
				return getFontStyle() != FONT_STYLE_EDEFAULT;
			case GraphPackage.TEXT_STYLE__FONT_WEIGHT:
				return getFontWeight() != FONT_WEIGHT_EDEFAULT;
			case GraphPackage.TEXT_STYLE__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? getFontFamily() != null : !FONT_FAMILY_EDEFAULT.equals(getFontFamily());
			case GraphPackage.TEXT_STYLE__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? getFontSize() != null : !FONT_SIZE_EDEFAULT.equals(getFontSize());
			case GraphPackage.TEXT_STYLE__ALIGN:
				return getAlign() != ALIGN_EDEFAULT;
			case GraphPackage.TEXT_STYLE__VERTICAL_ALIGN:
				return getVerticalAlign() != VERTICAL_ALIGN_EDEFAULT;
			case GraphPackage.TEXT_STYLE__BASELINE:
				return BASELINE_EDEFAULT == null ? getBaseline() != null : !BASELINE_EDEFAULT.equals(getBaseline());
			case GraphPackage.TEXT_STYLE__LINE_HEIGHT:
				return LINE_HEIGHT_EDEFAULT == null ? getLineHeight() != null : !LINE_HEIGHT_EDEFAULT.equals(getLineHeight());
			case GraphPackage.TEXT_STYLE__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? getBackgroundColor() != null : !BACKGROUND_COLOR_EDEFAULT.equals(getBackgroundColor());
			case GraphPackage.TEXT_STYLE__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? getBorderColor() != null : !BORDER_COLOR_EDEFAULT.equals(getBorderColor());
			case GraphPackage.TEXT_STYLE__BORDER_WIDTH:
				return BORDER_WIDTH_EDEFAULT == null ? getBorderWidth() != null : !BORDER_WIDTH_EDEFAULT.equals(getBorderWidth());
			case GraphPackage.TEXT_STYLE__BORDER_TYPE:
				return getBorderType() != BORDER_TYPE_EDEFAULT;
			case GraphPackage.TEXT_STYLE__BORDER_DASH_OFFSET:
				return BORDER_DASH_OFFSET_EDEFAULT == null ? getBorderDashOffset() != null : !BORDER_DASH_OFFSET_EDEFAULT.equals(getBorderDashOffset());
			case GraphPackage.TEXT_STYLE__BORDER_RADIUS:
				return BORDER_RADIUS_EDEFAULT == null ? getBorderRadius() != null : !BORDER_RADIUS_EDEFAULT.equals(getBorderRadius());
			case GraphPackage.TEXT_STYLE__PADDING:
				return !getPadding().isEmpty();
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
			case GraphPackage.TEXT_STYLE__TAG:
				return TAG_EDEFAULT == null ? getTag() != null : !TAG_EDEFAULT.equals(getTag());
		}
		return super.eIsSet(featureID);
	}
	
	protected void configureTextCommonOption(TextCommonOption textCommonOption) {
		textCommonOption.setColor(getColor());
		
		FontStyle fontStyle = getFontStyle();
		if (fontStyle != null) {
			textCommonOption.setFontStyle(fontStyle.getLiteral());
		}
		
		FontWeight fontWeight = getFontWeight();
		if (fontWeight != null) {
			textCommonOption.setFontWeight(fontWeight.getLiteral());
		}
		
		textCommonOption.setFontFamily(getFontFamily());
		textCommonOption.setFontSize(getFontSize());		
		
		Align align = getAlign();
		if (align != null) {
			textCommonOption.setAlign(align.getLiteral());
		}
		
		VerticalAlign vAlign = getVerticalAlign();
		if (vAlign != null) {
			textCommonOption.setVerticalAlign(vAlign.getLiteral());
		}
		
		textCommonOption.setBaseline(getBaseline());		
		textCommonOption.setLineHeight(getLineHeight());
		textCommonOption.setBackgroundColor(getBackgroundColor());
		textCommonOption.setBorderColor(getBorderColor());
		textCommonOption.setBorderWidth(getBorderWidth());
		
		BorderType borderType = getBorderType();
		if (borderType != null) {
			textCommonOption.setBorderType(borderType.getLiteral());
		}
		
		textCommonOption.setBorderDashOffset(getBorderDashOffset());
		textCommonOption.setBorderRadius(getBorderRadius());
		EList<Integer> padding = getPadding();
		if (padding.size() == 1) {
			textCommonOption.setPadding(getPadding().get(0));			
		} else if (!padding.isEmpty()) {
			textCommonOption.setPadding(padding.toArray(new Integer[padding.size()]));			
		}
		textCommonOption.setWidth(getWidth());
		textCommonOption.setHeight(getHeight());
		
		textCommonOption.setTextBorderColor(getTextBorderColor());
		textCommonOption.setTextBorderWidth(getTextBorderWidth());
		
		BorderType textBorderType = getTextBorderType();
		if (textBorderType != null) {
			textCommonOption.setTextBorderType(textBorderType.getLiteral());
		}
		
		textCommonOption.setTextBorderDashOffset(getTextBorderDashOffset());
		textCommonOption.setTextShadowBlur(getTextShadowBlur());
		textCommonOption.setTextShadowColor(getTextShadowColor());
		textCommonOption.setTextShadowOffsetX(getTextShadowOffsetX());
		textCommonOption.setTextShadowOffsetY(getTextShadowOffsetY());
		textCommonOption.setTag(getTag());

		textCommonOption.setOpacity(getOpacity());		
		textCommonOption.setShadowBlur(getShadowBlur());
		textCommonOption.setShadowColor(getShadowColor());
		textCommonOption.setShadowOffsetX(getShadowOffsetX());
		textCommonOption.setShadowOffsetY(getShadowOffsetY());
	}

} //TextStyleImpl

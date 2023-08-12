/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.math.BigDecimal;
import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.InternalEList;
import org.nasdanika.models.echarts.graph.Align;
import org.nasdanika.models.echarts.graph.BorderType;
import org.nasdanika.models.echarts.graph.FontStyle;
import org.nasdanika.models.echarts.graph.FontWeight;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Label;
import org.nasdanika.models.echarts.graph.LabelPosition;
import org.nasdanika.models.echarts.graph.Overflow;
import org.nasdanika.models.echarts.graph.VerticalAlign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#isShow <em>Show</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getRotate <em>Rotate</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getOffset <em>Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getFontStyle <em>Font Style</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getFontWeight <em>Font Weight</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getFontFamily <em>Font Family</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getFontSize <em>Font Size</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getAlign <em>Align</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getVerticalAlign <em>Vertical Align</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getLineHeight <em>Line Height</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getBorderColor <em>Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getBorderWidth <em>Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getBorderType <em>Border Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getBorderDashOffset <em>Border Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getBorderRadius <em>Border Radius</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getPadding <em>Padding</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getShadowColor <em>Shadow Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getShadowBlur <em>Shadow Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getShadowOffsetX <em>Shadow Offset X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getShadowOffsetY <em>Shadow Offset Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getTextBorderColor <em>Text Border Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getTextBorderWidth <em>Text Border Width</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getTextBorderType <em>Text Border Type</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getTextBorderDashOffset <em>Text Border Dash Offset</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getTextShadowColor <em>Text Shadow Color</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getTextShadowBlur <em>Text Shadow Blur</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getTextShadowOffsetX <em>Text Shadow Offset X</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getTextShadowOffsetY <em>Text Shadow Offset Y</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getOverflow <em>Overflow</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getEllipsis <em>Ellipsis</em>}</li>
 *   <li>{@link org.nasdanika.models.echarts.graph.impl.LabelImpl#getRich <em>Rich</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends MinimalEObjectImpl.Container implements Label {
	/**
	 * The default value of the '{@link #isShow() <em>Show</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isShow()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SHOW_EDEFAULT = true;
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
	 * The default value of the '{@link #getShadowColor() <em>Shadow Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowColor()
	 * @generated
	 * @ordered
	 */
	protected static final String SHADOW_COLOR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getShadowBlur() <em>Shadow Blur</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowBlur()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal SHADOW_BLUR_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getShadowOffsetX() <em>Shadow Offset X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowOffsetX()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SHADOW_OFFSET_X_EDEFAULT = null;
	/**
	 * The default value of the '{@link #getShadowOffsetY() <em>Shadow Offset Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShadowOffsetY()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SHADOW_OFFSET_Y_EDEFAULT = null;
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
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isShow() {
		return (Boolean)eDynamicGet(GraphPackage.LABEL__SHOW, GraphPackage.Literals.LABEL__SHOW, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShow(boolean newShow) {
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
	public String getColor() {
		return (String)eDynamicGet(GraphPackage.LABEL__COLOR, GraphPackage.Literals.LABEL__COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setColor(String newColor) {
		eDynamicSet(GraphPackage.LABEL__COLOR, GraphPackage.Literals.LABEL__COLOR, newColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontStyle getFontStyle() {
		return (FontStyle)eDynamicGet(GraphPackage.LABEL__FONT_STYLE, GraphPackage.Literals.LABEL__FONT_STYLE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontStyle(FontStyle newFontStyle) {
		eDynamicSet(GraphPackage.LABEL__FONT_STYLE, GraphPackage.Literals.LABEL__FONT_STYLE, newFontStyle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FontWeight getFontWeight() {
		return (FontWeight)eDynamicGet(GraphPackage.LABEL__FONT_WEIGHT, GraphPackage.Literals.LABEL__FONT_WEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontWeight(FontWeight newFontWeight) {
		eDynamicSet(GraphPackage.LABEL__FONT_WEIGHT, GraphPackage.Literals.LABEL__FONT_WEIGHT, newFontWeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFontFamily() {
		return (String)eDynamicGet(GraphPackage.LABEL__FONT_FAMILY, GraphPackage.Literals.LABEL__FONT_FAMILY, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontFamily(String newFontFamily) {
		eDynamicSet(GraphPackage.LABEL__FONT_FAMILY, GraphPackage.Literals.LABEL__FONT_FAMILY, newFontFamily);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getFontSize() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__FONT_SIZE, GraphPackage.Literals.LABEL__FONT_SIZE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFontSize(Integer newFontSize) {
		eDynamicSet(GraphPackage.LABEL__FONT_SIZE, GraphPackage.Literals.LABEL__FONT_SIZE, newFontSize);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Align getAlign() {
		return (Align)eDynamicGet(GraphPackage.LABEL__ALIGN, GraphPackage.Literals.LABEL__ALIGN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAlign(Align newAlign) {
		eDynamicSet(GraphPackage.LABEL__ALIGN, GraphPackage.Literals.LABEL__ALIGN, newAlign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VerticalAlign getVerticalAlign() {
		return (VerticalAlign)eDynamicGet(GraphPackage.LABEL__VERTICAL_ALIGN, GraphPackage.Literals.LABEL__VERTICAL_ALIGN, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVerticalAlign(VerticalAlign newVerticalAlign) {
		eDynamicSet(GraphPackage.LABEL__VERTICAL_ALIGN, GraphPackage.Literals.LABEL__VERTICAL_ALIGN, newVerticalAlign);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getLineHeight() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__LINE_HEIGHT, GraphPackage.Literals.LABEL__LINE_HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLineHeight(Integer newLineHeight) {
		eDynamicSet(GraphPackage.LABEL__LINE_HEIGHT, GraphPackage.Literals.LABEL__LINE_HEIGHT, newLineHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBackgroundColor() {
		return (String)eDynamicGet(GraphPackage.LABEL__BACKGROUND_COLOR, GraphPackage.Literals.LABEL__BACKGROUND_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBackgroundColor(String newBackgroundColor) {
		eDynamicSet(GraphPackage.LABEL__BACKGROUND_COLOR, GraphPackage.Literals.LABEL__BACKGROUND_COLOR, newBackgroundColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBorderColor() {
		return (String)eDynamicGet(GraphPackage.LABEL__BORDER_COLOR, GraphPackage.Literals.LABEL__BORDER_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderColor(String newBorderColor) {
		eDynamicSet(GraphPackage.LABEL__BORDER_COLOR, GraphPackage.Literals.LABEL__BORDER_COLOR, newBorderColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBorderWidth() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__BORDER_WIDTH, GraphPackage.Literals.LABEL__BORDER_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderWidth(Integer newBorderWidth) {
		eDynamicSet(GraphPackage.LABEL__BORDER_WIDTH, GraphPackage.Literals.LABEL__BORDER_WIDTH, newBorderWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorderType getBorderType() {
		return (BorderType)eDynamicGet(GraphPackage.LABEL__BORDER_TYPE, GraphPackage.Literals.LABEL__BORDER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderType(BorderType newBorderType) {
		eDynamicSet(GraphPackage.LABEL__BORDER_TYPE, GraphPackage.Literals.LABEL__BORDER_TYPE, newBorderType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBorderDashOffset() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__BORDER_DASH_OFFSET, GraphPackage.Literals.LABEL__BORDER_DASH_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderDashOffset(Integer newBorderDashOffset) {
		eDynamicSet(GraphPackage.LABEL__BORDER_DASH_OFFSET, GraphPackage.Literals.LABEL__BORDER_DASH_OFFSET, newBorderDashOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getBorderRadius() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__BORDER_RADIUS, GraphPackage.Literals.LABEL__BORDER_RADIUS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBorderRadius(Integer newBorderRadius) {
		eDynamicSet(GraphPackage.LABEL__BORDER_RADIUS, GraphPackage.Literals.LABEL__BORDER_RADIUS, newBorderRadius);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Integer> getPadding() {
		return (EList<Integer>)eDynamicGet(GraphPackage.LABEL__PADDING, GraphPackage.Literals.LABEL__PADDING, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getShadowColor() {
		return (String)eDynamicGet(GraphPackage.LABEL__SHADOW_COLOR, GraphPackage.Literals.LABEL__SHADOW_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowColor(String newShadowColor) {
		eDynamicSet(GraphPackage.LABEL__SHADOW_COLOR, GraphPackage.Literals.LABEL__SHADOW_COLOR, newShadowColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getShadowBlur() {
		return (BigDecimal)eDynamicGet(GraphPackage.LABEL__SHADOW_BLUR, GraphPackage.Literals.LABEL__SHADOW_BLUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowBlur(BigDecimal newShadowBlur) {
		eDynamicSet(GraphPackage.LABEL__SHADOW_BLUR, GraphPackage.Literals.LABEL__SHADOW_BLUR, newShadowBlur);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getShadowOffsetX() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__SHADOW_OFFSET_X, GraphPackage.Literals.LABEL__SHADOW_OFFSET_X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowOffsetX(Integer newShadowOffsetX) {
		eDynamicSet(GraphPackage.LABEL__SHADOW_OFFSET_X, GraphPackage.Literals.LABEL__SHADOW_OFFSET_X, newShadowOffsetX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getShadowOffsetY() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__SHADOW_OFFSET_Y, GraphPackage.Literals.LABEL__SHADOW_OFFSET_Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setShadowOffsetY(Integer newShadowOffsetY) {
		eDynamicSet(GraphPackage.LABEL__SHADOW_OFFSET_Y, GraphPackage.Literals.LABEL__SHADOW_OFFSET_Y, newShadowOffsetY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getWidth() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__WIDTH, GraphPackage.Literals.LABEL__WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWidth(Integer newWidth) {
		eDynamicSet(GraphPackage.LABEL__WIDTH, GraphPackage.Literals.LABEL__WIDTH, newWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getHeight() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__HEIGHT, GraphPackage.Literals.LABEL__HEIGHT, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setHeight(Integer newHeight) {
		eDynamicSet(GraphPackage.LABEL__HEIGHT, GraphPackage.Literals.LABEL__HEIGHT, newHeight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextBorderColor() {
		return (String)eDynamicGet(GraphPackage.LABEL__TEXT_BORDER_COLOR, GraphPackage.Literals.LABEL__TEXT_BORDER_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextBorderColor(String newTextBorderColor) {
		eDynamicSet(GraphPackage.LABEL__TEXT_BORDER_COLOR, GraphPackage.Literals.LABEL__TEXT_BORDER_COLOR, newTextBorderColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTextBorderWidth() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__TEXT_BORDER_WIDTH, GraphPackage.Literals.LABEL__TEXT_BORDER_WIDTH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextBorderWidth(Integer newTextBorderWidth) {
		eDynamicSet(GraphPackage.LABEL__TEXT_BORDER_WIDTH, GraphPackage.Literals.LABEL__TEXT_BORDER_WIDTH, newTextBorderWidth);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BorderType getTextBorderType() {
		return (BorderType)eDynamicGet(GraphPackage.LABEL__TEXT_BORDER_TYPE, GraphPackage.Literals.LABEL__TEXT_BORDER_TYPE, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextBorderType(BorderType newTextBorderType) {
		eDynamicSet(GraphPackage.LABEL__TEXT_BORDER_TYPE, GraphPackage.Literals.LABEL__TEXT_BORDER_TYPE, newTextBorderType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTextBorderDashOffset() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__TEXT_BORDER_DASH_OFFSET, GraphPackage.Literals.LABEL__TEXT_BORDER_DASH_OFFSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextBorderDashOffset(Integer newTextBorderDashOffset) {
		eDynamicSet(GraphPackage.LABEL__TEXT_BORDER_DASH_OFFSET, GraphPackage.Literals.LABEL__TEXT_BORDER_DASH_OFFSET, newTextBorderDashOffset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTextShadowColor() {
		return (String)eDynamicGet(GraphPackage.LABEL__TEXT_SHADOW_COLOR, GraphPackage.Literals.LABEL__TEXT_SHADOW_COLOR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextShadowColor(String newTextShadowColor) {
		eDynamicSet(GraphPackage.LABEL__TEXT_SHADOW_COLOR, GraphPackage.Literals.LABEL__TEXT_SHADOW_COLOR, newTextShadowColor);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigDecimal getTextShadowBlur() {
		return (BigDecimal)eDynamicGet(GraphPackage.LABEL__TEXT_SHADOW_BLUR, GraphPackage.Literals.LABEL__TEXT_SHADOW_BLUR, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextShadowBlur(BigDecimal newTextShadowBlur) {
		eDynamicSet(GraphPackage.LABEL__TEXT_SHADOW_BLUR, GraphPackage.Literals.LABEL__TEXT_SHADOW_BLUR, newTextShadowBlur);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTextShadowOffsetX() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__TEXT_SHADOW_OFFSET_X, GraphPackage.Literals.LABEL__TEXT_SHADOW_OFFSET_X, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextShadowOffsetX(Integer newTextShadowOffsetX) {
		eDynamicSet(GraphPackage.LABEL__TEXT_SHADOW_OFFSET_X, GraphPackage.Literals.LABEL__TEXT_SHADOW_OFFSET_X, newTextShadowOffsetX);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getTextShadowOffsetY() {
		return (Integer)eDynamicGet(GraphPackage.LABEL__TEXT_SHADOW_OFFSET_Y, GraphPackage.Literals.LABEL__TEXT_SHADOW_OFFSET_Y, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTextShadowOffsetY(Integer newTextShadowOffsetY) {
		eDynamicSet(GraphPackage.LABEL__TEXT_SHADOW_OFFSET_Y, GraphPackage.Literals.LABEL__TEXT_SHADOW_OFFSET_Y, newTextShadowOffsetY);
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
	public String getEllipsis() {
		return (String)eDynamicGet(GraphPackage.LABEL__ELLIPSIS, GraphPackage.Literals.LABEL__ELLIPSIS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEllipsis(String newEllipsis) {
		eDynamicSet(GraphPackage.LABEL__ELLIPSIS, GraphPackage.Literals.LABEL__ELLIPSIS, newEllipsis);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EMap<String, EMap<String, String>> getRich() {
		return (EMap<String, EMap<String, String>>)eDynamicGet(GraphPackage.LABEL__RICH, GraphPackage.Literals.LABEL__RICH, true, true);
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
			case GraphPackage.LABEL__SHOW:
				return isShow();
			case GraphPackage.LABEL__POSITION:
				return getPosition();
			case GraphPackage.LABEL__DISTANCE:
				return getDistance();
			case GraphPackage.LABEL__ROTATE:
				return getRotate();
			case GraphPackage.LABEL__OFFSET:
				return getOffset();
			case GraphPackage.LABEL__COLOR:
				return getColor();
			case GraphPackage.LABEL__FONT_STYLE:
				return getFontStyle();
			case GraphPackage.LABEL__FONT_WEIGHT:
				return getFontWeight();
			case GraphPackage.LABEL__FONT_FAMILY:
				return getFontFamily();
			case GraphPackage.LABEL__FONT_SIZE:
				return getFontSize();
			case GraphPackage.LABEL__ALIGN:
				return getAlign();
			case GraphPackage.LABEL__VERTICAL_ALIGN:
				return getVerticalAlign();
			case GraphPackage.LABEL__LINE_HEIGHT:
				return getLineHeight();
			case GraphPackage.LABEL__BACKGROUND_COLOR:
				return getBackgroundColor();
			case GraphPackage.LABEL__BORDER_COLOR:
				return getBorderColor();
			case GraphPackage.LABEL__BORDER_WIDTH:
				return getBorderWidth();
			case GraphPackage.LABEL__BORDER_TYPE:
				return getBorderType();
			case GraphPackage.LABEL__BORDER_DASH_OFFSET:
				return getBorderDashOffset();
			case GraphPackage.LABEL__BORDER_RADIUS:
				return getBorderRadius();
			case GraphPackage.LABEL__PADDING:
				return getPadding();
			case GraphPackage.LABEL__SHADOW_COLOR:
				return getShadowColor();
			case GraphPackage.LABEL__SHADOW_BLUR:
				return getShadowBlur();
			case GraphPackage.LABEL__SHADOW_OFFSET_X:
				return getShadowOffsetX();
			case GraphPackage.LABEL__SHADOW_OFFSET_Y:
				return getShadowOffsetY();
			case GraphPackage.LABEL__WIDTH:
				return getWidth();
			case GraphPackage.LABEL__HEIGHT:
				return getHeight();
			case GraphPackage.LABEL__TEXT_BORDER_COLOR:
				return getTextBorderColor();
			case GraphPackage.LABEL__TEXT_BORDER_WIDTH:
				return getTextBorderWidth();
			case GraphPackage.LABEL__TEXT_BORDER_TYPE:
				return getTextBorderType();
			case GraphPackage.LABEL__TEXT_BORDER_DASH_OFFSET:
				return getTextBorderDashOffset();
			case GraphPackage.LABEL__TEXT_SHADOW_COLOR:
				return getTextShadowColor();
			case GraphPackage.LABEL__TEXT_SHADOW_BLUR:
				return getTextShadowBlur();
			case GraphPackage.LABEL__TEXT_SHADOW_OFFSET_X:
				return getTextShadowOffsetX();
			case GraphPackage.LABEL__TEXT_SHADOW_OFFSET_Y:
				return getTextShadowOffsetY();
			case GraphPackage.LABEL__OVERFLOW:
				return getOverflow();
			case GraphPackage.LABEL__ELLIPSIS:
				return getEllipsis();
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
			case GraphPackage.LABEL__COLOR:
				setColor((String)newValue);
				return;
			case GraphPackage.LABEL__FONT_STYLE:
				setFontStyle((FontStyle)newValue);
				return;
			case GraphPackage.LABEL__FONT_WEIGHT:
				setFontWeight((FontWeight)newValue);
				return;
			case GraphPackage.LABEL__FONT_FAMILY:
				setFontFamily((String)newValue);
				return;
			case GraphPackage.LABEL__FONT_SIZE:
				setFontSize((Integer)newValue);
				return;
			case GraphPackage.LABEL__ALIGN:
				setAlign((Align)newValue);
				return;
			case GraphPackage.LABEL__VERTICAL_ALIGN:
				setVerticalAlign((VerticalAlign)newValue);
				return;
			case GraphPackage.LABEL__LINE_HEIGHT:
				setLineHeight((Integer)newValue);
				return;
			case GraphPackage.LABEL__BACKGROUND_COLOR:
				setBackgroundColor((String)newValue);
				return;
			case GraphPackage.LABEL__BORDER_COLOR:
				setBorderColor((String)newValue);
				return;
			case GraphPackage.LABEL__BORDER_WIDTH:
				setBorderWidth((Integer)newValue);
				return;
			case GraphPackage.LABEL__BORDER_TYPE:
				setBorderType((BorderType)newValue);
				return;
			case GraphPackage.LABEL__BORDER_DASH_OFFSET:
				setBorderDashOffset((Integer)newValue);
				return;
			case GraphPackage.LABEL__BORDER_RADIUS:
				setBorderRadius((Integer)newValue);
				return;
			case GraphPackage.LABEL__PADDING:
				getPadding().clear();
				getPadding().addAll((Collection<? extends Integer>)newValue);
				return;
			case GraphPackage.LABEL__SHADOW_COLOR:
				setShadowColor((String)newValue);
				return;
			case GraphPackage.LABEL__SHADOW_BLUR:
				setShadowBlur((BigDecimal)newValue);
				return;
			case GraphPackage.LABEL__SHADOW_OFFSET_X:
				setShadowOffsetX((Integer)newValue);
				return;
			case GraphPackage.LABEL__SHADOW_OFFSET_Y:
				setShadowOffsetY((Integer)newValue);
				return;
			case GraphPackage.LABEL__WIDTH:
				setWidth((Integer)newValue);
				return;
			case GraphPackage.LABEL__HEIGHT:
				setHeight((Integer)newValue);
				return;
			case GraphPackage.LABEL__TEXT_BORDER_COLOR:
				setTextBorderColor((String)newValue);
				return;
			case GraphPackage.LABEL__TEXT_BORDER_WIDTH:
				setTextBorderWidth((Integer)newValue);
				return;
			case GraphPackage.LABEL__TEXT_BORDER_TYPE:
				setTextBorderType((BorderType)newValue);
				return;
			case GraphPackage.LABEL__TEXT_BORDER_DASH_OFFSET:
				setTextBorderDashOffset((Integer)newValue);
				return;
			case GraphPackage.LABEL__TEXT_SHADOW_COLOR:
				setTextShadowColor((String)newValue);
				return;
			case GraphPackage.LABEL__TEXT_SHADOW_BLUR:
				setTextShadowBlur((BigDecimal)newValue);
				return;
			case GraphPackage.LABEL__TEXT_SHADOW_OFFSET_X:
				setTextShadowOffsetX((Integer)newValue);
				return;
			case GraphPackage.LABEL__TEXT_SHADOW_OFFSET_Y:
				setTextShadowOffsetY((Integer)newValue);
				return;
			case GraphPackage.LABEL__OVERFLOW:
				setOverflow((Overflow)newValue);
				return;
			case GraphPackage.LABEL__ELLIPSIS:
				setEllipsis((String)newValue);
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
			case GraphPackage.LABEL__COLOR:
				setColor(COLOR_EDEFAULT);
				return;
			case GraphPackage.LABEL__FONT_STYLE:
				setFontStyle(FONT_STYLE_EDEFAULT);
				return;
			case GraphPackage.LABEL__FONT_WEIGHT:
				setFontWeight(FONT_WEIGHT_EDEFAULT);
				return;
			case GraphPackage.LABEL__FONT_FAMILY:
				setFontFamily(FONT_FAMILY_EDEFAULT);
				return;
			case GraphPackage.LABEL__FONT_SIZE:
				setFontSize(FONT_SIZE_EDEFAULT);
				return;
			case GraphPackage.LABEL__ALIGN:
				setAlign(ALIGN_EDEFAULT);
				return;
			case GraphPackage.LABEL__VERTICAL_ALIGN:
				setVerticalAlign(VERTICAL_ALIGN_EDEFAULT);
				return;
			case GraphPackage.LABEL__LINE_HEIGHT:
				setLineHeight(LINE_HEIGHT_EDEFAULT);
				return;
			case GraphPackage.LABEL__BACKGROUND_COLOR:
				setBackgroundColor(BACKGROUND_COLOR_EDEFAULT);
				return;
			case GraphPackage.LABEL__BORDER_COLOR:
				setBorderColor(BORDER_COLOR_EDEFAULT);
				return;
			case GraphPackage.LABEL__BORDER_WIDTH:
				setBorderWidth(BORDER_WIDTH_EDEFAULT);
				return;
			case GraphPackage.LABEL__BORDER_TYPE:
				setBorderType(BORDER_TYPE_EDEFAULT);
				return;
			case GraphPackage.LABEL__BORDER_DASH_OFFSET:
				setBorderDashOffset(BORDER_DASH_OFFSET_EDEFAULT);
				return;
			case GraphPackage.LABEL__BORDER_RADIUS:
				setBorderRadius(BORDER_RADIUS_EDEFAULT);
				return;
			case GraphPackage.LABEL__PADDING:
				getPadding().clear();
				return;
			case GraphPackage.LABEL__SHADOW_COLOR:
				setShadowColor(SHADOW_COLOR_EDEFAULT);
				return;
			case GraphPackage.LABEL__SHADOW_BLUR:
				setShadowBlur(SHADOW_BLUR_EDEFAULT);
				return;
			case GraphPackage.LABEL__SHADOW_OFFSET_X:
				setShadowOffsetX(SHADOW_OFFSET_X_EDEFAULT);
				return;
			case GraphPackage.LABEL__SHADOW_OFFSET_Y:
				setShadowOffsetY(SHADOW_OFFSET_Y_EDEFAULT);
				return;
			case GraphPackage.LABEL__WIDTH:
				setWidth(WIDTH_EDEFAULT);
				return;
			case GraphPackage.LABEL__HEIGHT:
				setHeight(HEIGHT_EDEFAULT);
				return;
			case GraphPackage.LABEL__TEXT_BORDER_COLOR:
				setTextBorderColor(TEXT_BORDER_COLOR_EDEFAULT);
				return;
			case GraphPackage.LABEL__TEXT_BORDER_WIDTH:
				setTextBorderWidth(TEXT_BORDER_WIDTH_EDEFAULT);
				return;
			case GraphPackage.LABEL__TEXT_BORDER_TYPE:
				setTextBorderType(TEXT_BORDER_TYPE_EDEFAULT);
				return;
			case GraphPackage.LABEL__TEXT_BORDER_DASH_OFFSET:
				setTextBorderDashOffset(TEXT_BORDER_DASH_OFFSET_EDEFAULT);
				return;
			case GraphPackage.LABEL__TEXT_SHADOW_COLOR:
				setTextShadowColor(TEXT_SHADOW_COLOR_EDEFAULT);
				return;
			case GraphPackage.LABEL__TEXT_SHADOW_BLUR:
				setTextShadowBlur(TEXT_SHADOW_BLUR_EDEFAULT);
				return;
			case GraphPackage.LABEL__TEXT_SHADOW_OFFSET_X:
				setTextShadowOffsetX(TEXT_SHADOW_OFFSET_X_EDEFAULT);
				return;
			case GraphPackage.LABEL__TEXT_SHADOW_OFFSET_Y:
				setTextShadowOffsetY(TEXT_SHADOW_OFFSET_Y_EDEFAULT);
				return;
			case GraphPackage.LABEL__OVERFLOW:
				setOverflow(OVERFLOW_EDEFAULT);
				return;
			case GraphPackage.LABEL__ELLIPSIS:
				setEllipsis(ELLIPSIS_EDEFAULT);
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
			case GraphPackage.LABEL__SHOW:
				return isShow() != SHOW_EDEFAULT;
			case GraphPackage.LABEL__POSITION:
				return getPosition() != POSITION_EDEFAULT;
			case GraphPackage.LABEL__DISTANCE:
				return DISTANCE_EDEFAULT == null ? getDistance() != null : !DISTANCE_EDEFAULT.equals(getDistance());
			case GraphPackage.LABEL__ROTATE:
				return ROTATE_EDEFAULT == null ? getRotate() != null : !ROTATE_EDEFAULT.equals(getRotate());
			case GraphPackage.LABEL__OFFSET:
				return !getOffset().isEmpty();
			case GraphPackage.LABEL__COLOR:
				return COLOR_EDEFAULT == null ? getColor() != null : !COLOR_EDEFAULT.equals(getColor());
			case GraphPackage.LABEL__FONT_STYLE:
				return getFontStyle() != FONT_STYLE_EDEFAULT;
			case GraphPackage.LABEL__FONT_WEIGHT:
				return getFontWeight() != FONT_WEIGHT_EDEFAULT;
			case GraphPackage.LABEL__FONT_FAMILY:
				return FONT_FAMILY_EDEFAULT == null ? getFontFamily() != null : !FONT_FAMILY_EDEFAULT.equals(getFontFamily());
			case GraphPackage.LABEL__FONT_SIZE:
				return FONT_SIZE_EDEFAULT == null ? getFontSize() != null : !FONT_SIZE_EDEFAULT.equals(getFontSize());
			case GraphPackage.LABEL__ALIGN:
				return getAlign() != ALIGN_EDEFAULT;
			case GraphPackage.LABEL__VERTICAL_ALIGN:
				return getVerticalAlign() != VERTICAL_ALIGN_EDEFAULT;
			case GraphPackage.LABEL__LINE_HEIGHT:
				return LINE_HEIGHT_EDEFAULT == null ? getLineHeight() != null : !LINE_HEIGHT_EDEFAULT.equals(getLineHeight());
			case GraphPackage.LABEL__BACKGROUND_COLOR:
				return BACKGROUND_COLOR_EDEFAULT == null ? getBackgroundColor() != null : !BACKGROUND_COLOR_EDEFAULT.equals(getBackgroundColor());
			case GraphPackage.LABEL__BORDER_COLOR:
				return BORDER_COLOR_EDEFAULT == null ? getBorderColor() != null : !BORDER_COLOR_EDEFAULT.equals(getBorderColor());
			case GraphPackage.LABEL__BORDER_WIDTH:
				return BORDER_WIDTH_EDEFAULT == null ? getBorderWidth() != null : !BORDER_WIDTH_EDEFAULT.equals(getBorderWidth());
			case GraphPackage.LABEL__BORDER_TYPE:
				return getBorderType() != BORDER_TYPE_EDEFAULT;
			case GraphPackage.LABEL__BORDER_DASH_OFFSET:
				return BORDER_DASH_OFFSET_EDEFAULT == null ? getBorderDashOffset() != null : !BORDER_DASH_OFFSET_EDEFAULT.equals(getBorderDashOffset());
			case GraphPackage.LABEL__BORDER_RADIUS:
				return BORDER_RADIUS_EDEFAULT == null ? getBorderRadius() != null : !BORDER_RADIUS_EDEFAULT.equals(getBorderRadius());
			case GraphPackage.LABEL__PADDING:
				return !getPadding().isEmpty();
			case GraphPackage.LABEL__SHADOW_COLOR:
				return SHADOW_COLOR_EDEFAULT == null ? getShadowColor() != null : !SHADOW_COLOR_EDEFAULT.equals(getShadowColor());
			case GraphPackage.LABEL__SHADOW_BLUR:
				return SHADOW_BLUR_EDEFAULT == null ? getShadowBlur() != null : !SHADOW_BLUR_EDEFAULT.equals(getShadowBlur());
			case GraphPackage.LABEL__SHADOW_OFFSET_X:
				return SHADOW_OFFSET_X_EDEFAULT == null ? getShadowOffsetX() != null : !SHADOW_OFFSET_X_EDEFAULT.equals(getShadowOffsetX());
			case GraphPackage.LABEL__SHADOW_OFFSET_Y:
				return SHADOW_OFFSET_Y_EDEFAULT == null ? getShadowOffsetY() != null : !SHADOW_OFFSET_Y_EDEFAULT.equals(getShadowOffsetY());
			case GraphPackage.LABEL__WIDTH:
				return WIDTH_EDEFAULT == null ? getWidth() != null : !WIDTH_EDEFAULT.equals(getWidth());
			case GraphPackage.LABEL__HEIGHT:
				return HEIGHT_EDEFAULT == null ? getHeight() != null : !HEIGHT_EDEFAULT.equals(getHeight());
			case GraphPackage.LABEL__TEXT_BORDER_COLOR:
				return TEXT_BORDER_COLOR_EDEFAULT == null ? getTextBorderColor() != null : !TEXT_BORDER_COLOR_EDEFAULT.equals(getTextBorderColor());
			case GraphPackage.LABEL__TEXT_BORDER_WIDTH:
				return TEXT_BORDER_WIDTH_EDEFAULT == null ? getTextBorderWidth() != null : !TEXT_BORDER_WIDTH_EDEFAULT.equals(getTextBorderWidth());
			case GraphPackage.LABEL__TEXT_BORDER_TYPE:
				return getTextBorderType() != TEXT_BORDER_TYPE_EDEFAULT;
			case GraphPackage.LABEL__TEXT_BORDER_DASH_OFFSET:
				return TEXT_BORDER_DASH_OFFSET_EDEFAULT == null ? getTextBorderDashOffset() != null : !TEXT_BORDER_DASH_OFFSET_EDEFAULT.equals(getTextBorderDashOffset());
			case GraphPackage.LABEL__TEXT_SHADOW_COLOR:
				return TEXT_SHADOW_COLOR_EDEFAULT == null ? getTextShadowColor() != null : !TEXT_SHADOW_COLOR_EDEFAULT.equals(getTextShadowColor());
			case GraphPackage.LABEL__TEXT_SHADOW_BLUR:
				return TEXT_SHADOW_BLUR_EDEFAULT == null ? getTextShadowBlur() != null : !TEXT_SHADOW_BLUR_EDEFAULT.equals(getTextShadowBlur());
			case GraphPackage.LABEL__TEXT_SHADOW_OFFSET_X:
				return TEXT_SHADOW_OFFSET_X_EDEFAULT == null ? getTextShadowOffsetX() != null : !TEXT_SHADOW_OFFSET_X_EDEFAULT.equals(getTextShadowOffsetX());
			case GraphPackage.LABEL__TEXT_SHADOW_OFFSET_Y:
				return TEXT_SHADOW_OFFSET_Y_EDEFAULT == null ? getTextShadowOffsetY() != null : !TEXT_SHADOW_OFFSET_Y_EDEFAULT.equals(getTextShadowOffsetY());
			case GraphPackage.LABEL__OVERFLOW:
				return getOverflow() != OVERFLOW_EDEFAULT;
			case GraphPackage.LABEL__ELLIPSIS:
				return ELLIPSIS_EDEFAULT == null ? getEllipsis() != null : !ELLIPSIS_EDEFAULT.equals(getEllipsis());
			case GraphPackage.LABEL__RICH:
				return !getRich().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LabelImpl

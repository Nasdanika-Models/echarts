/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.util.Map;
import java.util.function.BiFunction;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.json.JSONObject;
import org.nasdanika.models.echarts.graph.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphFactoryImpl extends EFactoryImpl implements GraphFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GraphFactory init() {
		try {
			GraphFactory theGraphFactory = (GraphFactory)EPackage.Registry.INSTANCE.getEFactory(GraphPackage.eNS_URI);
			if (theGraphFactory != null) {
				return theGraphFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GraphFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GraphFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GraphPackage.GRAPH: return createGraph();
			case GraphPackage.ITEM: return createItem();
			case GraphPackage.NODE: return createNode();
			case GraphPackage.STYLE: return createStyle();
			case GraphPackage.LINE_STYLE: return createLineStyle();
			case GraphPackage.ITEM_STYLE: return createItemStyle();
			case GraphPackage.LINK: return createLink();
			case GraphPackage.TEXT_STYLE: return createTextStyle();
			case GraphPackage.LABEL: return createLabel();
			case GraphPackage.STYLE_ENTRY: return (EObject)createStyleEntry();
			case GraphPackage.STRING_ENTRY: return (EObject)createStringEntry();
			case GraphPackage.ITEM_STATE: return createItemState();
			case GraphPackage.LINE_STATE: return createLineState();
			case GraphPackage.TOOLTIP: return createTooltip();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GraphPackage.BORDER_TYPE:
				return createBorderTypeFromString(eDataType, initialValue);
			case GraphPackage.BORDER_CAP:
				return createBorderCapFromString(eDataType, initialValue);
			case GraphPackage.BORDER_JOIN:
				return createBorderJoinFromString(eDataType, initialValue);
			case GraphPackage.LABEL_POSITION:
				return createLabelPositionFromString(eDataType, initialValue);
			case GraphPackage.FONT_STYLE:
				return createFontStyleFromString(eDataType, initialValue);
			case GraphPackage.FONT_WEIGHT:
				return createFontWeightFromString(eDataType, initialValue);
			case GraphPackage.ALIGN:
				return createAlignFromString(eDataType, initialValue);
			case GraphPackage.VERTICAL_ALIGN:
				return createVerticalAlignFromString(eDataType, initialValue);
			case GraphPackage.OVERFLOW:
				return createOverflowFromString(eDataType, initialValue);
			case GraphPackage.JSON_OBJECT:
				return createJSONObjectFromString(eDataType, initialValue);
			case GraphPackage.BI_FUNCTION:
				return createBiFunctionFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GraphPackage.BORDER_TYPE:
				return convertBorderTypeToString(eDataType, instanceValue);
			case GraphPackage.BORDER_CAP:
				return convertBorderCapToString(eDataType, instanceValue);
			case GraphPackage.BORDER_JOIN:
				return convertBorderJoinToString(eDataType, instanceValue);
			case GraphPackage.LABEL_POSITION:
				return convertLabelPositionToString(eDataType, instanceValue);
			case GraphPackage.FONT_STYLE:
				return convertFontStyleToString(eDataType, instanceValue);
			case GraphPackage.FONT_WEIGHT:
				return convertFontWeightToString(eDataType, instanceValue);
			case GraphPackage.ALIGN:
				return convertAlignToString(eDataType, instanceValue);
			case GraphPackage.VERTICAL_ALIGN:
				return convertVerticalAlignToString(eDataType, instanceValue);
			case GraphPackage.OVERFLOW:
				return convertOverflowToString(eDataType, instanceValue);
			case GraphPackage.JSON_OBJECT:
				return convertJSONObjectToString(eDataType, instanceValue);
			case GraphPackage.BI_FUNCTION:
				return convertBiFunctionToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Node createNode() {
		NodeImpl node = new NodeImpl();
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Style createStyle() {
		StyleImpl style = new StyleImpl();
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineStyle createLineStyle() {
		LineStyleImpl lineStyle = new LineStyleImpl();
		return lineStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemStyle createItemStyle() {
		ItemStyleImpl itemStyle = new ItemStyleImpl();
		return itemStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Link createLink() {
		LinkImpl link = new LinkImpl();
		return link;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Graph createGraph() {
		GraphImpl graph = new GraphImpl();
		return graph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Item createItem() {
		ItemImpl item = new ItemImpl();
		return item;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TextStyle createTextStyle() {
		TextStyleImpl textStyle = new TextStyleImpl();
		return textStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Label createLabel() {
		LabelImpl label = new LabelImpl();
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EMap<String, String>> createStyleEntry() {
		StyleEntryImpl styleEntry = new StyleEntryImpl();
		return styleEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringEntry() {
		StringEntryImpl stringEntry = new StringEntryImpl();
		return stringEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ItemState createItemState() {
		ItemStateImpl itemState = new ItemStateImpl();
		return itemState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LineState createLineState() {
		LineStateImpl lineState = new LineStateImpl();
		return lineState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Tooltip createTooltip() {
		TooltipImpl tooltip = new TooltipImpl();
		return tooltip;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderType createBorderTypeFromString(EDataType eDataType, String initialValue) {
		BorderType result = BorderType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderCap createBorderCapFromString(EDataType eDataType, String initialValue) {
		BorderCap result = BorderCap.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderCapToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BorderJoin createBorderJoinFromString(EDataType eDataType, String initialValue) {
		BorderJoin result = BorderJoin.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBorderJoinToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LabelPosition createLabelPositionFromString(EDataType eDataType, String initialValue) {
		LabelPosition result = LabelPosition.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLabelPositionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontStyle createFontStyleFromString(EDataType eDataType, String initialValue) {
		FontStyle result = FontStyle.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontStyleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FontWeight createFontWeightFromString(EDataType eDataType, String initialValue) {
		FontWeight result = FontWeight.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFontWeightToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Align createAlignFromString(EDataType eDataType, String initialValue) {
		Align result = Align.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VerticalAlign createVerticalAlignFromString(EDataType eDataType, String initialValue) {
		VerticalAlign result = VerticalAlign.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVerticalAlignToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Overflow createOverflowFromString(EDataType eDataType, String initialValue) {
		Overflow result = Overflow.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOverflowToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JSONObject createJSONObjectFromString(EDataType eDataType, String initialValue) {
		return (JSONObject)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJSONObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BiFunction<?, ?, ?> createBiFunctionFromString(EDataType eDataType, String initialValue) {
		return (BiFunction<?, ?, ?>)super.createFromString(initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBiFunctionToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphPackage getGraphPackage() {
		return (GraphPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GraphPackage getPackage() {
		return GraphPackage.eINSTANCE;
	}

} //GraphFactoryImpl

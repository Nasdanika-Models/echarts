/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.nasdanika.models.echarts.graph.GraphFactory
 * @model kind="package"
 * @generated
 */
public interface GraphPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "graph";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "ecore://nasdanika.org/models/echarts/graph";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.nasdanika.models.echarts.graph";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GraphPackage eINSTANCE = org.nasdanika.models.echarts.graph.impl.GraphPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.NodeImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__Y = 2;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING_LINKS = 3;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING_LINKS = 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CATEGORY = 5;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FIXED = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VALUE = 7;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYMBOL = 8;

	/**
	 * The feature id for the '<em><b>Symbol Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYMBOL_SIZE = 9;

	/**
	 * The feature id for the '<em><b>Symbol Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYMBOL_ROTATE = 10;

	/**
	 * The feature id for the '<em><b>Symbol Offset</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYMBOL_OFFSET = 11;

	/**
	 * The feature id for the '<em><b>Symbol Keep Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYMBOL_KEEP_ASPECT = 12;

	/**
	 * The feature id for the '<em><b>Item Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ITEM_STYLE = 13;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = 14;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 15;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl <em>Item Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.ItemStyleImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getItemStyle()
	 * @generated
	 */
	int ITEM_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__BORDER_COLOR = 1;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__BORDER_WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Border Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__BORDER_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Border Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__BORDER_DASH_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Border Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__BORDER_CAP = 5;

	/**
	 * The feature id for the '<em><b>Border Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__BORDER_JOIN = 6;

	/**
	 * The feature id for the '<em><b>Border Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__BORDER_MITER_LIMIT = 7;

	/**
	 * The feature id for the '<em><b>Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__SHADOW_BLUR = 8;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__SHADOW_COLOR = 9;

	/**
	 * The feature id for the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__SHADOW_OFFSET_X = 10;

	/**
	 * The feature id for the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__SHADOW_OFFSET_Y = 11;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__OPACITY = 12;

	/**
	 * The number of structural features of the '<em>Item Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Item Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.CategoryImpl <em>Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.CategoryImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getCategory()
	 * @generated
	 */
	int CATEGORY = 2;

	/**
	 * The number of structural features of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.LinkImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 3;

	/**
	 * The feature id for the '<em><b>Source</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = 1;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.GraphImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 4;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__NODES = 0;

	/**
	 * The feature id for the '<em><b>Categories</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH__CATEGORIES = 1;

	/**
	 * The number of structural features of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.LabelImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 5;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SHOW = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DISTANCE = 2;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ROTATE = 3;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = 5;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_WEIGHT = 7;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_FAMILY = 8;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_SIZE = 9;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ALIGN = 10;

	/**
	 * The feature id for the '<em><b>Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VERTICAL_ALIGN = 11;

	/**
	 * The feature id for the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LINE_HEIGHT = 12;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = 13;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER_COLOR = 14;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER_WIDTH = 15;

	/**
	 * The feature id for the '<em><b>Border Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Border Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER_DASH_OFFSET = 17;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER_RADIUS = 18;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PADDING = 19;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SHADOW_COLOR = 20;

	/**
	 * The feature id for the '<em><b>Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SHADOW_BLUR = 21;

	/**
	 * The feature id for the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SHADOW_OFFSET_X = 22;

	/**
	 * The feature id for the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SHADOW_OFFSET_Y = 23;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = 24;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGHT = 25;

	/**
	 * The feature id for the '<em><b>Text Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_BORDER_COLOR = 26;

	/**
	 * The feature id for the '<em><b>Text Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_BORDER_WIDTH = 27;

	/**
	 * The feature id for the '<em><b>Text Border Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_BORDER_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Text Border Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_BORDER_DASH_OFFSET = 29;

	/**
	 * The feature id for the '<em><b>Text Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_SHADOW_COLOR = 30;

	/**
	 * The feature id for the '<em><b>Text Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_SHADOW_BLUR = 31;

	/**
	 * The feature id for the '<em><b>Text Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_SHADOW_OFFSET_X = 32;

	/**
	 * The feature id for the '<em><b>Text Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_SHADOW_OFFSET_Y = 33;

	/**
	 * The feature id for the '<em><b>Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OVERFLOW = 34;

	/**
	 * The feature id for the '<em><b>Ellipsis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ELLIPSIS = 35;

	/**
	 * The feature id for the '<em><b>Rich</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__RICH = 36;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 37;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.StyleEntryImpl <em>Style Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.StyleEntryImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getStyleEntry()
	 * @generated
	 */
	int STYLE_ENTRY = 6;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Style Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Style Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.StringEntryImpl <em>String Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.StringEntryImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getStringEntry()
	 * @generated
	 */
	int STRING_ENTRY = 7;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>String Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>String Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.BorderType <em>Border Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.BorderType
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getBorderType()
	 * @generated
	 */
	int BORDER_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.BorderCap <em>Border Cap</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.BorderCap
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getBorderCap()
	 * @generated
	 */
	int BORDER_CAP = 9;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.BorderJoin <em>Border Join</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.BorderJoin
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getBorderJoin()
	 * @generated
	 */
	int BORDER_JOIN = 10;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.LabelPosition <em>Label Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.LabelPosition
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLabelPosition()
	 * @generated
	 */
	int LABEL_POSITION = 11;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.FontStyle
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 12;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.FontWeight <em>Font Weight</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.FontWeight
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getFontWeight()
	 * @generated
	 */
	int FONT_WEIGHT = 13;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.Align <em>Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.Align
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getAlign()
	 * @generated
	 */
	int ALIGN = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.VerticalAlign <em>Vertical Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.VerticalAlign
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getVerticalAlign()
	 * @generated
	 */
	int VERTICAL_ALIGN = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.Overflow <em>Overflow</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.Overflow
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getOverflow()
	 * @generated
	 */
	int OVERFLOW = 16;


	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Node#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getX()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_X();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Node#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getY()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Y();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.echarts.graph.Node#getOutgoingLinks <em>Outgoing Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outgoing Links</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getOutgoingLinks()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_OutgoingLinks();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.echarts.graph.Node#getIncomingLinks <em>Incoming Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Links</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getIncomingLinks()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_IncomingLinks();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.echarts.graph.Node#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getCategory()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Category();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Node#isFixed <em>Fixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fixed</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#isFixed()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Fixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.echarts.graph.Node#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getValue()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Node#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getSymbol()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Symbol();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.echarts.graph.Node#getSymbolSize <em>Symbol Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Symbol Size</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getSymbolSize()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_SymbolSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Node#getSymbolRotate <em>Symbol Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Rotate</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getSymbolRotate()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_SymbolRotate();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.echarts.graph.Node#getSymbolOffset <em>Symbol Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Symbol Offset</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getSymbolOffset()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_SymbolOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Node#isSymbolKeepAspect <em>Symbol Keep Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Keep Aspect</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#isSymbolKeepAspect()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_SymbolKeepAspect();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Node#getItemStyle <em>Item Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getItemStyle()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_ItemStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Node#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getLabel()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Label();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.ItemStyle <em>Item Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle
	 * @generated
	 */
	EClass getItemStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getColor()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getBorderColor()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderWidth <em>Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Width</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getBorderWidth()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_BorderWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderType <em>Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Type</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getBorderType()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_BorderType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderDashOffset <em>Border Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Dash Offset</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getBorderDashOffset()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_BorderDashOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderCap <em>Border Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Cap</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getBorderCap()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_BorderCap();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderJoin <em>Border Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Join</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getBorderJoin()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_BorderJoin();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderMiterLimit <em>Border Miter Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Miter Limit</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getBorderMiterLimit()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_BorderMiterLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowBlur <em>Shadow Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Blur</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getShadowBlur()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_ShadowBlur();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowColor <em>Shadow Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getShadowColor()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_ShadowColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowOffsetX <em>Shadow Offset X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Offset X</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getShadowOffsetX()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_ShadowOffsetX();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getShadowOffsetY <em>Shadow Offset Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Offset Y</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getShadowOffsetY()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_ShadowOffsetY();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getOpacity()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_Opacity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.Category <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Category</em>'.
	 * @see org.nasdanika.models.echarts.graph.Category
	 * @generated
	 */
	EClass getCategory();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the container reference '{@link org.nasdanika.models.echarts.graph.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Source</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link org.nasdanika.models.echarts.graph.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.Graph <em>Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Graph</em>'.
	 * @see org.nasdanika.models.echarts.graph.Graph
	 * @generated
	 */
	EClass getGraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.echarts.graph.Graph#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see org.nasdanika.models.echarts.graph.Graph#getNodes()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.nasdanika.models.echarts.graph.Graph#getCategories <em>Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Categories</em>'.
	 * @see org.nasdanika.models.echarts.graph.Graph#getCategories()
	 * @see #getGraph()
	 * @generated
	 */
	EReference getGraph_Categories();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#isShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#isShow()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Show();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getPosition()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getDistance <em>Distance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Distance</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getDistance()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Distance();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getRotate <em>Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotate</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getRotate()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Rotate();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.echarts.graph.Label#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Offset</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getOffset()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Offset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getFontStyle()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getFontWeight()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_FontWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getFontFamily()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getFontSize()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getAlign()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getVerticalAlign <em>Vertical Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Align</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getVerticalAlign()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_VerticalAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getLineHeight <em>Line Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Height</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getLineHeight()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_LineHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getBackgroundColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getBorderColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getBorderWidth <em>Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Width</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getBorderWidth()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_BorderWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getBorderType <em>Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Type</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getBorderType()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_BorderType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getBorderDashOffset <em>Border Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Dash Offset</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getBorderDashOffset()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_BorderDashOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getBorderRadius <em>Border Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Radius</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getBorderRadius()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_BorderRadius();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.echarts.graph.Label#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Padding</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getPadding()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Padding();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getShadowColor <em>Shadow Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getShadowColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_ShadowColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getShadowBlur <em>Shadow Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Blur</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getShadowBlur()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_ShadowBlur();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getShadowOffsetX <em>Shadow Offset X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Offset X</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getShadowOffsetX()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_ShadowOffsetX();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getShadowOffsetY <em>Shadow Offset Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Offset Y</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getShadowOffsetY()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_ShadowOffsetY();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getWidth()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getHeight()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getTextBorderColor <em>Text Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Border Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getTextBorderColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextBorderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getTextBorderWidth <em>Text Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Border Width</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getTextBorderWidth()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextBorderWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getTextBorderType <em>Text Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Border Type</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getTextBorderType()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextBorderType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getTextBorderDashOffset <em>Text Border Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Border Dash Offset</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getTextBorderDashOffset()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextBorderDashOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getTextShadowColor <em>Text Shadow Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Shadow Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getTextShadowColor()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextShadowColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getTextShadowBlur <em>Text Shadow Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Shadow Blur</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getTextShadowBlur()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextShadowBlur();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getTextShadowOffsetX <em>Text Shadow Offset X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Shadow Offset X</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getTextShadowOffsetX()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextShadowOffsetX();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getTextShadowOffsetY <em>Text Shadow Offset Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Shadow Offset Y</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getTextShadowOffsetY()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_TextShadowOffsetY();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getOverflow <em>Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Overflow</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getOverflow()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Overflow();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getEllipsis <em>Ellipsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ellipsis</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getEllipsis()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Ellipsis();

	/**
	 * Returns the meta object for the map '{@link org.nasdanika.models.echarts.graph.Label#getRich <em>Rich</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Rich</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getRich()
	 * @see #getLabel()
	 * @generated
	 */
	EReference getLabel_Rich();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Style Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueMapType="org.nasdanika.models.echarts.graph.StringEntry&lt;org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString&gt;"
	 * @generated
	 */
	EClass getStyleEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStyleEntry()
	 * @generated
	 */
	EAttribute getStyleEntry_Key();

	/**
	 * Returns the meta object for the map '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStyleEntry()
	 * @generated
	 */
	EReference getStyleEntry_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>String Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getStringEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringEntry()
	 * @generated
	 */
	EAttribute getStringEntry_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getStringEntry()
	 * @generated
	 */
	EAttribute getStringEntry_Value();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.echarts.graph.BorderType <em>Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Border Type</em>'.
	 * @see org.nasdanika.models.echarts.graph.BorderType
	 * @generated
	 */
	EEnum getBorderType();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.echarts.graph.BorderCap <em>Border Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Border Cap</em>'.
	 * @see org.nasdanika.models.echarts.graph.BorderCap
	 * @generated
	 */
	EEnum getBorderCap();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.echarts.graph.BorderJoin <em>Border Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Border Join</em>'.
	 * @see org.nasdanika.models.echarts.graph.BorderJoin
	 * @generated
	 */
	EEnum getBorderJoin();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.echarts.graph.LabelPosition <em>Label Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Label Position</em>'.
	 * @see org.nasdanika.models.echarts.graph.LabelPosition
	 * @generated
	 */
	EEnum getLabelPosition();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.echarts.graph.FontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.FontStyle
	 * @generated
	 */
	EEnum getFontStyle();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.echarts.graph.FontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Font Weight</em>'.
	 * @see org.nasdanika.models.echarts.graph.FontWeight
	 * @generated
	 */
	EEnum getFontWeight();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.echarts.graph.Align <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Align</em>'.
	 * @see org.nasdanika.models.echarts.graph.Align
	 * @generated
	 */
	EEnum getAlign();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.echarts.graph.VerticalAlign <em>Vertical Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Vertical Align</em>'.
	 * @see org.nasdanika.models.echarts.graph.VerticalAlign
	 * @generated
	 */
	EEnum getVerticalAlign();

	/**
	 * Returns the meta object for enum '{@link org.nasdanika.models.echarts.graph.Overflow <em>Overflow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Overflow</em>'.
	 * @see org.nasdanika.models.echarts.graph.Overflow
	 * @generated
	 */
	EEnum getOverflow();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GraphFactory getGraphFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.NodeImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();
		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__X = eINSTANCE.getNode_X();
		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__Y = eINSTANCE.getNode_Y();
		/**
		 * The meta object literal for the '<em><b>Outgoing Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING_LINKS = eINSTANCE.getNode_OutgoingLinks();
		/**
		 * The meta object literal for the '<em><b>Incoming Links</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMING_LINKS = eINSTANCE.getNode_IncomingLinks();
		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CATEGORY = eINSTANCE.getNode_Category();
		/**
		 * The meta object literal for the '<em><b>Fixed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__FIXED = eINSTANCE.getNode_Fixed();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__VALUE = eINSTANCE.getNode_Value();
		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SYMBOL = eINSTANCE.getNode_Symbol();
		/**
		 * The meta object literal for the '<em><b>Symbol Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SYMBOL_SIZE = eINSTANCE.getNode_SymbolSize();
		/**
		 * The meta object literal for the '<em><b>Symbol Rotate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SYMBOL_ROTATE = eINSTANCE.getNode_SymbolRotate();
		/**
		 * The meta object literal for the '<em><b>Symbol Offset</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SYMBOL_OFFSET = eINSTANCE.getNode_SymbolOffset();
		/**
		 * The meta object literal for the '<em><b>Symbol Keep Aspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__SYMBOL_KEEP_ASPECT = eINSTANCE.getNode_SymbolKeepAspect();
		/**
		 * The meta object literal for the '<em><b>Item Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__ITEM_STYLE = eINSTANCE.getNode_ItemStyle();
		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__LABEL = eINSTANCE.getNode_Label();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl <em>Item Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.ItemStyleImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getItemStyle()
		 * @generated
		 */
		EClass ITEM_STYLE = eINSTANCE.getItemStyle();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__COLOR = eINSTANCE.getItemStyle_Color();
		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__BORDER_COLOR = eINSTANCE.getItemStyle_BorderColor();
		/**
		 * The meta object literal for the '<em><b>Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__BORDER_WIDTH = eINSTANCE.getItemStyle_BorderWidth();
		/**
		 * The meta object literal for the '<em><b>Border Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__BORDER_TYPE = eINSTANCE.getItemStyle_BorderType();
		/**
		 * The meta object literal for the '<em><b>Border Dash Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__BORDER_DASH_OFFSET = eINSTANCE.getItemStyle_BorderDashOffset();
		/**
		 * The meta object literal for the '<em><b>Border Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__BORDER_CAP = eINSTANCE.getItemStyle_BorderCap();
		/**
		 * The meta object literal for the '<em><b>Border Join</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__BORDER_JOIN = eINSTANCE.getItemStyle_BorderJoin();
		/**
		 * The meta object literal for the '<em><b>Border Miter Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__BORDER_MITER_LIMIT = eINSTANCE.getItemStyle_BorderMiterLimit();
		/**
		 * The meta object literal for the '<em><b>Shadow Blur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__SHADOW_BLUR = eINSTANCE.getItemStyle_ShadowBlur();
		/**
		 * The meta object literal for the '<em><b>Shadow Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__SHADOW_COLOR = eINSTANCE.getItemStyle_ShadowColor();
		/**
		 * The meta object literal for the '<em><b>Shadow Offset X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__SHADOW_OFFSET_X = eINSTANCE.getItemStyle_ShadowOffsetX();
		/**
		 * The meta object literal for the '<em><b>Shadow Offset Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__SHADOW_OFFSET_Y = eINSTANCE.getItemStyle_ShadowOffsetY();
		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__OPACITY = eINSTANCE.getItemStyle_Opacity();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.CategoryImpl <em>Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.CategoryImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getCategory()
		 * @generated
		 */
		EClass CATEGORY = eINSTANCE.getCategory();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.LinkImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();
		/**
		 * The meta object literal for the '<em><b>Source</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();
		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.GraphImpl <em>Graph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.GraphImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraph()
		 * @generated
		 */
		EClass GRAPH = eINSTANCE.getGraph();
		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__NODES = eINSTANCE.getGraph_Nodes();
		/**
		 * The meta object literal for the '<em><b>Categories</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAPH__CATEGORIES = eINSTANCE.getGraph_Categories();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.LabelImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();
		/**
		 * The meta object literal for the '<em><b>Show</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__SHOW = eINSTANCE.getLabel_Show();
		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__POSITION = eINSTANCE.getLabel_Position();
		/**
		 * The meta object literal for the '<em><b>Distance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__DISTANCE = eINSTANCE.getLabel_Distance();
		/**
		 * The meta object literal for the '<em><b>Rotate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ROTATE = eINSTANCE.getLabel_Rotate();
		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__OFFSET = eINSTANCE.getLabel_Offset();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__COLOR = eINSTANCE.getLabel_Color();
		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FONT_STYLE = eINSTANCE.getLabel_FontStyle();
		/**
		 * The meta object literal for the '<em><b>Font Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FONT_WEIGHT = eINSTANCE.getLabel_FontWeight();
		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FONT_FAMILY = eINSTANCE.getLabel_FontFamily();
		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FONT_SIZE = eINSTANCE.getLabel_FontSize();
		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ALIGN = eINSTANCE.getLabel_Align();
		/**
		 * The meta object literal for the '<em><b>Vertical Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__VERTICAL_ALIGN = eINSTANCE.getLabel_VerticalAlign();
		/**
		 * The meta object literal for the '<em><b>Line Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__LINE_HEIGHT = eINSTANCE.getLabel_LineHeight();
		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__BACKGROUND_COLOR = eINSTANCE.getLabel_BackgroundColor();
		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__BORDER_COLOR = eINSTANCE.getLabel_BorderColor();
		/**
		 * The meta object literal for the '<em><b>Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__BORDER_WIDTH = eINSTANCE.getLabel_BorderWidth();
		/**
		 * The meta object literal for the '<em><b>Border Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__BORDER_TYPE = eINSTANCE.getLabel_BorderType();
		/**
		 * The meta object literal for the '<em><b>Border Dash Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__BORDER_DASH_OFFSET = eINSTANCE.getLabel_BorderDashOffset();
		/**
		 * The meta object literal for the '<em><b>Border Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__BORDER_RADIUS = eINSTANCE.getLabel_BorderRadius();
		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__PADDING = eINSTANCE.getLabel_Padding();
		/**
		 * The meta object literal for the '<em><b>Shadow Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__SHADOW_COLOR = eINSTANCE.getLabel_ShadowColor();
		/**
		 * The meta object literal for the '<em><b>Shadow Blur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__SHADOW_BLUR = eINSTANCE.getLabel_ShadowBlur();
		/**
		 * The meta object literal for the '<em><b>Shadow Offset X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__SHADOW_OFFSET_X = eINSTANCE.getLabel_ShadowOffsetX();
		/**
		 * The meta object literal for the '<em><b>Shadow Offset Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__SHADOW_OFFSET_Y = eINSTANCE.getLabel_ShadowOffsetY();
		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__WIDTH = eINSTANCE.getLabel_Width();
		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__HEIGHT = eINSTANCE.getLabel_Height();
		/**
		 * The meta object literal for the '<em><b>Text Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_BORDER_COLOR = eINSTANCE.getLabel_TextBorderColor();
		/**
		 * The meta object literal for the '<em><b>Text Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_BORDER_WIDTH = eINSTANCE.getLabel_TextBorderWidth();
		/**
		 * The meta object literal for the '<em><b>Text Border Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_BORDER_TYPE = eINSTANCE.getLabel_TextBorderType();
		/**
		 * The meta object literal for the '<em><b>Text Border Dash Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_BORDER_DASH_OFFSET = eINSTANCE.getLabel_TextBorderDashOffset();
		/**
		 * The meta object literal for the '<em><b>Text Shadow Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_SHADOW_COLOR = eINSTANCE.getLabel_TextShadowColor();
		/**
		 * The meta object literal for the '<em><b>Text Shadow Blur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_SHADOW_BLUR = eINSTANCE.getLabel_TextShadowBlur();
		/**
		 * The meta object literal for the '<em><b>Text Shadow Offset X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_SHADOW_OFFSET_X = eINSTANCE.getLabel_TextShadowOffsetX();
		/**
		 * The meta object literal for the '<em><b>Text Shadow Offset Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__TEXT_SHADOW_OFFSET_Y = eINSTANCE.getLabel_TextShadowOffsetY();
		/**
		 * The meta object literal for the '<em><b>Overflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__OVERFLOW = eINSTANCE.getLabel_Overflow();
		/**
		 * The meta object literal for the '<em><b>Ellipsis</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__ELLIPSIS = eINSTANCE.getLabel_Ellipsis();
		/**
		 * The meta object literal for the '<em><b>Rich</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__RICH = eINSTANCE.getLabel_Rich();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.StyleEntryImpl <em>Style Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.StyleEntryImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getStyleEntry()
		 * @generated
		 */
		EClass STYLE_ENTRY = eINSTANCE.getStyleEntry();
		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE_ENTRY__KEY = eINSTANCE.getStyleEntry_Key();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLE_ENTRY__VALUE = eINSTANCE.getStyleEntry_Value();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.StringEntryImpl <em>String Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.StringEntryImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getStringEntry()
		 * @generated
		 */
		EClass STRING_ENTRY = eINSTANCE.getStringEntry();
		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ENTRY__KEY = eINSTANCE.getStringEntry_Key();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ENTRY__VALUE = eINSTANCE.getStringEntry_Value();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.BorderType <em>Border Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.BorderType
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getBorderType()
		 * @generated
		 */
		EEnum BORDER_TYPE = eINSTANCE.getBorderType();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.BorderCap <em>Border Cap</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.BorderCap
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getBorderCap()
		 * @generated
		 */
		EEnum BORDER_CAP = eINSTANCE.getBorderCap();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.BorderJoin <em>Border Join</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.BorderJoin
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getBorderJoin()
		 * @generated
		 */
		EEnum BORDER_JOIN = eINSTANCE.getBorderJoin();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.LabelPosition <em>Label Position</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.LabelPosition
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLabelPosition()
		 * @generated
		 */
		EEnum LABEL_POSITION = eINSTANCE.getLabelPosition();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.FontStyle <em>Font Style</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.FontStyle
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getFontStyle()
		 * @generated
		 */
		EEnum FONT_STYLE = eINSTANCE.getFontStyle();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.FontWeight <em>Font Weight</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.FontWeight
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getFontWeight()
		 * @generated
		 */
		EEnum FONT_WEIGHT = eINSTANCE.getFontWeight();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.Align <em>Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.Align
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getAlign()
		 * @generated
		 */
		EEnum ALIGN = eINSTANCE.getAlign();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.VerticalAlign <em>Vertical Align</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.VerticalAlign
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getVerticalAlign()
		 * @generated
		 */
		EEnum VERTICAL_ALIGN = eINSTANCE.getVerticalAlign();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.Overflow <em>Overflow</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.Overflow
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getOverflow()
		 * @generated
		 */
		EEnum OVERFLOW = eINSTANCE.getOverflow();

	}

} //GraphPackage

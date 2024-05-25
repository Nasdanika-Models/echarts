/**
 */
package org.nasdanika.models.echarts.graph;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 *        annotation="urn:org.nasdankia load-key='echarts-graph'"
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
	int NODE = 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.StyleImpl <em>Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.StyleImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getStyle()
	 * @generated
	 */
	int STYLE = 3;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.LineStyleImpl <em>Line Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.LineStyleImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLineStyle()
	 * @generated
	 */
	int LINE_STYLE = 4;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.ItemStyleImpl <em>Item Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.ItemStyleImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getItemStyle()
	 * @generated
	 */
	int ITEM_STYLE = 5;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.LinkImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 6;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.GraphImpl <em>Graph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.GraphImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraph()
	 * @generated
	 */
	int GRAPH = 0;

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
	 * The operation id for the '<em>Configure Graph Series</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH___CONFIGURE_GRAPH_SERIES__GRAPHSERIES = 0;

	/**
	 * The number of operations of the '<em>Graph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAPH_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.ItemImpl <em>Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.ItemImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getItem()
	 * @generated
	 */
	int ITEM = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__NAME = 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SYMBOL = 1;

	/**
	 * The feature id for the '<em><b>Symbol Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SYMBOL_SIZE = 2;

	/**
	 * The feature id for the '<em><b>Symbol Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SYMBOL_ROTATE = 3;

	/**
	 * The feature id for the '<em><b>Symbol Offset</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SYMBOL_OFFSET = 4;

	/**
	 * The feature id for the '<em><b>Symbol Keep Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SYMBOL_KEEP_ASPECT = 5;

	/**
	 * The feature id for the '<em><b>Item Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__ITEM_STYLE = 6;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__LABEL = 7;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__EMPHASIS = 8;

	/**
	 * The feature id for the '<em><b>Blur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__BLUR = 9;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__SELECT = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM__VALUE = 11;

	/**
	 * The number of structural features of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Create Graph Category Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM___CREATE_GRAPH_CATEGORY_ITEM = 0;

	/**
	 * The number of operations of the '<em>Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = ITEM__NAME;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYMBOL = ITEM__SYMBOL;

	/**
	 * The feature id for the '<em><b>Symbol Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYMBOL_SIZE = ITEM__SYMBOL_SIZE;

	/**
	 * The feature id for the '<em><b>Symbol Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYMBOL_ROTATE = ITEM__SYMBOL_ROTATE;

	/**
	 * The feature id for the '<em><b>Symbol Offset</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYMBOL_OFFSET = ITEM__SYMBOL_OFFSET;

	/**
	 * The feature id for the '<em><b>Symbol Keep Aspect</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SYMBOL_KEEP_ASPECT = ITEM__SYMBOL_KEEP_ASPECT;

	/**
	 * The feature id for the '<em><b>Item Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ITEM_STYLE = ITEM__ITEM_STYLE;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__LABEL = ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__EMPHASIS = ITEM__EMPHASIS;

	/**
	 * The feature id for the '<em><b>Blur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BLUR = ITEM__BLUR;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SELECT = ITEM__SELECT;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__VALUE = ITEM__VALUE;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__ID = ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__X = ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__Y = ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Outgoing Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING_LINKS = ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Incoming Links</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMING_LINKS = ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CATEGORY = ITEM_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Fixed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__FIXED = ITEM_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Draggable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__DRAGGABLE = ITEM_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = ITEM_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Create Graph Category Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CREATE_GRAPH_CATEGORY_ITEM = ITEM___CREATE_GRAPH_CATEGORY_ITEM;

	/**
	 * The operation id for the '<em>Create Graph Node Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE___CREATE_GRAPH_NODE_ITEM = ITEM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_OPERATION_COUNT = ITEM_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__COLOR = 0;

	/**
	 * The feature id for the '<em><b>Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__SHADOW_BLUR = 1;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__SHADOW_COLOR = 2;

	/**
	 * The feature id for the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__SHADOW_OFFSET_X = 3;

	/**
	 * The feature id for the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__SHADOW_OFFSET_Y = 4;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE__OPACITY = 5;

	/**
	 * The number of structural features of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLE_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__COLOR = STYLE__COLOR;

	/**
	 * The feature id for the '<em><b>Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__SHADOW_BLUR = STYLE__SHADOW_BLUR;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__SHADOW_COLOR = STYLE__SHADOW_COLOR;

	/**
	 * The feature id for the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__SHADOW_OFFSET_X = STYLE__SHADOW_OFFSET_X;

	/**
	 * The feature id for the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__SHADOW_OFFSET_Y = STYLE__SHADOW_OFFSET_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__OPACITY = STYLE__OPACITY;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__WIDTH = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__TYPE = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__DASH_OFFSET = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Cap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__CAP = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Join</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__JOIN = STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Miter Limit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__MITER_LIMIT = STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Curveness</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE__CURVENESS = STYLE_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 7;

	/**
	 * The operation id for the '<em>Create Graph Edge Line Style Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE___CREATE_GRAPH_EDGE_LINE_STYLE_OPTION = STYLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__COLOR = STYLE__COLOR;

	/**
	 * The feature id for the '<em><b>Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__SHADOW_BLUR = STYLE__SHADOW_BLUR;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__SHADOW_COLOR = STYLE__SHADOW_COLOR;

	/**
	 * The feature id for the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__SHADOW_OFFSET_X = STYLE__SHADOW_OFFSET_X;

	/**
	 * The feature id for the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__SHADOW_OFFSET_Y = STYLE__SHADOW_OFFSET_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__OPACITY = STYLE__OPACITY;

	/**
	 * The feature id for the '<em><b>Border Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__BORDER_STYLE = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE__DECAL = STYLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Item Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Create Item Style Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE___CREATE_ITEM_STYLE_OPTION = STYLE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LINE_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__LABEL = 2;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__EMPHASIS = 3;

	/**
	 * The feature id for the '<em><b>Blur</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__BLUR = 4;

	/**
	 * The feature id for the '<em><b>Select</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SELECT = 5;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SYMBOL = 6;

	/**
	 * The feature id for the '<em><b>Symbol Size</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SYMBOL_SIZE = 7;

	/**
	 * The feature id for the '<em><b>Ignore Force Layout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__IGNORE_FORCE_LAYOUT = 8;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__VALUE = 9;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 10;

	/**
	 * The operation id for the '<em>Create Graph Edge Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK___CREATE_GRAPH_EDGE_ITEM = 0;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl <em>Text Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.TextStyleImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getTextStyle()
	 * @generated
	 */
	int TEXT_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__COLOR = STYLE__COLOR;

	/**
	 * The feature id for the '<em><b>Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__SHADOW_BLUR = STYLE__SHADOW_BLUR;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__SHADOW_COLOR = STYLE__SHADOW_COLOR;

	/**
	 * The feature id for the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__SHADOW_OFFSET_X = STYLE__SHADOW_OFFSET_X;

	/**
	 * The feature id for the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__SHADOW_OFFSET_Y = STYLE__SHADOW_OFFSET_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__OPACITY = STYLE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_STYLE = STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_WEIGHT = STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_FAMILY = STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__FONT_SIZE = STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__ALIGN = STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__VERTICAL_ALIGN = STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BASELINE = STYLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__LINE_HEIGHT = STYLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BACKGROUND_COLOR = STYLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BORDER_COLOR = STYLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BORDER_WIDTH = STYLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Border Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BORDER_TYPE = STYLE_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Border Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BORDER_DASH_OFFSET = STYLE_FEATURE_COUNT + 12;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__BORDER_RADIUS = STYLE_FEATURE_COUNT + 13;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__PADDING = STYLE_FEATURE_COUNT + 14;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__WIDTH = STYLE_FEATURE_COUNT + 15;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__HEIGHT = STYLE_FEATURE_COUNT + 16;

	/**
	 * The feature id for the '<em><b>Text Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_BORDER_COLOR = STYLE_FEATURE_COUNT + 17;

	/**
	 * The feature id for the '<em><b>Text Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_BORDER_WIDTH = STYLE_FEATURE_COUNT + 18;

	/**
	 * The feature id for the '<em><b>Text Border Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_BORDER_TYPE = STYLE_FEATURE_COUNT + 19;

	/**
	 * The feature id for the '<em><b>Text Border Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_BORDER_DASH_OFFSET = STYLE_FEATURE_COUNT + 20;

	/**
	 * The feature id for the '<em><b>Text Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_SHADOW_COLOR = STYLE_FEATURE_COUNT + 21;

	/**
	 * The feature id for the '<em><b>Text Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_SHADOW_BLUR = STYLE_FEATURE_COUNT + 22;

	/**
	 * The feature id for the '<em><b>Text Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_SHADOW_OFFSET_X = STYLE_FEATURE_COUNT + 23;

	/**
	 * The feature id for the '<em><b>Text Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TEXT_SHADOW_OFFSET_Y = STYLE_FEATURE_COUNT + 24;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE__TAG = STYLE_FEATURE_COUNT + 25;

	/**
	 * The number of structural features of the '<em>Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_FEATURE_COUNT = STYLE_FEATURE_COUNT + 26;

	/**
	 * The number of operations of the '<em>Text Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_OPERATION_COUNT = STYLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.LabelImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 8;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__COLOR = TEXT_STYLE__COLOR;

	/**
	 * The feature id for the '<em><b>Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SHADOW_BLUR = TEXT_STYLE__SHADOW_BLUR;

	/**
	 * The feature id for the '<em><b>Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SHADOW_COLOR = TEXT_STYLE__SHADOW_COLOR;

	/**
	 * The feature id for the '<em><b>Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SHADOW_OFFSET_X = TEXT_STYLE__SHADOW_OFFSET_X;

	/**
	 * The feature id for the '<em><b>Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SHADOW_OFFSET_Y = TEXT_STYLE__SHADOW_OFFSET_Y;

	/**
	 * The feature id for the '<em><b>Opacity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OPACITY = TEXT_STYLE__OPACITY;

	/**
	 * The feature id for the '<em><b>Font Style</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_STYLE = TEXT_STYLE__FONT_STYLE;

	/**
	 * The feature id for the '<em><b>Font Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_WEIGHT = TEXT_STYLE__FONT_WEIGHT;

	/**
	 * The feature id for the '<em><b>Font Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_FAMILY = TEXT_STYLE__FONT_FAMILY;

	/**
	 * The feature id for the '<em><b>Font Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FONT_SIZE = TEXT_STYLE__FONT_SIZE;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ALIGN = TEXT_STYLE__ALIGN;

	/**
	 * The feature id for the '<em><b>Vertical Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VERTICAL_ALIGN = TEXT_STYLE__VERTICAL_ALIGN;

	/**
	 * The feature id for the '<em><b>Baseline</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BASELINE = TEXT_STYLE__BASELINE;

	/**
	 * The feature id for the '<em><b>Line Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__LINE_HEIGHT = TEXT_STYLE__LINE_HEIGHT;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BACKGROUND_COLOR = TEXT_STYLE__BACKGROUND_COLOR;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER_COLOR = TEXT_STYLE__BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER_WIDTH = TEXT_STYLE__BORDER_WIDTH;

	/**
	 * The feature id for the '<em><b>Border Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER_TYPE = TEXT_STYLE__BORDER_TYPE;

	/**
	 * The feature id for the '<em><b>Border Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER_DASH_OFFSET = TEXT_STYLE__BORDER_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Border Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__BORDER_RADIUS = TEXT_STYLE__BORDER_RADIUS;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PADDING = TEXT_STYLE__PADDING;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__WIDTH = TEXT_STYLE__WIDTH;

	/**
	 * The feature id for the '<em><b>Height</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__HEIGHT = TEXT_STYLE__HEIGHT;

	/**
	 * The feature id for the '<em><b>Text Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_BORDER_COLOR = TEXT_STYLE__TEXT_BORDER_COLOR;

	/**
	 * The feature id for the '<em><b>Text Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_BORDER_WIDTH = TEXT_STYLE__TEXT_BORDER_WIDTH;

	/**
	 * The feature id for the '<em><b>Text Border Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_BORDER_TYPE = TEXT_STYLE__TEXT_BORDER_TYPE;

	/**
	 * The feature id for the '<em><b>Text Border Dash Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_BORDER_DASH_OFFSET = TEXT_STYLE__TEXT_BORDER_DASH_OFFSET;

	/**
	 * The feature id for the '<em><b>Text Shadow Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_SHADOW_COLOR = TEXT_STYLE__TEXT_SHADOW_COLOR;

	/**
	 * The feature id for the '<em><b>Text Shadow Blur</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_SHADOW_BLUR = TEXT_STYLE__TEXT_SHADOW_BLUR;

	/**
	 * The feature id for the '<em><b>Text Shadow Offset X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_SHADOW_OFFSET_X = TEXT_STYLE__TEXT_SHADOW_OFFSET_X;

	/**
	 * The feature id for the '<em><b>Text Shadow Offset Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TEXT_SHADOW_OFFSET_Y = TEXT_STYLE__TEXT_SHADOW_OFFSET_Y;

	/**
	 * The feature id for the '<em><b>Tag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__TAG = TEXT_STYLE__TAG;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__FORMATTER = TEXT_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Show</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SHOW = TEXT_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__POSITION = TEXT_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__DISTANCE = TEXT_STYLE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Rotate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__ROTATE = TEXT_STYLE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OFFSET = TEXT_STYLE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Min Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__MIN_MARGIN = TEXT_STYLE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Overflow</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__OVERFLOW = TEXT_STYLE_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Silent</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__SILENT = TEXT_STYLE_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Precision</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__PRECISION = TEXT_STYLE_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Value Animation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__VALUE_ANIMATION = TEXT_STYLE_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Rich</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL__RICH = TEXT_STYLE_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = TEXT_STYLE_FEATURE_COUNT + 12;

	/**
	 * The operation id for the '<em>Create Series Label Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL___CREATE_SERIES_LABEL_OPTION = TEXT_STYLE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Series Line Label Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL___CREATE_SERIES_LINE_LABEL_OPTION = TEXT_STYLE_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = TEXT_STYLE_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.TextStyleEntryImpl <em>Text Style Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.TextStyleEntryImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getTextStyleEntry()
	 * @generated
	 */
	int TEXT_STYLE_ENTRY = 9;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_ENTRY__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_ENTRY__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Text Style Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Text Style Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEXT_STYLE_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.StateImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getState()
	 * @generated
	 */
	int STATE = 10;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DISABLED = 0;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__LABEL = 1;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.ItemStateImpl <em>Item State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.ItemStateImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getItemState()
	 * @generated
	 */
	int ITEM_STATE = 11;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STATE__DISABLED = STATE__DISABLED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Item Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STATE__ITEM_STYLE = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Item State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Graph Node State Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STATE___CREATE_GRAPH_NODE_STATE_OPTION = STATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Item State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEM_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.LineStateImpl <em>Line State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.LineStateImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLineState()
	 * @generated
	 */
	int LINE_STATE = 12;

	/**
	 * The feature id for the '<em><b>Disabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STATE__DISABLED = STATE__DISABLED;

	/**
	 * The feature id for the '<em><b>Label</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STATE__LABEL = STATE__LABEL;

	/**
	 * The feature id for the '<em><b>Line Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STATE__LINE_STYLE = STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Line State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STATE_FEATURE_COUNT = STATE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Create Graph Edge State Option</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STATE___CREATE_GRAPH_EDGE_STATE_OPTION = STATE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Line State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_STATE_OPERATION_COUNT = STATE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl <em>Tooltip</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.impl.TooltipImpl
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getTooltip()
	 * @generated
	 */
	int TOOLTIP = 13;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__POSITION = 0;

	/**
	 * The feature id for the '<em><b>Formatter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__FORMATTER = 1;

	/**
	 * The feature id for the '<em><b>Value Formatter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__VALUE_FORMATTER = 2;

	/**
	 * The feature id for the '<em><b>Background Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__BACKGROUND_COLOR = 3;

	/**
	 * The feature id for the '<em><b>Border Color</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__BORDER_COLOR = 4;

	/**
	 * The feature id for the '<em><b>Border Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__BORDER_WIDTH = 5;

	/**
	 * The feature id for the '<em><b>Padding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__PADDING = 6;

	/**
	 * The feature id for the '<em><b>Text Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__TEXT_STYLE = 7;

	/**
	 * The feature id for the '<em><b>Extra Css Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP__EXTRA_CSS_TEXT = 8;

	/**
	 * The number of structural features of the '<em>Tooltip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Tooltip</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOOLTIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.BorderType <em>Border Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.BorderType
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getBorderType()
	 * @generated
	 */
	int BORDER_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.BorderCap <em>Border Cap</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.BorderCap
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getBorderCap()
	 * @generated
	 */
	int BORDER_CAP = 15;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.BorderJoin <em>Border Join</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.BorderJoin
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getBorderJoin()
	 * @generated
	 */
	int BORDER_JOIN = 16;


	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.LabelPosition <em>Label Position</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.LabelPosition
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLabelPosition()
	 * @generated
	 */
	int LABEL_POSITION = 17;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.FontStyle <em>Font Style</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.FontStyle
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getFontStyle()
	 * @generated
	 */
	int FONT_STYLE = 18;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.FontWeight <em>Font Weight</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.FontWeight
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getFontWeight()
	 * @generated
	 */
	int FONT_WEIGHT = 19;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.Align <em>Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.Align
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getAlign()
	 * @generated
	 */
	int ALIGN = 20;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.VerticalAlign <em>Vertical Align</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.VerticalAlign
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getVerticalAlign()
	 * @generated
	 */
	int VERTICAL_ALIGN = 21;

	/**
	 * The meta object id for the '{@link org.nasdanika.models.echarts.graph.Overflow <em>Overflow</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.nasdanika.models.echarts.graph.Overflow
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getOverflow()
	 * @generated
	 */
	int OVERFLOW = 22;


	/**
	 * The meta object id for the '<em>Series</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.icepear.echarts.charts.graph.GraphSeries
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphSeries()
	 * @generated
	 */
	int GRAPH_SERIES = 23;

	/**
	 * The meta object id for the '<em>Node Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.icepear.echarts.charts.graph.GraphNodeItem
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphNodeItem()
	 * @generated
	 */
	int GRAPH_NODE_ITEM = 24;

	/**
	 * The meta object id for the '<em>Edge Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.icepear.echarts.charts.graph.GraphEdgeItem
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphEdgeItem()
	 * @generated
	 */
	int GRAPH_EDGE_ITEM = 25;

	/**
	 * The meta object id for the '<em>Category Item</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.icepear.echarts.charts.graph.GraphCategoryItem
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphCategoryItem()
	 * @generated
	 */
	int GRAPH_CATEGORY_ITEM = 26;

	/**
	 * The meta object id for the '<em>Item Style Option</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.icepear.echarts.origin.util.ItemStyleOption
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getItemStyleOption()
	 * @generated
	 */
	int ITEM_STYLE_OPTION = 27;

	/**
	 * The meta object id for the '<em>Edge Line Style Option</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.icepear.echarts.origin.chart.graph.GraphEdgeLineStyleOption
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphEdgeLineStyleOption()
	 * @generated
	 */
	int GRAPH_EDGE_LINE_STYLE_OPTION = 28;

	/**
	 * The meta object id for the '<em>Series Label Option</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.icepear.echarts.origin.util.SeriesLabelOption
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getSeriesLabelOption()
	 * @generated
	 */
	int SERIES_LABEL_OPTION = 29;

	/**
	 * The meta object id for the '<em>Series Line Label Option</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.icepear.echarts.origin.util.SeriesLineLabelOption
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getSeriesLineLabelOption()
	 * @generated
	 */
	int SERIES_LINE_LABEL_OPTION = 30;

	/**
	 * The meta object id for the '<em>Node State Option</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.icepear.echarts.origin.chart.graph.GraphNodeStateOption
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphNodeStateOption()
	 * @generated
	 */
	int GRAPH_NODE_STATE_OPTION = 31;

	/**
	 * The meta object id for the '<em>Edge State Option</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.icepear.echarts.origin.chart.graph.GraphEdgeStateOption
	 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphEdgeStateOption()
	 * @generated
	 */
	int GRAPH_EDGE_STATE_OPTION = 32;

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Node#getDraggable <em>Draggable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draggable</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getDraggable()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Draggable();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Node#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.nasdanika.models.echarts.graph.Node#getId()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Id();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.echarts.graph.Node#createGraphNodeItem() <em>Create Graph Node Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graph Node Item</em>' operation.
	 * @see org.nasdanika.models.echarts.graph.Node#createGraphNodeItem()
	 * @generated
	 */
	EOperation getNode__CreateGraphNodeItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.Style <em>Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.Style
	 * @generated
	 */
	EClass getStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Style#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.Style#getColor()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Color();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Style#getShadowBlur <em>Shadow Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Blur</em>'.
	 * @see org.nasdanika.models.echarts.graph.Style#getShadowBlur()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_ShadowBlur();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Style#getShadowColor <em>Shadow Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.Style#getShadowColor()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_ShadowColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Style#getShadowOffsetX <em>Shadow Offset X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Offset X</em>'.
	 * @see org.nasdanika.models.echarts.graph.Style#getShadowOffsetX()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_ShadowOffsetX();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Style#getShadowOffsetY <em>Shadow Offset Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shadow Offset Y</em>'.
	 * @see org.nasdanika.models.echarts.graph.Style#getShadowOffsetY()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_ShadowOffsetY();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Style#getOpacity <em>Opacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Opacity</em>'.
	 * @see org.nasdanika.models.echarts.graph.Style#getOpacity()
	 * @see #getStyle()
	 * @generated
	 */
	EAttribute getStyle_Opacity();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.LineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.LineStyle
	 * @generated
	 */
	EClass getLineStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.LineStyle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.models.echarts.graph.LineStyle#getWidth()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.LineStyle#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.nasdanika.models.echarts.graph.LineStyle#getType()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.LineStyle#getDashOffset <em>Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dash Offset</em>'.
	 * @see org.nasdanika.models.echarts.graph.LineStyle#getDashOffset()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_DashOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.LineStyle#getCap <em>Cap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cap</em>'.
	 * @see org.nasdanika.models.echarts.graph.LineStyle#getCap()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Cap();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.LineStyle#getJoin <em>Join</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Join</em>'.
	 * @see org.nasdanika.models.echarts.graph.LineStyle#getJoin()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Join();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.LineStyle#getMiterLimit <em>Miter Limit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Miter Limit</em>'.
	 * @see org.nasdanika.models.echarts.graph.LineStyle#getMiterLimit()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_MiterLimit();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.LineStyle#getCurveness <em>Curveness</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Curveness</em>'.
	 * @see org.nasdanika.models.echarts.graph.LineStyle#getCurveness()
	 * @see #getLineStyle()
	 * @generated
	 */
	EAttribute getLineStyle_Curveness();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.echarts.graph.LineStyle#createGraphEdgeLineStyleOption() <em>Create Graph Edge Line Style Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graph Edge Line Style Option</em>' operation.
	 * @see org.nasdanika.models.echarts.graph.LineStyle#createGraphEdgeLineStyleOption()
	 * @generated
	 */
	EOperation getLineStyle__CreateGraphEdgeLineStyleOption();

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
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.ItemStyle#getBorderStyle <em>Border Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Border Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getBorderStyle()
	 * @see #getItemStyle()
	 * @generated
	 */
	EReference getItemStyle_BorderStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.ItemStyle#getDecal <em>Decal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decal</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#getDecal()
	 * @see #getItemStyle()
	 * @generated
	 */
	EAttribute getItemStyle_Decal();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.echarts.graph.ItemStyle#createItemStyleOption() <em>Create Item Style Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Item Style Option</em>' operation.
	 * @see org.nasdanika.models.echarts.graph.ItemStyle#createItemStyleOption()
	 * @generated
	 */
	EOperation getItemStyle__CreateItemStyleOption();

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
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.echarts.graph.Link#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getValue()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Value();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Link#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getLineStyle()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_LineStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Link#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getLabel()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Link#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Emphasis</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getEmphasis()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Emphasis();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Link#getBlur <em>Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blur</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getBlur()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Blur();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Link#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getSelect()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Select();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Link#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getSymbol()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Symbol();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.echarts.graph.Link#getSymbolSize <em>Symbol Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Symbol Size</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getSymbolSize()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_SymbolSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Link#getIgnoreForceLayout <em>Ignore Force Layout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Force Layout</em>'.
	 * @see org.nasdanika.models.echarts.graph.Link#getIgnoreForceLayout()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_IgnoreForceLayout();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.echarts.graph.Link#createGraphEdgeItem() <em>Create Graph Edge Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graph Edge Item</em>' operation.
	 * @see org.nasdanika.models.echarts.graph.Link#createGraphEdgeItem()
	 * @generated
	 */
	EOperation getLink__CreateGraphEdgeItem();

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
	 * Returns the meta object for the '{@link org.nasdanika.models.echarts.graph.Graph#configureGraphSeries(org.icepear.echarts.charts.graph.GraphSeries) <em>Configure Graph Series</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Configure Graph Series</em>' operation.
	 * @see org.nasdanika.models.echarts.graph.Graph#configureGraphSeries(org.icepear.echarts.charts.graph.GraphSeries)
	 * @generated
	 */
	EOperation getGraph__ConfigureGraphSeries__GraphSeries();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.Item <em>Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item
	 * @generated
	 */
	EClass getItem();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Item#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getName()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Item#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getSymbol()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_Symbol();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.echarts.graph.Item#getSymbolSize <em>Symbol Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Symbol Size</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getSymbolSize()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_SymbolSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Item#getSymbolRotate <em>Symbol Rotate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Rotate</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getSymbolRotate()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_SymbolRotate();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.echarts.graph.Item#getSymbolOffset <em>Symbol Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Symbol Offset</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getSymbolOffset()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_SymbolOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Item#getSymbolKeepAspect <em>Symbol Keep Aspect</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol Keep Aspect</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getSymbolKeepAspect()
	 * @see #getItem()
	 * @generated
	 */
	EAttribute getItem_SymbolKeepAspect();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Item#getItemStyle <em>Item Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getItemStyle()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_ItemStyle();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Item#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getLabel()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Label();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Item#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Emphasis</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getEmphasis()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Emphasis();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Item#getBlur <em>Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Blur</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getBlur()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Blur();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Item#getSelect <em>Select</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Select</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getSelect()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Select();

	/**
	 * Returns the meta object for the reference list '{@link org.nasdanika.models.echarts.graph.Item#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see org.nasdanika.models.echarts.graph.Item#getValue()
	 * @see #getItem()
	 * @generated
	 */
	EReference getItem_Value();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.echarts.graph.Item#createGraphCategoryItem() <em>Create Graph Category Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graph Category Item</em>' operation.
	 * @see org.nasdanika.models.echarts.graph.Item#createGraphCategoryItem()
	 * @generated
	 */
	EOperation getItem__CreateGraphCategoryItem();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.TextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle
	 * @generated
	 */
	EClass getTextStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getFontStyle <em>Font Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getFontStyle()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getFontWeight <em>Font Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Weight</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getFontWeight()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontWeight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getFontFamily <em>Font Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Family</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getFontFamily()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontFamily();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getFontSize <em>Font Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Font Size</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getFontSize()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_FontSize();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getLineHeight <em>Line Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Height</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getLineHeight()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_LineHeight();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getWidth()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getHeight <em>Height</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Height</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getHeight()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_Height();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderColor <em>Text Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Border Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getTextBorderColor()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextBorderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderWidth <em>Text Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Border Width</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getTextBorderWidth()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextBorderWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderType <em>Text Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Border Type</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getTextBorderType()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextBorderType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextBorderDashOffset <em>Text Border Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Border Dash Offset</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getTextBorderDashOffset()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextBorderDashOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowColor <em>Text Shadow Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Shadow Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getTextShadowColor()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextShadowColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowBlur <em>Text Shadow Blur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Shadow Blur</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getTextShadowBlur()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextShadowBlur();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowOffsetX <em>Text Shadow Offset X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Shadow Offset X</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getTextShadowOffsetX()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextShadowOffsetX();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getTextShadowOffsetY <em>Text Shadow Offset Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Text Shadow Offset Y</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getTextShadowOffsetY()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_TextShadowOffsetY();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getTag <em>Tag</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tag</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getTag()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_Tag();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getAlign()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getVerticalAlign <em>Vertical Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vertical Align</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getVerticalAlign()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_VerticalAlign();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getBaseline <em>Baseline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Baseline</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getBaseline()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_Baseline();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getBackgroundColor()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getBorderColor()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderWidth <em>Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Width</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getBorderWidth()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_BorderWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderType <em>Border Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Type</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getBorderType()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_BorderType();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderDashOffset <em>Border Dash Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Dash Offset</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getBorderDashOffset()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_BorderDashOffset();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.TextStyle#getBorderRadius <em>Border Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Radius</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getBorderRadius()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_BorderRadius();

	/**
	 * Returns the meta object for the attribute list '{@link org.nasdanika.models.echarts.graph.TextStyle#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Padding</em>'.
	 * @see org.nasdanika.models.echarts.graph.TextStyle#getPadding()
	 * @see #getTextStyle()
	 * @generated
	 */
	EAttribute getTextStyle_Padding();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getFormatter <em>Formatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formatter</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getFormatter()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Formatter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getShow <em>Show</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getShow()
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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getMinMargin <em>Min Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Margin</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getMinMargin()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_MinMargin();

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
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getSilent <em>Silent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Silent</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getSilent()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Silent();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getPrecision <em>Precision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precision</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getPrecision()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_Precision();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Label#getValueAnimation <em>Value Animation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Animation</em>'.
	 * @see org.nasdanika.models.echarts.graph.Label#getValueAnimation()
	 * @see #getLabel()
	 * @generated
	 */
	EAttribute getLabel_ValueAnimation();

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
	 * Returns the meta object for the '{@link org.nasdanika.models.echarts.graph.Label#createSeriesLabelOption() <em>Create Series Label Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Series Label Option</em>' operation.
	 * @see org.nasdanika.models.echarts.graph.Label#createSeriesLabelOption()
	 * @generated
	 */
	EOperation getLabel__CreateSeriesLabelOption();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.echarts.graph.Label#createSeriesLineLabelOption() <em>Create Series Line Label Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Series Line Label Option</em>' operation.
	 * @see org.nasdanika.models.echarts.graph.Label#createSeriesLineLabelOption()
	 * @generated
	 */
	EOperation getLabel__CreateSeriesLineLabelOption();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>Text Style Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Text Style Entry</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="org.nasdanika.models.echarts.graph.TextStyle" valueContainment="true"
	 * @generated
	 */
	EClass getTextStyleEntry();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTextStyleEntry()
	 * @generated
	 */
	EAttribute getTextStyleEntry_Key();

	/**
	 * Returns the meta object for the containment reference '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getTextStyleEntry()
	 * @generated
	 */
	EReference getTextStyleEntry_Value();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see org.nasdanika.models.echarts.graph.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.State#getDisabled <em>Disabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disabled</em>'.
	 * @see org.nasdanika.models.echarts.graph.State#getDisabled()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Disabled();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.State#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Label</em>'.
	 * @see org.nasdanika.models.echarts.graph.State#getLabel()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Label();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.ItemState <em>Item State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Item State</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemState
	 * @generated
	 */
	EClass getItemState();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.ItemState#getItemStyle <em>Item Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Item Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.ItemState#getItemStyle()
	 * @see #getItemState()
	 * @generated
	 */
	EReference getItemState_ItemStyle();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.echarts.graph.ItemState#createGraphNodeStateOption() <em>Create Graph Node State Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graph Node State Option</em>' operation.
	 * @see org.nasdanika.models.echarts.graph.ItemState#createGraphNodeStateOption()
	 * @generated
	 */
	EOperation getItemState__CreateGraphNodeStateOption();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.LineState <em>Line State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line State</em>'.
	 * @see org.nasdanika.models.echarts.graph.LineState
	 * @generated
	 */
	EClass getLineState();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.LineState#getLineStyle <em>Line Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Line Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.LineState#getLineStyle()
	 * @see #getLineState()
	 * @generated
	 */
	EReference getLineState_LineStyle();

	/**
	 * Returns the meta object for the '{@link org.nasdanika.models.echarts.graph.LineState#createGraphEdgeStateOption() <em>Create Graph Edge State Option</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Graph Edge State Option</em>' operation.
	 * @see org.nasdanika.models.echarts.graph.LineState#createGraphEdgeStateOption()
	 * @generated
	 */
	EOperation getLineState__CreateGraphEdgeStateOption();

	/**
	 * Returns the meta object for class '{@link org.nasdanika.models.echarts.graph.Tooltip <em>Tooltip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tooltip</em>'.
	 * @see org.nasdanika.models.echarts.graph.Tooltip
	 * @generated
	 */
	EClass getTooltip();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Tooltip#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see org.nasdanika.models.echarts.graph.Tooltip#getPosition()
	 * @see #getTooltip()
	 * @generated
	 */
	EAttribute getTooltip_Position();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Tooltip#getFormatter <em>Formatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Formatter</em>'.
	 * @see org.nasdanika.models.echarts.graph.Tooltip#getFormatter()
	 * @see #getTooltip()
	 * @generated
	 */
	EAttribute getTooltip_Formatter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Tooltip#getValueFormatter <em>Value Formatter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value Formatter</em>'.
	 * @see org.nasdanika.models.echarts.graph.Tooltip#getValueFormatter()
	 * @see #getTooltip()
	 * @generated
	 */
	EAttribute getTooltip_ValueFormatter();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Tooltip#getBackgroundColor <em>Background Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.Tooltip#getBackgroundColor()
	 * @see #getTooltip()
	 * @generated
	 */
	EAttribute getTooltip_BackgroundColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Tooltip#getBorderColor <em>Border Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Color</em>'.
	 * @see org.nasdanika.models.echarts.graph.Tooltip#getBorderColor()
	 * @see #getTooltip()
	 * @generated
	 */
	EAttribute getTooltip_BorderColor();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Tooltip#getBorderWidth <em>Border Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Border Width</em>'.
	 * @see org.nasdanika.models.echarts.graph.Tooltip#getBorderWidth()
	 * @see #getTooltip()
	 * @generated
	 */
	EAttribute getTooltip_BorderWidth();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Tooltip#getPadding <em>Padding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Padding</em>'.
	 * @see org.nasdanika.models.echarts.graph.Tooltip#getPadding()
	 * @see #getTooltip()
	 * @generated
	 */
	EAttribute getTooltip_Padding();

	/**
	 * Returns the meta object for the containment reference '{@link org.nasdanika.models.echarts.graph.Tooltip#getTextStyle <em>Text Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Text Style</em>'.
	 * @see org.nasdanika.models.echarts.graph.Tooltip#getTextStyle()
	 * @see #getTooltip()
	 * @generated
	 */
	EReference getTooltip_TextStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.nasdanika.models.echarts.graph.Tooltip#getExtraCssText <em>Extra Css Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extra Css Text</em>'.
	 * @see org.nasdanika.models.echarts.graph.Tooltip#getExtraCssText()
	 * @see #getTooltip()
	 * @generated
	 */
	EAttribute getTooltip_ExtraCssText();

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
	 * Returns the meta object for data type '{@link org.icepear.echarts.charts.graph.GraphSeries <em>Series</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Series</em>'.
	 * @see org.icepear.echarts.charts.graph.GraphSeries
	 * @model instanceClass="org.icepear.echarts.charts.graph.GraphSeries"
	 * @generated
	 */
	EDataType getGraphSeries();

	/**
	 * Returns the meta object for data type '{@link org.icepear.echarts.charts.graph.GraphNodeItem <em>Node Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node Item</em>'.
	 * @see org.icepear.echarts.charts.graph.GraphNodeItem
	 * @model instanceClass="org.icepear.echarts.charts.graph.GraphNodeItem"
	 * @generated
	 */
	EDataType getGraphNodeItem();

	/**
	 * Returns the meta object for data type '{@link org.icepear.echarts.charts.graph.GraphEdgeItem <em>Edge Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Edge Item</em>'.
	 * @see org.icepear.echarts.charts.graph.GraphEdgeItem
	 * @model instanceClass="org.icepear.echarts.charts.graph.GraphEdgeItem"
	 * @generated
	 */
	EDataType getGraphEdgeItem();

	/**
	 * Returns the meta object for data type '{@link org.icepear.echarts.charts.graph.GraphCategoryItem <em>Category Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Category Item</em>'.
	 * @see org.icepear.echarts.charts.graph.GraphCategoryItem
	 * @model instanceClass="org.icepear.echarts.charts.graph.GraphCategoryItem"
	 * @generated
	 */
	EDataType getGraphCategoryItem();

	/**
	 * Returns the meta object for data type '{@link org.icepear.echarts.origin.util.ItemStyleOption <em>Item Style Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Item Style Option</em>'.
	 * @see org.icepear.echarts.origin.util.ItemStyleOption
	 * @model instanceClass="org.icepear.echarts.origin.util.ItemStyleOption"
	 * @generated
	 */
	EDataType getItemStyleOption();

	/**
	 * Returns the meta object for data type '{@link org.icepear.echarts.origin.chart.graph.GraphEdgeLineStyleOption <em>Edge Line Style Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Edge Line Style Option</em>'.
	 * @see org.icepear.echarts.origin.chart.graph.GraphEdgeLineStyleOption
	 * @model instanceClass="org.icepear.echarts.origin.chart.graph.GraphEdgeLineStyleOption"
	 * @generated
	 */
	EDataType getGraphEdgeLineStyleOption();

	/**
	 * Returns the meta object for data type '{@link org.icepear.echarts.origin.util.SeriesLabelOption <em>Series Label Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Series Label Option</em>'.
	 * @see org.icepear.echarts.origin.util.SeriesLabelOption
	 * @model instanceClass="org.icepear.echarts.origin.util.SeriesLabelOption"
	 * @generated
	 */
	EDataType getSeriesLabelOption();

	/**
	 * Returns the meta object for data type '{@link org.icepear.echarts.origin.util.SeriesLineLabelOption <em>Series Line Label Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Series Line Label Option</em>'.
	 * @see org.icepear.echarts.origin.util.SeriesLineLabelOption
	 * @model instanceClass="org.icepear.echarts.origin.util.SeriesLineLabelOption"
	 * @generated
	 */
	EDataType getSeriesLineLabelOption();

	/**
	 * Returns the meta object for data type '{@link org.icepear.echarts.origin.chart.graph.GraphNodeStateOption <em>Node State Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Node State Option</em>'.
	 * @see org.icepear.echarts.origin.chart.graph.GraphNodeStateOption
	 * @model instanceClass="org.icepear.echarts.origin.chart.graph.GraphNodeStateOption"
	 * @generated
	 */
	EDataType getGraphNodeStateOption();

	/**
	 * Returns the meta object for data type '{@link org.icepear.echarts.origin.chart.graph.GraphEdgeStateOption <em>Edge State Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Edge State Option</em>'.
	 * @see org.icepear.echarts.origin.chart.graph.GraphEdgeStateOption
	 * @model instanceClass="org.icepear.echarts.origin.chart.graph.GraphEdgeStateOption"
	 * @generated
	 */
	EDataType getGraphEdgeStateOption();

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
		 * The meta object literal for the '<em><b>Draggable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__DRAGGABLE = eINSTANCE.getNode_Draggable();
		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__ID = eINSTANCE.getNode_Id();
		/**
		 * The meta object literal for the '<em><b>Create Graph Node Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation NODE___CREATE_GRAPH_NODE_ITEM = eINSTANCE.getNode__CreateGraphNodeItem();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.StyleImpl <em>Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.StyleImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getStyle()
		 * @generated
		 */
		EClass STYLE = eINSTANCE.getStyle();
		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__COLOR = eINSTANCE.getStyle_Color();
		/**
		 * The meta object literal for the '<em><b>Shadow Blur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__SHADOW_BLUR = eINSTANCE.getStyle_ShadowBlur();
		/**
		 * The meta object literal for the '<em><b>Shadow Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__SHADOW_COLOR = eINSTANCE.getStyle_ShadowColor();
		/**
		 * The meta object literal for the '<em><b>Shadow Offset X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__SHADOW_OFFSET_X = eINSTANCE.getStyle_ShadowOffsetX();
		/**
		 * The meta object literal for the '<em><b>Shadow Offset Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__SHADOW_OFFSET_Y = eINSTANCE.getStyle_ShadowOffsetY();
		/**
		 * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLE__OPACITY = eINSTANCE.getStyle_Opacity();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.LineStyleImpl <em>Line Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.LineStyleImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLineStyle()
		 * @generated
		 */
		EClass LINE_STYLE = eINSTANCE.getLineStyle();
		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__WIDTH = eINSTANCE.getLineStyle_Width();
		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__TYPE = eINSTANCE.getLineStyle_Type();
		/**
		 * The meta object literal for the '<em><b>Dash Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__DASH_OFFSET = eINSTANCE.getLineStyle_DashOffset();
		/**
		 * The meta object literal for the '<em><b>Cap</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__CAP = eINSTANCE.getLineStyle_Cap();
		/**
		 * The meta object literal for the '<em><b>Join</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__JOIN = eINSTANCE.getLineStyle_Join();
		/**
		 * The meta object literal for the '<em><b>Miter Limit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__MITER_LIMIT = eINSTANCE.getLineStyle_MiterLimit();
		/**
		 * The meta object literal for the '<em><b>Curveness</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_STYLE__CURVENESS = eINSTANCE.getLineStyle_Curveness();
		/**
		 * The meta object literal for the '<em><b>Create Graph Edge Line Style Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINE_STYLE___CREATE_GRAPH_EDGE_LINE_STYLE_OPTION = eINSTANCE.getLineStyle__CreateGraphEdgeLineStyleOption();
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
		 * The meta object literal for the '<em><b>Border Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_STYLE__BORDER_STYLE = eINSTANCE.getItemStyle_BorderStyle();
		/**
		 * The meta object literal for the '<em><b>Decal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM_STYLE__DECAL = eINSTANCE.getItemStyle_Decal();
		/**
		 * The meta object literal for the '<em><b>Create Item Style Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM_STYLE___CREATE_ITEM_STYLE_OPTION = eINSTANCE.getItemStyle__CreateItemStyleOption();
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
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__VALUE = eINSTANCE.getLink_Value();
		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LINE_STYLE = eINSTANCE.getLink_LineStyle();
		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__LABEL = eINSTANCE.getLink_Label();
		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__EMPHASIS = eINSTANCE.getLink_Emphasis();
		/**
		 * The meta object literal for the '<em><b>Blur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__BLUR = eINSTANCE.getLink_Blur();
		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SELECT = eINSTANCE.getLink_Select();
		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__SYMBOL = eINSTANCE.getLink_Symbol();
		/**
		 * The meta object literal for the '<em><b>Symbol Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__SYMBOL_SIZE = eINSTANCE.getLink_SymbolSize();
		/**
		 * The meta object literal for the '<em><b>Ignore Force Layout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__IGNORE_FORCE_LAYOUT = eINSTANCE.getLink_IgnoreForceLayout();
		/**
		 * The meta object literal for the '<em><b>Create Graph Edge Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINK___CREATE_GRAPH_EDGE_ITEM = eINSTANCE.getLink__CreateGraphEdgeItem();
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
		 * The meta object literal for the '<em><b>Configure Graph Series</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation GRAPH___CONFIGURE_GRAPH_SERIES__GRAPHSERIES = eINSTANCE.getGraph__ConfigureGraphSeries__GraphSeries();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.ItemImpl <em>Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.ItemImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getItem()
		 * @generated
		 */
		EClass ITEM = eINSTANCE.getItem();
		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__NAME = eINSTANCE.getItem_Name();
		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__SYMBOL = eINSTANCE.getItem_Symbol();
		/**
		 * The meta object literal for the '<em><b>Symbol Size</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__SYMBOL_SIZE = eINSTANCE.getItem_SymbolSize();
		/**
		 * The meta object literal for the '<em><b>Symbol Rotate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__SYMBOL_ROTATE = eINSTANCE.getItem_SymbolRotate();
		/**
		 * The meta object literal for the '<em><b>Symbol Offset</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__SYMBOL_OFFSET = eINSTANCE.getItem_SymbolOffset();
		/**
		 * The meta object literal for the '<em><b>Symbol Keep Aspect</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEM__SYMBOL_KEEP_ASPECT = eINSTANCE.getItem_SymbolKeepAspect();
		/**
		 * The meta object literal for the '<em><b>Item Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__ITEM_STYLE = eINSTANCE.getItem_ItemStyle();
		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__LABEL = eINSTANCE.getItem_Label();
		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__EMPHASIS = eINSTANCE.getItem_Emphasis();
		/**
		 * The meta object literal for the '<em><b>Blur</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__BLUR = eINSTANCE.getItem_Blur();
		/**
		 * The meta object literal for the '<em><b>Select</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__SELECT = eINSTANCE.getItem_Select();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM__VALUE = eINSTANCE.getItem_Value();
		/**
		 * The meta object literal for the '<em><b>Create Graph Category Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM___CREATE_GRAPH_CATEGORY_ITEM = eINSTANCE.getItem__CreateGraphCategoryItem();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.TextStyleImpl <em>Text Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.TextStyleImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getTextStyle()
		 * @generated
		 */
		EClass TEXT_STYLE = eINSTANCE.getTextStyle();
		/**
		 * The meta object literal for the '<em><b>Font Style</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_STYLE = eINSTANCE.getTextStyle_FontStyle();
		/**
		 * The meta object literal for the '<em><b>Font Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_WEIGHT = eINSTANCE.getTextStyle_FontWeight();
		/**
		 * The meta object literal for the '<em><b>Font Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_FAMILY = eINSTANCE.getTextStyle_FontFamily();
		/**
		 * The meta object literal for the '<em><b>Font Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__FONT_SIZE = eINSTANCE.getTextStyle_FontSize();
		/**
		 * The meta object literal for the '<em><b>Line Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__LINE_HEIGHT = eINSTANCE.getTextStyle_LineHeight();
		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__WIDTH = eINSTANCE.getTextStyle_Width();
		/**
		 * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__HEIGHT = eINSTANCE.getTextStyle_Height();
		/**
		 * The meta object literal for the '<em><b>Text Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_BORDER_COLOR = eINSTANCE.getTextStyle_TextBorderColor();
		/**
		 * The meta object literal for the '<em><b>Text Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_BORDER_WIDTH = eINSTANCE.getTextStyle_TextBorderWidth();
		/**
		 * The meta object literal for the '<em><b>Text Border Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_BORDER_TYPE = eINSTANCE.getTextStyle_TextBorderType();
		/**
		 * The meta object literal for the '<em><b>Text Border Dash Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_BORDER_DASH_OFFSET = eINSTANCE.getTextStyle_TextBorderDashOffset();
		/**
		 * The meta object literal for the '<em><b>Text Shadow Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_SHADOW_COLOR = eINSTANCE.getTextStyle_TextShadowColor();
		/**
		 * The meta object literal for the '<em><b>Text Shadow Blur</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_SHADOW_BLUR = eINSTANCE.getTextStyle_TextShadowBlur();
		/**
		 * The meta object literal for the '<em><b>Text Shadow Offset X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_SHADOW_OFFSET_X = eINSTANCE.getTextStyle_TextShadowOffsetX();
		/**
		 * The meta object literal for the '<em><b>Text Shadow Offset Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TEXT_SHADOW_OFFSET_Y = eINSTANCE.getTextStyle_TextShadowOffsetY();
		/**
		 * The meta object literal for the '<em><b>Tag</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__TAG = eINSTANCE.getTextStyle_Tag();
		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__ALIGN = eINSTANCE.getTextStyle_Align();
		/**
		 * The meta object literal for the '<em><b>Vertical Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__VERTICAL_ALIGN = eINSTANCE.getTextStyle_VerticalAlign();
		/**
		 * The meta object literal for the '<em><b>Baseline</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__BASELINE = eINSTANCE.getTextStyle_Baseline();
		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__BACKGROUND_COLOR = eINSTANCE.getTextStyle_BackgroundColor();
		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__BORDER_COLOR = eINSTANCE.getTextStyle_BorderColor();
		/**
		 * The meta object literal for the '<em><b>Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__BORDER_WIDTH = eINSTANCE.getTextStyle_BorderWidth();
		/**
		 * The meta object literal for the '<em><b>Border Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__BORDER_TYPE = eINSTANCE.getTextStyle_BorderType();
		/**
		 * The meta object literal for the '<em><b>Border Dash Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__BORDER_DASH_OFFSET = eINSTANCE.getTextStyle_BorderDashOffset();
		/**
		 * The meta object literal for the '<em><b>Border Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__BORDER_RADIUS = eINSTANCE.getTextStyle_BorderRadius();
		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE__PADDING = eINSTANCE.getTextStyle_Padding();
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
		 * The meta object literal for the '<em><b>Formatter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__FORMATTER = eINSTANCE.getLabel_Formatter();
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
		 * The meta object literal for the '<em><b>Min Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__MIN_MARGIN = eINSTANCE.getLabel_MinMargin();
		/**
		 * The meta object literal for the '<em><b>Overflow</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__OVERFLOW = eINSTANCE.getLabel_Overflow();
		/**
		 * The meta object literal for the '<em><b>Silent</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__SILENT = eINSTANCE.getLabel_Silent();
		/**
		 * The meta object literal for the '<em><b>Precision</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__PRECISION = eINSTANCE.getLabel_Precision();
		/**
		 * The meta object literal for the '<em><b>Value Animation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LABEL__VALUE_ANIMATION = eINSTANCE.getLabel_ValueAnimation();
		/**
		 * The meta object literal for the '<em><b>Rich</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LABEL__RICH = eINSTANCE.getLabel_Rich();
		/**
		 * The meta object literal for the '<em><b>Create Series Label Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL___CREATE_SERIES_LABEL_OPTION = eINSTANCE.getLabel__CreateSeriesLabelOption();
		/**
		 * The meta object literal for the '<em><b>Create Series Line Label Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LABEL___CREATE_SERIES_LINE_LABEL_OPTION = eINSTANCE.getLabel__CreateSeriesLineLabelOption();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.TextStyleEntryImpl <em>Text Style Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.TextStyleEntryImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getTextStyleEntry()
		 * @generated
		 */
		EClass TEXT_STYLE_ENTRY = eINSTANCE.getTextStyleEntry();
		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEXT_STYLE_ENTRY__KEY = eINSTANCE.getTextStyleEntry_Key();
		/**
		 * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEXT_STYLE_ENTRY__VALUE = eINSTANCE.getTextStyleEntry_Value();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.StateImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();
		/**
		 * The meta object literal for the '<em><b>Disabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__DISABLED = eINSTANCE.getState_Disabled();
		/**
		 * The meta object literal for the '<em><b>Label</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__LABEL = eINSTANCE.getState_Label();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.ItemStateImpl <em>Item State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.ItemStateImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getItemState()
		 * @generated
		 */
		EClass ITEM_STATE = eINSTANCE.getItemState();
		/**
		 * The meta object literal for the '<em><b>Item Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEM_STATE__ITEM_STYLE = eINSTANCE.getItemState_ItemStyle();
		/**
		 * The meta object literal for the '<em><b>Create Graph Node State Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ITEM_STATE___CREATE_GRAPH_NODE_STATE_OPTION = eINSTANCE.getItemState__CreateGraphNodeStateOption();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.LineStateImpl <em>Line State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.LineStateImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getLineState()
		 * @generated
		 */
		EClass LINE_STATE = eINSTANCE.getLineState();
		/**
		 * The meta object literal for the '<em><b>Line Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINE_STATE__LINE_STYLE = eINSTANCE.getLineState_LineStyle();
		/**
		 * The meta object literal for the '<em><b>Create Graph Edge State Option</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation LINE_STATE___CREATE_GRAPH_EDGE_STATE_OPTION = eINSTANCE.getLineState__CreateGraphEdgeStateOption();
		/**
		 * The meta object literal for the '{@link org.nasdanika.models.echarts.graph.impl.TooltipImpl <em>Tooltip</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.nasdanika.models.echarts.graph.impl.TooltipImpl
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getTooltip()
		 * @generated
		 */
		EClass TOOLTIP = eINSTANCE.getTooltip();
		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLTIP__POSITION = eINSTANCE.getTooltip_Position();
		/**
		 * The meta object literal for the '<em><b>Formatter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLTIP__FORMATTER = eINSTANCE.getTooltip_Formatter();
		/**
		 * The meta object literal for the '<em><b>Value Formatter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLTIP__VALUE_FORMATTER = eINSTANCE.getTooltip_ValueFormatter();
		/**
		 * The meta object literal for the '<em><b>Background Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLTIP__BACKGROUND_COLOR = eINSTANCE.getTooltip_BackgroundColor();
		/**
		 * The meta object literal for the '<em><b>Border Color</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLTIP__BORDER_COLOR = eINSTANCE.getTooltip_BorderColor();
		/**
		 * The meta object literal for the '<em><b>Border Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLTIP__BORDER_WIDTH = eINSTANCE.getTooltip_BorderWidth();
		/**
		 * The meta object literal for the '<em><b>Padding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLTIP__PADDING = eINSTANCE.getTooltip_Padding();
		/**
		 * The meta object literal for the '<em><b>Text Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOOLTIP__TEXT_STYLE = eINSTANCE.getTooltip_TextStyle();
		/**
		 * The meta object literal for the '<em><b>Extra Css Text</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TOOLTIP__EXTRA_CSS_TEXT = eINSTANCE.getTooltip_ExtraCssText();
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
		/**
		 * The meta object literal for the '<em>Series</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.icepear.echarts.charts.graph.GraphSeries
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphSeries()
		 * @generated
		 */
		EDataType GRAPH_SERIES = eINSTANCE.getGraphSeries();
		/**
		 * The meta object literal for the '<em>Node Item</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.icepear.echarts.charts.graph.GraphNodeItem
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphNodeItem()
		 * @generated
		 */
		EDataType GRAPH_NODE_ITEM = eINSTANCE.getGraphNodeItem();
		/**
		 * The meta object literal for the '<em>Edge Item</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.icepear.echarts.charts.graph.GraphEdgeItem
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphEdgeItem()
		 * @generated
		 */
		EDataType GRAPH_EDGE_ITEM = eINSTANCE.getGraphEdgeItem();
		/**
		 * The meta object literal for the '<em>Category Item</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.icepear.echarts.charts.graph.GraphCategoryItem
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphCategoryItem()
		 * @generated
		 */
		EDataType GRAPH_CATEGORY_ITEM = eINSTANCE.getGraphCategoryItem();
		/**
		 * The meta object literal for the '<em>Item Style Option</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.icepear.echarts.origin.util.ItemStyleOption
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getItemStyleOption()
		 * @generated
		 */
		EDataType ITEM_STYLE_OPTION = eINSTANCE.getItemStyleOption();
		/**
		 * The meta object literal for the '<em>Edge Line Style Option</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.icepear.echarts.origin.chart.graph.GraphEdgeLineStyleOption
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphEdgeLineStyleOption()
		 * @generated
		 */
		EDataType GRAPH_EDGE_LINE_STYLE_OPTION = eINSTANCE.getGraphEdgeLineStyleOption();
		/**
		 * The meta object literal for the '<em>Series Label Option</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.icepear.echarts.origin.util.SeriesLabelOption
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getSeriesLabelOption()
		 * @generated
		 */
		EDataType SERIES_LABEL_OPTION = eINSTANCE.getSeriesLabelOption();
		/**
		 * The meta object literal for the '<em>Series Line Label Option</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.icepear.echarts.origin.util.SeriesLineLabelOption
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getSeriesLineLabelOption()
		 * @generated
		 */
		EDataType SERIES_LINE_LABEL_OPTION = eINSTANCE.getSeriesLineLabelOption();
		/**
		 * The meta object literal for the '<em>Node State Option</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.icepear.echarts.origin.chart.graph.GraphNodeStateOption
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphNodeStateOption()
		 * @generated
		 */
		EDataType GRAPH_NODE_STATE_OPTION = eINSTANCE.getGraphNodeStateOption();
		/**
		 * The meta object literal for the '<em>Edge State Option</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.icepear.echarts.origin.chart.graph.GraphEdgeStateOption
		 * @see org.nasdanika.models.echarts.graph.impl.GraphPackageImpl#getGraphEdgeStateOption()
		 * @generated
		 */
		EDataType GRAPH_EDGE_STATE_OPTION = eINSTANCE.getGraphEdgeStateOption();

	}

} //GraphPackage

/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.icepear.echarts.charts.graph.GraphCategoryItem;
import org.icepear.echarts.charts.graph.GraphEdgeItem;
import org.icepear.echarts.charts.graph.GraphNodeItem;
import org.icepear.echarts.charts.graph.GraphSeries;
import org.icepear.echarts.origin.chart.graph.GraphEdgeLineStyleOption;
import org.icepear.echarts.origin.chart.graph.GraphEdgeStateOption;
import org.icepear.echarts.origin.chart.graph.GraphNodeStateOption;
import org.icepear.echarts.origin.util.ItemStyleOption;
import org.icepear.echarts.origin.util.SeriesLabelOption;
import org.icepear.echarts.origin.util.SeriesLineLabelOption;
import org.nasdanika.models.echarts.graph.Align;
import org.nasdanika.models.echarts.graph.BorderCap;
import org.nasdanika.models.echarts.graph.BorderJoin;
import org.nasdanika.models.echarts.graph.BorderType;
import org.nasdanika.models.echarts.graph.FontStyle;
import org.nasdanika.models.echarts.graph.FontWeight;
import org.nasdanika.models.echarts.graph.Graph;
import org.nasdanika.models.echarts.graph.GraphFactory;
import org.nasdanika.models.echarts.graph.GraphPackage;
import org.nasdanika.models.echarts.graph.Item;
import org.nasdanika.models.echarts.graph.ItemState;
import org.nasdanika.models.echarts.graph.ItemStyle;
import org.nasdanika.models.echarts.graph.Label;
import org.nasdanika.models.echarts.graph.LabelPosition;
import org.nasdanika.models.echarts.graph.LineState;
import org.nasdanika.models.echarts.graph.LineStyle;
import org.nasdanika.models.echarts.graph.Link;
import org.nasdanika.models.echarts.graph.Node;
import org.nasdanika.models.echarts.graph.Overflow;
import org.nasdanika.models.echarts.graph.State;
import org.nasdanika.models.echarts.graph.Style;
import org.nasdanika.models.echarts.graph.TextStyle;
import org.nasdanika.models.echarts.graph.Tooltip;
import org.nasdanika.models.echarts.graph.VerticalAlign;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GraphPackageImpl extends EPackageImpl implements GraphPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemStyleEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass graphEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass labelEClass = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textStyleEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tooltipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum borderTypeEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum borderCapEEnum = null;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum borderJoinEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum labelPositionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontStyleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fontWeightEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum alignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verticalAlignEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum overflowEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphSeriesEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphNodeItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphEdgeItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphCategoryItemEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType itemStyleOptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphEdgeLineStyleOptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType seriesLabelOptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType seriesLineLabelOptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphNodeStateOptionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType graphEdgeStateOptionEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.models.echarts.graph.GraphPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GraphPackageImpl() {
		super(eNS_URI, GraphFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GraphPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GraphPackage init() {
		if (isInited) return (GraphPackage)EPackage.Registry.INSTANCE.getEPackage(GraphPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGraphPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GraphPackageImpl theGraphPackage = registeredGraphPackage instanceof GraphPackageImpl ? (GraphPackageImpl)registeredGraphPackage : new GraphPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGraphPackage.createPackageContents();

		// Initialize created meta-data
		theGraphPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGraphPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GraphPackage.eNS_URI, theGraphPackage);
		return theGraphPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNode() {
		return nodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_X() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Y() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_OutgoingLinks() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_IncomingLinks() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Category() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Fixed() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Draggable() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Z() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Id() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNode__CreateGraphNodeItem() {
		return nodeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyle() {
		return styleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_Color() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_ShadowBlur() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_ShadowColor() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_ShadowOffsetX() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_ShadowOffsetY() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyle_Opacity() {
		return (EAttribute)styleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineStyle() {
		return lineStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineStyle_Width() {
		return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineStyle_Type() {
		return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineStyle_DashOffset() {
		return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineStyle_Cap() {
		return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineStyle_Join() {
		return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineStyle_MiterLimit() {
		return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLineStyle_Curveness() {
		return (EAttribute)lineStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLineStyle__CreateGraphEdgeLineStyleOption() {
		return lineStyleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemStyle() {
		return itemStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemStyle_BorderStyle() {
		return (EReference)itemStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItemStyle_Decal() {
		return (EAttribute)itemStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getItemStyle__CreateItemStyleOption() {
		return itemStyleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Target() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Value() {
		return (EReference)linkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_LineStyle() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Label() {
		return (EReference)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Emphasis() {
		return (EReference)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Blur() {
		return (EReference)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Select() {
		return (EReference)linkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Symbol() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_SymbolSize() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_IgnoreForceLayout() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLink__CreateGraphEdgeItem() {
		return linkEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGraph() {
		return graphEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Nodes() {
		return (EReference)graphEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGraph_Categories() {
		return (EReference)graphEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGraph__ConfigureGraphSeries__GraphSeries() {
		return graphEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItem() {
		return itemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Name() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_Symbol() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_SymbolSize() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_SymbolRotate() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_SymbolOffset() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getItem_SymbolKeepAspect() {
		return (EAttribute)itemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_ItemStyle() {
		return (EReference)itemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_Label() {
		return (EReference)itemEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_Emphasis() {
		return (EReference)itemEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_Blur() {
		return (EReference)itemEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_Select() {
		return (EReference)itemEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItem_Value() {
		return (EReference)itemEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getItem__CreateGraphCategoryItem() {
		return itemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextStyle() {
		return textStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_FontStyle() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_FontWeight() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_FontFamily() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_FontSize() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_LineHeight() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Width() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Height() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextBorderColor() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextBorderWidth() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextBorderType() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextBorderDashOffset() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextShadowColor() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextShadowBlur() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextShadowOffsetX() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextShadowOffsetY() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Tag() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Align() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_VerticalAlign() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Baseline() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_BackgroundColor() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_BorderColor() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_BorderWidth() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_BorderType() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_BorderDashOffset() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_BorderRadius() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Padding() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLabel() {
		return labelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Formatter() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Show() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Position() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Distance() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Rotate() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Offset() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_MinMargin() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Overflow() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Silent() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Precision() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_ValueAnimation() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabel_Rich() {
		return (EReference)labelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabel__CreateSeriesLabelOption() {
		return labelEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLabel__CreateSeriesLineLabelOption() {
		return labelEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTextStyleEntry() {
		return textStyleEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyleEntry_Key() {
		return (EAttribute)textStyleEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTextStyleEntry_Value() {
		return (EReference)textStyleEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getState_Disabled() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getState_Label() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getItemState() {
		return itemStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getItemState_ItemStyle() {
		return (EReference)itemStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getItemState__CreateGraphNodeStateOption() {
		return itemStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLineState() {
		return lineStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLineState_LineStyle() {
		return (EReference)lineStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getLineState__CreateGraphEdgeStateOption() {
		return lineStateEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTooltip() {
		return tooltipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooltip_Position() {
		return (EAttribute)tooltipEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooltip_Formatter() {
		return (EAttribute)tooltipEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooltip_ValueFormatter() {
		return (EAttribute)tooltipEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooltip_BackgroundColor() {
		return (EAttribute)tooltipEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooltip_BorderColor() {
		return (EAttribute)tooltipEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooltip_BorderWidth() {
		return (EAttribute)tooltipEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooltip_Padding() {
		return (EAttribute)tooltipEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTooltip_TextStyle() {
		return (EReference)tooltipEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTooltip_ExtraCssText() {
		return (EAttribute)tooltipEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBorderType() {
		return borderTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBorderCap() {
		return borderCapEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBorderJoin() {
		return borderJoinEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getLabelPosition() {
		return labelPositionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFontStyle() {
		return fontStyleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFontWeight() {
		return fontWeightEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getAlign() {
		return alignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getVerticalAlign() {
		return verticalAlignEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getOverflow() {
		return overflowEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGraphSeries() {
		return graphSeriesEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGraphNodeItem() {
		return graphNodeItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGraphEdgeItem() {
		return graphEdgeItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGraphCategoryItem() {
		return graphCategoryItemEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getItemStyleOption() {
		return itemStyleOptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGraphEdgeLineStyleOption() {
		return graphEdgeLineStyleOptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSeriesLabelOption() {
		return seriesLabelOptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getSeriesLineLabelOption() {
		return seriesLineLabelOptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGraphNodeStateOption() {
		return graphNodeStateOptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getGraphEdgeStateOption() {
		return graphEdgeStateOptionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GraphFactory getGraphFactory() {
		return (GraphFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		graphEClass = createEClass(GRAPH);
		createEReference(graphEClass, GRAPH__NODES);
		createEReference(graphEClass, GRAPH__CATEGORIES);
		createEOperation(graphEClass, GRAPH___CONFIGURE_GRAPH_SERIES__GRAPHSERIES);

		itemEClass = createEClass(ITEM);
		createEAttribute(itemEClass, ITEM__NAME);
		createEAttribute(itemEClass, ITEM__SYMBOL);
		createEAttribute(itemEClass, ITEM__SYMBOL_SIZE);
		createEAttribute(itemEClass, ITEM__SYMBOL_ROTATE);
		createEAttribute(itemEClass, ITEM__SYMBOL_OFFSET);
		createEAttribute(itemEClass, ITEM__SYMBOL_KEEP_ASPECT);
		createEReference(itemEClass, ITEM__ITEM_STYLE);
		createEReference(itemEClass, ITEM__LABEL);
		createEReference(itemEClass, ITEM__EMPHASIS);
		createEReference(itemEClass, ITEM__BLUR);
		createEReference(itemEClass, ITEM__SELECT);
		createEReference(itemEClass, ITEM__VALUE);
		createEOperation(itemEClass, ITEM___CREATE_GRAPH_CATEGORY_ITEM);

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__ID);
		createEAttribute(nodeEClass, NODE__X);
		createEAttribute(nodeEClass, NODE__Y);
		createEReference(nodeEClass, NODE__OUTGOING_LINKS);
		createEReference(nodeEClass, NODE__INCOMING_LINKS);
		createEReference(nodeEClass, NODE__CATEGORY);
		createEAttribute(nodeEClass, NODE__FIXED);
		createEAttribute(nodeEClass, NODE__DRAGGABLE);
		createEAttribute(nodeEClass, NODE__Z);
		createEOperation(nodeEClass, NODE___CREATE_GRAPH_NODE_ITEM);

		styleEClass = createEClass(STYLE);
		createEAttribute(styleEClass, STYLE__COLOR);
		createEAttribute(styleEClass, STYLE__SHADOW_BLUR);
		createEAttribute(styleEClass, STYLE__SHADOW_COLOR);
		createEAttribute(styleEClass, STYLE__SHADOW_OFFSET_X);
		createEAttribute(styleEClass, STYLE__SHADOW_OFFSET_Y);
		createEAttribute(styleEClass, STYLE__OPACITY);

		lineStyleEClass = createEClass(LINE_STYLE);
		createEAttribute(lineStyleEClass, LINE_STYLE__WIDTH);
		createEAttribute(lineStyleEClass, LINE_STYLE__TYPE);
		createEAttribute(lineStyleEClass, LINE_STYLE__DASH_OFFSET);
		createEAttribute(lineStyleEClass, LINE_STYLE__CAP);
		createEAttribute(lineStyleEClass, LINE_STYLE__JOIN);
		createEAttribute(lineStyleEClass, LINE_STYLE__MITER_LIMIT);
		createEAttribute(lineStyleEClass, LINE_STYLE__CURVENESS);
		createEOperation(lineStyleEClass, LINE_STYLE___CREATE_GRAPH_EDGE_LINE_STYLE_OPTION);

		itemStyleEClass = createEClass(ITEM_STYLE);
		createEReference(itemStyleEClass, ITEM_STYLE__BORDER_STYLE);
		createEAttribute(itemStyleEClass, ITEM_STYLE__DECAL);
		createEOperation(itemStyleEClass, ITEM_STYLE___CREATE_ITEM_STYLE_OPTION);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__TARGET);
		createEReference(linkEClass, LINK__LINE_STYLE);
		createEReference(linkEClass, LINK__LABEL);
		createEReference(linkEClass, LINK__EMPHASIS);
		createEReference(linkEClass, LINK__BLUR);
		createEReference(linkEClass, LINK__SELECT);
		createEAttribute(linkEClass, LINK__SYMBOL);
		createEAttribute(linkEClass, LINK__SYMBOL_SIZE);
		createEAttribute(linkEClass, LINK__IGNORE_FORCE_LAYOUT);
		createEReference(linkEClass, LINK__VALUE);
		createEOperation(linkEClass, LINK___CREATE_GRAPH_EDGE_ITEM);

		textStyleEClass = createEClass(TEXT_STYLE);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_STYLE);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_WEIGHT);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_FAMILY);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_SIZE);
		createEAttribute(textStyleEClass, TEXT_STYLE__ALIGN);
		createEAttribute(textStyleEClass, TEXT_STYLE__VERTICAL_ALIGN);
		createEAttribute(textStyleEClass, TEXT_STYLE__BASELINE);
		createEAttribute(textStyleEClass, TEXT_STYLE__LINE_HEIGHT);
		createEAttribute(textStyleEClass, TEXT_STYLE__BACKGROUND_COLOR);
		createEAttribute(textStyleEClass, TEXT_STYLE__BORDER_COLOR);
		createEAttribute(textStyleEClass, TEXT_STYLE__BORDER_WIDTH);
		createEAttribute(textStyleEClass, TEXT_STYLE__BORDER_TYPE);
		createEAttribute(textStyleEClass, TEXT_STYLE__BORDER_DASH_OFFSET);
		createEAttribute(textStyleEClass, TEXT_STYLE__BORDER_RADIUS);
		createEAttribute(textStyleEClass, TEXT_STYLE__PADDING);
		createEAttribute(textStyleEClass, TEXT_STYLE__WIDTH);
		createEAttribute(textStyleEClass, TEXT_STYLE__HEIGHT);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_BORDER_COLOR);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_BORDER_WIDTH);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_BORDER_TYPE);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_BORDER_DASH_OFFSET);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_SHADOW_COLOR);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_SHADOW_BLUR);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_SHADOW_OFFSET_X);
		createEAttribute(textStyleEClass, TEXT_STYLE__TEXT_SHADOW_OFFSET_Y);
		createEAttribute(textStyleEClass, TEXT_STYLE__TAG);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__FORMATTER);
		createEAttribute(labelEClass, LABEL__SHOW);
		createEAttribute(labelEClass, LABEL__POSITION);
		createEAttribute(labelEClass, LABEL__DISTANCE);
		createEAttribute(labelEClass, LABEL__ROTATE);
		createEAttribute(labelEClass, LABEL__OFFSET);
		createEAttribute(labelEClass, LABEL__MIN_MARGIN);
		createEAttribute(labelEClass, LABEL__OVERFLOW);
		createEAttribute(labelEClass, LABEL__SILENT);
		createEAttribute(labelEClass, LABEL__PRECISION);
		createEAttribute(labelEClass, LABEL__VALUE_ANIMATION);
		createEReference(labelEClass, LABEL__RICH);
		createEOperation(labelEClass, LABEL___CREATE_SERIES_LABEL_OPTION);
		createEOperation(labelEClass, LABEL___CREATE_SERIES_LINE_LABEL_OPTION);

		textStyleEntryEClass = createEClass(TEXT_STYLE_ENTRY);
		createEAttribute(textStyleEntryEClass, TEXT_STYLE_ENTRY__KEY);
		createEReference(textStyleEntryEClass, TEXT_STYLE_ENTRY__VALUE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__DISABLED);
		createEReference(stateEClass, STATE__LABEL);

		itemStateEClass = createEClass(ITEM_STATE);
		createEReference(itemStateEClass, ITEM_STATE__ITEM_STYLE);
		createEOperation(itemStateEClass, ITEM_STATE___CREATE_GRAPH_NODE_STATE_OPTION);

		lineStateEClass = createEClass(LINE_STATE);
		createEReference(lineStateEClass, LINE_STATE__LINE_STYLE);
		createEOperation(lineStateEClass, LINE_STATE___CREATE_GRAPH_EDGE_STATE_OPTION);

		tooltipEClass = createEClass(TOOLTIP);
		createEAttribute(tooltipEClass, TOOLTIP__POSITION);
		createEAttribute(tooltipEClass, TOOLTIP__FORMATTER);
		createEAttribute(tooltipEClass, TOOLTIP__VALUE_FORMATTER);
		createEAttribute(tooltipEClass, TOOLTIP__BACKGROUND_COLOR);
		createEAttribute(tooltipEClass, TOOLTIP__BORDER_COLOR);
		createEAttribute(tooltipEClass, TOOLTIP__BORDER_WIDTH);
		createEAttribute(tooltipEClass, TOOLTIP__PADDING);
		createEReference(tooltipEClass, TOOLTIP__TEXT_STYLE);
		createEAttribute(tooltipEClass, TOOLTIP__EXTRA_CSS_TEXT);

		// Create enums
		borderTypeEEnum = createEEnum(BORDER_TYPE);
		borderCapEEnum = createEEnum(BORDER_CAP);
		borderJoinEEnum = createEEnum(BORDER_JOIN);
		labelPositionEEnum = createEEnum(LABEL_POSITION);
		fontStyleEEnum = createEEnum(FONT_STYLE);
		fontWeightEEnum = createEEnum(FONT_WEIGHT);
		alignEEnum = createEEnum(ALIGN);
		verticalAlignEEnum = createEEnum(VERTICAL_ALIGN);
		overflowEEnum = createEEnum(OVERFLOW);

		// Create data types
		graphSeriesEDataType = createEDataType(GRAPH_SERIES);
		graphNodeItemEDataType = createEDataType(GRAPH_NODE_ITEM);
		graphEdgeItemEDataType = createEDataType(GRAPH_EDGE_ITEM);
		graphCategoryItemEDataType = createEDataType(GRAPH_CATEGORY_ITEM);
		itemStyleOptionEDataType = createEDataType(ITEM_STYLE_OPTION);
		graphEdgeLineStyleOptionEDataType = createEDataType(GRAPH_EDGE_LINE_STYLE_OPTION);
		seriesLabelOptionEDataType = createEDataType(SERIES_LABEL_OPTION);
		seriesLineLabelOptionEDataType = createEDataType(SERIES_LINE_LABEL_OPTION);
		graphNodeStateOptionEDataType = createEDataType(GRAPH_NODE_STATE_OPTION);
		graphEdgeStateOptionEDataType = createEDataType(GRAPH_EDGE_STATE_OPTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		nodeEClass.getESuperTypes().add(this.getItem());
		lineStyleEClass.getESuperTypes().add(this.getStyle());
		itemStyleEClass.getESuperTypes().add(this.getStyle());
		textStyleEClass.getESuperTypes().add(this.getStyle());
		labelEClass.getESuperTypes().add(this.getTextStyle());
		itemStateEClass.getESuperTypes().add(this.getState());
		lineStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes, features, and operations; add parameters
		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Categories(), this.getItem(), null, "categories", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getGraph__ConfigureGraphSeries__GraphSeries(), null, "configureGraphSeries", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getGraphSeries(), "graphSeries", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_SymbolSize(), ecorePackage.getEDouble(), "symbolSize", null, 0, 2, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_SymbolRotate(), ecorePackage.getEDoubleObject(), "symbolRotate", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_SymbolOffset(), ecorePackage.getEString(), "symbolOffset", null, 0, 2, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_SymbolKeepAspect(), ecorePackage.getEBooleanObject(), "symbolKeepAspect", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_ItemStyle(), this.getItemStyle(), null, "itemStyle", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Label(), this.getLabel(), null, "label", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Emphasis(), this.getItemState(), null, "emphasis", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Blur(), this.getItemState(), null, "blur", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Select(), this.getItemState(), null, "select", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Value(), ecorePackage.getEObject(), null, "value", null, 0, -1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getItem__CreateGraphCategoryItem(), this.getGraphCategoryItem(), "createGraphCategoryItem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_Id(), ecorePackage.getEString(), "id", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_OutgoingLinks(), this.getLink(), null, "outgoingLinks", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_IncomingLinks(), this.getLink(), this.getLink_Target(), "incomingLinks", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Category(), this.getItem(), null, "category", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Fixed(), ecorePackage.getEBoolean(), "fixed", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Draggable(), ecorePackage.getEBooleanObject(), "draggable", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Z(), ecorePackage.getEDoubleObject(), "z", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getNode__CreateGraphNodeItem(), this.getGraphNodeItem(), "createGraphNodeItem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_ShadowBlur(), ecorePackage.getEDoubleObject(), "shadowBlur", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_ShadowColor(), ecorePackage.getEString(), "shadowColor", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_ShadowOffsetX(), ecorePackage.getEDoubleObject(), "shadowOffsetX", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_ShadowOffsetY(), ecorePackage.getEDoubleObject(), "shadowOffsetY", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_Opacity(), ecorePackage.getEDoubleObject(), "opacity", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineStyleEClass, LineStyle.class, "LineStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineStyle_Width(), ecorePackage.getEInt(), "width", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_Type(), this.getBorderType(), "type", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_DashOffset(), ecorePackage.getEInt(), "dashOffset", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_Cap(), this.getBorderCap(), "cap", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_Join(), this.getBorderJoin(), "join", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_MiterLimit(), ecorePackage.getEInt(), "miterLimit", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_Curveness(), ecorePackage.getEDoubleObject(), "curveness", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLineStyle__CreateGraphEdgeLineStyleOption(), this.getGraphEdgeLineStyleOption(), "createGraphEdgeLineStyleOption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(itemStyleEClass, ItemStyle.class, "ItemStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemStyle_BorderStyle(), this.getLineStyle(), null, "borderStyle", null, 0, 1, ItemStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItemStyle_Decal(), ecorePackage.getEString(), "decal", null, 0, 1, ItemStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getItemStyle__CreateItemStyleOption(), this.getItemStyleOption(), "createItemStyleOption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Target(), this.getNode(), this.getNode_IncomingLinks(), "target", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_LineStyle(), this.getLineStyle(), null, "lineStyle", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Label(), this.getLabel(), null, "label", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Emphasis(), this.getLineState(), null, "emphasis", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Blur(), this.getLineState(), null, "blur", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Select(), this.getLineState(), null, "select", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_SymbolSize(), ecorePackage.getEDouble(), "symbolSize", null, 0, 2, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_IgnoreForceLayout(), ecorePackage.getEBooleanObject(), "ignoreForceLayout", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Value(), ecorePackage.getEObject(), null, "value", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLink__CreateGraphEdgeItem(), this.getGraphEdgeItem(), "createGraphEdgeItem", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textStyleEClass, TextStyle.class, "TextStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextStyle_FontStyle(), this.getFontStyle(), "fontStyle", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontWeight(), this.getFontWeight(), "fontWeight", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontFamily(), ecorePackage.getEString(), "fontFamily", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontSize(), ecorePackage.getEIntegerObject(), "fontSize", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_Align(), this.getAlign(), "align", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_VerticalAlign(), this.getVerticalAlign(), "verticalAlign", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_Baseline(), ecorePackage.getEString(), "baseline", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_LineHeight(), ecorePackage.getEIntegerObject(), "lineHeight", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_BorderColor(), ecorePackage.getEString(), "borderColor", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_BorderWidth(), ecorePackage.getEIntegerObject(), "borderWidth", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_BorderType(), this.getBorderType(), "borderType", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_BorderDashOffset(), ecorePackage.getEIntegerObject(), "borderDashOffset", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_BorderRadius(), ecorePackage.getEIntegerObject(), "borderRadius", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_Padding(), ecorePackage.getEInt(), "padding", null, 0, 4, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_Width(), ecorePackage.getEIntegerObject(), "width", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_Height(), ecorePackage.getEIntegerObject(), "height", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextBorderColor(), ecorePackage.getEString(), "textBorderColor", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextBorderWidth(), ecorePackage.getEIntegerObject(), "textBorderWidth", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextBorderType(), this.getBorderType(), "textBorderType", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextBorderDashOffset(), ecorePackage.getEIntegerObject(), "textBorderDashOffset", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextShadowColor(), ecorePackage.getEString(), "textShadowColor", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextShadowBlur(), ecorePackage.getEBigDecimal(), "textShadowBlur", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextShadowOffsetX(), ecorePackage.getEIntegerObject(), "textShadowOffsetX", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_TextShadowOffsetY(), ecorePackage.getEIntegerObject(), "textShadowOffsetY", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Formatter(), ecorePackage.getEString(), "formatter", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Show(), ecorePackage.getEBooleanObject(), "show", "true", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Position(), this.getLabelPosition(), "position", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Distance(), ecorePackage.getEIntegerObject(), "distance", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Rotate(), ecorePackage.getEDoubleObject(), "rotate", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Offset(), ecorePackage.getEInt(), "offset", null, 0, 2, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_MinMargin(), ecorePackage.getEDoubleObject(), "minMargin", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Overflow(), this.getOverflow(), "overflow", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Silent(), ecorePackage.getEBooleanObject(), "silent", "true", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Precision(), ecorePackage.getEDoubleObject(), "precision", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_ValueAnimation(), ecorePackage.getEBooleanObject(), "valueAnimation", "true", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_Rich(), this.getTextStyleEntry(), null, "rich", null, 0, -1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLabel__CreateSeriesLabelOption(), this.getSeriesLabelOption(), "createSeriesLabelOption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getLabel__CreateSeriesLineLabelOption(), this.getSeriesLineLabelOption(), "createSeriesLineLabelOption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(textStyleEntryEClass, Map.Entry.class, "TextStyleEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextStyleEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTextStyleEntry_Value(), this.getTextStyle(), null, "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Disabled(), ecorePackage.getEBooleanObject(), "disabled", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Label(), this.getLabel(), null, "label", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemStateEClass, ItemState.class, "ItemState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemState_ItemStyle(), this.getItemStyle(), null, "itemStyle", null, 0, 1, ItemState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getItemState__CreateGraphNodeStateOption(), this.getGraphNodeStateOption(), "createGraphNodeStateOption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(lineStateEClass, LineState.class, "LineState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineState_LineStyle(), this.getLineStyle(), null, "lineStyle", null, 0, 1, LineState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getLineState__CreateGraphEdgeStateOption(), this.getGraphEdgeStateOption(), "createGraphEdgeStateOption", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tooltipEClass, Tooltip.class, "Tooltip", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTooltip_Position(), ecorePackage.getEString(), "position", null, 0, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTooltip_Formatter(), ecorePackage.getEString(), "formatter", null, 0, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTooltip_ValueFormatter(), ecorePackage.getEString(), "valueFormatter", null, 0, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTooltip_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTooltip_BorderColor(), ecorePackage.getEString(), "borderColor", null, 0, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTooltip_BorderWidth(), ecorePackage.getEIntegerObject(), "borderWidth", null, 0, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTooltip_Padding(), ecorePackage.getEIntegerObject(), "padding", null, 0, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTooltip_TextStyle(), this.getTextStyle(), null, "textStyle", null, 0, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTooltip_ExtraCssText(), ecorePackage.getEString(), "extraCssText", null, 0, 1, Tooltip.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(borderTypeEEnum, BorderType.class, "BorderType");
		addEEnumLiteral(borderTypeEEnum, BorderType.SOLID);
		addEEnumLiteral(borderTypeEEnum, BorderType.DASHED);
		addEEnumLiteral(borderTypeEEnum, BorderType.DOTTED);

		initEEnum(borderCapEEnum, BorderCap.class, "BorderCap");
		addEEnumLiteral(borderCapEEnum, BorderCap.BUTT);
		addEEnumLiteral(borderCapEEnum, BorderCap.ROUND);
		addEEnumLiteral(borderCapEEnum, BorderCap.SQUARE);

		initEEnum(borderJoinEEnum, BorderJoin.class, "BorderJoin");
		addEEnumLiteral(borderJoinEEnum, BorderJoin.BEVEL);
		addEEnumLiteral(borderJoinEEnum, BorderJoin.ROUND);
		addEEnumLiteral(borderJoinEEnum, BorderJoin.MITER);

		initEEnum(labelPositionEEnum, LabelPosition.class, "LabelPosition");
		addEEnumLiteral(labelPositionEEnum, LabelPosition.TOP);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.LEFT);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.RIGHT);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.BOTTOM);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.INSIDE);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.INSIDE_LEFT);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.INSIDE_RIGHT);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.INSIDE_TOP);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.INSIDE_BOTTOM);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.INSIDE_TOP_LEFT);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.INSIDE_BOTTOM_LEFT);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.INSIDE_TOP_RIGHT);
		addEEnumLiteral(labelPositionEEnum, LabelPosition.INSIDE_BOTTOM_RIGHT);

		initEEnum(fontStyleEEnum, FontStyle.class, "FontStyle");
		addEEnumLiteral(fontStyleEEnum, FontStyle.NORMAL);
		addEEnumLiteral(fontStyleEEnum, FontStyle.ITALIC);
		addEEnumLiteral(fontStyleEEnum, FontStyle.OBLIQUE);

		initEEnum(fontWeightEEnum, FontWeight.class, "FontWeight");
		addEEnumLiteral(fontWeightEEnum, FontWeight.NORMAL);
		addEEnumLiteral(fontWeightEEnum, FontWeight.BOLD);
		addEEnumLiteral(fontWeightEEnum, FontWeight.BOLDER);
		addEEnumLiteral(fontWeightEEnum, FontWeight.LIGHTER);

		initEEnum(alignEEnum, Align.class, "Align");
		addEEnumLiteral(alignEEnum, Align.LEFT);
		addEEnumLiteral(alignEEnum, Align.CENTER);
		addEEnumLiteral(alignEEnum, Align.RIGHT);

		initEEnum(verticalAlignEEnum, VerticalAlign.class, "VerticalAlign");
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.TOP);
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.MIDDLE);
		addEEnumLiteral(verticalAlignEEnum, VerticalAlign.BOTTOM);

		initEEnum(overflowEEnum, Overflow.class, "Overflow");
		addEEnumLiteral(overflowEEnum, Overflow.TRUNCATE);
		addEEnumLiteral(overflowEEnum, Overflow.BREAK);
		addEEnumLiteral(overflowEEnum, Overflow.BREAK_ALL);

		// Initialize data types
		initEDataType(graphSeriesEDataType, GraphSeries.class, "GraphSeries", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(graphNodeItemEDataType, GraphNodeItem.class, "GraphNodeItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(graphEdgeItemEDataType, GraphEdgeItem.class, "GraphEdgeItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(graphCategoryItemEDataType, GraphCategoryItem.class, "GraphCategoryItem", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(itemStyleOptionEDataType, ItemStyleOption.class, "ItemStyleOption", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(graphEdgeLineStyleOptionEDataType, GraphEdgeLineStyleOption.class, "GraphEdgeLineStyleOption", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(seriesLabelOptionEDataType, SeriesLabelOption.class, "SeriesLabelOption", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(seriesLineLabelOptionEDataType, SeriesLineLabelOption.class, "SeriesLineLabelOption", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(graphNodeStateOptionEDataType, GraphNodeStateOption.class, "GraphNodeStateOption", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(graphEdgeStateOptionEDataType, GraphEdgeStateOption.class, "GraphEdgeStateOption", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// urn:org.nasdankia
		createUrnorgAnnotations();
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
	}

	/**
	 * Initializes the annotations for <b>urn:org.nasdankia</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUrnorgAnnotations() {
		String source = "urn:org.nasdankia";
		addAnnotation
		  (this,
		   source,
		   new String[] {
			   "load-key", "echarts-graph"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";
		addAnnotation
		  (getGraph__ConfigureGraphSeries__GraphSeries(),
		   source,
		   new String[] {
			   "documentation", "Sets data, links, and categories"
		   });
		addAnnotation
		  (getItem_Emphasis(),
		   source,
		   new String[] {
			   "documentation", "Emphasis state of specified node."
		   });
		addAnnotation
		  (getItem_Blur(),
		   source,
		   new String[] {
			   "documentation", "Blur state of specified node."
		   });
		addAnnotation
		  (getItem_Select(),
		   source,
		   new String[] {
			   "documentation", "Select state of specified node."
		   });
		addAnnotation
		  (getLink_Emphasis(),
		   source,
		   new String[] {
			   "documentation", "Emphasis state of specified node."
		   });
		addAnnotation
		  (getLink_Blur(),
		   source,
		   new String[] {
			   "documentation", "Blur state of specified node."
		   });
		addAnnotation
		  (getLink_Select(),
		   source,
		   new String[] {
			   "documentation", "Select state of specified node."
		   });
		addAnnotation
		  (getLink_Symbol(),
		   source,
		   new String[] {
			   "documentation", "Symbol of edge ends. Can be an array with two item to specify two ends, or a string specifies both ends."
		   });
		addAnnotation
		  (getLink_SymbolSize(),
		   source,
		   new String[] {
			   "documentation", "Symbol size of edge ends. Can be an array with two item to specify two ends, or a string specifies both ends."
		   });
		addAnnotation
		  (getLink_IgnoreForceLayout(),
		   source,
		   new String[] {
			   "documentation", "Prevent this edge from force layout calculating."
		   });
		addAnnotation
		  (getTextStyle_FontStyle(),
		   source,
		   new String[] {
			   "documentation", "Font style"
		   });
		addAnnotation
		  (getTextStyle_FontWeight(),
		   source,
		   new String[] {
			   "documentation", "Font weight"
		   });
		addAnnotation
		  (getTextStyle_FontFamily(),
		   source,
		   new String[] {
			   "documentation", "Whether to show label"
		   });
		addAnnotation
		  (getTextStyle_FontSize(),
		   source,
		   new String[] {
			   "documentation", "Font size"
		   });
		addAnnotation
		  (getTextStyle_Align(),
		   source,
		   new String[] {
			   "documentation", "Horizontal alignment of text, automatic by default."
		   });
		addAnnotation
		  (getTextStyle_VerticalAlign(),
		   source,
		   new String[] {
			   "documentation", "Vertical alignment of text, automatic by default."
		   });
		addAnnotation
		  (getTextStyle_LineHeight(),
		   source,
		   new String[] {
			   "documentation", "Line height of the text fragment."
		   });
		addAnnotation
		  (getTextStyle_BackgroundColor(),
		   source,
		   new String[] {
			   "documentation", "Background color of the text fragment."
		   });
		addAnnotation
		  (getTextStyle_BorderColor(),
		   source,
		   new String[] {
			   "documentation", "Border color of the text fragment."
		   });
		addAnnotation
		  (getTextStyle_BorderWidth(),
		   source,
		   new String[] {
			   "documentation", "Border width of the text fragment."
		   });
		addAnnotation
		  (getTextStyle_BorderType(),
		   source,
		   new String[] {
			   "documentation", "The text fragment border type."
		   });
		addAnnotation
		  (getTextStyle_BorderDashOffset(),
		   source,
		   new String[] {
			   "documentation", "To set the line dash offset. "
		   });
		addAnnotation
		  (getTextStyle_BorderRadius(),
		   source,
		   new String[] {
			   "documentation", "Border radius of the text fragment."
		   });
		addAnnotation
		  (getTextStyle_Padding(),
		   source,
		   new String[] {
			   "documentation", "Padding of the text fragment."
		   });
		addAnnotation
		  (getTextStyle_Width(),
		   source,
		   new String[] {
			   "documentation", "Width of text block."
		   });
		addAnnotation
		  (getTextStyle_Height(),
		   source,
		   new String[] {
			   "documentation", "Height of text block."
		   });
		addAnnotation
		  (getTextStyle_TextBorderColor(),
		   source,
		   new String[] {
			   "documentation", "Stroke color of the text."
		   });
		addAnnotation
		  (getTextStyle_TextBorderWidth(),
		   source,
		   new String[] {
			   "documentation", "Stroke line width of the text."
		   });
		addAnnotation
		  (getTextStyle_TextBorderType(),
		   source,
		   new String[] {
			   "documentation", "Stroke line type of the text."
		   });
		addAnnotation
		  (getTextStyle_TextBorderDashOffset(),
		   source,
		   new String[] {
			   "documentation", "To set the line dash offset."
		   });
		addAnnotation
		  (getTextStyle_TextShadowColor(),
		   source,
		   new String[] {
			   "documentation", "Shadow color of the text itself."
		   });
		addAnnotation
		  (getTextStyle_TextShadowBlur(),
		   source,
		   new String[] {
			   "documentation", "Shadow blue of the text itself."
		   });
		addAnnotation
		  (getTextStyle_TextShadowOffsetX(),
		   source,
		   new String[] {
			   "documentation", "Shadow X offset of the text itself."
		   });
		addAnnotation
		  (getTextStyle_TextShadowOffsetY(),
		   source,
		   new String[] {
			   "documentation", "Shadow Y offset of the text itself."
		   });
		addAnnotation
		  (getTextStyle_Tag(),
		   source,
		   new String[] {
			   "documentation", "Ellipsis to be displayed when overflow is set to truncate."
		   });
		addAnnotation
		  (getLabel_Show(),
		   source,
		   new String[] {
			   "documentation", "Whether to show label"
		   });
		addAnnotation
		  (getLabel_Position(),
		   source,
		   new String[] {
			   "documentation", "Label position"
		   });
		addAnnotation
		  (getLabel_Distance(),
		   source,
		   new String[] {
			   "documentation", "Distance to the host praphic element"
		   });
		addAnnotation
		  (getLabel_Rotate(),
		   source,
		   new String[] {
			   "documentation", "Rotate label, from -90 degree to 90, positive value represents rotate anti-clockwise."
		   });
		addAnnotation
		  (getLabel_Offset(),
		   source,
		   new String[] {
			   "documentation", "Whether to move text slightly. For example: [30, 40] means move 30 horizontally and move 40 vertically."
		   });
		addAnnotation
		  (getLabel_MinMargin(),
		   source,
		   new String[] {
			   "documentation", "Rotate label, from -90 degree to 90, positive value represents rotate anti-clockwise."
		   });
		addAnnotation
		  (getLabel_Overflow(),
		   source,
		   new String[] {
			   "documentation", "Determine how to display the text when it\'s overflow. "
		   });
		addAnnotation
		  (getLabel_Silent(),
		   source,
		   new String[] {
			   "documentation", "Whether to show label"
		   });
		addAnnotation
		  (getLabel_Precision(),
		   source,
		   new String[] {
			   "documentation", "Rotate label, from -90 degree to 90, positive value represents rotate anti-clockwise."
		   });
		addAnnotation
		  (getLabel_ValueAnimation(),
		   source,
		   new String[] {
			   "documentation", "Whether to show label"
		   });
		addAnnotation
		  (getLabel_Rich(),
		   source,
		   new String[] {
			   "documentation", "Whether to show label"
		   });
		addAnnotation
		  (getState_Disabled(),
		   source,
		   new String[] {
			   "documentation", "Whether to disable the state."
		   });
		addAnnotation
		  (getTooltip_Position(),
		   source,
		   new String[] {
			   "documentation", "The position of the tooltip\'s floating layer, which would follow the position of mouse by default."
		   });
		addAnnotation
		  (getTooltip_Formatter(),
		   source,
		   new String[] {
			   "documentation", "The content formatter of tooltip\'s floating layer which supports string template and callback function."
		   });
		addAnnotation
		  (getTooltip_ValueFormatter(),
		   source,
		   new String[] {
			   "documentation", "Callback function for formatting the value section in tooltip."
		   });
		addAnnotation
		  (getTooltip_BackgroundColor(),
		   source,
		   new String[] {
			   "documentation", "The background color of tooltip\'s floating layer."
		   });
		addAnnotation
		  (getTooltip_BorderColor(),
		   source,
		   new String[] {
			   "documentation", "The border color of tooltip\'s floating layer."
		   });
		addAnnotation
		  (getTooltip_BorderWidth(),
		   source,
		   new String[] {
			   "documentation", "The border width of tooltip\'s floating layer."
		   });
		addAnnotation
		  (getTooltip_Padding(),
		   source,
		   new String[] {
			   "documentation", "The floating layer of tooltip space around content. The unit is px. Default values for each position are 5. And they can be set to different values with left, right, top, and bottom."
		   });
		addAnnotation
		  (getTooltip_TextStyle(),
		   source,
		   new String[] {
			   "documentation", "The text style of tooltip\'s floating layer."
		   });
		addAnnotation
		  (getTooltip_ExtraCssText(),
		   source,
		   new String[] {
			   "documentation", "Extra CSS style for floating layer."
		   });
	}

} //GraphPackageImpl

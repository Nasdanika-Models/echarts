/**
 */
package org.nasdanika.models.echarts.graph.impl;

import java.util.Map;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

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
	private EClass styleEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEntryEClass = null;

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
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Y() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_OutgoingLinks() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_IncomingLinks() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Category() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Fixed() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNode_Value() {
		return (EAttribute)nodeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNode_Tooltip() {
		return (EReference)nodeEClass.getEStructuralFeatures().get(7);
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
	public EClass getLink() {
		return linkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Source() {
		return (EReference)linkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Target() {
		return (EReference)linkEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Value() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_LineStyle() {
		return (EReference)linkEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Label() {
		return (EReference)linkEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Emphasis() {
		return (EReference)linkEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Blur() {
		return (EReference)linkEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLink_Select() {
		return (EReference)linkEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_Symbol() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_SymbolSize() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLink_IgnoreForceLayout() {
		return (EAttribute)linkEClass.getEStructuralFeatures().get(10);
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
	public EClass getTextStyle() {
		return textStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Color() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_FontStyle() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_FontWeight() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_FontFamily() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_FontSize() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_LineHeight() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Width() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Height() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextBorderColor() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextBorderWidth() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextBorderType() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextBorderDashOffset() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextShadowColor() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextShadowBlur() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextShadowOffsetX() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_TextShadowOffsetY() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Overflow() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTextStyle_Ellipsis() {
		return (EAttribute)textStyleEClass.getEStructuralFeatures().get(17);
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
	public EAttribute getLabel_Show() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Position() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Distance() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Rotate() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Offset() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Align() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_VerticalAlign() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_BackgroundColor() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_BorderColor() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_BorderWidth() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_BorderType() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_BorderDashOffset() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_BorderRadius() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_Padding() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_ShadowColor() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_ShadowBlur() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_ShadowOffsetX() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLabel_ShadowOffsetY() {
		return (EAttribute)labelEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLabel_Rich() {
		return (EReference)labelEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStyleEntry() {
		return styleEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStyleEntry_Key() {
		return (EAttribute)styleEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getStyleEntry_Value() {
		return (EReference)styleEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringEntry() {
		return stringEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringEntry_Key() {
		return (EAttribute)stringEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringEntry_Value() {
		return (EAttribute)stringEntryEClass.getEStructuralFeatures().get(1);
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

		nodeEClass = createEClass(NODE);
		createEAttribute(nodeEClass, NODE__X);
		createEAttribute(nodeEClass, NODE__Y);
		createEReference(nodeEClass, NODE__OUTGOING_LINKS);
		createEReference(nodeEClass, NODE__INCOMING_LINKS);
		createEReference(nodeEClass, NODE__CATEGORY);
		createEAttribute(nodeEClass, NODE__FIXED);
		createEAttribute(nodeEClass, NODE__VALUE);
		createEReference(nodeEClass, NODE__TOOLTIP);

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

		itemStyleEClass = createEClass(ITEM_STYLE);
		createEReference(itemStyleEClass, ITEM_STYLE__BORDER_STYLE);

		linkEClass = createEClass(LINK);
		createEReference(linkEClass, LINK__SOURCE);
		createEReference(linkEClass, LINK__TARGET);
		createEAttribute(linkEClass, LINK__VALUE);
		createEReference(linkEClass, LINK__LINE_STYLE);
		createEReference(linkEClass, LINK__LABEL);
		createEReference(linkEClass, LINK__EMPHASIS);
		createEReference(linkEClass, LINK__BLUR);
		createEReference(linkEClass, LINK__SELECT);
		createEAttribute(linkEClass, LINK__SYMBOL);
		createEAttribute(linkEClass, LINK__SYMBOL_SIZE);
		createEAttribute(linkEClass, LINK__IGNORE_FORCE_LAYOUT);

		textStyleEClass = createEClass(TEXT_STYLE);
		createEAttribute(textStyleEClass, TEXT_STYLE__COLOR);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_STYLE);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_WEIGHT);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_FAMILY);
		createEAttribute(textStyleEClass, TEXT_STYLE__FONT_SIZE);
		createEAttribute(textStyleEClass, TEXT_STYLE__LINE_HEIGHT);
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
		createEAttribute(textStyleEClass, TEXT_STYLE__OVERFLOW);
		createEAttribute(textStyleEClass, TEXT_STYLE__ELLIPSIS);

		labelEClass = createEClass(LABEL);
		createEAttribute(labelEClass, LABEL__SHOW);
		createEAttribute(labelEClass, LABEL__POSITION);
		createEAttribute(labelEClass, LABEL__DISTANCE);
		createEAttribute(labelEClass, LABEL__ROTATE);
		createEAttribute(labelEClass, LABEL__OFFSET);
		createEAttribute(labelEClass, LABEL__ALIGN);
		createEAttribute(labelEClass, LABEL__VERTICAL_ALIGN);
		createEAttribute(labelEClass, LABEL__BACKGROUND_COLOR);
		createEAttribute(labelEClass, LABEL__BORDER_COLOR);
		createEAttribute(labelEClass, LABEL__BORDER_WIDTH);
		createEAttribute(labelEClass, LABEL__BORDER_TYPE);
		createEAttribute(labelEClass, LABEL__BORDER_DASH_OFFSET);
		createEAttribute(labelEClass, LABEL__BORDER_RADIUS);
		createEAttribute(labelEClass, LABEL__PADDING);
		createEAttribute(labelEClass, LABEL__SHADOW_COLOR);
		createEAttribute(labelEClass, LABEL__SHADOW_BLUR);
		createEAttribute(labelEClass, LABEL__SHADOW_OFFSET_X);
		createEAttribute(labelEClass, LABEL__SHADOW_OFFSET_Y);
		createEReference(labelEClass, LABEL__RICH);

		styleEntryEClass = createEClass(STYLE_ENTRY);
		createEAttribute(styleEntryEClass, STYLE_ENTRY__KEY);
		createEReference(styleEntryEClass, STYLE_ENTRY__VALUE);

		stringEntryEClass = createEClass(STRING_ENTRY);
		createEAttribute(stringEntryEClass, STRING_ENTRY__KEY);
		createEAttribute(stringEntryEClass, STRING_ENTRY__VALUE);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__DISABLED);
		createEReference(stateEClass, STATE__LABEL);

		itemStateEClass = createEClass(ITEM_STATE);
		createEReference(itemStateEClass, ITEM_STATE__ITEM_STYLE);

		lineStateEClass = createEClass(LINE_STATE);
		createEReference(lineStateEClass, LINE_STATE__LINE_STYLE);

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
		labelEClass.getESuperTypes().add(this.getTextStyle());
		itemStateEClass.getESuperTypes().add(this.getState());
		lineStateEClass.getESuperTypes().add(this.getState());

		// Initialize classes, features, and operations; add parameters
		initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGraph_Nodes(), this.getNode(), null, "nodes", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGraph_Categories(), this.getItem(), null, "categories", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemEClass, Item.class, "Item", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getItem_Name(), ecorePackage.getEString(), "name", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_SymbolSize(), ecorePackage.getEDouble(), "symbolSize", null, 0, 2, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_SymbolRotate(), ecorePackage.getEDoubleObject(), "symbolRotate", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_SymbolOffset(), ecorePackage.getEString(), "symbolOffset", null, 0, 2, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getItem_SymbolKeepAspect(), ecorePackage.getEBoolean(), "symbolKeepAspect", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_ItemStyle(), this.getItemStyle(), null, "itemStyle", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Label(), this.getLabel(), null, "label", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Emphasis(), this.getItemState(), null, "emphasis", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Blur(), this.getItemState(), null, "blur", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getItem_Select(), this.getItemState(), null, "select", null, 0, 1, Item.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(nodeEClass, Node.class, "Node", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNode_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_OutgoingLinks(), this.getLink(), this.getLink_Source(), "outgoingLinks", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_IncomingLinks(), this.getLink(), this.getLink_Target(), "incomingLinks", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Category(), this.getItem(), null, "category", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Fixed(), ecorePackage.getEBoolean(), "fixed", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNode_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, -1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNode_Tooltip(), this.getTooltip(), null, "tooltip", null, 0, 1, Node.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleEClass, Style.class, "Style", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_ShadowBlur(), ecorePackage.getEInt(), "shadowBlur", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_ShadowColor(), ecorePackage.getEString(), "shadowColor", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_ShadowOffsetX(), ecorePackage.getEDoubleObject(), "shadowOffsetX", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_ShadowOffsetY(), ecorePackage.getEDoubleObject(), "shadowOffsetY", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyle_Opacity(), ecorePackage.getEDouble(), "opacity", null, 0, 1, Style.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineStyleEClass, LineStyle.class, "LineStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineStyle_Width(), ecorePackage.getEInt(), "width", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_Type(), this.getBorderType(), "type", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_DashOffset(), ecorePackage.getEInt(), "dashOffset", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_Cap(), this.getBorderCap(), "cap", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_Join(), this.getBorderJoin(), "join", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_MiterLimit(), ecorePackage.getEInt(), "miterLimit", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineStyle_Curveness(), ecorePackage.getEDoubleObject(), "curveness", null, 0, 1, LineStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemStyleEClass, ItemStyle.class, "ItemStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemStyle_BorderStyle(), this.getLineStyle(), null, "borderStyle", null, 0, 1, ItemStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLink_Source(), this.getNode(), this.getNode_OutgoingLinks(), "source", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Target(), this.getNode(), this.getNode_IncomingLinks(), "target", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, -1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_LineStyle(), this.getLineStyle(), null, "lineStyle", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Label(), this.getLabel(), null, "label", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Emphasis(), this.getLineState(), null, "emphasis", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Blur(), this.getLineState(), null, "blur", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLink_Select(), this.getLineState(), null, "select", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 2, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_SymbolSize(), ecorePackage.getEString(), "symbolSize", null, 0, 2, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLink_IgnoreForceLayout(), ecorePackage.getEBoolean(), "ignoreForceLayout", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(textStyleEClass, TextStyle.class, "TextStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTextStyle_Color(), ecorePackage.getEString(), "color", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontStyle(), this.getFontStyle(), "fontStyle", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontWeight(), this.getFontWeight(), "fontWeight", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontFamily(), ecorePackage.getEString(), "fontFamily", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_FontSize(), ecorePackage.getEIntegerObject(), "fontSize", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_LineHeight(), ecorePackage.getEIntegerObject(), "lineHeight", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
		initEAttribute(getTextStyle_Overflow(), this.getOverflow(), "overflow", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTextStyle_Ellipsis(), ecorePackage.getEString(), "ellipsis", null, 0, 1, TextStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLabel_Show(), ecorePackage.getEBoolean(), "show", "true", 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Position(), this.getLabelPosition(), "position", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Distance(), ecorePackage.getEIntegerObject(), "distance", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Rotate(), ecorePackage.getEDoubleObject(), "rotate", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Offset(), ecorePackage.getEInt(), "offset", null, 0, 2, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Align(), this.getAlign(), "align", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_VerticalAlign(), this.getVerticalAlign(), "verticalAlign", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_BackgroundColor(), ecorePackage.getEString(), "backgroundColor", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_BorderColor(), ecorePackage.getEString(), "borderColor", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_BorderWidth(), ecorePackage.getEIntegerObject(), "borderWidth", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_BorderType(), this.getBorderType(), "borderType", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_BorderDashOffset(), ecorePackage.getEIntegerObject(), "borderDashOffset", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_BorderRadius(), ecorePackage.getEIntegerObject(), "borderRadius", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_Padding(), ecorePackage.getEInt(), "padding", null, 0, 4, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_ShadowColor(), ecorePackage.getEString(), "shadowColor", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_ShadowBlur(), ecorePackage.getEBigDecimal(), "shadowBlur", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_ShadowOffsetX(), ecorePackage.getEIntegerObject(), "shadowOffsetX", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLabel_ShadowOffsetY(), ecorePackage.getEIntegerObject(), "shadowOffsetY", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLabel_Rich(), this.getStyleEntry(), null, "rich", null, 0, -1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styleEntryEClass, Map.Entry.class, "StyleEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStyleEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyleEntry_Value(), this.getStringEntry(), null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringEntryEClass, Map.Entry.class, "StringEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringEntry_Key(), ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringEntry_Value(), ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_Disabled(), ecorePackage.getEBooleanObject(), "disabled", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Label(), this.getLabel(), null, "label", null, 0, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemStateEClass, ItemState.class, "ItemState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemState_ItemStyle(), this.getItemStyle(), null, "itemStyle", null, 0, 1, ItemState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineStateEClass, LineState.class, "LineState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLineState_LineStyle(), this.getLineStyle(), null, "lineStyle", null, 0, 1, LineState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
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
		  (getNode_Tooltip(),
		   source,
		   new String[] {
			   "documentation", "Emphasis state of specified node."
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
		  (getTextStyle_Color(),
		   source,
		   new String[] {
			   "documentation", "Text color. If set as \'inherit\', the color will assigned as visual color, such as series color."
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
		  (getTextStyle_LineHeight(),
		   source,
		   new String[] {
			   "documentation", "Line height of the text fragment."
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
		  (getTextStyle_Overflow(),
		   source,
		   new String[] {
			   "documentation", "Determine how to display the text when it\'s overflow. "
		   });
		addAnnotation
		  (getTextStyle_Ellipsis(),
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
		  (getLabel_Align(),
		   source,
		   new String[] {
			   "documentation", "Horizontal alignment of text, automatic by default."
		   });
		addAnnotation
		  (getLabel_VerticalAlign(),
		   source,
		   new String[] {
			   "documentation", "Vertical alignment of text, automatic by default."
		   });
		addAnnotation
		  (getLabel_BackgroundColor(),
		   source,
		   new String[] {
			   "documentation", "Background color of the text fragment."
		   });
		addAnnotation
		  (getLabel_BorderColor(),
		   source,
		   new String[] {
			   "documentation", "Border color of the text fragment."
		   });
		addAnnotation
		  (getLabel_BorderWidth(),
		   source,
		   new String[] {
			   "documentation", "Border width of the text fragment."
		   });
		addAnnotation
		  (getLabel_BorderType(),
		   source,
		   new String[] {
			   "documentation", "The text fragment border type."
		   });
		addAnnotation
		  (getLabel_BorderDashOffset(),
		   source,
		   new String[] {
			   "documentation", "To set the line dash offset. "
		   });
		addAnnotation
		  (getLabel_BorderRadius(),
		   source,
		   new String[] {
			   "documentation", "Border radius of the text fragment."
		   });
		addAnnotation
		  (getLabel_Padding(),
		   source,
		   new String[] {
			   "documentation", "Padding of the text fragment."
		   });
		addAnnotation
		  (getLabel_ShadowColor(),
		   source,
		   new String[] {
			   "documentation", "Shadow color of the text block."
		   });
		addAnnotation
		  (getLabel_ShadowBlur(),
		   source,
		   new String[] {
			   "documentation", "Show blur of the text block."
		   });
		addAnnotation
		  (getLabel_ShadowOffsetX(),
		   source,
		   new String[] {
			   "documentation", "Shadow X offset of the text block."
		   });
		addAnnotation
		  (getLabel_ShadowOffsetY(),
		   source,
		   new String[] {
			   "documentation", "Shadow Y offset of the text block."
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

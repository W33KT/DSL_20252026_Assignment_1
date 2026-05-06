/**
 */
package laBouR.impl;

import laBouR.Circle;
import laBouR.Colors;
import laBouR.Corner;
import laBouR.End_hold;
import laBouR.ExtrusionPoint;
import laBouR.GridBasePointer;
import laBouR.LaBouRFactory;
import laBouR.LaBouRPackage;
import laBouR.Label;
import laBouR.Route;
import laBouR.RouteStep;
import laBouR.Shape;
import laBouR.SingleStep;
import laBouR.SplitStep;
import laBouR.Start_hold;
import laBouR.Triangle;
import laBouR.Volume;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaBouRPackageImpl extends EPackageImpl implements LaBouRPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boulderingWallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass holdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeEClass = null;

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
	private EClass start_holdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass end_holdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass triangleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cornerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extrusionPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass volumeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gridBasePointerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass routeStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass splitStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum colorsEEnum = null;

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
	 * @see laBouR.LaBouRPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LaBouRPackageImpl() {
		super(eNS_URI, LaBouRFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link LaBouRPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LaBouRPackage init() {
		if (isInited)
			return (LaBouRPackage) EPackage.Registry.INSTANCE.getEPackage(LaBouRPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLaBouRPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LaBouRPackageImpl theLaBouRPackage = registeredLaBouRPackage instanceof LaBouRPackageImpl
				? (LaBouRPackageImpl) registeredLaBouRPackage
				: new LaBouRPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLaBouRPackage.createPackageContents();

		// Initialize created meta-data
		theLaBouRPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLaBouRPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LaBouRPackage.eNS_URI, theLaBouRPackage);
		return theLaBouRPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBoulderingWall() {
		return boulderingWallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBoulderingWall_ID() {
		return (EAttribute) boulderingWallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoulderingWall_Hold() {
		return (EReference) boulderingWallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoulderingWall_Route() {
		return (EReference) boulderingWallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBoulderingWall_Volume() {
		return (EReference) boulderingWallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getHold() {
		return holdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHold_ID() {
		return (EAttribute) holdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHold_X() {
		return (EAttribute) holdEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHold_Y() {
		return (EAttribute) holdEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHold_Color() {
		return (EAttribute) holdEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHold_Rotation() {
		return (EAttribute) holdEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getHold_Label() {
		return (EReference) holdEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getHold_Shape() {
		return (EAttribute) holdEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRoute() {
		return routeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoute_ID() {
		return (EAttribute) routeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRoute_Grade() {
		return (EAttribute) routeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoute_Gridbasepointer() {
		return (EReference) routeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRoute_Steps() {
		return (EReference) routeEClass.getEStructuralFeatures().get(3);
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
	public EClass getStart_hold() {
		return start_holdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStart_hold_Arg() {
		return (EAttribute) start_holdEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnd_hold() {
		return end_holdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCircle() {
		return circleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircle_X() {
		return (EAttribute) circleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircle_Y() {
		return (EAttribute) circleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircle_Radius() {
		return (EAttribute) circleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCircle_Depth() {
		return (EAttribute) circleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCircle_Front_holds() {
		return (EReference) circleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCircle_Side_holds() {
		return (EReference) circleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTriangle() {
		return triangleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriangle_X() {
		return (EAttribute) triangleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriangle_Y() {
		return (EAttribute) triangleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriangle_Corner() {
		return (EReference) triangleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriangle_Extrusionpoint() {
		return (EReference) triangleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTriangle_Depth() {
		return (EAttribute) triangleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriangle_Left_holds() {
		return (EReference) triangleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriangle_Right_holds() {
		return (EReference) triangleEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTriangle_Bottom_holds() {
		return (EReference) triangleEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCorner() {
		return cornerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorner_Y() {
		return (EAttribute) cornerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCorner_X() {
		return (EAttribute) cornerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtrusionPoint() {
		return extrusionPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtrusionPoint_X() {
		return (EAttribute) extrusionPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtrusionPoint_Y() {
		return (EAttribute) extrusionPointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVolume() {
		return volumeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getVolume_Shape() {
		return (EReference) volumeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGridBasePointer() {
		return gridBasePointerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridBasePointer_X() {
		return (EAttribute) gridBasePointerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGridBasePointer_Y() {
		return (EAttribute) gridBasePointerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRouteStep() {
		return routeStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSplitStep() {
		return splitStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSplitStep_Left() {
		return (EReference) splitStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSplitStep_Right() {
		return (EReference) splitStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleStep() {
		return singleStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleStep_Hold() {
		return (EReference) singleStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getColors() {
		return colorsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LaBouRFactory getLaBouRFactory() {
		return (LaBouRFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		boulderingWallEClass = createEClass(BOULDERING_WALL);
		createEAttribute(boulderingWallEClass, BOULDERING_WALL__ID);
		createEReference(boulderingWallEClass, BOULDERING_WALL__HOLD);
		createEReference(boulderingWallEClass, BOULDERING_WALL__ROUTE);
		createEReference(boulderingWallEClass, BOULDERING_WALL__VOLUME);

		holdEClass = createEClass(HOLD);
		createEAttribute(holdEClass, HOLD__ID);
		createEAttribute(holdEClass, HOLD__X);
		createEAttribute(holdEClass, HOLD__Y);
		createEAttribute(holdEClass, HOLD__COLOR);
		createEAttribute(holdEClass, HOLD__ROTATION);
		createEReference(holdEClass, HOLD__LABEL);
		createEAttribute(holdEClass, HOLD__SHAPE);

		routeEClass = createEClass(ROUTE);
		createEAttribute(routeEClass, ROUTE__ID);
		createEAttribute(routeEClass, ROUTE__GRADE);
		createEReference(routeEClass, ROUTE__GRIDBASEPOINTER);
		createEReference(routeEClass, ROUTE__STEPS);

		labelEClass = createEClass(LABEL);

		start_holdEClass = createEClass(START_HOLD);
		createEAttribute(start_holdEClass, START_HOLD__ARG);

		end_holdEClass = createEClass(END_HOLD);

		shapeEClass = createEClass(SHAPE);

		circleEClass = createEClass(CIRCLE);
		createEAttribute(circleEClass, CIRCLE__X);
		createEAttribute(circleEClass, CIRCLE__Y);
		createEAttribute(circleEClass, CIRCLE__RADIUS);
		createEAttribute(circleEClass, CIRCLE__DEPTH);
		createEReference(circleEClass, CIRCLE__FRONT_HOLDS);
		createEReference(circleEClass, CIRCLE__SIDE_HOLDS);

		triangleEClass = createEClass(TRIANGLE);
		createEAttribute(triangleEClass, TRIANGLE__X);
		createEAttribute(triangleEClass, TRIANGLE__Y);
		createEReference(triangleEClass, TRIANGLE__CORNER);
		createEReference(triangleEClass, TRIANGLE__EXTRUSIONPOINT);
		createEAttribute(triangleEClass, TRIANGLE__DEPTH);
		createEReference(triangleEClass, TRIANGLE__LEFT_HOLDS);
		createEReference(triangleEClass, TRIANGLE__RIGHT_HOLDS);
		createEReference(triangleEClass, TRIANGLE__BOTTOM_HOLDS);

		cornerEClass = createEClass(CORNER);
		createEAttribute(cornerEClass, CORNER__Y);
		createEAttribute(cornerEClass, CORNER__X);

		extrusionPointEClass = createEClass(EXTRUSION_POINT);
		createEAttribute(extrusionPointEClass, EXTRUSION_POINT__X);
		createEAttribute(extrusionPointEClass, EXTRUSION_POINT__Y);

		volumeEClass = createEClass(VOLUME);
		createEReference(volumeEClass, VOLUME__SHAPE);

		gridBasePointerEClass = createEClass(GRID_BASE_POINTER);
		createEAttribute(gridBasePointerEClass, GRID_BASE_POINTER__X);
		createEAttribute(gridBasePointerEClass, GRID_BASE_POINTER__Y);

		routeStepEClass = createEClass(ROUTE_STEP);

		splitStepEClass = createEClass(SPLIT_STEP);
		createEReference(splitStepEClass, SPLIT_STEP__LEFT);
		createEReference(splitStepEClass, SPLIT_STEP__RIGHT);

		singleStepEClass = createEClass(SINGLE_STEP);
		createEReference(singleStepEClass, SINGLE_STEP__HOLD);

		// Create enums
		colorsEEnum = createEEnum(COLORS);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		start_holdEClass.getESuperTypes().add(this.getLabel());
		end_holdEClass.getESuperTypes().add(this.getLabel());
		circleEClass.getESuperTypes().add(this.getShape());
		triangleEClass.getESuperTypes().add(this.getShape());
		splitStepEClass.getESuperTypes().add(this.getRouteStep());
		singleStepEClass.getESuperTypes().add(this.getRouteStep());

		// Initialize classes, features, and operations; add parameters
		initEClass(boulderingWallEClass, BoulderingWall.class, "BoulderingWall", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBoulderingWall_ID(), ecorePackage.getEString(), "ID", null, 1, 1, BoulderingWall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBoulderingWall_Hold(), this.getHold(), null, "hold", null, 0, -1, BoulderingWall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoulderingWall_Route(), this.getRoute(), null, "route", null, 0, -1, BoulderingWall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBoulderingWall_Volume(), this.getVolume(), null, "volume", null, 0, -1, BoulderingWall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(holdEClass, Hold.class, "Hold", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHold_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Hold.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHold_X(), ecorePackage.getEInt(), "x", null, 1, 1, Hold.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHold_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Hold.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHold_Color(), this.getColors(), "Color", null, 1, -1, Hold.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, !IS_ORDERED);
		initEAttribute(getHold_Rotation(), ecorePackage.getEIntegerObject(), "Rotation", null, 0, 1, Hold.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHold_Label(), this.getLabel(), null, "label", null, 0, 1, Hold.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getHold_Shape(), ecorePackage.getEString(), "shape", null, 0, 1, Hold.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(routeEClass, Route.class, "Route", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRoute_ID(), ecorePackage.getEString(), "ID", null, 1, 1, Route.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getRoute_Grade(), ecorePackage.getEString(), "Grade", null, 1, 1, Route.class, !IS_TRANSIENT,
				!IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getRoute_Gridbasepointer(), this.getGridBasePointer(), null, "gridbasepointer", null, 1, 1,
				Route.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRoute_Steps(), this.getRouteStep(), null, "steps", null, 1, -1, Route.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(labelEClass, Label.class, "Label", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(start_holdEClass, Start_hold.class, "Start_hold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStart_hold_Arg(), ecorePackage.getEInt(), "Arg", null, 1, 1, Start_hold.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(end_holdEClass, End_hold.class, "End_hold", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(shapeEClass, Shape.class, "Shape", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(circleEClass, Circle.class, "Circle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCircle_X(), ecorePackage.getEInt(), "x", null, 1, 1, Circle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCircle_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Circle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCircle_Radius(), ecorePackage.getEInt(), "Radius", null, 1, 1, Circle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCircle_Depth(), ecorePackage.getEInt(), "Depth", null, 1, 1, Circle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCircle_Front_holds(), this.getHold(), null, "front_holds", null, 0, -1, Circle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircle_Side_holds(), this.getHold(), null, "side_holds", null, 0, -1, Circle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(triangleEClass, Triangle.class, "Triangle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriangle_X(), ecorePackage.getEInt(), "x", null, 1, 1, Triangle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTriangle_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Triangle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTriangle_Corner(), this.getCorner(), null, "corner", null, 3, 3, Triangle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriangle_Extrusionpoint(), this.getExtrusionPoint(), null, "extrusionpoint", null, 1, 1,
				Triangle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriangle_Depth(), ecorePackage.getEInt(), "Depth", null, 1, 1, Triangle.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTriangle_Left_holds(), this.getHold(), null, "left_holds", null, 0, -1, Triangle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriangle_Right_holds(), this.getHold(), null, "right_holds", null, 0, -1, Triangle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTriangle_Bottom_holds(), this.getHold(), null, "bottom_holds", null, 0, -1, Triangle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cornerEClass, Corner.class, "Corner", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCorner_Y(), ecorePackage.getEInt(), "y", null, 1, 1, Corner.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCorner_X(), ecorePackage.getEInt(), "x", null, 1, 1, Corner.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(extrusionPointEClass, ExtrusionPoint.class, "ExtrusionPoint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtrusionPoint_X(), ecorePackage.getEInt(), "x", null, 1, 1, ExtrusionPoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getExtrusionPoint_Y(), ecorePackage.getEInt(), "y", null, 1, 1, ExtrusionPoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVolume_Shape(), this.getShape(), null, "shape", null, 1, 1, Volume.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(gridBasePointerEClass, GridBasePointer.class, "GridBasePointer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGridBasePointer_X(), ecorePackage.getEInt(), "x", null, 1, 1, GridBasePointer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);
		initEAttribute(getGridBasePointer_Y(), ecorePackage.getEInt(), "y", null, 1, 1, GridBasePointer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				!IS_ORDERED);

		initEClass(routeStepEClass, RouteStep.class, "RouteStep", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(splitStepEClass, SplitStep.class, "SplitStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSplitStep_Left(), this.getHold(), null, "left", null, 1, 1, SplitStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getSplitStep_Right(), this.getHold(), null, "right", null, 1, 1, SplitStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(singleStepEClass, SingleStep.class, "SingleStep", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleStep_Hold(), this.getHold(), null, "hold", null, 1, 1, SingleStep.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(colorsEEnum, Colors.class, "Colors");
		addEEnumLiteral(colorsEEnum, Colors.RED);
		addEEnumLiteral(colorsEEnum, Colors.GREEN);
		addEEnumLiteral(colorsEEnum, Colors.PURPLE);
		addEEnumLiteral(colorsEEnum, Colors.BLUE);
		addEEnumLiteral(colorsEEnum, Colors.WHITE);
		addEEnumLiteral(colorsEEnum, Colors.PINK);
		addEEnumLiteral(colorsEEnum, Colors.BLACK);
		addEEnumLiteral(colorsEEnum, Colors.YELLOW);
		addEEnumLiteral(colorsEEnum, Colors.ORANGE);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// DesignDecision
		createDesignDecisionAnnotations();
	}

	/**
	 * Initializes the annotations for <b>DesignDecision</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDesignDecisionAnnotations() {
		String source = "DesignDecision";
		addAnnotation(this, source, new String[] { "RouteBranching",
				"We used an abstract RouteStep with SingleStep and SplitStep subclasses to elegantly model the tree-like structure of sub-routes, avoiding complex graph validation." });
	}

} //LaBouRPackageImpl

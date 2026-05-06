/**
 */
package laBouR;

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
 * @see laBouR.LaBouRFactory
 * @model kind="package"
 *        annotation="DesignDecision RouteBranching='We used an abstract RouteStep with SingleStep and SplitStep subclasses to elegantly model the tree-like structure of sub-routes, avoiding complex graph validation.'"
 * @generated
 */
public interface LaBouRPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "laBouR";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/laBouR";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "laBouR";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaBouRPackage eINSTANCE = laBouR.impl.LaBouRPackageImpl.init();

	/**
	 * The meta object id for the '{@link laBouR.impl.BoulderingWallImpl <em>Bouldering Wall</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.BoulderingWallImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getBoulderingWall()
	 * @generated
	 */
	int BOULDERING_WALL = 0;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__ID = 0;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__HOLD = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL__VOLUME = 3;

	/**
	 * The number of structural features of the '<em>Bouldering Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Bouldering Wall</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOULDERING_WALL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.HoldImpl <em>Hold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.HoldImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getHold()
	 * @generated
	 */
	int HOLD = 1;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__ID = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__X = 1;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__Y = 2;

	/**
	 * The feature id for the '<em><b>Color</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__COLOR = 3;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__ROTATION = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__LABEL = 5;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD__SHAPE = 6;

	/**
	 * The number of structural features of the '<em>Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HOLD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.RouteImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ID = 0;

	/**
	 * The feature id for the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__GRADE = 1;

	/**
	 * The feature id for the '<em><b>Gridbasepointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__GRIDBASEPOINTER = 2;

	/**
	 * The feature id for the '<em><b>Steps</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__STEPS = 3;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.LabelImpl <em>Label</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.LabelImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getLabel()
	 * @generated
	 */
	int LABEL = 3;

	/**
	 * The number of structural features of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Label</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LABEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.Start_holdImpl <em>Start hold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.Start_holdImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getStart_hold()
	 * @generated
	 */
	int START_HOLD = 4;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_HOLD__ARG = LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Start hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_HOLD_FEATURE_COUNT = LABEL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Start hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_HOLD_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.End_holdImpl <em>End hold</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.End_holdImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getEnd_hold()
	 * @generated
	 */
	int END_HOLD = 5;

	/**
	 * The number of structural features of the '<em>End hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_HOLD_FEATURE_COUNT = LABEL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End hold</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_HOLD_OPERATION_COUNT = LABEL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.ShapeImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 6;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.CircleImpl <em>Circle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.CircleImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getCircle()
	 * @generated
	 */
	int CIRCLE = 7;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__X = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__Y = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__RADIUS = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__DEPTH = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Front holds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__FRONT_HOLDS = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Side holds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE__SIDE_HOLDS = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>Circle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.TriangleImpl <em>Triangle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.TriangleImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getTriangle()
	 * @generated
	 */
	int TRIANGLE = 8;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__X = SHAPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__Y = SHAPE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Corner</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__CORNER = SHAPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extrusionpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__EXTRUSIONPOINT = SHAPE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__DEPTH = SHAPE_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Left holds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__LEFT_HOLDS = SHAPE_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Right holds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__RIGHT_HOLDS = SHAPE_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Bottom holds</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE__BOTTOM_HOLDS = SHAPE_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_FEATURE_COUNT = SHAPE_FEATURE_COUNT + 8;

	/**
	 * The number of operations of the '<em>Triangle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIANGLE_OPERATION_COUNT = SHAPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.CornerImpl <em>Corner</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.CornerImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getCorner()
	 * @generated
	 */
	int CORNER = 9;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__Y = 0;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER__X = 1;

	/**
	 * The number of structural features of the '<em>Corner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Corner</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CORNER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.ExtrusionPointImpl <em>Extrusion Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.ExtrusionPointImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getExtrusionPoint()
	 * @generated
	 */
	int EXTRUSION_POINT = 10;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUSION_POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUSION_POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Extrusion Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUSION_POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Extrusion Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXTRUSION_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.VolumeImpl <em>Volume</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.VolumeImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getVolume()
	 * @generated
	 */
	int VOLUME = 11;

	/**
	 * The feature id for the '<em><b>Shape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME__SHAPE = 0;

	/**
	 * The number of structural features of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Volume</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VOLUME_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.GridBasePointerImpl <em>Grid Base Pointer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.GridBasePointerImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getGridBasePointer()
	 * @generated
	 */
	int GRID_BASE_POINTER = 12;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BASE_POINTER__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BASE_POINTER__Y = 1;

	/**
	 * The number of structural features of the '<em>Grid Base Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BASE_POINTER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Grid Base Pointer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRID_BASE_POINTER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.RouteStepImpl <em>Route Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.RouteStepImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getRouteStep()
	 * @generated
	 */
	int ROUTE_STEP = 13;

	/**
	 * The number of structural features of the '<em>Route Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_STEP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Route Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_STEP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.SplitStepImpl <em>Split Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.SplitStepImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getSplitStep()
	 * @generated
	 */
	int SPLIT_STEP = 14;

	/**
	 * The feature id for the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP__LEFT = ROUTE_STEP_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP__RIGHT = ROUTE_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Split Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP_FEATURE_COUNT = ROUTE_STEP_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Split Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPLIT_STEP_OPERATION_COUNT = ROUTE_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link laBouR.impl.SingleStepImpl <em>Single Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.impl.SingleStepImpl
	 * @see laBouR.impl.LaBouRPackageImpl#getSingleStep()
	 * @generated
	 */
	int SINGLE_STEP = 15;

	/**
	 * The feature id for the '<em><b>Hold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_STEP__HOLD = ROUTE_STEP_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Single Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_STEP_FEATURE_COUNT = ROUTE_STEP_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Single Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_STEP_OPERATION_COUNT = ROUTE_STEP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link laBouR.Colors <em>Colors</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see laBouR.Colors
	 * @see laBouR.impl.LaBouRPackageImpl#getColors()
	 * @generated
	 */
	int COLORS = 16;

	/**
	 * Returns the meta object for class '{@link BoulderingWall <em>Bouldering Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bouldering Wall</em>'.
	 * @see BoulderingWall
	 * @model instanceClass="BoulderingWall"
	 * @generated
	 */
	EClass getBoulderingWall();

	/**
	 * Returns the meta object for the attribute '{@link BoulderingWall#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see BoulderingWall#getID()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EAttribute getBoulderingWall_ID();

	/**
	 * Returns the meta object for the containment reference list '{@link BoulderingWall#getHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hold</em>'.
	 * @see BoulderingWall#getHold()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EReference getBoulderingWall_Hold();

	/**
	 * Returns the meta object for the containment reference list '{@link BoulderingWall#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Route</em>'.
	 * @see BoulderingWall#getRoute()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EReference getBoulderingWall_Route();

	/**
	 * Returns the meta object for the containment reference list '{@link BoulderingWall#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Volume</em>'.
	 * @see BoulderingWall#getVolume()
	 * @see #getBoulderingWall()
	 * @generated
	 */
	EReference getBoulderingWall_Volume();

	/**
	 * Returns the meta object for class '{@link Hold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Hold</em>'.
	 * @see Hold
	 * @model instanceClass="Hold"
	 * @generated
	 */
	EClass getHold();

	/**
	 * Returns the meta object for the attribute '{@link Hold#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see Hold#getID()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_ID();

	/**
	 * Returns the meta object for the attribute '{@link Hold#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see Hold#getX()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_X();

	/**
	 * Returns the meta object for the attribute '{@link Hold#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see Hold#getY()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Y();

	/**
	 * Returns the meta object for the attribute list '{@link Hold#getColor <em>Color</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Color</em>'.
	 * @see Hold#getColor()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Color();

	/**
	 * Returns the meta object for the attribute '{@link Hold#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rotation</em>'.
	 * @see Hold#getRotation()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Rotation();

	/**
	 * Returns the meta object for the reference '{@link Hold#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Label</em>'.
	 * @see Hold#getLabel()
	 * @see #getHold()
	 * @generated
	 */
	EReference getHold_Label();

	/**
	 * Returns the meta object for the attribute '{@link Hold#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shape</em>'.
	 * @see Hold#getShape()
	 * @see #getHold()
	 * @generated
	 */
	EAttribute getHold_Shape();

	/**
	 * Returns the meta object for class '{@link laBouR.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see laBouR.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Route#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see laBouR.Route#getID()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_ID();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Route#getGrade <em>Grade</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grade</em>'.
	 * @see laBouR.Route#getGrade()
	 * @see #getRoute()
	 * @generated
	 */
	EAttribute getRoute_Grade();

	/**
	 * Returns the meta object for the reference '{@link laBouR.Route#getGridbasepointer <em>Gridbasepointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Gridbasepointer</em>'.
	 * @see laBouR.Route#getGridbasepointer()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Gridbasepointer();

	/**
	 * Returns the meta object for the reference list '{@link laBouR.Route#getSteps <em>Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Steps</em>'.
	 * @see laBouR.Route#getSteps()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Steps();

	/**
	 * Returns the meta object for class '{@link laBouR.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Label</em>'.
	 * @see laBouR.Label
	 * @generated
	 */
	EClass getLabel();

	/**
	 * Returns the meta object for class '{@link laBouR.Start_hold <em>Start hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start hold</em>'.
	 * @see laBouR.Start_hold
	 * @generated
	 */
	EClass getStart_hold();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Start_hold#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arg</em>'.
	 * @see laBouR.Start_hold#getArg()
	 * @see #getStart_hold()
	 * @generated
	 */
	EAttribute getStart_hold_Arg();

	/**
	 * Returns the meta object for class '{@link laBouR.End_hold <em>End hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End hold</em>'.
	 * @see laBouR.End_hold
	 * @generated
	 */
	EClass getEnd_hold();

	/**
	 * Returns the meta object for class '{@link laBouR.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see laBouR.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for class '{@link laBouR.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circle</em>'.
	 * @see laBouR.Circle
	 * @generated
	 */
	EClass getCircle();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Circle#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see laBouR.Circle#getX()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_X();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Circle#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see laBouR.Circle#getY()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Y();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Circle#getRadius <em>Radius</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Radius</em>'.
	 * @see laBouR.Circle#getRadius()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Radius();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Circle#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see laBouR.Circle#getDepth()
	 * @see #getCircle()
	 * @generated
	 */
	EAttribute getCircle_Depth();

	/**
	 * Returns the meta object for the reference list '{@link laBouR.Circle#getFront_holds <em>Front holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Front holds</em>'.
	 * @see laBouR.Circle#getFront_holds()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_Front_holds();

	/**
	 * Returns the meta object for the reference list '{@link laBouR.Circle#getSide_holds <em>Side holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Side holds</em>'.
	 * @see laBouR.Circle#getSide_holds()
	 * @see #getCircle()
	 * @generated
	 */
	EReference getCircle_Side_holds();

	/**
	 * Returns the meta object for class '{@link laBouR.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Triangle</em>'.
	 * @see laBouR.Triangle
	 * @generated
	 */
	EClass getTriangle();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Triangle#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see laBouR.Triangle#getX()
	 * @see #getTriangle()
	 * @generated
	 */
	EAttribute getTriangle_X();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Triangle#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see laBouR.Triangle#getY()
	 * @see #getTriangle()
	 * @generated
	 */
	EAttribute getTriangle_Y();

	/**
	 * Returns the meta object for the reference list '{@link laBouR.Triangle#getCorner <em>Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Corner</em>'.
	 * @see laBouR.Triangle#getCorner()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Corner();

	/**
	 * Returns the meta object for the reference '{@link laBouR.Triangle#getExtrusionpoint <em>Extrusionpoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Extrusionpoint</em>'.
	 * @see laBouR.Triangle#getExtrusionpoint()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Extrusionpoint();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Triangle#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see laBouR.Triangle#getDepth()
	 * @see #getTriangle()
	 * @generated
	 */
	EAttribute getTriangle_Depth();

	/**
	 * Returns the meta object for the reference list '{@link laBouR.Triangle#getLeft_holds <em>Left holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Left holds</em>'.
	 * @see laBouR.Triangle#getLeft_holds()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Left_holds();

	/**
	 * Returns the meta object for the reference list '{@link laBouR.Triangle#getRight_holds <em>Right holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Right holds</em>'.
	 * @see laBouR.Triangle#getRight_holds()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Right_holds();

	/**
	 * Returns the meta object for the reference list '{@link laBouR.Triangle#getBottom_holds <em>Bottom holds</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Bottom holds</em>'.
	 * @see laBouR.Triangle#getBottom_holds()
	 * @see #getTriangle()
	 * @generated
	 */
	EReference getTriangle_Bottom_holds();

	/**
	 * Returns the meta object for class '{@link laBouR.Corner <em>Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Corner</em>'.
	 * @see laBouR.Corner
	 * @generated
	 */
	EClass getCorner();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Corner#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see laBouR.Corner#getY()
	 * @see #getCorner()
	 * @generated
	 */
	EAttribute getCorner_Y();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.Corner#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see laBouR.Corner#getX()
	 * @see #getCorner()
	 * @generated
	 */
	EAttribute getCorner_X();

	/**
	 * Returns the meta object for class '{@link laBouR.ExtrusionPoint <em>Extrusion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Extrusion Point</em>'.
	 * @see laBouR.ExtrusionPoint
	 * @generated
	 */
	EClass getExtrusionPoint();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.ExtrusionPoint#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see laBouR.ExtrusionPoint#getX()
	 * @see #getExtrusionPoint()
	 * @generated
	 */
	EAttribute getExtrusionPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.ExtrusionPoint#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see laBouR.ExtrusionPoint#getY()
	 * @see #getExtrusionPoint()
	 * @generated
	 */
	EAttribute getExtrusionPoint_Y();

	/**
	 * Returns the meta object for class '{@link laBouR.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Volume</em>'.
	 * @see laBouR.Volume
	 * @generated
	 */
	EClass getVolume();

	/**
	 * Returns the meta object for the reference '{@link laBouR.Volume#getShape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Shape</em>'.
	 * @see laBouR.Volume#getShape()
	 * @see #getVolume()
	 * @generated
	 */
	EReference getVolume_Shape();

	/**
	 * Returns the meta object for class '{@link laBouR.GridBasePointer <em>Grid Base Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grid Base Pointer</em>'.
	 * @see laBouR.GridBasePointer
	 * @generated
	 */
	EClass getGridBasePointer();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.GridBasePointer#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see laBouR.GridBasePointer#getX()
	 * @see #getGridBasePointer()
	 * @generated
	 */
	EAttribute getGridBasePointer_X();

	/**
	 * Returns the meta object for the attribute '{@link laBouR.GridBasePointer#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see laBouR.GridBasePointer#getY()
	 * @see #getGridBasePointer()
	 * @generated
	 */
	EAttribute getGridBasePointer_Y();

	/**
	 * Returns the meta object for class '{@link laBouR.RouteStep <em>Route Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route Step</em>'.
	 * @see laBouR.RouteStep
	 * @generated
	 */
	EClass getRouteStep();

	/**
	 * Returns the meta object for class '{@link laBouR.SplitStep <em>Split Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Split Step</em>'.
	 * @see laBouR.SplitStep
	 * @generated
	 */
	EClass getSplitStep();

	/**
	 * Returns the meta object for the reference '{@link laBouR.SplitStep#getLeft <em>Left</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Left</em>'.
	 * @see laBouR.SplitStep#getLeft()
	 * @see #getSplitStep()
	 * @generated
	 */
	EReference getSplitStep_Left();

	/**
	 * Returns the meta object for the reference '{@link laBouR.SplitStep#getRight <em>Right</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Right</em>'.
	 * @see laBouR.SplitStep#getRight()
	 * @see #getSplitStep()
	 * @generated
	 */
	EReference getSplitStep_Right();

	/**
	 * Returns the meta object for class '{@link laBouR.SingleStep <em>Single Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Step</em>'.
	 * @see laBouR.SingleStep
	 * @generated
	 */
	EClass getSingleStep();

	/**
	 * Returns the meta object for the reference '{@link laBouR.SingleStep#getHold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Hold</em>'.
	 * @see laBouR.SingleStep#getHold()
	 * @see #getSingleStep()
	 * @generated
	 */
	EReference getSingleStep_Hold();

	/**
	 * Returns the meta object for enum '{@link laBouR.Colors <em>Colors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Colors</em>'.
	 * @see laBouR.Colors
	 * @generated
	 */
	EEnum getColors();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	LaBouRFactory getLaBouRFactory();

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
		 * The meta object literal for the '{@link laBouR.impl.BoulderingWallImpl <em>Bouldering Wall</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.BoulderingWallImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getBoulderingWall()
		 * @generated
		 */
		EClass BOULDERING_WALL = eINSTANCE.getBoulderingWall();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOULDERING_WALL__ID = eINSTANCE.getBoulderingWall_ID();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOULDERING_WALL__HOLD = eINSTANCE.getBoulderingWall_Hold();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOULDERING_WALL__ROUTE = eINSTANCE.getBoulderingWall_Route();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOULDERING_WALL__VOLUME = eINSTANCE.getBoulderingWall_Volume();

		/**
		 * The meta object literal for the '{@link laBouR.impl.HoldImpl <em>Hold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.HoldImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getHold()
		 * @generated
		 */
		EClass HOLD = eINSTANCE.getHold();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__ID = eINSTANCE.getHold_ID();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__X = eINSTANCE.getHold_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__Y = eINSTANCE.getHold_Y();

		/**
		 * The meta object literal for the '<em><b>Color</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__COLOR = eINSTANCE.getHold_Color();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__ROTATION = eINSTANCE.getHold_Rotation();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HOLD__LABEL = eINSTANCE.getHold_Label();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HOLD__SHAPE = eINSTANCE.getHold_Shape();

		/**
		 * The meta object literal for the '{@link laBouR.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.RouteImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__ID = eINSTANCE.getRoute_ID();

		/**
		 * The meta object literal for the '<em><b>Grade</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROUTE__GRADE = eINSTANCE.getRoute_Grade();

		/**
		 * The meta object literal for the '<em><b>Gridbasepointer</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__GRIDBASEPOINTER = eINSTANCE.getRoute_Gridbasepointer();

		/**
		 * The meta object literal for the '<em><b>Steps</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__STEPS = eINSTANCE.getRoute_Steps();

		/**
		 * The meta object literal for the '{@link laBouR.impl.LabelImpl <em>Label</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.LabelImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getLabel()
		 * @generated
		 */
		EClass LABEL = eINSTANCE.getLabel();

		/**
		 * The meta object literal for the '{@link laBouR.impl.Start_holdImpl <em>Start hold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.Start_holdImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getStart_hold()
		 * @generated
		 */
		EClass START_HOLD = eINSTANCE.getStart_hold();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute START_HOLD__ARG = eINSTANCE.getStart_hold_Arg();

		/**
		 * The meta object literal for the '{@link laBouR.impl.End_holdImpl <em>End hold</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.End_holdImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getEnd_hold()
		 * @generated
		 */
		EClass END_HOLD = eINSTANCE.getEnd_hold();

		/**
		 * The meta object literal for the '{@link laBouR.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.ShapeImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link laBouR.impl.CircleImpl <em>Circle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.CircleImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getCircle()
		 * @generated
		 */
		EClass CIRCLE = eINSTANCE.getCircle();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__X = eINSTANCE.getCircle_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__Y = eINSTANCE.getCircle_Y();

		/**
		 * The meta object literal for the '<em><b>Radius</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__RADIUS = eINSTANCE.getCircle_Radius();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CIRCLE__DEPTH = eINSTANCE.getCircle_Depth();

		/**
		 * The meta object literal for the '<em><b>Front holds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__FRONT_HOLDS = eINSTANCE.getCircle_Front_holds();

		/**
		 * The meta object literal for the '<em><b>Side holds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCLE__SIDE_HOLDS = eINSTANCE.getCircle_Side_holds();

		/**
		 * The meta object literal for the '{@link laBouR.impl.TriangleImpl <em>Triangle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.TriangleImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getTriangle()
		 * @generated
		 */
		EClass TRIANGLE = eINSTANCE.getTriangle();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE__X = eINSTANCE.getTriangle_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE__Y = eINSTANCE.getTriangle_Y();

		/**
		 * The meta object literal for the '<em><b>Corner</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__CORNER = eINSTANCE.getTriangle_Corner();

		/**
		 * The meta object literal for the '<em><b>Extrusionpoint</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__EXTRUSIONPOINT = eINSTANCE.getTriangle_Extrusionpoint();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIANGLE__DEPTH = eINSTANCE.getTriangle_Depth();

		/**
		 * The meta object literal for the '<em><b>Left holds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__LEFT_HOLDS = eINSTANCE.getTriangle_Left_holds();

		/**
		 * The meta object literal for the '<em><b>Right holds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__RIGHT_HOLDS = eINSTANCE.getTriangle_Right_holds();

		/**
		 * The meta object literal for the '<em><b>Bottom holds</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIANGLE__BOTTOM_HOLDS = eINSTANCE.getTriangle_Bottom_holds();

		/**
		 * The meta object literal for the '{@link laBouR.impl.CornerImpl <em>Corner</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.CornerImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getCorner()
		 * @generated
		 */
		EClass CORNER = eINSTANCE.getCorner();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORNER__Y = eINSTANCE.getCorner_Y();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CORNER__X = eINSTANCE.getCorner_X();

		/**
		 * The meta object literal for the '{@link laBouR.impl.ExtrusionPointImpl <em>Extrusion Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.ExtrusionPointImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getExtrusionPoint()
		 * @generated
		 */
		EClass EXTRUSION_POINT = eINSTANCE.getExtrusionPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUSION_POINT__X = eINSTANCE.getExtrusionPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXTRUSION_POINT__Y = eINSTANCE.getExtrusionPoint_Y();

		/**
		 * The meta object literal for the '{@link laBouR.impl.VolumeImpl <em>Volume</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.VolumeImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getVolume()
		 * @generated
		 */
		EClass VOLUME = eINSTANCE.getVolume();

		/**
		 * The meta object literal for the '<em><b>Shape</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VOLUME__SHAPE = eINSTANCE.getVolume_Shape();

		/**
		 * The meta object literal for the '{@link laBouR.impl.GridBasePointerImpl <em>Grid Base Pointer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.GridBasePointerImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getGridBasePointer()
		 * @generated
		 */
		EClass GRID_BASE_POINTER = eINSTANCE.getGridBasePointer();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_BASE_POINTER__X = eINSTANCE.getGridBasePointer_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRID_BASE_POINTER__Y = eINSTANCE.getGridBasePointer_Y();

		/**
		 * The meta object literal for the '{@link laBouR.impl.RouteStepImpl <em>Route Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.RouteStepImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getRouteStep()
		 * @generated
		 */
		EClass ROUTE_STEP = eINSTANCE.getRouteStep();

		/**
		 * The meta object literal for the '{@link laBouR.impl.SplitStepImpl <em>Split Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.SplitStepImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getSplitStep()
		 * @generated
		 */
		EClass SPLIT_STEP = eINSTANCE.getSplitStep();

		/**
		 * The meta object literal for the '<em><b>Left</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_STEP__LEFT = eINSTANCE.getSplitStep_Left();

		/**
		 * The meta object literal for the '<em><b>Right</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPLIT_STEP__RIGHT = eINSTANCE.getSplitStep_Right();

		/**
		 * The meta object literal for the '{@link laBouR.impl.SingleStepImpl <em>Single Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.impl.SingleStepImpl
		 * @see laBouR.impl.LaBouRPackageImpl#getSingleStep()
		 * @generated
		 */
		EClass SINGLE_STEP = eINSTANCE.getSingleStep();

		/**
		 * The meta object literal for the '<em><b>Hold</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SINGLE_STEP__HOLD = eINSTANCE.getSingleStep_Hold();

		/**
		 * The meta object literal for the '{@link laBouR.Colors <em>Colors</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see laBouR.Colors
		 * @see laBouR.impl.LaBouRPackageImpl#getColors()
		 * @generated
		 */
		EEnum COLORS = eINSTANCE.getColors();

	}

} //LaBouRPackage

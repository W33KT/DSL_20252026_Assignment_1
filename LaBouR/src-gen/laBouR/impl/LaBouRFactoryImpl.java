/**
 */
package laBouR.impl;

import laBouR.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LaBouRFactoryImpl extends EFactoryImpl implements LaBouRFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LaBouRFactory init() {
		try {
			LaBouRFactory theLaBouRFactory = (LaBouRFactory) EPackage.Registry.INSTANCE
					.getEFactory(LaBouRPackage.eNS_URI);
			if (theLaBouRFactory != null) {
				return theLaBouRFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LaBouRFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaBouRFactoryImpl() {
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
		case LaBouRPackage.BOULDERING_WALL:
			return (EObject) createBoulderingWall();
		case LaBouRPackage.HOLD:
			return (EObject) createHold();
		case LaBouRPackage.ROUTE:
			return createRoute();
		case LaBouRPackage.START_HOLD:
			return createStart_hold();
		case LaBouRPackage.END_HOLD:
			return createEnd_hold();
		case LaBouRPackage.CIRCLE:
			return createCircle();
		case LaBouRPackage.TRIANGLE:
			return createTriangle();
		case LaBouRPackage.CORNER:
			return createCorner();
		case LaBouRPackage.EXTRUSION_POINT:
			return createExtrusionPoint();
		case LaBouRPackage.VOLUME:
			return createVolume();
		case LaBouRPackage.GRID_BASE_POINTER:
			return createGridBasePointer();
		case LaBouRPackage.SPLIT_STEP:
			return createSplitStep();
		case LaBouRPackage.SINGLE_STEP:
			return createSingleStep();
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
		case LaBouRPackage.COLORS:
			return createColorsFromString(eDataType, initialValue);
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
		case LaBouRPackage.COLORS:
			return convertColorsToString(eDataType, instanceValue);
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
	public BoulderingWall createBoulderingWall() {
		BoulderingWallImpl boulderingWall = new BoulderingWallImpl();
		return boulderingWall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Hold createHold() {
		HoldImpl hold = new HoldImpl();
		return hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Route createRoute() {
		RouteImpl route = new RouteImpl();
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Start_hold createStart_hold() {
		Start_holdImpl start_hold = new Start_holdImpl();
		return start_hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public End_hold createEnd_hold() {
		End_holdImpl end_hold = new End_holdImpl();
		return end_hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Circle createCircle() {
		CircleImpl circle = new CircleImpl();
		return circle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Triangle createTriangle() {
		TriangleImpl triangle = new TriangleImpl();
		return triangle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Corner createCorner() {
		CornerImpl corner = new CornerImpl();
		return corner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtrusionPoint createExtrusionPoint() {
		ExtrusionPointImpl extrusionPoint = new ExtrusionPointImpl();
		return extrusionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Volume createVolume() {
		VolumeImpl volume = new VolumeImpl();
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridBasePointer createGridBasePointer() {
		GridBasePointerImpl gridBasePointer = new GridBasePointerImpl();
		return gridBasePointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SplitStep createSplitStep() {
		SplitStepImpl splitStep = new SplitStepImpl();
		return splitStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SingleStep createSingleStep() {
		SingleStepImpl singleStep = new SingleStepImpl();
		return singleStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Colors createColorsFromString(EDataType eDataType, String initialValue) {
		Colors result = Colors.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertColorsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public LaBouRPackage getLaBouRPackage() {
		return (LaBouRPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LaBouRPackage getPackage() {
		return LaBouRPackage.eINSTANCE;
	}

} //LaBouRFactoryImpl

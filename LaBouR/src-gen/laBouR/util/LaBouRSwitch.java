/**
 */
package laBouR.util;

import laBouR.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see laBouR.LaBouRPackage
 * @generated
 */
public class LaBouRSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LaBouRPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaBouRSwitch() {
		if (modelPackage == null) {
			modelPackage = LaBouRPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case LaBouRPackage.BOULDERING_WALL: {
			BoulderingWall boulderingWall = (BoulderingWall) theEObject;
			T result = caseBoulderingWall(boulderingWall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.HOLD: {
			Hold hold = (Hold) theEObject;
			T result = caseHold(hold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.ROUTE: {
			Route route = (Route) theEObject;
			T result = caseRoute(route);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.LABEL: {
			Label label = (Label) theEObject;
			T result = caseLabel(label);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.START_HOLD: {
			Start_hold start_hold = (Start_hold) theEObject;
			T result = caseStart_hold(start_hold);
			if (result == null)
				result = caseLabel(start_hold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.END_HOLD: {
			End_hold end_hold = (End_hold) theEObject;
			T result = caseEnd_hold(end_hold);
			if (result == null)
				result = caseLabel(end_hold);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.SHAPE: {
			Shape shape = (Shape) theEObject;
			T result = caseShape(shape);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.CIRCLE: {
			Circle circle = (Circle) theEObject;
			T result = caseCircle(circle);
			if (result == null)
				result = caseShape(circle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.TRIANGLE: {
			Triangle triangle = (Triangle) theEObject;
			T result = caseTriangle(triangle);
			if (result == null)
				result = caseShape(triangle);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.CORNER: {
			Corner corner = (Corner) theEObject;
			T result = caseCorner(corner);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.EXTRUSION_POINT: {
			ExtrusionPoint extrusionPoint = (ExtrusionPoint) theEObject;
			T result = caseExtrusionPoint(extrusionPoint);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.VOLUME: {
			Volume volume = (Volume) theEObject;
			T result = caseVolume(volume);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.GRID_BASE_POINTER: {
			GridBasePointer gridBasePointer = (GridBasePointer) theEObject;
			T result = caseGridBasePointer(gridBasePointer);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.ROUTE_STEP: {
			RouteStep routeStep = (RouteStep) theEObject;
			T result = caseRouteStep(routeStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.SPLIT_STEP: {
			SplitStep splitStep = (SplitStep) theEObject;
			T result = caseSplitStep(splitStep);
			if (result == null)
				result = caseRouteStep(splitStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LaBouRPackage.SINGLE_STEP: {
			SingleStep singleStep = (SingleStep) theEObject;
			T result = caseSingleStep(singleStep);
			if (result == null)
				result = caseRouteStep(singleStep);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bouldering Wall</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bouldering Wall</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoulderingWall(BoulderingWall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Hold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Hold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHold(Hold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRoute(Route object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Label</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLabel(Label object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start hold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start hold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStart_hold(Start_hold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>End hold</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>End hold</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnd_hold(End_hold object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Shape</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseShape(Shape object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircle(Circle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Triangle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTriangle(Triangle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Corner</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Corner</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCorner(Corner object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Extrusion Point</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Extrusion Point</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExtrusionPoint(ExtrusionPoint object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVolume(Volume object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Grid Base Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Grid Base Pointer</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGridBasePointer(GridBasePointer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Route Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Route Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRouteStep(RouteStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Split Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Split Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSplitStep(SplitStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Single Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Single Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSingleStep(SingleStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LaBouRSwitch

/**
 */
package laBouR.util;

import laBouR.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see laBouR.LaBouRPackage
 * @generated
 */
public class LaBouRAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LaBouRPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LaBouRAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = LaBouRPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LaBouRSwitch<Adapter> modelSwitch = new LaBouRSwitch<Adapter>() {
		@Override
		public Adapter caseBoulderingWall(BoulderingWall object) {
			return createBoulderingWallAdapter();
		}

		@Override
		public Adapter caseHold(Hold object) {
			return createHoldAdapter();
		}

		@Override
		public Adapter caseRoute(Route object) {
			return createRouteAdapter();
		}

		@Override
		public Adapter caseLabel(Label object) {
			return createLabelAdapter();
		}

		@Override
		public Adapter caseStart_hold(Start_hold object) {
			return createStart_holdAdapter();
		}

		@Override
		public Adapter caseEnd_hold(End_hold object) {
			return createEnd_holdAdapter();
		}

		@Override
		public Adapter caseShape(Shape object) {
			return createShapeAdapter();
		}

		@Override
		public Adapter caseCircle(Circle object) {
			return createCircleAdapter();
		}

		@Override
		public Adapter caseTriangle(Triangle object) {
			return createTriangleAdapter();
		}

		@Override
		public Adapter caseCorner(Corner object) {
			return createCornerAdapter();
		}

		@Override
		public Adapter caseExtrusionPoint(ExtrusionPoint object) {
			return createExtrusionPointAdapter();
		}

		@Override
		public Adapter caseVolume(Volume object) {
			return createVolumeAdapter();
		}

		@Override
		public Adapter caseGridBasePointer(GridBasePointer object) {
			return createGridBasePointerAdapter();
		}

		@Override
		public Adapter caseRouteStep(RouteStep object) {
			return createRouteStepAdapter();
		}

		@Override
		public Adapter caseSplitStep(SplitStep object) {
			return createSplitStepAdapter();
		}

		@Override
		public Adapter caseSingleStep(SingleStep object) {
			return createSingleStepAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link BoulderingWall <em>Bouldering Wall</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see BoulderingWall
	 * @generated
	 */
	public Adapter createBoulderingWallAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link Hold <em>Hold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see Hold
	 * @generated
	 */
	public Adapter createHoldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.Route
	 * @generated
	 */
	public Adapter createRouteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.Label <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.Label
	 * @generated
	 */
	public Adapter createLabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.Start_hold <em>Start hold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.Start_hold
	 * @generated
	 */
	public Adapter createStart_holdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.End_hold <em>End hold</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.End_hold
	 * @generated
	 */
	public Adapter createEnd_holdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.Shape
	 * @generated
	 */
	public Adapter createShapeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.Circle <em>Circle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.Circle
	 * @generated
	 */
	public Adapter createCircleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.Triangle <em>Triangle</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.Triangle
	 * @generated
	 */
	public Adapter createTriangleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.Corner <em>Corner</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.Corner
	 * @generated
	 */
	public Adapter createCornerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.ExtrusionPoint <em>Extrusion Point</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.ExtrusionPoint
	 * @generated
	 */
	public Adapter createExtrusionPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.Volume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.Volume
	 * @generated
	 */
	public Adapter createVolumeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.GridBasePointer <em>Grid Base Pointer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.GridBasePointer
	 * @generated
	 */
	public Adapter createGridBasePointerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.RouteStep <em>Route Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.RouteStep
	 * @generated
	 */
	public Adapter createRouteStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.SplitStep <em>Split Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.SplitStep
	 * @generated
	 */
	public Adapter createSplitStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link laBouR.SingleStep <em>Single Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see laBouR.SingleStep
	 * @generated
	 */
	public Adapter createSingleStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //LaBouRAdapterFactory

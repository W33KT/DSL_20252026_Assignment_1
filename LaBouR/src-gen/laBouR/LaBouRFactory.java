/**
 */
package laBouR;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see laBouR.LaBouRPackage
 * @generated
 */
public interface LaBouRFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	LaBouRFactory eINSTANCE = laBouR.impl.LaBouRFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Bouldering Wall</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bouldering Wall</em>'.
	 * @generated
	 */
	BoulderingWall createBoulderingWall();

	/**
	 * Returns a new object of class '<em>Hold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Hold</em>'.
	 * @generated
	 */
	Hold createHold();

	/**
	 * Returns a new object of class '<em>Route</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Route</em>'.
	 * @generated
	 */
	Route createRoute();

	/**
	 * Returns a new object of class '<em>Start hold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start hold</em>'.
	 * @generated
	 */
	Start_hold createStart_hold();

	/**
	 * Returns a new object of class '<em>End hold</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>End hold</em>'.
	 * @generated
	 */
	End_hold createEnd_hold();

	/**
	 * Returns a new object of class '<em>Circle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circle</em>'.
	 * @generated
	 */
	Circle createCircle();

	/**
	 * Returns a new object of class '<em>Triangle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Triangle</em>'.
	 * @generated
	 */
	Triangle createTriangle();

	/**
	 * Returns a new object of class '<em>Corner</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Corner</em>'.
	 * @generated
	 */
	Corner createCorner();

	/**
	 * Returns a new object of class '<em>Extrusion Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Extrusion Point</em>'.
	 * @generated
	 */
	ExtrusionPoint createExtrusionPoint();

	/**
	 * Returns a new object of class '<em>Volume</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Volume</em>'.
	 * @generated
	 */
	Volume createVolume();

	/**
	 * Returns a new object of class '<em>Grid Base Pointer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grid Base Pointer</em>'.
	 * @generated
	 */
	GridBasePointer createGridBasePointer();

	/**
	 * Returns a new object of class '<em>Split Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Split Step</em>'.
	 * @generated
	 */
	SplitStep createSplitStep();

	/**
	 * Returns a new object of class '<em>Single Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Step</em>'.
	 * @generated
	 */
	SingleStep createSingleStep();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	LaBouRPackage getLaBouRPackage();

} //LaBouRFactory

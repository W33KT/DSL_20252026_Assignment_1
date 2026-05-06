/**
 */
package laBouR;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laBouR.Route#getID <em>ID</em>}</li>
 *   <li>{@link laBouR.Route#getGrade <em>Grade</em>}</li>
 *   <li>{@link laBouR.Route#getGridbasepointer <em>Gridbasepointer</em>}</li>
 *   <li>{@link laBouR.Route#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see laBouR.LaBouRPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see laBouR.LaBouRPackage#getRoute_ID()
	 * @model id="true" required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getID();

	/**
	 * Returns the value of the '<em><b>Grade</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grade</em>' attribute.
	 * @see laBouR.LaBouRPackage#getRoute_Grade()
	 * @model required="true" changeable="false" ordered="false"
	 * @generated
	 */
	String getGrade();

	/**
	 * Returns the value of the '<em><b>Gridbasepointer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gridbasepointer</em>' reference.
	 * @see #setGridbasepointer(GridBasePointer)
	 * @see laBouR.LaBouRPackage#getRoute_Gridbasepointer()
	 * @model required="true"
	 * @generated
	 */
	GridBasePointer getGridbasepointer();

	/**
	 * Sets the value of the '{@link laBouR.Route#getGridbasepointer <em>Gridbasepointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Gridbasepointer</em>' reference.
	 * @see #getGridbasepointer()
	 * @generated
	 */
	void setGridbasepointer(GridBasePointer value);

	/**
	 * Returns the value of the '<em><b>Steps</b></em>' reference list.
	 * The list contents are of type {@link laBouR.RouteStep}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' reference list.
	 * @see laBouR.LaBouRPackage#getRoute_Steps()
	 * @model required="true"
	 * @generated
	 */
	EList<RouteStep> getSteps();

} // Route

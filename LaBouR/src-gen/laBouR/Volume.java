/**
 */
package laBouR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laBouR.Volume#getShape <em>Shape</em>}</li>
 * </ul>
 *
 * @see laBouR.LaBouRPackage#getVolume()
 * @model
 * @generated
 */
public interface Volume extends EObject {
	/**
	 * Returns the value of the '<em><b>Shape</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shape</em>' reference.
	 * @see #setShape(Shape)
	 * @see laBouR.LaBouRPackage#getVolume_Shape()
	 * @model required="true"
	 * @generated
	 */
	Shape getShape();

	/**
	 * Sets the value of the '{@link laBouR.Volume#getShape <em>Shape</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shape</em>' reference.
	 * @see #getShape()
	 * @generated
	 */
	void setShape(Shape value);

} // Volume

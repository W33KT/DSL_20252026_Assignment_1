/**
 */
package laBouR;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Corner</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laBouR.Corner#getY <em>Y</em>}</li>
 *   <li>{@link laBouR.Corner#getX <em>X</em>}</li>
 * </ul>
 *
 * @see laBouR.LaBouRPackage#getCorner()
 * @model
 * @generated
 */
public interface Corner extends EObject {
	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see laBouR.LaBouRPackage#getCorner_Y()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link laBouR.Corner#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see laBouR.LaBouRPackage#getCorner_X()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link laBouR.Corner#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

} // Corner

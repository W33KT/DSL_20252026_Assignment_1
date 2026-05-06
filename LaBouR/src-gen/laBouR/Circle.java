/**
 */
package laBouR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laBouR.Circle#getX <em>X</em>}</li>
 *   <li>{@link laBouR.Circle#getY <em>Y</em>}</li>
 *   <li>{@link laBouR.Circle#getRadius <em>Radius</em>}</li>
 *   <li>{@link laBouR.Circle#getDepth <em>Depth</em>}</li>
 *   <li>{@link laBouR.Circle#getFront_holds <em>Front holds</em>}</li>
 *   <li>{@link laBouR.Circle#getSide_holds <em>Side holds</em>}</li>
 * </ul>
 *
 * @see laBouR.LaBouRPackage#getCircle()
 * @model
 * @generated
 */
public interface Circle extends Shape {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see laBouR.LaBouRPackage#getCircle_X()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link laBouR.Circle#getX <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>X</em>' attribute.
	 * @see #getX()
	 * @generated
	 */
	void setX(int value);

	/**
	 * Returns the value of the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Y</em>' attribute.
	 * @see #setY(int)
	 * @see laBouR.LaBouRPackage#getCircle_Y()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link laBouR.Circle#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Radius</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Radius</em>' attribute.
	 * @see #setRadius(int)
	 * @see laBouR.LaBouRPackage#getCircle_Radius()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getRadius();

	/**
	 * Sets the value of the '{@link laBouR.Circle#getRadius <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Radius</em>' attribute.
	 * @see #getRadius()
	 * @generated
	 */
	void setRadius(int value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see laBouR.LaBouRPackage#getCircle_Depth()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link laBouR.Circle#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Returns the value of the '<em><b>Front holds</b></em>' reference list.
	 * The list contents are of type {@link Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Front holds</em>' reference list.
	 * @see laBouR.LaBouRPackage#getCircle_Front_holds()
	 * @model type="laBouR.Hold"
	 * @generated
	 */
	EList<Hold> getFront_holds();

	/**
	 * Returns the value of the '<em><b>Side holds</b></em>' reference list.
	 * The list contents are of type {@link Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Side holds</em>' reference list.
	 * @see laBouR.LaBouRPackage#getCircle_Side_holds()
	 * @model type="laBouR.Hold"
	 * @generated
	 */
	EList<Hold> getSide_holds();

} // Circle

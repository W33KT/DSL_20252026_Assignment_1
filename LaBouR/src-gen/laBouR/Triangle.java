/**
 */
package laBouR;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Triangle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laBouR.Triangle#getX <em>X</em>}</li>
 *   <li>{@link laBouR.Triangle#getY <em>Y</em>}</li>
 *   <li>{@link laBouR.Triangle#getCorner <em>Corner</em>}</li>
 *   <li>{@link laBouR.Triangle#getExtrusionpoint <em>Extrusionpoint</em>}</li>
 *   <li>{@link laBouR.Triangle#getDepth <em>Depth</em>}</li>
 *   <li>{@link laBouR.Triangle#getLeft_holds <em>Left holds</em>}</li>
 *   <li>{@link laBouR.Triangle#getRight_holds <em>Right holds</em>}</li>
 *   <li>{@link laBouR.Triangle#getBottom_holds <em>Bottom holds</em>}</li>
 * </ul>
 *
 * @see laBouR.LaBouRPackage#getTriangle()
 * @model
 * @generated
 */
public interface Triangle extends Shape {
	/**
	 * Returns the value of the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>X</em>' attribute.
	 * @see #setX(int)
	 * @see laBouR.LaBouRPackage#getTriangle_X()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getX();

	/**
	 * Sets the value of the '{@link laBouR.Triangle#getX <em>X</em>}' attribute.
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
	 * @see laBouR.LaBouRPackage#getTriangle_Y()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getY();

	/**
	 * Sets the value of the '{@link laBouR.Triangle#getY <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Y</em>' attribute.
	 * @see #getY()
	 * @generated
	 */
	void setY(int value);

	/**
	 * Returns the value of the '<em><b>Corner</b></em>' reference list.
	 * The list contents are of type {@link laBouR.Corner}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Corner</em>' reference list.
	 * @see laBouR.LaBouRPackage#getTriangle_Corner()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Corner> getCorner();

	/**
	 * Returns the value of the '<em><b>Extrusionpoint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Extrusionpoint</em>' reference.
	 * @see #setExtrusionpoint(ExtrusionPoint)
	 * @see laBouR.LaBouRPackage#getTriangle_Extrusionpoint()
	 * @model required="true"
	 * @generated
	 */
	ExtrusionPoint getExtrusionpoint();

	/**
	 * Sets the value of the '{@link laBouR.Triangle#getExtrusionpoint <em>Extrusionpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Extrusionpoint</em>' reference.
	 * @see #getExtrusionpoint()
	 * @generated
	 */
	void setExtrusionpoint(ExtrusionPoint value);

	/**
	 * Returns the value of the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Depth</em>' attribute.
	 * @see #setDepth(int)
	 * @see laBouR.LaBouRPackage#getTriangle_Depth()
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	int getDepth();

	/**
	 * Sets the value of the '{@link laBouR.Triangle#getDepth <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Depth</em>' attribute.
	 * @see #getDepth()
	 * @generated
	 */
	void setDepth(int value);

	/**
	 * Returns the value of the '<em><b>Left holds</b></em>' reference list.
	 * The list contents are of type {@link Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left holds</em>' reference list.
	 * @see laBouR.LaBouRPackage#getTriangle_Left_holds()
	 * @model type="laBouR.Hold"
	 * @generated
	 */
	EList<Hold> getLeft_holds();

	/**
	 * Returns the value of the '<em><b>Right holds</b></em>' reference list.
	 * The list contents are of type {@link Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right holds</em>' reference list.
	 * @see laBouR.LaBouRPackage#getTriangle_Right_holds()
	 * @model type="laBouR.Hold"
	 * @generated
	 */
	EList<Hold> getRight_holds();

	/**
	 * Returns the value of the '<em><b>Bottom holds</b></em>' reference list.
	 * The list contents are of type {@link Hold}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bottom holds</em>' reference list.
	 * @see laBouR.LaBouRPackage#getTriangle_Bottom_holds()
	 * @model type="laBouR.Hold"
	 * @generated
	 */
	EList<Hold> getBottom_holds();

} // Triangle

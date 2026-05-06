/**
 */
package laBouR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Split Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laBouR.SplitStep#getLeft <em>Left</em>}</li>
 *   <li>{@link laBouR.SplitStep#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see laBouR.LaBouRPackage#getSplitStep()
 * @model
 * @generated
 */
public interface SplitStep extends RouteStep {
	/**
	 * Returns the value of the '<em><b>Left</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Left</em>' reference.
	 * @see #setLeft(Hold)
	 * @see laBouR.LaBouRPackage#getSplitStep_Left()
	 * @model type="laBouR.Hold" required="true"
	 * @generated
	 */
	Hold getLeft();

	/**
	 * Sets the value of the '{@link laBouR.SplitStep#getLeft <em>Left</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Left</em>' reference.
	 * @see #getLeft()
	 * @generated
	 */
	void setLeft(Hold value);

	/**
	 * Returns the value of the '<em><b>Right</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Right</em>' reference.
	 * @see #setRight(Hold)
	 * @see laBouR.LaBouRPackage#getSplitStep_Right()
	 * @model type="laBouR.Hold" required="true"
	 * @generated
	 */
	Hold getRight();

	/**
	 * Sets the value of the '{@link laBouR.SplitStep#getRight <em>Right</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Right</em>' reference.
	 * @see #getRight()
	 * @generated
	 */
	void setRight(Hold value);

} // SplitStep

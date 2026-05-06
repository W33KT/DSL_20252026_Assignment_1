/**
 */
package laBouR;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link laBouR.SingleStep#getHold <em>Hold</em>}</li>
 * </ul>
 *
 * @see laBouR.LaBouRPackage#getSingleStep()
 * @model
 * @generated
 */
public interface SingleStep extends RouteStep {
	/**
	 * Returns the value of the '<em><b>Hold</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Hold</em>' reference.
	 * @see #setHold(Hold)
	 * @see laBouR.LaBouRPackage#getSingleStep_Hold()
	 * @model type="laBouR.Hold" required="true"
	 * @generated
	 */
	Hold getHold();

	/**
	 * Sets the value of the '{@link laBouR.SingleStep#getHold <em>Hold</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Hold</em>' reference.
	 * @see #getHold()
	 * @generated
	 */
	void setHold(Hold value);

} // SingleStep

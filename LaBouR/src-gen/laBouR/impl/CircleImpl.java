/**
 */
package laBouR.impl;

import java.util.Collection;

import laBouR.Circle;
import laBouR.LaBouRPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Circle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laBouR.impl.CircleImpl#getX <em>X</em>}</li>
 *   <li>{@link laBouR.impl.CircleImpl#getY <em>Y</em>}</li>
 *   <li>{@link laBouR.impl.CircleImpl#getRadius <em>Radius</em>}</li>
 *   <li>{@link laBouR.impl.CircleImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link laBouR.impl.CircleImpl#getFront_holds <em>Front holds</em>}</li>
 *   <li>{@link laBouR.impl.CircleImpl#getSide_holds <em>Side holds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CircleImpl extends ShapeImpl implements Circle {
	/**
	 * The default value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected static final int X_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getX() <em>X</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getX()
	 * @generated
	 * @ordered
	 */
	protected int x = X_EDEFAULT;

	/**
	 * The default value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected static final int Y_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getY() <em>Y</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getY()
	 * @generated
	 * @ordered
	 */
	protected int y = Y_EDEFAULT;

	/**
	 * The default value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected static final int RADIUS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRadius() <em>Radius</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRadius()
	 * @generated
	 * @ordered
	 */
	protected int radius = RADIUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected static final int DEPTH_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDepth() <em>Depth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDepth()
	 * @generated
	 * @ordered
	 */
	protected int depth = DEPTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFront_holds() <em>Front holds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFront_holds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> front_holds;

	/**
	 * The cached value of the '{@link #getSide_holds() <em>Side holds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSide_holds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> side_holds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaBouRPackage.Literals.CIRCLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getX() {
		return x;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setX(int newX) {
		int oldX = x;
		x = newX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaBouRPackage.CIRCLE__X, oldX, x));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getY() {
		return y;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setY(int newY) {
		int oldY = y;
		y = newY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaBouRPackage.CIRCLE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getRadius() {
		return radius;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRadius(int newRadius) {
		int oldRadius = radius;
		radius = newRadius;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaBouRPackage.CIRCLE__RADIUS, oldRadius, radius));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDepth() {
		return depth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDepth(int newDepth) {
		int oldDepth = depth;
		depth = newDepth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaBouRPackage.CIRCLE__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getFront_holds() {
		if (front_holds == null) {
			front_holds = new EObjectResolvingEList<Hold>(Hold.class, this, LaBouRPackage.CIRCLE__FRONT_HOLDS);
		}
		return front_holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getSide_holds() {
		if (side_holds == null) {
			side_holds = new EObjectResolvingEList<Hold>(Hold.class, this, LaBouRPackage.CIRCLE__SIDE_HOLDS);
		}
		return side_holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LaBouRPackage.CIRCLE__X:
			return getX();
		case LaBouRPackage.CIRCLE__Y:
			return getY();
		case LaBouRPackage.CIRCLE__RADIUS:
			return getRadius();
		case LaBouRPackage.CIRCLE__DEPTH:
			return getDepth();
		case LaBouRPackage.CIRCLE__FRONT_HOLDS:
			return getFront_holds();
		case LaBouRPackage.CIRCLE__SIDE_HOLDS:
			return getSide_holds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case LaBouRPackage.CIRCLE__X:
			setX((Integer) newValue);
			return;
		case LaBouRPackage.CIRCLE__Y:
			setY((Integer) newValue);
			return;
		case LaBouRPackage.CIRCLE__RADIUS:
			setRadius((Integer) newValue);
			return;
		case LaBouRPackage.CIRCLE__DEPTH:
			setDepth((Integer) newValue);
			return;
		case LaBouRPackage.CIRCLE__FRONT_HOLDS:
			getFront_holds().clear();
			getFront_holds().addAll((Collection<? extends Hold>) newValue);
			return;
		case LaBouRPackage.CIRCLE__SIDE_HOLDS:
			getSide_holds().clear();
			getSide_holds().addAll((Collection<? extends Hold>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case LaBouRPackage.CIRCLE__X:
			setX(X_EDEFAULT);
			return;
		case LaBouRPackage.CIRCLE__Y:
			setY(Y_EDEFAULT);
			return;
		case LaBouRPackage.CIRCLE__RADIUS:
			setRadius(RADIUS_EDEFAULT);
			return;
		case LaBouRPackage.CIRCLE__DEPTH:
			setDepth(DEPTH_EDEFAULT);
			return;
		case LaBouRPackage.CIRCLE__FRONT_HOLDS:
			getFront_holds().clear();
			return;
		case LaBouRPackage.CIRCLE__SIDE_HOLDS:
			getSide_holds().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case LaBouRPackage.CIRCLE__X:
			return x != X_EDEFAULT;
		case LaBouRPackage.CIRCLE__Y:
			return y != Y_EDEFAULT;
		case LaBouRPackage.CIRCLE__RADIUS:
			return radius != RADIUS_EDEFAULT;
		case LaBouRPackage.CIRCLE__DEPTH:
			return depth != DEPTH_EDEFAULT;
		case LaBouRPackage.CIRCLE__FRONT_HOLDS:
			return front_holds != null && !front_holds.isEmpty();
		case LaBouRPackage.CIRCLE__SIDE_HOLDS:
			return side_holds != null && !side_holds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (x: ");
		result.append(x);
		result.append(", y: ");
		result.append(y);
		result.append(", Radius: ");
		result.append(radius);
		result.append(", Depth: ");
		result.append(depth);
		result.append(')');
		return result.toString();
	}

} //CircleImpl

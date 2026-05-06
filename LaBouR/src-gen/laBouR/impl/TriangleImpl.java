/**
 */
package laBouR.impl;

import java.util.Collection;

import laBouR.Corner;
import laBouR.ExtrusionPoint;
import laBouR.LaBouRPackage;
import laBouR.Triangle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Triangle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laBouR.impl.TriangleImpl#getX <em>X</em>}</li>
 *   <li>{@link laBouR.impl.TriangleImpl#getY <em>Y</em>}</li>
 *   <li>{@link laBouR.impl.TriangleImpl#getCorner <em>Corner</em>}</li>
 *   <li>{@link laBouR.impl.TriangleImpl#getExtrusionpoint <em>Extrusionpoint</em>}</li>
 *   <li>{@link laBouR.impl.TriangleImpl#getDepth <em>Depth</em>}</li>
 *   <li>{@link laBouR.impl.TriangleImpl#getLeft_holds <em>Left holds</em>}</li>
 *   <li>{@link laBouR.impl.TriangleImpl#getRight_holds <em>Right holds</em>}</li>
 *   <li>{@link laBouR.impl.TriangleImpl#getBottom_holds <em>Bottom holds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriangleImpl extends ShapeImpl implements Triangle {
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
	 * The cached value of the '{@link #getCorner() <em>Corner</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorner()
	 * @generated
	 * @ordered
	 */
	protected EList<Corner> corner;

	/**
	 * The cached value of the '{@link #getExtrusionpoint() <em>Extrusionpoint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtrusionpoint()
	 * @generated
	 * @ordered
	 */
	protected ExtrusionPoint extrusionpoint;

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
	 * The cached value of the '{@link #getLeft_holds() <em>Left holds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLeft_holds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> left_holds;

	/**
	 * The cached value of the '{@link #getRight_holds() <em>Right holds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRight_holds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> right_holds;

	/**
	 * The cached value of the '{@link #getBottom_holds() <em>Bottom holds</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBottom_holds()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> bottom_holds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TriangleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaBouRPackage.Literals.TRIANGLE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, LaBouRPackage.TRIANGLE__X, oldX, x));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LaBouRPackage.TRIANGLE__Y, oldY, y));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Corner> getCorner() {
		if (corner == null) {
			corner = new EObjectResolvingEList<Corner>(Corner.class, this, LaBouRPackage.TRIANGLE__CORNER);
		}
		return corner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtrusionPoint getExtrusionpoint() {
		if (extrusionpoint != null && extrusionpoint.eIsProxy()) {
			InternalEObject oldExtrusionpoint = (InternalEObject) extrusionpoint;
			extrusionpoint = (ExtrusionPoint) eResolveProxy(oldExtrusionpoint);
			if (extrusionpoint != oldExtrusionpoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LaBouRPackage.TRIANGLE__EXTRUSIONPOINT,
							oldExtrusionpoint, extrusionpoint));
			}
		}
		return extrusionpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtrusionPoint basicGetExtrusionpoint() {
		return extrusionpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExtrusionpoint(ExtrusionPoint newExtrusionpoint) {
		ExtrusionPoint oldExtrusionpoint = extrusionpoint;
		extrusionpoint = newExtrusionpoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaBouRPackage.TRIANGLE__EXTRUSIONPOINT,
					oldExtrusionpoint, extrusionpoint));
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
			eNotify(new ENotificationImpl(this, Notification.SET, LaBouRPackage.TRIANGLE__DEPTH, oldDepth, depth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getLeft_holds() {
		if (left_holds == null) {
			left_holds = new EObjectResolvingEList<Hold>(Hold.class, this, LaBouRPackage.TRIANGLE__LEFT_HOLDS);
		}
		return left_holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getRight_holds() {
		if (right_holds == null) {
			right_holds = new EObjectResolvingEList<Hold>(Hold.class, this, LaBouRPackage.TRIANGLE__RIGHT_HOLDS);
		}
		return right_holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getBottom_holds() {
		if (bottom_holds == null) {
			bottom_holds = new EObjectResolvingEList<Hold>(Hold.class, this, LaBouRPackage.TRIANGLE__BOTTOM_HOLDS);
		}
		return bottom_holds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LaBouRPackage.TRIANGLE__X:
			return getX();
		case LaBouRPackage.TRIANGLE__Y:
			return getY();
		case LaBouRPackage.TRIANGLE__CORNER:
			return getCorner();
		case LaBouRPackage.TRIANGLE__EXTRUSIONPOINT:
			if (resolve)
				return getExtrusionpoint();
			return basicGetExtrusionpoint();
		case LaBouRPackage.TRIANGLE__DEPTH:
			return getDepth();
		case LaBouRPackage.TRIANGLE__LEFT_HOLDS:
			return getLeft_holds();
		case LaBouRPackage.TRIANGLE__RIGHT_HOLDS:
			return getRight_holds();
		case LaBouRPackage.TRIANGLE__BOTTOM_HOLDS:
			return getBottom_holds();
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
		case LaBouRPackage.TRIANGLE__X:
			setX((Integer) newValue);
			return;
		case LaBouRPackage.TRIANGLE__Y:
			setY((Integer) newValue);
			return;
		case LaBouRPackage.TRIANGLE__CORNER:
			getCorner().clear();
			getCorner().addAll((Collection<? extends Corner>) newValue);
			return;
		case LaBouRPackage.TRIANGLE__EXTRUSIONPOINT:
			setExtrusionpoint((ExtrusionPoint) newValue);
			return;
		case LaBouRPackage.TRIANGLE__DEPTH:
			setDepth((Integer) newValue);
			return;
		case LaBouRPackage.TRIANGLE__LEFT_HOLDS:
			getLeft_holds().clear();
			getLeft_holds().addAll((Collection<? extends Hold>) newValue);
			return;
		case LaBouRPackage.TRIANGLE__RIGHT_HOLDS:
			getRight_holds().clear();
			getRight_holds().addAll((Collection<? extends Hold>) newValue);
			return;
		case LaBouRPackage.TRIANGLE__BOTTOM_HOLDS:
			getBottom_holds().clear();
			getBottom_holds().addAll((Collection<? extends Hold>) newValue);
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
		case LaBouRPackage.TRIANGLE__X:
			setX(X_EDEFAULT);
			return;
		case LaBouRPackage.TRIANGLE__Y:
			setY(Y_EDEFAULT);
			return;
		case LaBouRPackage.TRIANGLE__CORNER:
			getCorner().clear();
			return;
		case LaBouRPackage.TRIANGLE__EXTRUSIONPOINT:
			setExtrusionpoint((ExtrusionPoint) null);
			return;
		case LaBouRPackage.TRIANGLE__DEPTH:
			setDepth(DEPTH_EDEFAULT);
			return;
		case LaBouRPackage.TRIANGLE__LEFT_HOLDS:
			getLeft_holds().clear();
			return;
		case LaBouRPackage.TRIANGLE__RIGHT_HOLDS:
			getRight_holds().clear();
			return;
		case LaBouRPackage.TRIANGLE__BOTTOM_HOLDS:
			getBottom_holds().clear();
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
		case LaBouRPackage.TRIANGLE__X:
			return x != X_EDEFAULT;
		case LaBouRPackage.TRIANGLE__Y:
			return y != Y_EDEFAULT;
		case LaBouRPackage.TRIANGLE__CORNER:
			return corner != null && !corner.isEmpty();
		case LaBouRPackage.TRIANGLE__EXTRUSIONPOINT:
			return extrusionpoint != null;
		case LaBouRPackage.TRIANGLE__DEPTH:
			return depth != DEPTH_EDEFAULT;
		case LaBouRPackage.TRIANGLE__LEFT_HOLDS:
			return left_holds != null && !left_holds.isEmpty();
		case LaBouRPackage.TRIANGLE__RIGHT_HOLDS:
			return right_holds != null && !right_holds.isEmpty();
		case LaBouRPackage.TRIANGLE__BOTTOM_HOLDS:
			return bottom_holds != null && !bottom_holds.isEmpty();
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
		result.append(", Depth: ");
		result.append(depth);
		result.append(')');
		return result.toString();
	}

} //TriangleImpl

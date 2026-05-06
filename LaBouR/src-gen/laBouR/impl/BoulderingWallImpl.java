/**
 */
package laBouR.impl;

import java.util.Collection;

import laBouR.LaBouRPackage;
import laBouR.Route;
import laBouR.Volume;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bouldering Wall</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laBouR.impl.BoulderingWallImpl#getID <em>ID</em>}</li>
 *   <li>{@link laBouR.impl.BoulderingWallImpl#getHold <em>Hold</em>}</li>
 *   <li>{@link laBouR.impl.BoulderingWallImpl#getRoute <em>Route</em>}</li>
 *   <li>{@link laBouR.impl.BoulderingWallImpl#getVolume <em>Volume</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BoulderingWallImpl extends MinimalEObjectImpl.Container implements BoulderingWall {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHold() <em>Hold</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHold()
	 * @generated
	 * @ordered
	 */
	protected EList<Hold> hold;

	/**
	 * The cached value of the '{@link #getRoute() <em>Route</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoute()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> route;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected EList<Volume> volume;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BoulderingWallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaBouRPackage.Literals.BOULDERING_WALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaBouRPackage.BOULDERING_WALL__ID, oldID, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Hold> getHold() {
		if (hold == null) {
			hold = new EObjectContainmentEList<Hold>(Hold.class, this, LaBouRPackage.BOULDERING_WALL__HOLD);
		}
		return hold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Route> getRoute() {
		if (route == null) {
			route = new EObjectContainmentEList<Route>(Route.class, this, LaBouRPackage.BOULDERING_WALL__ROUTE);
		}
		return route;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Volume> getVolume() {
		if (volume == null) {
			volume = new EObjectContainmentEList<Volume>(Volume.class, this, LaBouRPackage.BOULDERING_WALL__VOLUME);
		}
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LaBouRPackage.BOULDERING_WALL__HOLD:
			return ((InternalEList<?>) getHold()).basicRemove(otherEnd, msgs);
		case LaBouRPackage.BOULDERING_WALL__ROUTE:
			return ((InternalEList<?>) getRoute()).basicRemove(otherEnd, msgs);
		case LaBouRPackage.BOULDERING_WALL__VOLUME:
			return ((InternalEList<?>) getVolume()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LaBouRPackage.BOULDERING_WALL__ID:
			return getID();
		case LaBouRPackage.BOULDERING_WALL__HOLD:
			return getHold();
		case LaBouRPackage.BOULDERING_WALL__ROUTE:
			return getRoute();
		case LaBouRPackage.BOULDERING_WALL__VOLUME:
			return getVolume();
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
		case LaBouRPackage.BOULDERING_WALL__ID:
			setID((String) newValue);
			return;
		case LaBouRPackage.BOULDERING_WALL__HOLD:
			getHold().clear();
			getHold().addAll((Collection<? extends Hold>) newValue);
			return;
		case LaBouRPackage.BOULDERING_WALL__ROUTE:
			getRoute().clear();
			getRoute().addAll((Collection<? extends Route>) newValue);
			return;
		case LaBouRPackage.BOULDERING_WALL__VOLUME:
			getVolume().clear();
			getVolume().addAll((Collection<? extends Volume>) newValue);
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
		case LaBouRPackage.BOULDERING_WALL__ID:
			setID(ID_EDEFAULT);
			return;
		case LaBouRPackage.BOULDERING_WALL__HOLD:
			getHold().clear();
			return;
		case LaBouRPackage.BOULDERING_WALL__ROUTE:
			getRoute().clear();
			return;
		case LaBouRPackage.BOULDERING_WALL__VOLUME:
			getVolume().clear();
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
		case LaBouRPackage.BOULDERING_WALL__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case LaBouRPackage.BOULDERING_WALL__HOLD:
			return hold != null && !hold.isEmpty();
		case LaBouRPackage.BOULDERING_WALL__ROUTE:
			return route != null && !route.isEmpty();
		case LaBouRPackage.BOULDERING_WALL__VOLUME:
			return volume != null && !volume.isEmpty();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //BoulderingWallImpl

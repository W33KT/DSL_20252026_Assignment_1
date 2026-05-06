/**
 */
package laBouR.impl;

import java.util.Collection;

import laBouR.GridBasePointer;
import laBouR.LaBouRPackage;
import laBouR.Route;
import laBouR.RouteStep;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link laBouR.impl.RouteImpl#getID <em>ID</em>}</li>
 *   <li>{@link laBouR.impl.RouteImpl#getGrade <em>Grade</em>}</li>
 *   <li>{@link laBouR.impl.RouteImpl#getGridbasepointer <em>Gridbasepointer</em>}</li>
 *   <li>{@link laBouR.impl.RouteImpl#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
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
	 * The default value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected static final String GRADE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGrade() <em>Grade</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrade()
	 * @generated
	 * @ordered
	 */
	protected String grade = GRADE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGridbasepointer() <em>Gridbasepointer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGridbasepointer()
	 * @generated
	 * @ordered
	 */
	protected GridBasePointer gridbasepointer;

	/**
	 * The cached value of the '{@link #getSteps() <em>Steps</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSteps()
	 * @generated
	 * @ordered
	 */
	protected EList<RouteStep> steps;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LaBouRPackage.Literals.ROUTE;
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
	public String getGrade() {
		return grade;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GridBasePointer getGridbasepointer() {
		if (gridbasepointer != null && gridbasepointer.eIsProxy()) {
			InternalEObject oldGridbasepointer = (InternalEObject) gridbasepointer;
			gridbasepointer = (GridBasePointer) eResolveProxy(oldGridbasepointer);
			if (gridbasepointer != oldGridbasepointer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, LaBouRPackage.ROUTE__GRIDBASEPOINTER,
							oldGridbasepointer, gridbasepointer));
			}
		}
		return gridbasepointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GridBasePointer basicGetGridbasepointer() {
		return gridbasepointer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGridbasepointer(GridBasePointer newGridbasepointer) {
		GridBasePointer oldGridbasepointer = gridbasepointer;
		gridbasepointer = newGridbasepointer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LaBouRPackage.ROUTE__GRIDBASEPOINTER,
					oldGridbasepointer, gridbasepointer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RouteStep> getSteps() {
		if (steps == null) {
			steps = new EObjectResolvingEList<RouteStep>(RouteStep.class, this, LaBouRPackage.ROUTE__STEPS);
		}
		return steps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case LaBouRPackage.ROUTE__ID:
			return getID();
		case LaBouRPackage.ROUTE__GRADE:
			return getGrade();
		case LaBouRPackage.ROUTE__GRIDBASEPOINTER:
			if (resolve)
				return getGridbasepointer();
			return basicGetGridbasepointer();
		case LaBouRPackage.ROUTE__STEPS:
			return getSteps();
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
		case LaBouRPackage.ROUTE__GRIDBASEPOINTER:
			setGridbasepointer((GridBasePointer) newValue);
			return;
		case LaBouRPackage.ROUTE__STEPS:
			getSteps().clear();
			getSteps().addAll((Collection<? extends RouteStep>) newValue);
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
		case LaBouRPackage.ROUTE__GRIDBASEPOINTER:
			setGridbasepointer((GridBasePointer) null);
			return;
		case LaBouRPackage.ROUTE__STEPS:
			getSteps().clear();
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
		case LaBouRPackage.ROUTE__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case LaBouRPackage.ROUTE__GRADE:
			return GRADE_EDEFAULT == null ? grade != null : !GRADE_EDEFAULT.equals(grade);
		case LaBouRPackage.ROUTE__GRIDBASEPOINTER:
			return gridbasepointer != null;
		case LaBouRPackage.ROUTE__STEPS:
			return steps != null && !steps.isEmpty();
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
		result.append(", Grade: ");
		result.append(grade);
		result.append(')');
		return result.toString();
	}

} //RouteImpl

/**
 */
package laBouR.provider;

import java.util.Collection;
import java.util.List;

import laBouR.LaBouRPackage;
import laBouR.Triangle;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link laBouR.Triangle} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TriangleItemProvider extends ShapeItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TriangleItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addXPropertyDescriptor(object);
			addYPropertyDescriptor(object);
			addCornerPropertyDescriptor(object);
			addExtrusionpointPropertyDescriptor(object);
			addDepthPropertyDescriptor(object);
			addLeft_holdsPropertyDescriptor(object);
			addRight_holdsPropertyDescriptor(object);
			addBottom_holdsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the X feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addXPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_x_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_x_feature", "_UI_Triangle_type"),
						LaBouRPackage.Literals.TRIANGLE__X, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Y feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addYPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_y_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_y_feature", "_UI_Triangle_type"),
						LaBouRPackage.Literals.TRIANGLE__Y, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Corner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCornerPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_corner_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_corner_feature",
								"_UI_Triangle_type"),
						LaBouRPackage.Literals.TRIANGLE__CORNER, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Extrusionpoint feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExtrusionpointPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_extrusionpoint_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_extrusionpoint_feature",
								"_UI_Triangle_type"),
						LaBouRPackage.Literals.TRIANGLE__EXTRUSIONPOINT, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Depth feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDepthPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_Depth_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_Depth_feature",
								"_UI_Triangle_type"),
						LaBouRPackage.Literals.TRIANGLE__DEPTH, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Left holds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLeft_holdsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_left_holds_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_left_holds_feature",
								"_UI_Triangle_type"),
						LaBouRPackage.Literals.TRIANGLE__LEFT_HOLDS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Right holds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRight_holdsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_right_holds_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_right_holds_feature",
								"_UI_Triangle_type"),
						LaBouRPackage.Literals.TRIANGLE__RIGHT_HOLDS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Bottom holds feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBottom_holdsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_Triangle_bottom_holds_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_Triangle_bottom_holds_feature",
								"_UI_Triangle_type"),
						LaBouRPackage.Literals.TRIANGLE__BOTTOM_HOLDS, true, false, true, null, null, null));
	}

	/**
	 * This returns Triangle.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Triangle"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Triangle triangle = (Triangle) object;
		return getString("_UI_Triangle_type") + " " + triangle.getX();
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Triangle.class)) {
		case LaBouRPackage.TRIANGLE__X:
		case LaBouRPackage.TRIANGLE__Y:
		case LaBouRPackage.TRIANGLE__DEPTH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
	}

}

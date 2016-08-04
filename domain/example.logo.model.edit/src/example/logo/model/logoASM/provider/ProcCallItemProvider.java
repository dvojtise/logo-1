/**
 */
package example.logo.model.logoASM.provider;


import example.logo.model.logoASM.LogoASMFactory;
import example.logo.model.logoASM.LogoASMPackage;
import example.logo.model.logoASM.ProcCall;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link example.logo.model.logoASM.ProcCall} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcCallItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcCallItemProvider(AdapterFactory adapterFactory) {
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

			addDeclarationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Declaration feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclarationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcCall_declaration_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcCall_declaration_feature", "_UI_ProcCall_type"),
				 LogoASMPackage.Literals.PROC_CALL__DECLARATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns ProcCall.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcCall"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_ProcCall_type");
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

		switch (notification.getFeatureID(ProcCall.class)) {
			case LogoASMPackage.PROC_CALL__ACTUAL_ARGS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 LogoASMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 LogoASMFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 LogoASMFactory.eINSTANCE.createParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 LogoASMFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 LogoASMFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 LogoASMFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 LogoASMFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 LogoASMFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 LogoASMFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_CALL__ACTUAL_ARGS,
				 LogoASMFactory.eINSTANCE.createLower()));
	}

}

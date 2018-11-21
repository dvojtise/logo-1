/**
 */
package example.logo.model.logoASM.provider;


import example.logo.model.logoASM.LogoASMFactory;
import example.logo.model.logoASM.LogoASMPackage;
import example.logo.model.logoASM.ProcDeclaration;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link example.logo.model.logoASM.ProcDeclaration} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ProcDeclarationItemProvider extends InstructionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcDeclarationItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ProcDeclaration_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ProcDeclaration_name_feature", "_UI_ProcDeclaration_type"),
				 LogoASMPackage.Literals.PROC_DECLARATION__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(LogoASMPackage.Literals.PROC_DECLARATION__ARGS);
			childrenFeatures.add(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS);
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
	 * This returns ProcDeclaration.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ProcDeclaration"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ProcDeclaration)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ProcDeclaration_type") :
			getString("_UI_ProcDeclaration_type") + " " + label;
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

		switch (notification.getFeatureID(ProcDeclaration.class)) {
			case LogoASMPackage.PROC_DECLARATION__NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case LogoASMPackage.PROC_DECLARATION__ARGS:
			case LogoASMPackage.PROC_DECLARATION__INSTRUCTIONS:
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
				(LogoASMPackage.Literals.PROC_DECLARATION__ARGS,
				 LogoASMFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createBack()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createForward()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createLeft()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createRight()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createPenDown()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createPenUp()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createClear()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createProcDeclaration()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createControlStructure()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createIf()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createRepeat()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createWhile()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.PROC_DECLARATION__INSTRUCTIONS,
				 LogoASMFactory.eINSTANCE.createLower()));
	}

}

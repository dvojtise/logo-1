/**
 */
package example.logo.model.logoASM.provider;


import example.logo.model.logoASM.BinaryExp;
import example.logo.model.logoASM.LogoASMFactory;
import example.logo.model.logoASM.LogoASMPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link example.logo.model.logoASM.BinaryExp} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class BinaryExpItemProvider extends ExpressionItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BinaryExpItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(LogoASMPackage.Literals.BINARY_EXP__LHS);
			childrenFeatures.add(LogoASMPackage.Literals.BINARY_EXP__RHS);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_BinaryExp_type");
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

		switch (notification.getFeatureID(BinaryExp.class)) {
			case LogoASMPackage.BINARY_EXP__LHS:
			case LogoASMPackage.BINARY_EXP__RHS:
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
				(LogoASMPackage.Literals.BINARY_EXP__LHS,
				 LogoASMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__LHS,
				 LogoASMFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__LHS,
				 LogoASMFactory.eINSTANCE.createParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__LHS,
				 LogoASMFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__LHS,
				 LogoASMFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__LHS,
				 LogoASMFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__LHS,
				 LogoASMFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__LHS,
				 LogoASMFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__LHS,
				 LogoASMFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__LHS,
				 LogoASMFactory.eINSTANCE.createLower()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__RHS,
				 LogoASMFactory.eINSTANCE.createConstant()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__RHS,
				 LogoASMFactory.eINSTANCE.createProcCall()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__RHS,
				 LogoASMFactory.eINSTANCE.createParameterCall()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__RHS,
				 LogoASMFactory.eINSTANCE.createPlus()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__RHS,
				 LogoASMFactory.eINSTANCE.createMinus()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__RHS,
				 LogoASMFactory.eINSTANCE.createMult()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__RHS,
				 LogoASMFactory.eINSTANCE.createDiv()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__RHS,
				 LogoASMFactory.eINSTANCE.createEquals()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__RHS,
				 LogoASMFactory.eINSTANCE.createGreater()));

		newChildDescriptors.add
			(createChildParameter
				(LogoASMPackage.Literals.BINARY_EXP__RHS,
				 LogoASMFactory.eINSTANCE.createLower()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == LogoASMPackage.Literals.BINARY_EXP__LHS ||
			childFeature == LogoASMPackage.Literals.BINARY_EXP__RHS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

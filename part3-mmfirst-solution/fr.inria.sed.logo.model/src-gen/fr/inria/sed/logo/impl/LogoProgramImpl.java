/**
 */
package fr.inria.sed.logo.impl;

import fr.inria.sed.logo.Instruction;
import fr.inria.sed.logo.LogoPackage;
import fr.inria.sed.logo.LogoProgram;

import fr.inria.sed.logo.RuntimeContext;
import java.util.Collection;

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
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.impl.LogoProgramImpl#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link fr.inria.sed.logo.impl.LogoProgramImpl#getRuntimeContext <em>Runtime Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogoProgramImpl extends MinimalEObjectImpl.Container implements LogoProgram {
	/**
	 * The cached value of the '{@link #getInstructions() <em>Instructions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstructions()
	 * @generated
	 * @ordered
	 */
	protected EList<Instruction> instructions;

	/**
	 * The cached value of the '{@link #getRuntimeContext() <em>Runtime Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntimeContext()
	 * @generated
	 * @ordered
	 */
	protected RuntimeContext runtimeContext;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LogoProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LogoPackage.Literals.LOGO_PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Instruction> getInstructions() {
		if (instructions == null) {
			instructions = new EObjectContainmentEList<Instruction>(Instruction.class, this,
					LogoPackage.LOGO_PROGRAM__INSTRUCTIONS);
		}
		return instructions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeContext getRuntimeContext() {
		return runtimeContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntimeContext(RuntimeContext newRuntimeContext, NotificationChain msgs) {
		RuntimeContext oldRuntimeContext = runtimeContext;
		runtimeContext = newRuntimeContext;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					LogoPackage.LOGO_PROGRAM__RUNTIME_CONTEXT, oldRuntimeContext, newRuntimeContext);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntimeContext(RuntimeContext newRuntimeContext) {
		if (newRuntimeContext != runtimeContext) {
			NotificationChain msgs = null;
			if (runtimeContext != null)
				msgs = ((InternalEObject) runtimeContext).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - LogoPackage.LOGO_PROGRAM__RUNTIME_CONTEXT, null, msgs);
			if (newRuntimeContext != null)
				msgs = ((InternalEObject) newRuntimeContext).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - LogoPackage.LOGO_PROGRAM__RUNTIME_CONTEXT, null, msgs);
			msgs = basicSetRuntimeContext(newRuntimeContext, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, LogoPackage.LOGO_PROGRAM__RUNTIME_CONTEXT,
					newRuntimeContext, newRuntimeContext));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case LogoPackage.LOGO_PROGRAM__INSTRUCTIONS:
			return ((InternalEList<?>) getInstructions()).basicRemove(otherEnd, msgs);
		case LogoPackage.LOGO_PROGRAM__RUNTIME_CONTEXT:
			return basicSetRuntimeContext(null, msgs);
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
		case LogoPackage.LOGO_PROGRAM__INSTRUCTIONS:
			return getInstructions();
		case LogoPackage.LOGO_PROGRAM__RUNTIME_CONTEXT:
			return getRuntimeContext();
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
		case LogoPackage.LOGO_PROGRAM__INSTRUCTIONS:
			getInstructions().clear();
			getInstructions().addAll((Collection<? extends Instruction>) newValue);
			return;
		case LogoPackage.LOGO_PROGRAM__RUNTIME_CONTEXT:
			setRuntimeContext((RuntimeContext) newValue);
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
		case LogoPackage.LOGO_PROGRAM__INSTRUCTIONS:
			getInstructions().clear();
			return;
		case LogoPackage.LOGO_PROGRAM__RUNTIME_CONTEXT:
			setRuntimeContext((RuntimeContext) null);
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
		case LogoPackage.LOGO_PROGRAM__INSTRUCTIONS:
			return instructions != null && !instructions.isEmpty();
		case LogoPackage.LOGO_PROGRAM__RUNTIME_CONTEXT:
			return runtimeContext != null;
		}
		return super.eIsSet(featureID);
	}

} //LogoProgramImpl

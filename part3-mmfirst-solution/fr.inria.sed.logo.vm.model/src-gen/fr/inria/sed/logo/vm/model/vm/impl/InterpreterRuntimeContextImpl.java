/**
 */
package fr.inria.sed.logo.vm.model.vm.impl;

import fr.inria.sed.logo.impl.RuntimeContextImpl;
import fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext;
import fr.inria.sed.logo.vm.model.vm.Turtle;
import fr.inria.sed.logo.vm.model.vm.VmPackage;

import java.util.Collection;
import java.util.HashMap;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interpreter Runtime Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.impl.InterpreterRuntimeContextImpl#getTurtle <em>Turtle</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.impl.InterpreterRuntimeContextImpl#getStack <em>Stack</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterpreterRuntimeContextImpl extends RuntimeContextImpl implements InterpreterRuntimeContext {
	/**
	 * The cached value of the '{@link #getTurtle() <em>Turtle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurtle()
	 * @generated
	 * @ordered
	 */
	protected Turtle turtle;

	/**
	 * The cached value of the '{@link #getStack() <em>Stack</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStack()
	 * @generated
	 * @ordered
	 */
	protected EList<HashMap<String, Integer>> stack;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterpreterRuntimeContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return VmPackage.Literals.INTERPRETER_RUNTIME_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turtle getTurtle() {
		return turtle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurtle(Turtle newTurtle, NotificationChain msgs) {
		Turtle oldTurtle = turtle;
		turtle = newTurtle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					VmPackage.INTERPRETER_RUNTIME_CONTEXT__TURTLE, oldTurtle, newTurtle);
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
	public void setTurtle(Turtle newTurtle) {
		if (newTurtle != turtle) {
			NotificationChain msgs = null;
			if (turtle != null)
				msgs = ((InternalEObject) turtle).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - VmPackage.INTERPRETER_RUNTIME_CONTEXT__TURTLE, null, msgs);
			if (newTurtle != null)
				msgs = ((InternalEObject) newTurtle).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - VmPackage.INTERPRETER_RUNTIME_CONTEXT__TURTLE, null, msgs);
			msgs = basicSetTurtle(newTurtle, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, VmPackage.INTERPRETER_RUNTIME_CONTEXT__TURTLE,
					newTurtle, newTurtle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HashMap<String, Integer>> getStack() {
		if (stack == null) {
			stack = new EDataTypeEList<HashMap<String, Integer>>(HashMap.class, this,
					VmPackage.INTERPRETER_RUNTIME_CONTEXT__STACK);
		}
		return stack;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case VmPackage.INTERPRETER_RUNTIME_CONTEXT__TURTLE:
			return basicSetTurtle(null, msgs);
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
		case VmPackage.INTERPRETER_RUNTIME_CONTEXT__TURTLE:
			return getTurtle();
		case VmPackage.INTERPRETER_RUNTIME_CONTEXT__STACK:
			return getStack();
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
		case VmPackage.INTERPRETER_RUNTIME_CONTEXT__TURTLE:
			setTurtle((Turtle) newValue);
			return;
		case VmPackage.INTERPRETER_RUNTIME_CONTEXT__STACK:
			getStack().clear();
			getStack().addAll((Collection<? extends HashMap<String, Integer>>) newValue);
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
		case VmPackage.INTERPRETER_RUNTIME_CONTEXT__TURTLE:
			setTurtle((Turtle) null);
			return;
		case VmPackage.INTERPRETER_RUNTIME_CONTEXT__STACK:
			getStack().clear();
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
		case VmPackage.INTERPRETER_RUNTIME_CONTEXT__TURTLE:
			return turtle != null;
		case VmPackage.INTERPRETER_RUNTIME_CONTEXT__STACK:
			return stack != null && !stack.isEmpty();
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
		result.append(" (stack: ");
		result.append(stack);
		result.append(')');
		return result.toString();
	}

} //InterpreterRuntimeContextImpl

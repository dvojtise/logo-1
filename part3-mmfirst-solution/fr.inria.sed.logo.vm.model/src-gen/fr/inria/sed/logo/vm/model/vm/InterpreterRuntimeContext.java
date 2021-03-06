/**
 */
package fr.inria.sed.logo.vm.model.vm;

import fr.inria.sed.logo.RuntimeContext;
import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interpreter Runtime Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext#getTurtle <em>Turtle</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext#getStack <em>Stack</em>}</li>
 * </ul>
 *
 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getInterpreterRuntimeContext()
 * @model
 * @generated
 */
public interface InterpreterRuntimeContext extends RuntimeContext {
	/**
	 * Returns the value of the '<em><b>Turtle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turtle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turtle</em>' containment reference.
	 * @see #setTurtle(Turtle)
	 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getInterpreterRuntimeContext_Turtle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Turtle getTurtle();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.vm.model.vm.InterpreterRuntimeContext#getTurtle <em>Turtle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turtle</em>' containment reference.
	 * @see #getTurtle()
	 * @generated
	 */
	void setTurtle(Turtle value);

	/**
	 * Returns the value of the '<em><b>Stack</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.sed.logo.vm.model.vm.ParamMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stack</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stack</em>' containment reference list.
	 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getInterpreterRuntimeContext_Stack()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamMap> getStack();

} // InterpreterRuntimeContext

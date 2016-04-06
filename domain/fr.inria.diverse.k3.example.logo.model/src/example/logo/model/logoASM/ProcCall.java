/**
 */
package example.logo.model.logoASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.logo.model.logoASM.ProcCall#getActualArgs <em>Actual Args</em>}</li>
 *   <li>{@link example.logo.model.logoASM.ProcCall#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.logo.model.logoASM.LogoASMPackage#getProcCall()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='same_number_of_formals_and_actuals'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot same_number_of_formals_and_actuals='actualArgs->size() = declaration.args->size()'"
 * @generated
 */
public interface ProcCall extends Expression {
	/**
	 * Returns the value of the '<em><b>Actual Args</b></em>' containment reference list.
	 * The list contents are of type {@link example.logo.model.logoASM.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Args</em>' containment reference list.
	 * @see example.logo.model.logoASM.LogoASMPackage#getProcCall_ActualArgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getActualArgs();

	/**
	 * Returns the value of the '<em><b>Declaration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Declaration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Declaration</em>' reference.
	 * @see #setDeclaration(ProcDeclaration)
	 * @see example.logo.model.logoASM.LogoASMPackage#getProcCall_Declaration()
	 * @model required="true"
	 * @generated
	 */
	ProcDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link example.logo.model.logoASM.ProcCall#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(ProcDeclaration value);

} // ProcCall

/**
 */
package fr.inria.sed.logo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.ParameterCall#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see fr.inria.sed.logo.LogoPackage#getParameterCall()
 * @model
 * @generated
 */
public interface ParameterCall extends Instruction, Expression {
	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' reference.
	 * @see #setParameter(Parameter)
	 * @see fr.inria.sed.logo.LogoPackage#getParameterCall_Parameter()
	 * @model
	 * @generated
	 */
	Parameter getParameter();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.ParameterCall#getParameter <em>Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(Parameter value);

} // ParameterCall

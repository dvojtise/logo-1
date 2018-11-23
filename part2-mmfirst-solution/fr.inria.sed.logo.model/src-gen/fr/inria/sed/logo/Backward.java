/**
 */
package fr.inria.sed.logo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Backward</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.Backward#getSteps <em>Steps</em>}</li>
 * </ul>
 *
 * @see fr.inria.sed.logo.LogoPackage#getBackward()
 * @model
 * @generated
 */
public interface Backward extends Instruction {
	/**
	 * Returns the value of the '<em><b>Steps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Steps</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Steps</em>' containment reference.
	 * @see #setSteps(Expression)
	 * @see fr.inria.sed.logo.LogoPackage#getBackward_Steps()
	 * @model containment="true"
	 * @generated
	 */
	Expression getSteps();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.Backward#getSteps <em>Steps</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Steps</em>' containment reference.
	 * @see #getSteps()
	 * @generated
	 */
	void setSteps(Expression value);

} // Backward

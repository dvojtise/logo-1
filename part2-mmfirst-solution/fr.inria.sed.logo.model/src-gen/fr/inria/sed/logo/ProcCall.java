/**
 */
package fr.inria.sed.logo;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.ProcCall#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link fr.inria.sed.logo.ProcCall#getActualArgs <em>Actual Args</em>}</li>
 * </ul>
 *
 * @see fr.inria.sed.logo.LogoPackage#getProcCall()
 * @model
 * @generated
 */
public interface ProcCall extends Instruction {
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
	 * @see fr.inria.sed.logo.LogoPackage#getProcCall_Declaration()
	 * @model
	 * @generated
	 */
	ProcDeclaration getDeclaration();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.ProcCall#getDeclaration <em>Declaration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Declaration</em>' reference.
	 * @see #getDeclaration()
	 * @generated
	 */
	void setDeclaration(ProcDeclaration value);

	/**
	 * Returns the value of the '<em><b>Actual Args</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.sed.logo.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Actual Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actual Args</em>' containment reference list.
	 * @see fr.inria.sed.logo.LogoPackage#getProcCall_ActualArgs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getActualArgs();

} // ProcCall

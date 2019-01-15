/**
 */
package fr.inria.sed.logo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.LogoProgram#getInstructions <em>Instructions</em>}</li>
 *   <li>{@link fr.inria.sed.logo.LogoProgram#getRuntimeContext <em>Runtime Context</em>}</li>
 * </ul>
 *
 * @see fr.inria.sed.logo.LogoPackage#getLogoProgram()
 * @model
 * @generated
 */
public interface LogoProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.sed.logo.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see fr.inria.sed.logo.LogoPackage#getLogoProgram_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

	/**
	 * Returns the value of the '<em><b>Runtime Context</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Runtime Context</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runtime Context</em>' containment reference.
	 * @see #setRuntimeContext(RuntimeContext)
	 * @see fr.inria.sed.logo.LogoPackage#getLogoProgram_RuntimeContext()
	 * @model containment="true"
	 * @generated
	 */
	RuntimeContext getRuntimeContext();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.LogoProgram#getRuntimeContext <em>Runtime Context</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Runtime Context</em>' containment reference.
	 * @see #getRuntimeContext()
	 * @generated
	 */
	void setRuntimeContext(RuntimeContext value);

} // LogoProgram

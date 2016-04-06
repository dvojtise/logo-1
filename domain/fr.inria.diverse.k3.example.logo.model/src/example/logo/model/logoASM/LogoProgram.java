/**
 */
package example.logo.model.logoASM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logo Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.logo.model.logoASM.LogoProgram#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.logo.model.logoASM.LogoASMPackage#getLogoProgram()
 * @model
 * @generated
 */
public interface LogoProgram extends EObject {
	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link example.logo.model.logoASM.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see example.logo.model.logoASM.LogoASMPackage#getLogoProgram_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // LogoProgram

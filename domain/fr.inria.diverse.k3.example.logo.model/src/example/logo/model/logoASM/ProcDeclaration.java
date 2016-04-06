/**
 */
package example.logo.model.logoASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link example.logo.model.logoASM.ProcDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link example.logo.model.logoASM.ProcDeclaration#getArgs <em>Args</em>}</li>
 *   <li>{@link example.logo.model.logoASM.ProcDeclaration#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see example.logo.model.logoASM.LogoASMPackage#getProcDeclaration()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='unique_names_for_formal_arguments'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot unique_names_for_formal_arguments='\n\t\targs->forAll( a1 , a2 | a1.name = a2.name implies a1 = a2)'"
 * @generated
 */
public interface ProcDeclaration extends Instruction {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see example.logo.model.logoASM.LogoASMPackage#getProcDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link example.logo.model.logoASM.ProcDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link example.logo.model.logoASM.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see example.logo.model.logoASM.LogoASMPackage#getProcDeclaration_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getArgs();

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
	 * @see example.logo.model.logoASM.LogoASMPackage#getProcDeclaration_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // ProcDeclaration

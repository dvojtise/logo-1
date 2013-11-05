/**
 */
package fr.inria.diverse.k3.example.logo.model.logoASM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Proc Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.diverse.k3.example.logo.model.logoASM.ProcDeclaration#getName <em>Name</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.example.logo.model.logoASM.ProcDeclaration#getArgs <em>Args</em>}</li>
 *   <li>{@link fr.inria.diverse.k3.example.logo.model.logoASM.ProcDeclaration#getInstructions <em>Instructions</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.diverse.k3.example.logo.model.logoASM.LogoASMPackage#getProcDeclaration()
 * @model
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
	 * @see fr.inria.diverse.k3.example.logo.model.logoASM.LogoASMPackage#getProcDeclaration_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.diverse.k3.example.logo.model.logoASM.ProcDeclaration#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Args</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.k3.example.logo.model.logoASM.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Args</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' containment reference list.
	 * @see fr.inria.diverse.k3.example.logo.model.logoASM.LogoASMPackage#getProcDeclaration_Args()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getArgs();

	/**
	 * Returns the value of the '<em><b>Instructions</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.diverse.k3.example.logo.model.logoASM.Instruction}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instructions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instructions</em>' containment reference list.
	 * @see fr.inria.diverse.k3.example.logo.model.logoASM.LogoASMPackage#getProcDeclaration_Instructions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Instruction> getInstructions();

} // ProcDeclaration

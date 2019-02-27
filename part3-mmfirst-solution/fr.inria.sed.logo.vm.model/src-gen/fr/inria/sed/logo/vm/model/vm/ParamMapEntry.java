/**
 */
package fr.inria.sed.logo.vm.model.vm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Map Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.ParamMapEntry#getKey <em>Key</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.ParamMapEntry#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getParamMapEntry()
 * @model
 * @generated
 */
public interface ParamMapEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Key</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getParamMapEntry_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.vm.model.vm.ParamMapEntry#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getParamMapEntry_Value()
	 * @model default="0" required="true"
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.vm.model.vm.ParamMapEntry#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // ParamMapEntry

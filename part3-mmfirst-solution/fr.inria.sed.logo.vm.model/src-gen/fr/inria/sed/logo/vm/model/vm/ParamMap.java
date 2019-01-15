/**
 */
package fr.inria.sed.logo.vm.model.vm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Param Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.ParamMap#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getParamMap()
 * @model
 * @generated
 */
public interface ParamMap extends EObject {
	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.sed.logo.vm.model.vm.ParamMapEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getParamMap_Entries()
	 * @model containment="true"
	 * @generated
	 */
	EList<ParamMapEntry> getEntries();

} // ParamMap

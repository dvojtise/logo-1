/**
 */
package fr.inria.sed.logo.vm.model.vm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.sed.logo.vm.model.vm.VmPackage
 * @generated
 */
public interface VmFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmFactory eINSTANCE = fr.inria.sed.logo.vm.model.vm.impl.VmFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Interpreter Runtime Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interpreter Runtime Context</em>'.
	 * @generated
	 */
	InterpreterRuntimeContext createInterpreterRuntimeContext();

	/**
	 * Returns a new object of class '<em>Turtle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Turtle</em>'.
	 * @generated
	 */
	Turtle createTurtle();

	/**
	 * Returns a new object of class '<em>Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Point</em>'.
	 * @generated
	 */
	Point createPoint();

	/**
	 * Returns a new object of class '<em>Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Segment</em>'.
	 * @generated
	 */
	Segment createSegment();

	/**
	 * Returns a new object of class '<em>Param Map Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Map Entry</em>'.
	 * @generated
	 */
	ParamMapEntry createParamMapEntry();

	/**
	 * Returns a new object of class '<em>Param Map</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Param Map</em>'.
	 * @generated
	 */
	ParamMap createParamMap();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	VmPackage getVmPackage();

} //VmFactory

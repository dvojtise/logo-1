/**
 */
package fr.inria.sed.logo.vm.model.vm.impl;

import fr.inria.sed.logo.vm.model.vm.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class VmFactoryImpl extends EFactoryImpl implements VmFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static VmFactory init() {
		try {
			VmFactory theVmFactory = (VmFactory) EPackage.Registry.INSTANCE.getEFactory(VmPackage.eNS_URI);
			if (theVmFactory != null) {
				return theVmFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new VmFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case VmPackage.INTERPRETER_RUNTIME_CONTEXT:
			return createInterpreterRuntimeContext();
		case VmPackage.TURTLE:
			return createTurtle();
		case VmPackage.POINT:
			return createPoint();
		case VmPackage.SEGMENT:
			return createSegment();
		case VmPackage.PARAM_MAP_ENTRY:
			return createParamMapEntry();
		case VmPackage.PARAM_MAP:
			return createParamMap();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterpreterRuntimeContext createInterpreterRuntimeContext() {
		InterpreterRuntimeContextImpl interpreterRuntimeContext = new InterpreterRuntimeContextImpl();
		return interpreterRuntimeContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Turtle createTurtle() {
		TurtleImpl turtle = new TurtleImpl();
		return turtle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Segment createSegment() {
		SegmentImpl segment = new SegmentImpl();
		return segment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamMapEntry createParamMapEntry() {
		ParamMapEntryImpl paramMapEntry = new ParamMapEntryImpl();
		return paramMapEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamMap createParamMap() {
		ParamMapImpl paramMap = new ParamMapImpl();
		return paramMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmPackage getVmPackage() {
		return (VmPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static VmPackage getPackage() {
		return VmPackage.eINSTANCE;
	}

} //VmFactoryImpl

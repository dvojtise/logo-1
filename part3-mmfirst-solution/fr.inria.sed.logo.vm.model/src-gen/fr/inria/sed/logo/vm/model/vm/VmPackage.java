/**
 */
package fr.inria.sed.logo.vm.model.vm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fr.inria.sed.logo.vm.model.vm.VmFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore'"
 * @generated
 */
public interface VmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "vm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.inria.fr/sed/logo/vm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "vm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	VmPackage eINSTANCE = fr.inria.sed.logo.vm.model.vm.impl.VmPackageImpl.init();

	/**
	 * The meta object id for the '{@link fr.inria.sed.logo.vm.model.vm.impl.TurtleImpl <em>Turtle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.sed.logo.vm.model.vm.impl.TurtleImpl
	 * @see fr.inria.sed.logo.vm.model.vm.impl.VmPackageImpl#getTurtle()
	 * @generated
	 */
	int TURTLE = 0;

	/**
	 * The feature id for the '<em><b>Reached Points</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE__REACHED_POINTS = 0;

	/**
	 * The feature id for the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE__POSITION = 1;

	/**
	 * The feature id for the '<em><b>Segments</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE__SEGMENTS = 2;

	/**
	 * The feature id for the '<em><b>Pen Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE__PEN_UP = 3;

	/**
	 * The feature id for the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE__HEADING = 4;

	/**
	 * The number of structural features of the '<em>Turtle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Turtle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TURTLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.sed.logo.vm.model.vm.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.sed.logo.vm.model.vm.impl.PointImpl
	 * @see fr.inria.sed.logo.vm.model.vm.impl.VmPackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 1;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = 1;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link fr.inria.sed.logo.vm.model.vm.impl.SegmentImpl <em>Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fr.inria.sed.logo.vm.model.vm.impl.SegmentImpl
	 * @see fr.inria.sed.logo.vm.model.vm.impl.VmPackageImpl#getSegment()
	 * @generated
	 */
	int SEGMENT = 2;

	/**
	 * The feature id for the '<em><b>Origin</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__ORIGIN = 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT__DESTINATION = 1;

	/**
	 * The number of structural features of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link fr.inria.sed.logo.vm.model.vm.Turtle <em>Turtle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Turtle</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Turtle
	 * @generated
	 */
	EClass getTurtle();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.sed.logo.vm.model.vm.Turtle#getReachedPoints <em>Reached Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reached Points</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Turtle#getReachedPoints()
	 * @see #getTurtle()
	 * @generated
	 */
	EReference getTurtle_ReachedPoints();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.sed.logo.vm.model.vm.Turtle#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Position</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Turtle#getPosition()
	 * @see #getTurtle()
	 * @generated
	 */
	EReference getTurtle_Position();

	/**
	 * Returns the meta object for the containment reference list '{@link fr.inria.sed.logo.vm.model.vm.Turtle#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segments</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Turtle#getSegments()
	 * @see #getTurtle()
	 * @generated
	 */
	EReference getTurtle_Segments();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.sed.logo.vm.model.vm.Turtle#isPenUp <em>Pen Up</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pen Up</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Turtle#isPenUp()
	 * @see #getTurtle()
	 * @generated
	 */
	EAttribute getTurtle_PenUp();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.sed.logo.vm.model.vm.Turtle#getHeading <em>Heading</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Heading</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Turtle#getHeading()
	 * @see #getTurtle()
	 * @generated
	 */
	EAttribute getTurtle_Heading();

	/**
	 * Returns the meta object for class '{@link fr.inria.sed.logo.vm.model.vm.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.sed.logo.vm.model.vm.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link fr.inria.sed.logo.vm.model.vm.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for class '{@link fr.inria.sed.logo.vm.model.vm.Segment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segment</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Segment
	 * @generated
	 */
	EClass getSegment();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.sed.logo.vm.model.vm.Segment#getOrigin <em>Origin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Origin</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Segment#getOrigin()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Origin();

	/**
	 * Returns the meta object for the reference '{@link fr.inria.sed.logo.vm.model.vm.Segment#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see fr.inria.sed.logo.vm.model.vm.Segment#getDestination()
	 * @see #getSegment()
	 * @generated
	 */
	EReference getSegment_Destination();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	VmFactory getVmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fr.inria.sed.logo.vm.model.vm.impl.TurtleImpl <em>Turtle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.sed.logo.vm.model.vm.impl.TurtleImpl
		 * @see fr.inria.sed.logo.vm.model.vm.impl.VmPackageImpl#getTurtle()
		 * @generated
		 */
		EClass TURTLE = eINSTANCE.getTurtle();

		/**
		 * The meta object literal for the '<em><b>Reached Points</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE__REACHED_POINTS = eINSTANCE.getTurtle_ReachedPoints();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE__POSITION = eINSTANCE.getTurtle_Position();

		/**
		 * The meta object literal for the '<em><b>Segments</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TURTLE__SEGMENTS = eINSTANCE.getTurtle_Segments();

		/**
		 * The meta object literal for the '<em><b>Pen Up</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURTLE__PEN_UP = eINSTANCE.getTurtle_PenUp();

		/**
		 * The meta object literal for the '<em><b>Heading</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TURTLE__HEADING = eINSTANCE.getTurtle_Heading();

		/**
		 * The meta object literal for the '{@link fr.inria.sed.logo.vm.model.vm.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.sed.logo.vm.model.vm.impl.PointImpl
		 * @see fr.inria.sed.logo.vm.model.vm.impl.VmPackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '{@link fr.inria.sed.logo.vm.model.vm.impl.SegmentImpl <em>Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fr.inria.sed.logo.vm.model.vm.impl.SegmentImpl
		 * @see fr.inria.sed.logo.vm.model.vm.impl.VmPackageImpl#getSegment()
		 * @generated
		 */
		EClass SEGMENT = eINSTANCE.getSegment();

		/**
		 * The meta object literal for the '<em><b>Origin</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__ORIGIN = eINSTANCE.getSegment_Origin();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENT__DESTINATION = eINSTANCE.getSegment_Destination();

	}

} //VmPackage

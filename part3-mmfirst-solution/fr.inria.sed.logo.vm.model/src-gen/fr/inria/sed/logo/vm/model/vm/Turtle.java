/**
 */
package fr.inria.sed.logo.vm.model.vm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turtle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.Turtle#getReachedPoints <em>Reached Points</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.Turtle#getPosition <em>Position</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.Turtle#getSegments <em>Segments</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.Turtle#isPenUp <em>Pen Up</em>}</li>
 *   <li>{@link fr.inria.sed.logo.vm.model.vm.Turtle#getHeading <em>Heading</em>}</li>
 * </ul>
 *
 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getTurtle()
 * @model
 * @generated
 */
public interface Turtle extends EObject {
	/**
	 * Returns the value of the '<em><b>Reached Points</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.sed.logo.vm.model.vm.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reached Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reached Points</em>' containment reference list.
	 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getTurtle_ReachedPoints()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getReachedPoints();

	/**
	 * Returns the value of the '<em><b>Position</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' reference.
	 * @see #setPosition(Point)
	 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getTurtle_Position()
	 * @model
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.vm.model.vm.Turtle#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link fr.inria.sed.logo.vm.model.vm.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getTurtle_Segments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Segment> getSegments();

	/**
	 * Returns the value of the '<em><b>Pen Up</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pen Up</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pen Up</em>' attribute.
	 * @see #setPenUp(boolean)
	 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getTurtle_PenUp()
	 * @model required="true"
	 * @generated
	 */
	boolean isPenUp();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.vm.model.vm.Turtle#isPenUp <em>Pen Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pen Up</em>' attribute.
	 * @see #isPenUp()
	 * @generated
	 */
	void setPenUp(boolean value);

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(double)
	 * @see fr.inria.sed.logo.vm.model.vm.VmPackage#getTurtle_Heading()
	 * @model required="true"
	 * @generated
	 */
	double getHeading();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.vm.model.vm.Turtle#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(double value);

} // Turtle

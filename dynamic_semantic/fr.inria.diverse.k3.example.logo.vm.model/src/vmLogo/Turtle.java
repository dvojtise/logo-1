/**
 */
package vmLogo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Turtle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link vmLogo.Turtle#getPosition <em>Position</em>}</li>
 *   <li>{@link vmLogo.Turtle#getDrawings <em>Drawings</em>}</li>
 *   <li>{@link vmLogo.Turtle#getHeading <em>Heading</em>}</li>
 *   <li>{@link vmLogo.Turtle#getPenUp <em>Pen Up</em>}</li>
 *   <li>{@link vmLogo.Turtle#getPoints <em>Points</em>}</li>
 * </ul>
 * </p>
 *
 * @see vmLogo.VmLogoPackage#getTurtle()
 * @model
 * @generated
 */
public interface Turtle extends EObject {
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
	 * @see vmLogo.VmLogoPackage#getTurtle_Position()
	 * @model
	 * @generated
	 */
	Point getPosition();

	/**
	 * Sets the value of the '{@link vmLogo.Turtle#getPosition <em>Position</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' reference.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Point value);

	/**
	 * Returns the value of the '<em><b>Drawings</b></em>' containment reference list.
	 * The list contents are of type {@link vmLogo.Segment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Drawings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Drawings</em>' containment reference list.
	 * @see vmLogo.VmLogoPackage#getTurtle_Drawings()
	 * @model containment="true"
	 * @generated
	 */
	EList<Segment> getDrawings();

	/**
	 * Returns the value of the '<em><b>Heading</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Heading</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Heading</em>' attribute.
	 * @see #setHeading(int)
	 * @see vmLogo.VmLogoPackage#getTurtle_Heading()
	 * @model default="0" dataType="vmLogo.Integer"
	 * @generated
	 */
	int getHeading();

	/**
	 * Sets the value of the '{@link vmLogo.Turtle#getHeading <em>Heading</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Heading</em>' attribute.
	 * @see #getHeading()
	 * @generated
	 */
	void setHeading(int value);

	/**
	 * Returns the value of the '<em><b>Pen Up</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pen Up</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pen Up</em>' attribute.
	 * @see #setPenUp(Boolean)
	 * @see vmLogo.VmLogoPackage#getTurtle_PenUp()
	 * @model default="true" dataType="vmLogo.Boolean"
	 * @generated
	 */
	Boolean getPenUp();

	/**
	 * Sets the value of the '{@link vmLogo.Turtle#getPenUp <em>Pen Up</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pen Up</em>' attribute.
	 * @see #getPenUp()
	 * @generated
	 */
	void setPenUp(Boolean value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' containment reference list.
	 * The list contents are of type {@link vmLogo.Point}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' containment reference list.
	 * @see vmLogo.VmLogoPackage#getTurtle_Points()
	 * @model containment="true"
	 * @generated
	 */
	EList<Point> getPoints();

} // Turtle

/**
 */
package fr.inria.sed.logo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lower</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.Lower#getLhs <em>Lhs</em>}</li>
 *   <li>{@link fr.inria.sed.logo.Lower#getRhs <em>Rhs</em>}</li>
 * </ul>
 *
 * @see fr.inria.sed.logo.LogoPackage#getLower()
 * @model
 * @generated
 */
public interface Lower extends Expression {
	/**
	 * Returns the value of the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lhs</em>' containment reference.
	 * @see #setLhs(Expression)
	 * @see fr.inria.sed.logo.LogoPackage#getLower_Lhs()
	 * @model containment="true"
	 * @generated
	 */
	Expression getLhs();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.Lower#getLhs <em>Lhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lhs</em>' containment reference.
	 * @see #getLhs()
	 * @generated
	 */
	void setLhs(Expression value);

	/**
	 * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rhs</em>' containment reference.
	 * @see #setRhs(Expression)
	 * @see fr.inria.sed.logo.LogoPackage#getLower_Rhs()
	 * @model containment="true"
	 * @generated
	 */
	Expression getRhs();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.Lower#getRhs <em>Rhs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rhs</em>' containment reference.
	 * @see #getRhs()
	 * @generated
	 */
	void setRhs(Expression value);

} // Lower

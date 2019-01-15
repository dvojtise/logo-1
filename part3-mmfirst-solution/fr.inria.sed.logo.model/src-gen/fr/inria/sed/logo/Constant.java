/**
 */
package fr.inria.sed.logo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.inria.sed.logo.Constant#getIntegerValue <em>Integer Value</em>}</li>
 * </ul>
 *
 * @see fr.inria.sed.logo.LogoPackage#getConstant()
 * @model
 * @generated
 */
public interface Constant extends Expression {
	/**
	 * Returns the value of the '<em><b>Integer Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Integer Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Integer Value</em>' attribute.
	 * @see #setIntegerValue(int)
	 * @see fr.inria.sed.logo.LogoPackage#getConstant_IntegerValue()
	 * @model required="true"
	 * @generated
	 */
	int getIntegerValue();

	/**
	 * Sets the value of the '{@link fr.inria.sed.logo.Constant#getIntegerValue <em>Integer Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Integer Value</em>' attribute.
	 * @see #getIntegerValue()
	 * @generated
	 */
	void setIntegerValue(int value);

} // Constant

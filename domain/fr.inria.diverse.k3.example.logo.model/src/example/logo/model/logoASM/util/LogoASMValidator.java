/**
 */
package example.logo.model.logoASM.util;

import example.logo.model.logoASM.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see example.logo.model.logoASM.LogoASMPackage
 * @generated
 */
public class LogoASMValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final LogoASMValidator INSTANCE = new LogoASMValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "example.logo.model.logoASM";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogoASMValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return LogoASMPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case LogoASMPackage.INSTRUCTION:
				return validateInstruction((Instruction)value, diagnostics, context);
			case LogoASMPackage.PRIMITIVE:
				return validatePrimitive((Primitive)value, diagnostics, context);
			case LogoASMPackage.BACK:
				return validateBack((Back)value, diagnostics, context);
			case LogoASMPackage.FORWARD:
				return validateForward((Forward)value, diagnostics, context);
			case LogoASMPackage.LEFT:
				return validateLeft((Left)value, diagnostics, context);
			case LogoASMPackage.RIGHT:
				return validateRight((Right)value, diagnostics, context);
			case LogoASMPackage.PEN_DOWN:
				return validatePenDown((PenDown)value, diagnostics, context);
			case LogoASMPackage.PEN_UP:
				return validatePenUp((PenUp)value, diagnostics, context);
			case LogoASMPackage.CLEAR:
				return validateClear((Clear)value, diagnostics, context);
			case LogoASMPackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case LogoASMPackage.BINARY_EXP:
				return validateBinaryExp((BinaryExp)value, diagnostics, context);
			case LogoASMPackage.CONSTANT:
				return validateConstant((Constant)value, diagnostics, context);
			case LogoASMPackage.PROC_CALL:
				return validateProcCall((ProcCall)value, diagnostics, context);
			case LogoASMPackage.PROC_DECLARATION:
				return validateProcDeclaration((ProcDeclaration)value, diagnostics, context);
			case LogoASMPackage.BLOCK:
				return validateBlock((Block)value, diagnostics, context);
			case LogoASMPackage.IF:
				return validateIf((If)value, diagnostics, context);
			case LogoASMPackage.CONTROL_STRUCTURE:
				return validateControlStructure((ControlStructure)value, diagnostics, context);
			case LogoASMPackage.REPEAT:
				return validateRepeat((Repeat)value, diagnostics, context);
			case LogoASMPackage.WHILE:
				return validateWhile((While)value, diagnostics, context);
			case LogoASMPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case LogoASMPackage.PARAMETER_CALL:
				return validateParameterCall((ParameterCall)value, diagnostics, context);
			case LogoASMPackage.PLUS:
				return validatePlus((Plus)value, diagnostics, context);
			case LogoASMPackage.MINUS:
				return validateMinus((Minus)value, diagnostics, context);
			case LogoASMPackage.MULT:
				return validateMult((Mult)value, diagnostics, context);
			case LogoASMPackage.DIV:
				return validateDiv((Div)value, diagnostics, context);
			case LogoASMPackage.EQUALS:
				return validateEquals((Equals)value, diagnostics, context);
			case LogoASMPackage.GREATER:
				return validateGreater((Greater)value, diagnostics, context);
			case LogoASMPackage.LOWER:
				return validateLower((Lower)value, diagnostics, context);
			case LogoASMPackage.LOGO_PROGRAM:
				return validateLogoProgram((LogoProgram)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInstruction(Instruction instruction, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(instruction, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrimitive(Primitive primitive, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(primitive, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBack(Back back, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(back, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateForward(Forward forward, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(forward, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeft(Left left, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(left, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRight(Right right, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(right, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePenDown(PenDown penDown, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(penDown, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePenUp(PenUp penUp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(penUp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClear(Clear clear, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clear, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryExp(BinaryExp binaryExp, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryExp, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConstant(Constant constant, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(constant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcCall(ProcCall procCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procCall, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(procCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procCall, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procCall, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcCall_same_number_of_formals_and_actuals(procCall, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the same_number_of_formals_and_actuals constraint of '<em>Proc Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROC_CALL__SAME_NUMBER_OF_FORMALS_AND_ACTUALS__EEXPRESSION = "actualArgs->size() = declaration.args->size()";

	/**
	 * Validates the same_number_of_formals_and_actuals constraint of '<em>Proc Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcCall_same_number_of_formals_and_actuals(ProcCall procCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LogoASMPackage.Literals.PROC_CALL,
				 procCall,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "same_number_of_formals_and_actuals",
				 PROC_CALL__SAME_NUMBER_OF_FORMALS_AND_ACTUALS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcDeclaration(ProcDeclaration procDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(procDeclaration, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(procDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(procDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(procDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(procDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(procDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(procDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(procDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(procDeclaration, diagnostics, context);
		if (result || diagnostics != null) result &= validateProcDeclaration_unique_names_for_formal_arguments(procDeclaration, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the unique_names_for_formal_arguments constraint of '<em>Proc Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String PROC_DECLARATION__UNIQUE_NAMES_FOR_FORMAL_ARGUMENTS__EEXPRESSION = "\n" +
		"\t\targs->forAll( a1 , a2 | a1.name = a2.name implies a1 = a2)";

	/**
	 * Validates the unique_names_for_formal_arguments constraint of '<em>Proc Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProcDeclaration_unique_names_for_formal_arguments(ProcDeclaration procDeclaration, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(LogoASMPackage.Literals.PROC_DECLARATION,
				 procDeclaration,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "unique_names_for_formal_arguments",
				 PROC_DECLARATION__UNIQUE_NAMES_FOR_FORMAL_ARGUMENTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBlock(Block block, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(block, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIf(If if_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(if_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateControlStructure(ControlStructure controlStructure, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(controlStructure, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRepeat(Repeat repeat, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(repeat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWhile(While while_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(while_, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterCall(ParameterCall parameterCall, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameterCall, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlus(Plus plus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(plus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMinus(Minus minus, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(minus, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMult(Mult mult, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(mult, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDiv(Div div, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(div, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEquals(Equals equals, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(equals, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGreater(Greater greater, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(greater, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLower(Lower lower, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(lower, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLogoProgram(LogoProgram logoProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(logoProgram, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //LogoASMValidator

/**
 */
package fr.inria.sed.logo.impl;

import fr.inria.sed.logo.Backward;
import fr.inria.sed.logo.Block;
import fr.inria.sed.logo.Clear;
import fr.inria.sed.logo.Constant;
import fr.inria.sed.logo.ControlStructureInstruction;
import fr.inria.sed.logo.Div;
import fr.inria.sed.logo.Equals;
import fr.inria.sed.logo.Expression;
import fr.inria.sed.logo.Forward;
import fr.inria.sed.logo.Greater;
import fr.inria.sed.logo.If;
import fr.inria.sed.logo.Instruction;
import fr.inria.sed.logo.Left;
import fr.inria.sed.logo.LogoFactory;
import fr.inria.sed.logo.LogoPackage;
import fr.inria.sed.logo.LogoProgram;
import fr.inria.sed.logo.Lower;
import fr.inria.sed.logo.Minus;
import fr.inria.sed.logo.Mult;
import fr.inria.sed.logo.Parameter;
import fr.inria.sed.logo.ParameterCall;
import fr.inria.sed.logo.PenDown;
import fr.inria.sed.logo.PenUp;
import fr.inria.sed.logo.Plus;
import fr.inria.sed.logo.PrimitiveInstruction;
import fr.inria.sed.logo.ProcCall;
import fr.inria.sed.logo.ProcDeclaration;
import fr.inria.sed.logo.Repeat;
import fr.inria.sed.logo.Right;
import fr.inria.sed.logo.RuntimeContext;
import fr.inria.sed.logo.While;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LogoPackageImpl extends EPackageImpl implements LogoPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logoProgramEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass instructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass backwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass forwardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass leftEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rightEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass penDownEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass penUpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clearEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass constantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass procDeclarationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass repeatEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass whileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass equalsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass greaterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lowerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass plusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass minusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass divEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass controlStructureInstructionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runtimeContextEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fr.inria.sed.logo.LogoPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private LogoPackageImpl() {
		super(eNS_URI, LogoFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link LogoPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static LogoPackage init() {
		if (isInited)
			return (LogoPackage) EPackage.Registry.INSTANCE.getEPackage(LogoPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredLogoPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		LogoPackageImpl theLogoPackage = registeredLogoPackage instanceof LogoPackageImpl
				? (LogoPackageImpl) registeredLogoPackage
				: new LogoPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theLogoPackage.createPackageContents();

		// Initialize created meta-data
		theLogoPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theLogoPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(LogoPackage.eNS_URI, theLogoPackage);
		return theLogoPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogoProgram() {
		return logoProgramEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogoProgram_Instructions() {
		return (EReference) logoProgramEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogoProgram_RuntimeContext() {
		return (EReference) logoProgramEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstruction() {
		return instructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBackward() {
		return backwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBackward_Steps() {
		return (EReference) backwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getForward() {
		return forwardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getForward_Steps() {
		return (EReference) forwardEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLeft() {
		return leftEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLeft_Angle() {
		return (EReference) leftEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRight() {
		return rightEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRight_Angle() {
		return (EReference) rightEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPenDown() {
		return penDownEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPenUp() {
		return penUpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClear() {
		return clearEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConstant() {
		return constantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConstant_IntegerValue() {
		return (EAttribute) constantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcCall() {
		return procCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcCall_Declaration() {
		return (EReference) procCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcCall_ActualArgs() {
		return (EReference) procCallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProcDeclaration() {
		return procDeclarationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProcDeclaration_Name() {
		return (EAttribute) procDeclarationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcDeclaration_Args() {
		return (EReference) procDeclarationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProcDeclaration_Instructions() {
		return (EReference) procDeclarationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameter_Name() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBlock() {
		return blockEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBlock_Instructions() {
		return (EReference) blockEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIf() {
		return ifEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_Condition() {
		return (EReference) ifEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_ThenPart() {
		return (EReference) ifEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIf_ElsePart() {
		return (EReference) ifEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRepeat() {
		return repeatEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeat_Condition() {
		return (EReference) repeatEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRepeat_Block() {
		return (EReference) repeatEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWhile() {
		return whileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhile_Condition() {
		return (EReference) whileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWhile_Block() {
		return (EReference) whileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterCall() {
		return parameterCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterCall_Parameter() {
		return (EReference) parameterCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExpression() {
		return expressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEquals() {
		return equalsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquals_Lhs() {
		return (EReference) equalsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEquals_Rhs() {
		return (EReference) equalsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGreater() {
		return greaterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGreater_Lhs() {
		return (EReference) greaterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGreater_Rhs() {
		return (EReference) greaterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLower() {
		return lowerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLower_Lhs() {
		return (EReference) lowerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLower_Rhs() {
		return (EReference) lowerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPlus() {
		return plusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlus_Lhs() {
		return (EReference) plusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPlus_Rhs() {
		return (EReference) plusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMinus() {
		return minusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinus_Lhs() {
		return (EReference) minusEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMinus_Rhs() {
		return (EReference) minusEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMult() {
		return multEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMult_Lhs() {
		return (EReference) multEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMult_Rhs() {
		return (EReference) multEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiv() {
		return divEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiv_Lhs() {
		return (EReference) divEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDiv_Rhs() {
		return (EReference) divEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrimitiveInstruction() {
		return primitiveInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getControlStructureInstruction() {
		return controlStructureInstructionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRuntimeContext() {
		return runtimeContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogoFactory getLogoFactory() {
		return (LogoFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		logoProgramEClass = createEClass(LOGO_PROGRAM);
		createEReference(logoProgramEClass, LOGO_PROGRAM__INSTRUCTIONS);
		createEReference(logoProgramEClass, LOGO_PROGRAM__RUNTIME_CONTEXT);

		instructionEClass = createEClass(INSTRUCTION);

		backwardEClass = createEClass(BACKWARD);
		createEReference(backwardEClass, BACKWARD__STEPS);

		forwardEClass = createEClass(FORWARD);
		createEReference(forwardEClass, FORWARD__STEPS);

		leftEClass = createEClass(LEFT);
		createEReference(leftEClass, LEFT__ANGLE);

		rightEClass = createEClass(RIGHT);
		createEReference(rightEClass, RIGHT__ANGLE);

		penDownEClass = createEClass(PEN_DOWN);

		penUpEClass = createEClass(PEN_UP);

		clearEClass = createEClass(CLEAR);

		constantEClass = createEClass(CONSTANT);
		createEAttribute(constantEClass, CONSTANT__INTEGER_VALUE);

		procCallEClass = createEClass(PROC_CALL);
		createEReference(procCallEClass, PROC_CALL__DECLARATION);
		createEReference(procCallEClass, PROC_CALL__ACTUAL_ARGS);

		procDeclarationEClass = createEClass(PROC_DECLARATION);
		createEAttribute(procDeclarationEClass, PROC_DECLARATION__NAME);
		createEReference(procDeclarationEClass, PROC_DECLARATION__ARGS);
		createEReference(procDeclarationEClass, PROC_DECLARATION__INSTRUCTIONS);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__NAME);

		blockEClass = createEClass(BLOCK);
		createEReference(blockEClass, BLOCK__INSTRUCTIONS);

		ifEClass = createEClass(IF);
		createEReference(ifEClass, IF__CONDITION);
		createEReference(ifEClass, IF__THEN_PART);
		createEReference(ifEClass, IF__ELSE_PART);

		repeatEClass = createEClass(REPEAT);
		createEReference(repeatEClass, REPEAT__CONDITION);
		createEReference(repeatEClass, REPEAT__BLOCK);

		whileEClass = createEClass(WHILE);
		createEReference(whileEClass, WHILE__CONDITION);
		createEReference(whileEClass, WHILE__BLOCK);

		parameterCallEClass = createEClass(PARAMETER_CALL);
		createEReference(parameterCallEClass, PARAMETER_CALL__PARAMETER);

		expressionEClass = createEClass(EXPRESSION);

		equalsEClass = createEClass(EQUALS);
		createEReference(equalsEClass, EQUALS__LHS);
		createEReference(equalsEClass, EQUALS__RHS);

		greaterEClass = createEClass(GREATER);
		createEReference(greaterEClass, GREATER__LHS);
		createEReference(greaterEClass, GREATER__RHS);

		lowerEClass = createEClass(LOWER);
		createEReference(lowerEClass, LOWER__LHS);
		createEReference(lowerEClass, LOWER__RHS);

		plusEClass = createEClass(PLUS);
		createEReference(plusEClass, PLUS__LHS);
		createEReference(plusEClass, PLUS__RHS);

		minusEClass = createEClass(MINUS);
		createEReference(minusEClass, MINUS__LHS);
		createEReference(minusEClass, MINUS__RHS);

		multEClass = createEClass(MULT);
		createEReference(multEClass, MULT__LHS);
		createEReference(multEClass, MULT__RHS);

		divEClass = createEClass(DIV);
		createEReference(divEClass, DIV__LHS);
		createEReference(divEClass, DIV__RHS);

		primitiveInstructionEClass = createEClass(PRIMITIVE_INSTRUCTION);

		controlStructureInstructionEClass = createEClass(CONTROL_STRUCTURE_INSTRUCTION);

		runtimeContextEClass = createEClass(RUNTIME_CONTEXT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		backwardEClass.getESuperTypes().add(this.getPrimitiveInstruction());
		forwardEClass.getESuperTypes().add(this.getPrimitiveInstruction());
		leftEClass.getESuperTypes().add(this.getPrimitiveInstruction());
		rightEClass.getESuperTypes().add(this.getPrimitiveInstruction());
		penDownEClass.getESuperTypes().add(this.getPrimitiveInstruction());
		penUpEClass.getESuperTypes().add(this.getPrimitiveInstruction());
		clearEClass.getESuperTypes().add(this.getPrimitiveInstruction());
		constantEClass.getESuperTypes().add(this.getExpression());
		procCallEClass.getESuperTypes().add(this.getPrimitiveInstruction());
		procDeclarationEClass.getESuperTypes().add(this.getInstruction());
		blockEClass.getESuperTypes().add(this.getInstruction());
		ifEClass.getESuperTypes().add(this.getControlStructureInstruction());
		repeatEClass.getESuperTypes().add(this.getControlStructureInstruction());
		whileEClass.getESuperTypes().add(this.getControlStructureInstruction());
		parameterCallEClass.getESuperTypes().add(this.getExpression());
		parameterCallEClass.getESuperTypes().add(this.getPrimitiveInstruction());
		equalsEClass.getESuperTypes().add(this.getExpression());
		greaterEClass.getESuperTypes().add(this.getExpression());
		lowerEClass.getESuperTypes().add(this.getExpression());
		plusEClass.getESuperTypes().add(this.getExpression());
		minusEClass.getESuperTypes().add(this.getExpression());
		multEClass.getESuperTypes().add(this.getExpression());
		divEClass.getESuperTypes().add(this.getExpression());
		primitiveInstructionEClass.getESuperTypes().add(this.getInstruction());
		controlStructureInstructionEClass.getESuperTypes().add(this.getInstruction());

		// Initialize classes, features, and operations; add parameters
		initEClass(logoProgramEClass, LogoProgram.class, "LogoProgram", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogoProgram_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1,
				LogoProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLogoProgram_RuntimeContext(), this.getRuntimeContext(), null, "runtimeContext", null, 0, 1,
				LogoProgram.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(backwardEClass, Backward.class, "Backward", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBackward_Steps(), this.getExpression(), null, "steps", null, 0, 1, Backward.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(forwardEClass, Forward.class, "Forward", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getForward_Steps(), this.getExpression(), null, "steps", null, 0, 1, Forward.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(leftEClass, Left.class, "Left", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLeft_Angle(), this.getExpression(), null, "angle", null, 0, 1, Left.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(rightEClass, Right.class, "Right", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRight_Angle(), this.getExpression(), null, "angle", null, 0, 1, Right.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(penDownEClass, PenDown.class, "PenDown", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(penUpEClass, PenUp.class, "PenUp", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(clearEClass, Clear.class, "Clear", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(constantEClass, Constant.class, "Constant", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConstant_IntegerValue(), ecorePackage.getEInt(), "integerValue", null, 1, 1, Constant.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procCallEClass, ProcCall.class, "ProcCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getProcCall_Declaration(), this.getProcDeclaration(), null, "declaration", null, 0, 1,
				ProcCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcCall_ActualArgs(), this.getExpression(), null, "actualArgs", null, 0, -1, ProcCall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(procDeclarationEClass, ProcDeclaration.class, "ProcDeclaration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProcDeclaration_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProcDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcDeclaration_Args(), this.getParameter(), null, "args", null, 0, -1, ProcDeclaration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProcDeclaration_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1,
				ProcDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockEClass, Block.class, "Block", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlock_Instructions(), this.getInstruction(), null, "instructions", null, 0, -1, Block.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifEClass, If.class, "If", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getIf_Condition(), this.getExpression(), null, "condition", null, 0, 1, If.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getIf_ThenPart(), this.getBlock(), null, "thenPart", null, 0, 1, If.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getIf_ElsePart(), this.getBlock(), null, "elsePart", null, 0, 1, If.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(repeatEClass, Repeat.class, "Repeat", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRepeat_Condition(), this.getExpression(), null, "condition", null, 0, 1, Repeat.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRepeat_Block(), this.getBlock(), null, "block", null, 0, 1, Repeat.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(whileEClass, While.class, "While", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWhile_Condition(), this.getExpression(), null, "condition", null, 0, 1, While.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getWhile_Block(), this.getBlock(), null, "block", null, 0, 1, While.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(parameterCallEClass, ParameterCall.class, "ParameterCall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getParameterCall_Parameter(), this.getParameter(), null, "parameter", null, 0, 1,
				ParameterCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(expressionEClass, Expression.class, "Expression", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(equalsEClass, Equals.class, "Equals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEquals_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, Equals.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getEquals_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, Equals.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(greaterEClass, Greater.class, "Greater", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGreater_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, Greater.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getGreater_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, Greater.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(lowerEClass, Lower.class, "Lower", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLower_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, Lower.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getLower_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, Lower.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(plusEClass, Plus.class, "Plus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPlus_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, Plus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getPlus_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, Plus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(minusEClass, Minus.class, "Minus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMinus_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, Minus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMinus_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, Minus.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(multEClass, Mult.class, "Mult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMult_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, Mult.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMult_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, Mult.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDiv_Lhs(), this.getExpression(), null, "lhs", null, 0, 1, Div.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getDiv_Rhs(), this.getExpression(), null, "rhs", null, 0, 1, Div.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(primitiveInstructionEClass, PrimitiveInstruction.class, "PrimitiveInstruction", IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(controlStructureInstructionEClass, ControlStructureInstruction.class, "ControlStructureInstruction",
				IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(runtimeContextEClass, RuntimeContext.class, "RuntimeContext", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/OCL/Import
		createImportAnnotations();
		// aspect
		createAspectAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createImportAnnotations() {
		String source = "http://www.eclipse.org/OCL/Import";
		addAnnotation(this, source, new String[] { "ecore", "http://www.eclipse.org/emf/2002/Ecore" });
	}

	/**
	 * Initializes the annotations for <b>aspect</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAspectAnnotations() {
		String source = "aspect";
		addAnnotation(getLogoProgram_RuntimeContext(), source, new String[] {});
	}

} //LogoPackageImpl

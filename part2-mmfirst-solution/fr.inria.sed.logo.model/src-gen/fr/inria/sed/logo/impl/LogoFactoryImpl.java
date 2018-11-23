/**
 */
package fr.inria.sed.logo.impl;

import fr.inria.sed.logo.*;

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
public class LogoFactoryImpl extends EFactoryImpl implements LogoFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LogoFactory init() {
		try {
			LogoFactory theLogoFactory = (LogoFactory) EPackage.Registry.INSTANCE.getEFactory(LogoPackage.eNS_URI);
			if (theLogoFactory != null) {
				return theLogoFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new LogoFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogoFactoryImpl() {
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
		case LogoPackage.LOGO_PROGRAM:
			return createLogoProgram();
		case LogoPackage.INSTRUCTION:
			return createInstruction();
		case LogoPackage.BACKWARD:
			return createBackward();
		case LogoPackage.FORWARD:
			return createForward();
		case LogoPackage.LEFT:
			return createLeft();
		case LogoPackage.RIGHT:
			return createRight();
		case LogoPackage.PEN_DOWN:
			return createPenDown();
		case LogoPackage.PEN_UP:
			return createPenUp();
		case LogoPackage.CLEAR:
			return createClear();
		case LogoPackage.CONSTANT:
			return createConstant();
		case LogoPackage.PROC_CALL:
			return createProcCall();
		case LogoPackage.PROC_DECLARATION:
			return createProcDeclaration();
		case LogoPackage.PARAMETER:
			return createParameter();
		case LogoPackage.BLOCK:
			return createBlock();
		case LogoPackage.IF:
			return createIf();
		case LogoPackage.REPEAT:
			return createRepeat();
		case LogoPackage.WHILE:
			return createWhile();
		case LogoPackage.PARAMETER_CALL:
			return createParameterCall();
		case LogoPackage.EXPRESSION:
			return createExpression();
		case LogoPackage.EQUALS:
			return createEquals();
		case LogoPackage.GREATER:
			return createGreater();
		case LogoPackage.LOWER:
			return createLower();
		case LogoPackage.PLUS:
			return createPlus();
		case LogoPackage.MINUS:
			return createMinus();
		case LogoPackage.MULT:
			return createMult();
		case LogoPackage.DIV:
			return createDiv();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogoProgram createLogoProgram() {
		LogoProgramImpl logoProgram = new LogoProgramImpl();
		return logoProgram;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instruction createInstruction() {
		InstructionImpl instruction = new InstructionImpl();
		return instruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Backward createBackward() {
		BackwardImpl backward = new BackwardImpl();
		return backward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Forward createForward() {
		ForwardImpl forward = new ForwardImpl();
		return forward;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Left createLeft() {
		LeftImpl left = new LeftImpl();
		return left;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Right createRight() {
		RightImpl right = new RightImpl();
		return right;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenDown createPenDown() {
		PenDownImpl penDown = new PenDownImpl();
		return penDown;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PenUp createPenUp() {
		PenUpImpl penUp = new PenUpImpl();
		return penUp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clear createClear() {
		ClearImpl clear = new ClearImpl();
		return clear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constant createConstant() {
		ConstantImpl constant = new ConstantImpl();
		return constant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcCall createProcCall() {
		ProcCallImpl procCall = new ProcCallImpl();
		return procCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcDeclaration createProcDeclaration() {
		ProcDeclarationImpl procDeclaration = new ProcDeclarationImpl();
		return procDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public If createIf() {
		IfImpl if_ = new IfImpl();
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Repeat createRepeat() {
		RepeatImpl repeat = new RepeatImpl();
		return repeat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public While createWhile() {
		WhileImpl while_ = new WhileImpl();
		return while_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterCall createParameterCall() {
		ParameterCallImpl parameterCall = new ParameterCallImpl();
		return parameterCall;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression createExpression() {
		ExpressionImpl expression = new ExpressionImpl();
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Equals createEquals() {
		EqualsImpl equals = new EqualsImpl();
		return equals;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Greater createGreater() {
		GreaterImpl greater = new GreaterImpl();
		return greater;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lower createLower() {
		LowerImpl lower = new LowerImpl();
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Plus createPlus() {
		PlusImpl plus = new PlusImpl();
		return plus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Minus createMinus() {
		MinusImpl minus = new MinusImpl();
		return minus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mult createMult() {
		MultImpl mult = new MultImpl();
		return mult;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Div createDiv() {
		DivImpl div = new DivImpl();
		return div;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogoPackage getLogoPackage() {
		return (LogoPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static LogoPackage getPackage() {
		return LogoPackage.eINSTANCE;
	}

} //LogoFactoryImpl

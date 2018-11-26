/**
 */
package fr.inria.sed.logo.util;

import fr.inria.sed.logo.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see fr.inria.sed.logo.LogoPackage
 * @generated
 */
public class LogoSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static LogoPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogoSwitch() {
		if (modelPackage == null) {
			modelPackage = LogoPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case LogoPackage.LOGO_PROGRAM: {
			LogoProgram logoProgram = (LogoProgram) theEObject;
			T result = caseLogoProgram(logoProgram);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.INSTRUCTION: {
			Instruction instruction = (Instruction) theEObject;
			T result = caseInstruction(instruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.BACKWARD: {
			Backward backward = (Backward) theEObject;
			T result = caseBackward(backward);
			if (result == null)
				result = casePrimitiveInstruction(backward);
			if (result == null)
				result = caseInstruction(backward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.FORWARD: {
			Forward forward = (Forward) theEObject;
			T result = caseForward(forward);
			if (result == null)
				result = casePrimitiveInstruction(forward);
			if (result == null)
				result = caseInstruction(forward);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.LEFT: {
			Left left = (Left) theEObject;
			T result = caseLeft(left);
			if (result == null)
				result = casePrimitiveInstruction(left);
			if (result == null)
				result = caseInstruction(left);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.RIGHT: {
			Right right = (Right) theEObject;
			T result = caseRight(right);
			if (result == null)
				result = casePrimitiveInstruction(right);
			if (result == null)
				result = caseInstruction(right);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.PEN_DOWN: {
			PenDown penDown = (PenDown) theEObject;
			T result = casePenDown(penDown);
			if (result == null)
				result = casePrimitiveInstruction(penDown);
			if (result == null)
				result = caseInstruction(penDown);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.PEN_UP: {
			PenUp penUp = (PenUp) theEObject;
			T result = casePenUp(penUp);
			if (result == null)
				result = casePrimitiveInstruction(penUp);
			if (result == null)
				result = caseInstruction(penUp);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.CLEAR: {
			Clear clear = (Clear) theEObject;
			T result = caseClear(clear);
			if (result == null)
				result = casePrimitiveInstruction(clear);
			if (result == null)
				result = caseInstruction(clear);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.CONSTANT: {
			Constant constant = (Constant) theEObject;
			T result = caseConstant(constant);
			if (result == null)
				result = caseExpression(constant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.PROC_CALL: {
			ProcCall procCall = (ProcCall) theEObject;
			T result = caseProcCall(procCall);
			if (result == null)
				result = casePrimitiveInstruction(procCall);
			if (result == null)
				result = caseInstruction(procCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.PROC_DECLARATION: {
			ProcDeclaration procDeclaration = (ProcDeclaration) theEObject;
			T result = caseProcDeclaration(procDeclaration);
			if (result == null)
				result = caseInstruction(procDeclaration);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.PARAMETER: {
			Parameter parameter = (Parameter) theEObject;
			T result = caseParameter(parameter);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.BLOCK: {
			Block block = (Block) theEObject;
			T result = caseBlock(block);
			if (result == null)
				result = caseInstruction(block);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.IF: {
			If if_ = (If) theEObject;
			T result = caseIf(if_);
			if (result == null)
				result = caseControlStructureInstruction(if_);
			if (result == null)
				result = caseInstruction(if_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.REPEAT: {
			Repeat repeat = (Repeat) theEObject;
			T result = caseRepeat(repeat);
			if (result == null)
				result = caseControlStructureInstruction(repeat);
			if (result == null)
				result = caseInstruction(repeat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.WHILE: {
			While while_ = (While) theEObject;
			T result = caseWhile(while_);
			if (result == null)
				result = caseControlStructureInstruction(while_);
			if (result == null)
				result = caseInstruction(while_);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.PARAMETER_CALL: {
			ParameterCall parameterCall = (ParameterCall) theEObject;
			T result = caseParameterCall(parameterCall);
			if (result == null)
				result = caseExpression(parameterCall);
			if (result == null)
				result = casePrimitiveInstruction(parameterCall);
			if (result == null)
				result = caseInstruction(parameterCall);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.EXPRESSION: {
			Expression expression = (Expression) theEObject;
			T result = caseExpression(expression);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.EQUALS: {
			Equals equals = (Equals) theEObject;
			T result = caseEquals(equals);
			if (result == null)
				result = caseExpression(equals);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.GREATER: {
			Greater greater = (Greater) theEObject;
			T result = caseGreater(greater);
			if (result == null)
				result = caseExpression(greater);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.LOWER: {
			Lower lower = (Lower) theEObject;
			T result = caseLower(lower);
			if (result == null)
				result = caseExpression(lower);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.PLUS: {
			Plus plus = (Plus) theEObject;
			T result = casePlus(plus);
			if (result == null)
				result = caseExpression(plus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.MINUS: {
			Minus minus = (Minus) theEObject;
			T result = caseMinus(minus);
			if (result == null)
				result = caseExpression(minus);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.MULT: {
			Mult mult = (Mult) theEObject;
			T result = caseMult(mult);
			if (result == null)
				result = caseExpression(mult);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.DIV: {
			Div div = (Div) theEObject;
			T result = caseDiv(div);
			if (result == null)
				result = caseExpression(div);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.PRIMITIVE_INSTRUCTION: {
			PrimitiveInstruction primitiveInstruction = (PrimitiveInstruction) theEObject;
			T result = casePrimitiveInstruction(primitiveInstruction);
			if (result == null)
				result = caseInstruction(primitiveInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case LogoPackage.CONTROL_STRUCTURE_INSTRUCTION: {
			ControlStructureInstruction controlStructureInstruction = (ControlStructureInstruction) theEObject;
			T result = caseControlStructureInstruction(controlStructureInstruction);
			if (result == null)
				result = caseInstruction(controlStructureInstruction);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Program</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Program</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogoProgram(LogoProgram object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstruction(Instruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Backward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Backward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBackward(Backward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Forward</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseForward(Forward object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Left</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Left</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLeft(Left object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Right</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Right</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRight(Right object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pen Down</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pen Down</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePenDown(PenDown object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pen Up</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pen Up</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePenUp(PenUp object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clear</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clear</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClear(Clear object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConstant(Constant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proc Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proc Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcCall(ProcCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Proc Declaration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Proc Declaration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProcDeclaration(ProcDeclaration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameter(Parameter object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>If</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>If</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIf(If object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Repeat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRepeat(Repeat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>While</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>While</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWhile(While object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterCall(ParameterCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExpression(Expression object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Equals</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEquals(Equals object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Greater</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGreater(Greater object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Lower</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Lower</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLower(Lower object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePlus(Plus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Minus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMinus(Minus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mult</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mult</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMult(Mult object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Div</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiv(Div object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Primitive Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Primitive Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrimitiveInstruction(PrimitiveInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Control Structure Instruction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Control Structure Instruction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseControlStructureInstruction(ControlStructureInstruction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //LogoSwitch

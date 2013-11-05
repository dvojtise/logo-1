package fr.inria.diverse.k3.example.logo.xtext_editor.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.inria.diverse.k3.example.logo.model.logoASM.Back;
import fr.inria.diverse.k3.example.logo.model.logoASM.Block;
import fr.inria.diverse.k3.example.logo.model.logoASM.Clear;
import fr.inria.diverse.k3.example.logo.model.logoASM.Constant;
import fr.inria.diverse.k3.example.logo.model.logoASM.Div;
import fr.inria.diverse.k3.example.logo.model.logoASM.Equals;
import fr.inria.diverse.k3.example.logo.model.logoASM.Forward;
import fr.inria.diverse.k3.example.logo.model.logoASM.Greater;
import fr.inria.diverse.k3.example.logo.model.logoASM.If;
import fr.inria.diverse.k3.example.logo.model.logoASM.Left;
import fr.inria.diverse.k3.example.logo.model.logoASM.LogoASMPackage;
import fr.inria.diverse.k3.example.logo.model.logoASM.LogoProgram;
import fr.inria.diverse.k3.example.logo.model.logoASM.Lower;
import fr.inria.diverse.k3.example.logo.model.logoASM.Minus;
import fr.inria.diverse.k3.example.logo.model.logoASM.Mult;
import fr.inria.diverse.k3.example.logo.model.logoASM.Parameter;
import fr.inria.diverse.k3.example.logo.model.logoASM.ParameterCall;
import fr.inria.diverse.k3.example.logo.model.logoASM.PenDown;
import fr.inria.diverse.k3.example.logo.model.logoASM.PenUp;
import fr.inria.diverse.k3.example.logo.model.logoASM.Plus;
import fr.inria.diverse.k3.example.logo.model.logoASM.ProcCall;
import fr.inria.diverse.k3.example.logo.model.logoASM.ProcDeclaration;
import fr.inria.diverse.k3.example.logo.model.logoASM.Repeat;
import fr.inria.diverse.k3.example.logo.model.logoASM.Right;
import fr.inria.diverse.k3.example.logo.model.logoASM.While;
import fr.inria.diverse.k3.example.logo.xtext_editor.services.LogoTextualSyntaxGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public abstract class AbstractLogoTextualSyntaxSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LogoTextualSyntaxGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == LogoASMPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case LogoASMPackage.BACK:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getBackRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Back(context, (Back) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.BLOCK:
				if(context == grammarAccess.getBlockRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Block(context, (Block) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.CLEAR:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getClearRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Clear(context, (Clear) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.CONSTANT:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0() ||
				   context == grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0() ||
				   context == grammarAccess.getConstantRule() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0() ||
				   context == grammarAccess.getLiteralsExpressionRule() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0() ||
				   context == grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0()) {
					sequence_Constant(context, (Constant) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.DIV:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0() ||
				   context == grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0() ||
				   context == grammarAccess.getLiteralsExpressionRule() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0() ||
				   context == grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0()) {
					sequence_MultExpression(context, (Div) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.EQUALS:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0() ||
				   context == grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0() ||
				   context == grammarAccess.getLiteralsExpressionRule() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0() ||
				   context == grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0()) {
					sequence_EqualExpression(context, (Equals) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.FORWARD:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getForwardRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_Forward(context, (Forward) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.GREATER:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0() ||
				   context == grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0() ||
				   context == grammarAccess.getLiteralsExpressionRule() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0() ||
				   context == grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0()) {
					sequence_ComparisonExpression(context, (Greater) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.IF:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getIfRule() ||
				   context == grammarAccess.getInstructionRule()) {
					sequence_If(context, (If) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.LEFT:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getLeftRule()) {
					sequence_Left(context, (Left) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.LOGO_PROGRAM:
				if(context == grammarAccess.getLogoProgramRule()) {
					sequence_LogoProgram(context, (LogoProgram) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.LOWER:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0() ||
				   context == grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0() ||
				   context == grammarAccess.getLiteralsExpressionRule() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0() ||
				   context == grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0()) {
					sequence_ComparisonExpression(context, (Lower) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.MINUS:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0() ||
				   context == grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0() ||
				   context == grammarAccess.getLiteralsExpressionRule() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0() ||
				   context == grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0()) {
					sequence_AddExpression(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.MULT:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0() ||
				   context == grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0() ||
				   context == grammarAccess.getLiteralsExpressionRule() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0() ||
				   context == grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0()) {
					sequence_MultExpression(context, (Mult) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.PARAMETER:
				if(context == grammarAccess.getParameterRule()) {
					sequence_Parameter(context, (Parameter) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.PARAMETER_CALL:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0() ||
				   context == grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0() ||
				   context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0() ||
				   context == grammarAccess.getLiteralsExpressionRule() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0() ||
				   context == grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0() ||
				   context == grammarAccess.getParameterCallRule()) {
					sequence_ParameterCall(context, (ParameterCall) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.PEN_DOWN:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getPenDownRule()) {
					sequence_PenDown(context, (PenDown) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.PEN_UP:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getPenUpRule()) {
					sequence_PenUp(context, (PenUp) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.PLUS:
				if(context == grammarAccess.getAddExpressionRule() ||
				   context == grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0() ||
				   context == grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionRule() ||
				   context == grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0() ||
				   context == grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0() ||
				   context == grammarAccess.getEqualExpressionRule() ||
				   context == grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0() ||
				   context == grammarAccess.getLiteralsExpressionRule() ||
				   context == grammarAccess.getMultExpressionRule() ||
				   context == grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0() ||
				   context == grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0()) {
					sequence_AddExpression(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.PROC_CALL:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getProcCallRule()) {
					sequence_ProcCall(context, (ProcCall) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.PROC_DECLARATION:
				if(context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getProcDeclarationRule()) {
					sequence_ProcDeclaration(context, (ProcDeclaration) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.REPEAT:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getRepeatRule()) {
					sequence_Repeat(context, (Repeat) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.RIGHT:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getRightRule()) {
					sequence_Right(context, (Right) semanticObject); 
					return; 
				}
				else break;
			case LogoASMPackage.WHILE:
				if(context == grammarAccess.getBInstructionRule() ||
				   context == grammarAccess.getInstructionRule() ||
				   context == grammarAccess.getWhileRule()) {
					sequence_While(context, (While) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (lhs=AddExpression_Minus_1_0_1_0 rhs=MultExpression)
	 */
	protected void sequence_AddExpression(EObject context, Minus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS));
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddExpressionAccess().getMinusLhsAction_1_0_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAddExpressionAccess().getRhsMultExpressionParserRuleCall_1_1_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=AddExpression_Plus_1_0_0_0 rhs=MultExpression)
	 */
	protected void sequence_AddExpression(EObject context, Plus semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS));
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAddExpressionAccess().getPlusLhsAction_1_0_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getAddExpressionAccess().getRhsMultExpressionParserRuleCall_1_1_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     steps=LiteralsExpression
	 */
	protected void sequence_Back(EObject context, Back semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BACK__STEPS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BACK__STEPS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getBackAccess().getStepsLiteralsExpressionParserRuleCall_1_0(), semanticObject.getSteps());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (instructions+=BInstruction*)
	 */
	protected void sequence_Block(EObject context, Block semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Clear}
	 */
	protected void sequence_Clear(EObject context, Clear semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=ComparisonExpression_Greater_1_0_0_0 rhs=AddExpression)
	 */
	protected void sequence_ComparisonExpression(EObject context, Greater semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS));
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonExpressionAccess().getGreaterLhsAction_1_0_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getComparisonExpressionAccess().getRhsAddExpressionParserRuleCall_1_1_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=ComparisonExpression_Lower_1_0_1_0 rhs=AddExpression)
	 */
	protected void sequence_ComparisonExpression(EObject context, Lower semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS));
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getComparisonExpressionAccess().getLowerLhsAction_1_0_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getComparisonExpressionAccess().getRhsAddExpressionParserRuleCall_1_1_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     integerValue=EInt
	 */
	protected void sequence_Constant(EObject context, Constant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.CONSTANT__INTEGER_VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.CONSTANT__INTEGER_VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConstantAccess().getIntegerValueEIntParserRuleCall_1_0(), semanticObject.getIntegerValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=EqualExpression_Equals_1_0 rhs=ComparisonExpression)
	 */
	protected void sequence_EqualExpression(EObject context, Equals semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS));
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEqualExpressionAccess().getEqualsLhsAction_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getEqualExpressionAccess().getRhsComparisonExpressionParserRuleCall_1_2_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     steps=LiteralsExpression
	 */
	protected void sequence_Forward(EObject context, Forward semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.FORWARD__STEPS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.FORWARD__STEPS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getForwardAccess().getStepsLiteralsExpressionParserRuleCall_1_0(), semanticObject.getSteps());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     ((condition=LiteralsExpression thenPart=Block elsePart=Block) | (condition=LiteralsExpression thenPart=Block))
	 */
	protected void sequence_If(EObject context, If semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     angle=LiteralsExpression
	 */
	protected void sequence_Left(EObject context, Left semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.LEFT__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.LEFT__ANGLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getLeftAccess().getAngleLiteralsExpressionParserRuleCall_2_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (instructions+=Instruction instructions+=Instruction*)
	 */
	protected void sequence_LogoProgram(EObject context, LogoProgram semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=MultExpression_Div_1_0_1_0 rhs=LiteralsExpression)
	 */
	protected void sequence_MultExpression(EObject context, Div semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS));
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultExpressionAccess().getDivLhsAction_1_0_1_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getMultExpressionAccess().getRhsLiteralsExpressionParserRuleCall_1_1_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (lhs=MultExpression_Mult_1_0_0_0 rhs=LiteralsExpression)
	 */
	protected void sequence_MultExpression(EObject context, Mult semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__LHS));
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.BINARY_EXP__RHS));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getMultExpressionAccess().getMultLhsAction_1_0_0_0(), semanticObject.getLhs());
		feeder.accept(grammarAccess.getMultExpressionAccess().getRhsLiteralsExpressionParserRuleCall_1_1_0(), semanticObject.getRhs());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     parameter=[Parameter|EString]
	 */
	protected void sequence_ParameterCall(EObject context, ParameterCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.PARAMETER_CALL__PARAMETER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.PARAMETER_CALL__PARAMETER));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterCallAccess().getParameterParameterEStringParserRuleCall_1_0_1(), semanticObject.getParameter());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     name=EString
	 */
	protected void sequence_Parameter(EObject context, Parameter semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.PARAMETER__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.PARAMETER__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getParameterAccess().getNameEStringParserRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {PenDown}
	 */
	protected void sequence_PenDown(EObject context, PenDown semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {PenUp}
	 */
	protected void sequence_PenUp(EObject context, PenUp semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (declaration=[ProcDeclaration|EString] actualArgs+=LiteralsExpression? actualArgs+=LiteralsExpression*)
	 */
	protected void sequence_ProcCall(EObject context, ProcCall semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=EString args+=Parameter* instructions+=Instruction instructions+=Instruction*)
	 */
	protected void sequence_ProcDeclaration(EObject context, ProcDeclaration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=LiteralsExpression block=Block)
	 */
	protected void sequence_Repeat(EObject context, Repeat semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.CONTROL_STRUCTURE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.CONTROL_STRUCTURE__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.REPEAT__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.REPEAT__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRepeatAccess().getConditionLiteralsExpressionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getRepeatAccess().getBlockBlockParserRuleCall_2_0(), semanticObject.getBlock());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     angle=LiteralsExpression
	 */
	protected void sequence_Right(EObject context, Right semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.RIGHT__ANGLE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.RIGHT__ANGLE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRightAccess().getAngleLiteralsExpressionParserRuleCall_2_0(), semanticObject.getAngle());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (condition=LiteralsExpression block=Block)
	 */
	protected void sequence_While(EObject context, While semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.CONTROL_STRUCTURE__CONDITION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.CONTROL_STRUCTURE__CONDITION));
			if(transientValues.isValueTransient(semanticObject, LogoASMPackage.Literals.WHILE__BLOCK) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, LogoASMPackage.Literals.WHILE__BLOCK));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getWhileAccess().getConditionLiteralsExpressionParserRuleCall_1_0(), semanticObject.getCondition());
		feeder.accept(grammarAccess.getWhileAccess().getBlockBlockParserRuleCall_2_0(), semanticObject.getBlock());
		feeder.finish();
	}
}

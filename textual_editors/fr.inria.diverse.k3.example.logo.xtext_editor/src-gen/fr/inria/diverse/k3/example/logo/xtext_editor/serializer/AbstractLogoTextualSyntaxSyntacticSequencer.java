package fr.inria.diverse.k3.example.logo.xtext_editor.serializer;

import com.google.inject.Inject;
import fr.inria.diverse.k3.example.logo.xtext_editor.services.LogoTextualSyntaxGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public abstract class AbstractLogoTextualSyntaxSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LogoTextualSyntaxGrammarAccess grammarAccess;
	protected AbstractElementAlias match_LiteralsExpression_LeftParenthesisKeyword_2_0_a;
	protected AbstractElementAlias match_LiteralsExpression_LeftParenthesisKeyword_2_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LogoTextualSyntaxGrammarAccess) access;
		match_LiteralsExpression_LeftParenthesisKeyword_2_0_a = new TokenAlias(true, true, grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_2_0());
		match_LiteralsExpression_LeftParenthesisKeyword_2_0_p = new TokenAlias(true, false, grammarAccess.getLiteralsExpressionAccess().getLeftParenthesisKeyword_2_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_LiteralsExpression_LeftParenthesisKeyword_2_0_a.equals(syntax))
				emit_LiteralsExpression_LeftParenthesisKeyword_2_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_LiteralsExpression_LeftParenthesisKeyword_2_0_p.equals(syntax))
				emit_LiteralsExpression_LeftParenthesisKeyword_2_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     '('*
	 */
	protected void emit_LiteralsExpression_LeftParenthesisKeyword_2_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '('+
	 */
	protected void emit_LiteralsExpression_LeftParenthesisKeyword_2_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.serializer;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.services.DialogFlowGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DialogFlowSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DialogFlowGrammarAccess grammarAccess;
	protected AbstractElementAlias match_EntityValue_SynonymKeyword_2_0_0_or_SynonymsKeyword_2_0_1;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DialogFlowGrammarAccess) access;
		match_EntityValue_SynonymKeyword_2_0_0_or_SynonymsKeyword_2_0_1 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getEntityValueAccess().getSynonymKeyword_2_0_0()), new TokenAlias(false, false, grammarAccess.getEntityValueAccess().getSynonymsKeyword_2_0_1()));
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
			if (match_EntityValue_SynonymKeyword_2_0_0_or_SynonymsKeyword_2_0_1.equals(syntax))
				emit_EntityValue_SynonymKeyword_2_0_0_or_SynonymsKeyword_2_0_1(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     'synonym' | 'synonyms'
	 *
	 * This ambiguous syntax occurs at:
	 *     value=STRING (ambiguity) synonyms=EntitySynonyms
	 */
	protected void emit_EntityValue_SynonymKeyword_2_0_0_or_SynonymsKeyword_2_0_1(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

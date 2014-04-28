package fr.inria.lang.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import fr.inria.lang.conf.Assignment;
import fr.inria.lang.conf.ConfPackage;
import fr.inria.lang.conf.GeneratedComment;
import fr.inria.lang.conf.LuaConfigFile;
import fr.inria.lang.services.LuaConfigFileGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class LuaConfigFileSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private LuaConfigFileGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == ConfPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case ConfPackage.ASSIGNMENT:
				if(context == grammarAccess.getAssignmentRule()) {
					sequence_Assignment(context, (Assignment) semanticObject); 
					return; 
				}
				else break;
			case ConfPackage.GENERATED_COMMENT:
				if(context == grammarAccess.getGeneratedCommentRule()) {
					sequence_GeneratedComment(context, (GeneratedComment) semanticObject); 
					return; 
				}
				else break;
			case ConfPackage.LUA_CONFIG_FILE:
				if(context == grammarAccess.getLuaConfigFileRule()) {
					sequence_LuaConfigFile(context, (LuaConfigFile) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (feature=MYCHAR attribute=MYCHAR (value=Real | value=Integer | value=MYCHAR))
	 */
	protected void sequence_Assignment(EObject context, Assignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value=MYCOMMENT | value=Integer)
	 */
	protected void sequence_GeneratedComment(EObject context, GeneratedComment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (rows+=GeneratedComment | rows+=Assignment)+
	 */
	protected void sequence_LuaConfigFile(EObject context, LuaConfigFile semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}

package fr.inria.lang.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import fr.inria.lang.services.LuaConfigFileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuaConfigFileParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MYCHAR", "RULE_MYCOMMENT", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'='", "'.'", "'--'", "'-'"
    };
    public static final int RULE_ID=7;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__14=14;
    public static final int RULE_MYCHAR=4;
    public static final int T__13=13;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_MYCOMMENT=5;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

    // delegates
    // delegators


        public InternalLuaConfigFileParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLuaConfigFileParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLuaConfigFileParser.tokenNames; }
    public String getGrammarFileName() { return "../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g"; }


     
     	private LuaConfigFileGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(LuaConfigFileGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleLuaConfigFile"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:60:1: entryRuleLuaConfigFile : ruleLuaConfigFile EOF ;
    public final void entryRuleLuaConfigFile() throws RecognitionException {
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:61:1: ( ruleLuaConfigFile EOF )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:62:1: ruleLuaConfigFile EOF
            {
             before(grammarAccess.getLuaConfigFileRule()); 
            pushFollow(FOLLOW_ruleLuaConfigFile_in_entryRuleLuaConfigFile61);
            ruleLuaConfigFile();

            state._fsp--;

             after(grammarAccess.getLuaConfigFileRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLuaConfigFile68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLuaConfigFile"


    // $ANTLR start "ruleLuaConfigFile"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:69:1: ruleLuaConfigFile : ( ( ( rule__LuaConfigFile__RowsAssignment ) ) ( ( rule__LuaConfigFile__RowsAssignment )* ) ) ;
    public final void ruleLuaConfigFile() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:73:2: ( ( ( ( rule__LuaConfigFile__RowsAssignment ) ) ( ( rule__LuaConfigFile__RowsAssignment )* ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:74:1: ( ( ( rule__LuaConfigFile__RowsAssignment ) ) ( ( rule__LuaConfigFile__RowsAssignment )* ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:74:1: ( ( ( rule__LuaConfigFile__RowsAssignment ) ) ( ( rule__LuaConfigFile__RowsAssignment )* ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:75:1: ( ( rule__LuaConfigFile__RowsAssignment ) ) ( ( rule__LuaConfigFile__RowsAssignment )* )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:75:1: ( ( rule__LuaConfigFile__RowsAssignment ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:76:1: ( rule__LuaConfigFile__RowsAssignment )
            {
             before(grammarAccess.getLuaConfigFileAccess().getRowsAssignment()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:77:1: ( rule__LuaConfigFile__RowsAssignment )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:77:2: rule__LuaConfigFile__RowsAssignment
            {
            pushFollow(FOLLOW_rule__LuaConfigFile__RowsAssignment_in_ruleLuaConfigFile96);
            rule__LuaConfigFile__RowsAssignment();

            state._fsp--;


            }

             after(grammarAccess.getLuaConfigFileAccess().getRowsAssignment()); 

            }

            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:80:1: ( ( rule__LuaConfigFile__RowsAssignment )* )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:81:1: ( rule__LuaConfigFile__RowsAssignment )*
            {
             before(grammarAccess.getLuaConfigFileAccess().getRowsAssignment()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:82:1: ( rule__LuaConfigFile__RowsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_MYCHAR||LA1_0==15) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:82:2: rule__LuaConfigFile__RowsAssignment
            	    {
            	    pushFollow(FOLLOW_rule__LuaConfigFile__RowsAssignment_in_ruleLuaConfigFile108);
            	    rule__LuaConfigFile__RowsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getLuaConfigFileAccess().getRowsAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLuaConfigFile"


    // $ANTLR start "entryRuleAssignment"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:95:1: entryRuleAssignment : ruleAssignment EOF ;
    public final void entryRuleAssignment() throws RecognitionException {
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:96:1: ( ruleAssignment EOF )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:97:1: ruleAssignment EOF
            {
             before(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment138);
            ruleAssignment();

            state._fsp--;

             after(grammarAccess.getAssignmentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment145); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:104:1: ruleAssignment : ( ( rule__Assignment__Group__0 ) ) ;
    public final void ruleAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:108:2: ( ( ( rule__Assignment__Group__0 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:109:1: ( ( rule__Assignment__Group__0 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:109:1: ( ( rule__Assignment__Group__0 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:110:1: ( rule__Assignment__Group__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:111:1: ( rule__Assignment__Group__0 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:111:2: rule__Assignment__Group__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0_in_ruleAssignment171);
            rule__Assignment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleGeneratedComment"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:123:1: entryRuleGeneratedComment : ruleGeneratedComment EOF ;
    public final void entryRuleGeneratedComment() throws RecognitionException {
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:124:1: ( ruleGeneratedComment EOF )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:125:1: ruleGeneratedComment EOF
            {
             before(grammarAccess.getGeneratedCommentRule()); 
            pushFollow(FOLLOW_ruleGeneratedComment_in_entryRuleGeneratedComment198);
            ruleGeneratedComment();

            state._fsp--;

             after(grammarAccess.getGeneratedCommentRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneratedComment205); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGeneratedComment"


    // $ANTLR start "ruleGeneratedComment"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:132:1: ruleGeneratedComment : ( ( rule__GeneratedComment__Group__0 ) ) ;
    public final void ruleGeneratedComment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:136:2: ( ( ( rule__GeneratedComment__Group__0 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:137:1: ( ( rule__GeneratedComment__Group__0 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:137:1: ( ( rule__GeneratedComment__Group__0 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:138:1: ( rule__GeneratedComment__Group__0 )
            {
             before(grammarAccess.getGeneratedCommentAccess().getGroup()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:139:1: ( rule__GeneratedComment__Group__0 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:139:2: rule__GeneratedComment__Group__0
            {
            pushFollow(FOLLOW_rule__GeneratedComment__Group__0_in_ruleGeneratedComment231);
            rule__GeneratedComment__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedCommentAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGeneratedComment"


    // $ANTLR start "entryRuleReal"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:151:1: entryRuleReal : ruleReal EOF ;
    public final void entryRuleReal() throws RecognitionException {
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:152:1: ( ruleReal EOF )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:153:1: ruleReal EOF
            {
             before(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal258);
            ruleReal();

            state._fsp--;

             after(grammarAccess.getRealRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal265); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:160:1: ruleReal : ( ( rule__Real__Group__0 ) ) ;
    public final void ruleReal() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:164:2: ( ( ( rule__Real__Group__0 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:165:1: ( ( rule__Real__Group__0 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:165:1: ( ( rule__Real__Group__0 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:166:1: ( rule__Real__Group__0 )
            {
             before(grammarAccess.getRealAccess().getGroup()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:167:1: ( rule__Real__Group__0 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:167:2: rule__Real__Group__0
            {
            pushFollow(FOLLOW_rule__Real__Group__0_in_ruleReal291);
            rule__Real__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRealAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:179:1: entryRuleInteger : ruleInteger EOF ;
    public final void entryRuleInteger() throws RecognitionException {
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:180:1: ( ruleInteger EOF )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:181:1: ruleInteger EOF
            {
             before(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger318);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getIntegerRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger325); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:188:1: ruleInteger : ( ( rule__Integer__Group__0 ) ) ;
    public final void ruleInteger() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:192:2: ( ( ( rule__Integer__Group__0 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:193:1: ( ( rule__Integer__Group__0 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:193:1: ( ( rule__Integer__Group__0 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:194:1: ( rule__Integer__Group__0 )
            {
             before(grammarAccess.getIntegerAccess().getGroup()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:195:1: ( rule__Integer__Group__0 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:195:2: rule__Integer__Group__0
            {
            pushFollow(FOLLOW_rule__Integer__Group__0_in_ruleInteger351);
            rule__Integer__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getIntegerAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleInteger"


    // $ANTLR start "rule__LuaConfigFile__RowsAlternatives_0"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:207:1: rule__LuaConfigFile__RowsAlternatives_0 : ( ( ruleGeneratedComment ) | ( ruleAssignment ) );
    public final void rule__LuaConfigFile__RowsAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:211:1: ( ( ruleGeneratedComment ) | ( ruleAssignment ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_MYCHAR) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:212:1: ( ruleGeneratedComment )
                    {
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:212:1: ( ruleGeneratedComment )
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:213:1: ruleGeneratedComment
                    {
                     before(grammarAccess.getLuaConfigFileAccess().getRowsGeneratedCommentParserRuleCall_0_0()); 
                    pushFollow(FOLLOW_ruleGeneratedComment_in_rule__LuaConfigFile__RowsAlternatives_0387);
                    ruleGeneratedComment();

                    state._fsp--;

                     after(grammarAccess.getLuaConfigFileAccess().getRowsGeneratedCommentParserRuleCall_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:218:6: ( ruleAssignment )
                    {
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:218:6: ( ruleAssignment )
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:219:1: ruleAssignment
                    {
                     before(grammarAccess.getLuaConfigFileAccess().getRowsAssignmentParserRuleCall_0_1()); 
                    pushFollow(FOLLOW_ruleAssignment_in_rule__LuaConfigFile__RowsAlternatives_0404);
                    ruleAssignment();

                    state._fsp--;

                     after(grammarAccess.getLuaConfigFileAccess().getRowsAssignmentParserRuleCall_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LuaConfigFile__RowsAlternatives_0"


    // $ANTLR start "rule__Assignment__ValueAlternatives_3_0"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:229:1: rule__Assignment__ValueAlternatives_3_0 : ( ( ruleReal ) | ( ruleInteger ) | ( RULE_MYCHAR ) );
    public final void rule__Assignment__ValueAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:233:1: ( ( ruleReal ) | ( ruleInteger ) | ( RULE_MYCHAR ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_INT) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==14) ) {
                        alt3=1;
                    }
                    else if ( (LA3_2==EOF||LA3_2==RULE_MYCHAR||LA3_2==15) ) {
                        alt3=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case RULE_INT:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==14) ) {
                    alt3=1;
                }
                else if ( (LA3_2==EOF||LA3_2==RULE_MYCHAR||LA3_2==15) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case RULE_MYCHAR:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:234:1: ( ruleReal )
                    {
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:234:1: ( ruleReal )
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:235:1: ruleReal
                    {
                     before(grammarAccess.getAssignmentAccess().getValueRealParserRuleCall_3_0_0()); 
                    pushFollow(FOLLOW_ruleReal_in_rule__Assignment__ValueAlternatives_3_0436);
                    ruleReal();

                    state._fsp--;

                     after(grammarAccess.getAssignmentAccess().getValueRealParserRuleCall_3_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:240:6: ( ruleInteger )
                    {
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:240:6: ( ruleInteger )
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:241:1: ruleInteger
                    {
                     before(grammarAccess.getAssignmentAccess().getValueIntegerParserRuleCall_3_0_1()); 
                    pushFollow(FOLLOW_ruleInteger_in_rule__Assignment__ValueAlternatives_3_0453);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getAssignmentAccess().getValueIntegerParserRuleCall_3_0_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:246:6: ( RULE_MYCHAR )
                    {
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:246:6: ( RULE_MYCHAR )
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:247:1: RULE_MYCHAR
                    {
                     before(grammarAccess.getAssignmentAccess().getValueMYCHARTerminalRuleCall_3_0_2()); 
                    match(input,RULE_MYCHAR,FOLLOW_RULE_MYCHAR_in_rule__Assignment__ValueAlternatives_3_0470); 
                     after(grammarAccess.getAssignmentAccess().getValueMYCHARTerminalRuleCall_3_0_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAlternatives_3_0"


    // $ANTLR start "rule__GeneratedComment__ValueAlternatives_1_0"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:257:1: rule__GeneratedComment__ValueAlternatives_1_0 : ( ( RULE_MYCOMMENT ) | ( ruleInteger ) );
    public final void rule__GeneratedComment__ValueAlternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:261:1: ( ( RULE_MYCOMMENT ) | ( ruleInteger ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_MYCOMMENT) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT||LA4_0==16) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:262:1: ( RULE_MYCOMMENT )
                    {
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:262:1: ( RULE_MYCOMMENT )
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:263:1: RULE_MYCOMMENT
                    {
                     before(grammarAccess.getGeneratedCommentAccess().getValueMYCOMMENTTerminalRuleCall_1_0_0()); 
                    match(input,RULE_MYCOMMENT,FOLLOW_RULE_MYCOMMENT_in_rule__GeneratedComment__ValueAlternatives_1_0502); 
                     after(grammarAccess.getGeneratedCommentAccess().getValueMYCOMMENTTerminalRuleCall_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:268:6: ( ruleInteger )
                    {
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:268:6: ( ruleInteger )
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:269:1: ruleInteger
                    {
                     before(grammarAccess.getGeneratedCommentAccess().getValueIntegerParserRuleCall_1_0_1()); 
                    pushFollow(FOLLOW_ruleInteger_in_rule__GeneratedComment__ValueAlternatives_1_0519);
                    ruleInteger();

                    state._fsp--;

                     after(grammarAccess.getGeneratedCommentAccess().getValueIntegerParserRuleCall_1_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedComment__ValueAlternatives_1_0"


    // $ANTLR start "rule__Assignment__Group__0"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:281:1: rule__Assignment__Group__0 : rule__Assignment__Group__0__Impl rule__Assignment__Group__1 ;
    public final void rule__Assignment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:285:1: ( rule__Assignment__Group__0__Impl rule__Assignment__Group__1 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:286:2: rule__Assignment__Group__0__Impl rule__Assignment__Group__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__0549);
            rule__Assignment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__0552);
            rule__Assignment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0"


    // $ANTLR start "rule__Assignment__Group__0__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:293:1: rule__Assignment__Group__0__Impl : ( ( rule__Assignment__Group_0__0 ) ) ;
    public final void rule__Assignment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:297:1: ( ( ( rule__Assignment__Group_0__0 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:298:1: ( ( rule__Assignment__Group_0__0 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:298:1: ( ( rule__Assignment__Group_0__0 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:299:1: ( rule__Assignment__Group_0__0 )
            {
             before(grammarAccess.getAssignmentAccess().getGroup_0()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:300:1: ( rule__Assignment__Group_0__0 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:300:2: rule__Assignment__Group_0__0
            {
            pushFollow(FOLLOW_rule__Assignment__Group_0__0_in_rule__Assignment__Group__0__Impl579);
            rule__Assignment__Group_0__0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__0__Impl"


    // $ANTLR start "rule__Assignment__Group__1"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:310:1: rule__Assignment__Group__1 : rule__Assignment__Group__1__Impl rule__Assignment__Group__2 ;
    public final void rule__Assignment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:314:1: ( rule__Assignment__Group__1__Impl rule__Assignment__Group__2 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:315:2: rule__Assignment__Group__1__Impl rule__Assignment__Group__2
            {
            pushFollow(FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__1609);
            rule__Assignment__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__1612);
            rule__Assignment__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1"


    // $ANTLR start "rule__Assignment__Group__1__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:322:1: rule__Assignment__Group__1__Impl : ( ( rule__Assignment__AttributeAssignment_1 ) ) ;
    public final void rule__Assignment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:326:1: ( ( ( rule__Assignment__AttributeAssignment_1 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:327:1: ( ( rule__Assignment__AttributeAssignment_1 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:327:1: ( ( rule__Assignment__AttributeAssignment_1 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:328:1: ( rule__Assignment__AttributeAssignment_1 )
            {
             before(grammarAccess.getAssignmentAccess().getAttributeAssignment_1()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:329:1: ( rule__Assignment__AttributeAssignment_1 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:329:2: rule__Assignment__AttributeAssignment_1
            {
            pushFollow(FOLLOW_rule__Assignment__AttributeAssignment_1_in_rule__Assignment__Group__1__Impl639);
            rule__Assignment__AttributeAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getAttributeAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__1__Impl"


    // $ANTLR start "rule__Assignment__Group__2"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:339:1: rule__Assignment__Group__2 : rule__Assignment__Group__2__Impl rule__Assignment__Group__3 ;
    public final void rule__Assignment__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:343:1: ( rule__Assignment__Group__2__Impl rule__Assignment__Group__3 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:344:2: rule__Assignment__Group__2__Impl rule__Assignment__Group__3
            {
            pushFollow(FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__2669);
            rule__Assignment__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__2672);
            rule__Assignment__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2"


    // $ANTLR start "rule__Assignment__Group__2__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:351:1: rule__Assignment__Group__2__Impl : ( '=' ) ;
    public final void rule__Assignment__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:355:1: ( ( '=' ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:356:1: ( '=' )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:356:1: ( '=' )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:357:1: '='
            {
             before(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2()); 
            match(input,13,FOLLOW_13_in_rule__Assignment__Group__2__Impl700); 
             after(grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__2__Impl"


    // $ANTLR start "rule__Assignment__Group__3"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:370:1: rule__Assignment__Group__3 : rule__Assignment__Group__3__Impl ;
    public final void rule__Assignment__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:374:1: ( rule__Assignment__Group__3__Impl )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:375:2: rule__Assignment__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__3731);
            rule__Assignment__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3"


    // $ANTLR start "rule__Assignment__Group__3__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:381:1: rule__Assignment__Group__3__Impl : ( ( rule__Assignment__ValueAssignment_3 ) ) ;
    public final void rule__Assignment__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:385:1: ( ( ( rule__Assignment__ValueAssignment_3 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:386:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:386:1: ( ( rule__Assignment__ValueAssignment_3 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:387:1: ( rule__Assignment__ValueAssignment_3 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:388:1: ( rule__Assignment__ValueAssignment_3 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:388:2: rule__Assignment__ValueAssignment_3
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl758);
            rule__Assignment__ValueAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group__3__Impl"


    // $ANTLR start "rule__Assignment__Group_0__0"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:406:1: rule__Assignment__Group_0__0 : rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 ;
    public final void rule__Assignment__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:410:1: ( rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:411:2: rule__Assignment__Group_0__0__Impl rule__Assignment__Group_0__1
            {
            pushFollow(FOLLOW_rule__Assignment__Group_0__0__Impl_in_rule__Assignment__Group_0__0796);
            rule__Assignment__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Assignment__Group_0__1_in_rule__Assignment__Group_0__0799);
            rule__Assignment__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__0"


    // $ANTLR start "rule__Assignment__Group_0__0__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:418:1: rule__Assignment__Group_0__0__Impl : ( ( rule__Assignment__FeatureAssignment_0_0 ) ) ;
    public final void rule__Assignment__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:422:1: ( ( ( rule__Assignment__FeatureAssignment_0_0 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:423:1: ( ( rule__Assignment__FeatureAssignment_0_0 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:423:1: ( ( rule__Assignment__FeatureAssignment_0_0 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:424:1: ( rule__Assignment__FeatureAssignment_0_0 )
            {
             before(grammarAccess.getAssignmentAccess().getFeatureAssignment_0_0()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:425:1: ( rule__Assignment__FeatureAssignment_0_0 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:425:2: rule__Assignment__FeatureAssignment_0_0
            {
            pushFollow(FOLLOW_rule__Assignment__FeatureAssignment_0_0_in_rule__Assignment__Group_0__0__Impl826);
            rule__Assignment__FeatureAssignment_0_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getFeatureAssignment_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__0__Impl"


    // $ANTLR start "rule__Assignment__Group_0__1"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:435:1: rule__Assignment__Group_0__1 : rule__Assignment__Group_0__1__Impl ;
    public final void rule__Assignment__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:439:1: ( rule__Assignment__Group_0__1__Impl )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:440:2: rule__Assignment__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Assignment__Group_0__1__Impl_in_rule__Assignment__Group_0__1856);
            rule__Assignment__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__1"


    // $ANTLR start "rule__Assignment__Group_0__1__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:446:1: rule__Assignment__Group_0__1__Impl : ( '.' ) ;
    public final void rule__Assignment__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:450:1: ( ( '.' ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:451:1: ( '.' )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:451:1: ( '.' )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:452:1: '.'
            {
             before(grammarAccess.getAssignmentAccess().getFullStopKeyword_0_1()); 
            match(input,14,FOLLOW_14_in_rule__Assignment__Group_0__1__Impl884); 
             after(grammarAccess.getAssignmentAccess().getFullStopKeyword_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__Group_0__1__Impl"


    // $ANTLR start "rule__GeneratedComment__Group__0"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:469:1: rule__GeneratedComment__Group__0 : rule__GeneratedComment__Group__0__Impl rule__GeneratedComment__Group__1 ;
    public final void rule__GeneratedComment__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:473:1: ( rule__GeneratedComment__Group__0__Impl rule__GeneratedComment__Group__1 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:474:2: rule__GeneratedComment__Group__0__Impl rule__GeneratedComment__Group__1
            {
            pushFollow(FOLLOW_rule__GeneratedComment__Group__0__Impl_in_rule__GeneratedComment__Group__0919);
            rule__GeneratedComment__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__GeneratedComment__Group__1_in_rule__GeneratedComment__Group__0922);
            rule__GeneratedComment__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedComment__Group__0"


    // $ANTLR start "rule__GeneratedComment__Group__0__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:481:1: rule__GeneratedComment__Group__0__Impl : ( '--' ) ;
    public final void rule__GeneratedComment__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:485:1: ( ( '--' ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:486:1: ( '--' )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:486:1: ( '--' )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:487:1: '--'
            {
             before(grammarAccess.getGeneratedCommentAccess().getHyphenMinusHyphenMinusKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__GeneratedComment__Group__0__Impl950); 
             after(grammarAccess.getGeneratedCommentAccess().getHyphenMinusHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedComment__Group__0__Impl"


    // $ANTLR start "rule__GeneratedComment__Group__1"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:500:1: rule__GeneratedComment__Group__1 : rule__GeneratedComment__Group__1__Impl ;
    public final void rule__GeneratedComment__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:504:1: ( rule__GeneratedComment__Group__1__Impl )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:505:2: rule__GeneratedComment__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__GeneratedComment__Group__1__Impl_in_rule__GeneratedComment__Group__1981);
            rule__GeneratedComment__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedComment__Group__1"


    // $ANTLR start "rule__GeneratedComment__Group__1__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:511:1: rule__GeneratedComment__Group__1__Impl : ( ( rule__GeneratedComment__ValueAssignment_1 ) ) ;
    public final void rule__GeneratedComment__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:515:1: ( ( ( rule__GeneratedComment__ValueAssignment_1 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:516:1: ( ( rule__GeneratedComment__ValueAssignment_1 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:516:1: ( ( rule__GeneratedComment__ValueAssignment_1 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:517:1: ( rule__GeneratedComment__ValueAssignment_1 )
            {
             before(grammarAccess.getGeneratedCommentAccess().getValueAssignment_1()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:518:1: ( rule__GeneratedComment__ValueAssignment_1 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:518:2: rule__GeneratedComment__ValueAssignment_1
            {
            pushFollow(FOLLOW_rule__GeneratedComment__ValueAssignment_1_in_rule__GeneratedComment__Group__1__Impl1008);
            rule__GeneratedComment__ValueAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedCommentAccess().getValueAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedComment__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__0"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:532:1: rule__Real__Group__0 : rule__Real__Group__0__Impl rule__Real__Group__1 ;
    public final void rule__Real__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:536:1: ( rule__Real__Group__0__Impl rule__Real__Group__1 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:537:2: rule__Real__Group__0__Impl rule__Real__Group__1
            {
            pushFollow(FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__01042);
            rule__Real__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group__1_in_rule__Real__Group__01045);
            rule__Real__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0"


    // $ANTLR start "rule__Real__Group__0__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:544:1: rule__Real__Group__0__Impl : ( ruleInteger ) ;
    public final void rule__Real__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:548:1: ( ( ruleInteger ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:549:1: ( ruleInteger )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:549:1: ( ruleInteger )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:550:1: ruleInteger
            {
             before(grammarAccess.getRealAccess().getIntegerParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleInteger_in_rule__Real__Group__0__Impl1072);
            ruleInteger();

            state._fsp--;

             after(grammarAccess.getRealAccess().getIntegerParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__0__Impl"


    // $ANTLR start "rule__Real__Group__1"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:561:1: rule__Real__Group__1 : rule__Real__Group__1__Impl rule__Real__Group__2 ;
    public final void rule__Real__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:565:1: ( rule__Real__Group__1__Impl rule__Real__Group__2 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:566:2: rule__Real__Group__1__Impl rule__Real__Group__2
            {
            pushFollow(FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__11101);
            rule__Real__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Real__Group__2_in_rule__Real__Group__11104);
            rule__Real__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1"


    // $ANTLR start "rule__Real__Group__1__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:573:1: rule__Real__Group__1__Impl : ( '.' ) ;
    public final void rule__Real__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:577:1: ( ( '.' ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:578:1: ( '.' )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:578:1: ( '.' )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:579:1: '.'
            {
             before(grammarAccess.getRealAccess().getFullStopKeyword_1()); 
            match(input,14,FOLLOW_14_in_rule__Real__Group__1__Impl1132); 
             after(grammarAccess.getRealAccess().getFullStopKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__1__Impl"


    // $ANTLR start "rule__Real__Group__2"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:592:1: rule__Real__Group__2 : rule__Real__Group__2__Impl ;
    public final void rule__Real__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:596:1: ( rule__Real__Group__2__Impl )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:597:2: rule__Real__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__21163);
            rule__Real__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__2"


    // $ANTLR start "rule__Real__Group__2__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:603:1: rule__Real__Group__2__Impl : ( RULE_INT ) ;
    public final void rule__Real__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:607:1: ( ( RULE_INT ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:608:1: ( RULE_INT )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:608:1: ( RULE_INT )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:609:1: RULE_INT
            {
             before(grammarAccess.getRealAccess().getINTTerminalRuleCall_2()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Real__Group__2__Impl1190); 
             after(grammarAccess.getRealAccess().getINTTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Real__Group__2__Impl"


    // $ANTLR start "rule__Integer__Group__0"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:626:1: rule__Integer__Group__0 : rule__Integer__Group__0__Impl rule__Integer__Group__1 ;
    public final void rule__Integer__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:630:1: ( rule__Integer__Group__0__Impl rule__Integer__Group__1 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:631:2: rule__Integer__Group__0__Impl rule__Integer__Group__1
            {
            pushFollow(FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__01225);
            rule__Integer__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__01228);
            rule__Integer__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0"


    // $ANTLR start "rule__Integer__Group__0__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:638:1: rule__Integer__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__Integer__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:642:1: ( ( ( '-' )? ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:643:1: ( ( '-' )? )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:643:1: ( ( '-' )? )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:644:1: ( '-' )?
            {
             before(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:645:1: ( '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:646:2: '-'
                    {
                    match(input,16,FOLLOW_16_in_rule__Integer__Group__0__Impl1257); 

                    }
                    break;

            }

             after(grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__0__Impl"


    // $ANTLR start "rule__Integer__Group__1"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:657:1: rule__Integer__Group__1 : rule__Integer__Group__1__Impl ;
    public final void rule__Integer__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:661:1: ( rule__Integer__Group__1__Impl )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:662:2: rule__Integer__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__11290);
            rule__Integer__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1"


    // $ANTLR start "rule__Integer__Group__1__Impl"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:668:1: rule__Integer__Group__1__Impl : ( RULE_INT ) ;
    public final void rule__Integer__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:672:1: ( ( RULE_INT ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:673:1: ( RULE_INT )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:673:1: ( RULE_INT )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:674:1: RULE_INT
            {
             before(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl1317); 
             after(grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Integer__Group__1__Impl"


    // $ANTLR start "rule__LuaConfigFile__RowsAssignment"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:690:1: rule__LuaConfigFile__RowsAssignment : ( ( rule__LuaConfigFile__RowsAlternatives_0 ) ) ;
    public final void rule__LuaConfigFile__RowsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:694:1: ( ( ( rule__LuaConfigFile__RowsAlternatives_0 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:695:1: ( ( rule__LuaConfigFile__RowsAlternatives_0 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:695:1: ( ( rule__LuaConfigFile__RowsAlternatives_0 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:696:1: ( rule__LuaConfigFile__RowsAlternatives_0 )
            {
             before(grammarAccess.getLuaConfigFileAccess().getRowsAlternatives_0()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:697:1: ( rule__LuaConfigFile__RowsAlternatives_0 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:697:2: rule__LuaConfigFile__RowsAlternatives_0
            {
            pushFollow(FOLLOW_rule__LuaConfigFile__RowsAlternatives_0_in_rule__LuaConfigFile__RowsAssignment1355);
            rule__LuaConfigFile__RowsAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getLuaConfigFileAccess().getRowsAlternatives_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__LuaConfigFile__RowsAssignment"


    // $ANTLR start "rule__Assignment__FeatureAssignment_0_0"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:706:1: rule__Assignment__FeatureAssignment_0_0 : ( RULE_MYCHAR ) ;
    public final void rule__Assignment__FeatureAssignment_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:710:1: ( ( RULE_MYCHAR ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:711:1: ( RULE_MYCHAR )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:711:1: ( RULE_MYCHAR )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:712:1: RULE_MYCHAR
            {
             before(grammarAccess.getAssignmentAccess().getFeatureMYCHARTerminalRuleCall_0_0_0()); 
            match(input,RULE_MYCHAR,FOLLOW_RULE_MYCHAR_in_rule__Assignment__FeatureAssignment_0_01388); 
             after(grammarAccess.getAssignmentAccess().getFeatureMYCHARTerminalRuleCall_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__FeatureAssignment_0_0"


    // $ANTLR start "rule__Assignment__AttributeAssignment_1"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:721:1: rule__Assignment__AttributeAssignment_1 : ( RULE_MYCHAR ) ;
    public final void rule__Assignment__AttributeAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:725:1: ( ( RULE_MYCHAR ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:726:1: ( RULE_MYCHAR )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:726:1: ( RULE_MYCHAR )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:727:1: RULE_MYCHAR
            {
             before(grammarAccess.getAssignmentAccess().getAttributeMYCHARTerminalRuleCall_1_0()); 
            match(input,RULE_MYCHAR,FOLLOW_RULE_MYCHAR_in_rule__Assignment__AttributeAssignment_11419); 
             after(grammarAccess.getAssignmentAccess().getAttributeMYCHARTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__AttributeAssignment_1"


    // $ANTLR start "rule__Assignment__ValueAssignment_3"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:736:1: rule__Assignment__ValueAssignment_3 : ( ( rule__Assignment__ValueAlternatives_3_0 ) ) ;
    public final void rule__Assignment__ValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:740:1: ( ( ( rule__Assignment__ValueAlternatives_3_0 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:741:1: ( ( rule__Assignment__ValueAlternatives_3_0 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:741:1: ( ( rule__Assignment__ValueAlternatives_3_0 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:742:1: ( rule__Assignment__ValueAlternatives_3_0 )
            {
             before(grammarAccess.getAssignmentAccess().getValueAlternatives_3_0()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:743:1: ( rule__Assignment__ValueAlternatives_3_0 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:743:2: rule__Assignment__ValueAlternatives_3_0
            {
            pushFollow(FOLLOW_rule__Assignment__ValueAlternatives_3_0_in_rule__Assignment__ValueAssignment_31450);
            rule__Assignment__ValueAlternatives_3_0();

            state._fsp--;


            }

             after(grammarAccess.getAssignmentAccess().getValueAlternatives_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Assignment__ValueAssignment_3"


    // $ANTLR start "rule__GeneratedComment__ValueAssignment_1"
    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:752:1: rule__GeneratedComment__ValueAssignment_1 : ( ( rule__GeneratedComment__ValueAlternatives_1_0 ) ) ;
    public final void rule__GeneratedComment__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:756:1: ( ( ( rule__GeneratedComment__ValueAlternatives_1_0 ) ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:757:1: ( ( rule__GeneratedComment__ValueAlternatives_1_0 ) )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:757:1: ( ( rule__GeneratedComment__ValueAlternatives_1_0 ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:758:1: ( rule__GeneratedComment__ValueAlternatives_1_0 )
            {
             before(grammarAccess.getGeneratedCommentAccess().getValueAlternatives_1_0()); 
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:759:1: ( rule__GeneratedComment__ValueAlternatives_1_0 )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:759:2: rule__GeneratedComment__ValueAlternatives_1_0
            {
            pushFollow(FOLLOW_rule__GeneratedComment__ValueAlternatives_1_0_in_rule__GeneratedComment__ValueAssignment_11483);
            rule__GeneratedComment__ValueAlternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getGeneratedCommentAccess().getValueAlternatives_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__GeneratedComment__ValueAssignment_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLuaConfigFile_in_entryRuleLuaConfigFile61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLuaConfigFile68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LuaConfigFile__RowsAssignment_in_ruleLuaConfigFile96 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_rule__LuaConfigFile__RowsAssignment_in_ruleLuaConfigFile108 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0_in_ruleAssignment171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneratedComment_in_entryRuleGeneratedComment198 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneratedComment205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneratedComment__Group__0_in_ruleGeneratedComment231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0_in_ruleReal291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger318 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0_in_ruleInteger351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneratedComment_in_rule__LuaConfigFile__RowsAlternatives_0387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssignment_in_rule__LuaConfigFile__RowsAlternatives_0404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_rule__Assignment__ValueAlternatives_3_0436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Assignment__ValueAlternatives_3_0453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MYCHAR_in_rule__Assignment__ValueAlternatives_3_0470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MYCOMMENT_in_rule__GeneratedComment__ValueAlternatives_1_0502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__GeneratedComment__ValueAlternatives_1_0519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__0__Impl_in_rule__Assignment__Group__0549 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1_in_rule__Assignment__Group__0552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__0_in_rule__Assignment__Group__0__Impl579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__1__Impl_in_rule__Assignment__Group__1609 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2_in_rule__Assignment__Group__1612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__AttributeAssignment_1_in_rule__Assignment__Group__1__Impl639 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__2__Impl_in_rule__Assignment__Group__2669 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3_in_rule__Assignment__Group__2672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Assignment__Group__2__Impl700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group__3__Impl_in_rule__Assignment__Group__3731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAssignment_3_in_rule__Assignment__Group__3__Impl758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__0__Impl_in_rule__Assignment__Group_0__0796 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__1_in_rule__Assignment__Group_0__0799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__FeatureAssignment_0_0_in_rule__Assignment__Group_0__0__Impl826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__Group_0__1__Impl_in_rule__Assignment__Group_0__1856 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Assignment__Group_0__1__Impl884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneratedComment__Group__0__Impl_in_rule__GeneratedComment__Group__0919 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_rule__GeneratedComment__Group__1_in_rule__GeneratedComment__Group__0922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__GeneratedComment__Group__0__Impl950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneratedComment__Group__1__Impl_in_rule__GeneratedComment__Group__1981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneratedComment__ValueAssignment_1_in_rule__GeneratedComment__Group__1__Impl1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__0__Impl_in_rule__Real__Group__01042 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__Real__Group__1_in_rule__Real__Group__01045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_rule__Real__Group__0__Impl1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__1__Impl_in_rule__Real__Group__11101 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Real__Group__2_in_rule__Real__Group__11104 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Real__Group__1__Impl1132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Real__Group__2__Impl_in_rule__Real__Group__21163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Real__Group__2__Impl1190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__0__Impl_in_rule__Integer__Group__01225 = new BitSet(new long[]{0x0000000000010040L});
    public static final BitSet FOLLOW_rule__Integer__Group__1_in_rule__Integer__Group__01228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Integer__Group__0__Impl1257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Integer__Group__1__Impl_in_rule__Integer__Group__11290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Integer__Group__1__Impl1317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__LuaConfigFile__RowsAlternatives_0_in_rule__LuaConfigFile__RowsAssignment1355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MYCHAR_in_rule__Assignment__FeatureAssignment_0_01388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MYCHAR_in_rule__Assignment__AttributeAssignment_11419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Assignment__ValueAlternatives_3_0_in_rule__Assignment__ValueAssignment_31450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__GeneratedComment__ValueAlternatives_1_0_in_rule__GeneratedComment__ValueAssignment_11483 = new BitSet(new long[]{0x0000000000000002L});

}
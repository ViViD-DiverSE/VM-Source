package fr.inria.lang.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import fr.inria.lang.services.LuaConfigFileGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuaConfigFileParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_MYCHAR", "RULE_MYCOMMENT", "RULE_INT", "RULE_ID", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'.'", "'='", "'--'", "'-'"
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
    public String getGrammarFileName() { return "../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g"; }



     	private LuaConfigFileGrammarAccess grammarAccess;
     	
        public InternalLuaConfigFileParser(TokenStream input, LuaConfigFileGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "LuaConfigFile";	
       	}
       	
       	@Override
       	protected LuaConfigFileGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleLuaConfigFile"
    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:67:1: entryRuleLuaConfigFile returns [EObject current=null] : iv_ruleLuaConfigFile= ruleLuaConfigFile EOF ;
    public final EObject entryRuleLuaConfigFile() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLuaConfigFile = null;


        try {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:68:2: (iv_ruleLuaConfigFile= ruleLuaConfigFile EOF )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:69:2: iv_ruleLuaConfigFile= ruleLuaConfigFile EOF
            {
             newCompositeNode(grammarAccess.getLuaConfigFileRule()); 
            pushFollow(FOLLOW_ruleLuaConfigFile_in_entryRuleLuaConfigFile75);
            iv_ruleLuaConfigFile=ruleLuaConfigFile();

            state._fsp--;

             current =iv_ruleLuaConfigFile; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLuaConfigFile85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLuaConfigFile"


    // $ANTLR start "ruleLuaConfigFile"
    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:76:1: ruleLuaConfigFile returns [EObject current=null] : ( ( (lv_rows_0_1= ruleGeneratedComment | lv_rows_0_2= ruleAssignment ) ) )+ ;
    public final EObject ruleLuaConfigFile() throws RecognitionException {
        EObject current = null;

        EObject lv_rows_0_1 = null;

        EObject lv_rows_0_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:79:28: ( ( ( (lv_rows_0_1= ruleGeneratedComment | lv_rows_0_2= ruleAssignment ) ) )+ )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:80:1: ( ( (lv_rows_0_1= ruleGeneratedComment | lv_rows_0_2= ruleAssignment ) ) )+
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:80:1: ( ( (lv_rows_0_1= ruleGeneratedComment | lv_rows_0_2= ruleAssignment ) ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==RULE_MYCHAR||LA2_0==15) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:81:1: ( (lv_rows_0_1= ruleGeneratedComment | lv_rows_0_2= ruleAssignment ) )
            	    {
            	    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:81:1: ( (lv_rows_0_1= ruleGeneratedComment | lv_rows_0_2= ruleAssignment ) )
            	    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:82:1: (lv_rows_0_1= ruleGeneratedComment | lv_rows_0_2= ruleAssignment )
            	    {
            	    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:82:1: (lv_rows_0_1= ruleGeneratedComment | lv_rows_0_2= ruleAssignment )
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0==15) ) {
            	        alt1=1;
            	    }
            	    else if ( (LA1_0==RULE_MYCHAR) ) {
            	        alt1=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:83:3: lv_rows_0_1= ruleGeneratedComment
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getLuaConfigFileAccess().getRowsGeneratedCommentParserRuleCall_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleGeneratedComment_in_ruleLuaConfigFile132);
            	            lv_rows_0_1=ruleGeneratedComment();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getLuaConfigFileRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"rows",
            	                    		lv_rows_0_1, 
            	                    		"GeneratedComment");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:98:8: lv_rows_0_2= ruleAssignment
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getLuaConfigFileAccess().getRowsAssignmentParserRuleCall_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleAssignment_in_ruleLuaConfigFile151);
            	            lv_rows_0_2=ruleAssignment();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getLuaConfigFileRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"rows",
            	                    		lv_rows_0_2, 
            	                    		"Assignment");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLuaConfigFile"


    // $ANTLR start "entryRuleAssignment"
    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:124:1: entryRuleAssignment returns [EObject current=null] : iv_ruleAssignment= ruleAssignment EOF ;
    public final EObject entryRuleAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssignment = null;


        try {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:125:2: (iv_ruleAssignment= ruleAssignment EOF )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:126:2: iv_ruleAssignment= ruleAssignment EOF
            {
             newCompositeNode(grammarAccess.getAssignmentRule()); 
            pushFollow(FOLLOW_ruleAssignment_in_entryRuleAssignment190);
            iv_ruleAssignment=ruleAssignment();

            state._fsp--;

             current =iv_ruleAssignment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssignment200); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAssignment"


    // $ANTLR start "ruleAssignment"
    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:133:1: ruleAssignment returns [EObject current=null] : ( ( ( (lv_feature_0_0= RULE_MYCHAR ) ) otherlv_1= '.' ) ( (lv_attribute_2_0= RULE_MYCHAR ) ) otherlv_3= '=' ( ( (lv_value_4_1= ruleReal | lv_value_4_2= ruleInteger | lv_value_4_3= RULE_MYCHAR ) ) ) ) ;
    public final EObject ruleAssignment() throws RecognitionException {
        EObject current = null;

        Token lv_feature_0_0=null;
        Token otherlv_1=null;
        Token lv_attribute_2_0=null;
        Token otherlv_3=null;
        Token lv_value_4_3=null;
        AntlrDatatypeRuleToken lv_value_4_1 = null;

        AntlrDatatypeRuleToken lv_value_4_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:136:28: ( ( ( ( (lv_feature_0_0= RULE_MYCHAR ) ) otherlv_1= '.' ) ( (lv_attribute_2_0= RULE_MYCHAR ) ) otherlv_3= '=' ( ( (lv_value_4_1= ruleReal | lv_value_4_2= ruleInteger | lv_value_4_3= RULE_MYCHAR ) ) ) ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:137:1: ( ( ( (lv_feature_0_0= RULE_MYCHAR ) ) otherlv_1= '.' ) ( (lv_attribute_2_0= RULE_MYCHAR ) ) otherlv_3= '=' ( ( (lv_value_4_1= ruleReal | lv_value_4_2= ruleInteger | lv_value_4_3= RULE_MYCHAR ) ) ) )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:137:1: ( ( ( (lv_feature_0_0= RULE_MYCHAR ) ) otherlv_1= '.' ) ( (lv_attribute_2_0= RULE_MYCHAR ) ) otherlv_3= '=' ( ( (lv_value_4_1= ruleReal | lv_value_4_2= ruleInteger | lv_value_4_3= RULE_MYCHAR ) ) ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:137:2: ( ( (lv_feature_0_0= RULE_MYCHAR ) ) otherlv_1= '.' ) ( (lv_attribute_2_0= RULE_MYCHAR ) ) otherlv_3= '=' ( ( (lv_value_4_1= ruleReal | lv_value_4_2= ruleInteger | lv_value_4_3= RULE_MYCHAR ) ) )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:137:2: ( ( (lv_feature_0_0= RULE_MYCHAR ) ) otherlv_1= '.' )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:137:3: ( (lv_feature_0_0= RULE_MYCHAR ) ) otherlv_1= '.'
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:137:3: ( (lv_feature_0_0= RULE_MYCHAR ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:138:1: (lv_feature_0_0= RULE_MYCHAR )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:138:1: (lv_feature_0_0= RULE_MYCHAR )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:139:3: lv_feature_0_0= RULE_MYCHAR
            {
            lv_feature_0_0=(Token)match(input,RULE_MYCHAR,FOLLOW_RULE_MYCHAR_in_ruleAssignment243); 

            			newLeafNode(lv_feature_0_0, grammarAccess.getAssignmentAccess().getFeatureMYCHARTerminalRuleCall_0_0_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"feature",
                    		lv_feature_0_0, 
                    		"MYCHAR");
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_ruleAssignment260); 

                	newLeafNode(otherlv_1, grammarAccess.getAssignmentAccess().getFullStopKeyword_0_1());
                

            }

            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:159:2: ( (lv_attribute_2_0= RULE_MYCHAR ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:160:1: (lv_attribute_2_0= RULE_MYCHAR )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:160:1: (lv_attribute_2_0= RULE_MYCHAR )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:161:3: lv_attribute_2_0= RULE_MYCHAR
            {
            lv_attribute_2_0=(Token)match(input,RULE_MYCHAR,FOLLOW_RULE_MYCHAR_in_ruleAssignment278); 

            			newLeafNode(lv_attribute_2_0, grammarAccess.getAssignmentAccess().getAttributeMYCHARTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAssignmentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"attribute",
                    		lv_attribute_2_0, 
                    		"MYCHAR");
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FOLLOW_14_in_ruleAssignment295); 

                	newLeafNode(otherlv_3, grammarAccess.getAssignmentAccess().getEqualsSignKeyword_2());
                
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:181:1: ( ( (lv_value_4_1= ruleReal | lv_value_4_2= ruleInteger | lv_value_4_3= RULE_MYCHAR ) ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:182:1: ( (lv_value_4_1= ruleReal | lv_value_4_2= ruleInteger | lv_value_4_3= RULE_MYCHAR ) )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:182:1: ( (lv_value_4_1= ruleReal | lv_value_4_2= ruleInteger | lv_value_4_3= RULE_MYCHAR ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:183:1: (lv_value_4_1= ruleReal | lv_value_4_2= ruleInteger | lv_value_4_3= RULE_MYCHAR )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:183:1: (lv_value_4_1= ruleReal | lv_value_4_2= ruleInteger | lv_value_4_3= RULE_MYCHAR )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 16:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==RULE_INT) ) {
                    int LA3_2 = input.LA(3);

                    if ( (LA3_2==13) ) {
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

                if ( (LA3_2==13) ) {
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
                    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:184:3: lv_value_4_1= ruleReal
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueRealParserRuleCall_3_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleReal_in_ruleAssignment318);
                    lv_value_4_1=ruleReal();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_1, 
                            		"Real");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 2 :
                    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:199:8: lv_value_4_2= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getAssignmentAccess().getValueIntegerParserRuleCall_3_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleInteger_in_ruleAssignment337);
                    lv_value_4_2=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAssignmentRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_4_2, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;
                case 3 :
                    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:214:8: lv_value_4_3= RULE_MYCHAR
                    {
                    lv_value_4_3=(Token)match(input,RULE_MYCHAR,FOLLOW_RULE_MYCHAR_in_ruleAssignment352); 

                    			newLeafNode(lv_value_4_3, grammarAccess.getAssignmentAccess().getValueMYCHARTerminalRuleCall_3_0_2()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getAssignmentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_4_3, 
                            		"MYCHAR");
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAssignment"


    // $ANTLR start "entryRuleGeneratedComment"
    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:240:1: entryRuleGeneratedComment returns [EObject current=null] : iv_ruleGeneratedComment= ruleGeneratedComment EOF ;
    public final EObject entryRuleGeneratedComment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGeneratedComment = null;


        try {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:241:2: (iv_ruleGeneratedComment= ruleGeneratedComment EOF )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:242:2: iv_ruleGeneratedComment= ruleGeneratedComment EOF
            {
             newCompositeNode(grammarAccess.getGeneratedCommentRule()); 
            pushFollow(FOLLOW_ruleGeneratedComment_in_entryRuleGeneratedComment396);
            iv_ruleGeneratedComment=ruleGeneratedComment();

            state._fsp--;

             current =iv_ruleGeneratedComment; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGeneratedComment406); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGeneratedComment"


    // $ANTLR start "ruleGeneratedComment"
    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:249:1: ruleGeneratedComment returns [EObject current=null] : (otherlv_0= '--' ( ( (lv_value_1_1= RULE_MYCOMMENT | lv_value_1_2= ruleInteger ) ) ) ) ;
    public final EObject ruleGeneratedComment() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_value_1_1=null;
        AntlrDatatypeRuleToken lv_value_1_2 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:252:28: ( (otherlv_0= '--' ( ( (lv_value_1_1= RULE_MYCOMMENT | lv_value_1_2= ruleInteger ) ) ) ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:253:1: (otherlv_0= '--' ( ( (lv_value_1_1= RULE_MYCOMMENT | lv_value_1_2= ruleInteger ) ) ) )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:253:1: (otherlv_0= '--' ( ( (lv_value_1_1= RULE_MYCOMMENT | lv_value_1_2= ruleInteger ) ) ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:253:3: otherlv_0= '--' ( ( (lv_value_1_1= RULE_MYCOMMENT | lv_value_1_2= ruleInteger ) ) )
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleGeneratedComment443); 

                	newLeafNode(otherlv_0, grammarAccess.getGeneratedCommentAccess().getHyphenMinusHyphenMinusKeyword_0());
                
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:257:1: ( ( (lv_value_1_1= RULE_MYCOMMENT | lv_value_1_2= ruleInteger ) ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:258:1: ( (lv_value_1_1= RULE_MYCOMMENT | lv_value_1_2= ruleInteger ) )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:258:1: ( (lv_value_1_1= RULE_MYCOMMENT | lv_value_1_2= ruleInteger ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:259:1: (lv_value_1_1= RULE_MYCOMMENT | lv_value_1_2= ruleInteger )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:259:1: (lv_value_1_1= RULE_MYCOMMENT | lv_value_1_2= ruleInteger )
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
                    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:260:3: lv_value_1_1= RULE_MYCOMMENT
                    {
                    lv_value_1_1=(Token)match(input,RULE_MYCOMMENT,FOLLOW_RULE_MYCOMMENT_in_ruleGeneratedComment462); 

                    			newLeafNode(lv_value_1_1, grammarAccess.getGeneratedCommentAccess().getValueMYCOMMENTTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getGeneratedCommentRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"value",
                            		lv_value_1_1, 
                            		"MYCOMMENT");
                    	    

                    }
                    break;
                case 2 :
                    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:275:8: lv_value_1_2= ruleInteger
                    {
                     
                    	        newCompositeNode(grammarAccess.getGeneratedCommentAccess().getValueIntegerParserRuleCall_1_0_1()); 
                    	    
                    pushFollow(FOLLOW_ruleInteger_in_ruleGeneratedComment486);
                    lv_value_1_2=ruleInteger();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getGeneratedCommentRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_2, 
                            		"Integer");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }
                    break;

            }


            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGeneratedComment"


    // $ANTLR start "entryRuleReal"
    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:301:1: entryRuleReal returns [String current=null] : iv_ruleReal= ruleReal EOF ;
    public final String entryRuleReal() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleReal = null;


        try {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:302:2: (iv_ruleReal= ruleReal EOF )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:303:2: iv_ruleReal= ruleReal EOF
            {
             newCompositeNode(grammarAccess.getRealRule()); 
            pushFollow(FOLLOW_ruleReal_in_entryRuleReal526);
            iv_ruleReal=ruleReal();

            state._fsp--;

             current =iv_ruleReal.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleReal537); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleReal"


    // $ANTLR start "ruleReal"
    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:310:1: ruleReal returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleReal() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_2=null;
        AntlrDatatypeRuleToken this_Integer_0 = null;


         enterRule(); 
            
        try {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:313:28: ( (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:314:1: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:314:1: (this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:315:5: this_Integer_0= ruleInteger kw= '.' this_INT_2= RULE_INT
            {
             
                    newCompositeNode(grammarAccess.getRealAccess().getIntegerParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleInteger_in_ruleReal584);
            this_Integer_0=ruleInteger();

            state._fsp--;


            		current.merge(this_Integer_0);
                
             
                    afterParserOrEnumRuleCall();
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleReal602); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getRealAccess().getFullStopKeyword_1()); 
                
            this_INT_2=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleReal617); 

            		current.merge(this_INT_2);
                
             
                newLeafNode(this_INT_2, grammarAccess.getRealAccess().getINTTerminalRuleCall_2()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleReal"


    // $ANTLR start "entryRuleInteger"
    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:346:1: entryRuleInteger returns [String current=null] : iv_ruleInteger= ruleInteger EOF ;
    public final String entryRuleInteger() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleInteger = null;


        try {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:347:2: (iv_ruleInteger= ruleInteger EOF )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:348:2: iv_ruleInteger= ruleInteger EOF
            {
             newCompositeNode(grammarAccess.getIntegerRule()); 
            pushFollow(FOLLOW_ruleInteger_in_entryRuleInteger663);
            iv_ruleInteger=ruleInteger();

            state._fsp--;

             current =iv_ruleInteger.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleInteger674); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleInteger"


    // $ANTLR start "ruleInteger"
    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:355:1: ruleInteger returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleInteger() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:358:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:359:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:359:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:359:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:359:2: (kw= '-' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==16) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../fr.inria.lang.luaConfigFile/src-gen/fr/inria/lang/parser/antlr/internal/InternalLuaConfigFile.g:360:2: kw= '-'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleInteger713); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getIntegerAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleInteger730); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getIntegerAccess().getINTTerminalRuleCall_1()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleInteger"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleLuaConfigFile_in_entryRuleLuaConfigFile75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLuaConfigFile85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneratedComment_in_ruleLuaConfigFile132 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_ruleAssignment_in_ruleLuaConfigFile151 = new BitSet(new long[]{0x0000000000008012L});
    public static final BitSet FOLLOW_ruleAssignment_in_entryRuleAssignment190 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssignment200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MYCHAR_in_ruleAssignment243 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleAssignment260 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_MYCHAR_in_ruleAssignment278 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_14_in_ruleAssignment295 = new BitSet(new long[]{0x0000000000010050L});
    public static final BitSet FOLLOW_ruleReal_in_ruleAssignment318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleAssignment337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_MYCHAR_in_ruleAssignment352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGeneratedComment_in_entryRuleGeneratedComment396 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGeneratedComment406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleGeneratedComment443 = new BitSet(new long[]{0x0000000000010060L});
    public static final BitSet FOLLOW_RULE_MYCOMMENT_in_ruleGeneratedComment462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleGeneratedComment486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleReal_in_entryRuleReal526 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleReal537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_ruleReal584 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleReal602 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleReal617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleInteger_in_entryRuleInteger663 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleInteger674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleInteger713 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleInteger730 = new BitSet(new long[]{0x0000000000000002L});

}
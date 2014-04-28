package fr.inria.lang.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalLuaConfigFileLexer extends Lexer {
    public static final int RULE_ID=7;
    public static final int RULE_STRING=8;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_MYCHAR=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int RULE_INT=6;
    public static final int RULE_MYCOMMENT=5;
    public static final int RULE_WS=11;
    public static final int RULE_SL_COMMENT=10;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=9;

    // delegates
    // delegators

    public InternalLuaConfigFileLexer() {;} 
    public InternalLuaConfigFileLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalLuaConfigFileLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g"; }

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:11:7: ( '=' )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:11:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:12:7: ( '.' )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:12:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:13:7: ( '--' )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:13:9: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:14:7: ( '-' )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:14:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "RULE_MYCHAR"
    public final void mRULE_MYCHAR() throws RecognitionException {
        try {
            int _type = RULE_MYCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:769:13: ( ( 'a' .. 'z' | 'A' .. 'Z' )+ )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:769:15: ( 'a' .. 'z' | 'A' .. 'Z' )+
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:769:15: ( 'a' .. 'z' | 'A' .. 'Z' )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='A' && LA1_0<='Z')||(LA1_0>='a' && LA1_0<='z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:
            	    {
            	    if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MYCHAR"

    // $ANTLR start "RULE_MYCOMMENT"
    public final void mRULE_MYCOMMENT() throws RecognitionException {
        try {
            int _type = RULE_MYCOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:771:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | ':' | ' ' )+ )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:771:18: ( 'a' .. 'z' | 'A' .. 'Z' | ':' | ' ' )+
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:771:18: ( 'a' .. 'z' | 'A' .. 'Z' | ':' | ' ' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==' '||LA2_0==':'||(LA2_0>='A' && LA2_0<='Z')||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:
            	    {
            	    if ( input.LA(1)==' '||input.LA(1)==':'||(input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


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

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_MYCOMMENT"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:773:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:773:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:773:11: ( '^' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='^') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:773:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:773:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:775:10: ( ( '0' .. '9' )+ )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:775:12: ( '0' .. '9' )+
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:775:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:775:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:13: ( ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:15: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='\"') ) {
                alt8=1;
            }
            else if ( (LA8_0=='\'') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:16: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:20: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop6:
                    do {
                        int alt6=3;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0=='\\') ) {
                            alt6=1;
                        }
                        else if ( ((LA6_0>='\u0000' && LA6_0<='!')||(LA6_0>='#' && LA6_0<='[')||(LA6_0>=']' && LA6_0<='\uFFFF')) ) {
                            alt6=2;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:21: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:66: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:86: '\\'' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:91: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' ) | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop7:
                    do {
                        int alt7=3;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0=='\\') ) {
                            alt7=1;
                        }
                        else if ( ((LA7_0>='\u0000' && LA7_0<='&')||(LA7_0>='(' && LA7_0<='[')||(LA7_0>=']' && LA7_0<='\uFFFF')) ) {
                            alt7=2;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:92: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | 'u' | '\"' | '\\'' | '\\\\' )
                    	    {
                    	    match('\\'); 
                    	    if ( input.LA(1)=='\"'||input.LA(1)=='\''||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||(input.LA(1)>='t' && input.LA(1)<='u') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;
                    	case 2 :
                    	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:777:137: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:779:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:779:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:779:24: ( options {greedy=false; } : . )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0=='*') ) {
                    int LA9_1 = input.LA(2);

                    if ( (LA9_1=='/') ) {
                        alt9=2;
                    }
                    else if ( ((LA9_1>='\u0000' && LA9_1<='.')||(LA9_1>='0' && LA9_1<='\uFFFF')) ) {
                        alt9=1;
                    }


                }
                else if ( ((LA9_0>='\u0000' && LA9_0<=')')||(LA9_0>='+' && LA9_0<='\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:779:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:781:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:781:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:781:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='\u0000' && LA10_0<='\t')||(LA10_0>='\u000B' && LA10_0<='\f')||(LA10_0>='\u000E' && LA10_0<='\uFFFF')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:781:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:781:40: ( ( '\\r' )? '\\n' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='\n'||LA12_0=='\r') ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:781:41: ( '\\r' )? '\\n'
                    {
                    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:781:41: ( '\\r' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0=='\r') ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:781:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:783:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:783:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:783:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\t' && LA13_0<='\n')||LA13_0=='\r'||LA13_0==' ') ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:785:16: ( . )
            // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:785:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:8: ( T__13 | T__14 | T__15 | T__16 | RULE_MYCHAR | RULE_MYCOMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt14=13;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:10: T__13
                {
                mT__13(); 

                }
                break;
            case 2 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:16: T__14
                {
                mT__14(); 

                }
                break;
            case 3 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:22: T__15
                {
                mT__15(); 

                }
                break;
            case 4 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:28: T__16
                {
                mT__16(); 

                }
                break;
            case 5 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:34: RULE_MYCHAR
                {
                mRULE_MYCHAR(); 

                }
                break;
            case 6 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:46: RULE_MYCOMMENT
                {
                mRULE_MYCOMMENT(); 

                }
                break;
            case 7 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:61: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 8 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:69: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 9 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:78: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 10 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:90: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 11 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:106: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 12 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:122: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 13 :
                // ../fr.inria.lang.luaConfigFile.ui/src-gen/fr/inria/lang/ui/contentassist/antlr/internal/InternalLuaConfigFile.g:1:130: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\3\uffff\1\22\1\23\1\25\1\16\2\uffff\3\16\10\uffff\1\23\2\uffff"+
        "\1\25\5\uffff";
    static final String DFA14_eofS =
        "\35\uffff";
    static final String DFA14_minS =
        "\1\0\2\uffff\1\55\1\40\1\11\1\101\2\uffff\2\0\1\52\10\uffff\1\40"+
        "\2\uffff\1\11\5\uffff";
    static final String DFA14_maxS =
        "\1\uffff\2\uffff\1\55\1\172\1\40\1\172\2\uffff\2\uffff\1\57\10\uffff"+
        "\1\172\2\uffff\1\40\5\uffff";
    static final String DFA14_acceptS =
        "\1\uffff\1\1\1\2\4\uffff\1\7\1\10\3\uffff\1\6\1\14\1\15\1\1\1\2"+
        "\1\3\1\4\1\5\1\uffff\1\6\1\7\1\uffff\1\14\1\10\1\11\1\12\1\13";
    static final String DFA14_specialS =
        "\1\0\10\uffff\1\1\1\2\22\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\16\2\15\2\16\1\15\22\16\1\5\1\16\1\11\4\16\1\12\5\16\1\3"+
            "\1\2\1\13\12\10\1\14\2\16\1\1\3\16\32\4\3\16\1\6\1\7\1\16\32"+
            "\4\uff85\16",
            "",
            "",
            "\1\21",
            "\1\25\17\uffff\12\26\1\25\6\uffff\32\24\4\uffff\1\26\1\uffff"+
            "\32\24",
            "\2\30\2\uffff\1\30\22\uffff\1\27",
            "\32\26\4\uffff\1\26\1\uffff\32\26",
            "",
            "",
            "\0\32",
            "\0\32",
            "\1\33\4\uffff\1\34",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\25\17\uffff\12\26\1\25\6\uffff\32\24\4\uffff\1\26\1\uffff"+
            "\32\24",
            "",
            "",
            "\2\30\2\uffff\1\30\22\uffff\1\27",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA14_eot = DFA.unpackEncodedString(DFA14_eotS);
    static final short[] DFA14_eof = DFA.unpackEncodedString(DFA14_eofS);
    static final char[] DFA14_min = DFA.unpackEncodedStringToUnsignedChars(DFA14_minS);
    static final char[] DFA14_max = DFA.unpackEncodedStringToUnsignedChars(DFA14_maxS);
    static final short[] DFA14_accept = DFA.unpackEncodedString(DFA14_acceptS);
    static final short[] DFA14_special = DFA.unpackEncodedString(DFA14_specialS);
    static final short[][] DFA14_transition;

    static {
        int numStates = DFA14_transitionS.length;
        DFA14_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA14_transition[i] = DFA.unpackEncodedString(DFA14_transitionS[i]);
        }
    }

    class DFA14 extends DFA {

        public DFA14(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 14;
            this.eot = DFA14_eot;
            this.eof = DFA14_eof;
            this.min = DFA14_min;
            this.max = DFA14_max;
            this.accept = DFA14_accept;
            this.special = DFA14_special;
            this.transition = DFA14_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__13 | T__14 | T__15 | T__16 | RULE_MYCHAR | RULE_MYCOMMENT | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='=') ) {s = 1;}

                        else if ( (LA14_0=='.') ) {s = 2;}

                        else if ( (LA14_0=='-') ) {s = 3;}

                        else if ( ((LA14_0>='A' && LA14_0<='Z')||(LA14_0>='a' && LA14_0<='z')) ) {s = 4;}

                        else if ( (LA14_0==' ') ) {s = 5;}

                        else if ( (LA14_0=='^') ) {s = 6;}

                        else if ( (LA14_0=='_') ) {s = 7;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 8;}

                        else if ( (LA14_0=='\"') ) {s = 9;}

                        else if ( (LA14_0=='\'') ) {s = 10;}

                        else if ( (LA14_0=='/') ) {s = 11;}

                        else if ( (LA14_0==':') ) {s = 12;}

                        else if ( ((LA14_0>='\t' && LA14_0<='\n')||LA14_0=='\r') ) {s = 13;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||(LA14_0>='\u000B' && LA14_0<='\f')||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||(LA14_0>='#' && LA14_0<='&')||(LA14_0>='(' && LA14_0<=',')||(LA14_0>=';' && LA14_0<='<')||(LA14_0>='>' && LA14_0<='@')||(LA14_0>='[' && LA14_0<=']')||LA14_0=='`'||(LA14_0>='{' && LA14_0<='\uFFFF')) ) {s = 14;}

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_9 = input.LA(1);

                        s = -1;
                        if ( ((LA14_9>='\u0000' && LA14_9<='\uFFFF')) ) {s = 26;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA14_10 = input.LA(1);

                        s = -1;
                        if ( ((LA14_10>='\u0000' && LA14_10<='\uFFFF')) ) {s = 26;}

                        else s = 14;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
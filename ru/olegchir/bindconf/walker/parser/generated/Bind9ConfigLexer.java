// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-19 19:49:35

package ru.olegchir.bindconf.walker.parser.generated;
import ru.olegchir.bindconf.walker.parser.override.Bind9LexerOverrider;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class Bind9ConfigLexer extends Lexer {
    public static final int IP6_VALID_CHAR=29;
    public static final int ST_ZONE_PLIST=10;
    public static final int ST_ZONE_MASTER=4;
    public static final int ST_ZONE_FORWARD=8;
    public static final int EOF=-1;
    public static final int ST_ZONE_SLAVE=5;
    public static final int ST_ZONE_DELEGATION=9;
    public static final int ST_ZONE_STUB=7;
    public static final int PERL_COMMENT=23;
    public static final int ANY_ASCII_ALPHANUM=28;
    public static final int CPP_COMMENT=22;
    public static final int NL=16;
    public static final int DIGIT=27;
    public static final int COMMENT=15;
    public static final int TYPE_YES_OR_NO=25;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int ST_TESTING_PLIST=12;
    public static final int T__49=49;
    public static final int NUMBER=20;
    public static final int ST_TESTING=11;
    public static final int PLIST_PARAM=13;
    public static final int ST_ZONE_HINT=6;
    public static final int T__31=31;
    public static final int NLF=30;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=24;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int BAD=14;
    public static final int IP4_ADDR=18;
    public static final int IP6_ADDR=19;
    public static final int ALPHANUM_WORD=17;
    public static final int C_COMMENT=21;
    public static final int FOUR_DIGIT_NUMBER=26;

    private Bind9LexerOverrider overrider;

    public Bind9LexerOverrider getOverrider() {
    	return overrider;
    }

    public Bind9ConfigLexer(CharStream input, RecognizerSharedState state, Bind9LexerOverrider overrider) {
    	this(input, state);
    	this.overrider = overrider;
    	this.overrider.setOwner(this);
    }

    public Bind9ConfigLexer(CharStream input, Bind9LexerOverrider overrider) {
    	this(input, new RecognizerSharedState(), overrider);
    }   


    // delegates
    // delegators

    public Bind9ConfigLexer() {;} 
    public Bind9ConfigLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Bind9ConfigLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g"; }

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:25:7: ( 'zone' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:25:9: 'zone'
            {
            match("zone"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:26:7: ( 'IN' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:26:9: 'IN'
            {
            match("IN"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:27:7: ( 'HS' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:27:9: 'HS'
            {
            match("HS"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:28:7: ( 'CHAOS' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:28:9: 'CHAOS'
            {
            match("CHAOS"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:29:7: ( '{' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:29:9: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:30:7: ( '}' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:30:9: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:31:7: ( 'forward' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:31:9: 'forward'
            {
            match("forward"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:32:7: ( ';' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:32:9: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:33:7: ( 'first' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:33:9: 'first'
            {
            match("first"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:34:7: ( 'only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:34:9: 'only'
            {
            match("only"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:35:7: ( 'type' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:35:9: 'type'
            {
            match("type"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:36:7: ( 'master' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:36:9: 'master'
            {
            match("master"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:37:7: ( 'slave' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:37:9: 'slave'
            {
            match("slave"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:38:7: ( 'stub' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:38:9: 'stub'
            {
            match("stub"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:39:7: ( 'hint' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:39:9: 'hint'
            {
            match("hint"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:40:7: ( 'delegation-only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:40:9: 'delegation-only'
            {
            match("delegation-only"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:41:7: ( 'testing' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:41:9: 'testing'
            {
            match("testing"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:42:7: ( 'ip4' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:42:9: 'ip4'
            {
            match("ip4"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:43:7: ( '.' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:43:9: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:226:9: ( ( C_COMMENT | CPP_COMMENT | PERL_COMMENT ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:226:11: ( C_COMMENT | CPP_COMMENT | PERL_COMMENT )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:226:11: ( C_COMMENT | CPP_COMMENT | PERL_COMMENT )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='/') ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1=='*') ) {
                    alt1=1;
                }
                else if ( (LA1_1=='/') ) {
                    alt1=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA1_0=='#') ) {
                alt1=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:226:12: C_COMMENT
                    {
                    mC_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:226:24: CPP_COMMENT
                    {
                    mCPP_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:226:38: PERL_COMMENT
                    {
                    mPERL_COMMENT(); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               _channel=HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "C_COMMENT"
    public final void mC_COMMENT() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:228:20: ( '/*' ( (~ '*' | '*' ~ '/' )=> . )* '*/' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:228:22: '/*' ( (~ '*' | '*' ~ '/' )=> . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:228:27: ( (~ '*' | '*' ~ '/' )=> . )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1=='/') ) {
                        int LA2_3 = input.LA(3);

                        if ( (LA2_3=='*') && (synpred1_Bind9Config())) {
                            alt2=1;
                        }
                        else if ( ((LA2_3>='\u0000' && LA2_3<=')')||(LA2_3>='+' && LA2_3<='\uFFFF')) && (synpred1_Bind9Config())) {
                            alt2=1;
                        }


                    }
                    else if ( (LA2_1=='*') && (synpred1_Bind9Config())) {
                        alt2=1;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<=')')||(LA2_1>='+' && LA2_1<='.')||(LA2_1>='0' && LA2_1<='\uFFFF')) && (synpred1_Bind9Config())) {
                        alt2=1;
                    }


                }
                else if ( ((LA2_0>='\u0000' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) && (synpred1_Bind9Config())) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:228:29: (~ '*' | '*' ~ '/' )=> .
            	    {
            	    matchAny(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*/"); if (state.failed) return ;


            }

        }
        finally {
        }
    }
    // $ANTLR end "C_COMMENT"

    // $ANTLR start "CPP_COMMENT"
    public final void mCPP_COMMENT() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:231:2: ( '//' (~ ( '\\r' | '\\n' ) )* NL )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:231:4: '//' (~ ( '\\r' | '\\n' ) )* NL
            {
            match("//"); if (state.failed) return ;

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:231:9: (~ ( '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:231:10: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            mNL(); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "CPP_COMMENT"

    // $ANTLR start "PERL_COMMENT"
    public final void mPERL_COMMENT() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:234:2: ( '#' (~ ( '\\r' | '\\n' ) )* NL )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:234:4: '#' (~ ( '\\r' | '\\n' ) )* NL
            {
            match('#'); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:234:8: (~ ( '\\r' | '\\n' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:234:9: ~ ( '\\r' | '\\n' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            mNL(); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "PERL_COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:238:4: ( ( ' ' | '\\t' | '\\f' | NL )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:238:6: ( ' ' | '\\t' | '\\f' | NL )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:238:6: ( ' ' | '\\t' | '\\f' | NL )+
            int cnt5=0;
            loop5:
            do {
                int alt5=5;
                switch ( input.LA(1) ) {
                case ' ':
                    {
                    alt5=1;
                    }
                    break;
                case '\t':
                    {
                    alt5=2;
                    }
                    break;
                case '\f':
                    {
                    alt5=3;
                    }
                    break;
                case '\n':
                case '\r':
                    {
                    alt5=4;
                    }
                    break;

                }

                switch (alt5) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:238:7: ' '
            	    {
            	    match(' '); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:238:11: '\\t'
            	    {
            	    match('\t'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:238:16: '\\f'
            	    {
            	    match('\f'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:238:21: NL
            	    {
            	    mNL(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

            if ( state.backtracking==0 ) {
               _channel=HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:242:2: ( ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='\r') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='\n') && (synpred2_Bind9Config())) {
                    alt7=1;
                }
                else {
                    alt7=2;}
            }
            else if ( (LA7_0=='\n') && (synpred2_Bind9Config())) {
                alt7=1;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:242:4: ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n'
                    {
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:242:19: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:242:19: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:6: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "TYPE_YES_OR_NO"
    public final void mTYPE_YES_OR_NO() throws RecognitionException {
        try {
            int _type = TYPE_YES_OR_NO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:2: ( 'yes' | 'no' | 'true' | 'false' | '0' | '1' )
            int alt8=6;
            switch ( input.LA(1) ) {
            case 'y':
                {
                alt8=1;
                }
                break;
            case 'n':
                {
                alt8=2;
                }
                break;
            case 't':
                {
                alt8=3;
                }
                break;
            case 'f':
                {
                alt8=4;
                }
                break;
            case '0':
                {
                alt8=5;
                }
                break;
            case '1':
                {
                alt8=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:4: 'yes'
                    {
                    match("yes"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:10: 'no'
                    {
                    match("no"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:15: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:22: 'false'
                    {
                    match("false"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:30: '0'
                    {
                    match('0'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:34: '1'
                    {
                    match('1'); if (state.failed) return ;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TYPE_YES_OR_NO"

    // $ANTLR start "IP4_ADDR"
    public final void mIP4_ADDR() throws RecognitionException {
        try {
            int _type = IP4_ADDR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:250:9: ( FOUR_DIGIT_NUMBER '.' FOUR_DIGIT_NUMBER '.' FOUR_DIGIT_NUMBER '.' FOUR_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:250:11: FOUR_DIGIT_NUMBER '.' FOUR_DIGIT_NUMBER '.' FOUR_DIGIT_NUMBER '.' FOUR_DIGIT_NUMBER
            {
            mFOUR_DIGIT_NUMBER(); if (state.failed) return ;
            match('.'); if (state.failed) return ;
            mFOUR_DIGIT_NUMBER(); if (state.failed) return ;
            match('.'); if (state.failed) return ;
            mFOUR_DIGIT_NUMBER(); if (state.failed) return ;
            match('.'); if (state.failed) return ;
            mFOUR_DIGIT_NUMBER(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP4_ADDR"

    // $ANTLR start "FOUR_DIGIT_NUMBER"
    public final void mFOUR_DIGIT_NUMBER() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:254:2: ( DIGIT | DIGIT DIGIT | DIGIT DIGIT DIGIT | DIGIT DIGIT DIGIT DIGIT )
            int alt9=4;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>='0' && LA9_1<='9')) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3>='0' && LA9_3<='9')) ) {
                        int LA9_5 = input.LA(4);

                        if ( ((LA9_5>='0' && LA9_5<='9')) ) {
                            alt9=4;
                        }
                        else {
                            alt9=3;}
                    }
                    else {
                        alt9=2;}
                }
                else {
                    alt9=1;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:254:4: DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:255:4: DIGIT DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:256:4: DIGIT DIGIT DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;
                    mDIGIT(); if (state.failed) return ;
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:257:4: DIGIT DIGIT DIGIT DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;
                    mDIGIT(); if (state.failed) return ;
                    mDIGIT(); if (state.failed) return ;
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "FOUR_DIGIT_NUMBER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:260:8: ( ( DIGIT )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:260:10: ( DIGIT )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:260:10: ( DIGIT )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:260:10: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NUMBER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:262:16: ( '0' .. '9' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:262:18: '0' .. '9'
            {
            matchRange('0','9'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ALPHANUM_WORD"
    public final void mALPHANUM_WORD() throws RecognitionException {
        try {
            int _type = ALPHANUM_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='0' && LA11_0<='9')||(LA11_0>='A' && LA11_0<='Z')||LA11_0=='_'||(LA11_0>='a' && LA11_0<='z')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ALPHANUM_WORD"

    // $ANTLR start "ANY_ASCII_ALPHANUM"
    public final void mANY_ASCII_ALPHANUM() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:267:2: ( ( '\\u0020' .. '\\u007F' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:267:4: ( '\\u0020' .. '\\u007F' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:267:4: ( '\\u0020' .. '\\u007F' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:267:5: '\\u0020' .. '\\u007F'
            {
            matchRange(' ','\u007F'); if (state.failed) return ;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "ANY_ASCII_ALPHANUM"

    // $ANTLR start "IP6_ADDR"
    public final void mIP6_ADDR() throws RecognitionException {
        try {
            int _type = IP6_ADDR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:270:9: ( ( IP6_VALID_CHAR )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:270:11: ( IP6_VALID_CHAR )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:270:11: ( IP6_VALID_CHAR )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0=='%'||(LA12_0>='0' && LA12_0<=':')||(LA12_0>='A' && LA12_0<='Z')||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:270:12: IP6_VALID_CHAR
            	    {
            	    mIP6_VALID_CHAR(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP6_ADDR"

    // $ANTLR start "IP6_VALID_CHAR"
    public final void mIP6_VALID_CHAR() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:2: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=6;
                switch ( input.LA(1) ) {
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt13=1;
                    }
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                    {
                    alt13=2;
                    }
                    break;
                case ':':
                    {
                    alt13=3;
                    }
                    break;
                case '%':
                    {
                    alt13=4;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt13=5;
                    }
                    break;

                }

                switch (alt13) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:5: ( 'a' .. 'z' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:5: ( 'a' .. 'z' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:6: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:16: ( 'A' .. 'Z' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:16: ( 'A' .. 'Z' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:17: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 3 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:27: ':'
            	    {
            	    match(':'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:31: '%'
            	    {
            	    match('%'); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:35: ( '0' .. '9' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:35: ( '0' .. '9' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);


            }

        }
        finally {
        }
    }
    // $ANTLR end "IP6_VALID_CHAR"

    // $ANTLR start "NLF"
    public final void mNLF() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:278:2: ( NL | EOF )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='\n'||LA14_0=='\r') ) {
                alt14=1;
            }
            else {
                alt14=2;}
            switch (alt14) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:278:4: NL
                    {
                    mNL(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:278:7: EOF
                    {
                    match(EOF); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "NLF"

    // $ANTLR start "BAD"
    public final void mBAD() throws RecognitionException {
        try {
            int _type = BAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:281:6: ( . )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:281:8: .
            {
            matchAny(); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               overrider.registerLexicalError("The character '" + getText() + "' mismatched."); 
            }

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BAD"

    public void mTokens() throws RecognitionException {
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:8: ( T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | COMMENT | WS | TYPE_YES_OR_NO | IP4_ADDR | NUMBER | ALPHANUM_WORD | IP6_ADDR | BAD )
        int alt15=27;
        alt15 = dfa15.predict(input);
        switch (alt15) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:10: T__31
                {
                mT__31(); if (state.failed) return ;

                }
                break;
            case 2 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:16: T__32
                {
                mT__32(); if (state.failed) return ;

                }
                break;
            case 3 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:22: T__33
                {
                mT__33(); if (state.failed) return ;

                }
                break;
            case 4 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:28: T__34
                {
                mT__34(); if (state.failed) return ;

                }
                break;
            case 5 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:34: T__35
                {
                mT__35(); if (state.failed) return ;

                }
                break;
            case 6 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:40: T__36
                {
                mT__36(); if (state.failed) return ;

                }
                break;
            case 7 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:46: T__37
                {
                mT__37(); if (state.failed) return ;

                }
                break;
            case 8 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:52: T__38
                {
                mT__38(); if (state.failed) return ;

                }
                break;
            case 9 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:58: T__39
                {
                mT__39(); if (state.failed) return ;

                }
                break;
            case 10 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:64: T__40
                {
                mT__40(); if (state.failed) return ;

                }
                break;
            case 11 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:70: T__41
                {
                mT__41(); if (state.failed) return ;

                }
                break;
            case 12 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:76: T__42
                {
                mT__42(); if (state.failed) return ;

                }
                break;
            case 13 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:82: T__43
                {
                mT__43(); if (state.failed) return ;

                }
                break;
            case 14 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:88: T__44
                {
                mT__44(); if (state.failed) return ;

                }
                break;
            case 15 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:94: T__45
                {
                mT__45(); if (state.failed) return ;

                }
                break;
            case 16 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:100: T__46
                {
                mT__46(); if (state.failed) return ;

                }
                break;
            case 17 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:106: T__47
                {
                mT__47(); if (state.failed) return ;

                }
                break;
            case 18 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:112: T__48
                {
                mT__48(); if (state.failed) return ;

                }
                break;
            case 19 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:118: T__49
                {
                mT__49(); if (state.failed) return ;

                }
                break;
            case 20 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:124: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 21 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:132: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 22 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:135: TYPE_YES_OR_NO
                {
                mTYPE_YES_OR_NO(); if (state.failed) return ;

                }
                break;
            case 23 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:150: IP4_ADDR
                {
                mIP4_ADDR(); if (state.failed) return ;

                }
                break;
            case 24 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:159: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 25 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:166: ALPHANUM_WORD
                {
                mALPHANUM_WORD(); if (state.failed) return ;

                }
                break;
            case 26 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:180: IP6_ADDR
                {
                mIP6_ADDR(); if (state.failed) return ;

                }
                break;
            case 27 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:189: BAD
                {
                mBAD(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Bind9Config
    public final void synpred1_Bind9Config_fragment() throws RecognitionException {   
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:228:29: (~ '*' | '*' ~ '/' )
        int alt16=2;
        int LA16_0 = input.LA(1);

        if ( ((LA16_0>='\u0000' && LA16_0<=')')||(LA16_0>='+' && LA16_0<='\uFFFF')) ) {
            alt16=1;
        }
        else if ( (LA16_0=='*') ) {
            alt16=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 16, 0, input);

            throw nvae;
        }
        switch (alt16) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:228:30: ~ '*'
                {
                if ( (input.LA(1)>='\u0000' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
                    input.consume();
                state.failed=false;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    recover(mse);
                    throw mse;}


                }
                break;
            case 2 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:228:37: '*' ~ '/'
                {
                match('*'); if (state.failed) return ;
                if ( (input.LA(1)>='\u0000' && input.LA(1)<='.')||(input.LA(1)>='0' && input.LA(1)<='\uFFFF') ) {
                    input.consume();
                state.failed=false;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    MismatchedSetException mse = new MismatchedSetException(null,input);
                    recover(mse);
                    throw mse;}


                }
                break;

        }}
    // $ANTLR end synpred1_Bind9Config

    // $ANTLR start synpred2_Bind9Config
    public final void synpred2_Bind9Config_fragment() throws RecognitionException {   
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:242:4: ( ( '\\r' )? '\\n' )
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:242:5: ( '\\r' )? '\\n'
        {
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:242:5: ( '\\r' )?
        int alt17=2;
        int LA17_0 = input.LA(1);

        if ( (LA17_0=='\r') ) {
            alt17=1;
        }
        switch (alt17) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:242:5: '\\r'
                {
                match('\r'); if (state.failed) return ;

                }
                break;

        }

        match('\n'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Bind9Config

    public final boolean synpred1_Bind9Config() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Bind9Config_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Bind9Config() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Bind9Config_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA15 dfa15 = new DFA15(this);
    static final String DFA15_eotS =
        "\5\36\2\uffff\1\36\1\uffff\7\36\1\uffff\2\43\5\uffff\2\36\2\101"+
        "\1\104\1\36\1\uffff\1\36\4\uffff\4\36\1\uffff\1\106\1\107\1\36\2"+
        "\uffff\3\36\1\uffff\12\36\3\uffff\1\36\1\101\1\uffff\1\104\2\uffff"+
        "\1\36\2\uffff\15\36\1\146\1\101\1\104\1\150\4\36\1\155\1\156\1\36"+
        "\1\101\2\36\1\162\1\163\1\36\1\uffff\1\104\1\uffff\1\166\1\36\1"+
        "\170\1\101\2\uffff\2\36\1\173\2\uffff\1\36\1\104\1\uffff\1\36\1"+
        "\uffff\1\36\1\177\1\uffff\1\36\1\u0081\1\u0082\1\uffff\1\36\2\uffff"+
        "\3\36\1\uffff";
    static final String DFA15_eofS =
        "\u0087\uffff";
    static final String DFA15_minS =
        "\1\0\4\45\2\uffff\1\45\1\uffff\7\45\1\uffff\1\52\1\0\5\uffff\6"+
        "\45\1\uffff\1\45\4\uffff\4\45\1\uffff\3\45\2\uffff\3\45\1\uffff"+
        "\12\45\3\uffff\2\45\1\uffff\1\45\2\uffff\1\45\2\uffff\36\45\1\uffff"+
        "\1\45\1\uffff\4\45\2\uffff\3\45\2\uffff\2\45\1\uffff\1\45\1\uffff"+
        "\2\45\1\uffff\3\45\1\uffff\1\45\2\uffff\3\45\1\uffff";
    static final String DFA15_maxS =
        "\1\uffff\4\172\2\uffff\1\172\1\uffff\7\172\1\uffff\1\57\1\uffff"+
        "\5\uffff\6\172\1\uffff\1\172\4\uffff\4\172\1\uffff\3\172\2\uffff"+
        "\3\172\1\uffff\12\172\3\uffff\2\172\1\uffff\1\172\2\uffff\1\172"+
        "\2\uffff\36\172\1\uffff\1\172\1\uffff\4\172\2\uffff\3\172\2\uffff"+
        "\2\172\1\uffff\1\172\1\uffff\2\172\1\uffff\3\172\1\uffff\1\172\2"+
        "\uffff\3\172\1\uffff";
    static final String DFA15_acceptS =
        "\5\uffff\1\5\1\6\1\uffff\1\10\7\uffff\1\23\2\uffff\5\25\6\uffff"+
        "\1\31\1\uffff\1\31\2\32\1\33\4\uffff\1\32\3\uffff\1\5\1\6\3\uffff"+
        "\1\10\12\uffff\1\23\1\24\1\25\2\uffff\1\26\1\uffff\1\27\1\30\1\uffff"+
        "\1\2\1\3\36\uffff\1\22\1\uffff\1\1\4\uffff\1\12\1\13\3\uffff\1\16"+
        "\1\17\2\uffff\1\4\1\uffff\1\11\2\uffff\1\15\3\uffff\1\14\1\uffff"+
        "\1\7\1\21\3\uffff\1\20";
    static final String DFA15_specialS =
        "\1\0\21\uffff\1\1\164\uffff}>";
    static final String[] DFA15_transitionS = {
            "\11\43\1\24\1\27\1\43\1\25\1\26\22\43\1\23\2\43\1\22\1\43\1"+
            "\42\10\43\1\20\1\21\1\32\1\33\10\34\1\41\1\10\5\43\2\37\1\4"+
            "\4\37\1\3\1\2\21\37\4\43\1\40\1\43\3\35\1\16\1\35\1\7\1\35\1"+
            "\15\1\17\3\35\1\13\1\31\1\11\3\35\1\14\1\12\4\35\1\30\1\1\1"+
            "\5\1\43\1\6\uff82\43",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\16\45\1\44"+
            "\13\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\15\46\1\51\14\46\6\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\22\46\1\52\7\46\6\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\7\46\1\53\22\46\6\uffff"+
            "\32\45",
            "",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\1\60\7\45"+
            "\1\57\5\45\1\56\13\45",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\15\45\1\62"+
            "\14\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\4\45\1\64"+
            "\14\45\1\65\6\45\1\63\1\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\1\66\31\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\13\45\1\67"+
            "\7\45\1\70\6\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\10\45\1\71"+
            "\21\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\4\45\1\72"+
            "\25\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\17\45\1\73"+
            "\12\45",
            "",
            "\1\75\4\uffff\1\75",
            "\0\75",
            "",
            "",
            "",
            "",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\4\45\1\77"+
            "\25\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\16\45\1\100"+
            "\13\45",
            "\1\50\10\uffff\1\103\1\uffff\12\102\1\50\6\uffff\32\46\4\uffff"+
            "\1\36\1\uffff\32\45",
            "\1\50\10\uffff\1\103\1\uffff\12\102\1\50\6\uffff\32\46\4\uffff"+
            "\1\36\1\uffff\32\45",
            "\1\50\10\uffff\1\103\1\uffff\12\102\1\50\6\uffff\32\46\4\uffff"+
            "\1\36\1\uffff\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\32\45",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\32\45",
            "",
            "",
            "",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\15\45\1\105"+
            "\14\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\32\45",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\1\110\31\46\6\uffff\32\45",
            "",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\21\45\1\111"+
            "\10\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\21\45\1\112"+
            "\10\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\13\45\1\113"+
            "\16\45",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\13\45\1\114"+
            "\16\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\17\45\1\115"+
            "\12\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\22\45\1\116"+
            "\7\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\24\45\1\117"+
            "\5\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\22\45\1\120"+
            "\7\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\1\121\31\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\24\45\1\122"+
            "\5\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\15\45\1\123"+
            "\14\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\13\45\1\124"+
            "\16\45",
            "\1\50\12\uffff\4\47\1\125\5\47\1\50\6\uffff\32\46\6\uffff"+
            "\32\45",
            "",
            "",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\22\45\1\126"+
            "\7\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "",
            "\1\50\10\uffff\1\103\1\uffff\12\127\1\50\6\uffff\32\46\4\uffff"+
            "\1\36\1\uffff\32\45",
            "",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\4\45\1\130"+
            "\25\45",
            "",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\16\46\1\131\13\46\6\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\26\45\1\132"+
            "\3\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\22\45\1\133"+
            "\7\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\22\45\1\134"+
            "\7\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\30\45\1\135"+
            "\1\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\4\45\1\136"+
            "\25\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\23\45\1\137"+
            "\6\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\4\45\1\140"+
            "\25\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\23\45\1\141"+
            "\6\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\25\45\1\142"+
            "\4\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\1\45\1\143"+
            "\30\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\23\45\1\144"+
            "\6\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\4\45\1\145"+
            "\25\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\10\uffff\1\103\1\uffff\12\147\1\50\6\uffff\32\46\4\uffff"+
            "\1\36\1\uffff\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\22\46\1\151\7\46\6\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\1\152\31\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\23\45\1\153"+
            "\6\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\4\45\1\154"+
            "\25\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\10\45\1\157"+
            "\21\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\4\45\1\160"+
            "\25\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\4\45\1\161"+
            "\25\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\6\45\1\164"+
            "\23\45",
            "",
            "\1\50\10\uffff\1\103\1\uffff\12\165\1\50\6\uffff\32\46\4\uffff"+
            "\1\36\1\uffff\32\45",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\21\45\1\167"+
            "\10\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\15\45\1\171"+
            "\14\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\21\45\1\172"+
            "\10\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\1\174\31\45",
            "\1\50\12\uffff\12\165\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\3\45\1\175"+
            "\26\45",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\6\45\1\176"+
            "\23\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\23\45\1\u0080"+
            "\6\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\4\uffff\1\36\1\uffff"+
            "\32\45",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\10\45\1\u0083"+
            "\21\45",
            "",
            "",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\16\45\1\u0084"+
            "\13\45",
            "\1\50\12\uffff\12\47\1\50\6\uffff\32\46\6\uffff\15\45\1\u0085"+
            "\14\45",
            "\1\50\7\uffff\1\u0086\2\uffff\12\47\1\50\6\uffff\32\46\6\uffff"+
            "\32\45",
            ""
    };

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | COMMENT | WS | TYPE_YES_OR_NO | IP4_ADDR | NUMBER | ALPHANUM_WORD | IP6_ADDR | BAD );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA15_0 = input.LA(1);

                        s = -1;
                        if ( (LA15_0=='z') ) {s = 1;}

                        else if ( (LA15_0=='I') ) {s = 2;}

                        else if ( (LA15_0=='H') ) {s = 3;}

                        else if ( (LA15_0=='C') ) {s = 4;}

                        else if ( (LA15_0=='{') ) {s = 5;}

                        else if ( (LA15_0=='}') ) {s = 6;}

                        else if ( (LA15_0=='f') ) {s = 7;}

                        else if ( (LA15_0==';') ) {s = 8;}

                        else if ( (LA15_0=='o') ) {s = 9;}

                        else if ( (LA15_0=='t') ) {s = 10;}

                        else if ( (LA15_0=='m') ) {s = 11;}

                        else if ( (LA15_0=='s') ) {s = 12;}

                        else if ( (LA15_0=='h') ) {s = 13;}

                        else if ( (LA15_0=='d') ) {s = 14;}

                        else if ( (LA15_0=='i') ) {s = 15;}

                        else if ( (LA15_0=='.') ) {s = 16;}

                        else if ( (LA15_0=='/') ) {s = 17;}

                        else if ( (LA15_0=='#') ) {s = 18;}

                        else if ( (LA15_0==' ') ) {s = 19;}

                        else if ( (LA15_0=='\t') ) {s = 20;}

                        else if ( (LA15_0=='\f') ) {s = 21;}

                        else if ( (LA15_0=='\r') ) {s = 22;}

                        else if ( (LA15_0=='\n') ) {s = 23;}

                        else if ( (LA15_0=='y') ) {s = 24;}

                        else if ( (LA15_0=='n') ) {s = 25;}

                        else if ( (LA15_0=='0') ) {s = 26;}

                        else if ( (LA15_0=='1') ) {s = 27;}

                        else if ( ((LA15_0>='2' && LA15_0<='9')) ) {s = 28;}

                        else if ( ((LA15_0>='a' && LA15_0<='c')||LA15_0=='e'||LA15_0=='g'||(LA15_0>='j' && LA15_0<='l')||(LA15_0>='p' && LA15_0<='r')||(LA15_0>='u' && LA15_0<='x')) ) {s = 29;}

                        else if ( ((LA15_0>='A' && LA15_0<='B')||(LA15_0>='D' && LA15_0<='G')||(LA15_0>='J' && LA15_0<='Z')) ) {s = 31;}

                        else if ( (LA15_0=='_') ) {s = 32;}

                        else if ( (LA15_0==':') ) {s = 33;}

                        else if ( (LA15_0=='%') ) {s = 34;}

                        else if ( ((LA15_0>='\u0000' && LA15_0<='\b')||LA15_0=='\u000B'||(LA15_0>='\u000E' && LA15_0<='\u001F')||(LA15_0>='!' && LA15_0<='\"')||LA15_0=='$'||(LA15_0>='&' && LA15_0<='-')||(LA15_0>='<' && LA15_0<='@')||(LA15_0>='[' && LA15_0<='^')||LA15_0=='`'||LA15_0=='|'||(LA15_0>='~' && LA15_0<='\uFFFF')) ) {s = 35;}

                        else s = 30;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA15_18 = input.LA(1);

                        s = -1;
                        if ( ((LA15_18>='\u0000' && LA15_18<='\uFFFF')) ) {s = 61;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 15, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-19 22:17:41

package ru.olegchir.bindconf.walker.parser.generated;
import ru.olegchir.bindconf.walker.parser.override.Bind9LexerOverrider;
import ru.olegchir.bindconf.walker.parser.override.Bind9RecognizerOverrider;


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
    public static final int PERL_COMMENT=21;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int ANY_ASCII_ALPHANUM=28;
    public static final int CPP_COMMENT=20;
    public static final int NL=23;
    public static final int DIGIT=27;
    public static final int COMMENT=22;
    public static final int T__50=50;
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
    public static final int NUMBER=16;
    public static final int ST_TESTING=11;
    public static final int THREE_DIGIT_NUMBER=26;
    public static final int PLIST_PARAM=13;
    public static final int ST_ZONE_HINT=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int WS=24;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int BAD=14;
    public static final int IP4_ADDR=17;
    public static final int IP6_ADDR=18;
    public static final int ALPHANUM_WORD=15;
    public static final int C_COMMENT=19;

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

    	public Token nextToken() {
    		while (true) {
    			state.token = null;
    			state.channel = Token.DEFAULT_CHANNEL;
    			state.tokenStartCharIndex = input.index();
    			state.tokenStartCharPositionInLine = input.getCharPositionInLine();
    			state.tokenStartLine = input.getLine();
    			state.text = null;
    			if ( input.LA(1)==CharStream.EOF ) {
    				return Token.EOF_TOKEN;
    			}
    			try {
    				mTokens();
    				if ( state.token==null ) {
    					emit();
    				}
    				else if ( state.token==Token.SKIP_TOKEN ) {
    					continue;
    				}
    				return state.token;
    			}
    			catch (NoViableAltException nva) {
    				reportError(nva);
    				this.overrider.registerLexicalError("on parse next token / no viable alt",nva);
    				recover(nva); // throw out current char and try again
    			}
    			catch (RecognitionException re) {
    				reportError(re);
    				this.overrider.registerLexicalError("on parse next token / generic",re);
    				// match() routine has already called recover()
    			}
    		}
    	} 
    public void emitErrorMessage(String msg) {
    	this.getOverrider().getSystemStackTrace().add(msg);
    	if (this.getOverrider().getErrorReportingVisibility() == Bind9RecognizerOverrider.ERROR_REPORTING_VERBOSE) {
                System.err.println(msg);
            }
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

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:66:7: ( 'zone' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:66:9: 'zone'
            {
            match("zone"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:67:7: ( 'IN' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:67:9: 'IN'
            {
            match("IN"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:68:7: ( 'HS' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:68:9: 'HS'
            {
            match("HS"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:69:7: ( 'CHAOS' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:69:9: 'CHAOS'
            {
            match("CHAOS"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:70:7: ( '{' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:70:9: '{'
            {
            match('{'); if (state.failed) return ;

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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:71:7: ( '}' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:71:9: '}'
            {
            match('}'); if (state.failed) return ;

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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:72:7: ( 'forward' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:72:9: 'forward'
            {
            match("forward"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:73:7: ( ';' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:73:9: ';'
            {
            match(';'); if (state.failed) return ;

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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:74:7: ( 'first' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:74:9: 'first'
            {
            match("first"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:75:7: ( 'only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:75:9: 'only'
            {
            match("only"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:76:7: ( 'type' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:76:9: 'type'
            {
            match("type"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:77:7: ( 'master' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:77:9: 'master'
            {
            match("master"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:78:7: ( 'slave' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:78:9: 'slave'
            {
            match("slave"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:79:7: ( 'stub' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:79:9: 'stub'
            {
            match("stub"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:80:7: ( 'hint' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:80:9: 'hint'
            {
            match("hint"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:81:7: ( 'delegation-only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:81:9: 'delegation-only'
            {
            match("delegation-only"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:82:7: ( 'testing' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:82:9: 'testing'
            {
            match("testing"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:83:7: ( 'acl_field' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:83:9: 'acl_field'
            {
            match("acl_field"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:84:7: ( 'acl_domain_name' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:84:9: 'acl_domain_name'
            {
            match("acl_domain_name"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:85:7: ( 'ip4' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:85:9: 'ip4'
            {
            match("ip4"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:86:7: ( 'ip6' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:86:9: 'ip6'
            {
            match("ip6"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:87:7: ( 'ip' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:87:9: 'ip'
            {
            match("ip"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:88:7: ( 'ip_port' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:88:9: 'ip_port'
            {
            match("ip_port"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:89:7: ( '.' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:89:9: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:9: ( ( C_COMMENT | CPP_COMMENT | PERL_COMMENT ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:11: ( C_COMMENT | CPP_COMMENT | PERL_COMMENT )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:11: ( C_COMMENT | CPP_COMMENT | PERL_COMMENT )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:12: C_COMMENT
                    {
                    mC_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:24: CPP_COMMENT
                    {
                    mCPP_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:38: PERL_COMMENT
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:284:20: ( '/*' ( (~ '*' | '*' ~ '/' )=> . )* '*/' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:284:22: '/*' ( (~ '*' | '*' ~ '/' )=> . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:284:27: ( (~ '*' | '*' ~ '/' )=> . )*
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:284:29: (~ '*' | '*' ~ '/' )=> .
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:287:2: ( '//' (~ ( '\\r' | '\\n' ) )* NL )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:287:4: '//' (~ ( '\\r' | '\\n' ) )* NL
            {
            match("//"); if (state.failed) return ;

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:287:9: (~ ( '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:287:10: ~ ( '\\r' | '\\n' )
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:290:2: ( '#' (~ ( '\\r' | '\\n' ) )* NL )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:290:4: '#' (~ ( '\\r' | '\\n' ) )* NL
            {
            match('#'); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:290:8: (~ ( '\\r' | '\\n' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:290:9: ~ ( '\\r' | '\\n' )
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:4: ( ( ' ' | '\\t' | '\\f' | NL )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:6: ( ' ' | '\\t' | '\\f' | NL )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:6: ( ' ' | '\\t' | '\\f' | NL )+
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:7: ' '
            	    {
            	    match(' '); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:11: '\\t'
            	    {
            	    match('\t'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:16: '\\f'
            	    {
            	    match('\f'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:21: NL
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:2: ( ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:4: ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n'
                    {
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:19: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:19: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:299:6: '\\r'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:303:2: ( 'yes' | 'no' | 'true' | 'false' | '0' | '1' )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:303:4: 'yes'
                    {
                    match("yes"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:303:10: 'no'
                    {
                    match("no"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:303:15: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:303:22: 'false'
                    {
                    match("false"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:303:30: '0'
                    {
                    match('0'); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:303:34: '1'
                    {
                    match('1'); if (state.failed) return ;

                    }
                    break;

            }
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:306:9: ( THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:306:11: THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER
            {
            mTHREE_DIGIT_NUMBER(); if (state.failed) return ;
            match('.'); if (state.failed) return ;
            mTHREE_DIGIT_NUMBER(); if (state.failed) return ;
            match('.'); if (state.failed) return ;
            mTHREE_DIGIT_NUMBER(); if (state.failed) return ;
            match('.'); if (state.failed) return ;
            mTHREE_DIGIT_NUMBER(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP4_ADDR"

    // $ANTLR start "THREE_DIGIT_NUMBER"
    public final void mTHREE_DIGIT_NUMBER() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:310:2: ( DIGIT | DIGIT DIGIT | DIGIT DIGIT DIGIT )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                int LA9_1 = input.LA(2);

                if ( ((LA9_1>='0' && LA9_1<='9')) ) {
                    int LA9_3 = input.LA(3);

                    if ( ((LA9_3>='0' && LA9_3<='9')) ) {
                        alt9=3;
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:310:4: DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:311:4: DIGIT DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:312:4: DIGIT DIGIT DIGIT
                    {
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
    // $ANTLR end "THREE_DIGIT_NUMBER"

    // $ANTLR start "NUMBER"
    public final void mNUMBER() throws RecognitionException {
        try {
            int _type = NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:315:8: ( ( DIGIT )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:315:10: ( DIGIT )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:315:10: ( DIGIT )+
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:315:10: DIGIT
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:16: ( '0' .. '9' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:18: '0' .. '9'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:319:16: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:319:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:319:18: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:2: ( ( '\\u0020' .. '\\u007F' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:4: ( '\\u0020' .. '\\u007F' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:4: ( '\\u0020' .. '\\u007F' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:5: '\\u0020' .. '\\u007F'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:325:9: ( ( IP6_VALID_CHAR )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:325:11: ( IP6_VALID_CHAR )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:325:11: ( IP6_VALID_CHAR )+
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:325:12: IP6_VALID_CHAR
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:2: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:5: ( 'a' .. 'z' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:5: ( 'a' .. 'z' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:6: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:16: ( 'A' .. 'Z' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:16: ( 'A' .. 'Z' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:17: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 3 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:27: ':'
            	    {
            	    match(':'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:31: '%'
            	    {
            	    match('%'); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:35: ( '0' .. '9' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:35: ( '0' .. '9' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:36: '0' .. '9'
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

    // $ANTLR start "BAD"
    public final void mBAD() throws RecognitionException {
        try {
            int _type = BAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:332:6: ( . )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:332:8: .
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
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | COMMENT | WS | IP4_ADDR | NUMBER | ALPHANUM_WORD | IP6_ADDR | BAD )
        int alt14=31;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:10: T__30
                {
                mT__30(); if (state.failed) return ;

                }
                break;
            case 2 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:16: T__31
                {
                mT__31(); if (state.failed) return ;

                }
                break;
            case 3 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:22: T__32
                {
                mT__32(); if (state.failed) return ;

                }
                break;
            case 4 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:28: T__33
                {
                mT__33(); if (state.failed) return ;

                }
                break;
            case 5 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:34: T__34
                {
                mT__34(); if (state.failed) return ;

                }
                break;
            case 6 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:40: T__35
                {
                mT__35(); if (state.failed) return ;

                }
                break;
            case 7 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:46: T__36
                {
                mT__36(); if (state.failed) return ;

                }
                break;
            case 8 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:52: T__37
                {
                mT__37(); if (state.failed) return ;

                }
                break;
            case 9 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:58: T__38
                {
                mT__38(); if (state.failed) return ;

                }
                break;
            case 10 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:64: T__39
                {
                mT__39(); if (state.failed) return ;

                }
                break;
            case 11 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:70: T__40
                {
                mT__40(); if (state.failed) return ;

                }
                break;
            case 12 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:76: T__41
                {
                mT__41(); if (state.failed) return ;

                }
                break;
            case 13 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:82: T__42
                {
                mT__42(); if (state.failed) return ;

                }
                break;
            case 14 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:88: T__43
                {
                mT__43(); if (state.failed) return ;

                }
                break;
            case 15 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:94: T__44
                {
                mT__44(); if (state.failed) return ;

                }
                break;
            case 16 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:100: T__45
                {
                mT__45(); if (state.failed) return ;

                }
                break;
            case 17 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:106: T__46
                {
                mT__46(); if (state.failed) return ;

                }
                break;
            case 18 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:112: T__47
                {
                mT__47(); if (state.failed) return ;

                }
                break;
            case 19 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:118: T__48
                {
                mT__48(); if (state.failed) return ;

                }
                break;
            case 20 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:124: T__49
                {
                mT__49(); if (state.failed) return ;

                }
                break;
            case 21 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:130: T__50
                {
                mT__50(); if (state.failed) return ;

                }
                break;
            case 22 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:136: T__51
                {
                mT__51(); if (state.failed) return ;

                }
                break;
            case 23 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:142: T__52
                {
                mT__52(); if (state.failed) return ;

                }
                break;
            case 24 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:148: T__53
                {
                mT__53(); if (state.failed) return ;

                }
                break;
            case 25 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:154: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 26 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:162: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 27 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:165: IP4_ADDR
                {
                mIP4_ADDR(); if (state.failed) return ;

                }
                break;
            case 28 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:174: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 29 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:181: ALPHANUM_WORD
                {
                mALPHANUM_WORD(); if (state.failed) return ;

                }
                break;
            case 30 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:195: IP6_ADDR
                {
                mIP6_ADDR(); if (state.failed) return ;

                }
                break;
            case 31 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:204: BAD
                {
                mBAD(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Bind9Config
    public final void synpred1_Bind9Config_fragment() throws RecognitionException {   
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:284:29: (~ '*' | '*' ~ '/' )
        int alt15=2;
        int LA15_0 = input.LA(1);

        if ( ((LA15_0>='\u0000' && LA15_0<=')')||(LA15_0>='+' && LA15_0<='\uFFFF')) ) {
            alt15=1;
        }
        else if ( (LA15_0=='*') ) {
            alt15=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 15, 0, input);

            throw nvae;
        }
        switch (alt15) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:284:30: ~ '*'
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
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:284:37: '*' ~ '/'
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
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:4: ( ( '\\r' )? '\\n' )
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:5: ( '\\r' )? '\\n'
        {
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:5: ( '\\r' )?
        int alt16=2;
        int LA16_0 = input.LA(1);

        if ( (LA16_0=='\r') ) {
            alt16=1;
        }
        switch (alt16) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:5: '\\r'
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


    protected DFA14 dfa14 = new DFA14(this);
    static final String DFA14_eotS =
        "\5\33\2\uffff\1\33\1\uffff\10\33\1\uffff\2\40\5\uffff\1\73\1\33"+
        "\1\uffff\1\33\4\uffff\3\33\1\uffff\1\33\1\77\1\100\1\33\2\uffff"+
        "\2\33\1\uffff\11\33\1\120\5\uffff\1\73\1\33\2\uffff\14\33\1\137"+
        "\1\140\1\33\1\uffff\1\73\1\143\3\33\1\147\1\150\3\33\1\154\1\155"+
        "\2\33\2\uffff\1\33\1\73\1\uffff\1\162\1\33\1\164\2\uffff\2\33\1"+
        "\167\2\uffff\4\33\1\uffff\1\33\1\uffff\1\33\1\176\1\uffff\4\33\1"+
        "\u0083\1\u0084\1\uffff\3\33\1\u0088\2\uffff\3\33\1\uffff\1\33\1"+
        "\u008d\2\33\1\uffff\1\33\1\uffff\4\33\1\u0095\1\uffff";
    static final String DFA14_eofS =
        "\u0096\uffff";
    static final String DFA14_minS =
        "\1\0\4\45\2\uffff\1\45\1\uffff\10\45\1\uffff\1\52\1\0\5\uffff\2"+
        "\45\1\uffff\1\45\4\uffff\3\45\1\uffff\4\45\2\uffff\2\45\1\uffff"+
        "\12\45\5\uffff\2\45\2\uffff\16\45\1\160\1\uffff\15\45\1\144\2\uffff"+
        "\1\157\1\45\1\uffff\3\45\2\uffff\3\45\2\uffff\1\45\1\151\1\157\1"+
        "\162\1\uffff\1\45\1\uffff\2\45\1\uffff\1\45\1\145\1\155\1\164\2"+
        "\45\1\uffff\1\45\1\154\1\141\1\60\2\uffff\1\45\1\144\1\151\1\uffff"+
        "\1\45\1\60\1\156\1\45\1\uffff\1\137\1\uffff\1\156\1\141\1\155\1"+
        "\145\1\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\4\172\2\uffff\1\172\1\uffff\10\172\1\uffff\1\57\1\uffff"+
        "\5\uffff\2\172\1\uffff\1\172\4\uffff\3\172\1\uffff\4\172\2\uffff"+
        "\2\172\1\uffff\12\172\5\uffff\2\172\2\uffff\16\172\1\160\1\uffff"+
        "\15\172\1\146\2\uffff\1\157\1\172\1\uffff\3\172\2\uffff\3\172\2"+
        "\uffff\1\172\1\151\1\157\1\162\1\uffff\1\172\1\uffff\2\172\1\uffff"+
        "\1\172\1\145\1\155\1\164\2\172\1\uffff\1\172\1\154\1\141\1\172\2"+
        "\uffff\1\172\1\144\1\151\1\uffff\2\172\1\156\1\172\1\uffff\1\137"+
        "\1\uffff\1\156\1\141\1\155\1\145\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\5\1\6\1\uffff\1\10\10\uffff\1\30\2\uffff\5\32\2\uffff"+
        "\1\35\1\uffff\1\35\2\36\1\37\3\uffff\1\36\4\uffff\1\5\1\6\2\uffff"+
        "\1\10\12\uffff\1\30\1\31\1\32\1\34\1\33\2\uffff\1\2\1\3\17\uffff"+
        "\1\26\16\uffff\1\24\1\25\2\uffff\1\1\3\uffff\1\12\1\13\3\uffff\1"+
        "\16\1\17\4\uffff\1\4\1\uffff\1\11\2\uffff\1\15\6\uffff\1\14\4\uffff"+
        "\1\7\1\21\3\uffff\1\27\4\uffff\1\22\1\uffff\1\20\5\uffff\1\23";
    static final String DFA14_specialS =
        "\1\0\22\uffff\1\1\u0082\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\40\1\25\1\30\1\40\1\26\1\27\22\40\1\24\2\40\1\23\1\40\1"+
            "\37\10\40\1\21\1\22\12\31\1\36\1\10\5\40\2\34\1\4\4\34\1\3\1"+
            "\2\21\34\4\40\1\35\1\40\1\17\2\32\1\16\1\32\1\7\1\32\1\15\1"+
            "\20\3\32\1\13\1\32\1\11\3\32\1\14\1\12\5\32\1\1\1\5\1\40\1\6"+
            "\uff82\40",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\16\42\1\41"+
            "\13\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\15\43\1\46\14\43\6\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\22\43\1\47\7\43\6\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\7\43\1\50\22\43\6\uffff"+
            "\32\42",
            "",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\10\42\1\54"+
            "\5\42\1\53\13\42",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\15\42\1\56"+
            "\14\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\4\42\1\60"+
            "\23\42\1\57\1\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\1\61\31\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\13\42\1\62"+
            "\7\42\1\63\6\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\10\42\1\64"+
            "\21\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\4\42\1\65"+
            "\25\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\2\42\1\66"+
            "\27\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\17\42\1\67"+
            "\12\42",
            "",
            "\1\71\4\uffff\1\71",
            "\0\71",
            "",
            "",
            "",
            "",
            "",
            "\1\44\10\uffff\1\74\1\uffff\12\75\1\44\6\uffff\32\43\4\uffff"+
            "\1\33\1\uffff\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\32\42",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\32\42",
            "",
            "",
            "",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\15\42\1\76"+
            "\14\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\32\42",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\1\101\31\43\6\uffff\32\42",
            "",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\21\42\1\102"+
            "\10\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\21\42\1\103"+
            "\10\42",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\13\42\1\104"+
            "\16\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\17\42\1\105"+
            "\12\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\22\42\1\106"+
            "\7\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\22\42\1\107"+
            "\7\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\1\110\31\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\24\42\1\111"+
            "\5\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\15\42\1\112"+
            "\14\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\13\42\1\113"+
            "\16\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\13\42\1\114"+
            "\16\42",
            "\1\44\12\uffff\4\45\1\115\1\45\1\116\3\45\1\44\6\uffff\32"+
            "\43\4\uffff\1\117\1\uffff\32\42",
            "",
            "",
            "",
            "",
            "",
            "\1\44\10\uffff\1\74\1\uffff\12\121\1\44\6\uffff\32\43\4\uffff"+
            "\1\33\1\uffff\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\4\42\1\122"+
            "\25\42",
            "",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\16\43\1\123\13\43\6\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\26\42\1\124"+
            "\3\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\22\42\1\125"+
            "\7\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\30\42\1\126"+
            "\1\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\4\42\1\127"+
            "\25\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\23\42\1\130"+
            "\6\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\23\42\1\131"+
            "\6\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\25\42\1\132"+
            "\4\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\1\42\1\133"+
            "\30\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\23\42\1\134"+
            "\6\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\4\42\1\135"+
            "\25\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\136\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\141",
            "",
            "\1\44\10\uffff\1\74\1\uffff\12\142\1\44\6\uffff\32\43\4\uffff"+
            "\1\33\1\uffff\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\22\43\1\144\7\43\6\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\1\145\31\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\23\42\1\146"+
            "\6\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\10\42\1\151"+
            "\21\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\4\42\1\152"+
            "\25\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\4\42\1\153"+
            "\25\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\6\42\1\156"+
            "\23\42",
            "\1\160\1\uffff\1\157",
            "",
            "",
            "\1\161",
            "\1\44\12\uffff\12\142\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\21\42\1\163"+
            "\10\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\15\42\1\165"+
            "\14\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\21\42\1\166"+
            "\10\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\1\170\31\42",
            "\1\171",
            "\1\172",
            "\1\173",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\3\42\1\174"+
            "\26\42",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\6\42\1\175"+
            "\23\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\23\42\1\177"+
            "\6\42",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\4\uffff\1\33\1\uffff"+
            "\32\42",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\10\42\1\u0085"+
            "\21\42",
            "\1\u0086",
            "\1\u0087",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\16\42\1\u0089"+
            "\13\42",
            "\1\u008a",
            "\1\u008b",
            "",
            "\1\44\12\uffff\12\45\1\44\6\uffff\32\43\6\uffff\15\42\1\u008c"+
            "\14\42",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
            "\1\u008e",
            "\1\44\7\uffff\1\u008f\2\uffff\12\45\1\44\6\uffff\32\43\6\uffff"+
            "\32\42",
            "",
            "\1\u0090",
            "",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\12\33\7\uffff\32\33\4\uffff\1\33\1\uffff\32\33",
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
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | COMMENT | WS | IP4_ADDR | NUMBER | ALPHANUM_WORD | IP6_ADDR | BAD );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='z') ) {s = 1;}

                        else if ( (LA14_0=='I') ) {s = 2;}

                        else if ( (LA14_0=='H') ) {s = 3;}

                        else if ( (LA14_0=='C') ) {s = 4;}

                        else if ( (LA14_0=='{') ) {s = 5;}

                        else if ( (LA14_0=='}') ) {s = 6;}

                        else if ( (LA14_0=='f') ) {s = 7;}

                        else if ( (LA14_0==';') ) {s = 8;}

                        else if ( (LA14_0=='o') ) {s = 9;}

                        else if ( (LA14_0=='t') ) {s = 10;}

                        else if ( (LA14_0=='m') ) {s = 11;}

                        else if ( (LA14_0=='s') ) {s = 12;}

                        else if ( (LA14_0=='h') ) {s = 13;}

                        else if ( (LA14_0=='d') ) {s = 14;}

                        else if ( (LA14_0=='a') ) {s = 15;}

                        else if ( (LA14_0=='i') ) {s = 16;}

                        else if ( (LA14_0=='.') ) {s = 17;}

                        else if ( (LA14_0=='/') ) {s = 18;}

                        else if ( (LA14_0=='#') ) {s = 19;}

                        else if ( (LA14_0==' ') ) {s = 20;}

                        else if ( (LA14_0=='\t') ) {s = 21;}

                        else if ( (LA14_0=='\f') ) {s = 22;}

                        else if ( (LA14_0=='\r') ) {s = 23;}

                        else if ( (LA14_0=='\n') ) {s = 24;}

                        else if ( ((LA14_0>='0' && LA14_0<='9')) ) {s = 25;}

                        else if ( ((LA14_0>='b' && LA14_0<='c')||LA14_0=='e'||LA14_0=='g'||(LA14_0>='j' && LA14_0<='l')||LA14_0=='n'||(LA14_0>='p' && LA14_0<='r')||(LA14_0>='u' && LA14_0<='y')) ) {s = 26;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||(LA14_0>='D' && LA14_0<='G')||(LA14_0>='J' && LA14_0<='Z')) ) {s = 28;}

                        else if ( (LA14_0=='_') ) {s = 29;}

                        else if ( (LA14_0==':') ) {s = 30;}

                        else if ( (LA14_0=='%') ) {s = 31;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||LA14_0=='\u000B'||(LA14_0>='\u000E' && LA14_0<='\u001F')||(LA14_0>='!' && LA14_0<='\"')||LA14_0=='$'||(LA14_0>='&' && LA14_0<='-')||(LA14_0>='<' && LA14_0<='@')||(LA14_0>='[' && LA14_0<='^')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 32;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_19 = input.LA(1);

                        s = -1;
                        if ( ((LA14_19>='\u0000' && LA14_19<='\uFFFF')) ) {s = 57;}

                        else s = 32;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 14, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
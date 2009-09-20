// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-20 12:42:33

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
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int ST_ZONE_PLIST=10;
    public static final int IP6_VALID_CHAR=42;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int YES_OR_NO_WORD=18;
    public static final int DOUBLE_QUOTE=30;
    public static final int ST_ZONE_MASTER=4;
    public static final int ST_ZONE_FORWARD=8;
    public static final int UNLIMITED_WORD=21;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int ALPHANUM_NONSTD=15;
    public static final int ST_ZONE_SLAVE=5;
    public static final int ASTERISK=25;
    public static final int ST_ZONE_DELEGATION=9;
    public static final int ST_ZONE_STUB=7;
    public static final int PERL_COMMENT=35;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int ANY_ASCII_ALPHANUM=41;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int CPP_COMMENT=34;
    public static final int YES_OR_NO_NUM=19;
    public static final int DIGIT=40;
    public static final int NL=37;
    public static final int COMMENT=36;
    public static final int T__50=50;
    public static final int T__43=43;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int ST_TESTING_PLIST=12;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int NUMBER=16;
    public static final int ST_TESTING=11;
    public static final int SEMICOLON=29;
    public static final int THREE_DIGIT_NUMBER=39;
    public static final int PLIST_PARAM=13;
    public static final int ST_ZONE_HINT=6;
    public static final int DEFAULT_WORD=22;
    public static final int T__71=71;
    public static final int WS=38;
    public static final int T__72=72;
    public static final int KMG_NUMBER=17;
    public static final int T__70=70;
    public static final int BAD=14;
    public static final int IP4_ADDR=23;
    public static final int IP6_ADDR=24;
    public static final int RANGE_WORD=20;
    public static final int CR=31;
    public static final int C_COMMENT=33;
    public static final int T__73=73;
    public static final int IP4_SHORT_3=27;
    public static final int FORWARD_SLASH=28;
    public static final int IP4_SHORT_2=26;
    public static final int LF=32;

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

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
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
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
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
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
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
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
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
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:73:7: ( 'first' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:73:9: 'first'
            {
            match("first"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:74:7: ( 'only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:74:9: 'only'
            {
            match("only"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:75:7: ( 'type' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:75:9: 'type'
            {
            match("type"); if (state.failed) return ;


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:76:7: ( 'master' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:76:9: 'master'
            {
            match("master"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:77:7: ( 'slave' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:77:9: 'slave'
            {
            match("slave"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:78:7: ( 'stub' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:78:9: 'stub'
            {
            match("stub"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:79:7: ( 'hint' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:79:9: 'hint'
            {
            match("hint"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:80:7: ( 'delegation-only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:80:9: 'delegation-only'
            {
            match("delegation-only"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:81:7: ( 'testing' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:81:9: 'testing'
            {
            match("testing"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:82:7: ( 'acl_name' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:82:9: 'acl_name'
            {
            match("acl_name"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:83:7: ( 'domain_name' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:83:9: 'domain_name'
            {
            match("domain_name"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:84:7: ( 'ip4' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:84:9: 'ip4'
            {
            match("ip4"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:85:7: ( 'ip6' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:85:9: 'ip6'
            {
            match("ip6"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:86:7: ( 'ip' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:86:9: 'ip'
            {
            match("ip"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:87:7: ( 'ip_port' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:87:9: 'ip_port'
            {
            match("ip_port"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:88:7: ( 'ip_prefix' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:88:9: 'ip_prefix'
            {
            match("ip_prefix"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:89:7: ( 'key_id' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:89:9: 'key_id'
            {
            match("key_id"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:90:7: ( 'key_list' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:90:9: 'key_list'
            {
            match("key_list"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:91:7: ( 'number' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:91:9: 'number'
            {
            match("number"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:92:7: ( 'path_name' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:92:9: 'path_name'
            {
            match("path_name"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:93:7: ( 'port_list' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:93:9: 'port_list'
            {
            match("port_list"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:94:7: ( 'size_spec' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:94:9: 'size_spec'
            {
            match("size_spec"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:95:7: ( 'yes_or_no' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:95:9: 'yes_or_no'
            {
            match("yes_or_no"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:96:7: ( '.' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:96:9: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:326:9: ( ( C_COMMENT | CPP_COMMENT | PERL_COMMENT ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:326:11: ( C_COMMENT | CPP_COMMENT | PERL_COMMENT )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:326:11: ( C_COMMENT | CPP_COMMENT | PERL_COMMENT )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:326:12: C_COMMENT
                    {
                    mC_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:326:24: CPP_COMMENT
                    {
                    mCPP_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:326:38: PERL_COMMENT
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:20: ( '/*' ( (~ '*' | '*' ~ '/' )=> . )* '*/' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:22: '/*' ( (~ '*' | '*' ~ '/' )=> . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:27: ( (~ '*' | '*' ~ '/' )=> . )*
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:29: (~ '*' | '*' ~ '/' )=> .
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:331:2: ( '//' (~ ( '\\r' | '\\n' ) )* NL )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:331:4: '//' (~ ( '\\r' | '\\n' ) )* NL
            {
            match("//"); if (state.failed) return ;

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:331:9: (~ ( '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:331:10: ~ ( '\\r' | '\\n' )
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:334:2: ( '#' (~ ( '\\r' | '\\n' ) )* NL )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:334:4: '#' (~ ( '\\r' | '\\n' ) )* NL
            {
            match('#'); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:334:8: (~ ( '\\r' | '\\n' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:334:9: ~ ( '\\r' | '\\n' )
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

    // $ANTLR start "CR"
    public final void mCR() throws RecognitionException {
        try {
            int _type = CR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:338:4: ( '\\r' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:338:6: '\\r'
            {
            match('\r'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CR"

    // $ANTLR start "LF"
    public final void mLF() throws RecognitionException {
        try {
            int _type = LF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:340:4: ( '\\n' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:340:6: '\\n'
            {
            match('\n'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LF"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:4: ( ( ' ' | '\\t' | '\\f' | NL )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:6: ( ' ' | '\\t' | '\\f' | NL )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:6: ( ' ' | '\\t' | '\\f' | NL )+
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:7: ' '
            	    {
            	    match(' '); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:11: '\\t'
            	    {
            	    match('\t'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:16: '\\f'
            	    {
            	    match('\f'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:21: NL
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:2: ( ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:4: ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n'
                    {
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:19: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:19: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:348:6: '\\r'
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

    // $ANTLR start "ASTERISK"
    public final void mASTERISK() throws RecognitionException {
        try {
            int _type = ASTERISK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:352:2: ( '*' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:352:4: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ASTERISK"

    // $ANTLR start "FORWARD_SLASH"
    public final void mFORWARD_SLASH() throws RecognitionException {
        try {
            int _type = FORWARD_SLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:356:2: ( '/' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:356:4: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FORWARD_SLASH"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:359:2: ( ';' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:359:4: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "DOUBLE_QUOTE"
    public final void mDOUBLE_QUOTE() throws RecognitionException {
        try {
            int _type = DOUBLE_QUOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:362:2: ( '\"' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:362:4: '\"'
            {
            match('\"'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_QUOTE"

    // $ANTLR start "YES_OR_NO_WORD"
    public final void mYES_OR_NO_WORD() throws RecognitionException {
        try {
            int _type = YES_OR_NO_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:366:2: ( ( 'yes' | 'no' | 'true' | 'false' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:366:4: ( 'yes' | 'no' | 'true' | 'false' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:366:4: ( 'yes' | 'no' | 'true' | 'false' )
            int alt8=4;
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
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:366:5: 'yes'
                    {
                    match("yes"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:366:11: 'no'
                    {
                    match("no"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:366:16: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:366:23: 'false'
                    {
                    match("false"); if (state.failed) return ;


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
    // $ANTLR end "YES_OR_NO_WORD"

    // $ANTLR start "YES_OR_NO_NUM"
    public final void mYES_OR_NO_NUM() throws RecognitionException {
        try {
            int _type = YES_OR_NO_NUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:370:2: ( ( '0' | '1' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:370:4: ( '0' | '1' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='1') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "YES_OR_NO_NUM"

    // $ANTLR start "RANGE_WORD"
    public final void mRANGE_WORD() throws RecognitionException {
        try {
            int _type = RANGE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:374:2: ( 'range' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:374:4: 'range'
            {
            match("range"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RANGE_WORD"

    // $ANTLR start "UNLIMITED_WORD"
    public final void mUNLIMITED_WORD() throws RecognitionException {
        try {
            int _type = UNLIMITED_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:377:2: ( 'unlimited' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:377:4: 'unlimited'
            {
            match("unlimited"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "UNLIMITED_WORD"

    // $ANTLR start "DEFAULT_WORD"
    public final void mDEFAULT_WORD() throws RecognitionException {
        try {
            int _type = DEFAULT_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:380:2: ( 'default' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:380:4: 'default'
            {
            match("default"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DEFAULT_WORD"

    // $ANTLR start "IP4_ADDR"
    public final void mIP4_ADDR() throws RecognitionException {
        try {
            int _type = IP4_ADDR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:383:9: ( THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:383:11: THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER
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

    // $ANTLR start "IP4_SHORT_3"
    public final void mIP4_SHORT_3() throws RecognitionException {
        try {
            int _type = IP4_SHORT_3;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:386:2: ( THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:386:4: THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER
            {
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
    // $ANTLR end "IP4_SHORT_3"

    // $ANTLR start "IP4_SHORT_2"
    public final void mIP4_SHORT_2() throws RecognitionException {
        try {
            int _type = IP4_SHORT_2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:389:2: ( THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:389:4: THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER
            {
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
    // $ANTLR end "IP4_SHORT_2"

    // $ANTLR start "THREE_DIGIT_NUMBER"
    public final void mTHREE_DIGIT_NUMBER() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:393:2: ( DIGIT | DIGIT DIGIT | DIGIT DIGIT DIGIT )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:393:4: DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:394:4: DIGIT DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:395:4: DIGIT DIGIT DIGIT
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:398:8: ( ( DIGIT )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:398:10: ( DIGIT )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:398:10: ( DIGIT )+
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:398:10: DIGIT
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:400:16: ( '0' .. '9' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:400:18: '0' .. '9'
            {
            matchRange('0','9'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "KMG_NUMBER"
    public final void mKMG_NUMBER() throws RecognitionException {
        try {
            int _type = KMG_NUMBER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:403:2: ( NUMBER ( 'K' | 'k' | 'M' | 'm' | 'G' | 'g' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:403:4: NUMBER ( 'K' | 'k' | 'M' | 'm' | 'G' | 'g' )
            {
            mNUMBER(); if (state.failed) return ;
            if ( input.LA(1)=='G'||input.LA(1)=='K'||input.LA(1)=='M'||input.LA(1)=='g'||input.LA(1)=='k'||input.LA(1)=='m' ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KMG_NUMBER"

    // $ANTLR start "ALPHANUM_NONSTD"
    public final void mALPHANUM_NONSTD() throws RecognitionException {
        try {
            int _type = ALPHANUM_NONSTD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:406:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:406:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:406:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
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
    // $ANTLR end "ALPHANUM_NONSTD"

    // $ANTLR start "ANY_ASCII_ALPHANUM"
    public final void mANY_ASCII_ALPHANUM() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:410:2: ( ( '\\u0020' .. '\\u007F' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:410:4: ( '\\u0020' .. '\\u007F' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:410:4: ( '\\u0020' .. '\\u007F' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:410:5: '\\u0020' .. '\\u007F'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:9: ( ( IP6_VALID_CHAR )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:11: ( IP6_VALID_CHAR )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:11: ( IP6_VALID_CHAR )+
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:12: IP6_VALID_CHAR
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:2: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:5: ( 'a' .. 'z' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:5: ( 'a' .. 'z' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:6: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:16: ( 'A' .. 'Z' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:16: ( 'A' .. 'Z' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:17: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 3 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:27: ':'
            	    {
            	    match(':'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:31: '%'
            	    {
            	    match('%'); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:35: ( '0' .. '9' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:35: ( '0' .. '9' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:36: '0' .. '9'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:420:6: ( . )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:420:8: .
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
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:8: ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | COMMENT | CR | LF | WS | ASTERISK | FORWARD_SLASH | SEMICOLON | DOUBLE_QUOTE | YES_OR_NO_WORD | YES_OR_NO_NUM | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD | IP4_ADDR | IP4_SHORT_3 | IP4_SHORT_2 | NUMBER | KMG_NUMBER | ALPHANUM_NONSTD | IP6_ADDR | BAD )
        int alt14=52;
        alt14 = dfa14.predict(input);
        switch (alt14) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:10: T__43
                {
                mT__43(); if (state.failed) return ;

                }
                break;
            case 2 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:16: T__44
                {
                mT__44(); if (state.failed) return ;

                }
                break;
            case 3 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:22: T__45
                {
                mT__45(); if (state.failed) return ;

                }
                break;
            case 4 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:28: T__46
                {
                mT__46(); if (state.failed) return ;

                }
                break;
            case 5 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:34: T__47
                {
                mT__47(); if (state.failed) return ;

                }
                break;
            case 6 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:40: T__48
                {
                mT__48(); if (state.failed) return ;

                }
                break;
            case 7 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:46: T__49
                {
                mT__49(); if (state.failed) return ;

                }
                break;
            case 8 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:52: T__50
                {
                mT__50(); if (state.failed) return ;

                }
                break;
            case 9 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:58: T__51
                {
                mT__51(); if (state.failed) return ;

                }
                break;
            case 10 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:64: T__52
                {
                mT__52(); if (state.failed) return ;

                }
                break;
            case 11 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:70: T__53
                {
                mT__53(); if (state.failed) return ;

                }
                break;
            case 12 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:76: T__54
                {
                mT__54(); if (state.failed) return ;

                }
                break;
            case 13 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:82: T__55
                {
                mT__55(); if (state.failed) return ;

                }
                break;
            case 14 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:88: T__56
                {
                mT__56(); if (state.failed) return ;

                }
                break;
            case 15 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:94: T__57
                {
                mT__57(); if (state.failed) return ;

                }
                break;
            case 16 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:100: T__58
                {
                mT__58(); if (state.failed) return ;

                }
                break;
            case 17 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:106: T__59
                {
                mT__59(); if (state.failed) return ;

                }
                break;
            case 18 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:112: T__60
                {
                mT__60(); if (state.failed) return ;

                }
                break;
            case 19 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:118: T__61
                {
                mT__61(); if (state.failed) return ;

                }
                break;
            case 20 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:124: T__62
                {
                mT__62(); if (state.failed) return ;

                }
                break;
            case 21 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:130: T__63
                {
                mT__63(); if (state.failed) return ;

                }
                break;
            case 22 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:136: T__64
                {
                mT__64(); if (state.failed) return ;

                }
                break;
            case 23 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:142: T__65
                {
                mT__65(); if (state.failed) return ;

                }
                break;
            case 24 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:148: T__66
                {
                mT__66(); if (state.failed) return ;

                }
                break;
            case 25 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:154: T__67
                {
                mT__67(); if (state.failed) return ;

                }
                break;
            case 26 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:160: T__68
                {
                mT__68(); if (state.failed) return ;

                }
                break;
            case 27 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:166: T__69
                {
                mT__69(); if (state.failed) return ;

                }
                break;
            case 28 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:172: T__70
                {
                mT__70(); if (state.failed) return ;

                }
                break;
            case 29 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:178: T__71
                {
                mT__71(); if (state.failed) return ;

                }
                break;
            case 30 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:184: T__72
                {
                mT__72(); if (state.failed) return ;

                }
                break;
            case 31 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:190: T__73
                {
                mT__73(); if (state.failed) return ;

                }
                break;
            case 32 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:196: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 33 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:204: CR
                {
                mCR(); if (state.failed) return ;

                }
                break;
            case 34 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:207: LF
                {
                mLF(); if (state.failed) return ;

                }
                break;
            case 35 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:210: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 36 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:213: ASTERISK
                {
                mASTERISK(); if (state.failed) return ;

                }
                break;
            case 37 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:222: FORWARD_SLASH
                {
                mFORWARD_SLASH(); if (state.failed) return ;

                }
                break;
            case 38 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:236: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;

                }
                break;
            case 39 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:246: DOUBLE_QUOTE
                {
                mDOUBLE_QUOTE(); if (state.failed) return ;

                }
                break;
            case 40 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:259: YES_OR_NO_WORD
                {
                mYES_OR_NO_WORD(); if (state.failed) return ;

                }
                break;
            case 41 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:274: YES_OR_NO_NUM
                {
                mYES_OR_NO_NUM(); if (state.failed) return ;

                }
                break;
            case 42 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:288: RANGE_WORD
                {
                mRANGE_WORD(); if (state.failed) return ;

                }
                break;
            case 43 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:299: UNLIMITED_WORD
                {
                mUNLIMITED_WORD(); if (state.failed) return ;

                }
                break;
            case 44 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:314: DEFAULT_WORD
                {
                mDEFAULT_WORD(); if (state.failed) return ;

                }
                break;
            case 45 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:327: IP4_ADDR
                {
                mIP4_ADDR(); if (state.failed) return ;

                }
                break;
            case 46 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:336: IP4_SHORT_3
                {
                mIP4_SHORT_3(); if (state.failed) return ;

                }
                break;
            case 47 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:348: IP4_SHORT_2
                {
                mIP4_SHORT_2(); if (state.failed) return ;

                }
                break;
            case 48 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:360: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 49 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:367: KMG_NUMBER
                {
                mKMG_NUMBER(); if (state.failed) return ;

                }
                break;
            case 50 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:378: ALPHANUM_NONSTD
                {
                mALPHANUM_NONSTD(); if (state.failed) return ;

                }
                break;
            case 51 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:394: IP6_ADDR
                {
                mIP6_ADDR(); if (state.failed) return ;

                }
                break;
            case 52 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:403: BAD
                {
                mBAD(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Bind9Config
    public final void synpred1_Bind9Config_fragment() throws RecognitionException {   
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:29: (~ '*' | '*' ~ '/' )
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
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:30: ~ '*'
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
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:37: '*' ~ '/'
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
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:4: ( ( '\\r' )? '\\n' )
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:5: ( '\\r' )? '\\n'
        {
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:5: ( '\\r' )?
        int alt16=2;
        int LA16_0 = input.LA(1);

        if ( (LA16_0=='\r') ) {
            alt16=1;
        }
        switch (alt16) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:5: '\\r'
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
        "\5\44\2\uffff\15\44\1\uffff\1\114\1\51\1\115\1\117\6\uffff\1\123"+
        "\2\44\1\132\1\44\1\uffff\1\44\4\uffff\3\44\1\uffff\1\44\1\134\1"+
        "\135\1\44\2\uffff\17\44\1\162\2\44\1\165\3\44\12\uffff\1\132\1\172"+
        "\1\uffff\1\172\2\44\1\uffff\1\44\2\uffff\21\44\1\u0090\1\u0091\1"+
        "\44\1\uffff\2\44\1\uffff\2\44\1\165\1\132\1\uffff\1\u0099\2\44\1"+
        "\u009e\4\44\1\u00a3\1\u00a4\1\44\1\165\2\44\1\u00a8\1\44\1\u00aa"+
        "\4\44\2\uffff\6\44\1\132\1\uffff\1\u0099\1\uffff\2\44\1\uffff\1"+
        "\u00bb\1\44\1\u00bd\1\165\2\uffff\2\44\1\u00c0\1\uffff\1\44\1\uffff"+
        "\14\44\1\u0099\1\u00ce\1\u00d1\1\44\1\uffff\1\44\1\uffff\1\44\1"+
        "\u00d5\1\uffff\7\44\1\u00dd\1\44\1\u00df\3\44\1\uffff\1\u00ce\2"+
        "\uffff\1\44\1\u00e5\1\u00e6\1\uffff\2\44\1\u00e9\2\44\1\u00ec\1"+
        "\44\1\uffff\1\44\1\uffff\3\44\1\u00ce\1\44\2\uffff\2\44\1\uffff"+
        "\1\44\1\u00f6\1\uffff\1\44\1\u00f8\4\44\1\u00fd\2\44\1\uffff\1\u0100"+
        "\1\uffff\1\u0101\1\u0102\1\u0103\1\u0104\1\uffff\2\44\6\uffff\1"+
        "\u0107\1\uffff";
    static final String DFA14_eofS =
        "\u0108\uffff";
    static final String DFA14_minS =
        "\1\0\4\45\2\uffff\15\45\1\uffff\1\52\1\0\2\11\6\uffff\5\45\1\uffff"+
        "\1\45\4\uffff\3\45\1\uffff\4\45\2\uffff\26\45\12\uffff\2\45\1\60"+
        "\3\45\1\uffff\1\45\2\uffff\23\45\1\160\1\uffff\2\45\1\uffff\4\45"+
        "\1\uffff\1\56\23\45\1\156\2\uffff\1\157\1\151\3\45\1\157\1\45\1"+
        "\uffff\1\56\1\60\2\45\1\uffff\4\45\2\uffff\3\45\1\uffff\1\163\1"+
        "\uffff\3\45\1\141\1\162\1\145\1\144\1\151\1\45\1\156\1\154\1\162"+
        "\2\56\2\45\1\uffff\1\45\1\uffff\2\45\1\uffff\1\160\3\45\1\155\1"+
        "\164\1\146\1\60\1\163\1\45\1\141\1\151\1\137\1\uffff\1\56\2\uffff"+
        "\3\45\1\uffff\1\145\2\45\1\156\1\145\1\60\1\151\1\uffff\1\164\1"+
        "\uffff\1\155\1\163\1\156\1\56\1\45\2\uffff\1\143\1\45\1\uffff\1"+
        "\141\1\60\1\uffff\1\170\1\60\1\145\1\164\1\157\1\45\1\60\1\45\1"+
        "\155\1\uffff\1\60\1\uffff\3\60\1\45\1\uffff\1\45\1\145\6\uffff\1"+
        "\60\1\uffff";
    static final String DFA14_maxS =
        "\1\uffff\4\172\2\uffff\15\172\1\uffff\1\57\1\uffff\2\40\6\uffff"+
        "\5\172\1\uffff\1\172\4\uffff\3\172\1\uffff\4\172\2\uffff\26\172"+
        "\12\uffff\2\172\1\71\3\172\1\uffff\1\172\2\uffff\23\172\1\160\1"+
        "\uffff\2\172\1\uffff\4\172\1\uffff\1\71\23\172\1\156\2\uffff\1\162"+
        "\1\154\3\172\1\157\1\172\1\uffff\2\71\2\172\1\uffff\4\172\2\uffff"+
        "\3\172\1\uffff\1\163\1\uffff\3\172\1\141\1\162\1\145\1\144\1\151"+
        "\1\172\1\156\1\154\1\162\1\56\1\71\2\172\1\uffff\1\172\1\uffff\2"+
        "\172\1\uffff\1\160\3\172\1\155\1\164\1\146\1\172\1\163\1\172\1\141"+
        "\1\151\1\137\1\uffff\1\71\2\uffff\3\172\1\uffff\1\145\2\172\1\156"+
        "\1\145\1\172\1\151\1\uffff\1\164\1\uffff\1\155\1\163\1\156\1\56"+
        "\1\172\2\uffff\1\143\1\172\1\uffff\1\141\1\172\1\uffff\1\170\1\172"+
        "\1\145\1\164\1\157\3\172\1\155\1\uffff\1\172\1\uffff\4\172\1\uffff"+
        "\1\172\1\145\6\uffff\1\172\1\uffff";
    static final String DFA14_acceptS =
        "\5\uffff\1\5\1\6\15\uffff\1\37\4\uffff\3\43\1\44\1\46\1\47\5\uffff"+
        "\1\62\1\uffff\1\62\2\63\1\64\3\uffff\1\63\4\uffff\1\5\1\6\26\uffff"+
        "\1\37\1\40\1\45\1\41\1\43\1\42\1\44\1\46\1\47\1\51\6\uffff\1\60"+
        "\1\uffff\1\2\1\3\24\uffff\1\25\2\uffff\1\50\4\uffff\1\61\25\uffff"+
        "\1\23\1\24\7\uffff\1\57\4\uffff\1\1\4\uffff\1\11\1\12\3\uffff\1"+
        "\15\1\uffff\1\16\20\uffff\1\4\1\uffff\1\10\2\uffff\1\14\15\uffff"+
        "\1\56\1\uffff\1\55\1\52\3\uffff\1\13\7\uffff\1\30\1\uffff\1\32\5"+
        "\uffff\1\7\1\20\2\uffff\1\54\2\uffff\1\26\11\uffff\1\21\1\uffff"+
        "\1\31\4\uffff\1\35\2\uffff\1\27\1\33\1\34\1\36\1\53\1\17\1\uffff"+
        "\1\22";
    static final String DFA14_specialS =
        "\1\1\25\uffff\1\0\u00f1\uffff}>";
    static final String[] DFA14_transitionS = {
            "\11\51\1\32\1\30\1\51\1\33\1\27\22\51\1\31\1\51\1\36\1\26\1"+
            "\51\1\50\4\51\1\34\3\51\1\24\1\25\2\37\10\42\1\47\1\35\5\51"+
            "\2\45\1\4\4\45\1\3\1\2\21\45\4\51\1\46\1\51\1\16\2\43\1\15\1"+
            "\43\1\7\1\43\1\14\1\17\1\43\1\20\1\43\1\12\1\21\1\10\1\22\1"+
            "\43\1\40\1\13\1\11\1\41\3\43\1\23\1\1\1\5\1\51\1\6\uff82\51",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\16\53\1\52"+
            "\13\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\15\54\1\57\14\54\6\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\22\54\1\60\7\54\6\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\7\54\1\61\22\54\6\uffff"+
            "\32\53",
            "",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\66\7\53"+
            "\1\65\5\53\1\64\13\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\67"+
            "\14\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\71"+
            "\14\53\1\72\6\53\1\70\1\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\73\31\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\76"+
            "\2\53\1\74\7\53\1\75\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\77"+
            "\21\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\100"+
            "\11\53\1\101\13\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\2\53\1\102"+
            "\27\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\17\53\1\103"+
            "\12\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\104"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\16\53\1\106"+
            "\5\53\1\105\5\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\107\15\53"+
            "\1\110\13\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\111"+
            "\25\53",
            "",
            "\1\113\4\uffff\1\113",
            "\0\113",
            "\2\116\1\uffff\2\116\22\uffff\1\116",
            "\2\116\1\uffff\2\116\22\uffff\1\116",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55\10\uffff\1\126\1\uffff\12\124\1\55\6\uffff\6\54\1\127"+
            "\3\54\1\127\1\54\1\127\15\54\4\uffff\1\44\1\uffff\6\53\1\125"+
            "\3\53\1\125\1\53\1\125\15\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\130\31\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\131"+
            "\14\53",
            "\1\55\10\uffff\1\126\1\uffff\12\124\1\55\6\uffff\6\54\1\127"+
            "\3\54\1\127\1\54\1\127\15\54\4\uffff\1\44\1\uffff\6\53\1\125"+
            "\3\53\1\125\1\53\1\125\15\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\32\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\133"+
            "\14\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\32\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\1\136\31\54\6\uffff\32\53",
            "",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\137"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\140"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\141"+
            "\16\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\142"+
            "\16\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\17\53\1\143"+
            "\12\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\144"+
            "\7\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\24\53\1\145"+
            "\5\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\146"+
            "\7\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\147\31\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\24\53\1\150"+
            "\5\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\31\53\1\151",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\152"+
            "\14\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\5\53\1\154"+
            "\5\53\1\153\16\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\14\53\1\155"+
            "\15\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\156"+
            "\16\53",
            "\1\55\12\uffff\4\56\1\157\1\56\1\160\3\56\1\55\6\uffff\32"+
            "\54\4\uffff\1\161\1\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\30\53\1\163"+
            "\1\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\14\53\1\164"+
            "\15\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\166"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\167"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\170"+
            "\7\53",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\55\10\uffff\1\126\1\uffff\12\171\1\55\6\uffff\6\54\1\127"+
            "\3\54\1\127\1\54\1\127\15\54\4\uffff\1\44\1\uffff\6\53\1\125"+
            "\3\53\1\125\1\53\1\125\15\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\12\173",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\174"+
            "\14\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\175"+
            "\16\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\176"+
            "\25\53",
            "",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\16\54\1\177\13\54\6\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\26\53\1\u0080"+
            "\3\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\u0081"+
            "\7\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\u0082"+
            "\7\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\30\53\1\u0083"+
            "\1\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u0084"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u0085"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u0086"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u0087"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\25\53\1\u0088"+
            "\4\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\53\1\u0089"+
            "\30\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u008a"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u008b"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u008c"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\u008d\31"+
            "\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\u008e\31"+
            "\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u008f\1"+
            "\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\u0092",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u0093\1"+
            "\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\53\1\u0094"+
            "\30\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\7\53\1\u0095"+
            "\22\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u0096"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u0097\1"+
            "\uffff\32\53",
            "\1\55\10\uffff\1\126\1\uffff\12\u0098\1\55\6\uffff\6\54\1"+
            "\127\3\54\1\127\1\54\1\127\15\54\4\uffff\1\44\1\uffff\6\53\1"+
            "\125\3\53\1\125\1\53\1\125\15\53",
            "",
            "\1\u009b\1\uffff\12\u009a",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\6\53\1\u009c"+
            "\23\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u009d"+
            "\21\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\22\54\1\u009f\7\54\6\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\u00a0\31"+
            "\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u00a1"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00a2"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u00a5"+
            "\21\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00a6"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00a7"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u00a9\1"+
            "\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\6\53\1\u00ab"+
            "\23\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\24\53\1\u00ac"+
            "\5\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u00ad"+
            "\21\53",
            "\1\u00ae",
            "",
            "",
            "\1\u00af\2\uffff\1\u00b0",
            "\1\u00b1\2\uffff\1\u00b2",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00b3"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u00b4\1"+
            "\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u00b5\1"+
            "\uffff\32\53",
            "\1\u00b6",
            "\1\55\12\uffff\12\u0098\1\55\6\uffff\6\54\1\127\3\54\1\127"+
            "\1\54\1\127\15\54\4\uffff\1\44\1\uffff\6\53\1\125\3\53\1\125"+
            "\1\53\1\125\15\53",
            "",
            "\1\u009b\1\uffff\12\u00b7",
            "\12\u00b8",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00b9"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\14\53\1\u00ba"+
            "\15\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\u00bc"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\u00be"+
            "\14\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\u00bf"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "",
            "\1\u00c1",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\u00c2\31"+
            "\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\u00c3"+
            "\16\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\u00c4"+
            "\14\53",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\u00ca"+
            "\10\53",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u009b",
            "\1\u00d0\1\uffff\12\u00cf",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u00d2"+
            "\21\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\3\53\1\u00d3"+
            "\26\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\6\53\1\u00d4"+
            "\23\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "",
            "\1\u00d6",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u00d7"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u00d8"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u00d9\1"+
            "\uffff\32\53",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00de",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00d0\1\uffff\12\u00e3",
            "",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u00e4"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "",
            "\1\u00e7",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u00e8"+
            "\21\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\u00ea",
            "\1\u00eb",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00ed",
            "",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00d0",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00f2"+
            "\25\53",
            "",
            "",
            "\1\u00f3",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\16\53\1\u00f4"+
            "\13\53",
            "",
            "\1\u00f5",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u00f7",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f9",
            "\1\u00fa",
            "\1\u00fb",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\3\53\1\u00fc"+
            "\26\53",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\u00fe"+
            "\14\53",
            "\1\u00ff",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "",
            "\1\55\7\uffff\1\u0105\2\uffff\12\56\1\55\6\uffff\32\54\6\uffff"+
            "\32\53",
            "\1\u0106",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
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
            return "1:1: Tokens : ( T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | COMMENT | CR | LF | WS | ASTERISK | FORWARD_SLASH | SEMICOLON | DOUBLE_QUOTE | YES_OR_NO_WORD | YES_OR_NO_NUM | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD | IP4_ADDR | IP4_SHORT_3 | IP4_SHORT_2 | NUMBER | KMG_NUMBER | ALPHANUM_NONSTD | IP6_ADDR | BAD );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA14_22 = input.LA(1);

                        s = -1;
                        if ( ((LA14_22>='\u0000' && LA14_22<='\uFFFF')) ) {s = 75;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA14_0 = input.LA(1);

                        s = -1;
                        if ( (LA14_0=='z') ) {s = 1;}

                        else if ( (LA14_0=='I') ) {s = 2;}

                        else if ( (LA14_0=='H') ) {s = 3;}

                        else if ( (LA14_0=='C') ) {s = 4;}

                        else if ( (LA14_0=='{') ) {s = 5;}

                        else if ( (LA14_0=='}') ) {s = 6;}

                        else if ( (LA14_0=='f') ) {s = 7;}

                        else if ( (LA14_0=='o') ) {s = 8;}

                        else if ( (LA14_0=='t') ) {s = 9;}

                        else if ( (LA14_0=='m') ) {s = 10;}

                        else if ( (LA14_0=='s') ) {s = 11;}

                        else if ( (LA14_0=='h') ) {s = 12;}

                        else if ( (LA14_0=='d') ) {s = 13;}

                        else if ( (LA14_0=='a') ) {s = 14;}

                        else if ( (LA14_0=='i') ) {s = 15;}

                        else if ( (LA14_0=='k') ) {s = 16;}

                        else if ( (LA14_0=='n') ) {s = 17;}

                        else if ( (LA14_0=='p') ) {s = 18;}

                        else if ( (LA14_0=='y') ) {s = 19;}

                        else if ( (LA14_0=='.') ) {s = 20;}

                        else if ( (LA14_0=='/') ) {s = 21;}

                        else if ( (LA14_0=='#') ) {s = 22;}

                        else if ( (LA14_0=='\r') ) {s = 23;}

                        else if ( (LA14_0=='\n') ) {s = 24;}

                        else if ( (LA14_0==' ') ) {s = 25;}

                        else if ( (LA14_0=='\t') ) {s = 26;}

                        else if ( (LA14_0=='\f') ) {s = 27;}

                        else if ( (LA14_0=='*') ) {s = 28;}

                        else if ( (LA14_0==';') ) {s = 29;}

                        else if ( (LA14_0=='\"') ) {s = 30;}

                        else if ( ((LA14_0>='0' && LA14_0<='1')) ) {s = 31;}

                        else if ( (LA14_0=='r') ) {s = 32;}

                        else if ( (LA14_0=='u') ) {s = 33;}

                        else if ( ((LA14_0>='2' && LA14_0<='9')) ) {s = 34;}

                        else if ( ((LA14_0>='b' && LA14_0<='c')||LA14_0=='e'||LA14_0=='g'||LA14_0=='j'||LA14_0=='l'||LA14_0=='q'||(LA14_0>='v' && LA14_0<='x')) ) {s = 35;}

                        else if ( ((LA14_0>='A' && LA14_0<='B')||(LA14_0>='D' && LA14_0<='G')||(LA14_0>='J' && LA14_0<='Z')) ) {s = 37;}

                        else if ( (LA14_0=='_') ) {s = 38;}

                        else if ( (LA14_0==':') ) {s = 39;}

                        else if ( (LA14_0=='%') ) {s = 40;}

                        else if ( ((LA14_0>='\u0000' && LA14_0<='\b')||LA14_0=='\u000B'||(LA14_0>='\u000E' && LA14_0<='\u001F')||LA14_0=='!'||LA14_0=='$'||(LA14_0>='&' && LA14_0<=')')||(LA14_0>='+' && LA14_0<='-')||(LA14_0>='<' && LA14_0<='@')||(LA14_0>='[' && LA14_0<='^')||LA14_0=='`'||LA14_0=='|'||(LA14_0>='~' && LA14_0<='\uFFFF')) ) {s = 41;}

                        else s = 36;

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
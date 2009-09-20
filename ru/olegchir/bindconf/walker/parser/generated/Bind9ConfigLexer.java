// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-20 15:04:49

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
    public static final int IP6_VALID_CHAR=47;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int YES_OR_NO_WORD=24;
    public static final int DOUBLE_QUOTE=43;
    public static final int ST_ZONE_MASTER=4;
    public static final int ST_ZONE_FORWARD=8;
    public static final int UNLIMITED_WORD=19;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int ALPHANUM_NONSTD=15;
    public static final int ST_ZONE_SLAVE=5;
    public static final int ASTERISK=29;
    public static final int NOTIFY_WORD=21;
    public static final int ST_ZONE_DELEGATION=9;
    public static final int ST_ZONE_STUB=7;
    public static final int PERL_COMMENT=37;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int ANY_ASCII_ALPHANUM=46;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int CPP_COMMENT=36;
    public static final int DIGIT=45;
    public static final int NL=39;
    public static final int COMMENT=38;
    public static final int T__50=50;
    public static final int ONE_LINE_DOUBLE_QUOTED_STRING=34;
    public static final int T__48=48;
    public static final int ST_TESTING_PLIST=12;
    public static final int T__49=49;
    public static final int NUMBER=16;
    public static final int ST_TESTING=11;
    public static final int SEMICOLON=33;
    public static final int THREE_DIGIT_NUMBER=44;
    public static final int PLIST_PARAM=13;
    public static final int NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD=22;
    public static final int ST_ZONE_HINT=6;
    public static final int DEFAULT_WORD=20;
    public static final int DOMAIN_NAME=26;
    public static final int T__71=71;
    public static final int WS=42;
    public static final int T__72=72;
    public static final int KMG_NUMBER=17;
    public static final int ZERO_OR_ONE_WORD=23;
    public static final int T__70=70;
    public static final int BAD=14;
    public static final int IP4_ADDR=27;
    public static final int IP6_ADDR=28;
    public static final int RANGE_WORD=18;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int CR=40;
    public static final int T__74=74;
    public static final int C_COMMENT=35;
    public static final int T__73=73;
    public static final int IP4_SHORT_3=31;
    public static final int T__79=79;
    public static final int FORWARD_SLASH=32;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int TRUE_OR_FALSE_WORD=25;
    public static final int IP4_SHORT_2=30;
    public static final int LF=41;

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

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:96:7: ( 'dialup_option_default' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:96:9: 'dialup_option_default'
            {
            match("dialup_option_default"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:97:7: ( 'dialup_option_slavestub' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:97:9: 'dialup_option_slavestub'
            {
            match("dialup_option_slavestub"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:341:9: ( ( C_COMMENT | CPP_COMMENT | PERL_COMMENT ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:341:11: ( C_COMMENT | CPP_COMMENT | PERL_COMMENT )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:341:11: ( C_COMMENT | CPP_COMMENT | PERL_COMMENT )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:341:12: C_COMMENT
                    {
                    mC_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:341:24: CPP_COMMENT
                    {
                    mCPP_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:341:38: PERL_COMMENT
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:20: ( '/*' ( (~ '*' | '*' ~ '/' )=> . )* '*/' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:22: '/*' ( (~ '*' | '*' ~ '/' )=> . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:27: ( (~ '*' | '*' ~ '/' )=> . )*
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:29: (~ '*' | '*' ~ '/' )=> .
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:346:2: ( '//' (~ ( '\\r' | '\\n' ) )* NL )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:346:4: '//' (~ ( '\\r' | '\\n' ) )* NL
            {
            match("//"); if (state.failed) return ;

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:346:9: (~ ( '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:346:10: ~ ( '\\r' | '\\n' )
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:349:2: ( '#' (~ ( '\\r' | '\\n' ) )* NL )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:349:4: '#' (~ ( '\\r' | '\\n' ) )* NL
            {
            match('#'); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:349:8: (~ ( '\\r' | '\\n' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:349:9: ~ ( '\\r' | '\\n' )
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:353:4: ( '\\r' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:353:6: '\\r'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:355:4: ( '\\n' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:355:6: '\\n'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:358:4: ( ( ' ' | '\\t' | '\\f' | NL )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:358:6: ( ' ' | '\\t' | '\\f' | NL )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:358:6: ( ' ' | '\\t' | '\\f' | NL )+
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:358:7: ' '
            	    {
            	    match(' '); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:358:11: '\\t'
            	    {
            	    match('\t'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:358:16: '\\f'
            	    {
            	    match('\f'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:358:21: NL
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:362:2: ( ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:362:4: ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n'
                    {
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:362:19: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:362:19: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:363:6: '\\r'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:368:2: ( '*' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:368:4: '*'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:372:2: ( '/' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:372:4: '/'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:375:2: ( ';' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:375:4: ';'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:378:2: ( '\"' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:378:4: '\"'
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

    // $ANTLR start "ONE_LINE_DOUBLE_QUOTED_STRING"
    public final void mONE_LINE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = ONE_LINE_DOUBLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:384:2: ( DOUBLE_QUOTE (~ ( CR | LF | DOUBLE_QUOTE ) )* DOUBLE_QUOTE )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:384:4: DOUBLE_QUOTE (~ ( CR | LF | DOUBLE_QUOTE ) )* DOUBLE_QUOTE
            {
            mDOUBLE_QUOTE(); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:384:17: (~ ( CR | LF | DOUBLE_QUOTE ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:384:18: ~ ( CR | LF | DOUBLE_QUOTE )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
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
            	    break loop8;
                }
            } while (true);

            mDOUBLE_QUOTE(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ONE_LINE_DOUBLE_QUOTED_STRING"

    // $ANTLR start "YES_OR_NO_WORD"
    public final void mYES_OR_NO_WORD() throws RecognitionException {
        try {
            int _type = YES_OR_NO_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:389:2: ( ( 'yes' | 'no' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:389:4: ( 'yes' | 'no' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:389:4: ( 'yes' | 'no' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='y') ) {
                alt9=1;
            }
            else if ( (LA9_0=='n') ) {
                alt9=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:389:5: 'yes'
                    {
                    match("yes"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:389:11: 'no'
                    {
                    match("no"); if (state.failed) return ;


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

    // $ANTLR start "TRUE_OR_FALSE_WORD"
    public final void mTRUE_OR_FALSE_WORD() throws RecognitionException {
        try {
            int _type = TRUE_OR_FALSE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:393:2: ( ( 'true' | 'false' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:393:4: ( 'true' | 'false' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:393:4: ( 'true' | 'false' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='t') ) {
                alt10=1;
            }
            else if ( (LA10_0=='f') ) {
                alt10=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:393:5: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:393:12: 'false'
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
    // $ANTLR end "TRUE_OR_FALSE_WORD"

    // $ANTLR start "ZERO_OR_ONE_WORD"
    public final void mZERO_OR_ONE_WORD() throws RecognitionException {
        try {
            int _type = ZERO_OR_ONE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:397:2: ( ( '0' | '1' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:397:4: ( '0' | '1' )
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
    // $ANTLR end "ZERO_OR_ONE_WORD"

    // $ANTLR start "RANGE_WORD"
    public final void mRANGE_WORD() throws RecognitionException {
        try {
            int _type = RANGE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:402:2: ( 'range' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:402:4: 'range'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:405:2: ( 'unlimited' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:405:4: 'unlimited'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:408:2: ( 'default' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:408:4: 'default'
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

    // $ANTLR start "NOTIFY_WORD"
    public final void mNOTIFY_WORD() throws RecognitionException {
        try {
            int _type = NOTIFY_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:2: ( 'notify' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:4: 'notify'
            {
            match("notify"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTIFY_WORD"

    // $ANTLR start "NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD"
    public final void mNOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD() throws RecognitionException {
        try {
            int _type = NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:416:2: ( 'notify-passive' | 'refresh' | 'passive' )
            int alt11=3;
            switch ( input.LA(1) ) {
            case 'n':
                {
                alt11=1;
                }
                break;
            case 'r':
                {
                alt11=2;
                }
                break;
            case 'p':
                {
                alt11=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:416:4: 'notify-passive'
                    {
                    match("notify-passive"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:416:21: 'refresh'
                    {
                    match("refresh"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:416:31: 'passive'
                    {
                    match("passive"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD"

    // $ANTLR start "IP4_ADDR"
    public final void mIP4_ADDR() throws RecognitionException {
        try {
            int _type = IP4_ADDR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:420:9: ( THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:420:11: THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:423:2: ( THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:423:4: THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:426:2: ( THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:426:4: THREE_DIGIT_NUMBER '.' THREE_DIGIT_NUMBER
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:429:2: ( DIGIT | DIGIT DIGIT | DIGIT DIGIT DIGIT )
            int alt12=3;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>='0' && LA12_0<='9')) ) {
                int LA12_1 = input.LA(2);

                if ( ((LA12_1>='0' && LA12_1<='9')) ) {
                    int LA12_3 = input.LA(3);

                    if ( ((LA12_3>='0' && LA12_3<='9')) ) {
                        alt12=3;
                    }
                    else {
                        alt12=2;}
                }
                else {
                    alt12=1;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:429:4: DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:430:4: DIGIT DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:431:4: DIGIT DIGIT DIGIT
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:435:8: ( ( DIGIT )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:435:10: ( DIGIT )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:435:10: ( DIGIT )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:435:10: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:437:16: ( '0' .. '9' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:437:18: '0' .. '9'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:440:2: ( NUMBER ( 'K' | 'k' | 'M' | 'm' | 'G' | 'g' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:440:4: NUMBER ( 'K' | 'k' | 'M' | 'm' | 'G' | 'g' )
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

    // $ANTLR start "DOMAIN_NAME"
    public final void mDOMAIN_NAME() throws RecognitionException {
        try {
            int _type = DOMAIN_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:443:2: ( ( ALPHANUM_NONSTD '.' )+ ALPHANUM_NONSTD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:443:4: ( ALPHANUM_NONSTD '.' )+ ALPHANUM_NONSTD
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:443:4: ( ALPHANUM_NONSTD '.' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                alt14 = dfa14.predict(input);
                switch (alt14) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:443:5: ALPHANUM_NONSTD '.'
            	    {
            	    mALPHANUM_NONSTD(); if (state.failed) return ;
            	    match('.'); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            mALPHANUM_NONSTD(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOMAIN_NAME"

    // $ANTLR start "ALPHANUM_NONSTD"
    public final void mALPHANUM_NONSTD() throws RecognitionException {
        try {
            int _type = ALPHANUM_NONSTD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:447:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:447:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:447:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>='0' && LA15_0<='9')||(LA15_0>='A' && LA15_0<='Z')||LA15_0=='_'||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
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
            	    break loop15;
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:451:2: ( ( '\\u0020' .. '\\u007F' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:451:4: ( '\\u0020' .. '\\u007F' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:451:4: ( '\\u0020' .. '\\u007F' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:451:5: '\\u0020' .. '\\u007F'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:9: ( ( IP6_VALID_CHAR )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:11: ( IP6_VALID_CHAR )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:11: ( IP6_VALID_CHAR )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0=='%'||(LA16_0>='0' && LA16_0<=':')||(LA16_0>='A' && LA16_0<='Z')||(LA16_0>='a' && LA16_0<='z')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:12: IP6_VALID_CHAR
            	    {
            	    mIP6_VALID_CHAR(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:2: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+
            int cnt17=0;
            loop17:
            do {
                int alt17=6;
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
                    alt17=1;
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
                    alt17=2;
                    }
                    break;
                case ':':
                    {
                    alt17=3;
                    }
                    break;
                case '%':
                    {
                    alt17=4;
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
                    alt17=5;
                    }
                    break;

                }

                switch (alt17) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:5: ( 'a' .. 'z' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:5: ( 'a' .. 'z' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:6: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:16: ( 'A' .. 'Z' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:16: ( 'A' .. 'Z' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:17: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 3 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:27: ':'
            	    {
            	    match(':'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:31: '%'
            	    {
            	    match('%'); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:35: ( '0' .. '9' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:35: ( '0' .. '9' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:458:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt17 >= 1 ) break loop17;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(17, input);
                        throw eee;
                }
                cnt17++;
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:461:6: ( . )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:461:8: .
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
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:8: ( T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | COMMENT | CR | LF | WS | ASTERISK | FORWARD_SLASH | SEMICOLON | DOUBLE_QUOTE | ONE_LINE_DOUBLE_QUOTED_STRING | YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD | NOTIFY_WORD | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD | IP4_ADDR | IP4_SHORT_3 | IP4_SHORT_2 | NUMBER | KMG_NUMBER | DOMAIN_NAME | ALPHANUM_NONSTD | IP6_ADDR | BAD )
        int alt18=58;
        alt18 = dfa18.predict(input);
        switch (alt18) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:10: T__48
                {
                mT__48(); if (state.failed) return ;

                }
                break;
            case 2 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:16: T__49
                {
                mT__49(); if (state.failed) return ;

                }
                break;
            case 3 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:22: T__50
                {
                mT__50(); if (state.failed) return ;

                }
                break;
            case 4 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:28: T__51
                {
                mT__51(); if (state.failed) return ;

                }
                break;
            case 5 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:34: T__52
                {
                mT__52(); if (state.failed) return ;

                }
                break;
            case 6 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:40: T__53
                {
                mT__53(); if (state.failed) return ;

                }
                break;
            case 7 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:46: T__54
                {
                mT__54(); if (state.failed) return ;

                }
                break;
            case 8 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:52: T__55
                {
                mT__55(); if (state.failed) return ;

                }
                break;
            case 9 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:58: T__56
                {
                mT__56(); if (state.failed) return ;

                }
                break;
            case 10 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:64: T__57
                {
                mT__57(); if (state.failed) return ;

                }
                break;
            case 11 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:70: T__58
                {
                mT__58(); if (state.failed) return ;

                }
                break;
            case 12 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:76: T__59
                {
                mT__59(); if (state.failed) return ;

                }
                break;
            case 13 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:82: T__60
                {
                mT__60(); if (state.failed) return ;

                }
                break;
            case 14 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:88: T__61
                {
                mT__61(); if (state.failed) return ;

                }
                break;
            case 15 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:94: T__62
                {
                mT__62(); if (state.failed) return ;

                }
                break;
            case 16 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:100: T__63
                {
                mT__63(); if (state.failed) return ;

                }
                break;
            case 17 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:106: T__64
                {
                mT__64(); if (state.failed) return ;

                }
                break;
            case 18 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:112: T__65
                {
                mT__65(); if (state.failed) return ;

                }
                break;
            case 19 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:118: T__66
                {
                mT__66(); if (state.failed) return ;

                }
                break;
            case 20 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:124: T__67
                {
                mT__67(); if (state.failed) return ;

                }
                break;
            case 21 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:130: T__68
                {
                mT__68(); if (state.failed) return ;

                }
                break;
            case 22 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:136: T__69
                {
                mT__69(); if (state.failed) return ;

                }
                break;
            case 23 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:142: T__70
                {
                mT__70(); if (state.failed) return ;

                }
                break;
            case 24 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:148: T__71
                {
                mT__71(); if (state.failed) return ;

                }
                break;
            case 25 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:154: T__72
                {
                mT__72(); if (state.failed) return ;

                }
                break;
            case 26 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:160: T__73
                {
                mT__73(); if (state.failed) return ;

                }
                break;
            case 27 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:166: T__74
                {
                mT__74(); if (state.failed) return ;

                }
                break;
            case 28 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:172: T__75
                {
                mT__75(); if (state.failed) return ;

                }
                break;
            case 29 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:178: T__76
                {
                mT__76(); if (state.failed) return ;

                }
                break;
            case 30 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:184: T__77
                {
                mT__77(); if (state.failed) return ;

                }
                break;
            case 31 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:190: T__78
                {
                mT__78(); if (state.failed) return ;

                }
                break;
            case 32 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:196: T__79
                {
                mT__79(); if (state.failed) return ;

                }
                break;
            case 33 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:202: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 34 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:210: CR
                {
                mCR(); if (state.failed) return ;

                }
                break;
            case 35 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:213: LF
                {
                mLF(); if (state.failed) return ;

                }
                break;
            case 36 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:216: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 37 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:219: ASTERISK
                {
                mASTERISK(); if (state.failed) return ;

                }
                break;
            case 38 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:228: FORWARD_SLASH
                {
                mFORWARD_SLASH(); if (state.failed) return ;

                }
                break;
            case 39 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:242: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;

                }
                break;
            case 40 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:252: DOUBLE_QUOTE
                {
                mDOUBLE_QUOTE(); if (state.failed) return ;

                }
                break;
            case 41 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:265: ONE_LINE_DOUBLE_QUOTED_STRING
                {
                mONE_LINE_DOUBLE_QUOTED_STRING(); if (state.failed) return ;

                }
                break;
            case 42 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:295: YES_OR_NO_WORD
                {
                mYES_OR_NO_WORD(); if (state.failed) return ;

                }
                break;
            case 43 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:310: TRUE_OR_FALSE_WORD
                {
                mTRUE_OR_FALSE_WORD(); if (state.failed) return ;

                }
                break;
            case 44 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:329: ZERO_OR_ONE_WORD
                {
                mZERO_OR_ONE_WORD(); if (state.failed) return ;

                }
                break;
            case 45 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:346: RANGE_WORD
                {
                mRANGE_WORD(); if (state.failed) return ;

                }
                break;
            case 46 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:357: UNLIMITED_WORD
                {
                mUNLIMITED_WORD(); if (state.failed) return ;

                }
                break;
            case 47 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:372: DEFAULT_WORD
                {
                mDEFAULT_WORD(); if (state.failed) return ;

                }
                break;
            case 48 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:385: NOTIFY_WORD
                {
                mNOTIFY_WORD(); if (state.failed) return ;

                }
                break;
            case 49 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:397: NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD
                {
                mNOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD(); if (state.failed) return ;

                }
                break;
            case 50 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:438: IP4_ADDR
                {
                mIP4_ADDR(); if (state.failed) return ;

                }
                break;
            case 51 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:447: IP4_SHORT_3
                {
                mIP4_SHORT_3(); if (state.failed) return ;

                }
                break;
            case 52 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:459: IP4_SHORT_2
                {
                mIP4_SHORT_2(); if (state.failed) return ;

                }
                break;
            case 53 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:471: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 54 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:478: KMG_NUMBER
                {
                mKMG_NUMBER(); if (state.failed) return ;

                }
                break;
            case 55 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:489: DOMAIN_NAME
                {
                mDOMAIN_NAME(); if (state.failed) return ;

                }
                break;
            case 56 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:501: ALPHANUM_NONSTD
                {
                mALPHANUM_NONSTD(); if (state.failed) return ;

                }
                break;
            case 57 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:517: IP6_ADDR
                {
                mIP6_ADDR(); if (state.failed) return ;

                }
                break;
            case 58 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:526: BAD
                {
                mBAD(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Bind9Config
    public final void synpred1_Bind9Config_fragment() throws RecognitionException {   
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:29: (~ '*' | '*' ~ '/' )
        int alt19=2;
        int LA19_0 = input.LA(1);

        if ( ((LA19_0>='\u0000' && LA19_0<=')')||(LA19_0>='+' && LA19_0<='\uFFFF')) ) {
            alt19=1;
        }
        else if ( (LA19_0=='*') ) {
            alt19=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 19, 0, input);

            throw nvae;
        }
        switch (alt19) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:30: ~ '*'
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
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:37: '*' ~ '/'
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
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:362:4: ( ( '\\r' )? '\\n' )
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:362:5: ( '\\r' )? '\\n'
        {
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:362:5: ( '\\r' )?
        int alt20=2;
        int LA20_0 = input.LA(1);

        if ( (LA20_0=='\r') ) {
            alt20=1;
        }
        switch (alt20) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:362:5: '\\r'
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
    protected DFA18 dfa18 = new DFA18(this);
    static final String DFA14_eotS =
        "\2\2\2\uffff";
    static final String DFA14_eofS =
        "\4\uffff";
    static final String DFA14_minS =
        "\2\56\2\uffff";
    static final String DFA14_maxS =
        "\2\172\2\uffff";
    static final String DFA14_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA14_specialS =
        "\4\uffff}>";
    static final String[] DFA14_transitionS = {
            "\1\3\1\uffff\12\1\7\uffff\32\1\4\uffff\1\1\1\uffff\32\1",
            "\1\3\1\uffff\12\1\7\uffff\32\1\4\uffff\1\1\1\uffff\32\1",
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
            return "()+ loopback of 443:4: ( ALPHANUM_NONSTD '.' )+";
        }
    }
    static final String DFA18_eotS =
        "\5\43\2\uffff\15\43\1\116\1\51\1\120\1\121\5\uffff\1\124\1\126"+
        "\2\43\1\136\1\43\2\uffff\2\43\3\uffff\3\43\1\uffff\1\43\1\uffff"+
        "\1\43\1\140\1\141\1\43\2\uffff\20\43\1\167\2\43\1\173\3\43\12\uffff"+
        "\1\136\1\u0081\1\57\1\u0081\3\43\1\uffff\1\43\2\uffff\22\43\1\u0099"+
        "\1\u009a\1\43\1\uffff\3\43\1\uffff\3\43\1\173\1\136\1\uffff\1\u00a4"+
        "\3\43\1\u00aa\4\43\1\u00af\1\u00b0\1\43\1\u00b2\2\43\1\u00b5\1\43"+
        "\1\u00b7\5\43\2\uffff\10\43\1\136\1\uffff\1\u00a4\1\57\3\43\1\uffff"+
        "\1\u00cc\1\43\1\u00ce\1\u00b2\2\uffff\1\43\1\uffff\1\43\1\u00d1"+
        "\1\uffff\1\43\1\uffff\17\43\1\u00a4\1\u00e2\1\u00e5\2\43\1\uffff"+
        "\1\43\1\uffff\1\43\1\u00ea\1\uffff\10\43\1\u00f3\1\43\1\u00f5\1"+
        "\u00f7\4\43\1\uffff\1\u00e2\1\57\1\uffff\2\43\1\u0100\1\u0101\1"+
        "\uffff\2\43\1\u0104\3\43\1\u0108\1\43\1\uffff\1\43\3\uffff\1\43"+
        "\1\u00f6\2\43\1\u00e2\1\u010e\1\u00f6\1\43\2\uffff\2\43\1\uffff"+
        "\2\43\1\u0115\1\uffff\1\43\1\u0117\3\43\1\uffff\1\u010e\1\43\1\u011d"+
        "\3\43\1\uffff\1\u0121\1\uffff\1\u0122\1\u0123\1\u0124\1\u010e\1"+
        "\u0125\1\uffff\3\43\6\uffff\1\u0129\1\43\1\uffff\17\43\1\u013b\1"+
        "\43\1\uffff\1\43\1\u013e\1\uffff";
    static final String DFA18_eofS =
        "\u013f\uffff";
    static final String DFA18_minS =
        "\1\0\4\45\2\uffff\15\45\1\52\1\0\2\11\5\uffff\1\0\5\45\2\uffff"+
        "\1\45\1\56\3\uffff\3\45\1\uffff\1\45\1\uffff\1\56\3\45\2\uffff\27"+
        "\45\12\uffff\2\45\1\60\4\45\1\uffff\1\45\2\uffff\24\45\1\56\1\uffff"+
        "\3\45\1\uffff\5\45\1\uffff\1\56\25\45\1\56\2\uffff\2\56\5\45\1\56"+
        "\1\45\1\uffff\1\56\1\60\3\45\1\uffff\4\45\2\uffff\1\45\1\uffff\2"+
        "\45\1\uffff\1\56\1\uffff\4\45\5\56\2\45\1\56\1\45\4\56\3\45\1\uffff"+
        "\1\45\1\uffff\2\45\1\uffff\1\56\4\45\5\56\2\45\1\56\1\45\2\56\1"+
        "\uffff\1\56\1\60\1\uffff\4\45\1\uffff\1\56\2\45\5\56\1\uffff\1\56"+
        "\3\uffff\1\56\1\45\4\56\2\45\2\uffff\1\56\1\45\1\uffff\3\56\1\uffff"+
        "\5\56\1\uffff\1\56\1\45\1\56\1\45\2\56\1\uffff\1\56\1\uffff\4\56"+
        "\1\45\1\uffff\1\45\2\56\6\uffff\2\56\1\uffff\21\56\1\uffff\2\56"+
        "\1\uffff";
    static final String DFA18_maxS =
        "\1\uffff\4\172\2\uffff\15\172\1\57\1\uffff\2\40\5\uffff\1\uffff"+
        "\5\172\2\uffff\2\172\3\uffff\3\172\1\uffff\1\172\1\uffff\4\172\2"+
        "\uffff\27\172\12\uffff\2\172\1\71\4\172\1\uffff\1\172\2\uffff\25"+
        "\172\1\uffff\3\172\1\uffff\5\172\1\uffff\27\172\2\uffff\11\172\1"+
        "\uffff\1\172\1\71\3\172\1\uffff\4\172\2\uffff\1\172\1\uffff\2\172"+
        "\1\uffff\1\172\1\uffff\24\172\1\uffff\1\172\1\uffff\2\172\1\uffff"+
        "\20\172\1\uffff\1\172\1\71\1\uffff\4\172\1\uffff\10\172\1\uffff"+
        "\1\172\3\uffff\10\172\2\uffff\2\172\1\uffff\3\172\1\uffff\5\172"+
        "\1\uffff\6\172\1\uffff\1\172\1\uffff\5\172\1\uffff\3\172\6\uffff"+
        "\2\172\1\uffff\21\172\1\uffff\2\172\1\uffff";
    static final String DFA18_acceptS =
        "\5\uffff\1\5\1\6\21\uffff\3\44\1\45\1\47\6\uffff\1\70\1\67\2\uffff"+
        "\2\71\1\72\3\uffff\1\71\1\uffff\1\67\4\uffff\1\5\1\6\27\uffff\1"+
        "\41\1\46\1\44\1\42\1\43\1\45\1\47\1\50\1\51\1\54\7\uffff\1\65\1"+
        "\uffff\1\2\1\3\25\uffff\1\25\3\uffff\1\52\5\uffff\1\66\27\uffff"+
        "\1\23\1\24\11\uffff\1\64\5\uffff\1\1\4\uffff\1\11\1\12\1\uffff\1"+
        "\53\2\uffff\1\15\1\uffff\1\16\24\uffff\1\4\1\uffff\1\10\2\uffff"+
        "\1\14\20\uffff\1\63\2\uffff\1\55\4\uffff\1\13\10\uffff\1\30\1\uffff"+
        "\1\32\1\61\1\60\10\uffff\1\7\1\20\2\uffff\1\57\3\uffff\1\26\5\uffff"+
        "\1\62\6\uffff\1\21\1\uffff\1\31\5\uffff\1\35\3\uffff\1\27\1\33\1"+
        "\34\1\36\1\56\1\17\2\uffff\1\22\21\uffff\1\37\2\uffff\1\40";
    static final String DFA18_specialS =
        "\1\2\24\uffff\1\0\7\uffff\1\1\u0121\uffff}>";
    static final String[] DFA18_transitionS = {
            "\11\51\1\31\1\27\1\51\1\32\1\26\22\51\1\30\1\51\1\35\1\25\1"+
            "\51\1\50\4\51\1\33\3\51\1\44\1\24\2\36\10\41\1\47\1\34\5\51"+
            "\2\45\1\4\4\45\1\3\1\2\21\45\4\51\1\46\1\51\1\16\2\42\1\15\1"+
            "\42\1\7\1\42\1\14\1\17\1\42\1\20\1\42\1\12\1\21\1\10\1\22\1"+
            "\42\1\37\1\13\1\11\1\40\3\42\1\23\1\1\1\5\1\51\1\6\uff82\51",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\16\53\1\52\13\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\15\54\1\61"+
            "\14\54\4\uffff\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\22\54\1\62"+
            "\7\54\4\uffff\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\7\54\1\63\22"+
            "\54\4\uffff\1\60\1\uffff\32\53",
            "",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\70\7\53\1\67\5\53\1\66\13\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\15\53\1\71\14\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\73\14\53\1\74\6\53\1\72\1\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\75\31\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\10\53\1\100\2\53\1\76\7\53\1\77\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\10\53\1\101\21\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\102\3\53\1\104\5\53\1\103\13\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\2\53\1\105\27\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\17\53\1\106\12\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\107\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\16\53\1\111\5\53\1\110\5\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\112\15\53\1\113\13\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\114\25\53",
            "\1\115\4\uffff\1\115",
            "\0\115",
            "\2\117\1\uffff\2\117\22\uffff\1\117",
            "\2\117\1\uffff\2\117\22\uffff\1\117",
            "",
            "",
            "",
            "",
            "",
            "\12\125\1\uffff\2\125\1\uffff\ufff2\125",
            "\1\55\10\uffff\1\131\1\uffff\12\127\1\55\6\uffff\6\54\1\132"+
            "\3\54\1\132\1\54\1\132\15\54\4\uffff\1\60\1\uffff\6\53\1\130"+
            "\3\53\1\130\1\53\1\130\15\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\133\3\53\1\134\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\15\53\1\135\14\53",
            "\1\55\10\uffff\1\131\1\uffff\12\127\1\55\6\uffff\6\54\1\132"+
            "\3\54\1\132\1\54\1\132\15\54\4\uffff\1\60\1\uffff\6\53\1\130"+
            "\3\53\1\130\1\53\1\130\15\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\15\53\1\137\14\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\1\142\31\54"+
            "\4\uffff\1\60\1\uffff\32\53",
            "",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\21\53\1\143\10\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\21\53\1\144\10\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\13\53\1\145\16\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\13\53\1\146\16\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\17\53\1\147\12\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\22\53\1\150\7\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\24\53\1\151\5\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\22\53\1\152\7\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\153\31\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\24\53\1\154\5\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\31\53\1\155",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\15\53\1\156\14\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\5\53\1\160\5\53\1\157\16\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\14\53\1\161\15\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\162\31\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\13\53\1\163\16\53",
            "\1\55\10\uffff\1\57\1\uffff\4\56\1\164\1\56\1\165\3\56\1\55"+
            "\6\uffff\32\54\4\uffff\1\166\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\30\53\1\170\1\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\14\53\1\171\15\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\23\53\1\172\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\22\53\1\175\1\174\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\21\53\1\176\10\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\22\53\1\177\7\53",
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
            "\1\55\10\uffff\1\131\1\uffff\12\u0080\1\55\6\uffff\6\54\1"+
            "\132\3\54\1\132\1\54\1\132\15\54\4\uffff\1\60\1\uffff\6\53\1"+
            "\130\3\53\1\130\1\53\1\130\15\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\12\u0082",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\15\53\1\u0083\14\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\5\53\1\u0084\24\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\13\53\1\u0085\16\53",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u0086\25\53",
            "",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\16\54\1\u0087"+
            "\13\54\4\uffff\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\26\53\1\u0088\3\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\22\53\1\u0089\7\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\22\53\1\u008a\7\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\30\53\1\u008b\1\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u008c\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\23\53\1\u008d\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u008e\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\23\53\1\u008f\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\25\53\1\u0090\4\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\53\1\u0091\30\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u0092\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\23\53\1\u0093\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u0094\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\u0095\31\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\u0096\31\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\13\53\1\u0097\16\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\u0098\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17"+
            "\60\1\u009b\12\60",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\u009c\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\53\1\u009d\30\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\10\53\1\u009e\21\53",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\7\53\1\u009f\22\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\22\53\1\u00a0\7\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\23\53\1\u00a1\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\u00a2\1\uffff\32\53",
            "\1\55\10\uffff\1\131\1\uffff\12\u00a3\1\55\6\uffff\6\54\1"+
            "\132\3\54\1\132\1\54\1\132\15\54\4\uffff\1\60\1\uffff\6\53\1"+
            "\130\3\53\1\130\1\53\1\130\15\53",
            "",
            "\1\u00a6\1\uffff\12\u00a5\7\uffff\32\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\6\53\1\u00a7\23\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\21\53\1\u00a8\10\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\10\53\1\u00a9\21\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\22\54\1\u00ab"+
            "\7\54\4\uffff\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\u00ac\31\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\23\53\1\u00ad\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u00ae\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\10\53\1\u00b1\21\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u00b3\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u00b4\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\u00b6\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\6\53\1\u00b8\23\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\24\53\1\u00b9\5\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\10\53\1\u00ba\21\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\24\53\1\u00bb\5\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15"+
            "\60\1\u00bc\14\60",
            "",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16"+
            "\60\1\u00bd\2\60\1\u00be\10\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10"+
            "\60\1\u00bf\2\60\1\u00c0\16\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u00c1\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\5\53\1\u00c2\24\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\u00c3\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\10\53\1\u00c4\21\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\u00c5\1\uffff\32\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16"+
            "\60\1\u00c6\13\60",
            "\1\55\10\uffff\1\57\1\uffff\12\u00a3\1\55\6\uffff\6\54\1\132"+
            "\3\54\1\132\1\54\1\132\15\54\4\uffff\1\60\1\uffff\6\53\1\130"+
            "\3\53\1\130\1\53\1\130\15\53",
            "",
            "\1\u00a6\1\uffff\12\u00c7\7\uffff\32\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "\12\u00c8",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u00c9\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u00ca\25\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\14\53\1\u00cb\15\53",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\21\53\1\u00cd\10\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\15\53\1\u00cf\14\53",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\21\53\1\u00d0\10\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22"+
            "\60\1\u00d2\7\60",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\1\u00d3\31\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\13\53\1\u00d4\16\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\15\53\1\u00d5\14\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\17\53\1\u00d6\12\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00d7"+
            "\31\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21"+
            "\60\1\u00d8\10\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u00d9\25\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60"+
            "\1\u00da\26\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10"+
            "\60\1\u00db\21\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\21\53\1\u00dc\10\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\30\53\1\u00dd\1\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15"+
            "\60\1\u00de\14\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\25\53\1\u00df\4\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13"+
            "\60\1\u00e0\16\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\21"+
            "\60\1\u00e1\10\60",
            "\1\u00a6\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\u00e4\1\uffff\12\u00e3\7\uffff\32\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\22\53\1\u00e6\7\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\10\53\1\u00e7\21\53",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\3\53\1\u00e8\26\53",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\6\53\1\u00e9\23\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17"+
            "\60\1\u00eb\12\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\23\53\1\u00ec\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\23\53\1\u00ed\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\u00ee\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\u00ef\1\uffff\32\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14"+
            "\60\1\u00f0\15\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23"+
            "\60\1\u00f1\6\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60"+
            "\1\u00f2\24\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22"+
            "\60\1\u00f4\7\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\7\uffff\1\u00f6\1\57\1\uffff\12\56\1\55\6\uffff\32\54"+
            "\4\uffff\1\60\1\uffff\32\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u00f8"+
            "\31\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u00f9\25\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10"+
            "\60\1\u00fa\21\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\u00fb\1\uffff"+
            "\32\60",
            "",
            "\1\u00e4\1\uffff\12\u00fc\7\uffff\32\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "\12\u00fd",
            "",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\7\53\1\u00fe\22\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\23\53\1\u00ff\6\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u0102\25\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\10\53\1\u0103\21\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15"+
            "\60\1\u0105\14\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16"+
            "\60\1\u0106\13\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u0107\25\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10"+
            "\60\1\u0109\21\60",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23"+
            "\60\1\u010a\6\60",
            "",
            "",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14"+
            "\60\1\u010b\15\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22"+
            "\60\1\u010c\7\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15"+
            "\60\1\u010d\14\60",
            "\1\u00e4\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\57\1\uffff\12\u010f\7\uffff\32\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\4\53\1\u0110\25\53",
            "",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\2\60"+
            "\1\u0111\27\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\16\53\1\u0112\13\53",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u0113"+
            "\31\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\17"+
            "\60\1\u0114\12\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\27"+
            "\60\1\u0116\2\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u0118\25\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23"+
            "\60\1\u0119\6\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16"+
            "\60\1\u011a\13\60",
            "",
            "\1\57\1\uffff\12\u011b\7\uffff\32\57\4\uffff\1\57\1\uffff"+
            "\32\57",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\3\53\1\u011c\26\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\15\53\1\u011e\14\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14"+
            "\60\1\u011f\15\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23"+
            "\60\1\u0120\6\60",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\57\1\uffff\12\57\7\uffff\32\57\4\uffff\1\57\1\uffff\32"+
            "\57",
            "\1\55\10\uffff\1\57\1\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\60\1\uffff\32\53",
            "",
            "\1\55\7\uffff\1\u0126\1\57\1\uffff\12\56\1\55\6\uffff\32\54"+
            "\4\uffff\1\60\1\uffff\32\53",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u0127\25\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10"+
            "\60\1\u0128\21\60",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16"+
            "\60\1\u012a\13\60",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\15"+
            "\60\1\u012b\14\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\u012c\1\uffff"+
            "\32\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60"+
            "\1\u012d\16\60\1\u012e\7\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u012f\25\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13"+
            "\60\1\u0130\16\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\5\60"+
            "\1\u0131\24\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u0132"+
            "\31\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\u0133"+
            "\31\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\25"+
            "\60\1\u0134\4\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24"+
            "\60\1\u0135\5\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\4\60"+
            "\1\u0136\25\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\13"+
            "\60\1\u0137\16\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22"+
            "\60\1\u0138\7\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23"+
            "\60\1\u0139\6\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23"+
            "\60\1\u013a\6\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\24"+
            "\60\1\u013c\5\60",
            "",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\1\60"+
            "\1\u013d\30\60",
            "\1\57\1\uffff\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32"+
            "\60",
            ""
    };

    static final short[] DFA18_eot = DFA.unpackEncodedString(DFA18_eotS);
    static final short[] DFA18_eof = DFA.unpackEncodedString(DFA18_eofS);
    static final char[] DFA18_min = DFA.unpackEncodedStringToUnsignedChars(DFA18_minS);
    static final char[] DFA18_max = DFA.unpackEncodedStringToUnsignedChars(DFA18_maxS);
    static final short[] DFA18_accept = DFA.unpackEncodedString(DFA18_acceptS);
    static final short[] DFA18_special = DFA.unpackEncodedString(DFA18_specialS);
    static final short[][] DFA18_transition;

    static {
        int numStates = DFA18_transitionS.length;
        DFA18_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA18_transition[i] = DFA.unpackEncodedString(DFA18_transitionS[i]);
        }
    }

    class DFA18 extends DFA {

        public DFA18(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 18;
            this.eot = DFA18_eot;
            this.eof = DFA18_eof;
            this.min = DFA18_min;
            this.max = DFA18_max;
            this.accept = DFA18_accept;
            this.special = DFA18_special;
            this.transition = DFA18_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | COMMENT | CR | LF | WS | ASTERISK | FORWARD_SLASH | SEMICOLON | DOUBLE_QUOTE | ONE_LINE_DOUBLE_QUOTED_STRING | YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD | NOTIFY_WORD | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD | IP4_ADDR | IP4_SHORT_3 | IP4_SHORT_2 | NUMBER | KMG_NUMBER | DOMAIN_NAME | ALPHANUM_NONSTD | IP6_ADDR | BAD );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA18_21 = input.LA(1);

                        s = -1;
                        if ( ((LA18_21>='\u0000' && LA18_21<='\uFFFF')) ) {s = 77;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA18_29 = input.LA(1);

                        s = -1;
                        if ( ((LA18_29>='\u0000' && LA18_29<='\t')||(LA18_29>='\u000B' && LA18_29<='\f')||(LA18_29>='\u000E' && LA18_29<='\uFFFF')) ) {s = 85;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA18_0 = input.LA(1);

                        s = -1;
                        if ( (LA18_0=='z') ) {s = 1;}

                        else if ( (LA18_0=='I') ) {s = 2;}

                        else if ( (LA18_0=='H') ) {s = 3;}

                        else if ( (LA18_0=='C') ) {s = 4;}

                        else if ( (LA18_0=='{') ) {s = 5;}

                        else if ( (LA18_0=='}') ) {s = 6;}

                        else if ( (LA18_0=='f') ) {s = 7;}

                        else if ( (LA18_0=='o') ) {s = 8;}

                        else if ( (LA18_0=='t') ) {s = 9;}

                        else if ( (LA18_0=='m') ) {s = 10;}

                        else if ( (LA18_0=='s') ) {s = 11;}

                        else if ( (LA18_0=='h') ) {s = 12;}

                        else if ( (LA18_0=='d') ) {s = 13;}

                        else if ( (LA18_0=='a') ) {s = 14;}

                        else if ( (LA18_0=='i') ) {s = 15;}

                        else if ( (LA18_0=='k') ) {s = 16;}

                        else if ( (LA18_0=='n') ) {s = 17;}

                        else if ( (LA18_0=='p') ) {s = 18;}

                        else if ( (LA18_0=='y') ) {s = 19;}

                        else if ( (LA18_0=='/') ) {s = 20;}

                        else if ( (LA18_0=='#') ) {s = 21;}

                        else if ( (LA18_0=='\r') ) {s = 22;}

                        else if ( (LA18_0=='\n') ) {s = 23;}

                        else if ( (LA18_0==' ') ) {s = 24;}

                        else if ( (LA18_0=='\t') ) {s = 25;}

                        else if ( (LA18_0=='\f') ) {s = 26;}

                        else if ( (LA18_0=='*') ) {s = 27;}

                        else if ( (LA18_0==';') ) {s = 28;}

                        else if ( (LA18_0=='\"') ) {s = 29;}

                        else if ( ((LA18_0>='0' && LA18_0<='1')) ) {s = 30;}

                        else if ( (LA18_0=='r') ) {s = 31;}

                        else if ( (LA18_0=='u') ) {s = 32;}

                        else if ( ((LA18_0>='2' && LA18_0<='9')) ) {s = 33;}

                        else if ( ((LA18_0>='b' && LA18_0<='c')||LA18_0=='e'||LA18_0=='g'||LA18_0=='j'||LA18_0=='l'||LA18_0=='q'||(LA18_0>='v' && LA18_0<='x')) ) {s = 34;}

                        else if ( (LA18_0=='.') ) {s = 36;}

                        else if ( ((LA18_0>='A' && LA18_0<='B')||(LA18_0>='D' && LA18_0<='G')||(LA18_0>='J' && LA18_0<='Z')) ) {s = 37;}

                        else if ( (LA18_0=='_') ) {s = 38;}

                        else if ( (LA18_0==':') ) {s = 39;}

                        else if ( (LA18_0=='%') ) {s = 40;}

                        else if ( ((LA18_0>='\u0000' && LA18_0<='\b')||LA18_0=='\u000B'||(LA18_0>='\u000E' && LA18_0<='\u001F')||LA18_0=='!'||LA18_0=='$'||(LA18_0>='&' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='-')||(LA18_0>='<' && LA18_0<='@')||(LA18_0>='[' && LA18_0<='^')||LA18_0=='`'||LA18_0=='|'||(LA18_0>='~' && LA18_0<='\uFFFF')) ) {s = 41;}

                        else s = 35;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 18, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-20 14:46:14

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
    public static final int IP6_VALID_CHAR=46;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int YES_OR_NO_WORD=24;
    public static final int DOUBLE_QUOTE=42;
    public static final int ST_ZONE_MASTER=4;
    public static final int ST_ZONE_FORWARD=8;
    public static final int UNLIMITED_WORD=19;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int ALPHANUM_NONSTD=15;
    public static final int ST_ZONE_SLAVE=5;
    public static final int ASTERISK=28;
    public static final int NOTIFY_WORD=21;
    public static final int ST_ZONE_DELEGATION=9;
    public static final int ST_ZONE_STUB=7;
    public static final int PERL_COMMENT=36;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int ANY_ASCII_ALPHANUM=45;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int CPP_COMMENT=35;
    public static final int DIGIT=44;
    public static final int NL=38;
    public static final int COMMENT=37;
    public static final int T__50=50;
    public static final int ONE_LINE_DOUBLE_QUOTED_STRING=33;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int ST_TESTING_PLIST=12;
    public static final int T__49=49;
    public static final int NUMBER=16;
    public static final int ST_TESTING=11;
    public static final int SEMICOLON=32;
    public static final int THREE_DIGIT_NUMBER=43;
    public static final int PLIST_PARAM=13;
    public static final int NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD=22;
    public static final int ST_ZONE_HINT=6;
    public static final int DEFAULT_WORD=20;
    public static final int T__71=71;
    public static final int WS=41;
    public static final int T__72=72;
    public static final int KMG_NUMBER=17;
    public static final int ZERO_OR_ONE_WORD=23;
    public static final int T__70=70;
    public static final int BAD=14;
    public static final int IP4_ADDR=26;
    public static final int IP6_ADDR=27;
    public static final int RANGE_WORD=18;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int CR=39;
    public static final int T__74=74;
    public static final int C_COMMENT=34;
    public static final int T__73=73;
    public static final int IP4_SHORT_3=30;
    public static final int T__79=79;
    public static final int FORWARD_SLASH=31;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int TRUE_OR_FALSE_WORD=25;
    public static final int IP4_SHORT_2=29;
    public static final int LF=40;

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

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
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
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
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
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
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
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
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
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
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
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
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
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
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
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
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
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
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
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
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
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
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
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
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
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
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
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
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
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
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
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:98:7: ( '.' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:98:9: '.'
            {
            match('.'); if (state.failed) return ;

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

    // $ANTLR start "ALPHANUM_NONSTD"
    public final void mALPHANUM_NONSTD() throws RecognitionException {
        try {
            int _type = ALPHANUM_NONSTD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:443:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:443:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:443:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')||(LA14_0>='A' && LA14_0<='Z')||LA14_0=='_'||(LA14_0>='a' && LA14_0<='z')) ) {
                    alt14=1;
                }


                switch (alt14) {
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
            	    break loop14;
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:447:2: ( ( '\\u0020' .. '\\u007F' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:447:4: ( '\\u0020' .. '\\u007F' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:447:4: ( '\\u0020' .. '\\u007F' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:447:5: '\\u0020' .. '\\u007F'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:9: ( ( IP6_VALID_CHAR )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:11: ( IP6_VALID_CHAR )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:11: ( IP6_VALID_CHAR )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0=='%'||(LA15_0>='0' && LA15_0<=':')||(LA15_0>='A' && LA15_0<='Z')||(LA15_0>='a' && LA15_0<='z')) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:12: IP6_VALID_CHAR
            	    {
            	    mIP6_VALID_CHAR(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:2: ( ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:4: ( ( 'a' .. 'z' ) | ( 'A' .. 'Z' ) | ':' | '%' | ( '0' .. '9' ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=6;
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
                    alt16=1;
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
                    alt16=2;
                    }
                    break;
                case ':':
                    {
                    alt16=3;
                    }
                    break;
                case '%':
                    {
                    alt16=4;
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
                    alt16=5;
                    }
                    break;

                }

                switch (alt16) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:5: ( 'a' .. 'z' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:5: ( 'a' .. 'z' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:6: 'a' .. 'z'
            	    {
            	    matchRange('a','z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 2 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:16: ( 'A' .. 'Z' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:16: ( 'A' .. 'Z' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:17: 'A' .. 'Z'
            	    {
            	    matchRange('A','Z'); if (state.failed) return ;

            	    }


            	    }
            	    break;
            	case 3 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:27: ':'
            	    {
            	    match(':'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:31: '%'
            	    {
            	    match('%'); if (state.failed) return ;

            	    }
            	    break;
            	case 5 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:35: ( '0' .. '9' )
            	    {
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:35: ( '0' .. '9' )
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:36: '0' .. '9'
            	    {
            	    matchRange('0','9'); if (state.failed) return ;

            	    }


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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:457:6: ( . )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:457:8: .
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
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:8: ( T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | COMMENT | CR | LF | WS | ASTERISK | FORWARD_SLASH | SEMICOLON | DOUBLE_QUOTE | ONE_LINE_DOUBLE_QUOTED_STRING | YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD | NOTIFY_WORD | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD | IP4_ADDR | IP4_SHORT_3 | IP4_SHORT_2 | NUMBER | KMG_NUMBER | ALPHANUM_NONSTD | IP6_ADDR | BAD )
        int alt17=58;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:10: T__47
                {
                mT__47(); if (state.failed) return ;

                }
                break;
            case 2 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:16: T__48
                {
                mT__48(); if (state.failed) return ;

                }
                break;
            case 3 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:22: T__49
                {
                mT__49(); if (state.failed) return ;

                }
                break;
            case 4 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:28: T__50
                {
                mT__50(); if (state.failed) return ;

                }
                break;
            case 5 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:34: T__51
                {
                mT__51(); if (state.failed) return ;

                }
                break;
            case 6 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:40: T__52
                {
                mT__52(); if (state.failed) return ;

                }
                break;
            case 7 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:46: T__53
                {
                mT__53(); if (state.failed) return ;

                }
                break;
            case 8 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:52: T__54
                {
                mT__54(); if (state.failed) return ;

                }
                break;
            case 9 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:58: T__55
                {
                mT__55(); if (state.failed) return ;

                }
                break;
            case 10 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:64: T__56
                {
                mT__56(); if (state.failed) return ;

                }
                break;
            case 11 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:70: T__57
                {
                mT__57(); if (state.failed) return ;

                }
                break;
            case 12 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:76: T__58
                {
                mT__58(); if (state.failed) return ;

                }
                break;
            case 13 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:82: T__59
                {
                mT__59(); if (state.failed) return ;

                }
                break;
            case 14 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:88: T__60
                {
                mT__60(); if (state.failed) return ;

                }
                break;
            case 15 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:94: T__61
                {
                mT__61(); if (state.failed) return ;

                }
                break;
            case 16 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:100: T__62
                {
                mT__62(); if (state.failed) return ;

                }
                break;
            case 17 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:106: T__63
                {
                mT__63(); if (state.failed) return ;

                }
                break;
            case 18 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:112: T__64
                {
                mT__64(); if (state.failed) return ;

                }
                break;
            case 19 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:118: T__65
                {
                mT__65(); if (state.failed) return ;

                }
                break;
            case 20 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:124: T__66
                {
                mT__66(); if (state.failed) return ;

                }
                break;
            case 21 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:130: T__67
                {
                mT__67(); if (state.failed) return ;

                }
                break;
            case 22 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:136: T__68
                {
                mT__68(); if (state.failed) return ;

                }
                break;
            case 23 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:142: T__69
                {
                mT__69(); if (state.failed) return ;

                }
                break;
            case 24 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:148: T__70
                {
                mT__70(); if (state.failed) return ;

                }
                break;
            case 25 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:154: T__71
                {
                mT__71(); if (state.failed) return ;

                }
                break;
            case 26 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:160: T__72
                {
                mT__72(); if (state.failed) return ;

                }
                break;
            case 27 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:166: T__73
                {
                mT__73(); if (state.failed) return ;

                }
                break;
            case 28 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:172: T__74
                {
                mT__74(); if (state.failed) return ;

                }
                break;
            case 29 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:178: T__75
                {
                mT__75(); if (state.failed) return ;

                }
                break;
            case 30 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:184: T__76
                {
                mT__76(); if (state.failed) return ;

                }
                break;
            case 31 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:190: T__77
                {
                mT__77(); if (state.failed) return ;

                }
                break;
            case 32 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:196: T__78
                {
                mT__78(); if (state.failed) return ;

                }
                break;
            case 33 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:202: T__79
                {
                mT__79(); if (state.failed) return ;

                }
                break;
            case 34 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:208: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 35 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:216: CR
                {
                mCR(); if (state.failed) return ;

                }
                break;
            case 36 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:219: LF
                {
                mLF(); if (state.failed) return ;

                }
                break;
            case 37 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:222: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 38 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:225: ASTERISK
                {
                mASTERISK(); if (state.failed) return ;

                }
                break;
            case 39 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:234: FORWARD_SLASH
                {
                mFORWARD_SLASH(); if (state.failed) return ;

                }
                break;
            case 40 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:248: SEMICOLON
                {
                mSEMICOLON(); if (state.failed) return ;

                }
                break;
            case 41 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:258: DOUBLE_QUOTE
                {
                mDOUBLE_QUOTE(); if (state.failed) return ;

                }
                break;
            case 42 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:271: ONE_LINE_DOUBLE_QUOTED_STRING
                {
                mONE_LINE_DOUBLE_QUOTED_STRING(); if (state.failed) return ;

                }
                break;
            case 43 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:301: YES_OR_NO_WORD
                {
                mYES_OR_NO_WORD(); if (state.failed) return ;

                }
                break;
            case 44 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:316: TRUE_OR_FALSE_WORD
                {
                mTRUE_OR_FALSE_WORD(); if (state.failed) return ;

                }
                break;
            case 45 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:335: ZERO_OR_ONE_WORD
                {
                mZERO_OR_ONE_WORD(); if (state.failed) return ;

                }
                break;
            case 46 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:352: RANGE_WORD
                {
                mRANGE_WORD(); if (state.failed) return ;

                }
                break;
            case 47 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:363: UNLIMITED_WORD
                {
                mUNLIMITED_WORD(); if (state.failed) return ;

                }
                break;
            case 48 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:378: DEFAULT_WORD
                {
                mDEFAULT_WORD(); if (state.failed) return ;

                }
                break;
            case 49 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:391: NOTIFY_WORD
                {
                mNOTIFY_WORD(); if (state.failed) return ;

                }
                break;
            case 50 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:403: NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD
                {
                mNOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD(); if (state.failed) return ;

                }
                break;
            case 51 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:444: IP4_ADDR
                {
                mIP4_ADDR(); if (state.failed) return ;

                }
                break;
            case 52 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:453: IP4_SHORT_3
                {
                mIP4_SHORT_3(); if (state.failed) return ;

                }
                break;
            case 53 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:465: IP4_SHORT_2
                {
                mIP4_SHORT_2(); if (state.failed) return ;

                }
                break;
            case 54 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:477: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 55 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:484: KMG_NUMBER
                {
                mKMG_NUMBER(); if (state.failed) return ;

                }
                break;
            case 56 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:495: ALPHANUM_NONSTD
                {
                mALPHANUM_NONSTD(); if (state.failed) return ;

                }
                break;
            case 57 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:511: IP6_ADDR
                {
                mIP6_ADDR(); if (state.failed) return ;

                }
                break;
            case 58 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:520: BAD
                {
                mBAD(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Bind9Config
    public final void synpred1_Bind9Config_fragment() throws RecognitionException {   
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:29: (~ '*' | '*' ~ '/' )
        int alt18=2;
        int LA18_0 = input.LA(1);

        if ( ((LA18_0>='\u0000' && LA18_0<=')')||(LA18_0>='+' && LA18_0<='\uFFFF')) ) {
            alt18=1;
        }
        else if ( (LA18_0=='*') ) {
            alt18=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 18, 0, input);

            throw nvae;
        }
        switch (alt18) {
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
        int alt19=2;
        int LA19_0 = input.LA(1);

        if ( (LA19_0=='\r') ) {
            alt19=1;
        }
        switch (alt19) {
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


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\5\44\2\uffff\15\44\1\uffff\1\115\1\51\1\117\1\120\5\uffff\1\123"+
        "\1\125\2\44\1\135\1\44\1\uffff\1\44\4\uffff\3\44\1\uffff\1\44\1"+
        "\137\1\140\1\44\2\uffff\20\44\1\166\2\44\1\172\3\44\13\uffff\1\135"+
        "\1\uffff\2\u0081\3\44\1\uffff\1\44\2\uffff\22\44\1\u0098\1\u0099"+
        "\1\44\1\uffff\3\44\1\uffff\3\44\1\172\1\135\1\u00a3\1\uffff\3\44"+
        "\1\u00a9\4\44\1\u00ae\1\u00af\1\44\1\u00b1\2\44\1\u00b4\1\44\1\u00b6"+
        "\5\44\2\uffff\10\44\1\135\2\uffff\1\u00a3\3\44\1\uffff\1\u00cb\1"+
        "\44\1\u00cd\1\u00b1\2\uffff\1\44\1\uffff\1\44\1\u00d0\1\uffff\1"+
        "\44\1\uffff\17\44\1\u00e1\1\u00a3\1\u00e4\2\44\1\uffff\1\44\1\uffff"+
        "\1\44\1\u00e9\1\uffff\10\44\1\u00f2\1\44\1\u00f4\1\u00f6\4\44\2"+
        "\uffff\1\u00e1\1\uffff\2\44\1\u00fe\1\u00ff\1\uffff\2\44\1\u0102"+
        "\3\44\1\u0106\1\44\1\uffff\1\44\3\uffff\1\44\1\u00f5\2\44\1\u00e1"+
        "\1\u00f5\1\44\2\uffff\2\44\1\uffff\2\44\1\u0111\1\uffff\1\44\1\u0113"+
        "\4\44\1\u0118\3\44\1\uffff\1\u011c\1\uffff\1\u011d\1\u011e\1\u011f"+
        "\1\u0120\1\uffff\3\44\6\uffff\1\u0124\1\44\1\uffff\17\44\1\u0136"+
        "\1\44\1\uffff\1\44\1\u0139\1\uffff";
    static final String DFA17_eofS =
        "\u013a\uffff";
    static final String DFA17_minS =
        "\1\0\4\45\2\uffff\15\45\1\uffff\1\52\1\0\2\11\5\uffff\1\0\5\45"+
        "\1\uffff\1\45\4\uffff\3\45\1\uffff\4\45\2\uffff\27\45\13\uffff\1"+
        "\45\1\60\5\45\1\uffff\1\45\2\uffff\24\45\1\160\1\uffff\3\45\1\uffff"+
        "\5\45\1\56\1\uffff\25\45\1\156\2\uffff\1\157\1\151\5\45\1\157\1"+
        "\45\1\uffff\1\60\1\56\3\45\1\uffff\4\45\2\uffff\1\45\1\uffff\2\45"+
        "\1\uffff\1\163\1\uffff\4\45\1\141\1\162\1\145\1\144\1\151\2\45\1"+
        "\156\1\45\1\154\1\162\2\56\3\45\1\uffff\1\45\1\uffff\2\45\1\uffff"+
        "\1\160\4\45\1\155\1\164\1\146\1\60\1\163\2\45\1\141\1\45\1\151\1"+
        "\137\2\uffff\1\56\1\uffff\4\45\1\uffff\1\145\2\45\1\156\1\157\1"+
        "\145\1\60\1\151\1\uffff\1\164\3\uffff\1\155\1\45\1\163\1\156\1\56"+
        "\2\45\2\uffff\1\143\1\45\1\uffff\1\141\1\160\1\60\1\uffff\1\170"+
        "\1\60\1\145\1\164\1\157\1\45\1\60\1\45\1\155\1\164\1\uffff\1\60"+
        "\1\uffff\3\60\1\45\1\uffff\1\45\1\145\1\151\6\uffff\1\60\1\157\1"+
        "\uffff\1\156\1\137\1\144\1\145\1\154\1\146\2\141\1\166\1\165\1\145"+
        "\1\154\1\163\2\164\1\60\1\165\1\uffff\1\142\1\60\1\uffff";
    static final String DFA17_maxS =
        "\1\uffff\4\172\2\uffff\15\172\1\uffff\1\57\1\uffff\2\40\5\uffff"+
        "\1\uffff\5\172\1\uffff\1\172\4\uffff\3\172\1\uffff\4\172\2\uffff"+
        "\27\172\13\uffff\1\172\1\71\5\172\1\uffff\1\172\2\uffff\24\172\1"+
        "\160\1\uffff\3\172\1\uffff\5\172\1\71\1\uffff\25\172\1\156\2\uffff"+
        "\1\162\1\154\5\172\1\157\1\172\1\uffff\2\71\3\172\1\uffff\4\172"+
        "\2\uffff\1\172\1\uffff\2\172\1\uffff\1\163\1\uffff\4\172\1\141\1"+
        "\162\1\145\1\144\1\151\2\172\1\156\1\172\1\154\1\162\1\71\1\56\3"+
        "\172\1\uffff\1\172\1\uffff\2\172\1\uffff\1\160\4\172\1\155\1\164"+
        "\1\146\1\172\1\163\2\172\1\141\1\172\1\151\1\137\2\uffff\1\71\1"+
        "\uffff\4\172\1\uffff\1\145\2\172\1\156\1\157\1\145\1\172\1\151\1"+
        "\uffff\1\164\3\uffff\1\155\1\172\1\163\1\156\1\56\2\172\2\uffff"+
        "\1\143\1\172\1\uffff\1\141\1\160\1\172\1\uffff\1\170\1\172\1\145"+
        "\1\164\1\157\3\172\1\155\1\164\1\uffff\1\172\1\uffff\4\172\1\uffff"+
        "\1\172\1\145\1\151\6\uffff\1\172\1\157\1\uffff\1\156\1\137\1\163"+
        "\1\145\1\154\1\146\2\141\1\166\1\165\1\145\1\154\1\163\2\164\1\172"+
        "\1\165\1\uffff\1\142\1\172\1\uffff";
    static final String DFA17_acceptS =
        "\5\uffff\1\5\1\6\15\uffff\1\41\4\uffff\3\45\1\46\1\50\6\uffff\1"+
        "\70\1\uffff\1\70\2\71\1\72\3\uffff\1\71\4\uffff\1\5\1\6\27\uffff"+
        "\1\41\1\42\1\47\1\45\1\43\1\44\1\46\1\50\1\51\1\52\1\55\7\uffff"+
        "\1\66\1\uffff\1\2\1\3\25\uffff\1\25\3\uffff\1\53\6\uffff\1\67\26"+
        "\uffff\1\23\1\24\11\uffff\1\65\5\uffff\1\1\4\uffff\1\11\1\12\1\uffff"+
        "\1\54\2\uffff\1\15\1\uffff\1\16\24\uffff\1\4\1\uffff\1\10\2\uffff"+
        "\1\14\20\uffff\1\64\1\63\1\uffff\1\56\4\uffff\1\13\10\uffff\1\30"+
        "\1\uffff\1\32\1\62\1\61\7\uffff\1\7\1\20\2\uffff\1\60\3\uffff\1"+
        "\26\12\uffff\1\21\1\uffff\1\31\4\uffff\1\35\3\uffff\1\27\1\33\1"+
        "\34\1\36\1\57\1\17\2\uffff\1\22\21\uffff\1\37\2\uffff\1\40";
    static final String DFA17_specialS =
        "\1\2\25\uffff\1\1\7\uffff\1\0\u011b\uffff}>";
    static final String[] DFA17_transitionS = {
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
            "\3\53\1\102\5\53\1\101\13\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\2\53\1\103"+
            "\27\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\17\53\1\104"+
            "\12\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\105"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\16\53\1\107"+
            "\5\53\1\106\5\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\110\15\53"+
            "\1\111\13\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\112"+
            "\25\53",
            "",
            "\1\114\4\uffff\1\114",
            "\0\114",
            "\2\116\1\uffff\2\116\22\uffff\1\116",
            "\2\116\1\uffff\2\116\22\uffff\1\116",
            "",
            "",
            "",
            "",
            "",
            "\12\124\1\uffff\2\124\1\uffff\ufff2\124",
            "\1\55\10\uffff\1\127\1\uffff\12\126\1\55\6\uffff\6\54\1\131"+
            "\3\54\1\131\1\54\1\131\15\54\4\uffff\1\44\1\uffff\6\53\1\130"+
            "\3\53\1\130\1\53\1\130\15\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\132\3\53"+
            "\1\133\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\134"+
            "\14\53",
            "\1\55\10\uffff\1\127\1\uffff\12\126\1\55\6\uffff\6\54\1\131"+
            "\3\54\1\131\1\54\1\131\15\54\4\uffff\1\44\1\uffff\6\53\1\130"+
            "\3\53\1\130\1\53\1\130\15\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\32\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\32\53",
            "",
            "",
            "",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\136"+
            "\14\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\32\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\1\141\31\54\6\uffff\32\53",
            "",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\142"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\143"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\144"+
            "\16\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\145"+
            "\16\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\17\53\1\146"+
            "\12\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\147"+
            "\7\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\24\53\1\150"+
            "\5\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\151"+
            "\7\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\152\31\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\24\53\1\153"+
            "\5\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\31\53\1\154",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\155"+
            "\14\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\5\53\1\157"+
            "\5\53\1\156\16\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\14\53\1\160"+
            "\15\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\161\31\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\162"+
            "\16\53",
            "\1\55\12\uffff\4\56\1\163\1\56\1\164\3\56\1\55\6\uffff\32"+
            "\54\4\uffff\1\165\1\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\30\53\1\167"+
            "\1\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\14\53\1\170"+
            "\15\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\23\53\1\171\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\174"+
            "\1\173\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\175"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\176"+
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
            "",
            "\1\55\10\uffff\1\127\1\uffff\12\177\1\55\6\uffff\6\54\1\131"+
            "\3\54\1\131\1\54\1\131\15\54\4\uffff\1\44\1\uffff\6\53\1\130"+
            "\3\53\1\130\1\53\1\130\15\53",
            "\12\u0080",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\u0082"+
            "\14\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\5\53\1\u0083"+
            "\24\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\u0084"+
            "\16\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u0085"+
            "\25\53",
            "",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\16\54\1\u0086\13\54\6\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\26\53\1\u0087"+
            "\3\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\u0088"+
            "\7\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\u0089"+
            "\7\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\30\53\1\u008a"+
            "\1\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u008b"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u008c"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u008d"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u008e"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\25\53\1\u008f"+
            "\4\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\53\1\u0090"+
            "\30\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u0091"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u0092"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u0093"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\u0094\31"+
            "\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\u0095\31"+
            "\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\u0096"+
            "\16\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u0097\1"+
            "\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\u009a",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u009b\1"+
            "\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\53\1\u009c"+
            "\30\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u009d"+
            "\21\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\7\53\1\u009e"+
            "\22\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\u009f"+
            "\7\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u00a0"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u00a1\1"+
            "\uffff\32\53",
            "\1\55\10\uffff\1\127\1\uffff\12\u00a2\1\55\6\uffff\6\54\1"+
            "\131\3\54\1\131\1\54\1\131\15\54\4\uffff\1\44\1\uffff\6\53\1"+
            "\130\3\53\1\130\1\53\1\130\15\53",
            "\1\u00a4\1\uffff\12\u00a5",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\6\53\1\u00a6"+
            "\23\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\u00a7"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u00a8"+
            "\21\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\22\54\1\u00aa\7\54\6\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\u00ab\31"+
            "\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u00ac"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00ad"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u00b0"+
            "\21\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00b2"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00b3"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u00b5\1"+
            "\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\6\53\1\u00b7"+
            "\23\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\24\53\1\u00b8"+
            "\5\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u00b9"+
            "\21\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\24\53\1\u00ba"+
            "\5\53",
            "\1\u00bb",
            "",
            "",
            "\1\u00bc\2\uffff\1\u00bd",
            "\1\u00be\2\uffff\1\u00bf",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00c0"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\5\53\1\u00c1"+
            "\24\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u00c2\1"+
            "\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u00c3"+
            "\21\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u00c4\1"+
            "\uffff\32\53",
            "\1\u00c5",
            "\1\55\12\uffff\12\u00a2\1\55\6\uffff\6\54\1\131\3\54\1\131"+
            "\1\54\1\131\15\54\4\uffff\1\44\1\uffff\6\53\1\130\3\53\1\130"+
            "\1\53\1\130\15\53",
            "",
            "\12\u00c6",
            "\1\u00a4\1\uffff\12\u00c7",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00c8"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00c9"+
            "\25\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\14\53\1\u00ca"+
            "\15\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\u00cc"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\u00ce"+
            "\14\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\u00cf"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "",
            "\1\u00d1",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\1\u00d2\31"+
            "\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\13\53\1\u00d3"+
            "\16\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\u00d4"+
            "\14\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\17\53\1\u00d5"+
            "\12\53",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\21\53\1\u00db"+
            "\10\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\30\53\1\u00dc"+
            "\1\53",
            "\1\u00dd",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\25\53\1\u00de"+
            "\4\53",
            "\1\u00df",
            "\1\u00e0",
            "\1\u00e2\1\uffff\12\u00e3",
            "\1\u00a4",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\22\53\1\u00e5"+
            "\7\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u00e6"+
            "\21\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\3\53\1\u00e7"+
            "\26\53",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\6\53\1\u00e8"+
            "\23\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "",
            "\1\u00ea",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u00eb"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u00ec"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u00ed\1"+
            "\uffff\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\u00ee\1"+
            "\uffff\32\53",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u00f3",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\7\uffff\1\u00f5\2\uffff\12\56\1\55\6\uffff\32\54\4\uffff"+
            "\1\44\1\uffff\32\53",
            "\1\u00f7",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u00f8"+
            "\25\53",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "",
            "\1\u00e2\1\uffff\12\u00fb",
            "",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\7\53\1\u00fc"+
            "\22\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\23\53\1\u00fd"+
            "\6\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "",
            "\1\u0100",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\10\53\1\u0101"+
            "\21\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0107",
            "",
            "\1\u0108",
            "",
            "",
            "",
            "\1\u0109",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\u010a",
            "\1\u010b",
            "\1\u00e2",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\4\53\1\u010c"+
            "\25\53",
            "",
            "",
            "\1\u010d",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\16\53\1\u010e"+
            "\13\53",
            "",
            "\1\u010f",
            "\1\u0110",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\1\u0112",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0114",
            "\1\u0115",
            "\1\u0116",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\3\53\1\u0117"+
            "\26\53",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\6\uffff\15\53\1\u0119"+
            "\14\53",
            "\1\u011a",
            "\1\u011b",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\55\12\uffff\12\56\1\55\6\uffff\32\54\4\uffff\1\44\1\uffff"+
            "\32\53",
            "",
            "\1\55\7\uffff\1\u0121\2\uffff\12\56\1\55\6\uffff\32\54\6\uffff"+
            "\32\53",
            "\1\u0122",
            "\1\u0123",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0125",
            "",
            "\1\u0126",
            "\1\u0127",
            "\1\u0128\16\uffff\1\u0129",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\1\u0135",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            "\1\u0137",
            "",
            "\1\u0138",
            "\12\44\7\uffff\32\44\4\uffff\1\44\1\uffff\32\44",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | COMMENT | CR | LF | WS | ASTERISK | FORWARD_SLASH | SEMICOLON | DOUBLE_QUOTE | ONE_LINE_DOUBLE_QUOTED_STRING | YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD | NOTIFY_WORD | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD | IP4_ADDR | IP4_SHORT_3 | IP4_SHORT_2 | NUMBER | KMG_NUMBER | ALPHANUM_NONSTD | IP6_ADDR | BAD );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_30 = input.LA(1);

                        s = -1;
                        if ( ((LA17_30>='\u0000' && LA17_30<='\t')||(LA17_30>='\u000B' && LA17_30<='\f')||(LA17_30>='\u000E' && LA17_30<='\uFFFF')) ) {s = 84;}

                        else s = 83;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_22 = input.LA(1);

                        s = -1;
                        if ( ((LA17_22>='\u0000' && LA17_22<='\uFFFF')) ) {s = 76;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='z') ) {s = 1;}

                        else if ( (LA17_0=='I') ) {s = 2;}

                        else if ( (LA17_0=='H') ) {s = 3;}

                        else if ( (LA17_0=='C') ) {s = 4;}

                        else if ( (LA17_0=='{') ) {s = 5;}

                        else if ( (LA17_0=='}') ) {s = 6;}

                        else if ( (LA17_0=='f') ) {s = 7;}

                        else if ( (LA17_0=='o') ) {s = 8;}

                        else if ( (LA17_0=='t') ) {s = 9;}

                        else if ( (LA17_0=='m') ) {s = 10;}

                        else if ( (LA17_0=='s') ) {s = 11;}

                        else if ( (LA17_0=='h') ) {s = 12;}

                        else if ( (LA17_0=='d') ) {s = 13;}

                        else if ( (LA17_0=='a') ) {s = 14;}

                        else if ( (LA17_0=='i') ) {s = 15;}

                        else if ( (LA17_0=='k') ) {s = 16;}

                        else if ( (LA17_0=='n') ) {s = 17;}

                        else if ( (LA17_0=='p') ) {s = 18;}

                        else if ( (LA17_0=='y') ) {s = 19;}

                        else if ( (LA17_0=='.') ) {s = 20;}

                        else if ( (LA17_0=='/') ) {s = 21;}

                        else if ( (LA17_0=='#') ) {s = 22;}

                        else if ( (LA17_0=='\r') ) {s = 23;}

                        else if ( (LA17_0=='\n') ) {s = 24;}

                        else if ( (LA17_0==' ') ) {s = 25;}

                        else if ( (LA17_0=='\t') ) {s = 26;}

                        else if ( (LA17_0=='\f') ) {s = 27;}

                        else if ( (LA17_0=='*') ) {s = 28;}

                        else if ( (LA17_0==';') ) {s = 29;}

                        else if ( (LA17_0=='\"') ) {s = 30;}

                        else if ( ((LA17_0>='0' && LA17_0<='1')) ) {s = 31;}

                        else if ( (LA17_0=='r') ) {s = 32;}

                        else if ( (LA17_0=='u') ) {s = 33;}

                        else if ( ((LA17_0>='2' && LA17_0<='9')) ) {s = 34;}

                        else if ( ((LA17_0>='b' && LA17_0<='c')||LA17_0=='e'||LA17_0=='g'||LA17_0=='j'||LA17_0=='l'||LA17_0=='q'||(LA17_0>='v' && LA17_0<='x')) ) {s = 35;}

                        else if ( ((LA17_0>='A' && LA17_0<='B')||(LA17_0>='D' && LA17_0<='G')||(LA17_0>='J' && LA17_0<='Z')) ) {s = 37;}

                        else if ( (LA17_0=='_') ) {s = 38;}

                        else if ( (LA17_0==':') ) {s = 39;}

                        else if ( (LA17_0=='%') ) {s = 40;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||LA17_0=='\u000B'||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||LA17_0=='$'||(LA17_0>='&' && LA17_0<=')')||(LA17_0>='+' && LA17_0<='-')||(LA17_0>='<' && LA17_0<='@')||(LA17_0>='[' && LA17_0<='^')||LA17_0=='`'||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 41;}

                        else s = 36;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
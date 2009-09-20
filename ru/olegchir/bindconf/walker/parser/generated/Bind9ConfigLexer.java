// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-20 17:37:34

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
    public static final int ST_ZONE_PLIST=10;
    public static final int DOUBLE_QUOTE=53;
    public static final int ST_ZONE_FORWARD=8;
    public static final int UNLIMITED_WORD=19;
    public static final int EOF=-1;
    public static final int ALPHANUM_NONSTD=15;
    public static final int ST_ZONE_DELEGATION=9;
    public static final int NOTIFY_WORD=21;
    public static final int T__93=93;
    public static final int T__94=94;
    public static final int T__91=91;
    public static final int T__92=92;
    public static final int T__90=90;
    public static final int IP6_IP4LINK_ADDR_BASE=38;
    public static final int ANY_ASCII_ALPHANUM=61;
    public static final int CPP_COMMENT=46;
    public static final int NL=49;
    public static final int COMMENT=48;
    public static final int IP6_IP4COMPAT_ADDR_BASE=37;
    public static final int ONE_LINE_DOUBLE_QUOTED_STRING=30;
    public static final int KEY_WORD=24;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int NUMBER=16;
    public static final int IP6_SHORTRIGHT_ADDR_BASE=35;
    public static final int SEMICOLON=29;
    public static final int T__85=85;
    public static final int T__84=84;
    public static final int T__87=87;
    public static final int T__86=86;
    public static final int T__89=89;
    public static final int T__88=88;
    public static final int FOUR_CHAR_HEXNUM=58;
    public static final int DEFAULT_WORD=20;
    public static final int DOMAIN_NAME=31;
    public static final int WS=52;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int DOUBLE_COLON=39;
    public static final int IP4_ADDR=32;
    public static final int IP6_NORM_ADDR_BASE=33;
    public static final int FFFF_WORD=25;
    public static final int RANGE_WORD=18;
    public static final int T__76=76;
    public static final int T__75=75;
    public static final int T__74=74;
    public static final int C_COMMENT=45;
    public static final int T__73=73;
    public static final int T__79=79;
    public static final int T__78=78;
    public static final int T__77=77;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int YES_OR_NO_WORD=27;
    public static final int ST_ZONE_MASTER=4;
    public static final int ST_ZONE_SLAVE=5;
    public static final int ASTERISK=41;
    public static final int ST_ZONE_STUB=7;
    public static final int PERL_COMMENT=47;
    public static final int IP6_SHORTMID_ADDR_BASE=36;
    public static final int DIGIT=57;
    public static final int DOT=55;
    public static final int PERCENT=40;
    public static final int IP6_SHORTLEFT_ADDR_BASE=34;
    public static final int ST_TESTING_PLIST=12;
    public static final int ST_TESTING=11;
    public static final int THREE_DIGIT_NUMBER=56;
    public static final int PLIST_PARAM=13;
    public static final int NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD=22;
    public static final int ST_ZONE_HINT=6;
    public static final int COLON=54;
    public static final int HEXNUM_CHAR=59;
    public static final int KMG_NUMBER=17;
    public static final int ZERO_OR_ONE_WORD=26;
    public static final int BAD=14;
    public static final int ALPHANUM_CHAR=60;
    public static final int PORT_WORD=23;
    public static final int CR=50;
    public static final int IP4_SHORT_3=43;
    public static final int FORWARD_SLASH=44;
    public static final int LF=51;
    public static final int IP4_SHORT_2=42;
    public static final int TRUE_OR_FALSE_WORD=28;

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

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
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
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
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
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
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
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
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
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
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
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
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
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
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
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
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
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
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
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
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
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
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
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
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
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
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
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
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
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
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
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
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
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
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
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
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
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
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
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
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
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
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
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
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
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
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
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
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
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
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
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
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
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
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
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
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
    // $ANTLR end "T__89"

    // $ANTLR start "T__90"
    public final void mT__90() throws RecognitionException {
        try {
            int _type = T__90;
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
    // $ANTLR end "T__90"

    // $ANTLR start "T__91"
    public final void mT__91() throws RecognitionException {
        try {
            int _type = T__91;
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
    // $ANTLR end "T__91"

    // $ANTLR start "T__92"
    public final void mT__92() throws RecognitionException {
        try {
            int _type = T__92;
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
    // $ANTLR end "T__92"

    // $ANTLR start "T__93"
    public final void mT__93() throws RecognitionException {
        try {
            int _type = T__93;
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
    // $ANTLR end "T__93"

    // $ANTLR start "T__94"
    public final void mT__94() throws RecognitionException {
        try {
            int _type = T__94;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:98:7: ( 'masters_list' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:98:9: 'masters_list'
            {
            match("masters_list"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__94"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:351:9: ( ( C_COMMENT | CPP_COMMENT | PERL_COMMENT ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:351:11: ( C_COMMENT | CPP_COMMENT | PERL_COMMENT )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:351:11: ( C_COMMENT | CPP_COMMENT | PERL_COMMENT )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:351:12: C_COMMENT
                    {
                    mC_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:351:24: CPP_COMMENT
                    {
                    mCPP_COMMENT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:351:38: PERL_COMMENT
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:353:20: ( '/*' ( (~ '*' | '*' ~ '/' )=> . )* '*/' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:353:22: '/*' ( (~ '*' | '*' ~ '/' )=> . )* '*/'
            {
            match("/*"); if (state.failed) return ;

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:353:27: ( (~ '*' | '*' ~ '/' )=> . )*
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:353:29: (~ '*' | '*' ~ '/' )=> .
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:356:2: ( '//' (~ ( '\\r' | '\\n' ) )* NL )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:356:4: '//' (~ ( '\\r' | '\\n' ) )* NL
            {
            match("//"); if (state.failed) return ;

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:356:9: (~ ( '\\r' | '\\n' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:356:10: ~ ( '\\r' | '\\n' )
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:359:2: ( '#' (~ ( '\\r' | '\\n' ) )* NL )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:359:4: '#' (~ ( '\\r' | '\\n' ) )* NL
            {
            match('#'); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:359:8: (~ ( '\\r' | '\\n' ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:359:9: ~ ( '\\r' | '\\n' )
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:363:4: ( '\\r' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:363:6: '\\r'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:365:4: ( '\\n' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:365:6: '\\n'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:368:4: ( ( ' ' | '\\t' | '\\f' | NL )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:368:6: ( ' ' | '\\t' | '\\f' | NL )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:368:6: ( ' ' | '\\t' | '\\f' | NL )+
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
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:368:7: ' '
            	    {
            	    match(' '); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:368:11: '\\t'
            	    {
            	    match('\t'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:368:16: '\\f'
            	    {
            	    match('\f'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:368:21: NL
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:372:2: ( ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:372:4: ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n'
                    {
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:372:19: ( '\\r' )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0=='\r') ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:372:19: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:373:6: '\\r'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:378:2: ( '*' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:378:4: '*'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:382:2: ( '/' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:382:4: '/'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:385:2: ( ';' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:385:4: ';'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:388:2: ( '\"' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:388:4: '\"'
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

    // $ANTLR start "DOUBLE_COLON"
    public final void mDOUBLE_COLON() throws RecognitionException {
        try {
            int _type = DOUBLE_COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:391:2: ( COLON COLON )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:391:4: COLON COLON
            {
            mCOLON(); if (state.failed) return ;
            mCOLON(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOUBLE_COLON"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:394:2: ( ':' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:394:4: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:396:5: ( '.' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:396:7: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "PERCENT"
    public final void mPERCENT() throws RecognitionException {
        try {
            int _type = PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:398:9: ( '%' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:398:11: '%'
            {
            match('%'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PERCENT"

    // $ANTLR start "ONE_LINE_DOUBLE_QUOTED_STRING"
    public final void mONE_LINE_DOUBLE_QUOTED_STRING() throws RecognitionException {
        try {
            int _type = ONE_LINE_DOUBLE_QUOTED_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:404:2: ( DOUBLE_QUOTE (~ ( CR | LF | DOUBLE_QUOTE ) )* DOUBLE_QUOTE )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:404:4: DOUBLE_QUOTE (~ ( CR | LF | DOUBLE_QUOTE ) )* DOUBLE_QUOTE
            {
            mDOUBLE_QUOTE(); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:404:17: (~ ( CR | LF | DOUBLE_QUOTE ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='!')||(LA8_0>='#' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:404:18: ~ ( CR | LF | DOUBLE_QUOTE )
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:409:2: ( ( 'yes' | 'no' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:409:4: ( 'yes' | 'no' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:409:4: ( 'yes' | 'no' )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:409:5: 'yes'
                    {
                    match("yes"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:409:11: 'no'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:2: ( ( 'true' | 'false' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:4: ( 'true' | 'false' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:4: ( 'true' | 'false' )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:5: 'true'
                    {
                    match("true"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:413:12: 'false'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:2: ( ( '0' | '1' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:417:4: ( '0' | '1' )
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:422:2: ( 'range' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:422:4: 'range'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:425:2: ( 'unlimited' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:425:4: 'unlimited'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:428:2: ( 'default' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:428:4: 'default'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:433:2: ( 'notify' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:433:4: 'notify'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:436:2: ( 'notify-passive' | 'refresh' | 'passive' )
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:436:4: 'notify-passive'
                    {
                    match("notify-passive"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:436:21: 'refresh'
                    {
                    match("refresh"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:436:31: 'passive'
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

    // $ANTLR start "PORT_WORD"
    public final void mPORT_WORD() throws RecognitionException {
        try {
            int _type = PORT_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:441:2: ( 'port' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:441:4: 'port'
            {
            match("port"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PORT_WORD"

    // $ANTLR start "KEY_WORD"
    public final void mKEY_WORD() throws RecognitionException {
        try {
            int _type = KEY_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:444:9: ( 'key' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:444:11: 'key'
            {
            match("key"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "KEY_WORD"

    // $ANTLR start "FFFF_WORD"
    public final void mFFFF_WORD() throws RecognitionException {
        try {
            int _type = FFFF_WORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:2: ( 'ffff' | 'FFFF' | 'fFFF' | 'ffFF' | 'fffF' | 'FFFf' | 'FFff' | 'Ffff' | 'fFFf' | 'FffF' )
            int alt12=10;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:4: 'ffff'
                    {
                    match("ffff"); if (state.failed) return ;


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:11: 'FFFF'
                    {
                    match("FFFF"); if (state.failed) return ;


                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:18: 'fFFF'
                    {
                    match("fFFF"); if (state.failed) return ;


                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:25: 'ffFF'
                    {
                    match("ffFF"); if (state.failed) return ;


                    }
                    break;
                case 5 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:32: 'fffF'
                    {
                    match("fffF"); if (state.failed) return ;


                    }
                    break;
                case 6 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:39: 'FFFf'
                    {
                    match("FFFf"); if (state.failed) return ;


                    }
                    break;
                case 7 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:46: 'FFff'
                    {
                    match("FFff"); if (state.failed) return ;


                    }
                    break;
                case 8 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:53: 'Ffff'
                    {
                    match("Ffff"); if (state.failed) return ;


                    }
                    break;
                case 9 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:60: 'fFFf'
                    {
                    match("fFFf"); if (state.failed) return ;


                    }
                    break;
                case 10 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:450:67: 'FffF'
                    {
                    match("FffF"); if (state.failed) return ;


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FFFF_WORD"

    // $ANTLR start "IP4_ADDR"
    public final void mIP4_ADDR() throws RecognitionException {
        try {
            int _type = IP4_ADDR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:9: ( THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:454:11: THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER
            {
            mTHREE_DIGIT_NUMBER(); if (state.failed) return ;
            mDOT(); if (state.failed) return ;
            mTHREE_DIGIT_NUMBER(); if (state.failed) return ;
            mDOT(); if (state.failed) return ;
            mTHREE_DIGIT_NUMBER(); if (state.failed) return ;
            mDOT(); if (state.failed) return ;
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:457:2: ( THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:457:4: THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER
            {
            mTHREE_DIGIT_NUMBER(); if (state.failed) return ;
            mDOT(); if (state.failed) return ;
            mTHREE_DIGIT_NUMBER(); if (state.failed) return ;
            mDOT(); if (state.failed) return ;
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:460:2: ( THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:460:4: THREE_DIGIT_NUMBER DOT THREE_DIGIT_NUMBER
            {
            mTHREE_DIGIT_NUMBER(); if (state.failed) return ;
            mDOT(); if (state.failed) return ;
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:463:2: ( DIGIT | DIGIT DIGIT | DIGIT DIGIT DIGIT )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>='0' && LA13_0<='9')) ) {
                int LA13_1 = input.LA(2);

                if ( ((LA13_1>='0' && LA13_1<='9')) ) {
                    int LA13_3 = input.LA(3);

                    if ( ((LA13_3>='0' && LA13_3<='9')) ) {
                        alt13=3;
                    }
                    else {
                        alt13=2;}
                }
                else {
                    alt13=1;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:463:4: DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:464:4: DIGIT DIGIT
                    {
                    mDIGIT(); if (state.failed) return ;
                    mDIGIT(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:465:4: DIGIT DIGIT DIGIT
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:469:8: ( ( DIGIT )+ )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:469:10: ( DIGIT )+
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:469:10: ( DIGIT )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>='0' && LA14_0<='9')) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:469:10: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:471:16: ( '0' .. '9' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:471:18: '0' .. '9'
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:474:2: ( NUMBER ( 'K' | 'k' | 'M' | 'm' | 'G' | 'g' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:474:4: NUMBER ( 'K' | 'k' | 'M' | 'm' | 'G' | 'g' )
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
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:477:2: ( ( ALPHANUM_NONSTD '.' )+ ALPHANUM_NONSTD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:477:4: ( ALPHANUM_NONSTD '.' )+ ALPHANUM_NONSTD
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:477:4: ( ALPHANUM_NONSTD '.' )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                alt15 = dfa15.predict(input);
                switch (alt15) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:477:5: ALPHANUM_NONSTD '.'
            	    {
            	    mALPHANUM_NONSTD(); if (state.failed) return ;
            	    match('.'); if (state.failed) return ;

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

            mALPHANUM_NONSTD(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DOMAIN_NAME"

    // $ANTLR start "IP6_NORM_ADDR_BASE"
    public final void mIP6_NORM_ADDR_BASE() throws RecognitionException {
        try {
            int _type = IP6_NORM_ADDR_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:481:2: ( FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:481:4: FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM COLON FOUR_CHAR_HEXNUM
            {
            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            mCOLON(); if (state.failed) return ;
            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            mCOLON(); if (state.failed) return ;
            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            mCOLON(); if (state.failed) return ;
            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            mCOLON(); if (state.failed) return ;
            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            mCOLON(); if (state.failed) return ;
            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            mCOLON(); if (state.failed) return ;
            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            mCOLON(); if (state.failed) return ;
            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP6_NORM_ADDR_BASE"

    // $ANTLR start "IP6_SHORTLEFT_ADDR_BASE"
    public final void mIP6_SHORTLEFT_ADDR_BASE() throws RecognitionException {
        try {
            int _type = IP6_SHORTLEFT_ADDR_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:492:2: ( DOUBLE_COLON ( FOUR_CHAR_HEXNUM COLON )* FOUR_CHAR_HEXNUM )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:492:4: DOUBLE_COLON ( FOUR_CHAR_HEXNUM COLON )* FOUR_CHAR_HEXNUM
            {
            mDOUBLE_COLON(); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:493:3: ( FOUR_CHAR_HEXNUM COLON )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='0' && LA16_0<='9')||(LA16_0>='A' && LA16_0<='F')||(LA16_0>='a' && LA16_0<='f')) ) {
                    int LA16_1 = input.LA(2);

                    if ( ((LA16_1>='0' && LA16_1<='9')||(LA16_1>='A' && LA16_1<='F')||(LA16_1>='a' && LA16_1<='f')) ) {
                        int LA16_3 = input.LA(3);

                        if ( ((LA16_3>='0' && LA16_3<='9')||(LA16_3>='A' && LA16_3<='F')||(LA16_3>='a' && LA16_3<='f')) ) {
                            int LA16_5 = input.LA(4);

                            if ( (LA16_5==':') ) {
                                alt16=1;
                            }
                            else if ( ((LA16_5>='0' && LA16_5<='9')||(LA16_5>='A' && LA16_5<='F')||(LA16_5>='a' && LA16_5<='f')) ) {
                                int LA16_6 = input.LA(5);

                                if ( (LA16_6==':') ) {
                                    alt16=1;
                                }


                            }


                        }
                        else if ( (LA16_3==':') ) {
                            alt16=1;
                        }


                    }
                    else if ( (LA16_1==':') ) {
                        alt16=1;
                    }


                }


                switch (alt16) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:493:4: FOUR_CHAR_HEXNUM COLON
            	    {
            	    mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            	    mCOLON(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP6_SHORTLEFT_ADDR_BASE"

    // $ANTLR start "IP6_SHORTRIGHT_ADDR_BASE"
    public final void mIP6_SHORTRIGHT_ADDR_BASE() throws RecognitionException {
        try {
            int _type = IP6_SHORTRIGHT_ADDR_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:497:2: ( FOUR_CHAR_HEXNUM ( FOUR_CHAR_HEXNUM COLON )* DOUBLE_COLON )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:497:4: FOUR_CHAR_HEXNUM ( FOUR_CHAR_HEXNUM COLON )* DOUBLE_COLON
            {
            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:498:3: ( FOUR_CHAR_HEXNUM COLON )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>='0' && LA17_0<='9')||(LA17_0>='A' && LA17_0<='F')||(LA17_0>='a' && LA17_0<='f')) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:498:4: FOUR_CHAR_HEXNUM COLON
            	    {
            	    mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            	    mCOLON(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            mDOUBLE_COLON(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP6_SHORTRIGHT_ADDR_BASE"

    // $ANTLR start "IP6_SHORTMID_ADDR_BASE"
    public final void mIP6_SHORTMID_ADDR_BASE() throws RecognitionException {
        try {
            int _type = IP6_SHORTMID_ADDR_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:502:2: ( FOUR_CHAR_HEXNUM ( COLON FOUR_CHAR_HEXNUM )* DOUBLE_COLON ( FOUR_CHAR_HEXNUM COLON )* FOUR_CHAR_HEXNUM )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:502:4: FOUR_CHAR_HEXNUM ( COLON FOUR_CHAR_HEXNUM )* DOUBLE_COLON ( FOUR_CHAR_HEXNUM COLON )* FOUR_CHAR_HEXNUM
            {
            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:503:3: ( COLON FOUR_CHAR_HEXNUM )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==':') ) {
                    int LA18_1 = input.LA(2);

                    if ( ((LA18_1>='0' && LA18_1<='9')||(LA18_1>='A' && LA18_1<='F')||(LA18_1>='a' && LA18_1<='f')) ) {
                        alt18=1;
                    }


                }


                switch (alt18) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:503:4: COLON FOUR_CHAR_HEXNUM
            	    {
            	    mCOLON(); if (state.failed) return ;
            	    mFOUR_CHAR_HEXNUM(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            mDOUBLE_COLON(); if (state.failed) return ;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:505:3: ( FOUR_CHAR_HEXNUM COLON )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>='0' && LA19_0<='9')||(LA19_0>='A' && LA19_0<='F')||(LA19_0>='a' && LA19_0<='f')) ) {
                    int LA19_1 = input.LA(2);

                    if ( ((LA19_1>='0' && LA19_1<='9')||(LA19_1>='A' && LA19_1<='F')||(LA19_1>='a' && LA19_1<='f')) ) {
                        int LA19_3 = input.LA(3);

                        if ( (LA19_3==':') ) {
                            alt19=1;
                        }
                        else if ( ((LA19_3>='0' && LA19_3<='9')||(LA19_3>='A' && LA19_3<='F')||(LA19_3>='a' && LA19_3<='f')) ) {
                            int LA19_5 = input.LA(4);

                            if ( ((LA19_5>='0' && LA19_5<='9')||(LA19_5>='A' && LA19_5<='F')||(LA19_5>='a' && LA19_5<='f')) ) {
                                int LA19_6 = input.LA(5);

                                if ( (LA19_6==':') ) {
                                    alt19=1;
                                }


                            }
                            else if ( (LA19_5==':') ) {
                                alt19=1;
                            }


                        }


                    }
                    else if ( (LA19_1==':') ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:505:4: FOUR_CHAR_HEXNUM COLON
            	    {
            	    mFOUR_CHAR_HEXNUM(); if (state.failed) return ;
            	    mCOLON(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            mFOUR_CHAR_HEXNUM(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP6_SHORTMID_ADDR_BASE"

    // $ANTLR start "IP6_IP4COMPAT_ADDR_BASE"
    public final void mIP6_IP4COMPAT_ADDR_BASE() throws RecognitionException {
        try {
            int _type = IP6_IP4COMPAT_ADDR_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:509:2: ( DOUBLE_COLON IP4_ADDR )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:509:4: DOUBLE_COLON IP4_ADDR
            {
            mDOUBLE_COLON(); if (state.failed) return ;
            mIP4_ADDR(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP6_IP4COMPAT_ADDR_BASE"

    // $ANTLR start "IP6_IP4LINK_ADDR_BASE"
    public final void mIP6_IP4LINK_ADDR_BASE() throws RecognitionException {
        try {
            int _type = IP6_IP4LINK_ADDR_BASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:512:2: ( DOUBLE_COLON FFFF_WORD COLON IP4_ADDR )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:512:4: DOUBLE_COLON FFFF_WORD COLON IP4_ADDR
            {
            mDOUBLE_COLON(); if (state.failed) return ;
            mFFFF_WORD(); if (state.failed) return ;
            mCOLON(); if (state.failed) return ;
            mIP4_ADDR(); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "IP6_IP4LINK_ADDR_BASE"

    // $ANTLR start "FOUR_CHAR_HEXNUM"
    public final void mFOUR_CHAR_HEXNUM() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:516:2: ( HEXNUM_CHAR HEXNUM_CHAR HEXNUM_CHAR HEXNUM_CHAR | HEXNUM_CHAR HEXNUM_CHAR HEXNUM_CHAR | HEXNUM_CHAR HEXNUM_CHAR | HEXNUM_CHAR )
            int alt20=4;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>='0' && LA20_0<='9')||(LA20_0>='A' && LA20_0<='F')||(LA20_0>='a' && LA20_0<='f')) ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1>='0' && LA20_1<='9')||(LA20_1>='A' && LA20_1<='F')||(LA20_1>='a' && LA20_1<='f')) ) {
                    int LA20_3 = input.LA(3);

                    if ( ((LA20_3>='0' && LA20_3<='9')||(LA20_3>='A' && LA20_3<='F')||(LA20_3>='a' && LA20_3<='f')) ) {
                        int LA20_5 = input.LA(4);

                        if ( ((LA20_5>='0' && LA20_5<='9')||(LA20_5>='A' && LA20_5<='F')||(LA20_5>='a' && LA20_5<='f')) ) {
                            alt20=1;
                        }
                        else {
                            alt20=2;}
                    }
                    else {
                        alt20=3;}
                }
                else {
                    alt20=4;}
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:516:5: HEXNUM_CHAR HEXNUM_CHAR HEXNUM_CHAR HEXNUM_CHAR
                    {
                    mHEXNUM_CHAR(); if (state.failed) return ;
                    mHEXNUM_CHAR(); if (state.failed) return ;
                    mHEXNUM_CHAR(); if (state.failed) return ;
                    mHEXNUM_CHAR(); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:517:4: HEXNUM_CHAR HEXNUM_CHAR HEXNUM_CHAR
                    {
                    mHEXNUM_CHAR(); if (state.failed) return ;
                    mHEXNUM_CHAR(); if (state.failed) return ;
                    mHEXNUM_CHAR(); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:518:4: HEXNUM_CHAR HEXNUM_CHAR
                    {
                    mHEXNUM_CHAR(); if (state.failed) return ;
                    mHEXNUM_CHAR(); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:519:4: HEXNUM_CHAR
                    {
                    mHEXNUM_CHAR(); if (state.failed) return ;

                    }
                    break;

            }
        }
        finally {
        }
    }
    // $ANTLR end "FOUR_CHAR_HEXNUM"

    // $ANTLR start "HEXNUM_CHAR"
    public final void mHEXNUM_CHAR() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:523:2: ( ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:523:4: ( 'a' .. 'f' | 'A' .. 'F' | '0' .. '9' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEXNUM_CHAR"

    // $ANTLR start "ALPHANUM_NONSTD"
    public final void mALPHANUM_NONSTD() throws RecognitionException {
        try {
            int _type = ALPHANUM_NONSTD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:527:2: ( ( ALPHANUM_CHAR )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:527:4: ( ALPHANUM_CHAR )*
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:527:4: ( ALPHANUM_CHAR )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0>='0' && LA21_0<='9')||(LA21_0>='A' && LA21_0<='Z')||LA21_0=='_'||(LA21_0>='a' && LA21_0<='z')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:527:4: ALPHANUM_CHAR
            	    {
            	    mALPHANUM_CHAR(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop21;
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

    // $ANTLR start "ALPHANUM_CHAR"
    public final void mALPHANUM_CHAR() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:531:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:531:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )
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

        }
        finally {
        }
    }
    // $ANTLR end "ALPHANUM_CHAR"

    // $ANTLR start "ANY_ASCII_ALPHANUM"
    public final void mANY_ASCII_ALPHANUM() throws RecognitionException {
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:535:2: ( ( '\\u0020' .. '\\u007F' ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:535:4: ( '\\u0020' .. '\\u007F' )
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:535:4: ( '\\u0020' .. '\\u007F' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:535:5: '\\u0020' .. '\\u007F'
            {
            matchRange(' ','\u007F'); if (state.failed) return ;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "ANY_ASCII_ALPHANUM"

    // $ANTLR start "BAD"
    public final void mBAD() throws RecognitionException {
        try {
            int _type = BAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:538:6: ( . )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:538:8: .
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
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:8: ( T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | COMMENT | CR | LF | WS | ASTERISK | FORWARD_SLASH | SEMICOLON | DOUBLE_QUOTE | DOUBLE_COLON | COLON | DOT | PERCENT | ONE_LINE_DOUBLE_QUOTED_STRING | YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD | NOTIFY_WORD | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD | PORT_WORD | KEY_WORD | FFFF_WORD | IP4_ADDR | IP4_SHORT_3 | IP4_SHORT_2 | NUMBER | KMG_NUMBER | DOMAIN_NAME | IP6_NORM_ADDR_BASE | IP6_SHORTLEFT_ADDR_BASE | IP6_SHORTRIGHT_ADDR_BASE | IP6_SHORTMID_ADDR_BASE | IP6_IP4COMPAT_ADDR_BASE | IP6_IP4LINK_ADDR_BASE | ALPHANUM_NONSTD | BAD )
        int alt22=71;
        alt22 = dfa22.predict(input);
        switch (alt22) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:10: T__62
                {
                mT__62(); if (state.failed) return ;

                }
                break;
            case 2 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:16: T__63
                {
                mT__63(); if (state.failed) return ;

                }
                break;
            case 3 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:22: T__64
                {
                mT__64(); if (state.failed) return ;

                }
                break;
            case 4 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:28: T__65
                {
                mT__65(); if (state.failed) return ;

                }
                break;
            case 5 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:34: T__66
                {
                mT__66(); if (state.failed) return ;

                }
                break;
            case 6 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:40: T__67
                {
                mT__67(); if (state.failed) return ;

                }
                break;
            case 7 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:46: T__68
                {
                mT__68(); if (state.failed) return ;

                }
                break;
            case 8 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:52: T__69
                {
                mT__69(); if (state.failed) return ;

                }
                break;
            case 9 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:58: T__70
                {
                mT__70(); if (state.failed) return ;

                }
                break;
            case 10 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:64: T__71
                {
                mT__71(); if (state.failed) return ;

                }
                break;
            case 11 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:70: T__72
                {
                mT__72(); if (state.failed) return ;

                }
                break;
            case 12 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:76: T__73
                {
                mT__73(); if (state.failed) return ;

                }
                break;
            case 13 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:82: T__74
                {
                mT__74(); if (state.failed) return ;

                }
                break;
            case 14 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:88: T__75
                {
                mT__75(); if (state.failed) return ;

                }
                break;
            case 15 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:94: T__76
                {
                mT__76(); if (state.failed) return ;

                }
                break;
            case 16 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:100: T__77
                {
                mT__77(); if (state.failed) return ;

                }
                break;
            case 17 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:106: T__78
                {
                mT__78(); if (state.failed) return ;

                }
                break;
            case 18 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:112: T__79
                {
                mT__79(); if (state.failed) return ;

                }
                break;
            case 19 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:118: T__80
                {
                mT__80(); if (state.failed) return ;

                }
                break;
            case 20 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:124: T__81
                {
                mT__81(); if (state.failed) return ;

                }
                break;
            case 21 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:130: T__82
                {
                mT__82(); if (state.failed) return ;

                }
                break;
            case 22 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:136: T__83
                {
                mT__83(); if (state.failed) return ;

                }
                break;
            case 23 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:142: T__84
                {
                mT__84(); if (state.failed) return ;

                }
                break;
            case 24 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:148: T__85
                {
                mT__85(); if (state.failed) return ;

                }
                break;
            case 25 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:154: T__86
                {
                mT__86(); if (state.failed) return ;

                }
                break;
            case 26 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:160: T__87
                {
                mT__87(); if (state.failed) return ;

                }
                break;
            case 27 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:166: T__88
                {
                mT__88(); if (state.failed) return ;

                }
                break;
            case 28 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:172: T__89
                {
                mT__89(); if (state.failed) return ;

                }
                break;
            case 29 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:178: T__90
                {
                mT__90(); if (state.failed) return ;

                }
                break;
            case 30 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:184: T__91
                {
                mT__91(); if (state.failed) return ;

                }
                break;
            case 31 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:190: T__92
                {
                mT__92(); if (state.failed) return ;

                }
                break;
            case 32 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:196: T__93
                {
                mT__93(); if (state.failed) return ;

                }
                break;
            case 33 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:202: T__94
                {
                mT__94(); if (state.failed) return ;

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
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:271: DOUBLE_COLON
                {
                mDOUBLE_COLON(); if (state.failed) return ;

                }
                break;
            case 43 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:284: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 44 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:290: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 45 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:294: PERCENT
                {
                mPERCENT(); if (state.failed) return ;

                }
                break;
            case 46 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:302: ONE_LINE_DOUBLE_QUOTED_STRING
                {
                mONE_LINE_DOUBLE_QUOTED_STRING(); if (state.failed) return ;

                }
                break;
            case 47 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:332: YES_OR_NO_WORD
                {
                mYES_OR_NO_WORD(); if (state.failed) return ;

                }
                break;
            case 48 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:347: TRUE_OR_FALSE_WORD
                {
                mTRUE_OR_FALSE_WORD(); if (state.failed) return ;

                }
                break;
            case 49 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:366: ZERO_OR_ONE_WORD
                {
                mZERO_OR_ONE_WORD(); if (state.failed) return ;

                }
                break;
            case 50 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:383: RANGE_WORD
                {
                mRANGE_WORD(); if (state.failed) return ;

                }
                break;
            case 51 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:394: UNLIMITED_WORD
                {
                mUNLIMITED_WORD(); if (state.failed) return ;

                }
                break;
            case 52 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:409: DEFAULT_WORD
                {
                mDEFAULT_WORD(); if (state.failed) return ;

                }
                break;
            case 53 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:422: NOTIFY_WORD
                {
                mNOTIFY_WORD(); if (state.failed) return ;

                }
                break;
            case 54 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:434: NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD
                {
                mNOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD(); if (state.failed) return ;

                }
                break;
            case 55 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:475: PORT_WORD
                {
                mPORT_WORD(); if (state.failed) return ;

                }
                break;
            case 56 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:485: KEY_WORD
                {
                mKEY_WORD(); if (state.failed) return ;

                }
                break;
            case 57 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:494: FFFF_WORD
                {
                mFFFF_WORD(); if (state.failed) return ;

                }
                break;
            case 58 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:504: IP4_ADDR
                {
                mIP4_ADDR(); if (state.failed) return ;

                }
                break;
            case 59 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:513: IP4_SHORT_3
                {
                mIP4_SHORT_3(); if (state.failed) return ;

                }
                break;
            case 60 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:525: IP4_SHORT_2
                {
                mIP4_SHORT_2(); if (state.failed) return ;

                }
                break;
            case 61 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:537: NUMBER
                {
                mNUMBER(); if (state.failed) return ;

                }
                break;
            case 62 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:544: KMG_NUMBER
                {
                mKMG_NUMBER(); if (state.failed) return ;

                }
                break;
            case 63 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:555: DOMAIN_NAME
                {
                mDOMAIN_NAME(); if (state.failed) return ;

                }
                break;
            case 64 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:567: IP6_NORM_ADDR_BASE
                {
                mIP6_NORM_ADDR_BASE(); if (state.failed) return ;

                }
                break;
            case 65 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:586: IP6_SHORTLEFT_ADDR_BASE
                {
                mIP6_SHORTLEFT_ADDR_BASE(); if (state.failed) return ;

                }
                break;
            case 66 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:610: IP6_SHORTRIGHT_ADDR_BASE
                {
                mIP6_SHORTRIGHT_ADDR_BASE(); if (state.failed) return ;

                }
                break;
            case 67 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:635: IP6_SHORTMID_ADDR_BASE
                {
                mIP6_SHORTMID_ADDR_BASE(); if (state.failed) return ;

                }
                break;
            case 68 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:658: IP6_IP4COMPAT_ADDR_BASE
                {
                mIP6_IP4COMPAT_ADDR_BASE(); if (state.failed) return ;

                }
                break;
            case 69 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:682: IP6_IP4LINK_ADDR_BASE
                {
                mIP6_IP4LINK_ADDR_BASE(); if (state.failed) return ;

                }
                break;
            case 70 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:704: ALPHANUM_NONSTD
                {
                mALPHANUM_NONSTD(); if (state.failed) return ;

                }
                break;
            case 71 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:1:720: BAD
                {
                mBAD(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Bind9Config
    public final void synpred1_Bind9Config_fragment() throws RecognitionException {   
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:353:29: (~ '*' | '*' ~ '/' )
        int alt23=2;
        int LA23_0 = input.LA(1);

        if ( ((LA23_0>='\u0000' && LA23_0<=')')||(LA23_0>='+' && LA23_0<='\uFFFF')) ) {
            alt23=1;
        }
        else if ( (LA23_0=='*') ) {
            alt23=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 23, 0, input);

            throw nvae;
        }
        switch (alt23) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:353:30: ~ '*'
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
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:353:37: '*' ~ '/'
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
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:372:4: ( ( '\\r' )? '\\n' )
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:372:5: ( '\\r' )? '\\n'
        {
        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:372:5: ( '\\r' )?
        int alt24=2;
        int LA24_0 = input.LA(1);

        if ( (LA24_0=='\r') ) {
            alt24=1;
        }
        switch (alt24) {
            case 1 :
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:372:5: '\\r'
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


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA22 dfa22 = new DFA22(this);
    static final String DFA12_eotS =
        "\25\uffff";
    static final String DFA12_eofS =
        "\25\uffff";
    static final String DFA12_minS =
        "\6\106\1\146\1\106\1\uffff\2\106\1\uffff\1\106\10\uffff";
    static final String DFA12_maxS =
        "\4\146\1\106\3\146\1\uffff\2\146\1\uffff\1\146\10\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\4\2\uffff\1\7\1\uffff\1\1\1\5\1\3\1\11\1\2\1\6\1\10"+
        "\1\12";
    static final String DFA12_specialS =
        "\25\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\2\37\uffff\1\1",
            "\1\4\37\uffff\1\3",
            "\1\5\37\uffff\1\6",
            "\1\10\37\uffff\1\7",
            "\1\11",
            "\1\12\37\uffff\1\13",
            "\1\14",
            "\1\16\37\uffff\1\15",
            "",
            "\1\17\37\uffff\1\20",
            "\1\21\37\uffff\1\22",
            "",
            "\1\24\37\uffff\1\23",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "449:1: FFFF_WORD : ( 'ffff' | 'FFFF' | 'fFFF' | 'ffFF' | 'fffF' | 'FFFf' | 'FFff' | 'Ffff' | 'fFFf' | 'FffF' );";
        }
    }
    static final String DFA15_eotS =
        "\2\2\2\uffff";
    static final String DFA15_eofS =
        "\4\uffff";
    static final String DFA15_minS =
        "\2\56\2\uffff";
    static final String DFA15_maxS =
        "\2\172\2\uffff";
    static final String DFA15_acceptS =
        "\2\uffff\1\2\1\1";
    static final String DFA15_specialS =
        "\4\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\3\1\uffff\12\1\7\uffff\32\1\4\uffff\1\1\1\uffff\32\1",
            "\1\3\1\uffff\12\1\7\uffff\32\1\4\uffff\1\1\1\uffff\32\1",
            "",
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
            return "()+ loopback of 477:4: ( ALPHANUM_NONSTD '.' )+";
        }
    }
    static final String DFA22_eotS =
        "\5\47\2\uffff\15\47\1\116\1\51\1\117\1\121\5\uffff\1\124\1\126"+
        "\1\130\1\uffff\1\132\3\47\1\143\1\47\1\uffff\1\47\1\uffff\1\47\1"+
        "\uffff\1\47\1\145\1\146\2\47\3\uffff\22\47\1\u0083\2\47\1\u0087"+
        "\3\47\12\uffff\1\u008c\3\uffff\1\u0091\1\143\1\53\5\47\1\uffff\1"+
        "\47\2\uffff\2\47\1\uffff\1\u009f\1\uffff\24\47\1\u00b9\1\u00ba\1"+
        "\47\1\uffff\1\u00bd\2\47\1\uffff\3\47\1\u0087\1\uffff\3\u0090\2"+
        "\uffff\1\143\1\u00cb\6\47\1\u00d6\2\47\1\u009f\5\uffff\3\47\5\u00e0"+
        "\1\u00e1\1\u00e2\1\47\1\u00e4\2\47\1\u00e7\1\47\1\u00e9\5\47\2\uffff"+
        "\2\47\1\uffff\4\47\1\u00f8\1\47\1\u0090\1\uffff\4\u0090\1\143\1"+
        "\uffff\1\u00cb\1\53\3\47\5\u00e0\1\uffff\1\u0107\1\47\4\uffff\1"+
        "\47\1\u0110\1\u00e4\3\uffff\1\47\1\uffff\1\47\1\u0113\1\uffff\1"+
        "\47\1\uffff\16\47\1\uffff\1\47\7\u0090\1\143\1\u00cb\1\u012f\1\u0132"+
        "\2\47\1\uffff\1\47\6\uffff\1\47\1\uffff\1\47\1\u013e\1\uffff\10"+
        "\47\1\u0147\1\47\1\u0149\1\u014b\4\47\12\u0090\1\143\1\uffff\1\u012f"+
        "\1\53\1\uffff\3\47\5\uffff\1\u015c\1\u015d\1\47\1\uffff\2\47\1\u0161"+
        "\3\47\1\u0165\1\47\1\uffff\1\47\3\uffff\1\47\1\u014a\2\47\1\uffff"+
        "\1\143\1\u012f\1\u016d\1\u014a\2\47\7\uffff\3\47\1\uffff\2\47\1"+
        "\u017a\1\uffff\1\47\1\u017c\3\47\1\u0090\1\143\1\uffff\1\u016d\1"+
        "\47\5\uffff\1\47\1\u018b\3\47\1\uffff\1\u018f\1\uffff\1\u0190\1"+
        "\u0191\1\u0192\1\u0090\1\uffff\1\143\1\u016d\1\u0194\5\uffff\1\47"+
        "\1\uffff\3\47\4\uffff\1\u0090\6\uffff\1\47\1\uffff\1\u01a4\1\47"+
        "\5\uffff\1\u01ab\1\uffff\1\47\6\uffff\1\47\5\uffff\1\47\4\uffff"+
        "\1\u01bd\2\47\1\uffff\1\u01bd\2\uffff\1\u01bd\2\47\1\uffff\1\u01bd"+
        "\1\uffff\1\u01bd\2\47\1\u01bd\1\uffff\1\u01bd\2\47\1\u01bd\1\uffff"+
        "\2\47\1\uffff\2\47\1\uffff\1\u01d6\1\47\1\uffff\1\47\1\u01d9\1\uffff";
    static final String DFA22_eofS =
        "\u01da\uffff";
    static final String DFA22_minS =
        "\1\0\4\56\2\uffff\15\56\1\52\1\0\2\11\5\uffff\1\0\1\72\1\56\1\uffff"+
        "\6\56\1\uffff\1\56\1\uffff\1\56\1\uffff\5\56\1\60\2\uffff\31\56"+
        "\12\uffff\1\60\3\uffff\2\56\1\60\5\56\1\uffff\1\56\2\uffff\2\56"+
        "\3\60\27\56\1\uffff\3\56\1\uffff\4\56\1\uffff\1\56\2\106\2\uffff"+
        "\13\56\2\60\2\uffff\2\60\26\56\2\uffff\2\56\1\uffff\7\56\1\uffff"+
        "\3\106\1\146\1\56\1\uffff\1\56\1\60\10\56\1\uffff\2\56\4\60\3\56"+
        "\3\uffff\1\56\1\uffff\2\56\1\uffff\1\56\1\uffff\16\56\1\uffff\2"+
        "\56\4\106\1\146\1\106\6\56\1\uffff\1\56\5\60\1\72\1\56\1\uffff\2"+
        "\56\1\uffff\13\56\1\55\4\56\12\72\1\56\1\uffff\1\56\1\60\1\uffff"+
        "\3\56\1\72\4\60\3\56\1\uffff\10\56\1\uffff\1\56\3\uffff\4\56\1\60"+
        "\6\56\2\60\1\72\2\60\2\uffff\3\56\1\uffff\3\56\1\uffff\7\56\1\uffff"+
        "\2\56\1\72\4\60\5\56\1\uffff\1\56\1\uffff\4\56\1\uffff\3\56\2\60"+
        "\1\72\2\60\1\56\1\uffff\1\55\2\56\4\uffff\1\56\1\uffff\1\72\4\60"+
        "\1\56\1\uffff\2\56\2\60\1\72\2\60\1\56\1\uffff\1\56\1\72\4\60\1"+
        "\uffff\1\56\4\60\1\72\1\56\1\72\4\60\2\56\2\60\1\72\1\uffff\1\60"+
        "\2\56\1\72\3\60\2\56\2\60\1\72\2\56\1\72\1\60\2\56\1\60\2\56\1\72"+
        "\2\56\1\uffff\2\56\1\uffff";
    static final String DFA22_maxS =
        "\1\uffff\4\172\2\uffff\15\172\1\57\1\uffff\2\40\5\uffff\1\uffff"+
        "\1\72\1\172\1\uffff\6\172\1\uffff\1\172\1\uffff\1\172\1\uffff\5"+
        "\172\1\146\2\uffff\31\172\12\uffff\1\146\3\uffff\2\172\1\71\5\172"+
        "\1\uffff\1\172\2\uffff\2\172\3\146\27\172\1\uffff\3\172\1\uffff"+
        "\4\172\1\uffff\1\71\2\146\2\uffff\13\172\2\146\2\uffff\2\146\26"+
        "\172\2\uffff\2\172\1\uffff\6\172\1\71\1\uffff\1\146\1\106\2\146"+
        "\1\172\1\uffff\1\172\1\71\10\172\1\uffff\2\172\4\146\3\172\3\uffff"+
        "\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff\16\172\1\uffff\1\172"+
        "\1\56\1\146\1\106\4\146\6\172\1\uffff\1\172\5\146\1\72\1\172\1\uffff"+
        "\2\172\1\uffff\20\172\12\72\1\172\1\uffff\1\172\1\71\1\uffff\3\172"+
        "\1\72\4\146\3\172\1\uffff\10\172\1\uffff\1\172\3\uffff\4\172\1\146"+
        "\6\172\2\146\1\72\2\146\2\uffff\3\172\1\uffff\3\172\1\uffff\5\172"+
        "\1\71\1\172\1\uffff\2\172\1\72\4\146\5\172\1\uffff\1\172\1\uffff"+
        "\3\172\1\71\1\uffff\3\172\2\146\1\72\2\146\1\172\1\uffff\3\172\4"+
        "\uffff\1\56\1\uffff\1\72\4\146\1\172\1\uffff\2\172\2\146\1\72\2"+
        "\146\1\172\1\uffff\1\172\1\72\4\146\1\uffff\1\172\4\146\1\72\1\172"+
        "\1\72\4\146\2\172\2\146\1\72\1\uffff\1\146\2\172\1\72\3\146\2\172"+
        "\2\146\1\72\2\172\1\72\1\146\2\172\1\146\2\172\1\72\2\172\1\uffff"+
        "\2\172\1\uffff";
    static final String DFA22_acceptS =
        "\5\uffff\1\5\1\6\21\uffff\3\45\1\46\1\50\3\uffff\1\55\6\uffff\1"+
        "\106\1\uffff\1\107\1\uffff\1\77\6\uffff\1\5\1\6\31\uffff\1\42\1"+
        "\47\1\43\1\45\1\44\1\46\1\50\1\51\1\56\1\53\1\uffff\1\54\1\55\1"+
        "\61\10\uffff\1\75\1\uffff\1\2\1\3\34\uffff\1\25\3\uffff\1\57\4\uffff"+
        "\1\52\3\uffff\1\101\1\76\15\uffff\1\102\1\103\30\uffff\1\23\1\24"+
        "\2\uffff\1\70\7\uffff\1\104\5\uffff\1\74\12\uffff\1\1\11\uffff\1"+
        "\71\1\11\1\12\1\uffff\1\60\2\uffff\1\15\1\uffff\1\16\16\uffff\1"+
        "\67\16\uffff\1\4\10\uffff\1\10\2\uffff\1\14\33\uffff\1\73\2\uffff"+
        "\1\62\13\uffff\1\13\10\uffff\1\30\1\uffff\1\32\1\66\1\65\20\uffff"+
        "\1\7\1\20\3\uffff\1\64\3\uffff\1\26\7\uffff\1\72\14\uffff\1\21\1"+
        "\uffff\1\31\4\uffff\1\105\11\uffff\1\35\3\uffff\1\27\1\33\1\34\1"+
        "\36\1\uffff\1\63\6\uffff\1\17\10\uffff\1\22\6\uffff\1\41\21\uffff"+
        "\1\100\30\uffff\1\37\2\uffff\1\40";
    static final String DFA22_specialS =
        "\1\1\24\uffff\1\2\7\uffff\1\0\u01bc\uffff}>";
    static final String[] DFA22_transitionS = {
            "\11\51\1\31\1\27\1\51\1\32\1\26\22\51\1\30\1\51\1\35\1\25\1"+
            "\51\1\40\4\51\1\33\3\51\1\37\1\24\2\41\10\45\1\36\1\34\5\51"+
            "\2\46\1\4\2\46\1\44\1\50\1\3\1\2\21\50\4\51\1\50\1\51\1\16\2"+
            "\46\1\15\1\46\1\7\1\50\1\14\1\17\1\50\1\20\1\50\1\12\1\21\1"+
            "\10\1\22\1\50\1\42\1\13\1\11\1\43\3\50\1\23\1\1\1\5\1\51\1\6"+
            "\uff82\51",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16"+
            "\54\1\52\13\54",
            "\1\53\1\uffff\12\54\7\uffff\15\54\1\55\14\54\4\uffff\1\54"+
            "\1\uffff\32\54",
            "\1\53\1\uffff\12\54\7\uffff\22\54\1\56\7\54\4\uffff\1\54\1"+
            "\uffff\32\54",
            "\1\53\1\uffff\12\60\1\61\6\uffff\6\60\1\54\1\57\22\54\4\uffff"+
            "\1\54\1\uffff\6\60\24\54",
            "",
            "",
            "\1\53\1\uffff\12\60\1\61\6\uffff\5\60\1\70\24\54\4\uffff\1"+
            "\54\1\uffff\1\66\4\60\1\67\2\54\1\65\5\54\1\64\13\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\71\14\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\73\14\54\1\74\6\54\1\72\1\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\75"+
            "\31\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\100\2\54\1\76\7\54\1\77\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\101\21\54",
            "\1\53\1\uffff\12\60\1\61\6\uffff\6\60\24\54\4\uffff\1\54\1"+
            "\uffff\4\60\1\102\1\60\2\54\1\104\5\54\1\103\13\54",
            "\1\53\1\uffff\12\60\1\61\6\uffff\6\60\24\54\4\uffff\1\54\1"+
            "\uffff\2\60\1\105\3\60\24\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\17"+
            "\54\1\106\12\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\107\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16"+
            "\54\1\111\5\54\1\110\5\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\112"+
            "\15\54\1\113\13\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\114\25\54",
            "\1\115\4\uffff\1\115",
            "\0\115",
            "\2\120\1\uffff\2\120\22\uffff\1\120",
            "\2\120\1\uffff\2\120\22\uffff\1\120",
            "",
            "",
            "",
            "",
            "",
            "\12\125\1\uffff\2\125\1\uffff\ufff2\125",
            "\1\127",
            "\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32"+
            "\53",
            "",
            "\1\135\1\uffff\12\134\1\61\6\uffff\6\60\1\133\3\54\1\133\1"+
            "\54\1\133\15\54\4\uffff\1\54\1\uffff\6\60\1\133\3\54\1\133\1"+
            "\54\1\133\15\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\136"+
            "\3\54\1\137\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\140\14\54",
            "\1\53\1\uffff\12\60\1\61\6\uffff\5\60\1\141\24\54\4\uffff"+
            "\1\54\1\uffff\5\60\1\142\24\54",
            "\1\135\1\uffff\12\134\1\61\6\uffff\6\60\1\133\3\54\1\133\1"+
            "\54\1\133\15\54\4\uffff\1\54\1\uffff\6\60\1\133\3\54\1\133\1"+
            "\54\1\133\15\54",
            "\1\53\1\uffff\12\60\1\61\6\uffff\6\60\24\54\4\uffff\1\54\1"+
            "\uffff\6\60\24\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\144\14\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\1\147\31\54\4\uffff\1\54\1\uffff"+
            "\32\54",
            "\1\53\1\uffff\12\150\1\151\6\uffff\6\150\24\54\4\uffff\1\54"+
            "\1\uffff\6\150\24\54",
            "\12\153\1\152\6\uffff\6\153\32\uffff\6\153",
            "",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21"+
            "\54\1\154\10\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21"+
            "\54\1\155\10\54",
            "\1\53\1\uffff\12\150\1\151\6\uffff\6\150\24\54\4\uffff\1\54"+
            "\1\uffff\6\150\5\54\1\156\16\54",
            "\1\53\1\uffff\12\150\1\151\6\uffff\5\150\1\160\24\54\4\uffff"+
            "\1\54\1\uffff\5\150\1\157\24\54",
            "\1\53\1\uffff\12\150\1\151\6\uffff\5\150\1\161\24\54\4\uffff"+
            "\1\54\1\uffff\6\150\24\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13"+
            "\54\1\162\16\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\17"+
            "\54\1\163\12\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\164\7\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\24"+
            "\54\1\165\5\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\166\7\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\167"+
            "\31\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\24"+
            "\54\1\170\5\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\31"+
            "\54\1\171",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\172\14\54",
            "\1\53\1\uffff\12\150\1\151\6\uffff\6\150\24\54\4\uffff\1\54"+
            "\1\uffff\5\150\1\174\5\54\1\173\16\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\14"+
            "\54\1\175\15\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\176"+
            "\31\54",
            "\1\53\1\uffff\12\150\1\151\6\uffff\6\150\24\54\4\uffff\1\54"+
            "\1\uffff\6\150\5\54\1\177\16\54",
            "\1\53\1\uffff\4\54\1\u0080\1\54\1\u0081\3\54\7\uffff\32\54"+
            "\4\uffff\1\u0082\1\uffff\32\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\30"+
            "\54\1\u0084\1\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\14"+
            "\54\1\u0085\15\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u0086\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u0089\1\u0088\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21"+
            "\54\1\u008a\10\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u008b\7\54",
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
            "\12\u008d\7\uffff\5\u0090\1\u008f\32\uffff\5\u0090\1\u008e",
            "",
            "",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\135\1\uffff\12\u0092\1\151\6\uffff\6\150\1\133\3\54\1\133"+
            "\1\54\1\133\15\54\4\uffff\1\54\1\uffff\6\150\1\133\3\54\1\133"+
            "\1\54\1\133\15\54",
            "\12\u0093",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\u0094\14\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\5\54"+
            "\1\u0095\24\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13"+
            "\54\1\u0096\16\54",
            "\1\53\1\uffff\12\150\1\151\6\uffff\5\150\1\u0097\24\54\4\uffff"+
            "\1\54\1\uffff\5\150\1\u0098\24\54",
            "\1\53\1\uffff\12\150\1\151\6\uffff\6\150\24\54\4\uffff\1\54"+
            "\1\uffff\5\150\1\u0099\24\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u009a\25\54",
            "",
            "",
            "\1\53\1\uffff\12\54\7\uffff\16\54\1\u009b\13\54\4\uffff\1"+
            "\54\1\uffff\32\54",
            "\1\53\1\uffff\12\u009c\1\151\6\uffff\6\u009c\24\54\4\uffff"+
            "\1\54\1\uffff\6\u009c\24\54",
            "\12\u009e\1\u009d\6\uffff\6\u009e\32\uffff\6\u009e",
            "\12\u00a0\7\uffff\6\u00a0\32\uffff\6\u00a0",
            "\12\u00a2\1\u00a1\6\uffff\6\u00a2\32\uffff\6\u00a2",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\26"+
            "\54\1\u00a3\3\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u00a4\7\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u00a5\7\54",
            "\1\53\1\uffff\12\u009c\1\151\6\uffff\5\u009c\1\u00a7\24\54"+
            "\4\uffff\1\54\1\uffff\5\u009c\1\u00a6\24\54",
            "\1\53\1\uffff\12\u009c\1\151\6\uffff\5\u009c\1\u00a8\24\54"+
            "\4\uffff\1\54\1\uffff\6\u009c\24\54",
            "\1\53\1\uffff\12\u009c\1\151\6\uffff\5\u009c\1\u00a9\24\54"+
            "\4\uffff\1\54\1\uffff\5\u009c\1\u00aa\24\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\30"+
            "\54\1\u00ab\1\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u00ac\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u00ad\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u00ae\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u00af\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\25"+
            "\54\1\u00b0\4\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\54"+
            "\1\u00b1\30\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u00b2\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u00b3\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u00b4\25\54",
            "\1\53\1\uffff\12\u009c\1\151\6\uffff\6\u009c\24\54\4\uffff"+
            "\1\54\1\uffff\1\u00b5\5\u009c\24\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u00b6"+
            "\31\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13"+
            "\54\1\u00b7\16\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u00b8\1\uffff"+
            "\32\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\17"+
            "\54\1\u00bb\12\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u00bc\1\uffff"+
            "\32\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\54"+
            "\1\u00be\30\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u00bf\21\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
            "\1\u00c0\22\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u00c1\7\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u00c2\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u00c3\1\uffff"+
            "\32\54",
            "",
            "\1\u00c5\1\uffff\12\u00c4",
            "\1\u00c7\37\uffff\1\u00c6",
            "\1\u00c8\37\uffff\1\u00c9",
            "",
            "",
            "\1\135\1\uffff\12\u00ca\1\151\6\uffff\6\u009c\1\133\3\54\1"+
            "\133\1\54\1\133\15\54\4\uffff\1\54\1\uffff\6\u009c\1\133\3\54"+
            "\1\133\1\54\1\133\15\54",
            "\1\u00cd\1\uffff\12\u00cc\7\uffff\32\53\4\uffff\1\53\1\uffff"+
            "\32\53",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\6\54"+
            "\1\u00ce\23\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21"+
            "\54\1\u00cf\10\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u00d0\21\54",
            "\1\53\1\uffff\12\u009c\1\151\6\uffff\5\u009c\1\u00d1\24\54"+
            "\4\uffff\1\54\1\uffff\5\u009c\1\u00d2\24\54",
            "\1\53\1\uffff\12\u009c\1\151\6\uffff\6\u009c\24\54\4\uffff"+
            "\1\54\1\uffff\5\u009c\1\u00d3\24\54",
            "\1\53\1\uffff\12\u009c\1\151\6\uffff\5\u009c\1\u00d5\24\54"+
            "\4\uffff\1\54\1\uffff\5\u009c\1\u00d4\24\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\22\54\1\u00d7\7\54\4\uffff\1\54"+
            "\1\uffff\32\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "\12\u00a0\7\uffff\6\u00a0\32\uffff\6\u00a0",
            "\12\u00d9\1\u00da\6\uffff\6\u00d9\32\uffff\6\u00d9",
            "",
            "",
            "\12\u00db\1\u00a0\6\uffff\6\u00db\32\uffff\6\u00db",
            "\12\u00dc\1\u00a1\6\uffff\6\u00dc\32\uffff\6\u00dc",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u00dd"+
            "\31\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u00de\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u00df\25\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u00e3\21\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u00e5\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u00e6\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u00e8\1\uffff"+
            "\32\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\6\54"+
            "\1\u00ea\23\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\16\54\1\u00eb\5\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u00ec\21\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\24"+
            "\54\1\u00ed\5\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\u00ee\14\54",
            "",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16"+
            "\54\1\u00ef\2\54\1\u00f0\10\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u00f1\2\54\1\u00f2\16\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u00f3\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\5\54"+
            "\1\u00f4\24\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u00f5\1\uffff"+
            "\32\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u00f6\21\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u00f7\1\uffff"+
            "\32\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16"+
            "\54\1\u00f9\13\54",
            "\1\u00c5\1\uffff\12\u00fa",
            "",
            "\1\u00fc\37\uffff\1\u00fb",
            "\1\u00fd",
            "\1\u00fe\37\uffff\1\u00ff",
            "\1\u0100",
            "\1\53\1\uffff\12\u0101\1\151\6\uffff\6\u00d8\1\133\3\54\1"+
            "\133\1\54\1\133\15\54\4\uffff\1\54\1\uffff\6\u00d8\1\133\3\54"+
            "\1\133\1\54\1\133\15\54",
            "",
            "\1\u00cd\1\uffff\12\u0102\7\uffff\32\53\4\uffff\1\53\1\uffff"+
            "\32\53",
            "\12\u0103",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u0104\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u0105\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\14"+
            "\54\1\u0106\15\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "\1\53\1\uffff\12\u00d8\1\151\6\uffff\6\u00d8\24\54\4\uffff"+
            "\1\54\1\uffff\6\u00d8\24\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\u0108\1\u009f\6\uffff\6\u0108\24\54\4\uffff"+
            "\1\54\1\uffff\6\u0108\24\54",
            "\12\u0109\1\u00da\6\uffff\6\u0109\32\uffff\6\u0109",
            "\12\u010b\1\u010a\6\uffff\6\u010b\32\uffff\6\u010b",
            "\12\u010c\1\u010d\6\uffff\6\u010c\32\uffff\6\u010c",
            "\12\u010e\1\u00a1\6\uffff\6\u010e\32\uffff\6\u010e",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21"+
            "\54\1\u010f\10\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\u0111\14\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21"+
            "\54\1\u0112\10\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u0114\7\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u0115"+
            "\31\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13"+
            "\54\1\u0116\16\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\u0117\14\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\17"+
            "\54\1\u0118\12\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u0119"+
            "\31\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21"+
            "\54\1\u011a\10\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u011b\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
            "\1\u011c\26\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u011d\21\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21"+
            "\54\1\u011e\10\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\30"+
            "\54\1\u011f\1\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\u0120\14\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\25"+
            "\54\1\u0121\4\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13"+
            "\54\1\u0122\16\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\21"+
            "\54\1\u0123\10\54",
            "\1\u00c5",
            "\1\u0125\37\uffff\1\u0124",
            "\1\u0126",
            "\1\u0127\37\uffff\1\u0128",
            "\1\u0129\37\uffff\1\u012a",
            "\1\u012b",
            "\1\u012d\37\uffff\1\u012c",
            "\1\53\1\uffff\12\u012e\1\u009f\6\uffff\6\u0108\1\133\3\54"+
            "\1\133\1\54\1\133\15\54\4\uffff\1\54\1\uffff\6\u0108\1\133\3"+
            "\54\1\133\1\54\1\133\15\54",
            "\1\u00cd\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff"+
            "\32\53",
            "\1\u0131\1\uffff\12\u0130\7\uffff\32\53\4\uffff\1\53\1\uffff"+
            "\32\53",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u0133\7\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u0134\21\54",
            "",
            "\1\53\1\uffff\12\u0135\1\u009f\6\uffff\6\u0135\24\54\4\uffff"+
            "\1\54\1\uffff\6\u0135\24\54",
            "\12\u0136\1\u00da\6\uffff\6\u0136\32\uffff\6\u0136",
            "\12\u00a0\1\u009f\6\uffff\6\u00a0\32\uffff\6\u00a0",
            "\12\u0137\1\u0138\6\uffff\6\u0137\32\uffff\6\u0137",
            "\12\u0139\1\u010d\6\uffff\6\u0139\32\uffff\6\u0139",
            "\12\u013a\1\u00a0\6\uffff\6\u013a\32\uffff\6\u013a",
            "\1\u00a1",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
            "\1\u013b\26\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\6\54"+
            "\1\u013c\23\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u013d\7\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\17"+
            "\54\1\u013f\12\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u0140\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u0141\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u0142\1\uffff"+
            "\32\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u0143\1\uffff"+
            "\32\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\14"+
            "\54\1\u0144\15\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u0145\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\5\54"+
            "\1\u0146\24\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u0148\7\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u014a\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff"+
            "\32\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u014c"+
            "\31\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u014d\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u014e\21\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u014f\1\uffff"+
            "\32\54",
            "\1\u0150",
            "\1\u0150",
            "\1\u0150",
            "\1\u0150",
            "\1\u0150",
            "\1\u0150",
            "\1\u0150",
            "\1\u0150",
            "\1\u0150",
            "\1\u0150",
            "\1\53\1\uffff\12\u0151\1\u009f\6\uffff\6\u0135\1\133\3\54"+
            "\1\133\1\54\1\133\15\54\4\uffff\1\54\1\uffff\6\u0135\1\133\3"+
            "\54\1\133\1\54\1\133\15\54",
            "",
            "\1\u0131\1\uffff\12\u0152\7\uffff\32\53\4\uffff\1\53\1\uffff"+
            "\32\53",
            "\12\u0153",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\7\54"+
            "\1\u0154\22\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u0155\6\54",
            "\1\53\1\uffff\12\u0156\1\u009f\6\uffff\6\u0156\24\54\4\uffff"+
            "\1\54\1\uffff\6\u0156\24\54",
            "\1\u00da",
            "\12\u0157\1\u0138\6\uffff\6\u0157\32\uffff\6\u0157",
            "\12\u0158\1\u010a\6\uffff\6\u0158\32\uffff\6\u0158",
            "\12\u0159\1\u010d\6\uffff\6\u0159\32\uffff\6\u0159",
            "\12\u015a\1\u015b\6\uffff\6\u015a\32\uffff\6\u015a",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u015e\1\uffff"+
            "\32\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u015f\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u0160\21\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\u0162\14\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16"+
            "\54\1\u0163\13\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u0164\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u0166\21\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u0167\6\54",
            "",
            "",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\14"+
            "\54\1\u0168\15\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u0169\7\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\u016a\14\54",
            "\12\u016b\7\uffff\6\u0090\32\uffff\6\u0090",
            "\1\53\1\uffff\12\u016c\1\u009f\6\uffff\6\u0156\1\133\3\54"+
            "\1\133\1\54\1\133\15\54\4\uffff\1\54\1\uffff\6\u0156\1\133\3"+
            "\54\1\133\1\54\1\133\15\54",
            "\1\u0131\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff"+
            "\32\53",
            "\1\53\1\uffff\12\u016e\7\uffff\32\53\4\uffff\1\53\1\uffff"+
            "\32\53",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u016f\25\54",
            "\1\53\1\uffff\12\54\1\u009f\6\uffff\32\54\4\uffff\1\54\1\uffff"+
            "\32\54",
            "\12\u0170\1\u0138\6\uffff\6\u0170\32\uffff\6\u0170",
            "\12\u0171\1\u0172\6\uffff\6\u0171\32\uffff\6\u0171",
            "\1\u010d",
            "\12\u0173\1\u015b\6\uffff\6\u0173\32\uffff\6\u0173",
            "\12\u0174\1\u00a0\6\uffff\6\u0174\32\uffff\6\u0174",
            "",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13"+
            "\54\1\u0175\16\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\2\54"+
            "\1\u0176\27\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16"+
            "\54\1\u0177\13\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u0178"+
            "\31\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\17"+
            "\54\1\u0179\12\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\27"+
            "\54\1\u017b\2\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u017d\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u017e\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16"+
            "\54\1\u017f\13\54",
            "\1\u0181\1\uffff\12\u0180",
            "\1\53\1\uffff\12\u0182\1\u009f\6\uffff\6\54\1\133\3\54\1\133"+
            "\1\54\1\133\15\54\4\uffff\1\54\1\uffff\6\54\1\133\3\54\1\133"+
            "\1\54\1\133\15\54",
            "",
            "\1\53\1\uffff\12\u0183\7\uffff\32\53\4\uffff\1\53\1\uffff"+
            "\32\53",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
            "\1\u0184\26\54",
            "\1\u0138",
            "\12\u0185\1\u0172\6\uffff\6\u0185\32\uffff\6\u0185",
            "\12\u0186\1\u010a\6\uffff\6\u0186\32\uffff\6\u0186",
            "\12\u0187\1\u015b\6\uffff\6\u0187\32\uffff\6\u0187",
            "\12\u0188\1\u0189\6\uffff\6\u0188\32\uffff\6\u0188",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u018a\21\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\u018c\14\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\14"+
            "\54\1\u018d\15\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u018e\6\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\u0181\1\uffff\12\u0193",
            "",
            "\1\53\1\uffff\12\u0182\7\uffff\6\54\1\133\3\54\1\133\1\54"+
            "\1\133\15\54\4\uffff\1\54\1\uffff\6\54\1\133\3\54\1\133\1\54"+
            "\1\133\15\54",
            "\1\53\1\uffff\12\53\7\uffff\32\53\4\uffff\1\53\1\uffff\32"+
            "\53",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\12\u0195\1\u0172\6\uffff\6\u0195\32\uffff\6\u0195",
            "\12\u0196\1\u0197\6\uffff\6\u0196\32\uffff\6\u0196",
            "\1\u015b",
            "\12\u0198\1\u0189\6\uffff\6\u0198\32\uffff\6\u0198",
            "\12\u0199\1\u00a0\6\uffff\6\u0199\32\uffff\6\u0199",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u019a\7\54",
            "",
            "\1\u019b\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff"+
            "\32\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u019c\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\10"+
            "\54\1\u019d\21\54",
            "",
            "",
            "",
            "",
            "\1\u0181",
            "",
            "\1\u0172",
            "\12\u019e\1\u0197\6\uffff\6\u019e\32\uffff\6\u019e",
            "\12\u019f\1\u010a\6\uffff\6\u019f\32\uffff\6\u019f",
            "\12\u01a0\1\u0189\6\uffff\6\u01a0\32\uffff\6\u01a0",
            "\12\u01a2\1\u01a1\6\uffff\6\u01a2\32\uffff\6\u01a2",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u01a3\6\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\16"+
            "\54\1\u01a5\13\54",
            "\12\u01a6\1\u0197\6\uffff\6\u01a6\32\uffff\6\u01a6",
            "\12\u01a7\1\u01a8\6\uffff\6\u01a7\32\uffff\6\u01a7",
            "\1\u0189",
            "\12\u01a9\1\u00a0\6\uffff\6\u01a9\32\uffff\6\u01a9",
            "\12\u01aa\1\u01a1\6\uffff\6\u01aa\32\uffff\6\u01aa",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\15"+
            "\54\1\u01ac\14\54",
            "\1\u0197",
            "\12\u01ad\1\u01a8\6\uffff\6\u01ad\32\uffff\6\u01ad",
            "\12\u01ae\1\u010a\6\uffff\6\u01ae\32\uffff\6\u01ae",
            "\12\u01af\1\u01b0\6\uffff\6\u01af\32\uffff\6\u01af",
            "\12\u01b1\1\u01a1\6\uffff\6\u01b1\32\uffff\6\u01b1",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\u01b2\1\uffff"+
            "\32\54",
            "\12\u01b3\1\u01a8\6\uffff\6\u01b3\32\uffff\6\u01b3",
            "\12\u01b4\1\u01b5\6\uffff\6\u01b4\32\uffff\6\u01b4",
            "\12\u01b6\1\u01b0\6\uffff\6\u01b6\32\uffff\6\u01b6",
            "\12\u01b7\1\u00a0\6\uffff\6\u01b7\32\uffff\6\u01b7",
            "\1\u01a1",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\3\54"+
            "\1\u01b8\16\54\1\u01b9\7\54",
            "\1\u01a8",
            "\12\u01ba\1\u01b5\6\uffff\6\u01ba\32\uffff\6\u01ba",
            "\12\u01bb\1\u010a\6\uffff\6\u01bb\32\uffff\6\u01bb",
            "\12\u01bc\1\u01b0\6\uffff\6\u01bc\32\uffff\6\u01bc",
            "\12\u01be\1\u00a0\6\uffff\6\u01be\32\uffff\6\u01be",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u01bf\25\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13"+
            "\54\1\u01c0\16\54",
            "\12\u01c1\1\u01b5\6\uffff\6\u01c1\32\uffff\6\u01c1",
            "\12\u01c2\1\u01c3\6\uffff\6\u01c2\32\uffff\6\u01c2",
            "\1\u01b0",
            "",
            "\12\u01c4\1\u00a0\6\uffff\6\u01c4\32\uffff\6\u01c4",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\5\54"+
            "\1\u01c5\24\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u01c6"+
            "\31\54",
            "\1\u01b5",
            "\12\u01c7\1\u01c3\6\uffff\6\u01c7\32\uffff\6\u01c7",
            "\12\u01c8\1\u010a\6\uffff\6\u01c8\32\uffff\6\u01c8",
            "\12\u01c9\1\u00a0\6\uffff\6\u01c9\32\uffff\6\u01c9",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\u01ca"+
            "\31\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\25"+
            "\54\1\u01cb\4\54",
            "\12\u01cc\1\u01c3\6\uffff\6\u01cc\32\uffff\6\u01cc",
            "\12\u01cd\1\u01c3\6\uffff\6\u01cd\32\uffff\6\u01cd",
            "\1\u00a0",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\24"+
            "\54\1\u01ce\5\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\4\54"+
            "\1\u01cf\25\54",
            "\1\u01c3",
            "\12\u01d0\1\u01c3\6\uffff\6\u01d0\32\uffff\6\u01d0",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\13"+
            "\54\1\u01d1\16\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\22"+
            "\54\1\u01d2\7\54",
            "\12\u01d3\1\u01c3\6\uffff\6\u01d3\32\uffff\6\u01d3",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u01d4\6\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\23"+
            "\54\1\u01d5\6\54",
            "\1\u01c3",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\24"+
            "\54\1\u01d7\5\54",
            "",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\1\54"+
            "\1\u01d8\30\54",
            "\1\53\1\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32"+
            "\54",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | T__90 | T__91 | T__92 | T__93 | T__94 | COMMENT | CR | LF | WS | ASTERISK | FORWARD_SLASH | SEMICOLON | DOUBLE_QUOTE | DOUBLE_COLON | COLON | DOT | PERCENT | ONE_LINE_DOUBLE_QUOTED_STRING | YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD | NOTIFY_WORD | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD | PORT_WORD | KEY_WORD | FFFF_WORD | IP4_ADDR | IP4_SHORT_3 | IP4_SHORT_2 | NUMBER | KMG_NUMBER | DOMAIN_NAME | IP6_NORM_ADDR_BASE | IP6_SHORTLEFT_ADDR_BASE | IP6_SHORTRIGHT_ADDR_BASE | IP6_SHORTMID_ADDR_BASE | IP6_IP4COMPAT_ADDR_BASE | IP6_IP4LINK_ADDR_BASE | ALPHANUM_NONSTD | BAD );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_29 = input.LA(1);

                        s = -1;
                        if ( ((LA22_29>='\u0000' && LA22_29<='\t')||(LA22_29>='\u000B' && LA22_29<='\f')||(LA22_29>='\u000E' && LA22_29<='\uFFFF')) ) {s = 85;}

                        else s = 84;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA22_0 = input.LA(1);

                        s = -1;
                        if ( (LA22_0=='z') ) {s = 1;}

                        else if ( (LA22_0=='I') ) {s = 2;}

                        else if ( (LA22_0=='H') ) {s = 3;}

                        else if ( (LA22_0=='C') ) {s = 4;}

                        else if ( (LA22_0=='{') ) {s = 5;}

                        else if ( (LA22_0=='}') ) {s = 6;}

                        else if ( (LA22_0=='f') ) {s = 7;}

                        else if ( (LA22_0=='o') ) {s = 8;}

                        else if ( (LA22_0=='t') ) {s = 9;}

                        else if ( (LA22_0=='m') ) {s = 10;}

                        else if ( (LA22_0=='s') ) {s = 11;}

                        else if ( (LA22_0=='h') ) {s = 12;}

                        else if ( (LA22_0=='d') ) {s = 13;}

                        else if ( (LA22_0=='a') ) {s = 14;}

                        else if ( (LA22_0=='i') ) {s = 15;}

                        else if ( (LA22_0=='k') ) {s = 16;}

                        else if ( (LA22_0=='n') ) {s = 17;}

                        else if ( (LA22_0=='p') ) {s = 18;}

                        else if ( (LA22_0=='y') ) {s = 19;}

                        else if ( (LA22_0=='/') ) {s = 20;}

                        else if ( (LA22_0=='#') ) {s = 21;}

                        else if ( (LA22_0=='\r') ) {s = 22;}

                        else if ( (LA22_0=='\n') ) {s = 23;}

                        else if ( (LA22_0==' ') ) {s = 24;}

                        else if ( (LA22_0=='\t') ) {s = 25;}

                        else if ( (LA22_0=='\f') ) {s = 26;}

                        else if ( (LA22_0=='*') ) {s = 27;}

                        else if ( (LA22_0==';') ) {s = 28;}

                        else if ( (LA22_0=='\"') ) {s = 29;}

                        else if ( (LA22_0==':') ) {s = 30;}

                        else if ( (LA22_0=='.') ) {s = 31;}

                        else if ( (LA22_0=='%') ) {s = 32;}

                        else if ( ((LA22_0>='0' && LA22_0<='1')) ) {s = 33;}

                        else if ( (LA22_0=='r') ) {s = 34;}

                        else if ( (LA22_0=='u') ) {s = 35;}

                        else if ( (LA22_0=='F') ) {s = 36;}

                        else if ( ((LA22_0>='2' && LA22_0<='9')) ) {s = 37;}

                        else if ( ((LA22_0>='A' && LA22_0<='B')||(LA22_0>='D' && LA22_0<='E')||(LA22_0>='b' && LA22_0<='c')||LA22_0=='e') ) {s = 38;}

                        else if ( (LA22_0=='G'||(LA22_0>='J' && LA22_0<='Z')||LA22_0=='_'||LA22_0=='g'||LA22_0=='j'||LA22_0=='l'||LA22_0=='q'||(LA22_0>='v' && LA22_0<='x')) ) {s = 40;}

                        else if ( ((LA22_0>='\u0000' && LA22_0<='\b')||LA22_0=='\u000B'||(LA22_0>='\u000E' && LA22_0<='\u001F')||LA22_0=='!'||LA22_0=='$'||(LA22_0>='&' && LA22_0<=')')||(LA22_0>='+' && LA22_0<='-')||(LA22_0>='<' && LA22_0<='@')||(LA22_0>='[' && LA22_0<='^')||LA22_0=='`'||LA22_0=='|'||(LA22_0>='~' && LA22_0<='\uFFFF')) ) {s = 41;}

                        else s = 39;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA22_21 = input.LA(1);

                        s = -1;
                        if ( ((LA22_21>='\u0000' && LA22_21<='\uFFFF')) ) {s = 77;}

                        else s = 41;

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
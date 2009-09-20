// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-20 17:37:34

package ru.olegchir.bindconf.walker.parser.generated;
import ru.olegchir.bindconf.walker.parser.override.Bind9ParserOverrider;
import ru.olegchir.bindconf.walker.parser.override.Bind9RecognizerOverrider;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Bind9ConfigParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ST_ZONE_MASTER", "ST_ZONE_SLAVE", "ST_ZONE_HINT", "ST_ZONE_STUB", "ST_ZONE_FORWARD", "ST_ZONE_DELEGATION", "ST_ZONE_PLIST", "ST_TESTING", "ST_TESTING_PLIST", "PLIST_PARAM", "BAD", "ALPHANUM_NONSTD", "NUMBER", "KMG_NUMBER", "RANGE_WORD", "UNLIMITED_WORD", "DEFAULT_WORD", "NOTIFY_WORD", "NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD", "PORT_WORD", "KEY_WORD", "FFFF_WORD", "ZERO_OR_ONE_WORD", "YES_OR_NO_WORD", "TRUE_OR_FALSE_WORD", "SEMICOLON", "ONE_LINE_DOUBLE_QUOTED_STRING", "DOMAIN_NAME", "IP4_ADDR", "IP6_NORM_ADDR_BASE", "IP6_SHORTLEFT_ADDR_BASE", "IP6_SHORTRIGHT_ADDR_BASE", "IP6_SHORTMID_ADDR_BASE", "IP6_IP4COMPAT_ADDR_BASE", "IP6_IP4LINK_ADDR_BASE", "DOUBLE_COLON", "PERCENT", "ASTERISK", "IP4_SHORT_2", "IP4_SHORT_3", "FORWARD_SLASH", "C_COMMENT", "CPP_COMMENT", "PERL_COMMENT", "COMMENT", "NL", "CR", "LF", "WS", "DOUBLE_QUOTE", "COLON", "DOT", "THREE_DIGIT_NUMBER", "DIGIT", "FOUR_CHAR_HEXNUM", "HEXNUM_CHAR", "ALPHANUM_CHAR", "ANY_ASCII_ALPHANUM", "'zone'", "'IN'", "'HS'", "'CHAOS'", "'{'", "'}'", "'forward'", "'first'", "'only'", "'type'", "'master'", "'slave'", "'stub'", "'hint'", "'delegation-only'", "'testing'", "'acl_name'", "'domain_name'", "'ip4'", "'ip6'", "'ip'", "'ip_port'", "'ip_prefix'", "'key_id'", "'key_list'", "'number'", "'path_name'", "'port_list'", "'size_spec'", "'yes_or_no'", "'dialup_option_default'", "'dialup_option_slavestub'", "'masters_list'"
    };
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
    public static final int DEFAULT_WORD=20;
    public static final int FOUR_CHAR_HEXNUM=58;
    public static final int DOMAIN_NAME=31;
    public static final int T__71=71;
    public static final int WS=52;
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
    public static final int TRUE_OR_FALSE_WORD=28;
    public static final int IP4_SHORT_2=42;
    public static final int LF=51;

    // delegates
    // delegators


        public Bind9ConfigParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Bind9ConfigParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Bind9ConfigParser.tokenNames; }
    public String getGrammarFileName() { return "O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g"; }


    private Bind9ParserOverrider overrider;

    public Bind9ParserOverrider getOverrider() {
    	return overrider;
    }
          
    public Bind9ConfigParser(TokenStream input, RecognizerSharedState state, Bind9ParserOverrider overrider) {
    	this(input, state);
    	this.overrider = overrider;
    	this.overrider.setOwner(this);
    }

    public Bind9ConfigParser(TokenStream input, Bind9ParserOverrider overrider) {
    	this(input, new RecognizerSharedState(), overrider);
    }

        protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow)
            throws RecognitionException
        {
            RecognitionException e = null;
            if(mismatchIsUnwantedToken(input, ttype))
            {
                e = new UnwantedTokenException(ttype, input);
                beginResync();
                input.consume();
                endResync();
                reportError(e);
                Object matchedSymbol = getCurrentInputSymbol(input);
                input.consume();
                
                this.overrider.registerSemanticError("unwanted single token",e);
                
                return matchedSymbol;
            }
            if(mismatchIsMissingToken(input, follow))
            {
                Object inserted = getMissingSymbol(input, e, ttype, follow);
                e = new MissingTokenException(ttype, input, inserted);
                reportError(e);
                
                this.overrider.registerSemanticError("missing single token",e);
                
                return inserted;
            } else
            {
                e = new MismatchedTokenException(ttype, input);
                
                this.overrider.registerSemanticError("single match error",e);
                
                throw e;
            }
        }  
        
    public Object recoverFromMismatchedSet(IntStream input, RecognitionException e, BitSet follow)
            throws RecognitionException
        {    	
            if(mismatchIsMissingToken(input, follow))
            {
                reportError(e);
                
                this.overrider.registerSemanticError("missing set token", e);
                
                return getMissingSymbol(input, e, 0, follow);
            } else
            {
                this.overrider.registerSemanticError("set match error",e);
                
                throw e;
            }
        }
        
    public void emitErrorMessage(String msg) {
    	this.getOverrider().getSystemStackTrace().add(msg);
    	if (this.getOverrider().getErrorReportingVisibility() == Bind9RecognizerOverrider.ERROR_REPORTING_VERBOSE) {
                System.err.println(msg);
            }
    }


    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:177:1: list : ( ( entity )* | ( BAD )+ );
    public final Bind9ConfigParser.list_return list() throws RecognitionException {
        Bind9ConfigParser.list_return retval = new Bind9ConfigParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BAD2=null;
        Bind9ConfigParser.entity_return entity1 = null;


        Object BAD2_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:177:6: ( ( entity )* | ( BAD )+ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||LA3_0==62||LA3_0==77) ) {
                alt3=1;
            }
            else if ( (LA3_0==BAD) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:177:8: ( entity )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:177:8: ( entity )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==62||LA1_0==77) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:177:8: entity
                    	    {
                    	    pushFollow(FOLLOW_entity_in_list105);
                    	    entity1=entity();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, entity1.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:178:4: ( BAD )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:178:4: ( BAD )+
                    int cnt2=0;
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==BAD) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:178:4: BAD
                    	    {
                    	    BAD2=(Token)match(input,BAD,FOLLOW_BAD_in_list111); 
                    	    BAD2_tree = (Object)adaptor.create(BAD2);
                    	    adaptor.addChild(root_0, BAD2_tree);


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
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class entity_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entity"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:180:1: entity : ( zone | testing );
    public final Bind9ConfigParser.entity_return entity() throws RecognitionException {
        Bind9ConfigParser.entity_return retval = new Bind9ConfigParser.entity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.zone_return zone3 = null;

        Bind9ConfigParser.testing_return testing4 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:180:8: ( zone | testing )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==62) ) {
                alt4=1;
            }
            else if ( (LA4_0==77) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:180:10: zone
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_zone_in_entity121);
                    zone3=zone();

                    state._fsp--;

                    adaptor.addChild(root_0, zone3.getTree());

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:181:4: testing
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_in_entity126);
                    testing4=testing();

                    state._fsp--;

                    adaptor.addChild(root_0, testing4.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entity"

    public static class zone_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:185:1: zone : ( 'zone' zone_name ( zone_class )? zone_forward_block -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block ) | 'zone' zone_name ( zone_class )? zone_delegation_block -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? ) );
    public final Bind9ConfigParser.zone_return zone() throws RecognitionException {
        Bind9ConfigParser.zone_return retval = new Bind9ConfigParser.zone_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal5=null;
        Token string_literal9=null;
        Bind9ConfigParser.zone_name_return zone_name6 = null;

        Bind9ConfigParser.zone_class_return zone_class7 = null;

        Bind9ConfigParser.zone_forward_block_return zone_forward_block8 = null;

        Bind9ConfigParser.zone_name_return zone_name10 = null;

        Bind9ConfigParser.zone_class_return zone_class11 = null;

        Bind9ConfigParser.zone_delegation_block_return zone_delegation_block12 = null;


        Object string_literal5_tree=null;
        Object string_literal9_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_zone_forward_block=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_block");
        RewriteRuleSubtreeStream stream_zone_class=new RewriteRuleSubtreeStream(adaptor,"rule zone_class");
        RewriteRuleSubtreeStream stream_zone_name=new RewriteRuleSubtreeStream(adaptor,"rule zone_name");
        RewriteRuleSubtreeStream stream_zone_delegation_block=new RewriteRuleSubtreeStream(adaptor,"rule zone_delegation_block");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:2: ( 'zone' zone_name ( zone_class )? zone_forward_block -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block ) | 'zone' zone_name ( zone_class )? zone_delegation_block -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? ) )
            int alt7=2;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:4: 'zone' zone_name ( zone_class )? zone_forward_block
                    {
                    string_literal5=(Token)match(input,62,FOLLOW_62_in_zone139);  
                    stream_62.add(string_literal5);

                    pushFollow(FOLLOW_zone_name_in_zone141);
                    zone_name6=zone_name();

                    state._fsp--;

                    stream_zone_name.add(zone_name6.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:21: ( zone_class )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=63 && LA5_0<=65)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:21: zone_class
                            {
                            pushFollow(FOLLOW_zone_class_in_zone143);
                            zone_class7=zone_class();

                            state._fsp--;

                            stream_zone_class.add(zone_class7.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_zone_forward_block_in_zone146);
                    zone_forward_block8=zone_forward_block();

                    state._fsp--;

                    stream_zone_forward_block.add(zone_forward_block8.getTree());


                    // AST REWRITE
                    // elements: zone_forward_block, zone_name, zone_class
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 186:53: -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block )
                    {
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:56: ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_ZONE_FORWARD, "ST_ZONE_FORWARD"), root_1);

                        adaptor.addChild(root_1, stream_zone_name.nextTree());
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:84: ( zone_class )?
                        if ( stream_zone_class.hasNext() ) {
                            adaptor.addChild(root_1, stream_zone_class.nextTree());

                        }
                        stream_zone_class.reset();
                        adaptor.addChild(root_1, stream_zone_forward_block.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:187:4: 'zone' zone_name ( zone_class )? zone_delegation_block
                    {
                    string_literal9=(Token)match(input,62,FOLLOW_62_in_zone166);  
                    stream_62.add(string_literal9);

                    pushFollow(FOLLOW_zone_name_in_zone168);
                    zone_name10=zone_name();

                    state._fsp--;

                    stream_zone_name.add(zone_name10.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:187:21: ( zone_class )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=63 && LA6_0<=65)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:187:21: zone_class
                            {
                            pushFollow(FOLLOW_zone_class_in_zone170);
                            zone_class11=zone_class();

                            state._fsp--;

                            stream_zone_class.add(zone_class11.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_zone_delegation_block_in_zone173);
                    zone_delegation_block12=zone_delegation_block();

                    state._fsp--;

                    stream_zone_delegation_block.add(zone_delegation_block12.getTree());


                    // AST REWRITE
                    // elements: zone_name, zone_class
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 187:56: -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? )
                    {
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:187:59: ^( ST_ZONE_DELEGATION zone_name ( zone_class )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_ZONE_DELEGATION, "ST_ZONE_DELEGATION"), root_1);

                        adaptor.addChild(root_1, stream_zone_name.nextTree());
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:187:90: ( zone_class )?
                        if ( stream_zone_class.hasNext() ) {
                            adaptor.addChild(root_1, stream_zone_class.nextTree());

                        }
                        stream_zone_class.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone"

    public static class zone_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:190:1: zone_name : lex_identifier ;
    public final Bind9ConfigParser.zone_name_return zone_name() throws RecognitionException {
        Bind9ConfigParser.zone_name_return retval = new Bind9ConfigParser.zone_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.lex_identifier_return lex_identifier13 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:191:2: ( lex_identifier )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:191:4: lex_identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lex_identifier_in_zone_name196);
            lex_identifier13=lex_identifier();

            state._fsp--;

            adaptor.addChild(root_0, lex_identifier13.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_name"

    public static class zone_class_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_class"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:194:1: zone_class : ( 'IN' | 'HS' | 'CHAOS' );
    public final Bind9ConfigParser.zone_class_return zone_class() throws RecognitionException {
        Bind9ConfigParser.zone_class_return retval = new Bind9ConfigParser.zone_class_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set14=null;

        Object set14_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:195:2: ( 'IN' | 'HS' | 'CHAOS' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set14=(Token)input.LT(1);
            if ( (input.LA(1)>=63 && input.LA(1)<=65) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set14));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_class"

    public static class zone_forward_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_forward_block"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:199:1: zone_forward_block : pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}' -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* ) ;
    public final Bind9ConfigParser.zone_forward_block_return zone_forward_block() throws RecognitionException {
        Bind9ConfigParser.zone_forward_block_return retval = new Bind9ConfigParser.zone_forward_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token pl=null;
        Token char_literal17=null;
        Bind9ConfigParser.zone_type_forward_return zone_type_forward15 = null;

        Bind9ConfigParser.zone_forward_param_return zone_forward_param16 = null;


        Object pl_tree=null;
        Object char_literal17_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleSubtreeStream stream_zone_type_forward=new RewriteRuleSubtreeStream(adaptor,"rule zone_type_forward");
        RewriteRuleSubtreeStream stream_zone_forward_param=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_param");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:2: (pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}' -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:4: pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}'
            {
            pl=(Token)match(input,66,FOLLOW_66_in_zone_forward_block228);  
            stream_66.add(pl);

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:13: ( zone_type_forward ( zone_forward_param )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:14: zone_type_forward ( zone_forward_param )*
            {
            pushFollow(FOLLOW_zone_type_forward_in_zone_forward_block231);
            zone_type_forward15=zone_type_forward();

            state._fsp--;

            stream_zone_type_forward.add(zone_type_forward15.getTree());
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:32: ( zone_forward_param )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==68) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:32: zone_forward_param
            	    {
            	    pushFollow(FOLLOW_zone_forward_param_in_zone_forward_block233);
            	    zone_forward_param16=zone_forward_param();

            	    state._fsp--;

            	    stream_zone_forward_param.add(zone_forward_param16.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            char_literal17=(Token)match(input,67,FOLLOW_67_in_zone_forward_block236);  
            stream_67.add(char_literal17);



            // AST REWRITE
            // elements: zone_type_forward, zone_forward_param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 200:56: -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:59: ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_ZONE_PLIST, pl, "ST_ZONE_PLIST"), root_1);

                adaptor.addChild(root_1, stream_zone_type_forward.nextTree());
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:114: ( zone_forward_param )*
                while ( stream_zone_forward_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_zone_forward_param.nextTree());

                }
                stream_zone_forward_param.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_forward_block"

    public static class zone_forward_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_forward_param"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:202:1: zone_forward_param : zone_forward_switch_def ;
    public final Bind9ConfigParser.zone_forward_param_return zone_forward_param() throws RecognitionException {
        Bind9ConfigParser.zone_forward_param_return retval = new Bind9ConfigParser.zone_forward_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.zone_forward_switch_def_return zone_forward_switch_def18 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:203:2: ( zone_forward_switch_def )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:203:4: zone_forward_switch_def
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_zone_forward_switch_def_in_zone_forward_param258);
            zone_forward_switch_def18=zone_forward_switch_def();

            state._fsp--;

            adaptor.addChild(root_0, zone_forward_switch_def18.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_forward_param"

    public static class zone_delegation_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_delegation_block"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:205:1: zone_delegation_block : '{' zone_type_delegation '}' ;
    public final Bind9ConfigParser.zone_delegation_block_return zone_delegation_block() throws RecognitionException {
        Bind9ConfigParser.zone_delegation_block_return retval = new Bind9ConfigParser.zone_delegation_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal19=null;
        Token char_literal21=null;
        Bind9ConfigParser.zone_type_delegation_return zone_type_delegation20 = null;


        Object char_literal19_tree=null;
        Object char_literal21_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:206:2: ( '{' zone_type_delegation '}' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:206:4: '{' zone_type_delegation '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal19=(Token)match(input,66,FOLLOW_66_in_zone_delegation_block268); 
            char_literal19_tree = (Object)adaptor.create(char_literal19);
            adaptor.addChild(root_0, char_literal19_tree);

            pushFollow(FOLLOW_zone_type_delegation_in_zone_delegation_block270);
            zone_type_delegation20=zone_type_delegation();

            state._fsp--;

            adaptor.addChild(root_0, zone_type_delegation20.getTree());
            char_literal21=(Token)match(input,67,FOLLOW_67_in_zone_delegation_block272); 
            char_literal21_tree = (Object)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_delegation_block"

    public static class zone_forward_switch_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_forward_switch_def"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:211:1: zone_forward_switch_def : 'forward' zone_forward_switch ';' -> ^( PLIST_PARAM 'forward' zone_forward_switch ) ;
    public final Bind9ConfigParser.zone_forward_switch_def_return zone_forward_switch_def() throws RecognitionException {
        Bind9ConfigParser.zone_forward_switch_def_return retval = new Bind9ConfigParser.zone_forward_switch_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal22=null;
        Token char_literal24=null;
        Bind9ConfigParser.zone_forward_switch_return zone_forward_switch23 = null;


        Object string_literal22_tree=null;
        Object char_literal24_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_zone_forward_switch=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_switch");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:212:2: ( 'forward' zone_forward_switch ';' -> ^( PLIST_PARAM 'forward' zone_forward_switch ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:212:4: 'forward' zone_forward_switch ';'
            {
            string_literal22=(Token)match(input,68,FOLLOW_68_in_zone_forward_switch_def285);  
            stream_68.add(string_literal22);

            pushFollow(FOLLOW_zone_forward_switch_in_zone_forward_switch_def287);
            zone_forward_switch23=zone_forward_switch();

            state._fsp--;

            stream_zone_forward_switch.add(zone_forward_switch23.getTree());
            char_literal24=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_forward_switch_def289);  
            stream_SEMICOLON.add(char_literal24);



            // AST REWRITE
            // elements: 68, zone_forward_switch
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 212:38: -> ^( PLIST_PARAM 'forward' zone_forward_switch )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:212:41: ^( PLIST_PARAM 'forward' zone_forward_switch )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_68.nextNode());
                adaptor.addChild(root_1, stream_zone_forward_switch.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_forward_switch_def"

    public static class zone_forward_switch_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_forward_switch"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:214:1: zone_forward_switch : ( 'first' | 'only' );
    public final Bind9ConfigParser.zone_forward_switch_return zone_forward_switch() throws RecognitionException {
        Bind9ConfigParser.zone_forward_switch_return retval = new Bind9ConfigParser.zone_forward_switch_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set25=null;

        Object set25_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:215:2: ( 'first' | 'only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set25=(Token)input.LT(1);
            if ( (input.LA(1)>=69 && input.LA(1)<=70) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set25));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_forward_switch"

    public static class zone_type_master_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_type_master"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:220:1: zone_type_master : 'type' 'master' ';' -> 'master' ;
    public final Bind9ConfigParser.zone_type_master_return zone_type_master() throws RecognitionException {
        Bind9ConfigParser.zone_type_master_return retval = new Bind9ConfigParser.zone_type_master_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal26=null;
        Token string_literal27=null;
        Token char_literal28=null;

        Object string_literal26_tree=null;
        Object string_literal27_tree=null;
        Object char_literal28_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:221:2: ( 'type' 'master' ';' -> 'master' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:221:4: 'type' 'master' ';'
            {
            string_literal26=(Token)match(input,71,FOLLOW_71_in_zone_type_master327);  
            stream_71.add(string_literal26);

            string_literal27=(Token)match(input,72,FOLLOW_72_in_zone_type_master329);  
            stream_72.add(string_literal27);

            char_literal28=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_master331);  
            stream_SEMICOLON.add(char_literal28);



            // AST REWRITE
            // elements: 72
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 221:24: -> 'master'
            {
                adaptor.addChild(root_0, stream_72.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_type_master"

    public static class zone_type_slave_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_type_slave"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:223:1: zone_type_slave : 'type' 'slave' ';' -> 'slave' ;
    public final Bind9ConfigParser.zone_type_slave_return zone_type_slave() throws RecognitionException {
        Bind9ConfigParser.zone_type_slave_return retval = new Bind9ConfigParser.zone_type_slave_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal29=null;
        Token string_literal30=null;
        Token char_literal31=null;

        Object string_literal29_tree=null;
        Object string_literal30_tree=null;
        Object char_literal31_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:224:2: ( 'type' 'slave' ';' -> 'slave' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:224:4: 'type' 'slave' ';'
            {
            string_literal29=(Token)match(input,71,FOLLOW_71_in_zone_type_slave345);  
            stream_71.add(string_literal29);

            string_literal30=(Token)match(input,73,FOLLOW_73_in_zone_type_slave347);  
            stream_73.add(string_literal30);

            char_literal31=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_slave349);  
            stream_SEMICOLON.add(char_literal31);



            // AST REWRITE
            // elements: 73
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 224:23: -> 'slave'
            {
                adaptor.addChild(root_0, stream_73.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_type_slave"

    public static class zone_type_stub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_type_stub"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:226:1: zone_type_stub : 'type' 'stub' ';' -> 'stub' ;
    public final Bind9ConfigParser.zone_type_stub_return zone_type_stub() throws RecognitionException {
        Bind9ConfigParser.zone_type_stub_return retval = new Bind9ConfigParser.zone_type_stub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal32=null;
        Token string_literal33=null;
        Token char_literal34=null;

        Object string_literal32_tree=null;
        Object string_literal33_tree=null;
        Object char_literal34_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:227:2: ( 'type' 'stub' ';' -> 'stub' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:227:4: 'type' 'stub' ';'
            {
            string_literal32=(Token)match(input,71,FOLLOW_71_in_zone_type_stub363);  
            stream_71.add(string_literal32);

            string_literal33=(Token)match(input,74,FOLLOW_74_in_zone_type_stub365);  
            stream_74.add(string_literal33);

            char_literal34=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_stub367);  
            stream_SEMICOLON.add(char_literal34);



            // AST REWRITE
            // elements: 74
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 227:22: -> 'stub'
            {
                adaptor.addChild(root_0, stream_74.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_type_stub"

    public static class zone_type_forward_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_type_forward"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:229:1: zone_type_forward : 'type' 'forward' ';' -> 'forward' ;
    public final Bind9ConfigParser.zone_type_forward_return zone_type_forward() throws RecognitionException {
        Bind9ConfigParser.zone_type_forward_return retval = new Bind9ConfigParser.zone_type_forward_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal35=null;
        Token string_literal36=null;
        Token char_literal37=null;

        Object string_literal35_tree=null;
        Object string_literal36_tree=null;
        Object char_literal37_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:230:2: ( 'type' 'forward' ';' -> 'forward' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:230:4: 'type' 'forward' ';'
            {
            string_literal35=(Token)match(input,71,FOLLOW_71_in_zone_type_forward381);  
            stream_71.add(string_literal35);

            string_literal36=(Token)match(input,68,FOLLOW_68_in_zone_type_forward383);  
            stream_68.add(string_literal36);

            char_literal37=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_forward385);  
            stream_SEMICOLON.add(char_literal37);



            // AST REWRITE
            // elements: 68
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 230:25: -> 'forward'
            {
                adaptor.addChild(root_0, stream_68.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_type_forward"

    public static class zone_type_hint_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_type_hint"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:232:1: zone_type_hint : 'type' 'hint' ';' -> 'hint' ;
    public final Bind9ConfigParser.zone_type_hint_return zone_type_hint() throws RecognitionException {
        Bind9ConfigParser.zone_type_hint_return retval = new Bind9ConfigParser.zone_type_hint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal38=null;
        Token string_literal39=null;
        Token char_literal40=null;

        Object string_literal38_tree=null;
        Object string_literal39_tree=null;
        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:233:2: ( 'type' 'hint' ';' -> 'hint' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:233:4: 'type' 'hint' ';'
            {
            string_literal38=(Token)match(input,71,FOLLOW_71_in_zone_type_hint399);  
            stream_71.add(string_literal38);

            string_literal39=(Token)match(input,75,FOLLOW_75_in_zone_type_hint401);  
            stream_75.add(string_literal39);

            char_literal40=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_hint403);  
            stream_SEMICOLON.add(char_literal40);



            // AST REWRITE
            // elements: 75
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 233:22: -> 'hint'
            {
                adaptor.addChild(root_0, stream_75.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_type_hint"

    public static class zone_type_delegation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_type_delegation"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:235:1: zone_type_delegation : 'type' 'delegation-only' ';' -> 'delegation-only' ;
    public final Bind9ConfigParser.zone_type_delegation_return zone_type_delegation() throws RecognitionException {
        Bind9ConfigParser.zone_type_delegation_return retval = new Bind9ConfigParser.zone_type_delegation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal41=null;
        Token string_literal42=null;
        Token char_literal43=null;

        Object string_literal41_tree=null;
        Object string_literal42_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:236:2: ( 'type' 'delegation-only' ';' -> 'delegation-only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:236:4: 'type' 'delegation-only' ';'
            {
            string_literal41=(Token)match(input,71,FOLLOW_71_in_zone_type_delegation417);  
            stream_71.add(string_literal41);

            string_literal42=(Token)match(input,76,FOLLOW_76_in_zone_type_delegation419);  
            stream_76.add(string_literal42);

            char_literal43=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_delegation421);  
            stream_SEMICOLON.add(char_literal43);



            // AST REWRITE
            // elements: 76
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 236:33: -> 'delegation-only'
            {
                adaptor.addChild(root_0, stream_76.nextNode());

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "zone_type_delegation"

    public static class testing_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:240:1: testing : 'testing' testing_block -> ^( ST_TESTING testing_block ) ;
    public final Bind9ConfigParser.testing_return testing() throws RecognitionException {
        Bind9ConfigParser.testing_return retval = new Bind9ConfigParser.testing_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal44=null;
        Bind9ConfigParser.testing_block_return testing_block45 = null;


        Object string_literal44_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleSubtreeStream stream_testing_block=new RewriteRuleSubtreeStream(adaptor,"rule testing_block");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:240:9: ( 'testing' testing_block -> ^( ST_TESTING testing_block ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:240:11: 'testing' testing_block
            {
            string_literal44=(Token)match(input,77,FOLLOW_77_in_testing437);  
            stream_77.add(string_literal44);

            pushFollow(FOLLOW_testing_block_in_testing439);
            testing_block45=testing_block();

            state._fsp--;

            stream_testing_block.add(testing_block45.getTree());


            // AST REWRITE
            // elements: testing_block
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 240:35: -> ^( ST_TESTING testing_block )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:240:38: ^( ST_TESTING testing_block )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_TESTING, "ST_TESTING"), root_1);

                adaptor.addChild(root_1, stream_testing_block.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing"

    public static class testing_block_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_block"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:242:1: testing_block : pl= '{' ( ( testing_param )* ) '}' -> ^( ST_TESTING_PLIST[$pl,\"ST_TESTING_PLIST\"] ( testing_param )* ) ;
    public final Bind9ConfigParser.testing_block_return testing_block() throws RecognitionException {
        Bind9ConfigParser.testing_block_return retval = new Bind9ConfigParser.testing_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token pl=null;
        Token char_literal47=null;
        Bind9ConfigParser.testing_param_return testing_param46 = null;


        Object pl_tree=null;
        Object char_literal47_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleSubtreeStream stream_testing_param=new RewriteRuleSubtreeStream(adaptor,"rule testing_param");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:2: (pl= '{' ( ( testing_param )* ) '}' -> ^( ST_TESTING_PLIST[$pl,\"ST_TESTING_PLIST\"] ( testing_param )* ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:4: pl= '{' ( ( testing_param )* ) '}'
            {
            pl=(Token)match(input,66,FOLLOW_66_in_testing_block461);  
            stream_66.add(pl);

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:13: ( ( testing_param )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:14: ( testing_param )*
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:14: ( testing_param )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=78 && LA9_0<=94)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:14: testing_param
            	    {
            	    pushFollow(FOLLOW_testing_param_in_testing_block464);
            	    testing_param46=testing_param();

            	    state._fsp--;

            	    stream_testing_param.add(testing_param46.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            char_literal47=(Token)match(input,67,FOLLOW_67_in_testing_block467);  
            stream_67.add(char_literal47);



            // AST REWRITE
            // elements: testing_param
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 243:33: -> ^( ST_TESTING_PLIST[$pl,\"ST_TESTING_PLIST\"] ( testing_param )* )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:36: ^( ST_TESTING_PLIST[$pl,\"ST_TESTING_PLIST\"] ( testing_param )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_TESTING_PLIST, pl, "ST_TESTING_PLIST"), root_1);

                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:79: ( testing_param )*
                while ( stream_testing_param.hasNext() ) {
                    adaptor.addChild(root_1, stream_testing_param.nextTree());

                }
                stream_testing_param.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_block"

    public static class testing_param_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_param"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:245:1: testing_param : ( testing_element_domain_name | testing_element_acl | testing_element_ip4 | testing_element_ip6 | testing_element_ip | testing_element_ip_port | testing_element_ip_prefix | testing_element_key_id | testing_element_key_list | testing_element_number | testing_element_path_name | testing_element_port_list | testing_element_size_spec | testing_element_yes_or_no | testing_element_dialup_option_default | testing_element_dialup_option_slavestub | testing_element_masters_list );
    public final Bind9ConfigParser.testing_param_return testing_param() throws RecognitionException {
        Bind9ConfigParser.testing_param_return retval = new Bind9ConfigParser.testing_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.testing_element_domain_name_return testing_element_domain_name48 = null;

        Bind9ConfigParser.testing_element_acl_return testing_element_acl49 = null;

        Bind9ConfigParser.testing_element_ip4_return testing_element_ip450 = null;

        Bind9ConfigParser.testing_element_ip6_return testing_element_ip651 = null;

        Bind9ConfigParser.testing_element_ip_return testing_element_ip52 = null;

        Bind9ConfigParser.testing_element_ip_port_return testing_element_ip_port53 = null;

        Bind9ConfigParser.testing_element_ip_prefix_return testing_element_ip_prefix54 = null;

        Bind9ConfigParser.testing_element_key_id_return testing_element_key_id55 = null;

        Bind9ConfigParser.testing_element_key_list_return testing_element_key_list56 = null;

        Bind9ConfigParser.testing_element_number_return testing_element_number57 = null;

        Bind9ConfigParser.testing_element_path_name_return testing_element_path_name58 = null;

        Bind9ConfigParser.testing_element_port_list_return testing_element_port_list59 = null;

        Bind9ConfigParser.testing_element_size_spec_return testing_element_size_spec60 = null;

        Bind9ConfigParser.testing_element_yes_or_no_return testing_element_yes_or_no61 = null;

        Bind9ConfigParser.testing_element_dialup_option_default_return testing_element_dialup_option_default62 = null;

        Bind9ConfigParser.testing_element_dialup_option_slavestub_return testing_element_dialup_option_slavestub63 = null;

        Bind9ConfigParser.testing_element_masters_list_return testing_element_masters_list64 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:246:2: ( testing_element_domain_name | testing_element_acl | testing_element_ip4 | testing_element_ip6 | testing_element_ip | testing_element_ip_port | testing_element_ip_prefix | testing_element_key_id | testing_element_key_list | testing_element_number | testing_element_path_name | testing_element_port_list | testing_element_size_spec | testing_element_yes_or_no | testing_element_dialup_option_default | testing_element_dialup_option_slavestub | testing_element_masters_list )
            int alt10=17;
            switch ( input.LA(1) ) {
            case 79:
                {
                alt10=1;
                }
                break;
            case 78:
                {
                alt10=2;
                }
                break;
            case 80:
                {
                alt10=3;
                }
                break;
            case 81:
                {
                alt10=4;
                }
                break;
            case 82:
                {
                alt10=5;
                }
                break;
            case 83:
                {
                alt10=6;
                }
                break;
            case 84:
                {
                alt10=7;
                }
                break;
            case 85:
                {
                alt10=8;
                }
                break;
            case 86:
                {
                alt10=9;
                }
                break;
            case 87:
                {
                alt10=10;
                }
                break;
            case 88:
                {
                alt10=11;
                }
                break;
            case 89:
                {
                alt10=12;
                }
                break;
            case 90:
                {
                alt10=13;
                }
                break;
            case 91:
                {
                alt10=14;
                }
                break;
            case 92:
                {
                alt10=15;
                }
                break;
            case 93:
                {
                alt10=16;
                }
                break;
            case 94:
                {
                alt10=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:246:4: testing_element_domain_name
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_domain_name_in_testing_param487);
                    testing_element_domain_name48=testing_element_domain_name();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_domain_name48.getTree());

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:4: testing_element_acl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_acl_in_testing_param492);
                    testing_element_acl49=testing_element_acl();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_acl49.getTree());

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:248:4: testing_element_ip4
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_ip4_in_testing_param497);
                    testing_element_ip450=testing_element_ip4();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_ip450.getTree());

                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:249:4: testing_element_ip6
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_ip6_in_testing_param502);
                    testing_element_ip651=testing_element_ip6();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_ip651.getTree());

                    }
                    break;
                case 5 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:250:4: testing_element_ip
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_ip_in_testing_param507);
                    testing_element_ip52=testing_element_ip();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_ip52.getTree());

                    }
                    break;
                case 6 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:251:4: testing_element_ip_port
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_ip_port_in_testing_param512);
                    testing_element_ip_port53=testing_element_ip_port();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_ip_port53.getTree());

                    }
                    break;
                case 7 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:252:4: testing_element_ip_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_ip_prefix_in_testing_param517);
                    testing_element_ip_prefix54=testing_element_ip_prefix();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_ip_prefix54.getTree());

                    }
                    break;
                case 8 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:253:4: testing_element_key_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_key_id_in_testing_param522);
                    testing_element_key_id55=testing_element_key_id();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_key_id55.getTree());

                    }
                    break;
                case 9 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:254:4: testing_element_key_list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_key_list_in_testing_param527);
                    testing_element_key_list56=testing_element_key_list();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_key_list56.getTree());

                    }
                    break;
                case 10 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:255:4: testing_element_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_number_in_testing_param532);
                    testing_element_number57=testing_element_number();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_number57.getTree());

                    }
                    break;
                case 11 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:256:4: testing_element_path_name
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_path_name_in_testing_param537);
                    testing_element_path_name58=testing_element_path_name();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_path_name58.getTree());

                    }
                    break;
                case 12 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:257:4: testing_element_port_list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_port_list_in_testing_param542);
                    testing_element_port_list59=testing_element_port_list();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_port_list59.getTree());

                    }
                    break;
                case 13 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:258:4: testing_element_size_spec
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_size_spec_in_testing_param547);
                    testing_element_size_spec60=testing_element_size_spec();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_size_spec60.getTree());

                    }
                    break;
                case 14 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:259:4: testing_element_yes_or_no
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_yes_or_no_in_testing_param552);
                    testing_element_yes_or_no61=testing_element_yes_or_no();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_yes_or_no61.getTree());

                    }
                    break;
                case 15 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:260:4: testing_element_dialup_option_default
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_dialup_option_default_in_testing_param557);
                    testing_element_dialup_option_default62=testing_element_dialup_option_default();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_dialup_option_default62.getTree());

                    }
                    break;
                case 16 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:261:4: testing_element_dialup_option_slavestub
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_dialup_option_slavestub_in_testing_param562);
                    testing_element_dialup_option_slavestub63=testing_element_dialup_option_slavestub();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_dialup_option_slavestub63.getTree());

                    }
                    break;
                case 17 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:262:4: testing_element_masters_list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_masters_list_in_testing_param567);
                    testing_element_masters_list64=testing_element_masters_list();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_masters_list64.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_param"

    public static class testing_element_acl_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_acl"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:1: testing_element_acl : 'acl_name' el_acl_name ';' -> ^( PLIST_PARAM 'acl_name' el_acl_name ) ;
    public final Bind9ConfigParser.testing_element_acl_return testing_element_acl() throws RecognitionException {
        Bind9ConfigParser.testing_element_acl_return retval = new Bind9ConfigParser.testing_element_acl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal65=null;
        Token char_literal67=null;
        Bind9ConfigParser.el_acl_name_return el_acl_name66 = null;


        Object string_literal65_tree=null;
        Object char_literal67_tree=null;
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_el_acl_name=new RewriteRuleSubtreeStream(adaptor,"rule el_acl_name");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:265:2: ( 'acl_name' el_acl_name ';' -> ^( PLIST_PARAM 'acl_name' el_acl_name ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:265:4: 'acl_name' el_acl_name ';'
            {
            string_literal65=(Token)match(input,78,FOLLOW_78_in_testing_element_acl577);  
            stream_78.add(string_literal65);

            pushFollow(FOLLOW_el_acl_name_in_testing_element_acl579);
            el_acl_name66=el_acl_name();

            state._fsp--;

            stream_el_acl_name.add(el_acl_name66.getTree());
            char_literal67=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_acl581);  
            stream_SEMICOLON.add(char_literal67);



            // AST REWRITE
            // elements: el_acl_name, 78
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 265:31: -> ^( PLIST_PARAM 'acl_name' el_acl_name )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:265:34: ^( PLIST_PARAM 'acl_name' el_acl_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_78.nextNode());
                adaptor.addChild(root_1, stream_el_acl_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_acl"

    public static class testing_element_domain_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_domain_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:267:1: testing_element_domain_name : 'domain_name' el_domain_name ';' -> ^( PLIST_PARAM 'domain_name' el_domain_name ) ;
    public final Bind9ConfigParser.testing_element_domain_name_return testing_element_domain_name() throws RecognitionException {
        Bind9ConfigParser.testing_element_domain_name_return retval = new Bind9ConfigParser.testing_element_domain_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal68=null;
        Token char_literal70=null;
        Bind9ConfigParser.el_domain_name_return el_domain_name69 = null;


        Object string_literal68_tree=null;
        Object char_literal70_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_el_domain_name=new RewriteRuleSubtreeStream(adaptor,"rule el_domain_name");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:268:2: ( 'domain_name' el_domain_name ';' -> ^( PLIST_PARAM 'domain_name' el_domain_name ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:268:4: 'domain_name' el_domain_name ';'
            {
            string_literal68=(Token)match(input,79,FOLLOW_79_in_testing_element_domain_name601);  
            stream_79.add(string_literal68);

            pushFollow(FOLLOW_el_domain_name_in_testing_element_domain_name603);
            el_domain_name69=el_domain_name();

            state._fsp--;

            stream_el_domain_name.add(el_domain_name69.getTree());
            char_literal70=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_domain_name605);  
            stream_SEMICOLON.add(char_literal70);



            // AST REWRITE
            // elements: 79, el_domain_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 268:37: -> ^( PLIST_PARAM 'domain_name' el_domain_name )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:268:40: ^( PLIST_PARAM 'domain_name' el_domain_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_79.nextNode());
                adaptor.addChild(root_1, stream_el_domain_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_domain_name"

    public static class testing_element_ip4_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_ip4"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:270:1: testing_element_ip4 : 'ip4' el_ip4_addr ';' -> ^( PLIST_PARAM 'ip4' el_ip4_addr ) ;
    public final Bind9ConfigParser.testing_element_ip4_return testing_element_ip4() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip4_return retval = new Bind9ConfigParser.testing_element_ip4_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal71=null;
        Token char_literal73=null;
        Bind9ConfigParser.el_ip4_addr_return el_ip4_addr72 = null;


        Object string_literal71_tree=null;
        Object char_literal73_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleSubtreeStream stream_el_ip4_addr=new RewriteRuleSubtreeStream(adaptor,"rule el_ip4_addr");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:271:2: ( 'ip4' el_ip4_addr ';' -> ^( PLIST_PARAM 'ip4' el_ip4_addr ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:271:4: 'ip4' el_ip4_addr ';'
            {
            string_literal71=(Token)match(input,80,FOLLOW_80_in_testing_element_ip4625);  
            stream_80.add(string_literal71);

            pushFollow(FOLLOW_el_ip4_addr_in_testing_element_ip4627);
            el_ip4_addr72=el_ip4_addr();

            state._fsp--;

            stream_el_ip4_addr.add(el_ip4_addr72.getTree());
            char_literal73=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_ip4629);  
            stream_SEMICOLON.add(char_literal73);



            // AST REWRITE
            // elements: el_ip4_addr, 80
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 271:26: -> ^( PLIST_PARAM 'ip4' el_ip4_addr )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:271:29: ^( PLIST_PARAM 'ip4' el_ip4_addr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_80.nextNode());
                adaptor.addChild(root_1, stream_el_ip4_addr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_ip4"

    public static class testing_element_ip6_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_ip6"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:273:1: testing_element_ip6 : 'ip6' el_ip6_addr ';' -> ^( PLIST_PARAM 'ip6' el_ip6_addr ) ;
    public final Bind9ConfigParser.testing_element_ip6_return testing_element_ip6() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip6_return retval = new Bind9ConfigParser.testing_element_ip6_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal74=null;
        Token char_literal76=null;
        Bind9ConfigParser.el_ip6_addr_return el_ip6_addr75 = null;


        Object string_literal74_tree=null;
        Object char_literal76_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_el_ip6_addr=new RewriteRuleSubtreeStream(adaptor,"rule el_ip6_addr");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:2: ( 'ip6' el_ip6_addr ';' -> ^( PLIST_PARAM 'ip6' el_ip6_addr ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:4: 'ip6' el_ip6_addr ';'
            {
            string_literal74=(Token)match(input,81,FOLLOW_81_in_testing_element_ip6649);  
            stream_81.add(string_literal74);

            pushFollow(FOLLOW_el_ip6_addr_in_testing_element_ip6651);
            el_ip6_addr75=el_ip6_addr();

            state._fsp--;

            stream_el_ip6_addr.add(el_ip6_addr75.getTree());
            char_literal76=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_ip6653);  
            stream_SEMICOLON.add(char_literal76);



            // AST REWRITE
            // elements: 81, el_ip6_addr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 274:26: -> ^( PLIST_PARAM 'ip6' el_ip6_addr )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:29: ^( PLIST_PARAM 'ip6' el_ip6_addr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_81.nextNode());
                adaptor.addChild(root_1, stream_el_ip6_addr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_ip6"

    public static class testing_element_ip_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_ip"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:276:1: testing_element_ip : 'ip' el_ip_addr ';' -> ^( PLIST_PARAM 'ip' el_ip_addr ) ;
    public final Bind9ConfigParser.testing_element_ip_return testing_element_ip() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip_return retval = new Bind9ConfigParser.testing_element_ip_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal77=null;
        Token char_literal79=null;
        Bind9ConfigParser.el_ip_addr_return el_ip_addr78 = null;


        Object string_literal77_tree=null;
        Object char_literal79_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_82=new RewriteRuleTokenStream(adaptor,"token 82");
        RewriteRuleSubtreeStream stream_el_ip_addr=new RewriteRuleSubtreeStream(adaptor,"rule el_ip_addr");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:277:2: ( 'ip' el_ip_addr ';' -> ^( PLIST_PARAM 'ip' el_ip_addr ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:277:4: 'ip' el_ip_addr ';'
            {
            string_literal77=(Token)match(input,82,FOLLOW_82_in_testing_element_ip673);  
            stream_82.add(string_literal77);

            pushFollow(FOLLOW_el_ip_addr_in_testing_element_ip675);
            el_ip_addr78=el_ip_addr();

            state._fsp--;

            stream_el_ip_addr.add(el_ip_addr78.getTree());
            char_literal79=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_ip677);  
            stream_SEMICOLON.add(char_literal79);



            // AST REWRITE
            // elements: el_ip_addr, 82
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:24: -> ^( PLIST_PARAM 'ip' el_ip_addr )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:277:27: ^( PLIST_PARAM 'ip' el_ip_addr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_82.nextNode());
                adaptor.addChild(root_1, stream_el_ip_addr.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_ip"

    public static class testing_element_ip_port_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_ip_port"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:279:1: testing_element_ip_port : 'ip_port' el_ip_port ';' -> ^( PLIST_PARAM 'ip_port' el_ip_port ) ;
    public final Bind9ConfigParser.testing_element_ip_port_return testing_element_ip_port() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip_port_return retval = new Bind9ConfigParser.testing_element_ip_port_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal80=null;
        Token char_literal82=null;
        Bind9ConfigParser.el_ip_port_return el_ip_port81 = null;


        Object string_literal80_tree=null;
        Object char_literal82_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_83=new RewriteRuleTokenStream(adaptor,"token 83");
        RewriteRuleSubtreeStream stream_el_ip_port=new RewriteRuleSubtreeStream(adaptor,"rule el_ip_port");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:280:2: ( 'ip_port' el_ip_port ';' -> ^( PLIST_PARAM 'ip_port' el_ip_port ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:280:4: 'ip_port' el_ip_port ';'
            {
            string_literal80=(Token)match(input,83,FOLLOW_83_in_testing_element_ip_port697);  
            stream_83.add(string_literal80);

            pushFollow(FOLLOW_el_ip_port_in_testing_element_ip_port699);
            el_ip_port81=el_ip_port();

            state._fsp--;

            stream_el_ip_port.add(el_ip_port81.getTree());
            char_literal82=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_ip_port701);  
            stream_SEMICOLON.add(char_literal82);



            // AST REWRITE
            // elements: 83, el_ip_port
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 280:29: -> ^( PLIST_PARAM 'ip_port' el_ip_port )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:280:32: ^( PLIST_PARAM 'ip_port' el_ip_port )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_83.nextNode());
                adaptor.addChild(root_1, stream_el_ip_port.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_ip_port"

    public static class testing_element_ip_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_ip_prefix"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:1: testing_element_ip_prefix : 'ip_prefix' el_ip_prefix ';' -> ^( PLIST_PARAM 'ip_prefix' el_ip_prefix ) ;
    public final Bind9ConfigParser.testing_element_ip_prefix_return testing_element_ip_prefix() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip_prefix_return retval = new Bind9ConfigParser.testing_element_ip_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;
        Token char_literal85=null;
        Bind9ConfigParser.el_ip_prefix_return el_ip_prefix84 = null;


        Object string_literal83_tree=null;
        Object char_literal85_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_el_ip_prefix=new RewriteRuleSubtreeStream(adaptor,"rule el_ip_prefix");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:283:2: ( 'ip_prefix' el_ip_prefix ';' -> ^( PLIST_PARAM 'ip_prefix' el_ip_prefix ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:283:4: 'ip_prefix' el_ip_prefix ';'
            {
            string_literal83=(Token)match(input,84,FOLLOW_84_in_testing_element_ip_prefix721);  
            stream_84.add(string_literal83);

            pushFollow(FOLLOW_el_ip_prefix_in_testing_element_ip_prefix723);
            el_ip_prefix84=el_ip_prefix();

            state._fsp--;

            stream_el_ip_prefix.add(el_ip_prefix84.getTree());
            char_literal85=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_ip_prefix725);  
            stream_SEMICOLON.add(char_literal85);



            // AST REWRITE
            // elements: el_ip_prefix, 84
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 283:33: -> ^( PLIST_PARAM 'ip_prefix' el_ip_prefix )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:283:36: ^( PLIST_PARAM 'ip_prefix' el_ip_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_84.nextNode());
                adaptor.addChild(root_1, stream_el_ip_prefix.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_ip_prefix"

    public static class testing_element_key_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_key_id"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:285:1: testing_element_key_id : 'key_id' el_key_id ';' -> ^( PLIST_PARAM 'key_id' el_key_id ) ;
    public final Bind9ConfigParser.testing_element_key_id_return testing_element_key_id() throws RecognitionException {
        Bind9ConfigParser.testing_element_key_id_return retval = new Bind9ConfigParser.testing_element_key_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal86=null;
        Token char_literal88=null;
        Bind9ConfigParser.el_key_id_return el_key_id87 = null;


        Object string_literal86_tree=null;
        Object char_literal88_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_el_key_id=new RewriteRuleSubtreeStream(adaptor,"rule el_key_id");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:286:2: ( 'key_id' el_key_id ';' -> ^( PLIST_PARAM 'key_id' el_key_id ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:286:4: 'key_id' el_key_id ';'
            {
            string_literal86=(Token)match(input,85,FOLLOW_85_in_testing_element_key_id745);  
            stream_85.add(string_literal86);

            pushFollow(FOLLOW_el_key_id_in_testing_element_key_id747);
            el_key_id87=el_key_id();

            state._fsp--;

            stream_el_key_id.add(el_key_id87.getTree());
            char_literal88=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_key_id749);  
            stream_SEMICOLON.add(char_literal88);



            // AST REWRITE
            // elements: 85, el_key_id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 286:27: -> ^( PLIST_PARAM 'key_id' el_key_id )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:286:30: ^( PLIST_PARAM 'key_id' el_key_id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_85.nextNode());
                adaptor.addChild(root_1, stream_el_key_id.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_key_id"

    public static class testing_element_key_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_key_list"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:288:1: testing_element_key_list : 'key_list' el_key_list ';' -> ^( PLIST_PARAM 'key_list' el_key_list ) ;
    public final Bind9ConfigParser.testing_element_key_list_return testing_element_key_list() throws RecognitionException {
        Bind9ConfigParser.testing_element_key_list_return retval = new Bind9ConfigParser.testing_element_key_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal89=null;
        Token char_literal91=null;
        Bind9ConfigParser.el_key_list_return el_key_list90 = null;


        Object string_literal89_tree=null;
        Object char_literal91_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_el_key_list=new RewriteRuleSubtreeStream(adaptor,"rule el_key_list");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:289:2: ( 'key_list' el_key_list ';' -> ^( PLIST_PARAM 'key_list' el_key_list ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:289:4: 'key_list' el_key_list ';'
            {
            string_literal89=(Token)match(input,86,FOLLOW_86_in_testing_element_key_list769);  
            stream_86.add(string_literal89);

            pushFollow(FOLLOW_el_key_list_in_testing_element_key_list771);
            el_key_list90=el_key_list();

            state._fsp--;

            stream_el_key_list.add(el_key_list90.getTree());
            char_literal91=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_key_list773);  
            stream_SEMICOLON.add(char_literal91);



            // AST REWRITE
            // elements: 86, el_key_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 289:31: -> ^( PLIST_PARAM 'key_list' el_key_list )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:289:34: ^( PLIST_PARAM 'key_list' el_key_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_86.nextNode());
                adaptor.addChild(root_1, stream_el_key_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_key_list"

    public static class testing_element_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_number"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:291:1: testing_element_number : 'number' el_number ';' -> ^( PLIST_PARAM 'number' el_number ) ;
    public final Bind9ConfigParser.testing_element_number_return testing_element_number() throws RecognitionException {
        Bind9ConfigParser.testing_element_number_return retval = new Bind9ConfigParser.testing_element_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal92=null;
        Token char_literal94=null;
        Bind9ConfigParser.el_number_return el_number93 = null;


        Object string_literal92_tree=null;
        Object char_literal94_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_87=new RewriteRuleTokenStream(adaptor,"token 87");
        RewriteRuleSubtreeStream stream_el_number=new RewriteRuleSubtreeStream(adaptor,"rule el_number");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:292:2: ( 'number' el_number ';' -> ^( PLIST_PARAM 'number' el_number ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:292:4: 'number' el_number ';'
            {
            string_literal92=(Token)match(input,87,FOLLOW_87_in_testing_element_number793);  
            stream_87.add(string_literal92);

            pushFollow(FOLLOW_el_number_in_testing_element_number795);
            el_number93=el_number();

            state._fsp--;

            stream_el_number.add(el_number93.getTree());
            char_literal94=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_number797);  
            stream_SEMICOLON.add(char_literal94);



            // AST REWRITE
            // elements: el_number, 87
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 292:27: -> ^( PLIST_PARAM 'number' el_number )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:292:30: ^( PLIST_PARAM 'number' el_number )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_87.nextNode());
                adaptor.addChild(root_1, stream_el_number.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_number"

    public static class testing_element_path_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_path_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:1: testing_element_path_name : 'path_name' el_path_name ';' -> ^( PLIST_PARAM 'path_name' el_path_name ) ;
    public final Bind9ConfigParser.testing_element_path_name_return testing_element_path_name() throws RecognitionException {
        Bind9ConfigParser.testing_element_path_name_return retval = new Bind9ConfigParser.testing_element_path_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal95=null;
        Token char_literal97=null;
        Bind9ConfigParser.el_path_name_return el_path_name96 = null;


        Object string_literal95_tree=null;
        Object char_literal97_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleSubtreeStream stream_el_path_name=new RewriteRuleSubtreeStream(adaptor,"rule el_path_name");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:295:2: ( 'path_name' el_path_name ';' -> ^( PLIST_PARAM 'path_name' el_path_name ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:295:4: 'path_name' el_path_name ';'
            {
            string_literal95=(Token)match(input,88,FOLLOW_88_in_testing_element_path_name817);  
            stream_88.add(string_literal95);

            pushFollow(FOLLOW_el_path_name_in_testing_element_path_name819);
            el_path_name96=el_path_name();

            state._fsp--;

            stream_el_path_name.add(el_path_name96.getTree());
            char_literal97=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_path_name821);  
            stream_SEMICOLON.add(char_literal97);



            // AST REWRITE
            // elements: el_path_name, 88
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 295:33: -> ^( PLIST_PARAM 'path_name' el_path_name )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:295:36: ^( PLIST_PARAM 'path_name' el_path_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_88.nextNode());
                adaptor.addChild(root_1, stream_el_path_name.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_path_name"

    public static class testing_element_port_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_port_list"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:297:1: testing_element_port_list : 'port_list' el_port_list ';' -> ^( PLIST_PARAM 'port_list' el_port_list ) ;
    public final Bind9ConfigParser.testing_element_port_list_return testing_element_port_list() throws RecognitionException {
        Bind9ConfigParser.testing_element_port_list_return retval = new Bind9ConfigParser.testing_element_port_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal98=null;
        Token char_literal100=null;
        Bind9ConfigParser.el_port_list_return el_port_list99 = null;


        Object string_literal98_tree=null;
        Object char_literal100_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_89=new RewriteRuleTokenStream(adaptor,"token 89");
        RewriteRuleSubtreeStream stream_el_port_list=new RewriteRuleSubtreeStream(adaptor,"rule el_port_list");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:2: ( 'port_list' el_port_list ';' -> ^( PLIST_PARAM 'port_list' el_port_list ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:4: 'port_list' el_port_list ';'
            {
            string_literal98=(Token)match(input,89,FOLLOW_89_in_testing_element_port_list841);  
            stream_89.add(string_literal98);

            pushFollow(FOLLOW_el_port_list_in_testing_element_port_list843);
            el_port_list99=el_port_list();

            state._fsp--;

            stream_el_port_list.add(el_port_list99.getTree());
            char_literal100=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_port_list845);  
            stream_SEMICOLON.add(char_literal100);



            // AST REWRITE
            // elements: el_port_list, 89
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 298:33: -> ^( PLIST_PARAM 'port_list' el_port_list )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:36: ^( PLIST_PARAM 'port_list' el_port_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_89.nextNode());
                adaptor.addChild(root_1, stream_el_port_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_port_list"

    public static class testing_element_size_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_size_spec"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:300:1: testing_element_size_spec : 'size_spec' el_size_spec ';' -> ^( PLIST_PARAM 'size_spec' el_size_spec ) ;
    public final Bind9ConfigParser.testing_element_size_spec_return testing_element_size_spec() throws RecognitionException {
        Bind9ConfigParser.testing_element_size_spec_return retval = new Bind9ConfigParser.testing_element_size_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal101=null;
        Token char_literal103=null;
        Bind9ConfigParser.el_size_spec_return el_size_spec102 = null;


        Object string_literal101_tree=null;
        Object char_literal103_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_90=new RewriteRuleTokenStream(adaptor,"token 90");
        RewriteRuleSubtreeStream stream_el_size_spec=new RewriteRuleSubtreeStream(adaptor,"rule el_size_spec");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:301:2: ( 'size_spec' el_size_spec ';' -> ^( PLIST_PARAM 'size_spec' el_size_spec ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:301:4: 'size_spec' el_size_spec ';'
            {
            string_literal101=(Token)match(input,90,FOLLOW_90_in_testing_element_size_spec865);  
            stream_90.add(string_literal101);

            pushFollow(FOLLOW_el_size_spec_in_testing_element_size_spec867);
            el_size_spec102=el_size_spec();

            state._fsp--;

            stream_el_size_spec.add(el_size_spec102.getTree());
            char_literal103=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_size_spec869);  
            stream_SEMICOLON.add(char_literal103);



            // AST REWRITE
            // elements: el_size_spec, 90
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 301:33: -> ^( PLIST_PARAM 'size_spec' el_size_spec )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:301:36: ^( PLIST_PARAM 'size_spec' el_size_spec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_90.nextNode());
                adaptor.addChild(root_1, stream_el_size_spec.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_size_spec"

    public static class testing_element_yes_or_no_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_yes_or_no"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:303:1: testing_element_yes_or_no : 'yes_or_no' el_yes_or_no ';' -> ^( PLIST_PARAM 'yes_or_no' el_yes_or_no ) ;
    public final Bind9ConfigParser.testing_element_yes_or_no_return testing_element_yes_or_no() throws RecognitionException {
        Bind9ConfigParser.testing_element_yes_or_no_return retval = new Bind9ConfigParser.testing_element_yes_or_no_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal104=null;
        Token char_literal106=null;
        Bind9ConfigParser.el_yes_or_no_return el_yes_or_no105 = null;


        Object string_literal104_tree=null;
        Object char_literal106_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_91=new RewriteRuleTokenStream(adaptor,"token 91");
        RewriteRuleSubtreeStream stream_el_yes_or_no=new RewriteRuleSubtreeStream(adaptor,"rule el_yes_or_no");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:304:2: ( 'yes_or_no' el_yes_or_no ';' -> ^( PLIST_PARAM 'yes_or_no' el_yes_or_no ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:304:4: 'yes_or_no' el_yes_or_no ';'
            {
            string_literal104=(Token)match(input,91,FOLLOW_91_in_testing_element_yes_or_no889);  
            stream_91.add(string_literal104);

            pushFollow(FOLLOW_el_yes_or_no_in_testing_element_yes_or_no891);
            el_yes_or_no105=el_yes_or_no();

            state._fsp--;

            stream_el_yes_or_no.add(el_yes_or_no105.getTree());
            char_literal106=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_yes_or_no893);  
            stream_SEMICOLON.add(char_literal106);



            // AST REWRITE
            // elements: el_yes_or_no, 91
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 304:33: -> ^( PLIST_PARAM 'yes_or_no' el_yes_or_no )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:304:36: ^( PLIST_PARAM 'yes_or_no' el_yes_or_no )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_91.nextNode());
                adaptor.addChild(root_1, stream_el_yes_or_no.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_yes_or_no"

    public static class testing_element_dialup_option_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_dialup_option_default"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:306:1: testing_element_dialup_option_default : 'dialup_option_default' el_dialup_option_default ';' -> ^( PLIST_PARAM 'dialup_option_default' el_dialup_option_default ) ;
    public final Bind9ConfigParser.testing_element_dialup_option_default_return testing_element_dialup_option_default() throws RecognitionException {
        Bind9ConfigParser.testing_element_dialup_option_default_return retval = new Bind9ConfigParser.testing_element_dialup_option_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal107=null;
        Token char_literal109=null;
        Bind9ConfigParser.el_dialup_option_default_return el_dialup_option_default108 = null;


        Object string_literal107_tree=null;
        Object char_literal109_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_92=new RewriteRuleTokenStream(adaptor,"token 92");
        RewriteRuleSubtreeStream stream_el_dialup_option_default=new RewriteRuleSubtreeStream(adaptor,"rule el_dialup_option_default");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:307:2: ( 'dialup_option_default' el_dialup_option_default ';' -> ^( PLIST_PARAM 'dialup_option_default' el_dialup_option_default ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:307:4: 'dialup_option_default' el_dialup_option_default ';'
            {
            string_literal107=(Token)match(input,92,FOLLOW_92_in_testing_element_dialup_option_default913);  
            stream_92.add(string_literal107);

            pushFollow(FOLLOW_el_dialup_option_default_in_testing_element_dialup_option_default915);
            el_dialup_option_default108=el_dialup_option_default();

            state._fsp--;

            stream_el_dialup_option_default.add(el_dialup_option_default108.getTree());
            char_literal109=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_dialup_option_default917);  
            stream_SEMICOLON.add(char_literal109);



            // AST REWRITE
            // elements: el_dialup_option_default, 92
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 307:57: -> ^( PLIST_PARAM 'dialup_option_default' el_dialup_option_default )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:307:60: ^( PLIST_PARAM 'dialup_option_default' el_dialup_option_default )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_92.nextNode());
                adaptor.addChild(root_1, stream_el_dialup_option_default.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_dialup_option_default"

    public static class testing_element_dialup_option_slavestub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_dialup_option_slavestub"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:309:1: testing_element_dialup_option_slavestub : 'dialup_option_slavestub' el_dialup_option_slavestub ';' -> ^( PLIST_PARAM 'dialup_option_slavestub' el_dialup_option_slavestub ) ;
    public final Bind9ConfigParser.testing_element_dialup_option_slavestub_return testing_element_dialup_option_slavestub() throws RecognitionException {
        Bind9ConfigParser.testing_element_dialup_option_slavestub_return retval = new Bind9ConfigParser.testing_element_dialup_option_slavestub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal110=null;
        Token char_literal112=null;
        Bind9ConfigParser.el_dialup_option_slavestub_return el_dialup_option_slavestub111 = null;


        Object string_literal110_tree=null;
        Object char_literal112_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_93=new RewriteRuleTokenStream(adaptor,"token 93");
        RewriteRuleSubtreeStream stream_el_dialup_option_slavestub=new RewriteRuleSubtreeStream(adaptor,"rule el_dialup_option_slavestub");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:310:2: ( 'dialup_option_slavestub' el_dialup_option_slavestub ';' -> ^( PLIST_PARAM 'dialup_option_slavestub' el_dialup_option_slavestub ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:310:4: 'dialup_option_slavestub' el_dialup_option_slavestub ';'
            {
            string_literal110=(Token)match(input,93,FOLLOW_93_in_testing_element_dialup_option_slavestub937);  
            stream_93.add(string_literal110);

            pushFollow(FOLLOW_el_dialup_option_slavestub_in_testing_element_dialup_option_slavestub939);
            el_dialup_option_slavestub111=el_dialup_option_slavestub();

            state._fsp--;

            stream_el_dialup_option_slavestub.add(el_dialup_option_slavestub111.getTree());
            char_literal112=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_dialup_option_slavestub941);  
            stream_SEMICOLON.add(char_literal112);



            // AST REWRITE
            // elements: el_dialup_option_slavestub, 93
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 310:61: -> ^( PLIST_PARAM 'dialup_option_slavestub' el_dialup_option_slavestub )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:310:64: ^( PLIST_PARAM 'dialup_option_slavestub' el_dialup_option_slavestub )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_93.nextNode());
                adaptor.addChild(root_1, stream_el_dialup_option_slavestub.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_dialup_option_slavestub"

    public static class testing_element_masters_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_masters_list"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:312:1: testing_element_masters_list : 'masters_list' el_masters_list ';' -> ^( PLIST_PARAM 'masters_list' el_masters_list ) ;
    public final Bind9ConfigParser.testing_element_masters_list_return testing_element_masters_list() throws RecognitionException {
        Bind9ConfigParser.testing_element_masters_list_return retval = new Bind9ConfigParser.testing_element_masters_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal113=null;
        Token char_literal115=null;
        Bind9ConfigParser.el_masters_list_return el_masters_list114 = null;


        Object string_literal113_tree=null;
        Object char_literal115_tree=null;
        RewriteRuleTokenStream stream_94=new RewriteRuleTokenStream(adaptor,"token 94");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_el_masters_list=new RewriteRuleSubtreeStream(adaptor,"rule el_masters_list");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:313:2: ( 'masters_list' el_masters_list ';' -> ^( PLIST_PARAM 'masters_list' el_masters_list ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:313:4: 'masters_list' el_masters_list ';'
            {
            string_literal113=(Token)match(input,94,FOLLOW_94_in_testing_element_masters_list961);  
            stream_94.add(string_literal113);

            pushFollow(FOLLOW_el_masters_list_in_testing_element_masters_list963);
            el_masters_list114=el_masters_list();

            state._fsp--;

            stream_el_masters_list.add(el_masters_list114.getTree());
            char_literal115=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_masters_list965);  
            stream_SEMICOLON.add(char_literal115);



            // AST REWRITE
            // elements: 94, el_masters_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 313:39: -> ^( PLIST_PARAM 'masters_list' el_masters_list )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:313:42: ^( PLIST_PARAM 'masters_list' el_masters_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_94.nextNode());
                adaptor.addChild(root_1, stream_el_masters_list.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;
            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "testing_element_masters_list"

    public static class lex_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lex_identifier"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:1: lex_identifier : ( ALPHANUM_NONSTD | NUMBER | KMG_NUMBER | lex_yes_or_no | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD | NOTIFY_WORD | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD | PORT_WORD | KEY_WORD | FFFF_WORD );
    public final Bind9ConfigParser.lex_identifier_return lex_identifier() throws RecognitionException {
        Bind9ConfigParser.lex_identifier_return retval = new Bind9ConfigParser.lex_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALPHANUM_NONSTD116=null;
        Token NUMBER117=null;
        Token KMG_NUMBER118=null;
        Token RANGE_WORD120=null;
        Token UNLIMITED_WORD121=null;
        Token DEFAULT_WORD122=null;
        Token NOTIFY_WORD123=null;
        Token NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD124=null;
        Token PORT_WORD125=null;
        Token KEY_WORD126=null;
        Token FFFF_WORD127=null;
        Bind9ConfigParser.lex_yes_or_no_return lex_yes_or_no119 = null;


        Object ALPHANUM_NONSTD116_tree=null;
        Object NUMBER117_tree=null;
        Object KMG_NUMBER118_tree=null;
        Object RANGE_WORD120_tree=null;
        Object UNLIMITED_WORD121_tree=null;
        Object DEFAULT_WORD122_tree=null;
        Object NOTIFY_WORD123_tree=null;
        Object NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD124_tree=null;
        Object PORT_WORD125_tree=null;
        Object KEY_WORD126_tree=null;
        Object FFFF_WORD127_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:16: ( ALPHANUM_NONSTD | NUMBER | KMG_NUMBER | lex_yes_or_no | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD | NOTIFY_WORD | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD | PORT_WORD | KEY_WORD | FFFF_WORD )
            int alt11=12;
            switch ( input.LA(1) ) {
            case ALPHANUM_NONSTD:
                {
                alt11=1;
                }
                break;
            case NUMBER:
                {
                alt11=2;
                }
                break;
            case KMG_NUMBER:
                {
                alt11=3;
                }
                break;
            case ZERO_OR_ONE_WORD:
            case YES_OR_NO_WORD:
            case TRUE_OR_FALSE_WORD:
                {
                alt11=4;
                }
                break;
            case RANGE_WORD:
                {
                alt11=5;
                }
                break;
            case UNLIMITED_WORD:
                {
                alt11=6;
                }
                break;
            case DEFAULT_WORD:
                {
                alt11=7;
                }
                break;
            case NOTIFY_WORD:
                {
                alt11=8;
                }
                break;
            case NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD:
                {
                alt11=9;
                }
                break;
            case PORT_WORD:
                {
                alt11=10;
                }
                break;
            case KEY_WORD:
                {
                alt11=11;
                }
                break;
            case FFFF_WORD:
                {
                alt11=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:18: ALPHANUM_NONSTD
                    {
                    root_0 = (Object)adaptor.nil();

                    ALPHANUM_NONSTD116=(Token)match(input,ALPHANUM_NONSTD,FOLLOW_ALPHANUM_NONSTD_in_lex_identifier989); 
                    ALPHANUM_NONSTD116_tree = (Object)adaptor.create(ALPHANUM_NONSTD116);
                    adaptor.addChild(root_0, ALPHANUM_NONSTD116_tree);


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:36: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER117=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_lex_identifier993); 
                    NUMBER117_tree = (Object)adaptor.create(NUMBER117);
                    adaptor.addChild(root_0, NUMBER117_tree);


                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:45: KMG_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    KMG_NUMBER118=(Token)match(input,KMG_NUMBER,FOLLOW_KMG_NUMBER_in_lex_identifier997); 
                    KMG_NUMBER118_tree = (Object)adaptor.create(KMG_NUMBER118);
                    adaptor.addChild(root_0, KMG_NUMBER118_tree);


                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:58: lex_yes_or_no
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lex_yes_or_no_in_lex_identifier1001);
                    lex_yes_or_no119=lex_yes_or_no();

                    state._fsp--;

                    adaptor.addChild(root_0, lex_yes_or_no119.getTree());

                    }
                    break;
                case 5 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:318:5: RANGE_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    RANGE_WORD120=(Token)match(input,RANGE_WORD,FOLLOW_RANGE_WORD_in_lex_identifier1007); 
                    RANGE_WORD120_tree = (Object)adaptor.create(RANGE_WORD120);
                    adaptor.addChild(root_0, RANGE_WORD120_tree);


                    }
                    break;
                case 6 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:318:18: UNLIMITED_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    UNLIMITED_WORD121=(Token)match(input,UNLIMITED_WORD,FOLLOW_UNLIMITED_WORD_in_lex_identifier1011); 
                    UNLIMITED_WORD121_tree = (Object)adaptor.create(UNLIMITED_WORD121);
                    adaptor.addChild(root_0, UNLIMITED_WORD121_tree);


                    }
                    break;
                case 7 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:318:35: DEFAULT_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    DEFAULT_WORD122=(Token)match(input,DEFAULT_WORD,FOLLOW_DEFAULT_WORD_in_lex_identifier1015); 
                    DEFAULT_WORD122_tree = (Object)adaptor.create(DEFAULT_WORD122);
                    adaptor.addChild(root_0, DEFAULT_WORD122_tree);


                    }
                    break;
                case 8 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:319:5: NOTIFY_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    NOTIFY_WORD123=(Token)match(input,NOTIFY_WORD,FOLLOW_NOTIFY_WORD_in_lex_identifier1021); 
                    NOTIFY_WORD123_tree = (Object)adaptor.create(NOTIFY_WORD123);
                    adaptor.addChild(root_0, NOTIFY_WORD123_tree);


                    }
                    break;
                case 9 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:319:19: NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD124=(Token)match(input,NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD,FOLLOW_NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD_in_lex_identifier1025); 
                    NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD124_tree = (Object)adaptor.create(NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD124);
                    adaptor.addChild(root_0, NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD124_tree);


                    }
                    break;
                case 10 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:320:5: PORT_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    PORT_WORD125=(Token)match(input,PORT_WORD,FOLLOW_PORT_WORD_in_lex_identifier1031); 
                    PORT_WORD125_tree = (Object)adaptor.create(PORT_WORD125);
                    adaptor.addChild(root_0, PORT_WORD125_tree);


                    }
                    break;
                case 11 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:320:17: KEY_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    KEY_WORD126=(Token)match(input,KEY_WORD,FOLLOW_KEY_WORD_in_lex_identifier1035); 
                    KEY_WORD126_tree = (Object)adaptor.create(KEY_WORD126);
                    adaptor.addChild(root_0, KEY_WORD126_tree);


                    }
                    break;
                case 12 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:320:28: FFFF_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    FFFF_WORD127=(Token)match(input,FFFF_WORD,FOLLOW_FFFF_WORD_in_lex_identifier1039); 
                    FFFF_WORD127_tree = (Object)adaptor.create(FFFF_WORD127);
                    adaptor.addChild(root_0, FFFF_WORD127_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lex_identifier"

    public static class lex_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lex_number"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:1: lex_number : ( NUMBER | ZERO_OR_ONE_WORD );
    public final Bind9ConfigParser.lex_number_return lex_number() throws RecognitionException {
        Bind9ConfigParser.lex_number_return retval = new Bind9ConfigParser.lex_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set128=null;

        Object set128_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:12: ( NUMBER | ZERO_OR_ONE_WORD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set128=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==ZERO_OR_ONE_WORD ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set128));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lex_number"

    public static class lex_yes_or_no_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lex_yes_or_no"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:323:1: lex_yes_or_no : ( YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD );
    public final Bind9ConfigParser.lex_yes_or_no_return lex_yes_or_no() throws RecognitionException {
        Bind9ConfigParser.lex_yes_or_no_return retval = new Bind9ConfigParser.lex_yes_or_no_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set129=null;

        Object set129_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:323:15: ( YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set129=(Token)input.LT(1);
            if ( (input.LA(1)>=ZERO_OR_ONE_WORD && input.LA(1)<=TRUE_OR_FALSE_WORD) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set129));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "lex_yes_or_no"

    public static class el_acl_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_acl_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:326:1: el_acl_name : lex_identifier ;
    public final Bind9ConfigParser.el_acl_name_return el_acl_name() throws RecognitionException {
        Bind9ConfigParser.el_acl_name_return retval = new Bind9ConfigParser.el_acl_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.lex_identifier_return lex_identifier130 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:326:13: ( lex_identifier )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:326:16: lex_identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lex_identifier_in_el_acl_name1079);
            lex_identifier130=lex_identifier();

            state._fsp--;

            adaptor.addChild(root_0, lex_identifier130.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_acl_name"

    public static class el_masters_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_masters_list"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:327:1: el_masters_list : el_masters_list_item ( SEMICOLON el_masters_list_item )+ ( SEMICOLON )? ;
    public final Bind9ConfigParser.el_masters_list_return el_masters_list() throws RecognitionException {
        Bind9ConfigParser.el_masters_list_return retval = new Bind9ConfigParser.el_masters_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON132=null;
        Token SEMICOLON134=null;
        Bind9ConfigParser.el_masters_list_item_return el_masters_list_item131 = null;

        Bind9ConfigParser.el_masters_list_item_return el_masters_list_item133 = null;


        Object SEMICOLON132_tree=null;
        Object SEMICOLON134_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:327:17: ( el_masters_list_item ( SEMICOLON el_masters_list_item )+ ( SEMICOLON )? )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:327:19: el_masters_list_item ( SEMICOLON el_masters_list_item )+ ( SEMICOLON )?
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_el_masters_list_item_in_el_masters_list1086);
            el_masters_list_item131=el_masters_list_item();

            state._fsp--;

            adaptor.addChild(root_0, el_masters_list_item131.getTree());
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:327:40: ( SEMICOLON el_masters_list_item )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==SEMICOLON) ) {
                    int LA12_1 = input.LA(2);

                    if ( ((LA12_1>=ALPHANUM_NONSTD && LA12_1<=TRUE_OR_FALSE_WORD)||(LA12_1>=IP4_ADDR && LA12_1<=DOUBLE_COLON)) ) {
                        alt12=1;
                    }


                }


                switch (alt12) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:327:41: SEMICOLON el_masters_list_item
            	    {
            	    SEMICOLON132=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_el_masters_list1089); 
            	    SEMICOLON132_tree = (Object)adaptor.create(SEMICOLON132);
            	    adaptor.addChild(root_0, SEMICOLON132_tree);

            	    pushFollow(FOLLOW_el_masters_list_item_in_el_masters_list1091);
            	    el_masters_list_item133=el_masters_list_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, el_masters_list_item133.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:327:74: ( SEMICOLON )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==SEMICOLON) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==SEMICOLON) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:327:74: SEMICOLON
                    {
                    SEMICOLON134=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_el_masters_list1095); 
                    SEMICOLON134_tree = (Object)adaptor.create(SEMICOLON134);
                    adaptor.addChild(root_0, SEMICOLON134_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_masters_list"

    public static class el_masters_list_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_masters_list_item"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:1: el_masters_list_item : ( lex_identifier | ( el_ip_addr ( PORT_WORD el_ip_port )? ) ) ( KEY_WORD ONE_LINE_DOUBLE_QUOTED_STRING )? ;
    public final Bind9ConfigParser.el_masters_list_item_return el_masters_list_item() throws RecognitionException {
        Bind9ConfigParser.el_masters_list_item_return retval = new Bind9ConfigParser.el_masters_list_item_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token PORT_WORD137=null;
        Token KEY_WORD139=null;
        Token ONE_LINE_DOUBLE_QUOTED_STRING140=null;
        Bind9ConfigParser.lex_identifier_return lex_identifier135 = null;

        Bind9ConfigParser.el_ip_addr_return el_ip_addr136 = null;

        Bind9ConfigParser.el_ip_port_return el_ip_port138 = null;


        Object PORT_WORD137_tree=null;
        Object KEY_WORD139_tree=null;
        Object ONE_LINE_DOUBLE_QUOTED_STRING140_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:22: ( ( lex_identifier | ( el_ip_addr ( PORT_WORD el_ip_port )? ) ) ( KEY_WORD ONE_LINE_DOUBLE_QUOTED_STRING )? )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:24: ( lex_identifier | ( el_ip_addr ( PORT_WORD el_ip_port )? ) ) ( KEY_WORD ONE_LINE_DOUBLE_QUOTED_STRING )?
            {
            root_0 = (Object)adaptor.nil();

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:24: ( lex_identifier | ( el_ip_addr ( PORT_WORD el_ip_port )? ) )
            int alt15=2;
            switch ( input.LA(1) ) {
            case ALPHANUM_NONSTD:
                {
                alt15=1;
                }
                break;
            case NUMBER:
            case KMG_NUMBER:
            case RANGE_WORD:
            case UNLIMITED_WORD:
            case DEFAULT_WORD:
            case NOTIFY_WORD:
            case NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD:
            case PORT_WORD:
            case KEY_WORD:
            case FFFF_WORD:
            case ZERO_OR_ONE_WORD:
            case YES_OR_NO_WORD:
            case TRUE_OR_FALSE_WORD:
                {
                alt15=1;
                }
                break;
            case IP4_ADDR:
            case IP6_NORM_ADDR_BASE:
            case IP6_SHORTLEFT_ADDR_BASE:
            case IP6_SHORTRIGHT_ADDR_BASE:
            case IP6_SHORTMID_ADDR_BASE:
            case IP6_IP4COMPAT_ADDR_BASE:
            case IP6_IP4LINK_ADDR_BASE:
            case DOUBLE_COLON:
                {
                alt15=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:25: lex_identifier
                    {
                    pushFollow(FOLLOW_lex_identifier_in_el_masters_list_item1105);
                    lex_identifier135=lex_identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, lex_identifier135.getTree());

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:42: ( el_ip_addr ( PORT_WORD el_ip_port )? )
                    {
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:42: ( el_ip_addr ( PORT_WORD el_ip_port )? )
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:43: el_ip_addr ( PORT_WORD el_ip_port )?
                    {
                    pushFollow(FOLLOW_el_ip_addr_in_el_masters_list_item1110);
                    el_ip_addr136=el_ip_addr();

                    state._fsp--;

                    adaptor.addChild(root_0, el_ip_addr136.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:54: ( PORT_WORD el_ip_port )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==PORT_WORD) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:55: PORT_WORD el_ip_port
                            {
                            PORT_WORD137=(Token)match(input,PORT_WORD,FOLLOW_PORT_WORD_in_el_masters_list_item1113); 
                            PORT_WORD137_tree = (Object)adaptor.create(PORT_WORD137);
                            adaptor.addChild(root_0, PORT_WORD137_tree);

                            pushFollow(FOLLOW_el_ip_port_in_el_masters_list_item1115);
                            el_ip_port138=el_ip_port();

                            state._fsp--;

                            adaptor.addChild(root_0, el_ip_port138.getTree());

                            }
                            break;

                    }


                    }


                    }
                    break;

            }

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:79: ( KEY_WORD ONE_LINE_DOUBLE_QUOTED_STRING )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KEY_WORD) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:328:80: KEY_WORD ONE_LINE_DOUBLE_QUOTED_STRING
                    {
                    KEY_WORD139=(Token)match(input,KEY_WORD,FOLLOW_KEY_WORD_in_el_masters_list_item1121); 
                    KEY_WORD139_tree = (Object)adaptor.create(KEY_WORD139);
                    adaptor.addChild(root_0, KEY_WORD139_tree);

                    ONE_LINE_DOUBLE_QUOTED_STRING140=(Token)match(input,ONE_LINE_DOUBLE_QUOTED_STRING,FOLLOW_ONE_LINE_DOUBLE_QUOTED_STRING_in_el_masters_list_item1123); 
                    ONE_LINE_DOUBLE_QUOTED_STRING140_tree = (Object)adaptor.create(ONE_LINE_DOUBLE_QUOTED_STRING140);
                    adaptor.addChild(root_0, ONE_LINE_DOUBLE_QUOTED_STRING140_tree);


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_masters_list_item"

    public static class el_domain_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_domain_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:1: el_domain_name : DOMAIN_NAME ;
    public final Bind9ConfigParser.el_domain_name_return el_domain_name() throws RecognitionException {
        Bind9ConfigParser.el_domain_name_return retval = new Bind9ConfigParser.el_domain_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOMAIN_NAME141=null;

        Object DOMAIN_NAME141_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:17: ( DOMAIN_NAME )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:329:20: DOMAIN_NAME
            {
            root_0 = (Object)adaptor.nil();

            DOMAIN_NAME141=(Token)match(input,DOMAIN_NAME,FOLLOW_DOMAIN_NAME_in_el_domain_name1135); 
            DOMAIN_NAME141_tree = (Object)adaptor.create(DOMAIN_NAME141);
            adaptor.addChild(root_0, DOMAIN_NAME141_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_domain_name"

    public static class el_ip_addr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_ip_addr"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:330:1: el_ip_addr : ( el_ip4_addr | el_ip6_addr );
    public final Bind9ConfigParser.el_ip_addr_return el_ip_addr() throws RecognitionException {
        Bind9ConfigParser.el_ip_addr_return retval = new Bind9ConfigParser.el_ip_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.el_ip4_addr_return el_ip4_addr142 = null;

        Bind9ConfigParser.el_ip6_addr_return el_ip6_addr143 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:330:13: ( el_ip4_addr | el_ip6_addr )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==IP4_ADDR) ) {
                alt17=1;
            }
            else if ( (LA17_0==NUMBER||(LA17_0>=IP6_NORM_ADDR_BASE && LA17_0<=DOUBLE_COLON)) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:330:16: el_ip4_addr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_el_ip4_addr_in_el_ip_addr1145);
                    el_ip4_addr142=el_ip4_addr();

                    state._fsp--;

                    adaptor.addChild(root_0, el_ip4_addr142.getTree());

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:330:30: el_ip6_addr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_el_ip6_addr_in_el_ip_addr1149);
                    el_ip6_addr143=el_ip6_addr();

                    state._fsp--;

                    adaptor.addChild(root_0, el_ip6_addr143.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_ip_addr"

    public static class el_ip4_addr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_ip4_addr"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:331:1: el_ip4_addr : IP4_ADDR ;
    public final Bind9ConfigParser.el_ip4_addr_return el_ip4_addr() throws RecognitionException {
        Bind9ConfigParser.el_ip4_addr_return retval = new Bind9ConfigParser.el_ip4_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IP4_ADDR144=null;

        Object IP4_ADDR144_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:331:13: ( IP4_ADDR )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:331:15: IP4_ADDR
            {
            root_0 = (Object)adaptor.nil();

            IP4_ADDR144=(Token)match(input,IP4_ADDR,FOLLOW_IP4_ADDR_in_el_ip4_addr1156); 
            IP4_ADDR144_tree = (Object)adaptor.create(IP4_ADDR144);
            adaptor.addChild(root_0, IP4_ADDR144_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_ip4_addr"

    public static class el_ip6_addr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_ip6_addr"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:332:1: el_ip6_addr : ( IP6_NORM_ADDR_BASE | IP6_SHORTLEFT_ADDR_BASE | IP6_SHORTRIGHT_ADDR_BASE | IP6_SHORTMID_ADDR_BASE | IP6_IP4COMPAT_ADDR_BASE | IP6_IP4LINK_ADDR_BASE | DOUBLE_COLON | NUMBER ) ( PERCENT lex_identifier )? ;
    public final Bind9ConfigParser.el_ip6_addr_return el_ip6_addr() throws RecognitionException {
        Bind9ConfigParser.el_ip6_addr_return retval = new Bind9ConfigParser.el_ip6_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set145=null;
        Token PERCENT146=null;
        Bind9ConfigParser.lex_identifier_return lex_identifier147 = null;


        Object set145_tree=null;
        Object PERCENT146_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:332:13: ( ( IP6_NORM_ADDR_BASE | IP6_SHORTLEFT_ADDR_BASE | IP6_SHORTRIGHT_ADDR_BASE | IP6_SHORTMID_ADDR_BASE | IP6_IP4COMPAT_ADDR_BASE | IP6_IP4LINK_ADDR_BASE | DOUBLE_COLON | NUMBER ) ( PERCENT lex_identifier )? )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:332:15: ( IP6_NORM_ADDR_BASE | IP6_SHORTLEFT_ADDR_BASE | IP6_SHORTRIGHT_ADDR_BASE | IP6_SHORTMID_ADDR_BASE | IP6_IP4COMPAT_ADDR_BASE | IP6_IP4LINK_ADDR_BASE | DOUBLE_COLON | NUMBER ) ( PERCENT lex_identifier )?
            {
            root_0 = (Object)adaptor.nil();

            set145=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||(input.LA(1)>=IP6_NORM_ADDR_BASE && input.LA(1)<=DOUBLE_COLON) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set145));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:335:4: ( PERCENT lex_identifier )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==PERCENT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:335:5: PERCENT lex_identifier
                    {
                    PERCENT146=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_el_ip6_addr1205); 
                    PERCENT146_tree = (Object)adaptor.create(PERCENT146);
                    adaptor.addChild(root_0, PERCENT146_tree);

                    pushFollow(FOLLOW_lex_identifier_in_el_ip6_addr1207);
                    lex_identifier147=lex_identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, lex_identifier147.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_ip6_addr"

    public static class el_ip_port_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_ip_port"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:337:1: el_ip_port : ( NUMBER | ASTERISK );
    public final Bind9ConfigParser.el_ip_port_return el_ip_port() throws RecognitionException {
        Bind9ConfigParser.el_ip_port_return retval = new Bind9ConfigParser.el_ip_port_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set148=null;

        Object set148_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:337:12: ( NUMBER | ASTERISK )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set148=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==ASTERISK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set148));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_ip_port"

    public static class el_ip_prefix_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_ip_prefix"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:338:1: el_ip_prefix : ( NUMBER | IP4_SHORT_2 | IP4_SHORT_3 | IP4_ADDR ) FORWARD_SLASH NUMBER ;
    public final Bind9ConfigParser.el_ip_prefix_return el_ip_prefix() throws RecognitionException {
        Bind9ConfigParser.el_ip_prefix_return retval = new Bind9ConfigParser.el_ip_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set149=null;
        Token FORWARD_SLASH150=null;
        Token NUMBER151=null;

        Object set149_tree=null;
        Object FORWARD_SLASH150_tree=null;
        Object NUMBER151_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:338:14: ( ( NUMBER | IP4_SHORT_2 | IP4_SHORT_3 | IP4_ADDR ) FORWARD_SLASH NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:338:17: ( NUMBER | IP4_SHORT_2 | IP4_SHORT_3 | IP4_ADDR ) FORWARD_SLASH NUMBER
            {
            root_0 = (Object)adaptor.nil();

            set149=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==IP4_ADDR||(input.LA(1)>=IP4_SHORT_2 && input.LA(1)<=IP4_SHORT_3) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set149));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            FORWARD_SLASH150=(Token)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_el_ip_prefix1245); 
            FORWARD_SLASH150_tree = (Object)adaptor.create(FORWARD_SLASH150);
            adaptor.addChild(root_0, FORWARD_SLASH150_tree);

            NUMBER151=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_el_ip_prefix1247); 
            NUMBER151_tree = (Object)adaptor.create(NUMBER151);
            adaptor.addChild(root_0, NUMBER151_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_ip_prefix"

    public static class el_key_id_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_key_id"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:339:1: el_key_id : el_domain_name ;
    public final Bind9ConfigParser.el_key_id_return el_key_id() throws RecognitionException {
        Bind9ConfigParser.el_key_id_return retval = new Bind9ConfigParser.el_key_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.el_domain_name_return el_domain_name152 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:339:11: ( el_domain_name )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:339:14: el_domain_name
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_el_domain_name_in_el_key_id1255);
            el_domain_name152=el_domain_name();

            state._fsp--;

            adaptor.addChild(root_0, el_domain_name152.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_key_id"

    public static class el_key_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_key_list"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:340:1: el_key_list : el_key_id ( SEMICOLON el_key_id )* SEMICOLON ;
    public final Bind9ConfigParser.el_key_list_return el_key_list() throws RecognitionException {
        Bind9ConfigParser.el_key_list_return retval = new Bind9ConfigParser.el_key_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON154=null;
        Token SEMICOLON156=null;
        Bind9ConfigParser.el_key_id_return el_key_id153 = null;

        Bind9ConfigParser.el_key_id_return el_key_id155 = null;


        Object SEMICOLON154_tree=null;
        Object SEMICOLON156_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:340:13: ( el_key_id ( SEMICOLON el_key_id )* SEMICOLON )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:340:15: el_key_id ( SEMICOLON el_key_id )* SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_el_key_id_in_el_key_list1262);
            el_key_id153=el_key_id();

            state._fsp--;

            adaptor.addChild(root_0, el_key_id153.getTree());
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:340:25: ( SEMICOLON el_key_id )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==SEMICOLON) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==DOMAIN_NAME) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:340:26: SEMICOLON el_key_id
            	    {
            	    SEMICOLON154=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_el_key_list1265); 
            	    SEMICOLON154_tree = (Object)adaptor.create(SEMICOLON154);
            	    adaptor.addChild(root_0, SEMICOLON154_tree);

            	    pushFollow(FOLLOW_el_key_id_in_el_key_list1267);
            	    el_key_id155=el_key_id();

            	    state._fsp--;

            	    adaptor.addChild(root_0, el_key_id155.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            SEMICOLON156=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_el_key_list1271); 
            SEMICOLON156_tree = (Object)adaptor.create(SEMICOLON156);
            adaptor.addChild(root_0, SEMICOLON156_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_key_list"

    public static class el_number_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_number"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:341:1: el_number : lex_number ;
    public final Bind9ConfigParser.el_number_return el_number() throws RecognitionException {
        Bind9ConfigParser.el_number_return retval = new Bind9ConfigParser.el_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.lex_number_return lex_number157 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:341:11: ( lex_number )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:341:13: lex_number
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lex_number_in_el_number1278);
            lex_number157=lex_number();

            state._fsp--;

            adaptor.addChild(root_0, lex_number157.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_number"

    public static class el_path_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_path_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:342:1: el_path_name : ONE_LINE_DOUBLE_QUOTED_STRING ;
    public final Bind9ConfigParser.el_path_name_return el_path_name() throws RecognitionException {
        Bind9ConfigParser.el_path_name_return retval = new Bind9ConfigParser.el_path_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ONE_LINE_DOUBLE_QUOTED_STRING158=null;

        Object ONE_LINE_DOUBLE_QUOTED_STRING158_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:342:14: ( ONE_LINE_DOUBLE_QUOTED_STRING )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:342:16: ONE_LINE_DOUBLE_QUOTED_STRING
            {
            root_0 = (Object)adaptor.nil();

            ONE_LINE_DOUBLE_QUOTED_STRING158=(Token)match(input,ONE_LINE_DOUBLE_QUOTED_STRING,FOLLOW_ONE_LINE_DOUBLE_QUOTED_STRING_in_el_path_name1286); 
            ONE_LINE_DOUBLE_QUOTED_STRING158_tree = (Object)adaptor.create(ONE_LINE_DOUBLE_QUOTED_STRING158);
            adaptor.addChild(root_0, ONE_LINE_DOUBLE_QUOTED_STRING158_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_path_name"

    public static class el_port_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_port_list"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:1: el_port_list : el_port_list_item ( SEMICOLON el_port_list_item )* SEMICOLON ;
    public final Bind9ConfigParser.el_port_list_return el_port_list() throws RecognitionException {
        Bind9ConfigParser.el_port_list_return retval = new Bind9ConfigParser.el_port_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON160=null;
        Token SEMICOLON162=null;
        Bind9ConfigParser.el_port_list_item_return el_port_list_item159 = null;

        Bind9ConfigParser.el_port_list_item_return el_port_list_item161 = null;


        Object SEMICOLON160_tree=null;
        Object SEMICOLON162_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:14: ( el_port_list_item ( SEMICOLON el_port_list_item )* SEMICOLON )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:16: el_port_list_item ( SEMICOLON el_port_list_item )* SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_el_port_list_item_in_el_port_list1293);
            el_port_list_item159=el_port_list_item();

            state._fsp--;

            adaptor.addChild(root_0, el_port_list_item159.getTree());
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:34: ( SEMICOLON el_port_list_item )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==SEMICOLON) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==NUMBER||LA20_1==RANGE_WORD) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:343:35: SEMICOLON el_port_list_item
            	    {
            	    SEMICOLON160=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_el_port_list1296); 
            	    SEMICOLON160_tree = (Object)adaptor.create(SEMICOLON160);
            	    adaptor.addChild(root_0, SEMICOLON160_tree);

            	    pushFollow(FOLLOW_el_port_list_item_in_el_port_list1298);
            	    el_port_list_item161=el_port_list_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, el_port_list_item161.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);

            SEMICOLON162=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_el_port_list1302); 
            SEMICOLON162_tree = (Object)adaptor.create(SEMICOLON162);
            adaptor.addChild(root_0, SEMICOLON162_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_port_list"

    public static class el_port_list_item_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_port_list_item"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:344:1: el_port_list_item : ( NUMBER | ( RANGE_WORD NUMBER NUMBER ) );
    public final Bind9ConfigParser.el_port_list_item_return el_port_list_item() throws RecognitionException {
        Bind9ConfigParser.el_port_list_item_return retval = new Bind9ConfigParser.el_port_list_item_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER163=null;
        Token RANGE_WORD164=null;
        Token NUMBER165=null;
        Token NUMBER166=null;

        Object NUMBER163_tree=null;
        Object RANGE_WORD164_tree=null;
        Object NUMBER165_tree=null;
        Object NUMBER166_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:344:19: ( NUMBER | ( RANGE_WORD NUMBER NUMBER ) )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==NUMBER) ) {
                alt21=1;
            }
            else if ( (LA21_0==RANGE_WORD) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:344:21: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER163=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_el_port_list_item1310); 
                    NUMBER163_tree = (Object)adaptor.create(NUMBER163);
                    adaptor.addChild(root_0, NUMBER163_tree);


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:344:30: ( RANGE_WORD NUMBER NUMBER )
                    {
                    root_0 = (Object)adaptor.nil();

                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:344:30: ( RANGE_WORD NUMBER NUMBER )
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:344:31: RANGE_WORD NUMBER NUMBER
                    {
                    RANGE_WORD164=(Token)match(input,RANGE_WORD,FOLLOW_RANGE_WORD_in_el_port_list_item1315); 
                    RANGE_WORD164_tree = (Object)adaptor.create(RANGE_WORD164);
                    adaptor.addChild(root_0, RANGE_WORD164_tree);

                    NUMBER165=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_el_port_list_item1317); 
                    NUMBER165_tree = (Object)adaptor.create(NUMBER165);
                    adaptor.addChild(root_0, NUMBER165_tree);

                    NUMBER166=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_el_port_list_item1319); 
                    NUMBER166_tree = (Object)adaptor.create(NUMBER166);
                    adaptor.addChild(root_0, NUMBER166_tree);


                    }


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_port_list_item"

    public static class el_size_spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_size_spec"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:345:1: el_size_spec : ( ( KMG_NUMBER ) | UNLIMITED_WORD | DEFAULT_WORD );
    public final Bind9ConfigParser.el_size_spec_return el_size_spec() throws RecognitionException {
        Bind9ConfigParser.el_size_spec_return retval = new Bind9ConfigParser.el_size_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KMG_NUMBER167=null;
        Token UNLIMITED_WORD168=null;
        Token DEFAULT_WORD169=null;

        Object KMG_NUMBER167_tree=null;
        Object UNLIMITED_WORD168_tree=null;
        Object DEFAULT_WORD169_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:345:14: ( ( KMG_NUMBER ) | UNLIMITED_WORD | DEFAULT_WORD )
            int alt22=3;
            switch ( input.LA(1) ) {
            case KMG_NUMBER:
                {
                alt22=1;
                }
                break;
            case UNLIMITED_WORD:
                {
                alt22=2;
                }
                break;
            case DEFAULT_WORD:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:345:16: ( KMG_NUMBER )
                    {
                    root_0 = (Object)adaptor.nil();

                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:345:16: ( KMG_NUMBER )
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:345:17: KMG_NUMBER
                    {
                    KMG_NUMBER167=(Token)match(input,KMG_NUMBER,FOLLOW_KMG_NUMBER_in_el_size_spec1328); 
                    KMG_NUMBER167_tree = (Object)adaptor.create(KMG_NUMBER167);
                    adaptor.addChild(root_0, KMG_NUMBER167_tree);


                    }


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:345:29: UNLIMITED_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    UNLIMITED_WORD168=(Token)match(input,UNLIMITED_WORD,FOLLOW_UNLIMITED_WORD_in_el_size_spec1331); 
                    UNLIMITED_WORD168_tree = (Object)adaptor.create(UNLIMITED_WORD168);
                    adaptor.addChild(root_0, UNLIMITED_WORD168_tree);


                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:345:44: DEFAULT_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    DEFAULT_WORD169=(Token)match(input,DEFAULT_WORD,FOLLOW_DEFAULT_WORD_in_el_size_spec1333); 
                    DEFAULT_WORD169_tree = (Object)adaptor.create(DEFAULT_WORD169);
                    adaptor.addChild(root_0, DEFAULT_WORD169_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_size_spec"

    public static class el_yes_or_no_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_yes_or_no"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:346:1: el_yes_or_no : lex_yes_or_no ;
    public final Bind9ConfigParser.el_yes_or_no_return el_yes_or_no() throws RecognitionException {
        Bind9ConfigParser.el_yes_or_no_return retval = new Bind9ConfigParser.el_yes_or_no_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.lex_yes_or_no_return lex_yes_or_no170 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:346:14: ( lex_yes_or_no )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:346:16: lex_yes_or_no
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lex_yes_or_no_in_el_yes_or_no1340);
            lex_yes_or_no170=lex_yes_or_no();

            state._fsp--;

            adaptor.addChild(root_0, lex_yes_or_no170.getTree());

            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_yes_or_no"

    public static class el_dialup_option_default_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_dialup_option_default"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:1: el_dialup_option_default : ( lex_yes_or_no | NOTIFY_WORD );
    public final Bind9ConfigParser.el_dialup_option_default_return el_dialup_option_default() throws RecognitionException {
        Bind9ConfigParser.el_dialup_option_default_return retval = new Bind9ConfigParser.el_dialup_option_default_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOTIFY_WORD172=null;
        Bind9ConfigParser.lex_yes_or_no_return lex_yes_or_no171 = null;


        Object NOTIFY_WORD172_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:26: ( lex_yes_or_no | NOTIFY_WORD )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( ((LA23_0>=ZERO_OR_ONE_WORD && LA23_0<=TRUE_OR_FALSE_WORD)) ) {
                alt23=1;
            }
            else if ( (LA23_0==NOTIFY_WORD) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:28: lex_yes_or_no
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lex_yes_or_no_in_el_dialup_option_default1347);
                    lex_yes_or_no171=lex_yes_or_no();

                    state._fsp--;

                    adaptor.addChild(root_0, lex_yes_or_no171.getTree());

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:347:44: NOTIFY_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    NOTIFY_WORD172=(Token)match(input,NOTIFY_WORD,FOLLOW_NOTIFY_WORD_in_el_dialup_option_default1351); 
                    NOTIFY_WORD172_tree = (Object)adaptor.create(NOTIFY_WORD172);
                    adaptor.addChild(root_0, NOTIFY_WORD172_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_dialup_option_default"

    public static class el_dialup_option_slavestub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_dialup_option_slavestub"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:348:1: el_dialup_option_slavestub : ( el_dialup_option_default | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD );
    public final Bind9ConfigParser.el_dialup_option_slavestub_return el_dialup_option_slavestub() throws RecognitionException {
        Bind9ConfigParser.el_dialup_option_slavestub_return retval = new Bind9ConfigParser.el_dialup_option_slavestub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD174=null;
        Bind9ConfigParser.el_dialup_option_default_return el_dialup_option_default173 = null;


        Object NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD174_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:348:28: ( el_dialup_option_default | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==NOTIFY_WORD||(LA24_0>=ZERO_OR_ONE_WORD && LA24_0<=TRUE_OR_FALSE_WORD)) ) {
                alt24=1;
            }
            else if ( (LA24_0==NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:348:30: el_dialup_option_default
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_el_dialup_option_default_in_el_dialup_option_slavestub1358);
                    el_dialup_option_default173=el_dialup_option_default();

                    state._fsp--;

                    adaptor.addChild(root_0, el_dialup_option_default173.getTree());

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:348:57: NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD174=(Token)match(input,NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD,FOLLOW_NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD_in_el_dialup_option_slavestub1362); 
                    NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD174_tree = (Object)adaptor.create(NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD174);
                    adaptor.addChild(root_0, NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD174_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

        catch (RecognitionException re) {
        	reportError(re);
                recover(input,re);
                this.overrider.registerSemanticError("generic", re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "el_dialup_option_slavestub"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\23\uffff";
    static final String DFA7_eofS =
        "\23\uffff";
    static final String DFA7_minS =
        "\1\76\1\17\14\77\1\102\1\107\1\104\2\uffff";
    static final String DFA7_maxS =
        "\1\76\1\34\15\102\1\107\1\114\2\uffff";
    static final String DFA7_acceptS =
        "\21\uffff\1\2\1\1";
    static final String DFA7_specialS =
        "\23\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2\1\3\1\4\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\3\5",
            "\3\16\1\17",
            "\3\16\1\17",
            "\3\16\1\17",
            "\3\16\1\17",
            "\3\16\1\17",
            "\3\16\1\17",
            "\3\16\1\17",
            "\3\16\1\17",
            "\3\16\1\17",
            "\3\16\1\17",
            "\3\16\1\17",
            "\3\16\1\17",
            "\1\17",
            "\1\20",
            "\1\22\7\uffff\1\21",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "185:1: zone : ( 'zone' zone_name ( zone_class )? zone_forward_block -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block ) | 'zone' zone_name ( zone_class )? zone_delegation_block -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? ) );";
        }
    }
 

    public static final BitSet FOLLOW_entity_in_list105 = new BitSet(new long[]{0x4000000000000002L,0x0000000000002000L});
    public static final BitSet FOLLOW_BAD_in_list111 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_zone_in_entity121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_in_entity126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_zone139 = new BitSet(new long[]{0x000000001FFF8000L});
    public static final BitSet FOLLOW_zone_name_in_zone141 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_zone_class_in_zone143 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_zone_forward_block_in_zone146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_zone166 = new BitSet(new long[]{0x000000001FFF8000L});
    public static final BitSet FOLLOW_zone_name_in_zone168 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_zone_class_in_zone170 = new BitSet(new long[]{0x8000000000000000L,0x0000000000000007L});
    public static final BitSet FOLLOW_zone_delegation_block_in_zone173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_identifier_in_zone_name196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_class0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_zone_forward_block228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_zone_type_forward_in_zone_forward_block231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_zone_forward_param_in_zone_forward_block233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_zone_forward_block236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zone_forward_switch_def_in_zone_forward_param258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_zone_delegation_block268 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_zone_type_delegation_in_zone_delegation_block270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_zone_delegation_block272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_zone_forward_switch_def285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000060L});
    public static final BitSet FOLLOW_zone_forward_switch_in_zone_forward_switch_def287 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_forward_switch_def289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_forward_switch0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_zone_type_master327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_zone_type_master329 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_master331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_zone_type_slave345 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_zone_type_slave347 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_slave349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_zone_type_stub363 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_zone_type_stub365 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_stub367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_zone_type_forward381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_zone_type_forward383 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_forward385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_zone_type_hint399 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_zone_type_hint401 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_hint403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_zone_type_delegation417 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_zone_type_delegation419 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_delegation421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_testing437 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_testing_block_in_testing439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_testing_block461 = new BitSet(new long[]{0x0000000000000000L,0x000000007FFFC008L});
    public static final BitSet FOLLOW_testing_param_in_testing_block464 = new BitSet(new long[]{0x0000000000000000L,0x000000007FFFC008L});
    public static final BitSet FOLLOW_67_in_testing_block467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_domain_name_in_testing_param487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_acl_in_testing_param492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip4_in_testing_param497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip6_in_testing_param502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip_in_testing_param507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip_port_in_testing_param512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip_prefix_in_testing_param517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_key_id_in_testing_param522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_key_list_in_testing_param527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_number_in_testing_param532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_path_name_in_testing_param537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_port_list_in_testing_param542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_size_spec_in_testing_param547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_yes_or_no_in_testing_param552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_dialup_option_default_in_testing_param557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_dialup_option_slavestub_in_testing_param562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_masters_list_in_testing_param567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_testing_element_acl577 = new BitSet(new long[]{0x000000001FFF8000L});
    public static final BitSet FOLLOW_el_acl_name_in_testing_element_acl579 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_acl581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_testing_element_domain_name601 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_el_domain_name_in_testing_element_domain_name603 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_domain_name605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_testing_element_ip4625 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_el_ip4_addr_in_testing_element_ip4627 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_ip4629 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_testing_element_ip6649 = new BitSet(new long[]{0x000000FE00010000L});
    public static final BitSet FOLLOW_el_ip6_addr_in_testing_element_ip6651 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_ip6653 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_testing_element_ip673 = new BitSet(new long[]{0x000000FF00010000L});
    public static final BitSet FOLLOW_el_ip_addr_in_testing_element_ip675 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_ip677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_testing_element_ip_port697 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_el_ip_port_in_testing_element_ip_port699 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_ip_port701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_84_in_testing_element_ip_prefix721 = new BitSet(new long[]{0x00000C0100010000L});
    public static final BitSet FOLLOW_el_ip_prefix_in_testing_element_ip_prefix723 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_ip_prefix725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_testing_element_key_id745 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_el_key_id_in_testing_element_key_id747 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_key_id749 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_testing_element_key_list769 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_el_key_list_in_testing_element_key_list771 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_key_list773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_87_in_testing_element_number793 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_el_number_in_testing_element_number795 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_number797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_88_in_testing_element_path_name817 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_el_path_name_in_testing_element_path_name819 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_path_name821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_89_in_testing_element_port_list841 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_el_port_list_in_testing_element_port_list843 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_port_list845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_90_in_testing_element_size_spec865 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_el_size_spec_in_testing_element_size_spec867 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_size_spec869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_91_in_testing_element_yes_or_no889 = new BitSet(new long[]{0x000000001C000000L});
    public static final BitSet FOLLOW_el_yes_or_no_in_testing_element_yes_or_no891 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_yes_or_no893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_92_in_testing_element_dialup_option_default913 = new BitSet(new long[]{0x000000001C200000L});
    public static final BitSet FOLLOW_el_dialup_option_default_in_testing_element_dialup_option_default915 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_dialup_option_default917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_93_in_testing_element_dialup_option_slavestub937 = new BitSet(new long[]{0x000000001C600000L});
    public static final BitSet FOLLOW_el_dialup_option_slavestub_in_testing_element_dialup_option_slavestub939 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_dialup_option_slavestub941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_94_in_testing_element_masters_list961 = new BitSet(new long[]{0x000000FF1FFF8000L});
    public static final BitSet FOLLOW_el_masters_list_in_testing_element_masters_list963 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_masters_list965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHANUM_NONSTD_in_lex_identifier989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_lex_identifier993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KMG_NUMBER_in_lex_identifier997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_yes_or_no_in_lex_identifier1001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_WORD_in_lex_identifier1007 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNLIMITED_WORD_in_lex_identifier1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_WORD_in_lex_identifier1015 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTIFY_WORD_in_lex_identifier1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD_in_lex_identifier1025 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PORT_WORD_in_lex_identifier1031 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KEY_WORD_in_lex_identifier1035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FFFF_WORD_in_lex_identifier1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_lex_number0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_lex_yes_or_no0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_identifier_in_el_acl_name1079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_masters_list_item_in_el_masters_list1086 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_el_masters_list1089 = new BitSet(new long[]{0x000000FF1FFF8000L});
    public static final BitSet FOLLOW_el_masters_list_item_in_el_masters_list1091 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_SEMICOLON_in_el_masters_list1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_identifier_in_el_masters_list_item1105 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_el_ip_addr_in_el_masters_list_item1110 = new BitSet(new long[]{0x0000000001800002L});
    public static final BitSet FOLLOW_PORT_WORD_in_el_masters_list_item1113 = new BitSet(new long[]{0x0000020000010000L});
    public static final BitSet FOLLOW_el_ip_port_in_el_masters_list_item1115 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_KEY_WORD_in_el_masters_list_item1121 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_ONE_LINE_DOUBLE_QUOTED_STRING_in_el_masters_list_item1123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOMAIN_NAME_in_el_domain_name1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_ip4_addr_in_el_ip_addr1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_ip6_addr_in_el_ip_addr1149 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP4_ADDR_in_el_ip4_addr1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_el_ip6_addr1163 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_PERCENT_in_el_ip6_addr1205 = new BitSet(new long[]{0x000000001FFF8000L});
    public static final BitSet FOLLOW_lex_identifier_in_el_ip6_addr1207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_el_ip_port0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_el_ip_prefix1230 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_el_ip_prefix1245 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUMBER_in_el_ip_prefix1247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_domain_name_in_el_key_id1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_key_id_in_el_key_list1262 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_el_key_list1265 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_el_key_id_in_el_key_list1267 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_el_key_list1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_number_in_el_number1278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ONE_LINE_DOUBLE_QUOTED_STRING_in_el_path_name1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_port_list_item_in_el_port_list1293 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_el_port_list1296 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_el_port_list_item_in_el_port_list1298 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_el_port_list1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_el_port_list_item1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_WORD_in_el_port_list_item1315 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUMBER_in_el_port_list_item1317 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUMBER_in_el_port_list_item1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KMG_NUMBER_in_el_size_spec1328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNLIMITED_WORD_in_el_size_spec1331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_WORD_in_el_size_spec1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_yes_or_no_in_el_yes_or_no1340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_yes_or_no_in_el_dialup_option_default1347 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTIFY_WORD_in_el_dialup_option_default1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_dialup_option_default_in_el_dialup_option_slavestub1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD_in_el_dialup_option_slavestub1362 = new BitSet(new long[]{0x0000000000000002L});

}
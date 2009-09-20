// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-20 12:58:05

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ST_ZONE_MASTER", "ST_ZONE_SLAVE", "ST_ZONE_HINT", "ST_ZONE_STUB", "ST_ZONE_FORWARD", "ST_ZONE_DELEGATION", "ST_ZONE_PLIST", "ST_TESTING", "ST_TESTING_PLIST", "PLIST_PARAM", "BAD", "ALPHANUM_NONSTD", "NUMBER", "KMG_NUMBER", "RANGE_WORD", "UNLIMITED_WORD", "DEFAULT_WORD", "ZERO_OR_ONE_WORD", "YES_OR_NO_WORD", "TRUE_OR_FALSE_WORD", "IP4_ADDR", "IP6_ADDR", "ASTERISK", "IP4_SHORT_2", "IP4_SHORT_3", "FORWARD_SLASH", "SEMICOLON", "DOUBLE_QUOTE", "CR", "LF", "C_COMMENT", "CPP_COMMENT", "PERL_COMMENT", "COMMENT", "NL", "WS", "THREE_DIGIT_NUMBER", "DIGIT", "ANY_ASCII_ALPHANUM", "IP6_VALID_CHAR", "'zone'", "'IN'", "'HS'", "'CHAOS'", "'{'", "'}'", "'forward'", "'first'", "'only'", "'type'", "'master'", "'slave'", "'stub'", "'hint'", "'delegation-only'", "'testing'", "'acl_name'", "'domain_name'", "'ip4'", "'ip6'", "'ip'", "'ip_port'", "'ip_prefix'", "'key_id'", "'key_list'", "'number'", "'path_name'", "'port_list'", "'size_spec'", "'yes_or_no'", "'.'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int IP6_VALID_CHAR=43;
    public static final int T__66=66;
    public static final int ST_ZONE_PLIST=10;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int YES_OR_NO_WORD=22;
    public static final int T__63=63;
    public static final int DOUBLE_QUOTE=31;
    public static final int ST_ZONE_MASTER=4;
    public static final int ST_ZONE_FORWARD=8;
    public static final int UNLIMITED_WORD=19;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int ALPHANUM_NONSTD=15;
    public static final int ST_ZONE_SLAVE=5;
    public static final int ASTERISK=26;
    public static final int ST_ZONE_DELEGATION=9;
    public static final int ST_ZONE_STUB=7;
    public static final int PERL_COMMENT=36;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int ANY_ASCII_ALPHANUM=42;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int CPP_COMMENT=35;
    public static final int DIGIT=41;
    public static final int NL=38;
    public static final int COMMENT=37;
    public static final int T__50=50;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int ST_TESTING_PLIST=12;
    public static final int T__49=49;
    public static final int NUMBER=16;
    public static final int ST_TESTING=11;
    public static final int SEMICOLON=30;
    public static final int THREE_DIGIT_NUMBER=40;
    public static final int PLIST_PARAM=13;
    public static final int DEFAULT_WORD=20;
    public static final int ST_ZONE_HINT=6;
    public static final int WS=39;
    public static final int T__71=71;
    public static final int ZERO_OR_ONE_WORD=21;
    public static final int KMG_NUMBER=17;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int BAD=14;
    public static final int IP4_ADDR=24;
    public static final int IP6_ADDR=25;
    public static final int RANGE_WORD=18;
    public static final int CR=32;
    public static final int C_COMMENT=34;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int IP4_SHORT_3=28;
    public static final int FORWARD_SLASH=29;
    public static final int LF=33;
    public static final int IP4_SHORT_2=27;
    public static final int TRUE_OR_FALSE_WORD=23;

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

            if ( (LA3_0==EOF||LA3_0==44||LA3_0==59) ) {
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

                        if ( (LA1_0==44||LA1_0==59) ) {
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

            if ( (LA4_0==44) ) {
                alt4=1;
            }
            else if ( (LA4_0==59) ) {
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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
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
                    string_literal5=(Token)match(input,44,FOLLOW_44_in_zone139);  
                    stream_44.add(string_literal5);

                    pushFollow(FOLLOW_zone_name_in_zone141);
                    zone_name6=zone_name();

                    state._fsp--;

                    stream_zone_name.add(zone_name6.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:21: ( zone_class )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=45 && LA5_0<=47)) ) {
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
                    // elements: zone_name, zone_forward_block, zone_class
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
                    string_literal9=(Token)match(input,44,FOLLOW_44_in_zone166);  
                    stream_44.add(string_literal9);

                    pushFollow(FOLLOW_zone_name_in_zone168);
                    zone_name10=zone_name();

                    state._fsp--;

                    stream_zone_name.add(zone_name10.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:187:21: ( zone_class )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=45 && LA6_0<=47)) ) {
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
                    // elements: zone_class, zone_name
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
            if ( (input.LA(1)>=45 && input.LA(1)<=47) ) {
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
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_zone_type_forward=new RewriteRuleSubtreeStream(adaptor,"rule zone_type_forward");
        RewriteRuleSubtreeStream stream_zone_forward_param=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_param");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:2: (pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}' -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:4: pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}'
            {
            pl=(Token)match(input,48,FOLLOW_48_in_zone_forward_block228);  
            stream_48.add(pl);

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

                if ( (LA8_0==50) ) {
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

            char_literal17=(Token)match(input,49,FOLLOW_49_in_zone_forward_block236);  
            stream_49.add(char_literal17);



            // AST REWRITE
            // elements: zone_forward_param, zone_type_forward
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

            char_literal19=(Token)match(input,48,FOLLOW_48_in_zone_delegation_block268); 
            char_literal19_tree = (Object)adaptor.create(char_literal19);
            adaptor.addChild(root_0, char_literal19_tree);

            pushFollow(FOLLOW_zone_type_delegation_in_zone_delegation_block270);
            zone_type_delegation20=zone_type_delegation();

            state._fsp--;

            adaptor.addChild(root_0, zone_type_delegation20.getTree());
            char_literal21=(Token)match(input,49,FOLLOW_49_in_zone_delegation_block272); 
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
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_zone_forward_switch=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_switch");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:212:2: ( 'forward' zone_forward_switch ';' -> ^( PLIST_PARAM 'forward' zone_forward_switch ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:212:4: 'forward' zone_forward_switch ';'
            {
            string_literal22=(Token)match(input,50,FOLLOW_50_in_zone_forward_switch_def285);  
            stream_50.add(string_literal22);

            pushFollow(FOLLOW_zone_forward_switch_in_zone_forward_switch_def287);
            zone_forward_switch23=zone_forward_switch();

            state._fsp--;

            stream_zone_forward_switch.add(zone_forward_switch23.getTree());
            char_literal24=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_forward_switch_def289);  
            stream_SEMICOLON.add(char_literal24);



            // AST REWRITE
            // elements: zone_forward_switch, 50
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

                adaptor.addChild(root_1, stream_50.nextNode());
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
            if ( (input.LA(1)>=51 && input.LA(1)<=52) ) {
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
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:221:2: ( 'type' 'master' ';' -> 'master' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:221:4: 'type' 'master' ';'
            {
            string_literal26=(Token)match(input,53,FOLLOW_53_in_zone_type_master327);  
            stream_53.add(string_literal26);

            string_literal27=(Token)match(input,54,FOLLOW_54_in_zone_type_master329);  
            stream_54.add(string_literal27);

            char_literal28=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_master331);  
            stream_SEMICOLON.add(char_literal28);



            // AST REWRITE
            // elements: 54
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
                adaptor.addChild(root_0, stream_54.nextNode());

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
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:224:2: ( 'type' 'slave' ';' -> 'slave' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:224:4: 'type' 'slave' ';'
            {
            string_literal29=(Token)match(input,53,FOLLOW_53_in_zone_type_slave345);  
            stream_53.add(string_literal29);

            string_literal30=(Token)match(input,55,FOLLOW_55_in_zone_type_slave347);  
            stream_55.add(string_literal30);

            char_literal31=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_slave349);  
            stream_SEMICOLON.add(char_literal31);



            // AST REWRITE
            // elements: 55
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
                adaptor.addChild(root_0, stream_55.nextNode());

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
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:227:2: ( 'type' 'stub' ';' -> 'stub' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:227:4: 'type' 'stub' ';'
            {
            string_literal32=(Token)match(input,53,FOLLOW_53_in_zone_type_stub363);  
            stream_53.add(string_literal32);

            string_literal33=(Token)match(input,56,FOLLOW_56_in_zone_type_stub365);  
            stream_56.add(string_literal33);

            char_literal34=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_stub367);  
            stream_SEMICOLON.add(char_literal34);



            // AST REWRITE
            // elements: 56
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
                adaptor.addChild(root_0, stream_56.nextNode());

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
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:230:2: ( 'type' 'forward' ';' -> 'forward' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:230:4: 'type' 'forward' ';'
            {
            string_literal35=(Token)match(input,53,FOLLOW_53_in_zone_type_forward381);  
            stream_53.add(string_literal35);

            string_literal36=(Token)match(input,50,FOLLOW_50_in_zone_type_forward383);  
            stream_50.add(string_literal36);

            char_literal37=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_forward385);  
            stream_SEMICOLON.add(char_literal37);



            // AST REWRITE
            // elements: 50
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
                adaptor.addChild(root_0, stream_50.nextNode());

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
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:233:2: ( 'type' 'hint' ';' -> 'hint' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:233:4: 'type' 'hint' ';'
            {
            string_literal38=(Token)match(input,53,FOLLOW_53_in_zone_type_hint399);  
            stream_53.add(string_literal38);

            string_literal39=(Token)match(input,57,FOLLOW_57_in_zone_type_hint401);  
            stream_57.add(string_literal39);

            char_literal40=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_hint403);  
            stream_SEMICOLON.add(char_literal40);



            // AST REWRITE
            // elements: 57
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
                adaptor.addChild(root_0, stream_57.nextNode());

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
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:236:2: ( 'type' 'delegation-only' ';' -> 'delegation-only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:236:4: 'type' 'delegation-only' ';'
            {
            string_literal41=(Token)match(input,53,FOLLOW_53_in_zone_type_delegation417);  
            stream_53.add(string_literal41);

            string_literal42=(Token)match(input,58,FOLLOW_58_in_zone_type_delegation419);  
            stream_58.add(string_literal42);

            char_literal43=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_zone_type_delegation421);  
            stream_SEMICOLON.add(char_literal43);



            // AST REWRITE
            // elements: 58
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
                adaptor.addChild(root_0, stream_58.nextNode());

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
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleSubtreeStream stream_testing_block=new RewriteRuleSubtreeStream(adaptor,"rule testing_block");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:240:9: ( 'testing' testing_block -> ^( ST_TESTING testing_block ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:240:11: 'testing' testing_block
            {
            string_literal44=(Token)match(input,59,FOLLOW_59_in_testing437);  
            stream_59.add(string_literal44);

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
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_testing_param=new RewriteRuleSubtreeStream(adaptor,"rule testing_param");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:2: (pl= '{' ( ( testing_param )* ) '}' -> ^( ST_TESTING_PLIST[$pl,\"ST_TESTING_PLIST\"] ( testing_param )* ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:4: pl= '{' ( ( testing_param )* ) '}'
            {
            pl=(Token)match(input,48,FOLLOW_48_in_testing_block461);  
            stream_48.add(pl);

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:13: ( ( testing_param )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:14: ( testing_param )*
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:14: ( testing_param )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=60 && LA9_0<=73)) ) {
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

            char_literal47=(Token)match(input,49,FOLLOW_49_in_testing_block467);  
            stream_49.add(char_literal47);



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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:245:1: testing_param : ( testing_element_domain_name | testing_element_acl | testing_element_ip4 | testing_element_ip6 | testing_element_ip | testing_element_ip_port | testing_element_ip_prefix | testing_element_key_id | testing_element_key_list | testing_element_number | testing_element_path_name | testing_element_port_list | testing_element_size_spec | testing_element_yes_or_no );
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



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:246:2: ( testing_element_domain_name | testing_element_acl | testing_element_ip4 | testing_element_ip6 | testing_element_ip | testing_element_ip_port | testing_element_ip_prefix | testing_element_key_id | testing_element_key_list | testing_element_number | testing_element_path_name | testing_element_port_list | testing_element_size_spec | testing_element_yes_or_no )
            int alt10=14;
            switch ( input.LA(1) ) {
            case 61:
                {
                alt10=1;
                }
                break;
            case 60:
                {
                alt10=2;
                }
                break;
            case 62:
                {
                alt10=3;
                }
                break;
            case 63:
                {
                alt10=4;
                }
                break;
            case 64:
                {
                alt10=5;
                }
                break;
            case 65:
                {
                alt10=6;
                }
                break;
            case 66:
                {
                alt10=7;
                }
                break;
            case 67:
                {
                alt10=8;
                }
                break;
            case 68:
                {
                alt10=9;
                }
                break;
            case 69:
                {
                alt10=10;
                }
                break;
            case 70:
                {
                alt10=11;
                }
                break;
            case 71:
                {
                alt10=12;
                }
                break;
            case 72:
                {
                alt10=13;
                }
                break;
            case 73:
                {
                alt10=14;
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:261:1: testing_element_acl : 'acl_name' el_acl_name ';' -> ^( PLIST_PARAM 'acl_name' el_acl_name ) ;
    public final Bind9ConfigParser.testing_element_acl_return testing_element_acl() throws RecognitionException {
        Bind9ConfigParser.testing_element_acl_return retval = new Bind9ConfigParser.testing_element_acl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal62=null;
        Token char_literal64=null;
        Bind9ConfigParser.el_acl_name_return el_acl_name63 = null;


        Object string_literal62_tree=null;
        Object char_literal64_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_60=new RewriteRuleTokenStream(adaptor,"token 60");
        RewriteRuleSubtreeStream stream_el_acl_name=new RewriteRuleSubtreeStream(adaptor,"rule el_acl_name");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:262:2: ( 'acl_name' el_acl_name ';' -> ^( PLIST_PARAM 'acl_name' el_acl_name ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:262:4: 'acl_name' el_acl_name ';'
            {
            string_literal62=(Token)match(input,60,FOLLOW_60_in_testing_element_acl562);  
            stream_60.add(string_literal62);

            pushFollow(FOLLOW_el_acl_name_in_testing_element_acl564);
            el_acl_name63=el_acl_name();

            state._fsp--;

            stream_el_acl_name.add(el_acl_name63.getTree());
            char_literal64=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_acl566);  
            stream_SEMICOLON.add(char_literal64);



            // AST REWRITE
            // elements: el_acl_name, 60
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 262:31: -> ^( PLIST_PARAM 'acl_name' el_acl_name )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:262:34: ^( PLIST_PARAM 'acl_name' el_acl_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_60.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:1: testing_element_domain_name : 'domain_name' el_domain_name ';' -> ^( PLIST_PARAM 'domain_name' el_domain_name ) ;
    public final Bind9ConfigParser.testing_element_domain_name_return testing_element_domain_name() throws RecognitionException {
        Bind9ConfigParser.testing_element_domain_name_return retval = new Bind9ConfigParser.testing_element_domain_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal65=null;
        Token char_literal67=null;
        Bind9ConfigParser.el_domain_name_return el_domain_name66 = null;


        Object string_literal65_tree=null;
        Object char_literal67_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleSubtreeStream stream_el_domain_name=new RewriteRuleSubtreeStream(adaptor,"rule el_domain_name");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:265:2: ( 'domain_name' el_domain_name ';' -> ^( PLIST_PARAM 'domain_name' el_domain_name ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:265:4: 'domain_name' el_domain_name ';'
            {
            string_literal65=(Token)match(input,61,FOLLOW_61_in_testing_element_domain_name586);  
            stream_61.add(string_literal65);

            pushFollow(FOLLOW_el_domain_name_in_testing_element_domain_name588);
            el_domain_name66=el_domain_name();

            state._fsp--;

            stream_el_domain_name.add(el_domain_name66.getTree());
            char_literal67=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_domain_name590);  
            stream_SEMICOLON.add(char_literal67);



            // AST REWRITE
            // elements: 61, el_domain_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 265:37: -> ^( PLIST_PARAM 'domain_name' el_domain_name )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:265:40: ^( PLIST_PARAM 'domain_name' el_domain_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_61.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:267:1: testing_element_ip4 : 'ip4' el_ip4_addr ';' -> ^( PLIST_PARAM 'ip4' el_ip4_addr ) ;
    public final Bind9ConfigParser.testing_element_ip4_return testing_element_ip4() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip4_return retval = new Bind9ConfigParser.testing_element_ip4_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal68=null;
        Token char_literal70=null;
        Bind9ConfigParser.el_ip4_addr_return el_ip4_addr69 = null;


        Object string_literal68_tree=null;
        Object char_literal70_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleSubtreeStream stream_el_ip4_addr=new RewriteRuleSubtreeStream(adaptor,"rule el_ip4_addr");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:268:2: ( 'ip4' el_ip4_addr ';' -> ^( PLIST_PARAM 'ip4' el_ip4_addr ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:268:4: 'ip4' el_ip4_addr ';'
            {
            string_literal68=(Token)match(input,62,FOLLOW_62_in_testing_element_ip4610);  
            stream_62.add(string_literal68);

            pushFollow(FOLLOW_el_ip4_addr_in_testing_element_ip4612);
            el_ip4_addr69=el_ip4_addr();

            state._fsp--;

            stream_el_ip4_addr.add(el_ip4_addr69.getTree());
            char_literal70=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_ip4614);  
            stream_SEMICOLON.add(char_literal70);



            // AST REWRITE
            // elements: 62, el_ip4_addr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 268:26: -> ^( PLIST_PARAM 'ip4' el_ip4_addr )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:268:29: ^( PLIST_PARAM 'ip4' el_ip4_addr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_62.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:270:1: testing_element_ip6 : 'ip6' el_ip6_addr ';' -> ^( PLIST_PARAM 'ip6' el_ip6_addr ) ;
    public final Bind9ConfigParser.testing_element_ip6_return testing_element_ip6() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip6_return retval = new Bind9ConfigParser.testing_element_ip6_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal71=null;
        Token char_literal73=null;
        Bind9ConfigParser.el_ip6_addr_return el_ip6_addr72 = null;


        Object string_literal71_tree=null;
        Object char_literal73_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_el_ip6_addr=new RewriteRuleSubtreeStream(adaptor,"rule el_ip6_addr");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:271:2: ( 'ip6' el_ip6_addr ';' -> ^( PLIST_PARAM 'ip6' el_ip6_addr ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:271:4: 'ip6' el_ip6_addr ';'
            {
            string_literal71=(Token)match(input,63,FOLLOW_63_in_testing_element_ip6634);  
            stream_63.add(string_literal71);

            pushFollow(FOLLOW_el_ip6_addr_in_testing_element_ip6636);
            el_ip6_addr72=el_ip6_addr();

            state._fsp--;

            stream_el_ip6_addr.add(el_ip6_addr72.getTree());
            char_literal73=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_ip6638);  
            stream_SEMICOLON.add(char_literal73);



            // AST REWRITE
            // elements: el_ip6_addr, 63
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 271:26: -> ^( PLIST_PARAM 'ip6' el_ip6_addr )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:271:29: ^( PLIST_PARAM 'ip6' el_ip6_addr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_63.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:273:1: testing_element_ip : 'ip' el_ip_addr ';' -> ^( PLIST_PARAM 'ip' el_ip_addr ) ;
    public final Bind9ConfigParser.testing_element_ip_return testing_element_ip() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip_return retval = new Bind9ConfigParser.testing_element_ip_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal74=null;
        Token char_literal76=null;
        Bind9ConfigParser.el_ip_addr_return el_ip_addr75 = null;


        Object string_literal74_tree=null;
        Object char_literal76_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");
        RewriteRuleSubtreeStream stream_el_ip_addr=new RewriteRuleSubtreeStream(adaptor,"rule el_ip_addr");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:2: ( 'ip' el_ip_addr ';' -> ^( PLIST_PARAM 'ip' el_ip_addr ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:4: 'ip' el_ip_addr ';'
            {
            string_literal74=(Token)match(input,64,FOLLOW_64_in_testing_element_ip658);  
            stream_64.add(string_literal74);

            pushFollow(FOLLOW_el_ip_addr_in_testing_element_ip660);
            el_ip_addr75=el_ip_addr();

            state._fsp--;

            stream_el_ip_addr.add(el_ip_addr75.getTree());
            char_literal76=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_ip662);  
            stream_SEMICOLON.add(char_literal76);



            // AST REWRITE
            // elements: el_ip_addr, 64
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 274:24: -> ^( PLIST_PARAM 'ip' el_ip_addr )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:274:27: ^( PLIST_PARAM 'ip' el_ip_addr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_64.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:276:1: testing_element_ip_port : 'ip_port' el_ip_port ';' -> ^( PLIST_PARAM 'ip_port' el_ip_port ) ;
    public final Bind9ConfigParser.testing_element_ip_port_return testing_element_ip_port() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip_port_return retval = new Bind9ConfigParser.testing_element_ip_port_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal77=null;
        Token char_literal79=null;
        Bind9ConfigParser.el_ip_port_return el_ip_port78 = null;


        Object string_literal77_tree=null;
        Object char_literal79_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");
        RewriteRuleSubtreeStream stream_el_ip_port=new RewriteRuleSubtreeStream(adaptor,"rule el_ip_port");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:277:2: ( 'ip_port' el_ip_port ';' -> ^( PLIST_PARAM 'ip_port' el_ip_port ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:277:4: 'ip_port' el_ip_port ';'
            {
            string_literal77=(Token)match(input,65,FOLLOW_65_in_testing_element_ip_port682);  
            stream_65.add(string_literal77);

            pushFollow(FOLLOW_el_ip_port_in_testing_element_ip_port684);
            el_ip_port78=el_ip_port();

            state._fsp--;

            stream_el_ip_port.add(el_ip_port78.getTree());
            char_literal79=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_ip_port686);  
            stream_SEMICOLON.add(char_literal79);



            // AST REWRITE
            // elements: 65, el_ip_port
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 277:29: -> ^( PLIST_PARAM 'ip_port' el_ip_port )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:277:32: ^( PLIST_PARAM 'ip_port' el_ip_port )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_65.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:279:1: testing_element_ip_prefix : 'ip_prefix' el_ip_prefix ';' -> ^( PLIST_PARAM 'ip_prefix' el_ip_prefix ) ;
    public final Bind9ConfigParser.testing_element_ip_prefix_return testing_element_ip_prefix() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip_prefix_return retval = new Bind9ConfigParser.testing_element_ip_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal80=null;
        Token char_literal82=null;
        Bind9ConfigParser.el_ip_prefix_return el_ip_prefix81 = null;


        Object string_literal80_tree=null;
        Object char_literal82_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_el_ip_prefix=new RewriteRuleSubtreeStream(adaptor,"rule el_ip_prefix");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:280:2: ( 'ip_prefix' el_ip_prefix ';' -> ^( PLIST_PARAM 'ip_prefix' el_ip_prefix ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:280:4: 'ip_prefix' el_ip_prefix ';'
            {
            string_literal80=(Token)match(input,66,FOLLOW_66_in_testing_element_ip_prefix706);  
            stream_66.add(string_literal80);

            pushFollow(FOLLOW_el_ip_prefix_in_testing_element_ip_prefix708);
            el_ip_prefix81=el_ip_prefix();

            state._fsp--;

            stream_el_ip_prefix.add(el_ip_prefix81.getTree());
            char_literal82=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_ip_prefix710);  
            stream_SEMICOLON.add(char_literal82);



            // AST REWRITE
            // elements: el_ip_prefix, 66
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 280:33: -> ^( PLIST_PARAM 'ip_prefix' el_ip_prefix )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:280:36: ^( PLIST_PARAM 'ip_prefix' el_ip_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_66.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:1: testing_element_key_id : 'key_id' el_key_id ';' -> ^( PLIST_PARAM 'key_id' el_key_id ) ;
    public final Bind9ConfigParser.testing_element_key_id_return testing_element_key_id() throws RecognitionException {
        Bind9ConfigParser.testing_element_key_id_return retval = new Bind9ConfigParser.testing_element_key_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal83=null;
        Token char_literal85=null;
        Bind9ConfigParser.el_key_id_return el_key_id84 = null;


        Object string_literal83_tree=null;
        Object char_literal85_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_el_key_id=new RewriteRuleSubtreeStream(adaptor,"rule el_key_id");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:283:2: ( 'key_id' el_key_id ';' -> ^( PLIST_PARAM 'key_id' el_key_id ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:283:4: 'key_id' el_key_id ';'
            {
            string_literal83=(Token)match(input,67,FOLLOW_67_in_testing_element_key_id730);  
            stream_67.add(string_literal83);

            pushFollow(FOLLOW_el_key_id_in_testing_element_key_id732);
            el_key_id84=el_key_id();

            state._fsp--;

            stream_el_key_id.add(el_key_id84.getTree());
            char_literal85=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_key_id734);  
            stream_SEMICOLON.add(char_literal85);



            // AST REWRITE
            // elements: 67, el_key_id
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 283:27: -> ^( PLIST_PARAM 'key_id' el_key_id )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:283:30: ^( PLIST_PARAM 'key_id' el_key_id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_67.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:285:1: testing_element_key_list : 'key_list' '\"' el_key_list '\"' ';' -> ^( PLIST_PARAM 'key_list' el_key_list ) ;
    public final Bind9ConfigParser.testing_element_key_list_return testing_element_key_list() throws RecognitionException {
        Bind9ConfigParser.testing_element_key_list_return retval = new Bind9ConfigParser.testing_element_key_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal86=null;
        Token char_literal87=null;
        Token char_literal89=null;
        Token char_literal90=null;
        Bind9ConfigParser.el_key_list_return el_key_list88 = null;


        Object string_literal86_tree=null;
        Object char_literal87_tree=null;
        Object char_literal89_tree=null;
        Object char_literal90_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_DOUBLE_QUOTE=new RewriteRuleTokenStream(adaptor,"token DOUBLE_QUOTE");
        RewriteRuleSubtreeStream stream_el_key_list=new RewriteRuleSubtreeStream(adaptor,"rule el_key_list");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:286:2: ( 'key_list' '\"' el_key_list '\"' ';' -> ^( PLIST_PARAM 'key_list' el_key_list ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:286:4: 'key_list' '\"' el_key_list '\"' ';'
            {
            string_literal86=(Token)match(input,68,FOLLOW_68_in_testing_element_key_list754);  
            stream_68.add(string_literal86);

            char_literal87=(Token)match(input,DOUBLE_QUOTE,FOLLOW_DOUBLE_QUOTE_in_testing_element_key_list756);  
            stream_DOUBLE_QUOTE.add(char_literal87);

            pushFollow(FOLLOW_el_key_list_in_testing_element_key_list758);
            el_key_list88=el_key_list();

            state._fsp--;

            stream_el_key_list.add(el_key_list88.getTree());
            char_literal89=(Token)match(input,DOUBLE_QUOTE,FOLLOW_DOUBLE_QUOTE_in_testing_element_key_list760);  
            stream_DOUBLE_QUOTE.add(char_literal89);

            char_literal90=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_key_list762);  
            stream_SEMICOLON.add(char_literal90);



            // AST REWRITE
            // elements: 68, el_key_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 286:39: -> ^( PLIST_PARAM 'key_list' el_key_list )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:286:42: ^( PLIST_PARAM 'key_list' el_key_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_68.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:288:1: testing_element_number : 'number' el_number ';' -> ^( PLIST_PARAM 'number' el_number ) ;
    public final Bind9ConfigParser.testing_element_number_return testing_element_number() throws RecognitionException {
        Bind9ConfigParser.testing_element_number_return retval = new Bind9ConfigParser.testing_element_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal91=null;
        Token char_literal93=null;
        Bind9ConfigParser.el_number_return el_number92 = null;


        Object string_literal91_tree=null;
        Object char_literal93_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleSubtreeStream stream_el_number=new RewriteRuleSubtreeStream(adaptor,"rule el_number");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:289:2: ( 'number' el_number ';' -> ^( PLIST_PARAM 'number' el_number ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:289:4: 'number' el_number ';'
            {
            string_literal91=(Token)match(input,69,FOLLOW_69_in_testing_element_number782);  
            stream_69.add(string_literal91);

            pushFollow(FOLLOW_el_number_in_testing_element_number784);
            el_number92=el_number();

            state._fsp--;

            stream_el_number.add(el_number92.getTree());
            char_literal93=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_number786);  
            stream_SEMICOLON.add(char_literal93);



            // AST REWRITE
            // elements: el_number, 69
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 289:27: -> ^( PLIST_PARAM 'number' el_number )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:289:30: ^( PLIST_PARAM 'number' el_number )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_69.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:291:1: testing_element_path_name : 'path_name' el_path_name ';' -> ^( PLIST_PARAM 'path_name' el_path_name ) ;
    public final Bind9ConfigParser.testing_element_path_name_return testing_element_path_name() throws RecognitionException {
        Bind9ConfigParser.testing_element_path_name_return retval = new Bind9ConfigParser.testing_element_path_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal94=null;
        Token char_literal96=null;
        Bind9ConfigParser.el_path_name_return el_path_name95 = null;


        Object string_literal94_tree=null;
        Object char_literal96_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_el_path_name=new RewriteRuleSubtreeStream(adaptor,"rule el_path_name");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:292:2: ( 'path_name' el_path_name ';' -> ^( PLIST_PARAM 'path_name' el_path_name ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:292:4: 'path_name' el_path_name ';'
            {
            string_literal94=(Token)match(input,70,FOLLOW_70_in_testing_element_path_name806);  
            stream_70.add(string_literal94);

            pushFollow(FOLLOW_el_path_name_in_testing_element_path_name808);
            el_path_name95=el_path_name();

            state._fsp--;

            stream_el_path_name.add(el_path_name95.getTree());
            char_literal96=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_path_name810);  
            stream_SEMICOLON.add(char_literal96);



            // AST REWRITE
            // elements: 70, el_path_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 292:33: -> ^( PLIST_PARAM 'path_name' el_path_name )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:292:36: ^( PLIST_PARAM 'path_name' el_path_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_70.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:1: testing_element_port_list : 'port_list' '\"' el_port_list '\"' ';' -> ^( PLIST_PARAM 'port_list' el_port_list ) ;
    public final Bind9ConfigParser.testing_element_port_list_return testing_element_port_list() throws RecognitionException {
        Bind9ConfigParser.testing_element_port_list_return retval = new Bind9ConfigParser.testing_element_port_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal97=null;
        Token char_literal98=null;
        Token char_literal100=null;
        Token char_literal101=null;
        Bind9ConfigParser.el_port_list_return el_port_list99 = null;


        Object string_literal97_tree=null;
        Object char_literal98_tree=null;
        Object char_literal100_tree=null;
        Object char_literal101_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_DOUBLE_QUOTE=new RewriteRuleTokenStream(adaptor,"token DOUBLE_QUOTE");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_el_port_list=new RewriteRuleSubtreeStream(adaptor,"rule el_port_list");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:295:2: ( 'port_list' '\"' el_port_list '\"' ';' -> ^( PLIST_PARAM 'port_list' el_port_list ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:295:4: 'port_list' '\"' el_port_list '\"' ';'
            {
            string_literal97=(Token)match(input,71,FOLLOW_71_in_testing_element_port_list830);  
            stream_71.add(string_literal97);

            char_literal98=(Token)match(input,DOUBLE_QUOTE,FOLLOW_DOUBLE_QUOTE_in_testing_element_port_list832);  
            stream_DOUBLE_QUOTE.add(char_literal98);

            pushFollow(FOLLOW_el_port_list_in_testing_element_port_list834);
            el_port_list99=el_port_list();

            state._fsp--;

            stream_el_port_list.add(el_port_list99.getTree());
            char_literal100=(Token)match(input,DOUBLE_QUOTE,FOLLOW_DOUBLE_QUOTE_in_testing_element_port_list836);  
            stream_DOUBLE_QUOTE.add(char_literal100);

            char_literal101=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_port_list838);  
            stream_SEMICOLON.add(char_literal101);



            // AST REWRITE
            // elements: el_port_list, 71
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 295:41: -> ^( PLIST_PARAM 'port_list' el_port_list )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:295:44: ^( PLIST_PARAM 'port_list' el_port_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_71.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:297:1: testing_element_size_spec : 'size_spec' el_size_spec ';' -> ^( PLIST_PARAM 'size_spec' el_size_spec ) ;
    public final Bind9ConfigParser.testing_element_size_spec_return testing_element_size_spec() throws RecognitionException {
        Bind9ConfigParser.testing_element_size_spec_return retval = new Bind9ConfigParser.testing_element_size_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal102=null;
        Token char_literal104=null;
        Bind9ConfigParser.el_size_spec_return el_size_spec103 = null;


        Object string_literal102_tree=null;
        Object char_literal104_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_el_size_spec=new RewriteRuleSubtreeStream(adaptor,"rule el_size_spec");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:2: ( 'size_spec' el_size_spec ';' -> ^( PLIST_PARAM 'size_spec' el_size_spec ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:4: 'size_spec' el_size_spec ';'
            {
            string_literal102=(Token)match(input,72,FOLLOW_72_in_testing_element_size_spec858);  
            stream_72.add(string_literal102);

            pushFollow(FOLLOW_el_size_spec_in_testing_element_size_spec860);
            el_size_spec103=el_size_spec();

            state._fsp--;

            stream_el_size_spec.add(el_size_spec103.getTree());
            char_literal104=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_size_spec862);  
            stream_SEMICOLON.add(char_literal104);



            // AST REWRITE
            // elements: el_size_spec, 72
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 298:33: -> ^( PLIST_PARAM 'size_spec' el_size_spec )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:36: ^( PLIST_PARAM 'size_spec' el_size_spec )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_72.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:300:1: testing_element_yes_or_no : 'yes_or_no' el_yes_or_no ';' -> ^( PLIST_PARAM 'yes_or_no' el_yes_or_no ) ;
    public final Bind9ConfigParser.testing_element_yes_or_no_return testing_element_yes_or_no() throws RecognitionException {
        Bind9ConfigParser.testing_element_yes_or_no_return retval = new Bind9ConfigParser.testing_element_yes_or_no_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal105=null;
        Token char_literal107=null;
        Bind9ConfigParser.el_yes_or_no_return el_yes_or_no106 = null;


        Object string_literal105_tree=null;
        Object char_literal107_tree=null;
        RewriteRuleTokenStream stream_SEMICOLON=new RewriteRuleTokenStream(adaptor,"token SEMICOLON");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_el_yes_or_no=new RewriteRuleSubtreeStream(adaptor,"rule el_yes_or_no");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:301:2: ( 'yes_or_no' el_yes_or_no ';' -> ^( PLIST_PARAM 'yes_or_no' el_yes_or_no ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:301:4: 'yes_or_no' el_yes_or_no ';'
            {
            string_literal105=(Token)match(input,73,FOLLOW_73_in_testing_element_yes_or_no882);  
            stream_73.add(string_literal105);

            pushFollow(FOLLOW_el_yes_or_no_in_testing_element_yes_or_no884);
            el_yes_or_no106=el_yes_or_no();

            state._fsp--;

            stream_el_yes_or_no.add(el_yes_or_no106.getTree());
            char_literal107=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_testing_element_yes_or_no886);  
            stream_SEMICOLON.add(char_literal107);



            // AST REWRITE
            // elements: 73, el_yes_or_no
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 301:33: -> ^( PLIST_PARAM 'yes_or_no' el_yes_or_no )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:301:36: ^( PLIST_PARAM 'yes_or_no' el_yes_or_no )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_73.nextNode());
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

    public static class lex_identifier_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "lex_identifier"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:304:1: lex_identifier : ( ALPHANUM_NONSTD | NUMBER | KMG_NUMBER | lex_yes_or_no | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD );
    public final Bind9ConfigParser.lex_identifier_return lex_identifier() throws RecognitionException {
        Bind9ConfigParser.lex_identifier_return retval = new Bind9ConfigParser.lex_identifier_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALPHANUM_NONSTD108=null;
        Token NUMBER109=null;
        Token KMG_NUMBER110=null;
        Token RANGE_WORD112=null;
        Token UNLIMITED_WORD113=null;
        Token DEFAULT_WORD114=null;
        Bind9ConfigParser.lex_yes_or_no_return lex_yes_or_no111 = null;


        Object ALPHANUM_NONSTD108_tree=null;
        Object NUMBER109_tree=null;
        Object KMG_NUMBER110_tree=null;
        Object RANGE_WORD112_tree=null;
        Object UNLIMITED_WORD113_tree=null;
        Object DEFAULT_WORD114_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:304:16: ( ALPHANUM_NONSTD | NUMBER | KMG_NUMBER | lex_yes_or_no | RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD )
            int alt11=7;
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
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:304:18: ALPHANUM_NONSTD
                    {
                    root_0 = (Object)adaptor.nil();

                    ALPHANUM_NONSTD108=(Token)match(input,ALPHANUM_NONSTD,FOLLOW_ALPHANUM_NONSTD_in_lex_identifier908); 
                    ALPHANUM_NONSTD108_tree = (Object)adaptor.create(ALPHANUM_NONSTD108);
                    adaptor.addChild(root_0, ALPHANUM_NONSTD108_tree);


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:304:36: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER109=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_lex_identifier912); 
                    NUMBER109_tree = (Object)adaptor.create(NUMBER109);
                    adaptor.addChild(root_0, NUMBER109_tree);


                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:304:45: KMG_NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    KMG_NUMBER110=(Token)match(input,KMG_NUMBER,FOLLOW_KMG_NUMBER_in_lex_identifier916); 
                    KMG_NUMBER110_tree = (Object)adaptor.create(KMG_NUMBER110);
                    adaptor.addChild(root_0, KMG_NUMBER110_tree);


                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:304:58: lex_yes_or_no
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lex_yes_or_no_in_lex_identifier920);
                    lex_yes_or_no111=lex_yes_or_no();

                    state._fsp--;

                    adaptor.addChild(root_0, lex_yes_or_no111.getTree());

                    }
                    break;
                case 5 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:305:5: RANGE_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    RANGE_WORD112=(Token)match(input,RANGE_WORD,FOLLOW_RANGE_WORD_in_lex_identifier926); 
                    RANGE_WORD112_tree = (Object)adaptor.create(RANGE_WORD112);
                    adaptor.addChild(root_0, RANGE_WORD112_tree);


                    }
                    break;
                case 6 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:305:18: UNLIMITED_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    UNLIMITED_WORD113=(Token)match(input,UNLIMITED_WORD,FOLLOW_UNLIMITED_WORD_in_lex_identifier930); 
                    UNLIMITED_WORD113_tree = (Object)adaptor.create(UNLIMITED_WORD113);
                    adaptor.addChild(root_0, UNLIMITED_WORD113_tree);


                    }
                    break;
                case 7 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:305:35: DEFAULT_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    DEFAULT_WORD114=(Token)match(input,DEFAULT_WORD,FOLLOW_DEFAULT_WORD_in_lex_identifier934); 
                    DEFAULT_WORD114_tree = (Object)adaptor.create(DEFAULT_WORD114);
                    adaptor.addChild(root_0, DEFAULT_WORD114_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:307:1: lex_number : ( NUMBER | ZERO_OR_ONE_WORD );
    public final Bind9ConfigParser.lex_number_return lex_number() throws RecognitionException {
        Bind9ConfigParser.lex_number_return retval = new Bind9ConfigParser.lex_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set115=null;

        Object set115_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:307:12: ( NUMBER | ZERO_OR_ONE_WORD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set115=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==ZERO_OR_ONE_WORD ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set115));
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:308:1: lex_yes_or_no : ( YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD );
    public final Bind9ConfigParser.lex_yes_or_no_return lex_yes_or_no() throws RecognitionException {
        Bind9ConfigParser.lex_yes_or_no_return retval = new Bind9ConfigParser.lex_yes_or_no_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set116=null;

        Object set116_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:308:15: ( YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set116=(Token)input.LT(1);
            if ( (input.LA(1)>=ZERO_OR_ONE_WORD && input.LA(1)<=TRUE_OR_FALSE_WORD) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set116));
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:310:1: el_acl_name : lex_identifier ;
    public final Bind9ConfigParser.el_acl_name_return el_acl_name() throws RecognitionException {
        Bind9ConfigParser.el_acl_name_return retval = new Bind9ConfigParser.el_acl_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.lex_identifier_return lex_identifier117 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:310:13: ( lex_identifier )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:310:16: lex_identifier
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lex_identifier_in_el_acl_name974);
            lex_identifier117=lex_identifier();

            state._fsp--;

            adaptor.addChild(root_0, lex_identifier117.getTree());

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

    public static class el_domain_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_domain_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:311:1: el_domain_name : ( lex_identifier '.' )+ lex_identifier ;
    public final Bind9ConfigParser.el_domain_name_return el_domain_name() throws RecognitionException {
        Bind9ConfigParser.el_domain_name_return retval = new Bind9ConfigParser.el_domain_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal119=null;
        Bind9ConfigParser.lex_identifier_return lex_identifier118 = null;

        Bind9ConfigParser.lex_identifier_return lex_identifier120 = null;


        Object char_literal119_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:311:17: ( ( lex_identifier '.' )+ lex_identifier )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:311:20: ( lex_identifier '.' )+ lex_identifier
            {
            root_0 = (Object)adaptor.nil();

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:311:20: ( lex_identifier '.' )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                alt12 = dfa12.predict(input);
                switch (alt12) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:311:21: lex_identifier '.'
            	    {
            	    pushFollow(FOLLOW_lex_identifier_in_el_domain_name984);
            	    lex_identifier118=lex_identifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, lex_identifier118.getTree());
            	    char_literal119=(Token)match(input,74,FOLLOW_74_in_el_domain_name985); 
            	    char_literal119_tree = (Object)adaptor.create(char_literal119);
            	    adaptor.addChild(root_0, char_literal119_tree);


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

            pushFollow(FOLLOW_lex_identifier_in_el_domain_name988);
            lex_identifier120=lex_identifier();

            state._fsp--;

            adaptor.addChild(root_0, lex_identifier120.getTree());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:312:1: el_ip_addr : ( el_ip4_addr | el_ip6_addr );
    public final Bind9ConfigParser.el_ip_addr_return el_ip_addr() throws RecognitionException {
        Bind9ConfigParser.el_ip_addr_return retval = new Bind9ConfigParser.el_ip_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.el_ip4_addr_return el_ip4_addr121 = null;

        Bind9ConfigParser.el_ip6_addr_return el_ip6_addr122 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:312:13: ( el_ip4_addr | el_ip6_addr )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==IP4_ADDR) ) {
                alt13=1;
            }
            else if ( ((LA13_0>=ALPHANUM_NONSTD && LA13_0<=TRUE_OR_FALSE_WORD)||LA13_0==IP6_ADDR) ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:312:16: el_ip4_addr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_el_ip4_addr_in_el_ip_addr998);
                    el_ip4_addr121=el_ip4_addr();

                    state._fsp--;

                    adaptor.addChild(root_0, el_ip4_addr121.getTree());

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:312:30: el_ip6_addr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_el_ip6_addr_in_el_ip_addr1002);
                    el_ip6_addr122=el_ip6_addr();

                    state._fsp--;

                    adaptor.addChild(root_0, el_ip6_addr122.getTree());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:313:1: el_ip4_addr : IP4_ADDR ;
    public final Bind9ConfigParser.el_ip4_addr_return el_ip4_addr() throws RecognitionException {
        Bind9ConfigParser.el_ip4_addr_return retval = new Bind9ConfigParser.el_ip4_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IP4_ADDR123=null;

        Object IP4_ADDR123_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:313:13: ( IP4_ADDR )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:313:15: IP4_ADDR
            {
            root_0 = (Object)adaptor.nil();

            IP4_ADDR123=(Token)match(input,IP4_ADDR,FOLLOW_IP4_ADDR_in_el_ip4_addr1009); 
            IP4_ADDR123_tree = (Object)adaptor.create(IP4_ADDR123);
            adaptor.addChild(root_0, IP4_ADDR123_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:314:1: el_ip6_addr : ( IP6_ADDR | lex_identifier );
    public final Bind9ConfigParser.el_ip6_addr_return el_ip6_addr() throws RecognitionException {
        Bind9ConfigParser.el_ip6_addr_return retval = new Bind9ConfigParser.el_ip6_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IP6_ADDR124=null;
        Bind9ConfigParser.lex_identifier_return lex_identifier125 = null;


        Object IP6_ADDR124_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:314:13: ( IP6_ADDR | lex_identifier )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==IP6_ADDR) ) {
                alt14=1;
            }
            else if ( ((LA14_0>=ALPHANUM_NONSTD && LA14_0<=TRUE_OR_FALSE_WORD)) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:314:15: IP6_ADDR
                    {
                    root_0 = (Object)adaptor.nil();

                    IP6_ADDR124=(Token)match(input,IP6_ADDR,FOLLOW_IP6_ADDR_in_el_ip6_addr1016); 
                    IP6_ADDR124_tree = (Object)adaptor.create(IP6_ADDR124);
                    adaptor.addChild(root_0, IP6_ADDR124_tree);


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:314:26: lex_identifier
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_lex_identifier_in_el_ip6_addr1020);
                    lex_identifier125=lex_identifier();

                    state._fsp--;

                    adaptor.addChild(root_0, lex_identifier125.getTree());

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
    // $ANTLR end "el_ip6_addr"

    public static class el_ip_port_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_ip_port"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:315:1: el_ip_port : ( NUMBER | ASTERISK );
    public final Bind9ConfigParser.el_ip_port_return el_ip_port() throws RecognitionException {
        Bind9ConfigParser.el_ip_port_return retval = new Bind9ConfigParser.el_ip_port_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set126=null;

        Object set126_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:315:12: ( NUMBER | ASTERISK )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set126=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==ASTERISK ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set126));
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:316:1: el_ip_prefix : ( NUMBER | IP4_SHORT_2 | IP4_SHORT_3 | IP4_ADDR ) FORWARD_SLASH NUMBER ;
    public final Bind9ConfigParser.el_ip_prefix_return el_ip_prefix() throws RecognitionException {
        Bind9ConfigParser.el_ip_prefix_return retval = new Bind9ConfigParser.el_ip_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set127=null;
        Token FORWARD_SLASH128=null;
        Token NUMBER129=null;

        Object set127_tree=null;
        Object FORWARD_SLASH128_tree=null;
        Object NUMBER129_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:316:14: ( ( NUMBER | IP4_SHORT_2 | IP4_SHORT_3 | IP4_ADDR ) FORWARD_SLASH NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:316:17: ( NUMBER | IP4_SHORT_2 | IP4_SHORT_3 | IP4_ADDR ) FORWARD_SLASH NUMBER
            {
            root_0 = (Object)adaptor.nil();

            set127=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==IP4_ADDR||(input.LA(1)>=IP4_SHORT_2 && input.LA(1)<=IP4_SHORT_3) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set127));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            FORWARD_SLASH128=(Token)match(input,FORWARD_SLASH,FOLLOW_FORWARD_SLASH_in_el_ip_prefix1052); 
            FORWARD_SLASH128_tree = (Object)adaptor.create(FORWARD_SLASH128);
            adaptor.addChild(root_0, FORWARD_SLASH128_tree);

            NUMBER129=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_el_ip_prefix1054); 
            NUMBER129_tree = (Object)adaptor.create(NUMBER129);
            adaptor.addChild(root_0, NUMBER129_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:1: el_key_id : el_domain_name ;
    public final Bind9ConfigParser.el_key_id_return el_key_id() throws RecognitionException {
        Bind9ConfigParser.el_key_id_return retval = new Bind9ConfigParser.el_key_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.el_domain_name_return el_domain_name130 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:11: ( el_domain_name )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:317:14: el_domain_name
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_el_domain_name_in_el_key_id1062);
            el_domain_name130=el_domain_name();

            state._fsp--;

            adaptor.addChild(root_0, el_domain_name130.getTree());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:318:1: el_key_list : el_key_id ( SEMICOLON el_key_id )* SEMICOLON ;
    public final Bind9ConfigParser.el_key_list_return el_key_list() throws RecognitionException {
        Bind9ConfigParser.el_key_list_return retval = new Bind9ConfigParser.el_key_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON132=null;
        Token SEMICOLON134=null;
        Bind9ConfigParser.el_key_id_return el_key_id131 = null;

        Bind9ConfigParser.el_key_id_return el_key_id133 = null;


        Object SEMICOLON132_tree=null;
        Object SEMICOLON134_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:318:13: ( el_key_id ( SEMICOLON el_key_id )* SEMICOLON )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:318:15: el_key_id ( SEMICOLON el_key_id )* SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_el_key_id_in_el_key_list1069);
            el_key_id131=el_key_id();

            state._fsp--;

            adaptor.addChild(root_0, el_key_id131.getTree());
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:318:25: ( SEMICOLON el_key_id )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==SEMICOLON) ) {
                    int LA15_1 = input.LA(2);

                    if ( ((LA15_1>=ALPHANUM_NONSTD && LA15_1<=TRUE_OR_FALSE_WORD)) ) {
                        alt15=1;
                    }


                }


                switch (alt15) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:318:26: SEMICOLON el_key_id
            	    {
            	    SEMICOLON132=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_el_key_list1072); 
            	    SEMICOLON132_tree = (Object)adaptor.create(SEMICOLON132);
            	    adaptor.addChild(root_0, SEMICOLON132_tree);

            	    pushFollow(FOLLOW_el_key_id_in_el_key_list1074);
            	    el_key_id133=el_key_id();

            	    state._fsp--;

            	    adaptor.addChild(root_0, el_key_id133.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            SEMICOLON134=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_el_key_list1078); 
            SEMICOLON134_tree = (Object)adaptor.create(SEMICOLON134);
            adaptor.addChild(root_0, SEMICOLON134_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:319:1: el_number : lex_number ;
    public final Bind9ConfigParser.el_number_return el_number() throws RecognitionException {
        Bind9ConfigParser.el_number_return retval = new Bind9ConfigParser.el_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.lex_number_return lex_number135 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:319:11: ( lex_number )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:319:13: lex_number
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lex_number_in_el_number1085);
            lex_number135=lex_number();

            state._fsp--;

            adaptor.addChild(root_0, lex_number135.getTree());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:320:1: el_path_name : DOUBLE_QUOTE (~ ( CR | LF | DOUBLE_QUOTE ) )* DOUBLE_QUOTE ;
    public final Bind9ConfigParser.el_path_name_return el_path_name() throws RecognitionException {
        Bind9ConfigParser.el_path_name_return retval = new Bind9ConfigParser.el_path_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DOUBLE_QUOTE136=null;
        Token set137=null;
        Token DOUBLE_QUOTE138=null;

        Object DOUBLE_QUOTE136_tree=null;
        Object set137_tree=null;
        Object DOUBLE_QUOTE138_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:320:14: ( DOUBLE_QUOTE (~ ( CR | LF | DOUBLE_QUOTE ) )* DOUBLE_QUOTE )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:320:16: DOUBLE_QUOTE (~ ( CR | LF | DOUBLE_QUOTE ) )* DOUBLE_QUOTE
            {
            root_0 = (Object)adaptor.nil();

            DOUBLE_QUOTE136=(Token)match(input,DOUBLE_QUOTE,FOLLOW_DOUBLE_QUOTE_in_el_path_name1093); 
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:320:30: (~ ( CR | LF | DOUBLE_QUOTE ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>=ST_ZONE_MASTER && LA16_0<=SEMICOLON)||(LA16_0>=C_COMMENT && LA16_0<=74)) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:320:31: ~ ( CR | LF | DOUBLE_QUOTE )
            	    {
            	    set137=(Token)input.LT(1);
            	    if ( (input.LA(1)>=ST_ZONE_MASTER && input.LA(1)<=SEMICOLON)||(input.LA(1)>=C_COMMENT && input.LA(1)<=74) ) {
            	        input.consume();
            	        adaptor.addChild(root_0, (Object)adaptor.create(set137));
            	        state.errorRecovery=false;
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            DOUBLE_QUOTE138=(Token)match(input,DOUBLE_QUOTE,FOLLOW_DOUBLE_QUOTE_in_el_path_name1108); 

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:321:1: el_port_list : el_port_list_item ( SEMICOLON el_port_list_item )* SEMICOLON ;
    public final Bind9ConfigParser.el_port_list_return el_port_list() throws RecognitionException {
        Bind9ConfigParser.el_port_list_return retval = new Bind9ConfigParser.el_port_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SEMICOLON140=null;
        Token SEMICOLON142=null;
        Bind9ConfigParser.el_port_list_item_return el_port_list_item139 = null;

        Bind9ConfigParser.el_port_list_item_return el_port_list_item141 = null;


        Object SEMICOLON140_tree=null;
        Object SEMICOLON142_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:321:14: ( el_port_list_item ( SEMICOLON el_port_list_item )* SEMICOLON )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:321:16: el_port_list_item ( SEMICOLON el_port_list_item )* SEMICOLON
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_el_port_list_item_in_el_port_list1116);
            el_port_list_item139=el_port_list_item();

            state._fsp--;

            adaptor.addChild(root_0, el_port_list_item139.getTree());
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:321:34: ( SEMICOLON el_port_list_item )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==SEMICOLON) ) {
                    int LA17_1 = input.LA(2);

                    if ( (LA17_1==NUMBER||LA17_1==RANGE_WORD) ) {
                        alt17=1;
                    }


                }


                switch (alt17) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:321:35: SEMICOLON el_port_list_item
            	    {
            	    SEMICOLON140=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_el_port_list1119); 
            	    SEMICOLON140_tree = (Object)adaptor.create(SEMICOLON140);
            	    adaptor.addChild(root_0, SEMICOLON140_tree);

            	    pushFollow(FOLLOW_el_port_list_item_in_el_port_list1121);
            	    el_port_list_item141=el_port_list_item();

            	    state._fsp--;

            	    adaptor.addChild(root_0, el_port_list_item141.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

            SEMICOLON142=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_el_port_list1125); 
            SEMICOLON142_tree = (Object)adaptor.create(SEMICOLON142);
            adaptor.addChild(root_0, SEMICOLON142_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:1: el_port_list_item : ( NUMBER | ( RANGE_WORD NUMBER NUMBER ) );
    public final Bind9ConfigParser.el_port_list_item_return el_port_list_item() throws RecognitionException {
        Bind9ConfigParser.el_port_list_item_return retval = new Bind9ConfigParser.el_port_list_item_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER143=null;
        Token RANGE_WORD144=null;
        Token NUMBER145=null;
        Token NUMBER146=null;

        Object NUMBER143_tree=null;
        Object RANGE_WORD144_tree=null;
        Object NUMBER145_tree=null;
        Object NUMBER146_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:19: ( NUMBER | ( RANGE_WORD NUMBER NUMBER ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NUMBER) ) {
                alt18=1;
            }
            else if ( (LA18_0==RANGE_WORD) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:21: NUMBER
                    {
                    root_0 = (Object)adaptor.nil();

                    NUMBER143=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_el_port_list_item1133); 
                    NUMBER143_tree = (Object)adaptor.create(NUMBER143);
                    adaptor.addChild(root_0, NUMBER143_tree);


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:30: ( RANGE_WORD NUMBER NUMBER )
                    {
                    root_0 = (Object)adaptor.nil();

                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:30: ( RANGE_WORD NUMBER NUMBER )
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:322:31: RANGE_WORD NUMBER NUMBER
                    {
                    RANGE_WORD144=(Token)match(input,RANGE_WORD,FOLLOW_RANGE_WORD_in_el_port_list_item1138); 
                    RANGE_WORD144_tree = (Object)adaptor.create(RANGE_WORD144);
                    adaptor.addChild(root_0, RANGE_WORD144_tree);

                    NUMBER145=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_el_port_list_item1140); 
                    NUMBER145_tree = (Object)adaptor.create(NUMBER145);
                    adaptor.addChild(root_0, NUMBER145_tree);

                    NUMBER146=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_el_port_list_item1142); 
                    NUMBER146_tree = (Object)adaptor.create(NUMBER146);
                    adaptor.addChild(root_0, NUMBER146_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:323:1: el_size_spec : ( ( KMG_NUMBER ) | UNLIMITED_WORD | DEFAULT_WORD );
    public final Bind9ConfigParser.el_size_spec_return el_size_spec() throws RecognitionException {
        Bind9ConfigParser.el_size_spec_return retval = new Bind9ConfigParser.el_size_spec_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token KMG_NUMBER147=null;
        Token UNLIMITED_WORD148=null;
        Token DEFAULT_WORD149=null;

        Object KMG_NUMBER147_tree=null;
        Object UNLIMITED_WORD148_tree=null;
        Object DEFAULT_WORD149_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:323:14: ( ( KMG_NUMBER ) | UNLIMITED_WORD | DEFAULT_WORD )
            int alt19=3;
            switch ( input.LA(1) ) {
            case KMG_NUMBER:
                {
                alt19=1;
                }
                break;
            case UNLIMITED_WORD:
                {
                alt19=2;
                }
                break;
            case DEFAULT_WORD:
                {
                alt19=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }

            switch (alt19) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:323:16: ( KMG_NUMBER )
                    {
                    root_0 = (Object)adaptor.nil();

                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:323:16: ( KMG_NUMBER )
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:323:17: KMG_NUMBER
                    {
                    KMG_NUMBER147=(Token)match(input,KMG_NUMBER,FOLLOW_KMG_NUMBER_in_el_size_spec1151); 
                    KMG_NUMBER147_tree = (Object)adaptor.create(KMG_NUMBER147);
                    adaptor.addChild(root_0, KMG_NUMBER147_tree);


                    }


                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:323:29: UNLIMITED_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    UNLIMITED_WORD148=(Token)match(input,UNLIMITED_WORD,FOLLOW_UNLIMITED_WORD_in_el_size_spec1154); 
                    UNLIMITED_WORD148_tree = (Object)adaptor.create(UNLIMITED_WORD148);
                    adaptor.addChild(root_0, UNLIMITED_WORD148_tree);


                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:323:44: DEFAULT_WORD
                    {
                    root_0 = (Object)adaptor.nil();

                    DEFAULT_WORD149=(Token)match(input,DEFAULT_WORD,FOLLOW_DEFAULT_WORD_in_el_size_spec1156); 
                    DEFAULT_WORD149_tree = (Object)adaptor.create(DEFAULT_WORD149);
                    adaptor.addChild(root_0, DEFAULT_WORD149_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:324:1: el_yes_or_no : lex_yes_or_no ;
    public final Bind9ConfigParser.el_yes_or_no_return el_yes_or_no() throws RecognitionException {
        Bind9ConfigParser.el_yes_or_no_return retval = new Bind9ConfigParser.el_yes_or_no_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.lex_yes_or_no_return lex_yes_or_no150 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:324:14: ( lex_yes_or_no )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:324:16: lex_yes_or_no
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_lex_yes_or_no_in_el_yes_or_no1163);
            lex_yes_or_no150=lex_yes_or_no();

            state._fsp--;

            adaptor.addChild(root_0, lex_yes_or_no150.getTree());

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

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA7_eotS =
        "\16\uffff";
    static final String DFA7_eofS =
        "\16\uffff";
    static final String DFA7_minS =
        "\1\54\1\17\7\55\1\60\1\65\1\62\2\uffff";
    static final String DFA7_maxS =
        "\1\54\1\27\10\60\1\65\1\72\2\uffff";
    static final String DFA7_acceptS =
        "\14\uffff\1\1\1\2";
    static final String DFA7_specialS =
        "\16\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\1",
            "\1\2\1\3\1\4\1\6\1\7\1\10\3\5",
            "\3\11\1\12",
            "\3\11\1\12",
            "\3\11\1\12",
            "\3\11\1\12",
            "\3\11\1\12",
            "\3\11\1\12",
            "\3\11\1\12",
            "\1\12",
            "\1\13",
            "\1\14\7\uffff\1\15",
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
    static final String DFA12_eotS =
        "\12\uffff";
    static final String DFA12_eofS =
        "\12\uffff";
    static final String DFA12_minS =
        "\1\17\7\36\2\uffff";
    static final String DFA12_maxS =
        "\1\27\7\112\2\uffff";
    static final String DFA12_acceptS =
        "\10\uffff\1\2\1\1";
    static final String DFA12_specialS =
        "\12\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\2\1\3\1\5\1\6\1\7\3\4",
            "\1\10\53\uffff\1\11",
            "\1\10\53\uffff\1\11",
            "\1\10\53\uffff\1\11",
            "\1\10\53\uffff\1\11",
            "\1\10\53\uffff\1\11",
            "\1\10\53\uffff\1\11",
            "\1\10\53\uffff\1\11",
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
            return "()+ loopback of 311:20: ( lex_identifier '.' )+";
        }
    }
 

    public static final BitSet FOLLOW_entity_in_list105 = new BitSet(new long[]{0x0800100000000002L});
    public static final BitSet FOLLOW_BAD_in_list111 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_zone_in_entity121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_in_entity126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_zone139 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_zone_name_in_zone141 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_zone_class_in_zone143 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_zone_forward_block_in_zone146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_zone166 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_zone_name_in_zone168 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_zone_class_in_zone170 = new BitSet(new long[]{0x0001E00000000000L});
    public static final BitSet FOLLOW_zone_delegation_block_in_zone173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_identifier_in_zone_name196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_class0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_zone_forward_block228 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_zone_type_forward_in_zone_forward_block231 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_zone_forward_param_in_zone_forward_block233 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49_in_zone_forward_block236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zone_forward_switch_def_in_zone_forward_param258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_zone_delegation_block268 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_zone_type_delegation_in_zone_delegation_block270 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_zone_delegation_block272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_zone_forward_switch_def285 = new BitSet(new long[]{0x0018000000000000L});
    public static final BitSet FOLLOW_zone_forward_switch_in_zone_forward_switch_def287 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_forward_switch_def289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_forward_switch0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_zone_type_master327 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_zone_type_master329 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_master331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_zone_type_slave345 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_zone_type_slave347 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_slave349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_zone_type_stub363 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_56_in_zone_type_stub365 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_stub367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_zone_type_forward381 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_zone_type_forward383 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_forward385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_zone_type_hint399 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_zone_type_hint401 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_hint403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_zone_type_delegation417 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_zone_type_delegation419 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_zone_type_delegation421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_testing437 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_testing_block_in_testing439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_testing_block461 = new BitSet(new long[]{0xF002000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_testing_param_in_testing_block464 = new BitSet(new long[]{0xF002000000000000L,0x00000000000003FFL});
    public static final BitSet FOLLOW_49_in_testing_block467 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_60_in_testing_element_acl562 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_el_acl_name_in_testing_element_acl564 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_acl566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_testing_element_domain_name586 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_el_domain_name_in_testing_element_domain_name588 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_domain_name590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_testing_element_ip4610 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_el_ip4_addr_in_testing_element_ip4612 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_ip4614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_testing_element_ip6634 = new BitSet(new long[]{0x0000000002FF8000L});
    public static final BitSet FOLLOW_el_ip6_addr_in_testing_element_ip6636 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_ip6638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_testing_element_ip658 = new BitSet(new long[]{0x0000000003FF8000L});
    public static final BitSet FOLLOW_el_ip_addr_in_testing_element_ip660 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_ip662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_testing_element_ip_port682 = new BitSet(new long[]{0x0000000004010000L});
    public static final BitSet FOLLOW_el_ip_port_in_testing_element_ip_port684 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_ip_port686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_testing_element_ip_prefix706 = new BitSet(new long[]{0x0000000019010000L});
    public static final BitSet FOLLOW_el_ip_prefix_in_testing_element_ip_prefix708 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_ip_prefix710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_67_in_testing_element_key_id730 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_el_key_id_in_testing_element_key_id732 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_key_id734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_testing_element_key_list754 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_in_testing_element_key_list756 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_el_key_list_in_testing_element_key_list758 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_in_testing_element_key_list760 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_key_list762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_testing_element_number782 = new BitSet(new long[]{0x0000000000210000L});
    public static final BitSet FOLLOW_el_number_in_testing_element_number784 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_number786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_testing_element_path_name806 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_el_path_name_in_testing_element_path_name808 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_path_name810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_testing_element_port_list830 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_in_testing_element_port_list832 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_el_port_list_in_testing_element_port_list834 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_in_testing_element_port_list836 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_port_list838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_testing_element_size_spec858 = new BitSet(new long[]{0x00000000001A0000L});
    public static final BitSet FOLLOW_el_size_spec_in_testing_element_size_spec860 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_size_spec862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_testing_element_yes_or_no882 = new BitSet(new long[]{0x0000000000E00000L});
    public static final BitSet FOLLOW_el_yes_or_no_in_testing_element_yes_or_no884 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_testing_element_yes_or_no886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHANUM_NONSTD_in_lex_identifier908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_lex_identifier912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KMG_NUMBER_in_lex_identifier916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_yes_or_no_in_lex_identifier920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_WORD_in_lex_identifier926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNLIMITED_WORD_in_lex_identifier930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_WORD_in_lex_identifier934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_lex_number0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_lex_yes_or_no0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_identifier_in_el_acl_name974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_identifier_in_el_domain_name984 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_el_domain_name985 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_lex_identifier_in_el_domain_name988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_ip4_addr_in_el_ip_addr998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_ip6_addr_in_el_ip_addr1002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP4_ADDR_in_el_ip4_addr1009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP6_ADDR_in_el_ip6_addr1016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_identifier_in_el_ip6_addr1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_el_ip_port0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_el_ip_prefix1037 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_FORWARD_SLASH_in_el_ip_prefix1052 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUMBER_in_el_ip_prefix1054 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_domain_name_in_el_key_id1062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_key_id_in_el_key_list1069 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_el_key_list1072 = new BitSet(new long[]{0x0000000000FF8000L});
    public static final BitSet FOLLOW_el_key_id_in_el_key_list1074 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_el_key_list1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_number_in_el_number1085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_in_el_path_name1093 = new BitSet(new long[]{0xFFFFFFFCFFFFFFF0L,0x00000000000007FFL});
    public static final BitSet FOLLOW_set_in_el_path_name1097 = new BitSet(new long[]{0xFFFFFFFCFFFFFFF0L,0x00000000000007FFL});
    public static final BitSet FOLLOW_DOUBLE_QUOTE_in_el_path_name1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_port_list_item_in_el_port_list1116 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_el_port_list1119 = new BitSet(new long[]{0x0000000000050000L});
    public static final BitSet FOLLOW_el_port_list_item_in_el_port_list1121 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_SEMICOLON_in_el_port_list1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_el_port_list_item1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANGE_WORD_in_el_port_list_item1138 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUMBER_in_el_port_list_item1140 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUMBER_in_el_port_list_item1142 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KMG_NUMBER_in_el_size_spec1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_UNLIMITED_WORD_in_el_size_spec1154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFAULT_WORD_in_el_size_spec1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_lex_yes_or_no_in_el_yes_or_no1163 = new BitSet(new long[]{0x0000000000000002L});

}
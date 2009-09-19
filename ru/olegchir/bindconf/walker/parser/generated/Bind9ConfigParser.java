// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-20 00:15:50

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ST_ZONE_MASTER", "ST_ZONE_SLAVE", "ST_ZONE_HINT", "ST_ZONE_STUB", "ST_ZONE_FORWARD", "ST_ZONE_DELEGATION", "ST_ZONE_PLIST", "ST_TESTING", "ST_TESTING_PLIST", "PLIST_PARAM", "BAD", "ALPHANUM_WORD", "NUMBER", "IP4_ADDR", "IP6_ADDR", "IP4_SHORT_2", "IP4_SHORT_3", "C_COMMENT", "CPP_COMMENT", "PERL_COMMENT", "COMMENT", "NL", "WS", "TYPE_YES_OR_NO", "THREE_DIGIT_NUMBER", "DIGIT", "ANY_ASCII_ALPHANUM", "IP6_VALID_CHAR", "'zone'", "'IN'", "'HS'", "'CHAOS'", "'{'", "'}'", "'forward'", "';'", "'first'", "'only'", "'type'", "'master'", "'slave'", "'stub'", "'hint'", "'delegation-only'", "'testing'", "'acl_name'", "'domain_name'", "'ip4'", "'ip6'", "'ip'", "'ip_port'", "'ip_prefix'", "'key_id'", "'key_list'", "'\"'", "'number'", "'.'", "'*'", "'/'"
    };
    public static final int IP6_VALID_CHAR=31;
    public static final int ST_ZONE_PLIST=10;
    public static final int T__62=62;
    public static final int ST_ZONE_MASTER=4;
    public static final int ST_ZONE_FORWARD=8;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
    public static final int ST_ZONE_SLAVE=5;
    public static final int ST_ZONE_DELEGATION=9;
    public static final int ST_ZONE_STUB=7;
    public static final int PERL_COMMENT=23;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int ANY_ASCII_ALPHANUM=30;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__59=59;
    public static final int CPP_COMMENT=22;
    public static final int DIGIT=29;
    public static final int NL=25;
    public static final int COMMENT=24;
    public static final int T__50=50;
    public static final int TYPE_YES_OR_NO=27;
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
    public static final int THREE_DIGIT_NUMBER=28;
    public static final int PLIST_PARAM=13;
    public static final int ST_ZONE_HINT=6;
    public static final int T__32=32;
    public static final int WS=26;
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
    public static final int C_COMMENT=21;
    public static final int IP4_SHORT_3=20;
    public static final int IP4_SHORT_2=19;

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

            if ( (LA3_0==EOF||LA3_0==32||LA3_0==48) ) {
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

                        if ( (LA1_0==32||LA1_0==48) ) {
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

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==48) ) {
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
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleSubtreeStream stream_zone_forward_block=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_block");
        RewriteRuleSubtreeStream stream_zone_class=new RewriteRuleSubtreeStream(adaptor,"rule zone_class");
        RewriteRuleSubtreeStream stream_zone_name=new RewriteRuleSubtreeStream(adaptor,"rule zone_name");
        RewriteRuleSubtreeStream stream_zone_delegation_block=new RewriteRuleSubtreeStream(adaptor,"rule zone_delegation_block");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:2: ( 'zone' zone_name ( zone_class )? zone_forward_block -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block ) | 'zone' zone_name ( zone_class )? zone_delegation_block -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==32) ) {
                int LA7_1 = input.LA(2);

                if ( ((LA7_1>=ALPHANUM_WORD && LA7_1<=NUMBER)) ) {
                    int LA7_2 = input.LA(3);

                    if ( ((LA7_2>=33 && LA7_2<=35)) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==36) ) {
                            int LA7_4 = input.LA(5);

                            if ( (LA7_4==42) ) {
                                int LA7_5 = input.LA(6);

                                if ( (LA7_5==47) ) {
                                    alt7=2;
                                }
                                else if ( (LA7_5==38) ) {
                                    alt7=1;
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 7, 5, input);

                                    throw nvae;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 4, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;
                        }
                    }
                    else if ( (LA7_2==36) ) {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==42) ) {
                            int LA7_5 = input.LA(5);

                            if ( (LA7_5==47) ) {
                                alt7=2;
                            }
                            else if ( (LA7_5==38) ) {
                                alt7=1;
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 5, input);

                                throw nvae;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 4, input);

                            throw nvae;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;
                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:4: 'zone' zone_name ( zone_class )? zone_forward_block
                    {
                    string_literal5=(Token)match(input,32,FOLLOW_32_in_zone139);  
                    stream_32.add(string_literal5);

                    pushFollow(FOLLOW_zone_name_in_zone141);
                    zone_name6=zone_name();

                    state._fsp--;

                    stream_zone_name.add(zone_name6.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:21: ( zone_class )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=33 && LA5_0<=35)) ) {
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
                    string_literal9=(Token)match(input,32,FOLLOW_32_in_zone166);  
                    stream_32.add(string_literal9);

                    pushFollow(FOLLOW_zone_name_in_zone168);
                    zone_name10=zone_name();

                    state._fsp--;

                    stream_zone_name.add(zone_name10.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:187:21: ( zone_class )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=33 && LA6_0<=35)) ) {
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:190:1: zone_name : ( ALPHANUM_WORD | NUMBER );
    public final Bind9ConfigParser.zone_name_return zone_name() throws RecognitionException {
        Bind9ConfigParser.zone_name_return retval = new Bind9ConfigParser.zone_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set13=null;

        Object set13_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:191:2: ( ALPHANUM_WORD | NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set13=(Token)input.LT(1);
            if ( (input.LA(1)>=ALPHANUM_WORD && input.LA(1)<=NUMBER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set13));
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
            if ( (input.LA(1)>=33 && input.LA(1)<=35) ) {
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
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_zone_type_forward=new RewriteRuleSubtreeStream(adaptor,"rule zone_type_forward");
        RewriteRuleSubtreeStream stream_zone_forward_param=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_param");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:2: (pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}' -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:4: pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}'
            {
            pl=(Token)match(input,36,FOLLOW_36_in_zone_forward_block232);  
            stream_36.add(pl);

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:13: ( zone_type_forward ( zone_forward_param )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:14: zone_type_forward ( zone_forward_param )*
            {
            pushFollow(FOLLOW_zone_type_forward_in_zone_forward_block235);
            zone_type_forward15=zone_type_forward();

            state._fsp--;

            stream_zone_type_forward.add(zone_type_forward15.getTree());
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:32: ( zone_forward_param )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==38) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:200:32: zone_forward_param
            	    {
            	    pushFollow(FOLLOW_zone_forward_param_in_zone_forward_block237);
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

            char_literal17=(Token)match(input,37,FOLLOW_37_in_zone_forward_block240);  
            stream_37.add(char_literal17);



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

            pushFollow(FOLLOW_zone_forward_switch_def_in_zone_forward_param262);
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

            char_literal19=(Token)match(input,36,FOLLOW_36_in_zone_delegation_block272); 
            char_literal19_tree = (Object)adaptor.create(char_literal19);
            adaptor.addChild(root_0, char_literal19_tree);

            pushFollow(FOLLOW_zone_type_delegation_in_zone_delegation_block274);
            zone_type_delegation20=zone_type_delegation();

            state._fsp--;

            adaptor.addChild(root_0, zone_type_delegation20.getTree());
            char_literal21=(Token)match(input,37,FOLLOW_37_in_zone_delegation_block276); 
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
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_zone_forward_switch=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_switch");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:212:2: ( 'forward' zone_forward_switch ';' -> ^( PLIST_PARAM 'forward' zone_forward_switch ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:212:4: 'forward' zone_forward_switch ';'
            {
            string_literal22=(Token)match(input,38,FOLLOW_38_in_zone_forward_switch_def289);  
            stream_38.add(string_literal22);

            pushFollow(FOLLOW_zone_forward_switch_in_zone_forward_switch_def291);
            zone_forward_switch23=zone_forward_switch();

            state._fsp--;

            stream_zone_forward_switch.add(zone_forward_switch23.getTree());
            char_literal24=(Token)match(input,39,FOLLOW_39_in_zone_forward_switch_def293);  
            stream_39.add(char_literal24);



            // AST REWRITE
            // elements: zone_forward_switch, 38
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

                adaptor.addChild(root_1, stream_38.nextNode());
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
            if ( (input.LA(1)>=40 && input.LA(1)<=41) ) {
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
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:221:2: ( 'type' 'master' ';' -> 'master' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:221:4: 'type' 'master' ';'
            {
            string_literal26=(Token)match(input,42,FOLLOW_42_in_zone_type_master331);  
            stream_42.add(string_literal26);

            string_literal27=(Token)match(input,43,FOLLOW_43_in_zone_type_master333);  
            stream_43.add(string_literal27);

            char_literal28=(Token)match(input,39,FOLLOW_39_in_zone_type_master335);  
            stream_39.add(char_literal28);



            // AST REWRITE
            // elements: 43
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
                adaptor.addChild(root_0, stream_43.nextNode());

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
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:224:2: ( 'type' 'slave' ';' -> 'slave' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:224:4: 'type' 'slave' ';'
            {
            string_literal29=(Token)match(input,42,FOLLOW_42_in_zone_type_slave349);  
            stream_42.add(string_literal29);

            string_literal30=(Token)match(input,44,FOLLOW_44_in_zone_type_slave351);  
            stream_44.add(string_literal30);

            char_literal31=(Token)match(input,39,FOLLOW_39_in_zone_type_slave353);  
            stream_39.add(char_literal31);



            // AST REWRITE
            // elements: 44
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
                adaptor.addChild(root_0, stream_44.nextNode());

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
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:227:2: ( 'type' 'stub' ';' -> 'stub' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:227:4: 'type' 'stub' ';'
            {
            string_literal32=(Token)match(input,42,FOLLOW_42_in_zone_type_stub367);  
            stream_42.add(string_literal32);

            string_literal33=(Token)match(input,45,FOLLOW_45_in_zone_type_stub369);  
            stream_45.add(string_literal33);

            char_literal34=(Token)match(input,39,FOLLOW_39_in_zone_type_stub371);  
            stream_39.add(char_literal34);



            // AST REWRITE
            // elements: 45
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
                adaptor.addChild(root_0, stream_45.nextNode());

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
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:230:2: ( 'type' 'forward' ';' -> 'forward' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:230:4: 'type' 'forward' ';'
            {
            string_literal35=(Token)match(input,42,FOLLOW_42_in_zone_type_forward385);  
            stream_42.add(string_literal35);

            string_literal36=(Token)match(input,38,FOLLOW_38_in_zone_type_forward387);  
            stream_38.add(string_literal36);

            char_literal37=(Token)match(input,39,FOLLOW_39_in_zone_type_forward389);  
            stream_39.add(char_literal37);



            // AST REWRITE
            // elements: 38
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
                adaptor.addChild(root_0, stream_38.nextNode());

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
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:233:2: ( 'type' 'hint' ';' -> 'hint' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:233:4: 'type' 'hint' ';'
            {
            string_literal38=(Token)match(input,42,FOLLOW_42_in_zone_type_hint403);  
            stream_42.add(string_literal38);

            string_literal39=(Token)match(input,46,FOLLOW_46_in_zone_type_hint405);  
            stream_46.add(string_literal39);

            char_literal40=(Token)match(input,39,FOLLOW_39_in_zone_type_hint407);  
            stream_39.add(char_literal40);



            // AST REWRITE
            // elements: 46
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
                adaptor.addChild(root_0, stream_46.nextNode());

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
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:236:2: ( 'type' 'delegation-only' ';' -> 'delegation-only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:236:4: 'type' 'delegation-only' ';'
            {
            string_literal41=(Token)match(input,42,FOLLOW_42_in_zone_type_delegation421);  
            stream_42.add(string_literal41);

            string_literal42=(Token)match(input,47,FOLLOW_47_in_zone_type_delegation423);  
            stream_47.add(string_literal42);

            char_literal43=(Token)match(input,39,FOLLOW_39_in_zone_type_delegation425);  
            stream_39.add(char_literal43);



            // AST REWRITE
            // elements: 47
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
                adaptor.addChild(root_0, stream_47.nextNode());

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
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleSubtreeStream stream_testing_block=new RewriteRuleSubtreeStream(adaptor,"rule testing_block");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:240:9: ( 'testing' testing_block -> ^( ST_TESTING testing_block ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:240:11: 'testing' testing_block
            {
            string_literal44=(Token)match(input,48,FOLLOW_48_in_testing441);  
            stream_48.add(string_literal44);

            pushFollow(FOLLOW_testing_block_in_testing443);
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
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleSubtreeStream stream_testing_param=new RewriteRuleSubtreeStream(adaptor,"rule testing_param");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:2: (pl= '{' ( ( testing_param )* ) '}' -> ^( ST_TESTING_PLIST[$pl,\"ST_TESTING_PLIST\"] ( testing_param )* ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:4: pl= '{' ( ( testing_param )* ) '}'
            {
            pl=(Token)match(input,36,FOLLOW_36_in_testing_block465);  
            stream_36.add(pl);

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:13: ( ( testing_param )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:14: ( testing_param )*
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:14: ( testing_param )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>=49 && LA9_0<=57)||LA9_0==59) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:243:14: testing_param
            	    {
            	    pushFollow(FOLLOW_testing_param_in_testing_block468);
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

            char_literal47=(Token)match(input,37,FOLLOW_37_in_testing_block471);  
            stream_37.add(char_literal47);



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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:245:1: testing_param : ( testing_element_domain_name | testing_element_acl | testing_element_ip4 | testing_element_ip6 | testing_element_ip | testing_element_ip_port | testing_element_ip_prefix | testing_element_key_id | testing_element_key_list | testing_element_number );
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



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:246:2: ( testing_element_domain_name | testing_element_acl | testing_element_ip4 | testing_element_ip6 | testing_element_ip | testing_element_ip_port | testing_element_ip_prefix | testing_element_key_id | testing_element_key_list | testing_element_number )
            int alt10=10;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt10=1;
                }
                break;
            case 49:
                {
                alt10=2;
                }
                break;
            case 51:
                {
                alt10=3;
                }
                break;
            case 52:
                {
                alt10=4;
                }
                break;
            case 53:
                {
                alt10=5;
                }
                break;
            case 54:
                {
                alt10=6;
                }
                break;
            case 55:
                {
                alt10=7;
                }
                break;
            case 56:
                {
                alt10=8;
                }
                break;
            case 57:
                {
                alt10=9;
                }
                break;
            case 59:
                {
                alt10=10;
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

                    pushFollow(FOLLOW_testing_element_domain_name_in_testing_param491);
                    testing_element_domain_name48=testing_element_domain_name();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_domain_name48.getTree());

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:4: testing_element_acl
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_acl_in_testing_param496);
                    testing_element_acl49=testing_element_acl();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_acl49.getTree());

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:248:4: testing_element_ip4
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_ip4_in_testing_param501);
                    testing_element_ip450=testing_element_ip4();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_ip450.getTree());

                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:249:4: testing_element_ip6
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_ip6_in_testing_param506);
                    testing_element_ip651=testing_element_ip6();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_ip651.getTree());

                    }
                    break;
                case 5 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:250:4: testing_element_ip
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_ip_in_testing_param511);
                    testing_element_ip52=testing_element_ip();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_ip52.getTree());

                    }
                    break;
                case 6 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:251:4: testing_element_ip_port
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_ip_port_in_testing_param516);
                    testing_element_ip_port53=testing_element_ip_port();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_ip_port53.getTree());

                    }
                    break;
                case 7 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:252:4: testing_element_ip_prefix
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_ip_prefix_in_testing_param521);
                    testing_element_ip_prefix54=testing_element_ip_prefix();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_ip_prefix54.getTree());

                    }
                    break;
                case 8 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:253:4: testing_element_key_id
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_key_id_in_testing_param526);
                    testing_element_key_id55=testing_element_key_id();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_key_id55.getTree());

                    }
                    break;
                case 9 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:254:4: testing_element_key_list
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_key_list_in_testing_param531);
                    testing_element_key_list56=testing_element_key_list();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_key_list56.getTree());

                    }
                    break;
                case 10 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:255:4: testing_element_number
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_element_number_in_testing_param536);
                    testing_element_number57=testing_element_number();

                    state._fsp--;

                    adaptor.addChild(root_0, testing_element_number57.getTree());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:257:1: testing_element_acl : 'acl_name' el_acl_name ';' -> ^( PLIST_PARAM 'acl_name' el_acl_name ) ;
    public final Bind9ConfigParser.testing_element_acl_return testing_element_acl() throws RecognitionException {
        Bind9ConfigParser.testing_element_acl_return retval = new Bind9ConfigParser.testing_element_acl_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal58=null;
        Token char_literal60=null;
        Bind9ConfigParser.el_acl_name_return el_acl_name59 = null;


        Object string_literal58_tree=null;
        Object char_literal60_tree=null;
        RewriteRuleTokenStream stream_49=new RewriteRuleTokenStream(adaptor,"token 49");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_el_acl_name=new RewriteRuleSubtreeStream(adaptor,"rule el_acl_name");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:258:2: ( 'acl_name' el_acl_name ';' -> ^( PLIST_PARAM 'acl_name' el_acl_name ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:258:4: 'acl_name' el_acl_name ';'
            {
            string_literal58=(Token)match(input,49,FOLLOW_49_in_testing_element_acl546);  
            stream_49.add(string_literal58);

            pushFollow(FOLLOW_el_acl_name_in_testing_element_acl548);
            el_acl_name59=el_acl_name();

            state._fsp--;

            stream_el_acl_name.add(el_acl_name59.getTree());
            char_literal60=(Token)match(input,39,FOLLOW_39_in_testing_element_acl550);  
            stream_39.add(char_literal60);



            // AST REWRITE
            // elements: 49, el_acl_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 258:31: -> ^( PLIST_PARAM 'acl_name' el_acl_name )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:258:34: ^( PLIST_PARAM 'acl_name' el_acl_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_49.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:260:1: testing_element_domain_name : 'domain_name' el_domain_name ';' -> ^( PLIST_PARAM 'domain_name' el_domain_name ) ;
    public final Bind9ConfigParser.testing_element_domain_name_return testing_element_domain_name() throws RecognitionException {
        Bind9ConfigParser.testing_element_domain_name_return retval = new Bind9ConfigParser.testing_element_domain_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal61=null;
        Token char_literal63=null;
        Bind9ConfigParser.el_domain_name_return el_domain_name62 = null;


        Object string_literal61_tree=null;
        Object char_literal63_tree=null;
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_50=new RewriteRuleTokenStream(adaptor,"token 50");
        RewriteRuleSubtreeStream stream_el_domain_name=new RewriteRuleSubtreeStream(adaptor,"rule el_domain_name");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:261:2: ( 'domain_name' el_domain_name ';' -> ^( PLIST_PARAM 'domain_name' el_domain_name ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:261:4: 'domain_name' el_domain_name ';'
            {
            string_literal61=(Token)match(input,50,FOLLOW_50_in_testing_element_domain_name570);  
            stream_50.add(string_literal61);

            pushFollow(FOLLOW_el_domain_name_in_testing_element_domain_name572);
            el_domain_name62=el_domain_name();

            state._fsp--;

            stream_el_domain_name.add(el_domain_name62.getTree());
            char_literal63=(Token)match(input,39,FOLLOW_39_in_testing_element_domain_name574);  
            stream_39.add(char_literal63);



            // AST REWRITE
            // elements: 50, el_domain_name
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 261:37: -> ^( PLIST_PARAM 'domain_name' el_domain_name )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:261:40: ^( PLIST_PARAM 'domain_name' el_domain_name )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_50.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:263:1: testing_element_ip4 : 'ip4' el_ip4_addr ';' -> ^( PLIST_PARAM 'ip4' el_ip4_addr ) ;
    public final Bind9ConfigParser.testing_element_ip4_return testing_element_ip4() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip4_return retval = new Bind9ConfigParser.testing_element_ip4_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal64=null;
        Token char_literal66=null;
        Bind9ConfigParser.el_ip4_addr_return el_ip4_addr65 = null;


        Object string_literal64_tree=null;
        Object char_literal66_tree=null;
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_el_ip4_addr=new RewriteRuleSubtreeStream(adaptor,"rule el_ip4_addr");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:2: ( 'ip4' el_ip4_addr ';' -> ^( PLIST_PARAM 'ip4' el_ip4_addr ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:4: 'ip4' el_ip4_addr ';'
            {
            string_literal64=(Token)match(input,51,FOLLOW_51_in_testing_element_ip4594);  
            stream_51.add(string_literal64);

            pushFollow(FOLLOW_el_ip4_addr_in_testing_element_ip4596);
            el_ip4_addr65=el_ip4_addr();

            state._fsp--;

            stream_el_ip4_addr.add(el_ip4_addr65.getTree());
            char_literal66=(Token)match(input,39,FOLLOW_39_in_testing_element_ip4598);  
            stream_39.add(char_literal66);



            // AST REWRITE
            // elements: 51, el_ip4_addr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 264:26: -> ^( PLIST_PARAM 'ip4' el_ip4_addr )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:29: ^( PLIST_PARAM 'ip4' el_ip4_addr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_51.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:266:1: testing_element_ip6 : 'ip6' el_ip6_addr ';' -> ^( PLIST_PARAM 'ip6' el_ip6_addr ) ;
    public final Bind9ConfigParser.testing_element_ip6_return testing_element_ip6() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip6_return retval = new Bind9ConfigParser.testing_element_ip6_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal67=null;
        Token char_literal69=null;
        Bind9ConfigParser.el_ip6_addr_return el_ip6_addr68 = null;


        Object string_literal67_tree=null;
        Object char_literal69_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_el_ip6_addr=new RewriteRuleSubtreeStream(adaptor,"rule el_ip6_addr");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:267:2: ( 'ip6' el_ip6_addr ';' -> ^( PLIST_PARAM 'ip6' el_ip6_addr ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:267:4: 'ip6' el_ip6_addr ';'
            {
            string_literal67=(Token)match(input,52,FOLLOW_52_in_testing_element_ip6618);  
            stream_52.add(string_literal67);

            pushFollow(FOLLOW_el_ip6_addr_in_testing_element_ip6620);
            el_ip6_addr68=el_ip6_addr();

            state._fsp--;

            stream_el_ip6_addr.add(el_ip6_addr68.getTree());
            char_literal69=(Token)match(input,39,FOLLOW_39_in_testing_element_ip6622);  
            stream_39.add(char_literal69);



            // AST REWRITE
            // elements: el_ip6_addr, 52
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 267:26: -> ^( PLIST_PARAM 'ip6' el_ip6_addr )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:267:29: ^( PLIST_PARAM 'ip6' el_ip6_addr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_52.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:269:1: testing_element_ip : 'ip' el_ip_addr ';' -> ^( PLIST_PARAM 'ip' el_ip_addr ) ;
    public final Bind9ConfigParser.testing_element_ip_return testing_element_ip() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip_return retval = new Bind9ConfigParser.testing_element_ip_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal70=null;
        Token char_literal72=null;
        Bind9ConfigParser.el_ip_addr_return el_ip_addr71 = null;


        Object string_literal70_tree=null;
        Object char_literal72_tree=null;
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_el_ip_addr=new RewriteRuleSubtreeStream(adaptor,"rule el_ip_addr");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:270:2: ( 'ip' el_ip_addr ';' -> ^( PLIST_PARAM 'ip' el_ip_addr ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:270:4: 'ip' el_ip_addr ';'
            {
            string_literal70=(Token)match(input,53,FOLLOW_53_in_testing_element_ip642);  
            stream_53.add(string_literal70);

            pushFollow(FOLLOW_el_ip_addr_in_testing_element_ip644);
            el_ip_addr71=el_ip_addr();

            state._fsp--;

            stream_el_ip_addr.add(el_ip_addr71.getTree());
            char_literal72=(Token)match(input,39,FOLLOW_39_in_testing_element_ip646);  
            stream_39.add(char_literal72);



            // AST REWRITE
            // elements: 53, el_ip_addr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 270:24: -> ^( PLIST_PARAM 'ip' el_ip_addr )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:270:27: ^( PLIST_PARAM 'ip' el_ip_addr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_53.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:272:1: testing_element_ip_port : 'ip_port' el_ip_port ';' -> ^( PLIST_PARAM 'ip_port' el_ip_port ) ;
    public final Bind9ConfigParser.testing_element_ip_port_return testing_element_ip_port() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip_port_return retval = new Bind9ConfigParser.testing_element_ip_port_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal73=null;
        Token char_literal75=null;
        Bind9ConfigParser.el_ip_port_return el_ip_port74 = null;


        Object string_literal73_tree=null;
        Object char_literal75_tree=null;
        RewriteRuleTokenStream stream_54=new RewriteRuleTokenStream(adaptor,"token 54");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_el_ip_port=new RewriteRuleSubtreeStream(adaptor,"rule el_ip_port");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:273:2: ( 'ip_port' el_ip_port ';' -> ^( PLIST_PARAM 'ip_port' el_ip_port ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:273:4: 'ip_port' el_ip_port ';'
            {
            string_literal73=(Token)match(input,54,FOLLOW_54_in_testing_element_ip_port666);  
            stream_54.add(string_literal73);

            pushFollow(FOLLOW_el_ip_port_in_testing_element_ip_port668);
            el_ip_port74=el_ip_port();

            state._fsp--;

            stream_el_ip_port.add(el_ip_port74.getTree());
            char_literal75=(Token)match(input,39,FOLLOW_39_in_testing_element_ip_port670);  
            stream_39.add(char_literal75);



            // AST REWRITE
            // elements: 54, el_ip_port
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 273:29: -> ^( PLIST_PARAM 'ip_port' el_ip_port )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:273:32: ^( PLIST_PARAM 'ip_port' el_ip_port )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_54.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:275:1: testing_element_ip_prefix : 'ip_prefix' el_ip_prefix ';' -> ^( PLIST_PARAM 'ip_prefix' el_ip_prefix ) ;
    public final Bind9ConfigParser.testing_element_ip_prefix_return testing_element_ip_prefix() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip_prefix_return retval = new Bind9ConfigParser.testing_element_ip_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal76=null;
        Token char_literal78=null;
        Bind9ConfigParser.el_ip_prefix_return el_ip_prefix77 = null;


        Object string_literal76_tree=null;
        Object char_literal78_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_el_ip_prefix=new RewriteRuleSubtreeStream(adaptor,"rule el_ip_prefix");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:276:2: ( 'ip_prefix' el_ip_prefix ';' -> ^( PLIST_PARAM 'ip_prefix' el_ip_prefix ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:276:4: 'ip_prefix' el_ip_prefix ';'
            {
            string_literal76=(Token)match(input,55,FOLLOW_55_in_testing_element_ip_prefix690);  
            stream_55.add(string_literal76);

            pushFollow(FOLLOW_el_ip_prefix_in_testing_element_ip_prefix692);
            el_ip_prefix77=el_ip_prefix();

            state._fsp--;

            stream_el_ip_prefix.add(el_ip_prefix77.getTree());
            char_literal78=(Token)match(input,39,FOLLOW_39_in_testing_element_ip_prefix694);  
            stream_39.add(char_literal78);



            // AST REWRITE
            // elements: el_ip_prefix, 55
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 276:33: -> ^( PLIST_PARAM 'ip_prefix' el_ip_prefix )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:276:36: ^( PLIST_PARAM 'ip_prefix' el_ip_prefix )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_55.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:278:1: testing_element_key_id : 'key_id' el_key_id ';' -> ^( PLIST_PARAM 'key_id' el_key_id ) ;
    public final Bind9ConfigParser.testing_element_key_id_return testing_element_key_id() throws RecognitionException {
        Bind9ConfigParser.testing_element_key_id_return retval = new Bind9ConfigParser.testing_element_key_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal79=null;
        Token char_literal81=null;
        Bind9ConfigParser.el_key_id_return el_key_id80 = null;


        Object string_literal79_tree=null;
        Object char_literal81_tree=null;
        RewriteRuleTokenStream stream_56=new RewriteRuleTokenStream(adaptor,"token 56");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_el_key_id=new RewriteRuleSubtreeStream(adaptor,"rule el_key_id");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:279:2: ( 'key_id' el_key_id ';' -> ^( PLIST_PARAM 'key_id' el_key_id ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:279:4: 'key_id' el_key_id ';'
            {
            string_literal79=(Token)match(input,56,FOLLOW_56_in_testing_element_key_id714);  
            stream_56.add(string_literal79);

            pushFollow(FOLLOW_el_key_id_in_testing_element_key_id716);
            el_key_id80=el_key_id();

            state._fsp--;

            stream_el_key_id.add(el_key_id80.getTree());
            char_literal81=(Token)match(input,39,FOLLOW_39_in_testing_element_key_id718);  
            stream_39.add(char_literal81);



            // AST REWRITE
            // elements: el_key_id, 56
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 279:27: -> ^( PLIST_PARAM 'key_id' el_key_id )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:279:30: ^( PLIST_PARAM 'key_id' el_key_id )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_56.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:281:1: testing_element_key_list : 'key_list' '\"' el_key_list '\"' ';' -> ^( PLIST_PARAM 'key_list' el_key_list ) ;
    public final Bind9ConfigParser.testing_element_key_list_return testing_element_key_list() throws RecognitionException {
        Bind9ConfigParser.testing_element_key_list_return retval = new Bind9ConfigParser.testing_element_key_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal86=null;
        Bind9ConfigParser.el_key_list_return el_key_list84 = null;


        Object string_literal82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        Object char_literal86_tree=null;
        RewriteRuleTokenStream stream_58=new RewriteRuleTokenStream(adaptor,"token 58");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_el_key_list=new RewriteRuleSubtreeStream(adaptor,"rule el_key_list");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:2: ( 'key_list' '\"' el_key_list '\"' ';' -> ^( PLIST_PARAM 'key_list' el_key_list ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:4: 'key_list' '\"' el_key_list '\"' ';'
            {
            string_literal82=(Token)match(input,57,FOLLOW_57_in_testing_element_key_list738);  
            stream_57.add(string_literal82);

            char_literal83=(Token)match(input,58,FOLLOW_58_in_testing_element_key_list740);  
            stream_58.add(char_literal83);

            pushFollow(FOLLOW_el_key_list_in_testing_element_key_list742);
            el_key_list84=el_key_list();

            state._fsp--;

            stream_el_key_list.add(el_key_list84.getTree());
            char_literal85=(Token)match(input,58,FOLLOW_58_in_testing_element_key_list744);  
            stream_58.add(char_literal85);

            char_literal86=(Token)match(input,39,FOLLOW_39_in_testing_element_key_list746);  
            stream_39.add(char_literal86);



            // AST REWRITE
            // elements: 57, el_key_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 282:39: -> ^( PLIST_PARAM 'key_list' el_key_list )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:282:42: ^( PLIST_PARAM 'key_list' el_key_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_57.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:284:1: testing_element_number : 'number' el_number ';' -> ^( PLIST_PARAM 'number' el_number ) ;
    public final Bind9ConfigParser.testing_element_number_return testing_element_number() throws RecognitionException {
        Bind9ConfigParser.testing_element_number_return retval = new Bind9ConfigParser.testing_element_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal87=null;
        Token char_literal89=null;
        Bind9ConfigParser.el_number_return el_number88 = null;


        Object string_literal87_tree=null;
        Object char_literal89_tree=null;
        RewriteRuleTokenStream stream_59=new RewriteRuleTokenStream(adaptor,"token 59");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleSubtreeStream stream_el_number=new RewriteRuleSubtreeStream(adaptor,"rule el_number");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:285:2: ( 'number' el_number ';' -> ^( PLIST_PARAM 'number' el_number ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:285:4: 'number' el_number ';'
            {
            string_literal87=(Token)match(input,59,FOLLOW_59_in_testing_element_number766);  
            stream_59.add(string_literal87);

            pushFollow(FOLLOW_el_number_in_testing_element_number768);
            el_number88=el_number();

            state._fsp--;

            stream_el_number.add(el_number88.getTree());
            char_literal89=(Token)match(input,39,FOLLOW_39_in_testing_element_number770);  
            stream_39.add(char_literal89);



            // AST REWRITE
            // elements: el_number, 59
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 285:27: -> ^( PLIST_PARAM 'number' el_number )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:285:30: ^( PLIST_PARAM 'number' el_number )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_59.nextNode());
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

    public static class el_acl_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_acl_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:288:1: el_acl_name : ( ALPHANUM_WORD | NUMBER );
    public final Bind9ConfigParser.el_acl_name_return el_acl_name() throws RecognitionException {
        Bind9ConfigParser.el_acl_name_return retval = new Bind9ConfigParser.el_acl_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set90=null;

        Object set90_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:288:12: ( ALPHANUM_WORD | NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set90=(Token)input.LT(1);
            if ( (input.LA(1)>=ALPHANUM_WORD && input.LA(1)<=NUMBER) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set90));
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
    // $ANTLR end "el_acl_name"

    public static class el_domain_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_domain_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:289:1: el_domain_name : ( ALPHANUM_WORD '.' )+ ALPHANUM_WORD ;
    public final Bind9ConfigParser.el_domain_name_return el_domain_name() throws RecognitionException {
        Bind9ConfigParser.el_domain_name_return retval = new Bind9ConfigParser.el_domain_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALPHANUM_WORD91=null;
        Token char_literal92=null;
        Token ALPHANUM_WORD93=null;

        Object ALPHANUM_WORD91_tree=null;
        Object char_literal92_tree=null;
        Object ALPHANUM_WORD93_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:290:2: ( ( ALPHANUM_WORD '.' )+ ALPHANUM_WORD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:290:4: ( ALPHANUM_WORD '.' )+ ALPHANUM_WORD
            {
            root_0 = (Object)adaptor.nil();

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:290:4: ( ALPHANUM_WORD '.' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==ALPHANUM_WORD) ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1==60) ) {
                        alt11=1;
                    }


                }


                switch (alt11) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:290:5: ALPHANUM_WORD '.'
            	    {
            	    ALPHANUM_WORD91=(Token)match(input,ALPHANUM_WORD,FOLLOW_ALPHANUM_WORD_in_el_domain_name804); 
            	    ALPHANUM_WORD91_tree = (Object)adaptor.create(ALPHANUM_WORD91);
            	    adaptor.addChild(root_0, ALPHANUM_WORD91_tree);

            	    char_literal92=(Token)match(input,60,FOLLOW_60_in_el_domain_name805); 
            	    char_literal92_tree = (Object)adaptor.create(char_literal92);
            	    adaptor.addChild(root_0, char_literal92_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            ALPHANUM_WORD93=(Token)match(input,ALPHANUM_WORD,FOLLOW_ALPHANUM_WORD_in_el_domain_name808); 
            ALPHANUM_WORD93_tree = (Object)adaptor.create(ALPHANUM_WORD93);
            adaptor.addChild(root_0, ALPHANUM_WORD93_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:292:1: el_ip_addr : ( el_ip4_addr | el_ip6_addr );
    public final Bind9ConfigParser.el_ip_addr_return el_ip_addr() throws RecognitionException {
        Bind9ConfigParser.el_ip_addr_return retval = new Bind9ConfigParser.el_ip_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.el_ip4_addr_return el_ip4_addr94 = null;

        Bind9ConfigParser.el_ip6_addr_return el_ip6_addr95 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:292:13: ( el_ip4_addr | el_ip6_addr )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==IP4_ADDR) ) {
                alt12=1;
            }
            else if ( (LA12_0==ALPHANUM_WORD||LA12_0==IP6_ADDR) ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:292:16: el_ip4_addr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_el_ip4_addr_in_el_ip_addr820);
                    el_ip4_addr94=el_ip4_addr();

                    state._fsp--;

                    adaptor.addChild(root_0, el_ip4_addr94.getTree());

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:292:30: el_ip6_addr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_el_ip6_addr_in_el_ip_addr824);
                    el_ip6_addr95=el_ip6_addr();

                    state._fsp--;

                    adaptor.addChild(root_0, el_ip6_addr95.getTree());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:293:1: el_ip4_addr : IP4_ADDR ;
    public final Bind9ConfigParser.el_ip4_addr_return el_ip4_addr() throws RecognitionException {
        Bind9ConfigParser.el_ip4_addr_return retval = new Bind9ConfigParser.el_ip4_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IP4_ADDR96=null;

        Object IP4_ADDR96_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:293:13: ( IP4_ADDR )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:293:15: IP4_ADDR
            {
            root_0 = (Object)adaptor.nil();

            IP4_ADDR96=(Token)match(input,IP4_ADDR,FOLLOW_IP4_ADDR_in_el_ip4_addr831); 
            IP4_ADDR96_tree = (Object)adaptor.create(IP4_ADDR96);
            adaptor.addChild(root_0, IP4_ADDR96_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:1: el_ip6_addr : ( IP6_ADDR | ALPHANUM_WORD );
    public final Bind9ConfigParser.el_ip6_addr_return el_ip6_addr() throws RecognitionException {
        Bind9ConfigParser.el_ip6_addr_return retval = new Bind9ConfigParser.el_ip6_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set97=null;

        Object set97_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:294:13: ( IP6_ADDR | ALPHANUM_WORD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set97=(Token)input.LT(1);
            if ( input.LA(1)==ALPHANUM_WORD||input.LA(1)==IP6_ADDR ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set97));
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
    // $ANTLR end "el_ip6_addr"

    public static class el_ip_port_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "el_ip_port"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:295:1: el_ip_port : ( NUMBER | '*' );
    public final Bind9ConfigParser.el_ip_port_return el_ip_port() throws RecognitionException {
        Bind9ConfigParser.el_ip_port_return retval = new Bind9ConfigParser.el_ip_port_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set98=null;

        Object set98_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:295:12: ( NUMBER | '*' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set98=(Token)input.LT(1);
            if ( input.LA(1)==NUMBER||input.LA(1)==61 ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set98));
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:296:1: el_ip_prefix : ( NUMBER | IP4_SHORT_2 | IP4_SHORT_3 | IP4_ADDR ) '/' NUMBER ;
    public final Bind9ConfigParser.el_ip_prefix_return el_ip_prefix() throws RecognitionException {
        Bind9ConfigParser.el_ip_prefix_return retval = new Bind9ConfigParser.el_ip_prefix_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set99=null;
        Token char_literal100=null;
        Token NUMBER101=null;

        Object set99_tree=null;
        Object char_literal100_tree=null;
        Object NUMBER101_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:296:14: ( ( NUMBER | IP4_SHORT_2 | IP4_SHORT_3 | IP4_ADDR ) '/' NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:296:17: ( NUMBER | IP4_SHORT_2 | IP4_SHORT_3 | IP4_ADDR ) '/' NUMBER
            {
            root_0 = (Object)adaptor.nil();

            set99=(Token)input.LT(1);
            if ( (input.LA(1)>=NUMBER && input.LA(1)<=IP4_ADDR)||(input.LA(1)>=IP4_SHORT_2 && input.LA(1)<=IP4_SHORT_3) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set99));
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            char_literal100=(Token)match(input,62,FOLLOW_62_in_el_ip_prefix875); 
            char_literal100_tree = (Object)adaptor.create(char_literal100);
            adaptor.addChild(root_0, char_literal100_tree);

            NUMBER101=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_el_ip_prefix876); 
            NUMBER101_tree = (Object)adaptor.create(NUMBER101);
            adaptor.addChild(root_0, NUMBER101_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:297:1: el_key_id : el_domain_name ;
    public final Bind9ConfigParser.el_key_id_return el_key_id() throws RecognitionException {
        Bind9ConfigParser.el_key_id_return retval = new Bind9ConfigParser.el_key_id_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.el_domain_name_return el_domain_name102 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:297:11: ( el_domain_name )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:297:14: el_domain_name
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_el_domain_name_in_el_key_id884);
            el_domain_name102=el_domain_name();

            state._fsp--;

            adaptor.addChild(root_0, el_domain_name102.getTree());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:1: el_key_list : el_key_id ( ';' el_key_id )* ';' ;
    public final Bind9ConfigParser.el_key_list_return el_key_list() throws RecognitionException {
        Bind9ConfigParser.el_key_list_return retval = new Bind9ConfigParser.el_key_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal104=null;
        Token char_literal106=null;
        Bind9ConfigParser.el_key_id_return el_key_id103 = null;

        Bind9ConfigParser.el_key_id_return el_key_id105 = null;


        Object char_literal104_tree=null;
        Object char_literal106_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:13: ( el_key_id ( ';' el_key_id )* ';' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:15: el_key_id ( ';' el_key_id )* ';'
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_el_key_id_in_el_key_list891);
            el_key_id103=el_key_id();

            state._fsp--;

            adaptor.addChild(root_0, el_key_id103.getTree());
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:25: ( ';' el_key_id )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==39) ) {
                    int LA13_1 = input.LA(2);

                    if ( (LA13_1==ALPHANUM_WORD) ) {
                        alt13=1;
                    }


                }


                switch (alt13) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:298:26: ';' el_key_id
            	    {
            	    char_literal104=(Token)match(input,39,FOLLOW_39_in_el_key_list894); 
            	    char_literal104_tree = (Object)adaptor.create(char_literal104);
            	    adaptor.addChild(root_0, char_literal104_tree);

            	    pushFollow(FOLLOW_el_key_id_in_el_key_list896);
            	    el_key_id105=el_key_id();

            	    state._fsp--;

            	    adaptor.addChild(root_0, el_key_id105.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            char_literal106=(Token)match(input,39,FOLLOW_39_in_el_key_list900); 
            char_literal106_tree = (Object)adaptor.create(char_literal106);
            adaptor.addChild(root_0, char_literal106_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:299:1: el_number : NUMBER ;
    public final Bind9ConfigParser.el_number_return el_number() throws RecognitionException {
        Bind9ConfigParser.el_number_return retval = new Bind9ConfigParser.el_number_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER107=null;

        Object NUMBER107_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:299:11: ( NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:299:13: NUMBER
            {
            root_0 = (Object)adaptor.nil();

            NUMBER107=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_el_number907); 
            NUMBER107_tree = (Object)adaptor.create(NUMBER107);
            adaptor.addChild(root_0, NUMBER107_tree);


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

    // Delegated rules


 

    public static final BitSet FOLLOW_entity_in_list105 = new BitSet(new long[]{0x0001000100000002L});
    public static final BitSet FOLLOW_BAD_in_list111 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_zone_in_entity121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_in_entity126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_zone139 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_zone_name_in_zone141 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_zone_class_in_zone143 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_zone_forward_block_in_zone146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_zone166 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_zone_name_in_zone168 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_zone_class_in_zone170 = new BitSet(new long[]{0x0000001E00000000L});
    public static final BitSet FOLLOW_zone_delegation_block_in_zone173 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_class0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_zone_forward_block232 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_zone_type_forward_in_zone_forward_block235 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_zone_forward_param_in_zone_forward_block237 = new BitSet(new long[]{0x0000006000000000L});
    public static final BitSet FOLLOW_37_in_zone_forward_block240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zone_forward_switch_def_in_zone_forward_param262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_zone_delegation_block272 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_zone_type_delegation_in_zone_delegation_block274 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_zone_delegation_block276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_zone_forward_switch_def289 = new BitSet(new long[]{0x0000030000000000L});
    public static final BitSet FOLLOW_zone_forward_switch_in_zone_forward_switch_def291 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_zone_forward_switch_def293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_forward_switch0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_zone_type_master331 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_zone_type_master333 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_zone_type_master335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_zone_type_slave349 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_zone_type_slave351 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_zone_type_slave353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_zone_type_stub367 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_zone_type_stub369 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_zone_type_stub371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_zone_type_forward385 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_zone_type_forward387 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_zone_type_forward389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_zone_type_hint403 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_zone_type_hint405 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_zone_type_hint407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_zone_type_delegation421 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_47_in_zone_type_delegation423 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_zone_type_delegation425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_testing441 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_testing_block_in_testing443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_testing_block465 = new BitSet(new long[]{0x0BFE002000000000L});
    public static final BitSet FOLLOW_testing_param_in_testing_block468 = new BitSet(new long[]{0x0BFE002000000000L});
    public static final BitSet FOLLOW_37_in_testing_block471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_domain_name_in_testing_param491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_acl_in_testing_param496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip4_in_testing_param501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip6_in_testing_param506 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip_in_testing_param511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip_port_in_testing_param516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip_prefix_in_testing_param521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_key_id_in_testing_param526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_key_list_in_testing_param531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_number_in_testing_param536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_testing_element_acl546 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_el_acl_name_in_testing_element_acl548 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_testing_element_acl550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_testing_element_domain_name570 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_el_domain_name_in_testing_element_domain_name572 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_testing_element_domain_name574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_testing_element_ip4594 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_el_ip4_addr_in_testing_element_ip4596 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_testing_element_ip4598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_testing_element_ip6618 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_el_ip6_addr_in_testing_element_ip6620 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_testing_element_ip6622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_testing_element_ip642 = new BitSet(new long[]{0x0000000000068000L});
    public static final BitSet FOLLOW_el_ip_addr_in_testing_element_ip644 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_testing_element_ip646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_54_in_testing_element_ip_port666 = new BitSet(new long[]{0x2000000000010000L});
    public static final BitSet FOLLOW_el_ip_port_in_testing_element_ip_port668 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_testing_element_ip_port670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_55_in_testing_element_ip_prefix690 = new BitSet(new long[]{0x00000000001B0000L});
    public static final BitSet FOLLOW_el_ip_prefix_in_testing_element_ip_prefix692 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_testing_element_ip_prefix694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_testing_element_key_id714 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_el_key_id_in_testing_element_key_id716 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_testing_element_key_id718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_testing_element_key_list738 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_testing_element_key_list740 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_el_key_list_in_testing_element_key_list742 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_testing_element_key_list744 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_testing_element_key_list746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_testing_element_number766 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_el_number_in_testing_element_number768 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_testing_element_number770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_el_acl_name0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHANUM_WORD_in_el_domain_name804 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_el_domain_name805 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ALPHANUM_WORD_in_el_domain_name808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_ip4_addr_in_el_ip_addr820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_ip6_addr_in_el_ip_addr824 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP4_ADDR_in_el_ip4_addr831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_el_ip6_addr0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_el_ip_port0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_el_ip_prefix860 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_62_in_el_ip_prefix875 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_NUMBER_in_el_ip_prefix876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_domain_name_in_el_key_id884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_el_key_id_in_el_key_list891 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_el_key_list894 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_el_key_id_in_el_key_list896 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_el_key_list900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_el_number907 = new BitSet(new long[]{0x0000000000000002L});

}
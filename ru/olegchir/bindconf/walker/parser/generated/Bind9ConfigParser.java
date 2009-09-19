// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-19 20:14:46

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ST_ZONE_MASTER", "ST_ZONE_SLAVE", "ST_ZONE_HINT", "ST_ZONE_STUB", "ST_ZONE_FORWARD", "ST_ZONE_DELEGATION", "ST_ZONE_PLIST", "ST_TESTING", "ST_TESTING_PLIST", "PLIST_PARAM", "BAD", "COMMENT", "NL", "ALPHANUM_WORD", "IP4_ADDR", "IP6_ADDR", "NUMBER", "C_COMMENT", "CPP_COMMENT", "PERL_COMMENT", "NLF", "WS", "TYPE_YES_OR_NO", "FOUR_DIGIT_NUMBER", "DIGIT", "ANY_ASCII_ALPHANUM", "IP6_VALID_CHAR", "'zone'", "'IN'", "'HS'", "'CHAOS'", "'{'", "'}'", "'forward'", "';'", "'first'", "'only'", "'type'", "'master'", "'slave'", "'stub'", "'hint'", "'delegation-only'", "'testing'", "'ip4'", "'.'"
    };
    public static final int IP6_VALID_CHAR=30;
    public static final int ST_ZONE_PLIST=10;
    public static final int ST_ZONE_MASTER=4;
    public static final int ST_ZONE_FORWARD=8;
    public static final int EOF=-1;
    public static final int ST_ZONE_SLAVE=5;
    public static final int ST_ZONE_DELEGATION=9;
    public static final int ST_ZONE_STUB=7;
    public static final int PERL_COMMENT=23;
    public static final int ANY_ASCII_ALPHANUM=29;
    public static final int CPP_COMMENT=22;
    public static final int DIGIT=28;
    public static final int NL=16;
    public static final int COMMENT=15;
    public static final int TYPE_YES_OR_NO=26;
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
    public static final int T__32=32;
    public static final int NLF=24;
    public static final int WS=25;
    public static final int T__33=33;
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
    public static final int FOUR_DIGIT_NUMBER=27;

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

            if ( (LA3_0==EOF||(LA3_0>=COMMENT && LA3_0<=NL)||LA3_0==31||LA3_0==47) ) {
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

                        if ( ((LA1_0>=COMMENT && LA1_0<=NL)||LA1_0==31||LA1_0==47) ) {
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:180:1: entity : ( COMMENT | zone | testing | NL );
    public final Bind9ConfigParser.entity_return entity() throws RecognitionException {
        Bind9ConfigParser.entity_return retval = new Bind9ConfigParser.entity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMENT3=null;
        Token NL6=null;
        Bind9ConfigParser.zone_return zone4 = null;

        Bind9ConfigParser.testing_return testing5 = null;


        Object COMMENT3_tree=null;
        Object NL6_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:180:8: ( COMMENT | zone | testing | NL )
            int alt4=4;
            switch ( input.LA(1) ) {
            case COMMENT:
                {
                alt4=1;
                }
                break;
            case 31:
                {
                alt4=2;
                }
                break;
            case 47:
                {
                alt4=3;
                }
                break;
            case NL:
                {
                alt4=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:180:10: COMMENT
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMENT3=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_entity121); 

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:181:4: zone
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_zone_in_entity127);
                    zone4=zone();

                    state._fsp--;

                    adaptor.addChild(root_0, zone4.getTree());

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:182:4: testing
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_testing_in_entity132);
                    testing5=testing();

                    state._fsp--;

                    adaptor.addChild(root_0, testing5.getTree());

                    }
                    break;
                case 4 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:183:4: NL
                    {
                    root_0 = (Object)adaptor.nil();

                    NL6=(Token)match(input,NL,FOLLOW_NL_in_entity137); 

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:187:1: zone : ( 'zone' zone_name ( zone_class )? zone_forward_block -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block ) | 'zone' zone_name ( zone_class )? zone_delegation_block -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? ) );
    public final Bind9ConfigParser.zone_return zone() throws RecognitionException {
        Bind9ConfigParser.zone_return retval = new Bind9ConfigParser.zone_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal7=null;
        Token string_literal11=null;
        Bind9ConfigParser.zone_name_return zone_name8 = null;

        Bind9ConfigParser.zone_class_return zone_class9 = null;

        Bind9ConfigParser.zone_forward_block_return zone_forward_block10 = null;

        Bind9ConfigParser.zone_name_return zone_name12 = null;

        Bind9ConfigParser.zone_class_return zone_class13 = null;

        Bind9ConfigParser.zone_delegation_block_return zone_delegation_block14 = null;


        Object string_literal7_tree=null;
        Object string_literal11_tree=null;
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleSubtreeStream stream_zone_forward_block=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_block");
        RewriteRuleSubtreeStream stream_zone_class=new RewriteRuleSubtreeStream(adaptor,"rule zone_class");
        RewriteRuleSubtreeStream stream_zone_name=new RewriteRuleSubtreeStream(adaptor,"rule zone_name");
        RewriteRuleSubtreeStream stream_zone_delegation_block=new RewriteRuleSubtreeStream(adaptor,"rule zone_delegation_block");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:188:2: ( 'zone' zone_name ( zone_class )? zone_forward_block -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block ) | 'zone' zone_name ( zone_class )? zone_delegation_block -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==31) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==ALPHANUM_WORD) ) {
                    int LA7_2 = input.LA(3);

                    if ( ((LA7_2>=32 && LA7_2<=34)) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==35) ) {
                            int LA7_4 = input.LA(5);

                            if ( (LA7_4==41) ) {
                                int LA7_5 = input.LA(6);

                                if ( (LA7_5==37) ) {
                                    alt7=1;
                                }
                                else if ( (LA7_5==46) ) {
                                    alt7=2;
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
                    else if ( (LA7_2==35) ) {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==41) ) {
                            int LA7_5 = input.LA(5);

                            if ( (LA7_5==37) ) {
                                alt7=1;
                            }
                            else if ( (LA7_5==46) ) {
                                alt7=2;
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:188:4: 'zone' zone_name ( zone_class )? zone_forward_block
                    {
                    string_literal7=(Token)match(input,31,FOLLOW_31_in_zone151);  
                    stream_31.add(string_literal7);

                    pushFollow(FOLLOW_zone_name_in_zone153);
                    zone_name8=zone_name();

                    state._fsp--;

                    stream_zone_name.add(zone_name8.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:188:21: ( zone_class )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=32 && LA5_0<=34)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:188:21: zone_class
                            {
                            pushFollow(FOLLOW_zone_class_in_zone155);
                            zone_class9=zone_class();

                            state._fsp--;

                            stream_zone_class.add(zone_class9.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_zone_forward_block_in_zone158);
                    zone_forward_block10=zone_forward_block();

                    state._fsp--;

                    stream_zone_forward_block.add(zone_forward_block10.getTree());


                    // AST REWRITE
                    // elements: zone_name, zone_class, zone_forward_block
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 188:53: -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block )
                    {
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:188:56: ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_ZONE_FORWARD, "ST_ZONE_FORWARD"), root_1);

                        adaptor.addChild(root_1, stream_zone_name.nextTree());
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:188:84: ( zone_class )?
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:189:4: 'zone' zone_name ( zone_class )? zone_delegation_block
                    {
                    string_literal11=(Token)match(input,31,FOLLOW_31_in_zone178);  
                    stream_31.add(string_literal11);

                    pushFollow(FOLLOW_zone_name_in_zone180);
                    zone_name12=zone_name();

                    state._fsp--;

                    stream_zone_name.add(zone_name12.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:189:21: ( zone_class )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=32 && LA6_0<=34)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:189:21: zone_class
                            {
                            pushFollow(FOLLOW_zone_class_in_zone182);
                            zone_class13=zone_class();

                            state._fsp--;

                            stream_zone_class.add(zone_class13.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_zone_delegation_block_in_zone185);
                    zone_delegation_block14=zone_delegation_block();

                    state._fsp--;

                    stream_zone_delegation_block.add(zone_delegation_block14.getTree());


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
                    // 189:56: -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? )
                    {
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:189:59: ^( ST_ZONE_DELEGATION zone_name ( zone_class )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_ZONE_DELEGATION, "ST_ZONE_DELEGATION"), root_1);

                        adaptor.addChild(root_1, stream_zone_name.nextTree());
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:189:90: ( zone_class )?
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:192:1: zone_name : ALPHANUM_WORD ;
    public final Bind9ConfigParser.zone_name_return zone_name() throws RecognitionException {
        Bind9ConfigParser.zone_name_return retval = new Bind9ConfigParser.zone_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALPHANUM_WORD15=null;

        Object ALPHANUM_WORD15_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:193:2: ( ALPHANUM_WORD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:193:4: ALPHANUM_WORD
            {
            root_0 = (Object)adaptor.nil();

            ALPHANUM_WORD15=(Token)match(input,ALPHANUM_WORD,FOLLOW_ALPHANUM_WORD_in_zone_name208); 
            ALPHANUM_WORD15_tree = (Object)adaptor.create(ALPHANUM_WORD15);
            adaptor.addChild(root_0, ALPHANUM_WORD15_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:196:1: zone_class : ( 'IN' | 'HS' | 'CHAOS' );
    public final Bind9ConfigParser.zone_class_return zone_class() throws RecognitionException {
        Bind9ConfigParser.zone_class_return retval = new Bind9ConfigParser.zone_class_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set16=null;

        Object set16_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:197:2: ( 'IN' | 'HS' | 'CHAOS' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set16=(Token)input.LT(1);
            if ( (input.LA(1)>=32 && input.LA(1)<=34) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set16));
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:201:1: zone_forward_block : pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}' -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* ) ;
    public final Bind9ConfigParser.zone_forward_block_return zone_forward_block() throws RecognitionException {
        Bind9ConfigParser.zone_forward_block_return retval = new Bind9ConfigParser.zone_forward_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token pl=null;
        Token char_literal19=null;
        Bind9ConfigParser.zone_type_forward_return zone_type_forward17 = null;

        Bind9ConfigParser.zone_forward_param_return zone_forward_param18 = null;


        Object pl_tree=null;
        Object char_literal19_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_zone_type_forward=new RewriteRuleSubtreeStream(adaptor,"rule zone_type_forward");
        RewriteRuleSubtreeStream stream_zone_forward_param=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_param");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:202:2: (pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}' -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:202:4: pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}'
            {
            pl=(Token)match(input,35,FOLLOW_35_in_zone_forward_block240);  
            stream_35.add(pl);

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:202:13: ( zone_type_forward ( zone_forward_param )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:202:14: zone_type_forward ( zone_forward_param )*
            {
            pushFollow(FOLLOW_zone_type_forward_in_zone_forward_block243);
            zone_type_forward17=zone_type_forward();

            state._fsp--;

            stream_zone_type_forward.add(zone_type_forward17.getTree());
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:202:32: ( zone_forward_param )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==37) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:202:32: zone_forward_param
            	    {
            	    pushFollow(FOLLOW_zone_forward_param_in_zone_forward_block245);
            	    zone_forward_param18=zone_forward_param();

            	    state._fsp--;

            	    stream_zone_forward_param.add(zone_forward_param18.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            char_literal19=(Token)match(input,36,FOLLOW_36_in_zone_forward_block248);  
            stream_36.add(char_literal19);



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
            // 202:56: -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:202:59: ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_ZONE_PLIST, pl, "ST_ZONE_PLIST"), root_1);

                adaptor.addChild(root_1, stream_zone_type_forward.nextTree());
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:202:114: ( zone_forward_param )*
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:204:1: zone_forward_param : zone_forward_switch_def ;
    public final Bind9ConfigParser.zone_forward_param_return zone_forward_param() throws RecognitionException {
        Bind9ConfigParser.zone_forward_param_return retval = new Bind9ConfigParser.zone_forward_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.zone_forward_switch_def_return zone_forward_switch_def20 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:205:2: ( zone_forward_switch_def )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:205:4: zone_forward_switch_def
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_zone_forward_switch_def_in_zone_forward_param270);
            zone_forward_switch_def20=zone_forward_switch_def();

            state._fsp--;

            adaptor.addChild(root_0, zone_forward_switch_def20.getTree());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:207:1: zone_delegation_block : '{' zone_type_delegation '}' ;
    public final Bind9ConfigParser.zone_delegation_block_return zone_delegation_block() throws RecognitionException {
        Bind9ConfigParser.zone_delegation_block_return retval = new Bind9ConfigParser.zone_delegation_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal21=null;
        Token char_literal23=null;
        Bind9ConfigParser.zone_type_delegation_return zone_type_delegation22 = null;


        Object char_literal21_tree=null;
        Object char_literal23_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:208:2: ( '{' zone_type_delegation '}' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:208:4: '{' zone_type_delegation '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal21=(Token)match(input,35,FOLLOW_35_in_zone_delegation_block280); 
            char_literal21_tree = (Object)adaptor.create(char_literal21);
            adaptor.addChild(root_0, char_literal21_tree);

            pushFollow(FOLLOW_zone_type_delegation_in_zone_delegation_block282);
            zone_type_delegation22=zone_type_delegation();

            state._fsp--;

            adaptor.addChild(root_0, zone_type_delegation22.getTree());
            char_literal23=(Token)match(input,36,FOLLOW_36_in_zone_delegation_block284); 
            char_literal23_tree = (Object)adaptor.create(char_literal23);
            adaptor.addChild(root_0, char_literal23_tree);


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

    public static class zone_testparam_alts_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_testparam_alts"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:212:1: zone_testparam_alts : domain_name ;
    public final Bind9ConfigParser.zone_testparam_alts_return zone_testparam_alts() throws RecognitionException {
        Bind9ConfigParser.zone_testparam_alts_return retval = new Bind9ConfigParser.zone_testparam_alts_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.domain_name_return domain_name24 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:213:2: ( domain_name )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:213:4: domain_name
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_domain_name_in_zone_testparam_alts296);
            domain_name24=domain_name();

            state._fsp--;

            adaptor.addChild(root_0, domain_name24.getTree());

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
    // $ANTLR end "zone_testparam_alts"

    public static class zone_forward_switch_def_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_forward_switch_def"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:215:1: zone_forward_switch_def : 'forward' zone_forward_switch ';' -> ^( PLIST_PARAM 'forward' zone_forward_switch ) ;
    public final Bind9ConfigParser.zone_forward_switch_def_return zone_forward_switch_def() throws RecognitionException {
        Bind9ConfigParser.zone_forward_switch_def_return retval = new Bind9ConfigParser.zone_forward_switch_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal25=null;
        Token char_literal27=null;
        Bind9ConfigParser.zone_forward_switch_return zone_forward_switch26 = null;


        Object string_literal25_tree=null;
        Object char_literal27_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_zone_forward_switch=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_switch");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:216:2: ( 'forward' zone_forward_switch ';' -> ^( PLIST_PARAM 'forward' zone_forward_switch ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:216:4: 'forward' zone_forward_switch ';'
            {
            string_literal25=(Token)match(input,37,FOLLOW_37_in_zone_forward_switch_def307);  
            stream_37.add(string_literal25);

            pushFollow(FOLLOW_zone_forward_switch_in_zone_forward_switch_def309);
            zone_forward_switch26=zone_forward_switch();

            state._fsp--;

            stream_zone_forward_switch.add(zone_forward_switch26.getTree());
            char_literal27=(Token)match(input,38,FOLLOW_38_in_zone_forward_switch_def311);  
            stream_38.add(char_literal27);



            // AST REWRITE
            // elements: 37, zone_forward_switch
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 216:38: -> ^( PLIST_PARAM 'forward' zone_forward_switch )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:216:41: ^( PLIST_PARAM 'forward' zone_forward_switch )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_37.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:218:1: zone_forward_switch : ( 'first' | 'only' );
    public final Bind9ConfigParser.zone_forward_switch_return zone_forward_switch() throws RecognitionException {
        Bind9ConfigParser.zone_forward_switch_return retval = new Bind9ConfigParser.zone_forward_switch_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set28=null;

        Object set28_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:219:2: ( 'first' | 'only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set28=(Token)input.LT(1);
            if ( (input.LA(1)>=39 && input.LA(1)<=40) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set28));
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:224:1: zone_type_master : 'type' 'master' ';' -> 'master' ;
    public final Bind9ConfigParser.zone_type_master_return zone_type_master() throws RecognitionException {
        Bind9ConfigParser.zone_type_master_return retval = new Bind9ConfigParser.zone_type_master_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal29=null;
        Token string_literal30=null;
        Token char_literal31=null;

        Object string_literal29_tree=null;
        Object string_literal30_tree=null;
        Object char_literal31_tree=null;
        RewriteRuleTokenStream stream_42=new RewriteRuleTokenStream(adaptor,"token 42");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:225:2: ( 'type' 'master' ';' -> 'master' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:225:4: 'type' 'master' ';'
            {
            string_literal29=(Token)match(input,41,FOLLOW_41_in_zone_type_master349);  
            stream_41.add(string_literal29);

            string_literal30=(Token)match(input,42,FOLLOW_42_in_zone_type_master351);  
            stream_42.add(string_literal30);

            char_literal31=(Token)match(input,38,FOLLOW_38_in_zone_type_master353);  
            stream_38.add(char_literal31);



            // AST REWRITE
            // elements: 42
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 225:24: -> 'master'
            {
                adaptor.addChild(root_0, stream_42.nextNode());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:227:1: zone_type_slave : 'type' 'slave' ';' -> 'slave' ;
    public final Bind9ConfigParser.zone_type_slave_return zone_type_slave() throws RecognitionException {
        Bind9ConfigParser.zone_type_slave_return retval = new Bind9ConfigParser.zone_type_slave_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal32=null;
        Token string_literal33=null;
        Token char_literal34=null;

        Object string_literal32_tree=null;
        Object string_literal33_tree=null;
        Object char_literal34_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:228:2: ( 'type' 'slave' ';' -> 'slave' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:228:4: 'type' 'slave' ';'
            {
            string_literal32=(Token)match(input,41,FOLLOW_41_in_zone_type_slave367);  
            stream_41.add(string_literal32);

            string_literal33=(Token)match(input,43,FOLLOW_43_in_zone_type_slave369);  
            stream_43.add(string_literal33);

            char_literal34=(Token)match(input,38,FOLLOW_38_in_zone_type_slave371);  
            stream_38.add(char_literal34);



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
            // 228:23: -> 'slave'
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
    // $ANTLR end "zone_type_slave"

    public static class zone_type_stub_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_type_stub"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:230:1: zone_type_stub : 'type' 'stub' ';' -> 'stub' ;
    public final Bind9ConfigParser.zone_type_stub_return zone_type_stub() throws RecognitionException {
        Bind9ConfigParser.zone_type_stub_return retval = new Bind9ConfigParser.zone_type_stub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal35=null;
        Token string_literal36=null;
        Token char_literal37=null;

        Object string_literal35_tree=null;
        Object string_literal36_tree=null;
        Object char_literal37_tree=null;
        RewriteRuleTokenStream stream_44=new RewriteRuleTokenStream(adaptor,"token 44");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:231:2: ( 'type' 'stub' ';' -> 'stub' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:231:4: 'type' 'stub' ';'
            {
            string_literal35=(Token)match(input,41,FOLLOW_41_in_zone_type_stub385);  
            stream_41.add(string_literal35);

            string_literal36=(Token)match(input,44,FOLLOW_44_in_zone_type_stub387);  
            stream_44.add(string_literal36);

            char_literal37=(Token)match(input,38,FOLLOW_38_in_zone_type_stub389);  
            stream_38.add(char_literal37);



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
            // 231:22: -> 'stub'
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
    // $ANTLR end "zone_type_stub"

    public static class zone_type_forward_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_type_forward"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:233:1: zone_type_forward : 'type' 'forward' ';' -> 'forward' ;
    public final Bind9ConfigParser.zone_type_forward_return zone_type_forward() throws RecognitionException {
        Bind9ConfigParser.zone_type_forward_return retval = new Bind9ConfigParser.zone_type_forward_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal38=null;
        Token string_literal39=null;
        Token char_literal40=null;

        Object string_literal38_tree=null;
        Object string_literal39_tree=null;
        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:234:2: ( 'type' 'forward' ';' -> 'forward' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:234:4: 'type' 'forward' ';'
            {
            string_literal38=(Token)match(input,41,FOLLOW_41_in_zone_type_forward403);  
            stream_41.add(string_literal38);

            string_literal39=(Token)match(input,37,FOLLOW_37_in_zone_type_forward405);  
            stream_37.add(string_literal39);

            char_literal40=(Token)match(input,38,FOLLOW_38_in_zone_type_forward407);  
            stream_38.add(char_literal40);



            // AST REWRITE
            // elements: 37
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 234:25: -> 'forward'
            {
                adaptor.addChild(root_0, stream_37.nextNode());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:236:1: zone_type_hint : 'type' 'hint' ';' -> 'hint' ;
    public final Bind9ConfigParser.zone_type_hint_return zone_type_hint() throws RecognitionException {
        Bind9ConfigParser.zone_type_hint_return retval = new Bind9ConfigParser.zone_type_hint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal41=null;
        Token string_literal42=null;
        Token char_literal43=null;

        Object string_literal41_tree=null;
        Object string_literal42_tree=null;
        Object char_literal43_tree=null;
        RewriteRuleTokenStream stream_45=new RewriteRuleTokenStream(adaptor,"token 45");
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:237:2: ( 'type' 'hint' ';' -> 'hint' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:237:4: 'type' 'hint' ';'
            {
            string_literal41=(Token)match(input,41,FOLLOW_41_in_zone_type_hint421);  
            stream_41.add(string_literal41);

            string_literal42=(Token)match(input,45,FOLLOW_45_in_zone_type_hint423);  
            stream_45.add(string_literal42);

            char_literal43=(Token)match(input,38,FOLLOW_38_in_zone_type_hint425);  
            stream_38.add(char_literal43);



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
            // 237:22: -> 'hint'
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
    // $ANTLR end "zone_type_hint"

    public static class zone_type_delegation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_type_delegation"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:239:1: zone_type_delegation : 'type' 'delegation-only' ';' -> 'delegation-only' ;
    public final Bind9ConfigParser.zone_type_delegation_return zone_type_delegation() throws RecognitionException {
        Bind9ConfigParser.zone_type_delegation_return retval = new Bind9ConfigParser.zone_type_delegation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal44=null;
        Token string_literal45=null;
        Token char_literal46=null;

        Object string_literal44_tree=null;
        Object string_literal45_tree=null;
        Object char_literal46_tree=null;
        RewriteRuleTokenStream stream_41=new RewriteRuleTokenStream(adaptor,"token 41");
        RewriteRuleTokenStream stream_46=new RewriteRuleTokenStream(adaptor,"token 46");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:240:2: ( 'type' 'delegation-only' ';' -> 'delegation-only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:240:4: 'type' 'delegation-only' ';'
            {
            string_literal44=(Token)match(input,41,FOLLOW_41_in_zone_type_delegation439);  
            stream_41.add(string_literal44);

            string_literal45=(Token)match(input,46,FOLLOW_46_in_zone_type_delegation441);  
            stream_46.add(string_literal45);

            char_literal46=(Token)match(input,38,FOLLOW_38_in_zone_type_delegation443);  
            stream_38.add(char_literal46);



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
            // 240:33: -> 'delegation-only'
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
    // $ANTLR end "zone_type_delegation"

    public static class testing_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:244:1: testing : 'testing' testing_block -> ^( ST_TESTING testing_block ) ;
    public final Bind9ConfigParser.testing_return testing() throws RecognitionException {
        Bind9ConfigParser.testing_return retval = new Bind9ConfigParser.testing_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal47=null;
        Bind9ConfigParser.testing_block_return testing_block48 = null;


        Object string_literal47_tree=null;
        RewriteRuleTokenStream stream_47=new RewriteRuleTokenStream(adaptor,"token 47");
        RewriteRuleSubtreeStream stream_testing_block=new RewriteRuleSubtreeStream(adaptor,"rule testing_block");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:244:9: ( 'testing' testing_block -> ^( ST_TESTING testing_block ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:244:11: 'testing' testing_block
            {
            string_literal47=(Token)match(input,47,FOLLOW_47_in_testing459);  
            stream_47.add(string_literal47);

            pushFollow(FOLLOW_testing_block_in_testing461);
            testing_block48=testing_block();

            state._fsp--;

            stream_testing_block.add(testing_block48.getTree());


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
            // 244:35: -> ^( ST_TESTING testing_block )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:244:38: ^( ST_TESTING testing_block )
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:246:1: testing_block : pl= '{' ( ( testing_param )* ) '}' -> ^( ST_TESTING_PLIST[$pl,\"ST_TESTING_PLIST\"] ( testing_param )* ) ;
    public final Bind9ConfigParser.testing_block_return testing_block() throws RecognitionException {
        Bind9ConfigParser.testing_block_return retval = new Bind9ConfigParser.testing_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token pl=null;
        Token char_literal50=null;
        Bind9ConfigParser.testing_param_return testing_param49 = null;


        Object pl_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleSubtreeStream stream_testing_param=new RewriteRuleSubtreeStream(adaptor,"rule testing_param");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:2: (pl= '{' ( ( testing_param )* ) '}' -> ^( ST_TESTING_PLIST[$pl,\"ST_TESTING_PLIST\"] ( testing_param )* ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:4: pl= '{' ( ( testing_param )* ) '}'
            {
            pl=(Token)match(input,35,FOLLOW_35_in_testing_block483);  
            stream_35.add(pl);

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:13: ( ( testing_param )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:14: ( testing_param )*
            {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:14: ( testing_param )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==48) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:14: testing_param
            	    {
            	    pushFollow(FOLLOW_testing_param_in_testing_block486);
            	    testing_param49=testing_param();

            	    state._fsp--;

            	    stream_testing_param.add(testing_param49.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            char_literal50=(Token)match(input,36,FOLLOW_36_in_testing_block489);  
            stream_36.add(char_literal50);



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
            // 247:33: -> ^( ST_TESTING_PLIST[$pl,\"ST_TESTING_PLIST\"] ( testing_param )* )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:36: ^( ST_TESTING_PLIST[$pl,\"ST_TESTING_PLIST\"] ( testing_param )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_TESTING_PLIST, pl, "ST_TESTING_PLIST"), root_1);

                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:247:79: ( testing_param )*
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:249:1: testing_param : testing_element_ip4 ;
    public final Bind9ConfigParser.testing_param_return testing_param() throws RecognitionException {
        Bind9ConfigParser.testing_param_return retval = new Bind9ConfigParser.testing_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.testing_element_ip4_return testing_element_ip451 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:250:2: ( testing_element_ip4 )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:250:4: testing_element_ip4
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_testing_element_ip4_in_testing_param509);
            testing_element_ip451=testing_element_ip4();

            state._fsp--;

            adaptor.addChild(root_0, testing_element_ip451.getTree());

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

    public static class testing_element_ip4_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "testing_element_ip4"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:252:1: testing_element_ip4 : 'ip4' ip4_addr ';' -> ^( PLIST_PARAM 'ip4' ip4_addr ) ;
    public final Bind9ConfigParser.testing_element_ip4_return testing_element_ip4() throws RecognitionException {
        Bind9ConfigParser.testing_element_ip4_return retval = new Bind9ConfigParser.testing_element_ip4_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal52=null;
        Token char_literal54=null;
        Bind9ConfigParser.ip4_addr_return ip4_addr53 = null;


        Object string_literal52_tree=null;
        Object char_literal54_tree=null;
        RewriteRuleTokenStream stream_48=new RewriteRuleTokenStream(adaptor,"token 48");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_ip4_addr=new RewriteRuleSubtreeStream(adaptor,"rule ip4_addr");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:253:2: ( 'ip4' ip4_addr ';' -> ^( PLIST_PARAM 'ip4' ip4_addr ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:253:4: 'ip4' ip4_addr ';'
            {
            string_literal52=(Token)match(input,48,FOLLOW_48_in_testing_element_ip4519);  
            stream_48.add(string_literal52);

            pushFollow(FOLLOW_ip4_addr_in_testing_element_ip4521);
            ip4_addr53=ip4_addr();

            state._fsp--;

            stream_ip4_addr.add(ip4_addr53.getTree());
            char_literal54=(Token)match(input,38,FOLLOW_38_in_testing_element_ip4523);  
            stream_38.add(char_literal54);



            // AST REWRITE
            // elements: 48, ip4_addr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 253:23: -> ^( PLIST_PARAM 'ip4' ip4_addr )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:253:26: ^( PLIST_PARAM 'ip4' ip4_addr )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_48.nextNode());
                adaptor.addChild(root_1, stream_ip4_addr.nextTree());

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

    public static class acl_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "acl_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:257:1: acl_name : ALPHANUM_WORD ;
    public final Bind9ConfigParser.acl_name_return acl_name() throws RecognitionException {
        Bind9ConfigParser.acl_name_return retval = new Bind9ConfigParser.acl_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALPHANUM_WORD55=null;

        Object ALPHANUM_WORD55_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:257:9: ( ALPHANUM_WORD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:257:11: ALPHANUM_WORD
            {
            root_0 = (Object)adaptor.nil();

            ALPHANUM_WORD55=(Token)match(input,ALPHANUM_WORD,FOLLOW_ALPHANUM_WORD_in_acl_name544); 
            ALPHANUM_WORD55_tree = (Object)adaptor.create(ALPHANUM_WORD55);
            adaptor.addChild(root_0, ALPHANUM_WORD55_tree);


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
    // $ANTLR end "acl_name"

    public static class domain_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "domain_name"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:258:1: domain_name : ( ALPHANUM_WORD '.' )+ ALPHANUM_WORD ;
    public final Bind9ConfigParser.domain_name_return domain_name() throws RecognitionException {
        Bind9ConfigParser.domain_name_return retval = new Bind9ConfigParser.domain_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ALPHANUM_WORD56=null;
        Token char_literal57=null;
        Token ALPHANUM_WORD58=null;

        Object ALPHANUM_WORD56_tree=null;
        Object char_literal57_tree=null;
        Object ALPHANUM_WORD58_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:259:2: ( ( ALPHANUM_WORD '.' )+ ALPHANUM_WORD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:259:4: ( ALPHANUM_WORD '.' )+ ALPHANUM_WORD
            {
            root_0 = (Object)adaptor.nil();

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:259:4: ( ALPHANUM_WORD '.' )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ALPHANUM_WORD) ) {
                    int LA10_1 = input.LA(2);

                    if ( (LA10_1==49) ) {
                        alt10=1;
                    }


                }


                switch (alt10) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:259:5: ALPHANUM_WORD '.'
            	    {
            	    ALPHANUM_WORD56=(Token)match(input,ALPHANUM_WORD,FOLLOW_ALPHANUM_WORD_in_domain_name553); 
            	    ALPHANUM_WORD56_tree = (Object)adaptor.create(ALPHANUM_WORD56);
            	    adaptor.addChild(root_0, ALPHANUM_WORD56_tree);

            	    char_literal57=(Token)match(input,49,FOLLOW_49_in_domain_name554); 
            	    char_literal57_tree = (Object)adaptor.create(char_literal57);
            	    adaptor.addChild(root_0, char_literal57_tree);


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            ALPHANUM_WORD58=(Token)match(input,ALPHANUM_WORD,FOLLOW_ALPHANUM_WORD_in_domain_name557); 
            ALPHANUM_WORD58_tree = (Object)adaptor.create(ALPHANUM_WORD58);
            adaptor.addChild(root_0, ALPHANUM_WORD58_tree);


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
    // $ANTLR end "domain_name"

    public static class ip_addr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip_addr"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:261:1: ip_addr : ( ip4_addr | ip6_addr );
    public final Bind9ConfigParser.ip_addr_return ip_addr() throws RecognitionException {
        Bind9ConfigParser.ip_addr_return retval = new Bind9ConfigParser.ip_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.ip4_addr_return ip4_addr59 = null;

        Bind9ConfigParser.ip6_addr_return ip6_addr60 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:261:9: ( ip4_addr | ip6_addr )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==IP4_ADDR) ) {
                alt11=1;
            }
            else if ( (LA11_0==ALPHANUM_WORD||LA11_0==IP6_ADDR) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }
            switch (alt11) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:261:11: ip4_addr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ip4_addr_in_ip_addr567);
                    ip4_addr59=ip4_addr();

                    state._fsp--;

                    adaptor.addChild(root_0, ip4_addr59.getTree());

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:261:22: ip6_addr
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_ip6_addr_in_ip_addr571);
                    ip6_addr60=ip6_addr();

                    state._fsp--;

                    adaptor.addChild(root_0, ip6_addr60.getTree());

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
    // $ANTLR end "ip_addr"

    public static class ip4_addr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip4_addr"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:262:1: ip4_addr : IP4_ADDR ;
    public final Bind9ConfigParser.ip4_addr_return ip4_addr() throws RecognitionException {
        Bind9ConfigParser.ip4_addr_return retval = new Bind9ConfigParser.ip4_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token IP4_ADDR61=null;

        Object IP4_ADDR61_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:262:9: ( IP4_ADDR )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:262:11: IP4_ADDR
            {
            root_0 = (Object)adaptor.nil();

            IP4_ADDR61=(Token)match(input,IP4_ADDR,FOLLOW_IP4_ADDR_in_ip4_addr577); 
            IP4_ADDR61_tree = (Object)adaptor.create(IP4_ADDR61);
            adaptor.addChild(root_0, IP4_ADDR61_tree);


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
    // $ANTLR end "ip4_addr"

    public static class ip6_addr_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip6_addr"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:263:1: ip6_addr : ( IP6_ADDR | ALPHANUM_WORD );
    public final Bind9ConfigParser.ip6_addr_return ip6_addr() throws RecognitionException {
        Bind9ConfigParser.ip6_addr_return retval = new Bind9ConfigParser.ip6_addr_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set62=null;

        Object set62_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:263:9: ( IP6_ADDR | ALPHANUM_WORD )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set62=(Token)input.LT(1);
            if ( input.LA(1)==ALPHANUM_WORD||input.LA(1)==IP6_ADDR ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set62));
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
    // $ANTLR end "ip6_addr"

    public static class ip_port_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ip_port"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:1: ip_port : NUMBER ;
    public final Bind9ConfigParser.ip_port_return ip_port() throws RecognitionException {
        Bind9ConfigParser.ip_port_return retval = new Bind9ConfigParser.ip_port_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NUMBER63=null;

        Object NUMBER63_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:9: ( NUMBER )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:264:11: NUMBER
            {
            root_0 = (Object)adaptor.nil();

            NUMBER63=(Token)match(input,NUMBER,FOLLOW_NUMBER_in_ip_port595); 
            NUMBER63_tree = (Object)adaptor.create(NUMBER63);
            adaptor.addChild(root_0, NUMBER63_tree);


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
    // $ANTLR end "ip_port"

    // Delegated rules


 

    public static final BitSet FOLLOW_entity_in_list105 = new BitSet(new long[]{0x0000800080018002L});
    public static final BitSet FOLLOW_BAD_in_list111 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_COMMENT_in_entity121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zone_in_entity127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_in_entity132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_entity137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_zone151 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_zone_name_in_zone153 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_zone_class_in_zone155 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_zone_forward_block_in_zone158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_zone178 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_zone_name_in_zone180 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_zone_class_in_zone182 = new BitSet(new long[]{0x0000000F00000000L});
    public static final BitSet FOLLOW_zone_delegation_block_in_zone185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHANUM_WORD_in_zone_name208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_class0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_zone_forward_block240 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_zone_type_forward_in_zone_forward_block243 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_zone_forward_param_in_zone_forward_block245 = new BitSet(new long[]{0x0000003000000000L});
    public static final BitSet FOLLOW_36_in_zone_forward_block248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zone_forward_switch_def_in_zone_forward_param270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_zone_delegation_block280 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_zone_type_delegation_in_zone_delegation_block282 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_zone_delegation_block284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_domain_name_in_zone_testparam_alts296 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_zone_forward_switch_def307 = new BitSet(new long[]{0x0000018000000000L});
    public static final BitSet FOLLOW_zone_forward_switch_in_zone_forward_switch_def309 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_zone_forward_switch_def311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_forward_switch0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_zone_type_master349 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_42_in_zone_type_master351 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_zone_type_master353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_zone_type_slave367 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_zone_type_slave369 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_zone_type_slave371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_zone_type_stub385 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_zone_type_stub387 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_zone_type_stub389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_zone_type_forward403 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_zone_type_forward405 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_zone_type_forward407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_zone_type_hint421 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45_in_zone_type_hint423 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_zone_type_hint425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_zone_type_delegation439 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46_in_zone_type_delegation441 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_zone_type_delegation443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_testing459 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_testing_block_in_testing461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_testing_block483 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_testing_param_in_testing_block486 = new BitSet(new long[]{0x0001001000000000L});
    public static final BitSet FOLLOW_36_in_testing_block489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_testing_element_ip4_in_testing_param509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_testing_element_ip4519 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_ip4_addr_in_testing_element_ip4521 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_testing_element_ip4523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHANUM_WORD_in_acl_name544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ALPHANUM_WORD_in_domain_name553 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_domain_name554 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ALPHANUM_WORD_in_domain_name557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip4_addr_in_ip_addr567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ip6_addr_in_ip_addr571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IP4_ADDR_in_ip4_addr577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_ip6_addr0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NUMBER_in_ip_port595 = new BitSet(new long[]{0x0000000000000002L});

}
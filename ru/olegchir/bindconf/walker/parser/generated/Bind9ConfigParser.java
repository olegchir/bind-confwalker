// $ANTLR 3.1.2 O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g 2009-09-19 12:45:32

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ST_ZONE_MASTER", "ST_ZONE_SLAVE", "ST_ZONE_HINT", "ST_ZONE_STUB", "ST_ZONE_FORWARD", "ST_ZONE_DELEGATION", "ST_ZONE_PLIST", "PLIST_PARAM", "BAD", "COMMENT", "NL", "C_COMMENT", "CPP_COMMENT", "PERL_COMMENT", "ID", "TYPE_YES_OR_NO", "ANY_ASCII_ALPHANUM", "WS", "NLF", "'zone'", "'IN'", "'HS'", "'CHAOS'", "'{'", "'}'", "'forward'", "';'", "'first'", "'only'", "'type'", "'master'", "'slave'", "'stub'", "'hint'", "'delegation-only'"
    };
    public static final int ST_ZONE_PLIST=10;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int ST_ZONE_MASTER=4;
    public static final int ST_ZONE_FORWARD=8;
    public static final int PLIST_PARAM=11;
    public static final int ID=18;
    public static final int EOF=-1;
    public static final int ST_ZONE_SLAVE=5;
    public static final int ST_ZONE_DELEGATION=9;
    public static final int ST_ZONE_STUB=7;
    public static final int PERL_COMMENT=17;
    public static final int ST_ZONE_HINT=6;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int NLF=22;
    public static final int T__32=32;
    public static final int WS=21;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int ANY_ASCII_ALPHANUM=20;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int BAD=12;
    public static final int CPP_COMMENT=16;
    public static final int NL=14;
    public static final int COMMENT=13;
    public static final int C_COMMENT=15;
    public static final int TYPE_YES_OR_NO=19;

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:130:1: list : ( ( entity )* | ( BAD )+ );
    public final Bind9ConfigParser.list_return list() throws RecognitionException {
        Bind9ConfigParser.list_return retval = new Bind9ConfigParser.list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token BAD2=null;
        Bind9ConfigParser.entity_return entity1 = null;


        Object BAD2_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:130:6: ( ( entity )* | ( BAD )+ )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==EOF||(LA3_0>=COMMENT && LA3_0<=NL)||LA3_0==23) ) {
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:130:8: ( entity )*
                    {
                    root_0 = (Object)adaptor.nil();

                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:130:8: ( entity )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( ((LA1_0>=COMMENT && LA1_0<=NL)||LA1_0==23) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:130:8: entity
                    	    {
                    	    pushFollow(FOLLOW_entity_in_list89);
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:131:4: ( BAD )+
                    {
                    root_0 = (Object)adaptor.nil();

                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:131:4: ( BAD )+
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
                    	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:131:4: BAD
                    	    {
                    	    BAD2=(Token)match(input,BAD,FOLLOW_BAD_in_list95); 
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:133:1: entity : ( COMMENT | zone | NL );
    public final Bind9ConfigParser.entity_return entity() throws RecognitionException {
        Bind9ConfigParser.entity_return retval = new Bind9ConfigParser.entity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token COMMENT3=null;
        Token NL5=null;
        Bind9ConfigParser.zone_return zone4 = null;


        Object COMMENT3_tree=null;
        Object NL5_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:133:8: ( COMMENT | zone | NL )
            int alt4=3;
            switch ( input.LA(1) ) {
            case COMMENT:
                {
                alt4=1;
                }
                break;
            case 23:
                {
                alt4=2;
                }
                break;
            case NL:
                {
                alt4=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:133:10: COMMENT
                    {
                    root_0 = (Object)adaptor.nil();

                    COMMENT3=(Token)match(input,COMMENT,FOLLOW_COMMENT_in_entity105); 

                    }
                    break;
                case 2 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:134:4: zone
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_zone_in_entity111);
                    zone4=zone();

                    state._fsp--;

                    adaptor.addChild(root_0, zone4.getTree());

                    }
                    break;
                case 3 :
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:135:4: NL
                    {
                    root_0 = (Object)adaptor.nil();

                    NL5=(Token)match(input,NL,FOLLOW_NL_in_entity116); 

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:151:1: zone : ( 'zone' zone_name ( zone_class )? zone_forward_block -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block ) | 'zone' zone_name ( zone_class )? zone_delegation_block -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? ) );
    public final Bind9ConfigParser.zone_return zone() throws RecognitionException {
        Bind9ConfigParser.zone_return retval = new Bind9ConfigParser.zone_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal6=null;
        Token string_literal10=null;
        Bind9ConfigParser.zone_name_return zone_name7 = null;

        Bind9ConfigParser.zone_class_return zone_class8 = null;

        Bind9ConfigParser.zone_forward_block_return zone_forward_block9 = null;

        Bind9ConfigParser.zone_name_return zone_name11 = null;

        Bind9ConfigParser.zone_class_return zone_class12 = null;

        Bind9ConfigParser.zone_delegation_block_return zone_delegation_block13 = null;


        Object string_literal6_tree=null;
        Object string_literal10_tree=null;
        RewriteRuleTokenStream stream_23=new RewriteRuleTokenStream(adaptor,"token 23");
        RewriteRuleSubtreeStream stream_zone_forward_block=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_block");
        RewriteRuleSubtreeStream stream_zone_class=new RewriteRuleSubtreeStream(adaptor,"rule zone_class");
        RewriteRuleSubtreeStream stream_zone_name=new RewriteRuleSubtreeStream(adaptor,"rule zone_name");
        RewriteRuleSubtreeStream stream_zone_delegation_block=new RewriteRuleSubtreeStream(adaptor,"rule zone_delegation_block");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:152:2: ( 'zone' zone_name ( zone_class )? zone_forward_block -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block ) | 'zone' zone_name ( zone_class )? zone_delegation_block -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==23) ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1==ID) ) {
                    int LA7_2 = input.LA(3);

                    if ( ((LA7_2>=24 && LA7_2<=26)) ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3==27) ) {
                            int LA7_4 = input.LA(5);

                            if ( (LA7_4==33) ) {
                                int LA7_5 = input.LA(6);

                                if ( (LA7_5==38) ) {
                                    alt7=2;
                                }
                                else if ( (LA7_5==29) ) {
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
                    else if ( (LA7_2==27) ) {
                        int LA7_4 = input.LA(4);

                        if ( (LA7_4==33) ) {
                            int LA7_5 = input.LA(5);

                            if ( (LA7_5==38) ) {
                                alt7=2;
                            }
                            else if ( (LA7_5==29) ) {
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:152:4: 'zone' zone_name ( zone_class )? zone_forward_block
                    {
                    string_literal6=(Token)match(input,23,FOLLOW_23_in_zone257);  
                    stream_23.add(string_literal6);

                    pushFollow(FOLLOW_zone_name_in_zone259);
                    zone_name7=zone_name();

                    state._fsp--;

                    stream_zone_name.add(zone_name7.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:152:21: ( zone_class )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0>=24 && LA5_0<=26)) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:152:21: zone_class
                            {
                            pushFollow(FOLLOW_zone_class_in_zone261);
                            zone_class8=zone_class();

                            state._fsp--;

                            stream_zone_class.add(zone_class8.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_zone_forward_block_in_zone264);
                    zone_forward_block9=zone_forward_block();

                    state._fsp--;

                    stream_zone_forward_block.add(zone_forward_block9.getTree());


                    // AST REWRITE
                    // elements: zone_forward_block, zone_class, zone_name
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 152:53: -> ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block )
                    {
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:152:56: ^( ST_ZONE_FORWARD zone_name ( zone_class )? zone_forward_block )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_ZONE_FORWARD, "ST_ZONE_FORWARD"), root_1);

                        adaptor.addChild(root_1, stream_zone_name.nextTree());
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:152:84: ( zone_class )?
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
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:153:4: 'zone' zone_name ( zone_class )? zone_delegation_block
                    {
                    string_literal10=(Token)match(input,23,FOLLOW_23_in_zone284);  
                    stream_23.add(string_literal10);

                    pushFollow(FOLLOW_zone_name_in_zone286);
                    zone_name11=zone_name();

                    state._fsp--;

                    stream_zone_name.add(zone_name11.getTree());
                    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:153:21: ( zone_class )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0>=24 && LA6_0<=26)) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:153:21: zone_class
                            {
                            pushFollow(FOLLOW_zone_class_in_zone288);
                            zone_class12=zone_class();

                            state._fsp--;

                            stream_zone_class.add(zone_class12.getTree());

                            }
                            break;

                    }

                    pushFollow(FOLLOW_zone_delegation_block_in_zone291);
                    zone_delegation_block13=zone_delegation_block();

                    state._fsp--;

                    stream_zone_delegation_block.add(zone_delegation_block13.getTree());


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
                    // 153:56: -> ^( ST_ZONE_DELEGATION zone_name ( zone_class )? )
                    {
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:153:59: ^( ST_ZONE_DELEGATION zone_name ( zone_class )? )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_ZONE_DELEGATION, "ST_ZONE_DELEGATION"), root_1);

                        adaptor.addChild(root_1, stream_zone_name.nextTree());
                        // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:153:90: ( zone_class )?
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:155:1: zone_name : ID ;
    public final Bind9ConfigParser.zone_name_return zone_name() throws RecognitionException {
        Bind9ConfigParser.zone_name_return retval = new Bind9ConfigParser.zone_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID14=null;

        Object ID14_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:156:2: ( ID )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:156:4: ID
            {
            root_0 = (Object)adaptor.nil();

            ID14=(Token)match(input,ID,FOLLOW_ID_in_zone_name314); 
            ID14_tree = (Object)adaptor.create(ID14);
            adaptor.addChild(root_0, ID14_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:158:1: zone_class : ( 'IN' | 'HS' | 'CHAOS' );
    public final Bind9ConfigParser.zone_class_return zone_class() throws RecognitionException {
        Bind9ConfigParser.zone_class_return retval = new Bind9ConfigParser.zone_class_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set15=null;

        Object set15_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:159:2: ( 'IN' | 'HS' | 'CHAOS' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set15=(Token)input.LT(1);
            if ( (input.LA(1)>=24 && input.LA(1)<=26) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set15));
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:163:1: zone_forward_block : pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}' -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* ) ;
    public final Bind9ConfigParser.zone_forward_block_return zone_forward_block() throws RecognitionException {
        Bind9ConfigParser.zone_forward_block_return retval = new Bind9ConfigParser.zone_forward_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token pl=null;
        Token char_literal18=null;
        Bind9ConfigParser.zone_type_forward_return zone_type_forward16 = null;

        Bind9ConfigParser.zone_forward_param_return zone_forward_param17 = null;


        Object pl_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleSubtreeStream stream_zone_type_forward=new RewriteRuleSubtreeStream(adaptor,"rule zone_type_forward");
        RewriteRuleSubtreeStream stream_zone_forward_param=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_param");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:164:2: (pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}' -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:164:4: pl= '{' ( zone_type_forward ( zone_forward_param )* ) '}'
            {
            pl=(Token)match(input,27,FOLLOW_27_in_zone_forward_block345);  
            stream_27.add(pl);

            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:164:13: ( zone_type_forward ( zone_forward_param )* )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:164:14: zone_type_forward ( zone_forward_param )*
            {
            pushFollow(FOLLOW_zone_type_forward_in_zone_forward_block348);
            zone_type_forward16=zone_type_forward();

            state._fsp--;

            stream_zone_type_forward.add(zone_type_forward16.getTree());
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:164:32: ( zone_forward_param )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==29) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:164:32: zone_forward_param
            	    {
            	    pushFollow(FOLLOW_zone_forward_param_in_zone_forward_block350);
            	    zone_forward_param17=zone_forward_param();

            	    state._fsp--;

            	    stream_zone_forward_param.add(zone_forward_param17.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            }

            char_literal18=(Token)match(input,28,FOLLOW_28_in_zone_forward_block353);  
            stream_28.add(char_literal18);



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
            // 164:56: -> ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:164:59: ^( ST_ZONE_PLIST[$pl,\"ST_ZONE_PLIST\"] zone_type_forward ( zone_forward_param )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ST_ZONE_PLIST, pl, "ST_ZONE_PLIST"), root_1);

                adaptor.addChild(root_1, stream_zone_type_forward.nextTree());
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:164:114: ( zone_forward_param )*
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:166:1: zone_forward_param : zone_forward_switch_def ;
    public final Bind9ConfigParser.zone_forward_param_return zone_forward_param() throws RecognitionException {
        Bind9ConfigParser.zone_forward_param_return retval = new Bind9ConfigParser.zone_forward_param_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Bind9ConfigParser.zone_forward_switch_def_return zone_forward_switch_def19 = null;



        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:167:2: ( zone_forward_switch_def )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:167:4: zone_forward_switch_def
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_zone_forward_switch_def_in_zone_forward_param375);
            zone_forward_switch_def19=zone_forward_switch_def();

            state._fsp--;

            adaptor.addChild(root_0, zone_forward_switch_def19.getTree());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:169:1: zone_delegation_block : '{' zone_type_delegation '}' ;
    public final Bind9ConfigParser.zone_delegation_block_return zone_delegation_block() throws RecognitionException {
        Bind9ConfigParser.zone_delegation_block_return retval = new Bind9ConfigParser.zone_delegation_block_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal20=null;
        Token char_literal22=null;
        Bind9ConfigParser.zone_type_delegation_return zone_type_delegation21 = null;


        Object char_literal20_tree=null;
        Object char_literal22_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:170:2: ( '{' zone_type_delegation '}' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:170:4: '{' zone_type_delegation '}'
            {
            root_0 = (Object)adaptor.nil();

            char_literal20=(Token)match(input,27,FOLLOW_27_in_zone_delegation_block385); 
            char_literal20_tree = (Object)adaptor.create(char_literal20);
            adaptor.addChild(root_0, char_literal20_tree);

            pushFollow(FOLLOW_zone_type_delegation_in_zone_delegation_block387);
            zone_type_delegation21=zone_type_delegation();

            state._fsp--;

            adaptor.addChild(root_0, zone_type_delegation21.getTree());
            char_literal22=(Token)match(input,28,FOLLOW_28_in_zone_delegation_block389); 
            char_literal22_tree = (Object)adaptor.create(char_literal22);
            adaptor.addChild(root_0, char_literal22_tree);


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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:174:1: zone_forward_switch_def : 'forward' zone_forward_switch ';' -> ^( PLIST_PARAM 'forward' zone_forward_switch ) ;
    public final Bind9ConfigParser.zone_forward_switch_def_return zone_forward_switch_def() throws RecognitionException {
        Bind9ConfigParser.zone_forward_switch_def_return retval = new Bind9ConfigParser.zone_forward_switch_def_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal23=null;
        Token char_literal25=null;
        Bind9ConfigParser.zone_forward_switch_return zone_forward_switch24 = null;


        Object string_literal23_tree=null;
        Object char_literal25_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_zone_forward_switch=new RewriteRuleSubtreeStream(adaptor,"rule zone_forward_switch");
        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:175:2: ( 'forward' zone_forward_switch ';' -> ^( PLIST_PARAM 'forward' zone_forward_switch ) )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:175:4: 'forward' zone_forward_switch ';'
            {
            string_literal23=(Token)match(input,29,FOLLOW_29_in_zone_forward_switch_def401);  
            stream_29.add(string_literal23);

            pushFollow(FOLLOW_zone_forward_switch_in_zone_forward_switch_def403);
            zone_forward_switch24=zone_forward_switch();

            state._fsp--;

            stream_zone_forward_switch.add(zone_forward_switch24.getTree());
            char_literal25=(Token)match(input,30,FOLLOW_30_in_zone_forward_switch_def405);  
            stream_30.add(char_literal25);



            // AST REWRITE
            // elements: 29, zone_forward_switch
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 175:38: -> ^( PLIST_PARAM 'forward' zone_forward_switch )
            {
                // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:175:41: ^( PLIST_PARAM 'forward' zone_forward_switch )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PLIST_PARAM, "PLIST_PARAM"), root_1);

                adaptor.addChild(root_1, stream_29.nextNode());
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:177:1: zone_forward_switch : ( 'first' | 'only' );
    public final Bind9ConfigParser.zone_forward_switch_return zone_forward_switch() throws RecognitionException {
        Bind9ConfigParser.zone_forward_switch_return retval = new Bind9ConfigParser.zone_forward_switch_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set26=null;

        Object set26_tree=null;

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:178:2: ( 'first' | 'only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:
            {
            root_0 = (Object)adaptor.nil();

            set26=(Token)input.LT(1);
            if ( (input.LA(1)>=31 && input.LA(1)<=32) ) {
                input.consume();
                adaptor.addChild(root_0, (Object)adaptor.create(set26));
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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:183:1: zone_type_master : 'type' 'master' ';' -> 'master' ;
    public final Bind9ConfigParser.zone_type_master_return zone_type_master() throws RecognitionException {
        Bind9ConfigParser.zone_type_master_return retval = new Bind9ConfigParser.zone_type_master_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal27=null;
        Token string_literal28=null;
        Token char_literal29=null;

        Object string_literal27_tree=null;
        Object string_literal28_tree=null;
        Object char_literal29_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:184:2: ( 'type' 'master' ';' -> 'master' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:184:4: 'type' 'master' ';'
            {
            string_literal27=(Token)match(input,33,FOLLOW_33_in_zone_type_master443);  
            stream_33.add(string_literal27);

            string_literal28=(Token)match(input,34,FOLLOW_34_in_zone_type_master445);  
            stream_34.add(string_literal28);

            char_literal29=(Token)match(input,30,FOLLOW_30_in_zone_type_master447);  
            stream_30.add(char_literal29);



            // AST REWRITE
            // elements: 34
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:24: -> 'master'
            {
                adaptor.addChild(root_0, stream_34.nextNode());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:186:1: zone_type_slave : 'type' 'slave' ';' -> 'slave' ;
    public final Bind9ConfigParser.zone_type_slave_return zone_type_slave() throws RecognitionException {
        Bind9ConfigParser.zone_type_slave_return retval = new Bind9ConfigParser.zone_type_slave_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal30=null;
        Token string_literal31=null;
        Token char_literal32=null;

        Object string_literal30_tree=null;
        Object string_literal31_tree=null;
        Object char_literal32_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:187:2: ( 'type' 'slave' ';' -> 'slave' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:187:4: 'type' 'slave' ';'
            {
            string_literal30=(Token)match(input,33,FOLLOW_33_in_zone_type_slave461);  
            stream_33.add(string_literal30);

            string_literal31=(Token)match(input,35,FOLLOW_35_in_zone_type_slave463);  
            stream_35.add(string_literal31);

            char_literal32=(Token)match(input,30,FOLLOW_30_in_zone_type_slave465);  
            stream_30.add(char_literal32);



            // AST REWRITE
            // elements: 35
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 187:23: -> 'slave'
            {
                adaptor.addChild(root_0, stream_35.nextNode());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:189:1: zone_type_stub : 'type' 'stub' ';' -> 'stub' ;
    public final Bind9ConfigParser.zone_type_stub_return zone_type_stub() throws RecognitionException {
        Bind9ConfigParser.zone_type_stub_return retval = new Bind9ConfigParser.zone_type_stub_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal33=null;
        Token string_literal34=null;
        Token char_literal35=null;

        Object string_literal33_tree=null;
        Object string_literal34_tree=null;
        Object char_literal35_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:190:2: ( 'type' 'stub' ';' -> 'stub' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:190:4: 'type' 'stub' ';'
            {
            string_literal33=(Token)match(input,33,FOLLOW_33_in_zone_type_stub479);  
            stream_33.add(string_literal33);

            string_literal34=(Token)match(input,36,FOLLOW_36_in_zone_type_stub481);  
            stream_36.add(string_literal34);

            char_literal35=(Token)match(input,30,FOLLOW_30_in_zone_type_stub483);  
            stream_30.add(char_literal35);



            // AST REWRITE
            // elements: 36
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 190:22: -> 'stub'
            {
                adaptor.addChild(root_0, stream_36.nextNode());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:192:1: zone_type_forward : 'type' 'forward' ';' -> 'forward' ;
    public final Bind9ConfigParser.zone_type_forward_return zone_type_forward() throws RecognitionException {
        Bind9ConfigParser.zone_type_forward_return retval = new Bind9ConfigParser.zone_type_forward_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal36=null;
        Token string_literal37=null;
        Token char_literal38=null;

        Object string_literal36_tree=null;
        Object string_literal37_tree=null;
        Object char_literal38_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:193:2: ( 'type' 'forward' ';' -> 'forward' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:193:4: 'type' 'forward' ';'
            {
            string_literal36=(Token)match(input,33,FOLLOW_33_in_zone_type_forward497);  
            stream_33.add(string_literal36);

            string_literal37=(Token)match(input,29,FOLLOW_29_in_zone_type_forward499);  
            stream_29.add(string_literal37);

            char_literal38=(Token)match(input,30,FOLLOW_30_in_zone_type_forward501);  
            stream_30.add(char_literal38);



            // AST REWRITE
            // elements: 29
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 193:25: -> 'forward'
            {
                adaptor.addChild(root_0, stream_29.nextNode());

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
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:195:1: zone_type_hint : 'type' 'hint' ';' -> 'hint' ;
    public final Bind9ConfigParser.zone_type_hint_return zone_type_hint() throws RecognitionException {
        Bind9ConfigParser.zone_type_hint_return retval = new Bind9ConfigParser.zone_type_hint_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal39=null;
        Token string_literal40=null;
        Token char_literal41=null;

        Object string_literal39_tree=null;
        Object string_literal40_tree=null;
        Object char_literal41_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:196:2: ( 'type' 'hint' ';' -> 'hint' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:196:4: 'type' 'hint' ';'
            {
            string_literal39=(Token)match(input,33,FOLLOW_33_in_zone_type_hint515);  
            stream_33.add(string_literal39);

            string_literal40=(Token)match(input,37,FOLLOW_37_in_zone_type_hint517);  
            stream_37.add(string_literal40);

            char_literal41=(Token)match(input,30,FOLLOW_30_in_zone_type_hint519);  
            stream_30.add(char_literal41);



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
            // 196:22: -> 'hint'
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
    // $ANTLR end "zone_type_hint"

    public static class zone_type_delegation_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "zone_type_delegation"
    // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:198:1: zone_type_delegation : 'type' 'delegation-only' ';' -> 'delegation-only' ;
    public final Bind9ConfigParser.zone_type_delegation_return zone_type_delegation() throws RecognitionException {
        Bind9ConfigParser.zone_type_delegation_return retval = new Bind9ConfigParser.zone_type_delegation_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal42=null;
        Token string_literal43=null;
        Token char_literal44=null;

        Object string_literal42_tree=null;
        Object string_literal43_tree=null;
        Object char_literal44_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");

        try {
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:199:2: ( 'type' 'delegation-only' ';' -> 'delegation-only' )
            // O:\\Projects\\test\\parallels\\bind-webconf\\bind-confwalker\\src\\ru\\olegchir\\bindconf\\walker\\parser\\Bind9Config.g:199:4: 'type' 'delegation-only' ';'
            {
            string_literal42=(Token)match(input,33,FOLLOW_33_in_zone_type_delegation533);  
            stream_33.add(string_literal42);

            string_literal43=(Token)match(input,38,FOLLOW_38_in_zone_type_delegation535);  
            stream_38.add(string_literal43);

            char_literal44=(Token)match(input,30,FOLLOW_30_in_zone_type_delegation537);  
            stream_30.add(char_literal44);



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
            // 199:33: -> 'delegation-only'
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
    // $ANTLR end "zone_type_delegation"

    // Delegated rules


 

    public static final BitSet FOLLOW_entity_in_list89 = new BitSet(new long[]{0x0000000000806002L});
    public static final BitSet FOLLOW_BAD_in_list95 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_COMMENT_in_entity105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zone_in_entity111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_entity116 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_zone257 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_zone_name_in_zone259 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_zone_class_in_zone261 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_zone_forward_block_in_zone264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_zone284 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_zone_name_in_zone286 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_zone_class_in_zone288 = new BitSet(new long[]{0x000000000F000000L});
    public static final BitSet FOLLOW_zone_delegation_block_in_zone291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_zone_name314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_class0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_zone_forward_block345 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_zone_type_forward_in_zone_forward_block348 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_zone_forward_param_in_zone_forward_block350 = new BitSet(new long[]{0x0000000030000000L});
    public static final BitSet FOLLOW_28_in_zone_forward_block353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_zone_forward_switch_def_in_zone_forward_param375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_zone_delegation_block385 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_zone_type_delegation_in_zone_delegation_block387 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_zone_delegation_block389 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_zone_forward_switch_def401 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_zone_forward_switch_in_zone_forward_switch_def403 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_zone_forward_switch_def405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_zone_forward_switch0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_zone_type_master443 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_zone_type_master445 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_zone_type_master447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_zone_type_slave461 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_zone_type_slave463 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_zone_type_slave465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_zone_type_stub479 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_zone_type_stub481 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_zone_type_stub483 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_zone_type_forward497 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_zone_type_forward499 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_zone_type_forward501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_zone_type_hint515 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_zone_type_hint517 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_zone_type_hint519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_zone_type_delegation533 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_zone_type_delegation535 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_zone_type_delegation537 = new BitSet(new long[]{0x0000000000000002L});

}
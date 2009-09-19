grammar Bind9Config;
options {output=AST;} // build trees
tokens {
	ST_ZONE_MASTER;
	ST_ZONE_SLAVE;
	ST_ZONE_HINT;
	ST_ZONE_STUB;
	ST_ZONE_FORWARD;
	ST_ZONE_DELEGATION;
	
	ST_ZONE_PLIST;
	PLIST_PARAM;
}

@header {
package ru.olegchir.bindconf.walker.parser.generated;
import ru.olegchir.bindconf.walker.parser.override.Bind9ParserOverrider;
import ru.olegchir.bindconf.walker.parser.override.Bind9RecognizerOverrider;
}
@members {
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
}
@lexer::header {
package ru.olegchir.bindconf.walker.parser.generated;
import ru.olegchir.bindconf.walker.parser.override.Bind9LexerOverrider;
}
@lexer::members{
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
}

@rulecatch {
catch (RecognitionException re) {
	reportError(re);
        recover(input,re);
        this.overrider.registerSemanticError("generic", re);
}
}

//General document structure
list	:	entity*
	|	BAD+
	;
entity	:	COMMENT!
	|	zone
	|	NL!
	;

//Comments
COMMENT	:	C_COMMENT | CPP_COMMENT | PERL_COMMENT
	;	
fragment C_COMMENT	: '/*' ( (~'*' | '*' ~'/') => .)* '*/'
     	;
fragment CPP_COMMENT
	:	'//' ((~'\r'|~'\n') => . )* (NL)? 
	;
fragment PERL_COMMENT
	:	'#' ((~'\r'|~'\n') => . )* (NL)? 	
	;

//Statements
zone	
	: 'zone' zone_name zone_class? zone_forward_block  -> ^(ST_ZONE_FORWARD zone_name zone_class? zone_forward_block)	
	| 'zone' zone_name zone_class? zone_delegation_block  -> ^(ST_ZONE_DELEGATION zone_name zone_class?)
	;

zone_name
	:	ID
	;

zone_class
	:	'IN'|'HS'|'CHAOS'
	;
	
//Zone block definitions
zone_forward_block
	:	pl = '{' (zone_type_forward zone_forward_param*)'}' -> ^(ST_ZONE_PLIST[$pl,"ST_ZONE_PLIST"] zone_type_forward zone_forward_param*)
	;
zone_forward_param
	:	zone_forward_switch_def
	|	zone_testparam_def
	;
zone_delegation_block
	:	'{' zone_type_delegation '}'
	;

//Parameter definitions
zone_testparam_def
	:	'testparam' zone_testparam_alts ';'
	;
zone_testparam_alts
	: IP4_ADDR
	| IP6_ADDR | ID //It's very rough hack: I don't know if we able to create ID-like IP6 addr ("asd") 
	;	
zone_forward_switch_def
	:	'forward' zone_forward_switch ';' -> ^(PLIST_PARAM 'forward' zone_forward_switch)
	;
zone_forward_switch
	:	'first'
	|	'only'	
	;

//Zone type definitions
zone_type_master
	:	'type' 'master' ';' -> 'master'
	;
zone_type_slave
	:	'type' 'slave' ';' -> 'slave'
	;
zone_type_stub
	:	'type' 'stub' ';' -> 'stub'
	;
zone_type_forward
	:	'type' 'forward' ';' -> 'forward'
	;
zone_type_hint
	:	'type' 'hint' ';' -> 'hint'
	;
zone_type_delegation
	:	'type' 'delegation-only' ';' -> 'delegation-only'
	;
	
//System types	
TYPE_YES_OR_NO
	:	'yes'|'no'|'true'|'false'|'0'|'1'
	;
	
IP4_ADDR:	FOUR_SYMBOL_NUMBER'.'FOUR_SYMBOL_NUMBER'.'FOUR_SYMBOL_NUMBER'.'FOUR_SYMBOL_NUMBER
	;
//Sprcial types
fragment FOUR_SYMBOL_NUMBER 
	:	NUMBER
	|	NUMBER NUMBER
	|	NUMBER NUMBER NUMBER
	|	NUMBER NUMBER NUMBER NUMBER
	;

fragment NUMBER	: '0'..'9';

ID 	:	('a'..'z'|'A'..'Z'|'_'|'0'..'9')* ;

fragment ANY_ASCII_ALPHANUM
	:	('\u0020'..'\u007F')
	;
	
IP6_ADDR:	(IP6_VALID_CHAR)+
	;
	
fragment IP6_VALID_CHAR
	: (('a'..'z')|('A'..'Z')|':'|'%'|('0'..'9'))+
	;
	
//Whitespace forms		
WS	: (' '|'\t'|'\f')+
		{ $channel=HIDDEN; }
	;
fragment NL	
	: ('\r'? '\n')=> '\r'? '\n'
  	| '\r'
  	;
fragment NLF
	:	NL|EOF
	;
	
BAD 	: . { overrider.registerLexicalError("The character '" + $text + "' mismatched."); } 
	;

grammar Bind9Config;
options {output=AST;} // build trees
tokens {
	//Zone statement group
	ST_ZONE_MASTER;
	ST_ZONE_SLAVE;
	ST_ZONE_HINT;
	ST_ZONE_STUB;
	ST_ZONE_FORWARD;
	ST_ZONE_DELEGATION;
	
	ST_ZONE_PLIST;
	
	//Testing statement group
	ST_TESTING;
	ST_TESTING_PLIST;
	
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
import ru.olegchir.bindconf.walker.parser.override.Bind9RecognizerOverrider;
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
entity	:	zone
	|	testing
	;

//Statements
zone	
	: 'zone' zone_name zone_class? zone_forward_block  -> ^(ST_ZONE_FORWARD zone_name zone_class? zone_forward_block)	
	| 'zone' zone_name zone_class? zone_delegation_block  -> ^(ST_ZONE_DELEGATION zone_name zone_class?)
	;

zone_name
	:	lex_identifier
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
	;
zone_delegation_block
	:	'{' zone_type_delegation '}'
	;

//Parameter definitions

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
	
//Testing statement
testing : 'testing' testing_block -> ^(ST_TESTING testing_block)
	;
testing_block
	:	pl = '{' (testing_param*)'}' -> ^(ST_TESTING_PLIST[$pl,"ST_TESTING_PLIST"] testing_param*)
	;
testing_param
	:	testing_element_domain_name
	|	testing_element_acl
	|	testing_element_ip4
	|	testing_element_ip6
	|	testing_element_ip
	|	testing_element_ip_port
	|	testing_element_ip_prefix
	|	testing_element_key_id
	|	testing_element_key_list
	|	testing_element_number
	|	testing_element_path_name
	|	testing_element_port_list
	|	testing_element_size_spec
	|	testing_element_yes_or_no
	|	testing_element_dialup_option_default
	|	testing_element_dialup_option_slavestub
	;
testing_element_acl
	:	'acl_name' el_acl_name ';' -> ^(PLIST_PARAM 'acl_name' el_acl_name)
	;
testing_element_domain_name
	:	'domain_name' el_domain_name ';' -> ^(PLIST_PARAM 'domain_name' el_domain_name)
	;
testing_element_ip4
	:	'ip4' el_ip4_addr ';' -> ^(PLIST_PARAM 'ip4' el_ip4_addr)
	;
testing_element_ip6
	:	'ip6' el_ip6_addr ';' -> ^(PLIST_PARAM 'ip6' el_ip6_addr)
	;
testing_element_ip
	:	'ip' el_ip_addr ';' -> ^(PLIST_PARAM 'ip' el_ip_addr)
	;
testing_element_ip_port
	:	'ip_port' el_ip_port ';' -> ^(PLIST_PARAM 'ip_port' el_ip_port)
	;
testing_element_ip_prefix
	:	'ip_prefix' el_ip_prefix ';' -> ^(PLIST_PARAM 'ip_prefix' el_ip_prefix)
	;
testing_element_key_id
	:	'key_id' el_key_id ';' -> ^(PLIST_PARAM 'key_id' el_key_id)
	;
testing_element_key_list
	:	'key_list' el_key_list ';' -> ^(PLIST_PARAM 'key_list' el_key_list)
	;
testing_element_number
	:	'number' el_number ';' -> ^(PLIST_PARAM 'number' el_number)
	;
testing_element_path_name
	:	'path_name' el_path_name ';' -> ^(PLIST_PARAM 'path_name' el_path_name)
	;
testing_element_port_list
	:	'port_list' el_port_list ';' -> ^(PLIST_PARAM 'port_list' el_port_list)
	;
testing_element_size_spec
	:	'size_spec' el_size_spec ';' -> ^(PLIST_PARAM 'size_spec' el_size_spec)
	;
testing_element_yes_or_no
	:	'yes_or_no' el_yes_or_no ';' -> ^(PLIST_PARAM 'yes_or_no' el_yes_or_no)
	;
testing_element_dialup_option_default
	:	'dialup_option_default' el_dialup_option_default ';' -> ^(PLIST_PARAM 'dialup_option_default' el_dialup_option_default)
	;
testing_element_dialup_option_slavestub
	:	'dialup_option_slavestub' el_dialup_option_slavestub ';' -> ^(PLIST_PARAM 'dialup_option_slavestub' el_dialup_option_slavestub)
	;
			
//Semantic support for Configfile elements. 
//We need this because some token types are too ambigous to detect it in stage1 lexer.
lex_identifier	:	ALPHANUM_NONSTD | NUMBER | KMG_NUMBER | lex_yes_or_no
		|	RANGE_WORD | UNLIMITED_WORD | DEFAULT_WORD
		|	NOTIFY_WORD | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD
		;
lex_number	:	NUMBER | ZERO_OR_ONE_WORD;
lex_yes_or_no	:	 YES_OR_NO_WORD | TRUE_OR_FALSE_WORD | ZERO_OR_ONE_WORD;

//Configfile elements	
el_acl_name	: 	lex_identifier;
el_domain_name 	: 	DOMAIN_NAME;	
el_ip_addr 	: 	el_ip4_addr | el_ip6_addr;
el_ip4_addr	:	IP4_ADDR;
el_ip6_addr	:	IP6_ADDR | lex_identifier;
el_ip_port	:	NUMBER|ASTERISK;
el_ip_prefix	: 	(NUMBER | IP4_SHORT_2 | IP4_SHORT_3 | IP4_ADDR)FORWARD_SLASH NUMBER;
el_key_id	: 	el_domain_name;
el_key_list	:	el_key_id (SEMICOLON el_key_id)* SEMICOLON;
el_number	:	lex_number;	
el_path_name	:	ONE_LINE_DOUBLE_QUOTED_STRING;
el_port_list	:	el_port_list_item (SEMICOLON el_port_list_item)* SEMICOLON; 
el_port_list_item :	NUMBER | (RANGE_WORD NUMBER NUMBER);
el_size_spec	:	(KMG_NUMBER)|UNLIMITED_WORD|DEFAULT_WORD;
el_yes_or_no	:	lex_yes_or_no;
el_dialup_option_default : lex_yes_or_no | NOTIFY_WORD;
el_dialup_option_slavestub : el_dialup_option_default | NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD;		

//Comments
COMMENT	:	(C_COMMENT | CPP_COMMENT | PERL_COMMENT){ $channel=HIDDEN; }
	;	
fragment C_COMMENT	: '/*' ( (~'*' | '*' ~'/') => .)* '*/'
     	;
fragment CPP_COMMENT
	:	'//' (~('\r'|'\n') )* NL
	;
fragment PERL_COMMENT
	:	'#' (~('\r'|'\n') )* NL 	
	;
	
//Whitespace forms
CR	:	'\r'
	;
LF	:	'\n'
	;
			
WS	: (' '|'\t'|'\f'|NL)+
		{ $channel=HIDDEN; }
	;
fragment NL	
	: ('\r'? '\n')=> '\r'? '\n'
  	| '\r'
  	;

//Special symbols that will never appear in identifiers  	
ASTERISK 
	:	'*'
	;
	
FORWARD_SLASH
	:	'/'
	;
SEMICOLON
	:	';'
	;
DOUBLE_QUOTE
	:	'"'
	;	

//Words, that must be recognized on stage1, but also can match identifiers

ONE_LINE_DOUBLE_QUOTED_STRING
	:	DOUBLE_QUOTE (~(CR|LF|DOUBLE_QUOTE))* DOUBLE_QUOTE
	;

//For YES_OR_NO element:
YES_OR_NO_WORD
	:	('yes'|'no')
	;
	
TRUE_OR_FALSE_WORD
	:	('true'|'false')
	;
	
ZERO_OR_ONE_WORD
	:	('0'|'1')
	;	

//For PORT_LIST element:	
RANGE_WORD
	:	'range'
	;
UNLIMITED_WORD
	:	'unlimited'
	;
DEFAULT_WORD
	:	'default'
	;
	
//For DIALUP_OPTION element:
NOTIFY_WORD
	:	'notify'
	;
NOTIFYPASSIVE_OR_REFRESH_OR_PASSIVE_WORD
	:	'notify-passive'|'refresh'|'passive'
	;	

//IP addresses. All IPs contains a dot ('.'), so can be recognized lexically	
IP4_ADDR:	THREE_DIGIT_NUMBER'.'THREE_DIGIT_NUMBER'.'THREE_DIGIT_NUMBER'.'THREE_DIGIT_NUMBER
	;
IP4_SHORT_3
	:	THREE_DIGIT_NUMBER'.'THREE_DIGIT_NUMBER'.'THREE_DIGIT_NUMBER
	;
IP4_SHORT_2
	:	THREE_DIGIT_NUMBER'.'THREE_DIGIT_NUMBER
	;
fragment THREE_DIGIT_NUMBER 
	:	DIGIT
	|	DIGIT DIGIT
	|	DIGIT DIGIT DIGIT
	;

//Numbers and Alphanumeric words. Many of Alphanumerics catched by prefedined Words.
NUMBER	:	DIGIT+;

fragment DIGIT	: '0'..'9';

KMG_NUMBER
	:	NUMBER ('K'|'k'|'M'|'m'|'G'|'g');
	
DOMAIN_NAME
	:	(ALPHANUM_NONSTD'.')+ALPHANUM_NONSTD
	;
	
ALPHANUM_NONSTD	
	:	('a'..'z'|'A'..'Z'|'_'|'0'..'9')* 
	;
	
fragment ANY_ASCII_ALPHANUM
	:	('\u0020'..'\u007F')
	;
	
IP6_ADDR:	(IP6_VALID_CHAR)+
	;
	
fragment IP6_VALID_CHAR
	: (('a'..'z')|('A'..'Z')|':'|'%'|('0'..'9'))+
	;
	
BAD 	: . { overrider.registerLexicalError("The character '" + $text + "' mismatched."); } 
	;

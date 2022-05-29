grammar Part21;

options
{
	output=AST;
}

tokens
{
EXCHANGE_FILE;
KEYWORD;
USER_DEFINED_STANDARD;
PARAMETER_LIST;
PARAMETER;
ENUMERATION;
HEADER_ENTITY;
HEADER_SECTION;
TYPED_PARAMETER;
UNTYPED_PARAMETER;
NULL_VALUE;
OMITTED_PARAMETER='*';
LIST;
DATA_SECTION;
ENTITY_INSTANCE_LIST;
ENTITY_INSTANCE;
SIMPLE_ENTITY_INSTANCE;
COMPLEX_ENTITY_INSTANCE;
SIMPLE_RECORD;
SUBSUPER_RECORD;
SIMPLE_RECORD_LIST;
REVERSE_SOLIDUS='\\' ;
APOSTROPHE='\'' ;
FILE_DESCRIPTION;
DESCRIPTION;
NAME;
FILE_NAME;
IMPLEMENTATION_LEVEL;
TIME_STAMP;
AUTHOR;
ORGANIZATION;
PREPROCESSOR_VERSION;
ORIGINATING_SYSTEM;
AUTHORIZATION;
FILE_SCHEMA;
SCHEMA_IDENTIFIERS;
FILE_POPULATION;
GOVERNING_SCHEMA;
DETERMINATION_METHOD;
GOVERNED_SECTIONS;
SECTION_LANGUAGE;
SECTION;
DEFAULT_LANGUAGE;
SECTION_LANGUAGE;
CONTEXT_IDENTIFIERS;
}

@lexer::header
{
	package gov.nist.msid.ontostep.instance;
}

@lexer::members
{
}

@header
{
	package gov.nist.msid.ontostep.instance;
}

@members
{
/*
	public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	{
		System.out.println(getErrorHeader(e) + " " + getErrorMessage(e, tokenNames) + " source:" + getSourceName());
	}
	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException
	{
		throw new MismatchedTokenException(ttype, input);
	}
	*/

}
exchange_file : 
  'ISO-10303-21;' header_section data_section+ 'END-ISO-10303-21;' 
 -> ^(EXCHANGE_FILE header_section data_section+)
 ;
 
keyword : (user_defined_keyword | STANDARD_KEYWORD )
-> ^(KEYWORD user_defined_keyword? STANDARD_KEYWORD?)
;

user_defined_keyword : '!' STANDARD_KEYWORD 
-> ^(USER_DEFINED_STANDARD STANDARD_KEYWORD)
;

enumeration : '.' STANDARD_KEYWORD '.' 
-> ^(ENUMERATION STANDARD_KEYWORD)
;

header_section : 'HEADER;' file_description file_name file_schema file_population? section_language? section_context?  'ENDSEC;' 
	-> ^(HEADER_SECTION file_description file_name file_schema file_population? section_language? section_context?);

file_description
	:	'FILE_DESCRIPTION' '(' description ',' implementation_level ')' ';'
	-> ^(FILE_DESCRIPTION description implementation_level)
	;

description
	:	'(' STRING (',' STRING)* ')'
	-> ^(DESCRIPTION STRING+)
	;
	
implementation_level
	:	STRING
	->^(IMPLEMENTATION_LEVEL STRING)
	;
	
file_name
	:	'FILE_NAME' '(' name ',' time_stamp ',' author ',' organization ',' 
	preprocessor_version ',' originating_system ',' authorization ')' ';'
	-> ^(FILE_NAME name time_stamp author organization 
	preprocessor_version originating_system authorization)
	;
	
name	:	STRING
	->^(NAME STRING);

time_stamp
	:	STRING
	->^(TIME_STAMP STRING);
	
author	:	'(' STRING (',' STRING)* ')'
	->^(AUTHOR STRING+);

organization
	:	'(' STRING (',' STRING)* ')'
	->^(ORGANIZATION STRING+);
	
	
preprocessor_version
	:	STRING
	->^(PREPROCESSOR_VERSION STRING);
	
originating_system
	:	STRING
	->^(ORIGINATING_SYSTEM STRING);
	
authorization
	:	STRING
	->^(AUTHORIZATION STRING);
	
file_schema
	:	'FILE_SCHEMA' '(' schema_identifiers ')' ';'
	->^(FILE_SCHEMA schema_identifiers);
	
schema_identifiers
	:	'(' STRING (',' STRING)* ')'
	->^(SCHEMA_IDENTIFIERS STRING+);
	
file_population
	:	'FILE_POPULATION' '(' governing_schema ',' determination_method (',' governed_sections)? ')' ';'
	->^(FILE_POPULATION governing_schema determination_method governed_sections?);
	
	
governing_schema
	:	STRING
	->^(GOVERNING_SCHEMA STRING);
	
determination_method
	:	STRING
	->^(DETERMINATION_METHOD STRING);
	
governed_sections
	:	'(' STRING (',' STRING)* ')'
	->^(GOVERNED_SECTIONS STRING+);
	
section_language
	:	'SECTION_LANGUAGE' '(' section ',' default_language ')' ';'
	->^(SECTION_LANGUAGE section default_language);
	
section	:	STRING
	->^(SECTION STRING);


default_language
	:	STRING
	->^(DEFAULT_LANGUAGE STRING);

section_context
	:	'SECTION_CONTEXT' '(' section ',' context_identifiers ')' ';'
	->^(SECTION_LANGUAGE section context_identifiers);
	
context_identifiers
	:	'(' STRING (',' STRING)* ')'
	->^(CONTEXT_IDENTIFIERS STRING+);
		
header_entity : keyword '(' parameter_list? ')' ';' 
-> ^(HEADER_ENTITY keyword parameter_list?)
;

parameter_list : parameter ( ',' parameter )* 
-> ^(PARAMETER_LIST parameter+)
;

parameter : 
(typed_parameter | untyped_parameter | OMITTED_PARAMETER)
-> ^(PARAMETER typed_parameter? untyped_parameter? OMITTED_PARAMETER?) 
;

typed_parameter : keyword '(' parameter ')' 
-> ^(TYPED_PARAMETER keyword parameter)
;

untyped_parameter : 
(NULL_VALUE | INTEGER | REAL| STRING| ENTITY_INSTANCE_NAME| enumeration| BINARY| list )
-> ^(UNTYPED_PARAMETER NULL_VALUE? INTEGER? REAL? STRING? ENTITY_INSTANCE_NAME? enumeration? BINARY? list?)
;

list : 
'(' ( parameter ( ',' parameter )* )? ')' 
-> ^(LIST parameter*);

data_section : 
'DATA' ( '(' parameter_list ')' )? ';' entity_instance_list 'ENDSEC;' 
-> ^(DATA_SECTION parameter_list? entity_instance_list);

entity_instance_list : 
entity_instance* 
-> ^(ENTITY_INSTANCE_LIST entity_instance*);

entity_instance :  ENTITY_INSTANCE_NAME '=' (simple_entity_instance | complex_entity_instance )
-> ^(ENTITY_INSTANCE ENTITY_INSTANCE_NAME simple_entity_instance?  complex_entity_instance?);

simple_entity_instance :simple_record ';' 
-> ^(SIMPLE_ENTITY_INSTANCE simple_record);

complex_entity_instance : subsuper_record ';'  
-> ^(COMPLEX_ENTITY_INSTANCE subsuper_record);

subsuper_record : '(' simple_record_list ')'  
-> ^(SUBSUPER_RECORD simple_record_list);

simple_record : keyword '(' parameter_list? ')'  
-> ^(SIMPLE_RECORD keyword parameter_list?);

simple_record_list : simple_record+  
-> ^(SIMPLE_RECORD_LIST simple_record+);

ENTITY_INSTANCE_NAME : '#' DIGIT+ ;

BINARY : '""' ( '0' | '1' | '2' | '3' ) HEX* '""' ;

INTEGER : SIGN? DIGIT+ ;


/*
string	:	
	'\'' 
	(~'\'')* 
	'\''
	;
*/	


STRING:
	  ('\'' 
	  	( 
	  		  ~('\'' ) | '\'' '\'' 
	  	)* 
	  '\'' )
		
;

NULL_VALUE
	:	'$';

COMMENT
    :   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;


STANDARD_KEYWORD :  (UPPER | '_')  (  UPPER | '_' | DIGIT)*;


SPECIAL : 
  '!' | '""' | '*' | '$' | '%' | '&' | '.' | '#'
| '+' | ',' | '-' | '(' | ')' | '?' | '/' | ':'
| ';' | '<' | '=' | '>' | '@' | '[' | ']' | '{'
| '|' | '}' | '^' | '`' | '~' ;


WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
    ;

fragment UPPER	: 'A'..'Z'	
	;

fragment LOWER	: 'a'..'z'	
	;

fragment DIGIT : '0' .. '9' ;

REAL : INTEGER '.' DIGIT* (('e'|'E') INTEGER)? ;

fragment HEX : DIGIT | 'A'..'F'  | 'a'..'f';

fragment SIGN : '+' | '-' ;

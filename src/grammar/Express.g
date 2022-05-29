grammar Express;
options
{
	output = AST;
	ASTLabelType=CommonTree;
	backtrack=true;
	memoize=true;
}
tokens
{
	/* id types */
	CONSTANT_IDENT;
	ENTITY_IDENT;
	FUNCTION_IDENT;
	PROCEDURE_IDENT;
	PARAMETER_IDENT;
	SCHEMA_IDENT;
	TYPE_IDENT;
	VARIABLE_IDENT;
	ENUMERATION_IDENT;
	ATTRIBUTE_IDENT;
	ENTITY_ATTR_IDENT;
	TYPE_ATTR_IDENT;
	ENTITY_VAR_IDENT;
	TYPE_VAR_IDENT;
	ENTITY_PARAM_IDENT;
	TYPE_PARAM_IDENT;
	SUBTYPE_CONSTRAINT_ID;

	ACTUAL_PARAMETER_LIST; ADD_LIKE_OP; AGGREGATE_INITIALIZER; 
	AGGREGATE_SOURCE; AGGREGATE_TYPE; AGGREGATION_TYPES; ALGORITHM_HEAD; 
	ALIAS_STMT; ARRAY_TYPE; ASSIGNMENT_STMT; BAG_TYPE; BASE_TYPE; 
	BINARY_TYPE; BOOLEAN_TYPE; BOUND_1; BOUND_2; BOUND_SPEC; 
	BUILT_IN_CONSTANT; BUILT_IN_FUNCTION; BUILT_IN_PROCEDURE; CASE_ACTION;
	CASE_LABEL; CASE_STMT; COMPOUND_STMT; CONSTANT_BODY; CONSTANT_DECL; 
	CONSTANT_FACTOR; CONSTANT_ID; DECLARATION; DOMAIN_RULE; ELEMENT; 
	ENTITY_HEAD; ENTITY_DECL; ENTITY_BODY; SUBSUPER; SUPERTYPE_CONSTRAINT;
	ABSTRACT_SUPERTYPE_DECLARATION; SUBTYPE_DECLARATION; EXPLICIT_ATTR; 
	ATTRIBUTE_DECL; ATTRIBUTE_ID; QUALIFIED_ATTRIBUTE; DERIVE_CLAUSE; 
	DERIVED_ATTR; INVERSE_CLAUSE; INVERSE_ATTR; UNIQUE_CLAUSE; UNIQUE_RULE;
	REFERENCED_ATTRIBUTE; ENTITY_CONSTRUCTOR; ENTITY_ID; 
	ENUMERATION_REFERENCE; ESCAPE_STMT; EXPRESSION; FACTOR; 
	FORMAL_PARAMETER; ATTRIBUTE_QUALIFIER; FUNCTION_CALL; FUNCTION_DECL; 
	FUNCTION_HEAD; FUNCTION_ID; GENERALIZED_TYPES; 
	GENERAL_AGGREGATION_TYPES; GENERAL_ARRAY_TYPE; GENERAL_BAG_TYPE; 
	GENERAL_LIST_TYPE; GENERAL_REF; GENERAL_SET_TYPE; GENERIC_TYPE; 
	GROUP_QUALIFIER; IF_STMT; INCREMENT; INCREMENT_CONTROL; INDEX; INDEX_1;
	INDEX_2; INDEX_QUALIFIER; INTEGER_TYPE; INTERVAL; INTERVAL_HIGH; 
	INTERVAL_ITEM; INTERVAL_LOW; INTERVAL_OP; LABEL; LIST_TYPE; LITERAL;
	REAL_LITERAL; INTEGER_LITERAL; STRING_LITERAL; 
	LOCAL_DECL; LOCAL_VARIABLE; LOGICAL_EXPRESSION; LOGICAL_LITERAL; 
	LOGICAL_TYPE; MULTIPLICATION_LIKE_OP; NAMED_TYPES; NULL_STMT; 
	NUMBER_TYPE; NUMERIC_EXPRESSION; ONE_OF; PARAMETER; PARAMETER_ID; 
	PARAMETER_TYPE; POPULATION; PRECISION_SPEC; PRIMARY; 
	PROCEDURE_CALL_STMT; PROCEDURE_DECL; PROCEDURE_HEAD; PROCEDURE_ID; 
	QUALIFIABLE_FACTOR; QUALIFIER; QUERY_EXPRESSION; REAL_TYPE; 
	REFERENCE_CLAUSE; REL_OP; REL_OP_EXTENDED; REPEAT_CONTROL; REPEAT_STMT;
	REPETITION; RESOURCE_OR_RENAME; RESOURCE_REF; RETURN_STMT; RULE_DECL;
	RULE_HEAD; RULE_ID; SCHEMA_ID; SCHEMA_BODY; SCHEMA_DECL; 
	INTERFACE_SPECIFICATION; USE_CLAUSE; NAMED_TYPE_OR_RENAME; SELECTOR; 
	SET_TYPE; SIMPLE_EXPRESSION; SIMPLE_FACTOR; SIMPLE_TYPES; SKIP_STMT; 
	STMT; STRING_TYPE; SUBTYPE_CONSTRAINT; SUPERTYPE_EXPRESSION; 
	SUPERTYPE_FACTOR; SUPERTYPE_RULE; SUPERTYPE_TERM; SYNTAX; TERM; 
	TYPE_DECL; UNDERLYING_TYPE; CONSTRUCTED_TYPES; ENUMERATION_TYPE; 
	ENUMERATION_ID; SELECT_TYPE; TYPE_ID; TYPE_LABEL; TYPE_LABEL_ID; 
	UNARY_OP; UNTIL_CONTROL; VARIABLE_ID; WHERE_CLAUSE; WHILE_CONTROL; 
	WIDTH; WIDTH_SPEC; ENTITY_REF; TYPE_REF; ENUMERATION_REF; 
	ATTRIBUTE_REF; CONSTANT_REF; FUNCTION_REF; PARAMETER_REF; VARIABLE_REF;
	SCHEMA_REF; TYPE_LABEL_REF; PROCEDURE_REF; SIMPLE_ID; ELSE_CLAUSE;
	RENAME_ID;
	/* Express amendment nodes */
	ENUMERATION_ITEMS; ENUMERATION_EXTENSION;
	SELECT_LIST; SELECT_EXTENSION;
	REDECLARED_ATTRIBUTE;
	SUBTYPE_CONSTRAINT_DECL; SUBTYPE_CONSTRAINT_HEAD; SUBTYPE_CONSTRAINT_BODY;
	ABSTRACT_SUPERTYPE; TOTAL_OVER;	
	CONCRETE_TYPES;
	GENERIC_ENTITY_TYPE;
	SCHEMA_VERSION_ID;
	LANGUAGE_VERSION_ID;
	
	CONST_E='const_e';
	CONST_PI='pi';
	CONST_SELF='self';
			
	FUNCTION_ABS='abs';
	FUNCTION_ACOS='acos';
	FUNCTION_ASIN='asin';
	FUNCTION_ATAN='atan';
	FUNCTION_BLENGTH='blength';
	FUNCTION_COS='cos';
	FUNCTION_EXISTS='exists';
	FUNCTION_EXP='exp';
	FUNCTION_FORMAT='format';
	FUNCTION_HIBOUND='hibound';
	FUNCTION_HIINDEX='hiindex';
	FUNCTION_LENGTH='length';
	FUNCTION_LOBOUND='lobound';
	FUNCTION_LOINDEX='loindex';
	FUNCTION_LOG='log';
	FUNCTION_LOG2='log2';
	FUNCTION_LOG10='log10';
	FUNCTION_NVL='nvl';
	FUNCTION_ODD='odd';
	FUNCTION_ROLESOF='rolesof';
	FUNCTION_SIN='sin';
	FUNCTION_SQRT='sqrt';
	FUNCTION_TAN='tan';
	FUNCTION_TYPEOF='typeof';
	FUNCTION_USEDIN='usedin';
	FUNCTION_VALUE='value';
	FUNCTION_VALUE_IN='value_in';
	FUNCTION_VALUE_UNIQUE='value_unique';
	FUNCTION_SIZEOF='sizeof';
	
	PROCEDURE_INSERT='insert';
	PROCEDURE_REMOVE='remove';		
	NOT='not';
	OR='or';
	XOR='xor';
	
	DIV='div';
	MOD='mod';
	AND='and';
}

@lexer::header
{
/*
 * Unless otherwise noted, this software was developed at the National Institute of 
 * Standards and Technology by employees of the Federal Government in the course of 
 * their official duties. Pursuant to title  17 Section 105 of the United States 
 * Code this software is not subject to copyright protection and is in the public 
 * domain.
 * 
 * We would appreciate acknowledgement if the software is used.
 *
 * Links to non-Federal Government Web sites do not imply NIST endorsement of any 
 * particular product, service, organization, company,  information provider, or content.
 */

	package gov.nist.msid.ontostep.schema;
}

@lexer::members
{
	private ExpressParser parser;
	static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ExpressLexer.class);
	public void setParser(ExpressParser parser) 
	{
		this.parser=parser;
	}

	Stack<String> paraphrase = new Stack<String>();

}

@header
{ 
/*
 * Unless otherwise noted, this software was developed at the National Institute of 
 * Standards and Technology by employees of the Federal Government in the course of 
 * their official duties. Pursuant to title  17 Section 105 of the United States 
 * Code this software is not subject to copyright protection and is in the public 
 * domain.
 * 
 * We would appreciate acknowledgement if the software is used.
 *
 * Links to non-Federal Government Web sites do not imply NIST endorsement of any 
 * particular product, service, organization, company,  information provider, or content.
 */

	package gov.nist.msid.ontostep.schema;

	import java.util.Hashtable;
}

@members
{
	static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ExpressParser.class);
	public  Scope rootScope;
	public  Scope currentScope;
	private Scope lastCreatedScope;

	/* We keep track of scopes defined by schemas. It is useful when
	multiple schemas are parsed, to deal with external elements */
	private Hashtable<String, Scope> schemas;

	public boolean isFirst=true; /* is the first pass running ? */

	Stack<String> paraphrase = new Stack<String>();
	boolean bnice = false;
	
	public Hashtable<String, Scope> getSchemas()
	{
		return schemas;
	}
	
	public void newScope(String mess) {
		if (isFirst) newScope1();
		else 
		{
			newScope2();
		}
		log.debug("New scope..." + mess + "-" + isFirst);
	}

	private boolean nextIs(int type)
	{
		return nextIs(type, 1);
	}

	private boolean nextIs(int type, int pos)
	{
		if (isFirst)
			return false;
		String txt = input.LT(pos).getText();
		log.debug("checking " + txt + ":" + type + " in the scope " + currentScope.scopeId);
		int i = currentScope.searchId(txt);
		return i == type;
		/*
		if (i != type && bnice && currentScope.next != null)
		{
			log.debug("also checking " + txt + ":" + type + " in the scope " + currentScope.next.scopeId);
			i = currentScope.next.searchId(txt);
			if (i != type && currentScope.next.next != null)
			{
				log.debug("also checking " + txt + ":" + type + " in the scope " + currentScope.next.next.scopeId);
				i = currentScope.next.next.searchId(txt);
				return i == type;
			}
			else
				return true;
		}
		else
			return true;
		*/
	}

	public void newScope1() 
	{
		/* creates a new Scope when entering a rule defining
		a scope in the grammar. */
		Scope ns;

		ns = new Scope(currentScope);
		currentScope=ns;
		lastCreatedScope.setNext(ns);
		lastCreatedScope=ns;
		log.debug("Scope changed to " + currentScope.scopeId); 
	}


	public void newScope2() 
	{
		/* retrieve the scope created in the first pass when
		entering the same rule. 
		See comments in the lexer's IDENT rule definition */

		currentScope=lastCreatedScope.next;
		lastCreatedScope=currentScope;
		log.debug("Scope changed to " + currentScope.scopeId); 
	}

	public void upScope() 
	{
		/* when exiting a scope */
		currentScope=currentScope.parent;
		log.debug("Up, scope=" + currentScope.scopeId); 
	}
	
	private void newSchemaScope(String id) 
	{
		/* we record schema scopes so as to retrieve external
		elements when parsing multiple schemas */
		newScope("(schema)");
		if (isFirst) 
			schemas.put(id,currentScope);
	}

	private void newEntityScope(String id) 
	{
		/* entity case: additional information is recorded to build
		the entity inheritance tree */
		newScope("(entite)");
		if (isFirst) 
		{
			currentScope.setEntity();
			currentScope.parent.addEntityScope(id,currentScope);
		}
	}

	private void addId(String id, int type) 
	{
		/* record an id in the current scope */
		log.debug("adding " + id + ":" + type + ", scope " + currentScope.scopeId);
		currentScope.addId(id,type);
	}

	private void addSuper(String name) 
	{
		/* add superentity in the current entity scope */
		currentScope.addSuperEntity(name);
	}

	public void setRootScope(Scope rs) 
	{
		rootScope=rs;
		currentScope=rootScope;
		lastCreatedScope=rootScope;
		isFirst=false;
	}

	public void addReference(ExternalId ei) 
	{
		/* add an element referenced from another schema */
		log.debug("referencing " + ei.schema + ":" + ei.id);
		currentScope.addReference(ei);
	}

	public void addUse(ExternalId ei) 
	{
		/* add an element used from another schema */
		log.debug("using " + ei.schema + ":" + ei.id);
		currentScope.addUse(ei);
	}

	public void addAllReferenceExternals(String schema) 
	{
		/* when all elements of another schema are referenced */
		log.debug("referencing " + schema);
		currentScope.addAllReferenceExternals(schema);
	}

	public void addAllUseExternals(String schema) 
	{
		/* when all elements of another schema are used */
		log.debug("using " + schema);
		currentScope.addAllUseExternals(schema);
	}
	
	public void displayRecognitionError(String[] tokenNames, RecognitionException e)
	{
		log.error(getErrorHeader(e) + " " + getErrorMessage(e, tokenNames) + " source:" + getSourceName());
	}
	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException
	{
		throw new MismatchedTokenException(ttype, input);
	}
}

actual_parameter_list 
		:  LPAREN  parameter (  COMMA  parameter )*  RPAREN
		-> ^(ACTUAL_PARAMETER_LIST parameter+)
		;

add_like_op
		:  PLUS -> ^(ADD_LIKE_OP PLUS)
		|  MINUS -> ^(ADD_LIKE_OP MINUS)
		|  OR -> ^(ADD_LIKE_OP OR)
		|  XOR -> ^(ADD_LIKE_OP XOR)
		;

aggregate_initializer
		:  LBRACK  (  element  (  COMMA  element )*  )?  RBRACK
		-> ^(AGGREGATE_INITIALIZER element*)
		;

aggregate_source
		:  simple_expression -> ^(AGGREGATE_SOURCE simple_expression) 
		;

aggregate_type
		:  'aggregate' ( COLON  type_label )?  'of' parameter_type
		-> ^(AGGREGATE_TYPE type_label? parameter_type)
		;

aggregation_types
		:  array_type -> ^(AGGREGATION_TYPES array_type)
		|  bag_type  -> ^(AGGREGATION_TYPES bag_type)
		|  list_type -> ^(AGGREGATION_TYPES list_type) 
		|  set_type -> ^(AGGREGATION_TYPES set_type)
		;

algorithm_head
		:  declaration* constant_decl? local_decl?
		-> ^(ALGORITHM_HEAD declaration* constant_decl? local_decl?)
		;

alias_stmt
@init{newScope("alias");}
		: { isFirst }?=> 'alias' variable_id 'for' IDENT qualifier* SEMI stmt+ 'end_alias' { upScope(); } SEMI
			|  'alias' variable_id 'for' general_ref qualifier* SEMI stmt+ 'end_alias' { upScope(); } SEMI
		-> ^(ALIAS_STMT variable_id general_ref qualifier* stmt+ )
		;

array_type
		:  'array'  bound_spec  'of'  (  'optional' )?  (  'unique' )?  base_type
		-> ^(ARRAY_TYPE bound_spec base_type)
		;

assignment_stmt
		: ( general_ref qualifier* ) COLEQ  expression  SEMI
		-> ^(ASSIGNMENT_STMT general_ref qualifier* expression)
		;

bag_type
		:  'bag'  bound_spec? 'of' base_type
		-> ^(BAG_TYPE bound_spec? base_type)
		;

base_type
		:  aggregation_types -> ^(BASE_TYPE aggregation_types)
		|  simple_types -> ^(BASE_TYPE simple_types)
		|  named_types-> ^(BASE_TYPE named_types)
		;

binary_type
		:  'binary'  width_spec?
		->^(BINARY_TYPE width_spec?)
		;

boolean_type
		:  'boolean' ->^(BOOLEAN_TYPE)
		;

bound_1
		:  numeric_expression ->^(BOUND_1 numeric_expression)
		;

bound_2
		:  numeric_expression ->^(BOUND_2 numeric_expression)
		;

bound_spec
		:  LBRACK  bound_1  COLON  bound_2  RBRACK
		-> ^(BOUND_SPEC bound_1 bound_2)
		;

built_in_constant
		:  CONST_E -> ^(BUILT_IN_CONSTANT CONST_E)
		|  CONST_PI -> ^(BUILT_IN_CONSTANT CONST_PI)
		|  CONST_SELF -> ^(BUILT_IN_CONSTANT CONST_SELF)
		|  QUESTION  -> ^(BUILT_IN_CONSTANT QUESTION)
		|  STAR  -> ^(BUILT_IN_CONSTANT STAR)
		;

built_in_function
		:  FUNCTION_ABS -> ^(BUILT_IN_FUNCTION FUNCTION_ABS)
		|  FUNCTION_ACOS -> ^(BUILT_IN_FUNCTION FUNCTION_ACOS)	
		|  FUNCTION_ASIN -> ^(BUILT_IN_FUNCTION FUNCTION_ASIN)
		|  FUNCTION_ATAN -> ^(BUILT_IN_FUNCTION FUNCTION_ATAN)
		|  FUNCTION_BLENGTH -> ^(BUILT_IN_FUNCTION FUNCTION_BLENGTH)
		|  FUNCTION_COS -> ^(BUILT_IN_FUNCTION FUNCTION_COS)
		|  FUNCTION_EXISTS -> ^(BUILT_IN_FUNCTION FUNCTION_EXISTS)	
		|  FUNCTION_EXP -> ^(BUILT_IN_FUNCTION FUNCTION_EXP)
		|  FUNCTION_FORMAT -> ^(BUILT_IN_FUNCTION FUNCTION_FORMAT)
		|  FUNCTION_HIBOUND -> ^(BUILT_IN_FUNCTION FUNCTION_HIBOUND)
		|  FUNCTION_HIINDEX -> ^(BUILT_IN_FUNCTION FUNCTION_HIINDEX)
		|  FUNCTION_LENGTH -> ^(BUILT_IN_FUNCTION FUNCTION_LENGTH)	
		|  FUNCTION_LOBOUND -> ^(BUILT_IN_FUNCTION FUNCTION_LOBOUND)	
		|  FUNCTION_LOINDEX -> ^(BUILT_IN_FUNCTION FUNCTION_LOINDEX)	
		|  FUNCTION_LOG -> ^(BUILT_IN_FUNCTION FUNCTION_LOG)	
		|  FUNCTION_LOG2 -> ^(BUILT_IN_FUNCTION FUNCTION_LOG2)	
		|  FUNCTION_LOG10	 -> ^(BUILT_IN_FUNCTION FUNCTION_LOG10)	
		|  FUNCTION_NVL	 -> ^(BUILT_IN_FUNCTION FUNCTION_NVL)	
		|  FUNCTION_ODD -> ^(BUILT_IN_FUNCTION FUNCTION_ODD)	
		|  FUNCTION_ROLESOF -> ^(BUILT_IN_FUNCTION FUNCTION_ROLESOF)	
		|  FUNCTION_SIN -> ^(BUILT_IN_FUNCTION FUNCTION_SIN)	
		|  FUNCTION_SIZEOF -> ^(BUILT_IN_FUNCTION FUNCTION_SIZEOF)	
		|  FUNCTION_SQRT -> ^(BUILT_IN_FUNCTION FUNCTION_SQRT)	
		|  FUNCTION_TAN -> ^(BUILT_IN_FUNCTION FUNCTION_TAN)	
		|  FUNCTION_TYPEOF -> ^(BUILT_IN_FUNCTION FUNCTION_TYPEOF)	
		|  FUNCTION_USEDIN -> ^(BUILT_IN_FUNCTION FUNCTION_USEDIN)	
		|  FUNCTION_VALUE -> ^(BUILT_IN_FUNCTION FUNCTION_VALUE)	
		|  FUNCTION_VALUE_IN -> ^(BUILT_IN_FUNCTION FUNCTION_VALUE_IN)	
		|  FUNCTION_VALUE_UNIQUE -> ^(BUILT_IN_FUNCTION FUNCTION_VALUE_UNIQUE)
		;

built_in_procedure
		:  PROCEDURE_INSERT -> ^(BUILT_IN_PROCEDURE PROCEDURE_INSERT)	
		|  PROCEDURE_REMOVE -> ^(BUILT_IN_PROCEDURE PROCEDURE_REMOVE)		
		;

case_action
		:  case_label  (  COMMA  case_label )*  COLON  stmt
		-> ^(CASE_ACTION case_label+ stmt)
		;

case_label
		:  expression
		-> ^(CASE_LABEL expression) 
		;

case_stmt
		:  'case'  selector  'of'  case_action*  (  'otherwise'  COLON  stmt )?  'end_case'  SEMI
		-> ^(CASE_STMT selector case_action* stmt?)
		;

compound_stmt
		:  'begin'  stmt+  'end'  SEMI
		-> ^(COMPOUND_STMT stmt+)
		;

constant_body
		:  constant_id  COLON  base_type  COLEQ  expression  SEMI
		-> ^(CONSTANT_BODY constant_id base_type expression)
		;

constant_decl
		:  'constant'  constant_body+  'end_constant'  SEMI
		-> ^(CONSTANT_DECL constant_body+)
		;

constant_factor
		:  built_in_constant -> ^(CONSTANT_FACTOR built_in_constant)
		|  constant_ref -> ^(CONSTANT_FACTOR constant_ref)
		;

constant_id
		:  { isFirst }?=> id=IDENT { log.debug($id.text);addId($id.text,CONSTANT_IDENT); }
		|  {nextIs(CONSTANT_IDENT)}? IDENT -> ^(CONSTANT_ID IDENT)
		/*
		|  nid=IDENT { log.debug($nid.type);} {$nid.type == CONSTANT_IDENT}?=> -> ^(CONSTANT_ID IDENT[$nid])
		*/
		;

declaration
		:  entity_decl -> ^(DECLARATION entity_decl)
		|  subtype_constraint_decl -> ^(DECLARATION subtype_constraint_decl)
		|  function_decl -> ^(DECLARATION function_decl) 
		|  procedure_decl -> ^(DECLARATION procedure_decl)
		|  type_decl -> ^(DECLARATION type_decl)
		;

domain_rule
options {k=2;}
		: { isFirst && input.LA(2) != COLON }?=> {bnice = true;} logical_expression {bnice = false;}/* to avoid confusion with qualifiable_factor at first pass */
		|  ( label  COLON )? {bnice = true;}  logical_expression  {bnice = false;}
		-> ^(DOMAIN_RULE label? logical_expression)
		;

element
		:  expression  (  COLON  repetition  )?
		-> ^(ELEMENT expression repetition?)
		;

entity_head
		:  'entity' id=entity_id { newEntityScope(id.eid); } ({!input.LT(2).getText().equals("supertype")}?=> 'abstract' )? subsuper? SEMI?		
		-> ^(ENTITY_HEAD $id 'abstract'? subsuper?)
		;

entity_decl
		:  entity_head entity_body 'end_entity' { upScope(); } SEMI
		-> ^(ENTITY_DECL entity_head entity_body)
		;

entity_body
		:  explicit_attr* derive_clause? inverse_clause? unique_clause? where_clause?
		-> ^(ENTITY_BODY explicit_attr* derive_clause? inverse_clause? unique_clause? where_clause?)
		;

subsuper
		: supertype_constraint? subtype_declaration?
		-> ^(SUBSUPER supertype_constraint? subtype_declaration?)
		;

supertype_constraint
		:  abstract_supertype_declaration 
		-> ^(SUPERTYPE_CONSTRAINT abstract_supertype_declaration)
		|  supertype_rule 
		-> ^(SUPERTYPE_CONSTRAINT supertype_rule)
		;

abstract_supertype_declaration
		:  'abstract' 'supertype' ( subtype_constraint )?
		-> ^(ABSTRACT_SUPERTYPE_DECLARATION subtype_constraint?)
		;

subtype_declaration
		:  { isFirst }?=> 'subtype' 'of' LPAREN id=IDENT { addSuper($id.text); } ( COMMA id2=IDENT { addSuper($id2.text); } )* RPAREN SEMI?
		|  'subtype' 'of' LPAREN entity_ref ( COMMA entity_ref )* RPAREN SEMI? 
		-> ^(SUBTYPE_DECLARATION entity_ref+)
		;


subtype_constraint_decl
		: subtype_constraint_head subtype_constraint_body 'end_subtype_constraint' SEMI
		-> ^(SUBTYPE_CONSTRAINT_DECL subtype_constraint_head subtype_constraint_body)
		;

subtype_constraint_head
		: { isFirst }?=> 'subtype_constraint' subtype_constraint_id 'for' IDENT SEMI
		| 'subtype_constraint' subtype_constraint_id 'for' entity_ref SEMI
		-> ^(SUBTYPE_CONSTRAINT_HEAD subtype_constraint_id entity_ref)
		;

subtype_constraint_body 
		: abstract_supertype? total_over? ( supertype_expression SEMI )?
		-> ^(SUBTYPE_CONSTRAINT_BODY abstract_supertype? total_over? supertype_expression?)
		;

subtype_constraint_id
		: { isFirst }?=> id=IDENT { addId($id.text,SUBTYPE_CONSTRAINT_ID); }
		| {nextIs(SUBTYPE_CONSTRAINT_ID)}? id=IDENT 
		-> ^(SUBTYPE_CONSTRAINT_ID IDENT[$id])
		; 

abstract_supertype
		: 'abstract' 'supertype' SEMI
		-> ^(ABSTRACT_SUPERTYPE)
		;

total_over
		: { isFirst }?=> 'total_over' LPAREN IDENT ( COMMA IDENT )* RPAREN SEMI
		| 'total_over' RPAREN entity_ref ( COMMA entity_ref )* RPAREN SEMI 
		-> ^(TOTAL_OVER entity_ref+ )
		;
/*
total_over
		: { isFirst }?=> 'total_over' LPAREN IDENT ( COMMA IDENT )* LPAREN SEMI
		| 'total_over' LPAREN entity_ref ( COMMA entity_ref )* LPAREN SEMI 
		-> ^( entity_ref+ )
		;
*/

explicit_attr
		:  attribute_decl (COMMA attribute_decl)* COLON 'optional'? base_type SEMI
		-> ^(EXPLICIT_ATTR attribute_decl+ 'optional'? base_type)
		;


attribute_decl
		: attribute_id -> ^(ATTRIBUTE_DECL attribute_id)
		| redeclared_attribute -> ^(ATTRIBUTE_DECL redeclared_attribute)
		; 

redeclared_attribute
		:  qualified_attribute ( 'renamed' attribute_id )?
		-> ^(REDECLARED_ATTRIBUTE qualified_attribute attribute_id?)
		;

attribute_id
		:  { isFirst }?=> id=IDENT { addId($id.text,ATTRIBUTE_IDENT); }
		|  {nextIs(ATTRIBUTE_IDENT)}? IDENT 
			-> ^(ATTRIBUTE_ID IDENT)
		|  {nextIs(ENTITY_ATTR_IDENT)}? IDENT 
			-> ^(ATTRIBUTE_ID IDENT)
		|  {nextIs(TYPE_ATTR_IDENT)}? IDENT 
			-> ^(ATTRIBUTE_ID IDENT)
		;

qualified_attribute
		:  'self' group_qualifier attribute_qualifier
		-> ^(QUALIFIED_ATTRIBUTE group_qualifier attribute_qualifier)
		;

derive_clause
		:  'derive' derived_attr+
		-> ^(DERIVE_CLAUSE derived_attr+)
		;

derived_attr
		:  attribute_decl COLON base_type COLEQ expression SEMI
		-> ^(DERIVED_ATTR attribute_decl base_type expression)
		;

inverse_clause
		:  'inverse' inverse_attr+
		-> ^(INVERSE_CLAUSE inverse_attr+)
		;

inverse_attr
		:  { isFirst }?=> attribute_decl COLON ( ( 'set' | 'bag' ) bound_spec? 'of' )? IDENT 'for' IDENT SEMI
		|  attribute_decl COLON ( ( 'set' | 'bag' ) bound_spec? 'of' )? entity_ref 'for' global_ident /* attribute_ref */ SEMI
		-> ^(INVERSE_ATTR attribute_decl 'set'? 'bag'? bound_spec? entity_ref global_ident)
		;

unique_clause
		:  'unique' ( unique_rule SEMI )+
		-> ^(UNIQUE_CLAUSE unique_rule+)
		;

unique_rule
		: { isFirst }?=> ( IDENT ( COLON referenced_attribute )? | qualified_attribute ) ( COMMA referenced_attribute )*
		|  ( label COLON )? referenced_attribute ( COMMA referenced_attribute)*	
		-> ^(UNIQUE_RULE label? referenced_attribute+ )
		;

referenced_attribute
		:  { isFirst }?=> IDENT
		|  attribute_ref -> ^(REFERENCED_ATTRIBUTE attribute_ref)
		|  qualified_attribute -> ^(REFERENCED_ATTRIBUTE qualified_attribute)
		;

entity_constructor
		:  entity_ref LPAREN  (  expression  (  COMMA  expression  )*  )?  RPAREN
		-> ^(ENTITY_CONSTRUCTOR entity_ref expression*)
		;

entity_id returns [String eid]
		: { isFirst }?=> id=IDENT { $eid=$id.text; addId($eid, ENTITY_IDENT); }
		| {nextIs(ENTITY_IDENT)}? id=IDENT { $eid=$id.text;}
		-> ^(ENTITY_ID IDENT[$id])
		;

enumeration_reference
		: { isFirst }?=> IDENT ( DOT IDENT)?
		| (  type_ref  DOT )?  enumeration_ref
		-> ^(ENUMERATION_REFERENCE type_ref? enumeration_ref)
		;

escape_stmt
		:  'escape'  SEMI
		-> ^(ESCAPE_STMT)
		;

expression
		:  simple_expression  (  rel_op_extended  simple_expression  )?
		-> ^(EXPRESSION simple_expression rel_op_extended? simple_expression?)
		;

factor
		:  simple_factor  (  DOUBLESTAR  simple_factor  )?
		-> ^(FACTOR simple_factor simple_factor?)
		;

formal_parameter
		:  parameter_id  (  COMMA  parameter_id  )*  COLON  parameter_type 
		-> ^(FORMAL_PARAMETER parameter_id+ parameter_type)
		;

attribute_qualifier
		: DOT global_ident
		-> ^(ATTRIBUTE_QUALIFIER global_ident)
		; 


function_call
		:  ( built_in_function | function_ref ) actual_parameter_list?
		-> ^(FUNCTION_CALL built_in_function? function_ref? actual_parameter_list?)
		;


function_decl
		:  function_head algorithm_head?  stmt+  'end_function' SEMI { upScope(); }
		-> ^(FUNCTION_DECL function_head algorithm_head? stmt+ )
		;

function_head
		:  'function'  function_id { newScope("function"); } (  LPAREN  formal_parameter  (  SEMI  formal_parameter  )*  RPAREN  )?  COLON  parameter_type  SEMI
		-> ^(FUNCTION_HEAD function_id formal_parameter* parameter_type)
		;

function_id
		: { isFirst }?=> id=IDENT { addId($id.text,FUNCTION_IDENT); }
		| {nextIs(FUNCTION_IDENT)}? id=IDENT 
		-> ^(FUNCTION_ID IDENT[$id])
             ;

generalized_types
		:  aggregate_type -> ^(GENERALIZED_TYPES aggregate_type) 
		|  general_aggregation_types -> ^(GENERALIZED_TYPES general_aggregation_types)
		|  generic_type -> ^(GENERALIZED_TYPES generic_type)
		|  generic_entity_type -> ^(GENERALIZED_TYPES generic_entity_type)
		;

general_aggregation_types
		:  general_array_type -> ^(GENERAL_AGGREGATION_TYPES general_array_type)
		|  general_bag_type -> ^(GENERAL_AGGREGATION_TYPES general_bag_type)
		|  general_list_type -> ^(GENERAL_AGGREGATION_TYPES general_list_type)
		|  general_set_type -> ^(GENERAL_AGGREGATION_TYPES general_set_type)
		;

general_array_type
		:  'array' bound_spec?  'of' 'optional'? 'unique'?  parameter_type
		-> ^(GENERAL_ARRAY_TYPE bound_spec? 'optional'? 'unique'?  parameter_type)
		;

general_bag_type
		:  'bag'  bound_spec?  'of'  parameter_type
		-> ^(GENERAL_BAG_TYPE bound_spec?  parameter_type)
		;

general_list_type
		:  'list'  bound_spec?  'of'  'unique'?  parameter_type
		-> ^(GENERAL_LIST_TYPE bound_spec? 'unique'?  parameter_type)
		;

general_ref
		:  parameter_ref -> ^(GENERAL_REF parameter_ref)
		|  variable_ref -> ^(GENERAL_REF variable_ref)
		;

general_set_type
		:  'set'  bound_spec?  'of'  parameter_type
		-> ^(GENERAL_SET_TYPE  bound_spec?  parameter_type)
		;

generic_type
		:  'generic'  (  COLON  type_label  )?
		-> ^(GENERIC_TYPE type_label?)
		;

generic_entity_type
		: 'generic_entity'
		-> ^(GENERIC_ENTITY_TYPE)
		;

group_qualifier
		:  { isFirst }?=> BACKSLASH IDENT
		|  BACKSLASH  entity_ref
		-> ^(GROUP_QUALIFIER entity_ref)
		;

if_stmt
		:  'if' logical_expression  'then' stmt+  else_clause?  'end_if'  SEMI
		-> ^(IF_STMT logical_expression stmt+ else_clause?)
		;

/* added rule (and node) to break a nondeterminism (stmt) */
else_clause
		:  'else' stmt+
		-> ^(ELSE_CLAUSE stmt+)
		;

increment
		:  numeric_expression 
		-> ^(INCREMENT numeric_expression)
		;

increment_control
		:  variable_id  COLEQ  bound_1  'to'  bound_2  (  'by'  increment  )?
		-> ^(INCREMENT_CONTROL variable_id bound_1 bound_2 increment?)
		;

index
		:  numeric_expression 
		-> ^(INDEX numeric_expression)
		;

index_1
		:  index 
		-> ^(INDEX_1 index)
		;

index_2
		:  index 
		-> ^(INDEX_2 index)
		;

index_qualifier
		:  LBRACK  index_1  (  COLON  index_2  )?  RBRACK
		-> ^(INDEX_QUALIFIER index_1 index_2?)
		;

integer_type
		:  'integer'
		-> ^(INTEGER_TYPE)
		;

interval
		:  LCURLY  interval_low  interval_op  interval_item  interval_op  interval_high  RCURLY
		-> ^(INTERVAL interval_low  interval_op  interval_item  interval_op  interval_high)
		;

interval_high
		:  simple_expression 
		-> ^(INTERVAL_HIGH simple_expression)
		;

interval_item
		:  simple_expression 
		-> ^(INTERVAL_ITEM simple_expression)
		;

interval_low
		:  simple_expression 
		-> ^(INTERVAL_LOW simple_expression)
		;

interval_op
		:  LT -> ^(INTERVAL_OP LT)  
		|  LE -> ^(INTERVAL_OP LE)
		;

label
		:  IDENT
		-> ^(LABEL IDENT)
		;

list_type
		:  'list'  bound_spec?  'of'  'unique'?  base_type
		-> ^(LIST_TYPE bound_spec? 'unique'?  base_type)
		;

/* POD removed binary_literal */
literal
		:  FLOAT -> ^(LITERAL ^(REAL_LITERAL FLOAT)) 
		|  INT -> ^(LITERAL ^(INTEGER_LITERAL INT))
		|  logical_literal -> ^(LITERAL logical_literal) 
		|  STRING -> ^(LITERAL ^(STRING_LITERAL STRING)) 
		;

local_decl
		:  'local'  local_variable+ 'end_local'  SEMI
		-> ^(LOCAL_DECL local_variable+ )
		;

local_variable
		:  variable_id  (  COMMA  variable_id  )*  COLON  parameter_type  (  COLEQ  expression  )?  SEMI
		-> ^(LOCAL_VARIABLE variable_id+ parameter_type expression?)
		;

logical_expression
		:  expression 
		-> ^(LOGICAL_EXPRESSION expression)
		;

logical_literal
		:  'false' -> ^(LOGICAL_LITERAL 'false')
		|  'true' -> ^(LOGICAL_LITERAL 'true')
		|  'unknown' -> ^(LOGICAL_LITERAL 'unknown')
		;

logical_type
		:  'logical'
		-> ^(LOGICAL_TYPE)
		;

multiplication_like_op
		:  STAR -> ^(MULTIPLICATION_LIKE_OP STAR)
		|  DIVSIGN -> ^(MULTIPLICATION_LIKE_OP DIVSIGN)
		|  DIV -> ^(MULTIPLICATION_LIKE_OP DIV)
		|  MOD -> ^(MULTIPLICATION_LIKE_OP MOD)
		|  AND -> ^(MULTIPLICATION_LIKE_OP AND)
		|  DOUBLEBAR -> ^(MULTIPLICATION_LIKE_OP DOUBLEBAR)
		;

named_types  
		: { isFirst }?=> IDENT
		|  entity_ref -> ^(NAMED_TYPES entity_ref)
		|  type_ref -> ^(NAMED_TYPES type_ref)
		;
	     

null_stmt
		:  SEMI -> ^(NULL_STMT)
		;

number_type
		:  'number' -> ^(NUMBER_TYPE)
		;

numeric_expression
		:  simple_expression -> ^(NUMERIC_EXPRESSION simple_expression)
		;

one_of
		:  'oneof'  LPAREN  supertype_expression  (  COMMA  supertype_expression  )*  RPAREN
		-> ^(ONE_OF supertype_expression+)
		;

parameter
		:  expression -> ^(PARAMETER expression)
		;

parameter_id
		: { isFirst }?=> id=IDENT { addId($id.text, PARAMETER_IDENT); }
		| {nextIs(PARAMETER_IDENT)}? id=IDENT -> ^(PARAMETER_ID IDENT[$id])
		| {nextIs(ENTITY_PARAM_IDENT)}? id=IDENT -> ^(PARAMETER_ID IDENT[$id])
		| {nextIs(TYPE_PARAM_IDENT)}? id=IDENT -> ^(PARAMETER_ID IDENT[$id]) 
			;

parameter_type
		:  generalized_types -> ^(PARAMETER_TYPE generalized_types) 
		|  named_types -> ^(PARAMETER_TYPE named_types) 
		|  simple_types -> ^(PARAMETER_TYPE simple_types) 
		;

population
		:  entity_ref -> ^(POPULATION entity_ref) 
		;

precision_spec
		:  numeric_expression -> ^(PRECISION_SPEC numeric_expression)
		;

primary
		:  literal -> ^(PRIMARY literal)
		|  qualifiable_factor qualifier*
		-> ^(PRIMARY qualifiable_factor qualifier*) 
		;

procedure_call_stmt
		: (  built_in_procedure  |  procedure_ref  )  (  actual_parameter_list  )?  SEMI
		-> ^(PROCEDURE_CALL_STMT built_in_procedure? procedure_ref? actual_parameter_list?)
		;

procedure_decl
		:  procedure_head algorithm_head? stmt*  'end_procedure'  SEMI { upScope(); }
		-> ^(PROCEDURE_DECL procedure_head algorithm_head? stmt*)
		;

//.................

procedure_head
		:  'procedure'  procedure_id { newScope("procedure"); } (  LPAREN  'var'?  formal_parameter  (  SEMI  'var'?  formal_parameter  )*  RPAREN  )?  SEMI
		-> ^(PROCEDURE_HEAD procedure_id ('var' formal_parameter)?)
		;

procedure_id
		: { isFirst }?=> id=IDENT { addId($id.text,PROCEDURE_IDENT); }
		| {nextIs(PROCEDURE_IDENT)}?  id=IDENT
		-> ^(PROCEDURE_ID IDENT[$id])
		;

qualifiable_factor
		: { isFirst }?=> IDENT ( actual_parameter_list )?
		| { isFirst }?=> built_in_constant
		| { isFirst }?=> built_in_function {log.debug("built_in_function");} ( actual_parameter_list )?
		|  function_call -> ^(QUALIFIABLE_FACTOR function_call)
		|  attribute_ref -> ^(QUALIFIABLE_FACTOR attribute_ref)
		|  constant_factor -> ^(QUALIFIABLE_FACTOR constant_factor)
		|  population -> ^(QUALIFIABLE_FACTOR population)
		|  general_ref -> ^(QUALIFIABLE_FACTOR general_ref)
		;

qualifier
		:  attribute_qualifier -> ^(QUALIFIER attribute_qualifier)
		|  group_qualifier -> ^(QUALIFIER group_qualifier)
		|  index_qualifier -> ^(QUALIFIER index_qualifier)
		;

query_expression
		:  QUERY LPAREN {newScope("query");} variable_id  LTSTAR  aggregate_source  BAR  logical_expression  RPAREN {upScope();log.debug("end of query");} 
		-> ^(QUERY_EXPRESSION variable_id  aggregate_source logical_expression)
		;

real_type
		:  'real'  (  LPAREN  precision_spec  RPAREN  )?
		-> ^(REAL_TYPE precision_spec?)
		;

reference_clause
		: { isFirst }?=> 'reference' 'from' id=IDENT (  LPAREN  ei=resource_or_rename { ei.ei.setSchema($id.text); addReference(ei.ei); }  
			(  COMMA  ei=resource_or_rename { ei.ei.setSchema($id.text); addReference(ei.ei); }  )*  RPAREN  
		)?  SEMI { if (ei==null) {addAllReferenceExternals($id.text); }}
		|  'reference'  'from' schema_ref  
		(  LPAREN  resource_or_rename  (  COMMA  resource_or_rename  )*  RPAREN  )?  SEMI
		-> ^(REFERENCE_CLAUSE schema_ref resource_or_rename*)
		;

rel_op
		:  LT -> ^(REL_OP LT)
		|  GT -> ^(REL_OP GT) 
		|  LE -> ^(REL_OP LE)
		|  GE -> ^(REL_OP GE)
		|  LTGT -> ^(REL_OP LTGT)
		|  ASSIGN -> ^(REL_OP ASSIGN) 
		|  COLLTGT -> ^(REL_OP COLLTGT)
		|  COLEQCOL -> ^(REL_OP COLEQCOL)
		;

rel_op_extended
		:  rel_op -> ^(REL_OP_EXTENDED rel_op)
		|  'in' -> ^(REL_OP_EXTENDED 'in')
		|  'like'  -> ^(REL_OP_EXTENDED 'like')
		;

rename_id returns [String s]
		:  {nextIs(CONSTANT_IDENT)}? =>  id=IDENT
				-> ^(RENAME_ID ^(CONSTANT_ID IDENT[$id]))
		|  {nextIs(ENTITY_IDENT)}? =>  id=IDENT
				-> ^(RENAME_ID ^(ENTITY_ID IDENT[$id]))
		|  {nextIs(FUNCTION_IDENT)}? =>  id=IDENT
				-> ^(RENAME_ID ^(FUNCTION_ID IDENT[$id]))
		|  {nextIs(PROCEDURE_IDENT)}? =>  id=IDENT
				-> ^(RENAME_ID ^(PROCEDURE_ID IDENT[$id]))
		|  {nextIs(TYPE_IDENT)}? =>  id=IDENT
				-> ^(RENAME_ID ^(TYPE_IDENT IDENT[$id]))
		|  id=IDENT { $s=$id.text; }
		;

repeat_control
		:  increment_control?  while_control?  until_control? 
		-> ^(REPEAT_CONTROL increment_control?  while_control?  until_control? )
		;

repeat_stmt
		:  'repeat' {newScope("repeat"); } repeat_control  SEMI  stmt+  'end_repeat' { upScope(); } SEMI
		-> ^(REPEAT_STMT repeat_control stmt+)
		;

repetition
		:  numeric_expression
		-> ^(REPETITION numeric_expression)
		;

resource_or_rename returns [ExternalId ei]
		: { isFirst }?=> id=IDENT { $ei = new ExternalId($id.text); } ( 'as' s=rename_id { $ei.setRename($s.s); } )?
		|  resource_ref ( 'as' rename_id )?
			-> ^(RESOURCE_OR_RENAME resource_ref rename_id?) 
		|  global_ident (  'as'  rename_id )? 
		/* global_ident because since the id is renamed, the original id is no longer visible, so it can be declared in this schema */
			-> ^(RESOURCE_OR_RENAME global_ident rename_id?)
             ;

resource_ref
		: constant_ref
			-> ^(RESOURCE_REF constant_ref)
		| entity_ref
			-> ^(RESOURCE_REF entity_ref)
		| function_ref
			-> ^(RESOURCE_REF function_ref)
		| procedure_ref
			-> ^(RESOURCE_REF procedure_ref)
		| type_ref
			-> ^(RESOURCE_REF type_ref)
		;

return_stmt
		:  'return'  (  LPAREN  expression  RPAREN  )?  SEMI
			-> ^(RETURN_STMT expression?)
		;

rule_decl
		:  rule_head {newScope("rule");} algorithm_head? stmt*  where_clause  'end_rule' { upScope();log.debug("end of rule"); } SEMI
		-> ^(RULE_DECL rule_head algorithm_head? stmt*  where_clause)
		;

rule_head
		: { isFirst }?=> 'rule' rule_id 'for' LPAREN IDENT ( COMMA IDENT )* RPAREN SEMI
		|  'rule'  rule_id  'for'  LPAREN  entity_ref  (  COMMA  entity_ref  )*  RPAREN  SEMI
			-> ^(RULE_HEAD rule_id entity_ref+) 
		;
		
/*
rule_head
		: { isFirst }?=> 'rule' rule_id 'for' LPAREN IDENT ( COMMA IDENT )* RPAREN SEMI {newScope("rule");}
		|  'rule'  rule_id  'for'  LPAREN  entity_ref  (  COMMA  entity_ref  )*  RPAREN  SEMI
			-> ^(RULE_HEAD rule_id entity_ref+) 
		;
*/

rule_id
		:  IDENT -> ^(RULE_ID IDENT)
		;

schema_id returns [String s]
		:  { isFirst }? id=IDENT { $s=$id.text; addId($s,SCHEMA_IDENT); }
		|  {nextIs(SCHEMA_IDENT)}? IDENT -> ^(SCHEMA_ID IDENT)
		;

schema_body
		: interface_specification* constant_decl? ( declaration | rule_decl )*
			-> ^(SCHEMA_BODY interface_specification* constant_decl? declaration* rule_decl*)
		;

schema_decl
		:  'schema' id=schema_id { log.debug("Schema !"); newSchemaScope(id.s); } schema_version_id?  SEMI schema_body 'end_schema' SEMI { upScope();log.debug("end of schema");}
			-> ^(SCHEMA_DECL $id schema_version_id? schema_body)
		;

schema_version_id
		:  STRING -> ^(SCHEMA_VERSION_ID STRING)
		;

interface_specification
		:  reference_clause -> ^(INTERFACE_SPECIFICATION reference_clause)
		|  use_clause -> ^(INTERFACE_SPECIFICATION use_clause)
		;

use_clause
		: { isFirst }?=> 'use' 'from' id=IDENT 
		( LPAREN ei=named_type_or_rename { ei.ei.setSchema($id.text); addUse(ei.ei); } 
		( COMMA ei=named_type_or_rename { ei.ei.setSchema($id.text); addUse(ei.ei); } 
		)* RPAREN )? SEMI 
		{ if (ei==null) {addAllUseExternals($id.text); }}
		|  'use' 'from' schema_ref ( LPAREN named_type_or_rename ( COMMA named_type_or_rename )* RPAREN )? SEMI
		-> ^(USE_CLAUSE schema_ref named_type_or_rename*)
		;

named_type_or_rename returns [ExternalId ei]
		: { isFirst }?=> id=IDENT { $ei = new ExternalId($id.text); } ( 'as' s=rename_id { $ei.setRename($s.s); } )?
		|  named_types ( 'as' ( entity_id | type_id ) )?
		-> ^(NAMED_TYPE_OR_RENAME named_types entity_id? type_id?)
		;

selector
		:  expression -> ^(SELECTOR expression)
		;

set_type
		:  'set'  bound_spec?  'of'  base_type
		-> ^(SET_TYPE bound_spec? base_type)
		;

simple_expression
		:  term  (  add_like_op  term  )* 
		-> ^(SIMPLE_EXPRESSION term  (  add_like_op  term  )* )
		;
             
simple_factor
		:  aggregate_initializer -> ^(SIMPLE_FACTOR aggregate_initializer)  
		|  interval -> ^(SIMPLE_FACTOR interval)
		|  query_expression -> ^(SIMPLE_FACTOR query_expression)
		|  { isFirst }?=> unary_op ( (LPAREN expression RPAREN) | primary )
		|  { isFirst }?=> LPAREN expression RPAREN
		|  { isFirst }?=> literal
		|  { isFirst }?=> built_in_constant ( qualifier )*
		|  { isFirst }?=> built_in_function ( actual_parameter_list )? ( qualifier )*
		|  { isFirst }?=> IDENT ( LPAREN ( expression ( COMMA expression )* )? RPAREN )? ( DOT IDENT )? ( qualifier )*
		|  { input.LA(2)==LPAREN }?=> entity_constructor -> ^(SIMPLE_FACTOR entity_constructor)
		|  {nextIs(ENUMERATION_IDENT) || nextIs(ENUMERATION_IDENT, 3)}?=> enumeration_reference -> ^(SIMPLE_FACTOR enumeration_reference)
		|  unary_op?  ((LPAREN  expression  RPAREN) | primary)
			-> ^(SIMPLE_FACTOR unary_op? expression? primary ?)
       ;

simple_types
		:  binary_type -> ^(SIMPLE_TYPES binary_type)
		|  boolean_type -> ^(SIMPLE_TYPES boolean_type) 
		|  integer_type -> ^(SIMPLE_TYPES integer_type) 
		|  logical_type -> ^(SIMPLE_TYPES logical_type) 
		|  number_type -> ^(SIMPLE_TYPES number_type)
		|  real_type -> ^(SIMPLE_TYPES real_type)
		|  string_type -> ^(SIMPLE_TYPES string_type)
		;

skip_stmt
		:  'skip'  SEMI -> ^(SKIP_STMT)
		;

stmt
		: { isFirst }?=> IDENT ( qualifier* COLEQ expression | actual_parameter_list? ) SEMI /* mix between assignment_stmt and procedure_call_stmt */
		|  alias_stmt -> ^(STMT alias_stmt)
		|  assignment_stmt -> ^(STMT assignment_stmt)
		|  case_stmt -> ^(STMT case_stmt)
		|  compound_stmt -> ^(STMT compound_stmt)
		|  escape_stmt -> ^(STMT escape_stmt) 
		|  if_stmt -> ^(STMT if_stmt)
		|  null_stmt -> ^(STMT null_stmt)
		|  procedure_call_stmt -> ^(STMT procedure_call_stmt) 
		|  repeat_stmt -> ^(STMT repeat_stmt)
		|  return_stmt -> ^(STMT return_stmt) 
		|  skip_stmt -> ^(STMT skip_stmt)
		;

string_type
		:  'string'  width_spec?
			-> ^(STRING_TYPE width_spec?)
		;

subtype_constraint
		:  'of'  LPAREN  supertype_expression  RPAREN SEMI?
			-> ^(SUBTYPE_CONSTRAINT supertype_expression)
		;

supertype_expression
		:  supertype_factor  (  'andor'  supertype_factor  )*
			-> ^(SUPERTYPE_EXPRESSION supertype_factor+)
		;

supertype_factor
		:  supertype_term  (  'and'  supertype_term  )*
			-> ^(SUPERTYPE_FACTOR supertype_term+)
		;

supertype_rule
		:  'abstract'?  'supertype'  subtype_constraint?
			-> ^(SUPERTYPE_RULE 'abstract'? subtype_constraint?)
		;

supertype_term
		: { isFirst }?=> IDENT
		|  entity_ref -> ^(SUPERTYPE_TERM entity_ref)
		|  one_of -> ^(SUPERTYPE_TERM one_of)  
		|  LPAREN  supertype_expression  RPAREN 
				-> ^(SUPERTYPE_TERM supertype_expression)  
		;

start : syntax;

syntax
@init
{
	if (isFirst)
	{
		rootScope = new Scope(null);
		lastCreatedScope=rootScope;
		currentScope=rootScope;
		schemas = new Hashtable<String, Scope>();
	}
}
		: language_version_id? schema_decl schema_decl*
		-> ^(SYNTAX language_version_id? schema_decl schema_decl*)
		;

language_version_id
		: LCURLY LANG_VERSION RCURLY
			-> ^(LANGUAGE_VERSION_ID)
		;

term
		:  factor  (  multiplication_like_op  factor  )*
			-> ^(TERM factor  (  multiplication_like_op  factor  )*)
		;


type_decl
	     :  'type' id=type_id { newScope("type"); } ASSIGN eids=underlying_type SEMI where_clause? 'end_type' SEMI 
	     { 
	     	upScope();
			if ($eids.eids != null) 
			{
			$eids.eids.setTypeName($id.s);
			currentScope.addEnumerationType($eids.eids);
			}
		}
			-> ^(TYPE_DECL $id $eids where_clause?)
	     ;

underlying_type returns [EnumerationType eids]
		:  eids2=constructed_types {$eids = $eids2.eids;} -> ^(UNDERLYING_TYPE $eids2)
		|  aggregation_types -> ^(UNDERLYING_TYPE aggregation_types)
		|  simple_types -> ^(UNDERLYING_TYPE simple_types)
		| { isFirst }?=> IDENT
		|  type_ref -> ^(UNDERLYING_TYPE type_ref)
		;

constructed_types returns [EnumerationType eids]
		/* syntactic predicate useful with 'extensible' keyword : can be select,or enumeration */
		: { input.LT(1).getText().equals("ENUMERATION")||input.LT(2).getText().equals("ENUMERATION") }?=> eids2=enumeration_type {$eids = $eids2.eids;}
			-> ^(CONSTRUCTED_TYPES $eids2)
		|  select_type -> ^(CONSTRUCTED_TYPES select_type)
		;

enumeration_type returns [EnumerationType eids] /* Express amendment modified rule */	     
@init
{
	boolean ext=false;
}
@after
{
	if ($eids==null) $eids = new EnumerationType();
		$eids.setExtensible(ext);
}
		: ( 'extensible' { ext=true; } )? 'enumeration' (( 'of' eids2=enumeration_items {$eids = $eids2.eids;}) | eids3=enumeration_extension {$eids = $eids3.eids;})?
			-> ^(ENUMERATION_TYPE 'extensible'? enumeration_items? enumeration_extension? )
		;

enumeration_items returns [EnumerationType eids]
@init
{
	if (isFirst) $eids = new EnumerationType();
	else $eids=null;
}
		: LPAREN id=enumeration_id { if (isFirst) $eids.add($id.text); } ( COMMA id=enumeration_id { if (isFirst) $eids.add($id.text); } )* RPAREN
				-> ^(ENUMERATION_ITEMS enumeration_id+ )
		;

enumeration_extension returns [EnumerationType eids]
		: { isFirst }?=> 'based_on' id=IDENT {$eids = new EnumerationType();} ( 'with' eids2=enumeration_items {$eids = $eids2.eids; })? { $eids.setBasedOn($id.text); log.debug("ext!");}
		| 'based_on' type_ref ( 'with' enumeration_items )?
			-> ^(ENUMERATION_EXTENSION type_ref enumeration_items?)
		;

enumeration_id returns [String eid]
		: { isFirst }?=> id=IDENT { $eid=$id.text; }
		| {nextIs(ENUMERATION_IDENT)}?  id=IDENT
			-> ^(ENUMERATION_ID IDENT[$id])
		;

select_type
		:  'extensible'? 'generic_entity'? 'select' ( select_list | select_extension )?
			-> ^(SELECT_TYPE 'extensible'? 'generic_entity'? select_list? select_extension?)
		;

select_list
		:  LPAREN named_types ( COMMA named_types )* RPAREN
			-> ^(SELECT_LIST named_types+)
		;

select_extension
		: { isFirst }?=>  'based_on' IDENT ( 'with' select_list )?
		|  'based_on' type_ref ( 'with' select_list )?
			-> ^(SELECT_EXTENSION type_ref select_list?)
		; 

type_id returns [String s]
		: { isFirst }?=> id=IDENT { addId($id.text,TYPE_IDENT); $s=$id.text; }
		|  {nextIs(TYPE_IDENT)}? id=IDENT 
			-> ^(TYPE_ID IDENT[$id])
		;

type_label
		:  IDENT -> ^(TYPE_LABEL IDENT)
		;

type_label_id
		:  IDENT -> ^(TYPE_LABEL_ID IDENT)
		;

unary_op
		:  PLUS -> ^(UNARY_OP PLUS)
		|  MINUS -> ^(UNARY_OP MINUS)
		|  NOT -> ^(UNARY_OP NOT)
		;

until_control
		:  'until'  logical_expression
		-> ^(UNTIL_CONTROL logical_expression)
		;

/*
variable_id
		: { isFirst }?=> id=IDENT { addId($id.text,VARIABLE_IDENT); }
		|  {log.debug("variable spotted");} {nextIs(VARIABLE_IDENT)}? id=IDENT
			-> ^(VARIABLE_ID IDENT[$id])
		|  {log.debug("variable spotted");} {nextIs(ENTITY_VAR_IDENT)}? id=IDENT
			-> ^(VARIABLE_ID IDENT[$id])
		|  {log.debug("variable spotted");} {nextIs(TYPE_VAR_IDENT)}? id=IDENT
			-> ^(VARIABLE_ID IDENT[$id])
		;
*/
variable_id
		: id=IDENT { if (isFirst) addId($id.text,VARIABLE_IDENT); } -> ^(VARIABLE_ID IDENT[$id])
		|  {log.debug("variable spotted");} {nextIs(VARIABLE_IDENT)}? id=IDENT
			-> ^(VARIABLE_ID IDENT[$id])
		|  {log.debug("variable spotted");} {nextIs(ENTITY_VAR_IDENT)}? id=IDENT
			-> ^(VARIABLE_ID IDENT[$id])
		|  {log.debug("variable spotted");} {nextIs(TYPE_VAR_IDENT)}? id=IDENT
			-> ^(VARIABLE_ID IDENT[$id])
		;

where_clause
		:  'where'  domain_rule  SEMI  (  domain_rule  SEMI )*
			-> ^(WHERE_CLAUSE domain_rule+)
		;

while_control
		:  'while'  logical_expression
			-> ^(WHILE_CONTROL logical_expression)
		;

width
		:  numeric_expression
			-> ^(WIDTH numeric_expression)
		;

width_spec
		:  LPAREN  width  RPAREN  'fixed'?
			-> ^(WIDTH_SPEC width 'fixed'?)
		;

entity_ref
		: {nextIs(ENTITY_IDENT)}? id=IDENT
			-> ^(ENTITY_REF IDENT[$id])
		| {nextIs(ENTITY_ATTR_IDENT)}? id=IDENT
			-> ^(ENTITY_REF IDENT[$id])
		| {nextIs(ENTITY_VAR_IDENT)}? id=IDENT
			-> ^(ENTITY_REF IDENT[$id])
		| {nextIs(ENTITY_PARAM_IDENT)}? id=IDENT
			-> ^(ENTITY_REF IDENT[$id])
		;

type_ref
		: {nextIs(TYPE_IDENT)}? id=IDENT
			-> ^(TYPE_REF IDENT[$id])
		| {nextIs(TYPE_ATTR_IDENT)}? id=IDENT
			-> ^(TYPE_REF IDENT[$id])
		| {nextIs(TYPE_VAR_IDENT)}? id=IDENT
			-> ^(TYPE_REF IDENT[$id])
		| {nextIs(TYPE_PARAM_IDENT)}? id=IDENT
			-> ^(TYPE_REF IDENT[$id])
		;

enumeration_ref
		: {nextIs(ENUMERATION_IDENT)}?id=IDENT
			-> ^(ENUMERATION_REF IDENT[$id])
		;

attribute_ref
		: {nextIs(ATTRIBUTE_IDENT)}?id=IDENT
			-> ^(ATTRIBUTE_REF IDENT[$id])
		| {nextIs(ENTITY_ATTR_IDENT)}?id=IDENT
			-> ^(ATTRIBUTE_REF IDENT[$id])
		| {nextIs(TYPE_ATTR_IDENT)}?id=IDENT
			-> ^(ATTRIBUTE_REF IDENT[$id])
         ;

constant_ref
		: {nextIs(CONSTANT_IDENT)}?id=IDENT
			-> ^(CONSTANT_REF IDENT[$id])
		;

function_ref
		: {nextIs(FUNCTION_IDENT)}?id=IDENT
			-> ^(FUNCTION_REF IDENT[$id])
		;

parameter_ref
		: {nextIs(PARAMETER_IDENT)}?id=IDENT
			-> ^(PARAMETER_REF IDENT[$id])
		| {nextIs(ENTITY_PARAM_IDENT)}?id=IDENT
			-> ^(PARAMETER_REF IDENT[$id])
		| {nextIs(TYPE_PARAM_IDENT)}?id=IDENT
			-> ^(PARAMETER_REF IDENT[$id])
		;

/*
variable_ref
		: {nextIs(VARIABLE_IDENT)}?id=IDENT
			-> ^(VARIABLE_REF IDENT[$id])
		| {nextIs(ENTITY_VAR_IDENT)}?id=IDENT
		-> ^(VARIABLE_REF IDENT[$id])
		| {nextIs(TYPE_VAR_IDENT)}?id=IDENT
			-> ^(VARIABLE_REF IDENT[$id])
		;
*/

variable_ref
		: id=IDENT -> ^(VARIABLE_REF IDENT[$id])
		|{nextIs(VARIABLE_IDENT)}?id=IDENT
			-> ^(VARIABLE_REF IDENT[$id])
		| {nextIs(ENTITY_VAR_IDENT)}?id=IDENT
			-> ^(VARIABLE_REF IDENT[$id])
		| {nextIs(TYPE_VAR_IDENT)}?id=IDENT
			-> ^(VARIABLE_REF IDENT[$id])
		;

schema_ref
		: {nextIs(SCHEMA_IDENT)}?id=IDENT
			-> ^(SCHEMA_REF IDENT[$id])
		;

simple_id
		: IDENT -> ^(SIMPLE_ID IDENT)
		;

type_label_ref
		: IDENT -> ^(TYPE_LABEL_REF IDENT)
		;

procedure_ref
		: {nextIs(PROCEDURE_IDENT)}?id=IDENT
			-> ^(PROCEDURE_REF IDENT[$id])
		;

/**** special rule ****/

global_ident
		:  {nextIs(CONSTANT_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(ENTITY_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(FUNCTION_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(PROCEDURE_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(PARAMETER_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(SCHEMA_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(TYPE_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(VARIABLE_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(ENUMERATION_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(ATTRIBUTE_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(ENTITY_ATTR_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(TYPE_ATTR_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(ENTITY_VAR_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(TYPE_VAR_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(ENTITY_PARAM_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  {nextIs(TYPE_PARAM_IDENT)}?id=IDENT -> ^(ATTRIBUTE_REF IDENT[$id])
		|  IDENT -> ^(ATTRIBUTE_REF IDENT)
		;

/* By using the token IDENT in the parser's rules, I mean "whatever the id
type, I just want an identifier" and not "I want an identifier that doesn't
exist". Since the lexer runs an id research algorithm each time an identifier
is encountered in the second pass, it returns IDENT only if no id is found
during the search, so I had to add this pseudo-token to get the right
behavior 

NOTE: global_ident is only used to replace attribute_ref in some places, so
a ATTRIBUTE_REF node is created here
*/

QUERY
: 'query';

COMMENT 
@init{paraphrase.push("a comment");}
@after{paraphrase.pop();}
	:	'(*'
		(	/*	'\r' '\n' can be matched in one alternative or by matching
				'\r' in one iteration and '\n' in another.  I am trying to
				handle any flavor of newline that comes in, but the language
				that allows both "\r\n" and "\r" and "\n" to all be valid
				newline is ambiguous.  Consequently, the resulting grammar
				must be ambiguous.  I'm shutting this warning off.
			 */
			options { greedy=false;}
		:
			{ input.LA(2)!='(' }?=> '*'
		|	('\r'? '\n') => '\r'? '\n'
		|	'\r'
		|	~('*'|'\n'|'\r'))* '*)'
	 	{ if (parser.isFirst) $channel=HIDDEN; }       ;

LINECOMMENT
@init{paraphrase.push("a EXPRESS one line comment");}
@after{paraphrase.pop();}
	:
	'--' (
		: 	~('\n'|'\r') )*
		{ if (parser.isFirst) $channel=HIDDEN; }
	;

LANG_VERSION
@init{paraphrase.push("language version id");}
@after{paraphrase.pop();}
	:
	'iso standard 10303 part (11) version (4)'
	;

SEMI
@init{paraphrase.push(";");}
@after{paraphrase.pop();}
	:	';'
	;

QUESTION
@init{paraphrase.push("?");}
@after{paraphrase.pop();}
	:	'?'
	;

LPAREN
@init{paraphrase.push("(");}
@after{paraphrase.pop();}
	:	'('
	;

RPAREN
@init{paraphrase.push(")");}
@after{paraphrase.pop();}
	:	')'
	;

LBRACK
@init{paraphrase.push("[");}
@after{paraphrase.pop();}
	:	'['
	;

RBRACK
@init{paraphrase.push("]");}
@after{paraphrase.pop();}
	:	']'
	;

LCURLY
@init{paraphrase.push("{");}
@after{paraphrase.pop();}
	:	'{'
	;

RCURLY
@init{paraphrase.push("}");}
@after{paraphrase.pop();}
	:	'}'
	;

BACKSLASH
@init{paraphrase.push("\\");}
@after{paraphrase.pop();}
	:	'\\'
	;

BAR
@init{paraphrase.push("|");}
@after{paraphrase.pop();}

	:	'|'
	;

AMPERSAND
@init{paraphrase.push("&");}
@after{paraphrase.pop();}
	:	'&'
	;

COLON
@init{paraphrase.push(":");}
@after{paraphrase.pop();}
	:	':'
	;

COLEQ
@init{paraphrase.push(":=");}
@after{paraphrase.pop();}
	:	':'
		'='
	;

COLEQCOL
@init{paraphrase.push(":=:");}
@after{paraphrase.pop();}
	:	':'
		'='
		':'
	;

COLLTGT
@init{paraphrase.push(":<>:");}
@after{paraphrase.pop();}
	:	':'
		'<'
		'>'
		':'
	;

COMMA
@init{paraphrase.push(",");}
@after{paraphrase.pop();}
	:	','
	;

DOT
@init{paraphrase.push(".");}
@after{paraphrase.pop();}
	:	'.'
	;

ASSIGN
@init{paraphrase.push("=");}
@after{paraphrase.pop();}
	:	'='
	;

LT
@init{paraphrase.push("<");}
@after{paraphrase.pop();}
	:	'<'
	;

GT
@init{paraphrase.push(">");}
@after{paraphrase.pop();}
	:	'>'
	;

LE
@init{paraphrase.push("<=");}
@after{paraphrase.pop();}
	:	'<' '='
	;

GE
@init{paraphrase.push(">=");}
@after{paraphrase.pop();}
	:	'>' '='
	;

DIVSIGN
@init{paraphrase.push("/");}
@after{paraphrase.pop();}
	:	'/'
	;

PLUS
@init{paraphrase.push("+");}
@after{paraphrase.pop();}
	:	'+'
	;

MINUS
@init{paraphrase.push("-");}
@after{paraphrase.pop();}
	:	'-'
	;

STAR
@init{paraphrase.push("*");}
@after{paraphrase.pop();}
	:	'*'
	;

AT
@init{paraphrase.push("@");}
@after{paraphrase.pop();}
	:	'@'
	;

WS	
@init{paraphrase.push("WS");}
@after{paraphrase.pop();}
	:	(		' '
			|	'\f'
			|	'\t'
			|	('\r'? '\n')=> '\r'? '\n'
  		| '\r'
  	)
		{ $channel=HIDDEN; }
	;

LTSTAR
@init{paraphrase.push("<*");}
@after{paraphrase.pop();}
        : '<' 
          '*'
        ;

LTGT
@init{paraphrase.push("<>");}
@after{paraphrase.pop();}
        : '<' 
          '>'
        ;

DOUBLESTAR
@init{paraphrase.push("**");}
@after{paraphrase.pop();}
        : '*' 
          '*'
        ;

DOUBLEBAR
@init{paraphrase.push("||");}
@after{paraphrase.pop();}
        : '|' 
          '|'
        ;

STRING
@init{paraphrase.push("String");}
@after{paraphrase.pop();}
	:
	'\'' 
	(~'\'')* 
	'\''
	;

fragment
DIGIT
@init{paraphrase.push("digit");}
@after{paraphrase.pop();}

	:	'0'..'9'
	;

INT	
@init{paraphrase.push("int");}
@after{paraphrase.pop();}
	:    (DIGIT)+                  
	;

FLOAT
@init{paraphrase.push("float");}
@after{paraphrase.pop();}
	:    INT '.' (DIGIT)* (('e' | 'E') ('+' | '-')? (INT)+)?
     	;

IDENT
@init{paraphrase.push("ident");}
@after{paraphrase.pop();}
	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*
	;


// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 OWLSchema.g 2022-05-29 16:40:26

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

import org.semanticweb.owlapi.apibinding.*;
	import org.semanticweb.owlapi.model.*;
	import org.semanticweb.owlapi.util.*;	
	
	import java.net.*;
	import java.util.Iterator;
	import java.util.HashSet;
	import java.util.Set;
	import java.util.Hashtable;
	import java.util.Vector;
	import java.util.Collections;
	import java.io.File;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OWLSchema extends TreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CONSTANT_IDENT", "ENTITY_IDENT", "FUNCTION_IDENT", "PROCEDURE_IDENT", "PARAMETER_IDENT", "SCHEMA_IDENT", "TYPE_IDENT", "VARIABLE_IDENT", "ENUMERATION_IDENT", "ATTRIBUTE_IDENT", "ENTITY_ATTR_IDENT", "TYPE_ATTR_IDENT", "ENTITY_VAR_IDENT", "TYPE_VAR_IDENT", "ENTITY_PARAM_IDENT", "TYPE_PARAM_IDENT", "SUBTYPE_CONSTRAINT_ID", "ACTUAL_PARAMETER_LIST", "ADD_LIKE_OP", "AGGREGATE_INITIALIZER", "AGGREGATE_SOURCE", "AGGREGATE_TYPE", "AGGREGATION_TYPES", "ALGORITHM_HEAD", "ALIAS_STMT", "ARRAY_TYPE", "ASSIGNMENT_STMT", "BAG_TYPE", "BASE_TYPE", "BINARY_TYPE", "BOOLEAN_TYPE", "BOUND_1", "BOUND_2", "BOUND_SPEC", "BUILT_IN_CONSTANT", "BUILT_IN_FUNCTION", "BUILT_IN_PROCEDURE", "CASE_ACTION", "CASE_LABEL", "CASE_STMT", "COMPOUND_STMT", "CONSTANT_BODY", "CONSTANT_DECL", "CONSTANT_FACTOR", "CONSTANT_ID", "DECLARATION", "DOMAIN_RULE", "ELEMENT", "ENTITY_HEAD", "ENTITY_DECL", "ENTITY_BODY", "SUBSUPER", "SUPERTYPE_CONSTRAINT", "ABSTRACT_SUPERTYPE_DECLARATION", "SUBTYPE_DECLARATION", "EXPLICIT_ATTR", "ATTRIBUTE_DECL", "ATTRIBUTE_ID", "QUALIFIED_ATTRIBUTE", "DERIVE_CLAUSE", "DERIVED_ATTR", "INVERSE_CLAUSE", "INVERSE_ATTR", "UNIQUE_CLAUSE", "UNIQUE_RULE", "REFERENCED_ATTRIBUTE", "ENTITY_CONSTRUCTOR", "ENTITY_ID", "ENUMERATION_REFERENCE", "ESCAPE_STMT", "EXPRESSION", "FACTOR", "FORMAL_PARAMETER", "ATTRIBUTE_QUALIFIER", "FUNCTION_CALL", "FUNCTION_DECL", "FUNCTION_HEAD", "FUNCTION_ID", "GENERALIZED_TYPES", "GENERAL_AGGREGATION_TYPES", "GENERAL_ARRAY_TYPE", "GENERAL_BAG_TYPE", "GENERAL_LIST_TYPE", "GENERAL_REF", "GENERAL_SET_TYPE", "GENERIC_TYPE", "GROUP_QUALIFIER", "IF_STMT", "INCREMENT", "INCREMENT_CONTROL", "INDEX", "INDEX_1", "INDEX_2", "INDEX_QUALIFIER", "INTEGER_TYPE", "INTERVAL", "INTERVAL_HIGH", "INTERVAL_ITEM", "INTERVAL_LOW", "INTERVAL_OP", "LABEL", "LIST_TYPE", "LITERAL", "REAL_LITERAL", "INTEGER_LITERAL", "STRING_LITERAL", "LOCAL_DECL", "LOCAL_VARIABLE", "LOGICAL_EXPRESSION", "LOGICAL_LITERAL", "LOGICAL_TYPE", "MULTIPLICATION_LIKE_OP", "NAMED_TYPES", "NULL_STMT", "NUMBER_TYPE", "NUMERIC_EXPRESSION", "ONE_OF", "PARAMETER", "PARAMETER_ID", "PARAMETER_TYPE", "POPULATION", "PRECISION_SPEC", "PRIMARY", "PROCEDURE_CALL_STMT", "PROCEDURE_DECL", "PROCEDURE_HEAD", "PROCEDURE_ID", "QUALIFIABLE_FACTOR", "QUALIFIER", "QUERY_EXPRESSION", "REAL_TYPE", "REFERENCE_CLAUSE", "REL_OP", "REL_OP_EXTENDED", "REPEAT_CONTROL", "REPEAT_STMT", "REPETITION", "RESOURCE_OR_RENAME", "RESOURCE_REF", "RETURN_STMT", "RULE_DECL", "RULE_HEAD", "RULE_ID", "SCHEMA_ID", "SCHEMA_BODY", "SCHEMA_DECL", "INTERFACE_SPECIFICATION", "USE_CLAUSE", "NAMED_TYPE_OR_RENAME", "SELECTOR", "SET_TYPE", "SIMPLE_EXPRESSION", "SIMPLE_FACTOR", "SIMPLE_TYPES", "SKIP_STMT", "STMT", "STRING_TYPE", "SUBTYPE_CONSTRAINT", "SUPERTYPE_EXPRESSION", "SUPERTYPE_FACTOR", "SUPERTYPE_RULE", "SUPERTYPE_TERM", "SYNTAX", "TERM", "TYPE_DECL", "UNDERLYING_TYPE", "CONSTRUCTED_TYPES", "ENUMERATION_TYPE", "ENUMERATION_ID", "SELECT_TYPE", "TYPE_ID", "TYPE_LABEL", "TYPE_LABEL_ID", "UNARY_OP", "UNTIL_CONTROL", "VARIABLE_ID", "WHERE_CLAUSE", "WHILE_CONTROL", "WIDTH", "WIDTH_SPEC", "ENTITY_REF", "TYPE_REF", "ENUMERATION_REF", "ATTRIBUTE_REF", "CONSTANT_REF", "FUNCTION_REF", "PARAMETER_REF", "VARIABLE_REF", "SCHEMA_REF", "TYPE_LABEL_REF", "PROCEDURE_REF", "SIMPLE_ID", "ELSE_CLAUSE", "RENAME_ID", "ENUMERATION_ITEMS", "ENUMERATION_EXTENSION", "SELECT_LIST", "SELECT_EXTENSION", "REDECLARED_ATTRIBUTE", "SUBTYPE_CONSTRAINT_DECL", "SUBTYPE_CONSTRAINT_HEAD", "SUBTYPE_CONSTRAINT_BODY", "ABSTRACT_SUPERTYPE", "TOTAL_OVER", "CONCRETE_TYPES", "GENERIC_ENTITY_TYPE", "SCHEMA_VERSION_ID", "LANGUAGE_VERSION_ID", "CONST_E", "CONST_PI", "CONST_SELF", "FUNCTION_ABS", "FUNCTION_ACOS", "FUNCTION_ASIN", "FUNCTION_ATAN", "FUNCTION_BLENGTH", "FUNCTION_COS", "FUNCTION_EXISTS", "FUNCTION_EXP", "FUNCTION_FORMAT", "FUNCTION_HIBOUND", "FUNCTION_HIINDEX", "FUNCTION_LENGTH", "FUNCTION_LOBOUND", "FUNCTION_LOINDEX", "FUNCTION_LOG", "FUNCTION_LOG2", "FUNCTION_LOG10", "FUNCTION_NVL", "FUNCTION_ODD", "FUNCTION_ROLESOF", "FUNCTION_SIN", "FUNCTION_SQRT", "FUNCTION_TAN", "FUNCTION_TYPEOF", "FUNCTION_USEDIN", "FUNCTION_VALUE", "FUNCTION_VALUE_IN", "FUNCTION_VALUE_UNIQUE", "FUNCTION_SIZEOF", "PROCEDURE_INSERT", "PROCEDURE_REMOVE", "NOT", "OR", "XOR", "DIV", "MOD", "AND", "LPAREN", "COMMA", "RPAREN", "PLUS", "MINUS", "LBRACK", "RBRACK", "COLON", "IDENT", "SEMI", "COLEQ", "QUESTION", "STAR", "DOT", "DOUBLESTAR", "BACKSLASH", "LCURLY", "RCURLY", "LT", "LE", "FLOAT", "INT", "STRING", "DIVSIGN", "DOUBLEBAR", "QUERY", "LTSTAR", "BAR", "GT", "GE", "LTGT", "ASSIGN", "COLLTGT", "COLEQCOL", "LANG_VERSION", "COMMENT", "LINECOMMENT", "AMPERSAND", "AT", "WS", "DIGIT", "'aggregate'", "'of'", "'alias'", "'for'", "'end_alias'", "'array'", "'optional'", "'unique'", "'bag'", "'binary'", "'boolean'", "'case'", "'otherwise'", "'end_case'", "'begin'", "'end'", "'constant'", "'end_constant'", "'entity'", "'abstract'", "'end_entity'", "'supertype'", "'subtype'", "'end_subtype_constraint'", "'subtype_constraint'", "'total_over'", "'renamed'", "'derive'", "'inverse'", "'set'", "'escape'", "'end_function'", "'function'", "'list'", "'generic'", "'generic_entity'", "'if'", "'then'", "'end_if'", "'else'", "'to'", "'by'", "'integer'", "'local'", "'end_local'", "'false'", "'true'", "'unknown'", "'logical'", "'number'", "'oneof'", "'end_procedure'", "'procedure'", "'var'", "'real'", "'reference'", "'from'", "'in'", "'like'", "'repeat'", "'end_repeat'", "'as'", "'return'", "'end_rule'", "'rule'", "'schema'", "'end_schema'", "'use'", "'skip'", "'string'", "'andor'", "'type'", "'end_type'", "'extensible'", "'enumeration'", "'based_on'", "'with'", "'select'", "'until'", "'where'", "'while'", "'fixed'", "''"
    };
    public static final int SUPERTYPE_RULE=164;
    public static final int FUNCTION_HEAD=80;
    public static final int SIMPLE_FACTOR=156;
    public static final int FUNCTION_VALUE_IN=241;
    public static final int DERIVED_ATTR=64;
    public static final int RETURN_STMT=143;
    public static final int WHILE_CONTROL=181;
    public static final int INTEGER_LITERAL=108;
    public static final int FUNCTION_IDENT=6;
    public static final int CONSTRUCTED_TYPES=170;
    public static final int ENTITY_BODY=54;
    public static final int MINUS=256;
    public static final int FUNCTION_REF=189;
    public static final int BACKSLASH=267;
    public static final int CASE_LABEL=42;
    public static final int ENTITY_CONSTRUCTOR=70;
    public static final int INTERVAL_LOW=102;
    public static final int TYPE_IDENT=10;
    public static final int ENUMERATION_REFERENCE=72;
    public static final int REAL_TYPE=134;
    public static final int T__375=375;
    public static final int T__374=374;
    public static final int T__371=371;
    public static final int RULE_ID=146;
    public static final int T__370=370;
    public static final int T__373=373;
    public static final int T__372=372;
    public static final int LPAREN=252;
    public static final int ENTITY_IDENT=5;
    public static final int DECLARATION=49;
    public static final int AT=290;
    public static final int LBRACK=257;
    public static final int QUERY=277;
    public static final int TYPE_VAR_IDENT=17;
    public static final int REPEAT_CONTROL=138;
    public static final int SUBTYPE_CONSTRAINT_HEAD=204;
    public static final int ATTRIBUTE_ID=61;
    public static final int XOR=248;
    public static final int T__368=368;
    public static final int ATTRIBUTE_IDENT=13;
    public static final int SKIP_STMT=158;
    public static final int T__367=367;
    public static final int BAG_TYPE=31;
    public static final int T__369=369;
    public static final int LOGICAL_EXPRESSION=112;
    public static final int VARIABLE_ID=179;
    public static final int FUNCTION_HIINDEX=225;
    public static final int LANGUAGE_VERSION_ID=211;
    public static final int MULTIPLICATION_LIKE_OP=115;
    public static final int TYPE_DECL=168;
    public static final int FUNCTION_ATAN=218;
    public static final int SUBTYPE_CONSTRAINT=161;
    public static final int TERM=167;
    public static final int FUNCTION_LOBOUND=227;
    public static final int FUNCTION_SIN=235;
    public static final int CONSTANT_BODY=45;
    public static final int SUPERTYPE_FACTOR=163;
    public static final int ELSE_CLAUSE=196;
    public static final int GENERIC_ENTITY_TYPE=209;
    public static final int SCHEMA_BODY=148;
    public static final int ENTITY_PARAM_IDENT=18;
    public static final int ATTRIBUTE_DECL=60;
    public static final int LTGT=282;
    public static final int CONCRETE_TYPES=208;
    public static final int ESCAPE_STMT=73;
    public static final int INTERVAL=99;
    public static final int RULE_HEAD=145;
    public static final int NUMBER_TYPE=118;
    public static final int PROCEDURE_HEAD=129;
    public static final int PROCEDURE_INSERT=244;
    public static final int FACTOR=75;
    public static final int REFERENCE_CLAUSE=135;
    public static final int SELECT_EXTENSION=201;
    public static final int EXPLICIT_ATTR=59;
    public static final int FUNCTION_ACOS=216;
    public static final int FUNCTION_BLENGTH=219;
    public static final int INTERVAL_OP=103;
    public static final int FUNCTION_LOG2=230;
    public static final int DIV=249;
    public static final int GENERAL_ARRAY_TYPE=84;
    public static final int SELECT_TYPE=173;
    public static final int GENERALIZED_TYPES=82;
    public static final int SELECTOR=153;
    public static final int STAR=264;
    public static final int STRING=274;
    public static final int BASE_TYPE=32;
    public static final int T__342=342;
    public static final int SCHEMA_ID=147;
    public static final int T__341=341;
    public static final int T__344=344;
    public static final int T__343=343;
    public static final int T__340=340;
    public static final int DOUBLEBAR=276;
    public static final int REDECLARED_ATTRIBUTE=202;
    public static final int FUNCTION_EXP=222;
    public static final int ENTITY_REF=184;
    public static final int PROCEDURE_IDENT=7;
    public static final int UNARY_OP=177;
    public static final int SCHEMA_REF=192;
    public static final int T__339=339;
    public static final int CONST_SELF=214;
    public static final int T__338=338;
    public static final int LABEL=104;
    public static final int SIMPLE_TYPES=157;
    public static final int INDEX=94;
    public static final int T__335=335;
    public static final int T__334=334;
    public static final int T__337=337;
    public static final int BOUND_SPEC=37;
    public static final int T__336=336;
    public static final int T__331=331;
    public static final int T__330=330;
    public static final int T__333=333;
    public static final int REPEAT_STMT=139;
    public static final int T__332=332;
    public static final int WIDTH_SPEC=183;
    public static final int GENERAL_LIST_TYPE=86;
    public static final int ALGORITHM_HEAD=27;
    public static final int CASE_STMT=43;
    public static final int FUNCTION_ID=81;
    public static final int AGGREGATE_INITIALIZER=23;
    public static final int ABSTRACT_SUPERTYPE=206;
    public static final int CASE_ACTION=41;
    public static final int SUPERTYPE_TERM=165;
    public static final int NOT=246;
    public static final int RBRACK=258;
    public static final int ABSTRACT_SUPERTYPE_DECLARATION=57;
    public static final int GENERAL_REF=87;
    public static final int ADD_LIKE_OP=22;
    public static final int COLLTGT=284;
    public static final int RENAME_ID=197;
    public static final int T__328=328;
    public static final int STRING_TYPE=160;
    public static final int T__327=327;
    public static final int ENTITY_VAR_IDENT=16;
    public static final int REL_OP=136;
    public static final int T__329=329;
    public static final int CONST_PI=213;
    public static final int T__324=324;
    public static final int T__323=323;
    public static final int T__326=326;
    public static final int T__325=325;
    public static final int T__364=364;
    public static final int DOUBLESTAR=266;
    public static final int T__363=363;
    public static final int T__366=366;
    public static final int T__365=365;
    public static final int T__360=360;
    public static final int SUBTYPE_CONSTRAINT_DECL=203;
    public static final int T__362=362;
    public static final int T__361=361;
    public static final int SUPERTYPE_CONSTRAINT=56;
    public static final int ENTITY_HEAD=52;
    public static final int WHERE_CLAUSE=180;
    public static final int QUESTION=263;
    public static final int FUNCTION_SQRT=236;
    public static final int ACTUAL_PARAMETER_LIST=21;
    public static final int BUILT_IN_PROCEDURE=40;
    public static final int CONSTANT_IDENT=4;
    public static final int PROCEDURE_REF=194;
    public static final int REFERENCED_ATTRIBUTE=69;
    public static final int AGGREGATION_TYPES=26;
    public static final int T__357=357;
    public static final int FUNCTION_SIZEOF=243;
    public static final int WS=291;
    public static final int EOF=-1;
    public static final int T__356=356;
    public static final int T__359=359;
    public static final int LIST_TYPE=105;
    public static final int GE=281;
    public static final int T__358=358;
    public static final int T__353=353;
    public static final int T__352=352;
    public static final int T__355=355;
    public static final int T__354=354;
    public static final int MOD=250;
    public static final int T__351=351;
    public static final int T__350=350;
    public static final int INCREMENT_CONTROL=93;
    public static final int COLON=259;
    public static final int SELECT_LIST=200;
    public static final int BOOLEAN_TYPE=34;
    public static final int GT=280;
    public static final int DIGIT=292;
    public static final int FUNCTION_ABS=215;
    public static final int SUBSUPER=55;
    public static final int T__349=349;
    public static final int GENERIC_TYPE=89;
    public static final int REL_OP_EXTENDED=137;
    public static final int T__346=346;
    public static final int T__345=345;
    public static final int T__348=348;
    public static final int T__347=347;
    public static final int UNDERLYING_TYPE=169;
    public static final int POPULATION=124;
    public static final int FUNCTION_NVL=232;
    public static final int T__300=300;
    public static final int ENTITY_ID=71;
    public static final int FUNCTION_TAN=237;
    public static final int INTEGER_TYPE=98;
    public static final int UNIQUE_CLAUSE=67;
    public static final int UNIQUE_RULE=68;
    public static final int PROCEDURE_CALL_STMT=127;
    public static final int AGGREGATE_TYPE=25;
    public static final int USE_CLAUSE=151;
    public static final int ENUMERATION_ITEMS=198;
    public static final int GROUP_QUALIFIER=90;
    public static final int PROCEDURE_REMOVE=245;
    public static final int FUNCTION_FORMAT=223;
    public static final int FUNCTION_USEDIN=239;
    public static final int LINECOMMENT=288;
    public static final int VARIABLE_IDENT=11;
    public static final int NAMED_TYPES=116;
    public static final int FUNCTION_COS=220;
    public static final int LANG_VERSION=286;
    public static final int PRECISION_SPEC=125;
    public static final int PARAMETER=121;
    public static final int PARAMETER_ID=122;
    public static final int AMPERSAND=289;
    public static final int LITERAL=106;
    public static final int DERIVE_CLAUSE=63;
    public static final int DOT=265;
    public static final int FUNCTION_LOINDEX=228;
    public static final int INTERVAL_ITEM=101;
    public static final int ENUMERATION_IDENT=12;
    public static final int CONSTANT_FACTOR=47;
    public static final int BUILT_IN_FUNCTION=39;
    public static final int RULE_DECL=144;
    public static final int DIVSIGN=275;
    public static final int PARAMETER_IDENT=8;
    public static final int TYPE_LABEL=175;
    public static final int RESOURCE_OR_RENAME=141;
    public static final int ATTRIBUTE_QUALIFIER=77;
    public static final int QUALIFIER=132;
    public static final int UNTIL_CONTROL=178;
    public static final int PROCEDURE_DECL=128;
    public static final int FUNCTION_ASIN=217;
    public static final int T__320=320;
    public static final int T__322=322;
    public static final int ATTRIBUTE_REF=187;
    public static final int FUNCTION_VALUE_UNIQUE=242;
    public static final int T__321=321;
    public static final int LOCAL_DECL=110;
    public static final int SUBTYPE_CONSTRAINT_ID=20;
    public static final int BUILT_IN_CONSTANT=38;
    public static final int FUNCTION_EXISTS=221;
    public static final int SEMI=261;
    public static final int COLEQCOL=285;
    public static final int ONE_OF=120;
    public static final int WIDTH=182;
    public static final int ASSIGN=283;
    public static final int FUNCTION_TYPEOF=238;
    public static final int ASSIGNMENT_STMT=30;
    public static final int SYNTAX=166;
    public static final int COMMENT=287;
    public static final int SCHEMA_IDENT=9;
    public static final int FUNCTION_DECL=79;
    public static final int REAL_LITERAL=107;
    public static final int INDEX_QUALIFIER=97;
    public static final int BINARY_TYPE=33;
    public static final int T__317=317;
    public static final int T__316=316;
    public static final int T__319=319;
    public static final int ENUMERATION_REF=186;
    public static final int T__318=318;
    public static final int T__313=313;
    public static final int SCHEMA_DECL=149;
    public static final int T__312=312;
    public static final int T__315=315;
    public static final int RCURLY=269;
    public static final int T__314=314;
    public static final int COMMA=253;
    public static final int SUBTYPE_DECLARATION=58;
    public static final int ENUMERATION_TYPE=171;
    public static final int T__311=311;
    public static final int T__310=310;
    public static final int QUALIFIED_ATTRIBUTE=62;
    public static final int PARAMETER_TYPE=123;
    public static final int LCURLY=268;
    public static final int BOUND_1=35;
    public static final int BOUND_2=36;
    public static final int TYPE_LABEL_REF=193;
    public static final int INCREMENT=92;
    public static final int ELEMENT=51;
    public static final int SCHEMA_VERSION_ID=210;
    public static final int FUNCTION_VALUE=240;
    public static final int T__309=309;
    public static final int CONSTANT_DECL=46;
    public static final int T__306=306;
    public static final int LOGICAL_TYPE=114;
    public static final int T__305=305;
    public static final int LE=271;
    public static final int T__308=308;
    public static final int INDEX_2=96;
    public static final int T__307=307;
    public static final int INDEX_1=95;
    public static final int T__302=302;
    public static final int GENERAL_BAG_TYPE=85;
    public static final int T__301=301;
    public static final int EXPRESSION=74;
    public static final int T__304=304;
    public static final int T__303=303;
    public static final int FUNCTION_CALL=78;
    public static final int QUALIFIABLE_FACTOR=131;
    public static final int TYPE_REF=185;
    public static final int CONSTANT_REF=188;
    public static final int INVERSE_CLAUSE=65;
    public static final int LT=270;
    public static final int NULL_STMT=117;
    public static final int PARAMETER_REF=190;
    public static final int RESOURCE_REF=142;
    public static final int NAMED_TYPE_OR_RENAME=152;
    public static final int TYPE_LABEL_ID=176;
    public static final int TOTAL_OVER=207;
    public static final int COMPOUND_STMT=44;
    public static final int INVERSE_ATTR=66;
    public static final int REPETITION=140;
    public static final int LOGICAL_LITERAL=113;
    public static final int TYPE_PARAM_IDENT=19;
    public static final int T__298=298;
    public static final int T__297=297;
    public static final int FUNCTION_LOG=229;
    public static final int T__299=299;
    public static final int T__294=294;
    public static final int T__293=293;
    public static final int T__296=296;
    public static final int T__295=295;
    public static final int ENUMERATION_EXTENSION=199;
    public static final int RPAREN=254;
    public static final int NUMERIC_EXPRESSION=119;
    public static final int LTSTAR=278;
    public static final int INTERFACE_SPECIFICATION=150;
    public static final int SIMPLE_ID=195;
    public static final int TYPE_ID=174;
    public static final int FUNCTION_ODD=233;
    public static final int AGGREGATE_SOURCE=24;
    public static final int AND=251;
    public static final int INTERVAL_HIGH=100;
    public static final int PLUS=255;
    public static final int FUNCTION_ROLESOF=234;
    public static final int SIMPLE_EXPRESSION=155;
    public static final int FLOAT=272;
    public static final int LOCAL_VARIABLE=111;
    public static final int ENUMERATION_ID=172;
    public static final int PROCEDURE_ID=130;
    public static final int QUERY_EXPRESSION=133;
    public static final int VARIABLE_REF=191;
    public static final int CONST_E=212;
    public static final int ENTITY_ATTR_IDENT=14;
    public static final int FUNCTION_LOG10=231;
    public static final int INT=273;
    public static final int IF_STMT=91;
    public static final int ALIAS_STMT=28;
    public static final int SUPERTYPE_EXPRESSION=162;
    public static final int COLEQ=262;
    public static final int DOMAIN_RULE=50;
    public static final int FORMAL_PARAMETER=76;
    public static final int GENERAL_SET_TYPE=88;
    public static final int CONSTANT_ID=48;
    public static final int SET_TYPE=154;
    public static final int FUNCTION_HIBOUND=224;
    public static final int OR=247;
    public static final int ARRAY_TYPE=29;
    public static final int PRIMARY=126;
    public static final int GENERAL_AGGREGATION_TYPES=83;
    public static final int STMT=159;
    public static final int TYPE_ATTR_IDENT=15;
    public static final int ENTITY_DECL=53;
    public static final int BAR=279;
    public static final int IDENT=260;
    public static final int FUNCTION_LENGTH=226;
    public static final int STRING_LITERAL=109;
    public static final int SUBTYPE_CONSTRAINT_BODY=205;

    // delegates
    // delegators


        public OWLSchema(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public OWLSchema(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return OWLSchema.tokenNames; }
    public String getGrammarFileName() { return "OWLSchema.g"; }


    	static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(OWLSchema.class);
    	private IRI currentOntoIRI = null;
    	private IRI currentOntoIRI2 = null;
    	private String ontoURI = null;
    	private OWLDataFactory currentFactory = null; 
    	private String physURI = null;
    	private OWLOntologyManager manager = null;
    	private OWLOntology currentOntology = null;
    	private OWLClass currentClass = null;
    	private OWLClass currentType = null;
    	private int lb;
    	private int hb;
    	private int pi;
    	private boolean bagset;
    	private OWLClass thing;
    	private OWLClass nothing;
    	private OWLClass attr;
    	private Set<OWLClassExpression> disj;
    	private int counter;
    	private String currentExternalSchema;
    	private Hashtable<String, Scope> scopes;
    	private OWLHelper h;

    	private Set<OWLAxiom> newAxioms;

    	
    	private boolean bOnlyRL = true;
    	
    	public void setOnlyRL(boolean val)
    	{
    		bOnlyRL = val;
    	}

    	public void setScopes(Hashtable<String, Scope> scopes) 
    	{
    		this.scopes = scopes;
    	}
    	
    	public void setOntology(OWLOntology ontology)
    	{
    		currentOntology = ontology;
    	}

    	public IRI getCurrentOntologyIRI()
    	{
    		return currentOntoIRI;
    	}
    	
    	public void setOntoURI(String _ontoURI)
    	{
    		ontoURI = _ontoURI;
    	}
    	public void setManager(OWLOntologyManager _manager)
    	{
    		manager = _manager;
    	}
    	
    	private OWLClass createSequence(String sAggregation, String elemType) throws OWLOntologyChangeException
    	{
    		//List management
    		OWLClass owllist = h.getClas(OWLHelper.getDeclaration(sAggregation, elemType));
    		OWLClass emptylist = h.getClas(OWLHelper.getEmptyDeclaration(sAggregation, elemType));
    		OWLClass bt = h.getClas(elemType);
    		OWLObjectProperty haslist = h.getOP(OWLHelper.getHasList(sAggregation, elemType));
    		OWLObjectProperty hascontent = h.getOP(OWLHelper.getHasContent(sAggregation, elemType));
    		OWLObjectProperty hasnext = h.getOP(OWLHelper.getHasNext(sAggregation, elemType));
    		OWLObjectProperty haselement = h.getOP(OWLHelper.getHasElement(sAggregation, elemType));
    		OWLObjectProperty isFollowedBy = h.getOP(OWLHelper.getIsFollowedBy(sAggregation, elemType));
    		
    		//OWLList
    		OWLObjectAllValuesFrom oar = h.getOAllRestriction(isFollowedBy, owllist);
    		addAxiom(h.getSubClassAxiom(owllist, oar));
    		OWLAnnotation owlcalist = h.getOCAExpressConstruct(sAggregation);
    		addAxiom(h.getAnnotationAxiom(owllist.getIRI(), owlcalist));
    		disj.add(owllist);
    		
    		//EmptyList
    		OWLObjectMaxCardinality omcr = h.getOMaxCardRestriction(hascontent, 0);
    		addAxiom(h.getSubClassAxiom(emptylist, omcr));
    		addAxiom(h.getSubClassAxiom(emptylist, owllist));
    				
    		//Equiv
    		
    		if (!bOnlyRL)
    		{
    			OWLObjectSomeValuesFrom osr = h.getOSomeRestriction(isFollowedBy, thing);
    			OWLClassExpression intersect = h.getOIntersectionOf(h.getOComplementOf(osr), owllist);
    			addAxiom(h.getEquivalentClassesAxiom(intersect, emptylist));
    		}
    			
    		//hasList
    		addAxiom(h.getOPDomainAxiom(haslist, owllist));
    		
    		//hasContent
    		addAxiom(h.getFunctionalOPAxiom(hascontent));
    		addAxiom(h.getSubOPAxiom(hascontent, haslist));
    		addAxiom(h.getOPRangeAxiom(hascontent, bt));
    		OWLAnnotation owlcat = h.getOCAType(elemType);
    		addAxiom(h.getAnnotationAxiom(hascontent.getIRI(), owlcat));

    		//hasNext
    		addAxiom(h.getSubOPAxiom(hasnext, isFollowedBy));
    		
    		//isFollowedBy
    		addAxiom(h.getSubOPAxiom(isFollowedBy, haslist));
    		addAxiom(h.getTransitiveOPAxiom(isFollowedBy));
    		addAxiom(h.getOPRangeAxiom(isFollowedBy, owllist));
    		
    		//hasElement
    		List<OWLObjectProperty> lel = new ArrayList<OWLObjectProperty>(2);
    		lel.add(isFollowedBy);
    		lel.add(hascontent);
    		if (!bOnlyRL)
    		{
    			//addAxiom(h.getOPChain(lel, haselement));
    		}
    		return owllist;
    	} 
    	
    	private OWLClass createBag(String elemType) throws OWLOntologyChangeException
    	{
    		String sAggregation = OWLHelper.bagPrefix;
    		//List management
    		OWLClass owlbag = h.getClas(OWLHelper.getDeclaration(sAggregation, elemType));
    		OWLClass bt = h.getClas(elemType);
    		OWLObjectProperty hascontent = h.getOP(OWLHelper.getHasContent(sAggregation, elemType));
    		
    		OWLAnnotation owlca = h.getOCAExpressConstruct(sAggregation);
    		addAxiom(h.getAnnotationAxiom(hascontent.getIRI(), owlca));

    		OWLClass owlbagcontent = h.getClas(OWLHelper.getContentDeclaration(sAggregation, elemType));
    		OWLObjectProperty hasvalue = h.getOP(OWLHelper.getHasValue(sAggregation, elemType));
    		
    		//OWLList
    		disj.add(owlbag);
    		//disj.add(owlbagcontent); Content can be anything, we don't want it to be disjoint
    			
    		//hasContent
    		addAxiom(h.getOPDomainAxiom(hascontent, owlbag));
    		addAxiom(h.getOPRangeAxiom(hascontent, owlbagcontent));
    		addAxiom(h.getOPDomainAxiom(hasvalue, owlbagcontent));
    		addAxiom(h.getOPRangeAxiom(hasvalue, bt));
    		addAxiom(h.getFunctionalOPAxiom(hasvalue));
    		
    		OWLAnnotation owlcat = h.getOCAType(elemType);
    		addAxiom(h.getAnnotationAxiom(hasvalue.getIRI(), owlcat));
    		
    		if (lb == hb)
    		{
    			if (!bOnlyRL)
    			{
    				OWLClassExpression restr = h.getOExactCardRestriction(hascontent, lb);
    				addAxiom(h.getSubClassAxiom(owlbag, restr));
    			}
    		}
    		else
    		{
    			if (!bOnlyRL)
    			{
    				OWLClassExpression restrMin = h.getOMinCardRestriction(hascontent, lb);
    				addAxiom(h.getSubClassAxiom(owlbag, restrMin));
    			}
    			if (hb != Integer.MAX_VALUE)
    			{
    				OWLClassExpression restrMax = h.getOMaxCardRestriction(hascontent, hb);
    				addAxiom(h.getSubClassAxiom(owlbag, restrMax));
    			}
    		}
    		return owlbag;
    	}
    	
    	private OWLClass createSet(String elemType) throws OWLOntologyChangeException
    	{
    		String sAggregation = OWLHelper.setPrefix;
    		//List management
    		OWLClass owlset = h.getClas(OWLHelper.getDeclaration(sAggregation, elemType));
    		OWLClass bt = h.getClas(elemType);
    		OWLObjectProperty hascontent = h.getOP(OWLHelper.getHasContent(sAggregation, elemType));
    		
    		OWLAnnotation owlca = h.getOCAExpressConstruct(sAggregation);
    		addAxiom(h.getAnnotationAxiom(hascontent.getIRI(), owlca));
    		
    		//OWLList
    		disj.add(owlset);
    			
    		//hasContent
    		addAxiom(h.getOPDomainAxiom(hascontent, owlset));
    		addAxiom(h.getOPRangeAxiom(hascontent, bt));
    		
    		OWLAnnotation owlcat = h.getOCAType(elemType);
    		addAxiom(h.getAnnotationAxiom(hascontent.getIRI(), owlcat));

    		if (lb == hb)
    		{
    			if (!bOnlyRL)
    			{
    				OWLClassExpression restr = h.getOExactCardRestriction(hascontent, lb);
    				addAxiom(h.getSubClassAxiom(owlset, restr));
    			}
    			else
    			{
    				OWLClassExpression restrMax = h.getOMaxCardRestriction(hascontent, hb);
    				addAxiom(h.getSubClassAxiom(owlset, restrMax));
    			}
    		}
    		else
    		{
    			if (!bOnlyRL)
    			{
    				OWLClassExpression restrMin = h.getOMinCardRestriction(hascontent, lb);
    				addAxiom(h.getSubClassAxiom(owlset, restrMin));
    			}
    			if (hb != Integer.MAX_VALUE)
    			{
    				OWLClassExpression restrMax = h.getOMaxCardRestriction(hascontent, hb);
    				addAxiom(h.getSubClassAxiom(owlset, restrMax));
    			}
    		}
    	
    		return owlset;
    	}

    	private void addAxiom(OWLAxiom a) throws OWLOntologyChangeException
    	{
    		newAxioms.add(a);
    		
    	}
    	
    	//Class
    	

    	
    	protected Object recoverFromMismatchedToken(IntStream input, int ttype, BitSet follow) throws RecognitionException
    	{
    		MismatchedTokenException mte = new MismatchedTokenException(ttype, input);
    		log.warn("mismatched token at " + input.index(), mte);
    		throw mte;
    	}
    	



    // $ANTLR start "actual_parameter_list"
    // OWLSchema.g:283:1: actual_parameter_list : ^( ACTUAL_PARAMETER_LIST ( parameter )+ ) ;
    public final void actual_parameter_list() throws RecognitionException {
        try {
            // OWLSchema.g:284:2: ( ^( ACTUAL_PARAMETER_LIST ( parameter )+ ) )
            // OWLSchema.g:284:5: ^( ACTUAL_PARAMETER_LIST ( parameter )+ )
            {
            match(input,ACTUAL_PARAMETER_LIST,FOLLOW_ACTUAL_PARAMETER_LIST_in_actual_parameter_list43); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:284:29: ( parameter )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==PARAMETER) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // OWLSchema.g:284:29: parameter
            	    {
            	    pushFollow(FOLLOW_parameter_in_actual_parameter_list45);
            	    parameter();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "actual_parameter_list"


    // $ANTLR start "aggregate_initializer"
    // OWLSchema.g:287:1: aggregate_initializer : ^( AGGREGATE_INITIALIZER ( ( element )+ )? ) ;
    public final void aggregate_initializer() throws RecognitionException {
        try {
            // OWLSchema.g:288:2: ( ^( AGGREGATE_INITIALIZER ( ( element )+ )? ) )
            // OWLSchema.g:288:5: ^( AGGREGATE_INITIALIZER ( ( element )+ )? )
            {
            match(input,AGGREGATE_INITIALIZER,FOLLOW_AGGREGATE_INITIALIZER_in_aggregate_initializer62); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:288:29: ( ( element )+ )?
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ELEMENT) ) {
                    alt3=1;
                }
                switch (alt3) {
                    case 1 :
                        // OWLSchema.g:288:31: ( element )+
                        {
                        // OWLSchema.g:288:31: ( element )+
                        int cnt2=0;
                        loop2:
                        do {
                            int alt2=2;
                            int LA2_0 = input.LA(1);

                            if ( (LA2_0==ELEMENT) ) {
                                alt2=1;
                            }


                            switch (alt2) {
                        	case 1 :
                        	    // OWLSchema.g:288:31: element
                        	    {
                        	    pushFollow(FOLLOW_element_in_aggregate_initializer66);
                        	    element();

                        	    state._fsp--;


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


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "aggregate_initializer"


    // $ANTLR start "aggregate_source"
    // OWLSchema.g:291:1: aggregate_source : ^( AGGREGATE_SOURCE simple_expression ) ;
    public final void aggregate_source() throws RecognitionException {
        try {
            // OWLSchema.g:292:3: ( ^( AGGREGATE_SOURCE simple_expression ) )
            // OWLSchema.g:292:6: ^( AGGREGATE_SOURCE simple_expression )
            {
            match(input,AGGREGATE_SOURCE,FOLLOW_AGGREGATE_SOURCE_in_aggregate_source87); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_simple_expression_in_aggregate_source89);
            simple_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "aggregate_source"


    // $ANTLR start "aggregate_type"
    // OWLSchema.g:295:1: aggregate_type : ^( AGGREGATE_TYPE ( type_label )? parameter_type ) ;
    public final void aggregate_type() throws RecognitionException {
        try {
            // OWLSchema.g:296:3: ( ^( AGGREGATE_TYPE ( type_label )? parameter_type ) )
            // OWLSchema.g:296:6: ^( AGGREGATE_TYPE ( type_label )? parameter_type )
            {
            match(input,AGGREGATE_TYPE,FOLLOW_AGGREGATE_TYPE_in_aggregate_type105); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:296:24: ( type_label )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==TYPE_LABEL) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // OWLSchema.g:296:24: type_label
                    {
                    pushFollow(FOLLOW_type_label_in_aggregate_type108);
                    type_label();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_parameter_type_in_aggregate_type111);
            parameter_type();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "aggregate_type"


    // $ANTLR start "aggregation_types"
    // OWLSchema.g:299:1: aggregation_types returns [OWLClass owlc] : ^( AGGREGATION_TYPES (at= array_type | bt= bag_type | lt= list_type | st= set_type ) ) ;
    public final OWLClass aggregation_types() throws RecognitionException {
        OWLClass owlc = null;

        OWLClass at = null;

        OWLClass bt = null;

        OWLClass lt = null;

        OWLClass st = null;


        try {
            // OWLSchema.g:300:3: ( ^( AGGREGATION_TYPES (at= array_type | bt= bag_type | lt= list_type | st= set_type ) ) )
            // OWLSchema.g:300:6: ^( AGGREGATION_TYPES (at= array_type | bt= bag_type | lt= list_type | st= set_type ) )
            {
            match(input,AGGREGATION_TYPES,FOLLOW_AGGREGATION_TYPES_in_aggregation_types132); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:300:26: (at= array_type | bt= bag_type | lt= list_type | st= set_type )
            int alt5=4;
            switch ( input.LA(1) ) {
            case ARRAY_TYPE:
                {
                alt5=1;
                }
                break;
            case BAG_TYPE:
                {
                alt5=2;
                }
                break;
            case LIST_TYPE:
                {
                alt5=3;
                }
                break;
            case SET_TYPE:
                {
                alt5=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // OWLSchema.g:301:5: at= array_type
                    {
                    pushFollow(FOLLOW_array_type_in_aggregation_types142);
                    at=array_type();

                    state._fsp--;

                    owlc =at;

                    }
                    break;
                case 2 :
                    // OWLSchema.g:302:5: bt= bag_type
                    {
                    pushFollow(FOLLOW_bag_type_in_aggregation_types152);
                    bt=bag_type();

                    state._fsp--;

                    owlc =bt;

                    }
                    break;
                case 3 :
                    // OWLSchema.g:303:5: lt= list_type
                    {
                    pushFollow(FOLLOW_list_type_in_aggregation_types162);
                    lt=list_type();

                    state._fsp--;

                    owlc =lt;

                    }
                    break;
                case 4 :
                    // OWLSchema.g:304:5: st= set_type
                    {
                    pushFollow(FOLLOW_set_type_in_aggregation_types172);
                    st=set_type();

                    state._fsp--;

                    owlc =st;

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "aggregation_types"


    // $ANTLR start "algorithm_head"
    // OWLSchema.g:308:1: algorithm_head : ^( ALGORITHM_HEAD ( declaration )* ( constant_decl )? ( local_decl )? ) ;
    public final void algorithm_head() throws RecognitionException {
        try {
            // OWLSchema.g:309:3: ( ^( ALGORITHM_HEAD ( declaration )* ( constant_decl )? ( local_decl )? ) )
            // OWLSchema.g:309:6: ^( ALGORITHM_HEAD ( declaration )* ( constant_decl )? ( local_decl )? )
            {
            match(input,ALGORITHM_HEAD,FOLLOW_ALGORITHM_HEAD_in_algorithm_head194); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:309:23: ( declaration )*
                loop6:
                do {
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==DECLARATION) ) {
                        alt6=1;
                    }


                    switch (alt6) {
                	case 1 :
                	    // OWLSchema.g:309:23: declaration
                	    {
                	    pushFollow(FOLLOW_declaration_in_algorithm_head196);
                	    declaration();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop6;
                    }
                } while (true);

                // OWLSchema.g:309:36: ( constant_decl )?
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==CONSTANT_DECL) ) {
                    alt7=1;
                }
                switch (alt7) {
                    case 1 :
                        // OWLSchema.g:309:36: constant_decl
                        {
                        pushFollow(FOLLOW_constant_decl_in_algorithm_head199);
                        constant_decl();

                        state._fsp--;


                        }
                        break;

                }

                // OWLSchema.g:309:51: ( local_decl )?
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==LOCAL_DECL) ) {
                    alt8=1;
                }
                switch (alt8) {
                    case 1 :
                        // OWLSchema.g:309:51: local_decl
                        {
                        pushFollow(FOLLOW_local_decl_in_algorithm_head202);
                        local_decl();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "algorithm_head"


    // $ANTLR start "alias_stmt"
    // OWLSchema.g:312:1: alias_stmt : ^( ALIAS_STMT variable_id general_ref ( qualifier )* ( stmt )+ ) ;
    public final void alias_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:313:3: ( ^( ALIAS_STMT variable_id general_ref ( qualifier )* ( stmt )+ ) )
            // OWLSchema.g:313:5: ^( ALIAS_STMT variable_id general_ref ( qualifier )* ( stmt )+ )
            {
            match(input,ALIAS_STMT,FOLLOW_ALIAS_STMT_in_alias_stmt218); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variable_id_in_alias_stmt220);
            variable_id();

            state._fsp--;

            pushFollow(FOLLOW_general_ref_in_alias_stmt222);
            general_ref();

            state._fsp--;

            // OWLSchema.g:313:42: ( qualifier )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==QUALIFIER) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // OWLSchema.g:313:42: qualifier
            	    {
            	    pushFollow(FOLLOW_qualifier_in_alias_stmt224);
            	    qualifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // OWLSchema.g:313:53: ( stmt )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==STMT) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // OWLSchema.g:313:53: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_alias_stmt227);
            	    stmt();

            	    state._fsp--;


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


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "alias_stmt"


    // $ANTLR start "array_type"
    // OWLSchema.g:316:1: array_type returns [OWLClass owlc] : ^( ARRAY_TYPE bs= bound_spec ( 'optional' )? ( 'unique' )? bt= base_type ) ;
    public final OWLClass array_type() throws RecognitionException {
        OWLClass owlc = null;

        bound_spec_return bs = null;

        OWLClass bt = null;


        try {
            // OWLSchema.g:317:3: ( ^( ARRAY_TYPE bs= bound_spec ( 'optional' )? ( 'unique' )? bt= base_type ) )
            // OWLSchema.g:317:5: ^( ARRAY_TYPE bs= bound_spec ( 'optional' )? ( 'unique' )? bt= base_type )
            {
            match(input,ARRAY_TYPE,FOLLOW_ARRAY_TYPE_in_array_type248); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_bound_spec_in_array_type253);
            bs=bound_spec();

            state._fsp--;

            // OWLSchema.g:317:34: ( 'optional' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==299) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // OWLSchema.g:317:34: 'optional'
                    {
                    match(input,299,FOLLOW_299_in_array_type256); 

                    }
                    break;

            }

            // OWLSchema.g:317:47: ( 'unique' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==300) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // OWLSchema.g:317:47: 'unique'
                    {
                    match(input,300,FOLLOW_300_in_array_type260); 

                    }
                    break;

            }

            pushFollow(FOLLOW_base_type_in_array_type266);
            bt=base_type();

            state._fsp--;


            match(input, Token.UP, null); 

            			owlc = createSequence(OWLHelper.arrayPrefix, bt.getIRI().getFragment());
            			if (bs != null)
            			{
            				bagset = false;
            				if ((bs!=null?bs.down:null) != null)
            					lb = (bs!=null?bs.down:null).intValue();
            				else
            					lb = 0;
            				if ((bs!=null?bs.up:null) != null)
            					hb = (bs!=null?bs.up:null);
            				else
            					hb = Integer.MAX_VALUE;
            			}
            		

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "array_type"


    // $ANTLR start "assignment_stmt"
    // OWLSchema.g:336:1: assignment_stmt : ^( ASSIGNMENT_STMT ( general_ref ( qualifier )* ) expression ) ;
    public final void assignment_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:337:3: ( ^( ASSIGNMENT_STMT ( general_ref ( qualifier )* ) expression ) )
            // OWLSchema.g:337:5: ^( ASSIGNMENT_STMT ( general_ref ( qualifier )* ) expression )
            {
            match(input,ASSIGNMENT_STMT,FOLLOW_ASSIGNMENT_STMT_in_assignment_stmt292); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:337:23: ( general_ref ( qualifier )* )
            // OWLSchema.g:337:25: general_ref ( qualifier )*
            {
            pushFollow(FOLLOW_general_ref_in_assignment_stmt296);
            general_ref();

            state._fsp--;

            // OWLSchema.g:337:38: ( qualifier )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==QUALIFIER) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // OWLSchema.g:337:38: qualifier
            	    {
            	    pushFollow(FOLLOW_qualifier_in_assignment_stmt299);
            	    qualifier();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }

            pushFollow(FOLLOW_expression_in_assignment_stmt304);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "assignment_stmt"


    // $ANTLR start "bag_type"
    // OWLSchema.g:340:1: bag_type returns [OWLClass owlc] : ^( BAG_TYPE (bs= bound_spec )? bt= base_type ) ;
    public final OWLClass bag_type() throws RecognitionException {
        OWLClass owlc = null;

        bound_spec_return bs = null;

        OWLClass bt = null;


        try {
            // OWLSchema.g:341:3: ( ^( BAG_TYPE (bs= bound_spec )? bt= base_type ) )
            // OWLSchema.g:341:5: ^( BAG_TYPE (bs= bound_spec )? bt= base_type )
            {
            match(input,BAG_TYPE,FOLLOW_BAG_TYPE_in_bag_type324); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:341:19: (bs= bound_spec )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==BOUND_SPEC) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // OWLSchema.g:341:19: bs= bound_spec
                    {
                    pushFollow(FOLLOW_bound_spec_in_bag_type329);
                    bs=bound_spec();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_base_type_in_bag_type335);
            bt=base_type();

            state._fsp--;


            match(input, Token.UP, null); 

            			owlc = createBag(bt.getIRI().getFragment());
            			if (bs != null)
            			{
            				bagset = true;
            			if ((bs!=null?bs.down:null) != null)
            				lb = (bs!=null?bs.down:null).intValue();
            			else
            				lb = 0;
            			if ((bs!=null?bs.up:null) != null)
            				hb = (bs!=null?bs.up:null);
            			else
            				hb = Integer.MAX_VALUE;
            			}
            		

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "bag_type"


    // $ANTLR start "base_type"
    // OWLSchema.g:360:1: base_type returns [OWLClass owlc] : ^( BASE_TYPE (at= aggregation_types | st= simple_types | nt= named_types ) ) ;
    public final OWLClass base_type() throws RecognitionException {
        OWLClass owlc = null;

        OWLClass at = null;

        OWLClass st = null;

        OWLClass nt = null;


        try {
            // OWLSchema.g:361:3: ( ^( BASE_TYPE (at= aggregation_types | st= simple_types | nt= named_types ) ) )
            // OWLSchema.g:361:6: ^( BASE_TYPE (at= aggregation_types | st= simple_types | nt= named_types ) )
            {
            match(input,BASE_TYPE,FOLLOW_BASE_TYPE_in_base_type366); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:361:18: (at= aggregation_types | st= simple_types | nt= named_types )
            int alt15=3;
            switch ( input.LA(1) ) {
            case AGGREGATION_TYPES:
                {
                alt15=1;
                }
                break;
            case SIMPLE_TYPES:
                {
                alt15=2;
                }
                break;
            case NAMED_TYPES:
                {
                alt15=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // OWLSchema.g:362:5: at= aggregation_types
                    {
                    pushFollow(FOLLOW_aggregation_types_in_base_type376);
                    at=aggregation_types();

                    state._fsp--;

                    owlc = at;

                    }
                    break;
                case 2 :
                    // OWLSchema.g:363:5: st= simple_types
                    {
                    pushFollow(FOLLOW_simple_types_in_base_type386);
                    st=simple_types();

                    state._fsp--;

                    owlc = st;

                    }
                    break;
                case 3 :
                    // OWLSchema.g:364:5: nt= named_types
                    {
                    pushFollow(FOLLOW_named_types_in_base_type396);
                    nt=named_types();

                    state._fsp--;

                    owlc = nt;

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "base_type"


    // $ANTLR start "concrete_types"
    // OWLSchema.g:368:1: concrete_types : ^( CONCRETE_TYPES ( aggregation_types | simple_types | named_types ) ) ;
    public final void concrete_types() throws RecognitionException {
        try {
            // OWLSchema.g:369:3: ( ^( CONCRETE_TYPES ( aggregation_types | simple_types | named_types ) ) )
            // OWLSchema.g:369:6: ^( CONCRETE_TYPES ( aggregation_types | simple_types | named_types ) )
            {
            match(input,CONCRETE_TYPES,FOLLOW_CONCRETE_TYPES_in_concrete_types419); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:369:23: ( aggregation_types | simple_types | named_types )
            int alt16=3;
            switch ( input.LA(1) ) {
            case AGGREGATION_TYPES:
                {
                alt16=1;
                }
                break;
            case SIMPLE_TYPES:
                {
                alt16=2;
                }
                break;
            case NAMED_TYPES:
                {
                alt16=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // OWLSchema.g:370:3: aggregation_types
                    {
                    pushFollow(FOLLOW_aggregation_types_in_concrete_types425);
                    aggregation_types();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:371:5: simple_types
                    {
                    pushFollow(FOLLOW_simple_types_in_concrete_types431);
                    simple_types();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:372:5: named_types
                    {
                    pushFollow(FOLLOW_named_types_in_concrete_types437);
                    named_types();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "concrete_types"


    // $ANTLR start "binary_type"
    // OWLSchema.g:376:1: binary_type returns [String stype] : ^( BINARY_TYPE ( width_spec )? ) ;
    public final String binary_type() throws RecognitionException {
        String stype = null;

        try {
            // OWLSchema.g:377:3: ( ^( BINARY_TYPE ( width_spec )? ) )
            // OWLSchema.g:377:5: ^( BINARY_TYPE ( width_spec )? )
            {
            match(input,BINARY_TYPE,FOLLOW_BINARY_TYPE_in_binary_type461); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:377:20: ( width_spec )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==WIDTH_SPEC) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // OWLSchema.g:377:20: width_spec
                        {
                        pushFollow(FOLLOW_width_spec_in_binary_type464);
                        width_spec();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            			stype = "binary";
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stype;
    }
    // $ANTLR end "binary_type"


    // $ANTLR start "boolean_type"
    // OWLSchema.g:382:1: boolean_type returns [String stype] : ^( BOOLEAN_TYPE nothing ) ;
    public final String boolean_type() throws RecognitionException {
        String stype = null;

        try {
            // OWLSchema.g:383:3: ( ^( BOOLEAN_TYPE nothing ) )
            // OWLSchema.g:383:5: ^( BOOLEAN_TYPE nothing )
            {
            match(input,BOOLEAN_TYPE,FOLLOW_BOOLEAN_TYPE_in_boolean_type489); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_nothing_in_boolean_type491);
                nothing();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            			stype = "boolean";
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stype;
    }
    // $ANTLR end "boolean_type"


    // $ANTLR start "bound_1"
    // OWLSchema.g:389:1: bound_1 returns [Integer intVal] : ^( BOUND_1 ne= numeric_expression ) ;
    public final Integer bound_1() throws RecognitionException {
        Integer intVal = null;

        numeric_expression_return ne = null;


        try {
            // OWLSchema.g:390:3: ( ^( BOUND_1 ne= numeric_expression ) )
            // OWLSchema.g:390:5: ^( BOUND_1 ne= numeric_expression )
            {
            match(input,BOUND_1,FOLLOW_BOUND_1_in_bound_1514); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numeric_expression_in_bound_1518);
            ne=numeric_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            			intVal = (ne!=null?ne.intVal:null);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return intVal;
    }
    // $ANTLR end "bound_1"


    // $ANTLR start "bound_2"
    // OWLSchema.g:396:1: bound_2 returns [Integer intVal] : ^( BOUND_2 ne= numeric_expression ) ;
    public final Integer bound_2() throws RecognitionException {
        Integer intVal = null;

        numeric_expression_return ne = null;


        try {
            // OWLSchema.g:397:3: ( ^( BOUND_2 ne= numeric_expression ) )
            // OWLSchema.g:397:5: ^( BOUND_2 ne= numeric_expression )
            {
            match(input,BOUND_2,FOLLOW_BOUND_2_in_bound_2542); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numeric_expression_in_bound_2546);
            ne=numeric_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            			intVal = (ne!=null?ne.intVal:null);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return intVal;
    }
    // $ANTLR end "bound_2"

    public static class bound_spec_return extends TreeRuleReturnScope {
        public Integer down;
        public Integer up;
    };

    // $ANTLR start "bound_spec"
    // OWLSchema.g:403:1: bound_spec returns [Integer down, Integer up] : ^( BOUND_SPEC b1= bound_1 b2= bound_2 ) ;
    public final bound_spec_return bound_spec() throws RecognitionException {
        bound_spec_return retval = new bound_spec_return();
        retval.start = input.LT(1);

        Integer b1 = null;

        Integer b2 = null;


        try {
            // OWLSchema.g:404:3: ( ^( BOUND_SPEC b1= bound_1 b2= bound_2 ) )
            // OWLSchema.g:404:5: ^( BOUND_SPEC b1= bound_1 b2= bound_2 )
            {
            match(input,BOUND_SPEC,FOLLOW_BOUND_SPEC_in_bound_spec570); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_bound_1_in_bound_spec575);
            b1=bound_1();

            state._fsp--;

            pushFollow(FOLLOW_bound_2_in_bound_spec579);
            b2=bound_2();

            state._fsp--;


            match(input, Token.UP, null); 

            			retval.down = b1;
            			retval.up = b2;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "bound_spec"


    // $ANTLR start "built_in_constant"
    // OWLSchema.g:411:1: built_in_constant : ^( BUILT_IN_CONSTANT ( 'const_e' | 'pi' | 'self' | QUESTION | STAR ) ) ;
    public final void built_in_constant() throws RecognitionException {
        try {
            // OWLSchema.g:412:3: ( ^( BUILT_IN_CONSTANT ( 'const_e' | 'pi' | 'self' | QUESTION | STAR ) ) )
            // OWLSchema.g:412:6: ^( BUILT_IN_CONSTANT ( 'const_e' | 'pi' | 'self' | QUESTION | STAR ) )
            {
            match(input,BUILT_IN_CONSTANT,FOLLOW_BUILT_IN_CONSTANT_in_built_in_constant600); 

            match(input, Token.DOWN, null); 
            if ( (input.LA(1)>=CONST_E && input.LA(1)<=CONST_SELF)||(input.LA(1)>=QUESTION && input.LA(1)<=STAR) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "built_in_constant"


    // $ANTLR start "case_action"
    // OWLSchema.g:421:1: case_action : ^( CASE_ACTION ( case_label )+ stmt ) ;
    public final void case_action() throws RecognitionException {
        try {
            // OWLSchema.g:422:3: ( ^( CASE_ACTION ( case_label )+ stmt ) )
            // OWLSchema.g:422:6: ^( CASE_ACTION ( case_label )+ stmt )
            {
            match(input,CASE_ACTION,FOLLOW_CASE_ACTION_in_case_action657); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:422:20: ( case_label )+
            int cnt18=0;
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==CASE_LABEL) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // OWLSchema.g:422:20: case_label
            	    {
            	    pushFollow(FOLLOW_case_label_in_case_action659);
            	    case_label();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt18 >= 1 ) break loop18;
                        EarlyExitException eee =
                            new EarlyExitException(18, input);
                        throw eee;
                }
                cnt18++;
            } while (true);

            pushFollow(FOLLOW_stmt_in_case_action662);
            stmt();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "case_action"


    // $ANTLR start "case_label"
    // OWLSchema.g:425:1: case_label : ^( CASE_LABEL expression ) ;
    public final void case_label() throws RecognitionException {
        try {
            // OWLSchema.g:426:3: ( ^( CASE_LABEL expression ) )
            // OWLSchema.g:426:6: ^( CASE_LABEL expression )
            {
            match(input,CASE_LABEL,FOLLOW_CASE_LABEL_in_case_label679); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_case_label681);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "case_label"


    // $ANTLR start "case_stmt"
    // OWLSchema.g:429:1: case_stmt : ^( CASE_STMT selector ( case_action )* ( stmt )? ) ;
    public final void case_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:430:3: ( ^( CASE_STMT selector ( case_action )* ( stmt )? ) )
            // OWLSchema.g:430:5: ^( CASE_STMT selector ( case_action )* ( stmt )? )
            {
            match(input,CASE_STMT,FOLLOW_CASE_STMT_in_case_stmt697); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_selector_in_case_stmt700);
            selector();

            state._fsp--;

            // OWLSchema.g:430:27: ( case_action )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==CASE_ACTION) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // OWLSchema.g:430:27: case_action
            	    {
            	    pushFollow(FOLLOW_case_action_in_case_stmt702);
            	    case_action();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            // OWLSchema.g:430:41: ( stmt )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==STMT) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // OWLSchema.g:430:41: stmt
                    {
                    pushFollow(FOLLOW_stmt_in_case_stmt706);
                    stmt();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "case_stmt"


    // $ANTLR start "compound_stmt"
    // OWLSchema.g:433:1: compound_stmt : ^( COMPOUND_STMT ( stmt )+ ) ;
    public final void compound_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:434:3: ( ^( COMPOUND_STMT ( stmt )+ ) )
            // OWLSchema.g:434:5: ^( COMPOUND_STMT ( stmt )+ )
            {
            match(input,COMPOUND_STMT,FOLLOW_COMPOUND_STMT_in_compound_stmt724); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:434:22: ( stmt )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==STMT) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // OWLSchema.g:434:22: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_compound_stmt727);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "compound_stmt"


    // $ANTLR start "constant_body"
    // OWLSchema.g:437:1: constant_body : ^( CONSTANT_BODY constant_id base_type expression ) ;
    public final void constant_body() throws RecognitionException {
        try {
            // OWLSchema.g:438:3: ( ^( CONSTANT_BODY constant_id base_type expression ) )
            // OWLSchema.g:438:5: ^( CONSTANT_BODY constant_id base_type expression )
            {
            match(input,CONSTANT_BODY,FOLLOW_CONSTANT_BODY_in_constant_body745); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_constant_id_in_constant_body747);
            constant_id();

            state._fsp--;

            pushFollow(FOLLOW_base_type_in_constant_body749);
            base_type();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_constant_body751);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constant_body"


    // $ANTLR start "constant_decl"
    // OWLSchema.g:441:1: constant_decl : ^( CONSTANT_DECL ( constant_body )+ ) ;
    public final void constant_decl() throws RecognitionException {
        try {
            // OWLSchema.g:442:3: ( ^( CONSTANT_DECL ( constant_body )+ ) )
            // OWLSchema.g:442:5: ^( CONSTANT_DECL ( constant_body )+ )
            {
            match(input,CONSTANT_DECL,FOLLOW_CONSTANT_DECL_in_constant_decl768); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:442:22: ( constant_body )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==CONSTANT_BODY) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // OWLSchema.g:442:22: constant_body
            	    {
            	    pushFollow(FOLLOW_constant_body_in_constant_decl771);
            	    constant_body();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constant_decl"


    // $ANTLR start "constant_factor"
    // OWLSchema.g:445:1: constant_factor : ^( CONSTANT_FACTOR ( built_in_constant | constant_ref ) ) ;
    public final void constant_factor() throws RecognitionException {
        try {
            // OWLSchema.g:446:3: ( ^( CONSTANT_FACTOR ( built_in_constant | constant_ref ) ) )
            // OWLSchema.g:446:6: ^( CONSTANT_FACTOR ( built_in_constant | constant_ref ) )
            {
            match(input,CONSTANT_FACTOR,FOLLOW_CONSTANT_FACTOR_in_constant_factor790); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:446:24: ( built_in_constant | constant_ref )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==BUILT_IN_CONSTANT) ) {
                alt23=1;
            }
            else if ( (LA23_0==CONSTANT_REF) ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }
            switch (alt23) {
                case 1 :
                    // OWLSchema.g:447:5: built_in_constant
                    {
                    pushFollow(FOLLOW_built_in_constant_in_constant_factor798);
                    built_in_constant();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:448:5: constant_ref
                    {
                    pushFollow(FOLLOW_constant_ref_in_constant_factor806);
                    constant_ref();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constant_factor"


    // $ANTLR start "constant_id"
    // OWLSchema.g:452:1: constant_id : ^( CONSTANT_ID IDENT ) ;
    public final void constant_id() throws RecognitionException {
        try {
            // OWLSchema.g:453:5: ( ^( CONSTANT_ID IDENT ) )
            // OWLSchema.g:453:8: ^( CONSTANT_ID IDENT )
            {
            match(input,CONSTANT_ID,FOLLOW_CONSTANT_ID_in_constant_id829); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_constant_id831); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constant_id"


    // $ANTLR start "declaration"
    // OWLSchema.g:457:1: declaration : ^( DECLARATION ( entity_decl | subtype_constraint_decl | function_decl | procedure_decl | type_decl ) ) ;
    public final void declaration() throws RecognitionException {
        try {
            // OWLSchema.g:458:3: ( ^( DECLARATION ( entity_decl | subtype_constraint_decl | function_decl | procedure_decl | type_decl ) ) )
            // OWLSchema.g:458:6: ^( DECLARATION ( entity_decl | subtype_constraint_decl | function_decl | procedure_decl | type_decl ) )
            {
            match(input,DECLARATION,FOLLOW_DECLARATION_in_declaration851); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:458:20: ( entity_decl | subtype_constraint_decl | function_decl | procedure_decl | type_decl )
            int alt24=5;
            switch ( input.LA(1) ) {
            case ENTITY_DECL:
                {
                alt24=1;
                }
                break;
            case SUBTYPE_CONSTRAINT_DECL:
                {
                alt24=2;
                }
                break;
            case FUNCTION_DECL:
                {
                alt24=3;
                }
                break;
            case PROCEDURE_DECL:
                {
                alt24=4;
                }
                break;
            case TYPE_DECL:
                {
                alt24=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // OWLSchema.g:459:5: entity_decl
                    {
                    pushFollow(FOLLOW_entity_decl_in_declaration859);
                    entity_decl();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:460:5: subtype_constraint_decl
                    {
                    pushFollow(FOLLOW_subtype_constraint_decl_in_declaration865);
                    subtype_constraint_decl();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:461:5: function_decl
                    {
                    pushFollow(FOLLOW_function_decl_in_declaration871);
                    function_decl();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // OWLSchema.g:462:5: procedure_decl
                    {
                    pushFollow(FOLLOW_procedure_decl_in_declaration879);
                    procedure_decl();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // OWLSchema.g:463:5: type_decl
                    {
                    pushFollow(FOLLOW_type_decl_in_declaration885);
                    type_decl();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "declaration"


    // $ANTLR start "domain_rule"
    // OWLSchema.g:467:1: domain_rule : ^( DOMAIN_RULE ( label )? logical_expression ) ;
    public final void domain_rule() throws RecognitionException {
        try {
            // OWLSchema.g:468:3: ( ^( DOMAIN_RULE ( label )? logical_expression ) )
            // OWLSchema.g:468:6: ^( DOMAIN_RULE ( label )? logical_expression )
            {
            match(input,DOMAIN_RULE,FOLLOW_DOMAIN_RULE_in_domain_rule917); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:468:20: ( label )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==LABEL) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // OWLSchema.g:468:22: label
                    {
                    pushFollow(FOLLOW_label_in_domain_rule921);
                    label();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_logical_expression_in_domain_rule927);
            logical_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "domain_rule"


    // $ANTLR start "element"
    // OWLSchema.g:471:1: element : ^( ELEMENT expression ( repetition )? ) ;
    public final void element() throws RecognitionException {
        try {
            // OWLSchema.g:472:3: ( ^( ELEMENT expression ( repetition )? ) )
            // OWLSchema.g:472:6: ^( ELEMENT expression ( repetition )? )
            {
            match(input,ELEMENT,FOLLOW_ELEMENT_in_element944); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_element946);
            expression();

            state._fsp--;

            // OWLSchema.g:472:28: ( repetition )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==REPETITION) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // OWLSchema.g:472:30: repetition
                    {
                    pushFollow(FOLLOW_repetition_in_element951);
                    repetition();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "element"


    // $ANTLR start "entity_head"
    // OWLSchema.g:475:1: entity_head : ^( ENTITY_HEAD entity_id ( 'abstract' )? ( subsuper )? ) ;
    public final void entity_head() throws RecognitionException {
        entity_id_return entity_id1 = null;


        try {
            // OWLSchema.g:476:3: ( ^( ENTITY_HEAD entity_id ( 'abstract' )? ( subsuper )? ) )
            // OWLSchema.g:476:5: ^( ENTITY_HEAD entity_id ( 'abstract' )? ( subsuper )? )
            {
            match(input,ENTITY_HEAD,FOLLOW_ENTITY_HEAD_in_entity_head971); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_entity_id_in_entity_head973);
            entity_id1=entity_id();

            state._fsp--;


            			currentClass = h.getClas((entity_id1!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(entity_id1.start),
              input.getTreeAdaptor().getTokenStopIndex(entity_id1.start))):null).toLowerCase() );
            			log.debug("currentClass=" + (entity_id1!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(entity_id1.start),
              input.getTreeAdaptor().getTokenStopIndex(entity_id1.start))):null).toLowerCase() );
            			addAxiom(h.getDeclarationAxiom(currentClass));
            			OWLAnnotation owlca = h.getOCAExpressConstruct("entity");
            			addAxiom(h.getAnnotationAxiom(currentClass.getIRI(), owlca));
            		
            // OWLSchema.g:484:3: ( 'abstract' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==312) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // OWLSchema.g:484:5: 'abstract'
                    {
                    match(input,312,FOLLOW_312_in_entity_head983); 

                    }
                    break;

            }

            // OWLSchema.g:484:19: ( subsuper )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==SUBSUPER) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // OWLSchema.g:484:20: subsuper
                    {
                    pushFollow(FOLLOW_subsuper_in_entity_head989);
                    subsuper();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            			boolean addClass = true;
            			for(OWLClassExpression owld : currentClass.getSuperClasses(currentOntology) )
            			{
            				if (! (owld instanceof OWLClass))
            					continue;
            				String expcon = h.getLiteral(currentOntology, h.getIRIExpressConstruct(ontoURI), (OWLClass)owld);
                                            if (expcon != null && expcon.equals("entity"))
            				{
            					addClass = false;
            					break;
            				}
            			}
            			if (addClass)
            				disj.add(currentClass);
            		

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entity_head"


    // $ANTLR start "entity_decl"
    // OWLSchema.g:504:1: entity_decl : ^( ENTITY_DECL entity_head entity_body ) ;
    public final void entity_decl() throws RecognitionException {
        try {
            // OWLSchema.g:505:3: ( ^( ENTITY_DECL entity_head entity_body ) )
            // OWLSchema.g:505:5: ^( ENTITY_DECL entity_head entity_body )
            {
            match(input,ENTITY_DECL,FOLLOW_ENTITY_DECL_in_entity_decl1018); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_entity_head_in_entity_decl1020);
            entity_head();

            state._fsp--;

            pushFollow(FOLLOW_entity_body_in_entity_decl1023);
            entity_body();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entity_decl"


    // $ANTLR start "entity_body"
    // OWLSchema.g:508:1: entity_body : ^( ENTITY_BODY ( explicit_attr )* ( derive_clause )? ( inverse_clause )? ( unique_clause )? ( where_clause )? ) ;
    public final void entity_body() throws RecognitionException {
        try {
            // OWLSchema.g:509:3: ( ^( ENTITY_BODY ( explicit_attr )* ( derive_clause )? ( inverse_clause )? ( unique_clause )? ( where_clause )? ) )
            // OWLSchema.g:509:5: ^( ENTITY_BODY ( explicit_attr )* ( derive_clause )? ( inverse_clause )? ( unique_clause )? ( where_clause )? )
            {
            match(input,ENTITY_BODY,FOLLOW_ENTITY_BODY_in_entity_body1039); 


            			pi = 0;
            		

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:513:4: ( explicit_attr )*
                loop29:
                do {
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==EXPLICIT_ATTR) ) {
                        alt29=1;
                    }


                    switch (alt29) {
                	case 1 :
                	    // OWLSchema.g:513:5: explicit_attr
                	    {
                	    pushFollow(FOLLOW_explicit_attr_in_entity_body1049);
                	    explicit_attr();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop29;
                    }
                } while (true);

                // OWLSchema.g:513:21: ( derive_clause )?
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==DERIVE_CLAUSE) ) {
                    alt30=1;
                }
                switch (alt30) {
                    case 1 :
                        // OWLSchema.g:513:22: derive_clause
                        {
                        pushFollow(FOLLOW_derive_clause_in_entity_body1054);
                        derive_clause();

                        state._fsp--;


                        }
                        break;

                }

                // OWLSchema.g:513:38: ( inverse_clause )?
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==INVERSE_CLAUSE) ) {
                    alt31=1;
                }
                switch (alt31) {
                    case 1 :
                        // OWLSchema.g:513:39: inverse_clause
                        {
                        pushFollow(FOLLOW_inverse_clause_in_entity_body1059);
                        inverse_clause();

                        state._fsp--;


                        }
                        break;

                }

                // OWLSchema.g:513:56: ( unique_clause )?
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==UNIQUE_CLAUSE) ) {
                    alt32=1;
                }
                switch (alt32) {
                    case 1 :
                        // OWLSchema.g:513:57: unique_clause
                        {
                        pushFollow(FOLLOW_unique_clause_in_entity_body1064);
                        unique_clause();

                        state._fsp--;


                        }
                        break;

                }

                // OWLSchema.g:513:73: ( where_clause )?
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==WHERE_CLAUSE) ) {
                    alt33=1;
                }
                switch (alt33) {
                    case 1 :
                        // OWLSchema.g:513:74: where_clause
                        {
                        pushFollow(FOLLOW_where_clause_in_entity_body1069);
                        where_clause();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entity_body"


    // $ANTLR start "subsuper"
    // OWLSchema.g:516:1: subsuper : ^( SUBSUPER ( supertype_constraint )? ( subtype_declaration )? ) ;
    public final void subsuper() throws RecognitionException {

        	log.debug("subsuper=" );

        try {
            // OWLSchema.g:521:3: ( ^( SUBSUPER ( supertype_constraint )? ( subtype_declaration )? ) )
            // OWLSchema.g:521:5: ^( SUBSUPER ( supertype_constraint )? ( subtype_declaration )? )
            {
            match(input,SUBSUPER,FOLLOW_SUBSUPER_in_subsuper1091); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:521:16: ( supertype_constraint )?
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==SUPERTYPE_CONSTRAINT) ) {
                    alt34=1;
                }
                switch (alt34) {
                    case 1 :
                        // OWLSchema.g:521:18: supertype_constraint
                        {
                        pushFollow(FOLLOW_supertype_constraint_in_subsuper1095);
                        supertype_constraint();

                        state._fsp--;


                        }
                        break;

                }

                // OWLSchema.g:521:42: ( subtype_declaration )?
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==SUBTYPE_DECLARATION) ) {
                    alt35=1;
                }
                switch (alt35) {
                    case 1 :
                        // OWLSchema.g:521:44: subtype_declaration
                        {
                        pushFollow(FOLLOW_subtype_declaration_in_subsuper1102);
                        subtype_declaration();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "subsuper"


    // $ANTLR start "supertype_constraint"
    // OWLSchema.g:524:1: supertype_constraint : ^( SUPERTYPE_CONSTRAINT ( abstract_supertype_declaration | supertype_rule ) ) ;
    public final void supertype_constraint() throws RecognitionException {
        try {
            // OWLSchema.g:525:3: ( ^( SUPERTYPE_CONSTRAINT ( abstract_supertype_declaration | supertype_rule ) ) )
            // OWLSchema.g:525:6: ^( SUPERTYPE_CONSTRAINT ( abstract_supertype_declaration | supertype_rule ) )
            {
            match(input,SUPERTYPE_CONSTRAINT,FOLLOW_SUPERTYPE_CONSTRAINT_in_supertype_constraint1121); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:525:29: ( abstract_supertype_declaration | supertype_rule )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==ABSTRACT_SUPERTYPE_DECLARATION) ) {
                alt36=1;
            }
            else if ( (LA36_0==SUPERTYPE_RULE) ) {
                alt36=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;
            }
            switch (alt36) {
                case 1 :
                    // OWLSchema.g:526:6: abstract_supertype_declaration
                    {
                    pushFollow(FOLLOW_abstract_supertype_declaration_in_supertype_constraint1130);
                    abstract_supertype_declaration();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:527:6: supertype_rule
                    {
                    pushFollow(FOLLOW_supertype_rule_in_supertype_constraint1137);
                    supertype_rule();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "supertype_constraint"


    // $ANTLR start "abstract_supertype_declaration"
    // OWLSchema.g:531:1: abstract_supertype_declaration : ^( ABSTRACT_SUPERTYPE_DECLARATION ( subtype_constraint )? ) ;
    public final void abstract_supertype_declaration() throws RecognitionException {
        try {
            // OWLSchema.g:532:3: ( ^( ABSTRACT_SUPERTYPE_DECLARATION ( subtype_constraint )? ) )
            // OWLSchema.g:532:5: ^( ABSTRACT_SUPERTYPE_DECLARATION ( subtype_constraint )? )
            {
            match(input,ABSTRACT_SUPERTYPE_DECLARATION,FOLLOW_ABSTRACT_SUPERTYPE_DECLARATION_in_abstract_supertype_declaration1156); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:532:38: ( subtype_constraint )?
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==SUBTYPE_CONSTRAINT) ) {
                    alt37=1;
                }
                switch (alt37) {
                    case 1 :
                        // OWLSchema.g:532:40: subtype_constraint
                        {
                        pushFollow(FOLLOW_subtype_constraint_in_abstract_supertype_declaration1160);
                        subtype_constraint();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "abstract_supertype_declaration"


    // $ANTLR start "subtype_declaration"
    // OWLSchema.g:536:1: subtype_declaration : ^( SUBTYPE_DECLARATION (er= entity_ref )+ ) ;
    public final void subtype_declaration() throws RecognitionException {
        OWLClass er = null;


        try {
            // OWLSchema.g:537:3: ( ^( SUBTYPE_DECLARATION (er= entity_ref )+ ) )
            // OWLSchema.g:537:6: ^( SUBTYPE_DECLARATION (er= entity_ref )+ )
            {
            match(input,SUBTYPE_DECLARATION,FOLLOW_SUBTYPE_DECLARATION_in_subtype_declaration1181); 


            			int si = 0;
            		

            match(input, Token.DOWN, null); 
            // OWLSchema.g:541:3: (er= entity_ref )+
            int cnt38=0;
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==ENTITY_REF) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // OWLSchema.g:541:4: er= entity_ref
            	    {
            	    pushFollow(FOLLOW_entity_ref_in_subtype_declaration1193);
            	    er=entity_ref();

            	    state._fsp--;


            	    				OWLAnnotation owlsi = h.getOCASupertypeIndex(si++);				
            	    				OWLSubClassOfAxiom sca = h.getSubClassAxiom(currentClass, er, Collections.singleton(owlsi));
            	    				addAxiom(sca);				
            	    			

            	    }
            	    break;

            	default :
            	    if ( cnt38 >= 1 ) break loop38;
                        EarlyExitException eee =
                            new EarlyExitException(38, input);
                        throw eee;
                }
                cnt38++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "subtype_declaration"


    // $ANTLR start "subtype_constraint_decl"
    // OWLSchema.g:551:1: subtype_constraint_decl : ^( SUBTYPE_CONSTRAINT_DECL subtype_constraint_head subtype_constraint_body ) ;
    public final void subtype_constraint_decl() throws RecognitionException {
        try {
            // OWLSchema.g:552:3: ( ^( SUBTYPE_CONSTRAINT_DECL subtype_constraint_head subtype_constraint_body ) )
            // OWLSchema.g:552:6: ^( SUBTYPE_CONSTRAINT_DECL subtype_constraint_head subtype_constraint_body )
            {
            match(input,SUBTYPE_CONSTRAINT_DECL,FOLLOW_SUBTYPE_CONSTRAINT_DECL_in_subtype_constraint_decl1226); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subtype_constraint_head_in_subtype_constraint_decl1228);
            subtype_constraint_head();

            state._fsp--;

            pushFollow(FOLLOW_subtype_constraint_body_in_subtype_constraint_decl1230);
            subtype_constraint_body();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "subtype_constraint_decl"


    // $ANTLR start "subtype_constraint_head"
    // OWLSchema.g:555:1: subtype_constraint_head : ^( SUBTYPE_CONSTRAINT_HEAD subtype_constraint_id entity_ref ) ;
    public final void subtype_constraint_head() throws RecognitionException {
        try {
            // OWLSchema.g:556:3: ( ^( SUBTYPE_CONSTRAINT_HEAD subtype_constraint_id entity_ref ) )
            // OWLSchema.g:556:6: ^( SUBTYPE_CONSTRAINT_HEAD subtype_constraint_id entity_ref )
            {
            match(input,SUBTYPE_CONSTRAINT_HEAD,FOLLOW_SUBTYPE_CONSTRAINT_HEAD_in_subtype_constraint_head1245); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subtype_constraint_id_in_subtype_constraint_head1247);
            subtype_constraint_id();

            state._fsp--;

            pushFollow(FOLLOW_entity_ref_in_subtype_constraint_head1249);
            entity_ref();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "subtype_constraint_head"


    // $ANTLR start "subtype_constraint_body"
    // OWLSchema.g:559:1: subtype_constraint_body : ^( SUBTYPE_CONSTRAINT_BODY ( abstract_supertype )? ( total_over )? ( supertype_expression )? ) ;
    public final void subtype_constraint_body() throws RecognitionException {
        try {
            // OWLSchema.g:560:3: ( ^( SUBTYPE_CONSTRAINT_BODY ( abstract_supertype )? ( total_over )? ( supertype_expression )? ) )
            // OWLSchema.g:560:6: ^( SUBTYPE_CONSTRAINT_BODY ( abstract_supertype )? ( total_over )? ( supertype_expression )? )
            {
            match(input,SUBTYPE_CONSTRAINT_BODY,FOLLOW_SUBTYPE_CONSTRAINT_BODY_in_subtype_constraint_body1266); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:560:32: ( abstract_supertype )?
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==ABSTRACT_SUPERTYPE) ) {
                    alt39=1;
                }
                switch (alt39) {
                    case 1 :
                        // OWLSchema.g:560:34: abstract_supertype
                        {
                        pushFollow(FOLLOW_abstract_supertype_in_subtype_constraint_body1270);
                        abstract_supertype();

                        state._fsp--;


                        }
                        break;

                }

                // OWLSchema.g:560:56: ( total_over )?
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==TOTAL_OVER) ) {
                    alt40=1;
                }
                switch (alt40) {
                    case 1 :
                        // OWLSchema.g:560:58: total_over
                        {
                        pushFollow(FOLLOW_total_over_in_subtype_constraint_body1277);
                        total_over();

                        state._fsp--;


                        }
                        break;

                }

                // OWLSchema.g:560:72: ( supertype_expression )?
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==SUPERTYPE_EXPRESSION) ) {
                    alt41=1;
                }
                switch (alt41) {
                    case 1 :
                        // OWLSchema.g:560:74: supertype_expression
                        {
                        pushFollow(FOLLOW_supertype_expression_in_subtype_constraint_body1284);
                        supertype_expression();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "subtype_constraint_body"


    // $ANTLR start "subtype_constraint_id"
    // OWLSchema.g:563:1: subtype_constraint_id : ^( SUBTYPE_CONSTRAINT_ID IDENT ) ;
    public final void subtype_constraint_id() throws RecognitionException {
        try {
            // OWLSchema.g:564:3: ( ^( SUBTYPE_CONSTRAINT_ID IDENT ) )
            // OWLSchema.g:564:6: ^( SUBTYPE_CONSTRAINT_ID IDENT )
            {
            match(input,SUBTYPE_CONSTRAINT_ID,FOLLOW_SUBTYPE_CONSTRAINT_ID_in_subtype_constraint_id1304); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_subtype_constraint_id1307); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "subtype_constraint_id"


    // $ANTLR start "abstract_supertype"
    // OWLSchema.g:567:1: abstract_supertype : ^( ABSTRACT_SUPERTYPE nothing ) ;
    public final void abstract_supertype() throws RecognitionException {
        try {
            // OWLSchema.g:568:3: ( ^( ABSTRACT_SUPERTYPE nothing ) )
            // OWLSchema.g:568:6: ^( ABSTRACT_SUPERTYPE nothing )
            {
            match(input,ABSTRACT_SUPERTYPE,FOLLOW_ABSTRACT_SUPERTYPE_in_abstract_supertype1323); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_nothing_in_abstract_supertype1325);
                nothing();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "abstract_supertype"


    // $ANTLR start "total_over"
    // OWLSchema.g:571:1: total_over : ^( TOTAL_OVER entity_ref ( entity_ref )* ) ;
    public final void total_over() throws RecognitionException {
        try {
            // OWLSchema.g:572:3: ( ^( TOTAL_OVER entity_ref ( entity_ref )* ) )
            // OWLSchema.g:572:6: ^( TOTAL_OVER entity_ref ( entity_ref )* )
            {
            match(input,TOTAL_OVER,FOLLOW_TOTAL_OVER_in_total_over1341); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_entity_ref_in_total_over1343);
            entity_ref();

            state._fsp--;

            // OWLSchema.g:572:30: ( entity_ref )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==ENTITY_REF) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // OWLSchema.g:572:32: entity_ref
            	    {
            	    pushFollow(FOLLOW_entity_ref_in_total_over1347);
            	    entity_ref();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "total_over"


    // $ANTLR start "explicit_attr"
    // OWLSchema.g:575:1: explicit_attr : ^( EXPLICIT_ATTR (decl= attribute_decl )+ (optional= 'optional' )? type= base_type ) ;
    public final void explicit_attr() throws RecognitionException {
        CommonTree optional=null;
        attribute_decl_return decl = null;

        OWLClass type = null;



        	List<String> attr = new ArrayList<String>();
        	List<OWLDataProperty> redecl = new ArrayList<OWLDataProperty>();
        	lb = 1;
        	hb = 1;

        try {
            // OWLSchema.g:583:3: ( ^( EXPLICIT_ATTR (decl= attribute_decl )+ (optional= 'optional' )? type= base_type ) )
            // OWLSchema.g:583:6: ^( EXPLICIT_ATTR (decl= attribute_decl )+ (optional= 'optional' )? type= base_type )
            {
            match(input,EXPLICIT_ATTR,FOLLOW_EXPLICIT_ATTR_in_explicit_attr1372); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:583:22: (decl= attribute_decl )+
            int cnt43=0;
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==ATTRIBUTE_DECL) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // OWLSchema.g:583:23: decl= attribute_decl
            	    {
            	    pushFollow(FOLLOW_attribute_decl_in_explicit_attr1377);
            	    decl=attribute_decl();

            	    state._fsp--;


            	    			if ((decl!=null?decl.name:null) != null)
            	    				attr.add((decl!=null?decl.name:null).toLowerCase());
            	    			if ((decl!=null?decl.owldp:null) != null)
            	    				redecl.add((decl!=null?decl.owldp:null));
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt43 >= 1 ) break loop43;
                        EarlyExitException eee =
                            new EarlyExitException(43, input);
                        throw eee;
                }
                cnt43++;
            } while (true);

            // OWLSchema.g:590:15: (optional= 'optional' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==299) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // OWLSchema.g:590:15: optional= 'optional'
                    {
                    optional=(CommonTree)match(input,299,FOLLOW_299_in_explicit_attr1392); 

                    }
                    break;

            }

            pushFollow(FOLLOW_base_type_in_explicit_attr1397);
            type=base_type();

            state._fsp--;


            match(input, Token.UP, null); 

            			for(String s : attr)
            			{
            				OWLClass cl = type;
            				if (cl != null)
            				{
            					OWLObjectProperty op = h.getOP(h.getOPName(currentClass.getIRI().getFragment(), s));
            					addAxiom(h.getOPDomainAxiom(op, currentClass));
            					OWLAnnotation owlt = h.getOCAType(cl.getIRI().getFragment());
            					addAxiom(h.getAnnotationAxiom(op.getIRI(), owlt));
            					OWLAnnotation owlpi = h.getOCAParameterIndex(pi++);
            					addAxiom(h.getAnnotationAxiom(op.getIRI(), owlpi));
            					
            					OWLClassExpression range;
            					if (optional != null)
            						range = h.getOUnionOf(nothing, cl);
            					else
            						range = cl;

            					OWLObjectAllValuesFrom oar = h.getOAllRestriction(op, range);
            					addAxiom(h.getSubClassAxiom(currentClass, oar));
            					
            					if (bOnlyRL)
            					{
            						OWLObjectMaxCardinality oecr = h.getOMaxCardRestriction(op, 1);
            						addAxiom(h.getSubClassAxiom(currentClass, oecr));
            					}
            					else
            					{
            						OWLObjectExactCardinality oecr = h.getOExactCardRestriction(op, 1);
            						addAxiom(h.getSubClassAxiom(currentClass, oecr));
            					}
            					
            					OWLObjectProperty opElement = h.getOP(cl.getIRI().getFragment() + "_has_element");
            					if (currentOntology.containsObjectPropertyInSignature(opElement.getIRI()))
            					{
            						List<OWLObjectProperty> l = new ArrayList<OWLObjectProperty>(2);
            						l.add(op);
            						l.add(opElement);
            						//addAxiom(h.getOPChain(l, h.getOP(g.getOPName(currentClass.getIRI().getFragment(), s + "2")));
            					}
            				}
            			}
            		

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "explicit_attr"

    public static class attribute_decl_return extends TreeRuleReturnScope {
        public String name;
        public OWLDataProperty owldp;
    };

    // $ANTLR start "attribute_decl"
    // OWLSchema.g:638:1: attribute_decl returns [String name, OWLDataProperty owldp] : ^( ATTRIBUTE_DECL (id= attribute_id | ra= redeclared_attribute ) ) ;
    public final attribute_decl_return attribute_decl() throws RecognitionException {
        attribute_decl_return retval = new attribute_decl_return();
        retval.start = input.LT(1);

        String id = null;

        OWLDataProperty ra = null;


        try {
            // OWLSchema.g:639:3: ( ^( ATTRIBUTE_DECL (id= attribute_id | ra= redeclared_attribute ) ) )
            // OWLSchema.g:639:6: ^( ATTRIBUTE_DECL (id= attribute_id | ra= redeclared_attribute ) )
            {
            match(input,ATTRIBUTE_DECL,FOLLOW_ATTRIBUTE_DECL_in_attribute_decl1427); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:639:23: (id= attribute_id | ra= redeclared_attribute )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==ATTRIBUTE_ID) ) {
                alt45=1;
            }
            else if ( (LA45_0==REDECLARED_ATTRIBUTE) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // OWLSchema.g:639:25: id= attribute_id
                    {
                    pushFollow(FOLLOW_attribute_id_in_attribute_decl1433);
                    id=attribute_id();

                    state._fsp--;

                    retval.name = id;

                    }
                    break;
                case 2 :
                    // OWLSchema.g:639:57: ra= redeclared_attribute
                    {
                    pushFollow(FOLLOW_redeclared_attribute_in_attribute_decl1441);
                    ra=redeclared_attribute();

                    state._fsp--;

                    retval.owldp = ra;

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "attribute_decl"


    // $ANTLR start "redeclared_attribute"
    // OWLSchema.g:642:1: redeclared_attribute returns [OWLDataProperty owldp] : ^( REDECLARED_ATTRIBUTE qualified_attribute ( attribute_id )? ) ;
    public final OWLDataProperty redeclared_attribute() throws RecognitionException {
        OWLDataProperty owldp = null;

        try {
            // OWLSchema.g:643:3: ( ^( REDECLARED_ATTRIBUTE qualified_attribute ( attribute_id )? ) )
            // OWLSchema.g:643:6: ^( REDECLARED_ATTRIBUTE qualified_attribute ( attribute_id )? )
            {
            match(input,REDECLARED_ATTRIBUTE,FOLLOW_REDECLARED_ATTRIBUTE_in_redeclared_attribute1465); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_qualified_attribute_in_redeclared_attribute1467);
            qualified_attribute();

            state._fsp--;

            // OWLSchema.g:643:49: ( attribute_id )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==ATTRIBUTE_ID) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // OWLSchema.g:643:51: attribute_id
                    {
                    pushFollow(FOLLOW_attribute_id_in_redeclared_attribute1471);
                    attribute_id();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owldp;
    }
    // $ANTLR end "redeclared_attribute"


    // $ANTLR start "attribute_id"
    // OWLSchema.g:646:1: attribute_id returns [String name] : ^( ATTRIBUTE_ID IDENT ) ;
    public final String attribute_id() throws RecognitionException {
        String name = null;

        CommonTree IDENT2=null;

        try {
            // OWLSchema.g:647:3: ( ^( ATTRIBUTE_ID IDENT ) )
            // OWLSchema.g:647:6: ^( ATTRIBUTE_ID IDENT )
            {
            match(input,ATTRIBUTE_ID,FOLLOW_ATTRIBUTE_ID_in_attribute_id1495); 

            match(input, Token.DOWN, null); 
            IDENT2=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_attribute_id1497); 

            match(input, Token.UP, null); 

            			name = (IDENT2!=null?IDENT2.getText():null).toLowerCase();
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return name;
    }
    // $ANTLR end "attribute_id"


    // $ANTLR start "qualified_attribute"
    // OWLSchema.g:653:1: qualified_attribute : ^( QUALIFIED_ATTRIBUTE group_qualifier attribute_qualifier ) ;
    public final void qualified_attribute() throws RecognitionException {
        try {
            // OWLSchema.g:654:3: ( ^( QUALIFIED_ATTRIBUTE group_qualifier attribute_qualifier ) )
            // OWLSchema.g:654:6: ^( QUALIFIED_ATTRIBUTE group_qualifier attribute_qualifier )
            {
            match(input,QUALIFIED_ATTRIBUTE,FOLLOW_QUALIFIED_ATTRIBUTE_in_qualified_attribute1517); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_group_qualifier_in_qualified_attribute1519);
            group_qualifier();

            state._fsp--;

            pushFollow(FOLLOW_attribute_qualifier_in_qualified_attribute1521);
            attribute_qualifier();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "qualified_attribute"


    // $ANTLR start "derive_clause"
    // OWLSchema.g:657:1: derive_clause : ^( DERIVE_CLAUSE derived_attr ( derived_attr )* ) ;
    public final void derive_clause() throws RecognitionException {
        try {
            // OWLSchema.g:658:3: ( ^( DERIVE_CLAUSE derived_attr ( derived_attr )* ) )
            // OWLSchema.g:658:6: ^( DERIVE_CLAUSE derived_attr ( derived_attr )* )
            {
            match(input,DERIVE_CLAUSE,FOLLOW_DERIVE_CLAUSE_in_derive_clause1537); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_derived_attr_in_derive_clause1539);
            derived_attr();

            state._fsp--;

            // OWLSchema.g:658:35: ( derived_attr )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==DERIVED_ATTR) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // OWLSchema.g:658:36: derived_attr
            	    {
            	    pushFollow(FOLLOW_derived_attr_in_derive_clause1542);
            	    derived_attr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "derive_clause"


    // $ANTLR start "derived_attr"
    // OWLSchema.g:661:1: derived_attr : ^( DERIVED_ATTR attribute_decl base_type expression ) ;
    public final void derived_attr() throws RecognitionException {
        try {
            // OWLSchema.g:662:3: ( ^( DERIVED_ATTR attribute_decl base_type expression ) )
            // OWLSchema.g:662:6: ^( DERIVED_ATTR attribute_decl base_type expression )
            {
            match(input,DERIVED_ATTR,FOLLOW_DERIVED_ATTR_in_derived_attr1561); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_attribute_decl_in_derived_attr1563);
            attribute_decl();

            state._fsp--;

            pushFollow(FOLLOW_base_type_in_derived_attr1565);
            base_type();

            state._fsp--;

            pushFollow(FOLLOW_expression_in_derived_attr1567);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "derived_attr"


    // $ANTLR start "inverse_clause"
    // OWLSchema.g:665:1: inverse_clause : ^( INVERSE_CLAUSE inverse_attr ( inverse_attr )* ) ;
    public final void inverse_clause() throws RecognitionException {
        try {
            // OWLSchema.g:666:3: ( ^( INVERSE_CLAUSE inverse_attr ( inverse_attr )* ) )
            // OWLSchema.g:666:6: ^( INVERSE_CLAUSE inverse_attr ( inverse_attr )* )
            {
            match(input,INVERSE_CLAUSE,FOLLOW_INVERSE_CLAUSE_in_inverse_clause1583); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_inverse_attr_in_inverse_clause1585);
            inverse_attr();

            state._fsp--;

            // OWLSchema.g:666:36: ( inverse_attr )*
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==INVERSE_ATTR) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // OWLSchema.g:666:37: inverse_attr
            	    {
            	    pushFollow(FOLLOW_inverse_attr_in_inverse_clause1588);
            	    inverse_attr();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "inverse_clause"


    // $ANTLR start "inverse_attr"
    // OWLSchema.g:669:1: inverse_attr : ^( INVERSE_ATTR attribute_decl ( ( 'set' | 'bag' ) ( bound_spec )? )? entity_ref attribute_ref ) ;
    public final void inverse_attr() throws RecognitionException {
        try {
            // OWLSchema.g:670:3: ( ^( INVERSE_ATTR attribute_decl ( ( 'set' | 'bag' ) ( bound_spec )? )? entity_ref attribute_ref ) )
            // OWLSchema.g:670:6: ^( INVERSE_ATTR attribute_decl ( ( 'set' | 'bag' ) ( bound_spec )? )? entity_ref attribute_ref )
            {
            match(input,INVERSE_ATTR,FOLLOW_INVERSE_ATTR_in_inverse_attr1607); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_attribute_decl_in_inverse_attr1609);
            attribute_decl();

            state._fsp--;

            // OWLSchema.g:670:36: ( ( 'set' | 'bag' ) ( bound_spec )? )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==301||LA50_0==322) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // OWLSchema.g:670:38: ( 'set' | 'bag' ) ( bound_spec )?
                    {
                    if ( input.LA(1)==301||input.LA(1)==322 ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }

                    // OWLSchema.g:670:56: ( bound_spec )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( (LA49_0==BOUND_SPEC) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // OWLSchema.g:670:58: bound_spec
                            {
                            pushFollow(FOLLOW_bound_spec_in_inverse_attr1625);
                            bound_spec();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;

            }

            pushFollow(FOLLOW_entity_ref_in_inverse_attr1633);
            entity_ref();

            state._fsp--;

            pushFollow(FOLLOW_attribute_ref_in_inverse_attr1635);
            attribute_ref();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "inverse_attr"


    // $ANTLR start "unique_clause"
    // OWLSchema.g:673:1: unique_clause : ^( UNIQUE_CLAUSE unique_rule ( unique_rule )* ) ;
    public final void unique_clause() throws RecognitionException {
        try {
            // OWLSchema.g:674:3: ( ^( UNIQUE_CLAUSE unique_rule ( unique_rule )* ) )
            // OWLSchema.g:674:6: ^( UNIQUE_CLAUSE unique_rule ( unique_rule )* )
            {
            match(input,UNIQUE_CLAUSE,FOLLOW_UNIQUE_CLAUSE_in_unique_clause1651); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_unique_rule_in_unique_clause1653);
            unique_rule();

            state._fsp--;

            // OWLSchema.g:674:34: ( unique_rule )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==UNIQUE_RULE) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // OWLSchema.g:674:36: unique_rule
            	    {
            	    pushFollow(FOLLOW_unique_rule_in_unique_clause1657);
            	    unique_rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "unique_clause"


    // $ANTLR start "unique_rule"
    // OWLSchema.g:677:1: unique_rule : ^( UNIQUE_RULE ( label )? referenced_attribute ( referenced_attribute )* ) ;
    public final void unique_rule() throws RecognitionException {
        try {
            // OWLSchema.g:678:3: ( ^( UNIQUE_RULE ( label )? referenced_attribute ( referenced_attribute )* ) )
            // OWLSchema.g:678:5: ^( UNIQUE_RULE ( label )? referenced_attribute ( referenced_attribute )* )
            {
            match(input,UNIQUE_RULE,FOLLOW_UNIQUE_RULE_in_unique_rule1676); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:678:19: ( label )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==LABEL) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // OWLSchema.g:678:21: label
                    {
                    pushFollow(FOLLOW_label_in_unique_rule1680);
                    label();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_referenced_attribute_in_unique_rule1685);
            referenced_attribute();

            state._fsp--;

            // OWLSchema.g:678:51: ( referenced_attribute )*
            loop53:
            do {
                int alt53=2;
                int LA53_0 = input.LA(1);

                if ( (LA53_0==REFERENCED_ATTRIBUTE) ) {
                    alt53=1;
                }


                switch (alt53) {
            	case 1 :
            	    // OWLSchema.g:678:53: referenced_attribute
            	    {
            	    pushFollow(FOLLOW_referenced_attribute_in_unique_rule1689);
            	    referenced_attribute();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop53;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "unique_rule"


    // $ANTLR start "referenced_attribute"
    // OWLSchema.g:681:1: referenced_attribute : ^( REFERENCED_ATTRIBUTE ( attribute_ref | qualified_attribute ) ) ;
    public final void referenced_attribute() throws RecognitionException {
        try {
            // OWLSchema.g:682:3: ( ^( REFERENCED_ATTRIBUTE ( attribute_ref | qualified_attribute ) ) )
            // OWLSchema.g:682:6: ^( REFERENCED_ATTRIBUTE ( attribute_ref | qualified_attribute ) )
            {
            match(input,REFERENCED_ATTRIBUTE,FOLLOW_REFERENCED_ATTRIBUTE_in_referenced_attribute1707); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:682:29: ( attribute_ref | qualified_attribute )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==ATTRIBUTE_REF) ) {
                alt54=1;
            }
            else if ( (LA54_0==QUALIFIED_ATTRIBUTE) ) {
                alt54=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;
            }
            switch (alt54) {
                case 1 :
                    // OWLSchema.g:683:6: attribute_ref
                    {
                    pushFollow(FOLLOW_attribute_ref_in_referenced_attribute1716);
                    attribute_ref();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:684:6: qualified_attribute
                    {
                    pushFollow(FOLLOW_qualified_attribute_in_referenced_attribute1723);
                    qualified_attribute();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "referenced_attribute"


    // $ANTLR start "entity_constructor"
    // OWLSchema.g:688:1: entity_constructor : ^( ENTITY_CONSTRUCTOR entity_ref ( expression ( expression )* )? ) ;
    public final void entity_constructor() throws RecognitionException {
        try {
            // OWLSchema.g:689:3: ( ^( ENTITY_CONSTRUCTOR entity_ref ( expression ( expression )* )? ) )
            // OWLSchema.g:689:6: ^( ENTITY_CONSTRUCTOR entity_ref ( expression ( expression )* )? )
            {
            match(input,ENTITY_CONSTRUCTOR,FOLLOW_ENTITY_CONSTRUCTOR_in_entity_constructor1743); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_entity_ref_in_entity_constructor1745);
            entity_ref();

            state._fsp--;

            // OWLSchema.g:689:39: ( expression ( expression )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==EXPRESSION) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // OWLSchema.g:689:42: expression ( expression )*
                    {
                    pushFollow(FOLLOW_expression_in_entity_constructor1751);
                    expression();

                    state._fsp--;

                    // OWLSchema.g:689:54: ( expression )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==EXPRESSION) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // OWLSchema.g:689:56: expression
                    	    {
                    	    pushFollow(FOLLOW_expression_in_entity_constructor1756);
                    	    expression();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entity_constructor"

    public static class entity_id_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "entity_id"
    // OWLSchema.g:692:1: entity_id : ^( ENTITY_ID IDENT ) ;
    public final entity_id_return entity_id() throws RecognitionException {
        entity_id_return retval = new entity_id_return();
        retval.start = input.LT(1);

        try {
            // OWLSchema.g:693:3: ( ^( ENTITY_ID IDENT ) )
            // OWLSchema.g:693:5: ^( ENTITY_ID IDENT )
            {
            match(input,ENTITY_ID,FOLLOW_ENTITY_ID_in_entity_id1781); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_entity_id1783); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entity_id"


    // $ANTLR start "enumeration_reference"
    // OWLSchema.g:696:1: enumeration_reference : ^( ENUMERATION_REFERENCE ( type_ref )? enumeration_ref ) ;
    public final void enumeration_reference() throws RecognitionException {
        try {
            // OWLSchema.g:697:3: ( ^( ENUMERATION_REFERENCE ( type_ref )? enumeration_ref ) )
            // OWLSchema.g:697:5: ^( ENUMERATION_REFERENCE ( type_ref )? enumeration_ref )
            {
            match(input,ENUMERATION_REFERENCE,FOLLOW_ENUMERATION_REFERENCE_in_enumeration_reference1798); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:697:29: ( type_ref )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==TYPE_REF) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // OWLSchema.g:697:32: type_ref
                    {
                    pushFollow(FOLLOW_type_ref_in_enumeration_reference1803);
                    type_ref();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_enumeration_ref_in_enumeration_reference1809);
            enumeration_ref();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "enumeration_reference"


    // $ANTLR start "escape_stmt"
    // OWLSchema.g:700:1: escape_stmt : ^( ESCAPE_STMT nothing ) ;
    public final void escape_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:701:3: ( ^( ESCAPE_STMT nothing ) )
            // OWLSchema.g:701:5: ^( ESCAPE_STMT nothing )
            {
            match(input,ESCAPE_STMT,FOLLOW_ESCAPE_STMT_in_escape_stmt1824); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_nothing_in_escape_stmt1826);
                nothing();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "escape_stmt"

    public static class expression_return extends TreeRuleReturnScope {
        public Integer intVal;
        public Double doubleVal;
    };

    // $ANTLR start "expression"
    // OWLSchema.g:704:1: expression returns [Integer intVal, Double doubleVal] : ^( EXPRESSION se= simple_expression ( rel_op_extended simple_expression )? ) ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);

        simple_expression_return se = null;


        try {
            // OWLSchema.g:705:3: ( ^( EXPRESSION se= simple_expression ( rel_op_extended simple_expression )? ) )
            // OWLSchema.g:705:5: ^( EXPRESSION se= simple_expression ( rel_op_extended simple_expression )? )
            {
            match(input,EXPRESSION,FOLLOW_EXPRESSION_in_expression1845); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_simple_expression_in_expression1849);
            se=simple_expression();

            state._fsp--;


            			retval.intVal = (se!=null?se.intVal:null);
            			retval.doubleVal = (se!=null?se.doubleVal:null);
            		
            // OWLSchema.g:710:3: ( rel_op_extended simple_expression )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==REL_OP_EXTENDED) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // OWLSchema.g:710:5: rel_op_extended simple_expression
                    {
                    pushFollow(FOLLOW_rel_op_extended_in_expression1860);
                    rel_op_extended();

                    state._fsp--;

                    pushFollow(FOLLOW_simple_expression_in_expression1862);
                    simple_expression();

                    state._fsp--;


                    			retval.intVal = null;
                    			retval.doubleVal = null;
                    		

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"


    // $ANTLR start "rel_op_extended"
    // OWLSchema.g:718:1: rel_op_extended : ^( REL_OP_EXTENDED ( rel_op | 'in' | 'like' ) ) ;
    public final void rel_op_extended() throws RecognitionException {
        try {
            // OWLSchema.g:719:3: ( ^( REL_OP_EXTENDED ( rel_op | 'in' | 'like' ) ) )
            // OWLSchema.g:719:6: ^( REL_OP_EXTENDED ( rel_op | 'in' | 'like' ) )
            {
            match(input,REL_OP_EXTENDED,FOLLOW_REL_OP_EXTENDED_in_rel_op_extended1888); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:719:24: ( rel_op | 'in' | 'like' )
            int alt59=3;
            switch ( input.LA(1) ) {
            case REL_OP:
                {
                alt59=1;
                }
                break;
            case 350:
                {
                alt59=2;
                }
                break;
            case 351:
                {
                alt59=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 59, 0, input);

                throw nvae;
            }

            switch (alt59) {
                case 1 :
                    // OWLSchema.g:720:5: rel_op
                    {
                    pushFollow(FOLLOW_rel_op_in_rel_op_extended1896);
                    rel_op();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:721:5: 'in'
                    {
                    match(input,350,FOLLOW_350_in_rel_op_extended1902); 

                    }
                    break;
                case 3 :
                    // OWLSchema.g:722:5: 'like'
                    {
                    match(input,351,FOLLOW_351_in_rel_op_extended1908); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rel_op_extended"


    // $ANTLR start "rel_op"
    // OWLSchema.g:726:1: rel_op : ^( REL_OP ( LT | GT | LE | GE | LTGT | ASSIGN | COLLTGT | COLEQCOL ) ) ;
    public final void rel_op() throws RecognitionException {
        try {
            // OWLSchema.g:727:3: ( ^( REL_OP ( LT | GT | LE | GE | LTGT | ASSIGN | COLLTGT | COLEQCOL ) ) )
            // OWLSchema.g:727:6: ^( REL_OP ( LT | GT | LE | GE | LTGT | ASSIGN | COLLTGT | COLEQCOL ) )
            {
            match(input,REL_OP,FOLLOW_REL_OP_in_rel_op1928); 

            match(input, Token.DOWN, null); 
            if ( (input.LA(1)>=LT && input.LA(1)<=LE)||(input.LA(1)>=GT && input.LA(1)<=COLEQCOL) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rel_op"

    public static class factor_return extends TreeRuleReturnScope {
        public Integer intVal;
        public Double doubleVal;
    };

    // $ANTLR start "factor"
    // OWLSchema.g:739:1: factor returns [Integer intVal, Double doubleVal] : ^( FACTOR sf1= simple_factor (sf2= simple_factor )? ) ;
    public final factor_return factor() throws RecognitionException {
        factor_return retval = new factor_return();
        retval.start = input.LT(1);

        simple_factor_return sf1 = null;

        simple_factor_return sf2 = null;


        try {
            // OWLSchema.g:740:3: ( ^( FACTOR sf1= simple_factor (sf2= simple_factor )? ) )
            // OWLSchema.g:740:5: ^( FACTOR sf1= simple_factor (sf2= simple_factor )? )
            {
            match(input,FACTOR,FOLLOW_FACTOR_in_factor2011); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_simple_factor_in_factor2015);
            sf1=simple_factor();

            state._fsp--;

            // OWLSchema.g:740:32: (sf2= simple_factor )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==SIMPLE_FACTOR) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // OWLSchema.g:740:34: sf2= simple_factor
                    {
                    pushFollow(FOLLOW_simple_factor_in_factor2021);
                    sf2=simple_factor();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            			if (sf2 == null)
            			{
            				if ((sf1!=null?sf1.intVal:null) != null) retval.intVal = Integer.valueOf((sf1!=null?sf1.intVal:null).intValue());
            				if ((sf1!=null?sf1.doubleVal:null) != null) retval.doubleVal = new Double((sf1!=null?sf1.doubleVal:null).doubleValue());
            			}
            			else
            			{
            				if ((sf1!=null?sf1.intVal:null) != null)
            				{
            					if ((sf2!=null?sf2.intVal:null) != null) retval.intVal = Integer.valueOf((int)Math.pow((sf1!=null?sf1.intVal:null).doubleValue(), (sf2!=null?sf2.intVal:null).doubleValue()));
            					if ((sf2!=null?sf2.doubleVal:null) != null) retval.intVal = Integer.valueOf((int)Math.pow((sf1!=null?sf1.intVal:null).doubleValue(), (sf2!=null?sf2.doubleVal:null).doubleValue()));
            				}
            				if ((sf1!=null?sf1.doubleVal:null) != null) 
            				{
            					if ((sf2!=null?sf2.intVal:null) != null) retval.doubleVal = new Double(Math.pow((sf1!=null?sf1.doubleVal:null).doubleValue(), (sf2!=null?sf2.intVal:null).doubleValue()));
            					if ((sf2!=null?sf2.doubleVal:null) != null) retval.doubleVal = new Double(Math.pow((sf1!=null?sf1.doubleVal:null).doubleValue(), (sf2!=null?sf2.doubleVal:null).doubleValue()));
            				}
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "factor"


    // $ANTLR start "formal_parameter"
    // OWLSchema.g:764:1: formal_parameter : ^( FORMAL_PARAMETER parameter_id ( parameter_id )* parameter_type ) ;
    public final void formal_parameter() throws RecognitionException {
        try {
            // OWLSchema.g:765:3: ( ^( FORMAL_PARAMETER parameter_id ( parameter_id )* parameter_type ) )
            // OWLSchema.g:765:5: ^( FORMAL_PARAMETER parameter_id ( parameter_id )* parameter_type )
            {
            match(input,FORMAL_PARAMETER,FOLLOW_FORMAL_PARAMETER_in_formal_parameter2044); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_parameter_id_in_formal_parameter2046);
            parameter_id();

            state._fsp--;

            // OWLSchema.g:765:38: ( parameter_id )*
            loop61:
            do {
                int alt61=2;
                int LA61_0 = input.LA(1);

                if ( (LA61_0==PARAMETER_ID) ) {
                    alt61=1;
                }


                switch (alt61) {
            	case 1 :
            	    // OWLSchema.g:765:40: parameter_id
            	    {
            	    pushFollow(FOLLOW_parameter_id_in_formal_parameter2051);
            	    parameter_id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop61;
                }
            } while (true);

            pushFollow(FOLLOW_parameter_type_in_formal_parameter2058);
            parameter_type();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "formal_parameter"


    // $ANTLR start "attribute_qualifier"
    // OWLSchema.g:769:1: attribute_qualifier : ^( ATTRIBUTE_QUALIFIER attribute_ref ) ;
    public final void attribute_qualifier() throws RecognitionException {
        try {
            // OWLSchema.g:770:3: ( ^( ATTRIBUTE_QUALIFIER attribute_ref ) )
            // OWLSchema.g:770:5: ^( ATTRIBUTE_QUALIFIER attribute_ref )
            {
            match(input,ATTRIBUTE_QUALIFIER,FOLLOW_ATTRIBUTE_QUALIFIER_in_attribute_qualifier2075); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_attribute_ref_in_attribute_qualifier2077);
            attribute_ref();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "attribute_qualifier"


    // $ANTLR start "function_call"
    // OWLSchema.g:774:1: function_call : ^( FUNCTION_CALL ( function_ref | built_in_function ) ( actual_parameter_list )? ) ;
    public final void function_call() throws RecognitionException {
        try {
            // OWLSchema.g:775:3: ( ^( FUNCTION_CALL ( function_ref | built_in_function ) ( actual_parameter_list )? ) )
            // OWLSchema.g:775:5: ^( FUNCTION_CALL ( function_ref | built_in_function ) ( actual_parameter_list )? )
            {
            match(input,FUNCTION_CALL,FOLLOW_FUNCTION_CALL_in_function_call2094); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:775:21: ( function_ref | built_in_function )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==FUNCTION_REF) ) {
                alt62=1;
            }
            else if ( (LA62_0==BUILT_IN_FUNCTION) ) {
                alt62=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;
            }
            switch (alt62) {
                case 1 :
                    // OWLSchema.g:775:23: function_ref
                    {
                    pushFollow(FOLLOW_function_ref_in_function_call2098);
                    function_ref();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:775:38: built_in_function
                    {
                    pushFollow(FOLLOW_built_in_function_in_function_call2102);
                    built_in_function();

                    state._fsp--;


                    }
                    break;

            }

            // OWLSchema.g:775:59: ( actual_parameter_list )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==ACTUAL_PARAMETER_LIST) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // OWLSchema.g:775:62: actual_parameter_list
                    {
                    pushFollow(FOLLOW_actual_parameter_list_in_function_call2110);
                    actual_parameter_list();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function_call"


    // $ANTLR start "built_in_function"
    // OWLSchema.g:778:1: built_in_function : ^( BUILT_IN_FUNCTION ( 'abs' | 'acos' | 'asin' | 'atan' | 'blength' | 'cos' | 'exists' | 'exp' | 'format' | 'hibound' | 'hiindex' | 'length' | 'lobound' | 'loindex' | 'log' | 'log2' | 'log10' | 'nvl' | 'odd' | 'rolesof' | 'sin' | 'sizeof' | 'sqrt' | 'tan' | 'typeof' | 'usedin' | 'value' | 'value_in' | 'value_unique' ) ) ;
    public final void built_in_function() throws RecognitionException {
        try {
            // OWLSchema.g:779:3: ( ^( BUILT_IN_FUNCTION ( 'abs' | 'acos' | 'asin' | 'atan' | 'blength' | 'cos' | 'exists' | 'exp' | 'format' | 'hibound' | 'hiindex' | 'length' | 'lobound' | 'loindex' | 'log' | 'log2' | 'log10' | 'nvl' | 'odd' | 'rolesof' | 'sin' | 'sizeof' | 'sqrt' | 'tan' | 'typeof' | 'usedin' | 'value' | 'value_in' | 'value_unique' ) ) )
            // OWLSchema.g:779:6: ^( BUILT_IN_FUNCTION ( 'abs' | 'acos' | 'asin' | 'atan' | 'blength' | 'cos' | 'exists' | 'exp' | 'format' | 'hibound' | 'hiindex' | 'length' | 'lobound' | 'loindex' | 'log' | 'log2' | 'log10' | 'nvl' | 'odd' | 'rolesof' | 'sin' | 'sizeof' | 'sqrt' | 'tan' | 'typeof' | 'usedin' | 'value' | 'value_in' | 'value_unique' ) )
            {
            match(input,BUILT_IN_FUNCTION,FOLLOW_BUILT_IN_FUNCTION_in_built_in_function2130); 

            match(input, Token.DOWN, null); 
            if ( (input.LA(1)>=FUNCTION_ABS && input.LA(1)<=FUNCTION_SIZEOF) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "built_in_function"


    // $ANTLR start "function_decl"
    // OWLSchema.g:812:1: function_decl : ^( FUNCTION_DECL function_head ( algorithm_head )? stmt ( stmt )* ) ;
    public final void function_decl() throws RecognitionException {
        try {
            // OWLSchema.g:813:3: ( ^( FUNCTION_DECL function_head ( algorithm_head )? stmt ( stmt )* ) )
            // OWLSchema.g:813:6: ^( FUNCTION_DECL function_head ( algorithm_head )? stmt ( stmt )* )
            {
            match(input,FUNCTION_DECL,FOLLOW_FUNCTION_DECL_in_function_decl2412); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_function_head_in_function_decl2414);
            function_head();

            state._fsp--;

            // OWLSchema.g:813:36: ( algorithm_head )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==ALGORITHM_HEAD) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // OWLSchema.g:813:38: algorithm_head
                    {
                    pushFollow(FOLLOW_algorithm_head_in_function_decl2418);
                    algorithm_head();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_stmt_in_function_decl2423);
            stmt();

            state._fsp--;

            // OWLSchema.g:813:62: ( stmt )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==STMT) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // OWLSchema.g:813:65: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_function_decl2429);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function_decl"


    // $ANTLR start "function_head"
    // OWLSchema.g:816:1: function_head : ^( FUNCTION_HEAD function_id ( formal_parameter ( formal_parameter )* )? parameter_type ) ;
    public final void function_head() throws RecognitionException {
        try {
            // OWLSchema.g:817:3: ( ^( FUNCTION_HEAD function_id ( formal_parameter ( formal_parameter )* )? parameter_type ) )
            // OWLSchema.g:817:6: ^( FUNCTION_HEAD function_id ( formal_parameter ( formal_parameter )* )? parameter_type )
            {
            match(input,FUNCTION_HEAD,FOLLOW_FUNCTION_HEAD_in_function_head2449); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_function_id_in_function_head2452);
            function_id();

            state._fsp--;

            // OWLSchema.g:817:36: ( formal_parameter ( formal_parameter )* )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==FORMAL_PARAMETER) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // OWLSchema.g:817:38: formal_parameter ( formal_parameter )*
                    {
                    pushFollow(FOLLOW_formal_parameter_in_function_head2457);
                    formal_parameter();

                    state._fsp--;

                    // OWLSchema.g:817:56: ( formal_parameter )*
                    loop66:
                    do {
                        int alt66=2;
                        int LA66_0 = input.LA(1);

                        if ( (LA66_0==FORMAL_PARAMETER) ) {
                            alt66=1;
                        }


                        switch (alt66) {
                    	case 1 :
                    	    // OWLSchema.g:817:58: formal_parameter
                    	    {
                    	    pushFollow(FOLLOW_formal_parameter_in_function_head2462);
                    	    formal_parameter();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop66;
                        }
                    } while (true);


                    }
                    break;

            }

            pushFollow(FOLLOW_parameter_type_in_function_head2471);
            parameter_type();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function_head"


    // $ANTLR start "function_id"
    // OWLSchema.g:820:1: function_id : ^( FUNCTION_ID IDENT ) ;
    public final void function_id() throws RecognitionException {
        try {
            // OWLSchema.g:821:3: ( ^( FUNCTION_ID IDENT ) )
            // OWLSchema.g:821:5: ^( FUNCTION_ID IDENT )
            {
            match(input,FUNCTION_ID,FOLLOW_FUNCTION_ID_in_function_id2488); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_function_id2490); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function_id"


    // $ANTLR start "generalized_types"
    // OWLSchema.g:824:1: generalized_types : ^( GENERALIZED_TYPES ( aggregate_type | general_aggregation_types | generic_type | generic_entity_type ) ) ;
    public final void generalized_types() throws RecognitionException {
        try {
            // OWLSchema.g:825:3: ( ^( GENERALIZED_TYPES ( aggregate_type | general_aggregation_types | generic_type | generic_entity_type ) ) )
            // OWLSchema.g:825:6: ^( GENERALIZED_TYPES ( aggregate_type | general_aggregation_types | generic_type | generic_entity_type ) )
            {
            match(input,GENERALIZED_TYPES,FOLLOW_GENERALIZED_TYPES_in_generalized_types2506); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:825:26: ( aggregate_type | general_aggregation_types | generic_type | generic_entity_type )
            int alt68=4;
            switch ( input.LA(1) ) {
            case AGGREGATE_TYPE:
                {
                alt68=1;
                }
                break;
            case GENERAL_AGGREGATION_TYPES:
                {
                alt68=2;
                }
                break;
            case GENERIC_TYPE:
                {
                alt68=3;
                }
                break;
            case GENERIC_ENTITY_TYPE:
                {
                alt68=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;
            }

            switch (alt68) {
                case 1 :
                    // OWLSchema.g:826:5: aggregate_type
                    {
                    pushFollow(FOLLOW_aggregate_type_in_generalized_types2514);
                    aggregate_type();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:827:5: general_aggregation_types
                    {
                    pushFollow(FOLLOW_general_aggregation_types_in_generalized_types2522);
                    general_aggregation_types();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:828:5: generic_type
                    {
                    pushFollow(FOLLOW_generic_type_in_generalized_types2530);
                    generic_type();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // OWLSchema.g:829:5: generic_entity_type
                    {
                    pushFollow(FOLLOW_generic_entity_type_in_generalized_types2536);
                    generic_entity_type();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "generalized_types"


    // $ANTLR start "generic_entity_type"
    // OWLSchema.g:833:1: generic_entity_type : ^( GENERIC_ENTITY_TYPE nothing ) ;
    public final void generic_entity_type() throws RecognitionException {
        try {
            // OWLSchema.g:834:3: ( ^( GENERIC_ENTITY_TYPE nothing ) )
            // OWLSchema.g:834:6: ^( GENERIC_ENTITY_TYPE nothing )
            {
            match(input,GENERIC_ENTITY_TYPE,FOLLOW_GENERIC_ENTITY_TYPE_in_generic_entity_type2557); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_nothing_in_generic_entity_type2559);
                nothing();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "generic_entity_type"


    // $ANTLR start "general_aggregation_types"
    // OWLSchema.g:837:1: general_aggregation_types : ^( GENERAL_AGGREGATION_TYPES ( general_array_type | general_bag_type | general_list_type | general_set_type ) ) ;
    public final void general_aggregation_types() throws RecognitionException {
        try {
            // OWLSchema.g:838:3: ( ^( GENERAL_AGGREGATION_TYPES ( general_array_type | general_bag_type | general_list_type | general_set_type ) ) )
            // OWLSchema.g:838:6: ^( GENERAL_AGGREGATION_TYPES ( general_array_type | general_bag_type | general_list_type | general_set_type ) )
            {
            match(input,GENERAL_AGGREGATION_TYPES,FOLLOW_GENERAL_AGGREGATION_TYPES_in_general_aggregation_types2575); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:838:34: ( general_array_type | general_bag_type | general_list_type | general_set_type )
            int alt69=4;
            switch ( input.LA(1) ) {
            case GENERAL_ARRAY_TYPE:
                {
                alt69=1;
                }
                break;
            case GENERAL_BAG_TYPE:
                {
                alt69=2;
                }
                break;
            case GENERAL_LIST_TYPE:
                {
                alt69=3;
                }
                break;
            case GENERAL_SET_TYPE:
                {
                alt69=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;
            }

            switch (alt69) {
                case 1 :
                    // OWLSchema.g:839:5: general_array_type
                    {
                    pushFollow(FOLLOW_general_array_type_in_general_aggregation_types2583);
                    general_array_type();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:840:5: general_bag_type
                    {
                    pushFollow(FOLLOW_general_bag_type_in_general_aggregation_types2591);
                    general_bag_type();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:841:5: general_list_type
                    {
                    pushFollow(FOLLOW_general_list_type_in_general_aggregation_types2599);
                    general_list_type();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // OWLSchema.g:842:5: general_set_type
                    {
                    pushFollow(FOLLOW_general_set_type_in_general_aggregation_types2607);
                    general_set_type();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "general_aggregation_types"


    // $ANTLR start "general_array_type"
    // OWLSchema.g:846:1: general_array_type : ^( GENERAL_ARRAY_TYPE ( bound_spec )? ( 'optional' )? ( 'unique' )? parameter_type ) ;
    public final void general_array_type() throws RecognitionException {
        try {
            // OWLSchema.g:847:3: ( ^( GENERAL_ARRAY_TYPE ( bound_spec )? ( 'optional' )? ( 'unique' )? parameter_type ) )
            // OWLSchema.g:847:6: ^( GENERAL_ARRAY_TYPE ( bound_spec )? ( 'optional' )? ( 'unique' )? parameter_type )
            {
            match(input,GENERAL_ARRAY_TYPE,FOLLOW_GENERAL_ARRAY_TYPE_in_general_array_type2628); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:847:28: ( bound_spec )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==BOUND_SPEC) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // OWLSchema.g:847:31: bound_spec
                    {
                    pushFollow(FOLLOW_bound_spec_in_general_array_type2634);
                    bound_spec();

                    state._fsp--;


                    }
                    break;

            }

            // OWLSchema.g:847:47: ( 'optional' )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==299) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // OWLSchema.g:847:50: 'optional'
                    {
                    match(input,299,FOLLOW_299_in_general_array_type2644); 

                    }
                    break;

            }

            // OWLSchema.g:847:66: ( 'unique' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==300) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // OWLSchema.g:847:69: 'unique'
                    {
                    match(input,300,FOLLOW_300_in_general_array_type2654); 

                    }
                    break;

            }

            pushFollow(FOLLOW_parameter_type_in_general_array_type2661);
            parameter_type();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "general_array_type"


    // $ANTLR start "general_bag_type"
    // OWLSchema.g:850:1: general_bag_type : ^( GENERAL_BAG_TYPE ( bound_spec )? parameter_type ) ;
    public final void general_bag_type() throws RecognitionException {
        try {
            // OWLSchema.g:851:3: ( ^( GENERAL_BAG_TYPE ( bound_spec )? parameter_type ) )
            // OWLSchema.g:851:6: ^( GENERAL_BAG_TYPE ( bound_spec )? parameter_type )
            {
            match(input,GENERAL_BAG_TYPE,FOLLOW_GENERAL_BAG_TYPE_in_general_bag_type2678); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:851:26: ( bound_spec )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==BOUND_SPEC) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // OWLSchema.g:851:29: bound_spec
                    {
                    pushFollow(FOLLOW_bound_spec_in_general_bag_type2684);
                    bound_spec();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_parameter_type_in_general_bag_type2691);
            parameter_type();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "general_bag_type"


    // $ANTLR start "general_list_type"
    // OWLSchema.g:854:1: general_list_type : ^( GENERAL_LIST_TYPE ( bound_spec )? ( 'unique' )? parameter_type ) ;
    public final void general_list_type() throws RecognitionException {
        try {
            // OWLSchema.g:855:3: ( ^( GENERAL_LIST_TYPE ( bound_spec )? ( 'unique' )? parameter_type ) )
            // OWLSchema.g:855:6: ^( GENERAL_LIST_TYPE ( bound_spec )? ( 'unique' )? parameter_type )
            {
            match(input,GENERAL_LIST_TYPE,FOLLOW_GENERAL_LIST_TYPE_in_general_list_type2708); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:855:27: ( bound_spec )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==BOUND_SPEC) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // OWLSchema.g:855:30: bound_spec
                    {
                    pushFollow(FOLLOW_bound_spec_in_general_list_type2714);
                    bound_spec();

                    state._fsp--;


                    }
                    break;

            }

            // OWLSchema.g:855:46: ( 'unique' )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==300) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // OWLSchema.g:855:49: 'unique'
                    {
                    match(input,300,FOLLOW_300_in_general_list_type2724); 

                    }
                    break;

            }

            pushFollow(FOLLOW_parameter_type_in_general_list_type2731);
            parameter_type();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "general_list_type"


    // $ANTLR start "general_ref"
    // OWLSchema.g:858:1: general_ref : ^( GENERAL_REF ( parameter_ref | variable_ref ) ) ;
    public final void general_ref() throws RecognitionException {
        try {
            // OWLSchema.g:859:3: ( ^( GENERAL_REF ( parameter_ref | variable_ref ) ) )
            // OWLSchema.g:859:6: ^( GENERAL_REF ( parameter_ref | variable_ref ) )
            {
            match(input,GENERAL_REF,FOLLOW_GENERAL_REF_in_general_ref2748); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:859:20: ( parameter_ref | variable_ref )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==PARAMETER_REF) ) {
                alt76=1;
            }
            else if ( (LA76_0==VARIABLE_REF) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // OWLSchema.g:860:5: parameter_ref
                    {
                    pushFollow(FOLLOW_parameter_ref_in_general_ref2756);
                    parameter_ref();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:861:5: variable_ref
                    {
                    pushFollow(FOLLOW_variable_ref_in_general_ref2763);
                    variable_ref();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "general_ref"


    // $ANTLR start "general_set_type"
    // OWLSchema.g:865:1: general_set_type : ^( GENERAL_SET_TYPE ( bound_spec )? parameter_type ) ;
    public final void general_set_type() throws RecognitionException {
        try {
            // OWLSchema.g:866:3: ( ^( GENERAL_SET_TYPE ( bound_spec )? parameter_type ) )
            // OWLSchema.g:866:6: ^( GENERAL_SET_TYPE ( bound_spec )? parameter_type )
            {
            match(input,GENERAL_SET_TYPE,FOLLOW_GENERAL_SET_TYPE_in_general_set_type2783); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:866:26: ( bound_spec )?
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==BOUND_SPEC) ) {
                alt77=1;
            }
            switch (alt77) {
                case 1 :
                    // OWLSchema.g:866:29: bound_spec
                    {
                    pushFollow(FOLLOW_bound_spec_in_general_set_type2789);
                    bound_spec();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_parameter_type_in_general_set_type2796);
            parameter_type();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "general_set_type"


    // $ANTLR start "generic_type"
    // OWLSchema.g:869:1: generic_type : ^( GENERIC_TYPE ( type_label )? ) ;
    public final void generic_type() throws RecognitionException {
        try {
            // OWLSchema.g:870:3: ( ^( GENERIC_TYPE ( type_label )? ) )
            // OWLSchema.g:870:6: ^( GENERIC_TYPE ( type_label )? )
            {
            match(input,GENERIC_TYPE,FOLLOW_GENERIC_TYPE_in_generic_type2814); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:870:22: ( type_label )?
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==TYPE_LABEL) ) {
                    alt78=1;
                }
                switch (alt78) {
                    case 1 :
                        // OWLSchema.g:870:24: type_label
                        {
                        pushFollow(FOLLOW_type_label_in_generic_type2819);
                        type_label();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "generic_type"


    // $ANTLR start "group_qualifier"
    // OWLSchema.g:873:1: group_qualifier : ^( GROUP_QUALIFIER entity_ref ) ;
    public final void group_qualifier() throws RecognitionException {
        try {
            // OWLSchema.g:874:3: ( ^( GROUP_QUALIFIER entity_ref ) )
            // OWLSchema.g:874:6: ^( GROUP_QUALIFIER entity_ref )
            {
            match(input,GROUP_QUALIFIER,FOLLOW_GROUP_QUALIFIER_in_group_qualifier2841); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_entity_ref_in_group_qualifier2844);
            entity_ref();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "group_qualifier"


    // $ANTLR start "if_stmt"
    // OWLSchema.g:877:1: if_stmt : ^( IF_STMT logical_expression stmt ( stmt )* ( else_clause )? ) ;
    public final void if_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:878:3: ( ^( IF_STMT logical_expression stmt ( stmt )* ( else_clause )? ) )
            // OWLSchema.g:878:6: ^( IF_STMT logical_expression stmt ( stmt )* ( else_clause )? )
            {
            match(input,IF_STMT,FOLLOW_IF_STMT_in_if_stmt2861); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_logical_expression_in_if_stmt2864);
            logical_expression();

            state._fsp--;

            pushFollow(FOLLOW_stmt_in_if_stmt2867);
            stmt();

            state._fsp--;

            // OWLSchema.g:878:43: ( stmt )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==STMT) ) {
                    alt79=1;
                }


                switch (alt79) {
            	case 1 :
            	    // OWLSchema.g:878:46: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_if_stmt2873);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            // OWLSchema.g:878:56: ( else_clause )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==ELSE_CLAUSE) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // OWLSchema.g:878:58: else_clause
                    {
                    pushFollow(FOLLOW_else_clause_in_if_stmt2882);
                    else_clause();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "if_stmt"


    // $ANTLR start "else_clause"
    // OWLSchema.g:882:1: else_clause : ^( ELSE_CLAUSE stmt ( stmt )* ) ;
    public final void else_clause() throws RecognitionException {
        try {
            // OWLSchema.g:883:3: ( ^( ELSE_CLAUSE stmt ( stmt )* ) )
            // OWLSchema.g:883:6: ^( ELSE_CLAUSE stmt ( stmt )* )
            {
            match(input,ELSE_CLAUSE,FOLLOW_ELSE_CLAUSE_in_else_clause2906); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_stmt_in_else_clause2908);
            stmt();

            state._fsp--;

            // OWLSchema.g:883:25: ( stmt )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==STMT) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // OWLSchema.g:883:27: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_else_clause2912);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop81;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "else_clause"


    // $ANTLR start "increment"
    // OWLSchema.g:886:1: increment : ^( INCREMENT numeric_expression ) ;
    public final void increment() throws RecognitionException {
        try {
            // OWLSchema.g:887:3: ( ^( INCREMENT numeric_expression ) )
            // OWLSchema.g:887:6: ^( INCREMENT numeric_expression )
            {
            match(input,INCREMENT,FOLLOW_INCREMENT_in_increment2932); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numeric_expression_in_increment2934);
            numeric_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "increment"


    // $ANTLR start "increment_control"
    // OWLSchema.g:890:1: increment_control : ^( INCREMENT_CONTROL variable_id bound_1 bound_2 ( increment )? ) ;
    public final void increment_control() throws RecognitionException {
        try {
            // OWLSchema.g:891:3: ( ^( INCREMENT_CONTROL variable_id bound_1 bound_2 ( increment )? ) )
            // OWLSchema.g:891:6: ^( INCREMENT_CONTROL variable_id bound_1 bound_2 ( increment )? )
            {
            match(input,INCREMENT_CONTROL,FOLLOW_INCREMENT_CONTROL_in_increment_control2951); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variable_id_in_increment_control2953);
            variable_id();

            state._fsp--;

            pushFollow(FOLLOW_bound_1_in_increment_control2956);
            bound_1();

            state._fsp--;

            pushFollow(FOLLOW_bound_2_in_increment_control2959);
            bound_2();

            state._fsp--;

            // OWLSchema.g:891:57: ( increment )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==INCREMENT) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // OWLSchema.g:891:60: increment
                    {
                    pushFollow(FOLLOW_increment_in_increment_control2965);
                    increment();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "increment_control"


    // $ANTLR start "index"
    // OWLSchema.g:894:1: index : ^( INDEX numeric_expression ) ;
    public final void index() throws RecognitionException {
        try {
            // OWLSchema.g:895:3: ( ^( INDEX numeric_expression ) )
            // OWLSchema.g:895:6: ^( INDEX numeric_expression )
            {
            match(input,INDEX,FOLLOW_INDEX_in_index2987); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numeric_expression_in_index2989);
            numeric_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "index"


    // $ANTLR start "index_1"
    // OWLSchema.g:898:1: index_1 : ^( INDEX_1 index ) ;
    public final void index_1() throws RecognitionException {
        try {
            // OWLSchema.g:899:3: ( ^( INDEX_1 index ) )
            // OWLSchema.g:899:6: ^( INDEX_1 index )
            {
            match(input,INDEX_1,FOLLOW_INDEX_1_in_index_13006); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_index_in_index_13008);
            index();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "index_1"


    // $ANTLR start "index_2"
    // OWLSchema.g:902:1: index_2 : ^( INDEX_2 index ) ;
    public final void index_2() throws RecognitionException {
        try {
            // OWLSchema.g:903:3: ( ^( INDEX_2 index ) )
            // OWLSchema.g:903:6: ^( INDEX_2 index )
            {
            match(input,INDEX_2,FOLLOW_INDEX_2_in_index_23025); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_index_in_index_23027);
            index();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "index_2"


    // $ANTLR start "index_qualifier"
    // OWLSchema.g:906:1: index_qualifier : ^( INDEX_QUALIFIER index_1 ( index_2 )? ) ;
    public final void index_qualifier() throws RecognitionException {
        try {
            // OWLSchema.g:907:3: ( ^( INDEX_QUALIFIER index_1 ( index_2 )? ) )
            // OWLSchema.g:907:6: ^( INDEX_QUALIFIER index_1 ( index_2 )? )
            {
            match(input,INDEX_QUALIFIER,FOLLOW_INDEX_QUALIFIER_in_index_qualifier3044); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_index_1_in_index_qualifier3047);
            index_1();

            state._fsp--;

            // OWLSchema.g:907:34: ( index_2 )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==INDEX_2) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // OWLSchema.g:907:36: index_2
                    {
                    pushFollow(FOLLOW_index_2_in_index_qualifier3052);
                    index_2();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "index_qualifier"


    // $ANTLR start "integer_type"
    // OWLSchema.g:911:1: integer_type returns [String stype] : ^( INTEGER_TYPE nothing ) ;
    public final String integer_type() throws RecognitionException {
        String stype = null;

        try {
            // OWLSchema.g:912:3: ( ^( INTEGER_TYPE nothing ) )
            // OWLSchema.g:912:6: ^( INTEGER_TYPE nothing )
            {
            match(input,INTEGER_TYPE,FOLLOW_INTEGER_TYPE_in_integer_type3079); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_nothing_in_integer_type3081);
                nothing();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            			stype ="integer";
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stype;
    }
    // $ANTLR end "integer_type"


    // $ANTLR start "interval"
    // OWLSchema.g:918:1: interval : ^( INTERVAL interval_low interval_op interval_item interval_op interval_high ) ;
    public final void interval() throws RecognitionException {
        try {
            // OWLSchema.g:919:3: ( ^( INTERVAL interval_low interval_op interval_item interval_op interval_high ) )
            // OWLSchema.g:919:6: ^( INTERVAL interval_low interval_op interval_item interval_op interval_high )
            {
            match(input,INTERVAL,FOLLOW_INTERVAL_in_interval3101); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_interval_low_in_interval3104);
            interval_low();

            state._fsp--;

            pushFollow(FOLLOW_interval_op_in_interval3107);
            interval_op();

            state._fsp--;

            pushFollow(FOLLOW_interval_item_in_interval3110);
            interval_item();

            state._fsp--;

            pushFollow(FOLLOW_interval_op_in_interval3113);
            interval_op();

            state._fsp--;

            pushFollow(FOLLOW_interval_high_in_interval3116);
            interval_high();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "interval"


    // $ANTLR start "interval_high"
    // OWLSchema.g:922:1: interval_high : ^( INTERVAL_HIGH simple_expression ) ;
    public final void interval_high() throws RecognitionException {
        try {
            // OWLSchema.g:923:3: ( ^( INTERVAL_HIGH simple_expression ) )
            // OWLSchema.g:923:6: ^( INTERVAL_HIGH simple_expression )
            {
            match(input,INTERVAL_HIGH,FOLLOW_INTERVAL_HIGH_in_interval_high3134); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_simple_expression_in_interval_high3136);
            simple_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "interval_high"


    // $ANTLR start "interval_item"
    // OWLSchema.g:926:1: interval_item : ^( INTERVAL_ITEM simple_expression ) ;
    public final void interval_item() throws RecognitionException {
        try {
            // OWLSchema.g:927:3: ( ^( INTERVAL_ITEM simple_expression ) )
            // OWLSchema.g:927:6: ^( INTERVAL_ITEM simple_expression )
            {
            match(input,INTERVAL_ITEM,FOLLOW_INTERVAL_ITEM_in_interval_item3153); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_simple_expression_in_interval_item3155);
            simple_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "interval_item"


    // $ANTLR start "interval_low"
    // OWLSchema.g:930:1: interval_low : ^( INTERVAL_LOW simple_expression ) ;
    public final void interval_low() throws RecognitionException {
        try {
            // OWLSchema.g:931:3: ( ^( INTERVAL_LOW simple_expression ) )
            // OWLSchema.g:931:6: ^( INTERVAL_LOW simple_expression )
            {
            match(input,INTERVAL_LOW,FOLLOW_INTERVAL_LOW_in_interval_low3172); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_simple_expression_in_interval_low3174);
            simple_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "interval_low"


    // $ANTLR start "interval_op"
    // OWLSchema.g:934:1: interval_op : ^( INTERVAL_OP ( LT | LE ) ) ;
    public final void interval_op() throws RecognitionException {
        try {
            // OWLSchema.g:935:3: ( ^( INTERVAL_OP ( LT | LE ) ) )
            // OWLSchema.g:935:6: ^( INTERVAL_OP ( LT | LE ) )
            {
            match(input,INTERVAL_OP,FOLLOW_INTERVAL_OP_in_interval_op3191); 

            match(input, Token.DOWN, null); 
            if ( (input.LA(1)>=LT && input.LA(1)<=LE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "interval_op"


    // $ANTLR start "label"
    // OWLSchema.g:941:1: label : ^( LABEL IDENT ) ;
    public final void label() throws RecognitionException {
        try {
            // OWLSchema.g:942:3: ( ^( LABEL IDENT ) )
            // OWLSchema.g:942:6: ^( LABEL IDENT )
            {
            match(input,LABEL,FOLLOW_LABEL_in_label3228); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_label3230); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "label"


    // $ANTLR start "list_type"
    // OWLSchema.g:945:1: list_type returns [OWLClass owlc] : ^( LIST_TYPE (bs= bound_spec )? ( 'unique' )? bt= base_type ) ;
    public final OWLClass list_type() throws RecognitionException {
        OWLClass owlc = null;

        bound_spec_return bs = null;

        OWLClass bt = null;


        try {
            // OWLSchema.g:946:3: ( ^( LIST_TYPE (bs= bound_spec )? ( 'unique' )? bt= base_type ) )
            // OWLSchema.g:946:5: ^( LIST_TYPE (bs= bound_spec )? ( 'unique' )? bt= base_type )
            {
            match(input,LIST_TYPE,FOLLOW_LIST_TYPE_in_list_type3250); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:946:18: (bs= bound_spec )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==BOUND_SPEC) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // OWLSchema.g:946:21: bs= bound_spec
                    {
                    pushFollow(FOLLOW_bound_spec_in_list_type3258);
                    bs=bound_spec();

                    state._fsp--;


                    }
                    break;

            }

            // OWLSchema.g:946:40: ( 'unique' )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==300) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // OWLSchema.g:946:43: 'unique'
                    {
                    match(input,300,FOLLOW_300_in_list_type3268); 

                    }
                    break;

            }

            pushFollow(FOLLOW_base_type_in_list_type3277);
            bt=base_type();

            state._fsp--;


            match(input, Token.UP, null); 

            			owlc = createSequence(OWLHelper.listPrefix, bt.getIRI().getFragment());
            			if (bs != null)
            			{
            				bagset = false;
            				if ((bs!=null?bs.down:null) != null)
            					lb = (bs!=null?bs.down:null).intValue();
            				else
            					lb = 0;
            				if ((bs!=null?bs.up:null) != null)
            					hb = (bs!=null?bs.up:null);
            				else
            					hb = Integer.MAX_VALUE;
            				log.debug((bs!=null?bs.down:null) + "-" + (bs!=null?bs.up:null));
            			}
            		

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "list_type"

    public static class literal_return extends TreeRuleReturnScope {
        public Double doubleVal;
        public Integer intVal;
    };

    // $ANTLR start "literal"
    // OWLSchema.g:967:1: literal returns [Double doubleVal, Integer intVal] : ^( LITERAL (il= integer_literal | rl= real_literal | logical_literal | string_literal ) ) ;
    public final literal_return literal() throws RecognitionException {
        literal_return retval = new literal_return();
        retval.start = input.LT(1);

        Integer il = null;

        Double rl = null;


        try {
            // OWLSchema.g:968:3: ( ^( LITERAL (il= integer_literal | rl= real_literal | logical_literal | string_literal ) ) )
            // OWLSchema.g:968:6: ^( LITERAL (il= integer_literal | rl= real_literal | logical_literal | string_literal ) )
            {
            match(input,LITERAL,FOLLOW_LITERAL_in_literal3311); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:968:16: (il= integer_literal | rl= real_literal | logical_literal | string_literal )
            int alt86=4;
            switch ( input.LA(1) ) {
            case INTEGER_LITERAL:
                {
                alt86=1;
                }
                break;
            case REAL_LITERAL:
                {
                alt86=2;
                }
                break;
            case LOGICAL_LITERAL:
                {
                alt86=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt86=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // OWLSchema.g:969:5: il= integer_literal
                    {
                    pushFollow(FOLLOW_integer_literal_in_literal3321);
                    il=integer_literal();

                    state._fsp--;

                    retval.intVal = il;

                    }
                    break;
                case 2 :
                    // OWLSchema.g:970:5: rl= real_literal
                    {
                    pushFollow(FOLLOW_real_literal_in_literal3331);
                    rl=real_literal();

                    state._fsp--;

                    retval.doubleVal = rl;

                    }
                    break;
                case 3 :
                    // OWLSchema.g:971:5: logical_literal
                    {
                    pushFollow(FOLLOW_logical_literal_in_literal3339);
                    logical_literal();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // OWLSchema.g:972:5: string_literal
                    {
                    pushFollow(FOLLOW_string_literal_in_literal3345);
                    string_literal();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "literal"


    // $ANTLR start "integer_literal"
    // OWLSchema.g:976:1: integer_literal returns [Integer intVal] : ^( INTEGER_LITERAL INT ) ;
    public final Integer integer_literal() throws RecognitionException {
        Integer intVal = null;

        CommonTree INT3=null;

        try {
            // OWLSchema.g:977:3: ( ^( INTEGER_LITERAL INT ) )
            // OWLSchema.g:977:6: ^( INTEGER_LITERAL INT )
            {
            match(input,INTEGER_LITERAL,FOLLOW_INTEGER_LITERAL_in_integer_literal3370); 

            match(input, Token.DOWN, null); 
            INT3=(CommonTree)match(input,INT,FOLLOW_INT_in_integer_literal3372); 

            match(input, Token.UP, null); 

            		intVal = Integer.valueOf((INT3!=null?INT3.getText():null));
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return intVal;
    }
    // $ANTLR end "integer_literal"


    // $ANTLR start "real_literal"
    // OWLSchema.g:983:1: real_literal returns [Double doubleVal] : ^( REAL_LITERAL FLOAT ) ;
    public final Double real_literal() throws RecognitionException {
        Double doubleVal = null;

        CommonTree FLOAT4=null;

        try {
            // OWLSchema.g:984:3: ( ^( REAL_LITERAL FLOAT ) )
            // OWLSchema.g:984:6: ^( REAL_LITERAL FLOAT )
            {
            match(input,REAL_LITERAL,FOLLOW_REAL_LITERAL_in_real_literal3397); 

            match(input, Token.DOWN, null); 
            FLOAT4=(CommonTree)match(input,FLOAT,FOLLOW_FLOAT_in_real_literal3399); 

            match(input, Token.UP, null); 

            		doubleVal = new Double((FLOAT4!=null?FLOAT4.getText():null));
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return doubleVal;
    }
    // $ANTLR end "real_literal"


    // $ANTLR start "string_literal"
    // OWLSchema.g:990:1: string_literal : ^( STRING_LITERAL STRING ) ;
    public final void string_literal() throws RecognitionException {
        try {
            // OWLSchema.g:991:3: ( ^( STRING_LITERAL STRING ) )
            // OWLSchema.g:991:6: ^( STRING_LITERAL STRING )
            {
            match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_string_literal3419); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_string_literal3421); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "string_literal"


    // $ANTLR start "local_decl"
    // OWLSchema.g:994:1: local_decl : ^( LOCAL_DECL local_variable ( local_variable )* ) ;
    public final void local_decl() throws RecognitionException {
        try {
            // OWLSchema.g:995:3: ( ^( LOCAL_DECL local_variable ( local_variable )* ) )
            // OWLSchema.g:995:5: ^( LOCAL_DECL local_variable ( local_variable )* )
            {
            match(input,LOCAL_DECL,FOLLOW_LOCAL_DECL_in_local_decl3436); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_local_variable_in_local_decl3439);
            local_variable();

            state._fsp--;

            // OWLSchema.g:995:35: ( local_variable )*
            loop87:
            do {
                int alt87=2;
                int LA87_0 = input.LA(1);

                if ( (LA87_0==LOCAL_VARIABLE) ) {
                    alt87=1;
                }


                switch (alt87) {
            	case 1 :
            	    // OWLSchema.g:995:38: local_variable
            	    {
            	    pushFollow(FOLLOW_local_variable_in_local_decl3445);
            	    local_variable();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop87;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "local_decl"


    // $ANTLR start "local_variable"
    // OWLSchema.g:998:1: local_variable : ^( LOCAL_VARIABLE variable_id ( variable_id )* parameter_type ( expression )? ) ;
    public final void local_variable() throws RecognitionException {
        try {
            // OWLSchema.g:999:3: ( ^( LOCAL_VARIABLE variable_id ( variable_id )* parameter_type ( expression )? ) )
            // OWLSchema.g:999:6: ^( LOCAL_VARIABLE variable_id ( variable_id )* parameter_type ( expression )? )
            {
            match(input,LOCAL_VARIABLE,FOLLOW_LOCAL_VARIABLE_in_local_variable3467); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variable_id_in_local_variable3469);
            variable_id();

            state._fsp--;

            // OWLSchema.g:999:36: ( variable_id )*
            loop88:
            do {
                int alt88=2;
                int LA88_0 = input.LA(1);

                if ( (LA88_0==VARIABLE_ID) ) {
                    alt88=1;
                }


                switch (alt88) {
            	case 1 :
            	    // OWLSchema.g:999:38: variable_id
            	    {
            	    pushFollow(FOLLOW_variable_id_in_local_variable3474);
            	    variable_id();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop88;
                }
            } while (true);

            pushFollow(FOLLOW_parameter_type_in_local_variable3480);
            parameter_type();

            state._fsp--;

            // OWLSchema.g:999:70: ( expression )?
            int alt89=2;
            int LA89_0 = input.LA(1);

            if ( (LA89_0==EXPRESSION) ) {
                alt89=1;
            }
            switch (alt89) {
                case 1 :
                    // OWLSchema.g:999:72: expression
                    {
                    pushFollow(FOLLOW_expression_in_local_variable3485);
                    expression();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "local_variable"


    // $ANTLR start "logical_expression"
    // OWLSchema.g:1002:1: logical_expression : ^( LOGICAL_EXPRESSION expression ) ;
    public final void logical_expression() throws RecognitionException {
        try {
            // OWLSchema.g:1003:3: ( ^( LOGICAL_EXPRESSION expression ) )
            // OWLSchema.g:1003:6: ^( LOGICAL_EXPRESSION expression )
            {
            match(input,LOGICAL_EXPRESSION,FOLLOW_LOGICAL_EXPRESSION_in_logical_expression3507); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_logical_expression3509);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "logical_expression"


    // $ANTLR start "logical_literal"
    // OWLSchema.g:1006:1: logical_literal : ^( LOGICAL_LITERAL ( 'false' | 'true' | 'unknown' ) ) ;
    public final void logical_literal() throws RecognitionException {
        try {
            // OWLSchema.g:1007:3: ( ^( LOGICAL_LITERAL ( 'false' | 'true' | 'unknown' ) ) )
            // OWLSchema.g:1007:6: ^( LOGICAL_LITERAL ( 'false' | 'true' | 'unknown' ) )
            {
            match(input,LOGICAL_LITERAL,FOLLOW_LOGICAL_LITERAL_in_logical_literal3526); 

            match(input, Token.DOWN, null); 
            if ( (input.LA(1)>=338 && input.LA(1)<=340) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "logical_literal"


    // $ANTLR start "logical_type"
    // OWLSchema.g:1014:1: logical_type returns [String stype] : ^( LOGICAL_TYPE nothing ) ;
    public final String logical_type() throws RecognitionException {
        String stype = null;

        try {
            // OWLSchema.g:1015:3: ( ^( LOGICAL_TYPE nothing ) )
            // OWLSchema.g:1015:6: ^( LOGICAL_TYPE nothing )
            {
            match(input,LOGICAL_TYPE,FOLLOW_LOGICAL_TYPE_in_logical_type3573); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_nothing_in_logical_type3575);
                nothing();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            			stype = "logical";
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stype;
    }
    // $ANTLR end "logical_type"


    // $ANTLR start "named_types"
    // OWLSchema.g:1020:1: named_types returns [OWLClass owlc] : ^( NAMED_TYPES (er= entity_ref | tr= type_ref ) ) ;
    public final OWLClass named_types() throws RecognitionException {
        OWLClass owlc = null;

        OWLClass er = null;

        OWLClass tr = null;


        try {
            // OWLSchema.g:1021:3: ( ^( NAMED_TYPES (er= entity_ref | tr= type_ref ) ) )
            // OWLSchema.g:1021:6: ^( NAMED_TYPES (er= entity_ref | tr= type_ref ) )
            {
            match(input,NAMED_TYPES,FOLLOW_NAMED_TYPES_in_named_types3598); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1021:20: (er= entity_ref | tr= type_ref )
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==ENTITY_REF) ) {
                alt90=1;
            }
            else if ( (LA90_0==TYPE_REF) ) {
                alt90=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 90, 0, input);

                throw nvae;
            }
            switch (alt90) {
                case 1 :
                    // OWLSchema.g:1022:5: er= entity_ref
                    {
                    pushFollow(FOLLOW_entity_ref_in_named_types3608);
                    er=entity_ref();

                    state._fsp--;

                    owlc = er;

                    }
                    break;
                case 2 :
                    // OWLSchema.g:1023:5: tr= type_ref
                    {
                    pushFollow(FOLLOW_type_ref_in_named_types3619);
                    tr=type_ref();

                    state._fsp--;

                    owlc = tr;

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "named_types"


    // $ANTLR start "null_stmt"
    // OWLSchema.g:1027:1: null_stmt : ^( NULL_STMT nothing ) ;
    public final void null_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:1028:3: ( ^( NULL_STMT nothing ) )
            // OWLSchema.g:1028:6: ^( NULL_STMT nothing )
            {
            match(input,NULL_STMT,FOLLOW_NULL_STMT_in_null_stmt3641); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_nothing_in_null_stmt3643);
                nothing();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "null_stmt"


    // $ANTLR start "number_type"
    // OWLSchema.g:1031:1: number_type returns [String stype] : ^( NUMBER_TYPE nothing ) ;
    public final String number_type() throws RecognitionException {
        String stype = null;

        try {
            // OWLSchema.g:1032:3: ( ^( NUMBER_TYPE nothing ) )
            // OWLSchema.g:1032:6: ^( NUMBER_TYPE nothing )
            {
            match(input,NUMBER_TYPE,FOLLOW_NUMBER_TYPE_in_number_type3663); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_nothing_in_number_type3665);
                nothing();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            			stype = "number";
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stype;
    }
    // $ANTLR end "number_type"

    public static class numeric_expression_return extends TreeRuleReturnScope {
        public Integer intVal;
        public Double doubleVal;
    };

    // $ANTLR start "numeric_expression"
    // OWLSchema.g:1037:1: numeric_expression returns [Integer intVal, Double doubleVal] : ^( NUMERIC_EXPRESSION se= simple_expression ) ;
    public final numeric_expression_return numeric_expression() throws RecognitionException {
        numeric_expression_return retval = new numeric_expression_return();
        retval.start = input.LT(1);

        simple_expression_return se = null;


        try {
            // OWLSchema.g:1038:3: ( ^( NUMERIC_EXPRESSION se= simple_expression ) )
            // OWLSchema.g:1038:6: ^( NUMERIC_EXPRESSION se= simple_expression )
            {
            match(input,NUMERIC_EXPRESSION,FOLLOW_NUMERIC_EXPRESSION_in_numeric_expression3688); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_simple_expression_in_numeric_expression3692);
            se=simple_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            			retval.intVal = (se!=null?se.intVal:null);
            			retval.doubleVal = (se!=null?se.doubleVal:null);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "numeric_expression"


    // $ANTLR start "one_of"
    // OWLSchema.g:1046:1: one_of returns [OWLClass owlc] : ^( ONE_OF (se= supertype_expression )+ ) ;
    public final OWLClass one_of() throws RecognitionException {
        OWLClass owlc = null;

        OWLClass se = null;



        	HashSet<OWLClass> ops = new HashSet<OWLClass>();

        try {
            // OWLSchema.g:1051:3: ( ^( ONE_OF (se= supertype_expression )+ ) )
            // OWLSchema.g:1051:6: ^( ONE_OF (se= supertype_expression )+ )
            {
            match(input,ONE_OF,FOLLOW_ONE_OF_in_one_of3723); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1051:15: (se= supertype_expression )+
            int cnt91=0;
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==SUPERTYPE_EXPRESSION) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // OWLSchema.g:1051:16: se= supertype_expression
            	    {
            	    pushFollow(FOLLOW_supertype_expression_in_one_of3728);
            	    se=supertype_expression();

            	    state._fsp--;

            	    ops.add(se);

            	    }
            	    break;

            	default :
            	    if ( cnt91 >= 1 ) break loop91;
                        EarlyExitException eee =
                            new EarlyExitException(91, input);
                        throw eee;
                }
                cnt91++;
            } while (true);


            match(input, Token.UP, null); 

            			/*
            			Iterator<OWLClass> it = ops.iterator();
            			owlc = it.next();
            			while(it.hasNext())
            			{
            				OWLClassExpression oper = it.next();
            				OWLClassExpression union = h.getOUnionOf(oper, owlc);
            				OWLClassExpression inter = h.getOIntersectionOf(oper, owlc);
            				log.debug("abs_" + counter + " created");
            				owlc = h.getClas("abs_" + counter++);
            				//addAxiom(h.getSubClassAxiom(owlc, thing));
            				//TOADD addAxiom(h.getEquivalentClassesAxiom(owlc, h.getOIntersectionOf(union, h.getOComplementOf(inter))));
            			}
            			*/
            			owlc = h.getClas("abs_" + counter++);
            			//addAxiom(h.getDisjointUnionAxiom(owlc, ops));
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "one_of"


    // $ANTLR start "parameter"
    // OWLSchema.g:1073:1: parameter : ^( PARAMETER expression ) ;
    public final void parameter() throws RecognitionException {
        try {
            // OWLSchema.g:1074:3: ( ^( PARAMETER expression ) )
            // OWLSchema.g:1074:6: ^( PARAMETER expression )
            {
            match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter3754); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_parameter3756);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parameter"


    // $ANTLR start "parameter_id"
    // OWLSchema.g:1077:1: parameter_id : ^( PARAMETER_ID IDENT ) ;
    public final void parameter_id() throws RecognitionException {
        try {
            // OWLSchema.g:1078:3: ( ^( PARAMETER_ID IDENT ) )
            // OWLSchema.g:1078:5: ^( PARAMETER_ID IDENT )
            {
            match(input,PARAMETER_ID,FOLLOW_PARAMETER_ID_in_parameter_id3772); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_parameter_id3774); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parameter_id"


    // $ANTLR start "parameter_type"
    // OWLSchema.g:1081:1: parameter_type : ^( PARAMETER_TYPE ( generalized_types | named_types | simple_types ) ) ;
    public final void parameter_type() throws RecognitionException {
        try {
            // OWLSchema.g:1082:3: ( ^( PARAMETER_TYPE ( generalized_types | named_types | simple_types ) ) )
            // OWLSchema.g:1082:6: ^( PARAMETER_TYPE ( generalized_types | named_types | simple_types ) )
            {
            match(input,PARAMETER_TYPE,FOLLOW_PARAMETER_TYPE_in_parameter_type3791); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1082:23: ( generalized_types | named_types | simple_types )
            int alt92=3;
            switch ( input.LA(1) ) {
            case GENERALIZED_TYPES:
                {
                alt92=1;
                }
                break;
            case NAMED_TYPES:
                {
                alt92=2;
                }
                break;
            case SIMPLE_TYPES:
                {
                alt92=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 92, 0, input);

                throw nvae;
            }

            switch (alt92) {
                case 1 :
                    // OWLSchema.g:1083:5: generalized_types
                    {
                    pushFollow(FOLLOW_generalized_types_in_parameter_type3799);
                    generalized_types();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1084:5: named_types
                    {
                    pushFollow(FOLLOW_named_types_in_parameter_type3807);
                    named_types();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:1085:5: simple_types
                    {
                    pushFollow(FOLLOW_simple_types_in_parameter_type3815);
                    simple_types();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parameter_type"


    // $ANTLR start "population"
    // OWLSchema.g:1089:1: population : ^( POPULATION entity_ref ) ;
    public final void population() throws RecognitionException {
        try {
            // OWLSchema.g:1090:3: ( ^( POPULATION entity_ref ) )
            // OWLSchema.g:1090:6: ^( POPULATION entity_ref )
            {
            match(input,POPULATION,FOLLOW_POPULATION_in_population3836); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_entity_ref_in_population3838);
            entity_ref();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "population"


    // $ANTLR start "precision_spec"
    // OWLSchema.g:1093:1: precision_spec : ^( PRECISION_SPEC numeric_expression ) ;
    public final void precision_spec() throws RecognitionException {
        try {
            // OWLSchema.g:1094:3: ( ^( PRECISION_SPEC numeric_expression ) )
            // OWLSchema.g:1094:6: ^( PRECISION_SPEC numeric_expression )
            {
            match(input,PRECISION_SPEC,FOLLOW_PRECISION_SPEC_in_precision_spec3854); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numeric_expression_in_precision_spec3856);
            numeric_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "precision_spec"

    public static class primary_return extends TreeRuleReturnScope {
        public Integer intVal;
        public Double doubleVal;
    };

    // $ANTLR start "primary"
    // OWLSchema.g:1097:1: primary returns [Integer intVal, Double doubleVal] : ^( PRIMARY (l= literal | qualifiable_factor ( qualifier )* ) ) ;
    public final primary_return primary() throws RecognitionException {
        primary_return retval = new primary_return();
        retval.start = input.LT(1);

        literal_return l = null;


        try {
            // OWLSchema.g:1098:3: ( ^( PRIMARY (l= literal | qualifiable_factor ( qualifier )* ) ) )
            // OWLSchema.g:1098:6: ^( PRIMARY (l= literal | qualifiable_factor ( qualifier )* ) )
            {
            match(input,PRIMARY,FOLLOW_PRIMARY_in_primary3877); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1098:16: (l= literal | qualifiable_factor ( qualifier )* )
            int alt94=2;
            int LA94_0 = input.LA(1);

            if ( (LA94_0==LITERAL) ) {
                alt94=1;
            }
            else if ( (LA94_0==QUALIFIABLE_FACTOR) ) {
                alt94=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 94, 0, input);

                throw nvae;
            }
            switch (alt94) {
                case 1 :
                    // OWLSchema.g:1099:5: l= literal
                    {
                    pushFollow(FOLLOW_literal_in_primary3887);
                    l=literal();

                    state._fsp--;

                    retval.intVal = (l!=null?l.intVal:null);retval.doubleVal = (l!=null?l.doubleVal:null);

                    }
                    break;
                case 2 :
                    // OWLSchema.g:1100:5: qualifiable_factor ( qualifier )*
                    {
                    pushFollow(FOLLOW_qualifiable_factor_in_primary3897);
                    qualifiable_factor();

                    state._fsp--;

                    // OWLSchema.g:1100:24: ( qualifier )*
                    loop93:
                    do {
                        int alt93=2;
                        int LA93_0 = input.LA(1);

                        if ( (LA93_0==QUALIFIER) ) {
                            alt93=1;
                        }


                        switch (alt93) {
                    	case 1 :
                    	    // OWLSchema.g:1100:27: qualifier
                    	    {
                    	    pushFollow(FOLLOW_qualifier_in_primary3902);
                    	    qualifier();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop93;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "primary"


    // $ANTLR start "procedure_call_stmt"
    // OWLSchema.g:1104:1: procedure_call_stmt : ^( PROCEDURE_CALL_STMT ( procedure_ref | built_in_procedure ) ( actual_parameter_list )? ) ;
    public final void procedure_call_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:1105:3: ( ^( PROCEDURE_CALL_STMT ( procedure_ref | built_in_procedure ) ( actual_parameter_list )? ) )
            // OWLSchema.g:1105:5: ^( PROCEDURE_CALL_STMT ( procedure_ref | built_in_procedure ) ( actual_parameter_list )? )
            {
            match(input,PROCEDURE_CALL_STMT,FOLLOW_PROCEDURE_CALL_STMT_in_procedure_call_stmt3925); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1105:27: ( procedure_ref | built_in_procedure )
            int alt95=2;
            int LA95_0 = input.LA(1);

            if ( (LA95_0==PROCEDURE_REF) ) {
                alt95=1;
            }
            else if ( (LA95_0==BUILT_IN_PROCEDURE) ) {
                alt95=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;
            }
            switch (alt95) {
                case 1 :
                    // OWLSchema.g:1105:29: procedure_ref
                    {
                    pushFollow(FOLLOW_procedure_ref_in_procedure_call_stmt3929);
                    procedure_ref();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1105:45: built_in_procedure
                    {
                    pushFollow(FOLLOW_built_in_procedure_in_procedure_call_stmt3933);
                    built_in_procedure();

                    state._fsp--;


                    }
                    break;

            }

            // OWLSchema.g:1105:66: ( actual_parameter_list )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==ACTUAL_PARAMETER_LIST) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // OWLSchema.g:1105:69: actual_parameter_list
                    {
                    pushFollow(FOLLOW_actual_parameter_list_in_procedure_call_stmt3940);
                    actual_parameter_list();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedure_call_stmt"


    // $ANTLR start "built_in_procedure"
    // OWLSchema.g:1108:1: built_in_procedure : ^( BUILT_IN_PROCEDURE ( 'insert' | 'remove' ) ) ;
    public final void built_in_procedure() throws RecognitionException {
        try {
            // OWLSchema.g:1109:3: ( ^( BUILT_IN_PROCEDURE ( 'insert' | 'remove' ) ) )
            // OWLSchema.g:1109:5: ^( BUILT_IN_PROCEDURE ( 'insert' | 'remove' ) )
            {
            match(input,BUILT_IN_PROCEDURE,FOLLOW_BUILT_IN_PROCEDURE_in_built_in_procedure3959); 

            match(input, Token.DOWN, null); 
            if ( (input.LA(1)>=PROCEDURE_INSERT && input.LA(1)<=PROCEDURE_REMOVE) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "built_in_procedure"


    // $ANTLR start "procedure_decl"
    // OWLSchema.g:1115:1: procedure_decl : ^( PROCEDURE_DECL procedure_head ( algorithm_head )? ( stmt )* ) ;
    public final void procedure_decl() throws RecognitionException {
        try {
            // OWLSchema.g:1116:3: ( ^( PROCEDURE_DECL procedure_head ( algorithm_head )? ( stmt )* ) )
            // OWLSchema.g:1116:5: ^( PROCEDURE_DECL procedure_head ( algorithm_head )? ( stmt )* )
            {
            match(input,PROCEDURE_DECL,FOLLOW_PROCEDURE_DECL_in_procedure_decl3993); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_procedure_head_in_procedure_decl3995);
            procedure_head();

            state._fsp--;

            // OWLSchema.g:1116:37: ( algorithm_head )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==ALGORITHM_HEAD) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // OWLSchema.g:1116:39: algorithm_head
                    {
                    pushFollow(FOLLOW_algorithm_head_in_procedure_decl3999);
                    algorithm_head();

                    state._fsp--;


                    }
                    break;

            }

            // OWLSchema.g:1116:57: ( stmt )*
            loop98:
            do {
                int alt98=2;
                int LA98_0 = input.LA(1);

                if ( (LA98_0==STMT) ) {
                    alt98=1;
                }


                switch (alt98) {
            	case 1 :
            	    // OWLSchema.g:1116:60: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_procedure_decl4007);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop98;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedure_decl"


    // $ANTLR start "procedure_head"
    // OWLSchema.g:1119:1: procedure_head : ^( PROCEDURE_HEAD procedure_id ( ( 'var' )? formal_parameter ( ( 'var' )? formal_parameter )* )? ) ;
    public final void procedure_head() throws RecognitionException {
        try {
            // OWLSchema.g:1120:3: ( ^( PROCEDURE_HEAD procedure_id ( ( 'var' )? formal_parameter ( ( 'var' )? formal_parameter )* )? ) )
            // OWLSchema.g:1120:6: ^( PROCEDURE_HEAD procedure_id ( ( 'var' )? formal_parameter ( ( 'var' )? formal_parameter )* )? )
            {
            match(input,PROCEDURE_HEAD,FOLLOW_PROCEDURE_HEAD_in_procedure_head4027); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_procedure_id_in_procedure_head4030);
            procedure_id();

            state._fsp--;

            // OWLSchema.g:1120:37: ( ( 'var' )? formal_parameter ( ( 'var' )? formal_parameter )* )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==FORMAL_PARAMETER||LA102_0==346) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // OWLSchema.g:1120:39: ( 'var' )? formal_parameter ( ( 'var' )? formal_parameter )*
                    {
                    // OWLSchema.g:1120:39: ( 'var' )?
                    int alt99=2;
                    int LA99_0 = input.LA(1);

                    if ( (LA99_0==346) ) {
                        alt99=1;
                    }
                    switch (alt99) {
                        case 1 :
                            // OWLSchema.g:1120:42: 'var'
                            {
                            match(input,346,FOLLOW_346_in_procedure_head4037); 

                            }
                            break;

                    }

                    pushFollow(FOLLOW_formal_parameter_in_procedure_head4044);
                    formal_parameter();

                    state._fsp--;

                    // OWLSchema.g:1120:71: ( ( 'var' )? formal_parameter )*
                    loop101:
                    do {
                        int alt101=2;
                        int LA101_0 = input.LA(1);

                        if ( (LA101_0==FORMAL_PARAMETER||LA101_0==346) ) {
                            alt101=1;
                        }


                        switch (alt101) {
                    	case 1 :
                    	    // OWLSchema.g:1120:73: ( 'var' )? formal_parameter
                    	    {
                    	    // OWLSchema.g:1120:73: ( 'var' )?
                    	    int alt100=2;
                    	    int LA100_0 = input.LA(1);

                    	    if ( (LA100_0==346) ) {
                    	        alt100=1;
                    	    }
                    	    switch (alt100) {
                    	        case 1 :
                    	            // OWLSchema.g:1120:76: 'var'
                    	            {
                    	            match(input,346,FOLLOW_346_in_procedure_head4052); 

                    	            }
                    	            break;

                    	    }

                    	    pushFollow(FOLLOW_formal_parameter_in_procedure_head4059);
                    	    formal_parameter();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop101;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedure_head"


    // $ANTLR start "procedure_id"
    // OWLSchema.g:1123:1: procedure_id : ^( PROCEDURE_ID IDENT ) ;
    public final void procedure_id() throws RecognitionException {
        try {
            // OWLSchema.g:1124:3: ( ^( PROCEDURE_ID IDENT ) )
            // OWLSchema.g:1124:5: ^( PROCEDURE_ID IDENT )
            {
            match(input,PROCEDURE_ID,FOLLOW_PROCEDURE_ID_in_procedure_id4083); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_procedure_id4085); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedure_id"


    // $ANTLR start "qualifiable_factor"
    // OWLSchema.g:1127:1: qualifiable_factor : ^( QUALIFIABLE_FACTOR ( attribute_ref | constant_factor | function_call | population | general_ref ) ) ;
    public final void qualifiable_factor() throws RecognitionException {
        try {
            // OWLSchema.g:1128:3: ( ^( QUALIFIABLE_FACTOR ( attribute_ref | constant_factor | function_call | population | general_ref ) ) )
            // OWLSchema.g:1128:6: ^( QUALIFIABLE_FACTOR ( attribute_ref | constant_factor | function_call | population | general_ref ) )
            {
            match(input,QUALIFIABLE_FACTOR,FOLLOW_QUALIFIABLE_FACTOR_in_qualifiable_factor4101); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1128:27: ( attribute_ref | constant_factor | function_call | population | general_ref )
            int alt103=5;
            switch ( input.LA(1) ) {
            case ATTRIBUTE_REF:
                {
                alt103=1;
                }
                break;
            case CONSTANT_FACTOR:
                {
                alt103=2;
                }
                break;
            case FUNCTION_CALL:
                {
                alt103=3;
                }
                break;
            case POPULATION:
                {
                alt103=4;
                }
                break;
            case GENERAL_REF:
                {
                alt103=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;
            }

            switch (alt103) {
                case 1 :
                    // OWLSchema.g:1129:5: attribute_ref
                    {
                    pushFollow(FOLLOW_attribute_ref_in_qualifiable_factor4109);
                    attribute_ref();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1130:5: constant_factor
                    {
                    pushFollow(FOLLOW_constant_factor_in_qualifiable_factor4115);
                    constant_factor();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:1131:5: function_call
                    {
                    pushFollow(FOLLOW_function_call_in_qualifiable_factor4122);
                    function_call();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // OWLSchema.g:1132:5: population
                    {
                    pushFollow(FOLLOW_population_in_qualifiable_factor4128);
                    population();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // OWLSchema.g:1133:5: general_ref
                    {
                    pushFollow(FOLLOW_general_ref_in_qualifiable_factor4136);
                    general_ref();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "qualifiable_factor"


    // $ANTLR start "qualifier"
    // OWLSchema.g:1137:1: qualifier : ^( QUALIFIER ( attribute_qualifier | group_qualifier | index_qualifier ) ) ;
    public final void qualifier() throws RecognitionException {
        try {
            // OWLSchema.g:1138:3: ( ^( QUALIFIER ( attribute_qualifier | group_qualifier | index_qualifier ) ) )
            // OWLSchema.g:1138:6: ^( QUALIFIER ( attribute_qualifier | group_qualifier | index_qualifier ) )
            {
            match(input,QUALIFIER,FOLLOW_QUALIFIER_in_qualifier4156); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1138:18: ( attribute_qualifier | group_qualifier | index_qualifier )
            int alt104=3;
            switch ( input.LA(1) ) {
            case ATTRIBUTE_QUALIFIER:
                {
                alt104=1;
                }
                break;
            case GROUP_QUALIFIER:
                {
                alt104=2;
                }
                break;
            case INDEX_QUALIFIER:
                {
                alt104=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;
            }

            switch (alt104) {
                case 1 :
                    // OWLSchema.g:1139:5: attribute_qualifier
                    {
                    pushFollow(FOLLOW_attribute_qualifier_in_qualifier4164);
                    attribute_qualifier();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1140:5: group_qualifier
                    {
                    pushFollow(FOLLOW_group_qualifier_in_qualifier4170);
                    group_qualifier();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:1141:5: index_qualifier
                    {
                    pushFollow(FOLLOW_index_qualifier_in_qualifier4176);
                    index_qualifier();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "qualifier"


    // $ANTLR start "query_expression"
    // OWLSchema.g:1145:1: query_expression : ^( QUERY_EXPRESSION variable_id aggregate_source logical_expression ) ;
    public final void query_expression() throws RecognitionException {
        try {
            // OWLSchema.g:1146:3: ( ^( QUERY_EXPRESSION variable_id aggregate_source logical_expression ) )
            // OWLSchema.g:1146:6: ^( QUERY_EXPRESSION variable_id aggregate_source logical_expression )
            {
            match(input,QUERY_EXPRESSION,FOLLOW_QUERY_EXPRESSION_in_query_expression4196); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_variable_id_in_query_expression4198);
            variable_id();

            state._fsp--;

            pushFollow(FOLLOW_aggregate_source_in_query_expression4201);
            aggregate_source();

            state._fsp--;

            pushFollow(FOLLOW_logical_expression_in_query_expression4204);
            logical_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "query_expression"


    // $ANTLR start "real_type"
    // OWLSchema.g:1149:1: real_type returns [String stype] : ^( REAL_TYPE ( precision_spec )? ) ;
    public final String real_type() throws RecognitionException {
        String stype = null;

        try {
            // OWLSchema.g:1150:3: ( ^( REAL_TYPE ( precision_spec )? ) )
            // OWLSchema.g:1150:6: ^( REAL_TYPE ( precision_spec )? )
            {
            match(input,REAL_TYPE,FOLLOW_REAL_TYPE_in_real_type4225); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:1150:19: ( precision_spec )?
                int alt105=2;
                int LA105_0 = input.LA(1);

                if ( (LA105_0==PRECISION_SPEC) ) {
                    alt105=1;
                }
                switch (alt105) {
                    case 1 :
                        // OWLSchema.g:1150:21: precision_spec
                        {
                        pushFollow(FOLLOW_precision_spec_in_real_type4230);
                        precision_spec();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            			stype ="real";
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stype;
    }
    // $ANTLR end "real_type"


    // $ANTLR start "reference_clause"
    // OWLSchema.g:1156:1: reference_clause : ^( REFERENCE_CLAUSE schema_ref ( resource_or_rename ( resource_or_rename )* )? ) ;
    public final void reference_clause() throws RecognitionException {
        try {
            // OWLSchema.g:1157:3: ( ^( REFERENCE_CLAUSE schema_ref ( resource_or_rename ( resource_or_rename )* )? ) )
            // OWLSchema.g:1157:6: ^( REFERENCE_CLAUSE schema_ref ( resource_or_rename ( resource_or_rename )* )? )
            {
            match(input,REFERENCE_CLAUSE,FOLLOW_REFERENCE_CLAUSE_in_reference_clause4255); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_schema_ref_in_reference_clause4257);
            schema_ref();

            state._fsp--;

            // OWLSchema.g:1158:4: ( resource_or_rename ( resource_or_rename )* )?
            int alt107=2;
            int LA107_0 = input.LA(1);

            if ( (LA107_0==RESOURCE_OR_RENAME) ) {
                alt107=1;
            }
            switch (alt107) {
                case 1 :
                    // OWLSchema.g:1158:6: resource_or_rename ( resource_or_rename )*
                    {
                    pushFollow(FOLLOW_resource_or_rename_in_reference_clause4265);
                    resource_or_rename();

                    state._fsp--;

                    // OWLSchema.g:1158:26: ( resource_or_rename )*
                    loop106:
                    do {
                        int alt106=2;
                        int LA106_0 = input.LA(1);

                        if ( (LA106_0==RESOURCE_OR_RENAME) ) {
                            alt106=1;
                        }


                        switch (alt106) {
                    	case 1 :
                    	    // OWLSchema.g:1158:28: resource_or_rename
                    	    {
                    	    pushFollow(FOLLOW_resource_or_rename_in_reference_clause4270);
                    	    resource_or_rename();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop106;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "reference_clause"


    // $ANTLR start "rename_id"
    // OWLSchema.g:1161:1: rename_id : ^( RENAME_ID ( constant_id | entity_id | function_id | procedure_id | type_id ) ) ;
    public final void rename_id() throws RecognitionException {
        try {
            // OWLSchema.g:1162:3: ( ^( RENAME_ID ( constant_id | entity_id | function_id | procedure_id | type_id ) ) )
            // OWLSchema.g:1162:6: ^( RENAME_ID ( constant_id | entity_id | function_id | procedure_id | type_id ) )
            {
            match(input,RENAME_ID,FOLLOW_RENAME_ID_in_rename_id4294); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1162:18: ( constant_id | entity_id | function_id | procedure_id | type_id )
            int alt108=5;
            switch ( input.LA(1) ) {
            case CONSTANT_ID:
                {
                alt108=1;
                }
                break;
            case ENTITY_ID:
                {
                alt108=2;
                }
                break;
            case FUNCTION_ID:
                {
                alt108=3;
                }
                break;
            case PROCEDURE_ID:
                {
                alt108=4;
                }
                break;
            case TYPE_ID:
                {
                alt108=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;
            }

            switch (alt108) {
                case 1 :
                    // OWLSchema.g:1163:5: constant_id
                    {
                    pushFollow(FOLLOW_constant_id_in_rename_id4302);
                    constant_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1164:5: entity_id
                    {
                    pushFollow(FOLLOW_entity_id_in_rename_id4308);
                    entity_id();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:1165:5: function_id
                    {
                    pushFollow(FOLLOW_function_id_in_rename_id4314);
                    function_id();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // OWLSchema.g:1166:5: procedure_id
                    {
                    pushFollow(FOLLOW_procedure_id_in_rename_id4320);
                    procedure_id();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // OWLSchema.g:1167:5: type_id
                    {
                    pushFollow(FOLLOW_type_id_in_rename_id4326);
                    type_id();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rename_id"


    // $ANTLR start "repeat_control"
    // OWLSchema.g:1171:1: repeat_control : ^( REPEAT_CONTROL ( increment_control )? ( while_control )? ( until_control )? ) ;
    public final void repeat_control() throws RecognitionException {
        try {
            // OWLSchema.g:1172:3: ( ^( REPEAT_CONTROL ( increment_control )? ( while_control )? ( until_control )? ) )
            // OWLSchema.g:1172:6: ^( REPEAT_CONTROL ( increment_control )? ( while_control )? ( until_control )? )
            {
            match(input,REPEAT_CONTROL,FOLLOW_REPEAT_CONTROL_in_repeat_control4346); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:1172:23: ( increment_control )?
                int alt109=2;
                int LA109_0 = input.LA(1);

                if ( (LA109_0==INCREMENT_CONTROL) ) {
                    alt109=1;
                }
                switch (alt109) {
                    case 1 :
                        // OWLSchema.g:1172:26: increment_control
                        {
                        pushFollow(FOLLOW_increment_control_in_repeat_control4351);
                        increment_control();

                        state._fsp--;


                        }
                        break;

                }

                // OWLSchema.g:1172:49: ( while_control )?
                int alt110=2;
                int LA110_0 = input.LA(1);

                if ( (LA110_0==WHILE_CONTROL) ) {
                    alt110=1;
                }
                switch (alt110) {
                    case 1 :
                        // OWLSchema.g:1172:52: while_control
                        {
                        pushFollow(FOLLOW_while_control_in_repeat_control4361);
                        while_control();

                        state._fsp--;


                        }
                        break;

                }

                // OWLSchema.g:1172:71: ( until_control )?
                int alt111=2;
                int LA111_0 = input.LA(1);

                if ( (LA111_0==UNTIL_CONTROL) ) {
                    alt111=1;
                }
                switch (alt111) {
                    case 1 :
                        // OWLSchema.g:1172:74: until_control
                        {
                        pushFollow(FOLLOW_until_control_in_repeat_control4371);
                        until_control();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "repeat_control"


    // $ANTLR start "repeat_stmt"
    // OWLSchema.g:1175:1: repeat_stmt : ^( REPEAT_STMT repeat_control stmt ( stmt )* ) ;
    public final void repeat_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:1176:3: ( ^( REPEAT_STMT repeat_control stmt ( stmt )* ) )
            // OWLSchema.g:1176:5: ^( REPEAT_STMT repeat_control stmt ( stmt )* )
            {
            match(input,REPEAT_STMT,FOLLOW_REPEAT_STMT_in_repeat_stmt4391); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_repeat_control_in_repeat_stmt4393);
            repeat_control();

            state._fsp--;

            pushFollow(FOLLOW_stmt_in_repeat_stmt4396);
            stmt();

            state._fsp--;

            // OWLSchema.g:1176:41: ( stmt )*
            loop112:
            do {
                int alt112=2;
                int LA112_0 = input.LA(1);

                if ( (LA112_0==STMT) ) {
                    alt112=1;
                }


                switch (alt112) {
            	case 1 :
            	    // OWLSchema.g:1176:44: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_repeat_stmt4402);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop112;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "repeat_stmt"


    // $ANTLR start "repetition"
    // OWLSchema.g:1179:1: repetition : ^( REPETITION numeric_expression ) ;
    public final void repetition() throws RecognitionException {
        try {
            // OWLSchema.g:1180:3: ( ^( REPETITION numeric_expression ) )
            // OWLSchema.g:1180:5: ^( REPETITION numeric_expression )
            {
            match(input,REPETITION,FOLLOW_REPETITION_in_repetition4422); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numeric_expression_in_repetition4424);
            numeric_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "repetition"


    // $ANTLR start "resource_or_rename"
    // OWLSchema.g:1183:1: resource_or_rename : ^( RESOURCE_OR_RENAME resource_ref ( rename_id )? ) ;
    public final void resource_or_rename() throws RecognitionException {
        try {
            // OWLSchema.g:1184:3: ( ^( RESOURCE_OR_RENAME resource_ref ( rename_id )? ) )
            // OWLSchema.g:1184:6: ^( RESOURCE_OR_RENAME resource_ref ( rename_id )? )
            {
            match(input,RESOURCE_OR_RENAME,FOLLOW_RESOURCE_OR_RENAME_in_resource_or_rename4441); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_resource_ref_in_resource_or_rename4443);
            resource_ref();

            state._fsp--;

            // OWLSchema.g:1184:41: ( rename_id )?
            int alt113=2;
            int LA113_0 = input.LA(1);

            if ( (LA113_0==RENAME_ID) ) {
                alt113=1;
            }
            switch (alt113) {
                case 1 :
                    // OWLSchema.g:1184:43: rename_id
                    {
                    pushFollow(FOLLOW_rename_id_in_resource_or_rename4448);
                    rename_id();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "resource_or_rename"


    // $ANTLR start "resource_ref"
    // OWLSchema.g:1187:1: resource_ref : ^( RESOURCE_REF ( constant_ref | entity_ref | function_ref | procedure_ref | type_ref ) ) ;
    public final void resource_ref() throws RecognitionException {
        try {
            // OWLSchema.g:1188:3: ( ^( RESOURCE_REF ( constant_ref | entity_ref | function_ref | procedure_ref | type_ref ) ) )
            // OWLSchema.g:1188:6: ^( RESOURCE_REF ( constant_ref | entity_ref | function_ref | procedure_ref | type_ref ) )
            {
            match(input,RESOURCE_REF,FOLLOW_RESOURCE_REF_in_resource_ref4469); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1188:21: ( constant_ref | entity_ref | function_ref | procedure_ref | type_ref )
            int alt114=5;
            switch ( input.LA(1) ) {
            case CONSTANT_REF:
                {
                alt114=1;
                }
                break;
            case ENTITY_REF:
                {
                alt114=2;
                }
                break;
            case FUNCTION_REF:
                {
                alt114=3;
                }
                break;
            case PROCEDURE_REF:
                {
                alt114=4;
                }
                break;
            case TYPE_REF:
                {
                alt114=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 114, 0, input);

                throw nvae;
            }

            switch (alt114) {
                case 1 :
                    // OWLSchema.g:1189:5: constant_ref
                    {
                    pushFollow(FOLLOW_constant_ref_in_resource_ref4477);
                    constant_ref();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1190:5: entity_ref
                    {
                    pushFollow(FOLLOW_entity_ref_in_resource_ref4483);
                    entity_ref();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:1191:5: function_ref
                    {
                    pushFollow(FOLLOW_function_ref_in_resource_ref4490);
                    function_ref();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // OWLSchema.g:1192:5: procedure_ref
                    {
                    pushFollow(FOLLOW_procedure_ref_in_resource_ref4497);
                    procedure_ref();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // OWLSchema.g:1193:5: type_ref
                    {
                    pushFollow(FOLLOW_type_ref_in_resource_ref4504);
                    type_ref();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "resource_ref"


    // $ANTLR start "return_stmt"
    // OWLSchema.g:1197:1: return_stmt : ^( RETURN_STMT ( expression )? ) ;
    public final void return_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:1198:3: ( ^( RETURN_STMT ( expression )? ) )
            // OWLSchema.g:1198:5: ^( RETURN_STMT ( expression )? )
            {
            match(input,RETURN_STMT,FOLLOW_RETURN_STMT_in_return_stmt4524); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:1198:19: ( expression )?
                int alt115=2;
                int LA115_0 = input.LA(1);

                if ( (LA115_0==EXPRESSION) ) {
                    alt115=1;
                }
                switch (alt115) {
                    case 1 :
                        // OWLSchema.g:1198:21: expression
                        {
                        pushFollow(FOLLOW_expression_in_return_stmt4528);
                        expression();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "return_stmt"


    // $ANTLR start "rule_decl"
    // OWLSchema.g:1201:1: rule_decl : ^( RULE_DECL rule_head ( algorithm_head )? ( stmt )* where_clause ) ;
    public final void rule_decl() throws RecognitionException {
        try {
            // OWLSchema.g:1202:3: ( ^( RULE_DECL rule_head ( algorithm_head )? ( stmt )* where_clause ) )
            // OWLSchema.g:1202:6: ^( RULE_DECL rule_head ( algorithm_head )? ( stmt )* where_clause )
            {
            match(input,RULE_DECL,FOLLOW_RULE_DECL_in_rule_decl4549); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_rule_head_in_rule_decl4551);
            rule_head();

            state._fsp--;

            // OWLSchema.g:1202:28: ( algorithm_head )?
            int alt116=2;
            int LA116_0 = input.LA(1);

            if ( (LA116_0==ALGORITHM_HEAD) ) {
                alt116=1;
            }
            switch (alt116) {
                case 1 :
                    // OWLSchema.g:1202:30: algorithm_head
                    {
                    pushFollow(FOLLOW_algorithm_head_in_rule_decl4555);
                    algorithm_head();

                    state._fsp--;


                    }
                    break;

            }

            // OWLSchema.g:1202:48: ( stmt )*
            loop117:
            do {
                int alt117=2;
                int LA117_0 = input.LA(1);

                if ( (LA117_0==STMT) ) {
                    alt117=1;
                }


                switch (alt117) {
            	case 1 :
            	    // OWLSchema.g:1202:51: stmt
            	    {
            	    pushFollow(FOLLOW_stmt_in_rule_decl4563);
            	    stmt();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop117;
                }
            } while (true);

            pushFollow(FOLLOW_where_clause_in_rule_decl4570);
            where_clause();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rule_decl"


    // $ANTLR start "rule_head"
    // OWLSchema.g:1205:1: rule_head : ^( RULE_HEAD rule_id entity_ref ( entity_ref )* ) ;
    public final void rule_head() throws RecognitionException {
        try {
            // OWLSchema.g:1206:3: ( ^( RULE_HEAD rule_id entity_ref ( entity_ref )* ) )
            // OWLSchema.g:1206:5: ^( RULE_HEAD rule_id entity_ref ( entity_ref )* )
            {
            match(input,RULE_HEAD,FOLLOW_RULE_HEAD_in_rule_head4585); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_rule_id_in_rule_head4588);
            rule_id();

            state._fsp--;

            pushFollow(FOLLOW_entity_ref_in_rule_head4591);
            entity_ref();

            state._fsp--;

            // OWLSchema.g:1206:39: ( entity_ref )*
            loop118:
            do {
                int alt118=2;
                int LA118_0 = input.LA(1);

                if ( (LA118_0==ENTITY_REF) ) {
                    alt118=1;
                }


                switch (alt118) {
            	case 1 :
            	    // OWLSchema.g:1206:41: entity_ref
            	    {
            	    pushFollow(FOLLOW_entity_ref_in_rule_head4596);
            	    entity_ref();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop118;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rule_head"


    // $ANTLR start "rule_id"
    // OWLSchema.g:1209:1: rule_id : ^( RULE_ID IDENT ) ;
    public final void rule_id() throws RecognitionException {
        try {
            // OWLSchema.g:1210:3: ( ^( RULE_ID IDENT ) )
            // OWLSchema.g:1210:6: ^( RULE_ID IDENT )
            {
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule_id4618); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_rule_id4620); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "rule_id"

    public static class schema_id_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "schema_id"
    // OWLSchema.g:1213:1: schema_id : ^( SCHEMA_ID IDENT ) ;
    public final schema_id_return schema_id() throws RecognitionException {
        schema_id_return retval = new schema_id_return();
        retval.start = input.LT(1);

        try {
            // OWLSchema.g:1214:3: ( ^( SCHEMA_ID IDENT ) )
            // OWLSchema.g:1214:6: ^( SCHEMA_ID IDENT )
            {
            match(input,SCHEMA_ID,FOLLOW_SCHEMA_ID_in_schema_id4636); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_schema_id4638); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "schema_id"


    // $ANTLR start "schema_body"
    // OWLSchema.g:1217:1: schema_body : ^( SCHEMA_BODY ( interface_specification )* ( constant_decl )? ( declaration | rule_decl )* ) ;
    public final void schema_body() throws RecognitionException {
        try {
            // OWLSchema.g:1218:3: ( ^( SCHEMA_BODY ( interface_specification )* ( constant_decl )? ( declaration | rule_decl )* ) )
            // OWLSchema.g:1218:6: ^( SCHEMA_BODY ( interface_specification )* ( constant_decl )? ( declaration | rule_decl )* )
            {
            match(input,SCHEMA_BODY,FOLLOW_SCHEMA_BODY_in_schema_body4654); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:1218:20: ( interface_specification )*
                loop119:
                do {
                    int alt119=2;
                    int LA119_0 = input.LA(1);

                    if ( (LA119_0==INTERFACE_SPECIFICATION) ) {
                        alt119=1;
                    }


                    switch (alt119) {
                	case 1 :
                	    // OWLSchema.g:1218:22: interface_specification
                	    {
                	    pushFollow(FOLLOW_interface_specification_in_schema_body4658);
                	    interface_specification();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop119;
                    }
                } while (true);

                // OWLSchema.g:1218:49: ( constant_decl )?
                int alt120=2;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==CONSTANT_DECL) ) {
                    alt120=1;
                }
                switch (alt120) {
                    case 1 :
                        // OWLSchema.g:1218:51: constant_decl
                        {
                        pushFollow(FOLLOW_constant_decl_in_schema_body4665);
                        constant_decl();

                        state._fsp--;


                        }
                        break;

                }

                // OWLSchema.g:1218:68: ( declaration | rule_decl )*
                loop121:
                do {
                    int alt121=3;
                    int LA121_0 = input.LA(1);

                    if ( (LA121_0==DECLARATION) ) {
                        alt121=1;
                    }
                    else if ( (LA121_0==RULE_DECL) ) {
                        alt121=2;
                    }


                    switch (alt121) {
                	case 1 :
                	    // OWLSchema.g:1218:70: declaration
                	    {
                	    pushFollow(FOLLOW_declaration_in_schema_body4672);
                	    declaration();

                	    state._fsp--;


                	    }
                	    break;
                	case 2 :
                	    // OWLSchema.g:1218:84: rule_decl
                	    {
                	    pushFollow(FOLLOW_rule_decl_in_schema_body4676);
                	    rule_decl();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop121;
                    }
                } while (true);


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "schema_body"


    // $ANTLR start "schema_decl"
    // OWLSchema.g:1221:1: schema_decl : ^( SCHEMA_DECL ( schema_version_id )? schema_id schema_body ) ;
    public final void schema_decl() throws RecognitionException {
        schema_id_return schema_id5 = null;


        try {
            // OWLSchema.g:1222:7: ( ^( SCHEMA_DECL ( schema_version_id )? schema_id schema_body ) )
            // OWLSchema.g:1222:9: ^( SCHEMA_DECL ( schema_version_id )? schema_id schema_body )
            {
            match(input,SCHEMA_DECL,FOLLOW_SCHEMA_DECL_in_schema_decl4698); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1222:23: ( schema_version_id )?
            int alt122=2;
            int LA122_0 = input.LA(1);

            if ( (LA122_0==SCHEMA_VERSION_ID) ) {
                alt122=1;
            }
            switch (alt122) {
                case 1 :
                    // OWLSchema.g:1222:25: schema_version_id
                    {
                    pushFollow(FOLLOW_schema_version_id_in_schema_decl4702);
                    schema_version_id();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_schema_id_in_schema_decl4707);
            schema_id5=schema_id();

            state._fsp--;


            			currentOntoIRI = IRI.create(ontoURI + (schema_id5!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(schema_id5.start),
              input.getTreeAdaptor().getTokenStopIndex(schema_id5.start))):null).toLowerCase());
            			
            			// The ontology does not exist: we have to create it and save it at the end.
            			if (currentOntology == null)
            			{
            				physURI = (new File(".")).toURI() + "/" + (schema_id5!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(schema_id5.start),
              input.getTreeAdaptor().getTokenStopIndex(schema_id5.start))):null).toLowerCase() + ".owl";
            				manager.addIRIMapper(new SimpleIRIMapper(currentOntoIRI, IRI.create(physURI)));
            				currentOntology = manager.createOntology(currentOntoIRI);
            			}
            			newAxioms = new HashSet<OWLAxiom>();
            			
            			currentFactory = manager.getOWLDataFactory();
            			h = new OWLHelper(currentFactory, currentOntoIRI.toString());
            			thing = currentFactory.getOWLThing();
            			nothing = currentFactory.getOWLNothing();
            			disj = new HashSet<OWLClassExpression>();
            			
            			//We need to deal with the references/uses, so we get relevent scope
            			// This one was already lowercased
            			Scope currentScope = scopes.get((schema_id5!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(schema_id5.start),
              input.getTreeAdaptor().getTokenStopIndex(schema_id5.start))):null).toLowerCase());
            			Vector<ExternalId> ids = currentScope.getUsedExternals();
            			for(ExternalId eid : ids)
            			{
            				OWLClass cExt = h.getClas(eid.schema, eid.id);
            				OWLClass cInt = h.getClas(eid.rename);
            				//addAxiom(h.getEquivalentClassesAxiom(cExt, cInt));
            			}
            			
            			ids = currentScope.getReferencedExternals();
            			for(ExternalId eid : ids)
            			{
            				OWLClass cExt = h.getClas(eid.schema, eid.id);
            				OWLClass cInt = h.getClas(eid.rename);
            				//addAxiom(getEquivalentClassesAxiom(cExt, cInt));
            			}
            			
            			counter = 0;
            			attr = h.getClas("attribute");
            			addAxiom(h.getDeclarationAxiom(attr));
            			OWLAnnotation owlca = h.getOCAExpressConstruct("attribute");
            			addAxiom(h.getAnnotationAxiom(attr.getIRI(), owlca));
            			
            			String[][] types = {
            				{"string", "string"}, 
            				{"boolean", "boolean", "logical"}, 
            				{"decimal", "real", "number"}, 
            				{"integer", "integer", "binary"}
            				};
            			for(String[] s : types)
            			{
            				for(int i=1;i<s.length;i++)
            				{
            					OWLClass c = h.getClas(s[i]);
            					addAxiom(h.getSubClassAxiom(c, attr));
            					OWLAnnotation owlca2 = h.getOCAExpressConstruct("datatype");
            					addAxiom(h.getAnnotationAxiom(c.getIRI(), owlca2));
            					OWLDatatype dt = h.getDataTypeW3(s[0]);
            					OWLDataProperty dtp = h.getDP("to_" + s[0] );
            					addAxiom(h.getDPDomainAxiom(dtp, c));
            					addAxiom(h.getDPRangeAxiom(dtp, dt));
            				}
            			}
            		
            pushFollow(FOLLOW_schema_body_in_schema_decl4716);
            schema_body();

            state._fsp--;


            			//addAxiom(h.getDisjointClassesAxiom(disj));
            			
            			manager.addAxioms(currentOntology, newAxioms);
            			
            			/*
            			org.mindswap.pellet.PelletOptions.USE_CONTINUOUS_RULES=true;
            			OWLReasoner reasoner = new Reasoner(manager);
            			reasoner.loadOntologies(Collections.singleton(currentOntology));
            			reasoner.classify();
            			
            			List<InferredAxiomGenerator<? extends OWLAxiom>> gens = new ArrayList<InferredAxiomGenerator<? extends OWLAxiom>>();
            			gens.add(new InferredSubClassAxiomGenerator());
            			
            			InferredOntologyGenerator iog = new InferredOntologyGenerator(reasoner, gens);
            			iog.fillOntology(manager, currentOntology2);
            			*/
            			if (physURI != null)
            				manager.saveOntology(currentOntology);
            		

            match(input, Token.UP, null); 

            }

        }
        catch (OWLException e) {
            e.printStackTrace();
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "schema_decl"


    // $ANTLR start "schema_version_id"
    // OWLSchema.g:1312:1: schema_version_id : ^( SCHEMA_VERSION_ID string_literal ) ;
    public final void schema_version_id() throws RecognitionException {
        try {
            // OWLSchema.g:1313:3: ( ^( SCHEMA_VERSION_ID string_literal ) )
            // OWLSchema.g:1313:5: ^( SCHEMA_VERSION_ID string_literal )
            {
            match(input,SCHEMA_VERSION_ID,FOLLOW_SCHEMA_VERSION_ID_in_schema_version_id4753); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_string_literal_in_schema_version_id4755);
            string_literal();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "schema_version_id"


    // $ANTLR start "interface_specification"
    // OWLSchema.g:1316:1: interface_specification : ^( INTERFACE_SPECIFICATION ( reference_clause | use_clause ) ) ;
    public final void interface_specification() throws RecognitionException {
        try {
            // OWLSchema.g:1317:3: ( ^( INTERFACE_SPECIFICATION ( reference_clause | use_clause ) ) )
            // OWLSchema.g:1317:6: ^( INTERFACE_SPECIFICATION ( reference_clause | use_clause ) )
            {
            match(input,INTERFACE_SPECIFICATION,FOLLOW_INTERFACE_SPECIFICATION_in_interface_specification4771); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1317:32: ( reference_clause | use_clause )
            int alt123=2;
            int LA123_0 = input.LA(1);

            if ( (LA123_0==REFERENCE_CLAUSE) ) {
                alt123=1;
            }
            else if ( (LA123_0==USE_CLAUSE) ) {
                alt123=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 123, 0, input);

                throw nvae;
            }
            switch (alt123) {
                case 1 :
                    // OWLSchema.g:1318:5: reference_clause
                    {
                    pushFollow(FOLLOW_reference_clause_in_interface_specification4779);
                    reference_clause();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1319:5: use_clause
                    {
                    pushFollow(FOLLOW_use_clause_in_interface_specification4785);
                    use_clause();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "interface_specification"


    // $ANTLR start "use_clause"
    // OWLSchema.g:1323:1: use_clause : ^( USE_CLAUSE schema_ref ( named_type_or_rename ( named_type_or_rename )* )? ) ;
    public final void use_clause() throws RecognitionException {
        schema_ref_return schema_ref6 = null;


        try {
            // OWLSchema.g:1324:3: ( ^( USE_CLAUSE schema_ref ( named_type_or_rename ( named_type_or_rename )* )? ) )
            // OWLSchema.g:1324:5: ^( USE_CLAUSE schema_ref ( named_type_or_rename ( named_type_or_rename )* )? )
            {
            match(input,USE_CLAUSE,FOLLOW_USE_CLAUSE_in_use_clause4804); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_schema_ref_in_use_clause4806);
            schema_ref6=schema_ref();

            state._fsp--;


            			currentExternalSchema = (schema_ref6!=null?(input.getTokenStream().toString(
              input.getTreeAdaptor().getTokenStartIndex(schema_ref6.start),
              input.getTreeAdaptor().getTokenStopIndex(schema_ref6.start))):null).toLowerCase();
            		
            // OWLSchema.g:1328:3: ( named_type_or_rename ( named_type_or_rename )* )?
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==NAMED_TYPE_OR_RENAME) ) {
                alt125=1;
            }
            switch (alt125) {
                case 1 :
                    // OWLSchema.g:1328:5: named_type_or_rename ( named_type_or_rename )*
                    {
                    pushFollow(FOLLOW_named_type_or_rename_in_use_clause4817);
                    named_type_or_rename();

                    state._fsp--;

                    // OWLSchema.g:1328:26: ( named_type_or_rename )*
                    loop124:
                    do {
                        int alt124=2;
                        int LA124_0 = input.LA(1);

                        if ( (LA124_0==NAMED_TYPE_OR_RENAME) ) {
                            alt124=1;
                        }


                        switch (alt124) {
                    	case 1 :
                    	    // OWLSchema.g:1328:28: named_type_or_rename
                    	    {
                    	    pushFollow(FOLLOW_named_type_or_rename_in_use_clause4821);
                    	    named_type_or_rename();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop124;
                        }
                    } while (true);


                    }
                    break;

            }


            match(input, Token.UP, null); 

            			currentExternalSchema = null;
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "use_clause"


    // $ANTLR start "named_type_or_rename"
    // OWLSchema.g:1334:1: named_type_or_rename : ^( NAMED_TYPE_OR_RENAME named_types ( entity_id | type_id )? ) ;
    public final void named_type_or_rename() throws RecognitionException {
        try {
            // OWLSchema.g:1335:3: ( ^( NAMED_TYPE_OR_RENAME named_types ( entity_id | type_id )? ) )
            // OWLSchema.g:1335:6: ^( NAMED_TYPE_OR_RENAME named_types ( entity_id | type_id )? )
            {
            match(input,NAMED_TYPE_OR_RENAME,FOLLOW_NAMED_TYPE_OR_RENAME_in_named_type_or_rename4848); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_named_types_in_named_type_or_rename4850);
            named_types();

            state._fsp--;

            // OWLSchema.g:1335:41: ( entity_id | type_id )?
            int alt126=3;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==ENTITY_ID) ) {
                alt126=1;
            }
            else if ( (LA126_0==TYPE_ID) ) {
                alt126=2;
            }
            switch (alt126) {
                case 1 :
                    // OWLSchema.g:1335:43: entity_id
                    {
                    pushFollow(FOLLOW_entity_id_in_named_type_or_rename4854);
                    entity_id();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1335:55: type_id
                    {
                    pushFollow(FOLLOW_type_id_in_named_type_or_rename4858);
                    type_id();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "named_type_or_rename"


    // $ANTLR start "selector"
    // OWLSchema.g:1337:1: selector : ^( SELECTOR expression ) ;
    public final void selector() throws RecognitionException {
        try {
            // OWLSchema.g:1338:3: ( ^( SELECTOR expression ) )
            // OWLSchema.g:1338:6: ^( SELECTOR expression )
            {
            match(input,SELECTOR,FOLLOW_SELECTOR_in_selector4876); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_expression_in_selector4878);
            expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "selector"


    // $ANTLR start "set_type"
    // OWLSchema.g:1341:1: set_type returns [OWLClass owlc] : ^( SET_TYPE (bs= bound_spec )? bt= base_type ) ;
    public final OWLClass set_type() throws RecognitionException {
        OWLClass owlc = null;

        bound_spec_return bs = null;

        OWLClass bt = null;


        try {
            // OWLSchema.g:1342:3: ( ^( SET_TYPE (bs= bound_spec )? bt= base_type ) )
            // OWLSchema.g:1342:5: ^( SET_TYPE (bs= bound_spec )? bt= base_type )
            {
            match(input,SET_TYPE,FOLLOW_SET_TYPE_in_set_type4898); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1342:16: (bs= bound_spec )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==BOUND_SPEC) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // OWLSchema.g:1342:19: bs= bound_spec
                    {
                    pushFollow(FOLLOW_bound_spec_in_set_type4905);
                    bs=bound_spec();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_base_type_in_set_type4914);
            bt=base_type();

            state._fsp--;


            match(input, Token.UP, null); 

            		if (bs != null)
            		{
            			bagset = true;
            			if ((bs!=null?bs.down:null) != null)
            				lb = (bs!=null?bs.down:null).intValue();
            			else
            				lb = 0;
            			if ((bs!=null?bs.up:null) != null)
            				hb = (bs!=null?bs.up:null);
            			else
            				hb = Integer.MAX_VALUE;
            			log.debug((bs!=null?bs.down:null) + "-" + (bs!=null?bs.up:null));
            		}
            		owlc = createSet(bt.getIRI().getFragment());
            	

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "set_type"

    public static class simple_expression_return extends TreeRuleReturnScope {
        public Integer intVal;
        public Double doubleVal;
    };

    // $ANTLR start "simple_expression"
    // OWLSchema.g:1362:1: simple_expression returns [Integer intVal, Double doubleVal] : ^( SIMPLE_EXPRESSION t1= term (mlo= add_like_op t2= term )* ) ;
    public final simple_expression_return simple_expression() throws RecognitionException {
        simple_expression_return retval = new simple_expression_return();
        retval.start = input.LT(1);

        term_return t1 = null;

        int mlo = 0;

        term_return t2 = null;


        try {
            // OWLSchema.g:1363:3: ( ^( SIMPLE_EXPRESSION t1= term (mlo= add_like_op t2= term )* ) )
            // OWLSchema.g:1363:5: ^( SIMPLE_EXPRESSION t1= term (mlo= add_like_op t2= term )* )
            {
            match(input,SIMPLE_EXPRESSION,FOLLOW_SIMPLE_EXPRESSION_in_simple_expression4943); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_term_in_simple_expression4947);
            t1=term();

            state._fsp--;


            			retval.intVal = (t1!=null?t1.intVal:null);
            			retval.doubleVal = (t1!=null?t1.doubleVal:null);
            		
            // OWLSchema.g:1368:3: (mlo= add_like_op t2= term )*
            loop128:
            do {
                int alt128=2;
                int LA128_0 = input.LA(1);

                if ( (LA128_0==ADD_LIKE_OP) ) {
                    alt128=1;
                }


                switch (alt128) {
            	case 1 :
            	    // OWLSchema.g:1368:5: mlo= add_like_op t2= term
            	    {
            	    pushFollow(FOLLOW_add_like_op_in_simple_expression4960);
            	    mlo=add_like_op();

            	    state._fsp--;

            	    pushFollow(FOLLOW_term_in_simple_expression4965);
            	    t2=term();

            	    state._fsp--;


            	    			if (retval.intVal != null && (t2!=null?t2.intVal:null) != null)
            	    			{
            	    				if (mlo == PLUS) retval.intVal = Integer.valueOf(retval.intVal.intValue() + (t2!=null?t2.intVal:null).intValue());
            	    				else if (mlo == MINUS) retval.intVal = Integer.valueOf(retval.intVal.intValue() - (t2!=null?t2.intVal:null).intValue());
            	    				else retval.intVal = null;
            	    			}
            	    			else if (retval.doubleVal != null && (t2!=null?t2.doubleVal:null) != null)
            	    			{
            	    				if (mlo == PLUS) retval.doubleVal = new Double(retval.doubleVal.doubleValue() + (t2!=null?t2.doubleVal:null).doubleValue());
            	    				if (mlo == MINUS) retval.doubleVal = new Double(retval.doubleVal.doubleValue() - (t2!=null?t2.doubleVal:null).doubleValue());
            	    				else retval.doubleVal = null;
            	    			}
            	    		

            	    }
            	    break;

            	default :
            	    break loop128;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simple_expression"


    // $ANTLR start "add_like_op"
    // OWLSchema.g:1386:1: add_like_op returns [int op] : ^( ADD_LIKE_OP ( PLUS | MINUS | OR | XOR ) ) ;
    public final int add_like_op() throws RecognitionException {
        int op = 0;

        try {
            // OWLSchema.g:1387:3: ( ^( ADD_LIKE_OP ( PLUS | MINUS | OR | XOR ) ) )
            // OWLSchema.g:1387:6: ^( ADD_LIKE_OP ( PLUS | MINUS | OR | XOR ) )
            {
            match(input,ADD_LIKE_OP,FOLLOW_ADD_LIKE_OP_in_add_like_op4996); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1387:20: ( PLUS | MINUS | OR | XOR )
            int alt129=4;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt129=1;
                }
                break;
            case MINUS:
                {
                alt129=2;
                }
                break;
            case OR:
                {
                alt129=3;
                }
                break;
            case XOR:
                {
                alt129=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;
            }

            switch (alt129) {
                case 1 :
                    // OWLSchema.g:1388:6: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_add_like_op5005); 
                    op = PLUS;

                    }
                    break;
                case 2 :
                    // OWLSchema.g:1389:6: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_add_like_op5014); 
                    op = MINUS;

                    }
                    break;
                case 3 :
                    // OWLSchema.g:1390:6: OR
                    {
                    match(input,OR,FOLLOW_OR_in_add_like_op5024); 
                    op = OR;

                    }
                    break;
                case 4 :
                    // OWLSchema.g:1391:6: XOR
                    {
                    match(input,XOR,FOLLOW_XOR_in_add_like_op5033); 
                    op = XOR;

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "add_like_op"

    public static class simple_factor_return extends TreeRuleReturnScope {
        public Integer intVal;
        public Double doubleVal;
    };

    // $ANTLR start "simple_factor"
    // OWLSchema.g:1395:1: simple_factor returns [Integer intVal, Double doubleVal] : ^( SIMPLE_FACTOR ( aggregate_initializer | interval | query_expression | entity_constructor | enumeration_reference | (uo= unary_op )? ( expression | p= primary ) ) ) ;
    public final simple_factor_return simple_factor() throws RecognitionException {
        simple_factor_return retval = new simple_factor_return();
        retval.start = input.LT(1);

        int uo = 0;

        primary_return p = null;


        try {
            // OWLSchema.g:1396:3: ( ^( SIMPLE_FACTOR ( aggregate_initializer | interval | query_expression | entity_constructor | enumeration_reference | (uo= unary_op )? ( expression | p= primary ) ) ) )
            // OWLSchema.g:1396:6: ^( SIMPLE_FACTOR ( aggregate_initializer | interval | query_expression | entity_constructor | enumeration_reference | (uo= unary_op )? ( expression | p= primary ) ) )
            {
            match(input,SIMPLE_FACTOR,FOLLOW_SIMPLE_FACTOR_in_simple_factor5059); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1396:22: ( aggregate_initializer | interval | query_expression | entity_constructor | enumeration_reference | (uo= unary_op )? ( expression | p= primary ) )
            int alt132=6;
            switch ( input.LA(1) ) {
            case AGGREGATE_INITIALIZER:
                {
                alt132=1;
                }
                break;
            case INTERVAL:
                {
                alt132=2;
                }
                break;
            case QUERY_EXPRESSION:
                {
                alt132=3;
                }
                break;
            case ENTITY_CONSTRUCTOR:
                {
                alt132=4;
                }
                break;
            case ENUMERATION_REFERENCE:
                {
                alt132=5;
                }
                break;
            case EXPRESSION:
            case PRIMARY:
            case UNARY_OP:
                {
                alt132=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 132, 0, input);

                throw nvae;
            }

            switch (alt132) {
                case 1 :
                    // OWLSchema.g:1397:5: aggregate_initializer
                    {
                    pushFollow(FOLLOW_aggregate_initializer_in_simple_factor5067);
                    aggregate_initializer();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1398:5: interval
                    {
                    pushFollow(FOLLOW_interval_in_simple_factor5077);
                    interval();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:1399:5: query_expression
                    {
                    pushFollow(FOLLOW_query_expression_in_simple_factor5085);
                    query_expression();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // OWLSchema.g:1400:5: entity_constructor
                    {
                    pushFollow(FOLLOW_entity_constructor_in_simple_factor5093);
                    entity_constructor();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // OWLSchema.g:1401:5: enumeration_reference
                    {
                    pushFollow(FOLLOW_enumeration_reference_in_simple_factor5099);
                    enumeration_reference();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // OWLSchema.g:1402:5: (uo= unary_op )? ( expression | p= primary )
                    {
                    // OWLSchema.g:1402:5: (uo= unary_op )?
                    int alt130=2;
                    int LA130_0 = input.LA(1);

                    if ( (LA130_0==UNARY_OP) ) {
                        alt130=1;
                    }
                    switch (alt130) {
                        case 1 :
                            // OWLSchema.g:1402:8: uo= unary_op
                            {
                            pushFollow(FOLLOW_unary_op_in_simple_factor5110);
                            uo=unary_op();

                            state._fsp--;


                            }
                            break;

                    }

                    // OWLSchema.g:1402:25: ( expression | p= primary )
                    int alt131=2;
                    int LA131_0 = input.LA(1);

                    if ( (LA131_0==EXPRESSION) ) {
                        alt131=1;
                    }
                    else if ( (LA131_0==PRIMARY) ) {
                        alt131=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 131, 0, input);

                        throw nvae;
                    }
                    switch (alt131) {
                        case 1 :
                            // OWLSchema.g:1402:27: expression
                            {
                            pushFollow(FOLLOW_expression_in_simple_factor5119);
                            expression();

                            state._fsp--;


                            }
                            break;
                        case 2 :
                            // OWLSchema.g:1402:41: p= primary
                            {
                            pushFollow(FOLLOW_primary_in_simple_factor5126);
                            p=primary();

                            state._fsp--;


                            }
                            break;

                    }


                    			if (p != null)
                    			{
                    				if ((p!=null?p.intVal:null) != null)
                    				{
                    					int i = (p!=null?p.intVal:null).intValue();
                    					if (uo == MINUS)
                    						retval.intVal = Integer.valueOf(-i);
                    					else
                    						retval.intVal = Integer.valueOf(i);
                    				}
                    				else if ((p!=null?p.doubleVal:null) != null)
                    				{
                    					double d = (p!=null?p.doubleVal:null).doubleValue();
                    					if (uo == MINUS)
                    						retval.doubleVal = new Double(-d);
                    					else
                    						retval.doubleVal = new Double(d);
                    				}
                    			}
                    		

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simple_factor"


    // $ANTLR start "simple_types"
    // OWLSchema.g:1427:1: simple_types returns [OWLClass owlc] : ^( SIMPLE_TYPES (typ= binary_type | typ= boolean_type | typ= integer_type | typ= logical_type | typ= number_type | typ= real_type | typ= string_type ) ) ;
    public final OWLClass simple_types() throws RecognitionException {
        OWLClass owlc = null;

        String typ = null;


        try {
            // OWLSchema.g:1428:3: ( ^( SIMPLE_TYPES (typ= binary_type | typ= boolean_type | typ= integer_type | typ= logical_type | typ= number_type | typ= real_type | typ= string_type ) ) )
            // OWLSchema.g:1428:6: ^( SIMPLE_TYPES (typ= binary_type | typ= boolean_type | typ= integer_type | typ= logical_type | typ= number_type | typ= real_type | typ= string_type ) )
            {
            match(input,SIMPLE_TYPES,FOLLOW_SIMPLE_TYPES_in_simple_types5157); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1428:21: (typ= binary_type | typ= boolean_type | typ= integer_type | typ= logical_type | typ= number_type | typ= real_type | typ= string_type )
            int alt133=7;
            switch ( input.LA(1) ) {
            case BINARY_TYPE:
                {
                alt133=1;
                }
                break;
            case BOOLEAN_TYPE:
                {
                alt133=2;
                }
                break;
            case INTEGER_TYPE:
                {
                alt133=3;
                }
                break;
            case LOGICAL_TYPE:
                {
                alt133=4;
                }
                break;
            case NUMBER_TYPE:
                {
                alt133=5;
                }
                break;
            case REAL_TYPE:
                {
                alt133=6;
                }
                break;
            case STRING_TYPE:
                {
                alt133=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;
            }

            switch (alt133) {
                case 1 :
                    // OWLSchema.g:1429:5: typ= binary_type
                    {
                    pushFollow(FOLLOW_binary_type_in_simple_types5167);
                    typ=binary_type();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1430:5: typ= boolean_type
                    {
                    pushFollow(FOLLOW_boolean_type_in_simple_types5177);
                    typ=boolean_type();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:1431:5: typ= integer_type
                    {
                    pushFollow(FOLLOW_integer_type_in_simple_types5187);
                    typ=integer_type();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // OWLSchema.g:1432:5: typ= logical_type
                    {
                    pushFollow(FOLLOW_logical_type_in_simple_types5195);
                    typ=logical_type();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // OWLSchema.g:1433:5: typ= number_type
                    {
                    pushFollow(FOLLOW_number_type_in_simple_types5203);
                    typ=number_type();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // OWLSchema.g:1434:5: typ= real_type
                    {
                    pushFollow(FOLLOW_real_type_in_simple_types5213);
                    typ=real_type();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // OWLSchema.g:1435:5: typ= string_type
                    {
                    pushFollow(FOLLOW_string_type_in_simple_types5223);
                    typ=string_type();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            			owlc = h.getClas(typ);
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "simple_types"


    // $ANTLR start "skip_stmt"
    // OWLSchema.g:1442:1: skip_stmt : ^( SKIP_STMT nothing ) ;
    public final void skip_stmt() throws RecognitionException {
        try {
            // OWLSchema.g:1443:3: ( ^( SKIP_STMT nothing ) )
            // OWLSchema.g:1443:6: ^( SKIP_STMT nothing )
            {
            match(input,SKIP_STMT,FOLLOW_SKIP_STMT_in_skip_stmt5247); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_nothing_in_skip_stmt5249);
                nothing();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "skip_stmt"


    // $ANTLR start "stmt"
    // OWLSchema.g:1446:1: stmt : ^( STMT ( alias_stmt | assignment_stmt | case_stmt | compound_stmt | escape_stmt | if_stmt | null_stmt | procedure_call_stmt | repeat_stmt | return_stmt | skip_stmt ) ) ;
    public final void stmt() throws RecognitionException {
        try {
            // OWLSchema.g:1447:3: ( ^( STMT ( alias_stmt | assignment_stmt | case_stmt | compound_stmt | escape_stmt | if_stmt | null_stmt | procedure_call_stmt | repeat_stmt | return_stmt | skip_stmt ) ) )
            // OWLSchema.g:1447:6: ^( STMT ( alias_stmt | assignment_stmt | case_stmt | compound_stmt | escape_stmt | if_stmt | null_stmt | procedure_call_stmt | repeat_stmt | return_stmt | skip_stmt ) )
            {
            match(input,STMT,FOLLOW_STMT_in_stmt5265); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1447:13: ( alias_stmt | assignment_stmt | case_stmt | compound_stmt | escape_stmt | if_stmt | null_stmt | procedure_call_stmt | repeat_stmt | return_stmt | skip_stmt )
            int alt134=11;
            switch ( input.LA(1) ) {
            case ALIAS_STMT:
                {
                alt134=1;
                }
                break;
            case ASSIGNMENT_STMT:
                {
                alt134=2;
                }
                break;
            case CASE_STMT:
                {
                alt134=3;
                }
                break;
            case COMPOUND_STMT:
                {
                alt134=4;
                }
                break;
            case ESCAPE_STMT:
                {
                alt134=5;
                }
                break;
            case IF_STMT:
                {
                alt134=6;
                }
                break;
            case NULL_STMT:
                {
                alt134=7;
                }
                break;
            case PROCEDURE_CALL_STMT:
                {
                alt134=8;
                }
                break;
            case REPEAT_STMT:
                {
                alt134=9;
                }
                break;
            case RETURN_STMT:
                {
                alt134=10;
                }
                break;
            case SKIP_STMT:
                {
                alt134=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 134, 0, input);

                throw nvae;
            }

            switch (alt134) {
                case 1 :
                    // OWLSchema.g:1448:5: alias_stmt
                    {
                    pushFollow(FOLLOW_alias_stmt_in_stmt5273);
                    alias_stmt();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1449:5: assignment_stmt
                    {
                    pushFollow(FOLLOW_assignment_stmt_in_stmt5279);
                    assignment_stmt();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:1450:5: case_stmt
                    {
                    pushFollow(FOLLOW_case_stmt_in_stmt5287);
                    case_stmt();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // OWLSchema.g:1451:5: compound_stmt
                    {
                    pushFollow(FOLLOW_compound_stmt_in_stmt5295);
                    compound_stmt();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // OWLSchema.g:1452:5: escape_stmt
                    {
                    pushFollow(FOLLOW_escape_stmt_in_stmt5303);
                    escape_stmt();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // OWLSchema.g:1453:5: if_stmt
                    {
                    pushFollow(FOLLOW_if_stmt_in_stmt5311);
                    if_stmt();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // OWLSchema.g:1454:5: null_stmt
                    {
                    pushFollow(FOLLOW_null_stmt_in_stmt5319);
                    null_stmt();

                    state._fsp--;


                    }
                    break;
                case 8 :
                    // OWLSchema.g:1455:5: procedure_call_stmt
                    {
                    pushFollow(FOLLOW_procedure_call_stmt_in_stmt5327);
                    procedure_call_stmt();

                    state._fsp--;


                    }
                    break;
                case 9 :
                    // OWLSchema.g:1456:5: repeat_stmt
                    {
                    pushFollow(FOLLOW_repeat_stmt_in_stmt5334);
                    repeat_stmt();

                    state._fsp--;


                    }
                    break;
                case 10 :
                    // OWLSchema.g:1457:5: return_stmt
                    {
                    pushFollow(FOLLOW_return_stmt_in_stmt5342);
                    return_stmt();

                    state._fsp--;


                    }
                    break;
                case 11 :
                    // OWLSchema.g:1458:5: skip_stmt
                    {
                    pushFollow(FOLLOW_skip_stmt_in_stmt5350);
                    skip_stmt();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "stmt"


    // $ANTLR start "string_type"
    // OWLSchema.g:1462:1: string_type returns [String stype] : ^( STRING_TYPE ( width_spec )? ) ;
    public final String string_type() throws RecognitionException {
        String stype = null;

        try {
            // OWLSchema.g:1463:3: ( ^( STRING_TYPE ( width_spec )? ) )
            // OWLSchema.g:1463:5: ^( STRING_TYPE ( width_spec )? )
            {
            match(input,STRING_TYPE,FOLLOW_STRING_TYPE_in_string_type5374); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:1463:20: ( width_spec )?
                int alt135=2;
                int LA135_0 = input.LA(1);

                if ( (LA135_0==WIDTH_SPEC) ) {
                    alt135=1;
                }
                switch (alt135) {
                    case 1 :
                        // OWLSchema.g:1463:23: width_spec
                        {
                        pushFollow(FOLLOW_width_spec_in_string_type5380);
                        width_spec();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            			stype="string";
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return stype;
    }
    // $ANTLR end "string_type"


    // $ANTLR start "subtype_constraint"
    // OWLSchema.g:1470:1: subtype_constraint : ^( SUBTYPE_CONSTRAINT se= supertype_expression ) ;
    public final void subtype_constraint() throws RecognitionException {
        OWLClass se = null;


        try {
            // OWLSchema.g:1471:3: ( ^( SUBTYPE_CONSTRAINT se= supertype_expression ) )
            // OWLSchema.g:1471:5: ^( SUBTYPE_CONSTRAINT se= supertype_expression )
            {
            match(input,SUBTYPE_CONSTRAINT,FOLLOW_SUBTYPE_CONSTRAINT_in_subtype_constraint5405); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_supertype_expression_in_subtype_constraint5409);
            se=supertype_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            			//addAxiom(h.getEquivalentClassesAxiom(currentClass, se));
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "subtype_constraint"


    // $ANTLR start "supertype_expression"
    // OWLSchema.g:1479:1: supertype_expression returns [OWLClass owlc] : ^( SUPERTYPE_EXPRESSION (sf= supertype_factor )+ ) ;
    public final OWLClass supertype_expression() throws RecognitionException {
        OWLClass owlc = null;

        OWLClass sf = null;



        	HashSet<OWLClass> op = new HashSet<OWLClass>();

        try {
            // OWLSchema.g:1484:3: ( ^( SUPERTYPE_EXPRESSION (sf= supertype_factor )+ ) )
            // OWLSchema.g:1484:5: ^( SUPERTYPE_EXPRESSION (sf= supertype_factor )+ )
            {
            match(input,SUPERTYPE_EXPRESSION,FOLLOW_SUPERTYPE_EXPRESSION_in_supertype_expression5439); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1484:28: (sf= supertype_factor )+
            int cnt136=0;
            loop136:
            do {
                int alt136=2;
                int LA136_0 = input.LA(1);

                if ( (LA136_0==SUPERTYPE_FACTOR) ) {
                    alt136=1;
                }


                switch (alt136) {
            	case 1 :
            	    // OWLSchema.g:1484:29: sf= supertype_factor
            	    {
            	    pushFollow(FOLLOW_supertype_factor_in_supertype_expression5444);
            	    sf=supertype_factor();

            	    state._fsp--;

            	    op.add(sf);

            	    }
            	    break;

            	default :
            	    if ( cnt136 >= 1 ) break loop136;
                        EarlyExitException eee =
                            new EarlyExitException(136, input);
                        throw eee;
                }
                cnt136++;
            } while (true);


            match(input, Token.UP, null); 

            			if (op.size() == 1)
            				owlc = op.iterator().next();
            			else
            			{
            				owlc = h.getClas("abs_" + counter++);
            				//addAxiom(getEquivalentClassesAxiom(owlc, getOUnionOf(op)));
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "supertype_expression"


    // $ANTLR start "supertype_factor"
    // OWLSchema.g:1498:1: supertype_factor returns [OWLClass owlc] : ^( SUPERTYPE_FACTOR (st= supertype_term )+ ) ;
    public final OWLClass supertype_factor() throws RecognitionException {
        OWLClass owlc = null;

        OWLClass st = null;



        	HashSet<OWLClass> op = new HashSet<OWLClass>();

        try {
            // OWLSchema.g:1503:3: ( ^( SUPERTYPE_FACTOR (st= supertype_term )+ ) )
            // OWLSchema.g:1503:5: ^( SUPERTYPE_FACTOR (st= supertype_term )+ )
            {
            match(input,SUPERTYPE_FACTOR,FOLLOW_SUPERTYPE_FACTOR_in_supertype_factor5480); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1503:24: (st= supertype_term )+
            int cnt137=0;
            loop137:
            do {
                int alt137=2;
                int LA137_0 = input.LA(1);

                if ( (LA137_0==SUPERTYPE_TERM) ) {
                    alt137=1;
                }


                switch (alt137) {
            	case 1 :
            	    // OWLSchema.g:1503:25: st= supertype_term
            	    {
            	    pushFollow(FOLLOW_supertype_term_in_supertype_factor5485);
            	    st=supertype_term();

            	    state._fsp--;

            	    op.add(st);

            	    }
            	    break;

            	default :
            	    if ( cnt137 >= 1 ) break loop137;
                        EarlyExitException eee =
                            new EarlyExitException(137, input);
                        throw eee;
                }
                cnt137++;
            } while (true);


            match(input, Token.UP, null); 

            			if (op.size() == 1)
            				owlc = op.iterator().next();
            			else
            			{
            				owlc = h.getClas("abs_" + counter++);
            				//addAxiom(getEquivalentClassesAxiom(owlc, getOIntersectionOf(op)));
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "supertype_factor"


    // $ANTLR start "supertype_rule"
    // OWLSchema.g:1516:1: supertype_rule : ^( SUPERTYPE_RULE ( subtype_constraint )? ) ;
    public final void supertype_rule() throws RecognitionException {
        try {
            // OWLSchema.g:1517:3: ( ^( SUPERTYPE_RULE ( subtype_constraint )? ) )
            // OWLSchema.g:1517:5: ^( SUPERTYPE_RULE ( subtype_constraint )? )
            {
            match(input,SUPERTYPE_RULE,FOLLOW_SUPERTYPE_RULE_in_supertype_rule5509); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:1517:22: ( subtype_constraint )?
                int alt138=2;
                int LA138_0 = input.LA(1);

                if ( (LA138_0==SUBTYPE_CONSTRAINT) ) {
                    alt138=1;
                }
                switch (alt138) {
                    case 1 :
                        // OWLSchema.g:1517:22: subtype_constraint
                        {
                        pushFollow(FOLLOW_subtype_constraint_in_supertype_rule5511);
                        subtype_constraint();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "supertype_rule"


    // $ANTLR start "supertype_term"
    // OWLSchema.g:1520:1: supertype_term returns [OWLClass owlc] : ^( SUPERTYPE_TERM (er= entity_ref | oo= one_of | se= supertype_expression ) ) ;
    public final OWLClass supertype_term() throws RecognitionException {
        OWLClass owlc = null;

        OWLClass er = null;

        OWLClass oo = null;

        OWLClass se = null;


        try {
            // OWLSchema.g:1521:3: ( ^( SUPERTYPE_TERM (er= entity_ref | oo= one_of | se= supertype_expression ) ) )
            // OWLSchema.g:1521:5: ^( SUPERTYPE_TERM (er= entity_ref | oo= one_of | se= supertype_expression ) )
            {
            match(input,SUPERTYPE_TERM,FOLLOW_SUPERTYPE_TERM_in_supertype_term5533); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1521:22: (er= entity_ref | oo= one_of | se= supertype_expression )
            int alt139=3;
            switch ( input.LA(1) ) {
            case ENTITY_REF:
                {
                alt139=1;
                }
                break;
            case ONE_OF:
                {
                alt139=2;
                }
                break;
            case SUPERTYPE_EXPRESSION:
                {
                alt139=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;
            }

            switch (alt139) {
                case 1 :
                    // OWLSchema.g:1522:6: er= entity_ref
                    {
                    pushFollow(FOLLOW_entity_ref_in_supertype_term5544);
                    er=entity_ref();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1523:6: oo= one_of
                    {
                    pushFollow(FOLLOW_one_of_in_supertype_term5553);
                    oo=one_of();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:1524:6: se= supertype_expression
                    {
                    pushFollow(FOLLOW_supertype_expression_in_supertype_term5564);
                    se=supertype_expression();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            			if (er != null)
            				owlc = er;
            			else if (se != null)
            				owlc = se;
            			else
            			{
            				owlc = oo;
            			}
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "supertype_term"


    // $ANTLR start "syntax"
    // OWLSchema.g:1538:1: syntax : ^( SYNTAX ( language_version_id )? schemaElement= schema_decl (schemaElement= schema_decl )* ) ;
    public final void syntax() throws RecognitionException {
        try {
            // OWLSchema.g:1539:3: ( ^( SYNTAX ( language_version_id )? schemaElement= schema_decl (schemaElement= schema_decl )* ) )
            // OWLSchema.g:1539:6: ^( SYNTAX ( language_version_id )? schemaElement= schema_decl (schemaElement= schema_decl )* )
            {
            match(input,SYNTAX,FOLLOW_SYNTAX_in_syntax5588); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1539:15: ( language_version_id )?
            int alt140=2;
            int LA140_0 = input.LA(1);

            if ( (LA140_0==LANGUAGE_VERSION_ID) ) {
                alt140=1;
            }
            switch (alt140) {
                case 1 :
                    // OWLSchema.g:1539:17: language_version_id
                    {
                    pushFollow(FOLLOW_language_version_id_in_syntax5592);
                    language_version_id();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_schema_decl_in_syntax5599);
            schema_decl();

            state._fsp--;

            // OWLSchema.g:1540:3: (schemaElement= schema_decl )*
            loop141:
            do {
                int alt141=2;
                int LA141_0 = input.LA(1);

                if ( (LA141_0==SCHEMA_DECL) ) {
                    alt141=1;
                }


                switch (alt141) {
            	case 1 :
            	    // OWLSchema.g:1540:5: schemaElement= schema_decl
            	    {
            	    pushFollow(FOLLOW_schema_decl_in_syntax5607);
            	    schema_decl();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop141;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "syntax"


    // $ANTLR start "language_version_id"
    // OWLSchema.g:1543:1: language_version_id : ^( LANGUAGE_VERSION_ID nothing ) ;
    public final void language_version_id() throws RecognitionException {
        try {
            // OWLSchema.g:1544:3: ( ^( LANGUAGE_VERSION_ID nothing ) )
            // OWLSchema.g:1544:6: ^( LANGUAGE_VERSION_ID nothing )
            {
            match(input,LANGUAGE_VERSION_ID,FOLLOW_LANGUAGE_VERSION_ID_in_language_version_id5624); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                pushFollow(FOLLOW_nothing_in_language_version_id5626);
                nothing();

                state._fsp--;


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "language_version_id"

    public static class term_return extends TreeRuleReturnScope {
        public Integer intVal;
        public Double doubleVal;
    };

    // $ANTLR start "term"
    // OWLSchema.g:1547:1: term returns [Integer intVal, Double doubleVal] : ^( TERM f1= factor (mlo= multiplication_like_op f2= factor )* ) ;
    public final term_return term() throws RecognitionException {
        term_return retval = new term_return();
        retval.start = input.LT(1);

        factor_return f1 = null;

        int mlo = 0;

        factor_return f2 = null;


        try {
            // OWLSchema.g:1548:3: ( ^( TERM f1= factor (mlo= multiplication_like_op f2= factor )* ) )
            // OWLSchema.g:1548:6: ^( TERM f1= factor (mlo= multiplication_like_op f2= factor )* )
            {
            match(input,TERM,FOLLOW_TERM_in_term5646); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_factor_in_term5650);
            f1=factor();

            state._fsp--;


            			retval.intVal = (f1!=null?f1.intVal:null);
            			retval.doubleVal = (f1!=null?f1.doubleVal:null);
            		
            // OWLSchema.g:1553:3: (mlo= multiplication_like_op f2= factor )*
            loop142:
            do {
                int alt142=2;
                int LA142_0 = input.LA(1);

                if ( (LA142_0==MULTIPLICATION_LIKE_OP) ) {
                    alt142=1;
                }


                switch (alt142) {
            	case 1 :
            	    // OWLSchema.g:1553:5: mlo= multiplication_like_op f2= factor
            	    {
            	    pushFollow(FOLLOW_multiplication_like_op_in_term5663);
            	    mlo=multiplication_like_op();

            	    state._fsp--;

            	    pushFollow(FOLLOW_factor_in_term5667);
            	    f2=factor();

            	    state._fsp--;


            	    			if (retval.intVal != null && (f2!=null?f2.intVal:null) != null)
            	    			{
            	    				if (mlo == STAR) retval.intVal = Integer.valueOf(retval.intVal.intValue() * (f2!=null?f2.intVal:null).intValue());
            	    				else if (mlo == DIVSIGN) retval.intVal = Integer.valueOf(retval.intVal.intValue() / (f2!=null?f2.intVal:null).intValue());
            	    				else retval.intVal = null;
            	    			}
            	    			else if (retval.doubleVal != null && (f2!=null?f2.doubleVal:null) != null)
            	    			{
            	    				if (mlo == STAR) retval.doubleVal = new Double(retval.doubleVal.doubleValue() * (f2!=null?f2.doubleVal:null).doubleValue());
            	    				if (mlo == DIVSIGN) retval.doubleVal = new Double(retval.doubleVal.doubleValue() / (f2!=null?f2.doubleVal:null).doubleValue());
            	    				else retval.doubleVal = null;
            	    			}
            	    		

            	    }
            	    break;

            	default :
            	    break loop142;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "term"


    // $ANTLR start "multiplication_like_op"
    // OWLSchema.g:1571:1: multiplication_like_op returns [int op] : ^( MULTIPLICATION_LIKE_OP ( STAR | DIVSIGN | DIV | MOD | AND | DOUBLEBAR ) ) ;
    public final int multiplication_like_op() throws RecognitionException {
        int op = 0;

        try {
            // OWLSchema.g:1572:3: ( ^( MULTIPLICATION_LIKE_OP ( STAR | DIVSIGN | DIV | MOD | AND | DOUBLEBAR ) ) )
            // OWLSchema.g:1572:6: ^( MULTIPLICATION_LIKE_OP ( STAR | DIVSIGN | DIV | MOD | AND | DOUBLEBAR ) )
            {
            match(input,MULTIPLICATION_LIKE_OP,FOLLOW_MULTIPLICATION_LIKE_OP_in_multiplication_like_op5697); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1572:31: ( STAR | DIVSIGN | DIV | MOD | AND | DOUBLEBAR )
            int alt143=6;
            switch ( input.LA(1) ) {
            case STAR:
                {
                alt143=1;
                }
                break;
            case DIVSIGN:
                {
                alt143=2;
                }
                break;
            case DIV:
                {
                alt143=3;
                }
                break;
            case MOD:
                {
                alt143=4;
                }
                break;
            case AND:
                {
                alt143=5;
                }
                break;
            case DOUBLEBAR:
                {
                alt143=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;
            }

            switch (alt143) {
                case 1 :
                    // OWLSchema.g:1573:6: STAR
                    {
                    match(input,STAR,FOLLOW_STAR_in_multiplication_like_op5706); 
                    op =STAR;

                    }
                    break;
                case 2 :
                    // OWLSchema.g:1574:6: DIVSIGN
                    {
                    match(input,DIVSIGN,FOLLOW_DIVSIGN_in_multiplication_like_op5715); 
                    op =DIVSIGN;

                    }
                    break;
                case 3 :
                    // OWLSchema.g:1575:6: DIV
                    {
                    match(input,DIV,FOLLOW_DIV_in_multiplication_like_op5724); 
                    op =DIV;

                    }
                    break;
                case 4 :
                    // OWLSchema.g:1576:6: MOD
                    {
                    match(input,MOD,FOLLOW_MOD_in_multiplication_like_op5733); 
                    op =MOD;

                    }
                    break;
                case 5 :
                    // OWLSchema.g:1577:6: AND
                    {
                    match(input,AND,FOLLOW_AND_in_multiplication_like_op5742); 
                    op =AND;

                    }
                    break;
                case 6 :
                    // OWLSchema.g:1578:6: DOUBLEBAR
                    {
                    match(input,DOUBLEBAR,FOLLOW_DOUBLEBAR_in_multiplication_like_op5751); 
                    op =DOUBLEBAR;

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "multiplication_like_op"


    // $ANTLR start "type_decl"
    // OWLSchema.g:1582:1: type_decl : ^( TYPE_DECL ti= type_id underlying_type ( where_clause )? ) ;
    public final void type_decl() throws RecognitionException {
        String ti = null;


        try {
            // OWLSchema.g:1583:3: ( ^( TYPE_DECL ti= type_id underlying_type ( where_clause )? ) )
            // OWLSchema.g:1583:6: ^( TYPE_DECL ti= type_id underlying_type ( where_clause )? )
            {
            match(input,TYPE_DECL,FOLLOW_TYPE_DECL_in_type_decl5773); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_id_in_type_decl5777);
            ti=type_id();

            state._fsp--;


            			currentType = h.getClas(ti);
            		
            pushFollow(FOLLOW_underlying_type_in_type_decl5786);
            underlying_type();

            state._fsp--;

            // OWLSchema.g:1587:19: ( where_clause )?
            int alt144=2;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==WHERE_CLAUSE) ) {
                alt144=1;
            }
            switch (alt144) {
                case 1 :
                    // OWLSchema.g:1587:21: where_clause
                    {
                    pushFollow(FOLLOW_where_clause_in_type_decl5790);
                    where_clause();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_decl"


    // $ANTLR start "underlying_type"
    // OWLSchema.g:1590:1: underlying_type : ^( UNDERLYING_TYPE ( constructed_types | aggregation_types | st= simple_types | tr= type_ref ) ) ;
    public final void underlying_type() throws RecognitionException {
        OWLClass st = null;

        OWLClass tr = null;


        try {
            // OWLSchema.g:1591:3: ( ^( UNDERLYING_TYPE ( constructed_types | aggregation_types | st= simple_types | tr= type_ref ) ) )
            // OWLSchema.g:1591:6: ^( UNDERLYING_TYPE ( constructed_types | aggregation_types | st= simple_types | tr= type_ref ) )
            {
            match(input,UNDERLYING_TYPE,FOLLOW_UNDERLYING_TYPE_in_underlying_type5811); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1591:24: ( constructed_types | aggregation_types | st= simple_types | tr= type_ref )
            int alt145=4;
            switch ( input.LA(1) ) {
            case CONSTRUCTED_TYPES:
                {
                alt145=1;
                }
                break;
            case AGGREGATION_TYPES:
                {
                alt145=2;
                }
                break;
            case SIMPLE_TYPES:
                {
                alt145=3;
                }
                break;
            case TYPE_REF:
                {
                alt145=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 145, 0, input);

                throw nvae;
            }

            switch (alt145) {
                case 1 :
                    // OWLSchema.g:1592:6: constructed_types
                    {
                    pushFollow(FOLLOW_constructed_types_in_underlying_type5820);
                    constructed_types();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1593:6: aggregation_types
                    {
                    pushFollow(FOLLOW_aggregation_types_in_underlying_type5827);
                    aggregation_types();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // OWLSchema.g:1594:6: st= simple_types
                    {
                    pushFollow(FOLLOW_simple_types_in_underlying_type5836);
                    st=simple_types();

                    state._fsp--;


                    				if (st != null)
                    				{
                    					addAxiom( h.getSubClassAxiom(currentType, st) );
                    					OWLAnnotation owlca = h.getOCAExpressConstruct("datatype");
                    					addAxiom(h.getAnnotationAxiom(currentType.getIRI(), owlca));
                    				}
                    			

                    }
                    break;
                case 4 :
                    // OWLSchema.g:1603:6: tr= type_ref
                    {
                    pushFollow(FOLLOW_type_ref_in_underlying_type5850);
                    tr=type_ref();

                    state._fsp--;


                    				if (tr != null)
                    				{
                    					addAxiom( h.getSubClassAxiom(currentType, tr) );
                    					OWLAnnotation owlca = h.getOCAExpressConstruct("datatype");
                    					addAxiom(h.getAnnotationAxiom(currentType.getIRI(), owlca));
                    				}
                    			

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "underlying_type"


    // $ANTLR start "constructed_types"
    // OWLSchema.g:1616:1: constructed_types : ^( CONSTRUCTED_TYPES ( enumeration_type | select_type ) ) ;
    public final void constructed_types() throws RecognitionException {
        try {
            // OWLSchema.g:1617:3: ( ^( CONSTRUCTED_TYPES ( enumeration_type | select_type ) ) )
            // OWLSchema.g:1617:6: ^( CONSTRUCTED_TYPES ( enumeration_type | select_type ) )
            {
            match(input,CONSTRUCTED_TYPES,FOLLOW_CONSTRUCTED_TYPES_in_constructed_types5881); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1617:26: ( enumeration_type | select_type )
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==ENUMERATION_TYPE) ) {
                alt146=1;
            }
            else if ( (LA146_0==SELECT_TYPE) ) {
                alt146=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 146, 0, input);

                throw nvae;
            }
            switch (alt146) {
                case 1 :
                    // OWLSchema.g:1618:6: enumeration_type
                    {
                    pushFollow(FOLLOW_enumeration_type_in_constructed_types5890);
                    enumeration_type();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // OWLSchema.g:1619:6: select_type
                    {
                    pushFollow(FOLLOW_select_type_in_constructed_types5897);
                    select_type();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constructed_types"


    // $ANTLR start "enumeration_type"
    // OWLSchema.g:1623:1: enumeration_type : ^( ENUMERATION_TYPE ( 'extensible' )? ( ( enumeration_items | enumeration_extension ) )? ) ;
    public final void enumeration_type() throws RecognitionException {
        try {
            // OWLSchema.g:1624:3: ( ^( ENUMERATION_TYPE ( 'extensible' )? ( ( enumeration_items | enumeration_extension ) )? ) )
            // OWLSchema.g:1624:6: ^( ENUMERATION_TYPE ( 'extensible' )? ( ( enumeration_items | enumeration_extension ) )? )
            {
            match(input,ENUMERATION_TYPE,FOLLOW_ENUMERATION_TYPE_in_enumeration_type5917); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:1624:25: ( 'extensible' )?
                int alt147=2;
                int LA147_0 = input.LA(1);

                if ( (LA147_0==366) ) {
                    alt147=1;
                }
                switch (alt147) {
                    case 1 :
                        // OWLSchema.g:1624:27: 'extensible'
                        {
                        match(input,366,FOLLOW_366_in_enumeration_type5921); 

                        }
                        break;

                }

                // OWLSchema.g:1624:43: ( ( enumeration_items | enumeration_extension ) )?
                int alt149=2;
                int LA149_0 = input.LA(1);

                if ( ((LA149_0>=ENUMERATION_ITEMS && LA149_0<=ENUMERATION_EXTENSION)) ) {
                    alt149=1;
                }
                switch (alt149) {
                    case 1 :
                        // OWLSchema.g:1624:45: ( enumeration_items | enumeration_extension )
                        {
                        // OWLSchema.g:1624:45: ( enumeration_items | enumeration_extension )
                        int alt148=2;
                        int LA148_0 = input.LA(1);

                        if ( (LA148_0==ENUMERATION_ITEMS) ) {
                            alt148=1;
                        }
                        else if ( (LA148_0==ENUMERATION_EXTENSION) ) {
                            alt148=2;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 148, 0, input);

                            throw nvae;
                        }
                        switch (alt148) {
                            case 1 :
                                // OWLSchema.g:1624:47: enumeration_items
                                {
                                pushFollow(FOLLOW_enumeration_items_in_enumeration_type5930);
                                enumeration_items();

                                state._fsp--;


                                }
                                break;
                            case 2 :
                                // OWLSchema.g:1624:67: enumeration_extension
                                {
                                pushFollow(FOLLOW_enumeration_extension_in_enumeration_type5934);
                                enumeration_extension();

                                state._fsp--;


                                }
                                break;

                        }


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "enumeration_type"


    // $ANTLR start "enumeration_items"
    // OWLSchema.g:1627:1: enumeration_items : ^( ENUMERATION_ITEMS (ei= enumeration_id )+ ) ;
    public final void enumeration_items() throws RecognitionException {
        OWLNamedIndividual ei = null;



        	HashSet<OWLIndividual> ind = new HashSet<OWLIndividual>();

        try {
            // OWLSchema.g:1632:3: ( ^( ENUMERATION_ITEMS (ei= enumeration_id )+ ) )
            // OWLSchema.g:1632:6: ^( ENUMERATION_ITEMS (ei= enumeration_id )+ )
            {
            match(input,ENUMERATION_ITEMS,FOLLOW_ENUMERATION_ITEMS_in_enumeration_items5961); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1632:26: (ei= enumeration_id )+
            int cnt150=0;
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==ENUMERATION_ID) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // OWLSchema.g:1632:27: ei= enumeration_id
            	    {
            	    pushFollow(FOLLOW_enumeration_id_in_enumeration_items5966);
            	    ei=enumeration_id();

            	    state._fsp--;

            	     log.debug(ei.getIRI().toString());ind.add(ei); 

            	    }
            	    break;

            	default :
            	    if ( cnt150 >= 1 ) break loop150;
                        EarlyExitException eee =
                            new EarlyExitException(150, input);
                        throw eee;
                }
                cnt150++;
            } while (true);


            match(input, Token.UP, null); 

            			if (!bOnlyRL)
            			{
            				addAxiom(h.getEquivalentClassesAxiom(currentType, h.getOOneOf(ind)));
            			}
            		

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "enumeration_items"


    // $ANTLR start "enumeration_extension"
    // OWLSchema.g:1642:1: enumeration_extension : ^( ENUMERATION_EXTENSION type_ref ( enumeration_items )? ) ;
    public final void enumeration_extension() throws RecognitionException {
        try {
            // OWLSchema.g:1643:3: ( ^( ENUMERATION_EXTENSION type_ref ( enumeration_items )? ) )
            // OWLSchema.g:1643:6: ^( ENUMERATION_EXTENSION type_ref ( enumeration_items )? )
            {
            match(input,ENUMERATION_EXTENSION,FOLLOW_ENUMERATION_EXTENSION_in_enumeration_extension5998); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_ref_in_enumeration_extension6000);
            type_ref();

            state._fsp--;

            // OWLSchema.g:1643:39: ( enumeration_items )?
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==ENUMERATION_ITEMS) ) {
                alt151=1;
            }
            switch (alt151) {
                case 1 :
                    // OWLSchema.g:1643:41: enumeration_items
                    {
                    pushFollow(FOLLOW_enumeration_items_in_enumeration_extension6004);
                    enumeration_items();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "enumeration_extension"


    // $ANTLR start "enumeration_id"
    // OWLSchema.g:1646:1: enumeration_id returns [OWLNamedIndividual owli] : ^( ENUMERATION_ID IDENT ) ;
    public final OWLNamedIndividual enumeration_id() throws RecognitionException {
        OWLNamedIndividual owli = null;

        CommonTree IDENT7=null;

        try {
            // OWLSchema.g:1647:3: ( ^( ENUMERATION_ID IDENT ) )
            // OWLSchema.g:1647:5: ^( ENUMERATION_ID IDENT )
            {
            match(input,ENUMERATION_ID,FOLLOW_ENUMERATION_ID_in_enumeration_id6027); 

            match(input, Token.DOWN, null); 
            IDENT7=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_enumeration_id6029); 

            match(input, Token.UP, null); 

            			owli = h.getNamedIndividual((IDENT7!=null?IDENT7.getText():null).toLowerCase());
            			addAxiom(h.getClassAssertionAxiom(currentType, owli));
            			OWLAnnotation owlca = h.getOCAExpressConstruct("enumeration");
            			addAxiom(h.getAnnotationAxiom(owli.getIRI(), owlca));
            		

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return owli;
    }
    // $ANTLR end "enumeration_id"


    // $ANTLR start "select_type"
    // OWLSchema.g:1657:1: select_type : ^( SELECT_TYPE ( 'extensible' )? ( 'generic_entity' )? (sl= select_list | se= select_extension )? ) ;
    public final void select_type() throws RecognitionException {
        OWLClassExpression sl = null;

        OWLClassExpression se = null;


        try {
            // OWLSchema.g:1658:3: ( ^( SELECT_TYPE ( 'extensible' )? ( 'generic_entity' )? (sl= select_list | se= select_extension )? ) )
            // OWLSchema.g:1658:5: ^( SELECT_TYPE ( 'extensible' )? ( 'generic_entity' )? (sl= select_list | se= select_extension )? )
            {
            match(input,SELECT_TYPE,FOLLOW_SELECT_TYPE_in_select_type6054); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLSchema.g:1658:19: ( 'extensible' )?
                int alt152=2;
                int LA152_0 = input.LA(1);

                if ( (LA152_0==366) ) {
                    alt152=1;
                }
                switch (alt152) {
                    case 1 :
                        // OWLSchema.g:1658:21: 'extensible'
                        {
                        match(input,366,FOLLOW_366_in_select_type6058); 

                        }
                        break;

                }

                // OWLSchema.g:1658:37: ( 'generic_entity' )?
                int alt153=2;
                int LA153_0 = input.LA(1);

                if ( (LA153_0==328) ) {
                    alt153=1;
                }
                switch (alt153) {
                    case 1 :
                        // OWLSchema.g:1658:39: 'generic_entity'
                        {
                        match(input,328,FOLLOW_328_in_select_type6065); 

                        }
                        break;

                }

                // OWLSchema.g:1658:59: (sl= select_list | se= select_extension )?
                int alt154=3;
                int LA154_0 = input.LA(1);

                if ( (LA154_0==SELECT_LIST) ) {
                    alt154=1;
                }
                else if ( (LA154_0==SELECT_EXTENSION) ) {
                    alt154=2;
                }
                switch (alt154) {
                    case 1 :
                        // OWLSchema.g:1658:61: sl= select_list
                        {
                        pushFollow(FOLLOW_select_list_in_select_type6074);
                        sl=select_list();

                        state._fsp--;


                        }
                        break;
                    case 2 :
                        // OWLSchema.g:1658:78: se= select_extension
                        {
                        pushFollow(FOLLOW_select_extension_in_select_type6080);
                        se=select_extension();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            			//New construct (subclass)
            			//Previous construct (equivalent(union))
            			if (!bOnlyRL)
            			{
            				if (se != null)
            				{
            					addAxiom(h.getEquivalentClassesAxiom(currentType, se));
            					OWLAnnotation owlca = h.getOCAExpressConstruct("select");
            					addAxiom(h.getAnnotationAxiom(currentType.getIRI(), owlca));
            				}
            				else if (sl != null)
            				{
            					addAxiom(h.getEquivalentClassesAxiom(currentType, sl));
            					OWLAnnotation owlca = h.getOCAExpressConstruct("select");
            					addAxiom(h.getAnnotationAxiom(currentType.getIRI(), owlca));
            				}
            			}
            		

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "select_type"


    // $ANTLR start "select_list"
    // OWLSchema.g:1681:1: select_list returns [OWLClassExpression owld] : ^( SELECT_LIST (nt= named_types )+ ) ;
    public final OWLClassExpression select_list() throws RecognitionException {
        OWLClassExpression owld = null;

        OWLClass nt = null;



        	/* Old way
        	HashSet<OWLClass> comp = new HashSet<OWLClass>();
        	*/

        try {
            // OWLSchema.g:1688:3: ( ^( SELECT_LIST (nt= named_types )+ ) )
            // OWLSchema.g:1688:6: ^( SELECT_LIST (nt= named_types )+ )
            {
            match(input,SELECT_LIST,FOLLOW_SELECT_LIST_in_select_list6119); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1688:20: (nt= named_types )+
            int cnt155=0;
            loop155:
            do {
                int alt155=2;
                int LA155_0 = input.LA(1);

                if ( (LA155_0==NAMED_TYPES) ) {
                    alt155=1;
                }


                switch (alt155) {
            	case 1 :
            	    // OWLSchema.g:1688:21: nt= named_types
            	    {
            	    pushFollow(FOLLOW_named_types_in_select_list6124);
            	    nt=named_types();

            	    state._fsp--;


            	    			addAxiom(h.getSubClassAxiom(nt, currentType));
            	    			/* Old way
            	    			comp.add(nt);
            	    			*/
            	    		

            	    }
            	    break;

            	default :
            	    if ( cnt155 >= 1 ) break loop155;
                        EarlyExitException eee =
                            new EarlyExitException(155, input);
                        throw eee;
                }
                cnt155++;
            } while (true);


            match(input, Token.UP, null); 

            			/* Old way
            				owld = h.getOUnionOf(comp);
            			*/
            		

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return owld;
    }
    // $ANTLR end "select_list"


    // $ANTLR start "select_extension"
    // OWLSchema.g:1704:1: select_extension returns [OWLClassExpression owld] : ^( SELECT_EXTENSION tr= type_ref (sl= select_list )? ) ;
    public final OWLClassExpression select_extension() throws RecognitionException {
        OWLClassExpression owld = null;

        OWLClass tr = null;

        OWLClassExpression sl = null;


        try {
            // OWLSchema.g:1705:3: ( ^( SELECT_EXTENSION tr= type_ref (sl= select_list )? ) )
            // OWLSchema.g:1705:6: ^( SELECT_EXTENSION tr= type_ref (sl= select_list )? )
            {
            match(input,SELECT_EXTENSION,FOLLOW_SELECT_EXTENSION_in_select_extension6164); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_type_ref_in_select_extension6168);
            tr=type_ref();

            state._fsp--;

            // OWLSchema.g:1705:37: (sl= select_list )?
            int alt156=2;
            int LA156_0 = input.LA(1);

            if ( (LA156_0==SELECT_LIST) ) {
                alt156=1;
            }
            switch (alt156) {
                case 1 :
                    // OWLSchema.g:1705:39: sl= select_list
                    {
                    pushFollow(FOLLOW_select_list_in_select_extension6174);
                    sl=select_list();

                    state._fsp--;


                    }
                    break;

            }


            match(input, Token.UP, null); 

            				addAxiom(h.getSubClassAxiom(tr, currentType));
            				/* Old way
            				owld = h.getOUnionOf(tr, sl);
            				*/
            		

            }

        }
        catch (OWLOntologyChangeException e) {
            e.printStackTrace();
        }
        finally {
        }
        return owld;
    }
    // $ANTLR end "select_extension"


    // $ANTLR start "type_id"
    // OWLSchema.g:1715:1: type_id returns [String tid] : ^( TYPE_ID IDENT ) ;
    public final String type_id() throws RecognitionException {
        String tid = null;

        CommonTree IDENT8=null;

        try {
            // OWLSchema.g:1716:3: ( ^( TYPE_ID IDENT ) )
            // OWLSchema.g:1716:5: ^( TYPE_ID IDENT )
            {
            match(input,TYPE_ID,FOLLOW_TYPE_ID_in_type_id6207); 

            match(input, Token.DOWN, null); 
            IDENT8=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_type_id6209); 

            match(input, Token.UP, null); 

            			tid = (IDENT8!=null?IDENT8.getText():null).toLowerCase();
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return tid;
    }
    // $ANTLR end "type_id"


    // $ANTLR start "type_label"
    // OWLSchema.g:1722:1: type_label : ^( TYPE_LABEL IDENT ) ;
    public final void type_label() throws RecognitionException {
        try {
            // OWLSchema.g:1723:3: ( ^( TYPE_LABEL IDENT ) )
            // OWLSchema.g:1723:6: ^( TYPE_LABEL IDENT )
            {
            match(input,TYPE_LABEL,FOLLOW_TYPE_LABEL_in_type_label6229); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_type_label6231); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_label"


    // $ANTLR start "type_label_id"
    // OWLSchema.g:1726:1: type_label_id : ^( TYPE_LABEL_ID IDENT ) ;
    public final void type_label_id() throws RecognitionException {
        try {
            // OWLSchema.g:1727:3: ( ^( TYPE_LABEL_ID IDENT ) )
            // OWLSchema.g:1727:6: ^( TYPE_LABEL_ID IDENT )
            {
            match(input,TYPE_LABEL_ID,FOLLOW_TYPE_LABEL_ID_in_type_label_id6247); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_type_label_id6249); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_label_id"


    // $ANTLR start "unary_op"
    // OWLSchema.g:1730:1: unary_op returns [int op] : ^( UNARY_OP ( PLUS | MINUS | NOT ) ) ;
    public final int unary_op() throws RecognitionException {
        int op = 0;

        try {
            // OWLSchema.g:1731:3: ( ^( UNARY_OP ( PLUS | MINUS | NOT ) ) )
            // OWLSchema.g:1731:6: ^( UNARY_OP ( PLUS | MINUS | NOT ) )
            {
            match(input,UNARY_OP,FOLLOW_UNARY_OP_in_unary_op6270); 

            match(input, Token.DOWN, null); 
            // OWLSchema.g:1731:19: ( PLUS | MINUS | NOT )
            int alt157=3;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt157=1;
                }
                break;
            case MINUS:
                {
                alt157=2;
                }
                break;
            case NOT:
                {
                alt157=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 157, 0, input);

                throw nvae;
            }

            switch (alt157) {
                case 1 :
                    // OWLSchema.g:1732:5: PLUS
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_unary_op6282); 
                    op = PLUS;

                    }
                    break;
                case 2 :
                    // OWLSchema.g:1733:5: MINUS
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_unary_op6290); 
                    op = MINUS;

                    }
                    break;
                case 3 :
                    // OWLSchema.g:1734:5: NOT
                    {
                    match(input,NOT,FOLLOW_NOT_in_unary_op6298); 
                    op = NOT;

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return op;
    }
    // $ANTLR end "unary_op"


    // $ANTLR start "until_control"
    // OWLSchema.g:1738:1: until_control : ^( UNTIL_CONTROL logical_expression ) ;
    public final void until_control() throws RecognitionException {
        try {
            // OWLSchema.g:1739:3: ( ^( UNTIL_CONTROL logical_expression ) )
            // OWLSchema.g:1739:6: ^( UNTIL_CONTROL logical_expression )
            {
            match(input,UNTIL_CONTROL,FOLLOW_UNTIL_CONTROL_in_until_control6320); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_logical_expression_in_until_control6323);
            logical_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "until_control"


    // $ANTLR start "variable_id"
    // OWLSchema.g:1742:1: variable_id : ^( VARIABLE_ID IDENT ) ;
    public final void variable_id() throws RecognitionException {
        try {
            // OWLSchema.g:1743:3: ( ^( VARIABLE_ID IDENT ) )
            // OWLSchema.g:1743:6: ^( VARIABLE_ID IDENT )
            {
            match(input,VARIABLE_ID,FOLLOW_VARIABLE_ID_in_variable_id6340); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_variable_id6342); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable_id"


    // $ANTLR start "where_clause"
    // OWLSchema.g:1746:1: where_clause : ^( WHERE_CLAUSE domain_rule ( domain_rule )* ) ;
    public final void where_clause() throws RecognitionException {
        try {
            // OWLSchema.g:1747:3: ( ^( WHERE_CLAUSE domain_rule ( domain_rule )* ) )
            // OWLSchema.g:1747:6: ^( WHERE_CLAUSE domain_rule ( domain_rule )* )
            {
            match(input,WHERE_CLAUSE,FOLLOW_WHERE_CLAUSE_in_where_clause6358); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_domain_rule_in_where_clause6361);
            domain_rule();

            state._fsp--;

            // OWLSchema.g:1747:34: ( domain_rule )*
            loop158:
            do {
                int alt158=2;
                int LA158_0 = input.LA(1);

                if ( (LA158_0==DOMAIN_RULE) ) {
                    alt158=1;
                }


                switch (alt158) {
            	case 1 :
            	    // OWLSchema.g:1747:37: domain_rule
            	    {
            	    pushFollow(FOLLOW_domain_rule_in_where_clause6366);
            	    domain_rule();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop158;
                }
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "where_clause"


    // $ANTLR start "while_control"
    // OWLSchema.g:1750:1: while_control : ^( WHILE_CONTROL logical_expression ) ;
    public final void while_control() throws RecognitionException {
        try {
            // OWLSchema.g:1751:3: ( ^( WHILE_CONTROL logical_expression ) )
            // OWLSchema.g:1751:6: ^( WHILE_CONTROL logical_expression )
            {
            match(input,WHILE_CONTROL,FOLLOW_WHILE_CONTROL_in_while_control6387); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_logical_expression_in_while_control6390);
            logical_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "while_control"


    // $ANTLR start "width"
    // OWLSchema.g:1754:1: width : ^( WIDTH numeric_expression ) ;
    public final void width() throws RecognitionException {
        try {
            // OWLSchema.g:1755:3: ( ^( WIDTH numeric_expression ) )
            // OWLSchema.g:1755:6: ^( WIDTH numeric_expression )
            {
            match(input,WIDTH,FOLLOW_WIDTH_in_width6408); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_numeric_expression_in_width6410);
            numeric_expression();

            state._fsp--;


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "width"


    // $ANTLR start "width_spec"
    // OWLSchema.g:1758:1: width_spec : ^( WIDTH_SPEC width ( 'fixed' )? ) ;
    public final void width_spec() throws RecognitionException {
        try {
            // OWLSchema.g:1759:3: ( ^( WIDTH_SPEC width ( 'fixed' )? ) )
            // OWLSchema.g:1759:6: ^( WIDTH_SPEC width ( 'fixed' )? )
            {
            match(input,WIDTH_SPEC,FOLLOW_WIDTH_SPEC_in_width_spec6427); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_width_in_width_spec6429);
            width();

            state._fsp--;

            // OWLSchema.g:1759:26: ( 'fixed' )?
            int alt159=2;
            int LA159_0 = input.LA(1);

            if ( (LA159_0==374) ) {
                alt159=1;
            }
            switch (alt159) {
                case 1 :
                    // OWLSchema.g:1759:29: 'fixed'
                    {
                    match(input,374,FOLLOW_374_in_width_spec6435); 

                    }
                    break;

            }


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "width_spec"


    // $ANTLR start "entity_ref"
    // OWLSchema.g:1762:1: entity_ref returns [OWLClass owlc] : ^( ENTITY_REF IDENT ) ;
    public final OWLClass entity_ref() throws RecognitionException {
        OWLClass owlc = null;

        CommonTree IDENT9=null;

        try {
            // OWLSchema.g:1763:3: ( ^( ENTITY_REF IDENT ) )
            // OWLSchema.g:1763:5: ^( ENTITY_REF IDENT )
            {
            match(input,ENTITY_REF,FOLLOW_ENTITY_REF_in_entity_ref6459); 

            match(input, Token.DOWN, null); 
            IDENT9=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_entity_ref6461); 

            match(input, Token.UP, null); 

            			if (currentExternalSchema == null)
            				owlc = h.getClas((IDENT9!=null?IDENT9.getText():null).toLowerCase());
            			else
            				owlc = h.getClas(currentExternalSchema, (IDENT9!=null?IDENT9.getText():null).toLowerCase());
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "entity_ref"


    // $ANTLR start "type_ref"
    // OWLSchema.g:1772:1: type_ref returns [OWLClass owlc] : ^( TYPE_REF IDENT ) ;
    public final OWLClass type_ref() throws RecognitionException {
        OWLClass owlc = null;

        CommonTree IDENT10=null;

        try {
            // OWLSchema.g:1773:3: ( ^( TYPE_REF IDENT ) )
            // OWLSchema.g:1773:5: ^( TYPE_REF IDENT )
            {
            match(input,TYPE_REF,FOLLOW_TYPE_REF_in_type_ref6484); 

            match(input, Token.DOWN, null); 
            IDENT10=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_type_ref6486); 

            match(input, Token.UP, null); 

            			if (currentExternalSchema == null)
            				owlc = h.getClas((IDENT10!=null?IDENT10.getText():null).toLowerCase());
            			else
            				owlc = h.getClas(currentExternalSchema, (IDENT10!=null?IDENT10.getText():null).toLowerCase());
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "type_ref"


    // $ANTLR start "enumeration_ref"
    // OWLSchema.g:1782:1: enumeration_ref returns [OWLClass owlc] : ^( ENUMERATION_REF IDENT ) ;
    public final OWLClass enumeration_ref() throws RecognitionException {
        OWLClass owlc = null;

        CommonTree IDENT11=null;

        try {
            // OWLSchema.g:1783:3: ( ^( ENUMERATION_REF IDENT ) )
            // OWLSchema.g:1783:5: ^( ENUMERATION_REF IDENT )
            {
            match(input,ENUMERATION_REF,FOLLOW_ENUMERATION_REF_in_enumeration_ref6509); 

            match(input, Token.DOWN, null); 
            IDENT11=(CommonTree)match(input,IDENT,FOLLOW_IDENT_in_enumeration_ref6511); 

            match(input, Token.UP, null); 

            			owlc = h.getClas((IDENT11!=null?IDENT11.getText():null).toLowerCase());
            		

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return owlc;
    }
    // $ANTLR end "enumeration_ref"


    // $ANTLR start "attribute_ref"
    // OWLSchema.g:1789:1: attribute_ref : ^( ATTRIBUTE_REF IDENT ) ;
    public final void attribute_ref() throws RecognitionException {
        try {
            // OWLSchema.g:1790:3: ( ^( ATTRIBUTE_REF IDENT ) )
            // OWLSchema.g:1790:5: ^( ATTRIBUTE_REF IDENT )
            {
            match(input,ATTRIBUTE_REF,FOLLOW_ATTRIBUTE_REF_in_attribute_ref6530); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_attribute_ref6532); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "attribute_ref"


    // $ANTLR start "constant_ref"
    // OWLSchema.g:1793:1: constant_ref : ^( CONSTANT_REF IDENT ) ;
    public final void constant_ref() throws RecognitionException {
        try {
            // OWLSchema.g:1794:3: ( ^( CONSTANT_REF IDENT ) )
            // OWLSchema.g:1794:5: ^( CONSTANT_REF IDENT )
            {
            match(input,CONSTANT_REF,FOLLOW_CONSTANT_REF_in_constant_ref6547); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_constant_ref6549); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constant_ref"


    // $ANTLR start "function_ref"
    // OWLSchema.g:1797:1: function_ref : ^( FUNCTION_REF IDENT ) ;
    public final void function_ref() throws RecognitionException {
        try {
            // OWLSchema.g:1798:3: ( ^( FUNCTION_REF IDENT ) )
            // OWLSchema.g:1798:5: ^( FUNCTION_REF IDENT )
            {
            match(input,FUNCTION_REF,FOLLOW_FUNCTION_REF_in_function_ref6564); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_function_ref6566); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "function_ref"


    // $ANTLR start "parameter_ref"
    // OWLSchema.g:1801:1: parameter_ref : ^( PARAMETER_REF IDENT ) ;
    public final void parameter_ref() throws RecognitionException {
        try {
            // OWLSchema.g:1802:3: ( ^( PARAMETER_REF IDENT ) )
            // OWLSchema.g:1802:5: ^( PARAMETER_REF IDENT )
            {
            match(input,PARAMETER_REF,FOLLOW_PARAMETER_REF_in_parameter_ref6581); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_parameter_ref6583); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parameter_ref"


    // $ANTLR start "variable_ref"
    // OWLSchema.g:1805:1: variable_ref : ^( VARIABLE_REF IDENT ) ;
    public final void variable_ref() throws RecognitionException {
        try {
            // OWLSchema.g:1806:3: ( ^( VARIABLE_REF IDENT ) )
            // OWLSchema.g:1806:5: ^( VARIABLE_REF IDENT )
            {
            match(input,VARIABLE_REF,FOLLOW_VARIABLE_REF_in_variable_ref6598); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_variable_ref6600); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variable_ref"

    public static class schema_ref_return extends TreeRuleReturnScope {
    };

    // $ANTLR start "schema_ref"
    // OWLSchema.g:1809:1: schema_ref : ^( SCHEMA_REF IDENT ) ;
    public final schema_ref_return schema_ref() throws RecognitionException {
        schema_ref_return retval = new schema_ref_return();
        retval.start = input.LT(1);

        try {
            // OWLSchema.g:1810:3: ( ^( SCHEMA_REF IDENT ) )
            // OWLSchema.g:1810:5: ^( SCHEMA_REF IDENT )
            {
            match(input,SCHEMA_REF,FOLLOW_SCHEMA_REF_in_schema_ref6615); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_schema_ref6617); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "schema_ref"


    // $ANTLR start "type_label_ref"
    // OWLSchema.g:1813:1: type_label_ref : ^( TYPE_LABEL_REF IDENT ) ;
    public final void type_label_ref() throws RecognitionException {
        try {
            // OWLSchema.g:1814:3: ( ^( TYPE_LABEL_REF IDENT ) )
            // OWLSchema.g:1814:5: ^( TYPE_LABEL_REF IDENT )
            {
            match(input,TYPE_LABEL_REF,FOLLOW_TYPE_LABEL_REF_in_type_label_ref6632); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_type_label_ref6634); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type_label_ref"


    // $ANTLR start "procedure_ref"
    // OWLSchema.g:1817:1: procedure_ref : ^( PROCEDURE_REF IDENT ) ;
    public final void procedure_ref() throws RecognitionException {
        try {
            // OWLSchema.g:1818:3: ( ^( PROCEDURE_REF IDENT ) )
            // OWLSchema.g:1818:5: ^( PROCEDURE_REF IDENT )
            {
            match(input,PROCEDURE_REF,FOLLOW_PROCEDURE_REF_in_procedure_ref6649); 

            match(input, Token.DOWN, null); 
            match(input,IDENT,FOLLOW_IDENT_in_procedure_ref6651); 

            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedure_ref"


    // $ANTLR start "nothing"
    // OWLSchema.g:1823:1: nothing : ( '' )? ;
    public final void nothing() throws RecognitionException {
        try {
            // OWLSchema.g:1824:3: ( ( '' )? )
            // OWLSchema.g:1824:5: ( '' )?
            {
            // OWLSchema.g:1824:5: ( '' )?
            int alt160=2;
            int LA160_0 = input.LA(1);

            if ( (LA160_0==375) ) {
                alt160=1;
            }
            switch (alt160) {
                case 1 :
                    // OWLSchema.g:1824:6: ''
                    {
                    match(input,375,FOLLOW_375_in_nothing6669); 

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "nothing"

    // Delegated rules


 

    public static final BitSet FOLLOW_ACTUAL_PARAMETER_LIST_in_actual_parameter_list43 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_actual_parameter_list45 = new BitSet(new long[]{0x0000000000000008L,0x0200000000000000L});
    public static final BitSet FOLLOW_AGGREGATE_INITIALIZER_in_aggregate_initializer62 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_element_in_aggregate_initializer66 = new BitSet(new long[]{0x0008000000000008L});
    public static final BitSet FOLLOW_AGGREGATE_SOURCE_in_aggregate_source87 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simple_expression_in_aggregate_source89 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATE_TYPE_in_aggregate_type105 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_label_in_aggregate_type108 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_parameter_type_in_aggregate_type111 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AGGREGATION_TYPES_in_aggregation_types132 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_array_type_in_aggregation_types142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_bag_type_in_aggregation_types152 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_list_type_in_aggregation_types162 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_set_type_in_aggregation_types172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALGORITHM_HEAD_in_algorithm_head194 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_declaration_in_algorithm_head196 = new BitSet(new long[]{0x0002400000000008L,0x0000400000000000L});
    public static final BitSet FOLLOW_constant_decl_in_algorithm_head199 = new BitSet(new long[]{0x0000000000000008L,0x0000400000000000L});
    public static final BitSet FOLLOW_local_decl_in_algorithm_head202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ALIAS_STMT_in_alias_stmt218 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_id_in_alias_stmt220 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_general_ref_in_alias_stmt222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_qualifier_in_alias_stmt224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_stmt_in_alias_stmt227 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_ARRAY_TYPE_in_array_type248 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_spec_in_array_type253 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_299_in_array_type256 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_300_in_array_type260 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_base_type_in_array_type266 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ASSIGNMENT_STMT_in_assignment_stmt292 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_general_ref_in_assignment_stmt296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualifier_in_assignment_stmt299 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_assignment_stmt304 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BAG_TYPE_in_bag_type324 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_spec_in_bag_type329 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_base_type_in_bag_type335 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BASE_TYPE_in_base_type366 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_aggregation_types_in_base_type376 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_simple_types_in_base_type386 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_named_types_in_base_type396 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONCRETE_TYPES_in_concrete_types419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_aggregation_types_in_concrete_types425 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_simple_types_in_concrete_types431 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_named_types_in_concrete_types437 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BINARY_TYPE_in_binary_type461 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_width_spec_in_binary_type464 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOOLEAN_TYPE_in_boolean_type489 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nothing_in_boolean_type491 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_1_in_bound_1514 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numeric_expression_in_bound_1518 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_2_in_bound_2542 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numeric_expression_in_bound_2546 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BOUND_SPEC_in_bound_spec570 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_1_in_bound_spec575 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_bound_2_in_bound_spec579 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BUILT_IN_CONSTANT_in_built_in_constant600 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_built_in_constant602 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CASE_ACTION_in_case_action657 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_case_label_in_case_action659 = new BitSet(new long[]{0x0000040000000000L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_stmt_in_case_action662 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CASE_LABEL_in_case_label679 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_case_label681 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CASE_STMT_in_case_stmt697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_selector_in_case_stmt700 = new BitSet(new long[]{0x0000020000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_case_action_in_case_stmt702 = new BitSet(new long[]{0x0000020000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_stmt_in_case_stmt706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPOUND_STMT_in_compound_stmt724 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stmt_in_compound_stmt727 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_CONSTANT_BODY_in_constant_body745 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_id_in_constant_body747 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_base_type_in_constant_body749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_constant_body751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_DECL_in_constant_decl768 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_body_in_constant_decl771 = new BitSet(new long[]{0x0000200000000008L});
    public static final BitSet FOLLOW_CONSTANT_FACTOR_in_constant_factor790 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_built_in_constant_in_constant_factor798 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_ref_in_constant_factor806 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_ID_in_constant_id829 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_constant_id831 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DECLARATION_in_declaration851 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_decl_in_declaration859 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_subtype_constraint_decl_in_declaration865 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_function_decl_in_declaration871 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_procedure_decl_in_declaration879 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_decl_in_declaration885 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOMAIN_RULE_in_domain_rule917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_label_in_domain_rule921 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_logical_expression_in_domain_rule927 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELEMENT_in_element944 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_element946 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_repetition_in_element951 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENTITY_HEAD_in_entity_head971 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_id_in_entity_head973 = new BitSet(new long[]{0x0080000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_312_in_entity_head983 = new BitSet(new long[]{0x0080000000000008L});
    public static final BitSet FOLLOW_subsuper_in_entity_head989 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENTITY_DECL_in_entity_decl1018 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_head_in_entity_decl1020 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_entity_body_in_entity_decl1023 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENTITY_BODY_in_entity_body1039 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_explicit_attr_in_entity_body1049 = new BitSet(new long[]{0x8800000000000008L,0x000000000000000AL,0x0010000000000000L});
    public static final BitSet FOLLOW_derive_clause_in_entity_body1054 = new BitSet(new long[]{0x0000000000000008L,0x000000000000000AL,0x0010000000000000L});
    public static final BitSet FOLLOW_inverse_clause_in_entity_body1059 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000008L,0x0010000000000000L});
    public static final BitSet FOLLOW_unique_clause_in_entity_body1064 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_where_clause_in_entity_body1069 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSUPER_in_subsuper1091 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_supertype_constraint_in_subsuper1095 = new BitSet(new long[]{0x0400000000000008L});
    public static final BitSet FOLLOW_subtype_declaration_in_subsuper1102 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPERTYPE_CONSTRAINT_in_supertype_constraint1121 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_abstract_supertype_declaration_in_supertype_constraint1130 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_supertype_rule_in_supertype_constraint1137 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ABSTRACT_SUPERTYPE_DECLARATION_in_abstract_supertype_declaration1156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_constraint_in_abstract_supertype_declaration1160 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBTYPE_DECLARATION_in_subtype_declaration1181 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_ref_in_subtype_declaration1193 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_SUBTYPE_CONSTRAINT_DECL_in_subtype_constraint_decl1226 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_constraint_head_in_subtype_constraint_decl1228 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_subtype_constraint_body_in_subtype_constraint_decl1230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBTYPE_CONSTRAINT_HEAD_in_subtype_constraint_head1245 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_constraint_id_in_subtype_constraint_head1247 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_entity_ref_in_subtype_constraint_head1249 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBTYPE_CONSTRAINT_BODY_in_subtype_constraint_body1266 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_abstract_supertype_in_subtype_constraint_body1270 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000400000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_total_over_in_subtype_constraint_body1277 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_supertype_expression_in_subtype_constraint_body1284 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBTYPE_CONSTRAINT_ID_in_subtype_constraint_id1304 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_subtype_constraint_id1307 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ABSTRACT_SUPERTYPE_in_abstract_supertype1323 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nothing_in_abstract_supertype1325 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TOTAL_OVER_in_total_over1341 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_ref_in_total_over1343 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_entity_ref_in_total_over1347 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_EXPLICIT_ATTR_in_explicit_attr1372 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_decl_in_explicit_attr1377 = new BitSet(new long[]{0x1000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_299_in_explicit_attr1392 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_base_type_in_explicit_attr1397 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_DECL_in_attribute_decl1427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_id_in_attribute_decl1433 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_redeclared_attribute_in_attribute_decl1441 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REDECLARED_ATTRIBUTE_in_redeclared_attribute1465 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_qualified_attribute_in_redeclared_attribute1467 = new BitSet(new long[]{0x2000000000000008L});
    public static final BitSet FOLLOW_attribute_id_in_redeclared_attribute1471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_ID_in_attribute_id1495 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_attribute_id1497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIED_ATTRIBUTE_in_qualified_attribute1517 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_group_qualifier_in_qualified_attribute1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_attribute_qualifier_in_qualified_attribute1521 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DERIVE_CLAUSE_in_derive_clause1537 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_derived_attr_in_derive_clause1539 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000001L});
    public static final BitSet FOLLOW_derived_attr_in_derive_clause1542 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000001L});
    public static final BitSet FOLLOW_DERIVED_ATTR_in_derived_attr1561 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_decl_in_derived_attr1563 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_base_type_in_derived_attr1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_derived_attr1567 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INVERSE_CLAUSE_in_inverse_clause1583 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_inverse_attr_in_inverse_clause1585 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000004L});
    public static final BitSet FOLLOW_inverse_attr_in_inverse_clause1588 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000004L});
    public static final BitSet FOLLOW_INVERSE_ATTR_in_inverse_attr1607 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_decl_in_inverse_attr1609 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0100000000000000L,0x0000000000000000L,0x0000200000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_inverse_attr1613 = new BitSet(new long[]{0x0000002000000008L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_bound_spec_in_inverse_attr1625 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_entity_ref_in_inverse_attr1633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_attribute_ref_in_inverse_attr1635 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNIQUE_CLAUSE_in_unique_clause1651 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_unique_rule_in_unique_clause1653 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_unique_rule_in_unique_clause1657 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000010L});
    public static final BitSet FOLLOW_UNIQUE_RULE_in_unique_rule1676 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_label_in_unique_rule1680 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_referenced_attribute_in_unique_rule1685 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_referenced_attribute_in_unique_rule1689 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000020L});
    public static final BitSet FOLLOW_REFERENCED_ATTRIBUTE_in_referenced_attribute1707 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_ref_in_referenced_attribute1716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualified_attribute_in_referenced_attribute1723 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENTITY_CONSTRUCTOR_in_entity_constructor1743 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_ref_in_entity_constructor1745 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_entity_constructor1751 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_entity_constructor1756 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_ENTITY_ID_in_entity_id1781 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_entity_id1783 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUMERATION_REFERENCE_in_enumeration_reference1798 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_ref_in_enumeration_reference1803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0400000000000000L});
    public static final BitSet FOLLOW_enumeration_ref_in_enumeration_reference1809 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ESCAPE_STMT_in_escape_stmt1824 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nothing_in_escape_stmt1826 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_EXPRESSION_in_expression1845 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simple_expression_in_expression1849 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_rel_op_extended_in_expression1860 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_simple_expression_in_expression1862 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REL_OP_EXTENDED_in_rel_op_extended1888 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rel_op_in_rel_op_extended1896 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_350_in_rel_op_extended1902 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_351_in_rel_op_extended1908 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REL_OP_in_rel_op1928 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_rel_op1930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FACTOR_in_factor2011 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simple_factor_in_factor2015 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_simple_factor_in_factor2021 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FORMAL_PARAMETER_in_formal_parameter2044 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_id_in_formal_parameter2046 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_parameter_id_in_formal_parameter2051 = new BitSet(new long[]{0x0000000000000000L,0x0C00000000000000L});
    public static final BitSet FOLLOW_parameter_type_in_formal_parameter2058 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_QUALIFIER_in_attribute_qualifier2075 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_ref_in_attribute_qualifier2077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_CALL_in_function_call2094 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_function_ref_in_function_call2098 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_built_in_function_in_function_call2102 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_actual_parameter_list_in_function_call2110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BUILT_IN_FUNCTION_in_built_in_function2130 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_built_in_function2132 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_DECL_in_function_decl2412 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_function_head_in_function_decl2414 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_algorithm_head_in_function_decl2418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_stmt_in_function_decl2423 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_stmt_in_function_decl2429 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_FUNCTION_HEAD_in_function_head2449 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_function_id_in_function_head2452 = new BitSet(new long[]{0x0000000000000000L,0x0800000000001000L});
    public static final BitSet FOLLOW_formal_parameter_in_function_head2457 = new BitSet(new long[]{0x0000000000000000L,0x0800000000001000L});
    public static final BitSet FOLLOW_formal_parameter_in_function_head2462 = new BitSet(new long[]{0x0000000000000000L,0x0800000000001000L});
    public static final BitSet FOLLOW_parameter_type_in_function_head2471 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_ID_in_function_id2488 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_function_id2490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERALIZED_TYPES_in_generalized_types2506 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_aggregate_type_in_generalized_types2514 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_general_aggregation_types_in_generalized_types2522 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_generic_type_in_generalized_types2530 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_generic_entity_type_in_generalized_types2536 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERIC_ENTITY_TYPE_in_generic_entity_type2557 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nothing_in_generic_entity_type2559 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERAL_AGGREGATION_TYPES_in_general_aggregation_types2575 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_general_array_type_in_general_aggregation_types2583 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_general_bag_type_in_general_aggregation_types2591 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_general_list_type_in_general_aggregation_types2599 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_general_set_type_in_general_aggregation_types2607 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERAL_ARRAY_TYPE_in_general_array_type2628 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_spec_in_general_array_type2634 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_299_in_general_array_type2644 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_300_in_general_array_type2654 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_parameter_type_in_general_array_type2661 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERAL_BAG_TYPE_in_general_bag_type2678 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_spec_in_general_bag_type2684 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_parameter_type_in_general_bag_type2691 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERAL_LIST_TYPE_in_general_list_type2708 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_spec_in_general_list_type2714 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_300_in_general_list_type2724 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_parameter_type_in_general_list_type2731 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERAL_REF_in_general_ref2748 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_ref_in_general_ref2756 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_variable_ref_in_general_ref2763 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERAL_SET_TYPE_in_general_set_type2783 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_spec_in_general_set_type2789 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_parameter_type_in_general_set_type2796 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GENERIC_TYPE_in_generic_type2814 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_label_in_generic_type2819 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GROUP_QUALIFIER_in_group_qualifier2841 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_ref_in_group_qualifier2844 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_IF_STMT_in_if_stmt2861 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logical_expression_in_if_stmt2864 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_stmt_in_if_stmt2867 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_stmt_in_if_stmt2873 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L,0x0000000000000010L});
    public static final BitSet FOLLOW_else_clause_in_if_stmt2882 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ELSE_CLAUSE_in_else_clause2906 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_stmt_in_else_clause2908 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_stmt_in_else_clause2912 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_INCREMENT_in_increment2932 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numeric_expression_in_increment2934 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INCREMENT_CONTROL_in_increment_control2951 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_id_in_increment_control2953 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_bound_1_in_increment_control2956 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_bound_2_in_increment_control2959 = new BitSet(new long[]{0x0000000000000008L,0x0000000010000000L});
    public static final BitSet FOLLOW_increment_in_increment_control2965 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_in_index2987 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numeric_expression_in_index2989 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_1_in_index_13006 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_index_in_index_13008 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_2_in_index_23025 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_index_in_index_23027 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INDEX_QUALIFIER_in_index_qualifier3044 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_index_1_in_index_qualifier3047 = new BitSet(new long[]{0x0000000000000008L,0x0000000100000000L});
    public static final BitSet FOLLOW_index_2_in_index_qualifier3052 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_TYPE_in_integer_type3079 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nothing_in_integer_type3081 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERVAL_in_interval3101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interval_low_in_interval3104 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_interval_op_in_interval3107 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_interval_item_in_interval3110 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_interval_op_in_interval3113 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_interval_high_in_interval3116 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERVAL_HIGH_in_interval_high3134 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simple_expression_in_interval_high3136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERVAL_ITEM_in_interval_item3153 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simple_expression_in_interval_item3155 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERVAL_LOW_in_interval_low3172 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simple_expression_in_interval_low3174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERVAL_OP_in_interval_op3191 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_interval_op3193 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LABEL_in_label3228 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_label3230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_TYPE_in_list_type3250 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_spec_in_list_type3258 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_300_in_list_type3268 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_base_type_in_list_type3277 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LITERAL_in_literal3311 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_integer_literal_in_literal3321 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_real_literal_in_literal3331 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_logical_literal_in_literal3339 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_string_literal_in_literal3345 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTEGER_LITERAL_in_integer_literal3370 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_INT_in_integer_literal3372 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REAL_LITERAL_in_real_literal3397 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_FLOAT_in_real_literal3399 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_string_literal3419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_string_literal3421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOCAL_DECL_in_local_decl3436 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_local_variable_in_local_decl3439 = new BitSet(new long[]{0x0000000000000008L,0x0000800000000000L});
    public static final BitSet FOLLOW_local_variable_in_local_decl3445 = new BitSet(new long[]{0x0000000000000008L,0x0000800000000000L});
    public static final BitSet FOLLOW_LOCAL_VARIABLE_in_local_variable3467 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_id_in_local_variable3469 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_variable_id_in_local_variable3474 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_parameter_type_in_local_variable3480 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_local_variable3485 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_EXPRESSION_in_logical_expression3507 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_logical_expression3509 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_LITERAL_in_logical_literal3526 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_logical_literal3528 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LOGICAL_TYPE_in_logical_type3573 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nothing_in_logical_type3575 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAMED_TYPES_in_named_types3598 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_ref_in_named_types3608 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_ref_in_named_types3619 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NULL_STMT_in_null_stmt3641 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nothing_in_null_stmt3643 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMBER_TYPE_in_number_type3663 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nothing_in_number_type3665 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NUMERIC_EXPRESSION_in_numeric_expression3688 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simple_expression_in_numeric_expression3692 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ONE_OF_in_one_of3723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_supertype_expression_in_one_of3728 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000400000000L});
    public static final BitSet FOLLOW_PARAMETER_in_parameter3754 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_parameter3756 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETER_ID_in_parameter_id3772 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_parameter_id3774 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETER_TYPE_in_parameter_type3791 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_generalized_types_in_parameter_type3799 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_named_types_in_parameter_type3807 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_simple_types_in_parameter_type3815 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_POPULATION_in_population3836 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_ref_in_population3838 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRECISION_SPEC_in_precision_spec3854 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numeric_expression_in_precision_spec3856 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PRIMARY_in_primary3877 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_literal_in_primary3887 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_qualifiable_factor_in_primary3897 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_qualifier_in_primary3902 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_PROCEDURE_CALL_STMT_in_procedure_call_stmt3925 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_procedure_ref_in_procedure_call_stmt3929 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_built_in_procedure_in_procedure_call_stmt3933 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_actual_parameter_list_in_procedure_call_stmt3940 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_BUILT_IN_PROCEDURE_in_built_in_procedure3959 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_set_in_built_in_procedure3961 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROCEDURE_DECL_in_procedure_decl3993 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_procedure_head_in_procedure_decl3995 = new BitSet(new long[]{0x0000000008000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_algorithm_head_in_procedure_decl3999 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_stmt_in_procedure_decl4007 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_PROCEDURE_HEAD_in_procedure_head4027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_procedure_id_in_procedure_head4030 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_346_in_procedure_head4037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_formal_parameter_in_procedure_head4044 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_346_in_procedure_head4052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_formal_parameter_in_procedure_head4059 = new BitSet(new long[]{0x0000000000000008L,0x0000000000001000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000004000000L});
    public static final BitSet FOLLOW_PROCEDURE_ID_in_procedure_id4083 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_procedure_id4085 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIABLE_FACTOR_in_qualifiable_factor4101 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_ref_in_qualifiable_factor4109 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_constant_factor_in_qualifiable_factor4115 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_function_call_in_qualifiable_factor4122 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_population_in_qualifiable_factor4128 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_general_ref_in_qualifiable_factor4136 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUALIFIER_in_qualifier4156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_attribute_qualifier_in_qualifier4164 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_group_qualifier_in_qualifier4170 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_index_qualifier_in_qualifier4176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_QUERY_EXPRESSION_in_query_expression4196 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_variable_id_in_query_expression4198 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_aggregate_source_in_query_expression4201 = new BitSet(new long[]{0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_logical_expression_in_query_expression4204 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REAL_TYPE_in_real_type4225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_precision_spec_in_real_type4230 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REFERENCE_CLAUSE_in_reference_clause4255 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_schema_ref_in_reference_clause4257 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_resource_or_rename_in_reference_clause4265 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_resource_or_rename_in_reference_clause4270 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_RENAME_ID_in_rename_id4294 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_id_in_rename_id4302 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_entity_id_in_rename_id4308 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_function_id_in_rename_id4314 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_procedure_id_in_rename_id4320 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_id_in_rename_id4326 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPEAT_CONTROL_in_repeat_control4346 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_increment_control_in_repeat_control4351 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0024000000000000L});
    public static final BitSet FOLLOW_while_control_in_repeat_control4361 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_until_control_in_repeat_control4371 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_REPEAT_STMT_in_repeat_stmt4391 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_repeat_control_in_repeat_stmt4393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_stmt_in_repeat_stmt4396 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_stmt_in_repeat_stmt4402 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000080000010L});
    public static final BitSet FOLLOW_REPETITION_in_repetition4422 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numeric_expression_in_repetition4424 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RESOURCE_OR_RENAME_in_resource_or_rename4441 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_resource_ref_in_resource_or_rename4443 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_rename_id_in_resource_or_rename4448 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RESOURCE_REF_in_resource_ref4469 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constant_ref_in_resource_ref4477 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_entity_ref_in_resource_ref4483 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_function_ref_in_resource_ref4490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_procedure_ref_in_resource_ref4497 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_ref_in_resource_ref4504 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RETURN_STMT_in_return_stmt4524 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_return_stmt4528 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RULE_DECL_in_rule_decl4549 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rule_head_in_rule_decl4551 = new BitSet(new long[]{0x0000000008000000L,0x0000000000000000L,0x0010000080000010L});
    public static final BitSet FOLLOW_algorithm_head_in_rule_decl4555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000080000010L});
    public static final BitSet FOLLOW_stmt_in_rule_decl4563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000080000010L});
    public static final BitSet FOLLOW_where_clause_in_rule_decl4570 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_RULE_HEAD_in_rule_head4585 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_rule_id_in_rule_head4588 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_entity_ref_in_rule_head4591 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_entity_ref_in_rule_head4596 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_RULE_ID_in_rule_id4618 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_rule_id4620 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCHEMA_ID_in_schema_id4636 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_schema_id4638 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCHEMA_BODY_in_schema_body4654 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_interface_specification_in_schema_body4658 = new BitSet(new long[]{0x0002400000000008L,0x0000400000000000L,0x0000000000410000L});
    public static final BitSet FOLLOW_constant_decl_in_schema_body4665 = new BitSet(new long[]{0x0002400000000008L,0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_declaration_in_schema_body4672 = new BitSet(new long[]{0x0002400000000008L,0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_rule_decl_in_schema_body4676 = new BitSet(new long[]{0x0002400000000008L,0x0000400000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_SCHEMA_DECL_in_schema_decl4698 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_schema_version_id_in_schema_decl4702 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_schema_id_in_schema_decl4707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_schema_body_in_schema_decl4716 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCHEMA_VERSION_ID_in_schema_version_id4753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_string_literal_in_schema_version_id4755 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_INTERFACE_SPECIFICATION_in_interface_specification4771 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_reference_clause_in_interface_specification4779 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_use_clause_in_interface_specification4785 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_USE_CLAUSE_in_use_clause4804 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_schema_ref_in_use_clause4806 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_named_type_or_rename_in_use_clause4817 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_named_type_or_rename_in_use_clause4821 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_NAMED_TYPE_OR_RENAME_in_named_type_or_rename4848 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_named_types_in_named_type_or_rename4850 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000080L,0x0000400000000000L});
    public static final BitSet FOLLOW_entity_id_in_named_type_or_rename4854 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_id_in_named_type_or_rename4858 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECTOR_in_selector4876 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expression_in_selector4878 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SET_TYPE_in_set_type4898 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_bound_spec_in_set_type4905 = new BitSet(new long[]{0x0000000100000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000180000000000L});
    public static final BitSet FOLLOW_base_type_in_set_type4914 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIMPLE_EXPRESSION_in_simple_expression4943 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_term_in_simple_expression4947 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_add_like_op_in_simple_expression4960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000008000000000L});
    public static final BitSet FOLLOW_term_in_simple_expression4965 = new BitSet(new long[]{0x0000000000400008L});
    public static final BitSet FOLLOW_ADD_LIKE_OP_in_add_like_op4996 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_add_like_op5005 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_add_like_op5014 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_OR_in_add_like_op5024 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_XOR_in_add_like_op5033 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIMPLE_FACTOR_in_simple_factor5059 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_aggregate_initializer_in_simple_factor5067 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_interval_in_simple_factor5077 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_query_expression_in_simple_factor5085 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_entity_constructor_in_simple_factor5093 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_enumeration_reference_in_simple_factor5099 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_unary_op_in_simple_factor5110 = new BitSet(new long[]{0x0000000000000000L,0x4000000000000400L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_simple_factor5119 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_primary_in_simple_factor5126 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIMPLE_TYPES_in_simple_types5157 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_binary_type_in_simple_types5167 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_boolean_type_in_simple_types5177 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_integer_type_in_simple_types5187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_logical_type_in_simple_types5195 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_number_type_in_simple_types5203 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_real_type_in_simple_types5213 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_string_type_in_simple_types5223 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SKIP_STMT_in_skip_stmt5247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nothing_in_skip_stmt5249 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STMT_in_stmt5265 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_alias_stmt_in_stmt5273 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_assignment_stmt_in_stmt5279 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_case_stmt_in_stmt5287 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_compound_stmt_in_stmt5295 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_escape_stmt_in_stmt5303 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_if_stmt_in_stmt5311 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_null_stmt_in_stmt5319 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_procedure_call_stmt_in_stmt5327 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_repeat_stmt_in_stmt5334 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_return_stmt_in_stmt5342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_skip_stmt_in_stmt5350 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_STRING_TYPE_in_string_type5374 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_width_spec_in_string_type5380 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBTYPE_CONSTRAINT_in_subtype_constraint5405 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_supertype_expression_in_subtype_constraint5409 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPERTYPE_EXPRESSION_in_supertype_expression5439 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_supertype_factor_in_supertype_expression5444 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000800000000L});
    public static final BitSet FOLLOW_SUPERTYPE_FACTOR_in_supertype_factor5480 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_supertype_term_in_supertype_factor5485 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_SUPERTYPE_RULE_in_supertype_rule5509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subtype_constraint_in_supertype_rule5511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUPERTYPE_TERM_in_supertype_term5533 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_ref_in_supertype_term5544 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_one_of_in_supertype_term5553 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_supertype_expression_in_supertype_term5564 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SYNTAX_in_syntax5588 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_language_version_id_in_syntax5592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_schema_decl_in_syntax5599 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_schema_decl_in_syntax5607 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_LANGUAGE_VERSION_ID_in_language_version_id5624 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_nothing_in_language_version_id5626 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TERM_in_term5646 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_factor_in_term5650 = new BitSet(new long[]{0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_multiplication_like_op_in_term5663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_factor_in_term5667 = new BitSet(new long[]{0x0000000000000008L,0x0008000000000000L});
    public static final BitSet FOLLOW_MULTIPLICATION_LIKE_OP_in_multiplication_like_op5697 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STAR_in_multiplication_like_op5706 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIVSIGN_in_multiplication_like_op5715 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_multiplication_like_op5724 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MOD_in_multiplication_like_op5733 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AND_in_multiplication_like_op5742 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DOUBLEBAR_in_multiplication_like_op5751 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_DECL_in_type_decl5773 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_id_in_type_decl5777 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_underlying_type_in_type_decl5786 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_where_clause_in_type_decl5790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNDERLYING_TYPE_in_underlying_type5811 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_constructed_types_in_underlying_type5820 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_aggregation_types_in_underlying_type5827 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_simple_types_in_underlying_type5836 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_type_ref_in_underlying_type5850 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTRUCTED_TYPES_in_constructed_types5881 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumeration_type_in_constructed_types5890 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_select_type_in_constructed_types5897 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUMERATION_TYPE_in_enumeration_type5917 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_366_in_enumeration_type5921 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_enumeration_items_in_enumeration_type5930 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_enumeration_extension_in_enumeration_type5934 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUMERATION_ITEMS_in_enumeration_items5961 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_enumeration_id_in_enumeration_items5966 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_ENUMERATION_EXTENSION_in_enumeration_extension5998 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_ref_in_enumeration_extension6000 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_enumeration_items_in_enumeration_extension6004 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUMERATION_ID_in_enumeration_id6027 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_enumeration_id6029 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_TYPE_in_select_type6054 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_366_in_select_type6058 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000300L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_328_in_select_type6065 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000300L});
    public static final BitSet FOLLOW_select_list_in_select_type6074 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_select_extension_in_select_type6080 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SELECT_LIST_in_select_list6119 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_named_types_in_select_list6124 = new BitSet(new long[]{0x0000000000000008L,0x0010000000000000L});
    public static final BitSet FOLLOW_SELECT_EXTENSION_in_select_extension6164 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_type_ref_in_select_extension6168 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_select_list_in_select_extension6174 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_ID_in_type_id6207 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_type_id6209 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_LABEL_in_type_label6229 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_type_label6231 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_LABEL_ID_in_type_label_id6247 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_type_label_id6249 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNARY_OP_in_unary_op6270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_PLUS_in_unary_op6282 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_unary_op6290 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NOT_in_unary_op6298 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTIL_CONTROL_in_until_control6320 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logical_expression_in_until_control6323 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLE_ID_in_variable_id6340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable_id6342 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WHERE_CLAUSE_in_where_clause6358 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_domain_rule_in_where_clause6361 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_domain_rule_in_where_clause6366 = new BitSet(new long[]{0x0004000000000008L});
    public static final BitSet FOLLOW_WHILE_CONTROL_in_while_control6387 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_logical_expression_in_while_control6390 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WIDTH_in_width6408 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_numeric_expression_in_width6410 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_WIDTH_SPEC_in_width_spec6427 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_width_in_width_spec6429 = new BitSet(new long[]{0x0000000000000008L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_374_in_width_spec6435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENTITY_REF_in_entity_ref6459 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_entity_ref6461 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_REF_in_type_ref6484 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_type_ref6486 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUMERATION_REF_in_enumeration_ref6509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_enumeration_ref6511 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ATTRIBUTE_REF_in_attribute_ref6530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_attribute_ref6532 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONSTANT_REF_in_constant_ref6547 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_constant_ref6549 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FUNCTION_REF_in_function_ref6564 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_function_ref6566 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETER_REF_in_parameter_ref6581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_parameter_ref6583 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_VARIABLE_REF_in_variable_ref6598 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_variable_ref6600 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCHEMA_REF_in_schema_ref6615 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_schema_ref6617 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPE_LABEL_REF_in_type_label_ref6632 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_type_label_ref6634 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PROCEDURE_REF_in_procedure_ref6649 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_IDENT_in_procedure_ref6651 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_375_in_nothing6669 = new BitSet(new long[]{0x0000000000000002L});

}
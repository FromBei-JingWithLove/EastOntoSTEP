// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 Express.g 2022-05-29 16:40:26

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


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
public class ExpressLexer extends Lexer {
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

    	private ExpressParser parser;
    	static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ExpressLexer.class);
    	public void setParser(ExpressParser parser) 
    	{
    		this.parser=parser;
    	}

    	Stack<String> paraphrase = new Stack<String>();



    // delegates
    // delegators

    public ExpressLexer() {;} 
    public ExpressLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExpressLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Express.g"; }

    // $ANTLR start "CONST_E"
    public final void mCONST_E() throws RecognitionException {
        try {
            int _type = CONST_E;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:31:9: ( 'const_e' )
            // Express.g:31:11: 'const_e'
            {
            match("const_e"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST_E"

    // $ANTLR start "CONST_PI"
    public final void mCONST_PI() throws RecognitionException {
        try {
            int _type = CONST_PI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:32:10: ( 'pi' )
            // Express.g:32:12: 'pi'
            {
            match("pi"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST_PI"

    // $ANTLR start "CONST_SELF"
    public final void mCONST_SELF() throws RecognitionException {
        try {
            int _type = CONST_SELF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:33:12: ( 'self' )
            // Express.g:33:14: 'self'
            {
            match("self"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CONST_SELF"

    // $ANTLR start "FUNCTION_ABS"
    public final void mFUNCTION_ABS() throws RecognitionException {
        try {
            int _type = FUNCTION_ABS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:34:14: ( 'abs' )
            // Express.g:34:16: 'abs'
            {
            match("abs"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_ABS"

    // $ANTLR start "FUNCTION_ACOS"
    public final void mFUNCTION_ACOS() throws RecognitionException {
        try {
            int _type = FUNCTION_ACOS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:35:15: ( 'acos' )
            // Express.g:35:17: 'acos'
            {
            match("acos"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_ACOS"

    // $ANTLR start "FUNCTION_ASIN"
    public final void mFUNCTION_ASIN() throws RecognitionException {
        try {
            int _type = FUNCTION_ASIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:36:15: ( 'asin' )
            // Express.g:36:17: 'asin'
            {
            match("asin"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_ASIN"

    // $ANTLR start "FUNCTION_ATAN"
    public final void mFUNCTION_ATAN() throws RecognitionException {
        try {
            int _type = FUNCTION_ATAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:37:15: ( 'atan' )
            // Express.g:37:17: 'atan'
            {
            match("atan"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_ATAN"

    // $ANTLR start "FUNCTION_BLENGTH"
    public final void mFUNCTION_BLENGTH() throws RecognitionException {
        try {
            int _type = FUNCTION_BLENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:38:18: ( 'blength' )
            // Express.g:38:20: 'blength'
            {
            match("blength"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_BLENGTH"

    // $ANTLR start "FUNCTION_COS"
    public final void mFUNCTION_COS() throws RecognitionException {
        try {
            int _type = FUNCTION_COS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:39:14: ( 'cos' )
            // Express.g:39:16: 'cos'
            {
            match("cos"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_COS"

    // $ANTLR start "FUNCTION_EXISTS"
    public final void mFUNCTION_EXISTS() throws RecognitionException {
        try {
            int _type = FUNCTION_EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:40:17: ( 'exists' )
            // Express.g:40:19: 'exists'
            {
            match("exists"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_EXISTS"

    // $ANTLR start "FUNCTION_EXP"
    public final void mFUNCTION_EXP() throws RecognitionException {
        try {
            int _type = FUNCTION_EXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:41:14: ( 'exp' )
            // Express.g:41:16: 'exp'
            {
            match("exp"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_EXP"

    // $ANTLR start "FUNCTION_FORMAT"
    public final void mFUNCTION_FORMAT() throws RecognitionException {
        try {
            int _type = FUNCTION_FORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:42:17: ( 'format' )
            // Express.g:42:19: 'format'
            {
            match("format"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_FORMAT"

    // $ANTLR start "FUNCTION_HIBOUND"
    public final void mFUNCTION_HIBOUND() throws RecognitionException {
        try {
            int _type = FUNCTION_HIBOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:43:18: ( 'hibound' )
            // Express.g:43:20: 'hibound'
            {
            match("hibound"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_HIBOUND"

    // $ANTLR start "FUNCTION_HIINDEX"
    public final void mFUNCTION_HIINDEX() throws RecognitionException {
        try {
            int _type = FUNCTION_HIINDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:44:18: ( 'hiindex' )
            // Express.g:44:20: 'hiindex'
            {
            match("hiindex"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_HIINDEX"

    // $ANTLR start "FUNCTION_LENGTH"
    public final void mFUNCTION_LENGTH() throws RecognitionException {
        try {
            int _type = FUNCTION_LENGTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:45:17: ( 'length' )
            // Express.g:45:19: 'length'
            {
            match("length"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_LENGTH"

    // $ANTLR start "FUNCTION_LOBOUND"
    public final void mFUNCTION_LOBOUND() throws RecognitionException {
        try {
            int _type = FUNCTION_LOBOUND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:46:18: ( 'lobound' )
            // Express.g:46:20: 'lobound'
            {
            match("lobound"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_LOBOUND"

    // $ANTLR start "FUNCTION_LOINDEX"
    public final void mFUNCTION_LOINDEX() throws RecognitionException {
        try {
            int _type = FUNCTION_LOINDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:47:18: ( 'loindex' )
            // Express.g:47:20: 'loindex'
            {
            match("loindex"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_LOINDEX"

    // $ANTLR start "FUNCTION_LOG"
    public final void mFUNCTION_LOG() throws RecognitionException {
        try {
            int _type = FUNCTION_LOG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:48:14: ( 'log' )
            // Express.g:48:16: 'log'
            {
            match("log"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_LOG"

    // $ANTLR start "FUNCTION_LOG2"
    public final void mFUNCTION_LOG2() throws RecognitionException {
        try {
            int _type = FUNCTION_LOG2;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:49:15: ( 'log2' )
            // Express.g:49:17: 'log2'
            {
            match("log2"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_LOG2"

    // $ANTLR start "FUNCTION_LOG10"
    public final void mFUNCTION_LOG10() throws RecognitionException {
        try {
            int _type = FUNCTION_LOG10;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:50:16: ( 'log10' )
            // Express.g:50:18: 'log10'
            {
            match("log10"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_LOG10"

    // $ANTLR start "FUNCTION_NVL"
    public final void mFUNCTION_NVL() throws RecognitionException {
        try {
            int _type = FUNCTION_NVL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:51:14: ( 'nvl' )
            // Express.g:51:16: 'nvl'
            {
            match("nvl"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_NVL"

    // $ANTLR start "FUNCTION_ODD"
    public final void mFUNCTION_ODD() throws RecognitionException {
        try {
            int _type = FUNCTION_ODD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:52:14: ( 'odd' )
            // Express.g:52:16: 'odd'
            {
            match("odd"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_ODD"

    // $ANTLR start "FUNCTION_ROLESOF"
    public final void mFUNCTION_ROLESOF() throws RecognitionException {
        try {
            int _type = FUNCTION_ROLESOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:53:18: ( 'rolesof' )
            // Express.g:53:20: 'rolesof'
            {
            match("rolesof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_ROLESOF"

    // $ANTLR start "FUNCTION_SIN"
    public final void mFUNCTION_SIN() throws RecognitionException {
        try {
            int _type = FUNCTION_SIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:54:14: ( 'sin' )
            // Express.g:54:16: 'sin'
            {
            match("sin"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_SIN"

    // $ANTLR start "FUNCTION_SQRT"
    public final void mFUNCTION_SQRT() throws RecognitionException {
        try {
            int _type = FUNCTION_SQRT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:55:15: ( 'sqrt' )
            // Express.g:55:17: 'sqrt'
            {
            match("sqrt"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_SQRT"

    // $ANTLR start "FUNCTION_TAN"
    public final void mFUNCTION_TAN() throws RecognitionException {
        try {
            int _type = FUNCTION_TAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:56:14: ( 'tan' )
            // Express.g:56:16: 'tan'
            {
            match("tan"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_TAN"

    // $ANTLR start "FUNCTION_TYPEOF"
    public final void mFUNCTION_TYPEOF() throws RecognitionException {
        try {
            int _type = FUNCTION_TYPEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:57:17: ( 'typeof' )
            // Express.g:57:19: 'typeof'
            {
            match("typeof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_TYPEOF"

    // $ANTLR start "FUNCTION_USEDIN"
    public final void mFUNCTION_USEDIN() throws RecognitionException {
        try {
            int _type = FUNCTION_USEDIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:58:17: ( 'usedin' )
            // Express.g:58:19: 'usedin'
            {
            match("usedin"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_USEDIN"

    // $ANTLR start "FUNCTION_VALUE"
    public final void mFUNCTION_VALUE() throws RecognitionException {
        try {
            int _type = FUNCTION_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:59:16: ( 'value' )
            // Express.g:59:18: 'value'
            {
            match("value"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_VALUE"

    // $ANTLR start "FUNCTION_VALUE_IN"
    public final void mFUNCTION_VALUE_IN() throws RecognitionException {
        try {
            int _type = FUNCTION_VALUE_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:60:19: ( 'value_in' )
            // Express.g:60:21: 'value_in'
            {
            match("value_in"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_VALUE_IN"

    // $ANTLR start "FUNCTION_VALUE_UNIQUE"
    public final void mFUNCTION_VALUE_UNIQUE() throws RecognitionException {
        try {
            int _type = FUNCTION_VALUE_UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:61:23: ( 'value_unique' )
            // Express.g:61:25: 'value_unique'
            {
            match("value_unique"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_VALUE_UNIQUE"

    // $ANTLR start "FUNCTION_SIZEOF"
    public final void mFUNCTION_SIZEOF() throws RecognitionException {
        try {
            int _type = FUNCTION_SIZEOF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:62:17: ( 'sizeof' )
            // Express.g:62:19: 'sizeof'
            {
            match("sizeof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "FUNCTION_SIZEOF"

    // $ANTLR start "PROCEDURE_INSERT"
    public final void mPROCEDURE_INSERT() throws RecognitionException {
        try {
            int _type = PROCEDURE_INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:63:18: ( 'insert' )
            // Express.g:63:20: 'insert'
            {
            match("insert"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE_INSERT"

    // $ANTLR start "PROCEDURE_REMOVE"
    public final void mPROCEDURE_REMOVE() throws RecognitionException {
        try {
            int _type = PROCEDURE_REMOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:64:18: ( 'remove' )
            // Express.g:64:20: 'remove'
            {
            match("remove"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PROCEDURE_REMOVE"

    // $ANTLR start "NOT"
    public final void mNOT() throws RecognitionException {
        try {
            int _type = NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:65:5: ( 'not' )
            // Express.g:65:7: 'not'
            {
            match("not"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT"

    // $ANTLR start "OR"
    public final void mOR() throws RecognitionException {
        try {
            int _type = OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:66:4: ( 'or' )
            // Express.g:66:6: 'or'
            {
            match("or"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR"

    // $ANTLR start "XOR"
    public final void mXOR() throws RecognitionException {
        try {
            int _type = XOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:67:5: ( 'xor' )
            // Express.g:67:7: 'xor'
            {
            match("xor"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "XOR"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:68:5: ( 'div' )
            // Express.g:68:7: 'div'
            {
            match("div"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:69:5: ( 'mod' )
            // Express.g:69:7: 'mod'
            {
            match("mod"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "AND"
    public final void mAND() throws RecognitionException {
        try {
            int _type = AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:70:5: ( 'and' )
            // Express.g:70:7: 'and'
            {
            match("and"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND"

    // $ANTLR start "T__293"
    public final void mT__293() throws RecognitionException {
        try {
            int _type = T__293;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:71:8: ( 'aggregate' )
            // Express.g:71:10: 'aggregate'
            {
            match("aggregate"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__293"

    // $ANTLR start "T__294"
    public final void mT__294() throws RecognitionException {
        try {
            int _type = T__294;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:72:8: ( 'of' )
            // Express.g:72:10: 'of'
            {
            match("of"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__294"

    // $ANTLR start "T__295"
    public final void mT__295() throws RecognitionException {
        try {
            int _type = T__295;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:73:8: ( 'alias' )
            // Express.g:73:10: 'alias'
            {
            match("alias"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__295"

    // $ANTLR start "T__296"
    public final void mT__296() throws RecognitionException {
        try {
            int _type = T__296;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:74:8: ( 'for' )
            // Express.g:74:10: 'for'
            {
            match("for"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__296"

    // $ANTLR start "T__297"
    public final void mT__297() throws RecognitionException {
        try {
            int _type = T__297;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:75:8: ( 'end_alias' )
            // Express.g:75:10: 'end_alias'
            {
            match("end_alias"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__297"

    // $ANTLR start "T__298"
    public final void mT__298() throws RecognitionException {
        try {
            int _type = T__298;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:76:8: ( 'array' )
            // Express.g:76:10: 'array'
            {
            match("array"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__298"

    // $ANTLR start "T__299"
    public final void mT__299() throws RecognitionException {
        try {
            int _type = T__299;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:77:8: ( 'optional' )
            // Express.g:77:10: 'optional'
            {
            match("optional"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__299"

    // $ANTLR start "T__300"
    public final void mT__300() throws RecognitionException {
        try {
            int _type = T__300;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:78:8: ( 'unique' )
            // Express.g:78:10: 'unique'
            {
            match("unique"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__300"

    // $ANTLR start "T__301"
    public final void mT__301() throws RecognitionException {
        try {
            int _type = T__301;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:79:8: ( 'bag' )
            // Express.g:79:10: 'bag'
            {
            match("bag"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__301"

    // $ANTLR start "T__302"
    public final void mT__302() throws RecognitionException {
        try {
            int _type = T__302;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:80:8: ( 'binary' )
            // Express.g:80:10: 'binary'
            {
            match("binary"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__302"

    // $ANTLR start "T__303"
    public final void mT__303() throws RecognitionException {
        try {
            int _type = T__303;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:81:8: ( 'boolean' )
            // Express.g:81:10: 'boolean'
            {
            match("boolean"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__303"

    // $ANTLR start "T__304"
    public final void mT__304() throws RecognitionException {
        try {
            int _type = T__304;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:82:8: ( 'case' )
            // Express.g:82:10: 'case'
            {
            match("case"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__304"

    // $ANTLR start "T__305"
    public final void mT__305() throws RecognitionException {
        try {
            int _type = T__305;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:83:8: ( 'otherwise' )
            // Express.g:83:10: 'otherwise'
            {
            match("otherwise"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__305"

    // $ANTLR start "T__306"
    public final void mT__306() throws RecognitionException {
        try {
            int _type = T__306;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:84:8: ( 'end_case' )
            // Express.g:84:10: 'end_case'
            {
            match("end_case"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__306"

    // $ANTLR start "T__307"
    public final void mT__307() throws RecognitionException {
        try {
            int _type = T__307;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:85:8: ( 'begin' )
            // Express.g:85:10: 'begin'
            {
            match("begin"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__307"

    // $ANTLR start "T__308"
    public final void mT__308() throws RecognitionException {
        try {
            int _type = T__308;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:86:8: ( 'end' )
            // Express.g:86:10: 'end'
            {
            match("end"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__308"

    // $ANTLR start "T__309"
    public final void mT__309() throws RecognitionException {
        try {
            int _type = T__309;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:87:8: ( 'constant' )
            // Express.g:87:10: 'constant'
            {
            match("constant"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__309"

    // $ANTLR start "T__310"
    public final void mT__310() throws RecognitionException {
        try {
            int _type = T__310;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:88:8: ( 'end_constant' )
            // Express.g:88:10: 'end_constant'
            {
            match("end_constant"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__310"

    // $ANTLR start "T__311"
    public final void mT__311() throws RecognitionException {
        try {
            int _type = T__311;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:89:8: ( 'entity' )
            // Express.g:89:10: 'entity'
            {
            match("entity"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__311"

    // $ANTLR start "T__312"
    public final void mT__312() throws RecognitionException {
        try {
            int _type = T__312;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:90:8: ( 'abstract' )
            // Express.g:90:10: 'abstract'
            {
            match("abstract"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__312"

    // $ANTLR start "T__313"
    public final void mT__313() throws RecognitionException {
        try {
            int _type = T__313;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:91:8: ( 'end_entity' )
            // Express.g:91:10: 'end_entity'
            {
            match("end_entity"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__313"

    // $ANTLR start "T__314"
    public final void mT__314() throws RecognitionException {
        try {
            int _type = T__314;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:92:8: ( 'supertype' )
            // Express.g:92:10: 'supertype'
            {
            match("supertype"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__314"

    // $ANTLR start "T__315"
    public final void mT__315() throws RecognitionException {
        try {
            int _type = T__315;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:93:8: ( 'subtype' )
            // Express.g:93:10: 'subtype'
            {
            match("subtype"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__315"

    // $ANTLR start "T__316"
    public final void mT__316() throws RecognitionException {
        try {
            int _type = T__316;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:94:8: ( 'end_subtype_constraint' )
            // Express.g:94:10: 'end_subtype_constraint'
            {
            match("end_subtype_constraint"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__316"

    // $ANTLR start "T__317"
    public final void mT__317() throws RecognitionException {
        try {
            int _type = T__317;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:95:8: ( 'subtype_constraint' )
            // Express.g:95:10: 'subtype_constraint'
            {
            match("subtype_constraint"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__317"

    // $ANTLR start "T__318"
    public final void mT__318() throws RecognitionException {
        try {
            int _type = T__318;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:96:8: ( 'total_over' )
            // Express.g:96:10: 'total_over'
            {
            match("total_over"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__318"

    // $ANTLR start "T__319"
    public final void mT__319() throws RecognitionException {
        try {
            int _type = T__319;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:97:8: ( 'renamed' )
            // Express.g:97:10: 'renamed'
            {
            match("renamed"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__319"

    // $ANTLR start "T__320"
    public final void mT__320() throws RecognitionException {
        try {
            int _type = T__320;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:98:8: ( 'derive' )
            // Express.g:98:10: 'derive'
            {
            match("derive"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__320"

    // $ANTLR start "T__321"
    public final void mT__321() throws RecognitionException {
        try {
            int _type = T__321;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:99:8: ( 'inverse' )
            // Express.g:99:10: 'inverse'
            {
            match("inverse"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__321"

    // $ANTLR start "T__322"
    public final void mT__322() throws RecognitionException {
        try {
            int _type = T__322;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:100:8: ( 'set' )
            // Express.g:100:10: 'set'
            {
            match("set"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__322"

    // $ANTLR start "T__323"
    public final void mT__323() throws RecognitionException {
        try {
            int _type = T__323;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:101:8: ( 'escape' )
            // Express.g:101:10: 'escape'
            {
            match("escape"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__323"

    // $ANTLR start "T__324"
    public final void mT__324() throws RecognitionException {
        try {
            int _type = T__324;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:102:8: ( 'end_function' )
            // Express.g:102:10: 'end_function'
            {
            match("end_function"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__324"

    // $ANTLR start "T__325"
    public final void mT__325() throws RecognitionException {
        try {
            int _type = T__325;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:103:8: ( 'function' )
            // Express.g:103:10: 'function'
            {
            match("function"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__325"

    // $ANTLR start "T__326"
    public final void mT__326() throws RecognitionException {
        try {
            int _type = T__326;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:104:8: ( 'list' )
            // Express.g:104:10: 'list'
            {
            match("list"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__326"

    // $ANTLR start "T__327"
    public final void mT__327() throws RecognitionException {
        try {
            int _type = T__327;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:105:8: ( 'generic' )
            // Express.g:105:10: 'generic'
            {
            match("generic"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__327"

    // $ANTLR start "T__328"
    public final void mT__328() throws RecognitionException {
        try {
            int _type = T__328;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:106:8: ( 'generic_entity' )
            // Express.g:106:10: 'generic_entity'
            {
            match("generic_entity"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__328"

    // $ANTLR start "T__329"
    public final void mT__329() throws RecognitionException {
        try {
            int _type = T__329;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:107:8: ( 'if' )
            // Express.g:107:10: 'if'
            {
            match("if"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__329"

    // $ANTLR start "T__330"
    public final void mT__330() throws RecognitionException {
        try {
            int _type = T__330;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:108:8: ( 'then' )
            // Express.g:108:10: 'then'
            {
            match("then"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__330"

    // $ANTLR start "T__331"
    public final void mT__331() throws RecognitionException {
        try {
            int _type = T__331;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:109:8: ( 'end_if' )
            // Express.g:109:10: 'end_if'
            {
            match("end_if"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__331"

    // $ANTLR start "T__332"
    public final void mT__332() throws RecognitionException {
        try {
            int _type = T__332;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:110:8: ( 'else' )
            // Express.g:110:10: 'else'
            {
            match("else"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__332"

    // $ANTLR start "T__333"
    public final void mT__333() throws RecognitionException {
        try {
            int _type = T__333;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:111:8: ( 'to' )
            // Express.g:111:10: 'to'
            {
            match("to"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__333"

    // $ANTLR start "T__334"
    public final void mT__334() throws RecognitionException {
        try {
            int _type = T__334;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:112:8: ( 'by' )
            // Express.g:112:10: 'by'
            {
            match("by"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__334"

    // $ANTLR start "T__335"
    public final void mT__335() throws RecognitionException {
        try {
            int _type = T__335;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:113:8: ( 'integer' )
            // Express.g:113:10: 'integer'
            {
            match("integer"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__335"

    // $ANTLR start "T__336"
    public final void mT__336() throws RecognitionException {
        try {
            int _type = T__336;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:114:8: ( 'local' )
            // Express.g:114:10: 'local'
            {
            match("local"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__336"

    // $ANTLR start "T__337"
    public final void mT__337() throws RecognitionException {
        try {
            int _type = T__337;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:115:8: ( 'end_local' )
            // Express.g:115:10: 'end_local'
            {
            match("end_local"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__337"

    // $ANTLR start "T__338"
    public final void mT__338() throws RecognitionException {
        try {
            int _type = T__338;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:116:8: ( 'false' )
            // Express.g:116:10: 'false'
            {
            match("false"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__338"

    // $ANTLR start "T__339"
    public final void mT__339() throws RecognitionException {
        try {
            int _type = T__339;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:117:8: ( 'true' )
            // Express.g:117:10: 'true'
            {
            match("true"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__339"

    // $ANTLR start "T__340"
    public final void mT__340() throws RecognitionException {
        try {
            int _type = T__340;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:118:8: ( 'unknown' )
            // Express.g:118:10: 'unknown'
            {
            match("unknown"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__340"

    // $ANTLR start "T__341"
    public final void mT__341() throws RecognitionException {
        try {
            int _type = T__341;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:119:8: ( 'logical' )
            // Express.g:119:10: 'logical'
            {
            match("logical"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__341"

    // $ANTLR start "T__342"
    public final void mT__342() throws RecognitionException {
        try {
            int _type = T__342;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:120:8: ( 'number' )
            // Express.g:120:10: 'number'
            {
            match("number"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__342"

    // $ANTLR start "T__343"
    public final void mT__343() throws RecognitionException {
        try {
            int _type = T__343;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:121:8: ( 'oneof' )
            // Express.g:121:10: 'oneof'
            {
            match("oneof"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__343"

    // $ANTLR start "T__344"
    public final void mT__344() throws RecognitionException {
        try {
            int _type = T__344;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:122:8: ( 'end_procedure' )
            // Express.g:122:10: 'end_procedure'
            {
            match("end_procedure"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__344"

    // $ANTLR start "T__345"
    public final void mT__345() throws RecognitionException {
        try {
            int _type = T__345;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:123:8: ( 'procedure' )
            // Express.g:123:10: 'procedure'
            {
            match("procedure"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__345"

    // $ANTLR start "T__346"
    public final void mT__346() throws RecognitionException {
        try {
            int _type = T__346;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:124:8: ( 'var' )
            // Express.g:124:10: 'var'
            {
            match("var"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__346"

    // $ANTLR start "T__347"
    public final void mT__347() throws RecognitionException {
        try {
            int _type = T__347;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:125:8: ( 'real' )
            // Express.g:125:10: 'real'
            {
            match("real"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__347"

    // $ANTLR start "T__348"
    public final void mT__348() throws RecognitionException {
        try {
            int _type = T__348;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:126:8: ( 'reference' )
            // Express.g:126:10: 'reference'
            {
            match("reference"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__348"

    // $ANTLR start "T__349"
    public final void mT__349() throws RecognitionException {
        try {
            int _type = T__349;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:127:8: ( 'from' )
            // Express.g:127:10: 'from'
            {
            match("from"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__349"

    // $ANTLR start "T__350"
    public final void mT__350() throws RecognitionException {
        try {
            int _type = T__350;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:128:8: ( 'in' )
            // Express.g:128:10: 'in'
            {
            match("in"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__350"

    // $ANTLR start "T__351"
    public final void mT__351() throws RecognitionException {
        try {
            int _type = T__351;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:129:8: ( 'like' )
            // Express.g:129:10: 'like'
            {
            match("like"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__351"

    // $ANTLR start "T__352"
    public final void mT__352() throws RecognitionException {
        try {
            int _type = T__352;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:130:8: ( 'repeat' )
            // Express.g:130:10: 'repeat'
            {
            match("repeat"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__352"

    // $ANTLR start "T__353"
    public final void mT__353() throws RecognitionException {
        try {
            int _type = T__353;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:131:8: ( 'end_repeat' )
            // Express.g:131:10: 'end_repeat'
            {
            match("end_repeat"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__353"

    // $ANTLR start "T__354"
    public final void mT__354() throws RecognitionException {
        try {
            int _type = T__354;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:132:8: ( 'as' )
            // Express.g:132:10: 'as'
            {
            match("as"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__354"

    // $ANTLR start "T__355"
    public final void mT__355() throws RecognitionException {
        try {
            int _type = T__355;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:133:8: ( 'return' )
            // Express.g:133:10: 'return'
            {
            match("return"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__355"

    // $ANTLR start "T__356"
    public final void mT__356() throws RecognitionException {
        try {
            int _type = T__356;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:134:8: ( 'end_rule' )
            // Express.g:134:10: 'end_rule'
            {
            match("end_rule"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__356"

    // $ANTLR start "T__357"
    public final void mT__357() throws RecognitionException {
        try {
            int _type = T__357;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:135:8: ( 'rule' )
            // Express.g:135:10: 'rule'
            {
            match("rule"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__357"

    // $ANTLR start "T__358"
    public final void mT__358() throws RecognitionException {
        try {
            int _type = T__358;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:136:8: ( 'schema' )
            // Express.g:136:10: 'schema'
            {
            match("schema"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__358"

    // $ANTLR start "T__359"
    public final void mT__359() throws RecognitionException {
        try {
            int _type = T__359;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:137:8: ( 'end_schema' )
            // Express.g:137:10: 'end_schema'
            {
            match("end_schema"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__359"

    // $ANTLR start "T__360"
    public final void mT__360() throws RecognitionException {
        try {
            int _type = T__360;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:138:8: ( 'use' )
            // Express.g:138:10: 'use'
            {
            match("use"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__360"

    // $ANTLR start "T__361"
    public final void mT__361() throws RecognitionException {
        try {
            int _type = T__361;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:139:8: ( 'skip' )
            // Express.g:139:10: 'skip'
            {
            match("skip"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__361"

    // $ANTLR start "T__362"
    public final void mT__362() throws RecognitionException {
        try {
            int _type = T__362;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:140:8: ( 'string' )
            // Express.g:140:10: 'string'
            {
            match("string"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__362"

    // $ANTLR start "T__363"
    public final void mT__363() throws RecognitionException {
        try {
            int _type = T__363;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:141:8: ( 'andor' )
            // Express.g:141:10: 'andor'
            {
            match("andor"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__363"

    // $ANTLR start "T__364"
    public final void mT__364() throws RecognitionException {
        try {
            int _type = T__364;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:142:8: ( 'type' )
            // Express.g:142:10: 'type'
            {
            match("type"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__364"

    // $ANTLR start "T__365"
    public final void mT__365() throws RecognitionException {
        try {
            int _type = T__365;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:143:8: ( 'end_type' )
            // Express.g:143:10: 'end_type'
            {
            match("end_type"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__365"

    // $ANTLR start "T__366"
    public final void mT__366() throws RecognitionException {
        try {
            int _type = T__366;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:144:8: ( 'extensible' )
            // Express.g:144:10: 'extensible'
            {
            match("extensible"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__366"

    // $ANTLR start "T__367"
    public final void mT__367() throws RecognitionException {
        try {
            int _type = T__367;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:145:8: ( 'enumeration' )
            // Express.g:145:10: 'enumeration'
            {
            match("enumeration"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__367"

    // $ANTLR start "T__368"
    public final void mT__368() throws RecognitionException {
        try {
            int _type = T__368;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:146:8: ( 'based_on' )
            // Express.g:146:10: 'based_on'
            {
            match("based_on"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__368"

    // $ANTLR start "T__369"
    public final void mT__369() throws RecognitionException {
        try {
            int _type = T__369;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:147:8: ( 'with' )
            // Express.g:147:10: 'with'
            {
            match("with"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__369"

    // $ANTLR start "T__370"
    public final void mT__370() throws RecognitionException {
        try {
            int _type = T__370;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:148:8: ( 'select' )
            // Express.g:148:10: 'select'
            {
            match("select"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__370"

    // $ANTLR start "T__371"
    public final void mT__371() throws RecognitionException {
        try {
            int _type = T__371;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:149:8: ( 'until' )
            // Express.g:149:10: 'until'
            {
            match("until"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__371"

    // $ANTLR start "T__372"
    public final void mT__372() throws RecognitionException {
        try {
            int _type = T__372;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:150:8: ( 'where' )
            // Express.g:150:10: 'where'
            {
            match("where"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__372"

    // $ANTLR start "T__373"
    public final void mT__373() throws RecognitionException {
        try {
            int _type = T__373;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:151:8: ( 'while' )
            // Express.g:151:10: 'while'
            {
            match("while"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__373"

    // $ANTLR start "T__374"
    public final void mT__374() throws RecognitionException {
        try {
            int _type = T__374;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:152:8: ( 'fixed' )
            // Express.g:152:10: 'fixed'
            {
            match("fixed"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__374"

    // $ANTLR start "QUERY"
    public final void mQUERY() throws RecognitionException {
        try {
            int _type = QUERY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Express.g:1584:1: ( 'query' )
            // Express.g:1584:3: 'query'
            {
            match("query"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "QUERY"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("a comment");
            // Express.g:1589:2: ( '(*' ( options {greedy=false; } : {...}? => '*' | ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' | ~ ( '*' | '\\n' | '\\r' ) )* '*)' )
            // Express.g:1589:4: '(*' ( options {greedy=false; } : {...}? => '*' | ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' | ~ ( '*' | '\\n' | '\\r' ) )* '*)'
            {
            match("(*"); if (state.failed) return ;

            // Express.g:1590:3: ( options {greedy=false; } : {...}? => '*' | ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' | ~ ( '*' | '\\n' | '\\r' ) )*
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='*') ) {
                    int LA2_1 = input.LA(2);

                    if ( (LA2_1==')') ) {
                        alt2=5;
                    }
                    else if ( ((LA2_1>='\u0000' && LA2_1<='(')||(LA2_1>='*' && LA2_1<='\uFFFF')) && (( input.LA(2)!='(' ))) {
                        alt2=1;
                    }


                }
                else if ( (LA2_0=='\r') ) {
                    int LA2_2 = input.LA(2);

                    if ( (synpred1_Express()) ) {
                        alt2=2;
                    }
                    else if ( (true) ) {
                        alt2=3;
                    }


                }
                else if ( (LA2_0=='\n') && (synpred1_Express())) {
                    alt2=2;
                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='\t')||(LA2_0>='\u000B' && LA2_0<='\f')||(LA2_0>='\u000E' && LA2_0<=')')||(LA2_0>='+' && LA2_0<='\uFFFF')) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // Express.g:1599:4: {...}? => '*'
            	    {
            	    if ( !(( input.LA(2)!='(' )) ) {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        throw new FailedPredicateException(input, "COMMENT", " input.LA(2)!='(' ");
            	    }
            	    match('*'); if (state.failed) return ;

            	    }
            	    break;
            	case 2 :
            	    // Express.g:1600:5: ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n'
            	    {
            	    // Express.g:1600:21: ( '\\r' )?
            	    int alt1=2;
            	    int LA1_0 = input.LA(1);

            	    if ( (LA1_0=='\r') ) {
            	        alt1=1;
            	    }
            	    switch (alt1) {
            	        case 1 :
            	            // Express.g:1600:21: '\\r'
            	            {
            	            match('\r'); if (state.failed) return ;

            	            }
            	            break;

            	    }

            	    match('\n'); if (state.failed) return ;

            	    }
            	    break;
            	case 3 :
            	    // Express.g:1601:5: '\\r'
            	    {
            	    match('\r'); if (state.failed) return ;

            	    }
            	    break;
            	case 4 :
            	    // Express.g:1602:5: ~ ( '*' | '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<=')')||(input.LA(1)>='+' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("*)"); if (state.failed) return ;

            if ( state.backtracking==0 ) {
               if (parser.isFirst) _channel=HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINECOMMENT"
    public final void mLINECOMMENT() throws RecognitionException {
        try {
            int _type = LINECOMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("a EXPRESS one line comment");
            // Express.g:1608:2: ( '--' (~ ( '\\n' | '\\r' ) )* )
            // Express.g:1609:2: '--' (~ ( '\\n' | '\\r' ) )*
            {
            match("--"); if (state.failed) return ;

            // Express.g:1609:7: (~ ( '\\n' | '\\r' ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='\u0000' && LA3_0<='\t')||(LA3_0>='\u000B' && LA3_0<='\f')||(LA3_0>='\u000E' && LA3_0<='\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // Express.g:1610:6: ~ ( '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               if (parser.isFirst) _channel=HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "LINECOMMENT"

    // $ANTLR start "LANG_VERSION"
    public final void mLANG_VERSION() throws RecognitionException {
        try {
            int _type = LANG_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("language version id");
            // Express.g:1617:2: ( 'iso standard 10303 part (11) version (4)' )
            // Express.g:1618:2: 'iso standard 10303 part (11) version (4)'
            {
            match("iso standard 10303 part (11) version (4)"); if (state.failed) return ;


            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "LANG_VERSION"

    // $ANTLR start "SEMI"
    public final void mSEMI() throws RecognitionException {
        try {
            int _type = SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push(";");
            // Express.g:1624:2: ( ';' )
            // Express.g:1624:4: ';'
            {
            match(';'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "SEMI"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("?");
            // Express.g:1630:2: ( '?' )
            // Express.g:1630:4: '?'
            {
            match('?'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("(");
            // Express.g:1636:2: ( '(' )
            // Express.g:1636:4: '('
            {
            match('('); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push(")");
            // Express.g:1642:2: ( ')' )
            // Express.g:1642:4: ')'
            {
            match(')'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LBRACK"
    public final void mLBRACK() throws RecognitionException {
        try {
            int _type = LBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("[");
            // Express.g:1648:2: ( '[' )
            // Express.g:1648:4: '['
            {
            match('['); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "LBRACK"

    // $ANTLR start "RBRACK"
    public final void mRBRACK() throws RecognitionException {
        try {
            int _type = RBRACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("]");
            // Express.g:1654:2: ( ']' )
            // Express.g:1654:4: ']'
            {
            match(']'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "RBRACK"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("{");
            // Express.g:1660:2: ( '{' )
            // Express.g:1660:4: '{'
            {
            match('{'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("}");
            // Express.g:1666:2: ( '}' )
            // Express.g:1666:4: '}'
            {
            match('}'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "BACKSLASH"
    public final void mBACKSLASH() throws RecognitionException {
        try {
            int _type = BACKSLASH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("\\");
            // Express.g:1672:2: ( '\\\\' )
            // Express.g:1672:4: '\\\\'
            {
            match('\\'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "BACKSLASH"

    // $ANTLR start "BAR"
    public final void mBAR() throws RecognitionException {
        try {
            int _type = BAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("|");
            // Express.g:1679:2: ( '|' )
            // Express.g:1679:4: '|'
            {
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "BAR"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("&");
            // Express.g:1685:2: ( '&' )
            // Express.g:1685:4: '&'
            {
            match('&'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push(":");
            // Express.g:1691:2: ( ':' )
            // Express.g:1691:4: ':'
            {
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COLEQ"
    public final void mCOLEQ() throws RecognitionException {
        try {
            int _type = COLEQ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push(":=");
            // Express.g:1697:2: ( ':' '=' )
            // Express.g:1697:4: ':' '='
            {
            match(':'); if (state.failed) return ;
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "COLEQ"

    // $ANTLR start "COLEQCOL"
    public final void mCOLEQCOL() throws RecognitionException {
        try {
            int _type = COLEQCOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push(":=:");
            // Express.g:1704:2: ( ':' '=' ':' )
            // Express.g:1704:4: ':' '=' ':'
            {
            match(':'); if (state.failed) return ;
            match('='); if (state.failed) return ;
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "COLEQCOL"

    // $ANTLR start "COLLTGT"
    public final void mCOLLTGT() throws RecognitionException {
        try {
            int _type = COLLTGT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push(":<>:");
            // Express.g:1712:2: ( ':' '<' '>' ':' )
            // Express.g:1712:4: ':' '<' '>' ':'
            {
            match(':'); if (state.failed) return ;
            match('<'); if (state.failed) return ;
            match('>'); if (state.failed) return ;
            match(':'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "COLLTGT"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push(",");
            // Express.g:1721:2: ( ',' )
            // Express.g:1721:4: ','
            {
            match(','); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push(".");
            // Express.g:1727:2: ( '.' )
            // Express.g:1727:4: '.'
            {
            match('.'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "ASSIGN"
    public final void mASSIGN() throws RecognitionException {
        try {
            int _type = ASSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("=");
            // Express.g:1733:2: ( '=' )
            // Express.g:1733:4: '='
            {
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "ASSIGN"

    // $ANTLR start "LT"
    public final void mLT() throws RecognitionException {
        try {
            int _type = LT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("<");
            // Express.g:1739:2: ( '<' )
            // Express.g:1739:4: '<'
            {
            match('<'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "LT"

    // $ANTLR start "GT"
    public final void mGT() throws RecognitionException {
        try {
            int _type = GT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push(">");
            // Express.g:1745:2: ( '>' )
            // Express.g:1745:4: '>'
            {
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "GT"

    // $ANTLR start "LE"
    public final void mLE() throws RecognitionException {
        try {
            int _type = LE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("<=");
            // Express.g:1751:2: ( '<' '=' )
            // Express.g:1751:4: '<' '='
            {
            match('<'); if (state.failed) return ;
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "LE"

    // $ANTLR start "GE"
    public final void mGE() throws RecognitionException {
        try {
            int _type = GE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push(">=");
            // Express.g:1757:2: ( '>' '=' )
            // Express.g:1757:4: '>' '='
            {
            match('>'); if (state.failed) return ;
            match('='); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "GE"

    // $ANTLR start "DIVSIGN"
    public final void mDIVSIGN() throws RecognitionException {
        try {
            int _type = DIVSIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("/");
            // Express.g:1763:2: ( '/' )
            // Express.g:1763:4: '/'
            {
            match('/'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "DIVSIGN"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("+");
            // Express.g:1769:2: ( '+' )
            // Express.g:1769:4: '+'
            {
            match('+'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("-");
            // Express.g:1775:2: ( '-' )
            // Express.g:1775:4: '-'
            {
            match('-'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("*");
            // Express.g:1781:2: ( '*' )
            // Express.g:1781:4: '*'
            {
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "AT"
    public final void mAT() throws RecognitionException {
        try {
            int _type = AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("@");
            // Express.g:1787:2: ( '@' )
            // Express.g:1787:4: '@'
            {
            match('@'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "AT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("WS");
            // Express.g:1793:2: ( ( ' ' | '\\f' | '\\t' | ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' ) )
            // Express.g:1793:4: ( ' ' | '\\f' | '\\t' | ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' )
            {
            // Express.g:1793:4: ( ' ' | '\\f' | '\\t' | ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n' | '\\r' )
            int alt5=5;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==' ') ) {
                alt5=1;
            }
            else if ( (LA5_0=='\f') ) {
                alt5=2;
            }
            else if ( (LA5_0=='\t') ) {
                alt5=3;
            }
            else if ( (LA5_0=='\r') ) {
                int LA5_4 = input.LA(2);

                if ( (LA5_4=='\n') && (synpred2_Express())) {
                    alt5=4;
                }
                else {
                    alt5=5;}
            }
            else if ( (LA5_0=='\n') && (synpred2_Express())) {
                alt5=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // Express.g:1793:7: ' '
                    {
                    match(' '); if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // Express.g:1794:6: '\\f'
                    {
                    match('\f'); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // Express.g:1795:6: '\\t'
                    {
                    match('\t'); if (state.failed) return ;

                    }
                    break;
                case 4 :
                    // Express.g:1796:6: ( ( '\\r' )? '\\n' )=> ( '\\r' )? '\\n'
                    {
                    // Express.g:1796:21: ( '\\r' )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0=='\r') ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // Express.g:1796:21: '\\r'
                            {
                            match('\r'); if (state.failed) return ;

                            }
                            break;

                    }

                    match('\n'); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // Express.g:1797:7: '\\r'
                    {
                    match('\r'); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               _channel=HIDDEN; 
            }

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LTSTAR"
    public final void mLTSTAR() throws RecognitionException {
        try {
            int _type = LTSTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("<*");
            // Express.g:1805:9: ( '<' '*' )
            // Express.g:1805:11: '<' '*'
            {
            match('<'); if (state.failed) return ;
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "LTSTAR"

    // $ANTLR start "LTGT"
    public final void mLTGT() throws RecognitionException {
        try {
            int _type = LTGT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("<>");
            // Express.g:1812:9: ( '<' '>' )
            // Express.g:1812:11: '<' '>'
            {
            match('<'); if (state.failed) return ;
            match('>'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "LTGT"

    // $ANTLR start "DOUBLESTAR"
    public final void mDOUBLESTAR() throws RecognitionException {
        try {
            int _type = DOUBLESTAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("**");
            // Express.g:1819:9: ( '*' '*' )
            // Express.g:1819:11: '*' '*'
            {
            match('*'); if (state.failed) return ;
            match('*'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "DOUBLESTAR"

    // $ANTLR start "DOUBLEBAR"
    public final void mDOUBLEBAR() throws RecognitionException {
        try {
            int _type = DOUBLEBAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("||");
            // Express.g:1826:9: ( '|' '|' )
            // Express.g:1826:11: '|' '|'
            {
            match('|'); if (state.failed) return ;
            match('|'); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "DOUBLEBAR"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("String");
            // Express.g:1833:2: ( '\\'' (~ '\\'' )* '\\'' )
            // Express.g:1834:2: '\\'' (~ '\\'' )* '\\''
            {
            match('\''); if (state.failed) return ;
            // Express.g:1835:2: (~ '\\'' )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>='\u0000' && LA6_0<='&')||(LA6_0>='(' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Express.g:1835:3: ~ '\\''
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match('\''); if (state.failed) return ;

            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            paraphrase.push("digit");
            // Express.g:1844:2: ( '0' .. '9' )
            // Express.g:1844:4: '0' .. '9'
            {
            matchRange('0','9'); if (state.failed) return ;

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("int");
            // Express.g:1850:2: ( ( DIGIT )+ )
            // Express.g:1850:7: ( DIGIT )+
            {
            // Express.g:1850:7: ( DIGIT )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Express.g:1850:8: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return ;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("float");
            // Express.g:1856:2: ( INT '.' ( DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( INT )+ )? )
            // Express.g:1856:7: INT '.' ( DIGIT )* ( ( 'e' | 'E' ) ( '+' | '-' )? ( INT )+ )?
            {
            mINT(); if (state.failed) return ;
            match('.'); if (state.failed) return ;
            // Express.g:1856:15: ( DIGIT )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Express.g:1856:16: DIGIT
            	    {
            	    mDIGIT(); if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // Express.g:1856:24: ( ( 'e' | 'E' ) ( '+' | '-' )? ( INT )+ )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='E'||LA11_0=='e') ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // Express.g:1856:25: ( 'e' | 'E' ) ( '+' | '-' )? ( INT )+
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();
                    state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    // Express.g:1856:37: ( '+' | '-' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='+'||LA9_0=='-') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // Express.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            state.failed=false;
                            }
                            else {
                                if (state.backtracking>0) {state.failed=true; return ;}
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;}


                            }
                            break;

                    }

                    // Express.g:1856:50: ( INT )+
                    int cnt10=0;
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( ((LA10_0>='0' && LA10_0<='9')) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // Express.g:1856:51: INT
                    	    {
                    	    mINT(); if (state.failed) return ;

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt10 >= 1 ) break loop10;
                    	    if (state.backtracking>0) {state.failed=true; return ;}
                                EarlyExitException eee =
                                    new EarlyExitException(10, input);
                                throw eee;
                        }
                        cnt10++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "IDENT"
    public final void mIDENT() throws RecognitionException {
        try {
            int _type = IDENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            paraphrase.push("ident");
            // Express.g:1862:2: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // Express.g:1862:4: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();
            state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Express.g:1862:28: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( ((LA12_0>='0' && LA12_0<='9')||(LA12_0>='A' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='z')) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Express.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();
            	    state.failed=false;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return ;}
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
            if ( state.backtracking==0 ) {
              paraphrase.pop();
            }    }
        finally {
        }
    }
    // $ANTLR end "IDENT"

    public void mTokens() throws RecognitionException {
        // Express.g:1:8: ( CONST_E | CONST_PI | CONST_SELF | FUNCTION_ABS | FUNCTION_ACOS | FUNCTION_ASIN | FUNCTION_ATAN | FUNCTION_BLENGTH | FUNCTION_COS | FUNCTION_EXISTS | FUNCTION_EXP | FUNCTION_FORMAT | FUNCTION_HIBOUND | FUNCTION_HIINDEX | FUNCTION_LENGTH | FUNCTION_LOBOUND | FUNCTION_LOINDEX | FUNCTION_LOG | FUNCTION_LOG2 | FUNCTION_LOG10 | FUNCTION_NVL | FUNCTION_ODD | FUNCTION_ROLESOF | FUNCTION_SIN | FUNCTION_SQRT | FUNCTION_TAN | FUNCTION_TYPEOF | FUNCTION_USEDIN | FUNCTION_VALUE | FUNCTION_VALUE_IN | FUNCTION_VALUE_UNIQUE | FUNCTION_SIZEOF | PROCEDURE_INSERT | PROCEDURE_REMOVE | NOT | OR | XOR | DIV | MOD | AND | T__293 | T__294 | T__295 | T__296 | T__297 | T__298 | T__299 | T__300 | T__301 | T__302 | T__303 | T__304 | T__305 | T__306 | T__307 | T__308 | T__309 | T__310 | T__311 | T__312 | T__313 | T__314 | T__315 | T__316 | T__317 | T__318 | T__319 | T__320 | T__321 | T__322 | T__323 | T__324 | T__325 | T__326 | T__327 | T__328 | T__329 | T__330 | T__331 | T__332 | T__333 | T__334 | T__335 | T__336 | T__337 | T__338 | T__339 | T__340 | T__341 | T__342 | T__343 | T__344 | T__345 | T__346 | T__347 | T__348 | T__349 | T__350 | T__351 | T__352 | T__353 | T__354 | T__355 | T__356 | T__357 | T__358 | T__359 | T__360 | T__361 | T__362 | T__363 | T__364 | T__365 | T__366 | T__367 | T__368 | T__369 | T__370 | T__371 | T__372 | T__373 | T__374 | QUERY | COMMENT | LINECOMMENT | LANG_VERSION | SEMI | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | LCURLY | RCURLY | BACKSLASH | BAR | AMPERSAND | COLON | COLEQ | COLEQCOL | COLLTGT | COMMA | DOT | ASSIGN | LT | GT | LE | GE | DIVSIGN | PLUS | MINUS | STAR | AT | WS | LTSTAR | LTGT | DOUBLESTAR | DOUBLEBAR | STRING | INT | FLOAT | IDENT )
        int alt13=162;
        alt13 = dfa13.predict(input);
        switch (alt13) {
            case 1 :
                // Express.g:1:10: CONST_E
                {
                mCONST_E(); if (state.failed) return ;

                }
                break;
            case 2 :
                // Express.g:1:18: CONST_PI
                {
                mCONST_PI(); if (state.failed) return ;

                }
                break;
            case 3 :
                // Express.g:1:27: CONST_SELF
                {
                mCONST_SELF(); if (state.failed) return ;

                }
                break;
            case 4 :
                // Express.g:1:38: FUNCTION_ABS
                {
                mFUNCTION_ABS(); if (state.failed) return ;

                }
                break;
            case 5 :
                // Express.g:1:51: FUNCTION_ACOS
                {
                mFUNCTION_ACOS(); if (state.failed) return ;

                }
                break;
            case 6 :
                // Express.g:1:65: FUNCTION_ASIN
                {
                mFUNCTION_ASIN(); if (state.failed) return ;

                }
                break;
            case 7 :
                // Express.g:1:79: FUNCTION_ATAN
                {
                mFUNCTION_ATAN(); if (state.failed) return ;

                }
                break;
            case 8 :
                // Express.g:1:93: FUNCTION_BLENGTH
                {
                mFUNCTION_BLENGTH(); if (state.failed) return ;

                }
                break;
            case 9 :
                // Express.g:1:110: FUNCTION_COS
                {
                mFUNCTION_COS(); if (state.failed) return ;

                }
                break;
            case 10 :
                // Express.g:1:123: FUNCTION_EXISTS
                {
                mFUNCTION_EXISTS(); if (state.failed) return ;

                }
                break;
            case 11 :
                // Express.g:1:139: FUNCTION_EXP
                {
                mFUNCTION_EXP(); if (state.failed) return ;

                }
                break;
            case 12 :
                // Express.g:1:152: FUNCTION_FORMAT
                {
                mFUNCTION_FORMAT(); if (state.failed) return ;

                }
                break;
            case 13 :
                // Express.g:1:168: FUNCTION_HIBOUND
                {
                mFUNCTION_HIBOUND(); if (state.failed) return ;

                }
                break;
            case 14 :
                // Express.g:1:185: FUNCTION_HIINDEX
                {
                mFUNCTION_HIINDEX(); if (state.failed) return ;

                }
                break;
            case 15 :
                // Express.g:1:202: FUNCTION_LENGTH
                {
                mFUNCTION_LENGTH(); if (state.failed) return ;

                }
                break;
            case 16 :
                // Express.g:1:218: FUNCTION_LOBOUND
                {
                mFUNCTION_LOBOUND(); if (state.failed) return ;

                }
                break;
            case 17 :
                // Express.g:1:235: FUNCTION_LOINDEX
                {
                mFUNCTION_LOINDEX(); if (state.failed) return ;

                }
                break;
            case 18 :
                // Express.g:1:252: FUNCTION_LOG
                {
                mFUNCTION_LOG(); if (state.failed) return ;

                }
                break;
            case 19 :
                // Express.g:1:265: FUNCTION_LOG2
                {
                mFUNCTION_LOG2(); if (state.failed) return ;

                }
                break;
            case 20 :
                // Express.g:1:279: FUNCTION_LOG10
                {
                mFUNCTION_LOG10(); if (state.failed) return ;

                }
                break;
            case 21 :
                // Express.g:1:294: FUNCTION_NVL
                {
                mFUNCTION_NVL(); if (state.failed) return ;

                }
                break;
            case 22 :
                // Express.g:1:307: FUNCTION_ODD
                {
                mFUNCTION_ODD(); if (state.failed) return ;

                }
                break;
            case 23 :
                // Express.g:1:320: FUNCTION_ROLESOF
                {
                mFUNCTION_ROLESOF(); if (state.failed) return ;

                }
                break;
            case 24 :
                // Express.g:1:337: FUNCTION_SIN
                {
                mFUNCTION_SIN(); if (state.failed) return ;

                }
                break;
            case 25 :
                // Express.g:1:350: FUNCTION_SQRT
                {
                mFUNCTION_SQRT(); if (state.failed) return ;

                }
                break;
            case 26 :
                // Express.g:1:364: FUNCTION_TAN
                {
                mFUNCTION_TAN(); if (state.failed) return ;

                }
                break;
            case 27 :
                // Express.g:1:377: FUNCTION_TYPEOF
                {
                mFUNCTION_TYPEOF(); if (state.failed) return ;

                }
                break;
            case 28 :
                // Express.g:1:393: FUNCTION_USEDIN
                {
                mFUNCTION_USEDIN(); if (state.failed) return ;

                }
                break;
            case 29 :
                // Express.g:1:409: FUNCTION_VALUE
                {
                mFUNCTION_VALUE(); if (state.failed) return ;

                }
                break;
            case 30 :
                // Express.g:1:424: FUNCTION_VALUE_IN
                {
                mFUNCTION_VALUE_IN(); if (state.failed) return ;

                }
                break;
            case 31 :
                // Express.g:1:442: FUNCTION_VALUE_UNIQUE
                {
                mFUNCTION_VALUE_UNIQUE(); if (state.failed) return ;

                }
                break;
            case 32 :
                // Express.g:1:464: FUNCTION_SIZEOF
                {
                mFUNCTION_SIZEOF(); if (state.failed) return ;

                }
                break;
            case 33 :
                // Express.g:1:480: PROCEDURE_INSERT
                {
                mPROCEDURE_INSERT(); if (state.failed) return ;

                }
                break;
            case 34 :
                // Express.g:1:497: PROCEDURE_REMOVE
                {
                mPROCEDURE_REMOVE(); if (state.failed) return ;

                }
                break;
            case 35 :
                // Express.g:1:514: NOT
                {
                mNOT(); if (state.failed) return ;

                }
                break;
            case 36 :
                // Express.g:1:518: OR
                {
                mOR(); if (state.failed) return ;

                }
                break;
            case 37 :
                // Express.g:1:521: XOR
                {
                mXOR(); if (state.failed) return ;

                }
                break;
            case 38 :
                // Express.g:1:525: DIV
                {
                mDIV(); if (state.failed) return ;

                }
                break;
            case 39 :
                // Express.g:1:529: MOD
                {
                mMOD(); if (state.failed) return ;

                }
                break;
            case 40 :
                // Express.g:1:533: AND
                {
                mAND(); if (state.failed) return ;

                }
                break;
            case 41 :
                // Express.g:1:537: T__293
                {
                mT__293(); if (state.failed) return ;

                }
                break;
            case 42 :
                // Express.g:1:544: T__294
                {
                mT__294(); if (state.failed) return ;

                }
                break;
            case 43 :
                // Express.g:1:551: T__295
                {
                mT__295(); if (state.failed) return ;

                }
                break;
            case 44 :
                // Express.g:1:558: T__296
                {
                mT__296(); if (state.failed) return ;

                }
                break;
            case 45 :
                // Express.g:1:565: T__297
                {
                mT__297(); if (state.failed) return ;

                }
                break;
            case 46 :
                // Express.g:1:572: T__298
                {
                mT__298(); if (state.failed) return ;

                }
                break;
            case 47 :
                // Express.g:1:579: T__299
                {
                mT__299(); if (state.failed) return ;

                }
                break;
            case 48 :
                // Express.g:1:586: T__300
                {
                mT__300(); if (state.failed) return ;

                }
                break;
            case 49 :
                // Express.g:1:593: T__301
                {
                mT__301(); if (state.failed) return ;

                }
                break;
            case 50 :
                // Express.g:1:600: T__302
                {
                mT__302(); if (state.failed) return ;

                }
                break;
            case 51 :
                // Express.g:1:607: T__303
                {
                mT__303(); if (state.failed) return ;

                }
                break;
            case 52 :
                // Express.g:1:614: T__304
                {
                mT__304(); if (state.failed) return ;

                }
                break;
            case 53 :
                // Express.g:1:621: T__305
                {
                mT__305(); if (state.failed) return ;

                }
                break;
            case 54 :
                // Express.g:1:628: T__306
                {
                mT__306(); if (state.failed) return ;

                }
                break;
            case 55 :
                // Express.g:1:635: T__307
                {
                mT__307(); if (state.failed) return ;

                }
                break;
            case 56 :
                // Express.g:1:642: T__308
                {
                mT__308(); if (state.failed) return ;

                }
                break;
            case 57 :
                // Express.g:1:649: T__309
                {
                mT__309(); if (state.failed) return ;

                }
                break;
            case 58 :
                // Express.g:1:656: T__310
                {
                mT__310(); if (state.failed) return ;

                }
                break;
            case 59 :
                // Express.g:1:663: T__311
                {
                mT__311(); if (state.failed) return ;

                }
                break;
            case 60 :
                // Express.g:1:670: T__312
                {
                mT__312(); if (state.failed) return ;

                }
                break;
            case 61 :
                // Express.g:1:677: T__313
                {
                mT__313(); if (state.failed) return ;

                }
                break;
            case 62 :
                // Express.g:1:684: T__314
                {
                mT__314(); if (state.failed) return ;

                }
                break;
            case 63 :
                // Express.g:1:691: T__315
                {
                mT__315(); if (state.failed) return ;

                }
                break;
            case 64 :
                // Express.g:1:698: T__316
                {
                mT__316(); if (state.failed) return ;

                }
                break;
            case 65 :
                // Express.g:1:705: T__317
                {
                mT__317(); if (state.failed) return ;

                }
                break;
            case 66 :
                // Express.g:1:712: T__318
                {
                mT__318(); if (state.failed) return ;

                }
                break;
            case 67 :
                // Express.g:1:719: T__319
                {
                mT__319(); if (state.failed) return ;

                }
                break;
            case 68 :
                // Express.g:1:726: T__320
                {
                mT__320(); if (state.failed) return ;

                }
                break;
            case 69 :
                // Express.g:1:733: T__321
                {
                mT__321(); if (state.failed) return ;

                }
                break;
            case 70 :
                // Express.g:1:740: T__322
                {
                mT__322(); if (state.failed) return ;

                }
                break;
            case 71 :
                // Express.g:1:747: T__323
                {
                mT__323(); if (state.failed) return ;

                }
                break;
            case 72 :
                // Express.g:1:754: T__324
                {
                mT__324(); if (state.failed) return ;

                }
                break;
            case 73 :
                // Express.g:1:761: T__325
                {
                mT__325(); if (state.failed) return ;

                }
                break;
            case 74 :
                // Express.g:1:768: T__326
                {
                mT__326(); if (state.failed) return ;

                }
                break;
            case 75 :
                // Express.g:1:775: T__327
                {
                mT__327(); if (state.failed) return ;

                }
                break;
            case 76 :
                // Express.g:1:782: T__328
                {
                mT__328(); if (state.failed) return ;

                }
                break;
            case 77 :
                // Express.g:1:789: T__329
                {
                mT__329(); if (state.failed) return ;

                }
                break;
            case 78 :
                // Express.g:1:796: T__330
                {
                mT__330(); if (state.failed) return ;

                }
                break;
            case 79 :
                // Express.g:1:803: T__331
                {
                mT__331(); if (state.failed) return ;

                }
                break;
            case 80 :
                // Express.g:1:810: T__332
                {
                mT__332(); if (state.failed) return ;

                }
                break;
            case 81 :
                // Express.g:1:817: T__333
                {
                mT__333(); if (state.failed) return ;

                }
                break;
            case 82 :
                // Express.g:1:824: T__334
                {
                mT__334(); if (state.failed) return ;

                }
                break;
            case 83 :
                // Express.g:1:831: T__335
                {
                mT__335(); if (state.failed) return ;

                }
                break;
            case 84 :
                // Express.g:1:838: T__336
                {
                mT__336(); if (state.failed) return ;

                }
                break;
            case 85 :
                // Express.g:1:845: T__337
                {
                mT__337(); if (state.failed) return ;

                }
                break;
            case 86 :
                // Express.g:1:852: T__338
                {
                mT__338(); if (state.failed) return ;

                }
                break;
            case 87 :
                // Express.g:1:859: T__339
                {
                mT__339(); if (state.failed) return ;

                }
                break;
            case 88 :
                // Express.g:1:866: T__340
                {
                mT__340(); if (state.failed) return ;

                }
                break;
            case 89 :
                // Express.g:1:873: T__341
                {
                mT__341(); if (state.failed) return ;

                }
                break;
            case 90 :
                // Express.g:1:880: T__342
                {
                mT__342(); if (state.failed) return ;

                }
                break;
            case 91 :
                // Express.g:1:887: T__343
                {
                mT__343(); if (state.failed) return ;

                }
                break;
            case 92 :
                // Express.g:1:894: T__344
                {
                mT__344(); if (state.failed) return ;

                }
                break;
            case 93 :
                // Express.g:1:901: T__345
                {
                mT__345(); if (state.failed) return ;

                }
                break;
            case 94 :
                // Express.g:1:908: T__346
                {
                mT__346(); if (state.failed) return ;

                }
                break;
            case 95 :
                // Express.g:1:915: T__347
                {
                mT__347(); if (state.failed) return ;

                }
                break;
            case 96 :
                // Express.g:1:922: T__348
                {
                mT__348(); if (state.failed) return ;

                }
                break;
            case 97 :
                // Express.g:1:929: T__349
                {
                mT__349(); if (state.failed) return ;

                }
                break;
            case 98 :
                // Express.g:1:936: T__350
                {
                mT__350(); if (state.failed) return ;

                }
                break;
            case 99 :
                // Express.g:1:943: T__351
                {
                mT__351(); if (state.failed) return ;

                }
                break;
            case 100 :
                // Express.g:1:950: T__352
                {
                mT__352(); if (state.failed) return ;

                }
                break;
            case 101 :
                // Express.g:1:957: T__353
                {
                mT__353(); if (state.failed) return ;

                }
                break;
            case 102 :
                // Express.g:1:964: T__354
                {
                mT__354(); if (state.failed) return ;

                }
                break;
            case 103 :
                // Express.g:1:971: T__355
                {
                mT__355(); if (state.failed) return ;

                }
                break;
            case 104 :
                // Express.g:1:978: T__356
                {
                mT__356(); if (state.failed) return ;

                }
                break;
            case 105 :
                // Express.g:1:985: T__357
                {
                mT__357(); if (state.failed) return ;

                }
                break;
            case 106 :
                // Express.g:1:992: T__358
                {
                mT__358(); if (state.failed) return ;

                }
                break;
            case 107 :
                // Express.g:1:999: T__359
                {
                mT__359(); if (state.failed) return ;

                }
                break;
            case 108 :
                // Express.g:1:1006: T__360
                {
                mT__360(); if (state.failed) return ;

                }
                break;
            case 109 :
                // Express.g:1:1013: T__361
                {
                mT__361(); if (state.failed) return ;

                }
                break;
            case 110 :
                // Express.g:1:1020: T__362
                {
                mT__362(); if (state.failed) return ;

                }
                break;
            case 111 :
                // Express.g:1:1027: T__363
                {
                mT__363(); if (state.failed) return ;

                }
                break;
            case 112 :
                // Express.g:1:1034: T__364
                {
                mT__364(); if (state.failed) return ;

                }
                break;
            case 113 :
                // Express.g:1:1041: T__365
                {
                mT__365(); if (state.failed) return ;

                }
                break;
            case 114 :
                // Express.g:1:1048: T__366
                {
                mT__366(); if (state.failed) return ;

                }
                break;
            case 115 :
                // Express.g:1:1055: T__367
                {
                mT__367(); if (state.failed) return ;

                }
                break;
            case 116 :
                // Express.g:1:1062: T__368
                {
                mT__368(); if (state.failed) return ;

                }
                break;
            case 117 :
                // Express.g:1:1069: T__369
                {
                mT__369(); if (state.failed) return ;

                }
                break;
            case 118 :
                // Express.g:1:1076: T__370
                {
                mT__370(); if (state.failed) return ;

                }
                break;
            case 119 :
                // Express.g:1:1083: T__371
                {
                mT__371(); if (state.failed) return ;

                }
                break;
            case 120 :
                // Express.g:1:1090: T__372
                {
                mT__372(); if (state.failed) return ;

                }
                break;
            case 121 :
                // Express.g:1:1097: T__373
                {
                mT__373(); if (state.failed) return ;

                }
                break;
            case 122 :
                // Express.g:1:1104: T__374
                {
                mT__374(); if (state.failed) return ;

                }
                break;
            case 123 :
                // Express.g:1:1111: QUERY
                {
                mQUERY(); if (state.failed) return ;

                }
                break;
            case 124 :
                // Express.g:1:1117: COMMENT
                {
                mCOMMENT(); if (state.failed) return ;

                }
                break;
            case 125 :
                // Express.g:1:1125: LINECOMMENT
                {
                mLINECOMMENT(); if (state.failed) return ;

                }
                break;
            case 126 :
                // Express.g:1:1137: LANG_VERSION
                {
                mLANG_VERSION(); if (state.failed) return ;

                }
                break;
            case 127 :
                // Express.g:1:1150: SEMI
                {
                mSEMI(); if (state.failed) return ;

                }
                break;
            case 128 :
                // Express.g:1:1155: QUESTION
                {
                mQUESTION(); if (state.failed) return ;

                }
                break;
            case 129 :
                // Express.g:1:1164: LPAREN
                {
                mLPAREN(); if (state.failed) return ;

                }
                break;
            case 130 :
                // Express.g:1:1171: RPAREN
                {
                mRPAREN(); if (state.failed) return ;

                }
                break;
            case 131 :
                // Express.g:1:1178: LBRACK
                {
                mLBRACK(); if (state.failed) return ;

                }
                break;
            case 132 :
                // Express.g:1:1185: RBRACK
                {
                mRBRACK(); if (state.failed) return ;

                }
                break;
            case 133 :
                // Express.g:1:1192: LCURLY
                {
                mLCURLY(); if (state.failed) return ;

                }
                break;
            case 134 :
                // Express.g:1:1199: RCURLY
                {
                mRCURLY(); if (state.failed) return ;

                }
                break;
            case 135 :
                // Express.g:1:1206: BACKSLASH
                {
                mBACKSLASH(); if (state.failed) return ;

                }
                break;
            case 136 :
                // Express.g:1:1216: BAR
                {
                mBAR(); if (state.failed) return ;

                }
                break;
            case 137 :
                // Express.g:1:1220: AMPERSAND
                {
                mAMPERSAND(); if (state.failed) return ;

                }
                break;
            case 138 :
                // Express.g:1:1230: COLON
                {
                mCOLON(); if (state.failed) return ;

                }
                break;
            case 139 :
                // Express.g:1:1236: COLEQ
                {
                mCOLEQ(); if (state.failed) return ;

                }
                break;
            case 140 :
                // Express.g:1:1242: COLEQCOL
                {
                mCOLEQCOL(); if (state.failed) return ;

                }
                break;
            case 141 :
                // Express.g:1:1251: COLLTGT
                {
                mCOLLTGT(); if (state.failed) return ;

                }
                break;
            case 142 :
                // Express.g:1:1259: COMMA
                {
                mCOMMA(); if (state.failed) return ;

                }
                break;
            case 143 :
                // Express.g:1:1265: DOT
                {
                mDOT(); if (state.failed) return ;

                }
                break;
            case 144 :
                // Express.g:1:1269: ASSIGN
                {
                mASSIGN(); if (state.failed) return ;

                }
                break;
            case 145 :
                // Express.g:1:1276: LT
                {
                mLT(); if (state.failed) return ;

                }
                break;
            case 146 :
                // Express.g:1:1279: GT
                {
                mGT(); if (state.failed) return ;

                }
                break;
            case 147 :
                // Express.g:1:1282: LE
                {
                mLE(); if (state.failed) return ;

                }
                break;
            case 148 :
                // Express.g:1:1285: GE
                {
                mGE(); if (state.failed) return ;

                }
                break;
            case 149 :
                // Express.g:1:1288: DIVSIGN
                {
                mDIVSIGN(); if (state.failed) return ;

                }
                break;
            case 150 :
                // Express.g:1:1296: PLUS
                {
                mPLUS(); if (state.failed) return ;

                }
                break;
            case 151 :
                // Express.g:1:1301: MINUS
                {
                mMINUS(); if (state.failed) return ;

                }
                break;
            case 152 :
                // Express.g:1:1307: STAR
                {
                mSTAR(); if (state.failed) return ;

                }
                break;
            case 153 :
                // Express.g:1:1312: AT
                {
                mAT(); if (state.failed) return ;

                }
                break;
            case 154 :
                // Express.g:1:1315: WS
                {
                mWS(); if (state.failed) return ;

                }
                break;
            case 155 :
                // Express.g:1:1318: LTSTAR
                {
                mLTSTAR(); if (state.failed) return ;

                }
                break;
            case 156 :
                // Express.g:1:1325: LTGT
                {
                mLTGT(); if (state.failed) return ;

                }
                break;
            case 157 :
                // Express.g:1:1330: DOUBLESTAR
                {
                mDOUBLESTAR(); if (state.failed) return ;

                }
                break;
            case 158 :
                // Express.g:1:1341: DOUBLEBAR
                {
                mDOUBLEBAR(); if (state.failed) return ;

                }
                break;
            case 159 :
                // Express.g:1:1351: STRING
                {
                mSTRING(); if (state.failed) return ;

                }
                break;
            case 160 :
                // Express.g:1:1358: INT
                {
                mINT(); if (state.failed) return ;

                }
                break;
            case 161 :
                // Express.g:1:1362: FLOAT
                {
                mFLOAT(); if (state.failed) return ;

                }
                break;
            case 162 :
                // Express.g:1:1368: IDENT
                {
                mIDENT(); if (state.failed) return ;

                }
                break;

        }

    }

    // $ANTLR start synpred1_Express
    public final void synpred1_Express_fragment() throws RecognitionException {   
        // Express.g:1600:5: ( ( '\\r' )? '\\n' )
        // Express.g:1600:6: ( '\\r' )? '\\n'
        {
        // Express.g:1600:6: ( '\\r' )?
        int alt14=2;
        int LA14_0 = input.LA(1);

        if ( (LA14_0=='\r') ) {
            alt14=1;
        }
        switch (alt14) {
            case 1 :
                // Express.g:1600:6: '\\r'
                {
                match('\r'); if (state.failed) return ;

                }
                break;

        }

        match('\n'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_Express

    // $ANTLR start synpred2_Express
    public final void synpred2_Express_fragment() throws RecognitionException {   
        // Express.g:1796:6: ( ( '\\r' )? '\\n' )
        // Express.g:1796:7: ( '\\r' )? '\\n'
        {
        // Express.g:1796:7: ( '\\r' )?
        int alt15=2;
        int LA15_0 = input.LA(1);

        if ( (LA15_0=='\r') ) {
            alt15=1;
        }
        switch (alt15) {
            case 1 :
                // Express.g:1796:7: '\\r'
                {
                match('\r'); if (state.failed) return ;

                }
                break;

        }

        match('\n'); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_Express

    public final boolean synpred1_Express() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Express_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_Express() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Express_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA13 dfa13 = new DFA13(this);
    static final String DFA13_eotS =
        "\1\uffff\26\60\1\167\1\171\10\uffff\1\173\1\uffff\1\176\3\uffff"+
        "\1\u0082\1\u0084\2\uffff\1\u0086\3\uffff\1\u0087\1\uffff\2\60\1"+
        "\u008c\12\60\1\u009b\12\60\1\u00a7\21\60\1\u00c2\1\u00c3\10\60\1"+
        "\u00d2\5\60\1\u00de\1\u00df\11\60\6\uffff\1\u00eb\14\uffff\1\60"+
        "\1\u00ed\1\60\1\uffff\2\60\1\u00f2\1\u00f3\7\60\1\u00fc\2\60\1\uffff"+
        "\1\60\1\u0101\4\60\1\u0106\4\60\1\uffff\1\60\1\u010c\1\60\1\u010f"+
        "\4\60\1\u0115\11\60\1\u0122\3\60\1\u0126\1\u0127\1\60\1\u0129\2"+
        "\uffff\13\60\1\u0135\2\60\1\uffff\2\60\1\u013b\4\60\1\u0140\3\60"+
        "\2\uffff\1\60\1\u0145\1\u0146\1\60\1\u0148\5\60\2\uffff\1\60\1\uffff"+
        "\1\u014f\1\60\1\u0151\1\60\2\uffff\1\60\1\u0154\3\60\1\u0158\2\60"+
        "\1\uffff\1\u015b\1\u015c\1\u015d\1\60\1\uffff\4\60\1\uffff\5\60"+
        "\1\uffff\2\60\1\uffff\3\60\1\u0176\1\60\1\uffff\2\60\1\u017a\6\60"+
        "\1\u0181\2\60\1\uffff\1\60\1\u0185\1\u0186\2\uffff\1\60\1\uffff"+
        "\6\60\1\u018e\3\60\1\u0192\1\uffff\1\u0194\1\60\1\u0196\1\u0197"+
        "\1\60\1\uffff\4\60\1\uffff\3\60\3\uffff\1\60\1\uffff\1\60\1\u01a2"+
        "\4\60\1\uffff\1\60\1\uffff\2\60\1\uffff\3\60\1\uffff\2\60\3\uffff"+
        "\1\u01b0\1\60\1\u01b2\1\u01b3\4\60\1\u01b8\17\60\1\uffff\2\60\1"+
        "\u01cd\1\uffff\1\u01ce\5\60\1\uffff\1\u01d4\1\60\1\u01d6\2\uffff"+
        "\3\60\1\u01da\3\60\1\uffff\3\60\1\uffff\1\60\1\uffff\1\60\2\uffff"+
        "\3\60\1\u01e6\1\u01e8\5\60\1\uffff\1\u01ee\1\u01ef\1\u01f0\3\60"+
        "\1\u01f4\1\u01f5\2\60\1\u01f8\1\u01f9\1\60\1\uffff\1\60\2\uffff"+
        "\2\60\1\u01fe\1\60\1\uffff\1\u0200\10\60\1\u0209\5\60\1\u020f\1"+
        "\60\1\u0211\1\u0212\1\60\2\uffff\2\60\1\u0216\2\60\1\uffff\1\60"+
        "\1\uffff\1\u021a\2\60\1\uffff\1\60\1\u021e\2\60\1\u0221\1\u0222"+
        "\1\u0223\1\60\1\u0225\1\u0226\1\60\1\uffff\1\60\1\uffff\1\u022a"+
        "\2\60\1\u022d\1\60\3\uffff\1\u022f\2\60\2\uffff\1\60\1\u0234\2\uffff"+
        "\2\60\1\u0237\1\60\1\uffff\1\u0239\1\uffff\10\60\1\uffff\5\60\1"+
        "\uffff\1\60\2\uffff\1\60\1\u0249\1\u024a\1\uffff\1\u024b\1\u024c"+
        "\1\u024d\1\uffff\2\60\1\u0250\1\uffff\1\u0251\1\60\3\uffff\1\60"+
        "\2\uffff\1\u0254\2\60\1\uffff\1\u0257\1\u0258\1\uffff\1\u025a\1"+
        "\uffff\1\u025b\3\60\1\uffff\1\u025f\1\60\1\uffff\1\u0261\1\uffff"+
        "\2\60\1\u0264\10\60\1\u026d\1\u026e\1\60\1\u0270\5\uffff\1\u0271"+
        "\1\60\2\uffff\2\60\1\uffff\1\u0275\1\60\2\uffff\1\60\2\uffff\1\u0278"+
        "\1\u0279\1\60\1\uffff\1\u027b\1\uffff\1\60\1\u027d\1\uffff\5\60"+
        "\1\u0283\2\60\2\uffff\1\60\2\uffff\1\u0287\1\u0288\1\60\1\uffff"+
        "\2\60\2\uffff\1\60\1\uffff\1\u028d\1\uffff\1\60\1\u028f\1\60\1\u0291"+
        "\1\60\1\uffff\1\60\1\u0294\1\60\2\uffff\1\u0296\3\60\1\uffff\1\60"+
        "\1\uffff\1\60\1\uffff\2\60\1\uffff\1\u029e\1\uffff\3\60\1\u02a2"+
        "\1\60\1\u02a4\1\60\1\uffff\1\u02a6\2\60\1\uffff\1\60\1\uffff\1\u02aa"+
        "\1\uffff\3\60\1\uffff\1\u02ae\2\60\1\uffff\4\60\1\u02b5\1\60\1\uffff"+
        "\3\60\1\u02ba\1\uffff";
    static final String DFA13_eofS =
        "\u02bb\uffff";
    static final String DFA13_minS =
        "\1\11\1\141\1\151\1\143\1\142\1\141\1\154\1\141\1\151\1\145\1\157"+
        "\1\144\1\145\1\141\1\156\1\141\1\146\1\157\1\145\1\157\1\145\1\150"+
        "\1\165\1\52\1\55\10\uffff\1\174\1\uffff\1\74\3\uffff\1\52\1\75\2"+
        "\uffff\1\52\3\uffff\1\56\1\uffff\1\156\1\163\1\60\1\157\1\154\1"+
        "\156\1\162\1\142\1\150\1\151\1\162\1\163\1\157\1\60\1\141\1\144"+
        "\1\147\1\151\1\162\1\145\1\147\1\156\1\157\1\147\1\60\1\151\1\144"+
        "\1\143\1\163\1\162\1\156\1\154\1\157\1\170\1\142\1\156\1\142\1\153"+
        "\1\154\1\164\1\155\1\144\2\60\1\164\1\150\1\145\1\154\1\141\1\154"+
        "\1\156\1\160\1\60\1\145\1\165\1\145\1\151\1\154\2\60\1\157\1\162"+
        "\1\166\1\162\1\144\1\156\1\164\2\145\6\uffff\1\72\14\uffff\1\163"+
        "\1\60\1\145\1\uffff\1\143\1\145\2\60\1\145\1\164\1\145\1\164\1\145"+
        "\1\160\1\151\1\60\1\163\1\156\1\uffff\1\156\1\60\1\162\2\141\1\156"+
        "\1\60\1\145\1\141\1\154\1\151\1\uffff\1\163\1\60\1\145\1\60\1\151"+
        "\1\155\1\141\1\145\1\60\1\143\1\163\1\155\1\145\1\157\1\156\1\147"+
        "\1\157\1\156\1\60\1\141\1\164\1\145\2\60\1\142\1\60\2\uffff\1\151"+
        "\1\145\1\157\1\145\1\157\1\141\1\154\2\145\1\165\1\145\1\60\1\145"+
        "\1\141\1\uffff\1\156\1\145\1\60\1\161\1\156\1\151\1\165\1\60\3\145"+
        "\2\uffff\1\40\2\60\1\151\1\60\1\145\1\150\1\162\1\154\1\162\2\uffff"+
        "\1\164\1\uffff\1\60\1\145\1\60\1\143\2\uffff\1\157\1\60\1\162\1"+
        "\171\1\155\1\60\1\156\1\162\1\uffff\3\60\1\162\1\uffff\1\145\1\163"+
        "\1\171\1\147\1\uffff\1\144\1\162\1\145\1\156\1\164\1\uffff\1\156"+
        "\1\141\1\uffff\1\164\1\145\1\160\1\60\1\141\1\uffff\1\164\1\145"+
        "\1\60\1\144\1\165\1\144\1\164\1\165\1\144\2\60\1\143\1\uffff\1\154"+
        "\2\60\2\uffff\1\145\1\uffff\1\157\1\162\1\146\1\163\1\166\1\155"+
        "\1\60\1\162\1\141\1\162\1\60\1\uffff\1\60\1\154\2\60\1\151\1\uffff"+
        "\1\165\1\157\1\154\1\145\1\uffff\2\162\1\147\3\uffff\1\166\1\uffff"+
        "\1\162\1\60\2\145\1\171\1\137\1\uffff\1\144\1\uffff\1\164\1\146"+
        "\1\uffff\1\164\1\160\1\141\1\uffff\1\147\1\141\3\uffff\1\60\1\147"+
        "\2\60\1\164\1\137\1\171\1\141\1\60\2\163\1\154\1\141\1\156\1\143"+
        "\1\165\1\146\1\157\1\162\1\145\2\171\1\162\1\145\1\uffff\1\164\1"+
        "\151\1\60\1\uffff\1\60\1\156\1\145\1\150\1\156\1\145\1\uffff\1\60"+
        "\1\141\1\60\2\uffff\1\162\1\156\1\167\1\60\1\157\2\145\1\uffff\1"+
        "\145\1\164\1\156\1\uffff\1\146\1\uffff\1\137\2\uffff\1\156\1\145"+
        "\1\167\2\60\1\164\1\163\2\145\1\151\1\uffff\3\60\1\145\1\156\1\165"+
        "\2\60\1\171\1\145\2\60\1\143\1\uffff\1\141\2\uffff\1\150\1\157\1"+
        "\60\1\156\1\uffff\1\60\2\151\1\163\1\156\1\164\1\142\1\150\1\156"+
        "\1\60\1\143\1\157\1\160\1\154\1\160\1\60\1\141\2\60\1\157\2\uffff"+
        "\1\144\1\170\1\60\1\144\1\170\1\uffff\1\154\1\uffff\1\60\1\141\1"+
        "\151\1\uffff\1\146\1\60\1\144\1\156\3\60\1\157\2\60\1\156\1\uffff"+
        "\1\151\1\uffff\1\60\1\145\1\162\1\60\1\143\3\uffff\1\60\1\164\1"+
        "\162\2\uffff\1\160\1\60\2\uffff\2\164\1\60\1\156\1\uffff\1\60\1"+
        "\uffff\1\142\1\141\1\145\1\163\1\151\1\164\1\145\1\143\1\uffff\1"+
        "\141\1\143\3\145\1\uffff\1\164\2\uffff\1\156\2\60\1\uffff\3\60\1"+
        "\uffff\1\154\1\163\1\60\1\uffff\1\60\1\143\3\uffff\1\166\2\uffff"+
        "\1\60\2\156\1\uffff\2\60\1\uffff\1\60\1\uffff\1\60\2\145\1\143\1"+
        "\uffff\1\60\1\145\1\uffff\1\60\1\uffff\1\154\1\163\1\60\2\164\1"+
        "\171\1\155\1\164\1\154\1\145\1\141\2\60\1\151\1\60\5\uffff\1\60"+
        "\1\145\2\uffff\2\145\1\uffff\1\60\1\151\2\uffff\1\145\2\uffff\2"+
        "\60\1\157\1\uffff\1\60\1\uffff\1\145\1\60\1\uffff\1\141\1\171\1"+
        "\160\1\141\1\151\1\60\1\144\1\164\2\uffff\1\157\2\uffff\2\60\1\162"+
        "\1\uffff\1\161\1\156\2\uffff\1\156\1\uffff\1\60\1\uffff\1\156\1"+
        "\60\1\145\1\60\1\157\1\uffff\1\165\1\60\1\156\2\uffff\1\60\1\165"+
        "\1\164\1\163\1\uffff\1\164\1\uffff\1\137\1\uffff\1\156\1\162\1\uffff"+
        "\1\60\1\uffff\1\145\1\151\1\164\1\60\1\143\1\60\1\145\1\uffff\1"+
        "\60\1\164\1\162\1\uffff\1\157\1\uffff\1\60\1\uffff\1\171\1\141\1"+
        "\156\1\uffff\1\60\1\151\1\163\1\uffff\1\156\2\164\1\162\1\60\1\141"+
        "\1\uffff\1\151\1\156\1\164\1\60\1\uffff";
    static final String DFA13_maxS =
        "\1\175\1\157\1\162\1\165\1\164\1\171\1\170\1\165\1\151\1\157\1\166"+
        "\1\164\1\165\1\171\1\163\1\141\1\163\1\157\1\151\1\157\1\145\1\151"+
        "\1\165\1\52\1\55\10\uffff\1\174\1\uffff\1\75\3\uffff\1\76\1\75\2"+
        "\uffff\1\52\3\uffff\1\71\1\uffff\2\163\1\172\1\157\1\164\1\172\1"+
        "\162\1\160\1\150\1\151\1\162\1\163\1\157\1\172\1\141\1\144\1\147"+
        "\1\151\1\162\1\145\1\163\1\156\1\157\1\147\1\172\1\164\1\165\1\143"+
        "\1\163\1\162\1\156\1\154\1\157\1\170\1\151\1\156\1\151\1\163\1\154"+
        "\1\164\1\155\1\144\2\172\1\164\1\150\1\145\1\154\1\164\1\154\1\156"+
        "\1\160\1\172\1\145\1\165\1\145\1\164\1\162\2\172\1\157\1\162\1\166"+
        "\1\162\1\144\1\156\1\164\1\151\1\145\6\uffff\1\72\14\uffff\1\163"+
        "\1\172\1\145\1\uffff\1\143\1\146\2\172\1\145\1\164\1\145\1\164\1"+
        "\145\1\160\1\151\1\172\1\163\1\156\1\uffff\1\156\1\172\1\162\2\141"+
        "\1\156\1\172\1\145\1\141\1\154\1\151\1\uffff\1\163\1\172\1\145\1"+
        "\172\1\151\1\155\1\141\1\145\1\172\1\143\1\163\1\155\1\145\1\157"+
        "\1\156\1\147\1\157\1\156\1\172\1\141\1\164\1\145\2\172\1\142\1\172"+
        "\2\uffff\1\151\1\145\1\157\1\145\1\157\1\141\1\154\2\145\1\165\1"+
        "\145\1\172\1\145\1\141\1\uffff\1\156\1\145\1\172\1\161\1\156\1\151"+
        "\1\165\1\172\3\145\2\uffff\1\40\2\172\1\151\1\172\1\145\1\150\1"+
        "\162\1\154\1\162\2\uffff\1\164\1\uffff\1\172\1\145\1\172\1\143\2"+
        "\uffff\1\157\1\172\1\162\1\171\1\155\1\172\1\156\1\162\1\uffff\3"+
        "\172\1\162\1\uffff\1\145\1\163\1\171\1\147\1\uffff\1\144\1\162\1"+
        "\145\1\156\1\164\1\uffff\1\156\1\164\1\uffff\1\164\1\145\1\160\1"+
        "\172\1\141\1\uffff\1\164\1\145\1\172\1\144\1\165\1\144\1\164\1\165"+
        "\1\144\1\172\1\60\1\143\1\uffff\1\154\2\172\2\uffff\1\145\1\uffff"+
        "\1\157\1\162\1\146\1\163\1\166\1\155\1\172\1\162\1\141\1\162\1\172"+
        "\1\uffff\1\172\1\154\2\172\1\151\1\uffff\1\165\1\157\1\154\1\145"+
        "\1\uffff\2\162\1\147\3\uffff\1\166\1\uffff\1\162\1\172\2\145\1\171"+
        "\1\141\1\uffff\1\144\1\uffff\1\164\1\146\1\uffff\1\164\1\160\1\141"+
        "\1\uffff\1\147\1\141\3\uffff\1\172\1\147\2\172\1\164\1\137\1\171"+
        "\1\141\1\172\2\163\1\154\1\157\1\156\2\165\1\146\1\157\1\162\1\165"+
        "\2\171\1\162\1\145\1\uffff\1\164\1\151\1\172\1\uffff\1\172\1\156"+
        "\1\145\1\150\1\156\1\145\1\uffff\1\172\1\141\1\172\2\uffff\1\162"+
        "\1\156\1\167\1\172\1\157\2\145\1\uffff\1\145\1\164\1\156\1\uffff"+
        "\1\146\1\uffff\1\137\2\uffff\1\156\1\145\1\167\2\172\1\164\1\163"+
        "\2\145\1\151\1\uffff\3\172\1\145\1\156\1\165\2\172\1\171\1\145\2"+
        "\172\1\143\1\uffff\1\141\2\uffff\1\150\1\157\1\172\1\156\1\uffff"+
        "\1\172\2\151\1\163\1\156\1\164\1\142\1\150\1\156\1\172\1\143\1\157"+
        "\1\160\1\154\1\160\1\172\1\141\2\172\1\157\2\uffff\1\144\1\170\1"+
        "\172\1\144\1\170\1\uffff\1\154\1\uffff\1\172\1\141\1\151\1\uffff"+
        "\1\146\1\172\1\144\1\156\3\172\1\157\2\172\1\156\1\uffff\1\165\1"+
        "\uffff\1\172\1\145\1\162\1\172\1\143\3\uffff\1\172\1\164\1\162\2"+
        "\uffff\1\160\1\172\2\uffff\2\164\1\172\1\156\1\uffff\1\172\1\uffff"+
        "\1\142\1\141\1\145\1\163\1\151\1\164\1\145\1\143\1\uffff\1\141\1"+
        "\143\3\145\1\uffff\1\164\2\uffff\1\156\2\172\1\uffff\3\172\1\uffff"+
        "\1\154\1\163\1\172\1\uffff\1\172\1\143\3\uffff\1\166\2\uffff\1\172"+
        "\2\156\1\uffff\2\172\1\uffff\1\172\1\uffff\1\172\2\145\1\143\1\uffff"+
        "\1\172\1\145\1\uffff\1\172\1\uffff\1\154\1\163\1\172\2\164\1\171"+
        "\1\155\1\164\1\154\1\145\1\141\2\172\1\151\1\172\5\uffff\1\172\1"+
        "\145\2\uffff\2\145\1\uffff\1\172\1\151\2\uffff\1\145\2\uffff\2\172"+
        "\1\157\1\uffff\1\172\1\uffff\1\145\1\172\1\uffff\1\141\1\171\1\160"+
        "\1\141\1\151\1\172\1\144\1\164\2\uffff\1\157\2\uffff\2\172\1\162"+
        "\1\uffff\1\161\1\156\2\uffff\1\156\1\uffff\1\172\1\uffff\1\156\1"+
        "\172\1\145\1\172\1\157\1\uffff\1\165\1\172\1\156\2\uffff\1\172\1"+
        "\165\1\164\1\163\1\uffff\1\164\1\uffff\1\137\1\uffff\1\156\1\162"+
        "\1\uffff\1\172\1\uffff\1\145\1\151\1\164\1\172\1\143\1\172\1\145"+
        "\1\uffff\1\172\1\164\1\162\1\uffff\1\157\1\uffff\1\172\1\uffff\1"+
        "\171\1\141\1\156\1\uffff\1\172\1\151\1\163\1\uffff\1\156\2\164\1"+
        "\162\1\172\1\141\1\uffff\1\151\1\156\1\164\1\172\1\uffff";
    static final String DFA13_acceptS =
        "\31\uffff\1\177\1\u0080\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086"+
        "\1\u0087\1\uffff\1\u0089\1\uffff\1\u008e\1\u008f\1\u0090\2\uffff"+
        "\1\u0095\1\u0096\1\uffff\1\u0099\1\u009a\1\u009f\1\uffff\1\u00a2"+
        "\105\uffff\1\174\1\u0081\1\175\1\u0097\1\u009e\1\u0088\1\uffff\1"+
        "\u008d\1\u008a\1\u0093\1\u009b\1\u009c\1\u0091\1\u0094\1\u0092\1"+
        "\u009d\1\u0098\1\u00a0\1\u00a1\3\uffff\1\2\16\uffff\1\146\13\uffff"+
        "\1\122\32\uffff\1\44\1\52\16\uffff\1\121\13\uffff\1\142\1\115\12"+
        "\uffff\1\u008c\1\u008b\1\uffff\1\11\4\uffff\1\106\1\30\10\uffff"+
        "\1\4\4\uffff\1\50\4\uffff\1\61\5\uffff\1\13\2\uffff\1\70\5\uffff"+
        "\1\54\14\uffff\1\22\3\uffff\1\25\1\43\1\uffff\1\26\13\uffff\1\32"+
        "\5\uffff\1\154\4\uffff\1\136\3\uffff\1\176\1\45\1\46\1\uffff\1\47"+
        "\6\uffff\1\64\1\uffff\1\3\2\uffff\1\31\3\uffff\1\155\2\uffff\1\5"+
        "\1\6\1\7\30\uffff\1\120\3\uffff\1\141\6\uffff\1\23\3\uffff\1\112"+
        "\1\143\7\uffff\1\137\3\uffff\1\151\1\uffff\1\160\1\uffff\1\116\1"+
        "\127\12\uffff\1\165\15\uffff\1\157\1\uffff\1\53\1\56\4\uffff\1\67"+
        "\24\uffff\1\126\1\172\5\uffff\1\24\1\uffff\1\124\3\uffff\1\133\13"+
        "\uffff\1\167\1\uffff\1\35\5\uffff\1\170\1\171\1\173\3\uffff\1\166"+
        "\1\40\2\uffff\1\152\1\156\4\uffff\1\62\1\uffff\1\12\10\uffff\1\117"+
        "\5\uffff\1\73\1\uffff\1\107\1\14\3\uffff\1\17\3\uffff\1\132\3\uffff"+
        "\1\42\2\uffff\1\144\1\147\1\33\1\uffff\1\34\1\60\3\uffff\1\41\2"+
        "\uffff\1\104\1\uffff\1\1\4\uffff\1\77\2\uffff\1\10\1\uffff\1\63"+
        "\17\uffff\1\15\1\16\1\20\1\21\1\131\2\uffff\1\27\1\103\2\uffff\1"+
        "\130\2\uffff\1\105\1\123\1\uffff\1\113\1\71\3\uffff\1\74\1\uffff"+
        "\1\164\2\uffff\1\66\10\uffff\1\150\1\161\1\uffff\1\111\1\57\3\uffff"+
        "\1\36\2\uffff\1\135\1\76\1\uffff\1\51\1\uffff\1\55\5\uffff\1\125"+
        "\3\uffff\1\65\1\140\4\uffff\1\162\1\uffff\1\75\1\uffff\1\153\2\uffff"+
        "\1\145\1\uffff\1\102\7\uffff\1\163\3\uffff\1\72\1\uffff\1\110\1"+
        "\uffff\1\37\3\uffff\1\134\3\uffff\1\114\6\uffff\1\101\4\uffff\1"+
        "\100";
    static final String DFA13_specialS =
        "\u02bb\uffff}>";
    static final String[] DFA13_transitionS = {
            "\2\55\1\uffff\2\55\22\uffff\1\55\5\uffff\1\42\1\56\1\27\1\33"+
            "\1\53\1\52\1\44\1\30\1\45\1\51\12\57\1\43\1\31\1\47\1\46\1\50"+
            "\1\32\1\54\32\60\1\34\1\40\1\35\1\uffff\1\60\1\uffff\1\4\1\5"+
            "\1\1\1\22\1\6\1\7\1\24\1\10\1\20\2\60\1\11\1\23\1\12\1\13\1"+
            "\2\1\26\1\14\1\3\1\15\1\16\1\17\1\25\1\21\2\60\1\36\1\41\1\37",
            "\1\62\15\uffff\1\61",
            "\1\63\10\uffff\1\64",
            "\1\71\1\uffff\1\65\3\uffff\1\66\1\uffff\1\72\5\uffff\1\67\2"+
            "\uffff\1\73\1\70",
            "\1\74\1\75\3\uffff\1\101\4\uffff\1\102\1\uffff\1\100\3\uffff"+
            "\1\103\1\76\1\77",
            "\1\105\3\uffff\1\110\3\uffff\1\106\2\uffff\1\104\2\uffff\1"+
            "\107\11\uffff\1\111",
            "\1\115\1\uffff\1\113\4\uffff\1\114\4\uffff\1\112",
            "\1\120\7\uffff\1\122\5\uffff\1\116\2\uffff\1\121\2\uffff\1"+
            "\117",
            "\1\123",
            "\1\124\3\uffff\1\126\5\uffff\1\125",
            "\1\130\5\uffff\1\131\1\127",
            "\1\132\1\uffff\1\134\7\uffff\1\137\1\uffff\1\135\1\uffff\1"+
            "\133\1\uffff\1\136",
            "\1\141\11\uffff\1\140\5\uffff\1\142",
            "\1\143\6\uffff\1\146\6\uffff\1\145\2\uffff\1\147\6\uffff\1"+
            "\144",
            "\1\151\4\uffff\1\150",
            "\1\152",
            "\1\154\7\uffff\1\153\4\uffff\1\155",
            "\1\156",
            "\1\160\3\uffff\1\157",
            "\1\161",
            "\1\162",
            "\1\164\1\163",
            "\1\165",
            "\1\166",
            "\1\170",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\172",
            "",
            "\1\175\1\174",
            "",
            "",
            "",
            "\1\u0080\22\uffff\1\177\1\u0081",
            "\1\u0083",
            "",
            "",
            "\1\u0085",
            "",
            "",
            "",
            "\1\u0088\1\uffff\12\57",
            "",
            "\1\u0089\4\uffff\1\u008a",
            "\1\u008b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u008d",
            "\1\u008e\7\uffff\1\u008f",
            "\1\u0090\13\uffff\1\u0091",
            "\1\u0092",
            "\1\u0094\15\uffff\1\u0093",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\10\60\1\u009a\21"+
            "\60",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2\13\uffff\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00a8\6\uffff\1\u00a9\3\uffff\1\u00aa",
            "\1\u00ab\17\uffff\1\u00ac\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5\6\uffff\1\u00b6",
            "\1\u00b7",
            "\1\u00b8\1\u00bb\3\uffff\1\u00ba\1\uffff\1\u00b9",
            "\1\u00bd\7\uffff\1\u00bc",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00ca\4\uffff\1\u00cb\6\uffff\1\u00c8\1\u00c9\1\uffff\1"+
            "\u00cc\3\uffff\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00d1\6\60",
            "\1\u00d3",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6\1\uffff\1\u00d7\10\uffff\1\u00d8",
            "\1\u00d9\5\uffff\1\u00da",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\22\60\1\u00db\1\u00dd"+
            "\1\60\1\u00dc\4\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7\3\uffff\1\u00e8",
            "\1\u00e9",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ea",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00ec",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00ee",
            "",
            "\1\u00ef",
            "\1\u00f1\1\u00f0",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\23\60\1\u00fb\6\60",
            "\1\u00fd",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0100\13"+
            "\60",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "\1\u0105",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\1\u010a",
            "",
            "\1\u010b",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u010d",
            "\12\60\7\uffff\32\60\4\uffff\1\u010e\1\uffff\32\60",
            "\1\u0110",
            "\1\u0111",
            "\1\u0112",
            "\1\u0113",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\14\60\1\u0114\15"+
            "\60",
            "\1\u0116",
            "\1\u0117",
            "\1\u0118",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e",
            "\1\60\1\u0120\1\u011f\7\60\7\uffff\32\60\4\uffff\1\60\1\uffff"+
            "\10\60\1\u0121\21\60",
            "\1\u0123",
            "\1\u0124",
            "\1\u0125",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0128",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u012a",
            "\1\u012b",
            "\1\u012c",
            "\1\u012d",
            "\1\u012e",
            "\1\u012f",
            "\1\u0130",
            "\1\u0131",
            "\1\u0132",
            "\1\u0133",
            "\1\u0134",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0136",
            "\1\u0137",
            "",
            "\1\u0138",
            "\1\u0139",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\3\60\1\u013a\26\60",
            "\1\u013c",
            "\1\u013d",
            "\1\u013e",
            "\1\u013f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0141",
            "\1\u0142",
            "\1\u0143",
            "",
            "",
            "\1\u0144",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0147",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0149",
            "\1\u014a",
            "\1\u014b",
            "\1\u014c",
            "\1\u014d",
            "",
            "",
            "\1\u014e",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0150",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0152",
            "",
            "",
            "\1\u0153",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0155",
            "\1\u0156",
            "\1\u0157",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0159",
            "\1\u015a",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u015e",
            "",
            "\1\u015f",
            "\1\u0160",
            "\1\u0161",
            "\1\u0162",
            "",
            "\1\u0163",
            "\1\u0164",
            "\1\u0165",
            "\1\u0166",
            "\1\u0167",
            "",
            "\1\u0168",
            "\1\u0169\1\uffff\1\u016a\1\uffff\1\u016b\1\u016d\2\uffff\1"+
            "\u016e\2\uffff\1\u016f\3\uffff\1\u0170\1\uffff\1\u0171\1\u016c"+
            "\1\u0172",
            "",
            "\1\u0173",
            "\1\u0174",
            "\1\u0175",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0177",
            "",
            "\1\u0178",
            "\1\u0179",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u017b",
            "\1\u017c",
            "\1\u017d",
            "\1\u017e",
            "\1\u017f",
            "\1\u0180",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0182",
            "\1\u0183",
            "",
            "\1\u0184",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u0187",
            "",
            "\1\u0188",
            "\1\u0189",
            "\1\u018a",
            "\1\u018b",
            "\1\u018c",
            "\1\u018d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\16\60\1\u0193\13"+
            "\60",
            "\1\u0195",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0198",
            "",
            "\1\u0199",
            "\1\u019a",
            "\1\u019b",
            "\1\u019c",
            "",
            "\1\u019d",
            "\1\u019e",
            "\1\u019f",
            "",
            "",
            "",
            "\1\u01a0",
            "",
            "\1\u01a1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5",
            "\1\u01a6\1\uffff\1\u01a7",
            "",
            "\1\u01a8",
            "",
            "\1\u01a9",
            "\1\u01aa",
            "",
            "\1\u01ab",
            "\1\u01ac",
            "\1\u01ad",
            "",
            "\1\u01ae",
            "\1\u01af",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01b1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01b4",
            "\1\u01b5",
            "\1\u01b6",
            "\1\u01b7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01b9",
            "\1\u01ba",
            "\1\u01bb",
            "\1\u01bc\15\uffff\1\u01bd",
            "\1\u01be",
            "\1\u01c0\21\uffff\1\u01bf",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "\1\u01c5\17\uffff\1\u01c6",
            "\1\u01c7",
            "\1\u01c8",
            "\1\u01c9",
            "\1\u01ca",
            "",
            "\1\u01cb",
            "\1\u01cc",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01cf",
            "\1\u01d0",
            "\1\u01d1",
            "\1\u01d2",
            "\1\u01d3",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01d5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "\1\u01d7",
            "\1\u01d8",
            "\1\u01d9",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "",
            "\1\u01e1",
            "",
            "\1\u01e2",
            "",
            "",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\u01e7\1\uffff\32\60",
            "\1\u01e9",
            "\1\u01ea",
            "\1\u01eb",
            "\1\u01ec",
            "\1\u01ed",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01f6",
            "\1\u01f7",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01fa",
            "",
            "\1\u01fb",
            "",
            "",
            "\1\u01fc",
            "\1\u01fd",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u01ff",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0201",
            "\1\u0202",
            "\1\u0203",
            "\1\u0204",
            "\1\u0205",
            "\1\u0206",
            "\1\u0207",
            "\1\u0208",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u020a",
            "\1\u020b",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0210",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0213",
            "",
            "",
            "\1\u0214",
            "\1\u0215",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0217",
            "\1\u0218",
            "",
            "\1\u0219",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u021b",
            "\1\u021c",
            "",
            "\1\u021d",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u021f",
            "\1\u0220",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0224",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0227",
            "",
            "\1\u0228\13\uffff\1\u0229",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u022b",
            "\1\u022c",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u022e",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0230",
            "\1\u0231",
            "",
            "",
            "\1\u0232",
            "\12\60\7\uffff\32\60\4\uffff\1\u0233\1\uffff\32\60",
            "",
            "",
            "\1\u0235",
            "\1\u0236",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0238",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u023a",
            "\1\u023b",
            "\1\u023c",
            "\1\u023d",
            "\1\u023e",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "",
            "\1\u0247",
            "",
            "",
            "\1\u0248",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u024e",
            "\1\u024f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0252",
            "",
            "",
            "",
            "\1\u0253",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0255",
            "\1\u0256",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\u0259\1\uffff\32\60",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0260",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u0262",
            "\1\u0263",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0265",
            "\1\u0266",
            "\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\1\u026b",
            "\1\u026c",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u026f",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "",
            "",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0272",
            "",
            "",
            "\1\u0273",
            "\1\u0274",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0276",
            "",
            "",
            "\1\u0277",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u027a",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u027c",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u027e",
            "\1\u027f",
            "\1\u0280",
            "\1\u0281",
            "\1\u0282",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0284",
            "\1\u0285",
            "",
            "",
            "\1\u0286",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0289",
            "",
            "\1\u028a",
            "\1\u028b",
            "",
            "",
            "\1\u028c",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u028e",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0290",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0292",
            "",
            "\1\u0293",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0295",
            "",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u0297",
            "\1\u0298",
            "\1\u0299",
            "",
            "\1\u029a",
            "",
            "\1\u029b",
            "",
            "\1\u029c",
            "\1\u029d",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a1",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u02a3",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u02a5",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u02a7",
            "\1\u02a8",
            "",
            "\1\u02a9",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u02af",
            "\1\u02b0",
            "",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3",
            "\1\u02b4",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            "\1\u02b6",
            "",
            "\1\u02b7",
            "\1\u02b8",
            "\1\u02b9",
            "\12\60\7\uffff\32\60\4\uffff\1\60\1\uffff\32\60",
            ""
    };

    static final short[] DFA13_eot = DFA.unpackEncodedString(DFA13_eotS);
    static final short[] DFA13_eof = DFA.unpackEncodedString(DFA13_eofS);
    static final char[] DFA13_min = DFA.unpackEncodedStringToUnsignedChars(DFA13_minS);
    static final char[] DFA13_max = DFA.unpackEncodedStringToUnsignedChars(DFA13_maxS);
    static final short[] DFA13_accept = DFA.unpackEncodedString(DFA13_acceptS);
    static final short[] DFA13_special = DFA.unpackEncodedString(DFA13_specialS);
    static final short[][] DFA13_transition;

    static {
        int numStates = DFA13_transitionS.length;
        DFA13_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA13_transition[i] = DFA.unpackEncodedString(DFA13_transitionS[i]);
        }
    }

    class DFA13 extends DFA {

        public DFA13(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 13;
            this.eot = DFA13_eot;
            this.eof = DFA13_eof;
            this.min = DFA13_min;
            this.max = DFA13_max;
            this.accept = DFA13_accept;
            this.special = DFA13_special;
            this.transition = DFA13_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( CONST_E | CONST_PI | CONST_SELF | FUNCTION_ABS | FUNCTION_ACOS | FUNCTION_ASIN | FUNCTION_ATAN | FUNCTION_BLENGTH | FUNCTION_COS | FUNCTION_EXISTS | FUNCTION_EXP | FUNCTION_FORMAT | FUNCTION_HIBOUND | FUNCTION_HIINDEX | FUNCTION_LENGTH | FUNCTION_LOBOUND | FUNCTION_LOINDEX | FUNCTION_LOG | FUNCTION_LOG2 | FUNCTION_LOG10 | FUNCTION_NVL | FUNCTION_ODD | FUNCTION_ROLESOF | FUNCTION_SIN | FUNCTION_SQRT | FUNCTION_TAN | FUNCTION_TYPEOF | FUNCTION_USEDIN | FUNCTION_VALUE | FUNCTION_VALUE_IN | FUNCTION_VALUE_UNIQUE | FUNCTION_SIZEOF | PROCEDURE_INSERT | PROCEDURE_REMOVE | NOT | OR | XOR | DIV | MOD | AND | T__293 | T__294 | T__295 | T__296 | T__297 | T__298 | T__299 | T__300 | T__301 | T__302 | T__303 | T__304 | T__305 | T__306 | T__307 | T__308 | T__309 | T__310 | T__311 | T__312 | T__313 | T__314 | T__315 | T__316 | T__317 | T__318 | T__319 | T__320 | T__321 | T__322 | T__323 | T__324 | T__325 | T__326 | T__327 | T__328 | T__329 | T__330 | T__331 | T__332 | T__333 | T__334 | T__335 | T__336 | T__337 | T__338 | T__339 | T__340 | T__341 | T__342 | T__343 | T__344 | T__345 | T__346 | T__347 | T__348 | T__349 | T__350 | T__351 | T__352 | T__353 | T__354 | T__355 | T__356 | T__357 | T__358 | T__359 | T__360 | T__361 | T__362 | T__363 | T__364 | T__365 | T__366 | T__367 | T__368 | T__369 | T__370 | T__371 | T__372 | T__373 | T__374 | QUERY | COMMENT | LINECOMMENT | LANG_VERSION | SEMI | QUESTION | LPAREN | RPAREN | LBRACK | RBRACK | LCURLY | RCURLY | BACKSLASH | BAR | AMPERSAND | COLON | COLEQ | COLEQCOL | COLLTGT | COMMA | DOT | ASSIGN | LT | GT | LE | GE | DIVSIGN | PLUS | MINUS | STAR | AT | WS | LTSTAR | LTGT | DOUBLESTAR | DOUBLEBAR | STRING | INT | FLOAT | IDENT );";
        }
    }
 

}
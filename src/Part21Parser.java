// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 Part21.g 2022-05-29 16:40:24


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class Part21Parser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "EXCHANGE_FILE", "KEYWORD", "USER_DEFINED_STANDARD", "PARAMETER_LIST", "PARAMETER", "ENUMERATION", "HEADER_ENTITY", "HEADER_SECTION", "TYPED_PARAMETER", "UNTYPED_PARAMETER", "NULL_VALUE", "OMITTED_PARAMETER", "LIST", "DATA_SECTION", "ENTITY_INSTANCE_LIST", "ENTITY_INSTANCE", "SIMPLE_ENTITY_INSTANCE", "COMPLEX_ENTITY_INSTANCE", "SIMPLE_RECORD", "SUBSUPER_RECORD", "SIMPLE_RECORD_LIST", "REVERSE_SOLIDUS", "APOSTROPHE", "FILE_DESCRIPTION", "DESCRIPTION", "NAME", "FILE_NAME", "IMPLEMENTATION_LEVEL", "TIME_STAMP", "AUTHOR", "ORGANIZATION", "PREPROCESSOR_VERSION", "ORIGINATING_SYSTEM", "AUTHORIZATION", "FILE_SCHEMA", "SCHEMA_IDENTIFIERS", "FILE_POPULATION", "GOVERNING_SCHEMA", "DETERMINATION_METHOD", "GOVERNED_SECTIONS", "SECTION_LANGUAGE", "SECTION", "DEFAULT_LANGUAGE", "CONTEXT_IDENTIFIERS", "STANDARD_KEYWORD", "STRING", "INTEGER", "REAL", "ENTITY_INSTANCE_NAME", "BINARY", "DIGIT", "HEX", "SIGN", "COMMENT", "UPPER", "SPECIAL", "WS", "LOWER", "'ISO-10303-21;'", "'END-ISO-10303-21;'", "'!'", "'.'", "'HEADER;'", "'ENDSEC;'", "'FILE_DESCRIPTION'", "'('", "','", "')'", "';'", "'FILE_NAME'", "'FILE_SCHEMA'", "'FILE_POPULATION'", "'SECTION_LANGUAGE'", "'SECTION_CONTEXT'", "'DATA'", "'='"
    };
    public static final int APOSTROPHE=26;
    public static final int KEYWORD=5;
    public static final int ENUMERATION=9;
    public static final int FILE_DESCRIPTION=27;
    public static final int TIME_STAMP=32;
    public static final int STANDARD_KEYWORD=48;
    public static final int FILE_NAME=30;
    public static final int SPECIAL=59;
    public static final int COMPLEX_ENTITY_INSTANCE=21;
    public static final int DEFAULT_LANGUAGE=46;
    public static final int SIGN=56;
    public static final int HEADER_SECTION=11;
    public static final int SCHEMA_IDENTIFIERS=39;
    public static final int PARAMETER=8;
    public static final int INTEGER=50;
    public static final int REVERSE_SOLIDUS=25;
    public static final int USER_DEFINED_STANDARD=6;
    public static final int FILE_SCHEMA=38;
    public static final int GOVERNING_SCHEMA=41;
    public static final int NAME=29;
    public static final int SUBSUPER_RECORD=23;
    public static final int DATA_SECTION=17;
    public static final int PREPROCESSOR_VERSION=35;
    public static final int LOWER=61;
    public static final int T__66=66;
    public static final int REAL=51;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int GOVERNED_SECTIONS=43;
    public static final int T__63=63;
    public static final int LIST=16;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int FILE_POPULATION=40;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int PARAMETER_LIST=7;
    public static final int UNTYPED_PARAMETER=13;
    public static final int BINARY=53;
    public static final int AUTHOR=33;
    public static final int EXCHANGE_FILE=4;
    public static final int ENTITY_INSTANCE_LIST=18;
    public static final int OMITTED_PARAMETER=15;
    public static final int COMMENT=57;
    public static final int TYPED_PARAMETER=12;
    public static final int ORGANIZATION=34;
    public static final int DETERMINATION_METHOD=42;
    public static final int UPPER=58;
    public static final int HEADER_ENTITY=10;
    public static final int SIMPLE_ENTITY_INSTANCE=20;
    public static final int SIMPLE_RECORD=22;
    public static final int DESCRIPTION=28;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int NULL_VALUE=14;
    public static final int T__73=73;
    public static final int WS=60;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int ENTITY_INSTANCE=19;
    public static final int SIMPLE_RECORD_LIST=24;
    public static final int IMPLEMENTATION_LEVEL=31;
    public static final int SECTION_LANGUAGE=44;
    public static final int ORIGINATING_SYSTEM=36;
    public static final int DIGIT=54;
    public static final int STRING=49;
    public static final int ENTITY_INSTANCE_NAME=52;
    public static final int HEX=55;
    public static final int CONTEXT_IDENTIFIERS=47;
    public static final int AUTHORIZATION=37;
    public static final int SECTION=45;

    // delegates
    // delegators


        public Part21Parser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public Part21Parser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return Part21Parser.tokenNames; }
    public String getGrammarFileName() { return "Part21.g"; }


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



    public static class exchange_file_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "exchange_file"
    // Part21.g:85:1: exchange_file : 'ISO-10303-21;' header_section ( data_section )+ 'END-ISO-10303-21;' -> ^( EXCHANGE_FILE header_section ( data_section )+ ) ;
    public final exchange_file_return exchange_file() throws RecognitionException {
        exchange_file_return retval = new exchange_file_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal1=null;
        Token string_literal4=null;
        header_section_return header_section2 = null;

        data_section_return data_section3 = null;


        Object string_literal1_tree=null;
        Object string_literal4_tree=null;
        RewriteRuleTokenStream stream_62=new RewriteRuleTokenStream(adaptor,"token 62");
        RewriteRuleTokenStream stream_63=new RewriteRuleTokenStream(adaptor,"token 63");
        RewriteRuleSubtreeStream stream_header_section=new RewriteRuleSubtreeStream(adaptor,"rule header_section");
        RewriteRuleSubtreeStream stream_data_section=new RewriteRuleSubtreeStream(adaptor,"rule data_section");
        try {
            // Part21.g:85:15: ( 'ISO-10303-21;' header_section ( data_section )+ 'END-ISO-10303-21;' -> ^( EXCHANGE_FILE header_section ( data_section )+ ) )
            // Part21.g:86:3: 'ISO-10303-21;' header_section ( data_section )+ 'END-ISO-10303-21;'
            {
            string_literal1=(Token)match(input,62,FOLLOW_62_in_exchange_file201);  
            stream_62.add(string_literal1);

            pushFollow(FOLLOW_header_section_in_exchange_file203);
            header_section2=header_section();

            state._fsp--;

            stream_header_section.add(header_section2.getTree());
            // Part21.g:86:34: ( data_section )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==78) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Part21.g:86:34: data_section
            	    {
            	    pushFollow(FOLLOW_data_section_in_exchange_file205);
            	    data_section3=data_section();

            	    state._fsp--;

            	    stream_data_section.add(data_section3.getTree());

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

            string_literal4=(Token)match(input,63,FOLLOW_63_in_exchange_file208);  
            stream_63.add(string_literal4);



            // AST REWRITE
            // elements: header_section, data_section
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 87:2: -> ^( EXCHANGE_FILE header_section ( data_section )+ )
            {
                // Part21.g:87:5: ^( EXCHANGE_FILE header_section ( data_section )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(EXCHANGE_FILE, "EXCHANGE_FILE"), root_1);

                adaptor.addChild(root_1, stream_header_section.nextTree());
                if ( !(stream_data_section.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_data_section.hasNext() ) {
                    adaptor.addChild(root_1, stream_data_section.nextTree());

                }
                stream_data_section.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "exchange_file"

    public static class keyword_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "keyword"
    // Part21.g:90:1: keyword : ( user_defined_keyword | STANDARD_KEYWORD ) -> ^( KEYWORD ( user_defined_keyword )? ( STANDARD_KEYWORD )? ) ;
    public final keyword_return keyword() throws RecognitionException {
        keyword_return retval = new keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STANDARD_KEYWORD6=null;
        user_defined_keyword_return user_defined_keyword5 = null;


        Object STANDARD_KEYWORD6_tree=null;
        RewriteRuleTokenStream stream_STANDARD_KEYWORD=new RewriteRuleTokenStream(adaptor,"token STANDARD_KEYWORD");
        RewriteRuleSubtreeStream stream_user_defined_keyword=new RewriteRuleSubtreeStream(adaptor,"rule user_defined_keyword");
        try {
            // Part21.g:90:9: ( ( user_defined_keyword | STANDARD_KEYWORD ) -> ^( KEYWORD ( user_defined_keyword )? ( STANDARD_KEYWORD )? ) )
            // Part21.g:90:11: ( user_defined_keyword | STANDARD_KEYWORD )
            {
            // Part21.g:90:11: ( user_defined_keyword | STANDARD_KEYWORD )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==64) ) {
                alt2=1;
            }
            else if ( (LA2_0==STANDARD_KEYWORD) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // Part21.g:90:12: user_defined_keyword
                    {
                    pushFollow(FOLLOW_user_defined_keyword_in_keyword233);
                    user_defined_keyword5=user_defined_keyword();

                    state._fsp--;

                    stream_user_defined_keyword.add(user_defined_keyword5.getTree());

                    }
                    break;
                case 2 :
                    // Part21.g:90:35: STANDARD_KEYWORD
                    {
                    STANDARD_KEYWORD6=(Token)match(input,STANDARD_KEYWORD,FOLLOW_STANDARD_KEYWORD_in_keyword237);  
                    stream_STANDARD_KEYWORD.add(STANDARD_KEYWORD6);


                    }
                    break;

            }



            // AST REWRITE
            // elements: user_defined_keyword, STANDARD_KEYWORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:1: -> ^( KEYWORD ( user_defined_keyword )? ( STANDARD_KEYWORD )? )
            {
                // Part21.g:91:4: ^( KEYWORD ( user_defined_keyword )? ( STANDARD_KEYWORD )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(KEYWORD, "KEYWORD"), root_1);

                // Part21.g:91:14: ( user_defined_keyword )?
                if ( stream_user_defined_keyword.hasNext() ) {
                    adaptor.addChild(root_1, stream_user_defined_keyword.nextTree());

                }
                stream_user_defined_keyword.reset();
                // Part21.g:91:36: ( STANDARD_KEYWORD )?
                if ( stream_STANDARD_KEYWORD.hasNext() ) {
                    adaptor.addChild(root_1, stream_STANDARD_KEYWORD.nextNode());

                }
                stream_STANDARD_KEYWORD.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "keyword"

    public static class user_defined_keyword_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "user_defined_keyword"
    // Part21.g:94:1: user_defined_keyword : '!' STANDARD_KEYWORD -> ^( USER_DEFINED_STANDARD STANDARD_KEYWORD ) ;
    public final user_defined_keyword_return user_defined_keyword() throws RecognitionException {
        user_defined_keyword_return retval = new user_defined_keyword_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal7=null;
        Token STANDARD_KEYWORD8=null;

        Object char_literal7_tree=null;
        Object STANDARD_KEYWORD8_tree=null;
        RewriteRuleTokenStream stream_STANDARD_KEYWORD=new RewriteRuleTokenStream(adaptor,"token STANDARD_KEYWORD");
        RewriteRuleTokenStream stream_64=new RewriteRuleTokenStream(adaptor,"token 64");

        try {
            // Part21.g:94:22: ( '!' STANDARD_KEYWORD -> ^( USER_DEFINED_STANDARD STANDARD_KEYWORD ) )
            // Part21.g:94:24: '!' STANDARD_KEYWORD
            {
            char_literal7=(Token)match(input,64,FOLLOW_64_in_user_defined_keyword260);  
            stream_64.add(char_literal7);

            STANDARD_KEYWORD8=(Token)match(input,STANDARD_KEYWORD,FOLLOW_STANDARD_KEYWORD_in_user_defined_keyword262);  
            stream_STANDARD_KEYWORD.add(STANDARD_KEYWORD8);



            // AST REWRITE
            // elements: STANDARD_KEYWORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 95:1: -> ^( USER_DEFINED_STANDARD STANDARD_KEYWORD )
            {
                // Part21.g:95:4: ^( USER_DEFINED_STANDARD STANDARD_KEYWORD )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(USER_DEFINED_STANDARD, "USER_DEFINED_STANDARD"), root_1);

                adaptor.addChild(root_1, stream_STANDARD_KEYWORD.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "user_defined_keyword"

    public static class enumeration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumeration"
    // Part21.g:98:1: enumeration : '.' STANDARD_KEYWORD '.' -> ^( ENUMERATION STANDARD_KEYWORD ) ;
    public final enumeration_return enumeration() throws RecognitionException {
        enumeration_return retval = new enumeration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal9=null;
        Token STANDARD_KEYWORD10=null;
        Token char_literal11=null;

        Object char_literal9_tree=null;
        Object STANDARD_KEYWORD10_tree=null;
        Object char_literal11_tree=null;
        RewriteRuleTokenStream stream_STANDARD_KEYWORD=new RewriteRuleTokenStream(adaptor,"token STANDARD_KEYWORD");
        RewriteRuleTokenStream stream_65=new RewriteRuleTokenStream(adaptor,"token 65");

        try {
            // Part21.g:98:13: ( '.' STANDARD_KEYWORD '.' -> ^( ENUMERATION STANDARD_KEYWORD ) )
            // Part21.g:98:15: '.' STANDARD_KEYWORD '.'
            {
            char_literal9=(Token)match(input,65,FOLLOW_65_in_enumeration280);  
            stream_65.add(char_literal9);

            STANDARD_KEYWORD10=(Token)match(input,STANDARD_KEYWORD,FOLLOW_STANDARD_KEYWORD_in_enumeration282);  
            stream_STANDARD_KEYWORD.add(STANDARD_KEYWORD10);

            char_literal11=(Token)match(input,65,FOLLOW_65_in_enumeration284);  
            stream_65.add(char_literal11);



            // AST REWRITE
            // elements: STANDARD_KEYWORD
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 99:1: -> ^( ENUMERATION STANDARD_KEYWORD )
            {
                // Part21.g:99:4: ^( ENUMERATION STANDARD_KEYWORD )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENUMERATION, "ENUMERATION"), root_1);

                adaptor.addChild(root_1, stream_STANDARD_KEYWORD.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enumeration"

    public static class header_section_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "header_section"
    // Part21.g:102:1: header_section : 'HEADER;' file_description file_name file_schema ( file_population )? ( section_language )? ( section_context )? 'ENDSEC;' -> ^( HEADER_SECTION file_description file_name file_schema ( file_population )? ( section_language )? ( section_context )? ) ;
    public final header_section_return header_section() throws RecognitionException {
        header_section_return retval = new header_section_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal12=null;
        Token string_literal19=null;
        file_description_return file_description13 = null;

        file_name_return file_name14 = null;

        file_schema_return file_schema15 = null;

        file_population_return file_population16 = null;

        section_language_return section_language17 = null;

        section_context_return section_context18 = null;


        Object string_literal12_tree=null;
        Object string_literal19_tree=null;
        RewriteRuleTokenStream stream_66=new RewriteRuleTokenStream(adaptor,"token 66");
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleSubtreeStream stream_file_schema=new RewriteRuleSubtreeStream(adaptor,"rule file_schema");
        RewriteRuleSubtreeStream stream_file_population=new RewriteRuleSubtreeStream(adaptor,"rule file_population");
        RewriteRuleSubtreeStream stream_file_name=new RewriteRuleSubtreeStream(adaptor,"rule file_name");
        RewriteRuleSubtreeStream stream_file_description=new RewriteRuleSubtreeStream(adaptor,"rule file_description");
        RewriteRuleSubtreeStream stream_section_language=new RewriteRuleSubtreeStream(adaptor,"rule section_language");
        RewriteRuleSubtreeStream stream_section_context=new RewriteRuleSubtreeStream(adaptor,"rule section_context");
        try {
            // Part21.g:102:16: ( 'HEADER;' file_description file_name file_schema ( file_population )? ( section_language )? ( section_context )? 'ENDSEC;' -> ^( HEADER_SECTION file_description file_name file_schema ( file_population )? ( section_language )? ( section_context )? ) )
            // Part21.g:102:18: 'HEADER;' file_description file_name file_schema ( file_population )? ( section_language )? ( section_context )? 'ENDSEC;'
            {
            string_literal12=(Token)match(input,66,FOLLOW_66_in_header_section302);  
            stream_66.add(string_literal12);

            pushFollow(FOLLOW_file_description_in_header_section304);
            file_description13=file_description();

            state._fsp--;

            stream_file_description.add(file_description13.getTree());
            pushFollow(FOLLOW_file_name_in_header_section306);
            file_name14=file_name();

            state._fsp--;

            stream_file_name.add(file_name14.getTree());
            pushFollow(FOLLOW_file_schema_in_header_section308);
            file_schema15=file_schema();

            state._fsp--;

            stream_file_schema.add(file_schema15.getTree());
            // Part21.g:102:67: ( file_population )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==75) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Part21.g:102:67: file_population
                    {
                    pushFollow(FOLLOW_file_population_in_header_section310);
                    file_population16=file_population();

                    state._fsp--;

                    stream_file_population.add(file_population16.getTree());

                    }
                    break;

            }

            // Part21.g:102:84: ( section_language )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==76) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // Part21.g:102:84: section_language
                    {
                    pushFollow(FOLLOW_section_language_in_header_section313);
                    section_language17=section_language();

                    state._fsp--;

                    stream_section_language.add(section_language17.getTree());

                    }
                    break;

            }

            // Part21.g:102:102: ( section_context )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==77) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // Part21.g:102:102: section_context
                    {
                    pushFollow(FOLLOW_section_context_in_header_section316);
                    section_context18=section_context();

                    state._fsp--;

                    stream_section_context.add(section_context18.getTree());

                    }
                    break;

            }

            string_literal19=(Token)match(input,67,FOLLOW_67_in_header_section320);  
            stream_67.add(string_literal19);



            // AST REWRITE
            // elements: file_population, file_schema, section_context, file_name, section_language, file_description
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 103:2: -> ^( HEADER_SECTION file_description file_name file_schema ( file_population )? ( section_language )? ( section_context )? )
            {
                // Part21.g:103:5: ^( HEADER_SECTION file_description file_name file_schema ( file_population )? ( section_language )? ( section_context )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HEADER_SECTION, "HEADER_SECTION"), root_1);

                adaptor.addChild(root_1, stream_file_description.nextTree());
                adaptor.addChild(root_1, stream_file_name.nextTree());
                adaptor.addChild(root_1, stream_file_schema.nextTree());
                // Part21.g:103:61: ( file_population )?
                if ( stream_file_population.hasNext() ) {
                    adaptor.addChild(root_1, stream_file_population.nextTree());

                }
                stream_file_population.reset();
                // Part21.g:103:78: ( section_language )?
                if ( stream_section_language.hasNext() ) {
                    adaptor.addChild(root_1, stream_section_language.nextTree());

                }
                stream_section_language.reset();
                // Part21.g:103:96: ( section_context )?
                if ( stream_section_context.hasNext() ) {
                    adaptor.addChild(root_1, stream_section_context.nextTree());

                }
                stream_section_context.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "header_section"

    public static class file_description_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_description"
    // Part21.g:105:1: file_description : 'FILE_DESCRIPTION' '(' description ',' implementation_level ')' ';' -> ^( FILE_DESCRIPTION description implementation_level ) ;
    public final file_description_return file_description() throws RecognitionException {
        file_description_return retval = new file_description_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal20=null;
        Token char_literal21=null;
        Token char_literal23=null;
        Token char_literal25=null;
        Token char_literal26=null;
        description_return description22 = null;

        implementation_level_return implementation_level24 = null;


        Object string_literal20_tree=null;
        Object char_literal21_tree=null;
        Object char_literal23_tree=null;
        Object char_literal25_tree=null;
        Object char_literal26_tree=null;
        RewriteRuleTokenStream stream_68=new RewriteRuleTokenStream(adaptor,"token 68");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_description=new RewriteRuleSubtreeStream(adaptor,"rule description");
        RewriteRuleSubtreeStream stream_implementation_level=new RewriteRuleSubtreeStream(adaptor,"rule implementation_level");
        try {
            // Part21.g:106:2: ( 'FILE_DESCRIPTION' '(' description ',' implementation_level ')' ';' -> ^( FILE_DESCRIPTION description implementation_level ) )
            // Part21.g:106:4: 'FILE_DESCRIPTION' '(' description ',' implementation_level ')' ';'
            {
            string_literal20=(Token)match(input,68,FOLLOW_68_in_file_description352);  
            stream_68.add(string_literal20);

            char_literal21=(Token)match(input,69,FOLLOW_69_in_file_description354);  
            stream_69.add(char_literal21);

            pushFollow(FOLLOW_description_in_file_description356);
            description22=description();

            state._fsp--;

            stream_description.add(description22.getTree());
            char_literal23=(Token)match(input,70,FOLLOW_70_in_file_description358);  
            stream_70.add(char_literal23);

            pushFollow(FOLLOW_implementation_level_in_file_description360);
            implementation_level24=implementation_level();

            state._fsp--;

            stream_implementation_level.add(implementation_level24.getTree());
            char_literal25=(Token)match(input,71,FOLLOW_71_in_file_description362);  
            stream_71.add(char_literal25);

            char_literal26=(Token)match(input,72,FOLLOW_72_in_file_description364);  
            stream_72.add(char_literal26);



            // AST REWRITE
            // elements: description, implementation_level
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 107:2: -> ^( FILE_DESCRIPTION description implementation_level )
            {
                // Part21.g:107:5: ^( FILE_DESCRIPTION description implementation_level )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FILE_DESCRIPTION, "FILE_DESCRIPTION"), root_1);

                adaptor.addChild(root_1, stream_description.nextTree());
                adaptor.addChild(root_1, stream_implementation_level.nextTree());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "file_description"

    public static class description_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "description"
    // Part21.g:110:1: description : '(' STRING ( ',' STRING )* ')' -> ^( DESCRIPTION ( STRING )+ ) ;
    public final description_return description() throws RecognitionException {
        description_return retval = new description_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal27=null;
        Token STRING28=null;
        Token char_literal29=null;
        Token STRING30=null;
        Token char_literal31=null;

        Object char_literal27_tree=null;
        Object STRING28_tree=null;
        Object char_literal29_tree=null;
        Object STRING30_tree=null;
        Object char_literal31_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // Part21.g:111:2: ( '(' STRING ( ',' STRING )* ')' -> ^( DESCRIPTION ( STRING )+ ) )
            // Part21.g:111:4: '(' STRING ( ',' STRING )* ')'
            {
            char_literal27=(Token)match(input,69,FOLLOW_69_in_description386);  
            stream_69.add(char_literal27);

            STRING28=(Token)match(input,STRING,FOLLOW_STRING_in_description388);  
            stream_STRING.add(STRING28);

            // Part21.g:111:15: ( ',' STRING )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==70) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Part21.g:111:16: ',' STRING
            	    {
            	    char_literal29=(Token)match(input,70,FOLLOW_70_in_description391);  
            	    stream_70.add(char_literal29);

            	    STRING30=(Token)match(input,STRING,FOLLOW_STRING_in_description393);  
            	    stream_STRING.add(STRING30);


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            char_literal31=(Token)match(input,71,FOLLOW_71_in_description397);  
            stream_71.add(char_literal31);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 112:2: -> ^( DESCRIPTION ( STRING )+ )
            {
                // Part21.g:112:5: ^( DESCRIPTION ( STRING )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DESCRIPTION, "DESCRIPTION"), root_1);

                if ( !(stream_STRING.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING.nextNode());

                }
                stream_STRING.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "description"

    public static class implementation_level_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "implementation_level"
    // Part21.g:115:1: implementation_level : STRING -> ^( IMPLEMENTATION_LEVEL STRING ) ;
    public final implementation_level_return implementation_level() throws RecognitionException {
        implementation_level_return retval = new implementation_level_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING32=null;

        Object STRING32_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Part21.g:116:2: ( STRING -> ^( IMPLEMENTATION_LEVEL STRING ) )
            // Part21.g:116:4: STRING
            {
            STRING32=(Token)match(input,STRING,FOLLOW_STRING_in_implementation_level419);  
            stream_STRING.add(STRING32);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 117:2: -> ^( IMPLEMENTATION_LEVEL STRING )
            {
                // Part21.g:117:4: ^( IMPLEMENTATION_LEVEL STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(IMPLEMENTATION_LEVEL, "IMPLEMENTATION_LEVEL"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "implementation_level"

    public static class file_name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_name"
    // Part21.g:120:1: file_name : 'FILE_NAME' '(' name ',' time_stamp ',' author ',' organization ',' preprocessor_version ',' originating_system ',' authorization ')' ';' -> ^( FILE_NAME name time_stamp author organization preprocessor_version originating_system authorization ) ;
    public final file_name_return file_name() throws RecognitionException {
        file_name_return retval = new file_name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal33=null;
        Token char_literal34=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token char_literal40=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Token char_literal46=null;
        Token char_literal48=null;
        Token char_literal49=null;
        name_return name35 = null;

        time_stamp_return time_stamp37 = null;

        author_return author39 = null;

        organization_return organization41 = null;

        preprocessor_version_return preprocessor_version43 = null;

        originating_system_return originating_system45 = null;

        authorization_return authorization47 = null;


        Object string_literal33_tree=null;
        Object char_literal34_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        Object char_literal40_tree=null;
        Object char_literal42_tree=null;
        Object char_literal44_tree=null;
        Object char_literal46_tree=null;
        Object char_literal48_tree=null;
        Object char_literal49_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_73=new RewriteRuleTokenStream(adaptor,"token 73");
        RewriteRuleSubtreeStream stream_authorization=new RewriteRuleSubtreeStream(adaptor,"rule authorization");
        RewriteRuleSubtreeStream stream_preprocessor_version=new RewriteRuleSubtreeStream(adaptor,"rule preprocessor_version");
        RewriteRuleSubtreeStream stream_time_stamp=new RewriteRuleSubtreeStream(adaptor,"rule time_stamp");
        RewriteRuleSubtreeStream stream_author=new RewriteRuleSubtreeStream(adaptor,"rule author");
        RewriteRuleSubtreeStream stream_originating_system=new RewriteRuleSubtreeStream(adaptor,"rule originating_system");
        RewriteRuleSubtreeStream stream_organization=new RewriteRuleSubtreeStream(adaptor,"rule organization");
        RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name");
        try {
            // Part21.g:121:2: ( 'FILE_NAME' '(' name ',' time_stamp ',' author ',' organization ',' preprocessor_version ',' originating_system ',' authorization ')' ';' -> ^( FILE_NAME name time_stamp author organization preprocessor_version originating_system authorization ) )
            // Part21.g:121:4: 'FILE_NAME' '(' name ',' time_stamp ',' author ',' organization ',' preprocessor_version ',' originating_system ',' authorization ')' ';'
            {
            string_literal33=(Token)match(input,73,FOLLOW_73_in_file_name439);  
            stream_73.add(string_literal33);

            char_literal34=(Token)match(input,69,FOLLOW_69_in_file_name441);  
            stream_69.add(char_literal34);

            pushFollow(FOLLOW_name_in_file_name443);
            name35=name();

            state._fsp--;

            stream_name.add(name35.getTree());
            char_literal36=(Token)match(input,70,FOLLOW_70_in_file_name445);  
            stream_70.add(char_literal36);

            pushFollow(FOLLOW_time_stamp_in_file_name447);
            time_stamp37=time_stamp();

            state._fsp--;

            stream_time_stamp.add(time_stamp37.getTree());
            char_literal38=(Token)match(input,70,FOLLOW_70_in_file_name449);  
            stream_70.add(char_literal38);

            pushFollow(FOLLOW_author_in_file_name451);
            author39=author();

            state._fsp--;

            stream_author.add(author39.getTree());
            char_literal40=(Token)match(input,70,FOLLOW_70_in_file_name453);  
            stream_70.add(char_literal40);

            pushFollow(FOLLOW_organization_in_file_name455);
            organization41=organization();

            state._fsp--;

            stream_organization.add(organization41.getTree());
            char_literal42=(Token)match(input,70,FOLLOW_70_in_file_name457);  
            stream_70.add(char_literal42);

            pushFollow(FOLLOW_preprocessor_version_in_file_name461);
            preprocessor_version43=preprocessor_version();

            state._fsp--;

            stream_preprocessor_version.add(preprocessor_version43.getTree());
            char_literal44=(Token)match(input,70,FOLLOW_70_in_file_name463);  
            stream_70.add(char_literal44);

            pushFollow(FOLLOW_originating_system_in_file_name465);
            originating_system45=originating_system();

            state._fsp--;

            stream_originating_system.add(originating_system45.getTree());
            char_literal46=(Token)match(input,70,FOLLOW_70_in_file_name467);  
            stream_70.add(char_literal46);

            pushFollow(FOLLOW_authorization_in_file_name469);
            authorization47=authorization();

            state._fsp--;

            stream_authorization.add(authorization47.getTree());
            char_literal48=(Token)match(input,71,FOLLOW_71_in_file_name471);  
            stream_71.add(char_literal48);

            char_literal49=(Token)match(input,72,FOLLOW_72_in_file_name473);  
            stream_72.add(char_literal49);



            // AST REWRITE
            // elements: organization, name, author, time_stamp, originating_system, authorization, preprocessor_version
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 123:2: -> ^( FILE_NAME name time_stamp author organization preprocessor_version originating_system authorization )
            {
                // Part21.g:123:5: ^( FILE_NAME name time_stamp author organization preprocessor_version originating_system authorization )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FILE_NAME, "FILE_NAME"), root_1);

                adaptor.addChild(root_1, stream_name.nextTree());
                adaptor.addChild(root_1, stream_time_stamp.nextTree());
                adaptor.addChild(root_1, stream_author.nextTree());
                adaptor.addChild(root_1, stream_organization.nextTree());
                adaptor.addChild(root_1, stream_preprocessor_version.nextTree());
                adaptor.addChild(root_1, stream_originating_system.nextTree());
                adaptor.addChild(root_1, stream_authorization.nextTree());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "file_name"

    public static class name_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "name"
    // Part21.g:127:1: name : STRING -> ^( NAME STRING ) ;
    public final name_return name() throws RecognitionException {
        name_return retval = new name_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING50=null;

        Object STRING50_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Part21.g:127:6: ( STRING -> ^( NAME STRING ) )
            // Part21.g:127:8: STRING
            {
            STRING50=(Token)match(input,STRING,FOLLOW_STRING_in_name507);  
            stream_STRING.add(STRING50);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 128:2: -> ^( NAME STRING )
            {
                // Part21.g:128:4: ^( NAME STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(NAME, "NAME"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "name"

    public static class time_stamp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "time_stamp"
    // Part21.g:130:1: time_stamp : STRING -> ^( TIME_STAMP STRING ) ;
    public final time_stamp_return time_stamp() throws RecognitionException {
        time_stamp_return retval = new time_stamp_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING51=null;

        Object STRING51_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Part21.g:131:2: ( STRING -> ^( TIME_STAMP STRING ) )
            // Part21.g:131:4: STRING
            {
            STRING51=(Token)match(input,STRING,FOLLOW_STRING_in_time_stamp524);  
            stream_STRING.add(STRING51);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 132:2: -> ^( TIME_STAMP STRING )
            {
                // Part21.g:132:4: ^( TIME_STAMP STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TIME_STAMP, "TIME_STAMP"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "time_stamp"

    public static class author_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "author"
    // Part21.g:134:1: author : '(' STRING ( ',' STRING )* ')' -> ^( AUTHOR ( STRING )+ ) ;
    public final author_return author() throws RecognitionException {
        author_return retval = new author_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal52=null;
        Token STRING53=null;
        Token char_literal54=null;
        Token STRING55=null;
        Token char_literal56=null;

        Object char_literal52_tree=null;
        Object STRING53_tree=null;
        Object char_literal54_tree=null;
        Object STRING55_tree=null;
        Object char_literal56_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // Part21.g:134:8: ( '(' STRING ( ',' STRING )* ')' -> ^( AUTHOR ( STRING )+ ) )
            // Part21.g:134:10: '(' STRING ( ',' STRING )* ')'
            {
            char_literal52=(Token)match(input,69,FOLLOW_69_in_author541);  
            stream_69.add(char_literal52);

            STRING53=(Token)match(input,STRING,FOLLOW_STRING_in_author543);  
            stream_STRING.add(STRING53);

            // Part21.g:134:21: ( ',' STRING )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==70) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Part21.g:134:22: ',' STRING
            	    {
            	    char_literal54=(Token)match(input,70,FOLLOW_70_in_author546);  
            	    stream_70.add(char_literal54);

            	    STRING55=(Token)match(input,STRING,FOLLOW_STRING_in_author548);  
            	    stream_STRING.add(STRING55);


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            char_literal56=(Token)match(input,71,FOLLOW_71_in_author552);  
            stream_71.add(char_literal56);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 135:2: -> ^( AUTHOR ( STRING )+ )
            {
                // Part21.g:135:4: ^( AUTHOR ( STRING )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AUTHOR, "AUTHOR"), root_1);

                if ( !(stream_STRING.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING.nextNode());

                }
                stream_STRING.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "author"

    public static class organization_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "organization"
    // Part21.g:137:1: organization : '(' STRING ( ',' STRING )* ')' -> ^( ORGANIZATION ( STRING )+ ) ;
    public final organization_return organization() throws RecognitionException {
        organization_return retval = new organization_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal57=null;
        Token STRING58=null;
        Token char_literal59=null;
        Token STRING60=null;
        Token char_literal61=null;

        Object char_literal57_tree=null;
        Object STRING58_tree=null;
        Object char_literal59_tree=null;
        Object STRING60_tree=null;
        Object char_literal61_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // Part21.g:138:2: ( '(' STRING ( ',' STRING )* ')' -> ^( ORGANIZATION ( STRING )+ ) )
            // Part21.g:138:4: '(' STRING ( ',' STRING )* ')'
            {
            char_literal57=(Token)match(input,69,FOLLOW_69_in_organization570);  
            stream_69.add(char_literal57);

            STRING58=(Token)match(input,STRING,FOLLOW_STRING_in_organization572);  
            stream_STRING.add(STRING58);

            // Part21.g:138:15: ( ',' STRING )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==70) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // Part21.g:138:16: ',' STRING
            	    {
            	    char_literal59=(Token)match(input,70,FOLLOW_70_in_organization575);  
            	    stream_70.add(char_literal59);

            	    STRING60=(Token)match(input,STRING,FOLLOW_STRING_in_organization577);  
            	    stream_STRING.add(STRING60);


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            char_literal61=(Token)match(input,71,FOLLOW_71_in_organization581);  
            stream_71.add(char_literal61);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 139:2: -> ^( ORGANIZATION ( STRING )+ )
            {
                // Part21.g:139:4: ^( ORGANIZATION ( STRING )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORGANIZATION, "ORGANIZATION"), root_1);

                if ( !(stream_STRING.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING.nextNode());

                }
                stream_STRING.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "organization"

    public static class preprocessor_version_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "preprocessor_version"
    // Part21.g:142:1: preprocessor_version : STRING -> ^( PREPROCESSOR_VERSION STRING ) ;
    public final preprocessor_version_return preprocessor_version() throws RecognitionException {
        preprocessor_version_return retval = new preprocessor_version_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING62=null;

        Object STRING62_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Part21.g:143:2: ( STRING -> ^( PREPROCESSOR_VERSION STRING ) )
            // Part21.g:143:4: STRING
            {
            STRING62=(Token)match(input,STRING,FOLLOW_STRING_in_preprocessor_version602);  
            stream_STRING.add(STRING62);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 144:2: -> ^( PREPROCESSOR_VERSION STRING )
            {
                // Part21.g:144:4: ^( PREPROCESSOR_VERSION STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PREPROCESSOR_VERSION, "PREPROCESSOR_VERSION"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "preprocessor_version"

    public static class originating_system_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "originating_system"
    // Part21.g:146:1: originating_system : STRING -> ^( ORIGINATING_SYSTEM STRING ) ;
    public final originating_system_return originating_system() throws RecognitionException {
        originating_system_return retval = new originating_system_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING63=null;

        Object STRING63_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Part21.g:147:2: ( STRING -> ^( ORIGINATING_SYSTEM STRING ) )
            // Part21.g:147:4: STRING
            {
            STRING63=(Token)match(input,STRING,FOLLOW_STRING_in_originating_system620);  
            stream_STRING.add(STRING63);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 148:2: -> ^( ORIGINATING_SYSTEM STRING )
            {
                // Part21.g:148:4: ^( ORIGINATING_SYSTEM STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ORIGINATING_SYSTEM, "ORIGINATING_SYSTEM"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "originating_system"

    public static class authorization_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "authorization"
    // Part21.g:150:1: authorization : STRING -> ^( AUTHORIZATION STRING ) ;
    public final authorization_return authorization() throws RecognitionException {
        authorization_return retval = new authorization_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING64=null;

        Object STRING64_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Part21.g:151:2: ( STRING -> ^( AUTHORIZATION STRING ) )
            // Part21.g:151:4: STRING
            {
            STRING64=(Token)match(input,STRING,FOLLOW_STRING_in_authorization638);  
            stream_STRING.add(STRING64);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 152:2: -> ^( AUTHORIZATION STRING )
            {
                // Part21.g:152:4: ^( AUTHORIZATION STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(AUTHORIZATION, "AUTHORIZATION"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "authorization"

    public static class file_schema_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_schema"
    // Part21.g:154:1: file_schema : 'FILE_SCHEMA' '(' schema_identifiers ')' ';' -> ^( FILE_SCHEMA schema_identifiers ) ;
    public final file_schema_return file_schema() throws RecognitionException {
        file_schema_return retval = new file_schema_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal65=null;
        Token char_literal66=null;
        Token char_literal68=null;
        Token char_literal69=null;
        schema_identifiers_return schema_identifiers67 = null;


        Object string_literal65_tree=null;
        Object char_literal66_tree=null;
        Object char_literal68_tree=null;
        Object char_literal69_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_74=new RewriteRuleTokenStream(adaptor,"token 74");
        RewriteRuleSubtreeStream stream_schema_identifiers=new RewriteRuleSubtreeStream(adaptor,"rule schema_identifiers");
        try {
            // Part21.g:155:2: ( 'FILE_SCHEMA' '(' schema_identifiers ')' ';' -> ^( FILE_SCHEMA schema_identifiers ) )
            // Part21.g:155:4: 'FILE_SCHEMA' '(' schema_identifiers ')' ';'
            {
            string_literal65=(Token)match(input,74,FOLLOW_74_in_file_schema656);  
            stream_74.add(string_literal65);

            char_literal66=(Token)match(input,69,FOLLOW_69_in_file_schema658);  
            stream_69.add(char_literal66);

            pushFollow(FOLLOW_schema_identifiers_in_file_schema660);
            schema_identifiers67=schema_identifiers();

            state._fsp--;

            stream_schema_identifiers.add(schema_identifiers67.getTree());
            char_literal68=(Token)match(input,71,FOLLOW_71_in_file_schema662);  
            stream_71.add(char_literal68);

            char_literal69=(Token)match(input,72,FOLLOW_72_in_file_schema664);  
            stream_72.add(char_literal69);



            // AST REWRITE
            // elements: schema_identifiers
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 156:2: -> ^( FILE_SCHEMA schema_identifiers )
            {
                // Part21.g:156:4: ^( FILE_SCHEMA schema_identifiers )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FILE_SCHEMA, "FILE_SCHEMA"), root_1);

                adaptor.addChild(root_1, stream_schema_identifiers.nextTree());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "file_schema"

    public static class schema_identifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "schema_identifiers"
    // Part21.g:158:1: schema_identifiers : '(' STRING ( ',' STRING )* ')' -> ^( SCHEMA_IDENTIFIERS ( STRING )+ ) ;
    public final schema_identifiers_return schema_identifiers() throws RecognitionException {
        schema_identifiers_return retval = new schema_identifiers_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal70=null;
        Token STRING71=null;
        Token char_literal72=null;
        Token STRING73=null;
        Token char_literal74=null;

        Object char_literal70_tree=null;
        Object STRING71_tree=null;
        Object char_literal72_tree=null;
        Object STRING73_tree=null;
        Object char_literal74_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // Part21.g:159:2: ( '(' STRING ( ',' STRING )* ')' -> ^( SCHEMA_IDENTIFIERS ( STRING )+ ) )
            // Part21.g:159:4: '(' STRING ( ',' STRING )* ')'
            {
            char_literal70=(Token)match(input,69,FOLLOW_69_in_schema_identifiers682);  
            stream_69.add(char_literal70);

            STRING71=(Token)match(input,STRING,FOLLOW_STRING_in_schema_identifiers684);  
            stream_STRING.add(STRING71);

            // Part21.g:159:15: ( ',' STRING )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==70) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Part21.g:159:16: ',' STRING
            	    {
            	    char_literal72=(Token)match(input,70,FOLLOW_70_in_schema_identifiers687);  
            	    stream_70.add(char_literal72);

            	    STRING73=(Token)match(input,STRING,FOLLOW_STRING_in_schema_identifiers689);  
            	    stream_STRING.add(STRING73);


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            char_literal74=(Token)match(input,71,FOLLOW_71_in_schema_identifiers693);  
            stream_71.add(char_literal74);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 160:2: -> ^( SCHEMA_IDENTIFIERS ( STRING )+ )
            {
                // Part21.g:160:4: ^( SCHEMA_IDENTIFIERS ( STRING )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SCHEMA_IDENTIFIERS, "SCHEMA_IDENTIFIERS"), root_1);

                if ( !(stream_STRING.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING.nextNode());

                }
                stream_STRING.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "schema_identifiers"

    public static class file_population_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "file_population"
    // Part21.g:162:1: file_population : 'FILE_POPULATION' '(' governing_schema ',' determination_method ( ',' governed_sections )? ')' ';' -> ^( FILE_POPULATION governing_schema determination_method ( governed_sections )? ) ;
    public final file_population_return file_population() throws RecognitionException {
        file_population_return retval = new file_population_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal75=null;
        Token char_literal76=null;
        Token char_literal78=null;
        Token char_literal80=null;
        Token char_literal82=null;
        Token char_literal83=null;
        governing_schema_return governing_schema77 = null;

        determination_method_return determination_method79 = null;

        governed_sections_return governed_sections81 = null;


        Object string_literal75_tree=null;
        Object char_literal76_tree=null;
        Object char_literal78_tree=null;
        Object char_literal80_tree=null;
        Object char_literal82_tree=null;
        Object char_literal83_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_75=new RewriteRuleTokenStream(adaptor,"token 75");
        RewriteRuleSubtreeStream stream_governing_schema=new RewriteRuleSubtreeStream(adaptor,"rule governing_schema");
        RewriteRuleSubtreeStream stream_governed_sections=new RewriteRuleSubtreeStream(adaptor,"rule governed_sections");
        RewriteRuleSubtreeStream stream_determination_method=new RewriteRuleSubtreeStream(adaptor,"rule determination_method");
        try {
            // Part21.g:163:2: ( 'FILE_POPULATION' '(' governing_schema ',' determination_method ( ',' governed_sections )? ')' ';' -> ^( FILE_POPULATION governing_schema determination_method ( governed_sections )? ) )
            // Part21.g:163:4: 'FILE_POPULATION' '(' governing_schema ',' determination_method ( ',' governed_sections )? ')' ';'
            {
            string_literal75=(Token)match(input,75,FOLLOW_75_in_file_population712);  
            stream_75.add(string_literal75);

            char_literal76=(Token)match(input,69,FOLLOW_69_in_file_population714);  
            stream_69.add(char_literal76);

            pushFollow(FOLLOW_governing_schema_in_file_population716);
            governing_schema77=governing_schema();

            state._fsp--;

            stream_governing_schema.add(governing_schema77.getTree());
            char_literal78=(Token)match(input,70,FOLLOW_70_in_file_population718);  
            stream_70.add(char_literal78);

            pushFollow(FOLLOW_determination_method_in_file_population720);
            determination_method79=determination_method();

            state._fsp--;

            stream_determination_method.add(determination_method79.getTree());
            // Part21.g:163:68: ( ',' governed_sections )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==70) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Part21.g:163:69: ',' governed_sections
                    {
                    char_literal80=(Token)match(input,70,FOLLOW_70_in_file_population723);  
                    stream_70.add(char_literal80);

                    pushFollow(FOLLOW_governed_sections_in_file_population725);
                    governed_sections81=governed_sections();

                    state._fsp--;

                    stream_governed_sections.add(governed_sections81.getTree());

                    }
                    break;

            }

            char_literal82=(Token)match(input,71,FOLLOW_71_in_file_population729);  
            stream_71.add(char_literal82);

            char_literal83=(Token)match(input,72,FOLLOW_72_in_file_population731);  
            stream_72.add(char_literal83);



            // AST REWRITE
            // elements: determination_method, governed_sections, governing_schema
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 164:2: -> ^( FILE_POPULATION governing_schema determination_method ( governed_sections )? )
            {
                // Part21.g:164:4: ^( FILE_POPULATION governing_schema determination_method ( governed_sections )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(FILE_POPULATION, "FILE_POPULATION"), root_1);

                adaptor.addChild(root_1, stream_governing_schema.nextTree());
                adaptor.addChild(root_1, stream_determination_method.nextTree());
                // Part21.g:164:60: ( governed_sections )?
                if ( stream_governed_sections.hasNext() ) {
                    adaptor.addChild(root_1, stream_governed_sections.nextTree());

                }
                stream_governed_sections.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "file_population"

    public static class governing_schema_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "governing_schema"
    // Part21.g:167:1: governing_schema : STRING -> ^( GOVERNING_SCHEMA STRING ) ;
    public final governing_schema_return governing_schema() throws RecognitionException {
        governing_schema_return retval = new governing_schema_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING84=null;

        Object STRING84_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Part21.g:168:2: ( STRING -> ^( GOVERNING_SCHEMA STRING ) )
            // Part21.g:168:4: STRING
            {
            STRING84=(Token)match(input,STRING,FOLLOW_STRING_in_governing_schema756);  
            stream_STRING.add(STRING84);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 169:2: -> ^( GOVERNING_SCHEMA STRING )
            {
                // Part21.g:169:4: ^( GOVERNING_SCHEMA STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GOVERNING_SCHEMA, "GOVERNING_SCHEMA"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "governing_schema"

    public static class determination_method_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "determination_method"
    // Part21.g:171:1: determination_method : STRING -> ^( DETERMINATION_METHOD STRING ) ;
    public final determination_method_return determination_method() throws RecognitionException {
        determination_method_return retval = new determination_method_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING85=null;

        Object STRING85_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Part21.g:172:2: ( STRING -> ^( DETERMINATION_METHOD STRING ) )
            // Part21.g:172:4: STRING
            {
            STRING85=(Token)match(input,STRING,FOLLOW_STRING_in_determination_method774);  
            stream_STRING.add(STRING85);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 173:2: -> ^( DETERMINATION_METHOD STRING )
            {
                // Part21.g:173:4: ^( DETERMINATION_METHOD STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DETERMINATION_METHOD, "DETERMINATION_METHOD"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "determination_method"

    public static class governed_sections_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "governed_sections"
    // Part21.g:175:1: governed_sections : '(' STRING ( ',' STRING )* ')' -> ^( GOVERNED_SECTIONS ( STRING )+ ) ;
    public final governed_sections_return governed_sections() throws RecognitionException {
        governed_sections_return retval = new governed_sections_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal86=null;
        Token STRING87=null;
        Token char_literal88=null;
        Token STRING89=null;
        Token char_literal90=null;

        Object char_literal86_tree=null;
        Object STRING87_tree=null;
        Object char_literal88_tree=null;
        Object STRING89_tree=null;
        Object char_literal90_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // Part21.g:176:2: ( '(' STRING ( ',' STRING )* ')' -> ^( GOVERNED_SECTIONS ( STRING )+ ) )
            // Part21.g:176:4: '(' STRING ( ',' STRING )* ')'
            {
            char_literal86=(Token)match(input,69,FOLLOW_69_in_governed_sections792);  
            stream_69.add(char_literal86);

            STRING87=(Token)match(input,STRING,FOLLOW_STRING_in_governed_sections794);  
            stream_STRING.add(STRING87);

            // Part21.g:176:15: ( ',' STRING )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==70) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // Part21.g:176:16: ',' STRING
            	    {
            	    char_literal88=(Token)match(input,70,FOLLOW_70_in_governed_sections797);  
            	    stream_70.add(char_literal88);

            	    STRING89=(Token)match(input,STRING,FOLLOW_STRING_in_governed_sections799);  
            	    stream_STRING.add(STRING89);


            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            char_literal90=(Token)match(input,71,FOLLOW_71_in_governed_sections803);  
            stream_71.add(char_literal90);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 177:2: -> ^( GOVERNED_SECTIONS ( STRING )+ )
            {
                // Part21.g:177:4: ^( GOVERNED_SECTIONS ( STRING )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(GOVERNED_SECTIONS, "GOVERNED_SECTIONS"), root_1);

                if ( !(stream_STRING.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING.nextNode());

                }
                stream_STRING.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "governed_sections"

    public static class section_language_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "section_language"
    // Part21.g:179:1: section_language : 'SECTION_LANGUAGE' '(' section ',' default_language ')' ';' -> ^( SECTION_LANGUAGE section default_language ) ;
    public final section_language_return section_language() throws RecognitionException {
        section_language_return retval = new section_language_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal91=null;
        Token char_literal92=null;
        Token char_literal94=null;
        Token char_literal96=null;
        Token char_literal97=null;
        section_return section93 = null;

        default_language_return default_language95 = null;


        Object string_literal91_tree=null;
        Object char_literal92_tree=null;
        Object char_literal94_tree=null;
        Object char_literal96_tree=null;
        Object char_literal97_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleTokenStream stream_76=new RewriteRuleTokenStream(adaptor,"token 76");
        RewriteRuleSubtreeStream stream_section=new RewriteRuleSubtreeStream(adaptor,"rule section");
        RewriteRuleSubtreeStream stream_default_language=new RewriteRuleSubtreeStream(adaptor,"rule default_language");
        try {
            // Part21.g:180:2: ( 'SECTION_LANGUAGE' '(' section ',' default_language ')' ';' -> ^( SECTION_LANGUAGE section default_language ) )
            // Part21.g:180:4: 'SECTION_LANGUAGE' '(' section ',' default_language ')' ';'
            {
            string_literal91=(Token)match(input,76,FOLLOW_76_in_section_language822);  
            stream_76.add(string_literal91);

            char_literal92=(Token)match(input,69,FOLLOW_69_in_section_language824);  
            stream_69.add(char_literal92);

            pushFollow(FOLLOW_section_in_section_language826);
            section93=section();

            state._fsp--;

            stream_section.add(section93.getTree());
            char_literal94=(Token)match(input,70,FOLLOW_70_in_section_language828);  
            stream_70.add(char_literal94);

            pushFollow(FOLLOW_default_language_in_section_language830);
            default_language95=default_language();

            state._fsp--;

            stream_default_language.add(default_language95.getTree());
            char_literal96=(Token)match(input,71,FOLLOW_71_in_section_language832);  
            stream_71.add(char_literal96);

            char_literal97=(Token)match(input,72,FOLLOW_72_in_section_language834);  
            stream_72.add(char_literal97);



            // AST REWRITE
            // elements: section, default_language
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 181:2: -> ^( SECTION_LANGUAGE section default_language )
            {
                // Part21.g:181:4: ^( SECTION_LANGUAGE section default_language )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SECTION_LANGUAGE, "SECTION_LANGUAGE"), root_1);

                adaptor.addChild(root_1, stream_section.nextTree());
                adaptor.addChild(root_1, stream_default_language.nextTree());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "section_language"

    public static class section_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "section"
    // Part21.g:183:1: section : STRING -> ^( SECTION STRING ) ;
    public final section_return section() throws RecognitionException {
        section_return retval = new section_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING98=null;

        Object STRING98_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Part21.g:183:9: ( STRING -> ^( SECTION STRING ) )
            // Part21.g:183:11: STRING
            {
            STRING98=(Token)match(input,STRING,FOLLOW_STRING_in_section853);  
            stream_STRING.add(STRING98);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 184:2: -> ^( SECTION STRING )
            {
                // Part21.g:184:4: ^( SECTION STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SECTION, "SECTION"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "section"

    public static class default_language_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "default_language"
    // Part21.g:187:1: default_language : STRING -> ^( DEFAULT_LANGUAGE STRING ) ;
    public final default_language_return default_language() throws RecognitionException {
        default_language_return retval = new default_language_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token STRING99=null;

        Object STRING99_tree=null;
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");

        try {
            // Part21.g:188:2: ( STRING -> ^( DEFAULT_LANGUAGE STRING ) )
            // Part21.g:188:4: STRING
            {
            STRING99=(Token)match(input,STRING,FOLLOW_STRING_in_default_language871);  
            stream_STRING.add(STRING99);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 189:2: -> ^( DEFAULT_LANGUAGE STRING )
            {
                // Part21.g:189:4: ^( DEFAULT_LANGUAGE STRING )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DEFAULT_LANGUAGE, "DEFAULT_LANGUAGE"), root_1);

                adaptor.addChild(root_1, stream_STRING.nextNode());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "default_language"

    public static class section_context_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "section_context"
    // Part21.g:191:1: section_context : 'SECTION_CONTEXT' '(' section ',' context_identifiers ')' ';' -> ^( SECTION_LANGUAGE section context_identifiers ) ;
    public final section_context_return section_context() throws RecognitionException {
        section_context_return retval = new section_context_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal100=null;
        Token char_literal101=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal106=null;
        section_return section102 = null;

        context_identifiers_return context_identifiers104 = null;


        Object string_literal100_tree=null;
        Object char_literal101_tree=null;
        Object char_literal103_tree=null;
        Object char_literal105_tree=null;
        Object char_literal106_tree=null;
        RewriteRuleTokenStream stream_77=new RewriteRuleTokenStream(adaptor,"token 77");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_context_identifiers=new RewriteRuleSubtreeStream(adaptor,"rule context_identifiers");
        RewriteRuleSubtreeStream stream_section=new RewriteRuleSubtreeStream(adaptor,"rule section");
        try {
            // Part21.g:192:2: ( 'SECTION_CONTEXT' '(' section ',' context_identifiers ')' ';' -> ^( SECTION_LANGUAGE section context_identifiers ) )
            // Part21.g:192:4: 'SECTION_CONTEXT' '(' section ',' context_identifiers ')' ';'
            {
            string_literal100=(Token)match(input,77,FOLLOW_77_in_section_context888);  
            stream_77.add(string_literal100);

            char_literal101=(Token)match(input,69,FOLLOW_69_in_section_context890);  
            stream_69.add(char_literal101);

            pushFollow(FOLLOW_section_in_section_context892);
            section102=section();

            state._fsp--;

            stream_section.add(section102.getTree());
            char_literal103=(Token)match(input,70,FOLLOW_70_in_section_context894);  
            stream_70.add(char_literal103);

            pushFollow(FOLLOW_context_identifiers_in_section_context896);
            context_identifiers104=context_identifiers();

            state._fsp--;

            stream_context_identifiers.add(context_identifiers104.getTree());
            char_literal105=(Token)match(input,71,FOLLOW_71_in_section_context898);  
            stream_71.add(char_literal105);

            char_literal106=(Token)match(input,72,FOLLOW_72_in_section_context900);  
            stream_72.add(char_literal106);



            // AST REWRITE
            // elements: section, context_identifiers
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 193:2: -> ^( SECTION_LANGUAGE section context_identifiers )
            {
                // Part21.g:193:4: ^( SECTION_LANGUAGE section context_identifiers )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SECTION_LANGUAGE, "SECTION_LANGUAGE"), root_1);

                adaptor.addChild(root_1, stream_section.nextTree());
                adaptor.addChild(root_1, stream_context_identifiers.nextTree());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "section_context"

    public static class context_identifiers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "context_identifiers"
    // Part21.g:195:1: context_identifiers : '(' STRING ( ',' STRING )* ')' -> ^( CONTEXT_IDENTIFIERS ( STRING )+ ) ;
    public final context_identifiers_return context_identifiers() throws RecognitionException {
        context_identifiers_return retval = new context_identifiers_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal107=null;
        Token STRING108=null;
        Token char_literal109=null;
        Token STRING110=null;
        Token char_literal111=null;

        Object char_literal107_tree=null;
        Object STRING108_tree=null;
        Object char_literal109_tree=null;
        Object STRING110_tree=null;
        Object char_literal111_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");

        try {
            // Part21.g:196:2: ( '(' STRING ( ',' STRING )* ')' -> ^( CONTEXT_IDENTIFIERS ( STRING )+ ) )
            // Part21.g:196:4: '(' STRING ( ',' STRING )* ')'
            {
            char_literal107=(Token)match(input,69,FOLLOW_69_in_context_identifiers920);  
            stream_69.add(char_literal107);

            STRING108=(Token)match(input,STRING,FOLLOW_STRING_in_context_identifiers922);  
            stream_STRING.add(STRING108);

            // Part21.g:196:15: ( ',' STRING )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==70) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // Part21.g:196:16: ',' STRING
            	    {
            	    char_literal109=(Token)match(input,70,FOLLOW_70_in_context_identifiers925);  
            	    stream_70.add(char_literal109);

            	    STRING110=(Token)match(input,STRING,FOLLOW_STRING_in_context_identifiers927);  
            	    stream_STRING.add(STRING110);


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

            char_literal111=(Token)match(input,71,FOLLOW_71_in_context_identifiers931);  
            stream_71.add(char_literal111);



            // AST REWRITE
            // elements: STRING
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 197:2: -> ^( CONTEXT_IDENTIFIERS ( STRING )+ )
            {
                // Part21.g:197:4: ^( CONTEXT_IDENTIFIERS ( STRING )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(CONTEXT_IDENTIFIERS, "CONTEXT_IDENTIFIERS"), root_1);

                if ( !(stream_STRING.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING.nextNode());

                }
                stream_STRING.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "context_identifiers"

    public static class header_entity_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "header_entity"
    // Part21.g:199:1: header_entity : keyword '(' ( parameter_list )? ')' ';' -> ^( HEADER_ENTITY keyword ( parameter_list )? ) ;
    public final header_entity_return header_entity() throws RecognitionException {
        header_entity_return retval = new header_entity_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal113=null;
        Token char_literal115=null;
        Token char_literal116=null;
        keyword_return keyword112 = null;

        parameter_list_return parameter_list114 = null;


        Object char_literal113_tree=null;
        Object char_literal115_tree=null;
        Object char_literal116_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_keyword=new RewriteRuleSubtreeStream(adaptor,"rule keyword");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // Part21.g:199:15: ( keyword '(' ( parameter_list )? ')' ';' -> ^( HEADER_ENTITY keyword ( parameter_list )? ) )
            // Part21.g:199:17: keyword '(' ( parameter_list )? ')' ';'
            {
            pushFollow(FOLLOW_keyword_in_header_entity950);
            keyword112=keyword();

            state._fsp--;

            stream_keyword.add(keyword112.getTree());
            char_literal113=(Token)match(input,69,FOLLOW_69_in_header_entity952);  
            stream_69.add(char_literal113);

            // Part21.g:199:29: ( parameter_list )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=NULL_VALUE && LA13_0<=OMITTED_PARAMETER)||(LA13_0>=STANDARD_KEYWORD && LA13_0<=BINARY)||(LA13_0>=64 && LA13_0<=65)||LA13_0==69) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // Part21.g:199:29: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_header_entity954);
                    parameter_list114=parameter_list();

                    state._fsp--;

                    stream_parameter_list.add(parameter_list114.getTree());

                    }
                    break;

            }

            char_literal115=(Token)match(input,71,FOLLOW_71_in_header_entity957);  
            stream_71.add(char_literal115);

            char_literal116=(Token)match(input,72,FOLLOW_72_in_header_entity959);  
            stream_72.add(char_literal116);



            // AST REWRITE
            // elements: keyword, parameter_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 200:1: -> ^( HEADER_ENTITY keyword ( parameter_list )? )
            {
                // Part21.g:200:4: ^( HEADER_ENTITY keyword ( parameter_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(HEADER_ENTITY, "HEADER_ENTITY"), root_1);

                adaptor.addChild(root_1, stream_keyword.nextTree());
                // Part21.g:200:28: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "header_entity"

    public static class parameter_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter_list"
    // Part21.g:203:1: parameter_list : parameter ( ',' parameter )* -> ^( PARAMETER_LIST ( parameter )+ ) ;
    public final parameter_list_return parameter_list() throws RecognitionException {
        parameter_list_return retval = new parameter_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal118=null;
        parameter_return parameter117 = null;

        parameter_return parameter119 = null;


        Object char_literal118_tree=null;
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // Part21.g:203:16: ( parameter ( ',' parameter )* -> ^( PARAMETER_LIST ( parameter )+ ) )
            // Part21.g:203:18: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameter_list980);
            parameter117=parameter();

            state._fsp--;

            stream_parameter.add(parameter117.getTree());
            // Part21.g:203:28: ( ',' parameter )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==70) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // Part21.g:203:30: ',' parameter
            	    {
            	    char_literal118=(Token)match(input,70,FOLLOW_70_in_parameter_list984);  
            	    stream_70.add(char_literal118);

            	    pushFollow(FOLLOW_parameter_in_parameter_list986);
            	    parameter119=parameter();

            	    state._fsp--;

            	    stream_parameter.add(parameter119.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);



            // AST REWRITE
            // elements: parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 204:1: -> ^( PARAMETER_LIST ( parameter )+ )
            {
                // Part21.g:204:4: ^( PARAMETER_LIST ( parameter )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETER_LIST, "PARAMETER_LIST"), root_1);

                if ( !(stream_parameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter_list"

    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "parameter"
    // Part21.g:207:1: parameter : ( typed_parameter | untyped_parameter | OMITTED_PARAMETER ) -> ^( PARAMETER ( typed_parameter )? ( untyped_parameter )? ( OMITTED_PARAMETER )? ) ;
    public final parameter_return parameter() throws RecognitionException {
        parameter_return retval = new parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token OMITTED_PARAMETER122=null;
        typed_parameter_return typed_parameter120 = null;

        untyped_parameter_return untyped_parameter121 = null;


        Object OMITTED_PARAMETER122_tree=null;
        RewriteRuleTokenStream stream_OMITTED_PARAMETER=new RewriteRuleTokenStream(adaptor,"token OMITTED_PARAMETER");
        RewriteRuleSubtreeStream stream_untyped_parameter=new RewriteRuleSubtreeStream(adaptor,"rule untyped_parameter");
        RewriteRuleSubtreeStream stream_typed_parameter=new RewriteRuleSubtreeStream(adaptor,"rule typed_parameter");
        try {
            // Part21.g:207:11: ( ( typed_parameter | untyped_parameter | OMITTED_PARAMETER ) -> ^( PARAMETER ( typed_parameter )? ( untyped_parameter )? ( OMITTED_PARAMETER )? ) )
            // Part21.g:208:1: ( typed_parameter | untyped_parameter | OMITTED_PARAMETER )
            {
            // Part21.g:208:1: ( typed_parameter | untyped_parameter | OMITTED_PARAMETER )
            int alt15=3;
            switch ( input.LA(1) ) {
            case STANDARD_KEYWORD:
            case 64:
                {
                alt15=1;
                }
                break;
            case NULL_VALUE:
            case STRING:
            case INTEGER:
            case REAL:
            case ENTITY_INSTANCE_NAME:
            case BINARY:
            case 65:
            case 69:
                {
                alt15=2;
                }
                break;
            case OMITTED_PARAMETER:
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
                    // Part21.g:208:2: typed_parameter
                    {
                    pushFollow(FOLLOW_typed_parameter_in_parameter1010);
                    typed_parameter120=typed_parameter();

                    state._fsp--;

                    stream_typed_parameter.add(typed_parameter120.getTree());

                    }
                    break;
                case 2 :
                    // Part21.g:208:20: untyped_parameter
                    {
                    pushFollow(FOLLOW_untyped_parameter_in_parameter1014);
                    untyped_parameter121=untyped_parameter();

                    state._fsp--;

                    stream_untyped_parameter.add(untyped_parameter121.getTree());

                    }
                    break;
                case 3 :
                    // Part21.g:208:40: OMITTED_PARAMETER
                    {
                    OMITTED_PARAMETER122=(Token)match(input,OMITTED_PARAMETER,FOLLOW_OMITTED_PARAMETER_in_parameter1018);  
                    stream_OMITTED_PARAMETER.add(OMITTED_PARAMETER122);


                    }
                    break;

            }



            // AST REWRITE
            // elements: untyped_parameter, OMITTED_PARAMETER, typed_parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 209:1: -> ^( PARAMETER ( typed_parameter )? ( untyped_parameter )? ( OMITTED_PARAMETER )? )
            {
                // Part21.g:209:4: ^( PARAMETER ( typed_parameter )? ( untyped_parameter )? ( OMITTED_PARAMETER )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PARAMETER, "PARAMETER"), root_1);

                // Part21.g:209:16: ( typed_parameter )?
                if ( stream_typed_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_typed_parameter.nextTree());

                }
                stream_typed_parameter.reset();
                // Part21.g:209:33: ( untyped_parameter )?
                if ( stream_untyped_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_untyped_parameter.nextTree());

                }
                stream_untyped_parameter.reset();
                // Part21.g:209:52: ( OMITTED_PARAMETER )?
                if ( stream_OMITTED_PARAMETER.hasNext() ) {
                    adaptor.addChild(root_1, stream_OMITTED_PARAMETER.nextNode());

                }
                stream_OMITTED_PARAMETER.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "parameter"

    public static class typed_parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "typed_parameter"
    // Part21.g:212:1: typed_parameter : keyword '(' parameter ')' -> ^( TYPED_PARAMETER keyword parameter ) ;
    public final typed_parameter_return typed_parameter() throws RecognitionException {
        typed_parameter_return retval = new typed_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal124=null;
        Token char_literal126=null;
        keyword_return keyword123 = null;

        parameter_return parameter125 = null;


        Object char_literal124_tree=null;
        Object char_literal126_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        RewriteRuleSubtreeStream stream_keyword=new RewriteRuleSubtreeStream(adaptor,"rule keyword");
        try {
            // Part21.g:212:17: ( keyword '(' parameter ')' -> ^( TYPED_PARAMETER keyword parameter ) )
            // Part21.g:212:19: keyword '(' parameter ')'
            {
            pushFollow(FOLLOW_keyword_in_typed_parameter1044);
            keyword123=keyword();

            state._fsp--;

            stream_keyword.add(keyword123.getTree());
            char_literal124=(Token)match(input,69,FOLLOW_69_in_typed_parameter1046);  
            stream_69.add(char_literal124);

            pushFollow(FOLLOW_parameter_in_typed_parameter1048);
            parameter125=parameter();

            state._fsp--;

            stream_parameter.add(parameter125.getTree());
            char_literal126=(Token)match(input,71,FOLLOW_71_in_typed_parameter1050);  
            stream_71.add(char_literal126);



            // AST REWRITE
            // elements: keyword, parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 213:1: -> ^( TYPED_PARAMETER keyword parameter )
            {
                // Part21.g:213:4: ^( TYPED_PARAMETER keyword parameter )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(TYPED_PARAMETER, "TYPED_PARAMETER"), root_1);

                adaptor.addChild(root_1, stream_keyword.nextTree());
                adaptor.addChild(root_1, stream_parameter.nextTree());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "typed_parameter"

    public static class untyped_parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "untyped_parameter"
    // Part21.g:216:1: untyped_parameter : ( NULL_VALUE | INTEGER | REAL | STRING | ENTITY_INSTANCE_NAME | enumeration | BINARY | list ) -> ^( UNTYPED_PARAMETER ( NULL_VALUE )? ( INTEGER )? ( REAL )? ( STRING )? ( ENTITY_INSTANCE_NAME )? ( enumeration )? ( BINARY )? ( list )? ) ;
    public final untyped_parameter_return untyped_parameter() throws RecognitionException {
        untyped_parameter_return retval = new untyped_parameter_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token NULL_VALUE127=null;
        Token INTEGER128=null;
        Token REAL129=null;
        Token STRING130=null;
        Token ENTITY_INSTANCE_NAME131=null;
        Token BINARY133=null;
        enumeration_return enumeration132 = null;

        list_return list134 = null;


        Object NULL_VALUE127_tree=null;
        Object INTEGER128_tree=null;
        Object REAL129_tree=null;
        Object STRING130_tree=null;
        Object ENTITY_INSTANCE_NAME131_tree=null;
        Object BINARY133_tree=null;
        RewriteRuleTokenStream stream_REAL=new RewriteRuleTokenStream(adaptor,"token REAL");
        RewriteRuleTokenStream stream_BINARY=new RewriteRuleTokenStream(adaptor,"token BINARY");
        RewriteRuleTokenStream stream_STRING=new RewriteRuleTokenStream(adaptor,"token STRING");
        RewriteRuleTokenStream stream_ENTITY_INSTANCE_NAME=new RewriteRuleTokenStream(adaptor,"token ENTITY_INSTANCE_NAME");
        RewriteRuleTokenStream stream_NULL_VALUE=new RewriteRuleTokenStream(adaptor,"token NULL_VALUE");
        RewriteRuleTokenStream stream_INTEGER=new RewriteRuleTokenStream(adaptor,"token INTEGER");
        RewriteRuleSubtreeStream stream_enumeration=new RewriteRuleSubtreeStream(adaptor,"rule enumeration");
        RewriteRuleSubtreeStream stream_list=new RewriteRuleSubtreeStream(adaptor,"rule list");
        try {
            // Part21.g:216:19: ( ( NULL_VALUE | INTEGER | REAL | STRING | ENTITY_INSTANCE_NAME | enumeration | BINARY | list ) -> ^( UNTYPED_PARAMETER ( NULL_VALUE )? ( INTEGER )? ( REAL )? ( STRING )? ( ENTITY_INSTANCE_NAME )? ( enumeration )? ( BINARY )? ( list )? ) )
            // Part21.g:217:1: ( NULL_VALUE | INTEGER | REAL | STRING | ENTITY_INSTANCE_NAME | enumeration | BINARY | list )
            {
            // Part21.g:217:1: ( NULL_VALUE | INTEGER | REAL | STRING | ENTITY_INSTANCE_NAME | enumeration | BINARY | list )
            int alt16=8;
            switch ( input.LA(1) ) {
            case NULL_VALUE:
                {
                alt16=1;
                }
                break;
            case INTEGER:
                {
                alt16=2;
                }
                break;
            case REAL:
                {
                alt16=3;
                }
                break;
            case STRING:
                {
                alt16=4;
                }
                break;
            case ENTITY_INSTANCE_NAME:
                {
                alt16=5;
                }
                break;
            case 65:
                {
                alt16=6;
                }
                break;
            case BINARY:
                {
                alt16=7;
                }
                break;
            case 69:
                {
                alt16=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // Part21.g:217:2: NULL_VALUE
                    {
                    NULL_VALUE127=(Token)match(input,NULL_VALUE,FOLLOW_NULL_VALUE_in_untyped_parameter1072);  
                    stream_NULL_VALUE.add(NULL_VALUE127);


                    }
                    break;
                case 2 :
                    // Part21.g:217:15: INTEGER
                    {
                    INTEGER128=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_untyped_parameter1076);  
                    stream_INTEGER.add(INTEGER128);


                    }
                    break;
                case 3 :
                    // Part21.g:217:25: REAL
                    {
                    REAL129=(Token)match(input,REAL,FOLLOW_REAL_in_untyped_parameter1080);  
                    stream_REAL.add(REAL129);


                    }
                    break;
                case 4 :
                    // Part21.g:217:31: STRING
                    {
                    STRING130=(Token)match(input,STRING,FOLLOW_STRING_in_untyped_parameter1083);  
                    stream_STRING.add(STRING130);


                    }
                    break;
                case 5 :
                    // Part21.g:217:39: ENTITY_INSTANCE_NAME
                    {
                    ENTITY_INSTANCE_NAME131=(Token)match(input,ENTITY_INSTANCE_NAME,FOLLOW_ENTITY_INSTANCE_NAME_in_untyped_parameter1086);  
                    stream_ENTITY_INSTANCE_NAME.add(ENTITY_INSTANCE_NAME131);


                    }
                    break;
                case 6 :
                    // Part21.g:217:61: enumeration
                    {
                    pushFollow(FOLLOW_enumeration_in_untyped_parameter1089);
                    enumeration132=enumeration();

                    state._fsp--;

                    stream_enumeration.add(enumeration132.getTree());

                    }
                    break;
                case 7 :
                    // Part21.g:217:74: BINARY
                    {
                    BINARY133=(Token)match(input,BINARY,FOLLOW_BINARY_in_untyped_parameter1092);  
                    stream_BINARY.add(BINARY133);


                    }
                    break;
                case 8 :
                    // Part21.g:217:82: list
                    {
                    pushFollow(FOLLOW_list_in_untyped_parameter1095);
                    list134=list();

                    state._fsp--;

                    stream_list.add(list134.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: ENTITY_INSTANCE_NAME, STRING, list, enumeration, INTEGER, NULL_VALUE, REAL, BINARY
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 218:1: -> ^( UNTYPED_PARAMETER ( NULL_VALUE )? ( INTEGER )? ( REAL )? ( STRING )? ( ENTITY_INSTANCE_NAME )? ( enumeration )? ( BINARY )? ( list )? )
            {
                // Part21.g:218:4: ^( UNTYPED_PARAMETER ( NULL_VALUE )? ( INTEGER )? ( REAL )? ( STRING )? ( ENTITY_INSTANCE_NAME )? ( enumeration )? ( BINARY )? ( list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(UNTYPED_PARAMETER, "UNTYPED_PARAMETER"), root_1);

                // Part21.g:218:24: ( NULL_VALUE )?
                if ( stream_NULL_VALUE.hasNext() ) {
                    adaptor.addChild(root_1, stream_NULL_VALUE.nextNode());

                }
                stream_NULL_VALUE.reset();
                // Part21.g:218:36: ( INTEGER )?
                if ( stream_INTEGER.hasNext() ) {
                    adaptor.addChild(root_1, stream_INTEGER.nextNode());

                }
                stream_INTEGER.reset();
                // Part21.g:218:45: ( REAL )?
                if ( stream_REAL.hasNext() ) {
                    adaptor.addChild(root_1, stream_REAL.nextNode());

                }
                stream_REAL.reset();
                // Part21.g:218:51: ( STRING )?
                if ( stream_STRING.hasNext() ) {
                    adaptor.addChild(root_1, stream_STRING.nextNode());

                }
                stream_STRING.reset();
                // Part21.g:218:59: ( ENTITY_INSTANCE_NAME )?
                if ( stream_ENTITY_INSTANCE_NAME.hasNext() ) {
                    adaptor.addChild(root_1, stream_ENTITY_INSTANCE_NAME.nextNode());

                }
                stream_ENTITY_INSTANCE_NAME.reset();
                // Part21.g:218:81: ( enumeration )?
                if ( stream_enumeration.hasNext() ) {
                    adaptor.addChild(root_1, stream_enumeration.nextTree());

                }
                stream_enumeration.reset();
                // Part21.g:218:94: ( BINARY )?
                if ( stream_BINARY.hasNext() ) {
                    adaptor.addChild(root_1, stream_BINARY.nextNode());

                }
                stream_BINARY.reset();
                // Part21.g:218:102: ( list )?
                if ( stream_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_list.nextTree());

                }
                stream_list.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "untyped_parameter"

    public static class list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "list"
    // Part21.g:221:1: list : '(' ( parameter ( ',' parameter )* )? ')' -> ^( LIST ( parameter )* ) ;
    public final list_return list() throws RecognitionException {
        list_return retval = new list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal135=null;
        Token char_literal137=null;
        Token char_literal139=null;
        parameter_return parameter136 = null;

        parameter_return parameter138 = null;


        Object char_literal135_tree=null;
        Object char_literal137_tree=null;
        Object char_literal139_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_70=new RewriteRuleTokenStream(adaptor,"token 70");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // Part21.g:221:6: ( '(' ( parameter ( ',' parameter )* )? ')' -> ^( LIST ( parameter )* ) )
            // Part21.g:222:1: '(' ( parameter ( ',' parameter )* )? ')'
            {
            char_literal135=(Token)match(input,69,FOLLOW_69_in_list1137);  
            stream_69.add(char_literal135);

            // Part21.g:222:5: ( parameter ( ',' parameter )* )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( ((LA18_0>=NULL_VALUE && LA18_0<=OMITTED_PARAMETER)||(LA18_0>=STANDARD_KEYWORD && LA18_0<=BINARY)||(LA18_0>=64 && LA18_0<=65)||LA18_0==69) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // Part21.g:222:7: parameter ( ',' parameter )*
                    {
                    pushFollow(FOLLOW_parameter_in_list1141);
                    parameter136=parameter();

                    state._fsp--;

                    stream_parameter.add(parameter136.getTree());
                    // Part21.g:222:17: ( ',' parameter )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==70) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // Part21.g:222:19: ',' parameter
                    	    {
                    	    char_literal137=(Token)match(input,70,FOLLOW_70_in_list1145);  
                    	    stream_70.add(char_literal137);

                    	    pushFollow(FOLLOW_parameter_in_list1147);
                    	    parameter138=parameter();

                    	    state._fsp--;

                    	    stream_parameter.add(parameter138.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    }
                    break;

            }

            char_literal139=(Token)match(input,71,FOLLOW_71_in_list1155);  
            stream_71.add(char_literal139);



            // AST REWRITE
            // elements: parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 223:1: -> ^( LIST ( parameter )* )
            {
                // Part21.g:223:4: ^( LIST ( parameter )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(LIST, "LIST"), root_1);

                // Part21.g:223:11: ( parameter )*
                while ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "list"

    public static class data_section_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_section"
    // Part21.g:225:1: data_section : 'DATA' ( '(' parameter_list ')' )? ';' entity_instance_list 'ENDSEC;' -> ^( DATA_SECTION ( parameter_list )? entity_instance_list ) ;
    public final data_section_return data_section() throws RecognitionException {
        data_section_return retval = new data_section_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal140=null;
        Token char_literal141=null;
        Token char_literal143=null;
        Token char_literal144=null;
        Token string_literal146=null;
        parameter_list_return parameter_list142 = null;

        entity_instance_list_return entity_instance_list145 = null;


        Object string_literal140_tree=null;
        Object char_literal141_tree=null;
        Object char_literal143_tree=null;
        Object char_literal144_tree=null;
        Object string_literal146_tree=null;
        RewriteRuleTokenStream stream_67=new RewriteRuleTokenStream(adaptor,"token 67");
        RewriteRuleTokenStream stream_78=new RewriteRuleTokenStream(adaptor,"token 78");
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_entity_instance_list=new RewriteRuleSubtreeStream(adaptor,"rule entity_instance_list");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // Part21.g:225:14: ( 'DATA' ( '(' parameter_list ')' )? ';' entity_instance_list 'ENDSEC;' -> ^( DATA_SECTION ( parameter_list )? entity_instance_list ) )
            // Part21.g:226:1: 'DATA' ( '(' parameter_list ')' )? ';' entity_instance_list 'ENDSEC;'
            {
            string_literal140=(Token)match(input,78,FOLLOW_78_in_data_section1174);  
            stream_78.add(string_literal140);

            // Part21.g:226:8: ( '(' parameter_list ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==69) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // Part21.g:226:10: '(' parameter_list ')'
                    {
                    char_literal141=(Token)match(input,69,FOLLOW_69_in_data_section1178);  
                    stream_69.add(char_literal141);

                    pushFollow(FOLLOW_parameter_list_in_data_section1180);
                    parameter_list142=parameter_list();

                    state._fsp--;

                    stream_parameter_list.add(parameter_list142.getTree());
                    char_literal143=(Token)match(input,71,FOLLOW_71_in_data_section1182);  
                    stream_71.add(char_literal143);


                    }
                    break;

            }

            char_literal144=(Token)match(input,72,FOLLOW_72_in_data_section1187);  
            stream_72.add(char_literal144);

            pushFollow(FOLLOW_entity_instance_list_in_data_section1189);
            entity_instance_list145=entity_instance_list();

            state._fsp--;

            stream_entity_instance_list.add(entity_instance_list145.getTree());
            string_literal146=(Token)match(input,67,FOLLOW_67_in_data_section1191);  
            stream_67.add(string_literal146);



            // AST REWRITE
            // elements: entity_instance_list, parameter_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 227:1: -> ^( DATA_SECTION ( parameter_list )? entity_instance_list )
            {
                // Part21.g:227:4: ^( DATA_SECTION ( parameter_list )? entity_instance_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(DATA_SECTION, "DATA_SECTION"), root_1);

                // Part21.g:227:19: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();
                adaptor.addChild(root_1, stream_entity_instance_list.nextTree());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "data_section"

    public static class entity_instance_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entity_instance_list"
    // Part21.g:229:1: entity_instance_list : ( entity_instance )* -> ^( ENTITY_INSTANCE_LIST ( entity_instance )* ) ;
    public final entity_instance_list_return entity_instance_list() throws RecognitionException {
        entity_instance_list_return retval = new entity_instance_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        entity_instance_return entity_instance147 = null;


        RewriteRuleSubtreeStream stream_entity_instance=new RewriteRuleSubtreeStream(adaptor,"rule entity_instance");
        try {
            // Part21.g:229:22: ( ( entity_instance )* -> ^( ENTITY_INSTANCE_LIST ( entity_instance )* ) )
            // Part21.g:230:1: ( entity_instance )*
            {
            // Part21.g:230:1: ( entity_instance )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==ENTITY_INSTANCE_NAME) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // Part21.g:230:1: entity_instance
            	    {
            	    pushFollow(FOLLOW_entity_instance_in_entity_instance_list1212);
            	    entity_instance147=entity_instance();

            	    state._fsp--;

            	    stream_entity_instance.add(entity_instance147.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);



            // AST REWRITE
            // elements: entity_instance
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 231:1: -> ^( ENTITY_INSTANCE_LIST ( entity_instance )* )
            {
                // Part21.g:231:4: ^( ENTITY_INSTANCE_LIST ( entity_instance )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENTITY_INSTANCE_LIST, "ENTITY_INSTANCE_LIST"), root_1);

                // Part21.g:231:27: ( entity_instance )*
                while ( stream_entity_instance.hasNext() ) {
                    adaptor.addChild(root_1, stream_entity_instance.nextTree());

                }
                stream_entity_instance.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entity_instance_list"

    public static class entity_instance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entity_instance"
    // Part21.g:233:1: entity_instance : ENTITY_INSTANCE_NAME '=' ( simple_entity_instance | complex_entity_instance ) -> ^( ENTITY_INSTANCE ENTITY_INSTANCE_NAME ( simple_entity_instance )? ( complex_entity_instance )? ) ;
    public final entity_instance_return entity_instance() throws RecognitionException {
        entity_instance_return retval = new entity_instance_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ENTITY_INSTANCE_NAME148=null;
        Token char_literal149=null;
        simple_entity_instance_return simple_entity_instance150 = null;

        complex_entity_instance_return complex_entity_instance151 = null;


        Object ENTITY_INSTANCE_NAME148_tree=null;
        Object char_literal149_tree=null;
        RewriteRuleTokenStream stream_79=new RewriteRuleTokenStream(adaptor,"token 79");
        RewriteRuleTokenStream stream_ENTITY_INSTANCE_NAME=new RewriteRuleTokenStream(adaptor,"token ENTITY_INSTANCE_NAME");
        RewriteRuleSubtreeStream stream_simple_entity_instance=new RewriteRuleSubtreeStream(adaptor,"rule simple_entity_instance");
        RewriteRuleSubtreeStream stream_complex_entity_instance=new RewriteRuleSubtreeStream(adaptor,"rule complex_entity_instance");
        try {
            // Part21.g:233:17: ( ENTITY_INSTANCE_NAME '=' ( simple_entity_instance | complex_entity_instance ) -> ^( ENTITY_INSTANCE ENTITY_INSTANCE_NAME ( simple_entity_instance )? ( complex_entity_instance )? ) )
            // Part21.g:233:20: ENTITY_INSTANCE_NAME '=' ( simple_entity_instance | complex_entity_instance )
            {
            ENTITY_INSTANCE_NAME148=(Token)match(input,ENTITY_INSTANCE_NAME,FOLLOW_ENTITY_INSTANCE_NAME_in_entity_instance1232);  
            stream_ENTITY_INSTANCE_NAME.add(ENTITY_INSTANCE_NAME148);

            char_literal149=(Token)match(input,79,FOLLOW_79_in_entity_instance1234);  
            stream_79.add(char_literal149);

            // Part21.g:233:45: ( simple_entity_instance | complex_entity_instance )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==STANDARD_KEYWORD||LA21_0==64) ) {
                alt21=1;
            }
            else if ( (LA21_0==69) ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }
            switch (alt21) {
                case 1 :
                    // Part21.g:233:46: simple_entity_instance
                    {
                    pushFollow(FOLLOW_simple_entity_instance_in_entity_instance1237);
                    simple_entity_instance150=simple_entity_instance();

                    state._fsp--;

                    stream_simple_entity_instance.add(simple_entity_instance150.getTree());

                    }
                    break;
                case 2 :
                    // Part21.g:233:71: complex_entity_instance
                    {
                    pushFollow(FOLLOW_complex_entity_instance_in_entity_instance1241);
                    complex_entity_instance151=complex_entity_instance();

                    state._fsp--;

                    stream_complex_entity_instance.add(complex_entity_instance151.getTree());

                    }
                    break;

            }



            // AST REWRITE
            // elements: simple_entity_instance, ENTITY_INSTANCE_NAME, complex_entity_instance
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 234:1: -> ^( ENTITY_INSTANCE ENTITY_INSTANCE_NAME ( simple_entity_instance )? ( complex_entity_instance )? )
            {
                // Part21.g:234:4: ^( ENTITY_INSTANCE ENTITY_INSTANCE_NAME ( simple_entity_instance )? ( complex_entity_instance )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(ENTITY_INSTANCE, "ENTITY_INSTANCE"), root_1);

                adaptor.addChild(root_1, stream_ENTITY_INSTANCE_NAME.nextNode());
                // Part21.g:234:43: ( simple_entity_instance )?
                if ( stream_simple_entity_instance.hasNext() ) {
                    adaptor.addChild(root_1, stream_simple_entity_instance.nextTree());

                }
                stream_simple_entity_instance.reset();
                // Part21.g:234:68: ( complex_entity_instance )?
                if ( stream_complex_entity_instance.hasNext() ) {
                    adaptor.addChild(root_1, stream_complex_entity_instance.nextTree());

                }
                stream_complex_entity_instance.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entity_instance"

    public static class simple_entity_instance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_entity_instance"
    // Part21.g:236:1: simple_entity_instance : simple_record ';' -> ^( SIMPLE_ENTITY_INSTANCE simple_record ) ;
    public final simple_entity_instance_return simple_entity_instance() throws RecognitionException {
        simple_entity_instance_return retval = new simple_entity_instance_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal153=null;
        simple_record_return simple_record152 = null;


        Object char_literal153_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_simple_record=new RewriteRuleSubtreeStream(adaptor,"rule simple_record");
        try {
            // Part21.g:236:24: ( simple_record ';' -> ^( SIMPLE_ENTITY_INSTANCE simple_record ) )
            // Part21.g:236:25: simple_record ';'
            {
            pushFollow(FOLLOW_simple_record_in_simple_entity_instance1265);
            simple_record152=simple_record();

            state._fsp--;

            stream_simple_record.add(simple_record152.getTree());
            char_literal153=(Token)match(input,72,FOLLOW_72_in_simple_entity_instance1267);  
            stream_72.add(char_literal153);



            // AST REWRITE
            // elements: simple_record
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 237:1: -> ^( SIMPLE_ENTITY_INSTANCE simple_record )
            {
                // Part21.g:237:4: ^( SIMPLE_ENTITY_INSTANCE simple_record )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIMPLE_ENTITY_INSTANCE, "SIMPLE_ENTITY_INSTANCE"), root_1);

                adaptor.addChild(root_1, stream_simple_record.nextTree());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simple_entity_instance"

    public static class complex_entity_instance_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "complex_entity_instance"
    // Part21.g:239:1: complex_entity_instance : subsuper_record ';' -> ^( COMPLEX_ENTITY_INSTANCE subsuper_record ) ;
    public final complex_entity_instance_return complex_entity_instance() throws RecognitionException {
        complex_entity_instance_return retval = new complex_entity_instance_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal155=null;
        subsuper_record_return subsuper_record154 = null;


        Object char_literal155_tree=null;
        RewriteRuleTokenStream stream_72=new RewriteRuleTokenStream(adaptor,"token 72");
        RewriteRuleSubtreeStream stream_subsuper_record=new RewriteRuleSubtreeStream(adaptor,"rule subsuper_record");
        try {
            // Part21.g:239:25: ( subsuper_record ';' -> ^( COMPLEX_ENTITY_INSTANCE subsuper_record ) )
            // Part21.g:239:27: subsuper_record ';'
            {
            pushFollow(FOLLOW_subsuper_record_in_complex_entity_instance1284);
            subsuper_record154=subsuper_record();

            state._fsp--;

            stream_subsuper_record.add(subsuper_record154.getTree());
            char_literal155=(Token)match(input,72,FOLLOW_72_in_complex_entity_instance1286);  
            stream_72.add(char_literal155);



            // AST REWRITE
            // elements: subsuper_record
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 240:1: -> ^( COMPLEX_ENTITY_INSTANCE subsuper_record )
            {
                // Part21.g:240:4: ^( COMPLEX_ENTITY_INSTANCE subsuper_record )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(COMPLEX_ENTITY_INSTANCE, "COMPLEX_ENTITY_INSTANCE"), root_1);

                adaptor.addChild(root_1, stream_subsuper_record.nextTree());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "complex_entity_instance"

    public static class subsuper_record_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "subsuper_record"
    // Part21.g:242:1: subsuper_record : '(' simple_record_list ')' -> ^( SUBSUPER_RECORD simple_record_list ) ;
    public final subsuper_record_return subsuper_record() throws RecognitionException {
        subsuper_record_return retval = new subsuper_record_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal156=null;
        Token char_literal158=null;
        simple_record_list_return simple_record_list157 = null;


        Object char_literal156_tree=null;
        Object char_literal158_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_simple_record_list=new RewriteRuleSubtreeStream(adaptor,"rule simple_record_list");
        try {
            // Part21.g:242:17: ( '(' simple_record_list ')' -> ^( SUBSUPER_RECORD simple_record_list ) )
            // Part21.g:242:19: '(' simple_record_list ')'
            {
            char_literal156=(Token)match(input,69,FOLLOW_69_in_subsuper_record1304);  
            stream_69.add(char_literal156);

            pushFollow(FOLLOW_simple_record_list_in_subsuper_record1306);
            simple_record_list157=simple_record_list();

            state._fsp--;

            stream_simple_record_list.add(simple_record_list157.getTree());
            char_literal158=(Token)match(input,71,FOLLOW_71_in_subsuper_record1308);  
            stream_71.add(char_literal158);



            // AST REWRITE
            // elements: simple_record_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 243:1: -> ^( SUBSUPER_RECORD simple_record_list )
            {
                // Part21.g:243:4: ^( SUBSUPER_RECORD simple_record_list )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SUBSUPER_RECORD, "SUBSUPER_RECORD"), root_1);

                adaptor.addChild(root_1, stream_simple_record_list.nextTree());

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "subsuper_record"

    public static class simple_record_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_record"
    // Part21.g:245:1: simple_record : keyword '(' ( parameter_list )? ')' -> ^( SIMPLE_RECORD keyword ( parameter_list )? ) ;
    public final simple_record_return simple_record() throws RecognitionException {
        simple_record_return retval = new simple_record_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal160=null;
        Token char_literal162=null;
        keyword_return keyword159 = null;

        parameter_list_return parameter_list161 = null;


        Object char_literal160_tree=null;
        Object char_literal162_tree=null;
        RewriteRuleTokenStream stream_69=new RewriteRuleTokenStream(adaptor,"token 69");
        RewriteRuleTokenStream stream_71=new RewriteRuleTokenStream(adaptor,"token 71");
        RewriteRuleSubtreeStream stream_keyword=new RewriteRuleSubtreeStream(adaptor,"rule keyword");
        RewriteRuleSubtreeStream stream_parameter_list=new RewriteRuleSubtreeStream(adaptor,"rule parameter_list");
        try {
            // Part21.g:245:15: ( keyword '(' ( parameter_list )? ')' -> ^( SIMPLE_RECORD keyword ( parameter_list )? ) )
            // Part21.g:245:17: keyword '(' ( parameter_list )? ')'
            {
            pushFollow(FOLLOW_keyword_in_simple_record1326);
            keyword159=keyword();

            state._fsp--;

            stream_keyword.add(keyword159.getTree());
            char_literal160=(Token)match(input,69,FOLLOW_69_in_simple_record1328);  
            stream_69.add(char_literal160);

            // Part21.g:245:29: ( parameter_list )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( ((LA22_0>=NULL_VALUE && LA22_0<=OMITTED_PARAMETER)||(LA22_0>=STANDARD_KEYWORD && LA22_0<=BINARY)||(LA22_0>=64 && LA22_0<=65)||LA22_0==69) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // Part21.g:245:29: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_simple_record1330);
                    parameter_list161=parameter_list();

                    state._fsp--;

                    stream_parameter_list.add(parameter_list161.getTree());

                    }
                    break;

            }

            char_literal162=(Token)match(input,71,FOLLOW_71_in_simple_record1333);  
            stream_71.add(char_literal162);



            // AST REWRITE
            // elements: keyword, parameter_list
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 246:1: -> ^( SIMPLE_RECORD keyword ( parameter_list )? )
            {
                // Part21.g:246:4: ^( SIMPLE_RECORD keyword ( parameter_list )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIMPLE_RECORD, "SIMPLE_RECORD"), root_1);

                adaptor.addChild(root_1, stream_keyword.nextTree());
                // Part21.g:246:28: ( parameter_list )?
                if ( stream_parameter_list.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter_list.nextTree());

                }
                stream_parameter_list.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simple_record"

    public static class simple_record_list_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "simple_record_list"
    // Part21.g:248:1: simple_record_list : ( simple_record )+ -> ^( SIMPLE_RECORD_LIST ( simple_record )+ ) ;
    public final simple_record_list_return simple_record_list() throws RecognitionException {
        simple_record_list_return retval = new simple_record_list_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        simple_record_return simple_record163 = null;


        RewriteRuleSubtreeStream stream_simple_record=new RewriteRuleSubtreeStream(adaptor,"rule simple_record");
        try {
            // Part21.g:248:20: ( ( simple_record )+ -> ^( SIMPLE_RECORD_LIST ( simple_record )+ ) )
            // Part21.g:248:22: ( simple_record )+
            {
            // Part21.g:248:22: ( simple_record )+
            int cnt23=0;
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==STANDARD_KEYWORD||LA23_0==64) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // Part21.g:248:22: simple_record
            	    {
            	    pushFollow(FOLLOW_simple_record_in_simple_record_list1354);
            	    simple_record163=simple_record();

            	    state._fsp--;

            	    stream_simple_record.add(simple_record163.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt23 >= 1 ) break loop23;
                        EarlyExitException eee =
                            new EarlyExitException(23, input);
                        throw eee;
                }
                cnt23++;
            } while (true);



            // AST REWRITE
            // elements: simple_record
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 249:1: -> ^( SIMPLE_RECORD_LIST ( simple_record )+ )
            {
                // Part21.g:249:4: ^( SIMPLE_RECORD_LIST ( simple_record )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(SIMPLE_RECORD_LIST, "SIMPLE_RECORD_LIST"), root_1);

                if ( !(stream_simple_record.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_simple_record.hasNext() ) {
                    adaptor.addChild(root_1, stream_simple_record.nextTree());

                }
                stream_simple_record.reset();

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
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "simple_record_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_62_in_exchange_file201 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_header_section_in_exchange_file203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_data_section_in_exchange_file205 = new BitSet(new long[]{0x8000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_63_in_exchange_file208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_user_defined_keyword_in_keyword233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STANDARD_KEYWORD_in_keyword237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_64_in_user_defined_keyword260 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_STANDARD_KEYWORD_in_user_defined_keyword262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_enumeration280 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_STANDARD_KEYWORD_in_enumeration282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_enumeration284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_header_section302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_file_description_in_header_section304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_file_name_in_header_section306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_file_schema_in_header_section308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003808L});
    public static final BitSet FOLLOW_file_population_in_header_section310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000003008L});
    public static final BitSet FOLLOW_section_language_in_header_section313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002008L});
    public static final BitSet FOLLOW_section_context_in_header_section316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_header_section320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_file_description352 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_file_description354 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_description_in_file_description356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_file_description358 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_implementation_level_in_file_description360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_file_description362 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_file_description364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_description386 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_description388 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_description391 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_description393 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_71_in_description397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_implementation_level419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_file_name439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_file_name441 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_name_in_file_name443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_file_name445 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_time_stamp_in_file_name447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_file_name449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_author_in_file_name451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_file_name453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_organization_in_file_name455 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_file_name457 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_preprocessor_version_in_file_name461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_file_name463 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_originating_system_in_file_name465 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_file_name467 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_authorization_in_file_name469 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_file_name471 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_file_name473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_name507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_time_stamp524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_author541 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_author543 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_author546 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_author548 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_71_in_author552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_organization570 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_organization572 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_organization575 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_organization577 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_71_in_organization581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_preprocessor_version602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_originating_system620 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_authorization638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_file_schema656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_file_schema658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_schema_identifiers_in_file_schema660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_file_schema662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_file_schema664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_schema_identifiers682 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_schema_identifiers684 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_schema_identifiers687 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_schema_identifiers689 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_71_in_schema_identifiers693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_file_population712 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_file_population714 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_governing_schema_in_file_population716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_file_population718 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_determination_method_in_file_population720 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_file_population723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_governed_sections_in_file_population725 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_file_population729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_file_population731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_governing_schema756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_determination_method774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_governed_sections792 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_governed_sections794 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_governed_sections797 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_governed_sections799 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_71_in_governed_sections803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_section_language822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_section_language824 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_section_in_section_language826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_section_language828 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_default_language_in_section_language830 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_section_language832 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_section_language834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_section853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_default_language871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_section_context888 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_section_context890 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_section_in_section_context892 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_section_context894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_context_identifiers_in_section_context896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_section_context898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_section_context900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_context_identifiers920 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_context_identifiers922 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_context_identifiers925 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_STRING_in_context_identifiers927 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_71_in_context_identifiers931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_header_entity950 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_header_entity952 = new BitSet(new long[]{0x003F00000000C000L,0x00000000000000A3L});
    public static final BitSet FOLLOW_parameter_list_in_header_entity954 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_header_entity957 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_header_entity959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameter_list980 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_parameter_list984 = new BitSet(new long[]{0x003F00000000C000L,0x0000000000000023L});
    public static final BitSet FOLLOW_parameter_in_parameter_list986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000040L});
    public static final BitSet FOLLOW_typed_parameter_in_parameter1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_untyped_parameter_in_parameter1014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OMITTED_PARAMETER_in_parameter1018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_typed_parameter1044 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_typed_parameter1046 = new BitSet(new long[]{0x003F00000000C000L,0x0000000000000023L});
    public static final BitSet FOLLOW_parameter_in_typed_parameter1048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_typed_parameter1050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NULL_VALUE_in_untyped_parameter1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_untyped_parameter1076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_REAL_in_untyped_parameter1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_untyped_parameter1083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENTITY_INSTANCE_NAME_in_untyped_parameter1086 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumeration_in_untyped_parameter1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BINARY_in_untyped_parameter1092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_list_in_untyped_parameter1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_list1137 = new BitSet(new long[]{0x003F00000000C000L,0x00000000000000A3L});
    public static final BitSet FOLLOW_parameter_in_list1141 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_70_in_list1145 = new BitSet(new long[]{0x003F00000000C000L,0x0000000000000023L});
    public static final BitSet FOLLOW_parameter_in_list1147 = new BitSet(new long[]{0x0000000000000000L,0x00000000000000C0L});
    public static final BitSet FOLLOW_71_in_list1155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_data_section1174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000120L});
    public static final BitSet FOLLOW_69_in_data_section1178 = new BitSet(new long[]{0x003F00000000C000L,0x0000000000000023L});
    public static final BitSet FOLLOW_parameter_list_in_data_section1180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_data_section1182 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_data_section1187 = new BitSet(new long[]{0x0010000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_entity_instance_list_in_data_section1189 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_data_section1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entity_instance_in_entity_instance_list1212 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ENTITY_INSTANCE_NAME_in_entity_instance1232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_entity_instance1234 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000021L});
    public static final BitSet FOLLOW_simple_entity_instance_in_entity_instance1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_complex_entity_instance_in_entity_instance1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_record_in_simple_entity_instance1265 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_simple_entity_instance1267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subsuper_record_in_complex_entity_instance1284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_complex_entity_instance1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_subsuper_record1304 = new BitSet(new long[]{0x0001000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_simple_record_list_in_subsuper_record1306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_subsuper_record1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_keyword_in_simple_record1326 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_69_in_simple_record1328 = new BitSet(new long[]{0x003F00000000C000L,0x00000000000000A3L});
    public static final BitSet FOLLOW_parameter_list_in_simple_record1330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_simple_record1333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_simple_record_in_simple_record_list1354 = new BitSet(new long[]{0x0001000000000002L,0x0000000000000001L});

}
// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 Part21.g 2022-05-29 16:40:24


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class Part21Lexer extends Lexer {
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

    public Part21Lexer() {;} 
    public Part21Lexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Part21Lexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "Part21.g"; }

    // $ANTLR start "OMITTED_PARAMETER"
    public final void mOMITTED_PARAMETER() throws RecognitionException {
        try {
            int _type = OMITTED_PARAMETER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:9:19: ( '*' )
            // Part21.g:9:21: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OMITTED_PARAMETER"

    // $ANTLR start "REVERSE_SOLIDUS"
    public final void mREVERSE_SOLIDUS() throws RecognitionException {
        try {
            int _type = REVERSE_SOLIDUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:10:17: ( '\\\\' )
            // Part21.g:10:19: '\\\\'
            {
            match('\\'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REVERSE_SOLIDUS"

    // $ANTLR start "APOSTROPHE"
    public final void mAPOSTROPHE() throws RecognitionException {
        try {
            int _type = APOSTROPHE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:11:12: ( '\\'' )
            // Part21.g:11:14: '\\''
            {
            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "APOSTROPHE"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:12:7: ( 'ISO-10303-21;' )
            // Part21.g:12:9: 'ISO-10303-21;'
            {
            match("ISO-10303-21;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:13:7: ( 'END-ISO-10303-21;' )
            // Part21.g:13:9: 'END-ISO-10303-21;'
            {
            match("END-ISO-10303-21;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:14:7: ( '!' )
            // Part21.g:14:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:15:7: ( '.' )
            // Part21.g:15:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:16:7: ( 'HEADER;' )
            // Part21.g:16:9: 'HEADER;'
            {
            match("HEADER;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:17:7: ( 'ENDSEC;' )
            // Part21.g:17:9: 'ENDSEC;'
            {
            match("ENDSEC;"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:18:7: ( 'FILE_DESCRIPTION' )
            // Part21.g:18:9: 'FILE_DESCRIPTION'
            {
            match("FILE_DESCRIPTION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:19:7: ( '(' )
            // Part21.g:19:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:20:7: ( ',' )
            // Part21.g:20:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:21:7: ( ')' )
            // Part21.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:22:7: ( ';' )
            // Part21.g:22:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:23:7: ( 'FILE_NAME' )
            // Part21.g:23:9: 'FILE_NAME'
            {
            match("FILE_NAME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:24:7: ( 'FILE_SCHEMA' )
            // Part21.g:24:9: 'FILE_SCHEMA'
            {
            match("FILE_SCHEMA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:25:7: ( 'FILE_POPULATION' )
            // Part21.g:25:9: 'FILE_POPULATION'
            {
            match("FILE_POPULATION"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:26:7: ( 'SECTION_LANGUAGE' )
            // Part21.g:26:9: 'SECTION_LANGUAGE'
            {
            match("SECTION_LANGUAGE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:27:7: ( 'SECTION_CONTEXT' )
            // Part21.g:27:9: 'SECTION_CONTEXT'
            {
            match("SECTION_CONTEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:28:7: ( 'DATA' )
            // Part21.g:28:9: 'DATA'
            {
            match("DATA"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:29:7: ( '=' )
            // Part21.g:29:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "ENTITY_INSTANCE_NAME"
    public final void mENTITY_INSTANCE_NAME() throws RecognitionException {
        try {
            int _type = ENTITY_INSTANCE_NAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:251:22: ( '#' ( DIGIT )+ )
            // Part21.g:251:24: '#' ( DIGIT )+
            {
            match('#'); 
            // Part21.g:251:28: ( DIGIT )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='0' && LA1_0<='9')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // Part21.g:251:28: DIGIT
            	    {
            	    mDIGIT(); 

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


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ENTITY_INSTANCE_NAME"

    // $ANTLR start "BINARY"
    public final void mBINARY() throws RecognitionException {
        try {
            int _type = BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:253:8: ( '\"\"' ( '0' | '1' | '2' | '3' ) ( HEX )* '\"\"' )
            // Part21.g:253:10: '\"\"' ( '0' | '1' | '2' | '3' ) ( HEX )* '\"\"'
            {
            match("\"\""); 

            if ( (input.LA(1)>='0' && input.LA(1)<='3') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Part21.g:253:41: ( HEX )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='F')||(LA2_0>='a' && LA2_0<='f')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // Part21.g:253:41: HEX
            	    {
            	    mHEX(); 

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match("\"\""); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BINARY"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:255:9: ( ( SIGN )? ( DIGIT )+ )
            // Part21.g:255:11: ( SIGN )? ( DIGIT )+
            {
            // Part21.g:255:11: ( SIGN )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='+'||LA3_0=='-') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // Part21.g:255:11: SIGN
                    {
                    mSIGN(); 

                    }
                    break;

            }

            // Part21.g:255:17: ( DIGIT )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // Part21.g:255:17: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:267:7: ( ( '\\'' (~ ( '\\'' ) | '\\'' '\\'' )* '\\'' ) )
            // Part21.g:268:4: ( '\\'' (~ ( '\\'' ) | '\\'' '\\'' )* '\\'' )
            {
            // Part21.g:268:4: ( '\\'' (~ ( '\\'' ) | '\\'' '\\'' )* '\\'' )
            // Part21.g:268:5: '\\'' (~ ( '\\'' ) | '\\'' '\\'' )* '\\''
            {
            match('\''); 
            // Part21.g:269:5: (~ ( '\\'' ) | '\\'' '\\'' )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0=='\'') ) {
                    int LA5_1 = input.LA(2);

                    if ( (LA5_1=='\'') ) {
                        alt5=2;
                    }


                }
                else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // Part21.g:270:8: ~ ( '\\'' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // Part21.g:270:19: '\\'' '\\''
            	    {
            	    match('\''); 
            	    match('\''); 

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match('\''); 

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "NULL_VALUE"
    public final void mNULL_VALUE() throws RecognitionException {
        try {
            int _type = NULL_VALUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:277:2: ( '$' )
            // Part21.g:277:4: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NULL_VALUE"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:280:5: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // Part21.g:280:9: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // Part21.g:280:14: ( options {greedy=false; } : . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='*') ) {
                    int LA6_1 = input.LA(2);

                    if ( (LA6_1=='/') ) {
                        alt6=2;
                    }
                    else if ( ((LA6_1>='\u0000' && LA6_1<='.')||(LA6_1>='0' && LA6_1<='\uFFFF')) ) {
                        alt6=1;
                    }


                }
                else if ( ((LA6_0>='\u0000' && LA6_0<=')')||(LA6_0>='+' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // Part21.g:280:42: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

            match("*/"); 

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STANDARD_KEYWORD"
    public final void mSTANDARD_KEYWORD() throws RecognitionException {
        try {
            int _type = STANDARD_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:284:18: ( ( UPPER | '_' ) ( UPPER | '_' | DIGIT )* )
            // Part21.g:284:21: ( UPPER | '_' ) ( UPPER | '_' | DIGIT )*
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // Part21.g:284:36: ( UPPER | '_' | DIGIT )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='0' && LA7_0<='9')||(LA7_0>='A' && LA7_0<='Z')||LA7_0=='_') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // Part21.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STANDARD_KEYWORD"

    // $ANTLR start "SPECIAL"
    public final void mSPECIAL() throws RecognitionException {
        try {
            int _type = SPECIAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:287:9: ( '!' | '\"\"' | '*' | '$' | '%' | '&' | '.' | '#' | '+' | ',' | '-' | '(' | ')' | '?' | '/' | ':' | ';' | '<' | '=' | '>' | '@' | '[' | ']' | '{' | '|' | '}' | '^' | '`' | '~' )
            int alt8=29;
            switch ( input.LA(1) ) {
            case '!':
                {
                alt8=1;
                }
                break;
            case '\"':
                {
                alt8=2;
                }
                break;
            case '*':
                {
                alt8=3;
                }
                break;
            case '$':
                {
                alt8=4;
                }
                break;
            case '%':
                {
                alt8=5;
                }
                break;
            case '&':
                {
                alt8=6;
                }
                break;
            case '.':
                {
                alt8=7;
                }
                break;
            case '#':
                {
                alt8=8;
                }
                break;
            case '+':
                {
                alt8=9;
                }
                break;
            case ',':
                {
                alt8=10;
                }
                break;
            case '-':
                {
                alt8=11;
                }
                break;
            case '(':
                {
                alt8=12;
                }
                break;
            case ')':
                {
                alt8=13;
                }
                break;
            case '?':
                {
                alt8=14;
                }
                break;
            case '/':
                {
                alt8=15;
                }
                break;
            case ':':
                {
                alt8=16;
                }
                break;
            case ';':
                {
                alt8=17;
                }
                break;
            case '<':
                {
                alt8=18;
                }
                break;
            case '=':
                {
                alt8=19;
                }
                break;
            case '>':
                {
                alt8=20;
                }
                break;
            case '@':
                {
                alt8=21;
                }
                break;
            case '[':
                {
                alt8=22;
                }
                break;
            case ']':
                {
                alt8=23;
                }
                break;
            case '{':
                {
                alt8=24;
                }
                break;
            case '|':
                {
                alt8=25;
                }
                break;
            case '}':
                {
                alt8=26;
                }
                break;
            case '^':
                {
                alt8=27;
                }
                break;
            case '`':
                {
                alt8=28;
                }
                break;
            case '~':
                {
                alt8=29;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // Part21.g:288:3: '!'
                    {
                    match('!'); 

                    }
                    break;
                case 2 :
                    // Part21.g:288:9: '\"\"'
                    {
                    match("\"\""); 


                    }
                    break;
                case 3 :
                    // Part21.g:288:16: '*'
                    {
                    match('*'); 

                    }
                    break;
                case 4 :
                    // Part21.g:288:22: '$'
                    {
                    match('$'); 

                    }
                    break;
                case 5 :
                    // Part21.g:288:28: '%'
                    {
                    match('%'); 

                    }
                    break;
                case 6 :
                    // Part21.g:288:34: '&'
                    {
                    match('&'); 

                    }
                    break;
                case 7 :
                    // Part21.g:288:40: '.'
                    {
                    match('.'); 

                    }
                    break;
                case 8 :
                    // Part21.g:288:46: '#'
                    {
                    match('#'); 

                    }
                    break;
                case 9 :
                    // Part21.g:289:3: '+'
                    {
                    match('+'); 

                    }
                    break;
                case 10 :
                    // Part21.g:289:9: ','
                    {
                    match(','); 

                    }
                    break;
                case 11 :
                    // Part21.g:289:15: '-'
                    {
                    match('-'); 

                    }
                    break;
                case 12 :
                    // Part21.g:289:21: '('
                    {
                    match('('); 

                    }
                    break;
                case 13 :
                    // Part21.g:289:27: ')'
                    {
                    match(')'); 

                    }
                    break;
                case 14 :
                    // Part21.g:289:33: '?'
                    {
                    match('?'); 

                    }
                    break;
                case 15 :
                    // Part21.g:289:39: '/'
                    {
                    match('/'); 

                    }
                    break;
                case 16 :
                    // Part21.g:289:45: ':'
                    {
                    match(':'); 

                    }
                    break;
                case 17 :
                    // Part21.g:290:3: ';'
                    {
                    match(';'); 

                    }
                    break;
                case 18 :
                    // Part21.g:290:9: '<'
                    {
                    match('<'); 

                    }
                    break;
                case 19 :
                    // Part21.g:290:15: '='
                    {
                    match('='); 

                    }
                    break;
                case 20 :
                    // Part21.g:290:21: '>'
                    {
                    match('>'); 

                    }
                    break;
                case 21 :
                    // Part21.g:290:27: '@'
                    {
                    match('@'); 

                    }
                    break;
                case 22 :
                    // Part21.g:290:33: '['
                    {
                    match('['); 

                    }
                    break;
                case 23 :
                    // Part21.g:290:39: ']'
                    {
                    match(']'); 

                    }
                    break;
                case 24 :
                    // Part21.g:290:45: '{'
                    {
                    match('{'); 

                    }
                    break;
                case 25 :
                    // Part21.g:291:3: '|'
                    {
                    match('|'); 

                    }
                    break;
                case 26 :
                    // Part21.g:291:9: '}'
                    {
                    match('}'); 

                    }
                    break;
                case 27 :
                    // Part21.g:291:15: '^'
                    {
                    match('^'); 

                    }
                    break;
                case 28 :
                    // Part21.g:291:21: '`'
                    {
                    match('`'); 

                    }
                    break;
                case 29 :
                    // Part21.g:291:27: '~'
                    {
                    match('~'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "SPECIAL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:294:5: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // Part21.g:294:9: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "UPPER"
    public final void mUPPER() throws RecognitionException {
        try {
            // Part21.g:301:16: ( 'A' .. 'Z' )
            // Part21.g:301:18: 'A' .. 'Z'
            {
            matchRange('A','Z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "UPPER"

    // $ANTLR start "LOWER"
    public final void mLOWER() throws RecognitionException {
        try {
            // Part21.g:304:16: ( 'a' .. 'z' )
            // Part21.g:304:18: 'a' .. 'z'
            {
            matchRange('a','z'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "LOWER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // Part21.g:307:16: ( '0' .. '9' )
            // Part21.g:307:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "REAL"
    public final void mREAL() throws RecognitionException {
        try {
            int _type = REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // Part21.g:309:6: ( INTEGER '.' ( DIGIT )* ( ( 'e' | 'E' ) INTEGER )? )
            // Part21.g:309:8: INTEGER '.' ( DIGIT )* ( ( 'e' | 'E' ) INTEGER )?
            {
            mINTEGER(); 
            match('.'); 
            // Part21.g:309:20: ( DIGIT )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // Part21.g:309:20: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            // Part21.g:309:27: ( ( 'e' | 'E' ) INTEGER )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='E'||LA10_0=='e') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // Part21.g:309:28: ( 'e' | 'E' ) INTEGER
                    {
                    if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                        input.consume();

                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;}

                    mINTEGER(); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "REAL"

    // $ANTLR start "HEX"
    public final void mHEX() throws RecognitionException {
        try {
            // Part21.g:311:14: ( DIGIT | 'A' .. 'F' | 'a' .. 'f' )
            // Part21.g:
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "HEX"

    // $ANTLR start "SIGN"
    public final void mSIGN() throws RecognitionException {
        try {
            // Part21.g:313:15: ( '+' | '-' )
            // Part21.g:
            {
            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "SIGN"

    public void mTokens() throws RecognitionException {
        // Part21.g:1:8: ( OMITTED_PARAMETER | REVERSE_SOLIDUS | APOSTROPHE | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | ENTITY_INSTANCE_NAME | BINARY | INTEGER | STRING | NULL_VALUE | COMMENT | STANDARD_KEYWORD | SPECIAL | WS | REAL )
        int alt11=31;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // Part21.g:1:10: OMITTED_PARAMETER
                {
                mOMITTED_PARAMETER(); 

                }
                break;
            case 2 :
                // Part21.g:1:28: REVERSE_SOLIDUS
                {
                mREVERSE_SOLIDUS(); 

                }
                break;
            case 3 :
                // Part21.g:1:44: APOSTROPHE
                {
                mAPOSTROPHE(); 

                }
                break;
            case 4 :
                // Part21.g:1:55: T__62
                {
                mT__62(); 

                }
                break;
            case 5 :
                // Part21.g:1:61: T__63
                {
                mT__63(); 

                }
                break;
            case 6 :
                // Part21.g:1:67: T__64
                {
                mT__64(); 

                }
                break;
            case 7 :
                // Part21.g:1:73: T__65
                {
                mT__65(); 

                }
                break;
            case 8 :
                // Part21.g:1:79: T__66
                {
                mT__66(); 

                }
                break;
            case 9 :
                // Part21.g:1:85: T__67
                {
                mT__67(); 

                }
                break;
            case 10 :
                // Part21.g:1:91: T__68
                {
                mT__68(); 

                }
                break;
            case 11 :
                // Part21.g:1:97: T__69
                {
                mT__69(); 

                }
                break;
            case 12 :
                // Part21.g:1:103: T__70
                {
                mT__70(); 

                }
                break;
            case 13 :
                // Part21.g:1:109: T__71
                {
                mT__71(); 

                }
                break;
            case 14 :
                // Part21.g:1:115: T__72
                {
                mT__72(); 

                }
                break;
            case 15 :
                // Part21.g:1:121: T__73
                {
                mT__73(); 

                }
                break;
            case 16 :
                // Part21.g:1:127: T__74
                {
                mT__74(); 

                }
                break;
            case 17 :
                // Part21.g:1:133: T__75
                {
                mT__75(); 

                }
                break;
            case 18 :
                // Part21.g:1:139: T__76
                {
                mT__76(); 

                }
                break;
            case 19 :
                // Part21.g:1:145: T__77
                {
                mT__77(); 

                }
                break;
            case 20 :
                // Part21.g:1:151: T__78
                {
                mT__78(); 

                }
                break;
            case 21 :
                // Part21.g:1:157: T__79
                {
                mT__79(); 

                }
                break;
            case 22 :
                // Part21.g:1:163: ENTITY_INSTANCE_NAME
                {
                mENTITY_INSTANCE_NAME(); 

                }
                break;
            case 23 :
                // Part21.g:1:184: BINARY
                {
                mBINARY(); 

                }
                break;
            case 24 :
                // Part21.g:1:191: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 25 :
                // Part21.g:1:199: STRING
                {
                mSTRING(); 

                }
                break;
            case 26 :
                // Part21.g:1:206: NULL_VALUE
                {
                mNULL_VALUE(); 

                }
                break;
            case 27 :
                // Part21.g:1:217: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 28 :
                // Part21.g:1:225: STANDARD_KEYWORD
                {
                mSTANDARD_KEYWORD(); 

                }
                break;
            case 29 :
                // Part21.g:1:242: SPECIAL
                {
                mSPECIAL(); 

                }
                break;
            case 30 :
                // Part21.g:1:250: WS
                {
                mWS(); 

                }
                break;
            case 31 :
                // Part21.g:1:253: REAL
                {
                mREAL(); 

                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\3\uffff\1\34\2\27\2\uffff\2\27\4\uffff\2\27\1\uffff\1\30\1\uffff"+
        "\1\30\1\55\1\uffff\1\30\2\uffff\1\30\4\uffff\2\27\2\uffff\2\27\4"+
        "\uffff\2\27\2\uffff\1\30\4\uffff\6\27\3\uffff\4\27\1\103\4\27\1"+
        "\uffff\7\27\2\uffff\13\27\1\136\5\27\1\uffff\5\27\1\151\4\27\1\uffff"+
        "\14\27\1\172\1\27\1\174\1\175\1\uffff\1\176\3\uffff";
    static final String DFA11_eofS =
        "\177\uffff";
    static final String DFA11_minS =
        "\1\11\2\uffff\1\0\1\123\1\116\2\uffff\1\105\1\111\4\uffff\1\105"+
        "\1\101\1\uffff\1\60\1\42\1\60\1\56\1\uffff\1\52\2\uffff\1\60\4\uffff"+
        "\1\117\1\104\2\uffff\1\101\1\114\4\uffff\1\103\1\124\2\uffff\1\60"+
        "\4\uffff\2\55\1\104\1\105\1\124\1\101\3\uffff\2\105\1\137\1\111"+
        "\1\60\1\103\1\122\1\104\1\117\1\uffff\2\73\1\105\1\101\1\103\1\117"+
        "\1\116\2\uffff\1\123\1\115\1\110\1\120\1\137\1\103\2\105\1\125\1"+
        "\103\1\122\1\60\1\115\1\114\1\101\1\117\1\111\1\uffff\2\101\2\116"+
        "\1\120\1\60\1\124\1\107\2\124\1\uffff\1\111\1\125\1\105\1\111\1"+
        "\117\1\101\1\130\1\117\1\116\1\107\1\124\1\116\1\60\1\105\2\60\1"+
        "\uffff\1\60\3\uffff";
    static final String DFA11_maxS =
        "\1\176\2\uffff\1\uffff\1\123\1\116\2\uffff\1\105\1\111\4\uffff\1"+
        "\105\1\101\1\uffff\1\71\1\42\2\71\1\uffff\1\52\2\uffff\1\71\4\uffff"+
        "\1\117\1\104\2\uffff\1\101\1\114\4\uffff\1\103\1\124\2\uffff\1\63"+
        "\4\uffff\1\55\1\123\1\104\1\105\1\124\1\101\3\uffff\2\105\1\137"+
        "\1\111\1\137\1\103\1\122\1\123\1\117\1\uffff\2\73\1\105\1\101\1"+
        "\103\1\117\1\116\2\uffff\1\123\1\115\1\110\1\120\1\137\1\103\2\105"+
        "\1\125\1\114\1\122\1\137\1\115\1\114\1\101\1\117\1\111\1\uffff\2"+
        "\101\2\116\1\120\1\137\1\124\1\107\2\124\1\uffff\1\111\1\125\1\105"+
        "\1\111\1\117\1\101\1\130\1\117\1\116\1\107\1\124\1\116\1\137\1\105"+
        "\2\137\1\uffff\1\137\3\uffff";
    static final String DFA11_acceptS =
        "\1\uffff\1\1\1\2\3\uffff\1\6\1\7\2\uffff\1\13\1\14\1\15\1\16\2\uffff"+
        "\1\25\4\uffff\1\32\1\uffff\1\34\1\35\1\uffff\1\36\1\1\1\3\1\31\2"+
        "\uffff\1\6\1\7\2\uffff\1\13\1\14\1\15\1\16\2\uffff\1\25\1\26\1\uffff"+
        "\1\30\1\37\1\32\1\33\6\uffff\1\27\1\4\1\5\11\uffff\1\24\7\uffff"+
        "\1\11\1\10\21\uffff\1\17\12\uffff\1\20\20\uffff\1\21\1\uffff\1\23"+
        "\1\12\1\22";
    static final String DFA11_specialS =
        "\3\uffff\1\0\173\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\32\2\uffff\1\32\22\uffff\1\32\1\6\1\22\1\21\1\25\2\30\1\3"+
            "\1\12\1\14\1\1\1\23\1\13\1\31\1\7\1\26\12\24\1\30\1\15\1\30"+
            "\1\20\3\30\3\27\1\17\1\5\1\11\1\27\1\10\1\4\11\27\1\16\7\27"+
            "\1\30\1\2\2\30\1\27\1\30\32\uffff\4\30",
            "",
            "",
            "\0\35",
            "\1\36",
            "\1\37",
            "",
            "",
            "\1\42",
            "\1\43",
            "",
            "",
            "",
            "",
            "\1\50",
            "\1\51",
            "",
            "\12\53",
            "\1\54",
            "\12\24",
            "\1\56\1\uffff\12\24",
            "",
            "\1\60",
            "",
            "",
            "\12\24",
            "",
            "",
            "",
            "",
            "\1\61",
            "\1\62",
            "",
            "",
            "\1\63",
            "\1\64",
            "",
            "",
            "",
            "",
            "\1\65",
            "\1\66",
            "",
            "",
            "\4\67",
            "",
            "",
            "",
            "",
            "\1\70",
            "\1\71\45\uffff\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "",
            "",
            "",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\12\27\7\uffff\32\27\4\uffff\1\27",
            "\1\104",
            "\1\105",
            "\1\106\11\uffff\1\107\1\uffff\1\111\2\uffff\1\110",
            "\1\112",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "",
            "",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\134\10\uffff\1\133",
            "\1\135",
            "\12\27\7\uffff\32\27\4\uffff\1\27",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\27\7\uffff\32\27\4\uffff\1\27",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\27\7\uffff\32\27\4\uffff\1\27",
            "\1\173",
            "\12\27\7\uffff\32\27\4\uffff\1\27",
            "\12\27\7\uffff\32\27\4\uffff\1\27",
            "",
            "\12\27\7\uffff\32\27\4\uffff\1\27",
            "",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( OMITTED_PARAMETER | REVERSE_SOLIDUS | APOSTROPHE | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | ENTITY_INSTANCE_NAME | BINARY | INTEGER | STRING | NULL_VALUE | COMMENT | STANDARD_KEYWORD | SPECIAL | WS | REAL );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA11_3 = input.LA(1);

                        s = -1;
                        if ( ((LA11_3>='\u0000' && LA11_3<='\uFFFF')) ) {s = 29;}

                        else s = 28;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 11, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}
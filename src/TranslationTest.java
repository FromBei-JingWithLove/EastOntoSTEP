
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.util.Hashtable;
import java.util.Map.Entry;
import java.util.Set;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.CommonTreeNodeStream;
import org.apache.log4j.Logger;

import org.semanticweb.owlapi.apibinding.OWLManager;
import org.semanticweb.owlapi.io.OWLFunctionalSyntaxOntologyFormat;
import org.semanticweb.owlapi.model.IRI;
import org.semanticweb.owlapi.model.OWLClass;
import org.semanticweb.owlapi.model.OWLDataFactory;
import org.semanticweb.owlapi.model.OWLDataProperty;
import org.semanticweb.owlapi.model.OWLImportsDeclaration;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLLiteral;
import org.semanticweb.owlapi.model.OWLNamedIndividual;
import org.semanticweb.owlapi.model.OWLObjectProperty;
import org.semanticweb.owlapi.model.OWLOntology;
import org.semanticweb.owlapi.model.OWLOntologyCreationException;
import org.semanticweb.owlapi.model.OWLOntologyManager;

public class TranslationTest {
    private static OWLOntologyManager manager;
    private static OWLDataFactory factory;
    private static OWLOntology ontologySchema;
    private static String sURISchema = "http://www.nist.gov/OntoSTEP/s";
    private static String sURIInstances = "http://www.nist.gov/OntoSTEP/instances";
    private static OWLOntology ontologyInstances;
    //	input EXPRESS and Part21 files
    private final static String sSchemaFileName = "schema_example.exp";
    private final static String sInstancesFileName = "p21_example.stp";

    private static OWLHelper hI;
    private static OWLHelper hS;


    //Supertypes
    private static OWLClass owlcB;
    private static OWLClass owlcC;

    // Instantiation
    private static OWLClass owlcA;
    private static OWLNamedIndividual owli1;

    // String datatype
    private static OWLObjectProperty owlopChaine;
    private static OWLNamedIndividual owlichaine;
    private static OWLClass owlcString;
    private static OWLDataProperty owldpString;

    // Real datatype
    private static OWLObjectProperty owlopReel;
    private static OWLNamedIndividual owliReel;
    private static OWLClass owlcReal;
    private static OWLDataProperty owldpReal;

    // Number datatype
    private static OWLObjectProperty owlopNombre;
    private static OWLNamedIndividual owliNombre;
    private static OWLClass owlcNumber;
    private static OWLDataProperty owldpNumber;

    // Boolean datatype
    private static OWLObjectProperty owlopBooleen;
    private static OWLNamedIndividual owliBooleen;
    private static OWLClass owlcBoolean;
    private static OWLDataProperty owldpBoolean;

    // User-defined datatype
    private static OWLObjectProperty owlopTreel;
    private static OWLNamedIndividual owliTreel;
    private static OWLClass owlcTreal;
    private static OWLDataProperty owldpTreal;

    // Select
    private static OWLObjectProperty owlopSelection;
    private static OWLClass owlcS;
    private static OWLClass owlcD;

    // Enumeration
    private static OWLObjectProperty owlopEnumer;
    private static OWLClass owlcE;
    private static OWLNamedIndividual owliE1;
    private static OWLNamedIndividual owliE2;

    // List attribute
    private static OWLClass owlcList;
    private static OWLClass owlcListE;
    private static OWLObjectProperty owlopAgr1;
    private static OWLObjectProperty owlopListNext;
    private static OWLObjectProperty owlopListContent;
    private static OWLNamedIndividual owliList1;
    private static OWLNamedIndividual owliList2;
    private static OWLNamedIndividual owliListE;
    private static OWLClass owlcBag;
    private static OWLClass owlcBagC;
    private static OWLObjectProperty owlopBagContent;
    private static OWLObjectProperty owlopBagContentValue;
    private static OWLNamedIndividual owliBag1;
    private static OWLNamedIndividual owliBag2;
    private static OWLNamedIndividual owliBagContent11;
    private static OWLNamedIndividual owliBagContent21;
    private static OWLNamedIndividual owliBagContent12;
    private static OWLNamedIndividual owliBagContent22;
    private static OWLNamedIndividual owliBagContentValue11;
    private static OWLNamedIndividual owliBagContentValue21;
    private static OWLNamedIndividual owliBagContentValue12;
    private static OWLNamedIndividual owliBagContentValue22;

    private static OWLClass owlcSet;
    private static OWLObjectProperty owlopSetContent;
    private static OWLNamedIndividual owliSet;
    private static OWLClass owlcArray;
    private static OWLClass owlcArrayE;
    private static OWLObjectProperty owlopAgr2;
    private static OWLObjectProperty owlopArrayNext;
    private static OWLObjectProperty owlopArrayContent;
    private static OWLNamedIndividual owliArray11;
    private static OWLNamedIndividual owliArray12;
    private static OWLNamedIndividual owliArray1E;
    private static OWLNamedIndividual owliArray21;
    private static OWLNamedIndividual owliArray22;
    private static OWLNamedIndividual owliArray2E;
    private static OWLNamedIndividual owli2;
    private static OWLNamedIndividual owli3;
    private static OWLNamedIndividual owli4;
    private static OWLNamedIndividual owli5;


    static Logger log = Logger.getLogger(TranslationTest.class);


    public static void main(String[] args) throws OWLOntologyCreationException {
        oneTimeSetUp();
    }

    public static void oneTimeSetUp() throws OWLOntologyCreationException {
        manager = OWLManager.createOWLOntologyManager();
        factory = manager.getOWLDataFactory();
        ontologySchema = manager.createOntology(IRI.create(sURISchema));

        Hashtable<String, String> htRDL = new Hashtable<String, String>();
        htRDL.put("urn:plcs:rdl:std", "http://whateverrdl.com/std_rdl");


        CommonTree exptree = null;
        CommonTokenStream exptokens = null;

        ExpressLexer explexer;
        ExpressParser expparser;

        Hashtable<String, Scope> scopes = new Hashtable<String, Scope>();

        Scope rootScope = null;

        try {
            /* First pass initialization */
            explexer = new ExpressLexer();
            explexer.setCharStream(new FileStreamLower(sSchemaFileName));
            exptokens = new CommonTokenStream(explexer);
            expparser = new ExpressParser(exptokens);
            explexer.setParser(expparser);

            /* First pass */
            expparser.start();

            rootScope = expparser.rootScope;

            // Store the schema scopes
            Hashtable<String, Scope> schemas = expparser.getSchemas();
            for (Entry<String, Scope> entry : schemas.entrySet()) {
                String key = entry.getKey().toLowerCase();
                Scope value = entry.getValue();
                if (scopes.contains(key))
                    log.warn("Schema " + key
                            + " already processed !");
                else {
                    scopes.put(key, value);
                }
            }

        } catch (RecognitionException re) {
            log.error("The file " + sSchemaFileName + " could not be parsed",
                    re);
        } catch (IOException ioe) {
            log
                    .error("The file " + sSchemaFileName
                            + " could not be read", ioe);
            return;
        } catch (Exception e) {
            log.error("Exception for the file " + sSchemaFileName, e);
            return;
        }

        for (Entry<String, Scope> ent : scopes.entrySet()) {
            log.debug("processing uses for " + ent.getKey());
            ent.getValue().processUses(scopes);
        }
        for (Entry<String, Scope> ent : scopes.entrySet()) {
            log.debug("processing references for " + ent.getKey());
            ent.getValue().processReferences(scopes);
        }
        try {
            log.debug("second pass on " + sSchemaFileName);
            /* second pass initialization */
            explexer = new ExpressLexer();
            explexer.setCharStream(new FileStreamLower(sSchemaFileName));
            exptokens = new CommonTokenStream(explexer);
            exptokens.discardTokenType(ExpressParser.COMMENT);
            exptokens.discardTokenType(ExpressParser.LINECOMMENT);
            expparser = new ExpressParser(exptokens);
            explexer.setParser(expparser);
            expparser.setRootScope(rootScope);

            /* second pass */
            // Store the tree
            exptree = (CommonTree) expparser.start().getTree();

            // Store the tokens
            log.debug("Second pass finished");
        } catch (RecognitionException re) {
            log.error("The file " + sSchemaFileName + " could not be parsed",
                    re);
            return;
        } catch (IOException ioe) {
            log
                    .error("The file " + sSchemaFileName
                            + " could not be read", ioe);
            return;
        } catch (Exception e) {
            log.error("Exception for the file " + sSchemaFileName, e);
            return;
        }

        // Processing the external references/uses

        /* OWL generation */
        try {
            CommonTreeNodeStream expnodes = new CommonTreeNodeStream(
                    exptree);
            expnodes.setTokenStream(exptokens);
            OWLSchema expwalker = new OWLSchema(expnodes);

            String ontoPrefix = "http://www.nist.gov/OntoSTEP/";

            expwalker.setManager(manager);
            expwalker.setOntoURI(ontoPrefix);
            expwalker.setScopes(scopes);

            expwalker.setOntology(ontologySchema);
            expwalker.syntax();
            manager.saveOntology(ontologySchema, new OWLFunctionalSyntaxOntologyFormat(), IRI.create(new File("schema_example2.owl")));
        } catch (RecognitionException re) {
            log.error("The translation for the file " + sSchemaFileName
                    + " could not be completed", re);
            return;
        } catch (Exception e) {
            log.error("Exception for the file " + sSchemaFileName, e);
            return;
        }

        ontologyInstances = manager.createOntology(IRI.create(sURIInstances));

        Part21Lexer p21lexer = new Part21Lexer();
        try {
            p21lexer.setCharStream(new ANTLRFileStream(sInstancesFileName));
            CommonTokenStream p21tokens = new CommonTokenStream(p21lexer);
            p21tokens.discardTokenType(Part21Lexer.COMMENT);
            Part21Parser p21parser = new Part21Parser(p21tokens);
            CommonTree p21tree = (CommonTree) p21parser.exchange_file().getTree();
            CommonTreeNodeStream p21nodes = new CommonTreeNodeStream(
                    p21tree);
            p21nodes.setTokenStream(p21tokens);
            OWLInstances p21walker = new OWLInstances(p21nodes);

            p21walker.setManager(manager);
            p21walker.setRDL(htRDL);
            p21walker.setOntology(ontologyInstances);
            p21walker.setSP21Location(sInstancesFileName);
            p21walker.setInstancesURL("p21_example.stp.owl");

            p21walker.exchange_file();
        } catch (RecognitionException re) {
            log.error("The file " + sInstancesFileName + " could not be parsed",
                    re);
            return;
        } catch (IOException ioe) {
            log
                    .error("The file " + sInstancesFileName
                            + " could not be read", ioe);
            return;
        } catch (Exception e) {
            log.error("Exception for the file " + sInstancesFileName, e);
            return;
        }
    }

}

// $ANTLR 3.1.3 Mar 18, 2009 10:09:25 OWLInstances.g 2022-05-29 16:40:26

import java.io.File;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Set;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Collection;

import org.apache.log4j.Logger;
import org.semanticweb.owlapi.apibinding.OWLManager;

import org.semanticweb.owlapi.io.OWLFunctionalSyntaxOntologyFormat;
import org.semanticweb.owlapi.model.OWLAxiom;
import org.semanticweb.owlapi.model.*;





import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class OWLInstances extends TreeParser {
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


        public OWLInstances(TreeNodeStream input) {
            this(input, new RecognizerSharedState());
        }
        public OWLInstances(TreeNodeStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return OWLInstances.tokenNames; }
    public String getGrammarFileName() { return "OWLInstances.g"; }


            
            static Logger log = Logger.getLogger(OWLInstances.class);

            private OWLDataFactory factory;
            private OWLOntology instances;
            private OWLOntologyManager manager;
            private ArrayList<OWLOntology> models;
            private OWLHelper h;
            private Set<OWLAxiom> newAxioms;
            private Set<String> entityRestrictions;

            private String sSchemaURL;
            private String sInstancesURL;

            private OWLOntologyFormat fInstancesFormat;

            private String sInstancesURN;

            private ArrayList<String> alModelURN;

            private String sP21Location;
           
            private String sCurrentPrefix;

    		private OWLNamedIndividual oiCurrentInstance;
    		private OWLClass ocCurrentClass;
    		private OWLClass ocCurrentType;
    		private Hashtable<String, String> htRDL;
    		
    		public void setRDL(Hashtable<String, String> rdl)
    		{
    			htRDL = rdl;
    		}
    		
    		public void setManager(OWLOntologyManager manager)
    		{
    			this.manager = manager;
    		}

    		public void setOntology(OWLOntology ontology)
    		{
    			instances = ontology;
    		}

    		public void setSP21Location(String location)
    		{
    			sP21Location = location;
    		}

    		public void setInstancesURL(String location)
    		{
    			sInstancesURL = location;
    		}
    		
    		public void setInstancesFormat(OWLOntologyFormat format)
    		{
    			fInstancesFormat = format;
    		}

    		public void setSchemaURL(String location)
    		{
    			sSchemaURL = location;
    		}
    		
    		public void setRestrictions(Set<String> set)
    		{
    			entityRestrictions = set;
    		}
    		

            private void addAxiom(OWLAxiom e)
            {
                    newAxioms.add(e);
            }
    	
    		public OWLOntology getOntology(OWLEntity entity)
    		{
    			String sIRI = getOntologyName(entity);
    			OWLOntology onto = manager.getOntology(IRI.create(sIRI));
    			if (onto == null)
    				log.error("The ontology " + sIRI + " does not exist");
    			return onto;
    		}		
    		
    		public OWLOntology getOntology(String sIRI)
    		{
    			OWLOntology onto = manager.getOntology(IRI.create(sIRI));
    			if (onto == null)
    				log.error("The ontology " + sIRI + " does not exist");
    			return onto;
    		}
    		
    		public static String getOntologyName(OWLEntity entity)
    		{
    			String sIRI = entity.getIRI().toString();
    			return sIRI.substring(0, sIRI.indexOf("#"));
    			
    		}		
    		private Hashtable<String, OWLClass> htClasses;
    		private Hashtable<String, OWLClass> htTypes;
    		
    		private OWLClass lookForType(String name)
    		{
    			return lookForType(name, true);
    		}
    		
    		private OWLClass lookForType(String name, boolean error)
    		{
    			if (name == null)
    				return null;
    			if (htTypes == null)
    			{
    				htTypes = new Hashtable<String, OWLClass>();
    				for (String model : alModelURN)
    				{
    					OWLOntology ontology = manager.getOntology(IRI.create(model));
    					if (ontology == null)
    					{
    						log.error("Cannot find the ontology " + model);
    						continue;
    					}
    					for(OWLClass owlc : ontology.getClassesInSignature())
    					{
    						String n = owlc.getIRI().getFragment();
    						if (htTypes.get(n) != null)
    							log.error("Multiple OWL classes with the same name: " + owlc + " and " + htTypes.get(n));
    						else
    							htTypes.put(n, owlc);
    					}
    				}
    			}
    			if (htTypes.containsKey(name))
    				return htTypes.get(name);
    			if (error)
    				log.error("Class " + name + " not found in any schema, skipping...");
    			return null;
    		}
    		
    		private OWLClass lookForClass(String name)
    		{
    			if (name == null)
    				return null;
    			if (htClasses == null)
    			{
    				htClasses = new Hashtable<String, OWLClass>();
    				if (entityRestrictions == null)
    				{
    					for (String model : alModelURN)
    					{
    						OWLOntology ontology = manager.getOntology(IRI.create(model));
    						if (ontology == null)
    						{
    							log.error("Cannot find the ontology " + model);
    							continue;
    						}
    						for(OWLClass owlc : ontology.getClassesInSignature())
    						{
    							String n = owlc.getIRI().getFragment();
    							if (htClasses.get(n) != null)
    								log.error("Multiple OWL classes with the same name: " + owlc + " and " + htClasses.get(n));
    							else
    								htClasses.put(n, owlc);
    						}
    					}
    				}
    				else
    				{
    					Set<OWLOntology> setonto = new HashSet<OWLOntology>();
    					Set<OWLClass> current = new HashSet<OWLClass>();
    					for (String model : alModelURN)
    					{
    						OWLOntology ontology = manager.getOntology(IRI.create(model));
    						if (ontology == null)
    						{
    							log.error("Cannot find the ontology " + model);
    							continue;
    						}
    						setonto.add(ontology);
    						for(String re : entityRestrictions)
    						{
    							OWLClass owlc = h.getClas(model, re);
    							if (ontology.containsClassInSignature(owlc.getIRI()))
    							{
    								current.add(owlc);
    								log.info("adding " + owlc + " to the list");
    								String n = owlc.getIRI().getFragment();
    								if (htClasses.get(n) != null)
    									log.error("Multiple OWL classes with the same name: " + owlc + " and " + htClasses.get(n));
    								else
    									htClasses.put(n, owlc);
    							}
    						}
    					}
    					
    					do
    					{
    						Set<OWLClass> next = new HashSet<OWLClass>();
    						for(OWLClass owlc : current)
    						{
    							for(OWLClassExpression owlce : owlc.getSubClasses(setonto))
    								if (owlce instanceof OWLClass)
    								{
    									OWLClass owlc2 = (OWLClass)owlce;
    									next.add(owlc2);
    									log.info("adding " + owlc2 + " to the list");
    									String n = owlc2.getIRI().getFragment();
    									if (htClasses.get(n) != null)
    										log.error("Multiple OWL classes with the same name: " + owlc2 + " and " + htClasses.get(n));
    									else
    										htClasses.put(n, owlc2);
    								}
    						}
    						current = next;
    					} while(current.size() != 0);
    				}
    			}
    			
    			if (htClasses.containsKey(name))
    				return htClasses.get(name);
    			else if (entityRestrictions == null)
    			{
    				log.error("Class " + name + " not found in any schema, skipping...");
    			}
    			else if (entityRestrictions.contains(name))
    			{
    				log.error("The class " + name + " is supposed to be in the schema");
    			}
    			return null;
    		}
    		
    		private Hashtable<String, OWLNamedIndividual> htIndividuals; 
    		private OWLNamedIndividual lookForIndividual(String name)
    		{
    			if (name == null)
    				return null;
    			if (htIndividuals.containsKey(name))
    				return htIndividuals.get(name);
    			ArrayList<OWLNamedIndividual> alIndividuals= new ArrayList<OWLNamedIndividual>();
    			for(String sURN : alModelURN)
    			{
    				OWLOntology ontology = manager.getOntology(IRI.create(sURN));
    				OWLNamedIndividual indi = h.getNamedIndividual(sURN, name);
    				{
    					if (ontology.containsIndividualInSignature(indi.getIRI()))
    					{
    						alIndividuals.add(indi);
    					}
    					else
    					{
    						log.debug(name + " not defined in " + sURN);
    					}
    				}
    			}
    			if (alIndividuals.size() == 0)
    			{
    				log.error("Individual " + name + " not found in any schema, skipping...");
    				return null;
    			}
    			if (alIndividuals.size() > 1)
    			{
    				String sIndividuals = "";
    				for(OWLNamedIndividual indi : alIndividuals)
    					sIndividuals += " " + indi.getIRI();
    				log.warn("More than one individual found for " + name + ":" + sIndividuals);
    			}
    			return alIndividuals.get(0);
    		}
    		
    		private Hashtable<OWLClass, List<OWLObjectProperty>> htParameters; 
    		private Hashtable<OWLObjectProperty, String> htAttributeName;
    		
       		private OWLObjectProperty[] lookForParameters(OWLClass oclass)
    		{
    			if (htParameters.get(oclass) != null)
    				return htParameters.get(oclass).toArray(new OWLObjectProperty[0]);
    				
    			String sIRI = getOntologyName(oclass);
    			OWLOntology onto = getOntology(sIRI);
    			
    			LinkedList<OWLObjectProperty> alParameters = new LinkedList<OWLObjectProperty>();

    			TreeMap<String, OWLClass> tmSupertypes = new TreeMap<String, OWLClass>();
    			
    			for(OWLSubClassOfAxiom sca : onto.getSubClassAxiomsForSubClass(oclass))
    			{
    				String sSI = h.getLiteral(onto, h.getIRISupertypeIndex(sIRI), sca);
    				if (sSI == null)
    					continue;
    				OWLClassExpression desc = sca.getSuperClass();
    				if (desc.equals(factory.getOWLThing()) || !(desc instanceof OWLClass))
    					continue;
    				
    				tmSupertypes.put(sSI, (OWLClass)desc);
    			}
    			
    			for(OWLClass clas : tmSupertypes.values())
    			{
    				List<OWLObjectProperty> lParams = htParameters.get(clas);
    				if (lParams != null)
    				{
    					for(OWLObjectProperty param : lParams)
    						if (!alParameters.contains(param))
    							alParameters.addLast(param);
    					continue;
    				}
    				String sIRI2 = getOntologyName(clas);
    				OWLOntology onto2 = getOntology(sIRI2);
    				String expcon = h.getLiteral(onto2, h.getIRIExpressConstruct(sIRI2), clas);
    				if (expcon != null && expcon.equals("entity"))
    				{
    					OWLObjectProperty[] tab = lookForParameters(clas);
    					for(int i=0;i<tab.length;i++)
    						if (!alParameters.contains(tab[i]))
    							alParameters.addLast(tab[i]);
    				}
    			}

    			TreeMap<String, OWLObjectProperty> tmParameters = new TreeMap<String, OWLObjectProperty>();
    			
    			for(OWLObjectProperty op : onto.getObjectPropertiesInSignature())
    			{
    				for(OWLClassExpression domain : op.getDomains(onto))
    				{
    					if (domain.equals(oclass))
    					{
    						String spi = h.getLiteral(onto, h.getIRIParameterIndex(sIRI), op);
    						if (spi != null)
    						{
    							tmParameters.put(spi, op);
    							// OK this seems stupid because we can simply make an indexOf _has_, 
    							// but this is the only solution to manage _has_ in the attribute name
    							htAttributeName.put(op, h.getOPAttribute(op.getIRI().getFragment(), oclass.getIRI().getFragment()));
    							
    						}
    						else
    						{
    							log.warn("No parameter index for " + op);
    						}
    					}
    				}
    			}
    			alParameters.addAll(tmParameters.values());
    			htParameters.put(oclass, alParameters);
    			return alParameters.toArray(new OWLObjectProperty[0]);
    		}
    		



    // $ANTLR start "exchange_file"
    // OWLInstances.g:383:1: exchange_file : ^( EXCHANGE_FILE header_section ( data_section )+ ) ;
    public final void exchange_file() throws RecognitionException {
        try {
            // OWLInstances.g:383:15: ( ^( EXCHANGE_FILE header_section ( data_section )+ ) )
            // OWLInstances.g:383:17: ^( EXCHANGE_FILE header_section ( data_section )+ )
            {
            match(input,EXCHANGE_FILE,FOLLOW_EXCHANGE_FILE_in_exchange_file41); 


            	if (manager == null)
            		manager = OWLManager.createOWLOntologyManager();
                factory = manager.getOWLDataFactory();
                newAxioms = new HashSet<OWLAxiom>();
                if (sInstancesURL != null)
                {
                    // create the instance ontology
                    sInstancesURN = "http://www.nist.gov/OntoSTEP/test.owl";
                }
                if (instances == null)
                {
                    instances = manager.createOntology(IRI
                                    .create(sInstancesURN));
                }
                else
                {
                    log.debug("Setting the IRI to " + manager.getOntologyDocumentIRI(instances));
                    sInstancesURN = manager.getOntologyDocumentIRI(instances).toString();
                }
                if (sSchemaURL != null)
            		try
            		{
            	 		manager.loadOntology(IRI.create(new File(sSchemaURL)));
            	 	}
            	 	catch(Exception e)
            	 	{
            	 		log.warn("Could not load the ontology " + sSchemaURL, e);
            	 	}
            	    
             
             
                log.debug("Creating helper for " + sInstancesURN);
            	h = new OWLHelper(factory, sInstancesURN);
            	htIndividuals = new Hashtable<String, OWLNamedIndividual>();
            	htParameters = new Hashtable<OWLClass, List<OWLObjectProperty>>();
            	htAttributeName = new Hashtable<OWLObjectProperty, String>();


            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_header_section_in_exchange_file46);
            header_section();

            state._fsp--;

            // OWLInstances.g:422:16: ( data_section )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==DATA_SECTION) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // OWLInstances.g:422:16: data_section
            	    {
            	    pushFollow(FOLLOW_data_section_in_exchange_file48);
            	    data_section();

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

            	manager.addAxioms(instances, newAxioms);
            	newAxioms.clear();
            	if (htRDL != null)
            	{
            		log.info("RDL present, it contains:");
            		for(Entry<String, String> ent : htRDL.entrySet())
            			log.info(ent.getKey() + "-" + ent.getValue());
            		// ARM version
            		OWLClass cclass_ass = lookForType("classification_assignment");
            		
            		if (cclass_ass != null)
            		{
            			log.info(cclass_ass + " class found, adding Reference Data...");
            			Set<OWLIndividual> siclass_ass = cclass_ass.getIndividuals(instances);
            			String sschema = cclass_ass.getIRI().getStart();
            			sschema = sschema.substring(0, sschema.length()-1);
            			
            			OWLObjectProperty opitem = h.getOP(sschema, "classification_assignment_has_items");
            			OWLObjectProperty opitem2 = h.getOP(sschema, "set_of_classification_item_has_content");
            			OWLObjectProperty opassigned_class = h.getOP(sschema, "classification_assignment_has_assigned_class");
            			OWLObjectProperty opnameclass = h.getOP(sschema, "class_has_name");
            			OWLDataProperty dptostring = h.getDP(sschema, "to_string");
            			OWLObjectProperty oplibrary = h.getOP(sschema, "external_class_has_external_source");
            			OWLObjectProperty opidlibrary = h.getOP(sschema, "external_class_library_has_id");
            			
            			for(OWLIndividual iclass_ass : siclass_ass)
            			{
            				// really don't want to make it properly and check everything, so...
            				try
            				{
            					Set<OWLIndividual> siclass = iclass_ass.getObjectPropertyValues(instances).get(opassigned_class);
            					OWLIndividual iclass = siclass.iterator().next();
            					
            					Set<OWLIndividual> isclanames = iclass.getObjectPropertyValues(instances).get(opnameclass);
            					OWLIndividual isclaname = isclanames.iterator().next();
            					
            					Set<OWLLiteral> sclanames = isclaname.getDataPropertyValues(instances).get(dptostring);
            					String sclaname = sclanames.iterator().next().getLiteral();
            					
            					Set<OWLIndividual> silibrary = iclass.getObjectPropertyValues(instances).get(oplibrary);
            					OWLIndividual ilibrary = silibrary.iterator().next();
            					
            					Set<OWLIndividual> islibids = ilibrary.getObjectPropertyValues(instances).get(opidlibrary);
            					OWLIndividual islibid = islibids.iterator().next();
            					
            					Set<OWLLiteral> slibids = islibid.getDataPropertyValues(instances).get(dptostring);
            					String slibid = slibids.iterator().next().getLiteral();

            					if (htRDL.get(slibid) == null)
            					{
            						log.warn("Can't find the library " + slibid);
            						continue;
            					}
            					
            					
            					OWLClass ord = h.getClas(htRDL.get(slibid), sclaname);
            					log.info(slibid + "#" + sclaname + " replaced by " + ord + ", from " + htRDL.get(slibid));
            					Set<OWLIndividual> siitem = iclass_ass.getObjectPropertyValues(instances).get(opitem);

            					OWLIndividual iitem = siitem.iterator().next();
            						
            					Set<OWLIndividual> siitem2 = iitem.getObjectPropertyValues(instances).get(opitem2);
            					for(OWLIndividual iitem2 : siitem2)
            					{
            						log.info("Item " + iitem2 + " classified as " + ord);
            						addAxiom(h.getClassAssertionAxiom(ord, iitem2));
            					}
            				}
            				catch(Exception e)
            				{
            					log.warn("could not assign reference data " + iclass_ass);
            				}
            			}
            		}
            		else
            		{
            			log.info(cclass_ass + " class not found, cannot add Reference Data");
            		}
            	}

            	manager.addAxioms(instances, newAxioms);
            	
            	if (sInstancesURL != null)
            	{
            		if (fInstancesFormat == null)
            			fInstancesFormat = new OWLFunctionalSyntaxOntologyFormat();
            		manager.saveOntology(instances, fInstancesFormat, IRI.create(new File(sInstancesURL)));
            		log.debug("Ontology saved");
            	}



            }

        }
        catch (OWLOntologyCreationException e) {
            log.error("Could not create the ontology", e);
        }
        catch (OWLOntologyChangeException e) {
            log.error("Could not add the axioms to the ontology", e);
        }
        catch (OWLOntologyStorageException e) {
            log.error("Could not save the ontology", e);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exchange_file"


    // $ANTLR start "header_section"
    // OWLInstances.g:520:1: header_section : ^( HEADER_SECTION file_description file_name file_schema ( file_population )? ( section_language )? ( section_context )? ) ;
    public final void header_section() throws RecognitionException {
        try {
            // OWLInstances.g:520:16: ( ^( HEADER_SECTION file_description file_name file_schema ( file_population )? ( section_language )? ( section_context )? ) )
            // OWLInstances.g:520:18: ^( HEADER_SECTION file_description file_name file_schema ( file_population )? ( section_language )? ( section_context )? )
            {
            match(input,HEADER_SECTION,FOLLOW_HEADER_SECTION_in_header_section80); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_file_description_in_header_section82);
            file_description();

            state._fsp--;

            pushFollow(FOLLOW_file_name_in_header_section84);
            file_name();

            state._fsp--;

            pushFollow(FOLLOW_file_schema_in_header_section86);
            file_schema();

            state._fsp--;

            // OWLInstances.g:520:74: ( file_population )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==FILE_POPULATION) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // OWLInstances.g:520:74: file_population
                    {
                    pushFollow(FOLLOW_file_population_in_header_section88);
                    file_population();

                    state._fsp--;


                    }
                    break;

            }

            // OWLInstances.g:520:91: ( section_language )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==SECTION_LANGUAGE) ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==DOWN) ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3==SECTION) ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4==DOWN) ) {
                            int LA3_5 = input.LA(5);

                            if ( (LA3_5==STRING) ) {
                                int LA3_6 = input.LA(6);

                                if ( (LA3_6==UP) ) {
                                    int LA3_7 = input.LA(7);

                                    if ( (LA3_7==DEFAULT_LANGUAGE) ) {
                                        alt3=1;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            switch (alt3) {
                case 1 :
                    // OWLInstances.g:520:91: section_language
                    {
                    pushFollow(FOLLOW_section_language_in_header_section91);
                    section_language();

                    state._fsp--;


                    }
                    break;

            }

            // OWLInstances.g:520:109: ( section_context )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==SECTION_LANGUAGE) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // OWLInstances.g:520:109: section_context
                    {
                    pushFollow(FOLLOW_section_context_in_header_section94);
                    section_context();

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
    // $ANTLR end "header_section"


    // $ANTLR start "file_description"
    // OWLInstances.g:522:1: file_description : ^( FILE_DESCRIPTION description implementation_level ) ;
    public final void file_description() throws RecognitionException {
        try {
            // OWLInstances.g:523:2: ( ^( FILE_DESCRIPTION description implementation_level ) )
            // OWLInstances.g:523:4: ^( FILE_DESCRIPTION description implementation_level )
            {
            match(input,FILE_DESCRIPTION,FOLLOW_FILE_DESCRIPTION_in_file_description106); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_description_in_file_description108);
            description();

            state._fsp--;

            pushFollow(FOLLOW_implementation_level_in_file_description110);
            implementation_level();

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
    // $ANTLR end "file_description"


    // $ANTLR start "description"
    // OWLInstances.g:526:1: description : ^( DESCRIPTION ( STRING )+ ) ;
    public final void description() throws RecognitionException {
        try {
            // OWLInstances.g:527:2: ( ^( DESCRIPTION ( STRING )+ ) )
            // OWLInstances.g:527:4: ^( DESCRIPTION ( STRING )+ )
            {
            match(input,DESCRIPTION,FOLLOW_DESCRIPTION_in_description123); 

            match(input, Token.DOWN, null); 
            // OWLInstances.g:527:18: ( STRING )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==STRING) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // OWLInstances.g:527:18: STRING
            	    {
            	    match(input,STRING,FOLLOW_STRING_in_description125); 

            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
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
    // $ANTLR end "description"


    // $ANTLR start "implementation_level"
    // OWLInstances.g:530:1: implementation_level : ^( IMPLEMENTATION_LEVEL STRING ) ;
    public final void implementation_level() throws RecognitionException {
        try {
            // OWLInstances.g:531:2: ( ^( IMPLEMENTATION_LEVEL STRING ) )
            // OWLInstances.g:531:4: ^( IMPLEMENTATION_LEVEL STRING )
            {
            match(input,IMPLEMENTATION_LEVEL,FOLLOW_IMPLEMENTATION_LEVEL_in_implementation_level140); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_implementation_level142); 

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
    // $ANTLR end "implementation_level"


    // $ANTLR start "file_name"
    // OWLInstances.g:534:1: file_name : ^( FILE_NAME name time_stamp author organization preprocessor_version originating_system authorization ) ;
    public final void file_name() throws RecognitionException {
        try {
            // OWLInstances.g:535:2: ( ^( FILE_NAME name time_stamp author organization preprocessor_version originating_system authorization ) )
            // OWLInstances.g:535:4: ^( FILE_NAME name time_stamp author organization preprocessor_version originating_system authorization )
            {
            match(input,FILE_NAME,FOLLOW_FILE_NAME_in_file_name156); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_name_in_file_name158);
            name();

            state._fsp--;

            pushFollow(FOLLOW_time_stamp_in_file_name160);
            time_stamp();

            state._fsp--;

            pushFollow(FOLLOW_author_in_file_name162);
            author();

            state._fsp--;

            pushFollow(FOLLOW_organization_in_file_name164);
            organization();

            state._fsp--;

            pushFollow(FOLLOW_preprocessor_version_in_file_name168);
            preprocessor_version();

            state._fsp--;

            pushFollow(FOLLOW_originating_system_in_file_name170);
            originating_system();

            state._fsp--;

            pushFollow(FOLLOW_authorization_in_file_name172);
            authorization();

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
    // $ANTLR end "file_name"


    // $ANTLR start "name"
    // OWLInstances.g:539:1: name : ^( NAME STRING ) ;
    public final void name() throws RecognitionException {
        try {
            // OWLInstances.g:539:6: ( ^( NAME STRING ) )
            // OWLInstances.g:539:8: ^( NAME STRING )
            {
            match(input,NAME,FOLLOW_NAME_in_name185); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_name187); 

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
    // $ANTLR end "name"


    // $ANTLR start "time_stamp"
    // OWLInstances.g:541:1: time_stamp : ^( TIME_STAMP STRING ) ;
    public final void time_stamp() throws RecognitionException {
        try {
            // OWLInstances.g:542:2: ( ^( TIME_STAMP STRING ) )
            // OWLInstances.g:542:4: ^( TIME_STAMP STRING )
            {
            match(input,TIME_STAMP,FOLLOW_TIME_STAMP_in_time_stamp198); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_time_stamp200); 

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
    // $ANTLR end "time_stamp"


    // $ANTLR start "author"
    // OWLInstances.g:544:1: author : ^( AUTHOR ( STRING )+ ) ;
    public final void author() throws RecognitionException {
        try {
            // OWLInstances.g:544:8: ( ^( AUTHOR ( STRING )+ ) )
            // OWLInstances.g:544:10: ^( AUTHOR ( STRING )+ )
            {
            match(input,AUTHOR,FOLLOW_AUTHOR_in_author211); 

            match(input, Token.DOWN, null); 
            // OWLInstances.g:544:19: ( STRING )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==STRING) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // OWLInstances.g:544:19: STRING
            	    {
            	    match(input,STRING,FOLLOW_STRING_in_author213); 

            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
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
    // $ANTLR end "author"


    // $ANTLR start "organization"
    // OWLInstances.g:546:1: organization : ^( ORGANIZATION ( STRING )+ ) ;
    public final void organization() throws RecognitionException {
        try {
            // OWLInstances.g:547:2: ( ^( ORGANIZATION ( STRING )+ ) )
            // OWLInstances.g:547:4: ^( ORGANIZATION ( STRING )+ )
            {
            match(input,ORGANIZATION,FOLLOW_ORGANIZATION_in_organization225); 

            match(input, Token.DOWN, null); 
            // OWLInstances.g:547:19: ( STRING )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==STRING) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // OWLInstances.g:547:19: STRING
            	    {
            	    match(input,STRING,FOLLOW_STRING_in_organization227); 

            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
    // $ANTLR end "organization"


    // $ANTLR start "preprocessor_version"
    // OWLInstances.g:550:1: preprocessor_version : ^( PREPROCESSOR_VERSION STRING ) ;
    public final void preprocessor_version() throws RecognitionException {
        try {
            // OWLInstances.g:551:2: ( ^( PREPROCESSOR_VERSION STRING ) )
            // OWLInstances.g:551:4: ^( PREPROCESSOR_VERSION STRING )
            {
            match(input,PREPROCESSOR_VERSION,FOLLOW_PREPROCESSOR_VERSION_in_preprocessor_version242); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_preprocessor_version244); 

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
    // $ANTLR end "preprocessor_version"


    // $ANTLR start "originating_system"
    // OWLInstances.g:553:1: originating_system : ^( ORIGINATING_SYSTEM STRING ) ;
    public final void originating_system() throws RecognitionException {
        try {
            // OWLInstances.g:554:2: ( ^( ORIGINATING_SYSTEM STRING ) )
            // OWLInstances.g:554:4: ^( ORIGINATING_SYSTEM STRING )
            {
            match(input,ORIGINATING_SYSTEM,FOLLOW_ORIGINATING_SYSTEM_in_originating_system256); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_originating_system258); 

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
    // $ANTLR end "originating_system"


    // $ANTLR start "authorization"
    // OWLInstances.g:556:1: authorization : ^( AUTHORIZATION STRING ) ;
    public final void authorization() throws RecognitionException {
        try {
            // OWLInstances.g:557:2: ( ^( AUTHORIZATION STRING ) )
            // OWLInstances.g:557:4: ^( AUTHORIZATION STRING )
            {
            match(input,AUTHORIZATION,FOLLOW_AUTHORIZATION_in_authorization270); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_authorization272); 

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
    // $ANTLR end "authorization"


    // $ANTLR start "file_schema"
    // OWLInstances.g:559:1: file_schema : ^( FILE_SCHEMA schema_identifiers ) ;
    public final void file_schema() throws RecognitionException {
        try {
            // OWLInstances.g:560:2: ( ^( FILE_SCHEMA schema_identifiers ) )
            // OWLInstances.g:560:4: ^( FILE_SCHEMA schema_identifiers )
            {
            match(input,FILE_SCHEMA,FOLLOW_FILE_SCHEMA_in_file_schema284); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_schema_identifiers_in_file_schema286);
            schema_identifiers();

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
    // $ANTLR end "file_schema"


    // $ANTLR start "schema_identifiers"
    // OWLInstances.g:562:1: schema_identifiers : ^( SCHEMA_IDENTIFIERS (s= STRING )+ ) ;
    public final void schema_identifiers() throws RecognitionException {
        CommonTree s=null;

        try {
            // OWLInstances.g:563:2: ( ^( SCHEMA_IDENTIFIERS (s= STRING )+ ) )
            // OWLInstances.g:563:4: ^( SCHEMA_IDENTIFIERS (s= STRING )+ )
            {
            match(input,SCHEMA_IDENTIFIERS,FOLLOW_SCHEMA_IDENTIFIERS_in_schema_identifiers298); 


            		alModelURN = new ArrayList<String>();
            		models = new ArrayList<OWLOntology>();
            	

            match(input, Token.DOWN, null); 
            // OWLInstances.g:568:2: (s= STRING )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==STRING) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // OWLInstances.g:568:3: s= STRING
            	    {
            	    s=(CommonTree)match(input,STRING,FOLLOW_STRING_in_schema_identifiers308); 

            	    		String sschema = (s!=null?s.getText():null).toLowerCase();
            	    		sschema = sschema.substring(1, sschema.length() - 1);
            	    		String split = sschema.split("\\W")[0];
            	    		if (split.equals(""))
            	    			split = sschema;
            	    		log.debug("Schema " + (s!=null?s.getText():null) + ",split=" + split);
            	    		String sModelURN = "http://www.nist.gov/OntoSTEP/"
            	    	                    + split;
            	    	    OWLImportsDeclaration oid = factory
            	    	                    .getOWLImportsDeclaration(IRI
            	    	                                    .create(sModelURN));
            	    	    manager.applyChange(new AddImport(instances, oid));
            	    	    log.info("looking for " + sModelURN);
            	    	    
            	                if (!manager.contains(IRI.create(sModelURN)))
            	                {
            	                	OWLOntologyLoaderConfiguration loader = new OWLOntologyLoaderConfiguration();
            	    	    manager.makeLoadImportRequest(oid, loader);
            	    	    if (!manager.contains(IRI.create(sModelURN)))
            	    	            throw new Exception("Could not load the schema " + sModelURN);
            	    	    }
            	    	    models.add(manager.getOntology(IRI.create(sModelURN)));
            	    	    alModelURN.add(sModelURN);
            	    	

            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            match(input, Token.UP, null); 

            }

        }
        catch (OWLOntologyCreationException e) {
            log.error("Could not import the ontology", e);
        }
        catch (Exception e) {
            log.error("The schema ontology could not be loaded", e);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "schema_identifiers"


    // $ANTLR start "file_population"
    // OWLInstances.g:599:1: file_population : ^( FILE_POPULATION governing_schema determination_method ( governed_sections )? ) ;
    public final void file_population() throws RecognitionException {
        try {
            // OWLInstances.g:600:2: ( ^( FILE_POPULATION governing_schema determination_method ( governed_sections )? ) )
            // OWLInstances.g:600:4: ^( FILE_POPULATION governing_schema determination_method ( governed_sections )? )
            {
            match(input,FILE_POPULATION,FOLLOW_FILE_POPULATION_in_file_population340); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_governing_schema_in_file_population342);
            governing_schema();

            state._fsp--;

            pushFollow(FOLLOW_determination_method_in_file_population344);
            determination_method();

            state._fsp--;

            // OWLInstances.g:600:60: ( governed_sections )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==GOVERNED_SECTIONS) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // OWLInstances.g:600:60: governed_sections
                    {
                    pushFollow(FOLLOW_governed_sections_in_file_population346);
                    governed_sections();

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
    // $ANTLR end "file_population"


    // $ANTLR start "governing_schema"
    // OWLInstances.g:603:1: governing_schema : ^( GOVERNING_SCHEMA STRING ) ;
    public final void governing_schema() throws RecognitionException {
        try {
            // OWLInstances.g:604:2: ( ^( GOVERNING_SCHEMA STRING ) )
            // OWLInstances.g:604:4: ^( GOVERNING_SCHEMA STRING )
            {
            match(input,GOVERNING_SCHEMA,FOLLOW_GOVERNING_SCHEMA_in_governing_schema361); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_governing_schema363); 

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
    // $ANTLR end "governing_schema"


    // $ANTLR start "determination_method"
    // OWLInstances.g:606:1: determination_method : ^( DETERMINATION_METHOD STRING ) ;
    public final void determination_method() throws RecognitionException {
        try {
            // OWLInstances.g:607:2: ( ^( DETERMINATION_METHOD STRING ) )
            // OWLInstances.g:607:4: ^( DETERMINATION_METHOD STRING )
            {
            match(input,DETERMINATION_METHOD,FOLLOW_DETERMINATION_METHOD_in_determination_method375); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_determination_method377); 

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
    // $ANTLR end "determination_method"


    // $ANTLR start "governed_sections"
    // OWLInstances.g:609:1: governed_sections : ^( GOVERNED_SECTIONS ( STRING )+ ) ;
    public final void governed_sections() throws RecognitionException {
        try {
            // OWLInstances.g:610:2: ( ^( GOVERNED_SECTIONS ( STRING )+ ) )
            // OWLInstances.g:610:4: ^( GOVERNED_SECTIONS ( STRING )+ )
            {
            match(input,GOVERNED_SECTIONS,FOLLOW_GOVERNED_SECTIONS_in_governed_sections389); 

            match(input, Token.DOWN, null); 
            // OWLInstances.g:610:24: ( STRING )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==STRING) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // OWLInstances.g:610:24: STRING
            	    {
            	    match(input,STRING,FOLLOW_STRING_in_governed_sections391); 

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
    // $ANTLR end "governed_sections"


    // $ANTLR start "section_language"
    // OWLInstances.g:612:1: section_language : ^( SECTION_LANGUAGE section default_language ) ;
    public final void section_language() throws RecognitionException {
        try {
            // OWLInstances.g:613:2: ( ^( SECTION_LANGUAGE section default_language ) )
            // OWLInstances.g:613:4: ^( SECTION_LANGUAGE section default_language )
            {
            match(input,SECTION_LANGUAGE,FOLLOW_SECTION_LANGUAGE_in_section_language404); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_section_in_section_language406);
            section();

            state._fsp--;

            pushFollow(FOLLOW_default_language_in_section_language408);
            default_language();

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
    // $ANTLR end "section_language"


    // $ANTLR start "section"
    // OWLInstances.g:615:1: section : ^( SECTION STRING ) ;
    public final void section() throws RecognitionException {
        try {
            // OWLInstances.g:615:9: ( ^( SECTION STRING ) )
            // OWLInstances.g:615:11: ^( SECTION STRING )
            {
            match(input,SECTION,FOLLOW_SECTION_in_section419); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_section421); 

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
    // $ANTLR end "section"


    // $ANTLR start "default_language"
    // OWLInstances.g:618:1: default_language : ^( DEFAULT_LANGUAGE STRING ) ;
    public final void default_language() throws RecognitionException {
        try {
            // OWLInstances.g:619:2: ( ^( DEFAULT_LANGUAGE STRING ) )
            // OWLInstances.g:619:4: ^( DEFAULT_LANGUAGE STRING )
            {
            match(input,DEFAULT_LANGUAGE,FOLLOW_DEFAULT_LANGUAGE_in_default_language433); 

            match(input, Token.DOWN, null); 
            match(input,STRING,FOLLOW_STRING_in_default_language435); 

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
    // $ANTLR end "default_language"


    // $ANTLR start "section_context"
    // OWLInstances.g:621:1: section_context : ^( SECTION_LANGUAGE section context_identifiers ) ;
    public final void section_context() throws RecognitionException {
        try {
            // OWLInstances.g:622:2: ( ^( SECTION_LANGUAGE section context_identifiers ) )
            // OWLInstances.g:622:4: ^( SECTION_LANGUAGE section context_identifiers )
            {
            match(input,SECTION_LANGUAGE,FOLLOW_SECTION_LANGUAGE_in_section_context446); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_section_in_section_context448);
            section();

            state._fsp--;

            pushFollow(FOLLOW_context_identifiers_in_section_context450);
            context_identifiers();

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
    // $ANTLR end "section_context"


    // $ANTLR start "context_identifiers"
    // OWLInstances.g:624:1: context_identifiers : ^( CONTEXT_IDENTIFIERS ( STRING )+ ) ;
    public final void context_identifiers() throws RecognitionException {
        try {
            // OWLInstances.g:625:2: ( ^( CONTEXT_IDENTIFIERS ( STRING )+ ) )
            // OWLInstances.g:625:4: ^( CONTEXT_IDENTIFIERS ( STRING )+ )
            {
            match(input,CONTEXT_IDENTIFIERS,FOLLOW_CONTEXT_IDENTIFIERS_in_context_identifiers462); 

            match(input, Token.DOWN, null); 
            // OWLInstances.g:625:26: ( STRING )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==STRING) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // OWLInstances.g:625:26: STRING
            	    {
            	    match(input,STRING,FOLLOW_STRING_in_context_identifiers464); 

            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
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
    // $ANTLR end "context_identifiers"


    // $ANTLR start "keyword"
    // OWLInstances.g:627:1: keyword returns [String ret] : ^( KEYWORD (udk= user_defined_keyword )? (sk= STANDARD_KEYWORD )? ) ;
    public final String keyword() throws RecognitionException {
        String ret = null;

        CommonTree sk=null;
        String udk = null;


        try {
            // OWLInstances.g:628:1: ( ^( KEYWORD (udk= user_defined_keyword )? (sk= STANDARD_KEYWORD )? ) )
            // OWLInstances.g:628:4: ^( KEYWORD (udk= user_defined_keyword )? (sk= STANDARD_KEYWORD )? )
            {
            match(input,KEYWORD,FOLLOW_KEYWORD_in_keyword481); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLInstances.g:628:17: (udk= user_defined_keyword )?
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==USER_DEFINED_STANDARD) ) {
                    alt12=1;
                }
                switch (alt12) {
                    case 1 :
                        // OWLInstances.g:628:17: udk= user_defined_keyword
                        {
                        pushFollow(FOLLOW_user_defined_keyword_in_keyword485);
                        udk=user_defined_keyword();

                        state._fsp--;


                        }
                        break;

                }

                // OWLInstances.g:628:42: (sk= STANDARD_KEYWORD )?
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==STANDARD_KEYWORD) ) {
                    alt13=1;
                }
                switch (alt13) {
                    case 1 :
                        // OWLInstances.g:628:42: sk= STANDARD_KEYWORD
                        {
                        sk=(CommonTree)match(input,STANDARD_KEYWORD,FOLLOW_STANDARD_KEYWORD_in_keyword490); 

                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            	//TODO: difference between user-defined and not
            	if (udk != null)
            		ret = udk.toLowerCase();
            	else if ((sk!=null?sk.getText():null) != null)
            		ret = (sk!=null?sk.getText():null).toLowerCase();
            	else
            		log.error("impossible");


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "keyword"


    // $ANTLR start "user_defined_keyword"
    // OWLInstances.g:640:1: user_defined_keyword returns [String ret] : ^( USER_DEFINED_STANDARD sk= STANDARD_KEYWORD ) ;
    public final String user_defined_keyword() throws RecognitionException {
        String ret = null;

        CommonTree sk=null;

        try {
            // OWLInstances.g:641:1: ( ^( USER_DEFINED_STANDARD sk= STANDARD_KEYWORD ) )
            // OWLInstances.g:641:3: ^( USER_DEFINED_STANDARD sk= STANDARD_KEYWORD )
            {
            match(input,USER_DEFINED_STANDARD,FOLLOW_USER_DEFINED_STANDARD_in_user_defined_keyword509); 

            match(input, Token.DOWN, null); 
            sk=(CommonTree)match(input,STANDARD_KEYWORD,FOLLOW_STANDARD_KEYWORD_in_user_defined_keyword513); 

            match(input, Token.UP, null); 

            	ret = (sk!=null?sk.getText():null);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ret;
    }
    // $ANTLR end "user_defined_keyword"


    // $ANTLR start "enumeration"
    // OWLInstances.g:647:1: enumeration returns [String value] : ^( ENUMERATION sk= STANDARD_KEYWORD ) ;
    public final String enumeration() throws RecognitionException {
        String value = null;

        CommonTree sk=null;

        try {
            // OWLInstances.g:647:36: ( ^( ENUMERATION sk= STANDARD_KEYWORD ) )
            // OWLInstances.g:647:38: ^( ENUMERATION sk= STANDARD_KEYWORD )
            {
            match(input,ENUMERATION,FOLLOW_ENUMERATION_in_enumeration530); 

            match(input, Token.DOWN, null); 
            sk=(CommonTree)match(input,STANDARD_KEYWORD,FOLLOW_STANDARD_KEYWORD_in_enumeration534); 

            	value = (sk!=null?sk.getText():null).toLowerCase();


            match(input, Token.UP, null); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return value;
    }
    // $ANTLR end "enumeration"


    // $ANTLR start "parameter_list"
    // OWLInstances.g:654:1: parameter_list : ^( PARAMETER_LIST (p= parameter )+ ) ;
    public final void parameter_list() throws RecognitionException {
        OWLNamedIndividual p = null;


        try {
            // OWLInstances.g:654:16: ( ^( PARAMETER_LIST (p= parameter )+ ) )
            // OWLInstances.g:654:18: ^( PARAMETER_LIST (p= parameter )+ )
            {
            match(input,PARAMETER_LIST,FOLLOW_PARAMETER_LIST_in_parameter_list548); 


            	OWLObjectProperty[] aParameters = null;
            	int i = 0;
            	boolean ommited = false;
            	OWLObjectProperty opCurrent = null;
            	if (ocCurrentClass != null)
            		aParameters = lookForParameters(ocCurrentClass);


            match(input, Token.DOWN, null); 
            // OWLInstances.g:663:1: (p= parameter )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==PARAMETER) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // OWLInstances.g:664:1: p= parameter
            	    {

            	    	if (ocCurrentClass != null)
            	    	{
            	    		if (i < aParameters.length)
            	    		{
            	    			opCurrent = aParameters[i++];
            	    			String sIRI = getOntologyName(opCurrent);
            	    			OWLOntology onto = getOntology(sIRI);
            	    			String sType = h.getLiteral(onto, h.getIRIType(sIRI), opCurrent);
            	    			ocCurrentType = lookForType(sType);
            	    			sCurrentPrefix = oiCurrentInstance.getIRI().getFragment() + "_" + htAttributeName.get(opCurrent);
            	    		}
            	    		else
            	    			ocCurrentType = null;
            	    	}
            	    	else
            	    		ocCurrentType = null;


            	    pushFollow(FOLLOW_parameter_in_parameter_list559);
            	    p=parameter();

            	    state._fsp--;


            	    	if (ocCurrentClass != null)
            	    	{
            	    		if (p == null)
            	    			ommited = true;
            	    		if (p != null && opCurrent != null)
            	    		{
            	    			addAxiom(h.getOPAssertion(opCurrent, oiCurrentInstance, p));
            	    		}
            	    	}


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            	if (ocCurrentClass != null)
            	{
            		if (i != aParameters.length && !ommited)
            		{
            			String stmp = "";
            			for(int j=0;j<aParameters.length;j++)
            				stmp += " " + aParameters[j];
            			if (i > aParameters.length)
            				log.error(oiCurrentInstance + ": too many parameters. expecting only" + stmp);
            			else
            				log.error(oiCurrentInstance + ": too few parameters. expecting " + stmp);
            		}
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
    // $ANTLR end "parameter_list"


    // $ANTLR start "parameter"
    // OWLInstances.g:714:1: parameter returns [OWLNamedIndividual value] : ^( PARAMETER (tp= typed_parameter )? (up= untyped_parameter )? ( OMITTED_PARAMETER )? ) ;
    public final OWLNamedIndividual parameter() throws RecognitionException {
        OWLNamedIndividual value = null;

        OWLNamedIndividual tp = null;

        OWLNamedIndividual up = null;


        try {
            // OWLInstances.g:714:45: ( ^( PARAMETER (tp= typed_parameter )? (up= untyped_parameter )? ( OMITTED_PARAMETER )? ) )
            // OWLInstances.g:714:47: ^( PARAMETER (tp= typed_parameter )? (up= untyped_parameter )? ( OMITTED_PARAMETER )? )
            {
            match(input,PARAMETER,FOLLOW_PARAMETER_in_parameter581); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLInstances.g:714:61: (tp= typed_parameter )?
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==TYPED_PARAMETER) ) {
                    alt15=1;
                }
                switch (alt15) {
                    case 1 :
                        // OWLInstances.g:714:61: tp= typed_parameter
                        {
                        pushFollow(FOLLOW_typed_parameter_in_parameter585);
                        tp=typed_parameter();

                        state._fsp--;


                        }
                        break;

                }

                // OWLInstances.g:714:81: (up= untyped_parameter )?
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==UNTYPED_PARAMETER) ) {
                    alt16=1;
                }
                switch (alt16) {
                    case 1 :
                        // OWLInstances.g:714:81: up= untyped_parameter
                        {
                        pushFollow(FOLLOW_untyped_parameter_in_parameter590);
                        up=untyped_parameter();

                        state._fsp--;


                        }
                        break;

                }

                // OWLInstances.g:714:101: ( OMITTED_PARAMETER )?
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==OMITTED_PARAMETER) ) {
                    alt17=1;
                }
                switch (alt17) {
                    case 1 :
                        // OWLInstances.g:714:101: OMITTED_PARAMETER
                        {
                        match(input,OMITTED_PARAMETER,FOLLOW_OMITTED_PARAMETER_in_parameter593); 

                        }
                        break;

                }


                	if (tp != null)
                		value = tp;
                	if (up != null)
                		value = up;


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
        return value;
    }
    // $ANTLR end "parameter"


    // $ANTLR start "typed_parameter"
    // OWLInstances.g:724:1: typed_parameter returns [OWLNamedIndividual value] : ^( TYPED_PARAMETER k= keyword p= parameter ) ;
    public final OWLNamedIndividual typed_parameter() throws RecognitionException {
        OWLNamedIndividual value = null;

        String k = null;

        OWLNamedIndividual p = null;


        try {
            // OWLInstances.g:724:52: ( ^( TYPED_PARAMETER k= keyword p= parameter ) )
            // OWLInstances.g:724:54: ^( TYPED_PARAMETER k= keyword p= parameter )
            {
            match(input,TYPED_PARAMETER,FOLLOW_TYPED_PARAMETER_in_typed_parameter613); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_keyword_in_typed_parameter617);
            k=keyword();

            state._fsp--;

            pushFollow(FOLLOW_parameter_in_typed_parameter621);
            p=parameter();

            state._fsp--;


            	if (ocCurrentClass != null)
            	{
            		OWLClass owlc = lookForType(k);
            		addAxiom(h.getClassAssertionAxiom(owlc, p ));
            		value = p;
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
        return value;
    }
    // $ANTLR end "typed_parameter"


    // $ANTLR start "untyped_parameter"
    // OWLInstances.g:736:1: untyped_parameter returns [OWLNamedIndividual value] : ^( UNTYPED_PARAMETER ( NULL_VALUE )? (inte= INTEGER )? (real= REAL )? (stri= STRING )? (inst= ENTITY_INSTANCE_NAME )? (enu= enumeration )? (bina= BINARY )? (lis= list )? ) ;
    public final OWLNamedIndividual untyped_parameter() throws RecognitionException {
        OWLNamedIndividual value = null;

        CommonTree inte=null;
        CommonTree real=null;
        CommonTree stri=null;
        CommonTree inst=null;
        CommonTree bina=null;
        String enu = null;

        OWLNamedIndividual lis = null;


        try {
            // OWLInstances.g:736:54: ( ^( UNTYPED_PARAMETER ( NULL_VALUE )? (inte= INTEGER )? (real= REAL )? (stri= STRING )? (inst= ENTITY_INSTANCE_NAME )? (enu= enumeration )? (bina= BINARY )? (lis= list )? ) )
            // OWLInstances.g:736:56: ^( UNTYPED_PARAMETER ( NULL_VALUE )? (inte= INTEGER )? (real= REAL )? (stri= STRING )? (inst= ENTITY_INSTANCE_NAME )? (enu= enumeration )? (bina= BINARY )? (lis= list )? )
            {
            match(input,UNTYPED_PARAMETER,FOLLOW_UNTYPED_PARAMETER_in_untyped_parameter639); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLInstances.g:736:76: ( NULL_VALUE )?
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==NULL_VALUE) ) {
                    alt18=1;
                }
                switch (alt18) {
                    case 1 :
                        // OWLInstances.g:736:76: NULL_VALUE
                        {
                        match(input,NULL_VALUE,FOLLOW_NULL_VALUE_in_untyped_parameter641); 

                        }
                        break;

                }

                // OWLInstances.g:736:92: (inte= INTEGER )?
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==INTEGER) ) {
                    alt19=1;
                }
                switch (alt19) {
                    case 1 :
                        // OWLInstances.g:736:92: inte= INTEGER
                        {
                        inte=(CommonTree)match(input,INTEGER,FOLLOW_INTEGER_in_untyped_parameter646); 

                        }
                        break;

                }

                // OWLInstances.g:736:106: (real= REAL )?
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==REAL) ) {
                    alt20=1;
                }
                switch (alt20) {
                    case 1 :
                        // OWLInstances.g:736:106: real= REAL
                        {
                        real=(CommonTree)match(input,REAL,FOLLOW_REAL_in_untyped_parameter651); 

                        }
                        break;

                }

                // OWLInstances.g:736:117: (stri= STRING )?
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==STRING) ) {
                    alt21=1;
                }
                switch (alt21) {
                    case 1 :
                        // OWLInstances.g:736:117: stri= STRING
                        {
                        stri=(CommonTree)match(input,STRING,FOLLOW_STRING_in_untyped_parameter656); 

                        }
                        break;

                }

                // OWLInstances.g:736:130: (inst= ENTITY_INSTANCE_NAME )?
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==ENTITY_INSTANCE_NAME) ) {
                    alt22=1;
                }
                switch (alt22) {
                    case 1 :
                        // OWLInstances.g:736:130: inst= ENTITY_INSTANCE_NAME
                        {
                        inst=(CommonTree)match(input,ENTITY_INSTANCE_NAME,FOLLOW_ENTITY_INSTANCE_NAME_in_untyped_parameter661); 

                        }
                        break;

                }

                // OWLInstances.g:736:156: (enu= enumeration )?
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==ENUMERATION) ) {
                    alt23=1;
                }
                switch (alt23) {
                    case 1 :
                        // OWLInstances.g:736:156: enu= enumeration
                        {
                        pushFollow(FOLLOW_enumeration_in_untyped_parameter666);
                        enu=enumeration();

                        state._fsp--;


                        }
                        break;

                }

                // OWLInstances.g:736:174: (bina= BINARY )?
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==BINARY) ) {
                    alt24=1;
                }
                switch (alt24) {
                    case 1 :
                        // OWLInstances.g:736:174: bina= BINARY
                        {
                        bina=(CommonTree)match(input,BINARY,FOLLOW_BINARY_in_untyped_parameter671); 

                        }
                        break;

                }

                // OWLInstances.g:736:186: (lis= list )?
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LIST) ) {
                    alt25=1;
                }
                switch (alt25) {
                    case 1 :
                        // OWLInstances.g:736:186: lis= list
                        {
                        pushFollow(FOLLOW_list_in_untyped_parameter676);
                        lis=list();

                        state._fsp--;


                        }
                        break;

                }


                match(input, Token.UP, null); 
            }

            	
            	if (ocCurrentType != null)
            	{
            		String sOntoName = getOntologyName(ocCurrentClass);
            	
            		if ((inte!=null?inte.getText():null) != null)
            		{
            			value = h.getNamedIndividual(sCurrentPrefix);
            			addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_integer"), value, 
            			Integer.parseInt((inte!=null?inte.getText():null))));
            		}
            		else if ((real!=null?real.getText():null) != null)
            		{
            			value = h.getNamedIndividual(sCurrentPrefix);
            			addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_decimal"), value, 
            			Double.parseDouble((real!=null?real.getText():null))));
            		}
            		else if ((stri!=null?stri.getText():null) != null)
            		{
            			value = h.getNamedIndividual(sCurrentPrefix);
            			addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_string"), value, 
            			(stri!=null?stri.getText():null).substring(1, (stri!=null?stri.getText():null).length()-1)));
            		}
            		else if ((inst!=null?inst.getText():null) != null)
            		{
            			value = h.getNamedIndividual("i" + (inst!=null?inst.getText():null).substring(1));
            		}
            		else if (enu != null)
            		{
            			if (enu.toLowerCase().equals("t"))
            			{
            				value = h.getNamedIndividual(sCurrentPrefix);
            				addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_boolean"), value,true));
            			}
            			else if (enu.toLowerCase().equals("f"))
            			{
            				value = h.getNamedIndividual(sCurrentPrefix);
            				addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_boolean"), value,false));
            			}
            			else
            				value = lookForIndividual(enu);
            		}
            		else if ((bina!=null?bina.getText():null) != null)
            		{
            			value = h.getNamedIndividual(sCurrentPrefix);
            			addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_integer"), 
            			value, Integer.parseInt((inte!=null?inte.getText():null), 2)));
            		}
            		else if (lis != null)
            		{
            			value = lis;
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
        return value;
    }
    // $ANTLR end "untyped_parameter"


    // $ANTLR start "list"
    // OWLInstances.g:794:1: list returns [OWLNamedIndividual value] : ^( LIST (p= parameter )* ) ;
    public final OWLNamedIndividual list() throws RecognitionException {
        OWLNamedIndividual value = null;

        OWLNamedIndividual p = null;


        try {
            // OWLInstances.g:794:40: ( ^( LIST (p= parameter )* ) )
            // OWLInstances.g:794:42: ^( LIST (p= parameter )* )
            {
            match(input,LIST,FOLLOW_LIST_in_list693); 


            	int idx = 1;
            	String sTempPrefix = sCurrentPrefix;
            	OWLClass ocTempCurrentType = ocCurrentType;
            	String sName = null;
            	String sOntology = null;
            	
            	OWLNamedIndividual oiPrevious = null;
            	OWLNamedIndividual oiCurrent = null;
            	OWLObjectProperty oopContent = null;
            	
            	OWLClass ocBagContent = null;
            	OWLObjectProperty oopBagContent = null;
            		
            	if (ocCurrentType != null)
            	{
            		sName = ocCurrentType.getIRI().getFragment();
            		sOntology = getOntologyName(ocCurrentType);
            	
            		if (sName.startsWith(h.bagPrefix))
            		{
            			//sCurrentPrefix = sTempPrefix + "_" + h.bagPrefix;
            			
            			OWLClass ocBag = ocTempCurrentType;
            			oopBagContent = h.getOP(sOntology, h.getHasContent(ocTempCurrentType.getIRI().getFragment()));
            			oopContent = h.getOP(sOntology, h.getHasValue(h.getContentDeclaration(ocTempCurrentType.getIRI().getFragment())));
            			
            			oiPrevious = h.getNamedIndividual(sCurrentPrefix);
            			addAxiom(h.getClassAssertionAxiom(
            					ocBag, oiPrevious));
            			ocBagContent = lookForType(h.getContentDeclaration(ocTempCurrentType.getIRI().getFragment()));
            			value = oiPrevious;
            			sCurrentPrefix = sTempPrefix + "_" + (idx) + "_value";
            		}
            		else if (sName.startsWith(h.setPrefix))
            		{
            			OWLClass ocSet = ocTempCurrentType;
            			//sCurrentPrefix = sTempPrefix + "_" + h.setPrefix;
            			oiPrevious = h.getNamedIndividual(sCurrentPrefix);
            			addAxiom(h.getClassAssertionAxiom(
            					ocSet, oiPrevious));
            			oiCurrent = oiPrevious;
            			value = oiPrevious;
            			
            			oopContent = h.getOP(sOntology, h.getHasContent(ocTempCurrentType.getIRI().getFragment()));
            			sCurrentPrefix = sTempPrefix + "_" + (idx);
            		}
            		else if (sName.startsWith(h.arrayPrefix) || sName.startsWith(h.listPrefix))
            		{
            			oopContent = h.getOP(sOntology, h.getHasContent(ocTempCurrentType.getIRI().getFragment()));
            			sCurrentPrefix = sTempPrefix + "_" + (idx) + "_content";
            		}
            		else
            			log.error(sTempPrefix + ": aggregation expected instead of the type " + ocCurrentType);
            		
            		if (oopContent != null)
            		{
            			String sIRI = getOntologyName(oopContent);
            			OWLOntology onto = getOntology(sIRI);
            			String sType = h.getLiteral(onto, h.getIRIType(sIRI), oopContent);
            			ocCurrentType = lookForType(sType);
            			if (ocCurrentType == null)
            				log.error("The type of the ObjectProperty for the content could not be retrieved:" + oopContent);
            		}
            		else
            		{
            			ocCurrentType = null;
            			log.error("The ObjectProperty for the content could not be retrieved: " + ocTempCurrentType);
            		}
            	}


            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLInstances.g:866:1: (p= parameter )*
                loop26:
                do {
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==PARAMETER) ) {
                        alt26=1;
                    }


                    switch (alt26) {
                	case 1 :
                	    // OWLInstances.g:867:1: p= parameter
                	    {

                	    //	if (ocCurrentType != null)
                	    //		sCurrentPrefix = sTempPrefix + "_" + (idx);
                	    		sCurrentPrefix = sTempPrefix + "_" + (idx) + "_value";


                	    pushFollow(FOLLOW_parameter_in_list704);
                	    p=parameter();

                	    state._fsp--;


                	    	if (ocCurrentType != null)
                	    	{
                	    		sCurrentPrefix = sTempPrefix + "_" + (idx);
                	    		if (sName.startsWith(h.bagPrefix))
                	    		{
                	    			oiCurrent = h.getNamedIndividual(sCurrentPrefix);
                	    			addAxiom(h.getClassAssertionAxiom(ocBagContent, oiCurrent));
                	    			addAxiom(h.getOPAssertion(oopBagContent, oiPrevious, oiCurrent));
                	    		}
                	    		else if (sName.startsWith(h.arrayPrefix) || sName.startsWith(h.listPrefix))
                	    		{
                	    			oiCurrent = h.getNamedIndividual(sCurrentPrefix);
                	    			
                	    			addAxiom(h.getClassAssertionAxiom(
                	    					ocTempCurrentType, oiCurrent));
                	    			
                	    			// This is the first element
                	    			if (oiPrevious == null)
                	    			{
                	    				value = oiCurrent;
                	    			}
                	    			else
                	    			{
                	    				addAxiom(h.getOPAssertion(
                	    						h.getOP(sOntology, h.getHasNext(ocTempCurrentType.getIRI().getFragment())),
                	    						oiPrevious, oiCurrent));
                	    			}
                	    			oiPrevious = oiCurrent;
                	    		}
                	    		if (p != null)
                	    		{
                	    			addAxiom(h.getOPAssertion(
                	    					oopContent, oiCurrent, 
                	    					p));
                	    			
                	    		}
                	    	}
                	    	++idx;


                	    }
                	    break;

                	default :
                	    break loop26;
                    }
                } while (true);


                	if (ocCurrentType != null)
                	{
                		if (sName.startsWith(h.arrayPrefix) || sName.startsWith(h.listPrefix))
                		{
                			if (oiPrevious != null)
                			{
                				OWLNamedIndividual oiLast = h.getNamedIndividual(sTempPrefix + "_last");
                				
                				OWLClass ocType = h.getClas(sOntology, h.getEmptyDeclaration(ocTempCurrentType.getIRI().getFragment()));
                				
                				addAxiom(factory.getOWLClassAssertionAxiom(ocType, oiLast));
                				
                				addAxiom(h.getOPAssertion(
                						h.getOP(sOntology, h.getHasNext(ocTempCurrentType.getIRI().getFragment())),
                						oiPrevious,oiLast));
                			}		
                		}
                	}

                	sCurrentPrefix = sTempPrefix;
                	ocCurrentType = ocTempCurrentType;
                	


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
        return value;
    }
    // $ANTLR end "list"


    // $ANTLR start "data_section"
    // OWLInstances.g:942:1: data_section : ^( DATA_SECTION ( parameter_list )? entity_instance_list ) ;
    public final void data_section() throws RecognitionException {
        try {
            // OWLInstances.g:942:14: ( ^( DATA_SECTION ( parameter_list )? entity_instance_list ) )
            // OWLInstances.g:942:16: ^( DATA_SECTION ( parameter_list )? entity_instance_list )
            {
            match(input,DATA_SECTION,FOLLOW_DATA_SECTION_in_data_section723); 

            match(input, Token.DOWN, null); 
            // OWLInstances.g:943:1: ( parameter_list )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==PARAMETER_LIST) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // OWLInstances.g:943:1: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_data_section726);
                    parameter_list();

                    state._fsp--;


                    }
                    break;

            }

            pushFollow(FOLLOW_entity_instance_list_in_data_section729);
            entity_instance_list();

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
    // $ANTLR end "data_section"


    // $ANTLR start "entity_instance_list"
    // OWLInstances.g:945:1: entity_instance_list : ^( ENTITY_INSTANCE_LIST ( entity_instance )* ) ;
    public final void entity_instance_list() throws RecognitionException {
        try {
            // OWLInstances.g:945:22: ( ^( ENTITY_INSTANCE_LIST ( entity_instance )* ) )
            // OWLInstances.g:945:24: ^( ENTITY_INSTANCE_LIST ( entity_instance )* )
            {
            match(input,ENTITY_INSTANCE_LIST,FOLLOW_ENTITY_INSTANCE_LIST_in_entity_instance_list739); 

            if ( input.LA(1)==Token.DOWN ) {
                match(input, Token.DOWN, null); 
                // OWLInstances.g:945:47: ( entity_instance )*
                loop28:
                do {
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==ENTITY_INSTANCE) ) {
                        alt28=1;
                    }


                    switch (alt28) {
                	case 1 :
                	    // OWLInstances.g:945:47: entity_instance
                	    {
                	    pushFollow(FOLLOW_entity_instance_in_entity_instance_list741);
                	    entity_instance();

                	    state._fsp--;


                	    }
                	    break;

                	default :
                	    break loop28;
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
    // $ANTLR end "entity_instance_list"


    // $ANTLR start "entity_instance"
    // OWLInstances.g:947:1: entity_instance : ^( ENTITY_INSTANCE ein= ENTITY_INSTANCE_NAME ( simple_entity_instance )? ( complex_entity_instance )? ) ;
    public final void entity_instance() throws RecognitionException {
        CommonTree ein=null;

        try {
            // OWLInstances.g:947:17: ( ^( ENTITY_INSTANCE ein= ENTITY_INSTANCE_NAME ( simple_entity_instance )? ( complex_entity_instance )? ) )
            // OWLInstances.g:947:20: ^( ENTITY_INSTANCE ein= ENTITY_INSTANCE_NAME ( simple_entity_instance )? ( complex_entity_instance )? )
            {
            match(input,ENTITY_INSTANCE,FOLLOW_ENTITY_INSTANCE_in_entity_instance753); 

            match(input, Token.DOWN, null); 
            ein=(CommonTree)match(input,ENTITY_INSTANCE_NAME,FOLLOW_ENTITY_INSTANCE_NAME_in_entity_instance757); 

            	String sInstanceName = "i" + (ein!=null?ein.getText():null).substring(1);
            	log.trace("parsing instance " + sInstancesURN + "#" + sInstanceName);
            	oiCurrentInstance = h.getNamedIndividual(sInstanceName);

            // OWLInstances.g:953:1: ( simple_entity_instance )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==SIMPLE_ENTITY_INSTANCE) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // OWLInstances.g:953:1: simple_entity_instance
                    {
                    pushFollow(FOLLOW_simple_entity_instance_in_entity_instance762);
                    simple_entity_instance();

                    state._fsp--;


                    }
                    break;

            }

            // OWLInstances.g:953:26: ( complex_entity_instance )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==COMPLEX_ENTITY_INSTANCE) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // OWLInstances.g:953:26: complex_entity_instance
                    {
                    pushFollow(FOLLOW_complex_entity_instance_in_entity_instance766);
                    complex_entity_instance();

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
    // $ANTLR end "entity_instance"


    // $ANTLR start "simple_entity_instance"
    // OWLInstances.g:955:1: simple_entity_instance : ^( SIMPLE_ENTITY_INSTANCE simple_record ) ;
    public final void simple_entity_instance() throws RecognitionException {
        try {
            // OWLInstances.g:955:24: ( ^( SIMPLE_ENTITY_INSTANCE simple_record ) )
            // OWLInstances.g:955:25: ^( SIMPLE_ENTITY_INSTANCE simple_record )
            {
            match(input,SIMPLE_ENTITY_INSTANCE,FOLLOW_SIMPLE_ENTITY_INSTANCE_in_simple_entity_instance776); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_simple_record_in_simple_entity_instance778);
            simple_record();

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
    // $ANTLR end "simple_entity_instance"


    // $ANTLR start "complex_entity_instance"
    // OWLInstances.g:957:1: complex_entity_instance : ^( COMPLEX_ENTITY_INSTANCE subsuper_record ) ;
    public final void complex_entity_instance() throws RecognitionException {
        try {
            // OWLInstances.g:957:25: ( ^( COMPLEX_ENTITY_INSTANCE subsuper_record ) )
            // OWLInstances.g:957:27: ^( COMPLEX_ENTITY_INSTANCE subsuper_record )
            {
            match(input,COMPLEX_ENTITY_INSTANCE,FOLLOW_COMPLEX_ENTITY_INSTANCE_in_complex_entity_instance788); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_subsuper_record_in_complex_entity_instance790);
            subsuper_record();

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
    // $ANTLR end "complex_entity_instance"


    // $ANTLR start "subsuper_record"
    // OWLInstances.g:959:1: subsuper_record : ^( SUBSUPER_RECORD simple_record_list ) ;
    public final void subsuper_record() throws RecognitionException {
        try {
            // OWLInstances.g:959:17: ( ^( SUBSUPER_RECORD simple_record_list ) )
            // OWLInstances.g:959:19: ^( SUBSUPER_RECORD simple_record_list )
            {
            match(input,SUBSUPER_RECORD,FOLLOW_SUBSUPER_RECORD_in_subsuper_record800); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_simple_record_list_in_subsuper_record802);
            simple_record_list();

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
    // $ANTLR end "subsuper_record"


    // $ANTLR start "simple_record"
    // OWLInstances.g:961:1: simple_record : ^( SIMPLE_RECORD clas= keyword ( parameter_list )? ) ;
    public final void simple_record() throws RecognitionException {
        String clas = null;


        try {
            // OWLInstances.g:961:15: ( ^( SIMPLE_RECORD clas= keyword ( parameter_list )? ) )
            // OWLInstances.g:961:17: ^( SIMPLE_RECORD clas= keyword ( parameter_list )? )
            {
            match(input,SIMPLE_RECORD,FOLLOW_SIMPLE_RECORD_in_simple_record812); 

            match(input, Token.DOWN, null); 
            pushFollow(FOLLOW_keyword_in_simple_record816);
            clas=keyword();

            state._fsp--;


            	ocCurrentClass = lookForClass(clas);
            	if (ocCurrentClass != null)
            		addAxiom(h.getClassAssertionAxiom(ocCurrentClass, oiCurrentInstance ));
            	

            // OWLInstances.g:968:1: ( parameter_list )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==PARAMETER_LIST) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // OWLInstances.g:968:1: parameter_list
                    {
                    pushFollow(FOLLOW_parameter_list_in_simple_record821);
                    parameter_list();

                    state._fsp--;


                    }
                    break;

            }


            	ocCurrentClass = null;


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
    // $ANTLR end "simple_record"


    // $ANTLR start "simple_record_list"
    // OWLInstances.g:974:1: simple_record_list : ^( SIMPLE_RECORD_LIST ( simple_record )+ ) ;
    public final void simple_record_list() throws RecognitionException {
        try {
            // OWLInstances.g:974:20: ( ^( SIMPLE_RECORD_LIST ( simple_record )+ ) )
            // OWLInstances.g:974:22: ^( SIMPLE_RECORD_LIST ( simple_record )+ )
            {
            match(input,SIMPLE_RECORD_LIST,FOLLOW_SIMPLE_RECORD_LIST_in_simple_record_list835); 

            match(input, Token.DOWN, null); 
            // OWLInstances.g:974:43: ( simple_record )+
            int cnt32=0;
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==SIMPLE_RECORD) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // OWLInstances.g:974:43: simple_record
            	    {
            	    pushFollow(FOLLOW_simple_record_in_simple_record_list837);
            	    simple_record();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    if ( cnt32 >= 1 ) break loop32;
                        EarlyExitException eee =
                            new EarlyExitException(32, input);
                        throw eee;
                }
                cnt32++;
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
    // $ANTLR end "simple_record_list"

    // Delegated rules


 

    public static final BitSet FOLLOW_EXCHANGE_FILE_in_exchange_file41 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_header_section_in_exchange_file46 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_data_section_in_exchange_file48 = new BitSet(new long[]{0x0000000000020008L});
    public static final BitSet FOLLOW_HEADER_SECTION_in_header_section80 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_file_description_in_header_section82 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_file_name_in_header_section84 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_file_schema_in_header_section86 = new BitSet(new long[]{0x0000110000000008L});
    public static final BitSet FOLLOW_file_population_in_header_section88 = new BitSet(new long[]{0x0000100000000008L});
    public static final BitSet FOLLOW_section_language_in_header_section91 = new BitSet(new long[]{0x0000100000000008L});
    public static final BitSet FOLLOW_section_context_in_header_section94 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FILE_DESCRIPTION_in_file_description106 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_description_in_file_description108 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_implementation_level_in_file_description110 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DESCRIPTION_in_description123 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_description125 = new BitSet(new long[]{0x0002000000000008L});
    public static final BitSet FOLLOW_IMPLEMENTATION_LEVEL_in_implementation_level140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_implementation_level142 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FILE_NAME_in_file_name156 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_name_in_file_name158 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_time_stamp_in_file_name160 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_author_in_file_name162 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_organization_in_file_name164 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_preprocessor_version_in_file_name168 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_originating_system_in_file_name170 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_authorization_in_file_name172 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_NAME_in_name185 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_name187 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TIME_STAMP_in_time_stamp198 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_time_stamp200 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AUTHOR_in_author211 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_author213 = new BitSet(new long[]{0x0002000000000008L});
    public static final BitSet FOLLOW_ORGANIZATION_in_organization225 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_organization227 = new BitSet(new long[]{0x0002000000000008L});
    public static final BitSet FOLLOW_PREPROCESSOR_VERSION_in_preprocessor_version242 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_preprocessor_version244 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ORIGINATING_SYSTEM_in_originating_system256 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_originating_system258 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_AUTHORIZATION_in_authorization270 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_authorization272 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_FILE_SCHEMA_in_file_schema284 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_schema_identifiers_in_file_schema286 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SCHEMA_IDENTIFIERS_in_schema_identifiers298 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_schema_identifiers308 = new BitSet(new long[]{0x0002000000000008L});
    public static final BitSet FOLLOW_FILE_POPULATION_in_file_population340 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_governing_schema_in_file_population342 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_determination_method_in_file_population344 = new BitSet(new long[]{0x0000080000000008L});
    public static final BitSet FOLLOW_governed_sections_in_file_population346 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOVERNING_SCHEMA_in_governing_schema361 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_governing_schema363 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DETERMINATION_METHOD_in_determination_method375 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_determination_method377 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_GOVERNED_SECTIONS_in_governed_sections389 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_governed_sections391 = new BitSet(new long[]{0x0002000000000008L});
    public static final BitSet FOLLOW_SECTION_LANGUAGE_in_section_language404 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_section_in_section_language406 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_default_language_in_section_language408 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECTION_in_section419 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_section421 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DEFAULT_LANGUAGE_in_default_language433 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_default_language435 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SECTION_LANGUAGE_in_section_context446 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_section_in_section_context448 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_context_identifiers_in_section_context450 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_CONTEXT_IDENTIFIERS_in_context_identifiers462 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STRING_in_context_identifiers464 = new BitSet(new long[]{0x0002000000000008L});
    public static final BitSet FOLLOW_KEYWORD_in_keyword481 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_user_defined_keyword_in_keyword485 = new BitSet(new long[]{0x0001000000000008L});
    public static final BitSet FOLLOW_STANDARD_KEYWORD_in_keyword490 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_USER_DEFINED_STANDARD_in_user_defined_keyword509 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STANDARD_KEYWORD_in_user_defined_keyword513 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENUMERATION_in_enumeration530 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_STANDARD_KEYWORD_in_enumeration534 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PARAMETER_LIST_in_parameter_list548 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_parameter_list559 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_PARAMETER_in_parameter581 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_typed_parameter_in_parameter585 = new BitSet(new long[]{0x000000000000A008L});
    public static final BitSet FOLLOW_untyped_parameter_in_parameter590 = new BitSet(new long[]{0x0000000000008008L});
    public static final BitSet FOLLOW_OMITTED_PARAMETER_in_parameter593 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_TYPED_PARAMETER_in_typed_parameter613 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_keyword_in_typed_parameter617 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_parameter_in_typed_parameter621 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_UNTYPED_PARAMETER_in_untyped_parameter639 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_NULL_VALUE_in_untyped_parameter641 = new BitSet(new long[]{0x003E000000010208L});
    public static final BitSet FOLLOW_INTEGER_in_untyped_parameter646 = new BitSet(new long[]{0x003A000000010208L});
    public static final BitSet FOLLOW_REAL_in_untyped_parameter651 = new BitSet(new long[]{0x0032000000010208L});
    public static final BitSet FOLLOW_STRING_in_untyped_parameter656 = new BitSet(new long[]{0x0030000000010208L});
    public static final BitSet FOLLOW_ENTITY_INSTANCE_NAME_in_untyped_parameter661 = new BitSet(new long[]{0x0020000000010208L});
    public static final BitSet FOLLOW_enumeration_in_untyped_parameter666 = new BitSet(new long[]{0x0020000000010008L});
    public static final BitSet FOLLOW_BINARY_in_untyped_parameter671 = new BitSet(new long[]{0x0000000000010008L});
    public static final BitSet FOLLOW_list_in_untyped_parameter676 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_LIST_in_list693 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_in_list704 = new BitSet(new long[]{0x0000000000000108L});
    public static final BitSet FOLLOW_DATA_SECTION_in_data_section723 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_parameter_list_in_data_section726 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_entity_instance_list_in_data_section729 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ENTITY_INSTANCE_LIST_in_entity_instance_list739 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_entity_instance_in_entity_instance_list741 = new BitSet(new long[]{0x0000000000080008L});
    public static final BitSet FOLLOW_ENTITY_INSTANCE_in_entity_instance753 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ENTITY_INSTANCE_NAME_in_entity_instance757 = new BitSet(new long[]{0x0000000000300008L});
    public static final BitSet FOLLOW_simple_entity_instance_in_entity_instance762 = new BitSet(new long[]{0x0000000000200008L});
    public static final BitSet FOLLOW_complex_entity_instance_in_entity_instance766 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIMPLE_ENTITY_INSTANCE_in_simple_entity_instance776 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simple_record_in_simple_entity_instance778 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_COMPLEX_ENTITY_INSTANCE_in_complex_entity_instance788 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_subsuper_record_in_complex_entity_instance790 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SUBSUPER_RECORD_in_subsuper_record800 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simple_record_list_in_subsuper_record802 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIMPLE_RECORD_in_simple_record812 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_keyword_in_simple_record816 = new BitSet(new long[]{0x0000000000000088L});
    public static final BitSet FOLLOW_parameter_list_in_simple_record821 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_SIMPLE_RECORD_LIST_in_simple_record_list835 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_simple_record_in_simple_record_list837 = new BitSet(new long[]{0x0000000000400008L});

}
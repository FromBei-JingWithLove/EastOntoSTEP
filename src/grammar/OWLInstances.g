tree grammar OWLInstances;
options 
{
	tokenVocab=Part21;
	ASTLabelType=CommonTree;
}

@header
{
package gov.nist.msid.ontostep.instance;

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



import gov.nist.msid.ontostep.OWLHelper;
}

@members
{
        
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
		
}

exchange_file : ^(EXCHANGE_FILE 
{
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
}
header_section data_section+)
{
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
;
catch [OWLOntologyCreationException e] {log.error("Could not create the ontology", e);}
catch [OWLOntologyChangeException e] {log.error("Could not add the axioms to the ontology", e);}
catch [OWLOntologyStorageException e] {log.error("Could not save the ontology", e);}

header_section : ^(HEADER_SECTION file_description file_name file_schema file_population? section_language? section_context?);

file_description
	:	^(FILE_DESCRIPTION description implementation_level)
	;

description
	:	^(DESCRIPTION STRING+)
	;
	
implementation_level
	:	^(IMPLEMENTATION_LEVEL STRING)
	;
	
file_name
	:	^(FILE_NAME name time_stamp author organization 
	preprocessor_version originating_system authorization)
	;
	
name	:	^(NAME STRING);

time_stamp
	:	^(TIME_STAMP STRING);
	
author	:	^(AUTHOR STRING+);

organization
	:	^(ORGANIZATION STRING+);
	
	
preprocessor_version
	:	^(PREPROCESSOR_VERSION STRING);
	
originating_system
	:	^(ORIGINATING_SYSTEM STRING);
	
authorization
	:	^(AUTHORIZATION STRING);
	
file_schema
	:	^(FILE_SCHEMA schema_identifiers);
	
schema_identifiers
	:	^(SCHEMA_IDENTIFIERS 
	{
		alModelURN = new ArrayList<String>();
		models = new ArrayList<OWLOntology>();
	}
	(s=STRING
	{
		String sschema = $s.text.toLowerCase();
		sschema = sschema.substring(1, sschema.length() - 1);
		String split = sschema.split("\\W")[0];
		if (split.equals(""))
			split = sschema;
		log.debug("Schema " + $s.text + ",split=" + split);
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
	)+)
	;
catch [OWLOntologyCreationException e] {log.error("Could not import the ontology", e);}
catch [Exception e] {log.error("The schema ontology could not be loaded", e);}

file_population
	:	^(FILE_POPULATION governing_schema determination_method governed_sections?);
	
	
governing_schema
	:	^(GOVERNING_SCHEMA STRING);
	
determination_method
	:	^(DETERMINATION_METHOD STRING);
	
governed_sections
	:	^(GOVERNED_SECTIONS STRING+);
	
section_language
	:	^(SECTION_LANGUAGE section default_language);
	
section	:	^(SECTION STRING);


default_language
	:	^(DEFAULT_LANGUAGE STRING);

section_context
	:	^(SECTION_LANGUAGE section context_identifiers);
	
context_identifiers
	:	^(CONTEXT_IDENTIFIERS STRING+);

keyword returns [String ret] 
:  ^(KEYWORD udk=user_defined_keyword? sk=STANDARD_KEYWORD?)
{
	//TODO: difference between user-defined and not
	if ($udk.ret != null)
		$ret = $udk.ret.toLowerCase();
	else if ($sk.text != null)
		$ret = $sk.text.toLowerCase();
	else
		log.error("impossible");
}
;

user_defined_keyword returns [String ret] 
: ^(USER_DEFINED_STANDARD sk=STANDARD_KEYWORD)
{
	$ret = $sk.text;
}
;

enumeration returns [String value] : ^(ENUMERATION sk=STANDARD_KEYWORD
{
	$value = $sk.text.toLowerCase();
}
)
;

parameter_list : ^(PARAMETER_LIST 
{
	OWLObjectProperty[] aParameters = null;
	int i = 0;
	boolean ommited = false;
	OWLObjectProperty opCurrent = null;
	if (ocCurrentClass != null)
		aParameters = lookForParameters(ocCurrentClass);
}
(
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

}
p=parameter
{
	if (ocCurrentClass != null)
	{
		if ($p.value == null)
			ommited = true;
		if ($p.value != null && opCurrent != null)
		{
			addAxiom(h.getOPAssertion(opCurrent, oiCurrentInstance, $p.value));
		}
	}
}
)+
{
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
}
)
;

parameter returns [OWLNamedIndividual value]: ^(PARAMETER tp=typed_parameter? up=untyped_parameter? OMITTED_PARAMETER?
{
	if ($tp.value != null)
		$value = $tp.value;
	if ($up.value != null)
		$value = $up.value;
}
) 
;

typed_parameter returns [OWLNamedIndividual value] : ^(TYPED_PARAMETER k=keyword p=parameter
{
	if (ocCurrentClass != null)
	{
		OWLClass owlc = lookForType($k.ret);
		addAxiom(h.getClassAssertionAxiom(owlc, $p.value ));
		$value = $p.value;
	}
}
)
;

untyped_parameter returns [OWLNamedIndividual value] : ^(UNTYPED_PARAMETER NULL_VALUE? inte=INTEGER? real=REAL? stri=STRING? inst=ENTITY_INSTANCE_NAME? enu=enumeration? bina=BINARY? lis=list?)
{
	
	if (ocCurrentType != null)
	{
		String sOntoName = getOntologyName(ocCurrentClass);
	
		if ($inte.text != null)
		{
			$value = h.getNamedIndividual(sCurrentPrefix);
			addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_integer"), $value, 
			Integer.parseInt($inte.text)));
		}
		else if ($real.text != null)
		{
			$value = h.getNamedIndividual(sCurrentPrefix);
			addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_decimal"), $value, 
			Double.parseDouble($real.text)));
		}
		else if ($stri.text != null)
		{
			$value = h.getNamedIndividual(sCurrentPrefix);
			addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_string"), $value, 
			$stri.text.substring(1, $stri.text.length()-1)));
		}
		else if ($inst.text != null)
		{
			$value = h.getNamedIndividual("i" + $inst.text.substring(1));
		}
		else if ($enu.value != null)
		{
			if ($enu.value.toLowerCase().equals("t"))
			{
				$value = h.getNamedIndividual(sCurrentPrefix);
				addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_boolean"), $value,true));
			}
			else if ($enu.value.toLowerCase().equals("f"))
			{
				$value = h.getNamedIndividual(sCurrentPrefix);
				addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_boolean"), $value,false));
			}
			else
				$value = lookForIndividual($enu.value);
		}
		else if ($bina.text != null)
		{
			$value = h.getNamedIndividual(sCurrentPrefix);
			addAxiom(h.getDPAssertion(h.getDP(sOntoName, "to_integer"), 
			$value, Integer.parseInt($inte.text, 2)));
		}
		else if ($lis.value != null)
		{
			$value = $lis.value;
		}
	}
}
;

list returns [OWLNamedIndividual value]: ^(LIST 
{
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
			$value = oiPrevious;
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
			$value = oiPrevious;
			
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
}
(
{
//	if (ocCurrentType != null)
//		sCurrentPrefix = sTempPrefix + "_" + (idx);
		sCurrentPrefix = sTempPrefix + "_" + (idx) + "_value";

}
p=parameter
{
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
				$value = oiCurrent;
			}
			else
			{
				addAxiom(h.getOPAssertion(
						h.getOP(sOntology, h.getHasNext(ocTempCurrentType.getIRI().getFragment())),
						oiPrevious, oiCurrent));
			}
			oiPrevious = oiCurrent;
		}
		if ($p.value != null)
		{
			addAxiom(h.getOPAssertion(
					oopContent, oiCurrent, 
					$p.value));
			
		}
	}
	++idx;
}

)*
{
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
	
}
);

data_section : ^(DATA_SECTION 
parameter_list? entity_instance_list);

entity_instance_list : ^(ENTITY_INSTANCE_LIST entity_instance*);

entity_instance :  ^(ENTITY_INSTANCE ein=ENTITY_INSTANCE_NAME 
{
	String sInstanceName = "i" + $ein.text.substring(1);
	log.trace("parsing instance " + sInstancesURN + "#" + sInstanceName);
	oiCurrentInstance = h.getNamedIndividual(sInstanceName);
}
simple_entity_instance?  complex_entity_instance?);

simple_entity_instance :^(SIMPLE_ENTITY_INSTANCE simple_record);

complex_entity_instance : ^(COMPLEX_ENTITY_INSTANCE subsuper_record);

subsuper_record : ^(SUBSUPER_RECORD simple_record_list);

simple_record : ^(SIMPLE_RECORD clas=keyword 
{
	ocCurrentClass = lookForClass($clas.ret);
	if (ocCurrentClass != null)
		addAxiom(h.getClassAssertionAxiom(ocCurrentClass, oiCurrentInstance ));
	
}
parameter_list?
{
	ocCurrentClass = null;
}
);

simple_record_list : ^(SIMPLE_RECORD_LIST simple_record+);

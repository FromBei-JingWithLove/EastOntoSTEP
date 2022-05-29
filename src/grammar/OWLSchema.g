tree grammar OWLSchema;
options 
{
	tokenVocab=Express;
	ASTLabelType=CommonTree;
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
	import gov.nist.msid.ontostep.OWLHelper;
}

@members
{
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
	
}

actual_parameter_list
	:  ^(ACTUAL_PARAMETER_LIST parameter+ ) 
	;

aggregate_initializer
	:  ^(AGGREGATE_INITIALIZER ( element+ )? ) 
	;

aggregate_source
		:  ^(AGGREGATE_SOURCE simple_expression)
		;

aggregate_type
		:  ^(AGGREGATE_TYPE  type_label? parameter_type )
		;

aggregation_types returns [OWLClass owlc]
		:  ^(AGGREGATION_TYPES (
		  at=array_type {$owlc=at;}
		| bt=bag_type {$owlc=bt;}
		| lt=list_type {$owlc=lt;}
		| st=set_type {$owlc=st;}
		))
		;

algorithm_head
		:  ^(ALGORITHM_HEAD declaration* constant_decl? local_decl?)
		;

alias_stmt
		: ^(ALIAS_STMT variable_id general_ref qualifier* stmt+ )
		;

array_type returns [OWLClass owlc]
		: ^(ARRAY_TYPE  bs=bound_spec  'optional'?  'unique'?  bt=base_type )
		{
			$owlc = createSequence(OWLHelper.arrayPrefix, bt.getIRI().getFragment());
			if (bs != null)
			{
				bagset = false;
				if ($bs.down != null)
					lb = $bs.down.intValue();
				else
					lb = 0;
				if ($bs.up != null)
					hb = $bs.up;
				else
					hb = Integer.MAX_VALUE;
			}
		}
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

assignment_stmt
		: ^(ASSIGNMENT_STMT ( general_ref  qualifier* ) expression )
		;

bag_type returns [OWLClass owlc]
		: ^(BAG_TYPE  bs=bound_spec?  bt=base_type )
		{
			$owlc = createBag(bt.getIRI().getFragment());
			if (bs != null)
			{
				bagset = true;
			if ($bs.down != null)
				lb = $bs.down.intValue();
			else
				lb = 0;
			if ($bs.up != null)
				hb = $bs.up;
			else
				hb = Integer.MAX_VALUE;
			}
		}
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

base_type returns [OWLClass owlc]
		:  ^(BASE_TYPE (
		  at=aggregation_types {$owlc = at;}
		| st=simple_types {$owlc = st;}
		| nt=named_types {$owlc = nt;}
		)) 
		;

concrete_types
		:  ^(CONCRETE_TYPES (
		aggregation_types
		| simple_types
		| named_types
		))
		;	

binary_type returns [String stype]
		: ^(BINARY_TYPE  width_spec? ) 
		{
			$stype = "binary";
		}		;

boolean_type returns [String stype]
		: ^(BOOLEAN_TYPE nothing)
		{
			$stype = "boolean";
		}
		;

bound_1 returns [Integer intVal]
		: ^(BOUND_1 ne=numeric_expression) 
		{
			$intVal = $ne.intVal;
		}
		;

bound_2 returns [Integer intVal]
		: ^(BOUND_2 ne=numeric_expression) 
		{
			$intVal = $ne.intVal;
		}
		;

bound_spec returns [Integer down, Integer up]
		: ^(BOUND_SPEC  b1=bound_1 b2=bound_2) 
		{
			$down = $b1.intVal;
			$up = $b2.intVal;
		}
		;

built_in_constant
		:  ^(BUILT_IN_CONSTANT (
		  'const_e'  
		| 'pi' 
		| 'self'  
		| QUESTION
		| STAR
		))
		;

case_action
		:  ^(CASE_ACTION case_label+ stmt) 
		;

case_label
		:  ^(CASE_LABEL expression) 
		;

case_stmt
		: ^(CASE_STMT  selector case_action*  stmt? ) 
		;

compound_stmt
		: ^(COMPOUND_STMT  stmt+ ) 
		;

constant_body
		: ^(CONSTANT_BODY constant_id base_type expression ) 
		;

constant_decl
		: ^(CONSTANT_DECL  constant_body+ ) 
		;

constant_factor
		:  ^(CONSTANT_FACTOR (
		  built_in_constant  
		| constant_ref
		)) 
		;

constant_id
	   :  ^(CONSTANT_ID IDENT) 
	   ;


declaration
		:  ^(DECLARATION (
		  entity_decl
		| subtype_constraint_decl
		| function_decl  
		| procedure_decl
		| type_decl
		)) 
             ;

domain_rule
		:  ^(DOMAIN_RULE ( label )?  logical_expression) 
		;

element
		:  ^(ELEMENT expression  ( repetition  )?) 
		;

entity_head
		: ^(ENTITY_HEAD entity_id
		{
			currentClass = h.getClas($entity_id.text.toLowerCase() );
			log.debug("currentClass=" + $entity_id.text.toLowerCase() );
			addAxiom(h.getDeclarationAxiom(currentClass));
			OWLAnnotation owlca = h.getOCAExpressConstruct("entity");
			addAxiom(h.getAnnotationAxiom(currentClass.getIRI(), owlca));
		}
		( 'abstract' )? (subsuper )? )
		{
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
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

entity_decl
		: ^(ENTITY_DECL entity_head  entity_body)
		;
 
entity_body
		: ^(ENTITY_BODY
		{
			pi = 0;
		}
		 (explicit_attr)* (derive_clause)? (inverse_clause)? (unique_clause)? (where_clause)?)
		;

subsuper
@init
{
	log.debug("subsuper=" );
}
		: ^(SUBSUPER ( supertype_constraint )? ( subtype_declaration )?)
		;

supertype_constraint
		:  ^(SUPERTYPE_CONSTRAINT (
			  abstract_supertype_declaration
			| supertype_rule
		))
		;

abstract_supertype_declaration
		: ^(ABSTRACT_SUPERTYPE_DECLARATION ( subtype_constraint )? )
		;


subtype_declaration
		:  ^(SUBTYPE_DECLARATION 
		{
			int si = 0;
		}
		(er=entity_ref
			{
				OWLAnnotation owlsi = h.getOCASupertypeIndex(si++);				
				OWLSubClassOfAxiom sca = h.getSubClassAxiom(currentClass, er, Collections.singleton(owlsi));
				addAxiom(sca);				
			}
		)+ )
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

subtype_constraint_decl
		:  ^(SUBTYPE_CONSTRAINT_DECL subtype_constraint_head subtype_constraint_body )
;

subtype_constraint_head
		:  ^(SUBTYPE_CONSTRAINT_HEAD subtype_constraint_id entity_ref )
		;

subtype_constraint_body
		:  ^(SUBTYPE_CONSTRAINT_BODY ( abstract_supertype )? ( total_over )? ( supertype_expression )? )
		;

subtype_constraint_id
		:  ^(SUBTYPE_CONSTRAINT_ID  IDENT)
		;

abstract_supertype
		:  ^(ABSTRACT_SUPERTYPE nothing)
		;

total_over
		:  ^(TOTAL_OVER entity_ref ( entity_ref )* )
		;

explicit_attr
@init
{
	List<String> attr = new ArrayList<String>();
	List<OWLDataProperty> redecl = new ArrayList<OWLDataProperty>();
	lb = 1;
	hb = 1;
}
		:  ^(EXPLICIT_ATTR (decl=attribute_decl 
		{
			if ($decl.name != null)
				attr.add($decl.name.toLowerCase());
			if ($decl.owldp != null)
				redecl.add($decl.owldp);
		}
			)+ optional='optional'? type=base_type)
		{
			for(String s : attr)
			{
				OWLClass cl = $type.owlc;
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
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

attribute_decl returns [String name, OWLDataProperty owldp]
		:  ^(ATTRIBUTE_DECL ( id=attribute_id {$name = id;} | ra=redeclared_attribute {$owldp = ra;} ))
		;

redeclared_attribute returns [OWLDataProperty owldp]
		:  ^(REDECLARED_ATTRIBUTE qualified_attribute ( attribute_id )? )
		;

attribute_id returns [String name]
		:  ^(ATTRIBUTE_ID IDENT)
		{
			$name = $IDENT.text.toLowerCase();
		}
		;

qualified_attribute
		:  ^(QUALIFIED_ATTRIBUTE group_qualifier attribute_qualifier)
		;

derive_clause
		:  ^(DERIVE_CLAUSE derived_attr (derived_attr)* )
		;

derived_attr
		:  ^(DERIVED_ATTR attribute_decl base_type expression)
		;

inverse_clause
		:  ^(INVERSE_CLAUSE inverse_attr (inverse_attr)* )
		;

inverse_attr
		:  ^(INVERSE_ATTR attribute_decl ( ( 'set' | 'bag' ) ( bound_spec )? )? entity_ref attribute_ref)
		;

unique_clause
		:  ^(UNIQUE_CLAUSE unique_rule ( unique_rule )* )
		;

unique_rule
		: ^(UNIQUE_RULE ( label )? referenced_attribute ( referenced_attribute)*)
		;

referenced_attribute
		:  ^(REFERENCED_ATTRIBUTE (
			  attribute_ref
			| qualified_attribute
		))
		;

entity_constructor
		:  ^(ENTITY_CONSTRUCTOR entity_ref  (  expression  ( expression  )*  )?  )
		;

entity_id
		: ^(ENTITY_ID IDENT)
		;

enumeration_reference
		: ^(ENUMERATION_REFERENCE (  type_ref )?  enumeration_ref)
		;

escape_stmt
		: ^(ESCAPE_STMT nothing)
		;

expression returns [Integer intVal, Double doubleVal]
		: ^(EXPRESSION se=simple_expression 
		{
			$intVal = $se.intVal;
			$doubleVal = $se.doubleVal;
		}
		( rel_op_extended simple_expression 
		{
			$intVal = null;
			$doubleVal = null;
		}
		)?)
		;

rel_op_extended
		:  ^(REL_OP_EXTENDED (
		  rel_op
		| 'in'
		| 'like'
		))
		;

rel_op
		:  ^(REL_OP (
			  LT
			| GT
			| LE
			| GE
			| LTGT
			| ASSIGN
			| COLLTGT
			| COLEQCOL 
		)) 
		;

factor returns [Integer intVal, Double doubleVal]
		: ^(FACTOR sf1=simple_factor ( sf2=simple_factor )?)
		{
			if (sf2 == null)
			{
				if ($sf1.intVal != null) $intVal = Integer.valueOf($sf1.intVal.intValue());
				if ($sf1.doubleVal != null) $doubleVal = new Double($sf1.doubleVal.doubleValue());
			}
			else
			{
				if ($sf1.intVal != null)
				{
					if ($sf2.intVal != null) $intVal = Integer.valueOf((int)Math.pow($sf1.intVal.doubleValue(), $sf2.intVal.doubleValue()));
					if ($sf2.doubleVal != null) $intVal = Integer.valueOf((int)Math.pow($sf1.intVal.doubleValue(), $sf2.doubleVal.doubleValue()));
				}
				if ($sf1.doubleVal != null) 
				{
					if ($sf2.intVal != null) $doubleVal = new Double(Math.pow($sf1.doubleVal.doubleValue(), $sf2.intVal.doubleValue()));
					if ($sf2.doubleVal != null) $doubleVal = new Double(Math.pow($sf1.doubleVal.doubleValue(), $sf2.doubleVal.doubleValue()));
				}
			}
		}
		;


formal_parameter
		: ^(FORMAL_PARAMETER parameter_id  ( parameter_id  )*  parameter_type) 
		;


attribute_qualifier
		: ^(ATTRIBUTE_QUALIFIER attribute_ref)
		; 


function_call
		: ^(FUNCTION_CALL ( function_ref | built_in_function )  (  actual_parameter_list  )?)
		;

built_in_function
		:  ^(BUILT_IN_FUNCTION (
			  'abs'  
			| 'acos'  
			| 'asin' 
			| 'atan'  
			| 'blength'  
			| 'cos'  
			| 'exists'  
			| 'exp'  
			| 'format'  
			| 'hibound'  
			| 'hiindex'  
			| 'length'  
			| 'lobound'  
			| 'loindex'  
			| 'log'  
			| 'log2'  
			| 'log10'  
			| 'nvl'  
			| 'odd'  
			| 'rolesof'  
			| 'sin'  
			| 'sizeof'  
			| 'sqrt'  
			| 'tan'  
			| 'typeof'  
			| 'usedin'  
			| 'value'  
			| 'value_in'  
			| 'value_unique'
		)) 
		;	

function_decl
		:  ^(FUNCTION_DECL function_head ( algorithm_head)?  stmt  (  stmt  )*)
		;

function_head
		:  ^(FUNCTION_HEAD  function_id  ( formal_parameter  ( formal_parameter )* )?  parameter_type ) 
		;

function_id
		: ^(FUNCTION_ID IDENT)
		;

generalized_types
		:  ^(GENERALIZED_TYPES (
		  aggregate_type  
		| general_aggregation_types  
		| generic_type
		| generic_entity_type
		)) 
		;

generic_entity_type
		:  ^(GENERIC_ENTITY_TYPE nothing)
		;

general_aggregation_types
		:  ^(GENERAL_AGGREGATION_TYPES (
		  general_array_type  
		| general_bag_type  
		| general_list_type  
		| general_set_type
		)) 
		;

general_array_type
		:  ^(GENERAL_ARRAY_TYPE  (  bound_spec  )?  (  'optional'  )?  (  'unique'  )?  parameter_type )
		;

general_bag_type
		:  ^(GENERAL_BAG_TYPE  (  bound_spec  )?  parameter_type )
		;

general_list_type
		:  ^(GENERAL_LIST_TYPE  (  bound_spec  )?  (  'unique'  )?  parameter_type )
		;

general_ref
		:  ^(GENERAL_REF (
		  parameter_ref 
		| variable_ref
		))
		;

general_set_type
		:  ^(GENERAL_SET_TYPE  (  bound_spec  )?  parameter_type ) 
		;

generic_type
		:  ^(GENERIC_TYPE  ( type_label  )? ) 
		;

group_qualifier
		:  ^(GROUP_QUALIFIER  entity_ref )
		;

if_stmt
		:  ^(IF_STMT  logical_expression  stmt  (  stmt  )*  ( else_clause )?  ) 
		;

/* added rule (and node) to break a nondeterminism (stmt) */
else_clause
		:  ^(ELSE_CLAUSE stmt ( stmt )* )
		;

increment
		:  ^(INCREMENT numeric_expression) 
		;

increment_control
		:  ^(INCREMENT_CONTROL variable_id  bound_1  bound_2  (  increment  )? ) 
		;

index
		:  ^(INDEX numeric_expression) 
		;

index_1
		:  ^(INDEX_1 index) 
		;

index_2
		:  ^(INDEX_2 index) 
		;

index_qualifier
		:  ^(INDEX_QUALIFIER  index_1  ( index_2  )? ) 
		;


integer_type returns [String stype]
		:  ^(INTEGER_TYPE nothing)
		{
			$stype="integer";
		}
		;

interval
		:  ^(INTERVAL  interval_low  interval_op  interval_item  interval_op  interval_high ) 
		;

interval_high
		:  ^(INTERVAL_HIGH simple_expression) 
		;

interval_item
		:  ^(INTERVAL_ITEM simple_expression) 
		;

interval_low
		:  ^(INTERVAL_LOW simple_expression) 
		;

interval_op
		:  ^(INTERVAL_OP (
		  LT  
		| LE
		)) 
		;

label
		:  ^(LABEL IDENT) 
		;

list_type returns [OWLClass owlc]
		: ^(LIST_TYPE  (  bs=bound_spec  )?  (  'unique'  )?  bt=base_type ) 
		{
			$owlc = createSequence(OWLHelper.listPrefix, bt.getIRI().getFragment());
			if (bs != null)
			{
				bagset = false;
				if ($bs.down != null)
					lb = $bs.down.intValue();
				else
					lb = 0;
				if ($bs.up != null)
					hb = $bs.up;
				else
					hb = Integer.MAX_VALUE;
				log.debug($bs.down + "-" + $bs.up);
			}
		}
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

/* POD removed binary_literal */
literal returns [Double doubleVal, Integer intVal]
		:  ^(LITERAL (
		  il=integer_literal {$intVal = $il.intVal;}
		| rl=real_literal {$doubleVal = $rl.doubleVal;}
		| logical_literal
		| string_literal
		)) 
		;

integer_literal returns [Integer intVal]
		:  ^(INTEGER_LITERAL INT)
		{
		intVal = Integer.valueOf($INT.text);
		} 
		;

real_literal returns [Double doubleVal]
		:  ^(REAL_LITERAL FLOAT)
		{
		doubleVal = new Double($FLOAT.text);
		}
		;

string_literal
		:  ^(STRING_LITERAL STRING)
		;

local_decl
		: ^(LOCAL_DECL  local_variable  (  local_variable  )* ) 
		;

local_variable
		:  ^(LOCAL_VARIABLE variable_id  ( variable_id  )* parameter_type  ( expression  )? ) 
		;

logical_expression
		:  ^(LOGICAL_EXPRESSION expression) 
		;

logical_literal
		:  ^(LOGICAL_LITERAL (
		'false'  
		| 'true'  
		| 'unknown'
		)) 
		;

logical_type returns [String stype]
		:  ^(LOGICAL_TYPE nothing)
		{
			$stype = "logical";
		}		;

named_types returns [OWLClass owlc]
		:  ^(NAMED_TYPES (
		  er=entity_ref {$owlc = er;} 
		| tr=type_ref {$owlc = tr;}
		))
		;

null_stmt
		:  ^(NULL_STMT nothing)
		;

number_type returns [String stype]
		:  ^(NUMBER_TYPE nothing)
		{
			$stype = "number";
		}		;

numeric_expression returns [Integer intVal, Double doubleVal]
		:  ^(NUMERIC_EXPRESSION se=simple_expression)
		{
			$intVal = $se.intVal;
			$doubleVal = $se.doubleVal;
		} 
		;

//?
one_of returns [OWLClass owlc]
@init
{
	HashSet<OWLClass> ops = new HashSet<OWLClass>();
}
		:  ^(ONE_OF (se=supertype_expression {ops.add($se.owlc);})+) 
		{
			/*
			Iterator<OWLClass> it = ops.iterator();
			$owlc = it.next();
			while(it.hasNext())
			{
				OWLClassExpression oper = it.next();
				OWLClassExpression union = h.getOUnionOf(oper, $owlc);
				OWLClassExpression inter = h.getOIntersectionOf(oper, $owlc);
				log.debug("abs_" + counter + " created");
				$owlc = h.getClas("abs_" + counter++);
				//addAxiom(h.getSubClassAxiom($owlc, thing));
				//TOADD addAxiom(h.getEquivalentClassesAxiom($owlc, h.getOIntersectionOf(union, h.getOComplementOf(inter))));
			}
			*/
			$owlc = h.getClas("abs_" + counter++);
			//addAxiom(h.getDisjointUnionAxiom($owlc, ops));
		}
		;
//catch [OWLOntologyChangeException e] {e.printStackTrace();}

parameter
		:  ^(PARAMETER expression) 
		;

parameter_id
		: ^(PARAMETER_ID IDENT) 
		;

parameter_type
		:  ^(PARAMETER_TYPE (
		  generalized_types  
		| named_types  
		| simple_types
		)) 
		;

population
		:  ^(POPULATION entity_ref)
		;

precision_spec
		:  ^(PRECISION_SPEC numeric_expression) 
		;

primary returns [Integer intVal, Double doubleVal]
		:  ^(PRIMARY (
		  l=literal {$intVal = $l.intVal;$doubleVal = $l.doubleVal;}  
		| qualifiable_factor (  qualifier  )*
		))
		;

procedure_call_stmt
		: ^(PROCEDURE_CALL_STMT ( procedure_ref | built_in_procedure ) (  actual_parameter_list  )?)
		;

built_in_procedure
		: ^(BUILT_IN_PROCEDURE (
		  'insert'
			| 'remove'
		))
		;

procedure_decl
		: ^(PROCEDURE_DECL procedure_head ( algorithm_head )? (  stmt  )*)
		;

procedure_head
		:  ^(PROCEDURE_HEAD  procedure_id ( (  'var'  )?  formal_parameter  ( (  'var'  )?  formal_parameter  )* )? ) 
		;

procedure_id
		: ^(PROCEDURE_ID IDENT)
		;

qualifiable_factor
		:  ^(QUALIFIABLE_FACTOR (
		  attribute_ref
		| constant_factor 
		| function_call
		| population  
		| general_ref
		))
		;

qualifier
		:  ^(QUALIFIER (
		  attribute_qualifier
		| group_qualifier
		| index_qualifier
		))
		;

query_expression
		:  ^(QUERY_EXPRESSION variable_id  aggregate_source  logical_expression )
		;

real_type returns [String stype]
		:  ^(REAL_TYPE  ( precision_spec )? ) 
		{
			$stype="real";
		}
		;

reference_clause
		:  ^(REFERENCE_CLAUSE schema_ref 
			( resource_or_rename  ( resource_or_rename  )* )?) 
		;

rename_id
		:  ^(RENAME_ID (
		  constant_id
		| entity_id
		| function_id
		| procedure_id
		| type_id
		))
		;

repeat_control
		:  ^(REPEAT_CONTROL (  increment_control  )?  (  while_control  )?  (  until_control  )?) 
		;

repeat_stmt
		: ^(REPEAT_STMT repeat_control  stmt  (  stmt  )* )
		;

repetition
		: ^(REPETITION numeric_expression) 
		;

resource_or_rename
		:  ^(RESOURCE_OR_RENAME resource_ref  ( rename_id  )?) 
		;

resource_ref
		:  ^(RESOURCE_REF (
		  constant_ref
		| entity_ref 
		| function_ref 
		| procedure_ref 
		| type_ref
		)) 
		;

return_stmt
		: ^(RETURN_STMT ( expression )? ) 
		;

rule_decl
		:  ^(RULE_DECL rule_head ( algorithm_head )? (  stmt  )*  where_clause)
		;

rule_head
		: ^(RULE_HEAD  rule_id  entity_ref  ( entity_ref  )* ) 
		;

rule_id
		:  ^(RULE_ID IDENT)
		;

schema_id
		:  ^(SCHEMA_ID IDENT)
		;

schema_body
		:  ^(SCHEMA_BODY ( interface_specification )* ( constant_decl )? ( declaration | rule_decl )*)
		;

schema_decl
	     : ^(SCHEMA_DECL ( schema_version_id )? schema_id 
		{
			currentOntoIRI = IRI.create(ontoURI + $schema_id.text.toLowerCase());
			
			// The ontology does not exist: we have to create it and save it at the end.
			if (currentOntology == null)
			{
				physURI = (new File(".")).toURI() + "/" + $schema_id.text.toLowerCase() + ".owl";
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
			Scope currentScope = scopes.get($schema_id.text.toLowerCase());
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
		}
		schema_body
		{
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
		}
		)
	     ;
	     catch [OWLException e]{e.printStackTrace();}

schema_version_id
		: ^(SCHEMA_VERSION_ID string_literal)
		;

interface_specification
		:  ^(INTERFACE_SPECIFICATION (
		  reference_clause
		| use_clause
		))
		;

use_clause
		: ^(USE_CLAUSE schema_ref 
		{
			currentExternalSchema = $schema_ref.text.toLowerCase();
		}
		( named_type_or_rename ( named_type_or_rename )* )? )
		{
			currentExternalSchema = null;
		}
		;

named_type_or_rename
		:  ^(NAMED_TYPE_OR_RENAME named_types ( entity_id | type_id )?)
		;
selector
		:  ^(SELECTOR expression) 
		;

set_type returns [OWLClass owlc]
		: ^(SET_TYPE (  bs=bound_spec  )?  bt=base_type ) 
		{
		if (bs != null)
		{
			bagset = true;
			if ($bs.down != null)
				lb = $bs.down.intValue();
			else
				lb = 0;
			if ($bs.up != null)
				hb = $bs.up;
			else
				hb = Integer.MAX_VALUE;
			log.debug($bs.down + "-" + $bs.up);
		}
		$owlc = createSet(bt.getIRI().getFragment());
	}
;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

simple_expression returns [Integer intVal, Double doubleVal]
		: ^(SIMPLE_EXPRESSION t1=term 
		{
			$intVal = $t1.intVal;
			$doubleVal = $t1.doubleVal;
		}
		( mlo=add_like_op  t2=term 
		{
			if ($intVal != null && $t2.intVal != null)
			{
				if ($mlo.op == PLUS) $intVal = Integer.valueOf($intVal.intValue() + $t2.intVal.intValue());
				else if ($mlo.op == MINUS) $intVal = Integer.valueOf($intVal.intValue() - $t2.intVal.intValue());
				else $intVal = null;
			}
			else if ($doubleVal != null && $t2.doubleVal != null)
			{
				if ($mlo.op == PLUS) $doubleVal = new Double($doubleVal.doubleValue() + $t2.doubleVal.doubleValue());
				if ($mlo.op == MINUS) $doubleVal = new Double($doubleVal.doubleValue() - $t2.doubleVal.doubleValue());
				else $doubleVal = null;
			}
		}
		)* )
		;

add_like_op returns [int op]
		:  ^(ADD_LIKE_OP (
			  PLUS {$op = PLUS;}
			| MINUS  {$op = MINUS;}
			| OR {$op = OR;}
			| XOR {$op = XOR;}
		))
		;

simple_factor returns [Integer intVal, Double doubleVal]
		:  ^(SIMPLE_FACTOR (
		  aggregate_initializer    
		| interval  
		| query_expression  
		| entity_constructor
		| enumeration_reference
		| (  uo=unary_op  )?  ( expression |  p=primary  )
		{
			if (p != null)
			{
				if ($p.intVal != null)
				{
					int i = $p.intVal.intValue();
					if ($uo.op == MINUS)
						$intVal = Integer.valueOf(-i);
					else
						$intVal = Integer.valueOf(i);
				}
				else if ($p.doubleVal != null)
				{
					double d = $p.doubleVal.doubleValue();
					if ($uo.op == MINUS)
						$doubleVal = new Double(-d);
					else
						$doubleVal = new Double(d);
				}
			}
		}
		))
		;

simple_types returns [OWLClass owlc]
		:  ^(SIMPLE_TYPES (
		  typ=binary_type  
		| typ=boolean_type  
		| typ=integer_type
		| typ=logical_type
		| typ=number_type  
		| typ=real_type  
		| typ=string_type
		))
		{
			$owlc = h.getClas(typ);
		}
		;

skip_stmt
		:  ^(SKIP_STMT nothing)
		;

stmt
		:  ^(STMT (
		  alias_stmt
		| assignment_stmt  
		| case_stmt  
		| compound_stmt  
		| escape_stmt  
		| if_stmt  
		| null_stmt  
		| procedure_call_stmt 
		| repeat_stmt  
		| return_stmt  
		| skip_stmt
		)) 
		;

string_type returns [String stype]
		: ^(STRING_TYPE  (  width_spec  )? )
		{
			stype="string";
		}
		;

//?
subtype_constraint
		: ^(SUBTYPE_CONSTRAINT se=supertype_expression)
		{
			//addAxiom(h.getEquivalentClassesAxiom(currentClass, $se.owlc));
		}
		;
//catch [OWLOntologyChangeException e] {e.printStackTrace();}

//?
supertype_expression returns [OWLClass owlc]
@init
{
	HashSet<OWLClass> op = new HashSet<OWLClass>();
}
		: ^(SUPERTYPE_EXPRESSION (sf=supertype_factor {op.add($sf.owlc);})+ ) 
		{
			if (op.size() == 1)
				$owlc = op.iterator().next();
			else
			{
				$owlc = h.getClas("abs_" + counter++);
				//addAxiom(getEquivalentClassesAxiom($owlc, getOUnionOf(op)));
			}
		}
		;
//catch [OWLOntologyChangeException e] {e.printStackTrace();}

//?
supertype_factor returns [OWLClass owlc]
@init
{
	HashSet<OWLClass> op = new HashSet<OWLClass>();
}
		: ^(SUPERTYPE_FACTOR (st=supertype_term {op.add($st.owlc);})+)
		{
			if (op.size() == 1)
				$owlc = op.iterator().next();
			else
			{
				$owlc = h.getClas("abs_" + counter++);
				//addAxiom(getEquivalentClassesAxiom($owlc, getOIntersectionOf(op)));
			}
		}
		;
//catch [OWLOntologyChangeException e] {e.printStackTrace();}

supertype_rule
		: ^(SUPERTYPE_RULE subtype_constraint? ) 
		;

supertype_term returns [OWLClass owlc]
		: ^(SUPERTYPE_TERM (
			  er=entity_ref
			| oo=one_of  
			| se=supertype_expression
		))
		{
			if (er != null)
				$owlc = $er.owlc;
			else if (se != null)
				$owlc = $se.owlc;
			else
			{
				$owlc = $oo.owlc;
			}
		}
		;

syntax
		:  ^(SYNTAX ( language_version_id )? schemaElement=schema_decl
		( schemaElement=schema_decl)*) 
;

language_version_id
		:  ^(LANGUAGE_VERSION_ID nothing)
		;

term returns [Integer intVal, Double doubleVal]
		:  ^(TERM f1=factor 
		{
			$intVal = $f1.intVal;
			$doubleVal = $f1.doubleVal;
		}
		( mlo=multiplication_like_op f2=factor 
		{
			if ($intVal != null && $f2.intVal != null)
			{
				if ($mlo.op == STAR) $intVal = Integer.valueOf($intVal.intValue() * $f2.intVal.intValue());
				else if ($mlo.op == DIVSIGN) $intVal = Integer.valueOf($intVal.intValue() / $f2.intVal.intValue());
				else $intVal = null;
			}
			else if ($doubleVal != null && $f2.doubleVal != null)
			{
				if ($mlo.op == STAR) $doubleVal = new Double($doubleVal.doubleValue() * $f2.doubleVal.doubleValue());
				if ($mlo.op == DIVSIGN) $doubleVal = new Double($doubleVal.doubleValue() / $f2.doubleVal.doubleValue());
				else $doubleVal = null;
			}
		}
		)*)
		;

multiplication_like_op returns [int op]
		:  ^(MULTIPLICATION_LIKE_OP (
			  STAR {$op=STAR;}
			| DIVSIGN {$op=DIVSIGN;}
			| DIV {$op=DIV;}
			| MOD {$op=MOD;}
			| AND {$op=AND;}
			| DOUBLEBAR {$op=DOUBLEBAR;}
		))
		;

type_decl
		:  ^(TYPE_DECL ti=type_id 
		{
			currentType = h.getClas($ti.tid);
		}
		underlying_type ( where_clause )? )
		;

underlying_type 
		:  ^(UNDERLYING_TYPE (
			  constructed_types
			| aggregation_types
			| st=simple_types
			{
				if (st != null)
				{
					addAxiom( h.getSubClassAxiom(currentType, $st.owlc) );
					OWLAnnotation owlca = h.getOCAExpressConstruct("datatype");
					addAxiom(h.getAnnotationAxiom(currentType.getIRI(), owlca));
				}
			}
			| tr=type_ref
			{
				if (tr != null)
				{
					addAxiom( h.getSubClassAxiom(currentType, $tr.owlc) );
					OWLAnnotation owlca = h.getOCAExpressConstruct("datatype");
					addAxiom(h.getAnnotationAxiom(currentType.getIRI(), owlca));
				}
			}
		))
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

constructed_types
		:  ^(CONSTRUCTED_TYPES (
			  enumeration_type
			| select_type
		))
		;

enumeration_type
		:  ^(ENUMERATION_TYPE ( 'extensible' )? ( ( enumeration_items | enumeration_extension ) )? )
		;

enumeration_items
@init
{
	HashSet<OWLIndividual> ind = new HashSet<OWLIndividual>();
}
		:  ^(ENUMERATION_ITEMS (ei=enumeration_id { log.debug($ei.owli.getIRI().toString());ind.add($ei.owli); } )+ )
		{
			if (!bOnlyRL)
			{
				addAxiom(h.getEquivalentClassesAxiom(currentType, h.getOOneOf(ind)));
			}
		}
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

enumeration_extension
		:  ^(ENUMERATION_EXTENSION type_ref ( enumeration_items )? )
		;

enumeration_id returns [OWLNamedIndividual owli]
		: ^(ENUMERATION_ID IDENT)
		{
			$owli = h.getNamedIndividual($IDENT.text.toLowerCase());
			addAxiom(h.getClassAssertionAxiom(currentType, $owli));
			OWLAnnotation owlca = h.getOCAExpressConstruct("enumeration");
			addAxiom(h.getAnnotationAxiom($owli.getIRI(), owlca));
		}
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

select_type
		: ^(SELECT_TYPE ( 'extensible' )? ( 'generic_entity' )? ( sl=select_list | se=select_extension )? )
		{
			//New construct (subclass)
			//Previous construct (equivalent(union))
			if (!bOnlyRL)
			{
				if (se != null)
				{
					addAxiom(h.getEquivalentClassesAxiom(currentType, $se.owld));
					OWLAnnotation owlca = h.getOCAExpressConstruct("select");
					addAxiom(h.getAnnotationAxiom(currentType.getIRI(), owlca));
				}
				else if (sl != null)
				{
					addAxiom(h.getEquivalentClassesAxiom(currentType, $sl.owld));
					OWLAnnotation owlca = h.getOCAExpressConstruct("select");
					addAxiom(h.getAnnotationAxiom(currentType.getIRI(), owlca));
				}
			}
		}
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

select_list returns [OWLClassExpression owld]
@init
{
	/* Old way
	HashSet<OWLClass> comp = new HashSet<OWLClass>();
	*/
}
		:  ^(SELECT_LIST (nt=named_types 
		{
			addAxiom(h.getSubClassAxiom($nt.owlc, currentType));
			/* Old way
			comp.add($nt.owlc);
			*/
		}
		)+)
		{
			/* Old way
				$owld = h.getOUnionOf(comp);
			*/
		}
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

select_extension returns [OWLClassExpression owld]
		:  ^(SELECT_EXTENSION tr=type_ref ( sl=select_list )? )
		{
				addAxiom(h.getSubClassAxiom($tr.owlc, currentType));
				/* Old way
				$owld = h.getOUnionOf($tr.owlc, $sl.owld);
				*/
		}
		;
catch [OWLOntologyChangeException e] {e.printStackTrace();}

type_id returns [String tid]
		: ^(TYPE_ID IDENT)
		{
			$tid = $IDENT.text.toLowerCase();
		}
		;

type_label
		:  ^(TYPE_LABEL IDENT)
		;

type_label_id
		:  ^(TYPE_LABEL_ID IDENT) 
		;

unary_op returns [int op]
		:  ^(UNARY_OP   (  
		  PLUS {$op = PLUS;}
		| MINUS {$op = MINUS;}
		| NOT {$op = NOT;}
		))
		;

until_control
		:  ^(UNTIL_CONTROL  logical_expression) 
		;

variable_id
		:  ^(VARIABLE_ID IDENT)
		;

where_clause
		:  ^(WHERE_CLAUSE  domain_rule (  domain_rule )* ) 
		;

while_control
		:  ^(WHILE_CONTROL  logical_expression ) 
		;

width
		:  ^(WIDTH numeric_expression) 
		;

width_spec
		:  ^(WIDTH_SPEC width  (  'fixed'  )?) 
		;

entity_ref returns [OWLClass owlc]
		: ^(ENTITY_REF IDENT)
		{
			if (currentExternalSchema == null)
				$owlc = h.getClas($IDENT.text.toLowerCase());
			else
				$owlc = h.getClas(currentExternalSchema, $IDENT.text.toLowerCase());
		}
		;

type_ref returns [OWLClass owlc]
		: ^(TYPE_REF IDENT)
		{
			if (currentExternalSchema == null)
				$owlc = h.getClas($IDENT.text.toLowerCase());
			else
				$owlc = h.getClas(currentExternalSchema, $IDENT.text.toLowerCase());
		}
		;

enumeration_ref returns [OWLClass owlc]
		: ^(ENUMERATION_REF IDENT)
		{
			$owlc = h.getClas($IDENT.text.toLowerCase());
		}
		;

attribute_ref
		: ^(ATTRIBUTE_REF IDENT)
		;

constant_ref
		: ^(CONSTANT_REF IDENT)
		;

function_ref
		: ^(FUNCTION_REF IDENT)
		;

parameter_ref
		: ^(PARAMETER_REF IDENT)
		;

variable_ref
		: ^(VARIABLE_REF IDENT)
		;

schema_ref
		: ^(SCHEMA_REF IDENT)
		;

type_label_ref
		: ^(TYPE_LABEL_REF IDENT)
		;

procedure_ref
		: ^(PROCEDURE_REF IDENT)
		;

/* added pseudo-rule because you can't have nodes without arguments */

nothing
		: ('')?
		;

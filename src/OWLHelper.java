import java.util.Set;

import org.apache.log4j.Logger;
import org.semanticweb.owlapi.model.*;

public class OWLHelper
{
    static Logger log = Logger.getLogger(OWLHelper.class);

    private OWLDataFactory factory;
	private String currentOntoURI;
	
	public OWLHelper(OWLDataFactory factory, String currentOntoURI)
	{
		this.factory = factory;
		this.currentOntoURI = currentOntoURI;
	}
	
	public OWLClass getClas(String name)
	{
		return getClas(currentOntoURI, name);
	}
	
	public OWLClass getClas(String schema, String name)
	{
		return factory.getOWLClass(IRI.create(schema + "#" + name));
	}
	
	public OWLSubClassOfAxiom getSubClassAxiom(OWLClassExpression c1, OWLClassExpression c2)
	{
		return factory.getOWLSubClassOfAxiom(c1, c2);
	}
	
	public OWLSubClassOfAxiom getSubClassAxiom(OWLClassExpression c1, OWLClassExpression c2, Set<OWLAnnotation> annotations)
	{
		return factory.getOWLSubClassOfAxiom(c1, c2, annotations);
	}
	
	public OWLDeclarationAxiom getDeclarationAxiom(OWLEntity owle)
	{
		return factory.getOWLDeclarationAxiom(owle);
	}
	
	public OWLDisjointClassesAxiom getDisjointClassesAxiom(java.util.Set<OWLClassExpression> owlds)
	{
		return factory.getOWLDisjointClassesAxiom(owlds);
	}
	
	public OWLDisjointClassesAxiom getDisjointClassesAxiom(OWLClassExpression a, OWLClassExpression b)
	{
		return factory.getOWLDisjointClassesAxiom(a, b);
	}
	
	public OWLDisjointUnionAxiom getDisjointUnionAxiom(OWLClass owlClass, java.util.Set<? extends OWLClassExpression> descriptions)
	{
		return factory.getOWLDisjointUnionAxiom(owlClass, descriptions);
	}
	
	//Object Property
	
	public OWLObjectProperty getOP(String name)
	{
		return getOP(currentOntoURI, name);
	}
	
	public OWLObjectProperty getOP(String schema, String name)
	{
		return factory.getOWLObjectProperty(IRI.create(schema + "#" + name));
	}
	
	public OWLObjectPropertyRangeAxiom getOPRangeAxiom(OWLObjectPropertyExpression p, OWLClassExpression d)
	{
		return factory.getOWLObjectPropertyRangeAxiom(p, d);
	} 
	
	public OWLObjectPropertyDomainAxiom getOPDomainAxiom(OWLObjectPropertyExpression p, OWLClassExpression d)
	{
		return factory.getOWLObjectPropertyDomainAxiom(p, d);
	} 
	
	public OWLFunctionalObjectPropertyAxiom getFunctionalOPAxiom(OWLObjectPropertyExpression p)
	{
		return factory.getOWLFunctionalObjectPropertyAxiom(p);
	}
	
	public OWLTransitiveObjectPropertyAxiom getTransitiveOPAxiom(OWLObjectPropertyExpression p)
	{
		return factory.getOWLTransitiveObjectPropertyAxiom(p);
	}
	
	public OWLSubObjectPropertyOfAxiom getSubOPAxiom(OWLObjectPropertyExpression op1, OWLObjectPropertyExpression op2)
	{
		return factory.getOWLSubObjectPropertyOfAxiom(op1, op2);
	}
	
	public OWLSubPropertyChainOfAxiom getOPChain(java.util.List<? extends OWLObjectPropertyExpression> chain, OWLObjectPropertyExpression superProperty)
	{
	  return factory.getOWLSubPropertyChainOfAxiom(chain, superProperty);
	}
	
	//OP Restrictions
	
	public OWLObjectAllValuesFrom getOAllRestriction(OWLObjectPropertyExpression op, OWLClassExpression oc)
	{
		return factory.getOWLObjectAllValuesFrom(op, oc);
	}
	
	public OWLObjectMaxCardinality getOMaxCardRestriction(OWLObjectPropertyExpression op, int i)
	{
		return factory.getOWLObjectMaxCardinality(i, op);
	}
	
	public OWLObjectMinCardinality getOMinCardRestriction(OWLObjectPropertyExpression op, int i)
	{
		return factory.getOWLObjectMinCardinality(i, op);
	}
	
	public OWLObjectExactCardinality getOExactCardRestriction(OWLObjectPropertyExpression op, int i)
	{
		return factory.getOWLObjectExactCardinality(i, op);
	}
	
	public OWLObjectSomeValuesFrom getOSomeRestriction(OWLObjectPropertyExpression op, OWLClassExpression oc)
	{
		return factory.getOWLObjectSomeValuesFrom(op, oc);
	}
	
	//DataTypes
	
	public OWLDatatype getDataTypeW3(String name)
	{
		return factory.getOWLDatatype(IRI.create("http://www.w3.org/2001/XMLSchema#" + name));
	}
	
	public OWLDataPropertyDomainAxiom getDPDomainAxiom(OWLDataPropertyExpression dp, OWLClassExpression dom)
	{
		return factory.getOWLDataPropertyDomainAxiom(dp, dom);
	}
	
	public OWLDataPropertyRangeAxiom getDPRangeAxiom(OWLDataProperty dp, OWLDatatype dt)
	{
		return factory.getOWLDataPropertyRangeAxiom(dp, dt);
	}
	
	
	//DP Property
	
	public OWLDataProperty getDP(String name)
	{
		
		return getDP(currentOntoURI, name);
	}
	
	public OWLDataProperty getDP(String schema, String name)
	{
		return factory.getOWLDataProperty(IRI.create(schema + "#" + name));
	}
	
	
	//Class Operations
	
	public OWLObjectIntersectionOf getOIntersectionOf(OWLClassExpression... descs)
	{
		return factory.getOWLObjectIntersectionOf(descs);
	}
	
	public OWLObjectIntersectionOf getOIntersectionOf(java.util.Set<? extends OWLClassExpression> descs)
	{
		return factory.getOWLObjectIntersectionOf(descs);
	}
	
	public OWLObjectUnionOf getOUnionOf(OWLClassExpression... descs)
	{
		return factory.getOWLObjectUnionOf(descs);
	}
	
	public OWLObjectUnionOf getOUnionOf(java.util.Set<? extends OWLClassExpression> descs)
	{
		return factory.getOWLObjectUnionOf(descs);
	}
	
	public OWLEquivalentClassesAxiom getEquivalentClassesAxiom(OWLClassExpression c1, OWLClassExpression c2)
	{
		 return factory.getOWLEquivalentClassesAxiom(c1, c2); 
	} 
	
	public OWLEquivalentClassesAxiom  getEquivalentClassesAxiom(java.util.Set<? extends OWLClassExpression> descs) 
	{
		return factory.getOWLEquivalentClassesAxiom(descs); 
	}
	
	public OWLObjectComplementOf getOComplementOf(OWLClassExpression desc)
	{
		 return factory.getOWLObjectComplementOf(desc); 
	} 
	
	public OWLObjectOneOf getOOneOf(OWLIndividual... ind)
	{
		return factory.getOWLObjectOneOf(ind);
	}
	
	public OWLObjectOneOf getOOneOf(java.util.Set<OWLIndividual> ind)
	{
		return factory.getOWLObjectOneOf(ind);
	}
	
	//Annotations
	/*
	public OWLCommentAnnotation getCommentAnnotation(String text)
	{
		return factory.getCommentAnnotation(text);
	}
	*/
	protected OWLAnnotation getOConstantAnnotation(IRI name, String value)
	{
		return factory.getOWLAnnotation(factory.getOWLAnnotationProperty(name), factory.getOWLLiteral(value));
	}
	
	protected OWLAnnotation getOConstantAnnotation(IRI name, int value)
	{
		return factory.getOWLAnnotation(factory.getOWLAnnotationProperty(name), factory.getOWLLiteral(value));
	}
	
	public OWLAnnotationAssertionAxiom getAnnotationAxiom(OWLAnnotationSubject subject, OWLAnnotation annotation)
	{
		return factory.getOWLAnnotationAssertionAxiom(subject, annotation); 
	}
	
	public String getLiteral(OWLOntology ontology, IRI IRI, OWLEntity entity)
	{
		if (ontology == null || IRI == null || entity == null)
		{
			log.error("Cannot retrieve the value of the annotation " + IRI + " of the entity " + entity + " in the ontology " + ontology);
			return null;
		}
		Set<OWLAnnotation> annotations = entity.getAnnotations(ontology, factory.getOWLAnnotationProperty(IRI));
		if (!annotations.isEmpty())
		{
			OWLAnnotationValue value = annotations.iterator().next().getValue();
			if (value instanceof OWLLiteral)
				return ((OWLLiteral)value).getLiteral();
		}
		return null;
	}
	
	public String getLiteral(OWLOntology ontology, IRI IRI, OWLAxiom axiom)
	{
		if (ontology == null || IRI == null || axiom == null)
		{
			log.error("Cannot retrieve the value of the annotation " + IRI + " of the entity " + axiom + " in the ontology " + ontology);
			return null;
		}
		Set<OWLAnnotation> annotations = axiom.getAnnotations(factory.getOWLAnnotationProperty(IRI));
		if (!annotations.isEmpty())
		{
			OWLAnnotationValue value = annotations.iterator().next().getValue();
			if (value instanceof OWLLiteral)
				return ((OWLLiteral)value).getLiteral();
		}
		return null;
	}
	
	//Naming conventions
	public static final String bagPrefix = "bag";
	public static final String arrayPrefix = "array";
	public static final String listPrefix = "list";
	public static final String setPrefix = "set";
	
	public OWLAnnotation getOCAType(String value)
	{
		return getOConstantAnnotation(getIRIType(), value);
	}
	
	public OWLAnnotation getOCAExpressConstruct(String value)
	{
		return getOConstantAnnotation(getIRIExpressConstruct(), value);
	}
	
	public OWLAnnotation getOCAParameterIndex(int value)
	{
		return getOConstantAnnotation(getIRIParameterIndex(), value);

	}
	
	public OWLAnnotation getOCASupertypeIndex(int value)
	{
		return getOConstantAnnotation(getIRISupertypeIndex(), value);

	}
	
	public IRI getIRIType(String schema)
	{
		return IRI.create(schema + "#OPType");
	}
	
	public IRI getIRIExpressConstruct(String schema)
	{
		return IRI.create(schema + "#ExpConstruct");
	}
	
	public IRI getIRIParameterIndex(String schema)
	{
		return IRI.create(schema + "#ParameterIndex");
	}
	
	public IRI getIRISupertypeIndex(String schema)
	{
		return IRI.create(schema + "#SupertypeIndex");
	}
	
	public IRI getIRIType()
	{
		return getIRIType(currentOntoURI);
	}
	
	public IRI getIRIExpressConstruct()
	{
		return getIRIExpressConstruct(currentOntoURI);
	}
	
	public IRI getIRIParameterIndex()
	{
		return getIRIParameterIndex(currentOntoURI);
	}
	
	public IRI getIRISupertypeIndex()
	{
		return getIRISupertypeIndex(currentOntoURI);
	}
	
	private static final String sEntityToAttribute = "_has_";
	
	public static String getOPName(String entity, String attribute)
	{
		return entity + sEntityToAttribute + attribute;
	}
	
	public static String getOPAttribute(String op, String entity)
	{
		String sTemp = entity + sEntityToAttribute;
		if (op.startsWith(sTemp))
			return op.substring(sTemp.length());
		return null;
	}
	
	public static String getDeclaration(String aggregation, String type)
	{
		return aggregation + "_of_" + type;
	}
	
	private static final String hasContentPrefix = "_has_content";
	
	public static String getHasContent(String aggregation, String type)
	{
		return OWLHelper.getDeclaration(aggregation, type) + hasContentPrefix;
	}
	
	public static String getHasContent(String aggregationname)
	{
		return aggregationname + hasContentPrefix;
	}
	
	
	private static final String contentDeclarationPrefix = "content_of_";
	private static final String contentDeclarationSuffix = "";
	
	public static String getContentDeclaration(String aggregation, String type)
	{
		return contentDeclarationPrefix + getDeclaration(aggregation, type) + contentDeclarationSuffix;
	}
	public static String getContentDeclaration(String aggregationname)
	{
		return contentDeclarationPrefix + aggregationname + contentDeclarationSuffix;
	}
	
	
	private static final String hasValueSuffix = "_has_value";
	
	public static String getHasValue(String aggregation, String type)
	{
		return getContentDeclaration(aggregation, type) + hasValueSuffix;
	}
	
	public static String getHasValue(String aggregationname)
	{
		return aggregationname + hasValueSuffix;
	}
	
	
	private static final String emptyPrefix = "empty";
	
	public static String getEmptyDeclaration(String aggregation, String type)
	{
		return emptyPrefix + getDeclaration(aggregation, type);
	}
	
	public static String getEmptyDeclaration(String aggregationname)
	{
		return emptyPrefix + aggregationname;
	}
	
	
	private static final String hasListPrefix = "has";
	
	public static String getHasList(String aggregation, String type)
	{
		return hasListPrefix + getDeclaration(aggregation, type);
	}
	
	public static String getHasList(String aggregationname)
	{
		return hasListPrefix + aggregationname;
	}
	
	
	private static final String hasNextSuffix = "_has_next";
	
	public static String getHasNext(String aggregation, String type)
	{
		return getDeclaration(aggregation, type) + hasNextSuffix;
	}
	
	public static String getHasNext(String aggregationname)
	{
		return aggregationname + hasNextSuffix;
	}
	
	
	private static final String hasElementSuffix = "_has_element";
	
	public static String getHasElement(String aggregation, String type)
	{
		return getDeclaration(aggregation, type) + hasElementSuffix;
	}
	
	public static String getHasElement(String aggregationname)
	{
		return aggregationname + hasElementSuffix;
	}
	

	private static final String isFollowedBySuffix = "_is_followed_by";

	public static String getIsFollowedBy(String aggregation, String type)
	{
		return getDeclaration(aggregation, type) + isFollowedBySuffix;
	}

	public static String getIsFollowedBy(String aggregationname)
	{
		return aggregationname + isFollowedBySuffix;
	}

	
	//Individuals
	
	public OWLNamedIndividual getNamedIndividual(String name)
	{
		return getNamedIndividual(currentOntoURI, name); 
	}
	
	public OWLNamedIndividual getNamedIndividual(String schema, String name)
	{
		return factory.getOWLNamedIndividual(IRI.create(schema + "#" + name)); 
	}
	
	public OWLClassAssertionAxiom getClassAssertionAxiom(OWLClassExpression cla, OWLIndividual ind)
	{
		return factory.getOWLClassAssertionAxiom(cla, ind);
	}
	
	public OWLDataPropertyAssertionAxiom getDPAssertion(OWLDataProperty owldp, OWLIndividual owli, int i)
	{
		return factory.getOWLDataPropertyAssertionAxiom(owldp, owli, i);
	}
	public OWLDataPropertyAssertionAxiom getDPAssertion(OWLDataProperty owldp, OWLIndividual owli, String s)
	{
		return factory.getOWLDataPropertyAssertionAxiom(owldp, owli, s);
	}
	public OWLDataPropertyAssertionAxiom getDPAssertion(OWLDataProperty owldp, OWLIndividual owli, double d)
	{
		return factory.getOWLDataPropertyAssertionAxiom(owldp, owli, factory
				.getOWLLiteral(
						Double
								.toString(d),
						factory
								.getOWLDatatype(IRI
										.create("http://www.w3.org/2001/XMLSchema#decimal"))));
	}
	public OWLDataPropertyAssertionAxiom getDPAssertion(OWLDataProperty owldp, OWLIndividual owli, boolean b)
	{
		return factory.getOWLDataPropertyAssertionAxiom(owldp, owli, b);
	}
	public OWLObjectPropertyAssertionAxiom getOPAssertion(OWLObjectProperty owlop, OWLIndividual owli1, OWLIndividual owli2)
	{
		return factory.getOWLObjectPropertyAssertionAxiom(owlop, owli1, owli2);
	}

}

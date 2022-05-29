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


import org.semanticweb.owl.model.OWLIndividual;

import jsdai.lang.Value;

public class AggregationStructure
{
	private String aggregationType;
	private String elementType;
	private OWLIndividual firstElement;
	private Object object;
	private String prefix;
	private AggregationStructure subAggregation;
	private Value value;
	
	public AggregationStructure()
	{
		setValue(null);
		setAggregationType(null);
		setSubAggregation(null);
		setFirstElement(null);
		setPrefix(null);
	}
	
	public String getAggregationType()
	{
		return aggregationType;
	}
	
	public String getClassPrefix()
	{
		String ret = aggregationType + "_of_";
		if (subAggregation != null)
			ret += subAggregation.getAggregationType();
		else if (elementType != null)
			ret += elementType;
		return ret;
	}
	
	public String getElementType()
	{
		return elementType;
	}
	
	public OWLIndividual getFirstElement()
	{
		return firstElement;
	}
	
	public Object getObject()
	{
		return object;
	}
	
	public String getPrefix()
	{
		return prefix;
	}
	
	public AggregationStructure getSubAggregation()
	{
		return subAggregation;
	}
	
	public Value getValue()
	{
		return value;
	}
	
	public void setAggregationType(String aggregationType)
	{
		this.aggregationType = aggregationType;
	}
	
	public void setElementType(String elementType)
	{
		this.elementType = elementType;
	}
	
	public void setFirstElement(OWLIndividual firstElement)
	{
		this.firstElement = firstElement;
	}
	
	public void setObject(Object object)
	{
		this.object = object;
	}
	
	public void setPrefix(String prefix)
	{
		this.prefix = prefix;
	}
	
	public void setSubAggregation(AggregationStructure subAggregation)
	{
		this.subAggregation = subAggregation;
	}
	
	public void setValue(Value value)
	{
		this.value = value;
	}
	
}

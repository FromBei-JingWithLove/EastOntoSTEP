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

public class SimpleStructure
{
	private OWLIndividual range;
	private Value value;
	
	public SimpleStructure()
	{
		//Nothing to do
	}
	
	public OWLIndividual getRange()
	{
		return range;
	}
	
	public Value getValue()
	{
		return value;
	}
	
	public void setRange(OWLIndividual range)
	{
		this.range = range;
	}
	
	public void setValue(Value value)
	{
		this.value = value;
	}
	
}

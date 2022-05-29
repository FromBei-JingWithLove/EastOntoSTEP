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

import java.util.Vector;

class EnumerationType
{
	
	private Vector<String> ids;
	public boolean extensible;
	public String typename;
	public String basedOnName;
	
	public EnumerationType()
	{
		ids = new Vector<String>();
	}
	
	public void setTypeName(String name)
	{
		typename = name;
	}
	
	public void setExtensible(boolean ext)
	{
		extensible = ext;
	}
	
	public void setBasedOn(String bo)
	{
		basedOnName = bo;
	}
	
	public void add(String eid)
	{
		ids.add(eid);
	}
	
	public void extendWith(EnumerationType et)
	{
		ids.addAll(et.ids);
	}
	
	public int getCount()
	{
		return ids.size();
	}
	
	public String getEnumerationId(int index)
	{
		return ids.elementAt(index);
	}
}

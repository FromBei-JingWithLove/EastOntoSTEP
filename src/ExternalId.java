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


class ExternalId
{
	
	/*
	 * may represent an id of a schema referenced or used by another schema
	 * with its new name if it exists/ may also represent a couple id-type
	 */

	public String schema; /* schema from which this element is referenced/used */
	public String id;
	public String rename;
	public int type;
	
	public ExternalId(String id)
	{
		this.id = id;
	}
	
	public ExternalId(String id, int type)
	{
		this.id = id;
		this.type = type;
	}
	
	public void setSchema(String s)
	{
		schema = s;
	}
	
	public void setRename(String rename)
	{
		this.rename = rename;
	}
}

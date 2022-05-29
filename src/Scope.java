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

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

/* There are two linking hierarchies here, a tree-like one (using the
 parent atribute) which allows id research into the scopes tree, and a flat
 one (sort of linked list of Scopes, using the next attribute) which reflects
 the order of Scope instances creations during the first pass, thus we can
 retrieve corresponding Scope instances during the second pass
 In addition, information about entities is recorded so as to perform a
 research through the inheritance tree.
 */

public class Scope implements Cloneable
{
	
	static org.apache.log4j.Logger log = org.apache.log4j.Logger
			.getLogger(Scope.class);
	
	/* scope id */
	public int scopeId; /* for debugging purpose */
	private static int globalId = 1;
	
	/* id recording */
	private Hashtable<String, Integer> idtable; /* ids */
	
	/* entities management */
	private boolean entity; /* if we are in a scope defined by an entity */
	private Hashtable<String, Scope> entities; /*
									 * references to scopes of entities
									 * defined here
									 */
	private Vector<String> superentities; /* names of super entities of this */
	
	/*
	 * schema case: Only if this scope is defined by a schema. External
	 * elements (reference from, use from) are recorded here and then
	 * postprocessed
	 */
	private Vector<ExternalId> references; /*
									 * external elements referenced
									 */
	private Vector<ExternalId> uses; /*
							 * external elements used
							 */
	private boolean extdone = false; /* processExternals already done */
	private Vector<String> allReferencedSchemas; /*
										 * all elements of these
										 * schemas are referenced
										 */
	private Vector<String> allUsedSchemas; /*
									 * all elements of these schemas
									 * are used
									 */
	
	private Vector<EnumerationType> enumerationTypes; /*
											 * Enumerations linked to
											 * their defining TYPE to
											 * manage enumerations
											 * reference
											 */
	
	/* scope linking */
	public Scope parent; /* Scope which this Scope is defined within */
	public Scope next; /* next Scope beeing created during the pass */
	
	public void addId(String id, int type)
	{
		Integer i;
		
		/*
		 * records an id with its tokentype drops an error when already
		 * defined. Enumeration ids are recorded in the parent scope for
		 * visibility reasons (it should be visible out of the TYPE in which
		 * it is defined
		 */
		i = idtable.get(id.toLowerCase());
		if (i == null)
			idtable.put(id.toLowerCase(), Integer.valueOf(type));
		else
			System.err.println("Warning: id \"" + id + "\" already defined");
	}
	
	public void addEnumerationType(EnumerationType et)
	{
		Integer ii;
		int sz, i;
		String id;
		
		/*
		 * to record enumeration ids out of their original scope (TYPE) Also
		 * records the enumerations with the type where they are defined so
		 * they can be retrieved when processing REFERENCE clauses
		 */
		sz = et.getCount();
		for (i = 0; i < sz; i++)
		{
			id = et.getEnumerationId(i);
			ii = idtable.get(id.toLowerCase());
			if (ii == null)
				idtable.put(id.toLowerCase(), Integer
						.valueOf(ExpressParser.ENUMERATION_IDENT));
			else if (ii.intValue() != ExpressParser.ENUMERATION_IDENT)
				System.err.println("Warning: id \"" + id
						+ "\" already defined");
		}
		if (enumerationTypes == null)
			enumerationTypes = new Vector<EnumerationType>();
		enumerationTypes.add(et);
	}
	
	public EnumerationType searchEnumerationType(String name)
	{
		int sz, i;
		EnumerationType et;
		
		if (enumerationTypes != null)
		{
			sz = enumerationTypes.size();
			for (i = 0; i < sz; i++)
			{
				et = enumerationTypes.elementAt(i);
				if (et.typename.equals(name))
					return et;
			}
		}
		return null;
	}
	
	public void addEntityScope(String name, Scope s)
	{
		Object o;
		
		/* records a reference of the scope defined by the entity name */
		o = entities.get(name.toLowerCase());
		if (o == null)
			entities.put(name.toLowerCase(), s);
		else
			System.err.println("Warning: entity \"" + name
					+ "\" already defined in this scope");
	}
	
	public void addSuperEntity(String name)
	{
		superentities.add(name);
	}
	
	public int searchId(String id)
	{
		Integer i;
		int it;
		
		/*
		 * search the given id in this scope's table, in the entity
		 * inheritance tree and in all the scopes tree if not found. Because
		 * of part 10.2.2 of ISO 10303-11:1994, we have to consider the case
		 * of redeclaration of attribute without hiding the entity with the
		 * same name in the outer scope. So if an id is declared as en entity
		 * and an attribute, an ENTITY_ATTR_IDENT token is generated. same for
		 * TYPE_ATTR_IDENT, ENTITY_VAR_IDENT, TYPE_VAR_IDENT
		 * ENTITY_PARAM_IDENT and TYPE_PARAM_IDENT
		 */
		if (id == null)
		{
			i = null;
		}
		else
		{
			i = idtable.get(id.toLowerCase());
		}
		if (i == null)
		{
			log.debug("the ID " + id + " does not exist in the scope " + scopeId);
			if (entity)
			{
				i = searchInheritanceTree(id);
				if (i != null)
				{
					if (i.intValue() == ExpressParser.ATTRIBUTE_IDENT)
					{
						if (parent != null)
						{
							it = parent.searchId(id);
							if (it == ExpressParser.ENTITY_IDENT)
								return ExpressParser.ENTITY_ATTR_IDENT;
							else if (it == ExpressParser.TYPE_IDENT)
								return ExpressParser.TYPE_ATTR_IDENT;
						}
					}
					else if (i.intValue() == ExpressParser.VARIABLE_IDENT)
					{
						if (parent != null)
						{
							it = parent.searchId(id);
							if (it == ExpressParser.ENTITY_IDENT)
								return ExpressParser.ENTITY_VAR_IDENT;
							else if (it == ExpressParser.TYPE_IDENT)
								return ExpressParser.TYPE_VAR_IDENT;
						}
					}
					else if (i.intValue() == ExpressParser.PARAMETER_IDENT)
					{
						if (parent != null)
						{
							it = parent.searchId(id);
							if (it == ExpressParser.ENTITY_IDENT)
								return ExpressParser.ENTITY_PARAM_IDENT;
							else if (it == ExpressParser.TYPE_IDENT)
								return ExpressParser.TYPE_PARAM_IDENT;
						}
					}
					return i.intValue();
				}
			}
			if (parent != null)
				return parent.searchId(id);
			return ExpressParser.IDENT;
		}
		log.debug("the ID " + id + ":" + i + " has been found in the scope -" +scopeId);
		if (i.intValue() == ExpressParser.ATTRIBUTE_IDENT)
		{
			if (parent != null)
			{
				it = parent.searchId(id);
				if (it == ExpressParser.ENTITY_IDENT)
					return ExpressParser.ENTITY_ATTR_IDENT;
				else if (it == ExpressParser.TYPE_IDENT)
					return ExpressParser.TYPE_ATTR_IDENT;
			}
		}
		else if (i.intValue() == ExpressParser.VARIABLE_IDENT)
		{
			if (parent != null)
			{
				it = parent.searchId(id);
				if (it == ExpressParser.ENTITY_IDENT)
					return ExpressParser.ENTITY_VAR_IDENT;
				else if (it == ExpressParser.TYPE_IDENT)
					return ExpressParser.TYPE_VAR_IDENT;
			}
		}
		else if (i.intValue() == ExpressParser.PARAMETER_IDENT)
		{
			if (parent != null)
			{
				it = parent.searchId(id);
				if (it == ExpressParser.ENTITY_IDENT)
					return ExpressParser.ENTITY_PARAM_IDENT;
				else if (it == ExpressParser.TYPE_IDENT)
					return ExpressParser.TYPE_PARAM_IDENT;
			}
		}
		return i.intValue();
	}
	
	public Integer searchInheritanceTree(String id)
	{
		Integer i;
		int sz, j;
		String name;
		Scope ent;
		
		i = idtable.get(id.toLowerCase());
		if (i != null)
			return i;
		sz = superentities.size();
		if (sz > 0)
		{
			for (j = 0; (j < sz) && (i == null); j++)
			{
				name = superentities.elementAt(j);
				if (parent != null)
				{
					ent = parent.searchEntity(name);
					if (ent == null)
						log.warn("Error: unable to resolve entity \""
										+ name + "\"");
					else
						i = ent.searchInheritanceTree(id);
				}
			}
		}
		return i;
	}
	
	public Scope searchEntity(String name)
	{
		log.debug("looking for " + name);
		Scope ent;
		
		ent = entities.get(name.toLowerCase());
		if ((ent == null) && (parent != null))
			ent = parent.searchEntity(name);
		return ent;
	}
	
	/* schema case */
	public void addUse(ExternalId ei)
	{
		/* an element from another schema (used or referenced) */
		if (uses == null)
			uses = new Vector<ExternalId>();
		
		uses.add(ei);
	}
	
	public void addReference(ExternalId ei)
	{
		/* an element from another schema (used or referenced) */
		if (references == null)
			references = new Vector<ExternalId>();
		
		references.add(ei);
	}
	
	public Vector<ExternalId> getReferencedExternals()
	{
		/*
		 * get all elements of this schema that can be referenced i.e.
		 * constant, entity, function, procedure, type
		 */
		Enumeration<String> e;
		String id;
		int type;
		Vector<ExternalId> res = null;
		ExternalId ei;
		
		e = idtable.keys();
		while (e.hasMoreElements())
		{
			id = e.nextElement();
			type = (idtable.get(id.toLowerCase())).intValue();
			if (type == ExpressParser.CONSTANT_IDENT
					|| type == ExpressParser.ENTITY_IDENT
					|| type == ExpressParser.FUNCTION_IDENT
					|| type == ExpressParser.PROCEDURE_IDENT
					|| type == ExpressParser.TYPE_IDENT)
			{
				if (res == null)
					res = new Vector<ExternalId>();
				ei = new ExternalId(id, type);
				res.add(ei);
			}
		}
		return res;
	}
	
	public Vector<ExternalId> getUsedExternals()
	{
		/*
		 * get all elements of this schema that can be used i.e. entity, type
		 */
		Enumeration<String> e;
		String id;
		int type;
		Vector<ExternalId> res = null;
		ExternalId ei;
		
		e = idtable.keys();
		while (e.hasMoreElements())
		{
			id = e.nextElement();
			type = idtable.get(id.toLowerCase()).intValue();
			if (type == ExpressParser.ENTITY_IDENT
					|| type == ExpressParser.TYPE_IDENT)
			{
				if (res == null)
					res = new Vector<ExternalId>();
				ei = new ExternalId(id, type);
				res.add(ei);
			}
		}
		return res;
	}
	
	public void addAllReferenceExternals(String schema)
	{
		/* schema referenced here (all elements) */
		if (allReferencedSchemas == null)
			allReferencedSchemas = new Vector<String>();
		allReferencedSchemas.add(schema);
	}
	
	public void addAllUseExternals(String schema)
	{
		/* schema used here (all elements) */
		if (allUsedSchemas == null)
			allUsedSchemas = new Vector<String>();
		allUsedSchemas.add(schema);
	}
	
	public void processUses(Hashtable<String, Scope> schemas)
	{
		/*
		 * add ids of used elements of other schemas to this schema's scope
		 */
		int sz, i, sz2, j, eid;
		ExternalId ei;
		Scope s, es = null;
		Vector<ExternalId> eids;
		EnumerationType et, ext;
		
		if (!extdone)
		{
			if (uses != null)
			{
				/*
				 * Here we manage REFERENCES to (or USE of) single elements,
				 * when specified in the REFERENCE or USE clause
				 */
				sz = uses.size();
				for (i = 0; i < sz; i++)
				{
					ei = uses.elementAt(i);
					String eischema = ei.schema.toLowerCase();
					String eiid = ei.id.toLowerCase();
					String eirn = ei.rename;
					if (eirn != null)
						eirn = eirn.toLowerCase();
					log.debug("looking for " + eischema + ":" + eiid);
					s = schemas.get(eischema);
					if (s == null)
						log
								.warn("Warning: USED schema \""
										+ eischema
										+ "\" does not exist in the parsed file");
					else
					{
						/*
						 * schema has to be processed before since you can
						 * USE or REFERENCE elements that the schema USEs
						 * itself
						 */
						s.processUses(schemas);
						eid = s.searchId(eiid);
						if (eid == ExpressParser.IDENT)
							log.warn("Warning: external id \"" + eiid
									+ "\" not found in schema \""
									+ eischema + "\"");
						else
						{
							/*
							 * idtable.put is used instead of addId
							 * because some externals ids may be imported
							 * twice or more, so it would throw double
							 * definition errors
							 */
							if (eirn != null)
								idtable.put(eirn, Integer.valueOf(eid));
							else
								idtable.put(eiid, Integer.valueOf(eid));
							
							if (idtable.get(eischema) == null)
								idtable.put(eischema,
										ExpressParser.SCHEMA_IDENT);
							
							/* Entity information (Scope) management */
							if (eid == ExpressParser.ENTITY_IDENT)
							{
								try
								{
									es = (Scope) s.searchEntity(ei.id)
											.clone();
									/*
									 * we clone the Scope because we
									 * have to assign a new parent to
									 * it (this), but the original
									 * Scope should keep its parent
									 * attribute safe
									 */
								}
								catch (CloneNotSupportedException cnse)
								{
								}
								es.setParent(this);
								entities.put(eiid, es);
							}
							/* Extensible enumerations management */
							else if (eid == ExpressParser.TYPE_IDENT)
							{
								et = s.searchEnumerationType(ei.id);
								if (et != null)
								{
									if (eirn != null)
										et.setTypeName(eirn);
									if (et.basedOnName != null)
									{
										ext = s
												.searchEnumerationType(et.basedOnName);
										if (ext != null)
										{
											if (!ext.extensible)
												log
														.warn("Warning: enumeration type \""
																+ et.typename
																+ "\" based on non extensible enumeration \""
																+ et.basedOnName
																+ "\"");
											et.extendWith(ext);
										}
										else
											log
													.warn("Warning: extensible enumeration \""
															+ et.basedOnName
															+ "\" not found");
									}
									addEnumerationType(et);
								}
							}
						}
					}
				}
			}
			if (allUsedSchemas != null)
			{
				/*
				 * Here we manage USEs of all useable elements of a schema
				 * (when no element is specified in the USE clause)
				 */
				sz = allUsedSchemas.size();
				for (i = 0; i < sz; i++)
				{
					String usedschema = allUsedSchemas.elementAt(i)
							.toLowerCase();
					log.debug("looking for " + usedschema);
					s = schemas.get(usedschema);
					if (s == null)
						log
								.warn("Warning: USED schema \""
										+ usedschema
										+ "\" does not exist in the parsed file");
					else
					{
						if (idtable.get(usedschema) == null)
							idtable.put(usedschema,
									ExpressParser.SCHEMA_IDENT);
						eids = s.getUsedExternals();
						if (eids != null)
						{
							sz2 = eids.size();
							for (j = 0; j < sz2; j++)
							{
								ei = eids.elementAt(j);
								String eiid = ei.id.toLowerCase();
								String eirn = ei.rename;
								if (eirn != null)
									eirn = eirn.toLowerCase();
								idtable.put(eiid, Integer
										.valueOf(ei.type));
								
								/* Entity information (Scope) management */
								if (ei.type == ExpressParser.ENTITY_IDENT)
								{
									try
									{
										es = (Scope) s.searchEntity(
												eiid).clone();
									}
									catch (CloneNotSupportedException cnse)
									{
									}
									es.setParent(this);
									entities.put(eiid, es);
								}
								/* extensible enumerations management */
								else if (ei.type == ExpressParser.TYPE_IDENT)
								{
									et = s
											.searchEnumerationType(ei.id);
									if (et != null)
									{
										if (eirn != null)
											et.setTypeName(eirn);
										if (et.basedOnName != null)
										{
											ext = searchEnumerationType(et.basedOnName);
											if (ext != null)
											{
												if (!ext.extensible)
													log
															.warn("Warning: enumeration type \""
																	+ et.typename
																	+ "\" based on non extensible enumeration \""
																	+ et.basedOnName
																	+ "\"");
												et.extendWith(ext);
											}
											else
												log
														.warn("Warning: extensible enumeration \""
																+ et.basedOnName
																+ "\" not found");
										}
										addEnumerationType(et);
									}
								}
							}
						}
					}
				}
			}
		}
		extdone = true;
	}
	
	public void processReferences(Hashtable<String, Scope> schemas)
	{
		/*
		 * add ids of used and referenced elements of other schemas to this
		 * schema's scope
		 */
		int sz, i, sz2, j, eid;
		ExternalId ei;
		Scope s, es = null;
		Vector<ExternalId> eids;
		EnumerationType et, ext;
		
		if (references != null)
		{
			/*
			 * Here we manage REFERENCES to (or USE of) single elements, when
			 * specified in the REFERENCE or USE clause
			 */
			sz = references.size();
			for (i = 0; i < sz; i++)
			{
				ei = references.elementAt(i);
				String eischema = ei.schema.toLowerCase();
				String eiid = ei.id.toLowerCase();
				String eirn = ei.rename;
				if (eirn != null)
					eirn = eirn.toLowerCase();
				log.debug("looking for " + eischema);
				s = schemas.get(eischema);
				if (s == null)
					log.warn("Warning: REFERENCED \"" + eischema
							+ "\" does not exist in the parsed file");
				else
				{
					if (idtable.get(eischema) == null)
						idtable.put(eischema, ExpressParser.SCHEMA_IDENT);
					eid = s.searchId(eiid);
					if (eid == ExpressParser.IDENT)
						log.warn("Warning: external id \"" + eiid
								+ "\" not found in schema \""
								+ eischema + "\"");
					else
					{
						/*
						 * idtable.put is used instead of addId because
						 * some externals ids may be imported twice or
						 * more, so it would throw double definition
						 * errors
						 */
						if (eirn != null)
							idtable.put(eirn, Integer.valueOf(eid));
						else
							idtable.put(eiid, Integer.valueOf(eid));
						
						/* Entity information (Scope) management */
						if (eid == ExpressParser.ENTITY_IDENT)
						{
							try
							{
								es = (Scope) s.searchEntity(ei.id)
										.clone();
								/*
								 * we clone the Scope because we have to
								 * assign a new parent to it (this), but
								 * the original Scope should keep its
								 * parent attribute safe
								 */
							}
							catch (CloneNotSupportedException cnse)
							{
							}
							es.setParent(this);
							entities.put(ei.id.toLowerCase(), es);
						}
						/* Extensible enumerations management */
						else if (eid == ExpressParser.TYPE_IDENT)
						{
							et = s.searchEnumerationType(ei.id);
							if (et != null)
							{
								if (eirn != null)
									et.setTypeName(eirn);
								if (et.basedOnName != null)
								{
									ext = s
											.searchEnumerationType(et.basedOnName);
									if (ext != null)
									{
										if (!ext.extensible)
											log
													.warn("Warning: enumeration type \""
															+ et.typename
															+ "\" based on non extensible enumeration \""
															+ et.basedOnName
															+ "\"");
										et.extendWith(ext);
									}
									else
										log
												.warn("Warning: extensible enumeration \""
														+ et.basedOnName
														+ "\" not found");
								}
								addEnumerationType(et);
							}
						}
					}
				}
			}
		}
		if (allReferencedSchemas != null)
		{
			/*
			 * Here we manage REFERENCES to all referencable elements of a
			 * schema (when no element is specified in the REFERENCE clause)
			 */
			sz = allReferencedSchemas.size();
			for (i = 0; i < sz; i++)
			{
				String referencedschema = allReferencedSchemas.elementAt(i)
						.toLowerCase();
				log.debug("looking for " + referencedschema);
				s = schemas.get(referencedschema);
				if (s == null)
					log.warn("Warning: REFERENCED schema \""
							+ referencedschema
							+ "\" does not exist in the parsed file");
				else
				{
					if (idtable.get(referencedschema) == null)
						idtable.put(referencedschema,
								ExpressParser.SCHEMA_IDENT);
					eids = s.getReferencedExternals();
					if (eids != null)
					{
						sz2 = eids.size();
						for (j = 0; j < sz2; j++)
						{
							ei = eids.elementAt(j);
							String eiid = ei.id.toLowerCase();
							String eirn = ei.rename;
							if (eirn != null)
								eirn = eirn.toLowerCase();
							idtable.put(eiid, Integer.valueOf(ei.type));
							
							/* Entity information (Scope) management */
							if (ei.type == ExpressParser.ENTITY_IDENT)
							{
								try
								{
									es = (Scope) s.searchEntity(eiid)
											.clone();
								}
								catch (CloneNotSupportedException cnse)
								{
								}
								es.setParent(this);
								entities.put(eiid, es);
							}
							/* extensible enumerations management */
							else if (ei.type == ExpressParser.TYPE_IDENT)
							{
								et = s.searchEnumerationType(eiid);
								if (et != null)
								{
									if (eirn != null)
										et.setTypeName(eirn);
									if (et.basedOnName != null)
									{
										ext = searchEnumerationType(et.basedOnName);
										if (ext != null)
										{
											if (!ext.extensible)
												log
														.warn("Warning: enumeration type \""
																+ et.typename
																+ "\" based on non extensible enumeration \""
																+ et.basedOnName
																+ "\"");
											et.extendWith(ext);
										}
										else
											log
													.warn("Warning: extensible enumeration \""
															+ et.basedOnName
															+ "\" not found");
									}
									addEnumerationType(et);
								}
							}
						}
					}
				}
			}
		}
	}
	
	/* linking */

	public void setParent(Scope p)
	{
		parent = p;
	}
	
	public void setNext(Scope next)
	{
		/* next accessor */
		this.next = next;
	}
	
	public void setEntity()
	{
		entity = true;
		superentities = new Vector<String>();
	}
	
	public Scope(Scope parent)
	{
		/* creation */
		scopeId = globalId;
		globalId++;
		this.parent = parent;
		idtable = new Hashtable<String, Integer>();
		entities = new Hashtable<String, Scope>();
		entity = false;
	}
}

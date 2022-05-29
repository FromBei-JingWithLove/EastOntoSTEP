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

import java.io.IOException;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.CharStream;

public class FileStreamLower extends ANTLRFileStream
{
	
	public FileStreamLower(String arg0) throws IOException
	{
		super(arg0);
		// TODO Auto-generated constructor stub
	}
	
	public FileStreamLower(String arg0, String arg1) throws IOException
	{
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public int LA(int i)
	{
		if (i == 0)
		{
			return 0; // undefined
		}
		if (i < 0)
		{
			i++; // e.g., translate LA(-1) to use offset 0
		}
		
		if ((p + i - 1) >= n)
		{
			
			return CharStream.EOF;
		}
		return Character.toLowerCase(data[p + i - 1]);
	}
	
}

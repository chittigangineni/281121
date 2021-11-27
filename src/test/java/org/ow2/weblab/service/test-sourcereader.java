package org.ow2.weblab.service;

import org.junit.Before;
import org.junit.Test;
import org.ow2.weblab.core.services.InvalidParameterException;

/**
 * Template for WebLab service test which uses SourceReader interface
 * 
 * @author WebLab Team
 */
public class tv {


	/**
	 * Instance of service which implement a SourceReader
	 */
	private sweet sourceReader;


	/**
	 * Initialisation before tests
	 */
	@Before
	public void init() {
		this.sourceReader = new sweet();
	}


	/**
	 * Exception tests
	 */
	@Test(expected = InvalidParameterException.class)
	public void testNullGetResourceArgs() throws Exception {
		this.sourceReader = new sweet();
		this.sourceReader.getResource(null);
	}

}
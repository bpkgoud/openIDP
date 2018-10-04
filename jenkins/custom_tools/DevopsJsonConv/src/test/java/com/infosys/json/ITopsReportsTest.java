
package com.infosys.json;

import org.junit.Test;

import junit.framework.Assert;


public class ITopsReportsTest {

	@Test
	public void urltest(){
		IFastReports ifr = new IFastReports();
		
		ifr.setURL("infosys.com");
		
		Assert.assertEquals("infosys.com", ifr.getURL());
	}
}

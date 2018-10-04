
package com.infosys.json;

import org.junit.Test;

import junit.framework.Assert;


public class FxCopReportJsonTest {

	@Test
	public void hightest(){
		FxCopReportJson fx = new FxCopReportJson();
		
		fx.setHigh(10);
		
		Assert.assertEquals((Integer)10, fx.getHigh());
	}
	
	@Test
	public void mediumtest(){
		FxCopReportJson fx = new FxCopReportJson();
		
		fx.setMedium(10);
		
		Assert.assertEquals((Integer)10, fx.getMedium());
	}
	
	@Test
	public void lowtest(){
		FxCopReportJson fx = new FxCopReportJson();
		
		fx.setLow(10);
		
		Assert.assertEquals((Integer)10, fx.getLow());
	}
}

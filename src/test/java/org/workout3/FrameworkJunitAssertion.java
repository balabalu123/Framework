package org.workout3;

import org.junit.Assert;
import org.junit.Test;

public class FrameworkJunitAssertion extends FrameworkBaseclass {
	
	
	@Test
	public void tc03() {
		
		String s = "Jack";
		
		Assert.assertTrue(false);
		System.out.println(s);
		System.out.println("test3");
		
	}
	
	    @Test
		public void tc05() {
	    	
	    	String s = "jack";			
	    	Assert.assertFalse(false);
			System.out.println(s);
			System.out.println("test5");
			

		}
	
	    @Test
		public void tc04() {
          System.out.println("test4");

		}
		
		
		
		
		
		
		
		
		
		

	
	
	
	
	
	
	
	
	

}

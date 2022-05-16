package org.workout3;

public class TestNGparallelClassB {
	@org.testng.annotations.Test
	public  void test11() {
		System.out.println(Thread.currentThread().getId());

	}
	@org.testng.annotations.Test
	public  void test12() {
		System.out.println(Thread.currentThread().getId());

	}
	@org.testng.annotations.Test
	public  void test13() {
		System.out.println(Thread.currentThread().getId());
		
//		 <suite name="Suite" parallel = "classes"  >
		//   <test name="Test">
		   
		   
		  //  <classes>
		    //  <class name="org.workout3.TestNGparallelClassA"/>
		      //<class name="org.workout3.TestNGparallelClassB"/>
		      //<class name="org.workout3.TestNGparallelClassC"/>
		      
		    //</classes>
		    
		  //</test> <!-- Test -->
		  //<suite> <!-- Suite -->

		
		
		
		

	}

}

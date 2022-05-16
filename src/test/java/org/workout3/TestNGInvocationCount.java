package org.workout3;



public class TestNGInvocationCount {
	
	
	@org.testng.annotations.Test
	public  void test01() {
		System.out.println("Test 01");

	}
	@org.testng.annotations.Test(invocationCount=5)
	public  void test02() {
		System.out.println("Test 02");

	}
	@org.testng.annotations.Test
	public  void test03() {
		System.out.println("Test 03");

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

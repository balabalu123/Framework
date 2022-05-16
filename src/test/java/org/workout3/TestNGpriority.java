package org.workout3;

public class TestNGpriority {
	
	
	@org.testng.annotations.Test(priority=8)
	private void Test() {
		System.out.println("Test");

	}
	
	@org.testng.annotations.Test(priority=10)
	private void Test1() {
		System.out.println("Test1");

	}
	
	@org.testng.annotations.Test
	private void Test2() {
		System.out.println("Test2");

	}
	
	@org.testng.annotations.Test(priority=-7)
	private void Test3() {
		System.out.println("Test3");

	}
	
	@org.testng.annotations.Test(priority=-15)
	private void Test4() {
		System.out.println("Test4");

	}
	
	
	
	

}

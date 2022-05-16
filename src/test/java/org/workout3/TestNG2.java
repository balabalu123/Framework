package org.workout3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestNG2 {
	
	@BeforeClass
	private void Beforeclass() {
		System.out.println("LaunchBrowser");

	}
	@AfterClass
	private void Afterclass() {
		System.out.println("Quit Browser");

	}
	
	@org.testng.annotations.Test
	private void Test() {
		System.out.println("Test");

	}
	
	@org.testng.annotations.Test
	private void Test1() {
		System.out.println("Test1");

	}
	

	
	@AfterMethod
	private void Aftermethod() {
		System.out.println("End time");
	}
	
	@BeforeMethod
	private void Beforemethod() {
		System.out.println("Start Time");

	}
	
	
	
	
	
	
	
	
	
	

}

package org.workout3;

import java.awt.AWTException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class FrameworkJunit extends FrameworkBaseclass {
	
	@BeforeClass
	public static void Beforeclass() {
		System.out.println("LaunchBrowser");

	}
	@Before
	public void Before() {
		
		System.out.println("start Time");


	}
	@Test
	public  void Test01() {
		System.out.println("Test1");

	}
	@Test
	public  void Test02() {
		System.out.println("Test2");

	}
	@Ignore
	public  void Test03() {
		System.out.println("Test3");

	}
	
	@After
	public void After() {
		System.out.println("End Time");

	}
	
	@AfterClass
	public static void Afterclass() {
		System.out.println("Quit Browser");

	}
	
	
	

}

package org.frameworkwebsitetasks;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.workout3.FrameworkBaseclass;

public class TestNGQue3 {
	
	@BeforeClass
	private void Beforeclass() {
	
		System.out.println("LaunchBrowser");

	}
	@AfterClass
	private void Afterclass() {
		System.out.println("Quit Browser");

	}
	
	@org.testng.annotations.Test
	public void Test() {
		
		FrameworkBaseclass b = new FrameworkBaseclass();
		b.launchBrowser();
		b.launchUrl("https://www.flipkart.com/account/login\r\n" + 
				"");
		
		SoftAssert s = new SoftAssert();
		PojoclassQue4 p = new PojoclassQue4();
		
		}
	
	@AfterMethod  
	private void Aftermethod() {
		Date d = new Date();
		System.out.println(d);
	}
	
	@BeforeMethod
    private void Beforemethod() {
		Date d = new Date();
		System.out.println(d);

	}
	
	
	
	
	
	

}

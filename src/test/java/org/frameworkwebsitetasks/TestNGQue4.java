package org.frameworkwebsitetasks;

import static org.testng.Assert.assertTrue;

import java.util.Date;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.workout3.FrameworkBaseclass;

public class TestNGQue4 extends FrameworkBaseclass{
	
	@BeforeClass
	private void Beforeclass() {
	
		launchBrowser();

	}
	@AfterClass
	private void Afterclass() {
		quitbrowser();
	}
	
	@org.testng.annotations.Test
	public void Test() {
		
		FrameworkBaseclass b = new FrameworkBaseclass();
		
		launchUrl("https://www.flipkart.com/account/login\r\n" + 
				"");
		
		SoftAssert s = new SoftAssert();
		PojoclassQue4 p = new PojoclassQue4();
		type(p.getTextuser(), "bala");
		s.assertTrue(p.equals("bala"),"verify email");
		type(p.getTextpass(), "bala123");
		s.assertTrue(p.equals("bala123"),"verify pass");
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

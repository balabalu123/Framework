package org.frameworkwebsitetasks;

import java.util.Date;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.workout3.FrameworkBaseclass;

public class TestNGQue1 extends FrameworkBaseclass {
	
	@BeforeClass
	private void Beforeclass() {
	
		launchBrowser();

	}
	@AfterClass
	private void Afterclass() {
		quitbrowser();

	}
	
	@org.testng.annotations.Test
	private void Test() {
		
		launchUrl("https://www.facebook.com/");
		SoftAssert s = new SoftAssert();
		WebElement textuser = idvalue("email");
		type(textuser, "bala");
		s.assertTrue(textuser.equals("bala"), "verify email");
	    WebElement textpass = idvalue("pass");
		type(textpass, "bala12");
		s.assertTrue(textpass.equals("bala12"), "verfiy pass");
	    WebElement loginbutton = namevalue("login");
		buttonclick(loginbutton);
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

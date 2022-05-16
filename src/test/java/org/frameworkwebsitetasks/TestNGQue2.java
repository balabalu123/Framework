package org.frameworkwebsitetasks;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.workout3.FrameworkBaseclass;

public class TestNGQue2 extends FrameworkBaseclass {
	
	@BeforeClass
	private void Beforeclass() {
	
		launchBrowser();

	}
	@AfterClass
	private void Afterclass() {
		quitbrowser();

	}
	
	@org.testng.annotations.Test
	private void Test() throws InterruptedException {
		
		launchUrl("https://www.redbus.in/");
		WebElement iconbtn = idvalue("i-icon-profile");
		buttonclick(iconbtn);
		WebElement signinbtn = idvalue("signInLink");
		buttonclick(signinbtn);
		WebElement frameset = xpathvalue("//iframe[@class='modalIframe']");
		frameset(frameset);
		sleep(3000);
		WebElement mobileno = idvalue("mobileNoInp");
		type(mobileno, "9710624325");
		SoftAssert s = new SoftAssert();
		s.assertTrue(mobileno.equals("9710624325"), "verify mobile");
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

package org.frameworkwebsitetasks;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import org.workout3.FrameworkBaseclass;

public class TestNGQue8 extends FrameworkBaseclass{
	@BeforeClass
	private void Beforeclass() {
		launchBrowser();
		}	
    @AfterClass
	private void Afterclass() throws InterruptedException {
		
		quitbrowser();
	}
	@org.testng.annotations.Test
	private  void test01() throws InterruptedException {
		launchUrl("http://www.greenstechnologys.com/");
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

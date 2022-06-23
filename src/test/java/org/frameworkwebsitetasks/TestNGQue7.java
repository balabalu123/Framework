package org.frameworkwebsitetasks;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;
import org.workout3.FrameworkBaseclass;

public class TestNGQue7 extends FrameworkBaseclass {
	
	
	@BeforeClass
	private void Beforeclass() {
		
		
		
		
		
		
		
		
	}	

	@AfterClass
	private void Afterclass() throws InterruptedException {
		
	}
	
	public static WebDriver driver;
	@Parameters({"browserName","userName","passWord"})
	@org.testng.annotations.Test
	private  void test01(String bName,String s1, String s2) throws InterruptedException {
		
		if (bName.equalsIgnoreCase("chrome")) {
			System.out.println("chrome");
			launchBrowser();
			
			
			}
		
		else if (bName.equalsIgnoreCase("gecko")) {
			System.out.println("gecko");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\geckodriver.exe");
		    driver = new FirefoxDriver();
			driver.manage().window().maximize();
			
			
		
			
		}
		else if (bName.equalsIgnoreCase("edge")) {
			System.out.println("edge");
			EdgeBrowser();	
			
			
			
			
		}
		
		
		launchUrl("https://www.flipkart.com/account/login");
		SoftAssert s = new SoftAssert();
	    WebElement textuser = xpathvalue("(//input[@type='text'])[2]");
		type(textuser, s1);
		s.assertTrue(textuser.equals(s1),"verify email");
		WebElement txtpass = xpathvalue("//input[@type='password']");
		type(txtpass, s2);
		s.assertTrue(txtpass.equals(s2),"verify pass");
		
		
		
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

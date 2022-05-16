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
import org.workout3.FrameworkBaseclass;

public class TestNGQue6 extends FrameworkBaseclass {
	@BeforeClass
	private void Beforeclass() {
		launchBrowser();
		EdgeBrowser();
		System.setProperty("webdriver.gecko.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\geckodriver.exe");
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
	
		
}
	@AfterClass
	private void Afterclass() {
		quitbrowser();
		quitbrowser();
		quitbrowser();
		
	}
	
	public static WebDriver driver;
	@Parameters("browserName")
	@org.testng.annotations.Test
	private  void test01(String bName) {
		
		if (bName.equalsIgnoreCase("Chrome")) {
			System.out.println("chrome");
			
			launchUrl("http://www.greenstechnologys.com/");
		}
		
		else if (bName.equalsIgnoreCase("gecko")) {
			System.out.println("gecko");
			
			launchUrl("http://www.greenstechnologys.com/");
		}
		else if (bName.equalsIgnoreCase("edge")) {
			System.out.println("edge");
			
			launchUrl("http://www.greenstechnologys.com/");
		}
		else {
			System.out.println("Invalid Browser");
		}
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

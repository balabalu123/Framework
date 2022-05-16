package org.workout3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGCrossBrowserTesting2 extends FrameworkBaseclass {
	
	public static WebDriver driver;
	@Parameters("browserName")
	@org.testng.annotations.Test
	private  void test01(String bName) {
		
		if (bName.equalsIgnoreCase("Chrome")) {
			System.out.println("chrome");
			launchBrowser();
		}
		
		else if (bName.equalsIgnoreCase("gecko")) {
			System.out.println("gecko");
			System.setProperty("webdriver.gecko.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
		}
		else if (bName.equalsIgnoreCase("edge")) {
			System.out.println("edge");
			EdgeBrowser();
		}
		else {
			System.out.println("Invalid Browser");
		}
	
	
	
	
	}
	
	
	

}

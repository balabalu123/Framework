package org.workout3;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.testng.xml.LaunchSuite;

public class JunitFbTask extends FrameworkBaseclass {
	
	
	@BeforeClass
	public static void Beforeclass() {
		FrameworkBaseclass b = new FrameworkBaseclass();
		
		b.launchBrowser();
		b.launchUrl("https://www.facebook.com/");
	    System.out.println("Launch Browser");

	}
	@Before
	public void Before() {
		
		Date d = new Date();
		
		System.out.println(d);


	}
	@Test
	public  void Test() {
		WebElement textuser = idvalue("email");
		type(textuser, "balaacuhealer@gmail.com");
		

		WebElement textpass = idvalue("pass");
		type(textpass, "bala123");
	    
	
	    WebElement loginbutton = namevalue("login");
		buttonclick(loginbutton);
	     System.out.println("Test");

	}
	
	@After
	public void After() {
        Date d = new Date();
      	System.out.println(d);

	}
	
	@AfterClass
	public static void Afterclass() {
		FrameworkBaseclass b = new FrameworkBaseclass();
		b.quitbrowser();
		System.out.println("Quit browser");

	}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	

}

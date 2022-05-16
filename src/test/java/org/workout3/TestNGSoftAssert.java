package org.workout3;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssert extends FrameworkBaseclass{
	
	//Soft Assert used Only in TestNG
	
	@org.testng.annotations.Test
	public void test1() {
		
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		SoftAssert s = new SoftAssert();
		s.assertTrue( driver.getCurrentUrl().contains("facebook"),"verify url");
		WebElement textuser = idvalue("email");
		type(textuser, "balaacuhealer@gmail.com");
		WebElement textpass = idvalue("pass");
		type(textpass, "bala12");
		s.assertEquals(textpass.getAttribute("value"),"bala12","verify password");
		WebElement loginbutton = namevalue("login");
		buttonclick(loginbutton);
		//To Highlight the assert
		s.assertAll();

		
	
	
	
	
	}

}

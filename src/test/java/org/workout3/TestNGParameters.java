package org.workout3;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.asserts.SoftAssert;

public class TestNGParameters extends FrameworkBaseclass {
	@Parameters({"UserName","password"})
	@org.testng.annotations.Test
	public void test1(@Optional("frames")String  s1,  String s2) {
		
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		SoftAssert s = new SoftAssert();
		s.assertTrue( driver.getCurrentUrl().contains("facebook"),"verify url");
		WebElement textuser = idvalue("email");
		type(textuser, s1);
		WebElement textpass = idvalue("pass");
		type(textpass, s2);
		s.assertEquals(textpass.getAttribute("value"),"bala12","verify password");
		WebElement loginbutton = namevalue("login");
		buttonclick(loginbutton);
	
	
	
	
	}

}

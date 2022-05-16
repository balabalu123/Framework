package org.workout3;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class JunitHardAssert extends FrameworkBaseclass {
	
	// Hard Assert for JUnit
	@Test
	public void test1() {
		
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		Assert.assertTrue("verify url", driver.getCurrentUrl().contains("facebook"));
		WebElement textuser = idvalue("email");
		type(textuser, "balaacuhealer@gmail.com");
		WebElement textpass = idvalue("pass");
		type(textpass, "bala12");
		Assert.assertEquals("verify password", "bala12", textpass.getAttribute("value"));
		WebElement loginbutton = namevalue("login");
		buttonclick(loginbutton);

		
	}
	
	
	
	
	

}

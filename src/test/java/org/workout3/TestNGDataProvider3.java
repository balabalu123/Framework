package org.workout3;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestNGDataProvider3 extends FrameworkBaseclass {
	
	@Test(dataProvider="result",dataProviderClass=TestNGDataProvider2.class)
	private void test01(String s1 , String s2) {
		launchBrowser();
		launchUrl("https://www.facebook.com/");
		WebElement txtuser = idvalue("email");
		type(txtuser, s1);
		WebElement txtpass = idvalue("pass");
		type(txtpass, s2);
		WebElement loginbtn = namevalue("login");
		buttonclick(loginbtn);
		

	}
	
	

}

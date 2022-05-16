package org.workout3;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNGDataProvider2 extends FrameworkBaseclass {
	
	@Test(dataProvider="result")
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
	@DataProvider(name="result")
	@Test
	private Object[][] test02() {
		Object obj[][]= new Object[][] {{"arul","arul@123"},{"suhail","suhail@123"},{"madan","madan@123"}};
		return obj;

	}
	
	
	
	

	
	
	
	
	
	
	
	
	
	
}

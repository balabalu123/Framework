package org.workout3;

import java.io.IOException;

import org.openqa.selenium.WebElement;

public class DatadrivenReadExcel {

	public static void main(String[] args) throws IOException {
		
		FrameworkBaseclass b = new FrameworkBaseclass();
		b.launchBrowser();
		b.launchUrl("https://www.facebook.com/");
		WebElement textuser = b.idvalue("email");
		b.type(textuser,b.Datareadexcel("Sheet1", 2, 0));
		System.out.println(b.Datareadexcel("Sheet1", 2, 0));
		WebElement textpass = b.idvalue("pass");
		b.type(textpass, b.Datareadexcel("Sheet1", 2, 1));
		System.out.println(b.Datareadexcel("Sheet1", 2, 1));
		WebElement loginbtn = b.namevalue("login");
		b.buttonclick(loginbtn);
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
}

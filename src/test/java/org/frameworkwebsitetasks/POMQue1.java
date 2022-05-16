package org.frameworkwebsitetasks;

import org.openqa.selenium.WebElement;
import org.testng.xml.LaunchSuite;
import org.workout3.FrameworkBaseclass;

public class POMQue1 extends FrameworkBaseclass {
	
	public static void main(String[] args) {
		
		
		FrameworkBaseclass  f = new FrameworkBaseclass ();
		
		f.launchBrowser();
		f.launchUrl("https://www.facebook.com/");
		POMQue1Pojoclass p = new POMQue1Pojoclass();
		f.type(p.getUserName(), "healer");	
		f.type(p.getTextpass(), "healer123");
		
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package org.workout3;

import org.openqa.selenium.WebElement;

public class FrameworkJavascriptexecutortextsend extends FrameworkBaseclass{
	
	public static void main(String[] args) {
		
		
		FrameworkBaseclass b = new FrameworkBaseclass();
		
		b.launchBrowser();
		b.launchUrl("https://www.facebook.com/");
       
	    WebElement textuser2 = b.namevalue("email");
	    
	    b.textsendJavascript(textuser2, "balu");
	
		
		
		
		
		
		
		
	}

}

package org.workout3;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.xml.LaunchSuite;

public class FrameWorkBaseclass2 extends FrameworkBaseclass  {
	
	
	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		
		
		FrameworkBaseclass b = new FrameworkBaseclass();
		b.launchBrowser();
		b.launchUrl("http://www.amazon.in/");
		WebElement searchbox = b.idvalue("twotabsearchtextbox");
		b.type(searchbox, "iphone 13 pro max");
		b.sleep(3000);
		WebElement iphonesilver = b.xpathvalue("//span[text()='Apple iPhone 12 Pro Max (512GB) - Graphite']");
		b.buttonclick(iphonesilver);
		b.sleep(3000);
	    WebElement addtocartsilverbutton = b.idvalue("add-to-cart-button");
		b.buttonclick(addtocartsilverbutton);
	    WebElement iphonegold = b.xpathvalue("//span[text()='Apple iPhone 12 Pro Max (256GB) - Gold']");
		b.buttonclick(iphonegold);
		b.MultiwindowHandles("y");
		WebElement addtocartgold = b.idvalue("add-to-cart-button");
		b.buttonclick(addtocartgold);
		
		
		
		
		
		
		
		
}
}
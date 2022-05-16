package org.frameworkwebsitetasks;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.workout3.FrameworkBaseclass;

public class POMQue1Pojoclass extends FrameworkBaseclass{
	
	
	
	public POMQue1Pojoclass() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@FindBy(id="email")
	private WebElement userName;
	
	
	public WebElement getUserName() {
		return userName;
	}
	@CacheLookup 
	@FindBy (id="pass")
	private WebElement textpass;
	
	public WebElement getTextpass() {
		return textpass;
	}
	
	
	
	

}

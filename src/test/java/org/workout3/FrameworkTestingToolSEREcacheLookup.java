package org.workout3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrameworkTestingToolSEREcacheLookup extends FrameworkBaseclass{
	
	public FrameworkTestingToolSEREcacheLookup() {
		
		PageFactory.initElements(driver, this);
		
		
	}
	
	@CacheLookup
	@FindAll({@FindBy(id="Email"),@FindBy(xpath="//input[@name='email']")})
	
	private WebElement userName;
	
	public WebElement getUserName() {
		
		return userName;
		
	}
	
	
	
	
	
	
	

}

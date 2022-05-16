package org.workout3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrameworkTestingToolSEREBy extends FrameworkBaseclass {
	
	
	
	public FrameworkTestingToolSEREBy() {
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	@FindBy(id="email")
	private WebElement userName;
	
	
	public WebElement getUserName() {
		
		
		return userName;
	}
	
	
	
	
	
	
	
	

}

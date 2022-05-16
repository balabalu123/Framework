package org.workout3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FrameworkTestingToolSEREBys extends FrameworkBaseclass {
	
	public FrameworkTestingToolSEREBys() {
		
	   PageFactory.initElements(driver, this);
		
	}
	
	@FindBys({@FindBy(id="email"),@FindBy(xpath="//input[@name='email']")})
	private WebElement userName;
	
	
	public WebElement getUserName() {
		
		return userName;
	}
	
	
	
	

}

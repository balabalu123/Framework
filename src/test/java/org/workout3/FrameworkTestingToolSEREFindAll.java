package org.workout3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FrameworkTestingToolSEREFindAll extends FrameworkBaseclass {
	
	
	public FrameworkTestingToolSEREFindAll() {
		
		PageFactory.initElements(driver, this);
		
		
		}
	
	@FindAll({@FindBy(id="mEail"),@FindBy(xpath="//input[@name='email']")})
	private WebElement userName;
	
	
	public WebElement getUserName() {
		
		
		return userName;
	}
	
	
	
	
	
	
	
	
	

}

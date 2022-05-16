package org.workout3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POJOClass extends FrameworkBaseclass {

	
	public POJOClass() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBys ({@FindBy(id="email"),@FindBy(xpath="//input[@type='text']")})
	private WebElement textuser;
	
	
	@FindAll ({@FindBy(id="pass"),@FindBy(xpath="//input[@type='password']")})
	private WebElement textpass;
	
	@CacheLookup 
	@FindBy (name="login")
	private WebElement loginbtn;
	
	
	
	
	
	
	
	
	public WebElement getTextuser() {
		return textuser;
	}
	
	
	
	public WebElement getTextpass() {
		return textpass;
	}
	
	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	
	
	
	
	
}

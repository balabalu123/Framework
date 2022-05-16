package org.workout3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class POJO2 extends FrameworkBaseclass{
	
	public POJO2() {
		
		PageFactory.initElements(driver, this);

	}
	// more than one locator for same webElement  AND    T T T
	@FindBys ({@FindBy(id="email"),@FindBy(xpath="//input[@type='text']")})
	private WebElement textuser;
	
	// more than one locator for same webElement  OR    T f t
	@FindAll({@FindBy(id="pass"),@FindBy(xpath="//input[@type='password']")})
	private WebElement textpass;
	
	@CacheLookup
	@FindBy(name="login")
	private WebElement Loginbtn;
	
	public WebElement getTextuser() {
		return textuser;
	}
	
	public WebElement getTextpass() {
		return textpass;
	}
	public WebElement getLoginbtn() {
		return Loginbtn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

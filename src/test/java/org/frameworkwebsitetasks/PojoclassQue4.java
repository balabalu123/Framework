package org.frameworkwebsitetasks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.workout3.FrameworkBaseclass;

public class PojoclassQue4 extends FrameworkBaseclass {
	
	public PojoclassQue4() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement textuser;
	
	@CacheLookup
	@FindBy(xpath="//input[@type='password']")
	private WebElement textpass;
	
	
	public WebElement getTextuser() {
		return textuser;
	}
	
	public WebElement getTextpass() {
		return textpass;
	}

	
	

}

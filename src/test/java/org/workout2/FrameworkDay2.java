package org.workout2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkDay2 {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);

		WebElement Textproduct = driver.findElement(By.id("twotabsearchtextbox"));
		
		Textproduct.sendKeys("iphone");
		
		
		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));
		
		
		searchbutton.click();
			
	}

}

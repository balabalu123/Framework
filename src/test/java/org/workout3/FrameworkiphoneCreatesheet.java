package org.workout3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkiphoneCreatesheet {
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		
		
		WebDriverManager.chromedriver().setup();
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.amazon.com/");
		
		
		driver.manage().window().maximize();
		
		
				File f = new File("C:\\Framework\\Framework\\Iphone.xlsx");
				
				
				
				
				Workbook book = new XSSFWorkbook();
				
				
				
				
				Sheet createSheet = book.createSheet();
				
				
				Row createRow = createSheet.createRow(1);
				
				
				
				
				
				Cell createCell = createRow.createCell(0);
				
				
				WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
				


				
				
				
				WebElement apple = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 Pro, 256GB, Pacific Blue - Unlocked (Renewed Premium)']"));
				
		
				
				
				
				FileOutputStream fo = new FileOutputStream(f);
				
				book.write(fo);
				
				

				
				

				
		
			     
				
		
		
		
		
		
		
		
		
		
	}

}

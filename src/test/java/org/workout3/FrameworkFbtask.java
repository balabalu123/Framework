package org.workout3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkFbtask {
	
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		            WebDriverManager.chromedriver().setup();
					
					
					WebDriver driver = new ChromeDriver();
					
					
					driver.get("https://www.facebook.com/");
					
					
					driver.manage().window().maximize();
					
		
          File f = new File("C:\\Framework\\Framework\\Framework.xlsx");
		
		
		
		 FileInputStream stream = new FileInputStream(f);
		
		
		 Workbook book = new XSSFWorkbook(stream);
		
		
		 //To get the sheet
		
		
		 Sheet sheet = book.getSheet("sheet2");
		
		//To get the row
		//To get the cell
		//To get the datas
		
       
	
	   JavascriptExecutor getStringCellValue = (JavascriptExecutor) driver;
		
		WebElement textuser = driver.findElement(By.id("email"));
		Row row = sheet.getRow(1);
		Cell cell = row.getCell(0);
		String stringCellValue = cell.getStringCellValue();
		
		getStringCellValue.executeScript("arguments[0].setAttribute('value',"+stringCellValue+")", textuser);
		
		
		
		
		WebElement textpass = driver.findElement(By.id("pass"));
		Cell cell2 = row.getCell(1);
		String stringCellValue2 = cell.getStringCellValue();
		getStringCellValue.executeScript("arguments[0].setAttribute('value',"+stringCellValue2+")", textpass);
		
		

			
		
	
		
		
			
			
			}

}

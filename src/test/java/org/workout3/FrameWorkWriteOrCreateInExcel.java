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
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameWorkWriteOrCreateInExcel {

	
	
	public static void main(String[] args) throws IOException {
		
		
		
		

	       WebDriverManager.chromedriver().setup();
				
				
				WebDriver driver = new ChromeDriver();
				
				
				driver.get("https://www.facebook.com/");
				
				
				driver.manage().window().maximize();
		
		//To Create new file
		
		
		File f = new File("C:\\Framework\\Framework\\Balu.xlsx");
		
		
		//To define Workbook
		
		Workbook book = new XSSFWorkbook();
		
		
		//To Create New Sheet
		
		Sheet createSheet = book.createSheet();
		
		//To Create New Row
		
		Row createRow = createSheet.createRow(1);
		
		
		//To create New Cell
		
		
		Cell createCell = createRow.createCell(0);
		
		
		Cell createCell2 = createRow.createCell(1);
		
		//To set values to the desired place of the cell
		
		createCell.setCellValue("balaacuhealerr@gmail.com");
		
		createCell2.setCellValue("Balaacuhealer5632#@$");
		
		
		JavascriptExecutor setcellValue = (JavascriptExecutor) driver;
		
		
		WebElement textuser = driver.findElement(By.id("email"));
		
		setcellValue.executeScript("arguments[0].setAttribute('value','balaaccudr@gmail.com')", textuser);
		
		
		WebElement textpass = driver.findElement(By.id("pass"));
		setcellValue.executeScript("arguments[0].setAttribute('value','Balaacuhealer5632#@$')", textpass);
		
		
		
		
		
		FileOutputStream fo = new FileOutputStream(f);
		
		book.write(fo);
		
		
	}
}

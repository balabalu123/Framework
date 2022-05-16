package org.workout2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameworkFbworkoutDay3 {
	
	
	public static void main(String[] args) throws IOException {
		
		
		
		
		
		File f = new File("C:\\Framework\\Framework\\Framework.xlsx");
		
		
		
		FileInputStream stream = new FileInputStream(f);
		
		
		Workbook book = new XSSFWorkbook(stream);
		
		
		//To get the sheet
		
		
		Sheet sheet = book.getSheet("sheet1");
		
		//To get the row
		
		
		Row row = sheet.getRow(3);
		
		//To get the cell
		
		Cell cell = row.getCell(1);
		
		
		//To get the datas
		
		String stringCellValue = cell.getStringCellValue();
		
		
		System.out.println(stringCellValue);
		

		
		
		
		
	}
	
	

}

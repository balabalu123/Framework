package org.workout3;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.internal.Require;
import org.openqa.selenium.support.ui.Select;

import com.sun.glass.events.KeyEvent;

import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FrameworkBaseclass {
	
	public static WebDriver driver;
	
	public  WebDriver launchBrowser () {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		return driver;

	}
	
    public  WebDriver EdgeBrowser () {
		
		
		WebDriverManager.edgedriver().setup();
		
		driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		return driver;

	}
    
    public  WebDriver FireFoxBrowser () {
		
    	System.setProperty("webdriver.gecko.driver","C:\\Users\\balua\\eclipse-workspace\\JavaSelenium\\Driver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
  		return driver;
  		
    }
		
		public  void launchUrl(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		
		
		public  WebElement idvalue( String data) {
		    WebElement findElements = driver.findElement(By.id(data));
			return findElements;
			
		}
		
		public   WebElement namevalue(String namevalue) {
			WebElement findElement = driver.findElement(By.name(namevalue));
			return findElement;

		}
		
		
		public  WebElement xpathvalue (String xpathvalue) {
			WebElement findElement = driver.findElement(By.xpath(xpathvalue));
			return findElement;
			
			 
		}
		public  WebElement locators(String locator, String data) {
			if (locator.equals("id")) {
				WebElement findElement = driver.findElement(By.id(data));
				return findElement;
				}else if (locator.equals("name")) {
					WebElement findElement = driver.findElement(By.name(data));
					return findElement;
			    }else if (locator.equals("xpath")) {
			    	WebElement findElement = driver.findElement(By.xpath(data));
			    	return findElement;
					
				}else {
					List<WebElement> findElements = driver.findElements(By.tagName(data));
					return (WebElement) findElements;
					                                   
				}
			
			
			
			
			
		}
		
		public  List<WebElement> tagnameValue(String tagname) {
			List<WebElement> findElements = driver.findElements(By.tagName(tagname));
			int size = findElements.size();
			System.out.println(size);
			return findElements;

		}
		
	
		
		public  void type (WebElement element, String data) {
			
			element.sendKeys(data);
			
		}
			
		public void buttonclick(WebElement  element) {
			
			element.click();
			

		}
		public  void closeBrowser() {
			driver.close();
	

		}
		public  void quitbrowser() {
			driver.quit();

		}
		
		public String getpageurl() {
			String Url = driver.getCurrentUrl();
			return Url;

		}
		public String getpageTitle() {
			String title = driver.getTitle();
			return title;
			

		}
		
		
		public void gettext(WebElement element) {
			
			String text = element.getText();
			System.out.println(text);
			
			}
		
		public void sleep(int data) throws InterruptedException {
			Thread.sleep(data);

		}
        
		public void getAttribute(WebElement element , String  data) {
			
			String attribute = element.getAttribute(data);
			
			System.out.println(attribute);
			

		}
		public void NavigateTo(String data) {
			
			driver.navigate().to(data);
			

		}
        public void NavigateBack() {
			
			driver.navigate().back();
			

		}
        public void NavigateForward() {
			
			driver.navigate().forward();
			

		}
        public void NavigateRefresh() {
			
			driver.navigate().refresh();
			

		}
		
		public void textsendJavascript(WebElement element,String data ) {
			
			JavascriptExecutor jk = (JavascriptExecutor)driver;

			jk.executeScript("arguments[0].setAttribute('value','"+data+"')",element);
			
			

		}
		
		public void buttonclickJavascript(WebElement element) {
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			
			jk.executeScript("arguments[0].click()",element);
			
			
			
		}
			
			
		public  void getAttributeJavascript(WebElement element ) {
			
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			jk.executeScript("return arguments[0].getAttribute('value')", element);
		}
		
		
	
		public  void scrolldown(WebElement element) {
			
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			jk.executeScript("arguments[0].scrollIntoView(true),", element);
			
			
			
		}
      public  void scrollup(WebElement element) {
			
			JavascriptExecutor jk = (JavascriptExecutor)driver;
			jk.executeScript("arguments[0].scrollIntoView(true),", element);
			
			
			
		}
		
		
		public  void screenshot(String data) throws IOException {
			
			TakesScreenshot take = (TakesScreenshot) driver;
			
			File source = take.getScreenshotAs(OutputType.FILE);
			

			File destination = new File(data);
			
			
			FileUtils.copyFile(source,destination);
		 
		}
		public void Fullscreenshot(String data) throws IOException {
			Screenshot s = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
			
			
			ImageIO.write(s.getImage(), "jpg",new File(data));
			

		}
		
		
		
		
		public  void mouseoveraction (WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
			
			
		}
		
		public  void doubleclick(WebElement element) {
			Actions act = new Actions(driver);
			act.doubleClick(element).perform();

		}
		
	    public  void contextclick(WebElement element) {
	    	Actions act = new Actions(driver);
			act.contextClick(element).perform();

		}

		
		public  void robot(WebElement element, int data) throws AWTException {
			
			    Robot rob= new Robot ();
				rob.keyPress(data);
				rob.keyRelease(data);
		}
	   
		public  void selectbyindex(WebElement element,  int data ) {
			Select s = new Select(element);
			s.selectByIndex(data);
			
		}
		
		public  void selectbyvalue(WebElement element,  String  data)  {
			Select s = new Select(element);
			s.selectByValue(data);
			
       }

		public  void deselectbyindex(WebElement element,  int data ) {
			Select s = new Select(element);
			s.deselectByIndex(data);
			
		}

		public  void selectbyvisibletext (WebElement element, String data) {
			Select s = new Select(element);
			s.selectByVisibleText(data);

		}
		public  void deselectbyvalue(WebElement element,  String  data)  {
			Select s = new Select(element);
			s.deselectByValue(data);
		}
		public  void deselectbyvisibletext (WebElement element, String data) {
			Select s = new Select(element);
			s.deselectByVisibleText(data);

		}
		
		public void ismultiple(WebElement element) {
			
       Select s = new Select(element);
		
		boolean multiple = s.isMultiple();
		
		System.out.println(multiple);
		}
		
		public void selectsize(WebElement element) {
			
			Select s = new Select(element);
			List<WebElement> options =s.getOptions();
			
			int size = options.size();
			System.out.println(size);
			
		}	
		
		public void selectgetOptions(WebElement element) {
			
			Select s = new Select(element);
			List<WebElement> options = s.getOptions();
			for (WebElement x :options) ;
		}
		
          	public  void getAllSelectedoptions (WebElement element) {
			Select s = new Select(element);
			List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
			for (WebElement webElement : allSelectedOptions);
				
          	}
			
			public void getFirstselectoptions(WebElement element) {
				Select s = new Select(element);
				WebElement firstSelectedOption = s.getFirstSelectedOption();
				

			}
		
			
		
          	
		
		public void draganddrop(WebElement element,WebElement element2) {
			Actions act = new Actions(driver);
			
			act.dragAndDrop(element, element2).perform();
		}
		
		public  void alertaccept() {
			Alert alert = driver.switchTo().alert();
			alert.accept();
			
			
			}
		
		public   void alertdismiss() {
			Alert alert = driver.switchTo().alert();
			alert.dismiss();
		}
		
		public void prompalert(String data) {
			Alert promptalert = driver.switchTo().alert();
			promptalert.sendKeys(data);
			promptalert.accept();
			

			
		}
		
		public  void frameset(WebElement element) {
			driver.switchTo().frame(element);

		}
		
		
		public void ismultiple(WebElement element , String data) {
			

			Select s = new Select(element);
			boolean multiple = s.isMultiple();
			System.out.println(data);
			
		}
		
		
			private void getsizedropdownmethod(WebElement element ,String data) {
				Select s = new Select(element);
				
           List<WebElement> options = s.getOptions();
			int size = options.size();
			System.out.println(data);
		}
		

		public  WebElement WebTablesize( String data) {
			List<WebElement> findElements = driver.findElements(By.tagName(data));
				int size = findElements.size();
			    System.out.println(size);
			    return (WebElement) findElements;

		}
		

		public void switchtowindows() {
			String parentwindowid = driver.getWindowHandle();
			System.out.println(parentwindowid);
			
			Set<String> allwindowid = driver.getWindowHandles();
			System.out.println(allwindowid);
			
			
			for (String x : allwindowid) {
				 
				 
				 if(!parentwindowid.equals(x)) {
						
				 driver.switchTo().window(x);
				 
				 }	
			}
		}
			
		public String switchtoparentwindow(String data) {
			String parentwindowid = driver.getWindowHandle();
			System.out.println(parentwindowid);
			
			Set<String> allwindowid = driver.getWindowHandles();
			System.out.println(allwindowid);
			
			
			for (String variable1 : allwindowid) {
				 
				 
				 if(!parentwindowid.equals(variable1)) {
						
				 driver.switchTo().window(variable1);
				 
				 driver.switchTo().window(parentwindowid);
				 
				 }	
			}
			return parentwindowid;

		}
		
		
		
		
		
		public void MultiwindowHandles(String data) {
			String parentwindowid = driver.getWindowHandle();
			Set<String> allwindowid= driver.getWindowHandles();
			 for (String x : allwindowid) {
				 
				 
				 if(!parentwindowid.equals(data)) {
						
				 driver.switchTo().window(data);
				 Set<String> allwindows2 = driver.getWindowHandles();
				  
				  
				  List<String> li = new LinkedList<String>();
					
				  
				   li.addAll(allwindows2);
				   
				   
				   for (String y : li) {
					   
					   
					   driver.switchTo().window(data);
					
				}
					
				
			}
		}
		

		}

		
				
		public String Datareadexcel(String SName, int RNo,int CNo) throws IOException {
			
			String value = null;
			
			File f = new File("C:\\Framework\\Framework\\Framework.xlsx");
			
			FileInputStream stream = new  FileInputStream(f);
			
			Workbook w = new XSSFWorkbook(stream);
			
			Sheet s = w.getSheet(SName);
			
			for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
				
				Row r = s.getRow(RNo);
				
				for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
					
					Cell c = r.getCell(CNo);
					
				   CellType cellType = c.getCellType();
					
				   
					
					switch (cellType) {
					case STRING:
						
						 value = c.getStringCellValue();
						
						
						
						break;

					default:
						
						if (DateUtil.isCellDateFormatted(c)) {
							
							Date d = c.getDateCellValue();
							SimpleDateFormat sim = new SimpleDateFormat();
							String format = sim.format(d);
							
							
						}
						else {
							double d = c.getNumericCellValue();
							long l = (long) d;
							 value = String.valueOf(l);
							
							}
						break;
					}
						
						
					}
					
					
					
					
					
			}
			return value;
			
		
		
}
				
		
			public void Upadateexcel(String SName, int RNo, int CNo, String data) throws IOException {
				
				File f = new File("C:\\Framework\\Framework\\Framework.xlsx");
				
				FileInputStream stream = new  FileInputStream(f);
				
				Workbook w = new XSSFWorkbook(stream);
				
				Sheet s = w.getSheet(SName);
				
				for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
					
					Row r = s.getRow(RNo);
					
					for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
						
						Cell c = r.getCell(CNo);
						
						c.setCellValue(data);
						
						FileOutputStream fout = new FileOutputStream(f);
						w.write(fout);
						

			}
			
				}
		}
			
			public void DataWriteExcel(String Sname,int Rno, int Cno, String data) throws IOException {
				

				File f = new File("C:\\Framework\\Framework\\Balu.xlsx");
				Workbook book = new XSSFWorkbook();
				Sheet createSheet = book.createSheet(Sname);
				Row createRow = createSheet.createRow(Rno);
				Cell createCell = createRow.createCell(Cno);
				createCell.setCellValue(data);
				FileOutputStream fou = new FileOutputStream(f);
				book.write(fou);
				
				
				

			}
			
			
			public void SwitchToFrames(WebElement  element) {
				driver.switchTo().frame(element);

			}
			
			public void SwitchToPreviousParentFrame() {
				driver.switchTo().parentFrame();

			}
			public void SwitchToMainwindows() {
				driver.switchTo().defaultContent();

			}
			
			
			public WebElement cssselector( String data) {
				WebElement findelement = driver.findElement(By.cssSelector(data));
				return findelement;

			}
			
			
			
			
	}

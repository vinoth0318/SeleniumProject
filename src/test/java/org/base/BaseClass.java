package org.base;

import java.awt.dnd.DragSourceDropEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Driver;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	public static void launchBrowser() {
		// WebDriverManager.Chromedriver().setup();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void windowMaximize() {
		driver.manage().window().maximize();
	}
	
	public static void launchUrl(String url) {
		driver.get(url);
	}
	
	public static String pageTitle( ) {
		String title = driver.getTitle();
		return title;
	}
	
	public static String pageUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	
	public static void passText(String txt , WebElement element) {
		element.sendKeys(txt);
	}
	
	public void closeEntireBrowser() {
		driver.quit();
	}
    
	public static void clickBtn(WebElement element) {
		element.click();
	}
	
	public static void screenShot(String imgName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File f = new File("location+ imgName.png");
		FileUtils.copyFile(screenshotAs, f);
	}
	
	public static  Actions a;
	public static void moveTheCursor(WebElement targetWebElement) {
		a = new Actions(driver);
		a.moveToElement(targetWebElement).perform();
	}
	
	public static void dragDrop(WebElement dragWebElement , WebElement dropWebElement) {
	a = new Actions(driver);
	a.dragAndDrop(dragWebElement , dropWebElement).perform();
	}
	
	public static JavascriptExecutor js;
	
	public static void scrollThePage(WebElement targetWebElement) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)", targetWebElement);
	}
	
	public static void scroll(WebElement element) {
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(false)", element);
	}
	
	public static void excelRead(String sheetName, int rowNum, int cellNum) throws IOException {
		File f = new File("excelLocation.xslx");
		FileInputStream f1 = new FileInputStream(f);
	    Workbook wb = new XSSFWorkbook(f1);
		Sheet mysheet = wb.getSheet("sheetName");
		Row row = mysheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		int cellType = cell.getCellType();
		
		String value = "";
		if (cellType == 1) {
			String stringCellValue = cell.getStringCellValue();
		}
		
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date dateCellValue = cell.getDateCellValue();
			SimpleDateFormat s = new SimpleDateFormat(value);
			String format = s.format(dateCellValue);
		}
		
		else {
			double numericCellValue = cell.getNumericCellValue();
			long l = (long)numericCellValue;
			String valueOf = String.valueOf(l);
		}
	}
	
	public static void createNewExcelFile(int rowNum, int cellNum, String writeData) throws IOException {
		File f = new File("C:\\Users\\vijay\\eclipse-workspace\\MavenProject\\excel\\newfile6ch.xlsx");
		Workbook wb = new XSSFWorkbook();
		Sheet createSheet = wb.createSheet("Datas");
		Row createRow = createSheet.createRow(rowNum);
		Cell createCell = createRow.createCell(cellNum);
		createCell.setCellValue(writeData);
		FileOutputStream fos = new FileOutputStream(f);
       wb.write(fos);
	}
	
	public static void createCell(int getRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\Users\\vijay\\eclipse-workspace\\MavenProject\\excel\\newfile6ch.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Datas");
		Row row = mysheet.getRow(getRow);
		Cell createCell = row.createCell(creCell);
		createCell.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	public static void createRow(int creRow, int creCell, String newData) throws IOException {
		File f = new File("C:\\Users\\vijay\\eclipse-workspace\\MavenProject\\excel\\newfile6ch.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet mysheet = wb.getSheet("Datas");
		Row createRow = mysheet.createRow(creRow);
		Cell createCell = createRow.createCell(creCell);
		createCell.setCellValue(newData);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
	}
	
	public static void updateDataToParticularCell(int getTheRow, int getTheCell, String existingData, String writeNewData) throws IOException {
	File f = new File("C:\\Users\\vijay\\eclipse-workspace\\MavenProject\\excel\\newfile.xlsx");
	FileInputStream fis  = new FileInputStream(f);
	Workbook wb = new XSSFWorkbook(fis);
	Sheet mysheet = wb.getSheet("Datas");
	Row row = mysheet.getRow(getTheRow);
	Cell cell = row.getCell(getTheCell);
	String stringCellValue = cell.getStringCellValue();
	if (stringCellValue.equals(existingData)) {
		cell.setCellValue(writeNewData);
	}
	FileOutputStream fos = new FileOutputStream(f);
	wb.write(fos);
	}
  
	// 2. Private WebElements
		// WebElement email = driver.findElement(By.id("email"));
		@FindBy(id = "email")
		private WebElement email;
		
		@FindBy(xpath = "password")
		private WebElement password;
		
		@FindBy(name = "login")
		private WebElement login;

		// 3. Getter to access WebElements outside the class
		public WebElement getEmail() {
			return email;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}



}
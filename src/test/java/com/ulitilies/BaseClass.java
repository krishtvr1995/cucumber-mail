package com.ulitilies;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	
	public class BaseClass {
	public static WebDriver driver;
		
		public static void launchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		public static void loadUrl(String url) {	
			driver.get(url);		
		}
		public static void windowMax() {
				driver.manage().window().maximize();
		}
		public static void printTitle() {	
			System.out.println(driver.getTitle());	
		}
		public static void printCurrentUrl() {
				System.out.println(driver.getCurrentUrl());
		}
		public static void fill(WebElement ele, String value) {
				ele.sendKeys(value);
		}
		public static void btnClick(WebElement ele) {
			ele.click();
		}
		public static void closeBrowser() {
			driver.close();
		}
		
		public static void screenshot(String name) throws IOException {
			TakesScreenshot tk=(TakesScreenshot)driver;
			File scr = tk.getScreenshotAs(OutputType.FILE);
			File des=new File("C:\\Users\\Krishna\\eclipse-workspace\\cucumbersample\\target\\screensot"+name+".jpg");
			FileUtils.copyDirectory(scr, des);
			// TODO Auto-generated method stub

		}
	/*	public static String getData(int rowNumber, int columnNumber)throws IOException,FileNotFoundException {
			
			File f = new File("C:\\Users\\Krishna\\eclipse-workspace\\DataDrivenMaven\\dataExcel\\Book1.xlsx");
			FileInputStream fis = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(fis);
			Sheet sheet1 = w.getSheet("aaa");
			Row row = sheet1.getRow(rowNumber);
			Cell cell = row.getCell(columnNumber);
			return cell.toString();
		}
	*/
	}




package com.grade.practice;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class creatgradedeatilTest {

	private static final CharSequence Grade8 = null;

	public static void main(String[] args)throws Exception {
		WebDriver driver=null;
		//Create random number
		 Random ran = new Random();
		int random = ran.nextInt(500);
		 FileInputStream fis=new FileInputStream(".\\Data\\commondata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		String URL = prop.getProperty("url");
		String USERNAME = prop.getProperty("username");
		String PASSWORD = prop.getProperty("password");
		String Browser = prop.getProperty("browser");
		FileInputStream fis1=new FileInputStream(".\\Data\\tyssss.xlsx");
		Workbook workbook = WorkbookFactory.create(fis1);
		String GRADE = workbook.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		String Afees = workbook.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
		String Hcharge = workbook.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
		String RANGE = workbook.getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
		String Grade = workbook.getSheet("Sheet1").getRow(1).getCell(7).getStringCellValue();
		if(Browser.equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("FIREFOX")) {
			WebDriverManager.firefoxdriver().setup();	
			driver=new FirefoxDriver();
		}
		else
		{
			System.out.println("invalid browser name");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(URL);
		driver.findElement(By.name("email")).sendKeys(USERNAME);
        driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys(PASSWORD);
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.xpath("//span[text()='Grade']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(GRADE);
		driver.findElement(By.id("admission_fee")).sendKeys(Afees);
		driver.findElement(By.id("hall_charge")).sendKeys(Hcharge);
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.xpath("//input[@class='mark-range form-control']")).sendKeys(RANGE);
		driver.findElement(By.xpath("//input[@placeholder='A']")).sendKeys(Grade);
		driver.findElement(By.id("btnSubmit1")).click();
		

	}


}

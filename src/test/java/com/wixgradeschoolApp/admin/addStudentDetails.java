package com.wixgradeschoolApp.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.wizGradeSchoolapp.generic.ExcelUtility;
import com.wizGradeSchoolapp.generic.FileUtility;
import com.wizGradeSchoolapp.generic.JavaUtility;
import com.wizGradeSchoolapp.generic.WebdriverUtility;
import com.wizGradeSchoolapp.objectRepositeryUtility.login;

import io.github.bonigarcia.wdm.WebDriverManager;

public class addStudentDetails {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=null;
		FileUtility ful= new FileUtility();
		JavaUtility jul= new JavaUtility();
		WebdriverUtility wul= new WebdriverUtility();
		ExcelUtility eul=new ExcelUtility();
		//Create random number
		 int random = jul.getRanDomNumber();
		 String URL = ful.getPropertyKeyValue("url");
		 String USERNAME = ful.getPropertyKeyValue("username");
		 String PASSWORD = ful.getPropertyKeyValue("password");
		 String Browser = ful.getPropertyKeyValue("browser");
		 String Grade1 = eul.getExcelData("Sheet1", 1, 16);
		 String Text = eul.getExcelData("Sheet1", 1, 17);
		 String Text1 = eul.getExcelData("Sheet1", 1, 18);
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
				wul.waitForElementInDOM(driver);
				driver.get(URL);
				login ln=new login(driver);
				ln.loginToApp(USERNAME, PASSWORD);
				/*driver.findElement(By.name("email")).sendKeys(USERNAME);
				driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys(PASSWORD);
				driver.findElement(By.id("btnSubmit")).click();
				driver.findElement(By.xpath("//span[text()='Student']")).click();
				driver.findElement(By.xpath("//a[@href='all_student.php']")).click();
				WebElement selectgrade = driver.findElement(By.xpath("//select[@id='grade']"));
				wul.select(selectgrade, Grade1);
				driver.findElement(By.xpath("//button[text()='Submit']")).click();
				driver.findElement(By.xpath("//a[@href='edit_student.php?std_index=7&grade_id=12']")).click();
				driver.findElement(By.xpath("//input[@id='address']")).sendKeys(Text);
				driver.findElement(By.xpath("//input[@name='address']")).sendKeys(Text1);
				driver.findElement(By.xpath("//button[@id='btnSubmit']")).click();
				*/
				
			}
	}



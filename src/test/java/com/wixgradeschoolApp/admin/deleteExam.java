package com.wixgradeschoolApp.admin;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;

import com.wizGradeSchoolapp.generic.BaseClass;
import com.wizGradeSchoolapp.generic.FileUtility;
import com.wizGradeSchoolapp.generic.JavaUtility;
import com.wizGradeSchoolapp.generic.WebdriverUtility;
import com.wizGradeSchoolapp.objectRepositeryUtility.Home;
import com.wizGradeSchoolapp.objectRepositeryUtility.login;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(com.wizGradeSchoolapp.generic.ListnerImplementation.class)
public class deleteExam extends BaseClass {
	public static void main(String[] args) throws Throwable {
		WebDriver driver=null;
		FileUtility ful= new FileUtility();
		JavaUtility jul= new JavaUtility();
		WebdriverUtility wul= new WebdriverUtility();
		//Create random number
		int random = jul.getRanDomNumber();
		String URL = ful.getPropertyKeyValue("url");
		String USERNAME = ful.getPropertyKeyValue("username");
		String PASSWORD = ful.getPropertyKeyValue("password");
		String Browser = ful.getPropertyKeyValue("browser");
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
		login lp=new login(driver);
		lp.loginToApp(USERNAME, PASSWORD);
		Home hp=new Home(driver);
		hp.getExamLnk().click();
		hp.getCreatLnk().click();
		hp.getImage().click();
		hp.getSingoutLnk().click();
		Assert.fail();
		//driver.findElement(By.name("email")).sendKeys(USERNAME);
		//driver.findElement(By.xpath("//input[@placeholder='Enter password']")).sendKeys(PASSWORD);
		//driver.findElement(By.id("btnSubmit")).click();
		//driver.findElement(By.xpath("//span[text()='Exam']")).click();
		//driver.findElement(By.xpath("//a[text()='Create Exam']")).click();
		//driver.findElement(By.xpath("//a[@class='confirm-delete btn btn-danger btn-xs']")).click();
		//driver.findElement(By.id("btnYes")).click();
		//driver.findElement(By.xpath("//img[@class='user-image']")).click();
		//driver.findElement(By.xpath("//a[text()='Sign out']")).click();


	}

}

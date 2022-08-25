package com.wizGradeSchoolapp.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe ");
	}

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com");
		driver.findElement(By.xpath("//a[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
		driver.findElement(By.xpath("//span[@class='bgProperties icon20 overlayCrossIcon']")).click();
		
		driver.findElement(By.xpath("//p[text()='Popular Filters']/../descendant::span[@class='filterName' and @title='IndiGo']/../..//span[@class='check']")).click();
		
		
		
		

	}

}

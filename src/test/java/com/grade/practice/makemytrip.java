package com.grade.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip {

	private static final TimeUnit TimeUnit = null;

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.get("https://www.goibibo.com/");
        driver.findElement(By.xpath("//span[text()='From']/following-sibling::p[text()='Enter city or airport']")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("blr");
        driver.findElement(By.xpath("//span[@class='autoCompleteTitle ' and contains(text(),'Bengaluru, India')]")).click();
     
        

	}

}

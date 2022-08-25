package com.wizGradeSchoolapp.practice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practices {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://rmgtestingserver:8888/index.php?module=Accounts&action=index");
   driver.findElement(By.name("user_name")).sendKeys("admin");
   driver.findElement(By.name("user_password")).sendKeys("admin");
   driver.findElement(By.id("submitButton")).click();
   driver.findElement(By.xpath("//a[@href='index.php?module=Accounts&action=index']"));
   String expRes = "hindistan";
  List<WebElement> lis = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]/a"));
  for(WebElement org:lis) {
  System.out.println(org.getText());
  }
  
	

	}

}

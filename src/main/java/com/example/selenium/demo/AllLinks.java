package com.example.selenium.demo;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllLinks {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\swarn\\git_code\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	     List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		 int linkSize = allLinks.size();
		 for(int i=0;i <linkSize; i++)
		  {
	       WebElement link = allLinks.get(i);
           String  linkText =link.getText();		
		   System.out.println(linkText);
		  }
	}
}

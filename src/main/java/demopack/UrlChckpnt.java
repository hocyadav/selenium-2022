package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UrlChckpnt {

	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://demo.actitime.com");
			
			driver.findElement(By.id("username")).sendKeys("admin");
			driver.findElement(By.name("pwd")).sendKeys("manager");
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			
			String expURL = "https://demo.actitime.com/user/submit_tt.do";
			String actURL = driver.getCurrentUrl();
			
			if(actURL.equals(expURL))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}

	}

}

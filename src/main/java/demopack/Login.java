package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		
		WebElement un = driver.findElement(By.id("username"));
	     un.sendKeys("admin");
	     
	   driver.findElement(By.name("pwd")).sendKeys("manager");;
       
        
        WebElement loginbtn =driver.findElement(By.id("loginButton"));
        loginbtn.click();
        
        Thread.sleep(30000);
        
       WebElement logoutbtn = driver.findElement(By.id("logoutLink"));
        logoutbtn.click();
	}

}

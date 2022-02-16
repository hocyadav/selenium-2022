package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextChcpnt1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		String expTxt="Enter Time-Track";
		String actTxt=driver.findElement(By.xpath("//td[@class='pagetitle'][1]")).getText();
		
		if(actTxt.equals(expTxt))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		Thread.sleep(2000);
		driver.findElement(By.id("logoutLink")).click();
	}

}

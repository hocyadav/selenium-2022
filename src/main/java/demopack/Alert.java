package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/selenium/testing.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//button[text()='Generate Alert Box']")).click();
		Thread.sleep(3000);
		String altxt = driver.switchTo().alert().getText();
		System.out.println(altxt);
		driver.switchTo().alert().accept();
	}

}

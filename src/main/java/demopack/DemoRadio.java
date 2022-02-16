package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoRadio {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\swarn\\git_code\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();
		//FirefoxDriver driver = new FirefoxDriver();(Interface logic)
		driver.get("https://krninformatix.com/sample.html");
		boolean status=driver.findElement(By.id("female")).isSelected();
		System.out.println(status);
		
		Thread.sleep(3000);
		driver.findElement(By.id("female")).click();
		
		boolean status1 = driver.findElement(By.id("female")).isSelected();
		System.out.println(status1);
		
		
	}

}

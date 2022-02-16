package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseAndKeyboardAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement brnch=driver.findElement(By.xpath("//span[text()='Branches']"));
		Actions act = new Actions(driver);
		act.moveToElement(brnch).perform();
		Thread.sleep(3000);
		WebElement location=driver.findElement(By.xpath("//span[text()='Marathahalli']"));
		Actions act1 = new Actions(driver);
		act1.moveToElement(location).perform();
		Thread.sleep(3000);
		WebElement brnchname = driver.findElement(By.xpath("//a[text()='Selenium-Training-in-Marathahalli']"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(brnchname).perform();
		act2.contextClick().perform();
		act2.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(3000);
		act2.sendKeys(Keys.ENTER).perform();
	
	}

}
 
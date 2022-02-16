package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseandKeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement coursesOffered=driver.findElement(By.xpath("//span[text()='Course Offered']"));
        Actions act = new Actions(driver);
        act.moveToElement(coursesOffered).perform();
        Thread.sleep(3000);
        act.contextClick(coursesOffered).perform();
        Thread.sleep(3000);
//By mouse hovering
       // act.sendKeys(Keys.ARROW_DOWN).perform();
       //Thread.sleep(3000);
       //act.sendKeys(Keys.ENTER).perform();
//By providing letters from keyboard
        act.sendKeys("T").perform();
        
//In order to  work with multiple combinations        
        act.sendKeys(Keys.ALT).build();
        act.sendKeys(Keys.CONTROL).build();
        act.sendKeys(Keys.DELETE).perform();
   
        
	}

}

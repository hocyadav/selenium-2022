package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframes {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/frames/frames.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

//for integer	
		driver.switchTo().frame(1);
		driver.findElement(By.name("name1")).sendKeys("Swarn");
		
//for string value when it have id or name property
		driver.switchTo().parentFrame();
		driver.switchTo().frame("secondframe");
		driver.findElement(By.name("rep")).click();
		
//for moving to parent or default frame
		//driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		
//for webElement when id or name is not present
		WebElement thirdframe=driver.findElement(By.xpath("//frame[@src='third.html']"));
		driver.switchTo().frame(thirdframe);
		driver.findElement(By.name("check")).click();
	}

}

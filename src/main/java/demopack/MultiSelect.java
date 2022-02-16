package demopack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement multiselect = driver.findElement(By.id("cities"));
		Select drpDwn = new Select(multiselect);
		 
		drpDwn.selectByIndex(2);
		Thread.sleep(3000);
		drpDwn.deselectByIndex(2);
		Thread.sleep(3000);
		drpDwn.selectByIndex(2);
		Thread.sleep(3000);
		drpDwn.selectByIndex(1);
		Thread.sleep(3000);
		drpDwn.selectByValue("3");
		Thread.sleep(3000);
		drpDwn.selectByVisibleText("Delhi");
		
		List<WebElement> alloptn = drpDwn.getAllSelectedOptions();
		int size = alloptn.size();
		
		for(int i=0 ; i < size ; i++)
		{
		 WebElement optn = alloptn.get(i);
		 String text = optn.getText();
		 System.out.println(text);
		}
		
		

	}

}

package demopack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
		WebElement singleSelect = driver.findElement(By.id("city"));
        Select dropDown = new Select(singleSelect);
        
        dropDown.selectByIndex(1);
        Thread.sleep(3000);
        dropDown.selectByValue("3");
        Thread.sleep(3000);
        dropDown.selectByVisibleText("Delhi");
       
        List<WebElement> allOption = dropDown.getOptions();
        int size = allOption.size();
        
        System.out.println(size);
        
        for(int i=0; i<size;i++)
        { 
          WebElement option = allOption.get(i);
          String text = option.getText();
          System.out.println(text);
        }
	}  

}

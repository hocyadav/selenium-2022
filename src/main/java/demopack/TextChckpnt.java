package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TextChckpnt {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		
		String expTxt="Please identify yourself";
		String actTxt = driver.findElement(By.id("headerContainer")).getText();
		
		if(actTxt.equals(expTxt))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}

package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TitleChkpnt {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.com");
		
		String expTitle= "actiTIME - Login";
		String actTitle = driver.getTitle();
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("Pass");
		}
		else 
		{
			System.out.println("Fail");
		}
				

	}

}

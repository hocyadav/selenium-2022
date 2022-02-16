package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayEleChckpnt {

	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new FirefoxDriver();
			driver.get("https://demo.actitime.com");
		boolean status = driver.findElement(By.className("atLogoImg")).isDisplayed(); 
        System.out.println(status);
        
	}

}

package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisplayEleChckpnt {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\swarn\\git_code\\geckodriver-v0.30.0-win64\\geckodriver.exe");

			WebDriver driver = new FirefoxDriver();
			driver.get("https://demo.actitime.com");
		boolean status = driver.findElement(By.className("atLogoImg")).isDisplayed(); 
        System.out.println(status);
        
	}

}

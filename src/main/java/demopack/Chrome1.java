package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome1 {

	public static void main(String[] args) throws InterruptedException {
	   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
	  // Thread.sleep(3000);
	   WebDriver driver = new ChromeDriver();
       //driver.getTitle();
	}

}

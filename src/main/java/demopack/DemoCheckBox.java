package demopack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\swarn\\git_code\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		
	 WebDriver driver = new FirefoxDriver();
	 driver.get("https://krninformatix.com/sample.html");
	 
	 boolean status = driver.findElement(By.id("rem")).isSelected();
	  System.out.println(status);
	 
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("rem")).click();
	  
	 boolean status1 = driver.findElement(By.id("rem")).isSelected();
	  System.out.println(status1);
	  
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("rem")).click();
	  boolean status2 = driver.findElement(By.id("rem")).isSelected();
	  System.out.println(status2);
	  
	  if(!status2)
	  {
		  driver.findElement(By.id("rem")).click();
	  }
	  

	}

}

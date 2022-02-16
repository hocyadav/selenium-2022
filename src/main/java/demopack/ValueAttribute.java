package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValueAttribute {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/sample.html");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//String attval = driver.findElement(By.xpath("//a[text()='Google']")).getAttribute("href");
		String attval = driver.findElement(By.xpath("//input[@id='female']")).getAttribute("name");
        System.out.println(attval);
	}

}

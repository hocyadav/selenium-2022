package demopack;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindow {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.air.irctc.co.in/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Tour Packages']")).click();
		//Thread.sleep(3000);
		
		Set<String> allwindows=driver.getWindowHandles();
		Iterator<String> str =allwindows.iterator();
		
		String irctc=str.next();
		String tourPackages=str.next();
		
		System.out.println(irctc);
		System.out.println(tourPackages);
		
		driver.switchTo().window(tourPackages);
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		Thread.sleep(3000);
		driver.close();
		
		driver.switchTo().window(irctc);
		
		driver.findElement(By.id("stationFrom")).sendKeys("Bengaluru");
		

	}

}

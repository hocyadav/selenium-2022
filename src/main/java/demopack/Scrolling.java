package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.unix.X11.Window;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//For single scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
//For scrolling all over the page		
		int i = 0;
		while(i < 100) {
			String s1 = "window.scrollBy(0,"+ String.valueOf(i) +")";
			jse.executeScript(s1, "");
			i++;
			Thread.sleep(100);
		}
		
		/*for(int j=0; j< 100; j++) {
			String s1 = "window.scrollBy(0,"+ String.valueOf(i) +")";
			jse.executeScript(s1, "");
			Thread.sleep(100);
		}*/

	}

}

package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FileDownload {

	public static void main(String[] args) {
		
//		FirefoxProfile prof = new FirefoxProfile();
//		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
//		//prof.setPreference("browser.download.folderList",0);
//		prof.setPreference("browser.download.folderList",2);
//		prof.setPreference("browser.download.dir","C:\\automate download");
//		WebDriver driver = new FirefoxDriver(prof);
		System.setProperty("webdriver.gecko.driver", "C:\\swarn\\git_code\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		
		FirefoxOptions firefoxOptions = new FirefoxOptions();
		firefoxOptions.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		firefoxOptions.addPreference("browser.download.folderList",2);
		firefoxOptions.addPreference("browser.download.dir","C:\\automate download");
		WebDriver driver = new FirefoxDriver(firefoxOptions);
		
		driver.manage().window().maximize();
		driver.get("https://krninformatix.com/download.php");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@href='https://bit.ly/2zm3ZzF']")).click();
		//boolean val =driver.findElement(By.xpath("//img[@src='img/logo.png']")).isDisplayed();
	}

}

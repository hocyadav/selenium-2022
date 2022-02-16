 package demopack;


	import java.io.File;
	import java.io.IOException;
	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.testng.annotations.Test;
		 
  public class Screenshot {

	public static void main(String[] args) {
		 WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		 
		// Take screenshot and store as a file format
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		 // now copy the  screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("C:\\Program Files\\Java\\error.png"));
		}
		 
		catch (IOException e)
		 {
		  System.out.println(e.getMessage());
		 
		 }

	}

}

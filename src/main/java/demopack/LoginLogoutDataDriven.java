package demopack;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogoutDataDriven {

	public static void main(String[] args) throws InterruptedException {
		DataDrivenFrameWork ddf = new DataDrivenFrameWork();
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		
		int lastrow=ddf.lastrownum("Sheet1");
		
		for(int i=1;i<=lastrow;i++)
		{
			
			String un=ddf.getExcelData("Sheet1", i, 0);
			String pwd=ddf.getExcelData("Sheet1", i, 1);
			driver.findElement(By.name("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pwd);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(10000);
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(10000);
		}
		

	}

}

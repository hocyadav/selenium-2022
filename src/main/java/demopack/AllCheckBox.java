package demopack;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\swarn\\git_code\\geckodriver-v0.30.0-win64\\geckodriver.exe");

		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://smartwebby.com/PHP/Phptips2.asp");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		List<WebElement> allChckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int chcksize = allChckbox.size();
        System.out.println(chcksize);
        
        for(int i = 0; i <chcksize; i++)
        {
        	
			WebElement chckget = allChckbox.get(i);
        	if(chckget.isSelected() == false)
        	chckget.click(); 
        }
	}

}

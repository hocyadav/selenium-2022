package demopack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowser {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Java\\IEDriverServer.exe");
		WebDriver driver= new InternetExplorerDriver();
		

	}

}

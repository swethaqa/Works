package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumChrome {

	public static void main(String[] args) {
		
		/*System.setProperty("webdriver.chrome.driver", "F:\\Softwares\\Selenium\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("http://www.google.com");*/
		
		
		System.setProperty("webdriver.ie.driver", "F:\\Softwares\\Selenium\\IEDriverServer.exe");
		WebDriver driver =  new InternetExplorerDriver();
		driver.get("http://www.google.com");
	}

}

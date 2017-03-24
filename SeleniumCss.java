package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumCss {

	public static void main(String[] args) {
		
		WebDriver driver =new FirefoxDriver();
		
		driver.get("http://login.salesforce.com");
		driver.findElement(By.cssSelector("[name='username']")).sendKeys("chandu");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("chandu");
		
		
		

	}

}

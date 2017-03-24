package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumFirefox {

	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		//System.out.println(driver.getTitle());
		//System.out.println(driver.getCurrentUrl());
		//driver.findElement(By.id("email")).sendKeys("boddu.chandrasekhar@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("05551a0444");
		//driver.findElement(By.xpath(".//*[@id='u_0_o']")).click();
		
			// link text example
		//driver.findElement(By.linkText("Forgot account?")).click();
		
		// customize xpath syntax : //tagname[@attribute = 'value']
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Hello");
		
		//driver.close(); 
		

	}

}

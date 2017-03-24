package selenium_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumJavaAlerts {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		driver.findElement(By.xpath("//input[@value = 'Confirmation Alert']")).click();
		driver.switchTo().alert().getText();// to get text of the alert
		driver.switchTo().alert().accept(); // for all positive , yes,done,ok,confirm etc
		driver.switchTo().alert().dismiss(); // for all negative
		driver.switchTo().alert().sendKeys("hgfdgd");// to sent any input if text box present in alert.
	}

}

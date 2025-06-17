package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity10Test {
	public static void main(String[] args) {
		
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		
		// open the browser or page
		driver.get(" https://training-support.net/webelements/dynamic-attributes");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//page interactions
		//print the page title
		System.out.println(driver.getTitle());
		
		//Get the title of the page and print it to the console.
		driver.findElement(By.xpath("//input[starts-with(@id, 'full-name-')]")).sendKeys("Bhavana");
		driver.findElement(By.xpath("//input[contains(@id, '-email')]")).sendKeys("bhavanadadi68@gmail.com");
		driver.findElement(By.xpath("//input[contains(@name, '-event-date-')]")).sendKeys("2001-11-28");
		driver.findElement(By.xpath("//textarea[contains(@id, '-additional-details-')]")).sendKeys("some Random Meeting");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		

		//Wait for success message to appear and print it to the console.
		String message = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("action-confirmation"))).getText();
		System.out.println(message);
		//Close the browser.
		driver.quit();
	}
}



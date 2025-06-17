package Activities;

	import java.time.Duration;

import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Activity8Test {

		public static void main(String[] args) {
					
					
					// Initialize driver
					WebDriver driver = new FirefoxDriver();
					
					// open the browser or page
					driver.get("https://training-support.net/webelements/dynamic-controls");
					driver.manage().window().maximize();
					
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
					
					//page interactions
					//print the page title
					System.out.println(driver.getTitle());
					
					//find the Checkbox on the page 
					WebElement checkBox = driver.findElement(By.id("checkbox"));
					 // click on the toggle checkbox Button to remove the checkbox
					driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
					
					//wait for the checkbox to disappear
					wait.until(ExpectedConditions.invisibilityOf(checkBox));
					
					//Toggle the checkbox again
					driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
					
					//wait for it appear and then select it
					wait.until(ExpectedConditions.visibilityOf(checkBox));
					checkBox.click();
					
					// exit the browser
					driver.quit();
		}
}
					
					
					
					
					
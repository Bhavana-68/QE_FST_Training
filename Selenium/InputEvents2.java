package Activities;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;
	import org.openqa.selenium.firefox.FirefoxDriver;
	import org.openqa.selenium.interactions.Actions;
	
	public class InputEvents2 {
			
		public static void main(String[] args) throws InterruptedException {
			
			
			// Initialize driver
			WebDriver driver = new FirefoxDriver();
			Actions builder = new Actions(driver);
			
			//open the browser
			
			driver.get("https://training-support.net/webelements/keyboard-events");

			
			//page interactions
			//print the page title
			System.out.println(driver.getTitle());
			
			// Type some text
			builder.sendKeys("This is bhavana").build().perform();
			
			// print the message
			System.out.println(driver.findElement(By.cssSelector("h1.mt-3")).getText());
			
			// close the browser
			driver.quit();
		}

}
		

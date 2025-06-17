package Activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	public class InputEvents8{
		
	public static void main(String[] args) throws InterruptedException {
		
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		//open the browser
		
		driver.get("https://training-support.net/webelements/mouse-events");
		
		

		
		
		
		//page interactions
		//print the page title
		System.out.println(driver.getTitle());
		
		// Find all the elements
		
		WebElement CargoLock = driver.findElement(By.xpath("//h1[text()='Cargo.lock']"));
		WebElement Cargotoml = driver.findElement(By.xpath("//h1[text()='Cargo.toml']"));
		WebElement srcFile = driver.findElement(By.xpath("//h1[text()='src']"));
		WebElement targetFile = driver.findElement(By.xpath("//h1[text()='target']"));
		
	
		
		// Left the cargo.lock button and then click it
		builder.click(CargoLock).pause(5000).click(Cargotoml).build().perform();
		
		//print the confirmation text at the end of the sequence
		System.out.println(driver.findElement(By.id("result")).getText());
		
		//Double click on the button
		builder.doubleClick(srcFile).pause(5000).contextClick(targetFile).perform();
		
		//Then right click on the target button and select open
		
			builder.click(driver.findElement(By.cssSelector("span.ml-3"))).
			build().perform();
			System.out.println(driver.findElement(By.id("result")).getText());
			
		
				
		
		
		// close the browser
		driver.quit();
		
	}
}



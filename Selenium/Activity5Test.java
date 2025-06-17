package Activities;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	public class Activity5Test {


		public static void main(String[] args) {
					
					
					// Initialize driver
					WebDriver driver = new FirefoxDriver();
					
					// open the browser or page
					driver.get("https://training-support.net/webelements/dynamic-controls");
					
					//page interactions
					//print the page title
					System.out.println(driver.getTitle());
					//Find the checkbox input element
					WebElement checkbox  = driver.findElement(By.id("checkbox"));
					//check if it is visible on the page
					 System.out.println(checkbox.isDisplayed());
					//click the Remove checkbox button
					driver.findElement(By.cssSelector("button.svelte-sfj3o4")).click();
					// check if it is visible again and print the results //true
					System.out.println(checkbox.isDisplayed());
					//close the browser
					driver.quit();
		}
	

}

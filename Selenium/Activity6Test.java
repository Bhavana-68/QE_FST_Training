package Activities;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
	public class Activity6Test {


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
					//check if it is selected on the page
					 System.out.println(checkbox.isSelected());
					//click the checkbox
					checkbox.click();
					// check if it is selected again and print the results
					System.out.println(checkbox.isSelected()); //false
					//close the browser
					driver.quit();
		}
	

}

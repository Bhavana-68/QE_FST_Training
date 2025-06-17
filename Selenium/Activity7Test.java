package Activities;

	import org.openqa.selenium.By;

	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7Test {
	


		public static void main(String[] args) {
					
					
					// Initialize driver
					WebDriver driver = new FirefoxDriver();
					
					// open the browser or page
					driver.get("https://training-support.net/webelements/dynamic-controls");
					
					//page interactions
					//print the page title
					System.out.println(driver.getTitle());
					//Find the text field
					 WebElement textBox =driver.findElement(By.id("textInput"));
					 //check if the text field is enabled and print it
					 System.out.println(textBox.isEnabled());
					 //click on Enable input button to enable the input button
					 driver.findElement(By.id("textInputButton")).click();
					 // check if the text field is enabled and again print it
					 System.out.println(textBox.isEnabled());
					 //close the browser
					 driver.quit();
		}

}

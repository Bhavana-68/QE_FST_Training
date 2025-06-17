package Activities;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {

	public static void main(String[] args) {
			
			
			// Initialize driver
			WebDriver driver = new FirefoxDriver();
			
			// open the browser or page
			driver.get("https://training-support.net");
			
			
			//page interactions
			//print the page title
			System.out.println(driver.getTitle());
			
			// click the about us button
			
			
			// close the browser
			driver.quit();
		}
}

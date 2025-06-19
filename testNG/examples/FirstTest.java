package examples;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
	// In TestNG we never create main function
// @Test - The annotated method is a test case
	//@BeforeClass - The annotated method will run once before each class.
	//@AfterClass - The annotated method will run once after each class.
	
	//WebDriver Declaration
	WebDriver driver;
	
	//WebDriverWait declaration
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		
		//Initialize the driver
		driver = new FirefoxDriver();
		
		//Initialize wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		//open the page 
		driver.get("https://training-support.net");
		
	}
	@Test
	// run/debug
	public void verifyPageTitle() {
		assertEquals(driver.getTitle(), "Training Support");		
	}
	
	
	@AfterClass
	public void testDown() {
		driver.quit();
	}
	
	

}

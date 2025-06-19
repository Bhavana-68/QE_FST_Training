package activities;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
//Create a TestNG Class with the annotations
//@Test
//@BeforeClass
//@AfterClass
//In the @BeforeClass method, create the a driver instance for FirefoxDriver
//Also use the get() method to open the browser with https://training-support.net/webelements/login-form/
//In the @AfterClass method, use close() to close the browser once the test is done.

public class Testactivity3 {

	WebDriver driver;
	
	//WebDriverWait declaration
	WebDriverWait wait;
	
	@BeforeClass
	public void setup() {
		
		//Initialize the driver
		driver = new FirefoxDriver();
		
		//Initialize wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(500));
		
		// Open the login page
		driver.get("https://training-support.net/webelements/login-form/");
	}

	@Test
	public void verifyPageTitle() {
		// Assert page title
		assertEquals(driver.getTitle(), "Selenium: Login Form");
	}
	@Test(priority = 3)
	public void successfulLogin() {
		// Assert page title
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.id("password")).sendKeys("password");	
		//find and enter the password
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		//driver.findElement(By.id("password")).clear();
		String message = driver.getTitle();
		assertEquals(message,  "Selenium: Login Success!");
		
	}
	@Test(priority = 2)
	public void UnsuccessfulLogin() {
		// Assert page title
		driver.findElement(By.id("username")).sendKeys("fake");
		driver.findElement(By.id("password")).sendKeys("pass");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String message = driver.findElement(By.id("subheading")).getText();
		//Assertions
		assertEquals(message,  "Invalid credentials");
		
	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}

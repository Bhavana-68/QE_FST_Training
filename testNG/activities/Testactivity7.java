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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class Testactivity7 {
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
	@DataProvider(name = "Credentials")
	public Object[][] creds() {
		//REturn new incorrect credentials for test
		return new Object[][] {
			{"user1", "password1"},
			{"user2","password2"},
			{"user3","password3"},
			{"user4","password4"},
			{"user5","password5"},
		};
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
	@Test(priority = 2, dataProvider = "Credentials")
	public void UnsuccessfulLogin(String username, String password) {
		// Assert page title
		driver.findElement(By.id("username")).sendKeys("username");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.xpath("//button[text()='Submit']")).click();
		
		String message = driver.findElement(By.id("subheading")).getText();
		//Assertions
		assertEquals(message,  "Invalid credentials");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("password")).clear();
		
	}

	@AfterClass
	public void tearDown() {
		// Close the browser
		driver.quit();
	}
}




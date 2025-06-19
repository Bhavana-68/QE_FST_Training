
package activities;
//Use getTitle() to get and print the title of the page.

//Make an assertion using assertEquals() to make sure the title of the page is "Training Support".
//Use findElement() to find the "About Us" Button on the page and click it.
//Get and print the title of the new page.
//Assert the title of the new page.

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

public class activity1 {
	// In TestNG we never create main function
	// @Test - The annotated method is a test case
	// @BeforeClass - The annotated method will run once before each class.
	// @AfterClass - The annotated method will run once after each class.

	// WebDriver Declaration
	WebDriver driver;

	// WebDriverWait declaration
	WebDriverWait wait;

	@BeforeClass
	public void setup() {

		// Initialize the driver
		driver = new FirefoxDriver();

		// Initialize wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		// open the page
		driver.get("https://training-support.net");

	}

	@Test(priority = 1)
	public void verifyHomepageTitle() {
		// assert page title
		assertEquals(driver.getTitle(), "Training Support");

	}

	@Test(priority = 2)
	public void verifyAboutPage() {
		// assert page title
		driver.findElement(By.linkText("About Us")).click();
		// wait till page loads
		wait.until(ExpectedConditions.titleContains("About"));
		// assert page title
		assertEquals(driver.getTitle(), "About Training Support");

	}

	@AfterClass
	public void testDown() {
		driver.quit();
	}

}

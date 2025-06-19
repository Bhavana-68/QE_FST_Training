package activities;
//Add 4 @Test methods.
//In the first @Test method, use getTitle() to get and assert the title of the page.
//In the second @Test method, use findElement() to look for the black button. Make an incorrect assertion. (This test case is meant to throw an error)
//For the third @Test method, skip it by setting it's enabled parameter to false.
//The third method will be skipped, but will not be shown as skipped.
//For the fourth @Test method, skip it by throwing a SkipException inside the method.
//The fourth method will be skipped and it will be shown as skipped.
//Observe the result in the console.




import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testactivity2 {
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
		driver.get("https://training-support.net/webelements/target-practice/");

	}

	@Test(priority = 1)
	public void verifypageTitle() {
		// assert page title
		assertEquals(driver.getTitle(), "Selenium: Target Practice");

	}
	@Test(priority = 2)
	public void verifyButtonText() {
		// Find the button with text black
		String buttonText = driver.findElement(By.cssSelector("button.bg-slate-200")).getText(); //Actual:slste
		//Asssert page title
		assertEquals(buttonText, "Black");
	}
	
	@Test(priority = 3, enabled = false)
	public void verifyHeadingText() {
		// Find the heading with text black
		String headingText = driver.findElement(By.tagName("h1")).getText();
		//Asssert page title
		assertEquals(headingText, "Heading #1");
	}	
	@Test(priority = 4)
	public void verifyFooterText() {
		throw new SkipException("This test will be skipped");
	}

	

	@AfterClass
	public void testDown() {
		driver.quit();
	}

}

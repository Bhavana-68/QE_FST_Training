package activities;
import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.support.Color;


public class Testactivity5 {
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
			driver.get("https://training-support.net/webelements/target-practice");
			
		}
		@Test(priority = 1)
		public void checkPageTitle() {
			String pt = driver.getTitle();
			assertEquals(pt, "Selenium: Target Practice");
		}
		@Test(groups = "HeaderTest")
		public void h3() {
			String h_3 = driver.findElement(By.cssSelector("h3.text-3xl.font-bold.text-orange-600")).getText();
			assertEquals(h_3, "Heading #3");
		}
		@Test(groups = "HeaderTest")
		public void h5() {
			Color h_5 = Color.fromString(
					driver.findElement(By.cssSelector("h5.text-3xl.font-bold.text-purple-600")).getCssValue("color"));
			assertEquals(h_5.asHex(), "#9333EA");
		}
		@Test(groups = "ButtonTests")
		public void be() {
			String t = driver
					.findElement(By.cssSelector(
							"button.rounded-xl.bg-emerald-200.p-2.text-3xl.font-bold.text-emerald-900.svelte-2hb4ib"))
					.getText();
			assertEquals(t, "Emerald");
		}
		@Test(groups = "ButtonTests")
		public void fc() {
			String trc = driver
					.findElement(By.cssSelector(
							"button.rounded-xl.bg-purple-200.p-2.text-3xl.font-bold.text-purple-900.svelte-2hb4ib"))
					.getCssValue("color");
			assertEquals(trc, "rgb(88, 28, 135)");
		}
		@AfterClass
		public void tearDown() {
			driver.quit();
		}
	}
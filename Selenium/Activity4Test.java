package Activities;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4Test {

	public static void main(String[] args) {
				
				
				// Initialize driver
				WebDriver driver = new FirefoxDriver();
				
				// open the browser or page
				driver.get("https://training-support.net/webelements/target-practice");
				
				//page interactions
				//print the page title
				System.out.println(driver.getTitle());
				String message = driver.findElement(By.xpath("//h3[contains(@class, 'text-orange-600')]")).getText();
				//System.out.println(driver.findElement(By.xpath("//h3[text()='Heading #3']")).getText());
				System.out.println(message);
				String c = driver.findElement(By.xpath("//h5[contains(@class, 'text-purple-600')]")).getText();
				//System.out.println(driver.findElement(By.xpath("//h5[text()='Heading #5']")).getCssValue());
				//System.out.println(headingColor.asHex());
				System.out.println(c);
				//using other locator
				String classes = driver.findElement(By.className("bg-purple-200")).getAttribute("class");
				System.out.println(classes);
				//Sysytem.out.println(driver.findElement(By.cssSelector
				
				String slate_text = driver.findElement(By.className("bg-slate-200")).getText();
				System.out.println(slate_text);
				
				driver.quit();
				
	}
	}




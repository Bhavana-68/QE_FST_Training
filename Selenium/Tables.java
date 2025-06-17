package Activities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Tables {
public static void main(String[] args) throws InterruptedException {
		
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		//open the browser
		
		driver.get("https://training-support.net/webelements/tables");

		
		//page interactions
		//print the page title
		System.out.println(driver.getTitle());
		
		//printing the rows and columns
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println(rows.size());
		System.out.println(cols.size());
		
		//find the particular row
		List<WebElement> thirdrow = driver.findElements(By.xpath("//table/tbody/tr[3]/td"));
		// for (WebElement cell: thirdRow) {
			//System.out.println(cell.getText());
		System.out.println(driver.findElement(By.xpath("//table/tbody/tr[3]")).getText());
		
		
		
		
		//close the browser
		
		driver.quit();
}
}

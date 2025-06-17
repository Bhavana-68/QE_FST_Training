package Activities;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AddRowTable {
public static void main(String[] args) throws InterruptedException {
		
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		//open the browser
		
		driver.get("https://training-support.net/webelements/tables");

		
		//page interactions
		//print the page title
		System.out.println(driver.getTitle());
		//Find the number of rows and columns in the table and print them.
		
		List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table/tbody/tr/td"));
		System.out.println(rows.size());
		System.out.println(cols.size());
		
		//Find and click the Add Row
		WebElement addRowButton = driver.findElement(By.xpath("//button[contains(text(), 'Add Row')]"));
        addRowButton.click();
		
        //Find any newly added row and the following data:
        
        String[] dataToAdd = {"10", "Hover car Racer", "Matheww Reilly", "0330440160", "$7.99"};
        for (int i = 0; i < dataToAdd.length; i++ ) {
        	By lastRowCells = By.xpath("//table/tbody/tr[last()]/td[" + (i + 1) + "]");
        	driver.findElement(lastRowCells).clear();
        	driver.findElement(lastRowCells).sendKeys(dataToAdd[i]);
        }
		//ID:10 Book Name: Hover Car Racer
		//Author: Mathew Reilly ASIN: 0330440160
		//price: $7.99
		//print the data from the newly added row
        System.out.println(driver.findElement(By.xpath("//table/tbody/tr[last()]")).getText());
		
		
		
		
		
		
		//close the browser
		driver.quit();
}
		

}

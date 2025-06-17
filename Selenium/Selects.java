package Activities;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Selects {
public static void main(String[] args) throws InterruptedException {
		
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		//open the browser
		
		driver.get("https://training-support.net/webelements/selects");	
		
		//page interactions
		//print the page title
		System.out.println(driver.getTitle());
		//Select the second option using the visible text.
		WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
		Select  select = new Select (dropdown);

        // Select the second option using visible text
        select.selectByVisibleText("One");

        // Select the third option using the index (indexes are 0-based)
        select.selectByIndex(2);

        // Select the fourth option using the value attribute
        select.selectByValue("three");

        // Get all the options in the dropdown
        List<WebElement> options = select.getOptions();
        
        // Print all the options to the console
        System.out.println("Options in the dropdown:");
        for (WebElement option : options) 
        {
            System.out.println(option.getText());
        }
		
		driver.quit();
}
		

}

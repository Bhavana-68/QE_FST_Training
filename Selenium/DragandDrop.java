package Activities;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragandDrop {
	public static void main(String[] args) throws InterruptedException {
		
		
		// Initialize driver
		WebDriver driver = new FirefoxDriver();
		Actions builder = new Actions(driver);
		
		//open the browser
		
		driver.get("https://training-support.net/webelements/drag-drop");

		
		//page interactions
		//print the page title
		System.out.println(driver.getTitle());
		WebElement ball = driver.findElement(By.id("ball"));
		WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
		WebElement dropzone2 = driver.findElement(By.id("dropzone2"));
		
		// drag it to move it into "dragzone1"
		builder.dragAndDrop(ball,  dropzone1).build().perform();
		System.out.println(dropzone1.getText());
		
		//once moved verified it into dropzone2
		
		builder.clickAndHold(ball).moveToElement(dropzone2).release().build().perform();
		System.out.println(dropzone2.getText());

		//close the browser
	
		driver.quit();
	}

}

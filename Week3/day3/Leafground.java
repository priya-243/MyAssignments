package Week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
/*A web page that contains various buttons. 
 * Your task is to automate interactions with these buttons using Selenium WebDriver.
- Click on the button with the text ‘Click and Confirm title.’
- Verify that the title of the page is ‘dashboard.’ 
- Check if the button with the text ‘Confirm if the button is disabled’ is disabled. 
- Find and print the position of the button with the text ‘Submit.’ 
- Find and print the background color of the button with the text ‘Find the Save button color.’ 
- Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
- Close the browser window.
*/
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafground {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();

		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();

// click on click and confirm title button

		driver.findElement(By.xpath("//span[text()='Click']")).click();
// Verifying the title
		String title = driver.getTitle();
		System.out.println("The title of the page is:" + title);
//navigating back to previous page
		driver.navigate().back();
		
//check the disabled button is disabled
		boolean disable = driver.findElement(By.xpath("//span[text()='Disabled']")).isEnabled();
		System.out.println(disable);
// Find and print the position of the button with the text ‘Submit.’ 
		Point location = driver.findElement(By.xpath("//span[text()='Submit']")).getLocation();
	System.out.println("position of the buttob is:" +location);
// Find and print the background color of the button with the text ‘Find the Save button color.’ 
	WebElement saveButton = driver.findElement(By.xpath("//span[text()='Save']"));
	String backgroundColor = saveButton.getCssValue("background-color");
	System.out.println("The background color of the Find the Save button is:"+ backgroundColor);
// Find and print the height and width of the button with the text ‘Find the height and width of this button.’ 
	
	WebElement buttonHeight = driver.findElement(By.xpath("//span[text()='Submit']"));
	Dimension size = buttonHeight.getSize();
	System.out.println("The height and width of the button is :" +size);
// Close the browser window
	driver.close();
	}

}

package Week3.day4;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Automate interactions with frames, trigger alerts, and verify the displayed text based on actions using Selenium 
WebDriver on the given application. */

public class FrameandAlertInteractions {
	public static void main(String[] args) {

// Initialize ChromeDriver 
//- Load the URL (https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt) 
//- Maximize the browser window 
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
//- Switch to the frame 	
		driver.switchTo().frame("iframeResult");
// Add an implicit wait to ensure the webpage elements are fully loaded	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//- Click the "Try It" button inside the frame 
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
//- Click OK/Cancel in the alert that appears 
// switching to alert	
		Alert text = driver.switchTo().alert();
//adding input to the alert
		text.sendKeys("Priya");
//accept the alert
		text.accept();

//- Confirm the action is performed correctly by verifying the text displayed
		WebElement element = driver.findElement(By.id("demo"));
		String text1 = element.getText();
		System.out.println("Text displayed is :" + text1);

//close
		driver.close();

	}

}

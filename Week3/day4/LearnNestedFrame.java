package Week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://leafground.com/frame.xhtml");
			driver.manage().window().maximize();
//switch to outer frame
			
		//using index
			driver.switchTo().frame(2);
			//using webelement

			
//switch to inner frame
			// using id
			 driver.switchTo().frame("frame2");
			 //using index
			// driver.switchTo().frame(0);
			
//click webelement
			driver.findElement(By.id("Click")).click();
			
//switch back to immediate parent frame
			driver.switchTo().parentFrame();
			
//switch back to main web page
			driver.switchTo().defaultContent();

}
}

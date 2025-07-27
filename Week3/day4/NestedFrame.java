package Week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrame {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/frame.xhtml");
		driver.manage().window().maximize();
//switch to outer frame
 
   // using index 
		driver.switchTo().frame(2);
    /* using webelement 		
		WebElement outerFrame = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));	
		driver.switchTo().frame(outerFrame); */
		
//switch to outer frame		
		WebElement innerFrame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
		driver.switchTo().frame(innerFrame);
//click on element
	driver.findElement(By.id("Click")).click();
	
		
	}
	
	
	

}

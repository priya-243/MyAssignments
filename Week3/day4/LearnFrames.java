package Week3.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
	public static void main(String[] args) throws InterruptedException {
		
			ChromeDriver driver=new ChromeDriver();
				driver.get("https://leafground.com/frame.xhtml");
				driver.manage().window().maximize();
				//move inside frame
				
				driver.switchTo().frame(0);
				
				driver.findElement(By.id("Click")).click();
}
}

package Week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnPromptAlert {
	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://leafground.com/alert.xhtml;");
			driver.manage().window().maximize();
			
			//click on element show
			driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();

			//transfer focus
			Alert promptAlert = driver.switchTo().alert();
			
			promptAlert.sendKeys("text");
			
			promptAlert.accept();
			// promptAlert.dismiss();
			
			
}
}

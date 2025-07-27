package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

// C:\Project\JulyWeekDay\driver\msedgedriver.exe
public class FlipkartMenShirt {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "C:\\Project\\JulyWeekDay\\driver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();		
	 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("mens shirt");
	
	}

}

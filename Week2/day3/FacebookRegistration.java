package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		driver.findElement(By.name("lastname")).sendKeys("T");
		driver.findElement(By.name("reg_email__")).sendKeys("priya.raje92@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("Jashu@28");
		
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		WebElement Day = driver.findElement(By.id("day"));
		Select Options1=new Select(Day);
		Options1.selectByValue("28");
		
		WebElement month = driver.findElement(By.id("month"));
		Select Options2=new Select(month);
		Options2.selectByValue("Jul");
		
		WebElement year = driver.findElement(By.id("year"));
		Select Options3=new Select(year);
		Options3.selectByValue("1998");
		// getallselectedoptions -> to get all selected list
		// deselect method to deselect the particular element
		
		Options3.deselectByValue("1998");
		
	}

}

package Week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginFunction {

	public static void main(String[] args) {
		//launch browser
		ChromeDriver driver=new ChromeDriver();
		//load url, maximize
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//find elements using locator and sendkeys to enter text in textfield
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	}
}

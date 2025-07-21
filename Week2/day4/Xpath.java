package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	public static void main(String[] args) {
		//launch browser
		ChromeDriver driver=new ChromeDriver();
		//load url, maximize
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//find elements using locator and sendkeys to enter text in textfield
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		//login
		driver.findElement(By.className("decorativeSubmit")).click();
	    // click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		

}
}

package Marathon1;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1_PVRBookTkt {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
// click quick tab cinema
		driver.findElement(By.xpath("//span[text()='Cinema']")).click();
// Select Your Cinema
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
// Select Date
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
// select movie	
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[6]")).click();
// select timing
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//li[@class='p-dropdown-item'])[1]")).click();
// book and accept
		driver.findElement(By.xpath("//button[@aria-label='Submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Accept']")).click();
// select seat
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='SL.SILVER|D:13']")).click();
//proceed
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
//print seat info
		String seatInfo = driver.findElement(By.xpath("//div[@class='seat-info']")).getText();
		System.out.println("The seat info is: "+seatInfo);
		String grandTotal = driver.findElement(By.xpath("//div[@class='grand-tota col-md-3']")).getText();
		System.out.println("The price info is: "+grandTotal);
//continue
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		driver.close();

	}

}

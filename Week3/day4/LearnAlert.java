package Week3.day4;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class LearnAlert 
{
	public static void main(String[] args) 
	{
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://leafground.com/alert.xhtml;");
			driver.manage().window().maximize();
			//click on element show
			driver.findElement(By.xpath("//span[text()='Show']")).click();
			
			//click on next show
			driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
			
			//transfer focus
			Alert simpleAlert = driver.switchTo().alert();
			
			String text = simpleAlert.getText();
			System.out.println(text);
			simpleAlert.accept();
			
}
}

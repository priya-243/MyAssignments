package Week3.day4;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfirmAlert {
	public static void main(String[] args) throws InterruptedException {
	/*	ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(); */
		ChromeDriver driver=new ChromeDriver();
			driver.get("https://leafground.com/alert.xhtml;");
			driver.manage().window().maximize();		
			//click on element show
			driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();		
			//transfer focus
			Alert confirmAlert = driver.switchTo().alert();			
			String text = confirmAlert.getText();
			System.out.println(text);			
			Thread.sleep(5000);
			confirmAlert.accept();
			
	}

}

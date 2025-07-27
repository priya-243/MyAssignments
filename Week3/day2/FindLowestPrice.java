package Week3.day2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Find the lowest mobile phone price from amazon using list interface
 Navigate to amazon.in 
 - Search phones in the search field 
 - Find the lowest price from the list of phones
 * 
 */
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FindLowestPrice {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		// Search for "phones"
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		  Thread.sleep(3000);
		//Collect phone prices
		  
		  List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		  int size = price.size();
		  System.out.println("size is"+size);
	
		  for(int i=0;i<price.size();i++)
		  {
			 
			String text = price.get(i).getText();

			System.out.println(text);
		  }
		  
		  List<Integer> priceList = new ArrayList<Integer>();
		  //sorting 
		  Collections.sort(priceList);
		  System.out.println("Phone prices in ascending order:");
		  
		  for(int i=0;i<priceList.size();i++)
		  {
			  System.out.println(priceList.get(i));
		  }
		  
	}

}

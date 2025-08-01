package Marathon1;

/*01) Launch Chrome  
02) Load https://www.amazon.in/
03) Type "Bags for boys" in the Search box
04) Choose the  item in the result (bags for boys)
05) Print the total number of results (like 50000) example like this----->
 1-48 of over 50,000 results for "bags for boys"
06) Select the first 2 brands in the left menu (like American Tourister, Generic)
07) Choose New Arrivals (Sort)
08) Print the first resulting bag info (name, discounted price)
09) Get the page title and close the browser  */
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1_Amazon {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.navigate().refresh();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//Type "Bags for boys" in the Search box	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bags for boys");
// Choose the  item in the result
		driver.findElement(By.xpath("//div[text()='bags for boys'][1]")).click();

//Print the total number of results example like this-----> 1-48 of over 50,000 results for "bags for boys"
		WebElement result = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']"));
		String text = result.getText();
		System.out.println("The total number of result is :" + text);

//Select the first 2 brands in the left menu (like American Tourister, Generic)	

		WebElement checkbox1 = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'Safari')]"));
		checkbox1.click();
		Thread.sleep(2000);
		
		WebElement checkbox2 = driver.findElement(By.xpath("//span[@class='a-size-base a-color-base' and contains(text(),'Skybags')]"));
		checkbox2.click();
		
//Choose New Arrivals (Sort)	
		WebElement sortbyDropdown = driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
		Select s1=new Select(sortbyDropdown);
		s1.selectByVisibleText("Newest Arrivals");
	

//Print the first resulting bag info (name, discounted price)	
		WebElement bagName = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base']"));
		System.out.println("The bag name is :"+bagName);
		String bagInfo = driver.findElement(By.xpath("//span[@class=\"a-price-whole\"][1]")).getText();
		System.out.println("The bag price is :"+bagInfo);
	
		
		
//Get the page title and close the browser	
	String title = driver.getTitle();
	System.out.println("The page title is : " +title);
	  driver.close();	 
		}

	}



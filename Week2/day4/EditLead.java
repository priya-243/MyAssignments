package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
/*  
Requirements: 
 - Enter the Username as "DemoSalesManager" and the Password as "crmsfa". 
- Click on the Login Button. - Click on the CRM/SFA Link. 
- Click on the Leads Button. - Click on Create Lead. 
- Enter the CompanyName Field Using Xpath. - Enter the FirstName Field Using Xpath.
- Enter the LastName Field Using Xpath. 
- Enter the FirstName (Local) Field Using Xpath.
- Enter the Department Field Using any Locator of Your Choice. 
- Enter the Description Field Using any Locator of your choice.
 - Enter your email in the E-mail address Field using the locator of your choice. 
 - Select State/Province as NewYork Using Visible Text. - Click on the Create Button.
  - Click on the edit button. - Clear the Description Field. - 
  Fill the Important Note Field with Any text. - Click on the update button. 
  - Get the Title of the Resulting Page.  - Close the browser window. 
*/
public class EditLead {
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();	
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("priya");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Thoddu");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("PriyaR");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("CS");
		driver.findElement(By.name("description")).sendKeys("Decription about companys");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("priyar@gmail.com");
		
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select options=new Select(state);
		options.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.name("importantNote")).sendKeys("imp note field");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.close();
	}

}

package Week2.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
/*
 Enter the username. - Enter the password. - Click the Login button. 
 - Click the "crm/sfa" link. - Click the "Leads" link. 
 - Click "Find leads." 
 - Click on the "Phone" tab. - Enter the phone number. 
 - Click the "Find leads" button. 
 - Capture the lead ID of the first resulting lead. 
 - Click the first resulting lead.
  - Click the "Delete" button. - Click "Find leads" again. 
  - Enter the captured lead ID. - Click the "Find leads" button. 
  - Verify the presence of the message "No records to display" in the Lead List. 
  This message confirms the successful deletion. - Close the browser. 
 */

public class DeleteLead {
	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("98127");
		driver.findElement(By.linkText("Find Leads")).click();
		
		// - Capture the lead ID of the first resulting lead. 
		
		WebElement firstLeadId = driver.findElement(By.xpath("//a[text()='10005']"));
	System.out.println("FirstLead is:"+firstLeadId.getText());
	firstLeadId.click();
	
	driver.findElement(By.linkText("Delete")).click();
	System.out.println("Lead deleted");
	
	
	driver.findElement(By.linkText("Find Leads")).click();
	System.out.println("Finding lead for confirmation");
	
	driver.findElement(By.linkText("Name and ID")).click();
	driver.findElement(By.className("x-form-text x-form-field")).sendKeys("10005");
	System.out.println("__________");
	driver.findElement(By.linkText("Find Leads")).click();
	
	WebElement LeadListmsg = driver.findElement(By.linkText("No records to display"));
	System.out.println(LeadListmsg.getText());
	}

}

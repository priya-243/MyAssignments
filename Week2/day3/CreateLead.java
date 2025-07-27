package Week2.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		//launch browser
		ChromeDriver driver=new ChromeDriver();
		//load url, maximize
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		//find elements using locator and sendkeys to enter text in textfield
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//login
		driver.findElement(By.className("decorativeSubmit")).click();
	    // click on CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		// click on leads link
		driver.findElement(By.linkText("Leads")).click();
		//click on createlead
		driver.findElement(By.linkText("Create Lead")).click();
		
		//enter company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//enter first and last name 
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
        
        //handle dropdown
       // step1: find elemnt
        WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
//step 2: create object for select class and pass webelemnt as arg
        
        Select options=new Select(source);
  //step 3: use the method to select      
        options.selectByIndex(3);
        
        
        WebElement Industryelement = driver.findElement(By.id("createLeadForm_industryEnumId")); 
              options.selectByIndex(2);
            //Click on the Create Lead button
				driver.findElement(By.name("submitButton")).click();
}
}

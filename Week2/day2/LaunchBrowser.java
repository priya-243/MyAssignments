package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
	public static void main(String[] args) {
		// launch browser
		ChromeDriver driver=new ChromeDriver();
		// load url
		driver.get("https://www.facebook.com/");
		//maximize the window
		driver.manage().window().maximize();
	}

}

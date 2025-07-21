package Week2.day1;

public class Browser {
	public String launchBrowser(String browserName) {
		System.out.println(browserName+" "+"Browser launched successfully");
		return browserName;
	}	
	public void loadUrl()
	{
		System.out.println("Application url loaded successfully");
	}	
	public static void main(String[] args) {
		Browser b1=new Browser();
		
	//	String browser = b1.launchBrowser("Chrome");
		//	System.out.println(browser);  
		
	 b1.launchBrowser("chrome");
		b1.loadUrl();
	
	}

}

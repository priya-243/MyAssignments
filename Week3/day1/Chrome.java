package Week3.day1;

public class Chrome extends Browser {
	public void openIncognito()
	{
		System.out.println("openIncognito mode");
	}

	public void clearCache()
	{
		System.out.println("cache are cleared");
	}
	public static void main(String[] args) {
		Chrome c1=new Chrome();
		c1.openIncognito();
		c1.clearCache();
		c1.openURL();
		c1.closeBrowser();
		c1.navigateBack();
	}
}

package Week3.day1;
import Week3.day1.Browser;

public class Edge extends Browser
{
	public void takeSnap()
	{
		System.out.println("Take snap method");
	}

	public void clearCookies()
	{
		System.out.println("Cookies are cleared");
	}
	public static void main(String[] args) {
		Edge e1=new Edge();
		e1.openURL();
		e1.closeBrowser();
		e1.navigateBack();
		e1.takeSnap();
		e1.clearCookies();
	}
}

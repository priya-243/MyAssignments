package Week3.day1;

public class LaunchEdge extends LaunchChrome{
	public  void launchBrowser() 
	{
		super.launchBrowser();
		System.out.println("Edge Browser launched");
	}
public static void main(String[] args) {
	LaunchEdge e1=new LaunchEdge();

	e1.launchBrowser();
}
	
}

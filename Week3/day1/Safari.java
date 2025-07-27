package Week3.day1;

public class Safari extends Browser{
	public void readMode()
	{
		System.out.println("ReadMode method");
	}

	public void fullScreenMode()
	{
		System.out.println("Full Screen Mode method");
	}
	public static void main(String[] args) {
		Safari s1=new Safari();
		s1.readMode();s1.fullScreenMode();
		s1.openURL();
		s1.closeBrowser();
		s1.navigateBack();
	}

}

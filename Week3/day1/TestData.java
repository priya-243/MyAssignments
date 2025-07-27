package Week3.day1;

public class TestData {
	public void enterCredentials()
	{
		System.out.println("Enter the credentials");
	}
	public void  navigateToHomePage() 
	{
		System.out.println("Navigate to home page");
	}
	public static void main(String[] args) {
		TestData t1=new TestData();
		t1.enterCredentials();
		t1.navigateToHomePage();
	}

}

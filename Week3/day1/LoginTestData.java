package Week3.day1;

public class LoginTestData extends TestData {
public void  enterUsername()
{
	System.out.println("Enter the user name");
}
public void  enterPassword() 
{
	System.out.println("Enter the password");
}
public static void main(String[] args) {
	LoginTestData l1=new LoginTestData();
	l1.enterUsername();
	l1.enterPassword();
	l1.enterCredentials();
	l1.navigateToHomePage();
}
}

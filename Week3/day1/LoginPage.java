package Week3.day1;

public class LoginPage extends BasePage{
	public void  performCommonTasks() 
	{
		super.performCommonTasks();
		System.out.println("Performing common sub task");
	}
	public static void main(String[] args) {
		LoginPage l1=new LoginPage();
		l1.performCommonTasks();
		l1.findElement();
		l1.clickElement();
		l1.enterText();
	}

}

package Week3.day1;

public class BasePage {
	public void  findElement()
	{
		System.out.println("Finding the element");
	}

	public void clickElement()
	{
		System.out.println("Clicking the element");
	}
	public void  enterText() 
	{
		System.out.println("Entering the text");
	}
	public void  performCommonTasks()
	{
		System.out.println("Performing common task");
	}
	public static void main(String[] args) {
		BasePage b1=new BasePage();
		b1.clickElement();b1.findElement();b1.performCommonTasks();b1.enterText();
	}
}

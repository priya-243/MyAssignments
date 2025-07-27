package Week3.day1;

public class CheckBoxButton extends Button{
	public void clickCheckButton()
	{
		System.out.println("Click the check button");
	}
	public static void main(String[] args) {
		CheckBoxButton c1=new CheckBoxButton();
		c1.clickCheckButton();
		c1.click();
		c1.setText("Inheritance");
		c1.submit();
	}

}

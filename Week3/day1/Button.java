package Week3.day1;

public class Button extends WebElement{
	public void submit()
	{
		System.out.println("Submitted");
	}
	public static void main(String[] args) {
		Button b1=new Button();
		b1.submit();
		b1.click();
		b1.setText("Inheritance");
	}

}

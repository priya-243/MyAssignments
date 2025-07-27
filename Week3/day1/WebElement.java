package Week3.day1;

public class WebElement {
	public void click()
	{
		System.out.println("Click the element");
	}
	public void setText(String text)
	{
		System.out.println("text is " +text);
	}
	public static void main(String[] args) {
		WebElement w1=new WebElement();
		w1.click();
		w1.setText("Inheritance");
	}

}

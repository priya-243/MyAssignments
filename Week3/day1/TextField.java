package Week3.day1;

public class TextField extends WebElement{
	public void getText()
	{
		System.out.println("Get text methos");
	}
	public static void main(String[] args) {
		TextField t1=new TextField();
		t1.getText();
		t1.click();
		t1.setText("Inheritance");
		
	}
	

}

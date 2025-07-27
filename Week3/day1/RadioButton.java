package Week3.day1;

public class RadioButton extends Button{
	public void selectRadioButton()
	{
		System.out.println("Select the radio button");
	}
	public static void main(String[] args) {
		RadioButton r1=new RadioButton();
		r1.click();
		r1.setText("Inheritance");
		r1.selectRadioButton();
		r1.submit();
	}

}

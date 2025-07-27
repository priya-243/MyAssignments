package Week2.day1;

public class Access1 {
	public void depositAmount() {
		System.out.println("Amount deposited");
	}
	private void withdrawAmount() {
		System.out.println("amount withdraw");

	}
	public static void main(String[] args) {
		Access1 a1=new Access1();
		a1.depositAmount();
		a1.withdrawAmount();
	}

}

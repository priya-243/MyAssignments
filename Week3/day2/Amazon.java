package Week3.day2;

public class Amazon extends CanaraBank  {

	@Override
	public void cashOnDelivery() {
		System.out.println("Mode of payment is Cash on delivery");
		
	}

	@Override
	public void upiPayments() {
		System.out.println("Mode of payment is upi payment");
	}

	@Override
	public void cardPayments() {
		System.out.println("Mode of payment is card payment");
		
	}

	@Override
	public void internetBanking() {
		System.out.println("Mode of payment is Internet Banking");
		
	}
	
	public void recordPaymentDetails()
	{
		super.recordPaymentDetails();
		System.out.println("Record for Amazon Payment Details");
	}
	
	public static void main(String[] args) {
		Amazon a1=new Amazon();
		a1.cardPayments();
		a1.internetBanking();
		a1.upiPayments();
		a1.cashOnDelivery();
		a1.recordPaymentDetails();
	}

}

package Week3.day1;

public class MethodOverriden extends MethodOverload{
	public void takeSnap()
	{
		System.out.println("takeSnap method");
	}
	
	public void reportStep(String msg,String status)
	{
		super.reportStep("Hello", "pass");
		System.out.println(msg+" "+status);
	}
	
	public static void main(String[] args) {
		MethodOverriden mo=new MethodOverriden();
		mo.takeSnap();
		mo.reportStep("status", "Method Overriding");
		mo.reportStep("yes", "fail", false);
		
	}

}

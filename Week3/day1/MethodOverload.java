package Week3.day1;

public class MethodOverload {
	public void reportStep(String msg,String status)
	{
		System.out.println(msg+" "+status);
	}
	public void reportStep(String msg,String status,boolean snap)
	{
		System.out.println(msg+" "+status+" "+snap);
	}
	public static void main(String[] args) {
		MethodOverload m1=new MethodOverload();
		m1.reportStep("Hello", "pass");
		m1.reportStep("World", "pass", true);
	}
}

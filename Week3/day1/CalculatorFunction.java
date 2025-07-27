package Week3.day1;

public class CalculatorFunction {

	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(float a, int b,float c)
	{
		System.out.println(a+b+c);
	}
	
	
	
	public static void main(String[] args) {
		CalculatorFunction c1=new CalculatorFunction();
		c1.add(10, 20);
		c1.add(20.23f, 50,10.20f);
		
	}
	
}

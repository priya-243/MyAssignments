package Week3.day1;

public class Audi extends Car{
	
	public void fastBreaking()
	{
		System.out.println("Fast Break");
	}
	public static void main(String[] args) {
		Audi a1=new Audi();
		a1.fastBreaking();
		a1.horn();a1.applyBreak();
	}

}

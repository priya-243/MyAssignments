package Week3.day1;

public class Car extends Vehicle
{
	public void applyBreak()
	{
		System.out.println("break");
	}
public static void main(String[] args) {
	Car c1=new Car();
	c1.applyBreak();
	c1.horn();
}
}

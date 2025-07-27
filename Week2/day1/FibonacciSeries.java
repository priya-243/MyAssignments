package Week2.day1;
// requirements
//ip 0,1
//op no of series
//variables
public class FibonacciSeries {

	public static void main(String[] args) {
	int firstNumber=0;
	int secondNumber=1;
	int thirdNumber;
	System.out.println("first number is "+firstNumber);
	System.out.println("second number is "+secondNumber);
	for(int i=1;i<=8;i++)
	{
		thirdNumber=firstNumber+secondNumber; 
		firstNumber=secondNumber;   
		secondNumber=thirdNumber;
		System.out.println(thirdNumber);
	}

	}

}

//tn=0;fn=0;sn=1, fn=1 sn=1  =tn1
//2nd -> fn=1, sn=1, tn=2  fn=1 sn=2 =tn=2



package week1.day2;
/*
- To reverse a number and check for palindrome, 
Declare two variables of int data type such as
- ‘input’ to assign the given number
- ‘output’ to store the reversed form of the input number
- Use for loop to reverse the digits of 'input'.
- Finally, compare ‘input’ with ‘output’ to print whether the given input is a palindrome or not.
 */
/* what is palindrome number 121, i/p o/p should be number
 * 12121%10= 1 remainder ,12121/10=1212 quotient
 * 1212%10=2 remainder, 1212/10=121 quotient
 * 121%10=1 rem, 12/10=1 quo
 * 1%10=1 rem, 1/10=0
 * 
*/
public class Palindrome {
	public static void main(String[] args) {
		
		int input = 12121;
		int temp=input;
		int output =0;
		int remainder;
		while(input>0)
		{
			remainder=input%10;
			output=(output*10)+remainder;
			input=input/10;
		}
		System.out.println(output);
		

	if(output == temp)   //12121==12121
	{
		System.out.println("it is a Palindrome");
	}else {
		System.out.println("it is not a palindrome");
	}

	}

}

package Week2.day2;
/*
 - Convert the given String to a character array. 
- Implement a loop to iterate through each character of the String (from end to start). 
- Find the odd index within the loop - Inside the loop, 
change the character to uppercase only if the index is odd 
- Print the characters with the expected output: cHaNgEmE

*/

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
	
String test="changeme";
char[] s1=test.toCharArray();	
for(int i=0;i<s1.length;i++)
{
	if(i%2!=0)
	{
		s1[i]=Character.toUpperCase(s1[i]);
	
    }
	System.out.println(s1[i]);

	}

}
}

package Week2.day2;

import java.util.Arrays;

/*
 Define two input strings. 
 - Check if the lengths of the two strings are equal: - If equal, continue; 
 otherwise, print "Lengths mismatch, therefore the strings are not an Anagram" and exit.
 - Convert both the strings to character arrays 
 - Sort both the character arrays
  - Check if the sorted arrays are equal 
  - If equal, print "The given strings are Anagram."
   - Otherwise, print "The given strings are not an Anagram."
*/

public class Anagram {
	public static void main(String[] args) {
		
	String text1="stops";
	String text2="stops";
		if(text1.length()==text2.length())
		{
			char[] s1=text1.toCharArray();
			char[] s2=text2.toCharArray();
			
			Arrays.sort(s1);
			Arrays.sort(s2);
			
			if(Arrays.equals(s1, s2))
        {
				System.out.println("The given strings are Anagram.");
		}
		
		else
		{
			System.out.println("The given strings are not an Anagram.");
		}
		}
		
		else
		{
			System.out.println("Lengths mismatch, therefore the strings are not an Anagram");
		}
	}

}

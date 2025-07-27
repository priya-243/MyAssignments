package Week3.day3;

import java.util.LinkedHashSet;
import java.util.Set;

/*
 * input String="google";
 * o/p[g,o,l,e]
 */
public class RemoveDuplicateChar {
	public static void main(String[] args) {
	 String companyName="google";
	 char[] input = companyName.toCharArray();
	 
	 Set<Character> unique=new LinkedHashSet<Character>();
	for(int i=0;i<input.length;i++)
	{
		unique.add(input[i]);
	}
   System.out.println(unique);
}
}

package Week2.day1;

import java.util.Arrays;
import java.util.Iterator;

public class LearnArray {
	public static void main(String[] args) {
		int scores[]= {10,20,30,40};
		
// find no of element
		int lengthOfArray = scores.length;
		System.out.println("the length of array is:"+lengthOfArray);
		
//retrive a value using index
		System.out.println(scores[1]);
		
//retrive all data
		
		for(int i=0;i<scores.length;i++)
		{
			System.out.println(scores[i]);
		}
		
	//	System.out.println(Arrays.toString(scores));
		
// highest and lowest value
		Arrays.sort(scores);
		System.out.println("Lowest values is " +scores[0]);
		//System.out.println("Highest values is " +scores[scores.length-1]);
		
		System.out.println("Highest values is " +scores[lengthOfArray-1]);
		
//array instantiation
		
		int number[]=new int[2];
		number[0]=12;
		number[1]=22;
		
		
}
}

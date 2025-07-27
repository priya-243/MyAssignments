package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* Find the second largest number from the given array 
delare an array {3, 2, 11, 4, 6, 7}. 
- Pick the 2nd element from the last and print it. 
 */

public class FindSecondLargestNumber {
	public static void main(String[] args)
	{
		Integer[] array1={3,2,11,4,6,7};
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(array1));
		Collections.sort(list1);
		System.out.println("After sorting:" +list1);
		
		Integer SecondLargestNum = list1.get(4);
		System.out.println("The second largest number is: "+ SecondLargestNum);
		
	}

}

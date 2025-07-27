package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* Find intersection of numbers using list interface
 * Assignment Requirements: 
 - Declare an array for {3, 2, 11, 4, 6, 7} 
 - Declare another array for {1, 2, 8, 4, 9, 7} 
 - Compare both the arrays - Print the values if they are equal 
 * 
 * */
public class FindIntersectionUsingList {
	public static void main(String[] args) {
Integer array1[] = {3, 2, 11, 4, 6, 7};
		
Integer array2[] =  {1, 2, 8, 4, 9, 7};
		//Declare array	
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(array1));
		System.out.println("List1 values are: "+list1);
		
		List<Integer> list2=new ArrayList<Integer>(Arrays.asList(array2));
		System.out.println("List2 values are: "+list2);
		
		 // Compare each element of array1 with array2
		 System.out.println("Intersection of both arrays:");
        for (int i = 0; i < array1.length; i++)
        {
            for (int j = 0; j < array2.length; j++)
            {
                if (array1[i] == array2[j]) 
                {
                    System.out.println(array1[i]);
                }
            }
        }
    }
}
		

package Week3.day2;
/*
Find the missing element from the list of integers 
 - Declare an array {1, 2, 3, 4, 10, 6, 8}. 
 - Do a comparison check if there is a gap in the sequence of numbers.
  - Print the numbers that are missing. 
 
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FIndMissingElementUsingList {
	public static void main(String[] args) {
		Integer [] array1=  {1,2,3,4,10,6,8};
		//Assigning array to list
		List<Integer> list1=new ArrayList<Integer>(Arrays.asList(array1));
		System.out.println("The values in List are: "+list1);
		// sorting the list
		Collections.sort(list1);
		System.out.println("The values after sort: "+list1);
		
		//to check missing number by iterating
		for(int i=0;i<list1.size()-1;i++) 
		{
			int currentNo=list1.get(i);
			int nextNo=list1.get(i+1);
			
			 for(int j=currentNo+1;j<nextNo;j++) 
			 {
    			 System.out.println("Missing numbers in list are :"+j);
    		 }
			
		}
	
}
}

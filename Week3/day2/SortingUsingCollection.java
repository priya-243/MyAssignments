package Week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Reverse the given collection of String elements 
 * Declare a String array and add the values as {HCL, Wipro, Aspire Systems, CTS}    
 Add the collection to a list  
 Iterate the values in the list 
 Print the required output as Wipro, HCL, CTS, Aspire Systems 
 * 
 * 
 */

public class SortingUsingCollection {

	public static void main(String[] args) {
		
		
		String array[]= {"HCL","Wipro","Aspire Systems","CTS"};
		List<String> list=new ArrayList<String>(Arrays.asList(array));
		Collections.sort(list);
		System.out.println("After sorting:" +list);
		
		for(int i=list.size()-1;i>=0;i--)
		{
			list.get(i);
		
System.out.println( list.get(i));
	
		}

	}

}

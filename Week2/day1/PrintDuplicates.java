package Week2.day1;

import java.util.Arrays;
/*
a) Create a class by name: FindDups (with main method) in same package 
b) Create a int[] array with duplicate data 
c) Write a logic to find the duplicate values 
d) Run and confirm the duplicate values are printed in console

*/


public class PrintDuplicates {
	public static void main(String[] args) {
		 int[] array = {2, 5, 7, 7, 5, 9, 2, 3};
	Arrays.sort(array);
			
		for(int i=0;i<array.length-1;i++)
		{
		
			if(array[i]==array[i+1])
			{
				System.out.println(array[i]);
			} 
		
		
		} 

		}


}

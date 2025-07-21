package Week2.day2;
/*
Your task is to count the occurrences of character ‘e’ in the given String input="TestLeaf".
- Create a class with a main method. 
- Initialize a variable to 0. 
- Convert the given String to a character array. 
- Use loop to iterate through each character in the array. 
- Compare each character with the target character. 
- If a match is found, increment the count. - Finally, print the count 
 */
public class CountCharacterString {
	public static void main(String[] args) {
		
		 String input="TestLeaf";
		 int count=0;
		 char[] s1=input.toCharArray();
		 for(int i=0;i<s1.length;i++)
		 {
			 if(s1[i]=='e')
			 {
				count=count+1; 
				//count++;
				
			 }
			
			
		 }
		 System.out.println("The no of occurance of e is:"+count);
	}

}

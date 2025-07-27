package Week3.day3;

public class NoOfOccuranceOfVowels {
	public static void main(String[] args) {
		
		String input="hello welcome to testleaf";
		int  count=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)=='a'||input.charAt(i)=='e'||
					input.charAt(i)=='i'||input.charAt(i)=='o'||input.charAt(i)=='u')
			{
				count++;
			
			}
		}
		System.out.println("The no of vowels in strings are " +count);
				
	}

}

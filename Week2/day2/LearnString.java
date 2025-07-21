package Week2.day2;

public class LearnString {
	public static void main(String[] args) {
		String str1 = "Testleaf"; // declare using literal
		String str3 = "Testleaf";

		String str2 = new String("Testleaf"); // declare using instantiation
		String str4 = new String("Testleaf");

// compare whether 2 strng are equal or not	
		System.out.println(str1.equals(str3));
// compare the reference address of 2 string ==		
		System.out.println(str2 == str4);

// length of string

		String batchName = "Selenium July";
		int length = batchName.length();
		System.out.println(length);
//contains		
		boolean contains = batchName.contains("Selenium");
		System.out.println(contains);

// equalignorecare -- it will not check for case senstive. it checks only
// characters are equal
		System.out.println(batchName.equalsIgnoreCase("selenium july"));

// uppercase,lowercase
		System.out.println(batchName.toUpperCase());
		String lowerCase = batchName.toLowerCase();
		System.out.println(lowerCase);

// tocharArray - convert string into character array
		String batch = "selenium";
		char[] a1 = batch.toCharArray();
		System.out.println(a1[3]);

//chatAt - retrive particular char

		char a2 = batch.charAt(2);
		System.out.println(a2);
//substring - convert string string into smaller string
	// crop string from begin index 
		String month="july2025";
		String a3 = month.substring(3);
		System.out.println(a3);
// end index excluded, begin index included	
		String a4 = month.substring(2, 5);
		System.out.println(a4);
		
//split method - convert one string into multiple string
		                 //0   1    2
		String currBatch="Sel july 2025";
		String[] split = currBatch.split(" ");
		System.out.println(split[0]);
		
		String[] split1 = currBatch.split("u");
		System.out.println(split1[0]);
		
		int amount=100;
		System.out.println(amount+20);
		
		String rupee="200";
		System.out.println(rupee+10);
//parseInt - convert string into integer		
		int parseInt = Integer.parseInt(rupee);
		System.out.println(parseInt+20);
//replace all		
		String rs="100rupees";
	String replaceall = rs.replaceAll("rupees", "");	
	System.out.println(replaceall);
		
	}

}

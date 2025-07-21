package Week2.day2;

public class ReverseString {
	public static void main(String[] args) {
		String companyName="TestLeaf";
		char[] a1 = companyName.toCharArray();
	
		for(int i=a1.length-1;i>=0;i--) 
		{
	System.out.println(a1[i]);
	}

}
}

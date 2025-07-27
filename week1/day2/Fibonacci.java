package week1.day2;

public class Fibonacci {
public static void main(String[] args) {
	int n=8;
	
	int x=0;
	int y=1;
	
	for(int i=0; i<n; i++) 
	{
		System.out.println(x);
		int z=x+y;
		x=y; 
		y=z; 
}
}
}

package Week2.day1;

public class LibraryManagement {
	
	public static void main(String[] args)
	{
		Library obj=new Library();
		String booktype = obj.addBook("Electronics book");
		System.out.println(booktype);
		obj.issueBook();
	}

}

package stackconcept;
 class Book{
	int id=0;
	String author="",bookname="";
}

public class s1 {
	public static void main(String[] args)
	{
		Book a1=new Book();
		a1.id=23;
		a1.author="richard";
		a1.bookname="Java";
		System.out.println(a1.bookname);	
	}

}

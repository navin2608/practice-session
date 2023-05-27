package stackconcept;

public class trycatch 
{
	public static void main(String[] args)
	{
		
	

	try
	{
		int a;
		a=5/0;
		System.out.print("inside try");
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
	finally
	{
		System.out.print("Bye");
		
	}
}
}

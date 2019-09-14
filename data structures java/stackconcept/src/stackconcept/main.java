package stackconcept;
class boy
{
	int s,d,t;
	public void distance(int s,int t)
	{
		d=s*t;
		System.out.println("Total distance " +d);
		
		
	}
}

public class main {
	public static void main(String[] args)
	{
		boy b=new boy();
		b.distance(6, 5);
	}

}

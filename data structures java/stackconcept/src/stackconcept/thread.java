package stackconcept;
class hi extends Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hi");
			try
			{
				Thread.sleep(1000);
				
				
			}
			catch(Exception e)
			{
				
			}
			
			
		}
	}
}
class hello extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("hello");
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				
			}
		}
	}
}

public class thread {
	public static void main(String[] args)
	{
		hi h1=new hi();
		hello h2=new hello();
		
		Thread t1=new Thread(h1);
		Thread t2=new Thread(h2);
		
		h1.start();
		h2.start();
		 
		//h1.run();
		//h2.run();
		
	}

}

import java.util.*;
import java.io.*;

public class Solution2 {

	public static void main(String[] args) {
		int n=0;
		
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		int[] arr=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for (int j=0;j<n;j++)
		{
			if (arr[j]<38)
			System.out.println(arr[j]);
			else if(arr[j]>=38)
			{	
				if ((arr[j]+1)%5==0)
						System.out.println(arr[j]+1);
				else if ((arr[j]+2)%5==0)
						System.out.println(arr[j]+2);
				else
					System.out.println(arr[j]);
					
			}
			
		}
				
	}

}

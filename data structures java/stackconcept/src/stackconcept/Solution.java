package stackconcept;

import java.util.Scanner;

public class Solution 
{

		   public static void main(String[] args)
		   {
		       Scanner sc=new Scanner(System.in);
		       int get;
		       int count1=0,count2=0;
		    		   
		       int n=sc.nextInt();
		       int ar[]=new int[n];
		       for(int i=0;i<n;i++)
		       {
		           get=sc.nextInt();
		           ar[i]=get;
		       }
		       /*for(int j=0;j<n;j++)
		       {
		    	   System.out.print(ar[j]+" ");
		       }*/
		       int max=ar[0];
		       int mini=ar[0];
		       for (int check=0;check<n-1;check++)
		       {
		    	   if (max<ar[check+1])
		    	   {	max=ar[check+1];
		    		   count1+=1;
		    	   }
		    	   if (mini>ar[check+1])
		    	   {	 mini=ar[check+1];
		    		   count2+=1;
		    	   }
		    			   
		       }System.out.println(count1+ " "+count2);
		   }

}

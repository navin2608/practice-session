package stackconcept;
import java.util.Scanner;
public class Demo1{
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
         double mark_avg;
         int result;
         int i;
         int s;
      //define size of array
       s = input.nextInt();
     //The array is defined "arr" and inserted marks into it of integer type.
      int[] arr = new int[s];   
      
	 for(i=0;i<arr.length;i++)
	  {
        	arr[i]=input.nextInt();
	  } 
	 int res;
	 int max=arr[0],j;
	 for (j=0;j<s;j++)
	 {
	   if (arr[j]>max)
	   {
	     max=arr[j];
	   }
	 }
	 for(int k=0;k<s;k++)
	 {
	   res+=arr[k];
	 }
	 mark_avg=res/s;
	 System.out.println(max);
	 System.out.println(mark_avg);
}
}
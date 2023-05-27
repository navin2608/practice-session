package stackconcept;

public class bubblesort {

	public static void main(String[] args) {
		int[] a= {8,10,6,5};int temp;
		// TODO Auto-generated method stub
		for(int i=0;i<a.length-1;i++)
		{
		for(int j=i+1;j<a.length;j++)
		{
			if (a[j]<a[i])
					{
				temp=a[j];
				a[j]=a[i];
				a[i]=a[j];
				
					}
		}
		}
for(int i=0;i<a.length;i++)
{
	System.out.println(a[i]);
}
	}

}

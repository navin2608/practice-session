package stackconcept;

import java.io.BufferedReader;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr=BufferedReader.readLine().split(" ");//take the input in string array separated by whitespaces" "
		int[] intarr=new int[arr.length];
		 
		for(int i=0;i<arr.length;i++)
		 intarr[i]=Integer.parseInt(arr[i]);
	}

}

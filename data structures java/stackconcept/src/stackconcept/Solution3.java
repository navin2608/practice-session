import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution3 {

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        int flag=0;
        char ch[]=s1.toCharArray();
        //char ch1[]=s2.toCharArray();
        for(int i=0;i<ch.length;i++)
        { String isc=String.valueOf(ch[i]);
        
        	boolean a=s2.contains(isc);
        
            if (a==true)
            		{
            flag=1;
            break;
            		}
        }
        
        if (flag==0)
        return ("NO");
        else if (flag==1)
        {
        return ("YES");
        }
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}

package stackconcept;

import java.util.*;



import java.util.*;

public class time {
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String time=sc.next();
        if (time.charAt(8)=='A')
        {String[] temp=time.split(":");
        int hour=Integer.parseInt(temp[0]);
       

        String sec=temp[2].substring(0,2);
        if (hour==12)
        {
           
        System.out.println("00"+":"+temp[1]+":"+sec);
        
        }
        
        		
        else
        System.out.println(temp[0]+":"+temp[1]+":"+sec);

        }
        else
        {
            String[] temp=time.split(":");
            int hour=Integer.parseInt(temp[0]);
            //int min=Integer.parseInt(temp[1]);
            String sec=temp[2].substring(0,2);
            
            if (hour!=12)
            hour+=12;

            System.out.println(hour+":"+temp[1]+":"+sec);
            
        }
            
        
        
        
    }
}



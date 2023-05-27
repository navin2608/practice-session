package stackconcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class collections {

	public static void main(String[] args) {
		List<Integer> values=new ArrayList<>();
		values.add(4);
		values.add(1);
		values.add(9);
		for(int i=0;i<values.size();i++)
		{	
			System.out.println(values.get(i));
		}
		Iterator it=values.iterator();
		System.out.println(it.next());
		Collections.reverseOrder();
		
		Collections.sort(values);
		for (Integer t:values)
		{
			System.out.println(t);
		};
	}

}

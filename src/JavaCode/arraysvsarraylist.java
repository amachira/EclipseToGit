package JavaCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraysvsarraylist {
public arraysvsarraylist()
{
	System.out.println("Constructor");	
	int aconstuctor = 100;
	System.out.println(aconstuctor);	
	
}

public static void Abc()
{
	System.out.println("class abc");	
	int abc = 1000;
	System.out.println(abc);	
	
}

	
	public static void main(String[] atgs)
{
		System.out.println("Main");	
		int amain = 5;
		
		arraysvsarraylist obj = new arraysvsarraylist();
		Abc();
		System.out.println(amain);	
		
		String sarr[] = {"Apple", "Computer","1", "50000"};
		Integer intarr[] = {1,2,4,5,5};
		for(int i=0;i<sarr.length;i++)
		{
			
			System.out.println(sarr[i]);
		}
		
		for(int i=0;i<intarr.length;i++)
		{
			
			System.out.println(intarr[i]);
		}
	@SuppressWarnings("rawtypes")
	List<Object> li = new ArrayList();
	li.add("Amazon");
	li.add("Bottle");
	li.add("Table");
	li.add(1);
	li.add(100);
	
	li.add(1, "Chair");
	System.out.println(li);
	
	Iterator<Object> it = li.iterator();
	while(it.hasNext())
	{		
		
		System.out.println(it.next());
	}
	String s = new String("RR");
	System.out.println(s);
    s = null;
    System.out.println(s);		
//obj.finalize();
    obj=null;
    System.gc();

    System.out.println("Main Completes");

}
 public void finalize()
	    {
	       try {
	        System.out.println("finalize method overriden");
	        System.out.println(10/0);
	       }
	        catch(ArithmeticException ae)
	        {
	        	System.out.println("Arithmatic problem");
	        }
	    }
	
		
	
}

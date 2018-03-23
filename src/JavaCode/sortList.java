package JavaCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class sortList {
	public static void main(String args[])
	{
	String[] arr = {"Apple", "Mango","Banana","Alpha","Goat","Dog"};
	List<String> li = new ArrayList<String>();

	for(String c:arr)
	{
	//System.out.println(c);
	
	
	li.add(c);
	//System.out.println(li);
	Collections.sort(li);
	
	}
	System.out.println(li);
	Iterator it = li.iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	}
		}

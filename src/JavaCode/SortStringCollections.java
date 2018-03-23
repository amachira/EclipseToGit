package JavaCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class SortStringCollections {
public static void main(String args[])
{

	String str, rev="";
	System.out.println("Enter the sentence");
	Scanner sn = new Scanner(System.in);
	str = sn.nextLine();
    char[] strarr = str.toCharArray();
	List<Character> strlist= new ArrayList<Character>();
	
	for(char c : strarr)
	{
	
 		strlist.add(c);
	}
	
	Collections.sort(strlist);
	Iterator it = strlist.iterator();
	while(it.hasNext())
	{
		System.out.print(it.next());
	}
	
}
}

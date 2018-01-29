package JavaCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class StrRevArrayList {
public static void main(String args[])
{
	System.out.println("Enter the text");
	Scanner sn = new Scanner(System.in);
	String str= sn.nextLine();
	char[] strarr = str.toCharArray();
	ArrayList<Character> revList = new ArrayList<>();
	for(char c: strarr)
	{
		revList.add(c);		
	}
 
	Collections.reverse(revList);
	System.out.println(revList);
	Iterator it =  revList.iterator();
	while(it.hasNext())
	{
		System.out.print(it.next());
		
	}
	
	
	
	
}
}

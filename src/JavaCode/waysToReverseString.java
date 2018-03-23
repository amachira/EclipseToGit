package JavaCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class waysToReverseString {
	public static void main(String args[])
	{
		System.out.println("Enter the string");
	
	Scanner sn = new Scanner(System.in);
	String str = sn.nextLine();
	System.out.println("s1" +str);
	StringBuilder sb = new StringBuilder(str);
	sb = sb.reverse();

	System.out.println("rev1 " +sb);

//	_________________________________________________
	
	 String rev = "";
for(int i =str.length()-1;i>=0;i--)
{
rev = rev+str.charAt(i);
}
	System.out.println("rev2 " +rev);
	
	
	
//	_____________________________________________________

    char[] strarr = str.toCharArray();
	ArrayList li = new ArrayList<>();
	
	Collections.reverse(li);
	for(char c:strarr)
	{
		li.add(c);
	
	}
	Collections.reverse(li);
	System.out.println(li);
	Iterator it = li.iterator();
	while(it.hasNext())
	{
		
		System.out.print("reverse 3 " +it.next());
	}
	
	}
}

package JavaCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class reverseString {
public static void main(String args[])
{
	System.out.println("Enter the string");
	Scanner sn= new Scanner(System.in);
	String str = sn.nextLine();
reverseString(str);
reverseStringList(str);
}

	

private static void reverseStringList(String str) {
	// TODO Auto-generated method stub
/*	System.out.println("Enter the String");
	Scanner sn = new Scanner(System.in);
	String str = sn.nextLine();*/
	char[] str1= str.toCharArray();
	List<Character> charstr = new ArrayList<>();
	for(char c: str1)
	
		charstr.add(c);
	Collections.reverse(charstr);
	
	Iterator it =  charstr.iterator();
	
	while(it.hasNext())
	
		System.out.print(it.next());
	
	
	
	
	
}


private static void reverseString(String str) {
	// TODO Auto-generated method stub
	
	System.out.println(str);
	char[] charstr = str.toCharArray();
	StringBuilder sb = new StringBuilder();
	sb.append(str);
	sb=sb.reverse();
	System.out.println(sb);
	
/*	for(int i =0; i<sb.length();i++)
	{
	System.out.println(sb.charAt(i));
	}
	*/
}





}

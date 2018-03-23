package JavaCode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class removeDuplicatesString {
public static void main(String args[])
{
System.out.println("Enter the string");
Scanner sn = new Scanner(System.in);
String str1 = sn.nextLine();
String str = str1.replace(" ", "");
System.out.println(str);

Set set = new HashSet<>();

char[] strarr = str.toCharArray();
for(char c: strarr)
{
	
set.add(c);

}
System.out.println(set);
Iterator it=set.iterator();
while(it.hasNext())
{
System.out.print(it.next());	
}

}
}

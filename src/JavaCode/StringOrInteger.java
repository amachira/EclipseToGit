package JavaCode;

import java.util.Scanner;

public class StringOrInteger {
public static void main(String args[])
{	
System.out.println("Enter the value");
String str = null;
Scanner sn = new Scanner(System.in);
str = sn.nextLine();
isInteger(str);
vowels(str);
}

public static boolean isInteger(String str)
{
	try {
        Integer.parseInt(str);
        System.out.println("It is an integer");
        System.out.println(str);
        return true;
    } catch (NumberFormatException nfe) {
    	
    	System.out.println("It is a String");
    	System.out.println(str);
        return false;
    }
}
	
public static void vowels(String str)
{
  char[] c = str.toCharArray();

	for(char ch:c)
	{
		if(ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u')
		{
			System.out.println("contains vowels which are "+ch);
		}
	}
}
}

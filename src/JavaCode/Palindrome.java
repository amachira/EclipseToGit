package JavaCode;

import java.util.Scanner;

public class Palindrome {
/*121
Madam
*/
public static void main(String args[])
{
System.out.println("Enter the String");
Scanner sn = new Scanner(System.in);
String str = sn.nextLine();
String revstr="";
char[] charstrarr = str.toCharArray();
for(int i=0;i<charstrarr.length;i++)
{
	revstr=charstrarr[i]+revstr;
}

if(revstr.equals(str))
{
System.out.println("Palindrome");	
}
else
{
	System.out.println("Not a Palindrome");	
	
}
}
	
}

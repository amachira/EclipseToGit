package JavaCode;

import java.util.Scanner;

public class StringReverse {
public static void main(String args[])
{
	

System.out.println("Enter the name");
Scanner sn = new Scanner(System.in);
String name = sn.nextLine();
String reverse = new StringBuffer(name).reverse().toString();
reverse.toLowerCase();
System.out.println(reverse);



}
}
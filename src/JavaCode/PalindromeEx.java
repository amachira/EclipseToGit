package JavaCode;

import java.util.Scanner;

public class PalindromeEx {
	public static void main(String args[])
	{

		String str, rev="";
		System.out.println("Enter the sentence");
		Scanner sn = new Scanner(System.in);
		str = sn.nextLine();
		int length = str.length();
		for(int i=length-1;i>=0;i--)
			rev = rev+str.charAt(i);
		if(str.equals(rev))
		{
			System.out.println(str+ " is a Palindrome");
		}
		else
		{
			System.out.println(str+ " is Not a Palindrome");
		}
	}
}

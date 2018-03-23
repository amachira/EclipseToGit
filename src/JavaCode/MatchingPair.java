package JavaCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.CharBuffer;
import java.util.Scanner;
import java.util.Stack;

public class MatchingPair {
public static void main(String args[])
{
	  Scanner sn = new Scanner(System.in);	
	  System.out.println("Enter a String");
	  char str2, str1;
	  
	str1 = sn.next().charAt(0);
	   str2 = sn.next().charAt(0);

	   balance(str1, str2);
}	
	
	
	static boolean balance(char character1, char character2)
    {
       if (character1 == '(' && character2 == ')')
       {
        System.out.println("Balanced");
               
    	   return true;
       }
       else
       {
    	   System.out.println("Not Balanced");
         return false;
       }
    }	
}


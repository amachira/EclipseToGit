package JavaCode;

import java.util.Scanner;

public class StringReverse2 {
public static void main(String args[])
{
String str = "How are you?";
StringBuilder sb = new StringBuilder();
sb.append(str);
StringBuilder rev= sb.reverse();

System.out.println(rev);

for(int i=0;i<rev.length();i++)
{
System.out.print(rev.charAt(i));	
}


}
}

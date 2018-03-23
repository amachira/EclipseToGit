package JavaCode;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "java,C, Java";
StringBuffer sf = new StringBuffer();
Set<Character> set = new HashSet<>();
for(int i=0;i<str.length();i++)
{
char c=str.charAt(i);
if(!set.contains(c))
{
set.add(c);
//System.out.println(set);

sf.append(c);

//Set s = new Set();
}
}
System.out.println(set);
System.out.println(sf.toString());
}
}
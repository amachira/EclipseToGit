package JavaCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class CountElements {
public static void main(String args[])
{
System.out.println("Enter the String");
Scanner sn = new Scanner(System.in);
String str = sn.nextLine();
System.out.println(str);
char[] charstr = str.toCharArray();
HashMap<Character,Integer> hm = new HashMap<>();

for(char c:charstr)
{
if(!hm.containsKey(c))
{
hm.put(c,1);	
}
else
{
hm.put(c,hm.get(c)+1);	
}
}
Set<Map.Entry<Character,Integer>> entryset = hm.entrySet();
for(Map.Entry<Character,Integer> entry: entryset)
{
//if(entry.getValue()>1)
{
System.out.printf("%s: %d %n",entry.getKey(),entry.getValue());
}
}

}
}
package JavaCode;

public class StringReverse {
public static void Main(String args[])
{
	

System.out.println("Enter the name");
String name = null;
String reverse = new StringBuffer(name).reverse().toString();
reverse.toLowerCase();
System.out.println(reverse);



}
}
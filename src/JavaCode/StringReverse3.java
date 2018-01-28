package JavaCode;

public class StringReverse3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str = "This is awesome";
System.out.println(str);
char[] strarr = str.toCharArray();
for(int i=strarr.length-1; i>=0;i--)
{
System.out.print(strarr[i]);	
}
	}

}

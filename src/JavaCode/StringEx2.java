package JavaCode;

public class StringEx2 {
public static void main(String args[])
{
	System.out.println(endOther("bab", "bc") );
	System.out.println(xyBalance("aaxbb"));
	
}
public static boolean endOther(String a, String b) {
	  String a1 = a.toLowerCase();
	  String b1 = b.toLowerCase();
	//System.out.println(a1.indexOf("b"));
	//System.out.println(a1.substring(0, 2));
	//char sarr[] = a.toCharArray();
	for(int i=0;i<a.length()-2;i++)
	{	
	if ((a.charAt(i) == 'b') && (a.charAt(i+2)== 'b'))
		{
	//		System.out.println("bob present");
			
			return true;
			}
		else
		{
			System.out.println("bob not present");
			
		}
		}

		if(a1.contains(b1) || b1.contains(a1))
	  {
	  return true;
	  }
	  else{
	   return false;
	  }
	 //return true;
		

	}

public static boolean xyBalance(String str) {
	
	System.out.println("_______________________________");
	if(str.startsWith("x") && str.endsWith("y"))
	{
	  return true;
	  
	}
	else if(str.contains("x") && str.contains("y"))
	{
	  return true;
	  
	}
	else 
	{
	  return false;
	}
	}

}

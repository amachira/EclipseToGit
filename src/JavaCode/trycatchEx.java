package JavaCode;

public class trycatchEx {

	public static void main(String args[])
	{
		methodA();

	
	
}
	public static void methodA() {
	try
	{
		int a = 1;
		int b = 2;
		int c = 0;
		System.out.println(a+b);
		System.out.println(a/c);
	/*	try 
		{
			int d = 1;
			int e = 2;
			System.out.println(d*e);
			//System.out.println(a/c);
		}		
		finally
		{
			System.out.println("finally");
		}*/
	}
	

	catch(NumberFormatException ne)
	{
		System.out.println("Number exception");
	}

	catch(ArithmeticException ae)
	{
		System.out.println("Arithmetic exception");
	}
	finally
	{
		System.out.println("finally1");
	}
	
	
	}
}

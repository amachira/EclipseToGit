package JavaCode;

public class finalExample {
	int c = 1000;
	static int d = 50;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 10;
		System.out.println(b);
		b =20;
		b++;
		System.out.println(b);
		
		final int a = 100;
	//	a++; //cannot be incremented or assigned again since it is declared final
		System.out.println(a);
	//	a= 20;  //error : The final local variable a cannot be assigned. It must be blank and not using a compound assignment
//		System.out.println(c);
		finalExample fobj = new finalExample();
		fobj.methodA(fobj.c);
		
		fobj.finalmethod();
		
	}

	public  void methodA(int num)
	{
		//int c = 5000;
		System.out.println(d);
		
		System.out.println(num);
	}
	
	final void finalmethod()
	{
		String finalvar = "finalvar";
		System.out.println(finalvar);
		System.out.println("final method");
		
	}
}

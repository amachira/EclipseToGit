package JavaCode;

public class overloadingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int length = 100;
int breadth = 200;
int height = 30;
area(length,breadth);
area(length,breadth,height);	
	}
	
	public static void area(int l, int b)
	{
		System.out.println(l*b);
	}

	public static void area(int l, int b, int h)
	{
		System.out.println((l*b*h));
			
	}

}

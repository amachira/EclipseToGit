package JavaCode;

public class finalChildclassExample extends finalExample{
public static void main(String [] args)
{
	
	finalExample fe = new finalExample();
	
	
	
	int num = 0;
	fe.methodA(num);
	
}
/*
void finalmethod() //final method cannnot be overriden
{
	String finalvar = "Good";
	System.out.println(finalvar);
	}
*/
void methodA() {

	int num = 30;
	System.out.println(num);
}

}

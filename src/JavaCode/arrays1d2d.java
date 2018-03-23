package JavaCode;

import java.util.Arrays;

public class arrays1d2d {
public static void main(String args[])
{
	/*	System.out.println("Enter the size of the array");
	Scanner sn = new Scanner(System.in);
	//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int n=sn.nextInt();
	System.out.println("Enter the " +n +" elements");
	
	int numarr[] = new int[n];
	int sum=0;
	for(int i =0; i<n;i++)
	{
		numarr[i]= sn.nextInt();
	}
	System.out.println("Elements in the array are");
	for(int j:numarr)
	{
		
		System.out.println(j);
	}
	*/
	int numarray[] = {3,45,324,234,2};
	for(int k : numarray)
	{
		//System.out.println(k);
			
	}
	
	int num2darray[][] = {{1,3,4,5,6},{34,12,34,45},{4,2,32,5}};
	for(int i =0;i<num2darray.length;i++)
	{
		for(int j=0;j<num2darray[i].length;j++)
		{
		//	System.out.print(" "+num2darray[1][2]);
		if(num2darray[i][j]%2 ==0)
		{
			System.out.print(" "+num2darray[i][j]);
			
		}
		
		
		}
		System.out.println("");
		
}
	//System.out.print(" "+num2darray[1][2]);
	
//	System.out.print(" "+num2darray[1][3]);
	
}
}
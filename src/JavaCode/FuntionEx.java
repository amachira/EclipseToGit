package JavaCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class FuntionEx {
	
	public static void main(String args[]) throws IOException
	{
		 Correctness();
		 
	}
	
	private static void Correctness() throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		do{
	       System.out.println("Enter a String");
		   str = br.readLine();
   	   }while(!str.matches("^[a-zA-Z]*$"));

		int n = 0;
		boolean number = false;
		do{
			 try
	         {
				 number = true;
   	    do
   	    {
   	    	System.out.println("Enter a positive integer value ");
   	   	     n = Integer.parseInt(br.readLine());
		}
   	    while(n<=0);
	         }
			 catch (Exception e)
	         {
	             System.out.println("Not a number, try again");
	         }
   	    
		}while(!number);
			
   	    StringList(str,n);
	 
	}

	private static void StringList(String str, int n) {
		
	ArrayList<Object> arr = new ArrayList<Object>();
		
		for(int i =1;i<=n; i++)
		{
			arr.add(str);
			
		}
		
		Iterator<Object> it = arr.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}
}



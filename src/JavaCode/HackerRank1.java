package JavaCode;

public class HackerRank1 {
	public static void main(String args[])
	{
	 int []arr = {1,2,3,4,5};
	    int k = 1;
	    findNumber(arr,k);
	}       
	    static String findNumber(int[] arr, int k)    
	    {
	    	String Result ="Yes";
	    	String no ="No";
	   for(int i=0;i<arr.length;i++)
	   {
	       if(arr[i]==k)
	       {
	    	   System.out.println(Result);
	    	   return Result;
	       }  
	    	   System.out.println(no);
	    	   return no;
	   }
	   return Result;
	   
	      
	   
	    }
}

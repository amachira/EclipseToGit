package JavaCode;

public class nonRepeatingElement {
public static void main(String args[])
{
	int[] arr = {1,5,2,3,5,21,1};

	for(int i=0;i<arr.length;i++)
	{
		boolean isUnique = true;
		
		//System.out.println(arr[i]);
		for(int j=0;j<arr.length;j++)
		{	
			
		
			if(i!=j && arr[i]==arr[j])
			{
				isUnique = false;
				break;
				
			}
			
			
		}
		if(!isUnique)
		{			
		// System.out.println(arr[i]);
		}
		
		if(isUnique)
		{
			
			System.out.println(arr[i]);
		}
		
	}
	
	
}
}

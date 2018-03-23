package JavaCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class duplicateString {
	public static void main(String args[])
	{
		String[] val = {"Java","C","Oracle","Java"};
		stringDuplicates(val);
		stringDuplicatesList(val);
		
	}

	private static void stringDuplicatesList(String[] val) {
		// TODO Auto-generated method stub
		List<String> li = Arrays.asList(val);
		Set duplicates = new HashSet<>(li);
		if(duplicates.size()!=li.size())
		{
			System.out.println(duplicates);
			System.out.println("duplicates");

		}
		else
		{
			System.out.println(duplicates);
			System.out.println("No duplicates");

		}
		
		
	}

	private static void stringDuplicates(String[] val) {
		// TODO Auto-generated method stub
		int cnt=1;

		// TODO Auto-generated method stub
		for (int i=0;i<val.length;i++)
		{
			for(int j=i+1;j<val.length;j++)
			{		//System.out.println(val[i]);
			if(val[i]==val[j])
			{
				
				cnt=cnt+1;
				//System.out.println("Duplicates");		
			}
			
			}
		}
		if (cnt>1)
		{
			System.out.println("Duplicates present");		
			
		}
		else
		{
			System.out.println("No Duplicates present");		

		}


	}
}

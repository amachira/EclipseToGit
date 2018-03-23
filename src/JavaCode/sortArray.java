package JavaCode;

import java.util.Arrays;

public class sortArray {
public static void main(String args[])
{
	System.out.println("Enter the word to be sorted");
	String words[] = {"Peru","Apple","Chikoo", "Banana", "Orange", "Mango"};
	System.out.println("Original List ");
	
	for(int i =0; i<words.length;i++)
	{
		System.out.println(words[i]);
		
	}
	Arrays.sort(words);
	System.out.println("");
	
	System.out.println("Sorted List ");
	
	for(int i =0; i<words.length;i++)
	{
		System.out.println(words[i]);
		
	}
	
}
}

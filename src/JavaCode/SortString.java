package JavaCode;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Sentence to sort");
		Scanner sn = new Scanner(System.in);
		
		String str = sn.nextLine();
		char[] strarr = str.toCharArray();
		Arrays.sort(strarr);
				
		System.out.println(strarr);
				
	}

}

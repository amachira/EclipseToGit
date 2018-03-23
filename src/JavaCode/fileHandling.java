package JavaCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class fileHandling {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		File f = new File("D:\\file.txt");
		Scanner s = new Scanner(f);
		//String number = s.nextLine();
		while (s.hasNextLine())
		{
		String word = "";
		word = s.next();
	
			if((word.matches("[$0-9]+")))
			{
				System.out.println("Number: "+word);
			}
			if((word.matches("[A-Za-z]+")))
			{
				System.out.println("Alphabets: "+word);
			}
		}
	}

}

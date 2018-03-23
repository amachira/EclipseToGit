package JavaCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class searchElement {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
File f = new File("D://file.txt");
Scanner sn = new Scanner(f);
Scanner sn1 = new Scanner(System.in);

System.out.println("Enter the word you want to search");
String search=sn1.nextLine();
String word = "";
List<String> li = new ArrayList<String>();
while(sn.hasNextLine())
{

	word = sn.next();
//	System.out.print(word);
	li.add(word);
}
//System.out.println(li);
if(li.contains(search))
{
	
	System.out.println("Word Present");
}
else
{
	System.out.println("Word not Present");
	
}
	

}
	
}

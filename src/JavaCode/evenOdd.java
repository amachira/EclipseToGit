package JavaCode;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class evenOdd {
public static void main(String args[]) throws FileNotFoundException
{
	  
 
  System.out.println(addition(2,5));
}

private static int addition(int i, int j) {
	
int num3=i*j;
int num4=num3/j;
int num5=num4+j;
int num6=num5*j;
return num5;
}


}

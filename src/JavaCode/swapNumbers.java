package JavaCode;

import java.util.Collections;

public class swapNumbers {
public static void main(String args[])
{
int num1 = 21;
int num2 = 45;
System.out.println(+num1 +" , " +num2);
int swap = 0;

// code with a variable
/*
swap=num1;
num1=num2;
num2=swap;
System.out.println(+num1 +" , " +num2);
*/

//swapping without variable
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
System.out.println(+num1 +" , " +num2);


}
}

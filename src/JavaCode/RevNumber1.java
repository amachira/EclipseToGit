package JavaCode;

public class RevNumber1 {
public static void main(String args[])
{

int num = 12343412;
int rev = 0;

while(num!=0)
{
rev =  rev*10+ num%10;
num = num/10;
}
System.out.println(rev);

}

}
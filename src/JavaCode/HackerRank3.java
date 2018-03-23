package JavaCode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class HackerRank3 {
	public static void main(String[] args) throws IOException{
        
        File fileName = new File("D:\\numbers1.txt");
     //   BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        Scanner in = new Scanner(fileName); 
     /*   while(in.hasNextLine())

        	{
        		System.out.println(in.next());	
        	}*/
        int[] res;
        int _l;
        _l = Integer.parseInt(in.nextLine().trim());
        int _r;
        _r = Integer.parseInt(in.nextLine().trim());
        res = oddNumbers(_l, _r);
        for(int res_i=0; res_i < res.length; res_i++) {
        	System.out.println(String.valueOf(res[res_i]));
       //     bw.write(String.valueOf(res[res_i]));
         //   bw.newLine();
       }
        
       // bw.close();
    }

	private static int[] oddNumbers(int _l, int _r) {
		// TODO Auto-generated method stub
	
		int size=(_r-_l)+1;
		int[] res = new int[size];
		int n1=0;
		for(int i=_l;i<=_r;i++)
		{
     		if(i%2 == 1 || i%2 ==-1)
			{
     			
     			res[n1]= i;
     			n1++;
 			}
     		else
     		{
     			res[n1]= ' ';
     		}
		}
		
		return res;
	}
}



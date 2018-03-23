package JavaCode;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HackerRank2 {
	public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
      //  final String fileName = System.getenv("D:\\numbers.txt");
       // BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        
        String res;
        
        
    //    _arr_size = Integer.parseInt(in.nextLine().trim());
      
        int[] _arr= {1,3,2,5,4,7,8};
        int _arr_size = _arr.length;
        int _arr_item = 0;
        for(int _arr_i = 0; _arr_i < _arr_size; _arr_i++) {
        //    _arr_item = Integer.parseInt(in.nextLine().trim());
         // _arr[_arr_i] = _arr_item;
        //  System.out.println(_arr[_arr_i] );
        }
        
        int _k;
      //  _k = Integer.parseInt(in.nextLine().trim());
        _k= 8;
        
        res = findNumber(_arr, _k);
        System.out.println(res);
        //bw.write(res);
        //bw.newLine();
        
      //  bw.close();
    }
	
	static String findNumber(int[] _arr, int _k)
    {		
	    	//String res = "";
	   String res = null;
	for(int i=0;i<_arr.length;i++)
	   {
//		   System.out.println(_arr[i]);   	
	       if(_arr[i] == _k)
	       {
	    	   res= "Yes";
	    	   break;
	       }  
	       else
	       {
	    	   res= "No";
	       }
	   }
	return res;	      
}

}

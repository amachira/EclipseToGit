package JavaCode;

import java.util.HashMap;
import java.util.Map;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "aaacodebbb";
		//countCode(s);
		System.out.println("values is--->"+countCode("aaacodebbb"));
		System.out.println("values is--->"+countCode("codexxcode"));
		System.out.println("values is--->"+countCode("cozexxcope"));
	}
	
	
	public static int countCode(String str) {
		  
		  
		 
		int x=countCodeString(str);

		return x; 
		    
		}

		public static int countCodeString(String s){  
		int count=0;
		  
		  for(int i=0;i<s.length()-3;i++){
		  //how to verify a to z here in the position of d of code?? put || condition 26 times for each letter
			  //of alphabet
		  if(s.substring(i,i+4).equals("code")||s.substring(i,i+4).equals("cope")||
				  s.substring(i,i+4).equals("coze")){
		  count=count+1;
		  continue;
		  }
		  else
		  count=count;
		  continue;
		  
		  }
		  return count;
		  }
	

	
/*	public static void countCode(String str) {
		
		
       if((str.contains("code")) ||(str.contains("cope")) || (str.contains("coee")))
       {	
    	
    	   String[] wordsArray = str.split("xx");
   		
        HashMap<String, Integer> map = new HashMap<>();
        //8
        for (String word : wordsArray) {
        //
            if (map.containsKey(word)) {
            	
               int count = map.get(word);
                map.put(word, count + 1);
            } else {
                map.put(word, 1);
            }
        }
        //10
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
	}
       }
	}*/
}

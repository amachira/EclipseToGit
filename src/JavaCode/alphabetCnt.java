package JavaCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class alphabetCnt {
	public static void main(String args[]) throws IOException
	{
	System.out.println("Enter a string");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	String str1 = br.readLine();
	StringBuffer sb = new StringBuffer();
	String str2 = "How are you";
	sb.append(str2);
	//System.out.println(sb);
	
	//System.out.println(str1);
	HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
	String s = str2.replace(" ","");

	char[] strarr= s.toCharArray();
		
	
		for(char c:strarr)
		{
						
			if(hm.containsKey(c))
			{
				hm.put(c,hm.get(c)+1);	
				
			}
			else
			{
				
				hm.put(c,1);
			}
		
		}
		
	
	System.out.println(hm);
	Iterator it = hm.entrySet().iterator();
	while (it.hasNext()) {
		Map.Entry pairs = (Map.Entry) it.next();
		System.out.println(pairs.getKey() + " = " + pairs.getValue());
	}
	
	//// Converting HashMap keys into ArrayList
	List<Character> keyList = new ArrayList<Character>(hm.keySet());
	System.out.println("\n==> Size of Key list: " + keyList.size());

	for (Character temp : keyList) {
		System.out.println(temp);
	}

	// Converting HashMap Values into ArrayList
	List<Integer> valueList = new ArrayList<Integer>(hm.values());
	System.out.println("\n==> Size of Value list: " + valueList.size());
	for (Integer temp : valueList) {
		System.out.println(temp);
	}
	}
	
	}
	


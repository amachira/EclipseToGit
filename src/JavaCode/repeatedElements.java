package JavaCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class repeatedElements {
public static void main(String args[])
{
int arr[] = {1,2,1,3,4,553,3,43,43,43,2};

Map<Integer,Integer> hm = new HashMap<Integer,Integer>();
//List<Integer> li = new ArrayList<Integer>();



for(int i=0;i<arr.length;i++)
{
	
//System.out.println(arr[i]);	
if((hm.containsKey(arr[i])))
	{
		hm.put(arr[i],hm.get(arr[i])+1);
	}
else
	{
		hm.put(arr[i],1);
	}
	
}
//System.out.println(hm.entrySet());

Iterator it = hm.entrySet().iterator();
System.out.println("Repeated Emelemts are ");
while(it.hasNext())
{
Map.Entry<Integer, Integer> pairs = (Map.Entry)it.next();
//System.out.println(pairs.getKey() + " " + pairs.getValue());

if(pairs.getValue()>1)
{
	
System.out.println(+pairs.getKey());
}

}


}

}

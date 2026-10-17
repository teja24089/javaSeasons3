package map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo4 {

public static void main( String[]args) {
	
	
	HashMap<String, String>hmap=new HashMap<String, String>();	
	
	hmap.put("manager", "vani");
	
	hmap.put("director", "mani");
	
	hmap.put("C.E.O", "teja");
	
	hmap.put("Engineer", "rani");
	
	System.out.println(hmap.size());
	
	System.out.println(hmap);
	
	Set<Entry<String, String>>entries=hmap.entrySet();
	
	for(Entry<String, String>entry:entries)
	
	{
	
	System.out.println(entry.getKey()+"is"+entry.getValue());
	
	
	
	
	}	
	
}	
	
}

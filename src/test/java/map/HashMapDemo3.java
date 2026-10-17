package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo3 {

	public static void main(String[] args) {

		
		Map<String,String> hmap=new HashMap<String, String>();
		
		
		System.out.println(hmap.size());
		
		hmap.put("manager", "teja");
		
		hmap.put("engineer", "mani");
		
		hmap.put("developer", "vani");
		
		hmap.put("team leader", "TEJA");
		
		System.out.println(hmap);

		Set<Entry<String,String>>entries=hmap.entrySet();
		
		for(Entry<String,String>entry:entries)
		
		{
		
		System.out.println(entry.getKey()+"is"+entry.getValue());
		
		
		
		
		
		
		
		
		
		}	
		
	}

}

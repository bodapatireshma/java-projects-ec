package org.projects;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Collections_Type_Map {

	public static void main(String[] args) {
		
		Map<Integer,Object> m = new HashMap<Integer,Object>();
		
//Map-------------------HashMap
		
//Put()---add elements into a map
		
		m.put(1, "A");
		m.put(2, "Java");
		m.put(3, "Hello");
		m.put(1, "B");
		m.put(4, "Java");
		m.put(null, null);
		m.put(6, "C");
		m.put(5, null);
	System.out.println(m);
	
//Size()---to return the size of map
	
		int size = m.size();
	System.out.println(size);
	
//Get()---to get the value based on the key
	
		Object obj = m.get(2);
	System.out.println(obj);
	
//Keyset()---to return key values
	
		Set<Integer> l = m.keySet();
	System.out.println(l);
	
//values()---to get the values from map
	
		Collection<Object> values = m.values();
	System.out.println(values);
		
//containskey()---checks the key is present or not
	
		boolean ck = m.containsKey(2);
	System.out.println(ck);
	
//containsvalue()---checks the value is present or not
	
		boolean cv = m.containsValue(null);
	System.out.println(cv);
	
//entryset()---to return key and value pair into single entry
	
		Set<Entry<Integer, Object>> entrySet = m.entrySet();
	System.out.println(entrySet);
		}
}
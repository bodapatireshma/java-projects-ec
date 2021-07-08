package org.projects;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeated_Words {
	public static void main(String[] args) {
		
		//String s = "Welcome god god god here here where";
		String s = "Welcome god god here here where god here to java ok to ok";
		
		
		//split the value
		String[] split = s.split(" ");
		//String[] split = s.split("");          //to get letters count
		
		//key and value
		Map<String, Integer> m = new HashMap<>();
		System.out.println(m);                //empty bcoz dint give any values
		
		for (String str : split) {
			
			if(m.containsKey(str)) {
				Integer i = m.get(str);
				m.put(str, i+1);
			
			}else {
				m.put(str, 1);		
			}System.out.println(m);           //delete to get words count
			
		}System.out.println(m);
		
		//Set<Entry<String, Integer>> entrySet = m.entrySet();       //give commands to get words count in list
		//for (Entry<String, Integer> entry : entrySet) {
			//if (entry.getValue()>0) {
				//System.out.println(entry);		
			}}
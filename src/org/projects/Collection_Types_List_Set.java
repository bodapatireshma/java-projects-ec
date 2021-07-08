package org.projects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection_Types_List_Set{
	
	public static void main(String[] args) {

//List---------------------ArrayList
		
		//List<Integer>li = new ArrayList<Integer>();
//add()---adding value to the list
		//li.add(56);   
		//li.add(25);
		//li.add(56);
		//li.add(26);
		//li.add(228);
		//li.add(25);
						
		List<Object>li = new ArrayList<Object>();    //Object can add all types of data types
		
		li.add(56);
		li.add("String");
		li.add(56);
		li.add(26);
		li.add('A');
		li.add(15.6);
	System.out.println(li);
	
//size()---to return size of the list
		int size = li.size();
	System.out.println(size);  	
	
//get()---to return a given value from the given index	
		Object get = li.get(1);
	System.out.println(get);
	
//set()---to update the value	
		Object set = li.set(2,"java");
	System.out.println(li);
	
//remove()---removes particular value from the list	
		Object remove = li.remove(3);
	System.out.println(li);
	
//indexof()---to return a index value of the particular value	
		int indexOf = li.indexOf('A');
	System.out.println(indexOf);
		
//contain()---checks the given value exists or not
		boolean contains = li.contains("java");
	System.out.println(contains);
	
//clear()---clears the list values
		//li.clear();
	//System.out.println(li);
	
//addAll()---combines the two lists	
	List<Object> li1 = new ArrayList<Object>();
		li1.add(25);
		li1.add("World");
		li1.add(56);
		li1.add(15.6);
		//li.addAll(li1);
	//System.out.println(li);
	
//retainAll()---returns common values from two lists	
	 	//li1.retainAll(li);
	 //System.out.println(li1);
	 
//removeAll()---removes all the common values from the list
	 	li1.removeAll(li);
	 System.out.println(li1);
	   
//sort()---sort the values in asc or des order
	 List<Integer> li2 = new ArrayList<Integer>();
	 	li2.add(56);
	 	li2.add(62);
	 	li2.add(51);
	 	li2.add(21);
	 	li2.add(87);
	 Collections.sort(li2);	                                 //ascending
	 System.out.println(li2);
	 Collections.sort(li2, Collections.reverseOrder());      //descending
	 System.out.println(li2);
	
//isEmpty()---checks the list whether it is empty or not
	 	boolean empty = li2.isEmpty();
	 System.out.println(empty);
	 
//equals()---compares two list either equal or not
	 	boolean equals = li2.equals(li);
	System.out.println(equals);
		boolean equals2 = li2.equals(li2);
	System.out.println(equals2);
	
	
	
//Set----------------------------------HashSet	
	
	Set<Object>set1 = new HashSet<Object>();
	
	set1.add(25);
	set1.add(23);
	set1.add(65);
	set1.add(85);
	set1.add(25);
	set1.add(null);
	set1.add("A");
	
	System.out.println(set1);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		}
}

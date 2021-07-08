package org.projects;

public class String_Types_Immutable {
	
	public static void main(String[] args) {
		
	String s = "Java world";
	String s1 = "Java world";
	
	System.out.println(System.identityHashCode(s));
	System.out.println(System.identityHashCode(s1));
	
	s=s+s1;           //---concordination    (if int is given then arithmatic operation works)
	
	System.out.println(s);
	System.out.println(System.identityHashCode(s));
	
	
	}
}

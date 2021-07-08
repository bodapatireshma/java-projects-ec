package org.projects;

public class String_Types_Mutable {
	
	public static void main(String[] args) {
	
		StringBuffer s = new StringBuffer("Java world");
		StringBuffer s1 = new StringBuffer("Java world");
		
		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
	
	s.append(s1);
	System.out.println(s);
	System.out.println(System.identityHashCode(s));
	
	
	}

}

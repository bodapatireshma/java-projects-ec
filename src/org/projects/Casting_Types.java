package org.projects;

public class Casting_Types {
	
	public static void main(String[] args) {
		
		short s = 25;
		long l = s;
		
	System.out.println(l);	             //narrowing
		
		byte b = (byte)l;
	
	System.out.println(b);	            //widening
		
	}

}

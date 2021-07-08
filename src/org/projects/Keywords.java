package org.projects;

public class Keywords {

//Static---no need to create an object
	
//	static int a=10;         //static variable
//	private static void add() {
//		System.out.println("I am static method");
	
//	}static {
//		System.out.println("static block");    //static block
		
//	}public static void main(String[] args) {
//		System.out.println(a);
//		add();
	
//Final---
	
	final int a=10;                           //final variable
	
	public void add() {
		//a=20;                                //class variable(copile error shows)
	int a=20;                                //local variable	
		System.out.println(a);

	}public static void main(String[] args) {
		Keywords key = new Keywords();
		System.out.println(key.a);
			key.add();
			
	}
	
	
	
	
	}
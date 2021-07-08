package org.projects;

public class Demo {               //Preethi_Constructor 

//	public Demo() {     //default constructor
//		System.out.println("constructor");
//		
//	}public Demo(int id) {     //parameterized constructor
//			System.out.println("constructor :" +id);
//	
//	}public Demo(String name) {     //parameterized constructor
//		System.out.println("constructor :" +name);
//	
//	}
//	public static void main(String[] args) {
//		Demo d = new Demo();
//		Demo d1 = new Demo(45);
//		Demo d2 = new Demo("test");
//	}
	
	
	
//constructor chaining
	
	public Demo() {     //default constructor
		System.out.println("constructor");
		
	}public Demo(int id) {     //parameterized constructor
		this();
		System.out.println("constructor :" +id);
	
	}public Demo(String name) {     //parameterized constructor
		this(2);
		System.out.println("constructor :" +name);
	
	}public Demo(String name,char initial) {     //parameterized constructor
		this("abi");
		System.out.println("constructor :" + name + initial);
	}
	public static void main(String[] args) {
		Demo d = new Demo("TEST A",'A');
	}
}
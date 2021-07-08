package org.projects;

public class Constructor_Type_Add {
		
		int c,d;

	public Constructor_Type_Add() {                              //default constructor
		System.out.println("Constructor...");
	
	}public Constructor_Type_Add(int a,int b) {                      //parameterized constructor
		System.out.println(a+" "+b);
		c=a;
		d=b;
		
	}public void add(){
		System.out.println(c+d);
	
	}public static void main(String[] args) {
		Constructor_Type_Add ct = new Constructor_Type_Add();
		Constructor_Type_Add ct1 = new Constructor_Type_Add(25, 35);
		ct1.add();
		//System.out.println(ct.add());
	}
}

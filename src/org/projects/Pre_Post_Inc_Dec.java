package org.projects;

public class Pre_Post_Inc_Dec {
	
	public static void main(String[] args) {
		
	int a=5;
	int b=4;
	
	System.out.println(a++);   //5
	
	System.out.println(++a);  //7
	
	System.out.println(++a + a++)  ;  //8+8
	
	System.out.println(b--);      //4
	
	System.out.println(--b);  //2
	
	System.out.println(a++ + b--);    //9+2

	System.out.println(a); //10
	}
}

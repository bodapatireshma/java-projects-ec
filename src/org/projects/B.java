package org.projects;
//child
public class B extends A {
	
	public void sub() {
		System.out.println("Subtract...");
	}
	public static void main(String[] args) {
		A obj = new B();                         //upcasting
		//B obj1 = new A();                     //downcasting which is not possible
		A obj2 = new A();           //parent obj is created in child class-bcoz it is public in parent
		B obj3 = new B();           //it can be done even without extends keyword
		
		obj.add();
		obj2.add();
		obj.add();
		obj3.sub();
		
		
		
	}
}

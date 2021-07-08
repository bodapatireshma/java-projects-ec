package org.projects;

public final class Keywords_Final {                      //final class-cant do inheritance
	
	final int a=10;                                     //final variable-cant change value
	
	public final void add() {                          //final method-cant override
		
		System.out.println(a);
		
	}public static void main(String[] args) {
		
		Keywords_Final key = new Keywords_Final();
		
		System.out.println(key.a);
	}

}

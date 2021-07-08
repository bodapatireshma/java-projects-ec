package org.projects;

public class C_Override extends B_Override{
	
	@Override
	public void alphaA() {
		super.alphaA();
		
	}@Override
	public void alphaB() {
		super.alphaB();
		
	}@Override
	public void alphaC() {
		super.alphaC();
		
	}public static void main(String[] args) {
		C_Override c = new C_Override();
		c.alphaA();
		c.alphaB();
		c.alphaC();
	}

}

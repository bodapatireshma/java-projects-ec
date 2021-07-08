package org.projects;

public class Girl implements Boy {
	
	@Override
	public void boyname() {
		System.out.println("Boy name is Raj");
		
	}@Override
	public void girlname() {
		System.out.println("Girl name is Rose");
		
	}public static void main(String[] args) {
		Girl g = new Girl();
		g.boyname();
		g.girlname();
		
		
	}
}

package org.projects;

public class Demo_Girl implements Demo_Boy {

	@Override
	public void boyName() {
		System.out.println("test a");
	}

	@Override
	public void girlName() {
		System.out.println("test B");
	}
	public static void main(String[] args) {
		Demo_Girl g = new Demo_Girl();
		g.boyName();
		g.girlName();
	}
}

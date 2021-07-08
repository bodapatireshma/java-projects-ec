package org.projects;
//child
public class Keywords_This_Super extends Keywords_Super{

	int a = 20001;
	
	public void value() {
		System.out.println(super.a);
		System.out.println(this.a);
	}
	public void add() {
		super.sub();
		this.value();
	}
	public static void main(String[] args) {
		Keywords_This_Super ts = new Keywords_This_Super();
		//ts.value();
		ts.add();
	}
}

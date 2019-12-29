package com.YVCodes.FullJavaTuts;

public class HiJava {
	

	public HiJava() {
		super();
		System.out.println("In Constructor");
	}
	void nonStaticFn() {
		System.out.println("This is a Non Static Method");
		
	}
	public static void staticFn() {
		System.out.println("I'm a static Method");
		
	}
	public static void main(String[] args) {

		System.out.println("Hi Java, this is YV");
		staticFn();
		HiJava hijavaObj=new HiJava();
		hijavaObj.nonStaticFn();

	}

}

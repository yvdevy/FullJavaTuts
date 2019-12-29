package com.YVCodes.FullJavaTuts;

public class JavaStrings {

	public static void main(String[] args) {
		StringBuffer sbuf1=new StringBuffer("This is string Buffer value");
		System.out.println(sbuf1);
		sbuf1.append("|| I'm added");
		System.out.println(sbuf1);
		sbuf1.insert(sbuf1.length(), "|| I'm inserted");
		System.out.println(sbuf1);
		
		StringBuilder sbud1= new StringBuilder("This is String Builed Value");
		System.out.println(sbud1);
		

	}

}

package com.YVCodes.FullJavaTuts;

import java.util.Scanner;

public class JavaExceptions {
	public static float dividedByZeroUserException(int a,int n) throws Exception
	{
		if(n==0)
			throw new Exception("Faced Divided by zero exception ");
		else
			return a/n;
	}

	public static void main(String[] args) throws Exception, CustomeException {
		try {
			System.out.println(29/0);
		}
		catch(Exception exception)
		{
			System.out.println("Arithmetic Exception occured  "+exception);
		}
		finally
		{
			System.out.println("In Finally block");
		}
		//dividedByZeroUserException(29, 0);
		
		//Scanner input=new Scanner(System.in);
		System.out.println("Enter age");
		int age=10;//input.nextInt();
		//input.close();

		if(age<18)
			throw new CustomeException();
		
	}

}

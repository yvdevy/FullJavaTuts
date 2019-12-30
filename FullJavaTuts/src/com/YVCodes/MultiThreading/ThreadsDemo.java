package com.YVCodes.MultiThreading;

//class Printer2{
	//just a simple class with a non static method
//	void printDoc() {
//		for(int i=0;i<10;i++)
//			System.out.println("2nd Printer Printing document #"+i);
//	}
//}

class Printer2 extends Thread{
	//extending Thread class
	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("2nd Printer Printing document #"+i);
	}
}

class Printer3 extends Printer2 implements Runnable{
	//extending Thread class
	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("3rd Printer Printing document #"+i);
	}
}

class Printer4 implements Runnable{
	//extending Thread class
	@Override
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("4th Printer Printing document #"+i);
	}
}

public class ThreadsDemo {

	public static void main(String[] args) {
		//main method represents main thread
		System.out.println("---Application Started---");

		//Printer2 p2=new Printer2(); //child thread
		//p2.start();
		
		Runnable r=new Printer3(); 
		Thread th=new Thread(r);
		th.setDaemon(true); //daemon runs along with main thread
		th.start();
		 
		new Thread(new Printer4()).start(); //creating child thread of Printer4
		
		for(int doc=0;doc<10;doc++)
			System.out.println("1st  Printer Printing document #"+doc);
		
		
		System.out.println("---Application Ended---");

	}

}

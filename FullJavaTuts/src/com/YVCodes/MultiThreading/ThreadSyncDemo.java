package com.YVCodes.MultiThreading;

class Printer{
	//synchronized void printDocs(int noOfCopies, String docName)
	void printDocs(int noOfCopies, String docName)
	{
		for(int i=0; i<noOfCopies;i++)
		{
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println("Printing "+docName+" "+i+"th copy");
		}
	}
}

class Thread1 extends Thread{
	
	Printer pref;

	public Thread1(Printer pref) {
		super();
		this.pref = pref;
	}

	@Override
	public void run()
	{
		synchronized (pref) {
			//synchronized block
			pref.printDocs(10, "@@ 1st Threads Docs");
		
		}
		
	}
}

class Thread2 extends Thread{
	
	Printer pref;

	public Thread2(Printer pref) {
		super();
		this.pref = pref;
	}

	@Override
	public void run()
	{
		pref.printDocs(10, "## 2nd Thread's Docs");
	}
}

class Thread3 extends Thread{
	
	Printer pref;

	public Thread3(Printer pref) {
		super();
		this.pref = pref;
	}

	@Override
	public void run()
	{
		pref.printDocs(10, "$$ 3rd Thread's Docs");
	}
}

public class ThreadSyncDemo {

	public static void main(String[] args) {
		
		System.out.println("===main thread Started===");
		
		Printer p=new Printer();
		//p.printDocs(10, "Yvs Doc");
		
		Thread1 t1=new Thread1(p);//thread1 have reference of printer object

		Thread2 t2=new Thread2(p);//thread2 also have reference of printer object
		
		Thread3 t3=new Thread3(p);//thread2 also have reference of printer object
		
		t1.start();
		
//		try {
//			t1.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		t2.start();
		
//		try {
//			t2.join();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		t3.start();
		
		//t1, t2multiple threads are using same printer object
		
		System.out.println("===main thread finished===");
		
	}

}

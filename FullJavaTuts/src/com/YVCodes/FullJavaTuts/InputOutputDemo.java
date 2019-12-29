package com.YVCodes.FullJavaTuts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InputOutputDemo {
	public void writeToFile(File file1) throws FileNotFoundException
	{
		PrintWriter file1writer=null;
		try {
			file1writer=new PrintWriter(file1);
			file1writer.println("Writting from code");
			System.out.println("Written to file");
		}
		catch(FileNotFoundException fe)
		{
			System.out.println("File Not Found in disk"+file1.getName());
		}
		finally {
			file1writer.close();
		}
		
	}
	public void readFromFile(File file1) throws FileNotFoundException {
		Scanner inputfile=new Scanner(file1);
		while(inputfile.hasNext())
			System.out.println(inputfile.nextLine());
		
	}
	public static void main(String[] args) throws FileNotFoundException  {
		File file1=new File("file1.txt");
		InputOutputDemo iodemo=new InputOutputDemo();
		iodemo.writeToFile(file1);
		iodemo.readFromFile(file1);
	}

}

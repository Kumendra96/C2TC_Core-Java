package Condition.java;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderr 
{
	public static void main(String[] args)
	{
		char [] array = new char[100];
		
		try
		{
			//create file reader
			FileReader file = new FileReader("input.txt");
			
			//create a bufferreader
			BufferedReader input = new BufferedReader(file);
			input.read(array);
			System.out.println("Data in the file: ");
			System.out.println(array);
			input.close();
		}
		catch (Exception e)
		{
			e.getStackTrace();
		}
//		System.out.println("");
	}
}
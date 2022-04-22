package com.thread;

public class ThreadDemo2 implements Runnable
{
	public static void main(String[] args) 
	{
		Thread t = new Thread(new ThreadDemo2());
		t.start();
		System.out.println(t.getName());
//		t.run();
	}
	public void run()
	{
		System.out.println("Kumendra");
	}
}
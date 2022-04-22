package com.thread;

public class ThreadDemo1 extends Thread
{
	public void run()
	{
		System.out.println("My First Thread");
	}
	public static void main(String[] args) 
	{
		ThreadDemo1 th = new ThreadDemo1();
		th.start();
	}
}

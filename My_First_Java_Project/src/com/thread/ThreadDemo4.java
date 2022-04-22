package com.thread;

import java.applet.Applet;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class ThreadDemo4 extends Applet
{
	TextField t1,t2;
	public ThreadDemo4()
	{
		setLayout(new FlowLayout());
		add(t1 = new TextField(15));
		add(t2 = new TextField(15));
		addFocusListener(new FocusListener() 
		{
			@Override
			public void focusLost(FocusEvent e) 
			{
				t2.setText("Hello Java");
			}
			@Override
			public void focusGained(FocusEvent e) 
			{
				t1.setText("Hello World");
			}
		});
		setSize(40,400);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ThreadDemo4();
	}
}
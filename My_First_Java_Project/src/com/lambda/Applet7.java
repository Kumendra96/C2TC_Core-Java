package com.lambda;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class Applet7 extends Applet
{
	Button btn1,btn2;
	TextField tf;
	
	public void init()
	{
		add(btn1=new Button("Click me as a btn"));
		add(tf=new TextField(25));
		add(btn2=new Button("Remove this things"));
		btn1.addFocusListener(new FocusListener() 
		{
			public void focusGained(FocusEvent e)
			{
				tf.setText("Hello World");
			}
			public void focusLost(FocusEvent e) 
			{
				tf.setText("  ");
			}
		});
	}
}
package com.lambda;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowListener;

public class Window extends Frame
{
	Button btn1,btn2;
	TextField tf;
	public Window()
	{
		add(btn1 = new Button("Click"));
		add(tf = new TextField(15));
		add(btn2 = new Button("Clear"));
		btn1.addActionListener((e) ->tf.setText("Hello World"));
		btn2.addActionListener((e) ->tf.setText(" "));
		addWindowListener((WindowListener) this);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new Window();
	}
}
package com.Interface;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import applet.com.Apple;

public class AppletActionListenerPart3 extends Apple implements ActionListener 
{
	Button b1,b2;
	TextField tf;
	
	public void init()
	{
		add (b1=new Button("Print"));
		add(tf = new TextField(15));
		
		add(b2 = new Button ("Remove"));
		
//		register component buttons with listener
		b1.addActionListener(this);
		B  b =new B(this);
		b2.addActionListener(b);
	}
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Hello, My Name is  Kumendra.");
	}
class  B implements ActionListener
{
	AppletActionListenerPart3 ai;
	B(AppletActionListenerPart3 ai)
	{
		this.ai= ai;
	}
	public void actionPerformed(ActionEvent args0)
	{
		ai.tf.setText("");
	}
}
}

package com.Interface;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Applet2Part1 extends Applet implements ActionListener
{
	Button b1,b2;
	TextField tf;
	
	public void init()
	{
		add(b1 = new Button("Click Me"));
		add(tf = new TextField(15));
		add(b2 = new Button("Remove"));
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		Object o=e.getSource();
		if(o.equals(b1))
			tf.setText("Good Morning everyone");
		if(o.equals(b2))
			tf.setText(" ");
	}
}
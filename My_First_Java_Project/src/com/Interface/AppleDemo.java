package com.Interface;

import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppleDemo extends Applet implements ActionListener
{
	Button b1,b2;
	public void init()
	{
		add(b1=new Button("Button 1"));
		b1.addActionListener(this);
		add(b2=new Button("Button 2"));
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() ==b1)
			System.out.println("Button 1 was pressed");
		else
			System.out.println("Button 2 was pressed");
	}
}
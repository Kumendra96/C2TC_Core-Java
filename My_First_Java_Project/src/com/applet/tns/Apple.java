package com.applet.tns;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;

public class Apple extends Applet
{
	Button b;
	TextField t;
	public void init()
	{
		b=new Button("Submit");
		add(b);
		t=new TextField(10);
		add(t);
	}
}

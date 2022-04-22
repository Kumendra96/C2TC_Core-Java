package com.lambda;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GuiApp2 extends Frame
{
	Button btn1,btn2;
	TextField t;
	public GuiApp2()
	{
		add(btn1=new Button("Click"));
		add(t=new TextField(15));
		add(btn2=new Button("Clear"));
		btn1.addActionListener((e) ->t.setText("Hello Friends..."));
		btn2.addActionListener((e) ->t.setText(""));
		addWindowListener(new WindowAdapter()		
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(400,500);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new GuiApp2();
	}
}
//13
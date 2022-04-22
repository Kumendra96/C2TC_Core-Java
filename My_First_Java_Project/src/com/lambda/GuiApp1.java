package com.lambda;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class GuiApp1 extends Frame
{
	Button btn1,btn2;
	TextField tf;
	public GuiApp1()
	{
		add(btn1 = new Button("Click"));
		add(tf = new TextField(15));
		add(btn2 = new Button("Clear"));
		btn1.addActionListener((e) ->tf.setText("Hello World"));
		btn2.addActionListener((e) ->tf.setText(" "));
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
		setSize(400,500);
//		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new GuiApp1();
	}
}
//14
package com.Revision;

import java.applet.*;
import java.awt.Graphics;

public class AppletDemo extends Applet
{
	String str;
	public void init()
	{
		str=getParameter("pname");
		if(str == null)
			str = "Welcome to java programming";
			str = "Hello "+str;
	}
	public void paint(Graphics g)
	{
		g.drawString(str, 200, 200);
	}	
}
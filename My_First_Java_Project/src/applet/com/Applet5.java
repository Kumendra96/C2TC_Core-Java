package applet.com;

import java.applet.Applet;
import java.awt.Graphics;

public class Applet5 extends Applet
{
	int height ,width;
	public void init()
	{
		height = getSize().height;
		width = getSize().width;
		setName("Applet");
	}
	public void paint(Graphics g)
	{
		g.drawRoundRect(10, 30, 120, 120, 2, 3);
	}
}

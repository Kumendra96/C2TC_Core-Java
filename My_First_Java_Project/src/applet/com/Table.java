package applet.com;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Table  extends Applet
{
	public void  paint(Graphics g)
	{
		Font f= new Font("Times New Roman",Font.BOLD,17);
		g.setFont(f);
		int x=20,y=20;
		for(int i=1;i<=10;i++)
		{
			for(int j=1;j<=5;j++)
			{
				int k=i*j;
				g.drawString(k+"", x, y);
				x=x+30;
			}
			x=20;
			y=y+30;
		}
	}
}
package applet.com;
import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
public class Apple extends Applet
{
	Button b1;
	TextField t1;
	public void init()
	{
		b1=new Button("Submit");
		add(b1);
		t1=new TextField(10);
		add(t1);
	}
}
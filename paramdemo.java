import java.io.*;
import java.applet.*;
import java.awt.*;
public class paramdemo extends Applet
{
	String msg;
	public void init()
	{
		setBackground(Color.pink);
		setForeground(Color.blue);
		msg=getParameter("str1");
	}
	public void paint(Graphics g)
	{
		g.drawString("welcome "+msg,500,500);
	}
}
/*<applet code="paramdemo.class" width=800 height=800>
  <param name="str1" value="KALYANI">
</applet>*/
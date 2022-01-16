import java.applet.*;
import java.awt.*;
public class appletdemo extends Applet
{
	public void paint(Graphics g)   //paint is method & Graphics g : is object of paint method
	{
		g.drawString("hello",100,120); //drawString is method of Graphics g
	}
}
/*<applet code="appletdemo.class" width=300 height=300>
</applet>*/
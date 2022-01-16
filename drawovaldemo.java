import java.applet.*;
import java.awt.*;
public class drawovaldemo extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawOval(150,250,300,150);
		g.setColor(Color.green);
		g.fillOval(150,50,300,150);
		g.setColor(Color.orange);
		g.drawOval(600,450,200,200);
		g.setColor(Color.pink);
		g.fillOval(600,50,200,200);
	}
}
/*<applet code="drawlinedemo.class" width=800 height=800>
</applet>*/
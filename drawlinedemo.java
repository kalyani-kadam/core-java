import java.applet.*;
import java.awt.*;
public class drawlinedemo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawLine( 100,150,500,700);
		g.drawLine( 500,150,150,550);
	}
}
/*<applet code="drawlinedemo.class" width=800 height=800>
</applet>*/
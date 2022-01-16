import java.applet.*;
import java.awt.*;
public class drawrectdemo extends Applet
{
	public void paint(Graphics g)
	{
		g.setColor(Color.red);
		g.drawRect( 100,150,150,100);
		g.setColor(Color.blue);
		g.fillRect( 100,350,150,100);
		g.setColor(Color.red);
		g.fillRect(400,300,150,100);
	}
}
/*<applet code="drawrectdemo.class" width=800 height=800>
</applet>*/

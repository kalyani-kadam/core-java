import java.applet.*;
import java.awt.*;
public class drawlarcdemo extends Applet
{
	public void paint(Graphics g)
	{
		g.drawArc(100,180,200,180,0,180);
		g.fillArc(300,180,200,180,0,180);
	}
}
/*<applet code="drawlarcdemo.class" width=500 height=500>
</applet>*/

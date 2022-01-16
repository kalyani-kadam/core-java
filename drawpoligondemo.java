import java.applet.*;
import java.awt.*;
public class drawpoligondemo extends Applet
{
	public void paint(Graphics g)
	{
		int xpoints[]={120,200,150,200,120,120};
		int ypoints[]={130,180,250,230,330,150};
		int npoints=5;
		g.drawPolygon(xpoints,ypoints,npoints);
	}
}
/*<applet code="drawpoligondemo.class" width=800 height=800>
</applet>*/
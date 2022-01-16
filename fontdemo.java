import java.applet.*;
import java.awt.*;
public class fontdemo extends Applet
{
	public void init()
	{
		Font f1=new Font("hello",Font.BOLD|Font.ITALIC,25);          //SYNTAX FOR FONT =>(FONT_NAME,FOONT_STYLE,FONT SIZE);
		setFont(f1);
	}
	public void paint(Graphics g)
	{
		g.drawString("kallu",150,150);
	}
}
/*<applet code="fontdemo.class" width=800 height=800>
</applet>*/
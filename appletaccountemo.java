
import java.applet.*;
import java.awt.*;
public class appletaccountemo extends Applet
{
	String account_number;
	int balance;
	public void init()
	{
		account_number=getParameter("accno");
		balance=Integer.parseInt(getParameter("bal"));
	}
	public void paint(Graphics g)
	{
		if(balance < 500)
		{
			g.drawString(account_number+" has low balance",200,150);
		}
		else
		{
			g.drawString(account_number+" has sufficient balance",200,150);
		}
	}
}
/*<applet code="appletaccountemo.class" width=800 height=800>
  <param name="accno" value="4567898965">
  <param  name="bal" value="200">
</applet>*/
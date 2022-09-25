//write a java program to display Textfield on frame
import java.awt.*;
class TextfieldDEMO extends Frame
{
	TextfieldDEMO()
	{
		FlowLayout f=new FlowLayout();
		setLayout(f);
		setBackground(Color.pink);
		setForeground(Color.blue);
		Label l1=new Label("Enter username:",Label.LEFT);
		Label l2=new Label("Enter password:",Label.RIGHT);
		TextField tf1=new TextField(29);
		TextField tf2=new TextField(29);
		Button b1=new Button("Login");
		//tf2.setEchoChar("*");
		add(l1);
		add(tf1);
		add(l2);
		add(tf2);
		add(b1);
	}
	public static void main(String args[])
	{
		TextfieldDEMO tfd=new TextfieldDEMO();
		tfd.setVisible(true);
		tfd.setSize(300,300);
		tfd.setTitle("TEXTFIELD DEMO");
	}
}
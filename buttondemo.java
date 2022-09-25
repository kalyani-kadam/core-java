//write a java program to display button on frame
import java.awt.*;
class buttondemo extends Frame
{
	buttondemo()
	{
		FlowLayout f=new FlowLayout();
		setLayout(f);
		setBackground(Color.pink);
		setForeground(Color.blue);
		Button l1=new Button("KADAM");
		Button l2=new Button("KALYANI");
		Button l3=new Button("MAHADEV");
		add(l1);
		add(l2);
		add(l3);
	}
	public static void main(String args[])
	{
		buttondemo l4=new buttondemo();
		l4.setVisible(true);
		l4.setSize(200,300);
		l4.setTitle("BUTTON DEMO");
		
	}
}
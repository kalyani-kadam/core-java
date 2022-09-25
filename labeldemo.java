//write a java program to display label on frame
import java.awt.*;
class labeldemo extends Frame
{
	labeldemo()
	{
		FlowLayout f=new FlowLayout();
		setLayout(f);
		setBackground(Color.pink);
		setForeground(Color.blue);
		Label l1=new Label("KADAM");
		Label l2=new Label("KALYANI");
		Label l3=new Label("MAHADEV");
		add(l1);
		add(l2);
		add(l3);
	}
	public static void main(String args[])
	{
		labeldemo l4=new labeldemo();
		l4.setVisible(true);
		l4.setSize(200,300);
		l4.setTitle("NAME");
		
	}
}
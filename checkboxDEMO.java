//write a java program to display  checkbox on frame
import java.awt.*;
class checkboxDEMO extends Frame
{
	checkboxDEMO()
	{
		FlowLayout f=new FlowLayout();
		setLayout(f);
		setBackground(Color.pink);
		setForeground(Color.blue);
		Checkbox c1=new Checkbox("India",true);
		Checkbox c2=new Checkbox("America");
		Checkbox c3=new Checkbox("Japan");
		Checkbox c4=new Checkbox("UK");
		add(c1);
		add(c2);
		add(c3);
		add(c4);
	}
	public static void main(String args[])
	{
		checkboxDEMO cbd=new checkboxDEMO();
		cbd.setVisible(true);
		cbd.setSize(300,300);
		cbd.setTitle("CHECKBOX DEMO");
	}
}
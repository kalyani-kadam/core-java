//write a java program to display Textfield on frame
import java.awt.*;
import java.awt.event.*;
class loginformDEMO extends Frame implements ActionListener
{
	Label l1,l,l2,l3;
	TextField tf1 , tf2;
	loginformDEMO()
	{
		FlowLayout f=new FlowLayout();
		setLayout(null);
		setBackground(Color.pink);
		setForeground(Color.blue);
		Font f1=new Font("Times new Roman",Font.BOLD|Font.ITALIC,20);
		
		l=new Label("KADAM SOFTWARE PVT LTD",Label.CENTER);
		l.setFont(f1);
		l1=new Label("Enter username:",Label.LEFT);
		l2=new Label("Enter password:",Label.RIGHT);
		l3=new Label("                  ");
		tf1=new TextField(29);
		tf2=new TextField(29);
		Button b1=new Button("Login");
		
		tf2.setEchoChar('*');
		l.setBounds(260,100,350,100);
		l1.setBounds(200,200,150,30);
		tf1.setBounds(400,200,190,30);
		l2.setBounds(200,250,150,30);
		tf2.setBounds(400,250,190,30);
		b1.setBounds(350,330,100,40);
		l3.setBounds(500,330,200,40);
		
		b1.addActionListener(this);
		
		add(l);
		add(l1);add(tf1);
		add(l2);add(tf2);
		add(b1);add(l3);
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		String un=tf1.getText();
		String psw=tf2.getText();
		if(un.equals("kadam") && psw.equals("kadam"))
		{
			l3.setText("Login successfully");
		}
		else
		{
			l3.setText("Login failed");
		}
		
	}
	public static void main(String args[])
	{
		loginformDEMO tfd=new loginformDEMO();
		tfd.setVisible(true);
		tfd.setSize(300,300);
		tfd.setTitle("TEXTFIELD DEMO");
	}
}
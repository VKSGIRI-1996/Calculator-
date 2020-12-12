import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<Applet code="apv8.class" width=400 height=400>
</Applet>*/
public class apv8 extends Applet implements ActionListener
{
	String str="";
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	Button b1,b2,b3,b4;
	public void init()
	{
		l1 = new Label("Enter First Number");
		l1.setBounds(10,10,125,20);
		tf1= new TextField();
		tf1.setBounds(145,10,45,20);
		l2=new Label("Enter Second Number");
		l2.setBounds(10,40,125,20);
		tf2=new TextField();
		tf2.setBounds(145,40,45,20);

		b1= new Button("Add");
		b1.setBounds(10,70,30,20);
		b2= new Button("Sub");
		b2.setBounds(50,70,30,20);
		b3=new Button("Mul");
		b3.setBounds(90,70,30,20);
		b4=new Button("Div");
		b4.setBounds(130,70,30,20);
		l3=new Label();
		l3.setBounds(10,100,55,20);
		add(l1);
		add(b3);
		add(l2);
		add(b4);
		add(tf1);

		add(tf2);

		add(b1);
		add(b2);

		add(l3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		setLayout(null);

	}
	public void actionPerformed(ActionEvent e)
	{
		int a,b,c;
		if(e.getSource()==b1)
		{

		a=Integer.parseInt(tf1.getText());
		b=Integer.parseInt(tf2.getText());
		c=a+b;
		l3.setText("sum is "+c);
		}
		if(e.getSource()==b2)
		{

		a=Integer.parseInt(tf1.getText());
		b=Integer.parseInt(tf2.getText());
		c=a-b;
		l3.setText("Sub is "+c);
		}
		if(e.getSource()==b3)
		{
		a=Integer.parseInt(tf1.getText());
		b=Integer.parseInt(tf2.getText());
		c=a*b;
		l3.setText("Mul is "+c);
		}
		if(e.getSource()==b4)
		{
		double a=Double.parseDouble(tf1.getText());
		double b=Double.parseDouble(tf2.getText());
		double c=a/b;
		l3.setText("Div is "+c);
		}
	}

	public void paint(Graphics g)
	{
		//g.drawString(str,50,50);
	}
}

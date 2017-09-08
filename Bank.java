import java.awt.*;
import javax.swing.*;
class Bank{
	Frame f;
	JLabel jl;
	ImageIcon img1;
	Label l1,l2,l3;
	int i;
	JProgressBar jpb;
	Bank()
	{
		f=new Frame("Axis Bank");
		Color c=new Color(100,200,150);
		f.setBackground(Color.black);
		f.setLayout(null);
		img1=new ImageIcon("d.jpg");
		jl=new JLabel();
		jl.setBounds(570,100,100,50);
		jl.setIcon(img1);
		f.add(jl);
		l1=new Label("Loading...");
		l1.setForeground(Color.white);
		Font f1=new Font("Times New Roman",Font.PLAIN,40);
		l1.setFont(f1);
		l1.setBounds(550,230,200,50);
		f.add(l1);
		l2=new Label("JAIPUR");
		l2.setForeground(Color.white);
		Font f2=new Font("Times New Roman",Font.BOLD,60);
		l2.setFont(f2);
		l2.setBounds(10,630,220,70);
		f.add(l2);
		l3=new Label("AXIS");
		l3.setForeground(Color.white);
		Font f3=new Font("Times New Roman",Font.BOLD,60);
		l3.setFont(f3);
		l3.setBounds(1220,630,200,70);
		f.add(l3);
		f.setSize(1370,700);
		jpb=new JProgressBar(1,96);
		jpb.setBounds(150,170,1040,40);
		f.add(jpb);
		f.setVisible(true);
		for(i=1;i<=96;i=i+5)
		{
			jpb.setValue(i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				
			}
			if(i==96)
			{
				Bank2 a=new Bank2();
			}
		}
	}
	public static void main(String z[]){
		Bank a=new Bank();
	}
}
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;
import java.util.regex.*;
class Balance extends JPanel implements ActionListener{
	Label l1,l2;
	TextField t1,t2;
	Button br1,br2;
		Statement st;
	Connection con;
	ResultSet rs2,rs3,rs4,rs5,rs6,rs7,rs8,rs9,rs10,rs11,rs12,rs13,rs14,rs15,rs16,rs17,rs18,rs19,rs20,rs21,rrs1;
	int i,row,j,m,a14,a18,flag,bal;
	String cq;
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
			st=con.createStatement();
			JOptionPane.showMessageDialog(null,"Connected","AXIS",0);
		}
		catch(Exception e)
		{
			JOptionPane.showMessageDialog(null,"Not Connected"+e,"AXIS",0);
		}
		
	}
	Balance()
	{
		setLayout(null);
		Color c1=new Color(192,192,192);
		setBackground(c1);
		br1=new Button("SUBMIT");
		Font f=new Font("Times New Roman",Font.PLAIN,15);
		br1.setFont(f);
		 Color c2=new Color(36, 113, 163);
		br1.setBackground(c2);
		br1.setForeground(Color.white);
		br1.setBounds(90,300,100,50);
		add(br1);
		br2=new Button("CANCEL");
		br2.setBackground(c2);
		br2.setFont(f);
		br2.setForeground(Color.white);
		br2.setBounds(200,300,100,50);
		add(br2);
		l1=new Label("LOGIN ID");
		Font f1=new Font("Times New Roman",Font.BOLD,30);
		l1.setFont(f1);
		l1.setForeground(Color.black);
		l1.setBounds(70,50,200,100);
		add(l1);
		
		t2=new TextField();
		t2.setBounds(330,70,300,50);
		add(t2);
		
		br1.addActionListener(this);
		br2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
				if(ob==br1)
			{
				try
				{
					 cq=t2.getText();
					 
					 rs4=st.executeQuery("select count(account_no) from account_details;");
					 rs4.next();
					 row = rs4.getInt("count(account_no)");
					//System.out.println(row);
					 rs2=st.executeQuery("select account_no from account_details;");
					int a1[]=new int[row];	
						 for(i=0;i<row;i++)
						 {
							   if(rs2.next())
						{
							 a1[i]=rs2.getInt("account_no");
							  System.out.println(a1[i]);
						 }
					 }
					  if(Pattern.matches("\\d*",cq))
				{
					 for(i=0;i<row;i++)
					 {
						  
						 if(a1[i]==Integer.parseInt(cq))
						 {
							System.out.println(a1[i]);
							flag=0;
							rs5=st.executeQuery("select balance from account_details where account_no="+cq+";");
							 if(rs5.next())
							 {
								 bal=rs5.getInt("balance");
								
							 }
							 
							
							t2.setText("");
							JOptionPane.showMessageDialog(null,bal,"AXIS",0);
							   break;
						 }
						
					 }
					if(flag!=0)
					{
						JOptionPane.showMessageDialog(null,"enter correct username","AXIS",0);
					}
					
				}
				else
				{
					JOptionPane.showMessageDialog(null,"enter correct username format","AXIS",0);
				}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
	}
}
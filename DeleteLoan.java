import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;
import static java.lang.Math.pow;
import java.util.regex.*;
class DeleteLoan extends JPanel implements ActionListener{
	Label lr1,lr2,lr3,lr4,lr5,lr6,lr7,lr8,lr9,lr10,lr11;
	TextField tr1,tr2,tr3,tr4,tr5,tr6,tr7,tr8,tr9,tr10;
	Button br1,br2,br3;
	Statement st;
	Connection con;
	ResultSet rs2,rs3,rs4,rs1,rs5,rs6;
	int row,i,j,flag=1;
	String bu,cq;
	
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bank","root","");
			st=con.createStatement();
			JOptionPane.showMessageDialog(null,"Connected","AXIS",0);
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,"Not Connected"+e,"AXIS",0);
		}
		
	}
	DeleteLoan()
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
		
		lr1=new Label("LOGIN ID");
		Font f1=new Font("Times New Roman",Font.BOLD,30);
		lr1.setFont(f1);
		lr1.setForeground(Color.black);
		lr1.setBounds(70,50,200,100);
		add(lr1);
		lr2=new Label("PASSWORD");
		Font f2=new Font("Times New Roman",Font.BOLD,30);
		lr2.setFont(f2);
		lr2.setForeground(Color.black);
		lr2.setBounds(70,150,200,100);
		add(lr2);
		tr1=new TextField();
		tr1.setBounds(300,70,300,50);
		add(tr1);
		tr2=new TextField();
		tr2.setBounds(300,170,300,50);
		add(tr2);
		br1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		
			if(ob==br1)
			{
				try{
				 cq=tr1.getText();
					 bu=tr2.getText();
					 rs4=st.executeQuery("select count(acc_no) from loan;");
					 rs4.next();
					 row = rs4.getInt("count(acc_no)");
					 System.out.println(row);
					 rs2=st.executeQuery("select acc_no from loan;");
					int a1[]=new int[row];	
						 for(i=0;i<row;i++)
						 {
							   if(rs2.next())
						{
							 a1[i]=rs2.getInt("acc_no");
							  System.out.println(a1[i]);
						 }
					 }
					
					  rs3=st.executeQuery("select password from loan;");
					  String a2[]=new String[row]; 
					   for(i=0;i<row;i++)
						 {
							   if(rs3.next())
						 {
							 a2[i]=rs3.getString("password");
							  System.out.println(a2[i]);
						 }
					 }
				
				if(Pattern.matches("\\d*",cq))
				{
					 for(i=0,j=0;i<row;i++,j++)
					 {
						 if(a1[i]==Integer.parseInt(cq) && a2[j].compareTo(bu)==0)
						 {
							 flag=0;
							 st.executeUpdate("delete from loan where acc_no="+cq+";");
							 JOptionPane.showMessageDialog(null,"DELETED","AXIS",0);
							 tr1.setText("");
							  tr2.setText("");
							   break;
						 }
					 }
					 if(flag==1)
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
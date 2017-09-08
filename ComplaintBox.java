import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;
import java.util.regex.*;  
class ComplaintBox extends JPanel implements ActionListener,ItemListener{
	Button br1,br2;
	Label lr1,lr2,lr3,lr4,lr5,lr6,lr7;
	TextField tr1,tr2,tr3,tr4,tr5;
	Statement st;
	Connection con;
	ResultSet rs2,rs3,rs4,rs1;
	int flag=1,row,i,j;
	Choice ch;
	String bu,name,email,category,remarks,cq;
	TextArea ta;
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
	ComplaintBox()
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
		tr2.setBounds(300,180,300,50);
		add(tr2);
		br1.addActionListener(this);
		
	}
	public void complain()
	{
		setLayout(null);
		setVisible(true);
		remove(br1);
		remove(lr1);
		remove(lr2);
		remove(tr1);
		remove(tr2);
		Color c=new Color(192,192,192);
		 setBackground(c);
		 lr3=new Label("Account No");
		 lr3.setBounds(10,20,110,30);
		 Font f3=new Font("Times New Roman",Font.PLAIN,20);
		 lr3.setFont(f3);
		 add(lr3);
		 tr3=new TextField();
		 tr3.setBounds(150,25,180,20);
		 add(tr3);
		  lr4=new Label("Name");
		   Font f4=new Font("Times New Roman",Font.PLAIN,20);
		 lr4.setFont(f4);
		 lr4.setBounds(10,80,110,30);
		 add(lr4);
		  tr4=new TextField();
		 tr4.setBounds(150,85,180,20);
		 add(tr4);
		  lr5=new Label("Email");
		   Font f5=new Font("Times New Roman",Font.PLAIN,20);
		 lr5.setFont(f5);
		 lr5.setBounds(10,140,110,30);
		 add(lr5);
		  tr5=new TextField();
		 tr5.setBounds(150,145,180,20);
		 add(tr5);
		 lr6=new Label("Category");
		   Font f6=new Font("Times New Roman",Font.PLAIN,20);
		 lr6.setFont(f6);
		 lr6.setBounds(10,200,110,30);
		 add(lr6);
		  ch=new Choice();
		  ch.add("Deposit Accounts");
		  ch.add("Loan Related");
		  ch.add("Net Banking Problems");
		  ch.add("Failure to meet");
   	      ch.add("others");
		  ch.setBounds(150,205,200,100);
		  add(ch);
		  lr7=new Label("Remarks");
		   Font f8=new Font("Times New Roman",Font.PLAIN,20);
		 lr7.setFont(f8);
		 lr7.setBounds(10,270,110,30);
		 add(lr7);
		  ta=new TextArea(10,10);
		  ta.setBounds(150,275,200,80);
		  add(ta);
		  br2=new Button("SUBMIT");
		 Color c2=new Color(36, 113, 163);
		br2.setBackground(c2);
		  Font f9=new Font("Times New Roman",Font.PLAIN,20);
		 br2.setFont(f9);
		   br2.setForeground(Color.white);
		  br2.setBounds(550,150,110,40);
		  add(br2);
		 br2.addActionListener(this);
		 ch.addItemListener(this);
	}
	public void actionPerformed(ActionEvent ae)
		{
			Object ob=ae.getSource();
			if(ob==br1)
			{
				try
				{
					 cq=tr1.getText();
					 bu=tr2.getText();
					 rs4=st.executeQuery("select count(account_no) from account_details;");
					 rs4.next();
					 row = rs4.getInt("count(account_no)");
					 System.out.println(row);
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
					  rs3=st.executeQuery("select password from account_details;");
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
							 complain();
							 tr3.setText(""+cq);
							 tr3.setEnabled(false);
							 rs1=st.executeQuery("select full_name,email from account_details where account_no="+cq+";");
							 if(rs1.next())
							 {
								 name=rs1.getString("full_name");
								 email=rs1.getString("email");
							 }
							 tr4.setText(name);
							 tr5.setText(email);
							 tr4.setEnabled(false);
							 tr5.setEnabled(false);
							 break;
						 }
						 
					 }
					 if(flag==1)
					 {
						 JOptionPane.showMessageDialog(null,"ENTER CORRECT USERNAME AND PASSWORD","AXIS BANK",1);
					 }
				}
				else
				{
					JOptionPane.showMessageDialog(null,"ENTER CORRECT USERNAME FORMAT","AXIS BANK",1);
				}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			if(ob==br2)
			{
				try
				{
					remarks=ta.getText();
					
					System.out.println(remarks);
					st.execute("insert into complaints(remarks,account_no,category) values('"+remarks+"',"+cq+",'"+category+"');");
					 JOptionPane.showMessageDialog(null,"WE WILL SOON BE WORKING ON YOUR PROBLEMS","AXIS BANK",1);
					 ta.setText("");
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
		}
		public void itemStateChanged(ItemEvent ie)
		{
			Object ob=ie.getSource();
			if(ob==ch)
			{
				category=ch.getSelectedItem();
			}	
		}
	
	
}
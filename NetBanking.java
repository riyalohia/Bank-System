import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;
import java.util.regex.*;  
class NetBanking extends JPanel implements ActionListener,ItemListener{
	CheckboxGroup cbg=new CheckboxGroup();
	Checkbox cb1,cb2,cb3,cb4;
	Label jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10;
	TextField ta1,ta2,ta3,ta6,ta4,ta5;
	Statement st;
	Connection con;
	ResultSet rs4,rs2,rs3,rs1,rs,rs5,rs6,rs7,rs8,rs9,rs10,rs11;
	Button br1,br2,br3,br4,br5;
	int row,i,j,flag=1,account,amount,bal,ba,cw,flaga=1,ab,balance;
	int a1[];
	Choice ch;
	JScrollPane sp,sp1;
	String bu,name,bank,nameq,cq;
	JTable tb,tb1;
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
	NetBanking()
	{
		setLayout(null);
		Color c1=new Color(192,192,192);
		setBackground(c1);
		jl1=new Label("Net Banking");
		jl1.setForeground(Color.black);
		Font f1=new Font("Calibri",Font.BOLD,30);
		jl1.setFont(f1);
		jl1.setBounds(10,10,200,40);
		add(jl1);
		cb1=new Checkbox("Transfer Money",cbg,false);
		Font f3=new Font("Times New Roman",Font.PLAIN,30);
		cb1.setFont(f3);
		cb1.setForeground(Color.black);
		cb1.setBounds(10,70,300,50);
		add(cb1);
		cb2=new Checkbox("Transaction Details",cbg,false);
		Font f2=new Font("Times New Roman",Font.PLAIN,30);
		cb2.setFont(f2);
		cb2.setForeground(Color.black);
		cb2.setBounds(390,70,300,50);
		add(cb2);
				
		cb1.addItemListener(this);
		cb2.addItemListener(this);
		
		
	}
	public void transfer()
	{
		try
		{
			 int co=Integer.parseInt(ta1.getText());
			rs1=st.executeQuery("select full_name from account_details where account_no="+co+";");
			if(rs1.next())
			{
				name=rs1.getString("full_name");
				System.out.println(name);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		setLayout(null);
		setVisible(true);
		remove(ta1);
		remove(ta2);
		remove(jl1);
		remove(jl2);
		remove(jl3);
		remove(br1);
		remove(br2);
		remove(cb1);
		remove(cb2);
		 Color c=new Color(192,192,192);
		 setBackground(c);
		 jl4=new Label("WELCOME  "+name);
		 Font f5=new Font("Lucida Sans",Font.ITALIC,30);
		 jl4.setFont(f5);
		 jl4.setBounds(10,10,900,40);
		 add(jl4);
		 jl5=new Label("User ID");
		 Font f6=new Font("Times New Roman",Font.PLAIN,20);
		 jl5.setFont(f6);
		 jl5.setBounds(10,80,100,40);
		 add(jl5);
		ta3=new TextField();
		ta3.setBounds(150,90,140,20);
		add(ta3);
		 jl6=new Label("Account No");
		 Font f7=new Font("Times New Roman",Font.PLAIN,20);
		 jl6.setFont(f7);
		 jl6.setBounds(10,130,120,40);
		 add(jl6);
		ta4=new TextField();
		ta4.setBounds(150,140,140,20);
		add(ta4);
		 jl7=new Label("Amount");
		 Font f8=new Font("Times New Roman",Font.PLAIN,20);
		 jl7.setFont(f8);
		 jl7.setBounds(10,190,120,40);
		 add(jl7);
		ta5=new TextField();
		ta5.setBounds(150,200,140,20);
		add(ta5);
		jl8=new Label("Select Bank");
		 Font f9=new Font("Times New Roman",Font.PLAIN,20);
		 jl8.setFont(f9);
		 jl8.setBounds(10,250,120,40);
		 add(jl8);
		ch=new Choice();
		ch.add("Reserve Bank of India");
		ch.add("Axis Bank");
		ch.add("ICICI Bank");
		ch.add("State Bank of India");
		ch.add("HDFC Bank");
		ch.add("Yes Bank");
		ch.setBounds(150,260,200,300);
		add(ch);
		br5=new Button("OK");
		Color c4=new Color(36, 113, 163);
		br5.setBackground(c4);
		br5.setForeground(Color.white);
		br5.setBounds(20,320,90,30);
		add(br5);
		br5.addActionListener(this);
		ch.addItemListener(this);
		
	}
	public void details()
	{
		try
		{
			 int co=Integer.parseInt(ta1.getText());
			rs7=st.executeQuery("select full_name from account_details where account_no="+co+";");
			if(rs7.next())
			{
				nameq=rs7.getString("full_name");
				System.out.println(nameq);
			}
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		setLayout(null);
		setVisible(true);
		remove(ta1);
		remove(ta2);
		remove(jl1);
		remove(jl2);
		remove(jl3);
		remove(br3);
		remove(br4);
		remove(cb1);
		remove(cb2);
		 Color c1=new Color(192,192,192);
		 setBackground(c1);
		 jl9=new Label("WELCOME  "+nameq);
		 Font f10=new Font("Lucida Sans",Font.ITALIC,30);
		 jl9.setFont(f10);
		 jl9.setBounds(10,10,400,40);
		 add(jl9);
		 jl10=new Label("Account No    "+cq);
		 Font f11=new Font("Lucida Sans",Font.ITALIC,20);
		 jl10.setFont(f11);
		 jl10.setBounds(500,10,400,40);
		 add(jl10);
		 cb3=new Checkbox("Transactions Sent",cbg,false);
		Font f12=new Font("Times New Roman",Font.PLAIN,30);
		cb3.setFont(f12);
		cb3.setForeground(Color.black);
		cb3.setBounds(10,60,400,50);
		add(cb3);
		
				
		cb3.addItemListener(this);
		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		Object ob=ie.getSource();
		if(ob==cb1)
		{
			setLayout(null);
			br1=new Button("OK");
		 Color c2=new Color(36, 113, 163);
		br1.setBackground(c2);
		br1.setForeground(Color.white);
		br1.setBounds(100,280,70,50);
		add(br1);
		br2=new Button("CANCEL");
		br2.setBackground(c2);
		br2.setForeground(Color.white);
		br2.setBounds(200,280,100,50);
		add(br2);
		jl2=new Label("LOGIN ID");
		Font f4=new Font("Lucida Sans",Font.BOLD,30);
		jl2.setFont(f4);
		jl2.setForeground(Color.black);
		jl2.setBounds(70,140,200,50);
		add(jl2);
		jl3=new Label("PASSWORD");
		Font f5=new Font("Lucida Sans",Font.BOLD,30);
		jl3.setFont(f5);
		jl3.setForeground(Color.black);
		jl3.setBounds(70,210,200,50);
		add(jl3);
		ta1=new TextField();
		ta1.setBounds(300,140,300,50);
		add(ta1);
		ta2=new TextField();
		ta2.setBounds(300,210,300,50);
		add(ta2);
		remove(cb2);
		br2.addActionListener(this);
		br1.addActionListener(this);
		}
		if(ob==cb2)
		{
			setLayout(null);
			br3=new Button("OK");
	Color c3=new Color(36, 113, 163);
		br3.setBackground(c3);
		br3.setForeground(Color.white);
		br3.setBounds(100,280,70,50);
		add(br3);
		
		br4=new Button("CANCEL");
		br4.setBackground(c3);
		br4.setForeground(Color.white);
		br4.setBounds(200,280,100,50);
		add(br4);
		
		jl2=new Label("LOGIN ID");
		Font f4=new Font("Lucida Sans",Font.BOLD,30);
		jl2.setFont(f4);
		jl2.setForeground(Color.black);
		jl2.setBounds(70,140,200,50);
		add(jl2);
		jl3=new Label("PASSWORD");
		Font f5=new Font("Lucida Sans",Font.BOLD,30);
		jl3.setFont(f5);
		jl3.setForeground(Color.black);
		jl3.setBounds(70,210,200,50);
		add(jl3);
		ta1=new TextField();
		ta1.setBounds(300,140,300,50);
		add(ta1);
		ta2=new TextField();
		ta2.setBounds(300,210,300,50);
		add(ta2);
		remove(cb1);
		br3.addActionListener(this);
		br4.addActionListener(this);
		}
		if(ob==ch)
		{
			bank=ch.getSelectedItem();
			System.out.println(bank);
			
		}
		if(ob==cb3)
		{
			try{
			int co=Integer.parseInt(ta1.getText());
			
			rs9=st.executeQuery("select count(account_no) from transactions where account_no="+co+";");
			rs9.next();
    		int rowq = rs9.getInt("count(account_no)");
			String d[][]=new String[rowq][4];
			String h[]={"Send_To","Amount_Send","Bank","Updated_Balance"};
			int r=0;
			rs8=st.executeQuery("select send_to,amount_send,to_bank,balance from transactions where account_no="+co+";");
			while(rs8.next())
			{
				d[r][0]=rs8.getString("send_to");
				d[r][1]=rs8.getString("amount_send");
				d[r][2]=rs8.getString("to_bank");
				d[r][3]=rs8.getString("balance");
				r++;
			}
			
			 tb=new JTable(d,h);
			tb.setPreferredSize(new Dimension(880,1000));
			
			 sp=new JScrollPane(tb);
			sp.setBounds(10,120,890,300);
			add(sp);
			
			}
			
			catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
		if(ob==br1)
		{
			try
				{
					 cq=ta1.getText();
					 bu=ta2.getText();
					 rs4=st.executeQuery("select count(account_no) from account_details;");
					 rs4.next();
					 row = rs4.getInt("count(account_no)");
					 System.out.println(row);
					 rs2=st.executeQuery("select account_no from account_details;");
					a1=new int[row];	
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
							 transfer();
							 
							 // st.execute("insert into transactions(account_no) values("+cq+");");
							  ta3.setText(""+cq);
							  ta3.setEnabled(false);
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
			remove(ta1);
		remove(ta2);
		remove(jl2);
		remove(jl3);
		remove(br1);
		remove(br2);
		add(cb2);
		}
		if(ob==br4)
		{
			remove(ta1);
		remove(ta2);
		remove(jl2);
		remove(jl3);
		remove(br3);
		remove(br4);
		add(cb1);
		}
		if(ob==br5)
		{
			try
			{
				 account=Integer.parseInt(ta4.getText());
				 amount=Integer.parseInt(ta5.getText());
				
				
				
				 if(bank.compareTo("Axis Bank")==0)
				 {
					 
					  for(i=0;i<row;i++)
				    {
						 if(a1[i]==account)
						 {
							 flaga=0;
							 rs5=st.executeQuery("select balance from account_details where account_no="+account+";");
							 if(rs5.next())
							{
								ab=rs5.getInt("balance");
								System.out.println(ab);
							}
							  balance=ab+amount;
							 	st.executeUpdate("update account_details set balance="+balance+" where account_no="+account+";");
								rs6=st.executeQuery("select balance from account_details where account_no="+cq+";");
								if(rs6.next())
								{
									ba=rs6.getInt("balance");
								}
								if(ba<amount)
								{
									JOptionPane.showMessageDialog(null,"OOPS!! \n YOU DO NOT HAVE ENOUGH BALANCE","AXIS BANK",1);
									ta5.setText("");
								}
								if(ba>=amount)
								{
									
									bal=ba-amount;
									st.execute("insert into transactions(send_to,amount_send,to_bank,account_no,balance) values("+account+","+amount+",'"+bank+"',"+cq+","+bal+");");
   			   
									ta4.setText("");
									ta5.setText("");
									
								
									st.executeUpdate("update account_details set balance="+bal+" where account_no="+cq+";");
									JOptionPane.showMessageDialog(null,"TRANSACTION SUCCESSFULY COMPLETED\n Your Updated balance is "+bal+"","AXIS BANK",1);
									ta5.setText("");
									st.execute("insert into transactions_recieved(account_no,sent_by,amount,balance) values("+account+","+cq+","+amount+","+balance+");");
									
								}
								
						   }
							
					}
				if(flaga==1)
							{
								JOptionPane.showMessageDialog(null,"NO SUCH ACCOUNT EXISTS","AXIS BANK",1);
								ta4.setText("");
							}
			}
			else
			{
				rs=st.executeQuery("select balance from account_details where account_no="+cq+";");
				if(rs.next())
				{
					ba=rs.getInt("balance");
				}
				if(ba<amount)
				{
					 JOptionPane.showMessageDialog(null,"OOPS!! \n YOU DO NOT HAVE ENOUGH BALANCE","AXIS BANK",1);
				}
				if(ba>=amount)
				{
						bal=ba-amount;
					st.execute("insert into transactions(send_to,amount_send,to_bank,account_no,balance) values("+account+","+amount+",'"+bank+"',"+cq+","+bal+");");
   			   
					ta4.setText("");
					ta5.setText("");
				
					st.executeUpdate("update account_details set balance="+bal+" where account_no="+cq+";");
					JOptionPane.showMessageDialog(null,"TRANSACTION SUCCESSFULY COMPLETED\n Your Updated balance is "+bal+"","AXIS BANK",1);
					ta5.setText("");
				}
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		
		
		
	}
	if(ob==br3)
	{
		try
				{
					 cq=ta1.getText();
					 bu=ta2.getText();
					 rs4=st.executeQuery("select count(account_no) from account_details;");
					 rs4.next();
					 row = rs4.getInt("count(account_no)");
					 System.out.println(row);
					 rs2=st.executeQuery("select account_no from account_details;");
					a1=new int[row];	
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
							 details();
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
	
	
}
}
import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;
import static java.lang.Math.pow;
import java.util.regex.*; 
class ModifyInstallment extends JPanel implements ActionListener{
	Label lr1,lr2,lr3,lr4,lr5,lr6,lr7,lr8,lr9,lr10,lr11;
	TextField tr1,tr2,tr3,tr4,tr5,tr6,tr7,tr8,tr9,tr10;
	Button br1,br2,br3;
	Statement st;
	Connection con;
	ResultSet rs2,rs3,rs4,rs1,rs5,rs6;
	int row,i,j,flag=1;
	String bu,type,cq;
	int time,yr,rowa,flaga=1,month,nyr,nmonth;
	double am,r,jq,o,q,amount,n,mn;
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
	ModifyInstallment()
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
		lr2.setBounds(70,170,200,100);
		add(lr2);
		tr1=new TextField();
		tr1.setBounds(300,70,300,50);
		add(tr1);
		tr2=new TextField();
		tr2.setBounds(300,170,300,50);
		add(tr2);
		br1.addActionListener(this);

	}
	public void design()
	{
		remove(lr1);
		remove(lr2);
		remove(tr1);
		remove(tr2);
		remove(br1);
		
		lr3=new Label("Account No");
		Font f3=new Font("Times New Roman",Font.PLAIN,30);
		lr3.setForeground(Color.black);
		lr3.setFont(f3);
		lr3.setBounds(10,20,170,40);
		add(lr3);
		tr3=new TextField();
		tr3.setBounds(300,30,200,20);
		add(tr3);
		lr4=new Label("Type of Loan");
		Font f4=new Font("Times New Roman",Font.PLAIN,20);
		lr4.setForeground(Color.black);
		lr4.setFont(f4);
		lr4.setBounds(10,80,180,30);
		add(lr4);
		tr10=new TextField();
		tr10.setBounds(300,90,200,20);
		add(tr10);
		lr5=new Label("Amount");
		Font f5=new Font("Times New Roman",Font.PLAIN,20);
		lr5.setForeground(Color.black);
		lr5.setFont(f5);
		lr5.setBounds(10,130,180,30);
		add(lr5);
		tr4=new TextField();
		tr4.setBounds(300,140,200,20);
		add(tr4);
		lr6=new Label("No of Installments");
		Font f6=new Font("Times New Roman",Font.PLAIN,20);
		lr6.setForeground(Color.black);
		lr6.setFont(f6);
		lr6.setBounds(10,180,250,30);
		add(lr6);
		tr5=new TextField();
		tr5.setBounds(300,190,200,20);
		add(tr5);
		lr7=new Label("Time        years");
		Font f7=new Font("Times New Roman",Font.PLAIN,20);
		lr7.setForeground(Color.black);
		lr7.setFont(f7);
		lr7.setBounds(10,230,250,30);
		add(lr7);
		tr6=new TextField();
		tr6.setBounds(300,240,200,20);
		add(tr6);
		lr11=new Label("months");
		Font f12=new Font("Times New Roman",Font.PLAIN,20);
		lr11.setForeground(Color.black);
		lr11.setFont(f12);
		lr11.setBounds(520,230,70,30);
		add(lr11);
		tr9=new TextField();
		tr9.setBounds(610,240,200,20);
		add(tr9);
		lr8=new Label("Amount per Month");
		Font f8=new Font("Times New Roman",Font.PLAIN,20);
		lr8.setForeground(Color.black);
		lr8.setFont(f8);
		lr8.setBounds(10,280,270,30);
		add(lr8);
		tr7=new TextField();
		tr7.setBounds(300,290,200,20);
		add(tr7);
		lr9=new Label("Interest Rate (per annum)");
		Font f9=new Font("Times New Roman",Font.PLAIN,20);
		lr9.setForeground(Color.black);
		lr9.setFont(f9);
		lr9.setBounds(10,330,270,30);
		add(lr9);
		tr8=new TextField();
		tr8.setBounds(300,340,200,20);
		add(tr8);
		
		lr10=new Label("%");
		Font f11=new Font("Times New Roman",Font.PLAIN,20);
		lr10.setForeground(Color.black);
		lr10.setFont(f11);
		lr10.setBounds(510,335,270,30);
		add(lr10);
		br3=new Button("SUBMIT");
		Font fq=new Font("Times New Roman",Font.PLAIN,15);
		br3.setFont(fq);
		 Color ck=new Color(36, 113, 163);
		br3.setBackground(ck);
		br3.setForeground(Color.white);
		br3.setBounds(640,160,80,40);
		add(br3);
		
		
		br3.addActionListener(this);
		setLayout(null);
		setVisible(true);
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
							design();
							 tr3.setText(""+cq);
							 tr3.setEnabled(false);
							 rs5=st.executeQuery("select month_time,loan_type,loan_amt,no_installment,time_installment,installment,interest_rate from loan where acc_no="+cq+";");
							 if(rs5.next())
							 {
								 type=rs5.getString("loan_type");
								 amount=rs5.getInt("loan_amt");
								 n=rs5.getInt("no_installment");
								 yr=rs5.getInt("time_installment");
								 r=rs5.getInt("interest_rate");
								 am=rs5.getInt("installment");
								 month=rs5.getInt("month_time");
							 }
							 tr4.setText(""+amount);
							 tr5.setText(""+n);
							 tr6.setText(""+yr);
							 tr7.setText(""+am);
							 tr8.setText(""+r);
							  tr10.setText(type);
							  tr9.setText(""+month);
							  tr4.setEnabled(false);
							 tr5.setEnabled(false);
							 tr7.setEnabled(false);
							  tr8.setEnabled(false);
							 
							  tr10.setEnabled(false);
							 //ch.setSelectedItem(type);
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
			if(ob==br3)
			{
				try{
				tr5.setEnabled(true);
				tr7.setEnabled(true);
				tr5.setText("");
				tr7.setText("");
				nyr=Integer.parseInt(tr6.getText());
				nmonth=Integer.parseInt(tr9.getText());
				time=(nyr*12)+nmonth;
				tr5.setText(""+time);
				tr5.setEnabled(false);
				amount=Double.parseDouble(tr4.getText());
				n=Double.parseDouble(tr5.getText());
				r=Double.parseDouble(tr8.getText());
				jq=r/(100*12);
				//System.out.println(jq);
				o=1+jq;
				//System.out.println(o);
				q=Math.pow(o,n);
				//System.out.println(q);
				am=(amount*jq*q)/(q-1);
				tr7.setText(""+am);
				tr7.setEnabled(false);
				//System.out.println(am);
				st.executeUpdate("update loan set no_installment="+time+",time_installment="+nyr+",month_time="+nmonth+",installment="+am+";");
				
				
				JOptionPane.showMessageDialog(null,"UPDATED","AXIS",0);
				tr6.setEnabled(false);
				tr9.setEnabled(false);
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			
	}
	
	
}
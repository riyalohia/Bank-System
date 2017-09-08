import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
import java.sql.*;
import java.util.regex.*;  
class ViewAccount extends JPanel implements ActionListener{
	Button bt1,bt2;
	Label lt1,lt2;
	TextField tt1,tt2;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,t13;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t14;
	JButton b1,b2;
	ButtonGroup jrbg=new ButtonGroup();
	ButtonGroup jrbg1=new ButtonGroup();
	ButtonGroup jrbg2=new ButtonGroup();
	ButtonGroup jrbg3=new ButtonGroup();
	ButtonGroup jrbg4=new ButtonGroup();
	JRadioButton jrb1,jrb2,jrb3,jrb4,jrb5,jrb6,jrb7,jrb8,jrb9,jrb10,jrb11;
	String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a15,a16,a17,a19,a20,a21,cq;
	JCheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;
	ImageIcon img1,img2,img3;
	JLabel jl1,jl2,jl3;
	Statement st;
	Connection con;
	int i,row,flag=1,m;
	ResultSet rs2,rs3,rs4,rs5,rs6,rs7,rs8,rs9,rs10,rs11,rs12,rs13,rs14,rs15,rs16,rs17,rs18,rs19,rs20,rs21,rrs1;
	String store[]=new String[21];
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
	ViewAccount()
	{
		setLayout(null);
		Color c1=new Color(192,192,192);
		setBackground(c1);
		bt2=new Button("SUBMIT");
		Font f=new Font("Times New Roman",Font.PLAIN,15);
		bt2.setFont(f);
		 Color c2=new Color(36, 113, 163);
		bt2.setBackground(c2);
		bt2.setForeground(Color.white);
		bt2.setBounds(400,270,100,50);
		add(bt2);
		lt1=new Label("PLEASE ENTER YOUR ACCOUNT NUMBER");
		Font f00=new Font("Times New Roman",Font.BOLD,40);
		lt1.setFont(f00);
		lt1.setForeground(Color.black);
		lt1.setBounds(30,0,840,100);
		add(lt1);
		
		tt1=new TextField();
		tt1.setBounds(50,150,800,50);
		add(tt1);
		bt2.addActionListener(this);
		
	}
	public void makeNewAccount()
	{
		remove(lt1);
		remove(tt1);
		
		remove(bt2);
		Color c=new Color(192,192,192);
		setBackground(c);
		l1=new JLabel("DATE");
		l1.setBounds(10,20,50,20);
		add(l1);
		t1=new JTextField();
		t1.setBounds(70,20,100,20);
		add(t1);
		
		img1=new ImageIcon("dd.jpg");
		jl1=new JLabel();
		jl1.setBounds(0,55,910,2);
		jl1.setIcon(img1);
		add(jl1);
		l3=new JLabel("BRANCH");
		
		l3.setBounds(10,65,70,20);
		add(l3);
		l4=new JLabel("JAIPUR");
		Font f3=new Font("Arial",Font.BOLD,20);
		l4.setFont(f3);
		l4.setBounds(100,65,200,20);
		add(l4);
		l5=new JLabel("Please  Open  an  Account  of  your  Choice  as  given  below:");
		Font f4=new Font("Comic Sans MS",Font.PLAIN,15);
		l5.setFont(f4);
		l5.setBounds(10,100,880,30);
		add(l5);
		l6=new JLabel("Customer Type");
		Font f5=new Font("Times New Roman",Font.PLAIN,20);
		l6.setFont(f5);
		l6.setBounds(10,140,150,30);
		add(l6);
		Color o=new Color(192,192,192);
		jrb7=new JRadioButton("Public");
		jrb7.setBackground(o);
		jrb7.setForeground(Color.black);
		Font f6=new Font("Arial",Font.PLAIN,20);
		jrb7.setFont(f6);
		jrb7.setBounds(180,140,100,30);
		jrbg3.add(jrb7);
		add(jrb7);
		
		jrb8=new JRadioButton("Staff");
			jrb8.setBackground(o);
		jrb8.setForeground(Color.black);
		Font f7=new Font("Arial",Font.PLAIN,20);
		jrb8.setFont(f7);
		jrb8.setBounds(300,140,100,30);
		jrbg3.add(jrb8);
		add(jrb8);
	
		jrb10=new JRadioButton("Savings Account");
			jrb10.setBackground(o);
		jrb10.setForeground(Color.black);
		Font f8=new Font("Arial",Font.PLAIN,20);
		jrb10.setFont(f8);
		jrb10.setBounds(420,140,200,30);
		jrbg4.add(jrb10);
		add(jrb10);
		
		jrb11=new JRadioButton("Current Account");
			jrb11.setBackground(o);
		jrb11.setForeground(Color.black);
		Font f9=new Font("Arial",Font.PLAIN,20);
		jrb11.setFont(f9);
		jrb11.setBounds(640,140,200,30);
		jrbg4.add(jrb11);
		add(jrb11);
		
		img2=new ImageIcon("dd.jpg");
		jl2=new JLabel();
		jl2.setBounds(0,173,910,2);
		jl2.setIcon(img2);
		add(jl2);
		l7=new JLabel("(A)PERSONAL DETAILS");
		Font f10=new Font("Gill Sans MT",Font.BOLD,25);
		l7.setFont(f10);
		l7.setBounds(10,180,500,30);
		add(l7);
		l8=new JLabel("FULL NAME");
		Font f11=new Font("Calibri",Font.PLAIN,20);
		l8.setFont(f11);
		l8.setBounds(10,230,400,30);
		add(l8);
		t2=new JTextField();
		t2.setBounds(420,230,400,20);
		add(t2);
		l9=new JLabel("NAME OF FATHER/HUSBAND");
		Font f12=new Font("Calibri",Font.PLAIN,20);
		l9.setFont(f12);
		l9.setBounds(10,280,290,30);
		add(l9);
		t3=new JTextField();
		t3.setBounds(420,280,400,20);
		add(t3);
		l10=new JLabel("SEX");
		Font f13=new Font("Calibri",Font.PLAIN,20);
		l10.setFont(f13);
		l10.setBounds(10,330,290,30);
		add(l10);
		jrb1=new JRadioButton("MALE");
		Color y=new Color(192,192,192);
		jrb1.setBackground(y);
		jrb1.setForeground(Color.black);
		Font f16=new Font("Lucida Console",Font.PLAIN,20);
		jrb1.setFont(f16);
		jrb1.setBounds(340,330,200,30);
		jrbg.add(jrb1);
		add(jrb1);
		jrb2=new JRadioButton("FEMALE");
		Color y1=new Color(192,192,192);
		jrb2.setBackground(y1);
		jrb2.setForeground(Color.black);
		Font f189=new Font("Lucida Console",Font.PLAIN,20);
		jrb2.setFont(f189);
		jrb2.setBounds(570,330,200,30);
		jrbg.add(jrb2);
		add(jrb2);
		l11=new JLabel("MARITAL STATUS");
		Font f14=new Font("Calibri",Font.PLAIN,20);
		l11.setFont(f14);
		l11.setBounds(10,380,290,30);
		add(l11);
		jrb3=new JRadioButton("MARRIED");
		jrb3.setBackground(y);
		jrb3.setForeground(Color.black);
		jrb3.setFont(f16);
		jrb3.setBounds(340,380,200,30);
		jrbg1.add(jrb3);
		add(jrb3);
		jrb4=new JRadioButton("UNMARRIED");
		jrb4.setBackground(y1);
		jrb4.setForeground(Color.black);
		jrb4.setFont(f189);
		jrb4.setBounds(570,380,200,30);
		jrbg1.add(jrb4);
		add(jrb4);
		l12=new JLabel("MODE OF OPERATION");
		Font f17=new Font("Calibri",Font.PLAIN,20);
		l12.setFont(f17);
		l12.setBounds(10,430,290,30);
		add(l12);
		jrb5=new JRadioButton("SELF ONLY");
		jrb5.setBackground(y);
		jrb5.setForeground(Color.black);
		jrb5.setFont(f16);
		jrb5.setBounds(340,430,200,30);
		jrbg2.add(jrb5);
		add(jrb5);
		jrb6=new JRadioButton("EITHER OR SURVIVOR");
		jrb6.setBackground(y1);
		jrb6.setForeground(Color.black);
		jrb6.setFont(f189);
		jrb6.setBounds(570,430,300,30);
		jrbg2.add(jrb6);
		add(jrb6);
		String d=jrb6.getActionCommand();
		System.out.println(d);
		l13=new JLabel("SERVICES ACQUIRED");
		Font f18=new Font("Calibri",Font.PLAIN,20);
		l13.setFont(f18);
		l13.setBounds(10,480,180,30);
		add(l13);
		cb1=new JCheckBox("ATM cum CREDIT CARD");
		cb1.setBackground(y);
		cb1.setForeground(Color.black);
		cb1.setFont(f16);
		cb1.setBounds(200,480,270,30);
		add(cb1);
		System.out.println(cb1.getText());
		cb2=new JCheckBox("INTERNET BANKING");
		cb2.setBackground(y1);
		cb2.setForeground(Color.black);
		cb2.setFont(f189);
		cb2.setBounds(490,480,250,30);
		add(cb2);
		cb3=new JCheckBox("SMS ALERT");
		cb3.setBackground(y1);
		cb3.setForeground(Color.black);
		cb3.setFont(f189);
		cb3.setBounds(760,480,250,30);
		add(cb3);
		img3=new ImageIcon("i.jpg");
		jl3=new JLabel();
		jl3.setBounds(0,514,910,2);
		jl3.setIcon(img2);
		add(jl3);
		l17=new JLabel("(B)RESIDENTIAL DETAILS");
		Font f19=new Font("Gill Sans MT",Font.BOLD,25);
		l17.setFont(f19);
		l17.setBounds(10,520,500,30);
		add(l17);
		l14=new JLabel("CURRENT ADDRESS");
		Font f20=new Font("Calibri",Font.PLAIN,20);
		l14.setFont(f20);
		l14.setBounds(10,570,290,30);
		add(l14);
		t4=new JTextField();
		t4.setBounds(420,570,400,20);
		add(t4);
		l15=new JLabel("PERMANENT ADDRESS");
		Font f21=new Font("Calibri",Font.PLAIN,20);
		l15.setFont(f21);
		l15.setBounds(10,620,290,30);
		add(l15);
		t5=new JTextField();
		t5.setBounds(420,620,400,20);
		add(t5);
		l16=new JLabel("MOBILE NUMBER");
		Font f22=new Font("Calibri",Font.PLAIN,20);
		l16.setFont(f22);
		l16.setBounds(10,670,290,30);
		add(l16);
		t6=new JTextField();
		t6.setBounds(420,670,400,20);
		add(t6);
		l18=new JLabel("CITY");
		Font f23=new Font("Calibri",Font.PLAIN,20);
		l18.setFont(f23);
		l18.setBounds(10,720,290,30);
		add(l18);
		t7=new JTextField();
		t7.setBounds(420,720,400,20);
		add(t7);
		l19=new JLabel("STATE");
		Font f24=new Font("Calibri",Font.PLAIN,20);
		l19.setFont(f24);
		l19.setBounds(10,770,290,30);
		add(l19);
		t8=new JTextField();
		t8.setBounds(420,770,400,20);
		add(t8);
		l20=new JLabel("EMAIL ID");
		Font f25=new Font("Calibri",Font.PLAIN,20);
		l20.setFont(f25);
		l20.setBounds(10,820,290,30);
		add(l20);
		t9=new JTextField();
		t9.setBounds(420,820,400,20);
		add(t9);
		l21=new JLabel("BALANCE");
		Font f26=new Font("Calibri",Font.PLAIN,20);
		l21.setFont(f26);
		l21.setBounds(10,870,290,30);
		add(l21);
		t10=new JTextField();
		t10.setBounds(420,870,400,20);
		add(t10);
		l22=new JLabel("NATIONALITY");
		Font f27=new Font("Calibri",Font.PLAIN,20);
		l22.setFont(f27);
		l22.setBounds(10,920,290,30);
		add(l22);
		t11=new JTextField();
		t11.setBounds(420,920,400,20);
		add(t11);
		l23=new JLabel("LOGIN ID/ACCOUNT NO.");
		Font f28=new Font("Calibri",Font.PLAIN,20);
		l23.setFont(f28);
		l23.setBounds(10,970,300,30);
		add(l23);
		t13=new JLabel();
		Font f67=new Font("Calibri",Font.PLAIN,30);
		t13.setFont(f67);
		t13.setBounds(420,970,400,30);
		add(t13);
		
		
		setPreferredSize(new Dimension(880,1180));
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{
		Object ob=ae.getSource();
				if(ob==bt2)
			{
				try
				{
					 cq=tt1.getText();
					 
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
					 if(Pattern.matches("\\d*",cq))
				{
					 for(i=0;i<row;i++)
					 {
						 if(a1[i]==Integer.parseInt(cq))
						 {
							makeNewAccount();
							flag=0;
							rs5=st.executeQuery("select * from account_details where account_no="+cq+";");
							 if(rs5.next())
							 {
								 for(m=0;m<21;m++)
								 {
									 store[m]=rs5.getString(m+1);
									 //System.out.println(store[m]);
								 }
							 }
							 t1.setText(store[0]);
							 t2.setText(store[3]);
						      t3.setText(store[4]);
							 t4.setText(store[11]);
							 t5.setText(store[12]);
							  t6.setText(store[13]);
							  t7.setText(store[14]);
						    t8.setText(store[15]);
							 t9.setText(store[16]);
							 t10.setText(store[17]);		
							  t11.setText(store[18]);
							   t13.setText(""+cq);
							  
							if(store[1].equalsIgnoreCase("public"))
							{
								jrb7.setSelected(true);
							}
							if(store[1].equalsIgnoreCase("staff"))
							{
								jrb8.setSelected(true);
							}
							if(store[2].equalsIgnoreCase("savings account"))
							{
								jrb10.setSelected(true);
							}
							if(store[2].equalsIgnoreCase("current account"))
							{
								jrb11.setSelected(true);
							} 
							if(store[5].equalsIgnoreCase("male"))
							{
								jrb1.setSelected(true);
							}
							if(store[5].equalsIgnoreCase("female"))
							{
								jrb2.setSelected(true);
							}
							if(store[6].equalsIgnoreCase("married"))
							{
								jrb3.setSelected(true);
							}
							if(store[6].equalsIgnoreCase("unmarried"))
							{
								jrb4.setSelected(true);
							} 
							if(store[7].equalsIgnoreCase("self only"))
							{
								jrb5.setSelected(true);
							}
							if(store[7].equalsIgnoreCase("either or survivor"))
							{
								jrb6.setSelected(true);
							}
							if(store[8].equalsIgnoreCase("atm cum credit card"))
							{
								cb1.setSelected(true);
							} 
							if(store[9].equalsIgnoreCase("internet banking"))
							{
								cb2.setSelected(true);
							}
							if(store[10].equalsIgnoreCase("sms alert"))
							{
								cb3.setSelected(true);
							}
							t1.setEnabled(false);
			t2.setEnabled(false);
			t3.setEnabled(false);
			t4.setEnabled(false);
			t5.setEnabled(false);
			t6.setEnabled(false);
			t7.setEnabled(false);
			t8.setEnabled(false);
			t9.setEnabled(false);
			t10.setEnabled(false);
			t11.setEnabled(false);
			t13.setEnabled(false);
			
			jrb7.setEnabled(false);
			jrb8.setEnabled(false);
			jrb10.setEnabled(false);
			jrb11.setEnabled(false);
			jrb1.setEnabled(false);
			jrb2.setEnabled(false);
			jrb3.setEnabled(false);
			jrb4.setEnabled(false);
			jrb5.setEnabled(false);
			jrb6.setEnabled(false);
			cb1.setEnabled(false);
			cb2.setEnabled(false);
			cb3.setEnabled(false);
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
					JOptionPane.showMessageDialog(null,"enter correct Login ID format","AXIS",0);
				}
				}
				
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
	}
}
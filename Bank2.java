import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.awt.event.*;
class Bank2 implements ActionListener{
	JFrame f;
	JMenuBar mb;
	JMenu m1,m2,m3,m4,m5;
	JMenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17,mi18,mi19,mi20,mi21,mi22,mi23,mi24,mi25,mi26,mi27,mi28;
	JDesktopPane dp;
	JInternalFrame jif;
	JScrollPane jsp;
	JPanel p1;
	Label l2,l3;
	JLabel jl1,jl2,jl3;
	ImageIcon img1,img2,img3;
	
	Bank2()
	{
		f=new JFrame("Axis Bank");
		Color c=new Color(100,200,150);
		f.setBackground(Color.white);
		f.setLayout(null);
		img1=new ImageIcon("ggg.jpg");
		jl1=new JLabel();
		jl1.setBounds(0,0,1370,200);
		jl1.setIcon(img1);
		f.add(jl1);
		
		dp=new JDesktopPane();
		dp.setBounds(200,250,920,410);
		dp.setLayout(null);
		f.add(dp);
		
		img2=new ImageIcon("u.jpg");
		jl2=new JLabel();
		jl2.setBounds(0,250,200,500);
		jl2.setIcon(img2);
		f.add(jl2);
		img3=new ImageIcon("asdf.jpg");
		jl3=new JLabel();
		jl3.setBounds(1120,250,250,500);
		jl3.setIcon(img3);
		f.add(jl3);
		mb=new JMenuBar();
		//Color c1=new Color(208, 211, 212);
		//mb.setBackground(c1);
		mb.setBounds(0,200,1370,50);
		f.add(mb);
		m1=new JMenu("Customers");
		mb.add(m1);
		m2=new JMenu("Loan");
		mb.add(m2);
		m3=new JMenu("Transactions");
		mb.add(m3);
		m4=new JMenu("Services");
		mb.add(m4);
		m5=new JMenu("Exit");
		mb.add(m5);
		mi1=new JMenuItem("New Account");
		mi1.setMnemonic((int)'N');
		//mi1.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m1.add(mi1);
		mi2=new JMenuItem("Modify Account");
		mi2.setMnemonic((int)'M');
		//mi2.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m1.add(mi2);
		mi3=new JMenuItem("Delete Account");
		mi3.setMnemonic((int)'D');
		//mi3.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m1.add(mi3);
		mi4=new JMenuItem("Bank Details");
		mi4.setMnemonic((int)'B');
		//mi4.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m1.add(mi4);
		mi25=new JMenuItem("Complaint Box");
		mi25.setMnemonic((int)'C');
		//mi25.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m4.add(mi25);
		mi6=new JMenuItem("Exit");
		mi6.setMnemonic((int)'E');
		//mi6.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m5.add(mi6);
		mi7=new JMenuItem("New Loan");
		mi7.setMnemonic((int)'N');
		//mi7.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m2.add(mi7);
		mi8=new JMenuItem("View Loan");
		mi8.setMnemonic((int)'M');
		//mi8.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m2.add(mi8);
		mi9=new JMenuItem("Delete Loan");
		mi9.setMnemonic((int)'D');
		//mi9.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m2.add(mi9);
		mi10=new JMenuItem("Modify Installment");
		mi10.setMnemonic((int)'D');
		//mi10.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m2.add(mi10);
		
		mi13=new JMenuItem("Withdraw");
		mi13.setMnemonic((int)'W');
		//mi13.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m3.add(mi13);
		mi14=new JMenuItem("Deposit");
		mi14.setMnemonic((int)'D');
		//mi14.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m3.add(mi14);
		mi15=new JMenuItem("Balance Enquiry");
		mi15.setMnemonic((int)'B');
		//mi15.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m3.add(mi15);

		
		mi18=new JMenuItem("Net Banking");
		mi18.setMnemonic((int)'A');
		//mi18.setAccelerator(KeyStroke.getKeyStroke(KEYEVENT.VK_N,KEYEVENT.CTRL_MASK));
		m4.add(mi18);
		

		
		
		
		l2=new Label("                                                                 \u00a9 Axis-Bank Ltd");
		Color c2=new Color(229, 232, 232);
		l2.setBackground(c2);
		l2.setForeground(Color.black);
		Font f2=new Font("Times New Roman",Font.PLAIN,20);
		l2.setFont(f2);
		l2.setBounds(200,660,920,45);
		f.add(l2);
		/*l3=new Label("AXIS");
		l3.setBackground(Color.white);
		l3.setForeground(Color.black);
		Font f3=new Font("Times New Roman",Font.BOLD,40);
		l3.setFont(f3);
		l3.setBounds(1020,660,100,40);
		f.add(l3);*/
		mi1.addActionListener(this);
		mi2.addActionListener(this);
		mi3.addActionListener(this);
		mi4.addActionListener(this);
		
		mi6.addActionListener(this);
		mi7.addActionListener(this);
		mi8.addActionListener(this);
		mi9.addActionListener(this);
		mi10.addActionListener(this);
		mi13.addActionListener(this);
		mi14.addActionListener(this);
		mi15.addActionListener(this);
		mi18.addActionListener(this);
		mi25.addActionListener(this);
		
		f.setSize(1370,700);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae)
		{
			Object ob=ae.getSource();
			if(ob==mi1)
			{
				
				jif=new JInternalFrame("New Account",false,true,false,false);
				jif.setBounds(0,0,920,410);
				NewAccount a=new NewAccount();
				
				jsp=new JScrollPane(a);
				//jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				//jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				jsp.setBounds(0,0,910,410);
				jif.add(jsp);
				jif.setLayout(null);
				jif.setVisible(true);
				
				
				dp.add(jif);
			}
			
			
			if(ob==mi2)
			{
				jif=new JInternalFrame("Axis Bank",true,true,true,true);
				jif.setBounds(0,0,920,410);
				ModifyAccount a=new ModifyAccount();
				jsp=new JScrollPane(a);
				//jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				//jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				jsp.setBounds(0,0,910,410);
				jif.add(jsp);
				jif.setLayout(null);
				jif.setVisible(true);
				dp.add(jif);
				
			}
			
			if(ob==mi3)
			{
				jif=new JInternalFrame("Axis Bank",true,true,true,true);
				jif.setBounds(0,0,920,410);
				DeleteAccount a=new DeleteAccount();
				jif.add(a);
				dp.add(jif);
				jif.setVisible(true);
			}
			
			if(ob==mi4)
			{
				jif=new JInternalFrame("Account Details",true,true,true,true);
				jif.setBounds(0,0,920,410);
				ViewAccount a=new ViewAccount();
				jsp=new JScrollPane(a);
				//jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				//jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				jsp.setBounds(0,0,910,410);
				jif.add(jsp);
				jif.setLayout(null);
				
				jif.setVisible(true);
				dp.add(jif);
			}
		
			if(ob==mi6)
			{
				System.exit(0);
			}
			if(ob==mi7)
			{
				jif=new JInternalFrame("New Loan",false,true,false,false);
				jif.setBounds(0,0,920,410);
				NewLoan a=new NewLoan();
				
				//jsp=new JScrollPane(a);
				//jsp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				//jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				//jif.setBounds(0,0,910,410);
				jif.add(a);
				//jif.setLayout(null);
				
				
				
				dp.add(jif);
				jif.setVisible(true);
			}
			
			if(ob==mi13)
			{
				jif=new JInternalFrame("Withdraw",true,true,true,true);
				jif.setBounds(0,0,920,410);
				Withdraw a=new Withdraw();
				jif.add(a);
				dp.add(jif);
				jif.setVisible(true);
			}
			
			if(ob==mi14)
			{
				jif=new JInternalFrame("Deposit",true,true,true,true);
				jif.setBounds(0,0,920,410);
				Deposit a=new Deposit();
				jif.add(a);
				dp.add(jif);
				jif.setVisible(true);
			}
			
			if(ob==mi15)
			{
				jif=new JInternalFrame("Show Balance",true,true,true,true);
				jif.setBounds(0,0,920,410);
				Balance a=new Balance();
				jif.add(a);
				dp.add(jif);
				jif.setVisible(true);
			}
			
			if(ob==mi18)
			{
				jif=new JInternalFrame("Net Banking",true,true,true,true);
				jif.setBounds(0,0,920,410);
				NetBanking a=new NetBanking();
				jif.add(a);
				dp.add(jif);
				jif.setVisible(true);
			}
			if(ob==mi25)
			{
				jif=new JInternalFrame("Complaint Box",true,true,true,true);
				jif.setBounds(0,0,920,410);
				ComplaintBox a=new ComplaintBox();
				jif.add(a);
				dp.add(jif);
				jif.setVisible(true);
			}
			
			if(ob==mi8)
			{
				jif=new JInternalFrame("View Loan",true,true,true,true);
				jif.setBounds(0,0,920,410);
				ModifyLoan a=new ModifyLoan();
				jif.add(a);
				dp.add(jif);
				jif.setVisible(true);
			}
			if(ob==mi9)
			{
				jif=new JInternalFrame("Delete Loan",true,true,true,true);
				jif.setBounds(0,0,920,410);
				DeleteLoan a=new DeleteLoan();
				jif.add(a);
				dp.add(jif);
				jif.setVisible(true);
			}
			if(ob==mi10)
			{
				jif=new JInternalFrame("Modify Installment",true,true,true,true);
				jif.setBounds(0,0,920,410);
				ModifyInstallment a=new ModifyInstallment();
				jif.add(a);
				dp.add(jif);
				jif.setVisible(true);
			}
		}
	public static void main(String z[]){
		Bank2 a=new Bank2();
	}
}                                                      
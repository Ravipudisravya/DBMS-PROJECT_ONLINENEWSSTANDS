package info;
import javax.swing.*;
import java.awt.event.*;   
import java.sql.*;
import java.awt.Font;
import java.awt.Color;
public class onlineNewsstands implements ActionListener {
	JFrame f= new JFrame("Example"); 
	JLabel l1,l2, l3, l4, l5, l6,l,ll1,ll2, ll3, ll4, ll5, ll6,ll, li1,li2, li3, li4, li5, li6,li;
	 JTextField tf1,tf2,tf3,tf4,tf5,tf6,tff1,tff2,tff3,tff4,tff5,tff6,tif1,tif2,tif3,tif4,tif5,tif6; 
	 JButton bu,bu1,bu2,bu3,bu4,bu5,bu6,bu7,bu8,bu9,bu10,bu11,bu12,bu13,bu14,bu15,bu16,bu17;	 	 	    	
   	JLabel lb1,lb2, lb3, lb4, lb5, lb6,lb,lb7,la1,la2, la3, la4, la5, la6,la,la7,lc1,lc2, lc3, lc4, lc5, lc6,lc,lc7;
	 JTextField t1,t2,t3,t4,t5,t6,ta1,ta2,ta3,ta4,ta5,ta6,tc1,tc2,tc3,tc4,tc5,tc6; 	  
	 JLabel ld1,ld2, ld3, ld4,ld,le1,le2, le3, le4,le,lh1,lh2, lh3, lh4,lh;
	 JTextField td1,td2,td3,td4,te1,te2,te3,te4,th1,th2,th3,th4;		
	 JLabel lj1,lj2, lj3, lj4,lj,lk1,lk2, lk3, lk4,lk,lm1,lm2,lm3,lm4,lm,ln1,ln2, ln3, ln, lo1,lo2, lo3,lo;
	 JTextField tj1,tj2,tj3,tj4,tk1,tk2,tk3,tk4,tm1,tm2,tm3,tm4,tn1,tn2,tn3,to1,to2,to3;	 		 	 
	 JLabel lu1,lu2, lu3,lu,lp1,lp2,lp,lq1,lq2,lq,lr1,lr2,lr;
	 JTextField tu1,tu2,tu3,tp1,tp2, tq1,tq2,tr1,tr2;		 	 
   	Connection con;Statement stmt;
   	JFrame p=new JFrame("user insert");
	JFrame q=new JFrame("user modify"); 
	JFrame r=new JFrame("user delete"); 
	JFrame s=new JFrame("news insert"); 
	JFrame t=new JFrame("news modify"); 
	JFrame p1=new JFrame("news delete"); 
	JFrame q1=new JFrame("insert advertisement"); 
	JFrame r1=new JFrame("modify advertisement");
	JFrame s1=new JFrame("delete advertisement");
	JFrame p2=new JFrame("insert publisher"); 
	JFrame q2=new JFrame("modify publisher"); 
	JFrame r2=new JFrame("delete publisher");
	JFrame p3=new JFrame("insert Read"); 
	JFrame q3=new JFrame("modify Read"); 
	JFrame r3=new JFrame("delete Read");
	JFrame p4=new JFrame("insert published"); 
	JFrame q4=new JFrame("modify published"); 
	JFrame r4=new JFrame("delete published");
	
	JMenuBar mb=new JMenuBar();  
        JMenu menu=new JMenu("USER");
	JMenu menu1=new JMenu("NEWS");
	JMenu menu2=new JMenu("ADVERTISEMNETS");   
	JMenuItem i1=new JMenuItem("insert user");  
        JMenuItem i2=new JMenuItem("modify user");  
        JMenuItem i3=new JMenuItem("delete user"); 
	JMenuItem i4=new JMenuItem("insert news");  
        JMenuItem i5=new JMenuItem("modify news"); 
	JMenuItem i6=new JMenuItem("delete news");   
        JMenuItem i7=new JMenuItem("insert advertisement");  
        JMenuItem i8=new JMenuItem("modify advertisement");  
        JMenuItem i9=new JMenuItem("delete advertisement");  
	JMenu menu3=new JMenu("PUBLISHER");   
        JMenuItem a=new JMenuItem("insert publisher");  
        JMenuItem b=new JMenuItem("modify publisher");  
        JMenuItem c=new JMenuItem("delete publisher");  
	JMenu menu4=new JMenu("READ");   
        JMenuItem a1=new JMenuItem("insert Read");  
        JMenuItem b1=new JMenuItem("modify Read");  
        JMenuItem c1=new JMenuItem("delete Read");  
	JMenu menu5=new JMenu("PUBLISHED");   
        JMenuItem a2=new JMenuItem("insert published");  
        JMenuItem b2=new JMenuItem("modify published");  
        JMenuItem c2=new JMenuItem("delete published");
	
     onlineNewsstands(){ 
   l1=new JLabel("     ONLINE NEWSSTANDS   ");  
   l1.setFont(new Font("Tahoma", Font.PLAIN, 30));
   l1.setBounds(50,100,419,76);      
        menu.setForeground(Color.BLACK);
        menu.add(i1);  
        menu.add(i2);  
        menu.add(i3);     
        mb.add(menu);    
        menu1.setForeground(Color.BLACK);
        menu1.add(i4);  
        menu1.add(i5);  
        menu1.add(i6);     
        mb.add(menu1);
        menu2.setForeground(Color.BLACK);
        menu2.add(i7);  
        menu2.add(i8);  
        menu2.add(i9);     
        mb.add(menu2);
        menu3.setForeground(Color.BLACK);
        menu3.add(a);  
        menu3.add(b);  
        menu3.add(c);     
        mb.add(menu3);
        menu4.setForeground(Color.BLACK);
        menu4.add(a1);  
        menu4.add(b1);  
        menu4.add(c1);     
        mb.add(menu4);  
        menu5.setForeground(Color.BLACK);
        menu5.add(a2);  
        menu5.add(b2);  
        menu5.add(c2);     
        mb.add(menu5);
	 f.getContentPane().setForeground(Color.GRAY);
	 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	r.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 f.getContentPane().add(l1);  
        f.setJMenuBar(mb);  
        f.setSize(700,486);  
        f.getContentPane().setLayout(null);  
        f.setVisible(true);
        p.setSize(700,555); 
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	q.setSize(700,700); 
	r.setSize(700,700); 
	s.setSize(700,700); 
	t.setSize(700,700); 
	p1.setSize(700,700); 
	q1.setSize(700,700);
	r1.setSize(700,700);  
	s1.setSize(700,700); 
	p2.setSize(700,700); 
	q2.setSize(700,700);
	r2.setSize(700,700);
	p3.setSize(700,700); 
	q3.setSize(700,700);
	r3.setSize(700,700);
	p4.setSize(700,700); 
	q4.setSize(700,700);
	r4.setSize(700,700);
	
	bu=new JButton("INSERT");
	bu.setFont(new Font("Tahoma", Font.PLAIN, 14));
	bu.setBackground(Color.WHITE);
	l=new JLabel("    USER INSERTION");
	l.setFont(new Font("Tahoma", Font.PLAIN, 18));
	l.setVerticalAlignment(SwingConstants.TOP);
	l.setBounds(100, 30, 400, 30); 
	l2 = new JLabel("ID:");  
	l2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       l3 = new JLabel("Name:");  
       l3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       l4 = new JLabel("Email:");  
       l4.setFont(new Font("Tahoma", Font.PLAIN, 14));
       l5 = new JLabel("Password:");  
       l5.setFont(new Font("Tahoma", Font.PLAIN, 14));
       l6 = new JLabel("Address:");
       l6.setFont(new Font("Tahoma", Font.PLAIN, 14));
	tf1 = new JTextField();  
       tf2 = new JTextField();  
       tf3 = new JTextField();  
       tf4 = new JTextField();  
       tf5 = new JTextField();
       l2.setBounds(80, 70, 200, 30);  
       l3.setBounds(80, 110, 200, 30);  
       l4.setBounds(80, 150, 200, 30);  
       l5.setBounds(80, 190, 200, 30); 
	l6.setBounds(80, 230, 200, 30);   
       tf1.setBounds(300, 70, 200, 30);  
       tf2.setBounds(300, 110, 200, 30);  
       tf3.setBounds(300, 150, 200, 30);  
       tf4.setBounds(300, 190, 200, 30);  
       tf5.setBounds(300, 230, 200, 30);
       bu.setBounds(170, 350, 100, 30); 
	p.getContentPane().add(tf1);p.getContentPane().add(tf2);p.getContentPane().add(tf3);p.getContentPane().add(tf4);p.getContentPane().add(tf5);p.getContentPane().add(bu);p.getContentPane().add(l2);p.getContentPane().add(l3);p.getContentPane().add(l4);p.getContentPane().add(l5);p.getContentPane().add(l6);p.getContentPane().add(l);
	 bu.addActionListener(this); 
	 
	bu1=new JButton("MODIFY");
	bu1.setFont(new Font("Tahoma", Font.PLAIN, 14));
	bu1.setBackground(Color.WHITE);
	ll=new JLabel("    USER MODIFICATION");
	ll.setFont(new Font("Tahoma", Font.PLAIN, 16));
	ll.setVerticalAlignment(SwingConstants.TOP);
	ll.setBounds(100, 30, 400, 30); 
	ll2 = new JLabel("ID:");  
	ll2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       ll3 = new JLabel("Name:");  
       ll3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       ll4 = new JLabel("Email:");  
       ll4.setFont(new Font("Tahoma", Font.PLAIN, 14));
       ll5 = new JLabel("Password:");  
       ll5.setFont(new Font("Tahoma", Font.PLAIN, 14));
       ll6 = new JLabel("Address:");
       ll6.setFont(new Font("Tahoma", Font.PLAIN, 14));
       tff1 = new JTextField();  
       tff2 = new JTextField();  
       tff3 = new JTextField();  
       tff4 = new JTextField();  
       tff5 = new JTextField();
       ll2.setBounds(80, 70, 200, 30);  
       ll3.setBounds(80, 110, 200, 30);  
       ll4.setBounds(80, 150, 200, 30);  
       ll5.setBounds(80, 190, 200, 30); 
	ll6.setBounds(80, 230, 200, 30);   
       tff1.setBounds(300, 70, 200, 30);  
       tff2.setBounds(300, 110, 200, 30);  
       tff3.setBounds(300, 150, 200, 30);  
       tff4.setBounds(300, 190, 200, 30);  
       tff5.setBounds(300, 230, 200, 30);
       bu1.setBounds(170, 350, 100, 30); 
	q.getContentPane().add(tff1);q.getContentPane().add(tff2);q.getContentPane().add(tff3);q.getContentPane().add(tff4);q.getContentPane().add(tff5);q.getContentPane().add(bu1);q.getContentPane().add(ll2);q.getContentPane().add(ll3);q.getContentPane().add(ll4);q.getContentPane().add(ll5);q.getContentPane().add(ll6);q.getContentPane().add(ll);
	 bu1.addActionListener(this);
	
	bu2=new JButton("DELETE");
	bu2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	bu2.setBackground(Color.WHITE);
	li=new JLabel("    USER DELETION");
	li.setFont(new Font("Tahoma", Font.PLAIN, 18));
	li.setVerticalAlignment(SwingConstants.TOP);
	li.setBounds(100, 30, 400, 30); 
	li2 = new JLabel("ID:");  
	li2.setFont(new Font("Tahoma", Font.PLAIN, 14));
       li3 = new JLabel("Name:");  
       li3.setFont(new Font("Tahoma", Font.PLAIN, 14));
       li4 = new JLabel("Email:");  
       li4.setFont(new Font("Tahoma", Font.PLAIN, 14));
       li5 = new JLabel("Password:");  
       li5.setFont(new Font("Tahoma", Font.PLAIN, 14));
       li6 = new JLabel("Address:");
       li6.setFont(new Font("Tahoma", Font.PLAIN, 14));
	tif1 = new JTextField();  
       tif2 = new JTextField();  
       tif3 = new JTextField();  
       tif4 = new JTextField();  
       tif5 = new JTextField();
       li2.setBounds(80, 70, 200, 30);  
       li3.setBounds(80, 110, 200, 30);  
       li4.setBounds(80, 150, 200, 30);  
       li5.setBounds(80, 190, 200, 30); 
	li6.setBounds(80, 230, 200, 30);   
       tif1.setBounds(300, 70, 200, 30);  
       tif2.setBounds(300, 110, 200, 30);  
       tif3.setBounds(300, 150, 200, 30);  
       tif4.setBounds(300, 190, 200, 30);  
       tif5.setBounds(300, 230, 200, 30);
       bu2.setBounds(170, 350, 100, 30); 
	r.getContentPane().add(tif1);r.getContentPane().add(tif2);r.getContentPane().add(tif3);r.getContentPane().add(tif4);r.getContentPane().add(tif5);r.getContentPane().add(bu2);r.getContentPane().add(li2);r.getContentPane().add(li3);r.getContentPane().add(li4);r.getContentPane().add(li5);r.getContentPane().add(li6);r.getContentPane().add(li);
	 bu2.addActionListener(this); 
	 
	 bu3=new JButton("insert");
		bu3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bu3.setBackground(Color.WHITE);
		lb=new JLabel("    NEWS INSERTION");
		lb.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lb.setVerticalAlignment(SwingConstants.TOP);
		lb.setBounds(100, 30, 400, 30); 
		lb2 = new JLabel("ID:");  
		lb2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       lb3 = new JLabel("TYPE:");  
	       lb3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       lb4 = new JLabel("TITLE:");  
	       lb4.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       lb5 = new JLabel("DESCRIPTION:");  
	       lb5.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       lb6 = new JLabel(" DATE:");
	       lb6.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       lb7= new JLabel(" PUBLISHER NAME:");
	       lb7.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       t1 = new JTextField();  
	       t2 = new JTextField();  
	       t3 = new JTextField();  
	       t4 = new JTextField();  
	       t5 = new JTextField();
	       t6 = new JTextField();
	       lb2.setBounds(80, 70, 200, 30);  
	       lb3.setBounds(80, 110, 200, 30);  
	       lb4.setBounds(80, 150, 200, 30);  
	       lb5.setBounds(80, 190, 200, 30); 
	       lb6.setBounds(80, 230, 200, 30); 
	       lb7.setBounds(80, 270, 200, 30); 
	       t1.setBounds(300, 70, 200, 30);  
	       t2.setBounds(300, 110, 200, 30);  
	       t3.setBounds(300, 150, 200, 30);  
	       t4.setBounds(300, 190, 200, 30);  
	       t5.setBounds(300, 230, 200, 30);
	       t6.setBounds(300, 270, 200, 30);
	       bu3.setBounds(170, 350, 100, 30); 
		s.getContentPane().add(t1);s.getContentPane().add(t2);s.getContentPane().add(t3);s.getContentPane().add(t4);s.getContentPane().add(t5);s.getContentPane().add(t6);s.getContentPane().add(bu3);s.getContentPane().add(lb2);s.getContentPane().add(lb3);s.getContentPane().add(lb4);s.getContentPane().add(lb5);s.getContentPane().add(lb6);s.getContentPane().add(lb7);s.getContentPane().add(lb);
		
		bu4=new JButton("modify");
		bu4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bu4.setBackground(Color.WHITE);
		la=new JLabel("    NEWS MODIFICATION");
		la.setFont(new Font("Tahoma", Font.PLAIN, 16));
		la.setVerticalAlignment(SwingConstants.TOP);
		la.setBounds(100, 30, 400, 30); 
		la2 = new JLabel("ID:");  
		la2.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       la3 = new JLabel("TYPE:");  
	       la3.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       la4 = new JLabel("TITLE:");  
	       la4.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       la5 = new JLabel("DESCRIPTION:");  
	       la5.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       la6 = new JLabel(" DATE:");
	       la6.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       la7= new JLabel(" PUBLISHER NAME:");
	       la7.setFont(new Font("Tahoma", Font.PLAIN, 14));
	       ta1 = new JTextField();  
	       ta2 = new JTextField();  
	       ta3 = new JTextField();  
	       ta4 = new JTextField();  
	       ta5 = new JTextField();
	       ta6 = new JTextField();
	       la2.setBounds(80, 70, 200, 30);  
	       la3.setBounds(80, 110, 200, 30);  
	       la4.setBounds(80, 150, 200, 30);  
	       la5.setBounds(80, 190, 200, 30); 
	       la6.setBounds(80, 230, 200, 30); 
	       la7.setBounds(80, 270, 200, 30); 
	       ta1.setBounds(300, 70, 200, 30);  
	       ta2.setBounds(300, 110, 200, 30);  
	       ta3.setBounds(300, 150, 200, 30);  
	       ta4.setBounds(300, 190, 200, 30);  
	       ta5.setBounds(300, 230, 200, 30);
	       ta6.setBounds(300, 270, 200, 30);
	       bu4.setBounds(170, 350, 100, 30); 
		t.getContentPane().add(ta1);t.getContentPane().add(ta2);t.getContentPane().add(ta3);t.getContentPane().add(ta4);t.getContentPane().add(ta5);t.getContentPane().add(ta6);t.getContentPane().add(bu4);t.getContentPane().add(la2);t.getContentPane().add(la3);t.getContentPane().add(la4);t.getContentPane().add(la5);t.getContentPane().add(la6);t.getContentPane().add(la7);t.getContentPane().add(la);
		
		 bu5=new JButton("delete");
			bu5.setFont(new Font("Tahoma", Font.PLAIN, 14));
			bu5.setBackground(Color.WHITE);
			lc=new JLabel("    NEWS DELETION");
			lc.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lc.setVerticalAlignment(SwingConstants.TOP);
			lc.setBounds(100, 30, 400, 30); 
			lc2 = new JLabel("ID:");  
			lc2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		       lc3 = new JLabel("TYPE:");  
		       lc3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		       lc4 = new JLabel("TITLE:");  
		       lc4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		       lc5 = new JLabel("DESCRIPTION:");  
		       lc5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		       lc6 = new JLabel(" DATE:");
		       lc6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		       lc7= new JLabel(" PUBLISHER NAME:");
		       lc7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		       tc1 = new JTextField();  
		       tc2 = new JTextField();  
		       tc3 = new JTextField();  
		       tc4 = new JTextField();  
		       tc5 = new JTextField();
		       tc6 = new JTextField();
		       lc2.setBounds(80, 70, 200, 30);  
		       lc3.setBounds(80, 110, 200, 30);  
		       lc4.setBounds(80, 150, 200, 30);  
		       lc5.setBounds(80, 190, 200, 30); 
		       lc6.setBounds(80, 230, 200, 30); 
		       lc7.setBounds(80, 270, 200, 30); 
		       tc1.setBounds(300, 70, 200, 30);  
		       tc2.setBounds(300, 110, 200, 30);  
		       tc3.setBounds(300, 150, 200, 30);  
		       tc4.setBounds(300, 190, 200, 30);  
		       tc5.setBounds(300, 230, 200, 30);
		       tc6.setBounds(300, 270, 200, 30);
		       bu5.setBounds(170, 350, 100, 30); 
			p1.getContentPane().add(tc1);p1.getContentPane().add(tc2);p1.getContentPane().add(tc3);p1.getContentPane().add(tc4);p1.getContentPane().add(tc5);p1.getContentPane().add(tc6);p1.getContentPane().add(bu5);p1.getContentPane().add(lc2);p1.getContentPane().add(lc3);p1.getContentPane().add(lc4);p1.getContentPane().add(la5);p1.getContentPane().add(lc6);p1.getContentPane().add(lc7);p1.getContentPane().add(lc);
			
			
			 bu6=new JButton("insert");
				bu6.setFont(new Font("Tahoma", Font.PLAIN, 14));
				bu6.setBackground(Color.WHITE);
				ld=new JLabel("    ADVERTISEMENTS INSERTION");
				ld.setFont(new Font("Tahoma", Font.PLAIN, 16));
				ld.setVerticalAlignment(SwingConstants.TOP);
				ld.setBounds(100, 30, 400, 30); 
				ld1 = new JLabel("ID:");  
				ld1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				ld2 = new JLabel("TYPE:");  
				ld2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			       ld3 = new JLabel("TITLE:");  
			       ld3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			       ld4 = new JLabel("DATE:");  
			       ld4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			       td1 = new JTextField();  
			       td2 = new JTextField();  
			       td3 = new JTextField();  
			       td4 = new JTextField(); 
			       ld1.setBounds(80, 70, 200, 30);  
			       ld2.setBounds(80, 110, 200, 30);  
			       ld3.setBounds(80, 150, 200, 30);  
			       ld4.setBounds(80, 190, 200, 30); 
			       td1.setBounds(300, 70, 200, 30);  
			       td2.setBounds(300, 110, 200, 30);  
			       td3.setBounds(300, 150, 200, 30);  
			       td4.setBounds(300, 190, 200, 30);  
			       
			       bu6.setBounds(170, 350, 100, 30); 
				q1.getContentPane().add(td1);q1.getContentPane().add(td2);q1.getContentPane().add(td3);q1.getContentPane().add(td4);q1.getContentPane().add(bu6);q1.getContentPane().add(ld1);q1.getContentPane().add(ld2);q1.getContentPane().add(ld3);q1.getContentPane().add(ld4);q1.getContentPane().add(ld);
				
				bu7=new JButton("modify");
				bu7.setFont(new Font("Tahoma", Font.PLAIN, 14));
				bu7.setBackground(Color.WHITE);
				le=new JLabel("    ADVERTISEMENT MODIFICATION");
				le.setFont(new Font("Tahoma", Font.PLAIN, 16));
				le.setVerticalAlignment(SwingConstants.TOP);
				le.setBounds(100, 30, 400, 30); 
				le1 = new JLabel("Id:");  
				le1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				le2 = new JLabel("TYPE:");  
				le2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			       le3 = new JLabel("TITLE:");  
			       le3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			       le4 = new JLabel("DATE:");  
			       le4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			       te1 = new JTextField();  
			       te2 = new JTextField();  
			       te3 = new JTextField();  
			       te4 = new JTextField(); 
			       le1.setBounds(80, 70, 200, 30);  
			       le2.setBounds(80, 110, 200, 30);  
			       le3.setBounds(80, 150, 200, 30);  
			       le4.setBounds(80, 190, 200, 30); 
			       te1.setBounds(300, 70, 200, 30);  
			       te2.setBounds(300, 110, 200, 30);  
			       te3.setBounds(300, 150, 200, 30);  
			       te4.setBounds(300, 190, 200, 30);  
			       
			       bu7.setBounds(170, 350, 100, 30); 
				r1.getContentPane().add(te1);r1.getContentPane().add(te2);r1.getContentPane().add(te3);r1.getContentPane().add(te4);r1.getContentPane().add(bu7);r1.getContentPane().add(le1);r1.getContentPane().add(le2);r1.getContentPane().add(le3);r1.getContentPane().add(le4);r1.getContentPane().add(le);
				
			
				bu8=new JButton("delete");
				bu8.setFont(new Font("Tahoma", Font.PLAIN, 14));
				bu8.setBackground(Color.WHITE);
				lh=new JLabel("    ADVERTISEMENT DELETION");
				lh.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lh.setVerticalAlignment(SwingConstants.TOP);
				lh.setBounds(100, 30, 400, 30); 
				lh1 = new JLabel("Id:");  
				lh1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lh2 = new JLabel("TYPE:");  
				lh2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			       lh3 = new JLabel("TITLE:");  
			       lh3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			       lh4 = new JLabel("DATE:");  
			       lh4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			       th1 = new JTextField();  
			       th2 = new JTextField();  
			       th3 = new JTextField();  
			       th4 = new JTextField(); 
			       lh1.setBounds(80, 70, 200, 30);  
			       lh2.setBounds(80, 110, 200, 30);  
			       lh3.setBounds(80, 150, 200, 30);  
			       lh4.setBounds(80, 190, 200, 30); 
			       th1.setBounds(300, 70, 200, 30);  
			       th2.setBounds(300, 110, 200, 30);  
			       th3.setBounds(300, 150, 200, 30);  
			       th4.setBounds(300, 190, 200, 30);  
			       
			       bu8.setBounds(170, 350, 100, 30); 
				s1.getContentPane().add(th1);s1.getContentPane().add(th2);s1.getContentPane().add(th3);s1.getContentPane().add(th4);s1.getContentPane().add(bu8);s1.getContentPane().add(lh1);s1.getContentPane().add(lh2);s1.getContentPane().add(lh3);s1.getContentPane().add(lh4);s1.getContentPane().add(lh);
				
				bu9=new JButton("insert");
				bu9.setFont(new Font("Tahoma", Font.PLAIN, 14));
				bu9.setBackground(Color.WHITE);
				lj=new JLabel("    PUBLISHER INSERTION");
				lj.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lj.setVerticalAlignment(SwingConstants.TOP);
				lj.setBounds(100, 30, 400, 30); 
				lj1 = new JLabel("Id:");  
				lj1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lj2 = new JLabel("NAME:");  
				lj2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			       lj3 = new JLabel("EMAIL:");  
			       lj3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			       lj4 = new JLabel("DATE:");  
			       lj4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			       tj1 = new JTextField();  
			       tj2 = new JTextField();  
			       tj3 = new JTextField();  
			       tj4 = new JTextField(); 
			       lj1.setBounds(80, 70, 200, 30);  
			       lj2.setBounds(80, 110, 200, 30);  
			       lj3.setBounds(80, 150, 200, 30);  
			       lj4.setBounds(80, 190, 200, 30); 
			       tj1.setBounds(300, 70, 200, 30);  
			       tj2.setBounds(300, 110, 200, 30);  
			       tj3.setBounds(300, 150, 200, 30);  
			       tj4.setBounds(300, 190, 200, 30);  
			       
			       bu9.setBounds(170, 350, 100, 30); 
				p2.getContentPane().add(tj1);p2.getContentPane().add(tj2);p2.getContentPane().add(tj3);p2.getContentPane().add(tj4);p2.getContentPane().add(bu9);p2.getContentPane().add(lj1);p2.getContentPane().add(lj2);p2.getContentPane().add(lj3);p2.getContentPane().add(lj4);p2.getContentPane().add(lj);

				bu10=new JButton("modify");
				bu10.setFont(new Font("Tahoma", Font.PLAIN, 14));
				bu10.setBackground(Color.WHITE);
				lk=new JLabel("    PUBLISHER MODIFICATION");
				lk.setFont(new Font("Tahoma", Font.PLAIN, 16));
				lk.setVerticalAlignment(SwingConstants.TOP);
				lk.setBounds(100, 30, 400, 30); 
				lk1 = new JLabel("Id:");  
				lk1.setFont(new Font("Tahoma", Font.PLAIN, 14));
				lk2 = new JLabel("NAME:");  
				lk2.setFont(new Font("Tahoma", Font.PLAIN, 14));
			       lk3 = new JLabel("EMAIL:");  
			       lk3.setFont(new Font("Tahoma", Font.PLAIN, 14));
			       lk4 = new JLabel("DATE:");  
			       lk4.setFont(new Font("Tahoma", Font.PLAIN, 14));
			
			       tk1 = new JTextField();  
			       tk2 = new JTextField();  
			       tk3 = new JTextField();  
			       tk4 = new JTextField(); 
			       lk1.setBounds(80, 70, 200, 30);  
			       lk2.setBounds(80, 110, 200, 30);  
			       lk3.setBounds(80, 150, 200, 30);  
			       lk4.setBounds(80, 190, 200, 30); 
			       tk1.setBounds(300, 70, 200, 30);  
			       tk2.setBounds(300, 110, 200, 30);  
			       tk3.setBounds(300, 150, 200, 30);  
			       tk4.setBounds(300, 190, 200, 30);  
			       
			       bu10.setBounds(170, 350, 100, 30); 
				q2.getContentPane().add(tk1);q2.getContentPane().add(tk2);q2.getContentPane().add(tk3);q2.getContentPane().add(tk4);q2.getContentPane().add(bu10);q2.getContentPane().add(lk1);q2.getContentPane().add(lk2);q2.getContentPane().add(lk3);q2.getContentPane().add(lk4);q2.getContentPane().add(lk);
				
				
				 bu11=new JButton("delete");
					bu11.setFont(new Font("Tahoma", Font.PLAIN, 14));
					bu11.setBackground(Color.WHITE);
					lm=new JLabel("    PUBLISHER DELETION");
					lm.setFont(new Font("Tahoma", Font.PLAIN, 16));
					lm.setVerticalAlignment(SwingConstants.TOP);
					lm.setBounds(100, 30, 400, 30); 
					lm1 = new JLabel("Id:");  
					lm1.setFont(new Font("Tahoma", Font.PLAIN, 14));
					lm2 = new JLabel("NAME:");  
					lm2.setFont(new Font("Tahoma", Font.PLAIN, 14));
				       lm3 = new JLabel("EMAIL:");  
				       lm3.setFont(new Font("Tahoma", Font.PLAIN, 14));
				       lm4 = new JLabel("DATE:");  
				       lm4.setFont(new Font("Tahoma", Font.PLAIN, 14));
				
				       tm1 = new JTextField();  
				       tm2 = new JTextField();  
				       tm3 = new JTextField();  
				       tm4 = new JTextField(); 
				       lm1.setBounds(80, 70, 200, 30);  
				       lm2.setBounds(80, 110, 200, 30);  
				       lm3.setBounds(80, 150, 200, 30);  
				       lm4.setBounds(80, 190, 200, 30); 
				       tm1.setBounds(300, 70, 200, 30);  
				       tm2.setBounds(300, 110, 200, 30);  
				       tm3.setBounds(300, 150, 200, 30);  
				       tm4.setBounds(300, 190, 200, 30);  
				       
				       bu11.setBounds(170, 350, 100, 30); 
					r2.getContentPane().add(tm1);r2.getContentPane().add(tm2);r2.getContentPane().add(tm3);r2.getContentPane().add(tm4);r2.getContentPane().add(bu11);r2.getContentPane().add(lm1);r2.getContentPane().add(lm2);r2.getContentPane().add(lm3);r2.getContentPane().add(lm4);r2.getContentPane().add(lm);
					
					 bu12=new JButton("insert");
						bu12.setFont(new Font("Tahoma", Font.PLAIN, 14));
						bu12.setBackground(Color.WHITE);
						ln=new JLabel("    READ INSERTION");
						ln.setFont(new Font("Tahoma", Font.PLAIN, 16));
						ln.setVerticalAlignment(SwingConstants.TOP);
						ln.setBounds(100, 30, 400, 30); 
						ln1 = new JLabel(" USER Id:");  
						ln1.setFont(new Font("Tahoma", Font.PLAIN, 14));
						ln2 = new JLabel("NEWS ID:");  
						ln2.setFont(new Font("Tahoma", Font.PLAIN, 14));
					       ln3 = new JLabel("ADVERTISEMENT ID:");  
					       ln3.setFont(new Font("Tahoma", Font.PLAIN, 14));					    			
					       tn1 = new JTextField();  
					       tn2 = new JTextField();  
					       tn3 = new JTextField();  					      
					       ln1.setBounds(80, 70, 200, 30);  
					       ln2.setBounds(80, 110, 200, 30);  
					       ln3.setBounds(80, 150, 200, 30);  
					      tn1.setBounds(300, 70, 200, 30);  
					       tn2.setBounds(300, 110, 200, 30);  
					       tn3.setBounds(300, 150, 200, 30);  				      
					       bu12.setBounds(170, 350, 100, 30); 
						p3.getContentPane().add(tn1);p3.getContentPane().add(tn2);p3.getContentPane().add(tn3);p3.getContentPane().add(bu12);p3.getContentPane().add(ln1);p3.getContentPane().add(ln2);p3.getContentPane().add(ln3);p3.getContentPane().add(ln);
					
						 bu13=new JButton("modify");
							bu13.setFont(new Font("Tahoma", Font.PLAIN, 14));
							bu13.setBackground(Color.WHITE);
							lo=new JLabel("   READ MODIFICATION");
							lo.setFont(new Font("Tahoma", Font.PLAIN, 16));
							lo.setVerticalAlignment(SwingConstants.TOP);
							lo.setBounds(100, 30, 400, 30); 
							lo1 = new JLabel(" USER Id:");  
							lo1.setFont(new Font("Tahoma", Font.PLAIN, 14));
							lo2 = new JLabel("NEWS ID:");  
							lo2.setFont(new Font("Tahoma", Font.PLAIN, 14));
						       lo3 = new JLabel("ADVERTISEMENT ID:");  
						       lo3.setFont(new Font("Tahoma", Font.PLAIN, 14));	     	
						       to1 = new JTextField();  
						       to2 = new JTextField();  
						       to3 = new JTextField();  	       
						       lo1.setBounds(80, 70, 200, 30);  
						       lo2.setBounds(80, 110, 200, 30);  
						       lo3.setBounds(80, 150, 200, 30);  	       
						       to1.setBounds(300, 70, 200, 30);  
						       to2.setBounds(300, 110, 200, 30);  
						       to3.setBounds(300, 150, 200, 30);  	       
						       bu13.setBounds(170, 350, 100, 30); 
							q3.getContentPane().add(to1);q3.getContentPane().add(to2);q3.getContentPane().add(to3);q3.getContentPane().add(bu13);q3.getContentPane().add(lo1);q3.getContentPane().add(lo2);q3.getContentPane().add(lo3);q3.getContentPane().add(lo);
						
							bu14=new JButton("delete");
							bu14.setFont(new Font("Tahoma", Font.PLAIN, 14));
							bu13.setBackground(Color.WHITE);
							lu=new JLabel("   READ DELETION");
							lu.setFont(new Font("Tahoma", Font.PLAIN, 16));
							lu.setVerticalAlignment(SwingConstants.TOP);
							lu.setBounds(100, 30, 400, 30); 
							lu1 = new JLabel(" USER Id:");  
							lu1.setFont(new Font("Tahoma", Font.PLAIN, 14));
							lu2 = new JLabel("NEWS ID:");  
							lu2.setFont(new Font("Tahoma", Font.PLAIN, 14));
						       lu3 = new JLabel("ADVERTISEMENT ID:");  
						       lu3.setFont(new Font("Tahoma", Font.PLAIN, 14));	     	
						       tu1 = new JTextField();  
						       tu2 = new JTextField();  
						       tu3 = new JTextField();  	       
						       lu1.setBounds(80, 70, 200, 30);  
						       lu2.setBounds(80, 110, 200, 30);  
						       lu3.setBounds(80, 150, 200, 30);  	       
						       tu1.setBounds(300, 70, 200, 30);  
						       tu2.setBounds(300, 110, 200, 30);  
						       tu3.setBounds(300, 150, 200, 30);  	       
						       bu14.setBounds(170, 350, 100, 30); 
							r3.getContentPane().add(tu1);r3.getContentPane().add(tu2);r3.getContentPane().add(tu3);r3.getContentPane().add(bu14);r3.getContentPane().add(lu1);r3.getContentPane().add(lu2);r3.getContentPane().add(lu3);r3.getContentPane().add(lu);
													
							 bu15=new JButton("insert");
								bu15.setFont(new Font("Tahoma", Font.PLAIN, 14));
								bu15.setBackground(Color.WHITE);
								lp=new JLabel("   PUBLISHED INSERTION");
								lp.setFont(new Font("Tahoma", Font.PLAIN, 16));
								lp.setVerticalAlignment(SwingConstants.TOP);
								lp.setBounds(100, 30, 400, 30); 
								lp1 = new JLabel(" NEWS Id:");  
								lp1.setFont(new Font("Tahoma", Font.PLAIN, 14));
								lp2 = new JLabel("PUBLISHER ID:");  
								lp2.setFont(new Font("Tahoma", Font.PLAIN, 14));	          	
							       tp1 = new JTextField();  
							       tp2 = new JTextField();  	        	       
							       lp1.setBounds(80, 70, 200, 30);  
							       lp2.setBounds(80, 110, 200, 30);  	       	       
							       tp1.setBounds(300, 70, 200, 30);  
							       tp2.setBounds(300, 110, 200, 30);  	       	       
							       bu15.setBounds(170, 350, 100, 30); 
								p4.getContentPane().add(tp1);p4.getContentPane().add(tp2);p4.getContentPane().add(bu15);p4.getContentPane().add(lp1);p4.getContentPane().add(lp2);p4.getContentPane().add(lp);
	
								 bu16=new JButton("modify");
									bu16.setFont(new Font("Tahoma", Font.PLAIN, 14));
									bu16.setBackground(Color.WHITE);
									lq=new JLabel("   PUBLISHED MODIFICATION");
									lq.setFont(new Font("Tahoma", Font.PLAIN, 16));
									lq.setVerticalAlignment(SwingConstants.TOP);
									lq.setBounds(100, 30, 400, 30); 
									lq1 = new JLabel(" NEWS Id:");  
									lq1.setFont(new Font("Tahoma", Font.PLAIN, 14));
									lq2 = new JLabel("PUBLISHER ID:");  
									lq2.setFont(new Font("Tahoma", Font.PLAIN, 14));	          	
								       tq1 = new JTextField();  
								       tq2 = new JTextField();  	        	       
								       lq1.setBounds(80, 70, 200, 30);  
								       lq2.setBounds(80, 110, 200, 30);  	       	       
								       tq1.setBounds(300, 70, 200, 30);  
								       tq2.setBounds(300, 110, 200, 30);  	       	       
								       bu16.setBounds(170, 350, 100, 30); 
									q4.getContentPane().add(tq1);q4.getContentPane().add(tq2);q4.getContentPane().add(bu16);q4.getContentPane().add(lq1);q4.getContentPane().add(lq2);q4.getContentPane().add(lq);
		
									bu17=new JButton("delete");
									bu17.setFont(new Font("Tahoma", Font.PLAIN, 14));
									bu17.setBackground(Color.WHITE);
									lr=new JLabel("   PUBLISHED DELETION");
									lr.setFont(new Font("Tahoma", Font.PLAIN, 16));
									lr.setVerticalAlignment(SwingConstants.TOP);
									lr.setBounds(100, 30, 400, 30); 
									lr1 = new JLabel(" NEWS Id:");  
									lr1.setFont(new Font("Tahoma", Font.PLAIN, 14));
									lr2 = new JLabel("PUBLISHER ID:");  
									lr2.setFont(new Font("Tahoma", Font.PLAIN, 14));	          	
								       tr1 = new JTextField();  
								       tr2 = new JTextField();  	        	       
								       lr1.setBounds(80, 70, 200, 30);  
								       lr2.setBounds(80, 110, 200, 30);  	       	       
								       tr1.setBounds(300, 70, 200, 30);  
								       tr2.setBounds(300, 110, 200, 30);  	       	       
								       bu17.setBounds(170, 350, 100, 30); 
									r4.getContentPane().add(tr1);r4.getContentPane().add(tr2);r4.getContentPane().add(bu17);r4.getContentPane().add(lr1);r4.getContentPane().add(lr2);r4.getContentPane().add(lr);
								
							
								
							
	i1.addActionListener(this);
	i2.addActionListener(this);
	i3.addActionListener(this);
	i4.addActionListener(this);
	i5.addActionListener(this);
	i6.addActionListener(this);
	i7.addActionListener(this);
	i8.addActionListener(this);
	i9.addActionListener(this);
	a.addActionListener(this);
	b.addActionListener(this);
	c.addActionListener(this);
	a1.addActionListener(this);
	b1.addActionListener(this);
	c1.addActionListener(this);	
	a2.addActionListener(this);
	b2.addActionListener(this);
	c2.addActionListener(this);	
	
		
}

	public void actionPerformed(ActionEvent e) {    
		if(e.getSource()==i1) {
		p.setVisible(true);
		bu.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String s1 = tf1.getText();  
           String s2 = tf2.getText();   
           String s3 =  tf3.getText(); 
           String s4 = tf4.getText();  
           String s5 = tf5.getText();  
           
           if (true) 
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
                   PreparedStatement ps = con.prepareStatement("insert into user_ values(?,?,?,?,?)");  
                   ps.setString(1, s1);  
                   ps.setString(2, s2);  
                   ps.setString(3, s3);  
                   ps.setString(4, s4);  
                   ps.setString(5, s5);  
           
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)   
                   {  
                       JOptionPane.showMessageDialog(bu, "Data Inserted Successfully");  
                   }  
               }  
               catch (Exception ex)   
               {  
                   System.out.println(ex);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(bu, "not possible");  
           }   
         }   
         
} 
});
	  }
		if(e.getSource()==i2){
		q.setVisible(true);
		bu1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {

        {  
           int x = 0;  
           String s1 = tff1.getText();  
           String s2 = tff2.getText();   
           String s3 = tff3.getText(); 
           String s4 = tff4.getText();  
           String s5 = tff5.getText();   
           if (true) 
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya"); 
			String query="update user_ set user_name=? ,user_email=? ,user_password=? ,user_add=?"+"where user_id=?";
		     PreparedStatement ps = con.prepareStatement(query);  
                  ps.setString(1, s2);  
                   ps.setString(2, s3);  
                   ps.setString(3, s4);  
                   ps.setString(4, s5);  
                   ps.setString(5, s1);
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)   
                   {  
                       JOptionPane.showMessageDialog(bu1, "Data Updated Successfully");  
                   }  
               }  
               catch (Exception ex)   
               {  
                   System.out.println(ex);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(bu1, "not possible");  
           }   
         }   
         
} 
});
		
		}
		if(e.getSource()==i3) {
		r.setVisible(true);
		 
		bu2.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
        	{ 
        		 String s1 = tif1.getText();
           int x = 0;    
           if (true) 
           {  
               try  
               {  
                   Class.forName("oracle.jdbc.driver.OracleDriver");  
                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya"); 
			String query="delete from user_ where user_id=?";
		     PreparedStatement ps = con.prepareStatement(query); 
			ps.setString(1, s1);  
                   ResultSet rs = ps.executeQuery();  
                   x++;  
                   if (x > 0)   
                   {  
                       JOptionPane.showMessageDialog(bu2, "Data Deleted Successfully");  
                   }  
			//conn.close();
               }  
               catch (Exception ex)   
               {  
                   System.out.println(ex);  
               }  
           }  
           else  
           {  
               JOptionPane.showMessageDialog(bu2, "not possible");  
           }   
         }   
         
	} 
	});

		}
		if(e.getSource()==i4) {  
		 s.setVisible(true);
		 bu3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {

			        {  
			           int x = 0;  
			           String s1 = t1.getText();  
			           String s2 = t2.getText();   
			           String s3 =  t3.getText(); 
			           String s4 = t4.getText();  
			           String s5 = t5.getText();
				   String s6 = t6.getText();  
			           
			           if (true) 
			           {  
			               try  
			               {  
			                   Class.forName("oracle.jdbc.driver.OracleDriver");  
			                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
			                   PreparedStatement ps = con.prepareStatement("insert into news1 values(?,?,?,?,?,?)");  
			                   ps.setString(1, s1);  
			                   ps.setString(2, s2);  
			                   ps.setString(3, s3);  
			                   ps.setString(4, s4);  
			                   ps.setString(5, s5); 
					   ps.setString(6, s6); 
			           
			                   ResultSet rs = ps.executeQuery();  
			                   x++;  
			                   if (x > 0)   
			                   {  
			                       JOptionPane.showMessageDialog(bu3, "Data Inserted Successfully");  
			                   }  
			               }  
			               catch (Exception ex)   
			               {  
			                   System.out.println(ex);  
			               }  
			           }  
			           else  
			           {  
			               JOptionPane.showMessageDialog(bu3, "not possible");  
			           }   
			         }   
			         
			} 
			});
		 
		}
		if(e.getSource()==i5)  {      
		t.setVisible(true);
		bu4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = ta1.getText();  
		           String s2 = ta2.getText();   
		           String s3 =  ta3.getText(); 
		           String s4 = ta4.getText();  
		           String s5 = ta5.getText();
			   String s6 = ta6.getText();  
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		                  String query="update news1 set news_type=? ,title=? ,short_descr=? ,read_date=? ,publishername=?"+"where news_id=?";
		                  PreparedStatement ps = con.prepareStatement(query);  
		                   ps.setString(1, s2);  
		                   ps.setString(2, s3);  
		                   ps.setString(3, s4);  
		                   ps.setString(4, s5);  
		                   ps.setString(5, s6); 
		                   ps.setString(6, s1); 
		           
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu4, "Data updated Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu4, "not possible");  
		           }   
		         }   
		         
		} 
		});
		
		}
		if(e.getSource()==i6)  {      
		p1.setVisible(true);
		bu5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = tc1.getText();  
		          
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		                  String query="delete from news1 where news_id=?";
		                  PreparedStatement ps = con.prepareStatement(query);  
		                   ps.setString(1, s1);  
		                  
		           
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu5, "Data deleted Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu5, "not possible");  
		           }   
		         }   
		         
		} 
		});
		}
		if(e.getSource()==i7)  {      
		q1.setVisible(true);
		bu6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = td1.getText();  
		          String s2 = td2.getText();   
		           String s3 =  td3.getText(); 
		           String s4 = td4.getText();  
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		                  PreparedStatement ps = con.prepareStatement("insert into advertisement1 values(?,?,?,?)"); 
		                   ps.setString(1, s1);  
		                   ps.setString(2, s2);  
		                   ps.setString(3, s3);  
		                   ps.setString(4, s4);  
		           
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu6, "Data inserted Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu6, "not possible");  
		           }   
		         }   
		         
		} 
		});
		}
		if(e.getSource()==i8)   {     
		r1.setVisible(true);
		bu7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = te1.getText();  
		          String s2 = te2.getText();   
		           String s3 =  te3.getText(); 
		           String s4 = te4.getText();  
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		                  String query="update advertisement1 set adv_type=? ,adv_title=? ,adv_date=?"+"where adv_id=?";
				     PreparedStatement ps = con.prepareStatement(query); 
		                   ps.setString(1, s2);  
		                   ps.setString(2, s3);  
				    ps.setString(3, s4);  
				     ps.setString(4, s1);  
		           
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu7, "Data updated Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu7, "not possible");  
		           }   
		         }   
		         
		} 
		});
		
		}
		if(e.getSource()==i9)    {    
		s1.setVisible(true);
		bu8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = th1.getText();  
		          
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		                  String query="delete from advertisement1 where adv_id=?";
				     PreparedStatement ps = con.prepareStatement(query); 
		                   ps.setString(1, s1);  
		                   
		           
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu8, "Data deleted Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu8, "not possible");  
		           }   
		         }   
		         
		} 
		});
		
		}
		if(e.getSource()==a)  {      
		p2.setVisible(true);
		bu9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = tj1.getText();  
		          String s2 = tj2.getText();   
		           String s3 = tj3.getText(); 
		           String s4 = tj4.getText();  
		         
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		                  PreparedStatement ps = con.prepareStatement("insert into publisher values(?,?,?,?)"); 
		                   ps.setString(1, s1);  
		                    ps.setString(2, s2);  
		                   ps.setString(3, s3);  
		                   ps.setString(4, s4);  
		                   
		           
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu9, "Data inserted Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu9, "not possible");  
		           }   
		         }   
		         
		} 
		});
		
		}
		if(e.getSource()==b)    {    
		q2.setVisible(true);
		bu10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = tk1.getText();  
		          String s2 = tk2.getText();   
		           String s3 = tk3.getText(); 
		           String s4 = tk4.getText();  
		         
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		                 String query="update publisher set pub_name=? ,pub_email=? ,pub_date=?"+"where pub_id=?";
				     PreparedStatement ps = con.prepareStatement(query);
		                   ps.setString(1, s2);  
		                    ps.setString(2, s3);  
		                   ps.setString(3, s4);  
		                   ps.setString(4, s1);  
		                   
		           
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu10, "Data updated Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu10, "not possible");  
		           }   
		         }   
		         
		} 
		});
		}
		if(e.getSource()==c)   {     
		r2.setVisible(true);
		
		bu11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = tm1.getText();  	        	         
		        
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		                 String query="delete from publisher where pub_id=?";
				     PreparedStatement ps = con.prepareStatement(query);
		                   ps.setString(1, s1);  		                    		            
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu11, "Data deleted Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu11, "not possible");  
		           }   
		         }   
		         
		} 
		});
		}
		if(e.getSource()==a1) {       
		p3.setVisible(true);
		
		bu12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = tn1.getText();  
		           String s2 = tn2.getText();  	
		           String s3 = tn3.getText();  
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		                PreparedStatement ps = con.prepareStatement("insert into read values(?,?,?)");
		                   ps.setString(1, s1);  
		                    ps.setString(2,s2);
		                   ps.setString(3,s3);
		           
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu12, "Data inserted Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu12, "not possible");  
		           }   
		         }   
		         
		} 
		});
		}
		if(e.getSource()==b1) {       
		q3.setVisible(true);
		bu13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = to1.getText();  
		           String s2 = to2.getText();  	
		           String s3 = to3.getText();  
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		              	 String query="update read set news_id=?,adv_id=?"+"where user_id=?";
				     PreparedStatement ps = con.prepareStatement(query);  
		                   ps.setString(1, s2);  
		                    ps.setString(2,s3);
		                   ps.setString(3,s1);
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu13, "Data updated Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu13, "not possible");  
		           }   
		         }   
		         
		} 
		});
		
		}
		if(e.getSource()==c1)  {      
		r3.setVisible(true);
		bu14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = tu1.getText();  
		           
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		              	 String query="delete read where user_id=?";
				     PreparedStatement ps = con.prepareStatement(query);  
		                   ps.setString(1, s1);  
		                    
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu14, "Data deleted Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu14, "not possible");  
		           }   
		         }   
		         
		} 
		});
		
		}
		if(e.getSource()==a2) {        
		p4.setVisible(true);
		bu15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = tp1.getText();  
		           String s2 = tp2.getText();  
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");   
		              	 PreparedStatement ps = con.prepareStatement("insert into published values(?,?)");
		                   ps.setString(1, s1);  
		                    ps.setString(2, s2);  
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu15, "Data inserted Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu15, "not possible");  
		           }   
		         }   
		         
		} 
		});
		}
		if(e.getSource()==b2) {       
		q4.setVisible(true);
		bu16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = tq1.getText();  
		           String s2 = tq2.getText();  
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");                 	 
					String query="update published set pub_id=?"+"where news_id=?";		  
				   PreparedStatement ps = con.prepareStatement(query);  
		                   ps.setString(1, s2);  
		                    ps.setString(2, s1);  
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu16, "Data updated Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu16, "not possible");  
		           }   
		         }   
		         
		} 
		});
		
		}
		if(e.getSource()==c2)   {     
		r4.setVisible(true);
		bu17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

		        {  
		           int x = 0;  
		           String s1 = tr1.getText();  
		           
		           
		           if (true) 
		           {  
		               try  
		               {  
		                   Class.forName("oracle.jdbc.driver.OracleDriver");  
		                   Connection con=DriverManager.getConnection("jdbc:oracle:thin:@DESKTOP-VUQHR63:1521:xe","system","sravya");                 	 
					String query="delete from published where news_id=?";		  
				   PreparedStatement ps = con.prepareStatement(query);  
		                   ps.setString(1, s1);  		                      
		                   ResultSet rs = ps.executeQuery();  
		                   x++;  
		                   if (x > 0)   
		                   {  
		                       JOptionPane.showMessageDialog(bu17, "Data deleted Successfully");  
		                   }  
		               }  
		               catch (Exception ex)   
		               {  
		                   System.out.println(ex);  
		               }  
		           }  
		           else  
		           {  
		               JOptionPane.showMessageDialog(bu17, "not possible");  
		           }   
		         }   
		         
		} 
		});
		
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		new onlineNewsstands();
	}

}

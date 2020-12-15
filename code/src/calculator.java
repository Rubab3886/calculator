
import java.awt.event.*; 
import javax.swing.*; 
import java.awt.*; 
class calculator extends JFrame implements ActionListener { 
    static JFrame f; 
    static JTextField t; 
    String s0, s1, s2; 
    String str;
    calculator() 
    { 
        s0 = s1 = s2 = ""; 
    } 
    public static void main(String args[]) 
    { 
        f = new JFrame();
        calculator c = new calculator(); 
        t = new JTextField(16);
        t.setHorizontalAlignment(SwingConstants.RIGHT);
        t.setEditable(false);  
        JPanel p=new JPanel(null);
        t.setBounds(30,40,280,30);
    	JButton b0=new JButton("0");
    	JButton b1=new JButton("1");
    	JButton b2=new JButton("2");
    	JButton b3=new JButton("3");
    	JButton b4=new JButton("4");
    	JButton b5=new JButton("5");
    	JButton b6=new JButton("6");
    	JButton b7=new JButton("7");
    	JButton b8=new JButton("8");
    	JButton b9=new JButton("9");
    	JButton bc=new JButton("C");
    	JButton badd=new JButton("+");
    	JButton bmul=new JButton("*");
    	JButton bdivide=new JButton("/");
    	JButton bsub=new JButton("-");
    	JButton bequal=new JButton("=");
    	b1.setBounds(40,100,50,40);
    	b2.setBounds(110,100,50,40);
    	b3.setBounds(180,100,50,40);
    	badd.setBounds(250,100,50,40);
    	b4.setBounds(40,170,50,40);
    	b5.setBounds(110,170,50,40);
    	b6.setBounds(180,170,50,40);
    	bsub.setBounds(250,170,50,40);
    	b7.setBounds(40,240,50,40);
    	b8.setBounds(110,240,50,40);
    	b9.setBounds(180,240,50,40);
    	bmul.setBounds(250,240,50,40);
    	bc.setBounds(40,310,50,40);
    	b0.setBounds(110,310,50,40);
    	bequal.setBounds(180,310,50,40);
    	bdivide.setBounds(250,310,50,40);
    	p.add(t);
    	p.add(b1);
    	p.add(b2);
    	p.add(b3);
    	p.add(badd);
    	p.add(b4);
    	p.add(b5);
    	p.add(b6);
    	p.add(bsub);
    	p.add(b7);
    	p.add(b8);
    	p.add(b9);
    	p.add(bmul);
    	p.add(bc);
    	p.add(b0);
    	p.add(bequal);
    	p.add(bdivide);
    	f.add(p);
    	f.setSize(350, 450);
    	f.setVisible(true);
    	p.setBackground(Color.black);
    	b0.setBackground(Color.white);
    	b1.setBackground(Color.cyan);
    	b2.setBackground(Color.white);
    	b3.setBackground(Color.cyan);
    	b4.setBackground(Color.cyan);
    	b5.setBackground(Color.white);
    	b6.setBackground(Color.cyan);
    	b7.setBackground(Color.cyan);
    	b8.setBackground(Color.white);
    	b9.setBackground(Color.cyan);
    	bc.setBackground(Color.pink);
    	badd.setBackground(Color.yellow);
    	bmul.setBackground(Color.yellow);
    	bdivide.setBackground(Color.yellow);
    	bsub.setBackground(Color.yellow);
    	bequal.setBackground(Color.pink);
    	b1.addActionListener(c);
    	b2.addActionListener(c);
    	b3.addActionListener(c);
    	b4.addActionListener(c);
    	b5.addActionListener(c);
    	b6.addActionListener(c);
    	b7.addActionListener(c);
    	b8.addActionListener(c);
    	b9.addActionListener(c);
    	b0.addActionListener(c);
    	badd.addActionListener(c);
    	bdivide.addActionListener(c);
    	bmul.addActionListener(c);
    	bsub.addActionListener(c);
    	bequal.addActionListener(c);
    	bc.addActionListener(c); 
    } 
    public void actionPerformed(ActionEvent e) 
    { 
        String s = e.getActionCommand(); 
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9')) {
			if (!s1.equals("")) 
                s2 = s2 + s; 
            else if(s0.equals(str)) {
            	s0="";
            	s0=s0+s;
            }
            else
                s0 = s0 + s;  
            t.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == 'C') {  
            s0 = s1 = s2 = ""; 
            t.setText(s0 + s1 + s2); 
        } 
        else if (s.charAt(0) == '=') { 
  
            int te;
           
            if (s1.equals("+")) 
            {
            	te = (Integer.parseInt(s0) + Integer.parseInt(s2));
            	str=Integer.toString(te);
            }
            else if (s1.equals("-")) {
                te = (Integer.parseInt(s0) - Integer.parseInt(s2));
                str=Integer.toString(te);    
            }
            else if (s1.equals("/")) {
                te = (Integer.parseInt(s0) / Integer.parseInt(s2)); 
                str=Integer.toString(te);
            }
            else {
                te = (Integer.parseInt(s0) * Integer.parseInt(s2));  
                str=Integer.toString(te);}
            t.setText(s0 + s1 + s2 + "=" + te); 
            s0 = Integer.toString(te); 
  
            s1 = s2 = ""; 
        } 
        else { 
            if (s1.equals("") || s2.equals("")) 
                s1 = s; 
            else { 
                int te; 
                if (s1.equals("+")) {
                    te = (Integer.parseInt(s0) +Integer.parseInt (s2)); 
                    str=Integer.toString(te);
                }
                else if (s1.equals("-")) {
                    te = (Integer.parseInt(s0) - Integer.parseInt(s2)); 
                    str=Integer.toString(te);   
                }
                else if (s1.equals("/")) {
                    te = (Integer.parseInt(s0) / Integer.parseInt(s2)); 
                    str=Integer.toString(te);
                }
                else {
                    te = (Integer.parseInt(s0) * Integer.parseInt(s2)); 
                    str=Integer.toString(te);
                }
  
                s0 = Integer.toString(te); 
  
                s1 = s; 
  
                s2 = ""; 
            }  
            t.setText(s0 + s1 + s2); 
        } 
    } 
}
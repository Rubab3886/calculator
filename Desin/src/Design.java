
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.*; 
import javax.swing.*;
public class Design implements ActionListener{
 JFrame f;
 JTextField t1;
 JTextField t2;
 JButton b1,b2;
 JLabel l1,l2,l3,l4,l5;
 JScrollPane str;
 int countUpper=0;
 int countDigit=0;
 JTextArea a;
	Design(){
		f=new JFrame("TextBox Types");
		JPanel p=new JPanel();
		p.setLayout(null);
		l1=new JLabel("A multiLine TextBox  ");
		l2=new JLabel("that accepts tabs and ");
		l3=new JLabel("return keystrokes");
		b1=new JButton("Get text");
		l4=new JLabel("Caps only !!");
		t1=new JTextField();
		t2=new JTextField();
		b2=new JButton("Decode Password");
		l5=new JLabel("Password box");
		a=new JTextArea("type some stuff here(and hit the return and tab keys)");
		a.setLineWrap(true);
		a.setWrapStyleWord(true);
		str=new JScrollPane(a);
		str.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		b1.setBorder(BorderFactory.createBevelBorder(1));
		b2.setBorder(BorderFactory.createBevelBorder(1));
		t1.setBorder(BorderFactory.createBevelBorder(1));
		t2.setBorder(BorderFactory.createBevelBorder(1));
		a.setBorder(BorderFactory.createBevelBorder(1));
		str.setSize(400, 60);
		l1.setBounds(5,2,150,50);
		l2.setBounds(5,12,150,50);
		l3.setBounds(5,24,150,50);
		l4.setBounds(5,200,150,50);
		l5.setBounds(150,200,150,50);
		b1.setBounds(15,64,100,30);
		b2.setBounds(250,210,150,30);
		t1.setBounds(5,250,100,30);
		t2.setBounds(150,250,300,30);
		str.setBounds(150,2,290,170);
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(b1);
		p.add(b2);
		
		p.add(t1);
		p.add(t2);
		p.add(str);
		f.add(p);
		b2.addActionListener(this);
		l1.setForeground(Color.black);
		l2.setForeground(Color.black);
		l3.setForeground(Color.black);
		l4.setForeground(Color.black);
		l5.setForeground(Color.black);
		b1.setBackground(Color.gray);
		b2.setBackground(Color.gray);
		a.setBackground(Color.white);
		p.setBackground(Color.lightGray);
		f.setSize(500, 400);
		f.setVisible(true);
		
	}
public void actionPerformed(ActionEvent e) {
	String pass=t2.getText();
if(e.getSource()==b2) {
	if(pass.length()>10 ) {
		for(int i=0;i<pass.length();i++) {
			if(Character.isUpperCase(pass.charAt(i)))
				countUpper++;
			if(Character.isDigit(pass.charAt(i)))
				countDigit++;
		}
		
		if(countUpper>0)
		{
			if(pass.matches("(?=.*[~@#]).*")) {
			if(countDigit>=4) {
				JOptionPane.showMessageDialog(null," STRONG PASSWORD  ");
			}
			else {
				JOptionPane.showMessageDialog(null,"INVALID PASSWORD :digit must me more than 4");
				t2.setText("");
			}
			}
			else {
		JOptionPane.showMessageDialog(null,"INVALID PASSWORD :only @ and # allowed ");
		t2.setText("");
		}
		}
		else {
			JOptionPane.showMessageDialog(null,"INVALID PASSWORD :have atleast one capital letter ");
			t2.setText("");
		}
	}
	}
	else {
		JOptionPane.showMessageDialog(null,"INVALID PASSWORD :length should be greater than 10");
		t2.setText("");
	}
	
}
	
	public static void main(String args[]) {
	new Design();
	}

}


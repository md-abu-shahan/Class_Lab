package Layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Fourth extends JFrame{
    
    
    private Container c;
    private JLabel l1, l2,l3;
    private JTextField t1, t2,t3;
    private JButton b;
    private JPasswordField p;
    private Font f;

    Fourth() {
        
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Arial",Font.BOLD,20);
        
        l1 = new JLabel("Name :");
        l1.setBounds(90, 60, 130, 50);
        l1.setBackground(Color.YELLOW);
        l1.setFont(f);
        c.add(l1);

        l2 = new JLabel("Reg no.:");
        l2.setBounds(90, 120, 130, 50);
        l2.setFont(f);
        c.add(l2);
        
        
        l3 = new JLabel("Department :");
        l3.setBounds(90, 180, 130, 50);
        l3.setFont(f);
        c.add(l3);

        

        t1 = new JTextField();
        t1.setBounds(220, 60, 200, 50);
        t1.setFont(f);
        c.add(t1);
        
        t2 = new JTextField();
        t2.setBounds(220, 120, 200, 50);
        t2.setFont(f);
        c.add(t2);
        
        t3 = new JTextField();
        t3.setBounds(220, 180, 200, 50);
        t3.setFont(f);
        c.add(t3);
        
        
        
        b = new JButton("Sign Up");
        b.setBounds(200, 300, 100, 50);
        c.add(b);
        
    }
    
    public static void main(String[] args) {
        Fourth  f = new Fourth();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10,50,600,600);
        f.setTitle("Sign up");  
    }
}
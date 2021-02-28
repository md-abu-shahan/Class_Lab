package Layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class First extends JFrame {

    private Container c;
    private JLabel l1, l2;
    private JTextField t1, t2;
    private JButton b;
    private JPasswordField p;
    private Font f;

    First() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);

        f = new Font("Arial",Font.BOLD,20);
        
        l1 = new JLabel("Name :");
        l1.setBounds(90, 70, 130, 50);
        l1.setBackground(Color.YELLOW);
                l1.setFont(f);

        c.add(l1);

        l2 = new JLabel("Passward :");
        l2.setBounds(90, 130, 130, 50);
        l2.setFont(f);
        
        c.add(l2);

        b = new JButton("LOGIN");
        b.setBounds(200, 200, 70, 50);
        c.add(b);

        t1 = new JTextField();
        t1.setBounds(210, 70, 150, 50);
        t1.setForeground(Color.BLACK);
        t1.setBackground(Color.YELLOW);
        t1.setHorizontalAlignment(JTextField.CENTER);
                t1.setFont(f);

        c.add(t1);

        p = new JPasswordField();
        p.setBounds(210, 130, 150, 50);
        p.setEchoChar('*');
        p.setToolTipText("Passward");
        p.setForeground(Color.BLACK);
        p.setBackground(Color.YELLOW);
        p.setHorizontalAlignment(JTextField.CENTER);
        p.setFont(f);

        c.add(p);

    }

    public static void main(String[] args) {
        First f = new First();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(50, 50, 500, 400);
        f.setTitle("Login");
    }
}

package frame;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TEST4 extends JFrame {

    private Container c;
    private JLabel l, l2;
    private Font f;

    TEST4() {
        
        ImageIcon icon = new ImageIcon(getClass().getResource("shahan1.png"));
        setIconImage(icon.getImage());
        
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        f = new Font("Arial", Font.ITALIC, 12);

        l = new JLabel();
        
        l.setText("Enter your name : ");
        l.setToolTipText("name");
        
        System.out.println(""+l.getText());
        System.out.println(""+l.getToolTipText());
        
        l.setBounds(50, 10, 120, 50);
        l.setFont(f);

        l.setForeground(Color.red);
        l.setOpaque(true);
        l.setBackground(Color.PINK);
        
        c.add(l);

        
        
        
        
        
        
        
        
        l2 = new JLabel("Enter your passward :");
        l2.setBounds(50, 40, 130, 50);
        l2.setFont(f);
        c.add(l2);

    }

    public static void main(String[] args) {
        TEST4 f = new TEST4();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200, 200, 500, 300);
        f.setTitle("shahan");
        f.setResizable(true);
        // ImageIcon icon = new ImageIcon(getClass().getResource("shahan2.png"));

    }
}

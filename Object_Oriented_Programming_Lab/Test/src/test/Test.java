
package test;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Test extends JFrame{

    private Container c;
    private JLabel pic;
    private JButton b;
    private ImageIcon img;
    
    
            
            
    Test(){
        c =getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        img = new ImageIcon(getClass().getResource("SHAHAN.png"));

        pic = new JLabel(img);
        pic.setBounds(0, 0, img.getIconWidth(), img.getIconHeight());
        c.add(pic);
        
        b= new JButton("b");
        b.setBounds(10,10,100,100);
        c.add(b);
        pic.add(b);
    }
    public static void main(String[] args) {
    
        Test f= new Test();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,300,300);
    
    
    
    }
    
}

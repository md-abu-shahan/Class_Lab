package frame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class TEST5 extends JFrame{
    private Container c; 
    private ImageIcon img;
    private JLabel pic;
    
    TEST5(){

        img = new ImageIcon(getClass().getResource("shahan1.png"));
        
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.cyan);
        
        pic = new JLabel(img);
        pic.setBounds(10, 10,img.getIconWidth(), img.getIconHeight());
        c.add(pic);
        
        
        
    }
    
    
    public static void main(String[] args) {
        
        TEST5 f= new TEST5();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200,200,530,370);
        f.setTitle("shahan");
        f.setResizable(true);
    }
}

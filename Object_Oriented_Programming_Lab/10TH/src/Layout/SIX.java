
package Layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SIX extends JFrame{
    
    private Container c;
    private JLabel pic,l ,l1,l2,l3,l4;
    private JButton b;
    private ImageIcon img;
    private Font f;
    private JPanel p;
    
    SIX (){
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        p = new JPanel();
        p.setBounds(30,10,200,150);
        p.setBackground(Color.PINK);
        c.add(p);
        
        f = new Font("Arial",Font.BOLD,30) ;
        
        img = new ImageIcon(getClass().getResource("Perfact.png"));
        
        Image ic = img.getImage();
            Image newImage = ic.getScaledInstance(p.getWidth(),p.getHeight(),Image.SCALE_SMOOTH);
            img = new ImageIcon(newImage);
         
        pic = new JLabel(img);
        
        p.add(pic);
        
        
        
        l1 = new JLabel("Name : MD. Abu Shahan");
        l1.setBounds(310,10,200,50);
        c.add(l1);
        
        l2 = new JLabel("Department : Bsc(Engg) in CSE");
        l2.setBounds(310,60,200,50);
        c.add(l2);
        
        l3 = new JLabel("ID : 170103020017");
        l3.setBounds(310,110,200,50);
        c.add(l3);
        
        
        l4 = new JLabel("JAVA is Beautiful");
        l4.setBounds(100,200,300,50);
        l4.setFont(f);
        c.add(l4);
    }
    
    public static void main(String[] args) {
        SIX  f = new SIX();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10,50,600,300);
        f.setTitle("MY CARD");
    }
    
}

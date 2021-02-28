
package frame;

import java.awt.Color;
import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TEST3 extends JFrame{
//    private ImageIcon icon;
    private Container c; 
    
    TEST3(){
        ImageIcon icon = new ImageIcon(getClass().getResource("shahan2.png"));
        this.setIconImage(icon.getImage());
        c = this.getContentPane();
        c.setBackground(Color.BLUE);
    }
    
    
    public static void main(String[] args) {
        TEST3 f= new TEST3();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(200,200,400,300);
        f.setTitle("shahan");
        f.setResizable(true);
    }
}

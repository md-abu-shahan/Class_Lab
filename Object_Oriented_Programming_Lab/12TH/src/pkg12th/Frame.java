
package pkg12th;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;




public class Frame extends JFrame{
    
    private Container c;
    private JTextArea ta;
    private JTextField tf;
    private JButton b;
    
    
    Frame(){
        
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        ta = new JTextArea();
        ta.setBounds(10,10,450,250);
        c.add(ta);
        
        tf = new JTextField();
        tf.setBounds(10,265,350,90);
        c.add(tf);
        
        b =  new JButton("send");
        b.setBounds(370,265,100,70);
        c.add(b);
        
    }
    
    public static void main(String[] args) {
        Frame f = new Frame();
        f.setVisible(true);
        f.setBounds(100,100,500,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("server");
        
    }
    
}

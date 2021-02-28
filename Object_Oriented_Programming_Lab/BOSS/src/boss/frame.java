
package boss;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class frame extends JFrame implements ActionListener{
    
    private Container c;
    private JTextField l;
    private JButton b;
    
    
    
    frame(){
        
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.red);
        
        LocalTime localTime2 = LocalTime.now();
        DateTimeFormatter fo;
        fo= DateTimeFormatter.ofPattern("hh:mm:ss");
        String s = localTime2.format(fo);
        
        l= new JTextField(s);
        l.setBounds(10,10,100,50);
        c.add(l);
        
        b = new JButton("Update");
        b.setBounds(110,10,100,50);
        c.add(b);
        
        b.addActionListener(this);
        
    }
    
    public static void main(String[] args) {
        frame f = new frame();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100,100,500,400);
        f.setTitle("Time");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
       if(b==e.getSource()){
                             
        LocalTime localTime2 = LocalTime.now();
        DateTimeFormatter fo;
        fo= DateTimeFormatter.ofPattern("hh:mm:ss");
        String s = localTime2.format(fo);
           
           
           l.setText(s);
           System.out.println(s);
       }
    }    
}

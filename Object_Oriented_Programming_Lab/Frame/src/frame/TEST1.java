
package frame;

import javax.swing.JFrame;

public class TEST1 extends JFrame{
    public static void main(String[] args) {
//        JFrame f= new JFrame();
        
        TEST1 f=new TEST1();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
//        f.setSize(400, 300);
//        f.setLocation(200,200);
        
        f.setBounds(200,200,400,300);
//        f.setLocationRelativeTo(null);
        f.setTitle("title");
        f.setResizable(false);
        
        
        
    }
}
//setVisible();
//setDefaultCloseOperation();
//setSize();
//setLocation();
//setLocationRelativeTo();
//setTitle();
//setResizeble();
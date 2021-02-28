
package frame;

import javax.swing.JFrame;

public class TEST2 extends JFrame{
    TEST2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,400,300);
        setTitle("FRIENDS");
        
    }
    public static void main(String[] args) {
        TEST2 f=new TEST2();
    f.setVisible(true);
    }
    
    
}

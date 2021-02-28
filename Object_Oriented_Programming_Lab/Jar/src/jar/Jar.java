
package jar;





import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
//import static javax.swing.JOptionPane.ERROR_MESSAGE;

public class Jar {
    public Jar(){
        JFrame f=new JFrame("MySoftware");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600,400);
        f.setVisible(true);
        JButton jb=new JButton("Don't Click");
        MyClass mc2=new MyClass();
        jb.addActionListener(mc2);
        f.add(jb);
        f.validate();
    }

    public static void main(String[] args) {
        Jar j=new Jar();
    }
    
}
class MyClass implements ActionListener{
    public void actionPerformed(ActionEvent ae){
        System.out.println("button clicked");
        JOptionPane.showMessageDialog(null,"Hacked!!!","Warning",JOptionPane.ERROR_MESSAGE);
    }
}

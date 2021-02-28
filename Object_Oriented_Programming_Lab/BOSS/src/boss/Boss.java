
package boss;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Boss {

    public Boss() {
        JFrame f= new JFrame("MySoftWare");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 200);
        f.setVisible(true);
        JButton jb = new JButton("DON'T Click");
        MyClass2 mc2 = new MyClass2();
        jb.addActionListener(mc2);
        f.add(jb);
        f.validate();
    }
    public static void main(String[] args) {
        Boss b = new Boss();
    }
}



class MyClass2 implements ActionListener {

        public void actionPerformed(ActionEvent ae) {
            System.out.println("Button clicked");
JOptionPane.showMessageDialog(null, "Hacked!!!!" , "warning", JOptionPane.ERROR_MESSAGE);
        }
}
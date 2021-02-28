
package arithmatic;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frame {

    public Frame() {
        JFrame f = new JFrame("MySoftWare");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(600, 400);
        f.setVisible(true);

        JButton jb = new JButton("DON'T Click");
        
        f.add(jb);
        f.validate();
        MyClass2 mm = new MyClass2();
        jb.addActionListener(mm);
    }

    class MyClass2 implements ActionListener
    {

        public void actionPerformed(ActionEvent ae) {
            System.out.println("BUtton clicked");
            JOptionPane.showMessageDialog(null, "Hacked!!!!", "warning", JOptionPane.ERROR_MESSAGE);
        }

    }

    public static void main(String[] args) {
        Frame l = new Frame();
    }

}

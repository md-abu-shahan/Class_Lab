package Layout;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Second extends JFrame {

    private Container c;
    private JPanel p, p2, p3, p4;
    private JButton b1, b2, b3;

    Second() {
        c = getContentPane();
        c.setLayout(null);

        p = new JPanel();
        p.setLayout(null);
        p.setBounds(100, 100, 200, 200);
        p.setBackground(Color.red);
        c.add(p);

        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBounds(310, 100, 200, 200);
        p2.setBackground(Color.BLUE);
        c.add(p2);

        p3 = new JPanel();
        p3.setLayout(null);
        p3.setBounds(100, 310, 200, 200);
        p3.setBackground(Color.green);
        c.add(p3);

        p4 = new JPanel();
        p4.setLayout(null);
        p4.setBounds(310, 310, 200, 200);
        p4.setBackground(Color.yellow);
        c.add(p4);

    }

    public static void main(String[] args) {

        Second f = new Second();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10, 50, 600, 600);
        f.setTitle("panel ");
    }

}

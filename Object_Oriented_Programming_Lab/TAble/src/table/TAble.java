package table;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TAble extends JFrame implements ActionListener{

    private Container c;
    private JTextArea ta;
    private JScrollPane sp;
    private JTextField t1,t2;
    private JLabel t;
    private JTable ta1;
    private DefaultTableModel mo1;
    private JScrollPane sp1;
    private String[] col1 = {"Course code", "Course name", "Creade", "GPA"};
    private String[][] row1 = {{"1", "2", "3", "4"}};

    TAble() {
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.YELLOW);

        t1 = new JTextField();
        t1.setBounds(10, 10, 100, 50);
        c.add(t1);

        t2 = new JTextField();
        t2.setBounds(110, 10, 100, 50);
        c.add(t2);
        
        

//        ta = new JTextArea();
//        c.add(ta);
//
//        sp = new JScrollPane(ta, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//        sp.setBounds(50, 120, 200, 400);
//        c.add(sp);
        
        
        
//        t1.addKeyListener(new KeyListener() {
//            @Override
//            public void keyTyped(KeyEvent e) {
//                if(e.getKeyChar()=='a'){
//                    t2.setText("K\n");
//                }
//                
//            }
//            @Override
//            public void keyPressed(KeyEvent e) {
//                if(e.getKeyChar()=='a'){
//                    t2.setText("K\n");
//                }
//        
//            }
//
//            @Override
//            public void keyReleased(KeyEvent e) {
//               if(e.getKeyChar()=='a'){
//                    t2.setText("K\n");
//                }
//            }
//        });


t1.addActionListener(this);
t2.addActionListener(this);

    }

    public static void main(String[] args) {
        TAble f = new TAble();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(100, 100, 500, 400);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == t1){
            if("CSE".equals(t1.getText())){
                t2.setText("sd");
            } else{
                t2.setText("Calculas");
            }

        }
   

    }



}

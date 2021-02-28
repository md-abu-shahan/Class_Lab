package Layout;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Third extends JFrame{
    
        private Container c;
        private JMenuBar mb;
        private JMenu file,edit,help;
        private JTextArea ta;
        private JMenuItem newI,cut,about;
        
        
    Third(){
        c = getContentPane();
        c.setLayout(null);
        c.setBackground(Color.PINK);
        
        mb = new JMenuBar();
        this.setJMenuBar(mb);

        file = new JMenu("File");
        edit = new JMenu("Edit");
        help = new JMenu("Help");
        
        mb.add(file);
        mb.add(edit);
        mb.add(help);
        
        ta = new JTextArea();
        ta.setBounds(10,10,400,200);
        c.add(ta);
        
        newI = new JMenuItem("new");
        cut = new JMenuItem("cut");
        about = new JMenuItem("about");


       file.add(newI);
       
       edit.add(cut);
       
       
       help.add(about);
       
       newI.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,ActionEvent.CTRL_MASK));
    }
        
        
    public static void main(String[] args) {
        Third  f = new Third();
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(10,50,500,300);
        f.setTitle("Text viewer");
    }
}

package pkg12th;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Client {

     JFrame f;
     JTextField tf;
    PrintWriter pw;
     JButton b;

   public Client() {
        try {
            System.out.println("Connecting....");
            Socket s = new Socket("127.0.0.1", 3245);
            System.out.println("Successfuliy Created");

            pw = new PrintWriter(s.getOutputStream());
//            pw.println("hi");
//            pw.flush();

//            InputStream is = s.getInputStream();                       is
            BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
           f = new JFrame();
            f.setVisible(true);
            f.setSize( 400, 300);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setTitle("My Chat");
            
            f.setLayout(new FlowLayout());
            
            tf = new JTextField();
            tf.setPreferredSize(new Dimension(300,60));
            f.add(tf);
            
            b = new JButton("Send");
            
            b.addActionListener(new buttonListener());
            f.add(b);
            
            f.validate();
            
            
            
            String line = br.readLine();
            System.out.println("Recived = " + line);

        } catch (Exception e) {
            System.out.println("Error = " + e.getMessage());
        }
    }
    
    
   class buttonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           
            System.out.println("Button Clicked");
            String t = tf.getText();
            System.out.println("To Send "+t);
            pw.println(t);
            pw.flush();
           
        }
       
   }
    

    public static void main(String[] args) {
           Client c = new Client();
    }

}

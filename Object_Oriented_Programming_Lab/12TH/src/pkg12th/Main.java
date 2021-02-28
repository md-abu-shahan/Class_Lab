
package pkg12th;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import javax.swing.JFrame;

public class Main extends JFrame{

     private ServerSocket se;
    
    Main(){
            try{
            se = new ServerSocket(3245);
                System.out.println("Server Created");
                System.out.println("Waiting for client");
                Socket  s = se.accept();
                System.out.println("Connected");
                
                InputStream is = s.getInputStream();
                BufferedReader br = new BufferedReader(new InputStreamReader(is));
                
                String line = br.readLine();
                System.out.println("Line = "+line);
                
                PrintWriter pw = new PrintWriter(s.getOutputStream());
                
                pw.println("Hello");
                pw.flush();
                
                
      }catch(Exception e){
                System.out.println("Error = "+e.getMessage());
                e.printStackTrace();
      }
    }

   
    public static void main(String[] args) {
        
        Main p = new Main();
        
        
        
    }
    
}

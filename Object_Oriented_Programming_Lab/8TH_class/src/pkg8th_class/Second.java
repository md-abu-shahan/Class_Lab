
package pkg8th_class;

import java.io.PrintWriter;

public class Second {
     public static void main(String[] args) {
     String path = "D:\\java\\8TH_class\\src\\shahan2.txt";
     
     try{
         PrintWriter p = new PrintWriter(path);
         String line = "hello shahan";
         p.println(line);
         p.println("Okey");
         p.flush();
         p.close();
         
         
     }
     catch(Exception ex){
         System.out.println("Error ="+ex.getMessage());
     }
    }
}

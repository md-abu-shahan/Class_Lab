package pkg8th_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) {
        String path = "D:\\java\\8TH_class\\src\\shahan.txt";
        String path2 = "D:\\java\\8TH_class\\src\\shahan2.txt";

        try {
            FileReader f = new FileReader(path);
            BufferedReader br = new BufferedReader(f);
            PrintWriter p = new PrintWriter(path2);
            while (true) {
                String line = br.readLine();

                if (line == null) {
                    break;
                }

                String line2 = line;
                p.println(line2);

                p.flush();

                //System.out.println(line);
            }
            
        } catch (Exception ex) {
            System.out.println("Error =" + ex.getMessage());
        }

    }
}

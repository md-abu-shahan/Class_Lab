package pkg8th_class;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class Dec {

    public static void main(String[] args) {
        String path01 = "D:\\java\\8TH_class\\src\\Test.txt";
        try {
            FileReader f = new FileReader(path01);
            BufferedReader br = new BufferedReader(f);
            Scanner scan = new Scanner(System.in);
            String x = scan.nextLine();
            while (true) {
                String line = br.readLine();

                if (line == null) {
                    break;
                }
                String[] info = line.split("=");
                String s1 = info[0];
                String s2 = info[1];
                
                
                if (s1.equals(x)) {
                    System.out.println(s2);
                }

            }
        } catch (Exception ex) {
            System.out.println("Error =" + ex.getMessage());
        }
    }
}

package arithmatic;
import java.util.Scanner;
public class Arithmatic {

    public static void main(String[] args) {
        
        int x, y, answer;
        
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        
        Scanner scan1 = new Scanner(System.in);
        y = scan1.nextInt();
        
        answer = x+y;
        
        System.out.println("Answer " + answer);
    }   
}
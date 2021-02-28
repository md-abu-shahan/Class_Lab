package ifcondition;
import java.util.Scanner;

public class IfCondition {

    public static void main(String[] args) {
        
        System.out.println("Enter integer numbers");
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        
        if(x==10){
            System.out.println("Yes x equal 10");
        }
        else {
            System.out.println("NO x not equal to 10\n\n\n");
        }
    }
}
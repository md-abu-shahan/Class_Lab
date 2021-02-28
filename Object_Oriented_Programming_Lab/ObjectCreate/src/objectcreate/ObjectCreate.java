
package objectcreate;
import java.util.Scanner;
public class ObjectCreate{
    public static void main(){
        
        System.out.println("number");
        Scanner scan = new Scanner (System.in);
        String n =scan.nextLine();
        System.out.println("age");
        Scanner scan1 = new Scanner (System.in);
        int a =scan1.nextInt();
        System.out.println("number");
        Scanner scan2 = new Scanner (System.in);
        int nu =scan2.nextInt();
        Object x = new Object();
        x.print( n,a,nu );
    } 
}

class Object {
    
    private void first(String n,int a){
        System.out.println("name :"+n);
        System.out.println("age :"+a);
    }
    private void second(int nu){
        System.out.println("number :"+nu);
    }
    public void print(String n,int a,int nu){
        first( n, a);
        second( nu);
    }
}
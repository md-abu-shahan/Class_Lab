package shahan;

public class BasicMath {

    public static void main(String args[]) {

        System.out.println("Integer Arithmetic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        System.out.println("\nFloating Point Arithmetic");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - a;
        double de = -dd;
        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);

        System.out.println("\nSECOND");
        int x = 42;
        double y = 42.25;
        System.out.println("x mod 10 = " + x % 10);
        System.out.println("y mod 10 = " + y % 10);

        System.out.println("\nTHIRD");
        int s = 1;
        int t = 2;
        int u;
        int v;
        u = ++t;
        v = s++;
        u++;
        
        System.out.println("s = " + s);
        System.out.println("t = " + t);
        System.out.println("u = " + u);
        System.out.println("v = " + v);
    }
}

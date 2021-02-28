package eight;

class aA {

    int i, j;

    aA(int a, int b) {
        i = a;
        j = b;
    }
// display i and j

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
// Create a subclass by extending class A.

class bB extends aA {

    int k;

    bB(int a, int b, int c) {
        super(a, b);
        k = c;
    }
// overload show()

    void show(String msg) {
        System.out.println(msg + k);
    }
}

class Override2 {

    public static void main(String args[]) {
        bB subOb = new bB(1, 2, 3);
        subOb.show("This is k: "); // this calls show() in B
        subOb.show(); // this calls show() in A
    }
}

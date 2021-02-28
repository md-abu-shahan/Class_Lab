package eight;

class X {

    int i,j; // public by default
    //private int j; // private to A

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}
// A's j is not accessible here.

class C extends X {

    int total;

    void sum() {
        total = i + j; // ERROR, j is not accessible here
    }
}

class Access {

    public static void main(String args[]) {
        C subOb = new C();
        subOb.setij(10, 12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}

package eight;

class Ab {

    int i, j;

    Ab(int a, int b) {
        i = a;
        j = b;
    }
// display i and j

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class Ba extends Ab {

    int k;

    Ba(int a, int b, int c) {
        super(a, b);
        k = c;
    }
// display k – this overrides show() in A

    void show() {
        System.out.println("k: " + k);
    }
}

class Override {

    public static void main(String args[]) {
        Ba subOb = new Ba(1, 2, 3);
        subOb.show(); // this calls show() in B
    }
}








/*class Ba extends Ab {
int k;
Ba(int a, int b, int c) {
super(a, b);
k = c;
}
void show() {
super.show(); // this calls A's show()
System.out.println("k: " + k);
}
}*/
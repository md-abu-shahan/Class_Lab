package seven;

class Fest {

    int a, b;

    Fest(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Fest o) {
        o.a *= 2;
        o.b /= 2;
    }
}

class CallByRef {

    public static void main(String args[]) {
        Fest ob = new Fest(15, 20);
        System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
    }
}

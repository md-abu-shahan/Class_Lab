package eight;

class Aaa {

    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class Bbb extends Aaa {
// override callme()

    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class Ccc extends Aaa {
// override callme()

    void callme() {
        System.out.println("Inside C's callme method");
    }
}

class Dispatch {

    public static void main(String args[]) {
        Aaa a = new Aaa(); // object of type A
        Bbb b = new Bbb(); // object of type B
        Ccc c = new Ccc(); // object of type C
        Aaa r; // obtain a reference of type A
        r = a; // r refers to an A object
        r.callme(); // calls A's version of callme
        r = b; // r refers to a B object
        r.callme(); // calls B's version of callme

        r = c; // r refers to a C object
        r.callme(); // calls C's version of callme
    }
}

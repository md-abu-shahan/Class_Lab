package eight;

abstract class Abb {

    abstract void callme();
// concrete methods are still allowed in abstract classes

    void callmetoo() {
        System.out.println("This is a concrete method.");
    }
}

class Baa extends Abb {

    void callme() {
        System.out.println("B's implementation of callme.");
    }
}

class AbstractDemo {

    public static void main(String args[]) {
        Baa b = new Baa();
        b.callme();
        b.callmetoo();
    }
}

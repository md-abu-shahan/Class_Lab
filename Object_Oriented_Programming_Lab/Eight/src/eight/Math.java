package eight;

class Aaaa {

    final void meth() {
        System.out.println("This is a final method.");
    }
}

class Bbbb extends Aaaa {

    void math() { // ERROR! Can't override.
        System.out.println("Illegal!");
    }
}

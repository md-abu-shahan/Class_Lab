package eight;

// Using abstract methods and classes.
abstract class Figures {

    double dim1;
    double dim2;

    Figures(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
// area is now an abstract method

    abstract double area();
}

class Rectangles extends Figures {

    Rectangles(double a, double b) {
        super(a, b);
    }
// override area for rectangle

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}

class Triangles extends Figures {

    Triangles(double a, double b) {
        super(a, b);
    }
// override area for right triangle

    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}

class AbstractAreas {

    public static void main(String args[]) {
// Figure f = new Figure(10, 10); // illegal now
        Rectangles r = new Rectangles(9, 5);
        Triangles t = new Triangles(10, 8);
        Figures figref; // this is OK, no object is created
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
    }
}

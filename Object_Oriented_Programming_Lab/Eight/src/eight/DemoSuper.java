package eight;

class Boxx {

    private double width;
    private double height;
    private double depth;
// construct clone of an object

    Boxx(Boxx ob) { // pass object to constructor
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    Boxx(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
// constructor used when no dimensions specified

    Boxx() {
        width = -1; // use -1 to indicate
        height = -1; // an uninitialized
        depth = -1; // box
    }
// constructor used when cube is created

    Boxx(double len) {
        width = height = depth = len;
    }
// compute and return volume

    double volume() {
        return width * height * depth;
    }
}
// BoxWeight now fully implements all constructors.

class BoxxWeight extends Boxx {

    double weight; // weight of box
// construct clone of an object

    BoxxWeight(BoxxWeight ob) { // pass object to constructor
        super(ob);
        weight = ob.weight;
    }
// constructor when all parameters are specified

    BoxxWeight(double w, double h, double d, double m) {
        super(w, h, d); // call superclass constructor
        weight = m;
    }

    BoxxWeight() {
        super();
        weight = -1;
    }
// constructor used when cube is created

    BoxxWeight(double len, double m) {
        super(len);
        weight = m;
    }
}

class DemoSuper {

    public static void main(String args[]) {
        BoxxWeight mybox1 = new BoxxWeight(10, 20, 15, 34.3);
        BoxxWeight mybox2 = new BoxxWeight(2, 3, 4, 0.076);
        BoxxWeight mybox3 = new BoxxWeight(); // default
        BoxxWeight mycube = new BoxxWeight(3, 2);
        BoxxWeight myclone = new BoxxWeight(mybox1);
        double vol;
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
        System.out.println("Weight of mybox1 is " + mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);
        System.out.println("Weight of mybox2 is " + mybox2.weight);
        System.out.println();
        vol = mybox3.volume();
        System.out.println("Volume of mybox3 is " + vol);
        System.out.println("Weight of mybox3 is " + mybox3.weight);
        System.out.println();
        vol = myclone.volume();
        System.out.println("Volume of myclone is " + vol);
        System.out.println("Weight of myclone is " + myclone.weight);
        System.out.println();
        vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
        System.out.println("Weight of mycube is " + mycube.weight);
        System.out.println();
    }
}

package six;

public class Condtructor {

    public static void main(String args[]) {

        constant mybox1 = new constant();
        constant mybox2 = new constant();
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

class constant {

    double width;
    double height;
    double depth;


    constant() {
        System.out.println("Constructing Box");
        width = 10;
        height = 10;
        depth = 10;
    }


    double volume() {
        return width * height * depth;
    }
}

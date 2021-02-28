package six;

public class ParameterizedConstructors {

    public static void main(String args[]) {

        parameter mybox1 = new parameter(10, 20, 15);
        parameter mybox2 = new parameter(3, 6, 9);
        double vol;

        vol = mybox1.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

class parameter {

    double width;
    double height;
    double depth;

    parameter(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    
    double volume() {
        return width * height * depth;
    }
}

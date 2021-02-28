package six;

public class ObjectCreate {

    public static void main(String[] args) {

        Box mybox = new Box();
        Box mybox2 = new Box();

        double vol;
        mybox.width = 10;
        mybox.height = 20;
        mybox.depth = 15;
        vol = mybox.width * mybox.height * mybox.depth;
        System.out.println("Volume is " + vol);

        mybox2.width = 3;
        mybox2.height = 6;
        mybox2.depth = 9;
        vol = mybox2.width * mybox2.height * mybox2.depth;
        System.out.println("Volume is " + vol);

        vol = mybox.volume();
        System.out.println("Volume is " + vol);

        vol = mybox2.volume();
        System.out.println("Volume is " + vol);
    }
}

class Box {

    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
}

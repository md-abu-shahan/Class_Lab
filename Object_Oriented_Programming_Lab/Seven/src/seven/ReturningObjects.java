package seven;

class Best {

    int a;

    Best(int i) {
        a = i;
    }

    Best incrByTen() {
        Best temp = new Best(a + 10);
        return temp;
    }
}

public class ReturningObjects {

    public static void main(String args[]) {
        Best ob1 = new Best(2);
        Best ob2;
        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: "
                + ob2.a);
    }
}

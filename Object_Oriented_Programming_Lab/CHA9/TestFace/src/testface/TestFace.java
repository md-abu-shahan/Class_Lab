package testface;

public class TestFace {

    public static void main(String[] args) {
         Callback c = new Client();
        c.callback(42);
    }

}

class Client implements Callback{

    public void callback(int p) {
        System.out.println("callback called with " + p);
    }

    void nonIfaceMeth() {
        System.out.println("Classes that implement interfaces " + "may also define other members, too.");
    }
}

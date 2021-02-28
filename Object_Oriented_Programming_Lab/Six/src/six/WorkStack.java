package six;

public class WorkStack {

    public static void main(String args[]) {
        CreateStack mystack1 = new CreateStack();
        CreateStack mystack2 = new CreateStack();

// push some numbers onto the stack
        for (int i = 0; i < 12; i++) {
            mystack1.push(i);
        }
        for (int i = 10; i < 20; i++) {
            mystack2.push(i);
        }
// pop those numbers off the stack
        System.out.println("Stack in mystack1:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack1.pop());
        }
        System.out.println("Stack in mystack2:");
        for (int i = 0; i < 10; i++) {
            System.out.println(mystack2.pop());
        }
    }
}

package iftest3;

public class IFTest3 {

    public static void main(String[] args) {
        IntStack mystack; 
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        mystack = ds;
        for (int i = 0; i < 12; i++) {
            mystack.push(i);
        }
        mystack = fs;
        for (int i = 0; i < 8; i++) {
            mystack.push(i);
        }
        mystack = ds;
        System.out.println("Values in dynamic stack:");
        for (int i = 0; i < 12; i++) {
            System.out.println(mystack.pop());
        }
        mystack = fs;
        System.out.println("Values in fixed stack:");
        for (int i = 0; i < 8; i++) {
            System.out.println(mystack.pop());
        }
    }

}
interface IntStack {

    void push(int item);

    int pop();
}

class DynStack implements IntStack {

    private int stck[];
    private int tos;

    DynStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; 
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;
        }
    }
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}

class FixedStack implements IntStack {

    private int stck[];
    private int tos;

    FixedStack(int size) {
        stck = new int[size];
        tos = -1;
    }

    public void push(int item) {
        if (tos == stck.length - 1) {
            int temp[] = new int[stck.length * 2]; 
            for (int i = 0; i < stck.length; i++) {
                temp[i] = stck[i];
            }
            stck = temp;
            stck[++tos] = item;
        } else {
            stck[++tos] = item;
        }
    }
    public int pop() {
        if (tos < 0) {
            System.out.println("Stack underflow.");
            return 0;
        } else {
            return stck[tos--];
        }
    }
}



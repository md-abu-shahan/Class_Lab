
package eight;

class Aa {
int i;
}
// Create a subclass by extending class A.
class Bb extends Aa {
int i; // this i hides the i in A
Bb(int a, int b) {
super.i = a; // i in A
i = b; // i in B
}
void show() {
System.out.println("i in superclass: " + super.i);
System.out.println("i in subclass: " + i);
}
}
class UseSuper {
public static void main(String args[]) {
Bb subOb = new Bb(1, 2);
subOb.show();
}
}

package eight;
class AA {
AA() {
System.out.println("Inside A's constructor.");
}
}
// Create a subclass by extending class A.
class BB extends AA {
BB() {
System.out.println("Inside B's constructor.");
}
}
// Create another subclass by extending B.
class CC extends BB {
CC() {
System.out.println("Inside C's constructor.");
}
}
class CallingCons {
public static void main(String args[]) {
CC c = new CC();
}
}
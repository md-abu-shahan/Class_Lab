package shahan;
public class Shift {
    public static void main(String args[]) {
        byte a = 64, b;
        int i;
        i = a << 2;
        b = (byte) (a << 2);
        System.out.println("Original value of a: " + a);
        System.out.println("i and b: " + i + " " + b);

        System.out.println("\nsecond");
        int num = 0xF;
        for (int j = 0; j < 4; j++) {
            num = num << 1;
            System.out.println(num);
        }

        System.out.println("\nright shift");
        int c = 32;
        c = c >> 2;
        System.out.println(c);

        System.out.println("\nHexaDecimal");
        char hex[] = {
            '0', '1', '2', '3', '4', '5', '6', '7',
            '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'
        };
        byte d = (byte) 0xf1;
        
        System.out.println("d = 0x" + hex[(d >> 4) & 0x0f] + hex[d & 0x0f]);
    }
}
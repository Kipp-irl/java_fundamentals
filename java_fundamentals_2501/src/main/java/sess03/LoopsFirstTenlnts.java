package sess3;

/**
 *
 * @author vkoech
 */
public class LoopsFirstTenInts {

    public static void main(String args[]) {
        // Variable to be used in the program
        int n;

        System.out.println("First ten integers using a for loop.");
        for (n = 1; n <= 10; n++) {
            System.out.printf("%02d\n", n);
        }

        System.out.println("First ten integers using a while loop.");
        n = 1; // reassign n to 1
        while (n <= 10) {
            System.out.printf("%02d\n", n);
            n++;
        }

        System.out.println("First ten integers using a do-while loop.");
        n = 1; // reassign n to 1
        do {
            System.out.printf("%02d\n", n);
            n++;
        } while (n <= 10);
    }
}

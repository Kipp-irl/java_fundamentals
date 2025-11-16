
package sess03;

/**
 *
 * @author vkoech
 */
public class starDoWhilePattern {

    // main method begins program execution
    public static void main(String[] args) {

        // Variables to be used in the program
        int row = 1, col;

        do { // Outer loop

            col = 1;

            // Inner loop
            do {
                System.out.printf("* ");
                col++;
            } while (col <= row);

            System.out.println(); // Move to next line after each row
            row++;

        } while (row <= 5); // Number of rows for the pattern
    }
}

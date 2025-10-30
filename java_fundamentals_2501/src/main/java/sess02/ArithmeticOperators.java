package sess02;

/**
 * Java program to demonstrate arithmetic operators
 * 
 * @author vkoech
 */
public class ArithmeticOperators {
    public static void main(String[] args) {
        // Print header
        System.out.println("=".repeat(62));
        System.out.println("     JAVA ARITHMETIC OPERATORS DEMONSTRATION");
        System.out.println("=".repeat(62));
        System.out.println();

        // Variables to be used in the program
        int a = 10, b = 3;
        double x = 10.5, y = 3.0;

        // 1. Basic arithmetic operators +, -, *, /, %
        System.out.println("=".repeat(52));
        System.out.println("1. BASIC ARITHMETIC OPERATORS");
        System.out.println("=".repeat(52));

        // Table format for basic arithmetic operators
        System.out.printf("%-8s %-5s %-5s %-12s %-15s%n", "Op", "a=10", "b=3", "int Result", "double Result");
        System.out.println("-".repeat(52));
        System.out.printf("%-8s %-5d %-5d %-12d %-15s%n", "a + b", a, b, a + b, "N/A");
        System.out.printf("%-8s %-5d %-5d %-12d %-15s%n", "a - b", a, b, a - b, "N/A");
        System.out.printf("%-8s %-5d %-5d %-12d %-15s%n", "a * b", a, b, a * b, "N/A");
        System.out.printf("%-8s %-5.1f %-5.1f %-12s %-15.2f%n", "x / y", x, y, "N/A", x / y);
        System.out.printf("%-8s %-5d %-5d %-12d %-15s%n", "a % b", a, b, a % b, "N/A");
        System.out.println();

        // 2. Compound assignment operators
        System.out.println("=".repeat(52));
        System.out.println("2. COMPOUND ASSIGNMENT OPERATORS");
        System.out.println("=".repeat(52));

        int num = 5;
        System.out.printf("Initial num = %d\n", num);

        num += 3;
        System.out.printf("After num += 3 → %d\n", num);

        num -= 2;
        System.out.printf("After num -= 2 → %d\n", num);

        num *= 4;
        System.out.printf("After num *= 4 → %d\n", num);

        num /= 3;
        System.out.printf("After num /= 3 → %d\n", num);

        num %= 2;
        System.out.printf("After num %%= 2 → %d\n", num);

        System.out.println();

        // 3. Increment and Decrement operators
        System.out.println("=".repeat(52));
        System.out.println("3. INCREMENT & DECREMENT OPERATORS");
        System.out.println("=".repeat(52));

        int count = 10;
        System.out.printf("Initial count = %d\n", count);
        System.out.printf("Post-increment (count++) = %d\n", count++);
        System.out.printf("After post-increment, count = %d\n", count);
        System.out.printf("Pre-increment (++count) = %d\n", ++count);
        System.out.printf("Post-decrement (count--) = %d\n", count--);
        System.out.printf("After post-decrement, count = %d\n", count);
        System.out.printf("Pre-decrement (--count) = %d\n", --count);

        System.out.println();
        System.out.println("=".repeat(62));
        System.out.println("     END OF ARITHMETIC OPERATORS DEMO");
        System.out.println("=".repeat(62));
    }
}
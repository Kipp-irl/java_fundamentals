package sess04;

import java.util.Scanner;

/**
 * Java program to demonstrate the SimpleMath class methods
 * by performing basic arithmetic operations on two integers
 * entered by the user.
 * 
 * @author vkoech
 */
public class SimpleMathDemo {
    static Scanner sc = new Scanner(System.in);
    
    // main method begins program execution
    public static void main(String[] args) {
        // Prompt the user for values
        System.out.print("Please enter the first number to be used in the calculation → ");
        int firstNum = sc.nextInt();

        System.out.print("Please enter the second number to be used in the calculation → ");
        int secondNum = sc.nextInt();

        // Declare and instantiate a SimpleMath object
        SimpleMath sm = new SimpleMath();

        // Perform the various arithmetic operations
        long sum = sm.addNums(firstNum, secondNum);
        long difference = sm.subtractNums(firstNum, secondNum);
        long product = sm.multiplyNums(firstNum, secondNum);
        double quotient = sm.divideNums(firstNum, secondNum);
        int remainder = sm.modulusNums(firstNum, secondNum);
        double exponent = sm.powerNums(firstNum, secondNum);

        // Display the results of the arithmetic operations
        System.out.println("-".repeat(50));
        System.out.println("Results of Various Arithmetic Operations");
        System.out.println("-".repeat(50));

        System.out.printf("%d + %d = %d%n", firstNum, secondNum, sum);
        System.out.printf("%d - %d = %d%n", firstNum, secondNum, difference);
        System.out.printf("%d × %d = %d%n", firstNum, secondNum, product);
        System.out.printf("%d ÷ %d = %.2f%n", firstNum, secondNum, quotient);
        System.out.printf("%d %% %d = %d%n", firstNum, secondNum, remainder);
        System.out.printf("%d ^ %d = %.2f%n", firstNum, secondNum, exponent);

        System.out.println("-".repeat(50));
    }
}

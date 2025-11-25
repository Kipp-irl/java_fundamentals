package sess09;

/**
 *
 * @author Victor
 */

public class Mathematics {

    public static long addNums(String num1, String num2) throws InvalidNumberFormatException {
        try {
            long n1 = Long.parseLong(num1); // Try to convert num1 to integer
            long n2 = Long.parseLong(num2); // Try to convert num2 to integer
            return n1 + n2;
        } catch (NumberFormatException e) {
            throw new InvalidNumberFormatException("Invalid number format: " + e.getMessage());
        }
    }

    public static long multiplyNums(int num1, int num2){
        return (long)(num1 * num2); 
    }

    public static int subtractNums(int num1, int num2){
        return num1 - num2;
    }

    public static int divideNums(int num1, int num2) throws DivideByZeroException {
        if(num2 == 0) {
            throw new DivideByZeroException("Error: Division by zero is not allowed");
        }
        return num1 / num2;
    }

    // main method begins program execution
    public static void main(String[] args) {
        try {
            // Demonstrate the addNums method with valid and invalid input
            System.out.println("Result of adding '5' and '3' is: " + addNums("5", "3"));
            System.out.println("Result of adding '2' and 'ten' is: " + addNums("2", "ten"));

            // Demonstrate the multiplyNums method
            System.out.println("Result of multiplying '5' and '4' is: " + multiplyNums(5, 4));

            // Demonstrate the subtractNums method
            System.out.println("Result of subtracting '8' and '4' is: " + subtractNums(8, 4));

            // Demonstrate the divideNums method with valid and invalid input
            System.out.println("Result of dividing '10' and '5' is: " + divideNums(10, 5));
            System.out.println("Result of dividing '2' and '0' is: " + divideNums(2, 0));
        } 
        catch (InvalidNumberFormatException infe) {
            System.err.println("Error: " + infe.getLocalizedMessage());
        } 
        catch (DivideByZeroException dbze) {
            System.err.println("Error: " + dbze.getLocalizedMessage());
        } 
        catch (Exception e) { // General catch block
            System.err.println("Error: " + e.getLocalizedMessage());
        }
    }
}

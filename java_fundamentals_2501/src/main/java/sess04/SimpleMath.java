package sess4;

/**
 * Class used to perform basic arithmetic operations like addition, subtraction,
 * multiplication, division, modulus, and exponentiation.
 * 
 * @author vkoech
 */
public class SimpleMath {
    
    /**
     * This method returns the sum of the two integers passed in.
     * 
     * @param num1 the first integer to be added.
     * @param num2 the second integer to be added.
     * @return the sum of the two integers as a long value.
     */
    public long addNums(int num1, int num2) {
        return num1 + num2;
    }

    /**
     * This method returns the difference between two integers.
     * 
     * @param num1 the first integer.
     * @param num2 the second integer to subtract from the first.
     * @return the difference of the two integers as a long value.
     */
    public long subtractNums(int num1, int num2) {
        return num1 - num2;
    }

    /**
     * This method returns the product of the two integers passed in.
     * 
     * @param num1 the first integer to be multiplied.
     * @param num2 the second integer to be multiplied.
     * @return the product of the two integers as a long value.
     */
    public long multiplyNums(int num1, int num2) {
        return (long) num1 * num2;
    }

    /**
     * This method returns the result of dividing the first integer by the second.
     * If the second integer is zero, the method prints an error message and returns 0.
     * 
     * @param num1 the dividend (number to be divided).
     * @param num2 the divisor (number to divide by).
     * @return the result of the division as a double value.
     */
    public double divideNums(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Error: Division by zero");
            return 0;
        }
        return (double) num1 / num2;
    }

    /**
     * This method returns the remainder when the first integer is divided by the second.
     * 
     * @param num1 the dividend (number to be divided).
     * @param num2 the divisor (number to divide by).
     * @return the remainder of the division as an integer value.
     */
    public int modulusNums(int num1, int num2) {
        return num1 % num2;
    }

    /**
     * This method returns the result of raising the first integer to the power of the second.
     * 
     * @param num1 the base integer.
     * @param num2 the exponent integer.
     * @return the result of exponentiation as a double value.
     */
    public double powerNums(int num1, int num2) {
        return Math.pow(num1, num2);
    }
}

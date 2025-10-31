package sess02;

/**
 *
 * @author vkoech
 */
public class JavaPrimitiveTypes {

    public static void main(String[] args) {
        // Declare one variable for each of the primitive types
        byte byteVar = 0;
        short shortVar = 0;
        int intVar = 0;
        float floatVar = 0.0f;
        double doubleVar = 0.0;
        char charVar = '\u0000';
        boolean boolVar = false;

        System.out.println("=================================================");
        System.out.println("     JAVA PRIMITIVE DATA TYPES DEMONSTRATION");
        System.out.println("=================================================\n");

        // 1. Display the declared variables and their default values
        System.out.println("1. DECLARED VARIABLES AND THEIR DEFAULT VALUES");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-10s %-15s %-15s\n", "Type", "Variable", "Default Value");
        System.out.println("-----------------------------------------------");

        System.out.printf("%-10s %-15s %-15d\n", "byte", "byteVar", byteVar);
        System.out.printf("%-10s %-15s %-15d\n", "short", "shortVar", shortVar);
        System.out.printf("%-10s %-15s %-15d\n", "int", "intVar", intVar);
        System.out.printf("%-10s %-15s %-15.2f\n", "float", "floatVar", floatVar);
        System.out.printf("%-10s %-15s %-15.2f\n", "double", "doubleVar", doubleVar);
        System.out.printf("%-10s %-15s %-15d\n", "char", "charVar", (int) charVar); // char as ASCII value
        System.out.printf("%-10s %-15s %-15b\n", "boolean", "boolVar", boolVar);

        System.out.println("-----------------------------------------------\n");

        // 2. Display the size of the declared variables in bytes
        System.out.println("2. SIZE OF EACH PRIMITIVE TYPE IN BYTES");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-10s %-12s\n", "Type", "Size (Bytes)");
        System.out.println("-----------------------------------------------");
        System.out.printf("%-10s %-12d\n", "byte", Byte.BYTES);
        System.out.printf("%-10s %-12d\n", "short", Short.BYTES);
        System.out.printf("%-10s %-12d\n", "int", Integer.BYTES);
        System.out.printf("%-10s %-12d\n", "long", Long.BYTES);
        System.out.printf("%-10s %-12d\n", "float", Float.BYTES);
        System.out.printf("%-10s %-12d\n", "double", Double.BYTES);
        System.out.printf("%-10s %-12d\n", "char", Character.BYTES);
        System.out.printf("%-10s %-12s\n", "boolean", "JVM dependent (~1 byte)");
        System.out.println("-----------------------------------------------");

        // 3. Display the minimum and maximum values for the numeric types
        System.out.println("\n3. MINIMUM & MAXIMUM VALUES FOR EACH PRIMITIVE TYPE");
        System.out.println("---------------------------------------------------------------");
        System.out.printf("%-10s %-25s %-25s\n", "Type", "Minimum Value", "Maximum Value");
        System.out.println("---------------------------------------------------------------");

        System.out.printf("%-10s %-25d %-25d\n", "byte", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("%-10s %-25d %-25d\n", "short", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("%-10s %-25d %-25d\n", "int", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("%-10s %-25d %-25d\n", "long", Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("%-10s %-25.8e %-25.8e\n", "float", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("%-10s %-25s %-25s\n", "", "(Smallest positive normal: " + Float.MIN_NORMAL + ")", "");
        System.out.printf("%-10s %-25.8e %-25.8e\n", "double", Double.MIN_VALUE, Double.MAX_VALUE);
        System.out.printf("%-10s %-25s %-25s\n", "", "(Smallest positive normal: " + Double.MIN_NORMAL + ")", "");

        System.out.printf("%-10s U+%04X %-15s U+%04X\n", "char", (int) Character.MIN_VALUE, "", (int) Character.MAX_VALUE);
        System.out.printf("%-10s %-25s %-25s\n", "boolean", "false", "true");

        System.out.println("---------------------------------------------------------------");

    }
}

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
    }
}

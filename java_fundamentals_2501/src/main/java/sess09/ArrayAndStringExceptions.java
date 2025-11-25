package sess09;

/**
 *
 * @author Victor
 */
public class ArrayAndStringExceptions
{
    //=====================================
    // Class Methods
    //=====================================

    // 1. Trying to access an index that doesn't exist
    private static void demoArrayIndexOutOfBoundsException()
    {
        System.out.println("1. ArrayIndexOutOfBoundsException");
        System.out.println("\t__Occurs when you try to access an array with an "
                + "invalid index.\n");

        int[] numbers = {10,20,30,40,50};

        try
        {
            System.out.println("Try to access index 10, while the array size "
                    + "is: " + numbers.length + "...");
            System.out.println("Element at index 10 is: " + numbers[10]);
        }
        catch (ArrayIndexOutOfBoundsException aiobe)
        {
            System.err.println("Caught: " + aiobe
                    + "\nMessage: " + aiobe.getLocalizedMessage()
                    + "\nValid indices are 0 to " + (numbers.length - 1));
        }
    }

    // 2. Using a null array reference
    private static void demoNullPointerExceptionWithArray()
    {
        System.out.println("2. NullPointerException (Array)");
        System.out.println("\t__Occurs when you try to use an array that is null\n");

        int[] data = null;
        try
        {
            System.out.println("Try to get the number of elements (length) the "
                    + "null data array " + data.length + "...");
        }
        catch (NullPointerException npe)
        {
            System.err.println("Caught: " + npe + " "
                    + "\nYou must first initialise the data array."
                    + "\nSuggested fix/solution: int[] data = new int[5] or any "
                    + "other number for array size.");
        }
    }
    
    // 3. Storing the wrong type in an Object[] array
    private static void demoArrayStoreException()
    {
        System.out.println("3. ArrayStoreException");
        System.out.println("Occurs when you try to store incompatible types in an array.\n");

        // Declare an object array
        Object[] objects = new String[3];

        try
        {
            // Store elements in the object array
            objects[0] = "Hello";   // This is fine
            objects[1] = "World";   // This is fine
            objects[2] = 123;       // This will fail (ArrayStoreException)
            System.out.println("This Line won't print!");
        }
        catch (ArrayStoreException ase)
        {
            System.err.println("Caught: " + ase
                    + "\nCannot store integer primitives in a String array.");
        }
    }
    
    //4. Creating an array with negative size
    private static void demoNegativeArraySizeException(){
        System.out.println("4. NegativeArraySizeException");
        System.out.println("Occurs when you try use a negative value for" + "array size.");
        
        int size = -4;
        
        try{
            int[] nums = new int[size];
            System.out.println("The 'nums' array has been successfully created!");
        }catch(NegativeArraySizeException nase){
            System.err.println("Caught: " + nase + "" + "\nThe size of the array cannot be negative!:");
        }
    }
}

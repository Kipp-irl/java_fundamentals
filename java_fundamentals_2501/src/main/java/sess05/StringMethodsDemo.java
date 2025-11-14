package sess05;

/**
 * The {@code StringMethodsDemo} class demonstrates some commonly used methods
 * of the {@link java.lang.String} class in Java.
 *
 * @author vkoech
 */
public class StringMethodsDemo {

    public static void main(String[] args) {

        // Sample strings
        String s1 = "Java", s2 = "programming";
        String s3 = "hamburger", s4 = "urge";

        System.out.println(
                "------------- STRING CLASS METHODS DEMO -------------\n"
        );

        // 1. length()
        System.out.println("1. \tlength()");
        System.out.println("'" + s1 + "' has " + s1.length() + " characters.");
        System.out.println("'" + s2 + "' has " + s2.length() + " characters.\n");

        // 2. charAt()
        System.out.println("2. \tcharAt()");
        System.out.println("Character at index 1 in '" + s1 + "' is " + s1.charAt(1) + ".");
        System.out.println("Character at index 4 in '" + s2 + "' is " + s2.charAt(4) + ".\n");

        // 3. toUpperCase()
        System.out.println("3. \ttoUpperCase()");
        System.out.println("'" + s3 + "' in upper case = " + s3.toUpperCase());

        // 4. toLowerCase()
        System.out.println("4. \ttoLowerCase()");
        System.out.println("'" + s4 + "' in lower case = " + s4.toLowerCase() + "\n");

        // 5. equals()
        System.out.println("5. \tequals()");
        System.out.println("Does '" + s1 + "' equal 'Java'? " + s1.equals("Java"));
        System.out.println("Does '" + s1 + "' equal 'java'? " + s1.equals("java") + "\n");

        // 6. equalsIgnoreCase()
        System.out.println("6. \tequalsIgnoreCase()");
        System.out.println("Does '" + s1 + "' equal 'java'? "
                + s1.equalsIgnoreCase("java"));

        // 7. compareTo()
        System.out.println("7. \tcompareTo()");
        System.out.println("'" + s1 + "' compare to '" + s2 + "' gives: "
                + s1.compareTo(s2) + ".\n");

        // 8. substring()
        System.out.println("8. \tsubstring()");
        System.out.println("Substring of '" + s2 + "' from index 0 to 6: " + s2.substring(0, 6));
        System.out.println("Substring of '" + s3 + "' from index 3 to 8: " + s3.substring(3, 8) + "\n");

        // 9. indexOf()
        System.out.println("9. \tindexOf()");
        System.out.println("Index of 'a' in '" + s3 + "' is: " + s3.indexOf('a'));
        System.out.println("Index of '" + s4 + "' in '" + s4 + "' is: " + s4.indexOf(s4) + ".\n");

        // 10. lastIndexOf()
        System.out.println("10. \tlastIndexOf()");
        System.out.println("Last index of 'a' in '" + s3 + "' is: " + s3.lastIndexOf('a'));
        System.out.println("Last index of '" + s4 + "' in '" + s2 + "' is: " + s2.lastIndexOf(s4) + ".\n");

        // 11. contains()
        System.out.println("11. \tcontains()");
        System.out.println("Does '" + s3 + "' contain '" + s4 + "'? " + s3.contains(s4));
        System.out.println("Does '" + s3 + "' contain 'gram'? " + s3.contains("gram") + ".\n");

        // 12. startsWith()
        System.out.println("12. \tstartsWith()");
        System.out.println("Does '" + s2 + "' start with 'pro'? " + s2.startsWith("pro"));
        System.out.println("Does '" + s3 + "' start with 'ham'? " + s3.startsWith("ham") + ".\n");

        // 13. endsWith()
        System.out.println("13. \tendsWith()");
        System.out.println("Does '" + s2 + "' end with 'ing'? " + s2.endsWith("ing"));
        System.out.println("Does '" + s3 + "' end with 'ger'? " + s3.endsWith("ger") + ".\n");

        // 14. concat() → combines one string to the end of another
        System.out.println("14. \tconcat()");
        String combined = s1.concat(" ").concat(s2); // method chaining
        System.out.println("After concatenating '" + s1 + " ' + a space + '" 
                + s2 + "', we get : '" + combined + "'.\n");

        // 15. replace() → substitutes one string for another in a string
        System.out.println("15. \treplace()");
        System.out.println("Replacing 'a' with '@' in '" + s1 + "' gives: " 
                + s1.replace('a', '@') + "\n");
    }
}

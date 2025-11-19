package sess06;

/**
 * Java program to demonstrate the 'final' keyword in Java.
 * 1. final field → cannot be reassigned/modified after initialization
 * 2. final method → cannot be overridden in subclasses
 * 3. final class → cannot be extended (no subclasses allowed)
 *
 * @author Victor
 */
public class FinalKeywordDemo {
    public static void main(String[] args) {
        // 1. Demonstrate the final field
        System.out.println("==== 1. Final Field Demo ====");
        Person person = new Person(30, "Jane Mutisya");
        System.out.println(person);

        // Try to reassign Jane's ID (Uncomment to see compile error)
        // person.id = 21; // Error: Cannot assign a value to final variable 'id'

        // We can change Jane's age since it's not final
        person.setAge(23);
        System.out.println("After Jane's Birthday:\n" + person);

        // 2. Demonstrate the final method
        System.out.println("\n==== 2. Final Method Demo ====");
        Employee emp = new Employee(50000.0, "Alice");
        emp.setAge(25); // Set the employee's age
        System.out.println(emp.getDetails());

        // 3. Demonstrate the final class
        System.out.println("\n==== 3. Final Class Demo ====");
        MathUtils.add(20, 6);
        MathUtils.multiply(5, 8);
    }
}

// Demonstrate final field, method
class Person {
    private final int id;   // final field
    private String name;
    private int age;

    public Person(int id, String name) {
        this.id = id;  // Only place final field can be assigned
        this.name = name;
        this.age = 0;  // Default value
    }

    public int getId() { return this.id; }
    public String getName() { return this.name; }
    public int getAge() { return this.age; }
    public void setAge(int age) { this.age = age; }

    // Final method cannot be overridden in subclasses
    public final String getDetails() {
        return "Person Details" + "\n"
             + "ID No. : " + this.id + "\n"
             + "Name   : " + this.name + "\n"
             + "Age    : " + this.age;
    }

    @Override
    public String toString() {
        return getDetails();
    }
}

// Demonstrate final method inheritance restriction
class Employee extends Person {
    private double salary;

    public Employee(double salary, String name) {
        super((int)(Math.random() * 100000), name); // random id for demo
        this.salary = salary;
    }

    // Cannot override getDetails() because it's final in Person

    // Add more details to output if needed via different methods
    public String getEmployeeSummary() {
        return getDetails() + "\nSalary : " + salary;
    }
}

// Demonstrate final class (utility example)
final class MathUtils {
    // Static final constant
    public static final double PI = 3.14159265359;

    // Utility methods
    public static void add(int a, int b) {
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public static void multiply(int a, int b) {
        System.out.println(a + " × " + b + " = " + (a * b));
    }
    // Cannot subclass MathUtils due to 'final'
}

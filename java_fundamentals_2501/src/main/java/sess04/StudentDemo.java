package sess04;

/**
 * Java program to demonstrate creating Student objects and invoking their methods
 * 
 * @author vkoech
 */
public class StudentDemo {
    // main method begins program execution
    public static void main(String[] args) {
        // Declare and instantiate a Student object
        Student s1 = new Student();
        
        // Initialize the student object
        s1.initialiseStudent();
        
        // Display the student's details
        s1.displayDetails();
    }
}

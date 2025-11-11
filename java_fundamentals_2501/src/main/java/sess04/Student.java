package sess4;

/**
 * Java class to model a student object
 * 
 * @author vkoech
 */
public class Student {
    String studentID;
    String name;
    int age;
    char gender;
    
    // No-argument constructor
    public Student() {
        this.studentID = "";
        this.name = "";
        this.age = 0;
        this.gender = 'M';
    }
    
    // Student Initialiser
    public void initialiseStudent() {
        this.studentID = "S001";
        this.name = "Student One";
        this.age = 18;
        this.gender = 'M';
    }
    
    // Method to display student's details
    public void displayDetails() {
        System.out.println("Student Details");
        System.out.println("-".repeat(50));
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
        System.out.println("Student Gender: " + ((this.gender == 'm' || this.gender == 'M') ? "Male" : "Female"));
        System.out.println("-".repeat(50));
    }
}

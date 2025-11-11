/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess04;

/**
 * Java class to model a student object
 * 
 * @author vkoech
 */
public class Student {

    // Instance variables
    private String studentID;
    private String name;
    private int age;
    private char gender;

    // No-argument constructor
    public Student() {
        this.studentID = "";
        this.name = "";
        this.age = 0;
        this.gender = 'M';
    }

    // Student initializer
    public void initialiseStudent() {
        this.studentID = "S001";
        this.name = "Student One";
        this.age = 18;
        this.gender = 'M';
    }

    // Getters and setters
    public String getStudentID() {
        return this.studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return this.gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // Method to display student's details
    public void displayDetails() {
        System.out.println("Student Details");
        System.out.println("-".repeat(50));
        System.out.println("Student ID: " + this.studentID);
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
        System.out.println("Student Gender: " 
                + ((this.gender == 'm' || this.gender == 'M') ? "Male" : "Female"));
        System.out.println("-".repeat(50));
    }

    // toString method
    @Override
    public String toString() {
        return "Student Details\n"
                + "-".repeat(50)
                + "\nStudent ID: " + this.studentID
                + "\nStudent Name: " + this.name
                + "\nStudent Age: " + this.age
                + "\nStudent Gender: " 
                + ((this.gender == 'm' || this.gender == 'M') ? "Male" : "Female") + "\n"
                + "-".repeat(50);
    }
}

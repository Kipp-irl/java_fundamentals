/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess05;

import java.util.Scanner;

/**
 * Java program to analyse the score details of a class in various
 * subjects/modules
 *
 * @author vkoech
 */
public class TwoDimArray {

    //main method begins program execution
    public static void main(String[] args) {

        //Variables to be used in the program
        Scanner sc = new Scanner(System.in);
        int n = 0, i = 0; //looping variables
        int numOfStudents, numOfModules;  //Variables for the no. of students & modules/subjects.
        String[] studentNames, moduleNames;  //String array for the names of students and modules/subjects.
        int[] totalScore; 
        int[][] studScore;  //2D Integer array for individual scores
        float[] meanScore;  //Float array to hold each student's mean/avg. score
        char[] grade;  //Char array to hold each student's grade
        String[] comment; //String array to hold each student's performance comment.

        // Prompt the user for the number of students in the class and read in their names
        System.out.println("How many students are there in the class?");
        numOfStudents = sc.nextInt();
        studentNames = new String[numOfStudents];  //Instantiate the student names array
        
        for(n = 0; n < studentNames.length; n++){
            System.out.println("Please enter the name of student " + (n + 1));
            studentNames[n] = sc.next();  
        }
        
        // Prompt the user for the number of modules and read in their names
        System.out.println("How many modules/subjects are the students taking?");
        numOfModules = sc.nextInt();
        moduleNames = new String[numOfModules];  //Instantiate the module names array
        
        for(n = 0; n < moduleNames.length; n++){
            System.out.println("Please enter the name of module " + (n + 1));
            moduleNames[n] = sc.next();  
        }

        // Instantiate all the remaining arrays
        studScore = new int[numOfStudents][numOfModules];
        totalScore = new int[numOfStudents];
        meanScore = new float[numOfStudents];
        grade = new char[numOfStudents];
        comment = new String[numOfStudents];
        
        System.out.println("Arrays instantiated successfully!");
        System.out.println("Student scores array: " + numOfStudents + " x " + numOfModules);
    }
}
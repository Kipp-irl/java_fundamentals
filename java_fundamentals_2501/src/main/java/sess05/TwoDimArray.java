/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess05;

import java.util.Scanner;

/**
 * Java program to analyse the score details of a class in various subjects/modules
 *
 * @author vkoech
 */
public class TwoDimArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, i;
        int numOfStudents, numOfModules;
        String[] studentNames, moduleNames;
        int[] totalScore;
        int[][] studScore;
        float[] meanScore;
        char[] grade;
        String[] comment;

        // Prompt user for number of students
        System.out.print("How many students are there in the class? ");
        numOfStudents = sc.nextInt();
        studentNames = new String[numOfStudents];

        for (n = 0; n < studentNames.length; n++) {
            System.out.print("Please enter the name of student " + (n + 1) + ": ");
            studentNames[n] = sc.next();
        }

        // Prompt user for number of modules
        System.out.print("How many modules/subjects are the students taking? ");
        numOfModules = sc.nextInt();
        moduleNames = new String[numOfModules];

        for (n = 0; n < moduleNames.length; n++) {
            System.out.print("Please enter the name of module " + (n + 1) + ": ");
            moduleNames[n] = sc.next();
        }

        // Instantiate arrays
        studScore = new int[numOfStudents][numOfModules];
        totalScore = new int[numOfStudents];
        meanScore = new float[numOfStudents];
        grade = new char[numOfStudents];
        comment = new String[numOfStudents];

        // Prompt user for each student's score in each subject
        for (n = 0; n < studentNames.length; n++) {
            totalScore[n] = 0; // Initialize total for each student
            System.out.println("\nEnter scores for " + studentNames[n] + ":");

            for (i = 0; i < moduleNames.length; i++) {
                System.out.printf("Please enter %s's score in %s: ", studentNames[n], moduleNames[i]);
                studScore[n][i] = sc.nextInt();
                totalScore[n] += studScore[n][i]; // Add to total
            }

            // Calculate mean score
            meanScore[n] = totalScore[n] / (float) numOfModules;

            // Assign grade based on mean score
            if (meanScore[n] >= 70.0f) {
                grade[n] = 'A';
            } else if (meanScore[n] >= 60.0f) {
                grade[n] = 'B';
            } else if (meanScore[n] >= 50.0f) {
                grade[n] = 'C';
            } else if (meanScore[n] >= 40.0f) {
                grade[n] = 'D';
            } else {
                grade[n] = 'E';
            }

            // Assign comment based on grade
            switch (grade[n]) {
                case 'A':
                    comment[n] = "Excellent!";
                    break;
                case 'B':
                    comment[n] = "Very Good!";
                    break;
                case 'C':
                    comment[n] = "Good!";
                    break;
                case 'D':
                    comment[n] = "Fair!";
                    break;
                case 'E':
                    comment[n] = "Try Harder!";
                    break;
                default:
                    comment[n] = "Invalid grade!";
                    break;
            }
        }

        // Close input stream
        sc.close();

        // Display the results
        System.out.println("\n--------------------------------------------------------------------------");
        System.out.printf("%-14s", "Student Name");
        for (n = 0; n < moduleNames.length; n++) {
            System.out.printf("%-12s", moduleNames[n]);
        }
        System.out.printf("%-12s%-12s%-12s%-12s\n", "Total", "Average", "Grade", "Comment");
        System.out.println("--------------------------------------------------------------------------");

        for (n = 0; n < studentNames.length; n++) {
            System.out.printf("%-14s", studentNames[n]);

            for (i = 0; i < moduleNames.length; i++) {
                System.out.printf("%-12d", studScore[n][i]);
            }

            System.out.printf("%-12d%-12.2f%-12c%-12s\n",
                    totalScore[n], meanScore[n], grade[n], comment[n]);
        }

        System.out.println("--------------------------------------------------------------------------");
    }
}

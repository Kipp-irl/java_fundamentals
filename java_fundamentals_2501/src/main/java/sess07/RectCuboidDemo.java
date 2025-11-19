/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess07;

import java.util.Scanner;

/**
 * Java class to demonstrate creating Rectangle and Cuboid objects.
 * @author Victor
 */
public class RectCuboidDemo {

    // main method begins program execution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the dimensions of the rectangle
        System.out.println("Please enter the rectangle's length in cm:");
        int length = sc.nextInt();

        System.out.println("Please enter the rectangle's width in cm:\n");
        int width = sc.nextInt();

        // Declare and instantiate a Rectangle object with the user's dimensions
        Rectangle rect1 = new Rectangle(length, width);

        // Display the rectangle's dimensions (length, width)
        System.out.println("Rectangle Dimensions: " + rect1);

        // Declare a cuboid, then hard-code its values
        Cuboid c1 = new Cuboid(8, 5, 2);  // Example hardcoded dimensions: length=8, width=5, height=2

        // Display the cuboid's dimensions
        System.out.println("Cuboid Dimensions: " + c1);

        // Close the scanner
        sc.close();
    }
}

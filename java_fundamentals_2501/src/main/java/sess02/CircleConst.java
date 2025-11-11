/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package sess02;

/**
 * Java program to demonstrate the concept of constants and class variables.
 * @author vkoech
 */
public class CircleConst {
    //Class field constant to hold the value of PI
    static final float MYPI = 3.1415923f;
    
    //Class field variable to hold the input variable
    static Scanner sc;
    
    //main method begins program execution
    public static void main(String[] args){
        
        //method variables to be used in the program
        float radius, area, circumference;
        //Instatiate the class variable for user input
        sc = new Scanner(System.in);
        
        //Read in the Radius from the user
        System.out.println("Please enter the radius of the circle in cm and " + 
                "I'll tell oyu its area and circumeference");
        radius = sc.nextFloat;
        sc.close();//Close the input stream
        
        //Calculate the area and circumference
        area =(float) (MYPI * Math.pow(radius, 2));
        circumference = MYPI * (radius * 2);
        
        //Display the circle's dimensions
        System.out.println("Circle's Dimensions");
        System.out.println("-" .repeat(50));
        System.out.printf("%-15s : %7.1f cm.\n", "Radius", radius);
        System.out.printf("%-15s : %7.1f cm2.\n", "area", area);
        System.out.printf("%-15s : %7.1f cm.\n", "circumference", circumference);
        System.out.println("-" .repeat(50));
    }
    
    
}

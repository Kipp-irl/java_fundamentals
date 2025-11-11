/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess05;

/**
 * Java program to demonstrate the use of a single-dimensional array.
 * <p>
 * This program stores user ratings for a product in a one-dimensional
 * {@code byte[]} array, calculates the total and mean (average) ratings,
 * and then displays all ratings with computed results.
 * </p>
 * 
 * @author vkoech
 */
public class SingleDimArray {

    /**
     * The main entry point of the program.
     * <p>
     * Demonstrates basic operations with arrays such as declaration,
     * initialization, traversal, and arithmetic computation.
     * </p>
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {

        // ============================================================
        // Variable Declarations
        // ============================================================

        /**
         * A byte array to hold the user's rating of a product.
         * Ratings range between 1 (lowest) and 5 (highest).
         */
        byte[] userRating = {4, 3, 5, 4, 3, 2, 5, 4, 3, 5, 3, 5, 4};

        /**
         * An integer variable to hold the total of all ratings.
         */
        int totalRating = 0;

        /**
         * A floating-point variable to hold the mean (average) rating.
         */
        float meanRating;

        // ============================================================
        // Processing: Compute Total Rating
        // ============================================================

        /**
         * Use a for loop to calculate the total rating.
         */
        for (int n = 0; n < userRating.length; n++) {
            totalRating += userRating[n];
        }

        // Calculate the mean (average) rating
        meanRating = totalRating / (float) userRating.length;

        // ============================================================
        // Output Results
        // ============================================================

        System.out.println("All the product ratings are:");

        // Use a for-each loop to display all ratings
        for (byte curRating : userRating) {
            System.out.printf("%d, ", curRating);
        }

        System.out.println();

        // Display the total and mean rating
        System.out.printf(
                "The total rating is %d and the mean rating is %.2f out of 5.%n",
                totalRating, meanRating
        );
    }
}

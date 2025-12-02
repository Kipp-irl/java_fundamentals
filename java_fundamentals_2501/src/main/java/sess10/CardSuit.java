/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess10;

/**
 *
 * @author Victor
 */
public enum CardSuit {

    HEARTS("Hearts", "Red"),
    DIAMONDS("Diamonds", "Red"),
    CLUBS("Clubs", "Black"),
    SPADES("Spades", "Black");

    private String suitName;
    private String colour;

    private CardSuit(String suitName, String colour) {
        this.suitName = suitName;
        this.colour = colour;
    }

    public String getSuitName() {
        return suitName;
    }

    public void setSuitName(String suitName) {
        this.suitName = suitName;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format(
                "Suit Details" +
                "\n" + "-".repeat(55) +
                "\nSuit: %s" +
                "\nColour: %s" +
                "\n" + "-".repeat(55),
                suitName, colour
        );
    }

    // main method begins program execution
    public static void main(String[] args)
    {
        // Loop through all suits in the enumeration and display information
        System.out.println("Demonstrating the four suits in a standard deck of "
                + "playing cards:\n");

        for (CardSuit suit : CardSuit.values())
            System.out.println(suit);   // Display information about each suit
    }
}

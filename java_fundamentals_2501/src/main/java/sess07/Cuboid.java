package sess07;

/**
 * The {@code Cuboid} class represents a 3-dimensional cuboid with its length, width, and breadth.
 * It extends the {@code Rectangle} class and provides functionality for a cuboid.
 * 
 * @author Victor
 */
public class Cuboid extends Rectangle {

    // Instance fields
    // The breadth of the cuboid (in units)
    protected int breadth;

    // Getters & Setters

    /**
     * Returns the breadth of the cuboid (in units)
     * 
     * @return the cuboid's breadth (in units)
     */
    public int getBreadth() {
        return breadth;
    }

    /**
     * Sets the breadth of the cuboid (in units)
     * 
     * @param breadth the breadth to set (in units)
     */
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Constructors

    /**
     * Default constructor for the Cuboid class
     */
    public Cuboid() {
        super(); // Call the superclass constructor (Rectangle's default constructor)
        this.breadth = 0; // Default value for breadth
        this.name = "Cuboid"; // Set name to "Cuboid"
    }

    /**
     * Parameterized constructor for the Cuboid class
     * 
     * @param length the length of the cuboid
     * @param width the width of the cuboid
     * @param breadth the breadth of the cuboid
     */
    public Cuboid(int length, int width, int breadth) {
        super(length, width); // Call the superclass constructor with length and width
        this.breadth = breadth; // Set the breadth
        this.name = "Cuboid"; // Set name to "Cuboid"
    }

    // Instance Methods

    /**
     * Calculates and returns the rectangle's area (in square units).
     * 
     * @return the rectangle's area (in square units)
     */
    protected long calArea() {
        return (long) length * width; // Area of the rectangle: length * width
    }

    /**
     * Calculates and returns the cuboid's surface area (in square units).
     * 
     * @return the cuboid's surface area (in square units)
     */
    protected long calSurfaceArea() {
        return 2 * (this.calArea() * width + this.calArea() * breadth + length * breadth); // 2(lw + wb + lb)
    }

    /**
     * Calculates and returns the cuboid's perimeter (in units).
     * 
     * @return the cuboid's perimeter (in units)
     */
    protected long calPerimeter() {
        return 2 * (length + width); // Perimeter of the cuboid is considered as the perimeter of a rectangle
    }

    // Overridden methods

    /**
     * Returns the name of the cuboid
     * 
     * @return the name of the cuboid
     */
    @Override
    public String getName() {
        return this.name; // Return the name of the cuboid
    }

    /**
     * Returns a string representation of the cuboid details
     * 
     * @return a string representation of the cuboid details
     */
    @Override
    public String toString() {
        return this.getName() + " Details" + "\n" + "-".repeat(50)
                + "\nLength: " + this.length
                + "\nWidth: " + this.width
                + "\nBreadth: " + this.breadth
                + "\nArea: " + this.calArea()
                + "\nPerimeter: " + this.calPerimeter()
                + "\n" + "-".repeat(50)
                + "\nCuboid";
    }
}

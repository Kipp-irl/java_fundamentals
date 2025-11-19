package sess07;

/**
 * The {@code Rectangle} class represents a 2-dimensional Rectangle with its length and width.
 * It provides methods to compute its area and perimeter.
 *
 * @author Victor
 */
public class Rectangle extends Shape {

    protected long length;  // The length of the rectangle
    protected long width;   // The width of the rectangle

    /**
     * Default constructor that initializes the rectangle with default values.
     * Length and width are set to 0, and the name is set to "Rectangle".
     */
    public Rectangle() {
        super("Rectangle");  // Call to the superclass constructor to set the name
        this.length = 0;
        this.width = 0;
    }

    /**
     * Constructor that initializes the rectangle with the specified length and width.
     * The name is set to the default value "Rectangle".
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     */
    public Rectangle(long length, long width) {
        super("Rectangle");  // Call to the superclass constructor to set the name
        this.length = length;
        this.width = width;
    }

    /**
     * Constructor that initializes the rectangle with the specified length, width, and name.
     *
     * @param length the length of the rectangle
     * @param width the width of the rectangle
     * @param name the name of the rectangle
     */
    public Rectangle(long length, long width, String name) {
        super(name);  // Call to the superclass constructor to set the name
        this.length = length;
        this.width = width;
    }

    /**
     * Gets the name of the rectangle.
     *
     * @return the name of the rectangle
     */
    @Override
    public String getName() {
        return this.name;
    }

    /**
     * Calculates the area of the rectangle.
     *
     * @return the area of the rectangle
     */
    public long calcArea() {
        return length * width;
    }

    /**
     * Calculates the perimeter of the rectangle.
     *
     * @return the perimeter of the rectangle
     */
    public long calcPerimeter() {
        return 2 * (length + width);
    }

    /**
     * Returns a string representation of the rectangle, including its name, length, width,
     * area, and perimeter.
     *
     * @return a string with details of the rectangle
     */
    @Override
    public String toString() {
        return this.getName() + " Details" + "\n" + "-".repeat(50) +
               "\nLength: " + this.length +
               "\nWidth: " + this.width +
               "\nArea: " + this.calcArea() +
               "\nPerimeter: " + this.calcPerimeter() +
               "\n" + "-".repeat(50);
    }
}

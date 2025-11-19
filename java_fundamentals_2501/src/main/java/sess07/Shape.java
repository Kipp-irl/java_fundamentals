package sess07;

/**
 * The {@code Shape} class will be the super class of all shapes. It has a field name to
 * hold the shape's name and an abstract method `getName()` that returns the name of the shape.
 *
 * @author Victor
 */
public abstract class Shape {
    protected String name;  // The name of the shape

    /**
     * Constructor to initialize the name of the shape.
     * 
     * @param name the name of the shape
     */
    public Shape(String name) {
        this.name = name;
    }

    /**
     * Abstract method to get the name of the shape.
     * 
     * @return the name of the shape
     */
    public abstract String getName();
}

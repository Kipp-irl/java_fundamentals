/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess04;

/**
 * Java class to model a {@code Person} object.
 * <p>
 * This class defines a person's basic attributes such as name, gender, and age,
 * and provides methods to access and modify them.
 * </p>
 * 
 * @author vkoech
 */
public class person
{
    // ============================================================
    // Instance Fields
    // ============================================================

    /**
     * The person's full name.
     */
    protected String name;

    /**
     * The person's binary gender i.e.:
     * <ul>
     *   <li>'M' or 'm' for Male</li>
     *   <li>'F' or 'f' for Female</li>
     * </ul>
     */
    protected char gender;

    /**
     * The person's age in years (0 - 127).
     */
    protected byte age;

    // ============================================================
    // Constructors
    // ============================================================

    /**
     * Default no-argument constructor that <em>initialises</em> a
     * {@code Person} object with default values.
     */
    public person()
    {
    }

    /**
     * Parameterised constructor to <em>initialise</em> a person's
     * details using the values passed in as parameters.
     *
     * @param name   The person's full name.
     * @param gender The person's gender: 'M'/'m' for Male or 'F'/'f' for Female.
     * @param age    The person's age in years (0–127).
     */
    public person(String name, char gender, byte age)
    {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // ============================================================
    // Accessor (Getter) Methods
    // ============================================================

    /**
     * Retrieves the person's full name.
     *
     * @return The person's name.
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Retrieves the person's gender.
     *
     * @return The person's gender as a character.
     */
    public char getGender()
    {
        return this.gender;
    }

    /**
     * Retrieves the person's age.
     *
     * @return The person's age in years.
     */
    public byte getAge()
    {
        return this.age;
    }

    // ============================================================
    // Mutator (Setter) Methods
    // ============================================================

    /**
     * Updates the person's full name.
     *
     * @param name The new name to assign to this person.
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /**
     * Updates the person's gender.
     *
     * @param gender The new gender ('M'/'m' or 'F'/'f').
     */
    public void setGender(char gender)
    {
        this.gender = gender;
    }

    /**
     * Updates the person's age.
     *
     * @param age The new age to assign to this person.
     */
    public void setAge(byte age)
    {
        this.age = age;
    }

    // ============================================================
    // Overridden Methods
    // ============================================================

    /**
     * Returns a formatted string representation of the person's details.
     *
     * @return A string containing this person's information.
     */
    @Override
    public String toString()
    {
        return "Person Details\n"
                + "-".repeat(50)
                + "\nName: " + this.name
                + "\nGender: " + ((this.gender == 'm' || this.gender == 'M') ? "Male" : "Female")
                + "\nAge: " + this.age + "\n"
                + "-".repeat(50);
    }
}

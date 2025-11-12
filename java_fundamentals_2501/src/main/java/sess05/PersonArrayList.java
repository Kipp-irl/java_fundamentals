package sess05;

import sess04.Person;
import java.util.ArrayList;

/**
 * Java program to demonstrate the ArrayList class and some of its methods
 * 
 * @author vkoech
 */
public class PersonArrayList {

    // Instance method to display person details
    public void displayPerson(ArrayList<Person> pers) {
        System.out.println("The persons in the list are:");
        System.out.printf("%-12s %-10s %-3s%n", "Name", "Gender", "Age");

        // Use the for-each loop to display each individual person
        for (Person p : pers) {
            String gender = (p.getGender() == 'M' || p.getGender() == 'm') ? "Male" : "Female";
            System.out.printf("%-12s %-10s %-3d%n", p.getName(), gender, p.getAge());
        }

        // Display the number of people in the person ArrayList
        System.out.println("The number of persons in the list is: " + pers.size());
    }

    // Main method begins program execution
    public static void main(String[] args) {
        // Create an ArrayList of persons
        ArrayList<Person> psn = new ArrayList<>();

        // Add persons to the psn ArrayList
        psn.add(new Person("Jon", 'M', (byte) 22));
        psn.add(new Person("Claire", 'F', (byte) 19));
        psn.add(new Person("Mary", 'F', (byte) 32));
        psn.add(new Person("Johnson", 'M', (byte) 44));
        psn.add(new Person("Joey", 'M', (byte) 25));
        psn.add(new Person("Sally", 'F', (byte) 21));

        // Create an object of the PersonArrayList
        PersonArrayList pal = new PersonArrayList();

        // Display the persons added to the Person ArrayList
        pal.displayPerson(psn);

        // Add more persons after displaying
        System.out.println("\nAdding 2 more persons...");
        psn.add(new Person("Sadik", 'M', (byte) 27));
        psn.add(new Person("Jane", 'F', (byte) 23));

        // Display again to show all persons in the list
        System.out.println("Displaying all persons in the list:");
        pal.displayPerson(psn);
        
        //Add and remove a person from a specific index in the list 
        psn.add(2, new Person("Arya", 'F', (byte)22));
        psn.remove(1); //remove Claire
        System.out.println("After adding \"Ayra\" and removing \"Claire\"");
        pal.displayPerson(psn);
    }
}

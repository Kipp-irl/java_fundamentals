package sess05;

import sess04.person;
import java.util.ArrayList;

/**
 * Java program to demonstrate the ArrayList class and some of its methods
 * 
 * @author vkoech
 */
public class PersonArrayList {

    // Instance method to display person details
    public void displayPerson(ArrayList<person> pers) {
        System.out.println("The persons in the list are:");
        System.out.printf("%-12s %-10s %-3s%n", "Name", "Gender", "Age");

        // Use the for-each loop to display each individual person
        for (person p : pers) {
            String gender = (p.getGender() == 'M' || p.getGender() == 'm') ? "Male" : "Female";
            System.out.printf("%-12s %-10s %-3d%n", p.getName(), gender, p.getAge());
        }

        // Display the number of people in the person ArrayList
        System.out.println("The number of persons in the list is: " + pers.size());
    }

    // Main method begins program execution
    public static void main(String[] args) {
        // Create an ArrayList of persons
        ArrayList<person> psn = new ArrayList<>();

        // Add persons to the psn ArrayList
        psn.add(new person("Jon", 'M', (byte) 22));
        psn.add(new person("Claire", 'F', (byte) 19));
        psn.add(new person("Mary", 'F', (byte) 32));
        psn.add(new person("Johnson", 'M', (byte) 44));
        psn.add(new person("Joey", 'M', (byte) 25));
        psn.add(new person("Sally", 'F', (byte) 21));

        // Create an object of the PersonArrayList
        PersonArrayList pal = new PersonArrayList();

        // Display the persons added to the Person ArrayList
        pal.displayPerson(psn);

        // Add more persons after displaying
        System.out.println("\nAdding 2 more persons...");
        psn.add(new person("Sadik", 'M', (byte) 27));
        psn.add(new person("Jane", 'F', (byte) 23));

        // Display again to show all persons in the list
        System.out.println("Displaying all persons in the list:");
        pal.displayPerson(psn);
        
        //Add and remove a person from a specific index in the list 
        psn.add(2, new person("Arya", 'F', (byte)22));
        psn.remove(1); //remove Claire
        System.out.println("After adding \"Ayra\" and removing \"Claire\"");
        pal.displayPerson(psn);
    }
}

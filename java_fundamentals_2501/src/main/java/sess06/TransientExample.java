/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sess06;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.io.FileInputStream;
import java.io.Serializable;
import java.io.IOException;

/**
 * Java program to demonstrate the 'transient' keyword/modifier to prevent
 * the user's password from being serialized.
 *
 * @author Victor
 */
public class TransientExample {

    // main method begins program execution
    public static void main(String[] args) {
        // Create a user object with the provided details
        User user1 = new User("kipp", "victor@edulink.ac.ke", "password1234");

        // Display the details of the user before serialization
        System.out.println("The user's details before serialization: \n" + user1);

        // Serialize the user1 object to a file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("user.ser"))) {
            oos.writeObject(user1);
        } catch (IOException ioe) {
            System.err.println("The error: " + ioe.getLocalizedMessage() + " occurred!");
        }

        // Modify the object by changing the user's password
        user1.password = "password12345";

        // Deserialize the object from the file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("user.ser"))) {
            User deserializedUser = (User) ois.readObject();

            // Display the details of the user after deserialization
            System.out.println("The user's details after deserialization: \n" + deserializedUser);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("The error: " + e.getLocalizedMessage() + " occurred!");
        }
    }
}

class User implements Serializable {
    // Regular fields, will be serialized
    String username, email;

    // Transient field, will NOT be serialized
    transient String password;

    // Parameterized constructor
    public User(String username, String email, String password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    // Override the toString method for display purposes
    @Override
    public String toString() {
        return "User{username='" + username + "', email='" + email + "', password='" + password + "'}";
    }
}

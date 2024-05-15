import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName, lastName;
    private List<Contact> contact = new ArrayList<>();

    public Person(String firstName, String lastName) {
        if (firstName != null && lastName != null) {
            this.firstName = firstName;
            this.lastName = lastName;
        } else {
            throw new IllegalArgumentException("Name cannot be null.");
        }

    }

    public void addContact(Contact contact) {
        this.contact.add(contact);
    }
}

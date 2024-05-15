public class Main {
    public static void main(String[] args) {
        Contact contact1 = new Contact("0123456789", "mustermann_private@gmail.com", "Berlin Musterstr 22", 112233);
        Contact contact2 = new Contact("9876543210", "mustermann_work@gmail.com", "Berlin Musterstr 33", 112233);

        Person person1 = new Person("Max", "Mustermann");
        person1.addContact(contact1);
        person1.addContact(contact2);

        Person person2 = new Person("Lisa", "Mustermann");
        person2.addContact(contact1);

        Person person3 = new Person("Paul", "Mustermann");
        person3.addContact(contact2);

    }
}
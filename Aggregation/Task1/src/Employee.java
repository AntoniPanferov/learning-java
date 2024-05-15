public class Employee {
    private int id;
    private String name;
    private Address address;

    public Employee(int id, String name, Address address) {
        if (id < 0) {
            throw new IllegalArgumentException("ID must be a positive integer.");
        }

        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        if (address == null) {
            throw new IllegalArgumentException("Address cannot be null.");
        }

        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println(id + " " + name + " " + address.getStreet() + " " + address.getPostcode() + " " + address.getCity());
    }
}

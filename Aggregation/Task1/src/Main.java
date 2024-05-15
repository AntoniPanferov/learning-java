public class Main {
    public static void main(String[] args) {
        try {
            Employee employee = new Employee(1, "Mark", new Address("Musterstr. 11", "112233", "Berlin"));
            employee.display();
        } catch (IllegalArgumentException exception) {
            System.err.println("Invalid argument: " + exception.getMessage());
        }
    }
}
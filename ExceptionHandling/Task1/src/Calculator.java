import java.util.Scanner;

public class Calculator {
    private double a;
    private double b;

    public double readNumber()
    {
        System.out.println("Please enter the number:");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        if (number < -9999 || number > 9999 ) {
            throw new InvalidInputException("The number is not within the permitted range.");
            readNumber();
        }
        return number;
    }

    public void setFirstNumber(double a) {
        this.a = a;
    }

    public void setSecondNumber(double b) {
        this.b = b;
    }

    public double addTwoNumbers() {
        return a + b;
    }

    public double subtractTwoNumbers() {
        return a - b;
    }
    public double multiplyTwoNumbers() {
        return a * b;
    }
    public double divideTwoNumbers() {
        return a / b;
    }

    public void doAllOperations() {
        System.out.println(addTwoNumbers());
        System.out.println(subtractTwoNumbers());
        System.out.println(multiplyTwoNumbers());
        System.out.println(divideTwoNumbers());
    }
}

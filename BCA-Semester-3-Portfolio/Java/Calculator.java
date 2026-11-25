// A basic calculator using methods and a switch statement.
import java.util.Scanner;

public class Calculator {
    static double calculate(double a, double b, char operator) {
        switch (operator) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Unknown operator.");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = input.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = input.nextDouble();

        try {
            System.out.println("Result: " + calculate(a, b, operator));
        } catch (RuntimeException error) {
            System.out.println("Error: " + error.getMessage());
        }

        input.close();
    }
}

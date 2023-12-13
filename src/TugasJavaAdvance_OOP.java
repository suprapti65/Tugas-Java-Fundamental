import java.util.Scanner;

class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error! Cannot divide by zero.");
            return Double.NaN;
        }
    }

    public double modulus(double num1, double num2) {
        if (num2 != 0) {
            return num1 % num2;
        } else {
            System.out.println("Error! Cannot calculate modulus with divisor zero.");
            return Double.NaN;
        }
    }
}

public class TugasJavaAdvance_OOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Choose operation (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        double result = 0;

        switch (operator) {
            case '+':
                result = calculator.add(num1, num2);
                break;
            case '-':
                result = calculator.subtract(num1, num2);
                break;
            case '*':
                result = calculator.multiply(num1, num2);
                break;
            case '/':
                result = calculator.divide(num1, num2);
                break;
            case '%':
                result = calculator.modulus(num1, num2);
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        System.out.println("Result: " + result);
    }
}

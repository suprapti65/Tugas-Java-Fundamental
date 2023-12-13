public class TugasJavaAdvance_SwitchCase {

    public static double calculate(double num1, double num2, char operator) {
        double result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                } else {
                    System.out.println("Error: Modulus by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operator!");
        }

        return result;
    }

    public static void main(String[] args) {
        double num1 = 10;
        double num2 = 5;

        char operator = '+';
        double result = calculate(num1, num2, operator);
        System.out.println("Result: " + result);
    }
}

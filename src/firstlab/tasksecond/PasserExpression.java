package firstlab.tasksecond;

import java.util.Scanner;

public class PasserExpression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an expression: ");
        final double result = passer(scanner.nextLine());

        System.out.println(result);

        scanner.close();
    }

    private static double passer(final String expression) {
        if (expression.isEmpty())
            System.out.println("Expression is empty");

        String[] tokens = expression.replaceAll("[=\\?]", "").split(" ");
        if (tokens.length < 3)
            System.out.println("Expression is too short");

        double num1 = 0, num2 = 0;
        try {
            num1 = Double.parseDouble(tokens[0]);
            num2 = Double.parseDouble(tokens[2]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number in expression");
        }

        String operator = tokens[1];
        double result = 0;

        switch (operator) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 == 0)
                    System.out.println("Division by zero");
                else
                    result = num1 / num2;
                break;
            default:
                System.out.println("Invalid operator");
        }

        return result;
    }
}

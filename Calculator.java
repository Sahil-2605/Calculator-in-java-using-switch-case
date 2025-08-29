import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.println("1:Addition (+)");
        System.out.println("2:Substraction(-) ");
        System.out.println("3:Multiplication(*) ");
        System.out.println("4:Division(/) ");
        char operator = sc.next().charAt(0);

        System.out.println("\n--- Using switch-case ---");
        switch (operator) {
            case '1':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '2':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '3':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '4':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero!");
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }

        sc.close();
    }
}


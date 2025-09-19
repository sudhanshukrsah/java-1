import java.util.Scanner;
public class SimpleCalculatorSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        sc.close();
        double result;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("Cannot divide by zero.");
                    return;
                }
                result = a / b; break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        System.out.println("Result: " + result);
    }
}

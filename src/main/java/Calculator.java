import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        double num1, num2;
        do {
            System.out.println("------------Calculator Menu--------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Factorial");
            System.out.println("7. Power");
            System.out.println("8. Natural Log");
            System.out.println("9. Exit");
            System.out.print("Enter your choice (1-9): ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    performAddition(num1, num2);
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    performSubtraction(num1, num2);
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    performMultiplication(num1, num2);
                    break;
                case 4:
                    System.out.print("Enter the numerator: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the denominator: ");
                    num2 = scanner.nextDouble();
                    performDivision(num1, num2);
                    break;
                case 5:
                    System.out.print("Enter a non-negative number: ");
                    num1 = scanner.nextDouble();
                    performSquareRoot(num1);
                    break;
                case 6:
                    System.out.print("Enter a non-negative integer: ");
                    int num = scanner.nextInt();
                    performFactorial(num);
                    break;
                case 7:
                    System.out.print("Enter the base: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = scanner.nextDouble();
                    performPower(num1, num2);
                    break;
                case 8:
                    System.out.print("Enter a non-negative number: ");
                    num1 = scanner.nextDouble();
                    performLog(num1);
                    break;
                case 9:
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number from 1 to 8.");
            }
        } while (choice != 9);
        scanner.close();
    }

    public static double performAddition(double num1, double num2) {
        double result = num1 + num2;
        System.out.println("Result: " + result);
        return result;
    }
    public static double performSubtraction(double num1, double num2) {
        double result = num1 - num2;
        System.out.println("Result: " + result);
        return result;
    }

    public static double performMultiplication(double num1, double num2) {
        double result = num1 * num2;
        System.out.println("Result: " + result);
        return result;
    }

    public static double performDivision(double num1, double num2) {
        double result = 0;
        if (num2 != 0) {
            result = num1 / num2;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error! Division by zero is not allowed.");
        }
        return result;
    }
    public static double performLog(double x) {
        if (x <= 0) {
            throw new IllegalArgumentException("Input must be greater than 0");
        }
        double result= Math.log(x);
        System.out.println("Result: " + result);
        return result;
    }


    public static double performSquareRoot(double num) {
        if (num >= 0) {
            double result = Math.sqrt(num);
            System.out.println("Square root of " + num + " is: " + result);
            return result;
        } else {
            System.out.println("Error! Square root is defined only for non-negative numbers.");
        }
        return num;
    }
    public static long performFactorial(int num) {
        if (num < 0) {
            System.out.println("Error! Factorial is defined only for non-negative integers.");
            return 0;
        }
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("Factorial of " + num + " is: " + factorial);
        return factorial;
    }

    public static double performPower(double base, double exponent) {
        double result = Math.pow(base, exponent);
        System.out.println("Result: " + result);
        return result;
    }
}

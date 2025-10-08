import java.util.Scanner;

public class CalculatorApp {

    // Overloaded add methods
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Subtract method
    int subtract(int a, int b) {
        return a - b;
    }

    // Multiply method
    double multiply(double a, double b) {
        return a * b;
    }

    // Divide method (with exception handling)
    double divide(int a, int b) {
        try {
            if (b == 0)
                throw new ArithmeticException("Cannot divide by zero!");
            return (double) a / b;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalculatorApp calc = new CalculatorApp();

        int choice;
        do {
            System.out.println("\n=== Calculator Application ===");
            System.out.println("1. Add Numbers");
            System.out.println("2. Subtract Numbers");
            System.out.println("3. Multiply Numbers");
            System.out.println("4. Divide Numbers");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Choose addition type:");
                    System.out.println("1. Two integers");
                    System.out.println("2. Two doubles");
                    System.out.println("3. Three integers");
                    int type = sc.nextInt();

                    if (type == 1) {
                        System.out.print("Enter two integers: ");
                        int a = sc.nextInt(), b = sc.nextInt();
                        System.out.println("Result: " + calc.add(a, b));
                    } else if (type == 2) {
                        System.out.print("Enter two doubles: ");
                        double x = sc.nextDouble(), y = sc.nextDouble();
                        System.out.println("Result: " + calc.add(x, y));
                    } else if (type == 3) {
                        System.out.print("Enter three integers: ");
                        int p = sc.nextInt(), q = sc.nextInt(), r = sc.nextInt();
                        System.out.println("Result: " + calc.add(p, q, r));
                    } else {
                        System.out.println("Invalid type!");
                    }
                    break;

                case 2:
                    System.out.print("Enter two integers: ");
                    int s1 = sc.nextInt(), s2 = sc.nextInt();
                    System.out.println("Result: " + calc.subtract(s1, s2));
                    break;

                case 3:
                    System.out.print("Enter two doubles: ");
                    double m1 = sc.nextDouble(), m2 = sc.nextDouble();
                    System.out.println("Result: " + calc.multiply(m1, m2));
                    break;

                case 4:
                    System.out.print("Enter two integers: ");
                    int d1 = sc.nextInt(), d2 = sc.nextInt();
                    System.out.println("Result: " + calc.divide(d1, d2));
                    break;

                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
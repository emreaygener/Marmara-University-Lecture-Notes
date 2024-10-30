import java.util.*;
class Week5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // System.out.println( num1 + " / " + num2 + " is " + (num1 / num2));
        // if (num2 != 0) { //Quotient with if
        //     System.out.println( num1 + " / " + num2 + " is " + (num1 / num2));
        // } else {
        //     System.out.println("Division by zero is not allowed.");
        // }

        try {
            int result = QuotientWithException.quotient(num1, num2);
            System.out.println( num1 + " / " + num2 + " is " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception: an integer " + "cannot be divided by zero ");
        }
        try{
            System.out.println(QuotientWithException.setRadius(-1));
        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("Execution continues...");

    }
}

class QuotientWithMethod{

    public static int quotient(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("Division by zero is not allowed.");
            System.exit(1);
            return 0;
        } else {
            return num1 / num2;
        }
    }
}

class QuotientWithException {
    public static int quotient(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        } else {
            return num1 / num2;
        }
    }
    public static double setRadius(double radius) throws IllegalArgumentException {
        if (radius >= 0) {
            return radius;
        } else {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
    }
}
// Write an application that asks the user to enter two integers, obtains them from
// the user and prints the square of each, the sum of their squares, and the difference of 
// the squares (first
// number squared minus the second number)

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int numb1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int numb2 = scanner.nextInt();

        int sq1 = numb1 * numb1;
        int sq2 = numb2 * numb2;

        int squareSum = sq1 + sq2;
        int squareDiff = sq1 - sq2;

        // System.out.println("First number squared: " + sq1);
        // System.out.println("Second number squared: " + sq2);
        // System.out.println("Sum of squares: " + squareSum);
        // System.out.println("Difference of squares: " + squareDiff);

        System.out.printf("Square of %d is: %d%n", numb1, sq1);
        System.out.printf("Square of %d is: %d%n", numb2, sq2);
        System.out.printf("Sum of squares of %d and %d is: %d%n", numb1, numb2, squareSum);
        System.out.printf("Difference of squares of %d and %d is: %d%n", numb1, numb2, squareDiff);

        scanner.close();
    }
}

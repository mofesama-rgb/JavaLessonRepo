// 1. (Comparing Integers) Write an application that asks the user to enter one integer, obtains
// it from the user and displays whether the number and its square are greater than, 
// equal to, not equal
// to, or less than the number 100.

// 2. (Arithmetic, Smallest and Largest) Write an application that inputs three integers from 
// the user and displays the sum, average, product, smallest and largest of the numbers. 
// Note: The calculation of the average in this exercise should result in an integer representation 
// of the average. So, if the sum of the values is 7, the average should be 2, not 2.3333….]

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Exercise 1: Comparing Integers
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        int square = number * number;

        if (number > 100) {
            System.out.printf("The number is greater than 100.%n");
        }

        if (number == 100) {
            System.out.printf("The number is equal to 100.%n");
        }

        if (number != 100) {
            System.out.printf("The number is not equal to 100.%n");
        }

        if (number < 100) {
            System.out.printf("The number is less than 100.%n");
        }

        if (square > 100) {
            System.out.printf("The square is greater than 100.%n");
        }

        if (square == 100) {
            System.out.printf("The square is equal to 100.%n");
        }

        if (square != 100) {
            System.out.printf("The square is not equal to 100.%n");
        }

        if (square < 100) {
            System.out.printf("The square is less than 100.%n");
        }


        // Exercise 2: Arithmetic, Smallest and Largest
        System.out.print("\nEnter first integer: ");
        int number1 = scanner.nextInt();

        System.out.print("Enter second integer: ");
        int number2 = scanner.nextInt();

        System.out.print("Enter third integer: ");
        int number3 = scanner.nextInt();

        int sum = number1 + number2 + number3;
        int average = sum / 3;
        int product = number1 * number2 * number3;

        int smallest = number1;

        if (number2 < smallest) {
            smallest = number2;
        }

        if (number3 < smallest) {
            smallest = number3;
        }

        int largest = number1;

        if (number2 > largest) {
            largest = number2;
        }

        if (number3 > largest) {
            largest = number3;
        }

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);

        scanner.close();
    }
}
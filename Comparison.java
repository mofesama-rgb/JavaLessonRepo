import java.util.Scanner;

    public class Comparison {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first integer: ");
            int integer = scanner.nextInt();
            System.out.print("Enter second integer: ");
            int integer2 = scanner.nextInt();
            if (integer == integer2) {
                System.out.printf("%d == %d%n", integer, integer2);
            }
            scanner.close();
        }
    }


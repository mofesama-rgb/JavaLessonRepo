import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
        Scanner gbawole = new Scanner(System.in);
        System.out.print("Enter first value: ");
        int value1 = gbawole.nextInt();
        System.out.print("Enter second value: ");
        int value2 = gbawole.nextInt();
        int sum = value1 + value2;
        // System.out.printf( "Your first value is %d , Your second value is %d%nThe sum of your values is: %d%n", 
        // value1, value2, sum);
        System.out.println("Your first value is " + value1 + ",Your second value is " + value2 + 
        ", The sum of your values is: " + sum + ".");
    }
    }


// 1.  (Largest and Smallest Integers) Write an application that reads five integers and determines
// and prints the largest and smallest integers in the group. Use only the programming techniques you
// learned in this chapter.
// 2. (Divisible by 3) Write an application that reads an integer and determines and prints
// whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
// it’s divided by 3 with a remainder of 0.]
// 3. (Multiples) Write an application that reads two integers, determines whether the first
// number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
// remainder operator.]
// 4.  (World Population Growth Calculator) Search the Internet to determine the current world
// population and the annual world population growth rate. Write an application that inputs these values, 
// then displays the estimated world population after one, two, three, four and five years. 
// 5. (Statistics for the Great Pyramid of Giza) The Great Pyramid of Giza is considered an engineering 
// marvel of its time. Use the web to get statistics related to the Great Pyramid of Giza, and
// find the estimated number of stones used to build it, the average weight of each stone, and the 
// number of years it took to build. Create an application that calculates an estimate of how much, by
// weight, of the pyramid was built each year, each hour, and each minute as it was being built. The
// application should input the following information:  
// a) Estimated number of stones used. 
// b) Average weight of each stone. 
// c) Number of years taken to build the pyramid (assuming a year comprises 365 days).
// Solve for java using the printf and all in one file
import java.util.Scanner;

public class ExerciseAss {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== EXERCISE 1: Largest and Smallest Integers =====");
        System.out.print("Enter first integer: ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int number2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int number3 = scanner.nextInt();
        System.out.print("Enter fourth integer: ");
        int number4 = scanner.nextInt();
        System.out.print("Enter fifth integer: ");
        int number5 = scanner.nextInt();

        int largest = number1;
        if (number2 > largest) {
            largest = number2;
        }
        if (number3 > largest) {
            largest = number3;
        }
        if (number4 > largest) {
            largest = number4;
        }
        if (number5 > largest) {
            largest = number5;
        }

        int smallest = number1;
        if (number2 < smallest) {
            smallest = number2;
        }
        if (number3 < smallest) {
            smallest = number3;
        }
        if (number4 < smallest) {
            smallest = number4;
        }
        if (number5 < smallest) {
            smallest = number5;
        }

        System.out.printf("Largest: %d%n", largest);
        System.out.printf("Smallest: %d%n", smallest);


        System.out.println("\n===== EXERCISE 2: 2. Divisible by 3 =====");
        System.out.print("Enter an integer: ");
        int divisibleNumber = scanner.nextInt();
        if (divisibleNumber % 3 == 0) {
            System.out.printf("%d is divisible by 3.%n", divisibleNumber);
        }
        if (divisibleNumber % 3 != 0) {
            System.out.printf("%d is not divisible by 3.%n", divisibleNumber);
        }


        System.out.println("\n===== EXERCISE 3: Multiples =====");
        System.out.print("Enter first integer: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int secondNumber = scanner.nextInt();
        int tripled = firstNumber * 3;
        int doubled = secondNumber * 2;

        if (doubled != 0 && tripled % doubled == 0) {
            System.out.printf("%d tripled is a multiple of %d doubled.%n",
                    firstNumber, secondNumber);
        }

        if (doubled != 0 && tripled % doubled != 0) {
            System.out.printf("%d tripled is not a multiple of %d doubled.%n",
                    firstNumber, secondNumber);
        }


        System.out.println("\n===== EXERCISE 4: World Population Growth Calculator =====");

        long current_population = 8_300_678_395L;
        double annual_growthRate = 0.0084;

        System.out.printf("Current world population: %.0f%n", current_population);
        System.out.printf("Annual growth rate: %.2f%%%n", annual_growthRate * 100);

        long year1 = (long) (current_population * Math.pow(1 + annual_growthRate, 1));
        long year2 = (long) (current_population * Math.pow(1 + annual_growthRate, 2));
        long year3 = (long) (current_population * Math.pow(1 + annual_growthRate, 3));
        long year4 = (long) (current_population * Math.pow(1 + annual_growthRate, 4));
        long year5 = (long) (current_population * Math.pow(1 + annual_growthRate, 5));

        System.out.printf("Population after 1 year: %.0f%n", year1);
        System.out.printf("Population after 2 years: %.0f%n", year2);
        System.out.printf("Population after 3 years: %.0f%n", year3);
        System.out.printf("Population after 4 years: %.0f%n", year4);
        System.out.printf("Population after 5 years: %.0f%n", year5);


        System.out.println("\n===== EXERCISE 5: Great Pyramid of Giza =====");

        System.out.print("Enter estimated number of stones: ");
        double stones = scanner.nextDouble();
        //2.3 million stones

        System.out.print("Enter average weight of each stone in tons: ");
        double weightPerStone = scanner.nextDouble();
        //2.5 tons per stone

        System.out.print("Enter number of years taken to build: ");
        double years = scanner.nextDouble();
        //20 years of construction

        double totalWeight = stones * weightPerStone;

        double weightPerYear = totalWeight / years;

        double totalHours = years * 365 * 24;
        double weightPerHour = totalWeight / totalHours;

        double totalMinutes = totalHours * 60;
        double weightPerMinute = totalWeight / totalMinutes;

        System.out.printf("Total estimated weight: %.2f tons%n", totalWeight);
        System.out.printf("Weight built each year: %.2f tons%n", weightPerYear);
        System.out.printf("Weight built each hour: %.2f tons%n", weightPerHour);
        System.out.printf("Weight built each minute: %.2f tons%n", weightPerMinute);


        scanner.close();
    }
}
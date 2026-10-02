import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Account myAccount = new Account();

        System.out.printf("Initial Name is: %s%n%n", myAccount.getName());
        System.out.println("Enter your name: ");
        String myName = scanner.nextLine();
        myAccount.setName(myName);
        System.out.println();
        System.out.printf("My Account name is %s%n", myAccount.getName());
        scanner.close();


    }
}
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bankName = "UBA";

        Account myAccount = new Account();
        System.out.print("Enter your First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter your Last Name: ");
        String lastName = scanner.nextLine();
        myAccount.setName(lastName, firstName);
        System.out.println();

        System.out.printf("Welcome to %s.%nYour account name is: %s%n",bankName, myAccount.getName());
        scanner.close();

    }
    
}

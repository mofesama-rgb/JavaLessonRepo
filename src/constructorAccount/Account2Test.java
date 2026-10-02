import java.util.Scanner;

public class Account2Test {
    public static void main(String[] args) {
        Account2 account1 = new Account2("Mofe Wyatt", 200081.00);
        Account2 account2 = new Account2("Sunless", -777.00);
        System.out.printf("%s Balance: $%.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s Balance: $%.2f%n", account2.getName(), account2.getBalance());
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter deposit amount for Account1: ");
        double depositAmnt = scanner.nextDouble();
        System.out.printf("%n adding %.2f to Account1 balance %n%n", depositAmnt);
        account1.deposit(depositAmnt);
        System.out.printf("%s balance is: $%.2f%n", account1.getName(), account1.getBalance());

        System.out.print("Enter deposit amount for Account2: ");
        depositAmnt = scanner.nextDouble();
        System.out.printf("%n adding %.2f%n", depositAmnt);
        account2.deposit(depositAmnt);
        System.out.printf("%s balance is: $%.2f%n", account2.getName(), account2.getBalance());
        scanner.close();
    }
}

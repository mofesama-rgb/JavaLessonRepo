import java.util.Scanner;

public class ReceiptGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Item Name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter Price Per Item: ");
        double pricePerItem = scanner.nextDouble();

        double subtotal = quantity * pricePerItem;
        double fixedRate = 0.07;
        double salesTax = subtotal * fixedRate;
        double totalCost = subtotal + salesTax;

        System.out.println("================================");
        System.out.println("        PURCHASE RECEIPT");
        System.out.println("================================");
        System.out.printf("Item: %s%n", itemName);
        System.out.printf("Quantity: %d%n", quantity);
        System.out.printf("Price per item: $%.2f%n", pricePerItem);
        System.out.println("-----------------------------");
        System.out.printf("Subtotal:       $%.2f%n", subtotal);
        System.out.printf("Sales Tax (7%%): $%.2f%n", salesTax);
        System.out.printf("Total Cost:     $%.2f%n", totalCost);
        System.out.println("============================="); 
        scanner.close();
    }
}
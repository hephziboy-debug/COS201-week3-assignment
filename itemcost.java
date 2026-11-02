import java.util.Scanner;

public class ItemCost {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("ITEM COST CALCULATOR");

        System.out.print("Enter item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = input.nextInt();

        System.out.print("Enter price per item: ");
        double price = input.nextDouble();

        double totalCost = quantity * price;

        System.out.println("Item: " + itemName);
        System.out.println("Total cost: " + totalCost);

        input.close();
    }
}

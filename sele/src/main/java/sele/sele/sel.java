import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class sel {
    public static void main(String[] args) {
      
        ArrayList<String> items = new ArrayList<>();

     
        Scanner scanner = new Scanner(System.in);

        
        while (true) {
            System.out.println("\nSimple Collection Program");
            System.out.println("1. Add item");
            System.out.println("2. Print items");
            System.out.println("3. Sort items");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter an item to add: ");
                    String newItem = scanner.nextLine();
                    items.add(newItem);
                    System.out.println("Item added successfully!");
                    break;
                case 2:
                    System.out.println("Items in the list:");
                    for (String item : items) {
                        System.out.println(item);
                    }
                    break;
                case 3:
                    Collections.sort(items);
                    System.out.println("Items sorted successfully!");
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
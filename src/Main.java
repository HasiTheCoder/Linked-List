import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static LinkedList linkedList = new LinkedList();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1 -> {
                    linkedList = new LinkedList();
                    System.out.println("New empty list created.");
                }
//                case 2:
//                    createListWithItems();
//                    break;
                case 3 -> {
                    System.out.println("Enter data to add: ");
                    linkedList.addToFront(scanner.nextLine());
                }
                case 4 -> removeSpecificItem();
                case 5 -> {
                    linkedList.makeEmpty();
                    System.out.println("List cleared.");
                }
                case 6 -> System.out.println("List is " + (linkedList.isEmpty() ? "empty." : "not empty."));
                case 7 -> System.out.println("Number of elements in the list: " + linkedList.size());
                case 8 -> displayList();
                case 9 -> {
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                }
                case 10 -> {
                    System.out.println("Enter data to add: ");
                    linkedList.addToBack(scanner.nextLine());
                }
            }
            System.out.println(linkedList);
        }
    }

    private static void displayMenu() {
        System.out.println("\n--- Linked List Tester ---");
        System.out.println("1. New Empty List");
//        System.out.println("2. List with Items");
        System.out.println("3. Add item to front");
        System.out.println("4. Remove specific item");
        System.out.println("5. Clear list");
        System.out.println("6. Is list Empty?");
        System.out.println("7. Number of elements in list");
        System.out.println("8. Display the list");
        System.out.println("9. Exit");
        System.out.println("10. Add item to back");
        System.out.print("Enter your choice: ");
    }

//    private static void createListWithItems() {
//        System.out.print("Enter the number of items to add: ");
//        int itemCount = scanner.nextInt();
//        scanner.nextLine(); // Consume newline character
//
//        for (int i = 1; i <= itemCount; i++) {
//            System.out.print("Enter item " + i + ": ");
//            String item = scanner.nextLine();
//            linkedList.add(item);
//        }
//        System.out.println("Items added to the list.");
//    }

    private static void addItemToFront() {
        System.out.print("Enter the item to add to the front: ");
        String item = scanner.nextLine();
        linkedList.addToFront(item);
        System.out.println("Item added to the front of the list.");
    }

    private static void removeSpecificItem() {
        System.out.print("Enter the item to remove: ");
        String item = scanner.nextLine();
        linkedList.remove(item);
    }

    private static void displayList() {
        System.out.println("List: " + linkedList.toString());
    }
}
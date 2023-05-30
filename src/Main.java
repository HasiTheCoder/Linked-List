import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static intLinkerList linkedList = new intLinkerList();

    public static void main(String[] args) {
        boolean exit = false;
        while (!exit) {
            displayMenu();
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    linkedList = new intLinkerList();
                    System.out.println("New empty list created.");
                }
                case 2 -> {
                    if (linkedList.isSortedIncreasing()) {
                        System.out.println("Is sorted increasing");
                    }
                    else {
                        System.out.println("Is not sorted increasing");
                    }
                    System.out.println(linkedList);
                }
                case 3 -> {
                    System.out.println("Enter data to add: ");
                    linkedList.addToFront(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println(linkedList);
                }
                case 4 -> {
                    System.out.println("enter data to remove from linked list: ");
                    linkedList.remove(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println(linkedList);
                }
                case 5 -> {
                    linkedList.makeEmpty();
                    System.out.println("List cleared.");
                }
                case 6 -> System.out.println("List is " + (linkedList.isEmpty() ? "empty." : "not empty."));
                case 7 -> System.out.println("Number of elements in the list: " + linkedList.size());
                case 8 -> System.out.println(linkedList);
                case 9 -> {
                    exit = true;
                    System.out.println("Exiting the program. Goodbye!");
                }
                case 10 -> {
                    System.out.println("Enter data to add: ");
                    linkedList.addToBack(scanner.nextInt());
                    scanner.nextLine();
                    System.out.println(linkedList);

                }
                case 11 -> {
                    linkedList.removeFirstItem();
                    System.out.println(linkedList);
                }
                case 12 -> {
                    linkedList.removeLastTime();
                    System.out.println(linkedList);
                }
                case 13 -> System.out.println("Sum: " + linkedList.sum());
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\n--- Linked List Tester ---");
        System.out.println("1. New Empty List");
        System.out.println("2. Check if sorted least to greatest");
        System.out.println("3. Add item to front");
        System.out.println("4. Remove specific item");
        System.out.println("5. Clear list");
        System.out.println("6. Is list Empty?");
        System.out.println("7. Number of elements in list");
        System.out.println("8. Display the list");
        System.out.println("9. Exit");
        System.out.println("10. Add item to back");
        System.out.println("11. Remove first item");
        System.out.println("12. Remove last item");
        System.out.println("13. Sum");
        System.out.print("Enter your choice: ");
    }

}
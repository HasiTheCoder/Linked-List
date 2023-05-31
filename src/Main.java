import java.util.Scanner;
import java.util.Stack;

public class Main {
    private static Scanner input = new Scanner(System.in);
    private static intLinkedList intLinkedList = new intLinkedList();
    private static LinkedList linkedList = new LinkedList();
    private static DoublyLinkedList menus;
    private static QueueList queueList = new QueueList();
    private static StackList stackList = new StackList();
    public static void main(String[] args) {
        createMenus();
        boolean exit = false;
        int page = 1;
        while (!exit) {
            int choice = displayMenus(page);
        }


        while (!exit) {
            displayMenu();
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                intLinkedList = new intLinkedList();
                System.out.println("New empty list created.");
            }
            else if (choice == 2) {
                if (intLinkedList.isSortedIncreasing()) {
                    System.out.println("Is sorted increasing");
                }
                else {
                    System.out.println("Is not sorted increasing");
                }
                System.out.println(intLinkedList);
            }
            else if (choice == 3) {
                System.out.println("Enter data to add: ");
                intLinkedList.addToFront(input.nextInt());
                input.nextLine();
                System.out.println(intLinkedList);
            }
            else if (choice == 4) {
                System.out.println("enter data to remove from linked list: ");
                intLinkedList.remove(input.nextInt());
                input.nextLine();
                System.out.println(intLinkedList);
            }
            else if (choice == 5) {
                intLinkedList.makeEmpty();
                System.out.println("List cleared.");
            }
            else if (choice == 6) {
                System.out.println("List is " + (intLinkedList.isEmpty() ? "empty." : "not empty."));
            }
            else if (choice == 7) {
                System.out.println("Number of elements in the list: " + intLinkedList.size());
            }
            else if (choice == 8) {
                System.out.println(intLinkedList);
            }
            else if (choice == 9) {
                exit = true;
                System.out.println("Exiting the program. Goodbye!");
            }
            else if (choice == 10) {
                System.out.println("Enter data to add: ");
                intLinkedList.addToBack(input.nextInt());
                input.nextLine();
                System.out.println(intLinkedList);
            }
            else if (choice == 11) {
                intLinkedList.removeFirstItem();
                System.out.println(intLinkedList);
            }
            else if (choice == 12) {
                intLinkedList.removeLastTime();
                System.out.println(intLinkedList);
            }
            else if (choice == 13) {
                System.out.println("Sum: " + intLinkedList.sum());
            }
        }
    }

    private static int displayMenus(int page) {
        if (page == 1) {
            System.out.println(menus.getHead());
        }
        else if (page == 2) {

        }
    }
    private static void createMenus() {
        String page1 = """
                1. Linked List
                2. Int Linked List
                3. Queue List
                4. Stack List
                Enter your choice:
                """;
        menus.addToFront(page1);
        String page2StringLinkedList = """
                1. Add item to front
                2. Add item to back
                3. Remove item
                4. Remove first item
                5. Remove last item
                6. Size
                7. Display List
                8. Is list empty
                9. Make list empty
                10. Return to previous page
                Enter your choice:
                """;
        menus.addToBack(page2StringLinkedList);
        String page3IntLinkedList = """
                1. Add item to front
                2. Add item to back
                3. Remove item
                4. Remove first item
                5. Remove last item
                6. Make list empty
                7. Is list empty
                8. Size
                9. Display list
                10. Sum
                11. Return to previous page
                12. Exit
                """;
        menus.addToBack(page3IntLinkedList);
        String page4QueueList = """
                1. Create queue with array of numbers
                2. Is queue empty
                3. Enqueue
                4. Dequeue
                5. Size
                6. Front
                7. Make queue empty
                8. Display Queue
                """;
        menus.addToBack(page4QueueList);
        String page5StackList = """
                1. Create stack with array of numbers
                2. Is stack empty
                3. Push
                4. Top
                5. Pop
                6. Size
                7. Make stack empty
                8. Display stack
                """;
        menus.addToBack(page5StackList);
    }
}
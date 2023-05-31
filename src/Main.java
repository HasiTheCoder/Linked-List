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
            if (page == 1) {
                page = choice+1;
            }
            findChoice(choice, page);

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

    private static void findChoice(int choice, int page) {
        if (page == 2) {
            if (choice == 1) {
                System.out.println("Enter data to add: ");
                linkedList.addToFront(input.nextLine());
            }
            else if (choice == 2) {
                System.out.println("Enter data to add: ");
                linkedList.addToBack(input.nextLine());
            }
            else if (choice == 3) {
                System.out.println("Enter the data to remove: ");
                linkedList.remove(input.nextLine());
            }
            else if (choice == 4) {
                linkedList.removeFirstItem();
            }
            else if (choice == 5) {
                linkedList.removeLastItem();
            }
            else if (choice == 6) {
                System.out.println(linkedList.size());
            }
            else if (choice == 7) {
                System.out.println(linkedList);
            }
            else if (choice == 8) {
                System.out.println("Is list empty: " + linkedList.isEmpty());
            }
            else if (choice == 9) {
                linkedList.makeEmpty();
            }
            else if (choice == 10) {
                System.out.println("goodbye");
            }
        }
        if (page == 3) {
            if (choice == 1) {

            }
            else if (choice == 2) {

            }
            else if (choice == 3) {

            }
            else if (choice == 4) {

            }
            else if (choice == 5) {

            }
            else if (choice == 6) {

            }
            else if (choice == 7) {

            }
            else if (choice == 8) {
            }
            else if (choice == 9) {

            }
            else if (choice == 10) {

            }
            else if (choice == 11) {

            }
            else if (choice == 12) {

            }
        }
        if (page == 4) {
            if (choice == 1) {

            }
            else if (choice == 2) {

            }
            else if (choice == 3) {

            }
            else if (choice == 4) {

            }
            else if (choice == 5) {

            }
            else if (choice == 6) {

            }
            else if (choice == 7) {

            }
            else if (choice == 8) {
            }
        }
        if (page == 5) {
            if (choice == 1) {

            }
            else if (choice == 2) {

            }
            else if (choice == 3) {

            }
            else if (choice == 4) {

            }
            else if (choice == 5) {

            }
            else if (choice == 6) {

            }
            else if (choice == 7) {

            }
            else if (choice == 8) {
            }
        }
    }

    private static int displayMenus(int page) {
        int choice = 0;
        if (page == 1) {
            System.out.println(menus.findNode(1));
            choice = input.nextInt();
        }
        else if (page == 2) {
            System.out.println(menus.findNode(2));
            choice = input.nextInt();
        }
        else if (page == 3) {
            System.out.println(menus.findNode(3));
            choice = input.nextInt();
        }
        else if(page == 4) {
            System.out.println(menus.findNode(4));
            choice = input.nextInt();
        }
        else if (page == 5) {
            System.out.println(menus.findNode(5));
            choice = input.nextInt();
        }
        return choice;
    }
    private static void createMenus() {
        String[] pages =
                {"""
                1. Linked List
                2. Int Linked List
                3. Queue List
                4. Stack List
                Enter your choice:
                """,  """
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
                """, """
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
                """, """
                1. Create queue with array of numbers
                2. Is queue empty
                3. Enqueue
                4. Dequeue
                5. Size
                6. Front
                7. Make queue empty
                8. Display Queue
                """, """
                1. Create stack with array of numbers
                2. Is stack empty
                3. Push
                4. Top
                5. Pop
                6. Size
                7. Make stack empty
                8. Display stack
                """};
        for (int i = 0; i < pages.length; i++) {
            menus.addToBack(pages[i]);
        }
    }
}
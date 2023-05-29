public class Main {
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.addToBack("Apple");
        list.addToBack("Banana");
        list.addToFront("Orange");
        list.addToBack("Grapes");

        // Display the initial list
        System.out.println("Initial List: " + list);

        // Remove an element from the list
        list.remove("Grapes");

        // Display the updated list
        System.out.println("Updated List: " + list);

        // Test the size of the list
        System.out.println("Size of the List: " + list.size());

        // Empty the list
        list.makeEmpty();

        // Display the empty list
        System.out.println("Empty List: " + list);

        // Add elements to the list again
        list.addToBack("Mango");
        list.addToBack("Pineapple");

        // Display the list
        System.out.println("List: " + list);

        // Remove an element from the list
        list.remove("Mango");

        // Display the updated list
        System.out.println("Updated List: " + list);

        // Test the size of the list
        System.out.println("Size of the List: " + list.size());
    }
}
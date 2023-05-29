public class Main {
    public static void main(String[] args) {
        // Create a new linked list
        LinkedList list = new LinkedList();

        // Add elements to the list
        list.addToBack(5);
        list.addToBack(7);
        list.addToFront(16);
        list.addToBack(79);

        // Display the initial list
        System.out.println("Initial List: " + list);

        // Remove an element from the list
<<<<<<< Updated upstream
        list.remove("Grapes");
=======
        list.remove(5);
>>>>>>> Stashed changes

        // Display the updated list
        System.out.println("Updated List: " + list);

        // Test the size of the list
        System.out.println("Size of the List: " + list.size());

        // Empty the list
        list.makeEmpty();

        // Display the empty list
        System.out.println("Empty List: " + list);

        // Add elements to the list again
        list.addToBack(89);
        list.addToBack(34);

        // Display the list
        System.out.println("List: " + list);

        // Remove an element from the list
        list.remove(34);

        // Display the updated list
        System.out.println("Updated List: " + list);

        // Test the size of the list
        System.out.println("Size of the List: " + list.size());
    }
}
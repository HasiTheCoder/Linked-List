public class StackList {
    //Instance variables
    private intLinkedList linkedList;
    //constructor
    public StackList() {
        linkedList = new intLinkedList();
    }
    public StackList(int[] array) {
        linkedList = new intLinkedList();
        for(int i = 0; i < array.length; i++) {
            linkedList.addToFront(array[i]);
        }
    }
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }
    //add n to top of stack
    public void push(int n) {
        linkedList.addToFront(n);
    }
    //look at the top item
    public int top() {
        return linkedList.getHead();
    }
    //removing items from the stack
    public int pop() {
        return linkedList.removeLastTime();
    }
    //number of items in stack
    public int size() {
        return linkedList.size();
    }


    //Display all the items in stack
    public String toString() {
        return linkedList.toString();
    }
    public void makeEmpty() {
        linkedList.makeEmpty();
    }
}
